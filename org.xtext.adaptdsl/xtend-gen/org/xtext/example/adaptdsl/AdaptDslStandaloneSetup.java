/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.adaptdsl;

import org.xtext.example.adaptdsl.AdaptDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AdaptDslStandaloneSetup extends AdaptDslStandaloneSetupGenerated {
  public static void doSetup() {
    AdaptDslStandaloneSetup _adaptDslStandaloneSetup = new AdaptDslStandaloneSetup();
    _adaptDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
