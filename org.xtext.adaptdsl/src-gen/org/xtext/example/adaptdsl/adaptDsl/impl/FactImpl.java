/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.adaptdsl.adaptDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.adaptdsl.adaptDsl.AdaptDslPackage;
import org.xtext.example.adaptdsl.adaptDsl.Entity;
import org.xtext.example.adaptdsl.adaptDsl.Fact;
import org.xtext.example.adaptdsl.adaptDsl.FactName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.FactImpl#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.FactImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.xtext.example.adaptdsl.adaptDsl.impl.FactImpl#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactImpl extends MinimalEObjectImpl.Container implements Fact
{
  /**
   * The cached value of the '{@link #getFactName() <em>Fact Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactName()
   * @generated
   * @ordered
   */
  protected FactName factName;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected String propertyName = PROPERTY_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AdaptDslPackage.Literals.FACT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactName getFactName()
  {
    if (factName != null && factName.eIsProxy())
    {
      InternalEObject oldFactName = (InternalEObject)factName;
      factName = (FactName)eResolveProxy(oldFactName);
      if (factName != oldFactName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptDslPackage.FACT__FACT_NAME, oldFactName, factName));
      }
    }
    return factName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactName basicGetFactName()
  {
    return factName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactName(FactName newFactName)
  {
    FactName oldFactName = factName;
    factName = newFactName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.FACT__FACT_NAME, oldFactName, factName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptDslPackage.FACT__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.FACT__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyName()
  {
    return propertyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyName(String newPropertyName)
  {
    String oldPropertyName = propertyName;
    propertyName = newPropertyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdaptDslPackage.FACT__PROPERTY_NAME, oldPropertyName, propertyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AdaptDslPackage.FACT__FACT_NAME:
        if (resolve) return getFactName();
        return basicGetFactName();
      case AdaptDslPackage.FACT__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
      case AdaptDslPackage.FACT__PROPERTY_NAME:
        return getPropertyName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AdaptDslPackage.FACT__FACT_NAME:
        setFactName((FactName)newValue);
        return;
      case AdaptDslPackage.FACT__ENTITY:
        setEntity((Entity)newValue);
        return;
      case AdaptDslPackage.FACT__PROPERTY_NAME:
        setPropertyName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AdaptDslPackage.FACT__FACT_NAME:
        setFactName((FactName)null);
        return;
      case AdaptDslPackage.FACT__ENTITY:
        setEntity((Entity)null);
        return;
      case AdaptDslPackage.FACT__PROPERTY_NAME:
        setPropertyName(PROPERTY_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AdaptDslPackage.FACT__FACT_NAME:
        return factName != null;
      case AdaptDslPackage.FACT__ENTITY:
        return entity != null;
      case AdaptDslPackage.FACT__PROPERTY_NAME:
        return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (propertyName: ");
    result.append(propertyName);
    result.append(')');
    return result.toString();
  }

} //FactImpl
