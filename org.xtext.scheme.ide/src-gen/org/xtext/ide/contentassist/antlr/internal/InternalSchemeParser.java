package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.SchemeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSchemeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPERATOR", "RULE_SCHEME_ID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#t'", "'#f'", "'('", "')'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
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

    	public void setGrammarAccess(SchemeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalScheme.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalScheme.g:54:1: ( ruleModel EOF )
            // InternalScheme.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalScheme.g:62:1: ruleModel : ( ( rule__Model__FunctionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:66:2: ( ( ( rule__Model__FunctionsAssignment )* ) )
            // InternalScheme.g:67:2: ( ( rule__Model__FunctionsAssignment )* )
            {
            // InternalScheme.g:67:2: ( ( rule__Model__FunctionsAssignment )* )
            // InternalScheme.g:68:3: ( rule__Model__FunctionsAssignment )*
            {
             before(grammarAccess.getModelAccess().getFunctionsAssignment()); 
            // InternalScheme.g:69:3: ( rule__Model__FunctionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScheme.g:69:4: rule__Model__FunctionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FunctionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunctionId"
    // InternalScheme.g:78:1: entryRuleFunctionId : ruleFunctionId EOF ;
    public final void entryRuleFunctionId() throws RecognitionException {
        try {
            // InternalScheme.g:79:1: ( ruleFunctionId EOF )
            // InternalScheme.g:80:1: ruleFunctionId EOF
            {
             before(grammarAccess.getFunctionIdRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionId();

            state._fsp--;

             after(grammarAccess.getFunctionIdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionId"


    // $ANTLR start "ruleFunctionId"
    // InternalScheme.g:87:1: ruleFunctionId : ( ( rule__FunctionId__Alternatives ) ) ;
    public final void ruleFunctionId() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:91:2: ( ( ( rule__FunctionId__Alternatives ) ) )
            // InternalScheme.g:92:2: ( ( rule__FunctionId__Alternatives ) )
            {
            // InternalScheme.g:92:2: ( ( rule__FunctionId__Alternatives ) )
            // InternalScheme.g:93:3: ( rule__FunctionId__Alternatives )
            {
             before(grammarAccess.getFunctionIdAccess().getAlternatives()); 
            // InternalScheme.g:94:3: ( rule__FunctionId__Alternatives )
            // InternalScheme.g:94:4: rule__FunctionId__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionId__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionIdAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionId"


    // $ANTLR start "entryRuleFunctionParam"
    // InternalScheme.g:103:1: entryRuleFunctionParam : ruleFunctionParam EOF ;
    public final void entryRuleFunctionParam() throws RecognitionException {
        try {
            // InternalScheme.g:104:1: ( ruleFunctionParam EOF )
            // InternalScheme.g:105:1: ruleFunctionParam EOF
            {
             before(grammarAccess.getFunctionParamRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionParam"


    // $ANTLR start "ruleFunctionParam"
    // InternalScheme.g:112:1: ruleFunctionParam : ( ( rule__FunctionParam__Alternatives ) ) ;
    public final void ruleFunctionParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:116:2: ( ( ( rule__FunctionParam__Alternatives ) ) )
            // InternalScheme.g:117:2: ( ( rule__FunctionParam__Alternatives ) )
            {
            // InternalScheme.g:117:2: ( ( rule__FunctionParam__Alternatives ) )
            // InternalScheme.g:118:3: ( rule__FunctionParam__Alternatives )
            {
             before(grammarAccess.getFunctionParamAccess().getAlternatives()); 
            // InternalScheme.g:119:3: ( rule__FunctionParam__Alternatives )
            // InternalScheme.g:119:4: rule__FunctionParam__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FunctionParam__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionParamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionParam"


    // $ANTLR start "entryRuleFunction"
    // InternalScheme.g:128:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalScheme.g:129:1: ( ruleFunction EOF )
            // InternalScheme.g:130:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalScheme.g:137:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:141:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalScheme.g:142:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalScheme.g:142:2: ( ( rule__Function__Group__0 ) )
            // InternalScheme.g:143:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalScheme.g:144:3: ( rule__Function__Group__0 )
            // InternalScheme.g:144:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleBoolean"
    // InternalScheme.g:153:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalScheme.g:154:1: ( ruleBoolean EOF )
            // InternalScheme.g:155:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalScheme.g:162:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:166:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalScheme.g:167:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalScheme.g:167:2: ( ( rule__Boolean__Alternatives ) )
            // InternalScheme.g:168:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalScheme.g:169:3: ( rule__Boolean__Alternatives )
            // InternalScheme.g:169:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__FunctionId__Alternatives"
    // InternalScheme.g:177:1: rule__FunctionId__Alternatives : ( ( RULE_OPERATOR ) | ( RULE_SCHEME_ID ) | ( ruleBoolean ) );
    public final void rule__FunctionId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:181:1: ( ( RULE_OPERATOR ) | ( RULE_SCHEME_ID ) | ( ruleBoolean ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_OPERATOR:
                {
                alt2=1;
                }
                break;
            case RULE_SCHEME_ID:
                {
                alt2=2;
                }
                break;
            case 13:
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalScheme.g:182:2: ( RULE_OPERATOR )
                    {
                    // InternalScheme.g:182:2: ( RULE_OPERATOR )
                    // InternalScheme.g:183:3: RULE_OPERATOR
                    {
                     before(grammarAccess.getFunctionIdAccess().getOPERATORTerminalRuleCall_0()); 
                    match(input,RULE_OPERATOR,FOLLOW_2); 
                     after(grammarAccess.getFunctionIdAccess().getOPERATORTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:188:2: ( RULE_SCHEME_ID )
                    {
                    // InternalScheme.g:188:2: ( RULE_SCHEME_ID )
                    // InternalScheme.g:189:3: RULE_SCHEME_ID
                    {
                     before(grammarAccess.getFunctionIdAccess().getSCHEME_IDTerminalRuleCall_1()); 
                    match(input,RULE_SCHEME_ID,FOLLOW_2); 
                     after(grammarAccess.getFunctionIdAccess().getSCHEME_IDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:194:2: ( ruleBoolean )
                    {
                    // InternalScheme.g:194:2: ( ruleBoolean )
                    // InternalScheme.g:195:3: ruleBoolean
                    {
                     before(grammarAccess.getFunctionIdAccess().getBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getFunctionIdAccess().getBooleanParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionId__Alternatives"


    // $ANTLR start "rule__FunctionParam__Alternatives"
    // InternalScheme.g:204:1: rule__FunctionParam__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) );
    public final void rule__FunctionParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:208:1: ( ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) )
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
            case 13:
            case 14:
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
                    // InternalScheme.g:209:2: ( RULE_INT )
                    {
                    // InternalScheme.g:209:2: ( RULE_INT )
                    // InternalScheme.g:210:3: RULE_INT
                    {
                     before(grammarAccess.getFunctionParamAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getFunctionParamAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:215:2: ( RULE_ID )
                    {
                    // InternalScheme.g:215:2: ( RULE_ID )
                    // InternalScheme.g:216:3: RULE_ID
                    {
                     before(grammarAccess.getFunctionParamAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFunctionParamAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:221:2: ( ruleBoolean )
                    {
                    // InternalScheme.g:221:2: ( ruleBoolean )
                    // InternalScheme.g:222:3: ruleBoolean
                    {
                     before(grammarAccess.getFunctionParamAccess().getBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getFunctionParamAccess().getBooleanParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParam__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalScheme.g:231:1: rule__Boolean__Alternatives : ( ( '#t' ) | ( '#f' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:235:1: ( ( '#t' ) | ( '#f' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalScheme.g:236:2: ( '#t' )
                    {
                    // InternalScheme.g:236:2: ( '#t' )
                    // InternalScheme.g:237:3: '#t'
                    {
                     before(grammarAccess.getBooleanAccess().getTKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:242:2: ( '#f' )
                    {
                    // InternalScheme.g:242:2: ( '#f' )
                    // InternalScheme.g:243:3: '#f'
                    {
                     before(grammarAccess.getBooleanAccess().getFKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // InternalScheme.g:252:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:256:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalScheme.g:257:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalScheme.g:264:1: rule__Function__Group__0__Impl : ( '(' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:268:1: ( ( '(' ) )
            // InternalScheme.g:269:1: ( '(' )
            {
            // InternalScheme.g:269:1: ( '(' )
            // InternalScheme.g:270:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalScheme.g:279:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:283:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalScheme.g:284:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalScheme.g:291:1: rule__Function__Group__1__Impl : ( ( rule__Function__IdAssignment_1 )* ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:295:1: ( ( ( rule__Function__IdAssignment_1 )* ) )
            // InternalScheme.g:296:1: ( ( rule__Function__IdAssignment_1 )* )
            {
            // InternalScheme.g:296:1: ( ( rule__Function__IdAssignment_1 )* )
            // InternalScheme.g:297:2: ( rule__Function__IdAssignment_1 )*
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_1()); 
            // InternalScheme.g:298:2: ( rule__Function__IdAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }
                else if ( ((LA5_0>=RULE_OPERATOR && LA5_0<=RULE_SCHEME_ID)||LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScheme.g:298:3: rule__Function__IdAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Function__IdAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalScheme.g:306:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:310:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalScheme.g:311:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalScheme.g:318:1: rule__Function__Group__2__Impl : ( ( rule__Function__ParamsAssignment_2 )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:322:1: ( ( ( rule__Function__ParamsAssignment_2 )* ) )
            // InternalScheme.g:323:1: ( ( rule__Function__ParamsAssignment_2 )* )
            {
            // InternalScheme.g:323:1: ( ( rule__Function__ParamsAssignment_2 )* )
            // InternalScheme.g:324:2: ( rule__Function__ParamsAssignment_2 )*
            {
             before(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 
            // InternalScheme.g:325:2: ( rule__Function__ParamsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||(LA6_0>=13 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScheme.g:325:3: rule__Function__ParamsAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Function__ParamsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getParamsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalScheme.g:333:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:337:1: ( rule__Function__Group__3__Impl )
            // InternalScheme.g:338:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalScheme.g:344:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:348:1: ( ( ')' ) )
            // InternalScheme.g:349:1: ( ')' )
            {
            // InternalScheme.g:349:1: ( ')' )
            // InternalScheme.g:350:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Model__FunctionsAssignment"
    // InternalScheme.g:360:1: rule__Model__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Model__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:364:1: ( ( ruleFunction ) )
            // InternalScheme.g:365:2: ( ruleFunction )
            {
            // InternalScheme.g:365:2: ( ruleFunction )
            // InternalScheme.g:366:3: ruleFunction
            {
             before(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FunctionsAssignment"


    // $ANTLR start "rule__Function__IdAssignment_1"
    // InternalScheme.g:375:1: rule__Function__IdAssignment_1 : ( ruleFunctionId ) ;
    public final void rule__Function__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:379:1: ( ( ruleFunctionId ) )
            // InternalScheme.g:380:2: ( ruleFunctionId )
            {
            // InternalScheme.g:380:2: ( ruleFunctionId )
            // InternalScheme.g:381:3: ruleFunctionId
            {
             before(grammarAccess.getFunctionAccess().getIdFunctionIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionId();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getIdFunctionIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__IdAssignment_1"


    // $ANTLR start "rule__Function__ParamsAssignment_2"
    // InternalScheme.g:390:1: rule__Function__ParamsAssignment_2 : ( ruleFunctionParam ) ;
    public final void rule__Function__ParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:394:1: ( ( ruleFunctionParam ) )
            // InternalScheme.g:395:2: ( ruleFunctionParam )
            {
            // InternalScheme.g:395:2: ( ruleFunctionParam )
            // InternalScheme.g:396:3: ruleFunctionParam
            {
             before(grammarAccess.getFunctionAccess().getParamsFunctionParamParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionParam();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getParamsFunctionParamParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ParamsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000160F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000060F2L});

}