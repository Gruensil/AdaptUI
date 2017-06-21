/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.contextml.contextML.AdaptationModel;
import org.xtext.contextml.contextML.AdaptationRule;
import org.xtext.contextml.contextML.ContextMLPackage;
import org.xtext.contextml.contextML.ServiceList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.impl.AdaptationModelImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.impl.AdaptationModelImpl#getFlowName <em>Flow Name</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.impl.AdaptationModelImpl#getAdaptationRules <em>Adaptation Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationModelImpl extends MinimalEObjectImpl.Container implements AdaptationModel
{
  /**
   * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServices()
   * @generated
   * @ordered
   */
  protected ServiceList services;

  /**
   * The default value of the '{@link #getFlowName() <em>Flow Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowName()
   * @generated
   * @ordered
   */
  protected static final String FLOW_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlowName() <em>Flow Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlowName()
   * @generated
   * @ordered
   */
  protected String flowName = FLOW_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAdaptationRules() <em>Adaptation Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdaptationRules()
   * @generated
   * @ordered
   */
  protected EList<AdaptationRule> adaptationRules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdaptationModelImpl()
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
    return ContextMLPackage.Literals.ADAPTATION_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceList getServices()
  {
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServices(ServiceList newServices, NotificationChain msgs)
  {
    ServiceList oldServices = services;
    services = newServices;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextMLPackage.ADAPTATION_MODEL__SERVICES, oldServices, newServices);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServices(ServiceList newServices)
  {
    if (newServices != services)
    {
      NotificationChain msgs = null;
      if (services != null)
        msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextMLPackage.ADAPTATION_MODEL__SERVICES, null, msgs);
      if (newServices != null)
        msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextMLPackage.ADAPTATION_MODEL__SERVICES, null, msgs);
      msgs = basicSetServices(newServices, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.ADAPTATION_MODEL__SERVICES, newServices, newServices));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFlowName()
  {
    return flowName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlowName(String newFlowName)
  {
    String oldFlowName = flowName;
    flowName = newFlowName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ContextMLPackage.ADAPTATION_MODEL__FLOW_NAME, oldFlowName, flowName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AdaptationRule> getAdaptationRules()
  {
    if (adaptationRules == null)
    {
      adaptationRules = new EObjectContainmentEList<AdaptationRule>(AdaptationRule.class, this, ContextMLPackage.ADAPTATION_MODEL__ADAPTATION_RULES);
    }
    return adaptationRules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ContextMLPackage.ADAPTATION_MODEL__SERVICES:
        return basicSetServices(null, msgs);
      case ContextMLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        return ((InternalEList<?>)getAdaptationRules()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ContextMLPackage.ADAPTATION_MODEL__SERVICES:
        return getServices();
      case ContextMLPackage.ADAPTATION_MODEL__FLOW_NAME:
        return getFlowName();
      case ContextMLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        return getAdaptationRules();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ContextMLPackage.ADAPTATION_MODEL__SERVICES:
        setServices((ServiceList)newValue);
        return;
      case ContextMLPackage.ADAPTATION_MODEL__FLOW_NAME:
        setFlowName((String)newValue);
        return;
      case ContextMLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        getAdaptationRules().clear();
        getAdaptationRules().addAll((Collection<? extends AdaptationRule>)newValue);
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
      case ContextMLPackage.ADAPTATION_MODEL__SERVICES:
        setServices((ServiceList)null);
        return;
      case ContextMLPackage.ADAPTATION_MODEL__FLOW_NAME:
        setFlowName(FLOW_NAME_EDEFAULT);
        return;
      case ContextMLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        getAdaptationRules().clear();
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
      case ContextMLPackage.ADAPTATION_MODEL__SERVICES:
        return services != null;
      case ContextMLPackage.ADAPTATION_MODEL__FLOW_NAME:
        return FLOW_NAME_EDEFAULT == null ? flowName != null : !FLOW_NAME_EDEFAULT.equals(flowName);
      case ContextMLPackage.ADAPTATION_MODEL__ADAPTATION_RULES:
        return adaptationRules != null && !adaptationRules.isEmpty();
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
    result.append(" (flowName: ");
    result.append(flowName);
    result.append(')');
    return result.toString();
  }

} //AdaptationModelImpl