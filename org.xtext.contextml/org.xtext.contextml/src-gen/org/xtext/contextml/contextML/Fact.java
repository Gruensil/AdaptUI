/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.Fact#getFactName <em>Fact Name</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.Fact#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.Fact#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.contextml.contextML.ContextMLPackage#getFact()
 * @model
 * @generated
 */
public interface Fact extends EObject
{
  /**
   * Returns the value of the '<em><b>Fact Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact Name</em>' reference.
   * @see #setFactName(FactName)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getFact_FactName()
   * @model
   * @generated
   */
  FactName getFactName();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Fact#getFactName <em>Fact Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact Name</em>' reference.
   * @see #getFactName()
   * @generated
   */
  void setFactName(FactName value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getFact_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Fact#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see #setPropertyName(String)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getFact_PropertyName()
   * @model
   * @generated
   */
  String getPropertyName();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.Fact#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(String value);

} // Fact