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

import org.eclipse.birt.chart.model.attribute.AttributeFactory;
import org.eclipse.birt.chart.model.attribute.AttributePackage;
import org.eclipse.birt.chart.model.attribute.NumberFormatSpecifier;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Number Format Specifier</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl#getPrefix <em>Prefix</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl#getSuffix <em>Suffix</em>}</li>
 * <li>{@link org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl#getMultiplier <em>Multiplier</em>}
 * </li>
 * <li>
 * {@link org.eclipse.birt.chart.model.attribute.impl.NumberFormatSpecifierImpl#getFractionDigits <em>Fraction Digits</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class NumberFormatSpecifierImpl extends FormatSpecifierImpl implements NumberFormatSpecifier
{

    /**
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPrefix()
     * @generated @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPrefix()
     * @generated @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

    /**
     * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getSuffix()
     * @generated @ordered
     */
    protected static final String SUFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getSuffix()
     * @generated @ordered
     */
    protected String suffix = SUFFIX_EDEFAULT;

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
     * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getFractionDigits()
     * @generated @ordered
     */
    protected static final int FRACTION_DIGITS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getFractionDigits()
     * @generated @ordered
     */
    protected int fractionDigits = FRACTION_DIGITS_EDEFAULT;

    /**
     * This is true if the Fraction Digits attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated @ordered
     */
    protected boolean fractionDigitsESet = false;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected NumberFormatSpecifierImpl()
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
        return AttributePackage.eINSTANCE.getNumberFormatSpecifier();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPrefix()
    {
        return prefix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPrefix(String newPrefix)
    {
        String oldPrefix = prefix;
        prefix = newPrefix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AttributePackage.NUMBER_FORMAT_SPECIFIER__PREFIX,
                oldPrefix, prefix));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getSuffix()
    {
        return suffix;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setSuffix(String newSuffix)
    {
        String oldSuffix = suffix;
        suffix = newSuffix;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AttributePackage.NUMBER_FORMAT_SPECIFIER__SUFFIX,
                oldSuffix, suffix));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AttributePackage.NUMBER_FORMAT_SPECIFIER__MULTIPLIER,
                oldMultiplier, multiplier, !oldMultiplierESet));
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
                AttributePackage.NUMBER_FORMAT_SPECIFIER__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT,
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
    public int getFractionDigits()
    {
        return fractionDigits;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFractionDigits(int newFractionDigits)
    {
        int oldFractionDigits = fractionDigits;
        fractionDigits = newFractionDigits;
        boolean oldFractionDigitsESet = fractionDigitsESet;
        fractionDigitsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                AttributePackage.NUMBER_FORMAT_SPECIFIER__FRACTION_DIGITS, oldFractionDigits, fractionDigits,
                !oldFractionDigitsESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void unsetFractionDigits()
    {
        int oldFractionDigits = fractionDigits;
        boolean oldFractionDigitsESet = fractionDigitsESet;
        fractionDigits = FRACTION_DIGITS_EDEFAULT;
        fractionDigitsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                AttributePackage.NUMBER_FORMAT_SPECIFIER__FRACTION_DIGITS, oldFractionDigits, FRACTION_DIGITS_EDEFAULT,
                oldFractionDigitsESet));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean isSetFractionDigits()
    {
        return fractionDigitsESet;
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
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__PREFIX:
                return getPrefix();
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__SUFFIX:
                return getSuffix();
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                return new Double(getMultiplier());
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__FRACTION_DIGITS:
                return new Integer(getFractionDigits());
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
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__PREFIX:
                setPrefix((String) newValue);
                return;
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__SUFFIX:
                setSuffix((String) newValue);
                return;
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                setMultiplier(((Double) newValue).doubleValue());
                return;
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__FRACTION_DIGITS:
                setFractionDigits(((Integer) newValue).intValue());
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
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__PREFIX:
                setPrefix(PREFIX_EDEFAULT);
                return;
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__SUFFIX:
                setSuffix(SUFFIX_EDEFAULT);
                return;
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                unsetMultiplier();
                return;
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__FRACTION_DIGITS:
                unsetFractionDigits();
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
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__PREFIX:
                return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__SUFFIX:
                return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__MULTIPLIER:
                return isSetMultiplier();
            case AttributePackage.NUMBER_FORMAT_SPECIFIER__FRACTION_DIGITS:
                return isSetFractionDigits();
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
        result.append(" (prefix: ");
        result.append(prefix);
        result.append(", suffix: ");
        result.append(suffix);
        result.append(", multiplier: ");
        if (multiplierESet)
            result.append(multiplier);
        else
            result.append("<unset>");
        result.append(", fractionDigits: ");
        if (fractionDigitsESet)
            result.append(fractionDigits);
        else
            result.append("<unset>");
        result.append(')');
        return result.toString();
    }

    /**
     * A convenience methods provided to create an initialized NumberFormatSpecifier instance
     * 
     * NOTE: Manually written
     * 
     * @return
     */
    public static final NumberFormatSpecifier create()
    {
        final NumberFormatSpecifier nfs = AttributeFactory.eINSTANCE.createNumberFormatSpecifier();
        nfs.setFractionDigits(2);
        //jnfs.setMultiplier(1); // UNDEFINED SUGGESTS A DEFAULT OF '1'
        return nfs;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.birt.chart.model.attribute.NumberFormatSpecifier#format(double)
     */
    public final String format(double dValue)
    {
        return null;
    }
} //NumberFormatSpecifierImpl
