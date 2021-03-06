/**
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.adaptUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Display Property Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.adaptui.adaptUI.SetDisplayPropertyOperation#getProperty <em>Property</em>}</li>
 *   <li>{@link org.xtext.adaptui.adaptUI.SetDisplayPropertyOperation#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getSetDisplayPropertyOperation()
 * @model
 * @generated
 */
public interface SetDisplayPropertyOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getSetDisplayPropertyOperation_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.SetDisplayPropertyOperation#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' containment reference.
   * @see #setPropertyValue(DisplayPropertyValue)
   * @see org.xtext.adaptui.adaptUI.AdaptUIPackage#getSetDisplayPropertyOperation_PropertyValue()
   * @model containment="true"
   * @generated
   */
  DisplayPropertyValue getPropertyValue();

  /**
   * Sets the value of the '{@link org.xtext.adaptui.adaptUI.SetDisplayPropertyOperation#getPropertyValue <em>Property Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Value</em>' containment reference.
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(DisplayPropertyValue value);

} // SetDisplayPropertyOperation
