/*
 * generated by Xtext 2.12.0
 */
package org.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SchemeStandaloneSetup extends SchemeStandaloneSetupGenerated {

	def static void doSetup() {
		new SchemeStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
