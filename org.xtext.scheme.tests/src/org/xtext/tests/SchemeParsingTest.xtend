/*
 * generated by Xtext 2.12.0
 */
package org.xtext.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.scheme.Model

@RunWith(XtextRunner)
@InjectWith(SchemeInjectorProvider)
class SchemeParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void mustIncrementNumberWithThreeParams() {
		val result = parseHelper.parse('''
			(+ 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustIncrementNumberWithTwoParams() {
		val result = parseHelper.parse('''
			(+ 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustIncrementNumberWithOneParam() {
		val result = parseHelper.parse('''
			(+ 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustIncrementNumberWithoutParam() {
		val result = parseHelper.parse('''
			(+)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDecrementNumberWithThreeParams() {
		val result = parseHelper.parse('''
			(- 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDecrementNumberWithTwoParams() {
		val result = parseHelper.parse('''
			(- 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDecrementNumberWithOneParam() {
		val result = parseHelper.parse('''
			(- 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDecrementNumberWithoutParam() {
		val result = parseHelper.parse('''
			(-)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustMultiplyNumberWithThreeParams() {
		val result = parseHelper.parse('''
			(* 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustMultiplyNumberWithTwoParams() {
		val result = parseHelper.parse('''
			(* 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustMultiplyNumberWithOneParam() {
		val result = parseHelper.parse('''
			(* 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustMultiplyNumberWithoutParam() {
		val result = parseHelper.parse('''
			(*)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDivideNumberWithThreeParams() {
		val result = parseHelper.parse('''
			(/ 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDivideNumberWithTwoParams() {
		val result = parseHelper.parse('''
			(/ 1 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDivideNumberWithOneParam() {
		val result = parseHelper.parse('''
			(/ 1)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustDivideNumberWithoutParam() {
		val result = parseHelper.parse('''
			(/)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustOperateWithBool() {
		val result = parseHelper.parse('''
			(or #t)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustOperateWithTwoBool() {
		val result = parseHelper.parse('''
			(or #t #f)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustUnderstandNotBooleanOperator() {
		val result = parseHelper.parse('''
			(not #t)
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void mustUnderstandNotBooleanOperationsWithNewOperationsInside() {
		val result = parseHelper.parse('''
			(or #t (and not #t #f))
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
}
