/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.ActionCategory#getActionCategory <em>Action Category</em>}</li>
 * </ul>
 *
 * @see org.xtext.contextml.contextML.ContextMLPackage#getActionCategory()
 * @model
 * @generated
 */
public interface ActionCategory extends EObject
{
  /**
   * Returns the value of the '<em><b>Action Category</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Category</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Category</em>' containment reference.
   * @see #setActionCategory(ParentOperation)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getActionCategory_ActionCategory()
   * @model containment="true"
   * @generated
   */
  ParentOperation getActionCategory();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.ActionCategory#getActionCategory <em>Action Category</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Category</em>' containment reference.
   * @see #getActionCategory()
   * @generated
   */
  void setActionCategory(ParentOperation value);

} // ActionCategory