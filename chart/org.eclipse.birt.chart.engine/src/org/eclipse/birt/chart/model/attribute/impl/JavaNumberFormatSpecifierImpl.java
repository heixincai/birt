/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.attribute.impl;

import java.text.DecimalFormat;

import org.eclipse.birt.chart.model.attribute.AttributeFactory;
import org.eclipse.birt.chart.model.attribute.AttributePackage;
import org.eclipse.birt.chart.model.attribute.JavaNumberFormatSpecifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Java Number Format Specifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.birt.chart.model.attribute.impl.JavaNumberFormatSpecifierImpl#getPattern <em>Pattern</em>}
 * </li>
 * <li>
 * {@link org.eclipse.birt.chart.model.attribute.impl.JavaNumberFormatSpecifierImpl#getMultiplier <em>Multiplier</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class JavaNumberFormatSpecifierImpl extends FormatSpecifierImpl implements JavaNumberFormatSpecifier
{

    /**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPattern()
     * @generated @ordered
     */
    protected static final String PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPattern()
     * @generated @ordered
     */
    protected String pattern = PATTERN_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getMultiplier()
     * @generated @ordered
     */
    protected static final double MULTIPLIER_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getMultiplier()
     * @generated @ordered
     */
    protected double multiplier = MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Multiplier attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated @ordered
     */
    protected boolean multiplierESet = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected JavaNumberFormatSpecifierImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected EClass eStaticClass()
    {
        return AttributePackage.eINSTANCE.getJavaNumberFormatSpecifier();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPattern()
    {
        return pattern;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPattern(String newPattern)
    {
        String oldPattern = pattern;
        pattern = newPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__PATTERN, oldPattern, pattern));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public double getMultiplier()
    {
        return multiplier;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setMultiplier(double newMultiplier)
    {
        double oldMultiplier = multiplier;
        multiplier = newMultiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplierESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__MULTIPLIER, oldMultiplier, multiplier,
                !oldMultiplierESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetMultiplier()
    {
        double oldMultiplier = multiplier;
        boolean oldMultiplierESet = multiplierESet;
        multiplier = MULTIPLIER_EDEFAULT;
        multiplierESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT,
                oldMultiplierESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetMultiplier()
    {
        return multiplierESet;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Object eGet(EStructuralFeature eFeature, boolean resolve)
    {
        switch (eDerivedStructuralFeatureID(eFeature))
        {
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__PATTERN:
                return getPattern();
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                return new Double(getMultiplier());
        }
        return eDynamicGet(eFeature, resolve);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void eSet(EStructuralFeature eFeature, Object newValue)
    {
        switch (eDerivedStructuralFeatureID(eFeature))
        {
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__PATTERN:
                setPattern((String) newValue);
                return;
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                setMultiplier(((Double) newValue).doubleValue());
                return;
        }
        eDynamicSet(eFeature, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void eUnset(EStructuralFeature eFeature)
    {
        switch (eDerivedStructuralFeatureID(eFeature))
        {
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__PATTERN:
                setPattern(PATTERN_EDEFAULT);
                return;
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                unsetMultiplier();
                return;
        }
        eDynamicUnset(eFeature);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean eIsSet(EStructuralFeature eFeature)
    {
        switch (eDerivedStructuralFeatureID(eFeature))
        {
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__PATTERN:
                return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
            case AttributePackage.JAVA_NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                return isSetMultiplier();
        }
        return eDynamicIsSet(eFeature);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String toString()
    {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (pattern: ");
        result.append(pattern);
        result.append(", multiplier: ");
        if (multiplierESet)
            result.append(multiplier);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    /**
     * A convenience methods provided to create an initialized JavaNumberFormatSpecifier instance
     * 
     * NOTE: Manually written
     * 
     * @param sJavaPattern
     * @return
     */
    public static final JavaNumberFormatSpecifier create(String sJavaPattern)
    {
        final JavaNumberFormatSpecifier jnfs = AttributeFactory.eINSTANCE.createJavaNumberFormatSpecifier();
        jnfs.setPattern(sJavaPattern);
        //jnfs.setMultiplier(1); // UNDEFINED SUGGESTS A DEFAULT OF '1'
        return jnfs;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.birt.chart.model.attribute.JavaNumberFormatSpecifier#format(double)
     */
    public final String format(double dValue)
    {
        final DecimalFormat df = new DecimalFormat(getPattern());
        return df.format(dValue);
    }
} //JavaNumberFormatSpecifierImpl
