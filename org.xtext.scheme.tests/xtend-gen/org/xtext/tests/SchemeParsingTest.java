/**
 * generated by Xtext 2.12.0
 */
package org.xtext.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.scheme.Model;
import org.xtext.tests.SchemeInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(SchemeInjectorProvider.class)
@SuppressWarnings("all")
public class SchemeParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void mustIncrementNumberWithThreeParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(+ 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustIncrementNumberWithTwoParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(+ 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustIncrementNumberWithOneParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(+ 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustIncrementNumberWithoutParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(+)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDecrementNumberWithThreeParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(- 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDecrementNumberWithTwoParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(- 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDecrementNumberWithOneParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(- 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDecrementNumberWithoutParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(-)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustMultiplyNumberWithThreeParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(* 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustMultiplyNumberWithTwoParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(* 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustMultiplyNumberWithOneParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(* 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustMultiplyNumberWithoutParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(*)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDivideNumberWithThreeParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(/ 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDivideNumberWithTwoParams() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(/ 1 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDivideNumberWithOneParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(/ 1)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustDivideNumberWithoutParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(/)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustOperateWithBool() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(or #t)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustOperateWithTwoBool() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(or #t #f)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustUnderstandNotBooleanOperator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(not #t)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustUnderstandNotBooleanOperationsWithNewOperationsInside() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(or #t (and #f #t))");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustUnderstandNotBooleanOperationsWithBits() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(or 1 (and 0 1))");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFunctionIf() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(if not #t ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"This is true\" ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"This is false\")");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFor() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(for ([i 10])");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("(printf \"i=~a\\n\" i))");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustNotRecognizeFunctionWithoutCloseTheParantheses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(i + 10");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertFalse(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustNotRecognizeFunctionWithoutCloseTheQuotationMarks() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("(if not #t ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("\"This is true ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("\"This is false\")");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void mustNotRecognizeAFunctionWithoutOpenParentheses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i + 10)");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
