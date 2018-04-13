/*
 * generated by Xtext 2.13.0
 */
grammar InternalScheme;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.SchemeGrammarAccess;

}

@parser::members {

 	private SchemeGrammarAccess grammarAccess;

    public InternalSchemeParser(TokenStream input, SchemeGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SchemeGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0());
			}
			lv_functions_0_0=ruleFunction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"functions",
					lv_functions_0_0,
					"org.xtext.Scheme.Function");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='#t'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getTKeyword_0());
		}
		    |
		kw='#f'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getFKeyword_1());
		}
		    |
		kw='0'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getDigitZeroKeyword_2());
		}
		    |
		kw='1'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getDigitOneKeyword_3());
		}
	)
;

// Entry rule entryRuleMath
entryRuleMath returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMathRule()); }
	iv_ruleMath=ruleMath
	{ $current=$iv_ruleMath.current.getText(); }
	EOF;

// Rule Math
ruleMath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMathAccess().getPlusSignKeyword_0());
		}
		    |
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMathAccess().getHyphenMinusKeyword_1());
		}
		    |
		kw='*'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMathAccess().getAsteriskKeyword_2());
		}
		    |
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMathAccess().getSolidusKeyword_3());
		}
		    |
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getMathAccess().getEqualsSignKeyword_4());
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current.getText(); }
	EOF;

// Rule Variable
ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='not'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getVariableAccess().getNotKeyword_0());
			}
		)?
		(
			this_STRING_1=RULE_STRING
			{
				$current.merge(this_STRING_1);
			}
			{
				newLeafNode(this_STRING_1, grammarAccess.getVariableAccess().getSTRINGTerminalRuleCall_1_0());
			}
			    |
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_1());
			}
			    |
			this_ID_3=RULE_ID
			{
				$current.merge(this_ID_3);
			}
			{
				newLeafNode(this_ID_3, grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_2());
			}
			    |
			{
				newCompositeNode(grammarAccess.getVariableAccess().getBooleanParserRuleCall_1_3());
			}
			this_Boolean_4=ruleBoolean
			{
				$current.merge(this_Boolean_4);
			}
			{
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getVariableAccess().getMathParserRuleCall_1_4());
			}
			this_Math_5=ruleMath
			{
				$current.merge(this_Math_5);
			}
			{
				afterParserOrEnumRuleCall();
			}
			    |
			this_SCHEME_ID_6=RULE_SCHEME_ID
			{
				$current.merge(this_SCHEME_ID_6);
			}
			{
				newLeafNode(this_SCHEME_ID_6, grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_5());
			}
			    |
			{
				newCompositeNode(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_6());
			}
			this_Function_7=ruleFunction
			{
				$current.merge(this_Function_7);
			}
			{
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getVariableAccess().getConditionParserRuleCall_1_7());
			}
			this_Condition_8=ruleCondition
			{
				$current.merge(this_Condition_8);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current.getText(); }
	EOF;

// Rule Condition
ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='['
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getConditionAccess().getVariableParserRuleCall_1());
			}
			this_Variable_1=ruleVariable
			{
				$current.merge(this_Variable_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		kw=']'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current.getText(); }
	EOF;

// Rule Function
ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getFunctionAccess().getVariableParserRuleCall_1());
			}
			this_Variable_1=ruleVariable
			{
				$current.merge(this_Variable_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2());
		}
	)
;

RULE_SCHEME_ID : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'-'|'/')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
