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

package org.eclipse.birt.chart.model.attribute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '<em><b>Chart Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * This type defines the allowed values for Chart types. Any new Chart type needs to be added here to be supported.
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.birt.chart.model.attribute.AttributePackage#getChartType()
 * @model @generated
 */
public final class ChartType extends AbstractEnumerator
{

    /**
     * The '<em><b>Pie</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #PIE_LITERAL
     * @model name="Pie"
     * @generated @ordered
     */
    public static final int PIE = 0;

    /**
     * The '<em><b>Bar</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #BAR_LITERAL
     * @model name="Bar"
     * @generated @ordered
     */
    public static final int BAR = 1;

    /**
     * The '<em><b>Line</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #LINE_LITERAL
     * @model name="Line"
     * @generated @ordered
     */
    public static final int LINE = 2;

    /**
     * The '<em><b>Combo</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #COMBO_LITERAL
     * @model name="Combo"
     * @generated @ordered
     */
    public static final int COMBO = 3;

    /**
     * The '<em><b>Scatter</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #SCATTER_LITERAL
     * @model name="Scatter"
     * @generated @ordered
     */
    public static final int SCATTER = 4;

    /**
     * The '<em><b>Stock</b></em>' literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #STOCK_LITERAL
     * @model name="Stock"
     * @generated @ordered
     */
    public static final int STOCK = 5;

    /**
     * The '<em><b>Pie</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Pie</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #PIE
     * @generated @ordered
     */
    public static final ChartType PIE_LITERAL = new ChartType(PIE, "Pie");

    /**
     * The '<em><b>Bar</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Bar</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #BAR
     * @generated @ordered
     */
    public static final ChartType BAR_LITERAL = new ChartType(BAR, "Bar");

    /**
     * The '<em><b>Line</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Line</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #LINE
     * @generated @ordered
     */
    public static final ChartType LINE_LITERAL = new ChartType(LINE, "Line");

    /**
     * The '<em><b>Combo</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Combo</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #COMBO
     * @generated @ordered
     */
    public static final ChartType COMBO_LITERAL = new ChartType(COMBO, "Combo");

    /**
     * The '<em><b>Scatter</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Scatter</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #SCATTER
     * @generated @ordered
     */
    public static final ChartType SCATTER_LITERAL = new ChartType(SCATTER, "Scatter");

    /**
     * The '<em><b>Stock</b></em>' literal object. <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Stock</b></em>' literal object isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @see #STOCK
     * @generated @ordered
     */
    public static final ChartType STOCK_LITERAL = new ChartType(STOCK, "Stock");

    /**
     * An array of all the '<em><b>Chart Type</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final ChartType[] VALUES_ARRAY = new ChartType[]
    {
        PIE_LITERAL, BAR_LITERAL, LINE_LITERAL, COMBO_LITERAL, SCATTER_LITERAL, STOCK_LITERAL,
    };

    /**
     * A public read-only list of all the '<em><b>Chart Type</b></em>' enumerators. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Chart Type</b></em>' literal with the specified name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public static ChartType get(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            ChartType result = VALUES_ARRAY[i];
            if (result.toString().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Chart Type</b></em>' literal with the specified value. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public static ChartType get(int value)
    {
        switch (value)
        {
            case PIE:
                return PIE_LITERAL;
            case BAR:
                return BAR_LITERAL;
            case LINE:
                return LINE_LITERAL;
            case COMBO:
                return COMBO_LITERAL;
            case SCATTER:
                return SCATTER_LITERAL;
            case STOCK:
                return STOCK_LITERAL;
        }
        return null;
    }

    /**
     * Only this class can construct instances. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private ChartType(int value, String name)
    {
        super(value, name);
    }

} //ChartType
