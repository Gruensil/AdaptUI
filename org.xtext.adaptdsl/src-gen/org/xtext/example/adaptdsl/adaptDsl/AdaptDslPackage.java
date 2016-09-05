/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl.adaptDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.adaptdsl.adaptDsl.AdaptDslFactory
 * @model kind="package"
 * @generated
 */
public interface AdaptDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "adaptDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/adaptdsl/AdaptDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adaptDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdaptDslPackage eINSTANCE = org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.ModelImpl
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Adaptation Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ADAPTATION_RULES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.GreetingImpl
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__NAME = 0;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.adaptionRuleImpl <em>adaption Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.adaptionRuleImpl
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getadaptionRule()
   * @generated
   */
  int ADAPTION_RULE = 2;

  /**
   * The number of structural features of the '<em>adaption Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADAPTION_RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.RuleNameImpl <em>Rule Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.RuleNameImpl
   * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getRuleName()
   * @generated
   */
  int RULE_NAME = 3;

  /**
   * The feature id for the '<em><b>Rule</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_NAME__RULE = ADAPTION_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rule Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_NAME_FEATURE_COUNT = ADAPTION_RULE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.adaptdsl.adaptDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.adaptdsl.adaptDsl.Model#getAdaptationRules <em>Adaptation Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Adaptation Rules</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.Model#getAdaptationRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_AdaptationRules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.adaptdsl.adaptDsl.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.adaptdsl.adaptDsl.Greeting#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.Greeting#getName()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.adaptdsl.adaptDsl.adaptionRule <em>adaption Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>adaption Rule</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.adaptionRule
   * @generated
   */
  EClass getadaptionRule();

  /**
   * Returns the meta object for class '{@link org.xtext.example.adaptdsl.adaptDsl.RuleName <em>Rule Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Name</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.RuleName
   * @generated
   */
  EClass getRuleName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.adaptdsl.adaptDsl.RuleName#getRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rule</em>'.
   * @see org.xtext.example.adaptdsl.adaptDsl.RuleName#getRule()
   * @see #getRuleName()
   * @generated
   */
  EAttribute getRuleName_Rule();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdaptDslFactory getAdaptDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.ModelImpl
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Adaptation Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ADAPTATION_RULES = eINSTANCE.getModel_AdaptationRules();

    /**
     * The meta object literal for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.GreetingImpl
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.adaptionRuleImpl <em>adaption Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.adaptionRuleImpl
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getadaptionRule()
     * @generated
     */
    EClass ADAPTION_RULE = eINSTANCE.getadaptionRule();

    /**
     * The meta object literal for the '{@link org.xtext.example.adaptdsl.adaptDsl.impl.RuleNameImpl <em>Rule Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.RuleNameImpl
     * @see org.xtext.example.adaptdsl.adaptDsl.impl.AdaptDslPackageImpl#getRuleName()
     * @generated
     */
    EClass RULE_NAME = eINSTANCE.getRuleName();

    /**
     * The meta object literal for the '<em><b>Rule</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_NAME__RULE = eINSTANCE.getRuleName_Rule();

  }

} //AdaptDslPackage
