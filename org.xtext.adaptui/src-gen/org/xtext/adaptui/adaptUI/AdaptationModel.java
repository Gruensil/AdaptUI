/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationModel#getServices <em>Services</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationModel#getFlowName <em>Flow Name</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.AdaptationModel#getAdaptationRules <em>Adaptation Rules</em>}</li>
 * </ul>
 *
 * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationModel()
 * @model
 * @generated
 */
public interface AdaptationModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Services</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' containment reference.
   * @see #setServices(ServiceList)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationModel_Services()
   * @model containment="true"
   * @generated
   */
  ServiceList getServices();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationModel#getServices <em>Services</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Services</em>' containment reference.
   * @see #getServices()
   * @generated
   */
  void setServices(ServiceList value);

  /**
   * Returns the value of the '<em><b>Flow Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Flow Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow Name</em>' attribute.
   * @see #setFlowName(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationModel_FlowName()
   * @model
   * @generated
   */
  String getFlowName();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.AdaptationModel#getFlowName <em>Flow Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flow Name</em>' attribute.
   * @see #getFlowName()
   * @generated
   */
  void setFlowName(String value);

  /**
   * Returns the value of the '<em><b>Adaptation Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.adaptui.adaptUI.AdaptationRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adaptation Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adaptation Rules</em>' containment reference list.
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getAdaptationModel_AdaptationRules()
   * @model containment="true"
   * @generated
   */
  EList<AdaptationRule> getAdaptationRules();

} // AdaptationModel
