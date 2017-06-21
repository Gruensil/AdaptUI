/**
 * generated by Xtext 2.12.0
 */
package org.xtext.contextml.contextML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.contextml.contextML.ContextModel#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.ContextModel#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.xtext.contextml.contextML.ContextModel#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.xtext.contextml.contextML.ContextMLPackage#getContextModel()
 * @model
 * @generated
 */
public interface ContextModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.contextml.contextML.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference list.
   * @see org.xtext.contextml.contextML.ContextMLPackage#getContextModel_Entity()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntity();

  /**
   * Returns the value of the '<em><b>Provider</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.contextml.contextML.Provider}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provider</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provider</em>' containment reference list.
   * @see org.xtext.contextml.contextML.ContextMLPackage#getContextModel_Provider()
   * @model containment="true"
   * @generated
   */
  EList<Provider> getProvider();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference.
   * @see #setTypes(DefTypes)
   * @see org.xtext.contextml.contextML.ContextMLPackage#getContextModel_Types()
   * @model containment="true"
   * @generated
   */
  DefTypes getTypes();

  /**
   * Sets the value of the '{@link org.xtext.contextml.contextML.ContextModel#getTypes <em>Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Types</em>' containment reference.
   * @see #getTypes()
   * @generated
   */
  void setTypes(DefTypes value);

} // ContextModel