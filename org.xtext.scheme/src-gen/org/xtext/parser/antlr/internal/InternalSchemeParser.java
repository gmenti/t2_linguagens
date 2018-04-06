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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPERATOR", "RULE_SCHEME_ID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_SCHEME_ID=5;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=4;

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

        EObject lv_functions_0_0 = null;



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

                if ( (LA1_0==13) ) {
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


    // $ANTLR start "entryRuleFunctionId"
    // InternalScheme.g:100:1: entryRuleFunctionId returns [String current=null] : iv_ruleFunctionId= ruleFunctionId EOF ;
    public final String entryRuleFunctionId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionId = null;


        try {
            // InternalScheme.g:100:50: (iv_ruleFunctionId= ruleFunctionId EOF )
            // InternalScheme.g:101:2: iv_ruleFunctionId= ruleFunctionId EOF
            {
             newCompositeNode(grammarAccess.getFunctionIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionId=ruleFunctionId();

            state._fsp--;

             current =iv_ruleFunctionId.getText(); 
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
    // $ANTLR end "entryRuleFunctionId"


    // $ANTLR start "ruleFunctionId"
    // InternalScheme.g:107:1: ruleFunctionId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OPERATOR_0= RULE_OPERATOR | this_SCHEME_ID_1= RULE_SCHEME_ID ) ;
    public final AntlrDatatypeRuleToken ruleFunctionId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OPERATOR_0=null;
        Token this_SCHEME_ID_1=null;


        	enterRule();

        try {
            // InternalScheme.g:113:2: ( (this_OPERATOR_0= RULE_OPERATOR | this_SCHEME_ID_1= RULE_SCHEME_ID ) )
            // InternalScheme.g:114:2: (this_OPERATOR_0= RULE_OPERATOR | this_SCHEME_ID_1= RULE_SCHEME_ID )
            {
            // InternalScheme.g:114:2: (this_OPERATOR_0= RULE_OPERATOR | this_SCHEME_ID_1= RULE_SCHEME_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_OPERATOR) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_SCHEME_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalScheme.g:115:3: this_OPERATOR_0= RULE_OPERATOR
                    {
                    this_OPERATOR_0=(Token)match(input,RULE_OPERATOR,FOLLOW_2); 

                    			current.merge(this_OPERATOR_0);
                    		

                    			newLeafNode(this_OPERATOR_0, grammarAccess.getFunctionIdAccess().getOPERATORTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScheme.g:123:3: this_SCHEME_ID_1= RULE_SCHEME_ID
                    {
                    this_SCHEME_ID_1=(Token)match(input,RULE_SCHEME_ID,FOLLOW_2); 

                    			current.merge(this_SCHEME_ID_1);
                    		

                    			newLeafNode(this_SCHEME_ID_1, grammarAccess.getFunctionIdAccess().getSCHEME_IDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleFunctionId"


    // $ANTLR start "entryRuleFunctionParam"
    // InternalScheme.g:134:1: entryRuleFunctionParam returns [String current=null] : iv_ruleFunctionParam= ruleFunctionParam EOF ;
    public final String entryRuleFunctionParam() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionParam = null;


        try {
            // InternalScheme.g:134:53: (iv_ruleFunctionParam= ruleFunctionParam EOF )
            // InternalScheme.g:135:2: iv_ruleFunctionParam= ruleFunctionParam EOF
            {
             newCompositeNode(grammarAccess.getFunctionParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionParam=ruleFunctionParam();

            state._fsp--;

             current =iv_ruleFunctionParam.getText(); 
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
    // $ANTLR end "entryRuleFunctionParam"


    // $ANTLR start "ruleFunctionParam"
    // InternalScheme.g:141:1: ruleFunctionParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleFunctionParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalScheme.g:147:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // InternalScheme.g:148:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // InternalScheme.g:148:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalScheme.g:149:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getFunctionParamAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScheme.g:157:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getFunctionParamAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleFunctionParam"


    // $ANTLR start "entryRuleFunction"
    // InternalScheme.g:168:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalScheme.g:168:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalScheme.g:169:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // InternalScheme.g:175:1: ruleFunction returns [EObject current=null] : (otherlv_0= '(' ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* otherlv_3= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:181:2: ( (otherlv_0= '(' ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* otherlv_3= ')' ) )
            // InternalScheme.g:182:2: (otherlv_0= '(' ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* otherlv_3= ')' )
            {
            // InternalScheme.g:182:2: (otherlv_0= '(' ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* otherlv_3= ')' )
            // InternalScheme.g:183:3: otherlv_0= '(' ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScheme.g:187:3: ( (lv_id_1_0= ruleFunctionId ) )
            // InternalScheme.g:188:4: (lv_id_1_0= ruleFunctionId )
            {
            // InternalScheme.g:188:4: (lv_id_1_0= ruleFunctionId )
            // InternalScheme.g:189:5: lv_id_1_0= ruleFunctionId
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getIdFunctionIdParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_id_1_0=ruleFunctionId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.xtext.Scheme.FunctionId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScheme.g:206:3: ( (lv_params_2_0= ruleFunctionParam ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScheme.g:207:4: (lv_params_2_0= ruleFunctionParam )
            	    {
            	    // InternalScheme.g:207:4: (lv_params_2_0= ruleFunctionParam )
            	    // InternalScheme.g:208:5: lv_params_2_0= ruleFunctionParam
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getParamsFunctionParamParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_params_2_0=ruleFunctionParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_2_0,
            	    						"org.xtext.Scheme.FunctionParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000040C0L});

}