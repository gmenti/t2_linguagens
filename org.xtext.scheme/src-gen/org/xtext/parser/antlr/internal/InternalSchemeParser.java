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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPERATOR", "RULE_SCHEME_ID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'or'", "'and'", "'not'", "'#t'", "'#f'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_SCHEME_ID=5;
    public static final int EOF=-1;
    public static final int RULE_OPERATOR=4;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=9;

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
    // InternalScheme.g:141:1: ruleFunctionParam returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleFunctionParam() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_Boolean_2 = null;



        	enterRule();

        try {
            // InternalScheme.g:147:2: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= ruleBoolean ) )
            // InternalScheme.g:148:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= ruleBoolean )
            {
            // InternalScheme.g:148:2: (this_INT_0= RULE_INT | this_ID_1= RULE_ID | this_Boolean_2= ruleBoolean )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 18:
            case 19:
                {
                alt3=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalScheme.g:165:3: this_Boolean_2= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getFunctionParamAccess().getBooleanParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_2=ruleBoolean();

                    state._fsp--;


                    			current.merge(this_Boolean_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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
    // InternalScheme.g:179:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalScheme.g:179:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalScheme.g:180:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalScheme.g:186:1: ruleFunction returns [EObject current=null] : (otherlv_0= '(' ( ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* ) | ( (lv_bl_3_0= ruleBooleanOperation ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_params_2_0 = null;

        AntlrDatatypeRuleToken lv_bl_3_0 = null;



        	enterRule();

        try {
            // InternalScheme.g:192:2: ( (otherlv_0= '(' ( ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* ) | ( (lv_bl_3_0= ruleBooleanOperation ) ) ) otherlv_4= ')' ) )
            // InternalScheme.g:193:2: (otherlv_0= '(' ( ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* ) | ( (lv_bl_3_0= ruleBooleanOperation ) ) ) otherlv_4= ')' )
            {
            // InternalScheme.g:193:2: (otherlv_0= '(' ( ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* ) | ( (lv_bl_3_0= ruleBooleanOperation ) ) ) otherlv_4= ')' )
            // InternalScheme.g:194:3: otherlv_0= '(' ( ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* ) | ( (lv_bl_3_0= ruleBooleanOperation ) ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalScheme.g:198:3: ( ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* ) | ( (lv_bl_3_0= ruleBooleanOperation ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_OPERATOR && LA5_0<=RULE_SCHEME_ID)) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||(LA5_0>=13 && LA5_0<=19)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalScheme.g:199:4: ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* )
                    {
                    // InternalScheme.g:199:4: ( ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )* )
                    // InternalScheme.g:200:5: ( (lv_id_1_0= ruleFunctionId ) ) ( (lv_params_2_0= ruleFunctionParam ) )*
                    {
                    // InternalScheme.g:200:5: ( (lv_id_1_0= ruleFunctionId ) )
                    // InternalScheme.g:201:6: (lv_id_1_0= ruleFunctionId )
                    {
                    // InternalScheme.g:201:6: (lv_id_1_0= ruleFunctionId )
                    // InternalScheme.g:202:7: lv_id_1_0= ruleFunctionId
                    {

                    							newCompositeNode(grammarAccess.getFunctionAccess().getIdFunctionIdParserRuleCall_1_0_0_0());
                    						
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

                    // InternalScheme.g:219:5: ( (lv_params_2_0= ruleFunctionParam ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=RULE_INT && LA4_0<=RULE_ID)||(LA4_0>=18 && LA4_0<=19)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalScheme.g:220:6: (lv_params_2_0= ruleFunctionParam )
                    	    {
                    	    // InternalScheme.g:220:6: (lv_params_2_0= ruleFunctionParam )
                    	    // InternalScheme.g:221:7: lv_params_2_0= ruleFunctionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParamsFunctionParamParserRuleCall_1_0_1_0());
                    	    						
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


                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:240:4: ( (lv_bl_3_0= ruleBooleanOperation ) )
                    {
                    // InternalScheme.g:240:4: ( (lv_bl_3_0= ruleBooleanOperation ) )
                    // InternalScheme.g:241:5: (lv_bl_3_0= ruleBooleanOperation )
                    {
                    // InternalScheme.g:241:5: (lv_bl_3_0= ruleBooleanOperation )
                    // InternalScheme.g:242:6: lv_bl_3_0= ruleBooleanOperation
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getBlBooleanOperationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_bl_3_0=ruleBooleanOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"bl",
                    							lv_bl_3_0,
                    							"org.xtext.Scheme.BooleanOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2());
            		

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


    // $ANTLR start "entryRuleBooleanOperation"
    // InternalScheme.g:268:1: entryRuleBooleanOperation returns [String current=null] : iv_ruleBooleanOperation= ruleBooleanOperation EOF ;
    public final String entryRuleBooleanOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBooleanOperation = null;


        try {
            // InternalScheme.g:268:56: (iv_ruleBooleanOperation= ruleBooleanOperation EOF )
            // InternalScheme.g:269:2: iv_ruleBooleanOperation= ruleBooleanOperation EOF
            {
             newCompositeNode(grammarAccess.getBooleanOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOperation=ruleBooleanOperation();

            state._fsp--;

             current =iv_ruleBooleanOperation.getText(); 
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
    // $ANTLR end "entryRuleBooleanOperation"


    // $ANTLR start "ruleBooleanOperation"
    // InternalScheme.g:275:1: ruleBooleanOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'or' | kw= 'and' )? ( ( (kw= 'not' )? this_Boolean_3= ruleBoolean )* | (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleBooleanOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Boolean_3 = null;

        AntlrDatatypeRuleToken this_BooleanOperation_5 = null;



        	enterRule();

        try {
            // InternalScheme.g:281:2: ( ( (kw= 'or' | kw= 'and' )? ( ( (kw= 'not' )? this_Boolean_3= ruleBoolean )* | (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' ) ) ) )
            // InternalScheme.g:282:2: ( (kw= 'or' | kw= 'and' )? ( ( (kw= 'not' )? this_Boolean_3= ruleBoolean )* | (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' ) ) )
            {
            // InternalScheme.g:282:2: ( (kw= 'or' | kw= 'and' )? ( ( (kw= 'not' )? this_Boolean_3= ruleBoolean )* | (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' ) ) )
            // InternalScheme.g:283:3: (kw= 'or' | kw= 'and' )? ( ( (kw= 'not' )? this_Boolean_3= ruleBoolean )* | (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' ) )
            {
            // InternalScheme.g:283:3: (kw= 'or' | kw= 'and' )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalScheme.g:284:4: kw= 'or'
                    {
                    kw=(Token)match(input,15,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBooleanOperationAccess().getOrKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalScheme.g:290:4: kw= 'and'
                    {
                    kw=(Token)match(input,16,FOLLOW_7); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBooleanOperationAccess().getAndKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalScheme.g:296:3: ( ( (kw= 'not' )? this_Boolean_3= ruleBoolean )* | (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EOF||LA9_0==14||(LA9_0>=17 && LA9_0<=19)) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalScheme.g:297:4: ( (kw= 'not' )? this_Boolean_3= ruleBoolean )*
                    {
                    // InternalScheme.g:297:4: ( (kw= 'not' )? this_Boolean_3= ruleBoolean )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=17 && LA8_0<=19)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalScheme.g:298:5: (kw= 'not' )? this_Boolean_3= ruleBoolean
                    	    {
                    	    // InternalScheme.g:298:5: (kw= 'not' )?
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==17) ) {
                    	        alt7=1;
                    	    }
                    	    switch (alt7) {
                    	        case 1 :
                    	            // InternalScheme.g:299:6: kw= 'not'
                    	            {
                    	            kw=(Token)match(input,17,FOLLOW_8); 

                    	            						current.merge(kw);
                    	            						newLeafNode(kw, grammarAccess.getBooleanOperationAccess().getNotKeyword_1_0_0());
                    	            					

                    	            }
                    	            break;

                    	    }


                    	    					newCompositeNode(grammarAccess.getBooleanOperationAccess().getBooleanParserRuleCall_1_0_1());
                    	    				
                    	    pushFollow(FOLLOW_9);
                    	    this_Boolean_3=ruleBoolean();

                    	    state._fsp--;


                    	    					current.merge(this_Boolean_3);
                    	    				

                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalScheme.g:317:4: (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' )
                    {
                    // InternalScheme.g:317:4: (kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')' )
                    // InternalScheme.g:318:5: kw= '(' this_BooleanOperation_5= ruleBooleanOperation kw= ')'
                    {
                    kw=(Token)match(input,13,FOLLOW_10); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getBooleanOperationAccess().getLeftParenthesisKeyword_1_1_0());
                    				

                    					newCompositeNode(grammarAccess.getBooleanOperationAccess().getBooleanOperationParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_6);
                    this_BooleanOperation_5=ruleBooleanOperation();

                    state._fsp--;


                    					current.merge(this_BooleanOperation_5);
                    				

                    					afterParserOrEnumRuleCall();
                    				
                    kw=(Token)match(input,14,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getBooleanOperationAccess().getRightParenthesisKeyword_1_1_2());
                    				

                    }


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
    // $ANTLR end "ruleBooleanOperation"


    // $ANTLR start "entryRuleBoolean"
    // InternalScheme.g:344:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalScheme.g:344:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalScheme.g:345:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalScheme.g:351:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '#t' | kw= '#f' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalScheme.g:357:2: ( (kw= '#t' | kw= '#f' ) )
            // InternalScheme.g:358:2: (kw= '#t' | kw= '#f' )
            {
            // InternalScheme.g:358:2: (kw= '#t' | kw= '#f' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalScheme.g:359:3: kw= '#t'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalScheme.g:365:3: kw= '#f'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFKeyword_1());
                    		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000FE030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000E40C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000E2002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000FE000L});

}