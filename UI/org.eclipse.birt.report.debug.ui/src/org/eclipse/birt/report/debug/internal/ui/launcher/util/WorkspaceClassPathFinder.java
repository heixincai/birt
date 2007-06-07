/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.report.debug.internal.ui.launcher.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.ibm.icu.util.StringTokenizer;

import org.eclipse.birt.report.viewer.utilities.IWorkspaceClasspathFinder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Class used to find a classpath based on projects or workspace
 * 
 */
public class WorkspaceClassPathFinder implements IWorkspaceClasspathFinder
{
	public WorkspaceClassPathFinder( )
	{
	}

	public String getClassPath( String projects )
	{
		if ( projects == null || projects.length( ) == 0 )
		{
			return null;
		}

		StringBuffer wbuf = new StringBuffer( );

		StringTokenizer token = new StringTokenizer( projects,
				PROPERTYSEPARATOR );
		boolean hasHeader = false;
		while ( token.hasMoreTokens( ) )
		{
			String projectName = token.nextToken( );
			List paths = getProjectPaths( projectName );
			for ( int i = 0; i < paths.size( ); i++ )
			{
				String url = ( String ) paths.get( i );
				if ( url != null && url.length( ) != 0 )
					if ( i == 0 && !hasHeader)
					{
						wbuf.append( url );
						hasHeader = true;
					}
					else
					{
						wbuf.append( PROPERTYSEPARATOR + url );
					}
			}

		}

		return wbuf.toString( );
	}

	public String getClassPath( )
	{
		IProject[] projects = ResourcesPlugin.getWorkspace( ).getRoot( )
				.getProjects( );

		String projectString = ""; //$NON-NLS-1$
		for ( int i = 0; i < projects.length; i++ )
		{
			IProject proj = projects[i];
			projectString += proj.getName( ) + PROPERTYSEPARATOR;
		}

		return getClassPath( projectString );
	}

	/**
	 * @param projectName
	 * @return
	 */
	private List getProjectPaths( String projectName )
	{
		List retValue = new ArrayList( );

		IProject project = ResourcesPlugin.getWorkspace( ).getRoot( )
				.getProject( projectName );

		if ( projectName == null )
		{
			return retValue;
		}

		List paths = getProjectPath( project );
		for ( int j = 0; j < paths.size( ); j++ )
		{
			URL url = ( URL ) paths.get( j );
			if ( url != null )
			{
				retValue.add( url.getPath( ) );
			}
		}

		String url = getProjectOutClassPath( project );
		if ( url != null )
		{
			retValue.add( url );
		}
		return retValue;
	}

	private String getProjectOutClassPath( IProject project )
	{
		if ( !hasJavaNature( project ) )
		{
			return null;
		}

		IJavaProject fCurrJProject = JavaCore.create( project );
		IPath path = null;
		boolean projectExists = ( project.exists( ) && project.getFile(
				".classpath" ).exists( ) ); //$NON-NLS-1$
		if ( projectExists )
		{
			if ( path == null )
			{
				path = fCurrJProject.readOutputLocation( );
				String curPath = path.toOSString( );
				String directPath = project.getLocation( ).toOSString( );
				int index = directPath.lastIndexOf( File.separator );
				String absPath = directPath.substring( 0, index ) + curPath;

				return absPath;
			}
		}

		return null;
	}

	private List getProjectPath( IProject project )
	{
		List retValue = new ArrayList( );
		if ( !hasJavaNature( project ) )
		{
			return retValue;
		}

		IJavaProject fCurrJProject = JavaCore.create( project );
		IClasspathEntry[] classpathEntries = null;
		boolean projectExists = ( project.exists( ) && project.getFile(
				".classpath" ).exists( ) ); //$NON-NLS-1$
		if ( projectExists )
		{
			if ( classpathEntries == null )
			{
				classpathEntries = fCurrJProject.readRawClasspath( );
			}
		}

		if ( classpathEntries != null )
		{
			retValue = getExistingEntries( classpathEntries );
		}
		return retValue;
	}

	private List getExistingEntries( IClasspathEntry[] classpathEntries )
	{
		ArrayList newClassPath = new ArrayList( );
		for ( int i = 0; i < classpathEntries.length; i++ )
		{
			IClasspathEntry curr = classpathEntries[i];
			if ( curr.getEntryKind( ) == IClasspathEntry.CPE_LIBRARY )
			{
				try
				{
					newClassPath.add( curr.getPath( ).toFile( ).toURL( ) );
				} catch ( MalformedURLException e )
				{
					// DO nothing
				}
			}
		}
		return newClassPath;
	}

	/**
	 * Returns true if the given project is accessible and it has a java nature,
	 * otherwise false.
	 * 
	 * @param project
	 *            IProject
	 * @return boolean
	 */
	private boolean hasJavaNature( IProject project )
	{
		try
		{
			return project.hasNature( JavaCore.NATURE_ID );
		} catch ( CoreException e )
		{
			// project does not exist or is not open
		}
		return false;
	}
}
