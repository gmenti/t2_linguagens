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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchemeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_SCHEME_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#t'", "'#f'", "'0'", "'1'", "'not'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_SCHEME_ID=6;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSchemeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSchemeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSchemeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalScheme.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalScheme.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalScheme.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalScheme.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScheme.g:71:1: ruleModel returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalScheme.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalScheme.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScheme.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalScheme.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalScheme.g:80:4: lv_functions_0_0= ruleFunction
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"functions",
            	    					lv_functions_0_0,
            	    					"org.xtext.Scheme.Function");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBoolean"
    // InternalScheme.g:100:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalScheme.g:100:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalScheme.g:101:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalScheme.g:107:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#t' | kw= '#f' | kw= '0' | kw= '1' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalScheme.g:113:2: ( (kw= '#t' | kw= '#f' | kw= '0' | kw= '1' ) )
            // InternalScheme.g:114:2: (kw= '#t' | kw= '#f' | kw= '0' | kw= '1' )
            {
            // InternalScheme.g:114:2: (kw= '#t' | kw= '#f' | kw= '0' | kw= '1' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalScheme.g:115:3: kw= '#t'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScheme.g:121:3: kw= '#f'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalScheme.g:127:3: kw= '0'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getDigitZeroKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalScheme.g:133:3: kw= '1'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getDigitOneKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleVariable"
    // InternalScheme.g:142:1: entryRuleVariable returns [String current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final String entryRuleVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariable = null;


        try {
            // InternalScheme.g:142:48: (iv_ruleVariable= ruleVariable EOF )
            // InternalScheme.g:143:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalScheme.g:149:1: ruleVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' )? (this_INT_1= RULE_INT | this_ID_2= RULE_ID | this_Boolean_3= ruleBoolean | this_SCHEME_ID_4= RULE_SCHEME_ID | this_Function_5= ruleFunction ) ) ;
    public final AntlrDatatypeRuleToken ruleVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token this_SCHEME_ID_4=null;
        AntlrDatatypeRuleToken this_Boolean_3 = null;

        AntlrDatatypeRuleToken this_Function_5 = null;



        	enterRule();

        try {
            // InternalScheme.g:155:2: ( ( (kw= 'not' )? (this_INT_1= RULE_INT | this_ID_2= RULE_ID | this_Boolean_3= ruleBoolean | this_SCHEME_ID_4= RULE_SCHEME_ID | this_Function_5= ruleFunction ) ) )
            // InternalScheme.g:156:2: ( (kw= 'not' )? (this_INT_1= RULE_INT | this_ID_2= RULE_ID | this_Boolean_3= ruleBoolean | this_SCHEME_ID_4= RULE_SCHEME_ID | this_Function_5= ruleFunction ) )
            {
            // InternalScheme.g:156:2: ( (kw= 'not' )? (this_INT_1= RULE_INT | this_ID_2= RULE_ID | this_Boolean_3= ruleBoolean | this_SCHEME_ID_4= RULE_SCHEME_ID | this_Function_5= ruleFunction ) )
            // InternalScheme.g:157:3: (kw= 'not' )? (this_INT_1= RULE_INT | this_ID_2= RULE_ID | this_Boolean_3= ruleBoolean | this_SCHEME_ID_4= RULE_SCHEME_ID | this_Function_5= ruleFunction )
            {
            // InternalScheme.g:157:3: (kw= 'not' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalScheme.g:158:4: kw= 'not'
                    {
                    kw=(Token)match(input,16,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getVariableAccess().getNotKeyword_0());
                    			

                    }
                    break;

            }

            // InternalScheme.g:164:3: (this_INT_1= RULE_INT | this_ID_2= RULE_ID | this_Boolean_3= ruleBoolean | this_SCHEME_ID_4= RULE_SCHEME_ID | this_Function_5= ruleFunction )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt4=3;
                }
                break;
            case RULE_SCHEME_ID:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalScheme.g:165:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalScheme.g:173:4: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalScheme.g:181:4: this_Boolean_3= ruleBoolean
                    {

                    				newCompositeNode(grammarAccess.getVariableAccess().getBooleanParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Boolean_3=ruleBoolean();

                    state._fsp--;


                    				current.merge(this_Boolean_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalScheme.g:192:4: this_SCHEME_ID_4= RULE_SCHEME_ID
                    {
                    this_SCHEME_ID_4=(Token)match(input,RULE_SCHEME_ID,FOLLOW_2); 

                    				current.merge(this_SCHEME_ID_4);
                    			

                    				newLeafNode(this_SCHEME_ID_4, grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalScheme.g:200:4: this_Function_5= ruleFunction
                    {

                    				newCompositeNode(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_Function_5=ruleFunction();

                    state._fsp--;


                    				current.merge(this_Function_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleFunction"
    // InternalScheme.g:215:1: entryRuleFunction returns [String current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final String entryRuleFunction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunction = null;


        try {
            // InternalScheme.g:215:48: (iv_ruleFunction= ruleFunction EOF )
            // InternalScheme.g:216:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalScheme.g:222:1: ruleFunction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_SCHEME_ID_1= RULE_SCHEME_ID (this_Variable_2= ruleVariable )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFunction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SCHEME_ID_1=null;
        AntlrDatatypeRuleToken this_Variable_2 = null;



        	enterRule();

        try {
            // InternalScheme.g:228:2: ( (kw= '(' this_SCHEME_ID_1= RULE_SCHEME_ID (this_Variable_2= ruleVariable )* kw= ')' ) )
            // InternalScheme.g:229:2: (kw= '(' this_SCHEME_ID_1= RULE_SCHEME_ID (this_Variable_2= ruleVariable )* kw= ')' )
            {
            // InternalScheme.g:229:2: (kw= '(' this_SCHEME_ID_1= RULE_SCHEME_ID (this_Variable_2= ruleVariable )* kw= ')' )
            // InternalScheme.g:230:3: kw= '(' this_SCHEME_ID_1= RULE_SCHEME_ID (this_Variable_2= ruleVariable )* kw= ')'
            {
            kw=(Token)match(input,17,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0());
            		
            this_SCHEME_ID_1=(Token)match(input,RULE_SCHEME_ID,FOLLOW_6); 

            			current.merge(this_SCHEME_ID_1);
            		

            			newLeafNode(this_SCHEME_ID_1, grammarAccess.getFunctionAccess().getSCHEME_IDTerminalRuleCall_1());
            		
            // InternalScheme.g:242:3: (this_Variable_2= ruleVariable )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_SCHEME_ID)||(LA5_0>=12 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScheme.g:243:4: this_Variable_2= ruleVariable
            	    {

            	    				newCompositeNode(grammarAccess.getFunctionAccess().getVariableParserRuleCall_2());
            	    			
            	    pushFollow(FOLLOW_6);
            	    this_Variable_2=ruleVariable();

            	    state._fsp--;


            	    				current.merge(this_Variable_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            kw=(Token)match(input,18,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000002F070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007F070L});

}