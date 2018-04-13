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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_SCHEME_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#t'", "'#f'", "'0'", "'1'", "'+'", "'-'", "'*'", "'/'", "'='", "'not'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_SCHEME_ID=7;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==24) ) {
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


    // $ANTLR start "entryRuleBoolean"
    // InternalScheme.g:78:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalScheme.g:79:1: ( ruleBoolean EOF )
            // InternalScheme.g:80:1: ruleBoolean EOF
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
    // InternalScheme.g:87:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:91:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalScheme.g:92:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalScheme.g:92:2: ( ( rule__Boolean__Alternatives ) )
            // InternalScheme.g:93:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalScheme.g:94:3: ( rule__Boolean__Alternatives )
            // InternalScheme.g:94:4: rule__Boolean__Alternatives
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


    // $ANTLR start "entryRuleMath"
    // InternalScheme.g:103:1: entryRuleMath : ruleMath EOF ;
    public final void entryRuleMath() throws RecognitionException {
        try {
            // InternalScheme.g:104:1: ( ruleMath EOF )
            // InternalScheme.g:105:1: ruleMath EOF
            {
             before(grammarAccess.getMathRule()); 
            pushFollow(FOLLOW_1);
            ruleMath();

            state._fsp--;

             after(grammarAccess.getMathRule()); 
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
    // $ANTLR end "entryRuleMath"


    // $ANTLR start "ruleMath"
    // InternalScheme.g:112:1: ruleMath : ( ( rule__Math__Alternatives ) ) ;
    public final void ruleMath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:116:2: ( ( ( rule__Math__Alternatives ) ) )
            // InternalScheme.g:117:2: ( ( rule__Math__Alternatives ) )
            {
            // InternalScheme.g:117:2: ( ( rule__Math__Alternatives ) )
            // InternalScheme.g:118:3: ( rule__Math__Alternatives )
            {
             before(grammarAccess.getMathAccess().getAlternatives()); 
            // InternalScheme.g:119:3: ( rule__Math__Alternatives )
            // InternalScheme.g:119:4: rule__Math__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Math__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMath"


    // $ANTLR start "entryRuleVariable"
    // InternalScheme.g:128:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalScheme.g:129:1: ( ruleVariable EOF )
            // InternalScheme.g:130:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalScheme.g:137:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:141:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalScheme.g:142:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalScheme.g:142:2: ( ( rule__Variable__Group__0 ) )
            // InternalScheme.g:143:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalScheme.g:144:3: ( rule__Variable__Group__0 )
            // InternalScheme.g:144:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCondition"
    // InternalScheme.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalScheme.g:154:1: ( ruleCondition EOF )
            // InternalScheme.g:155:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalScheme.g:162:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:166:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalScheme.g:167:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalScheme.g:167:2: ( ( rule__Condition__Group__0 ) )
            // InternalScheme.g:168:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalScheme.g:169:3: ( rule__Condition__Group__0 )
            // InternalScheme.g:169:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleFunction"
    // InternalScheme.g:178:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalScheme.g:179:1: ( ruleFunction EOF )
            // InternalScheme.g:180:1: ruleFunction EOF
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
    // InternalScheme.g:187:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:191:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalScheme.g:192:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalScheme.g:192:2: ( ( rule__Function__Group__0 ) )
            // InternalScheme.g:193:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalScheme.g:194:3: ( rule__Function__Group__0 )
            // InternalScheme.g:194:4: rule__Function__Group__0
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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalScheme.g:202:1: rule__Boolean__Alternatives : ( ( '#t' ) | ( '#f' ) | ( '0' ) | ( '1' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:206:1: ( ( '#t' ) | ( '#f' ) | ( '0' ) | ( '1' ) )
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
                    // InternalScheme.g:207:2: ( '#t' )
                    {
                    // InternalScheme.g:207:2: ( '#t' )
                    // InternalScheme.g:208:3: '#t'
                    {
                     before(grammarAccess.getBooleanAccess().getTKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:213:2: ( '#f' )
                    {
                    // InternalScheme.g:213:2: ( '#f' )
                    // InternalScheme.g:214:3: '#f'
                    {
                     before(grammarAccess.getBooleanAccess().getFKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:219:2: ( '0' )
                    {
                    // InternalScheme.g:219:2: ( '0' )
                    // InternalScheme.g:220:3: '0'
                    {
                     before(grammarAccess.getBooleanAccess().getDigitZeroKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getDigitZeroKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:225:2: ( '1' )
                    {
                    // InternalScheme.g:225:2: ( '1' )
                    // InternalScheme.g:226:3: '1'
                    {
                     before(grammarAccess.getBooleanAccess().getDigitOneKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getDigitOneKeyword_3()); 

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


    // $ANTLR start "rule__Math__Alternatives"
    // InternalScheme.g:235:1: rule__Math__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '=' ) );
    public final void rule__Math__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:239:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '=' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalScheme.g:240:2: ( '+' )
                    {
                    // InternalScheme.g:240:2: ( '+' )
                    // InternalScheme.g:241:3: '+'
                    {
                     before(grammarAccess.getMathAccess().getPlusSignKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:246:2: ( '-' )
                    {
                    // InternalScheme.g:246:2: ( '-' )
                    // InternalScheme.g:247:3: '-'
                    {
                     before(grammarAccess.getMathAccess().getHyphenMinusKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:252:2: ( '*' )
                    {
                    // InternalScheme.g:252:2: ( '*' )
                    // InternalScheme.g:253:3: '*'
                    {
                     before(grammarAccess.getMathAccess().getAsteriskKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:258:2: ( '/' )
                    {
                    // InternalScheme.g:258:2: ( '/' )
                    // InternalScheme.g:259:3: '/'
                    {
                     before(grammarAccess.getMathAccess().getSolidusKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScheme.g:264:2: ( '=' )
                    {
                    // InternalScheme.g:264:2: ( '=' )
                    // InternalScheme.g:265:3: '='
                    {
                     before(grammarAccess.getMathAccess().getEqualsSignKeyword_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Math__Alternatives"


    // $ANTLR start "rule__Variable__Alternatives_1"
    // InternalScheme.g:274:1: rule__Variable__Alternatives_1 : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) | ( ruleMath ) | ( RULE_SCHEME_ID ) | ( ruleFunction ) | ( ruleCondition ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:278:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) | ( ruleMath ) | ( RULE_SCHEME_ID ) | ( ruleFunction ) | ( ruleCondition ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt4=5;
                }
                break;
            case RULE_SCHEME_ID:
                {
                alt4=6;
                }
                break;
            case 24:
                {
                alt4=7;
                }
                break;
            case 22:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalScheme.g:279:2: ( RULE_STRING )
                    {
                    // InternalScheme.g:279:2: ( RULE_STRING )
                    // InternalScheme.g:280:3: RULE_STRING
                    {
                     before(grammarAccess.getVariableAccess().getSTRINGTerminalRuleCall_1_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getSTRINGTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:285:2: ( RULE_INT )
                    {
                    // InternalScheme.g:285:2: ( RULE_INT )
                    // InternalScheme.g:286:3: RULE_INT
                    {
                     before(grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:291:2: ( RULE_ID )
                    {
                    // InternalScheme.g:291:2: ( RULE_ID )
                    // InternalScheme.g:292:3: RULE_ID
                    {
                     before(grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:297:2: ( ruleBoolean )
                    {
                    // InternalScheme.g:297:2: ( ruleBoolean )
                    // InternalScheme.g:298:3: ruleBoolean
                    {
                     before(grammarAccess.getVariableAccess().getBooleanParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleanParserRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScheme.g:303:2: ( ruleMath )
                    {
                    // InternalScheme.g:303:2: ( ruleMath )
                    // InternalScheme.g:304:3: ruleMath
                    {
                     before(grammarAccess.getVariableAccess().getMathParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMath();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getMathParserRuleCall_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalScheme.g:309:2: ( RULE_SCHEME_ID )
                    {
                    // InternalScheme.g:309:2: ( RULE_SCHEME_ID )
                    // InternalScheme.g:310:3: RULE_SCHEME_ID
                    {
                     before(grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_5()); 
                    match(input,RULE_SCHEME_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalScheme.g:315:2: ( ruleFunction )
                    {
                    // InternalScheme.g:315:2: ( ruleFunction )
                    // InternalScheme.g:316:3: ruleFunction
                    {
                     before(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalScheme.g:321:2: ( ruleCondition )
                    {
                    // InternalScheme.g:321:2: ( ruleCondition )
                    // InternalScheme.g:322:3: ruleCondition
                    {
                     before(grammarAccess.getVariableAccess().getConditionParserRuleCall_1_7()); 
                    pushFollow(FOLLOW_2);
                    ruleCondition();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getConditionParserRuleCall_1_7()); 

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
    // $ANTLR end "rule__Variable__Alternatives_1"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalScheme.g:331:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:335:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalScheme.g:336:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalScheme.g:343:1: rule__Variable__Group__0__Impl : ( ( 'not' )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:347:1: ( ( ( 'not' )? ) )
            // InternalScheme.g:348:1: ( ( 'not' )? )
            {
            // InternalScheme.g:348:1: ( ( 'not' )? )
            // InternalScheme.g:349:2: ( 'not' )?
            {
             before(grammarAccess.getVariableAccess().getNotKeyword_0()); 
            // InternalScheme.g:350:2: ( 'not' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScheme.g:350:3: 'not'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getNotKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalScheme.g:358:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:362:1: ( rule__Variable__Group__1__Impl )
            // InternalScheme.g:363:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalScheme.g:369:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:373:1: ( ( ( rule__Variable__Alternatives_1 ) ) )
            // InternalScheme.g:374:1: ( ( rule__Variable__Alternatives_1 ) )
            {
            // InternalScheme.g:374:1: ( ( rule__Variable__Alternatives_1 ) )
            // InternalScheme.g:375:2: ( rule__Variable__Alternatives_1 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalScheme.g:376:2: ( rule__Variable__Alternatives_1 )
            // InternalScheme.g:376:3: rule__Variable__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalScheme.g:385:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:389:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalScheme.g:390:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalScheme.g:397:1: rule__Condition__Group__0__Impl : ( '[' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:401:1: ( ( '[' ) )
            // InternalScheme.g:402:1: ( '[' )
            {
            // InternalScheme.g:402:1: ( '[' )
            // InternalScheme.g:403:2: '['
            {
             before(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalScheme.g:412:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:416:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalScheme.g:417:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalScheme.g:424:1: rule__Condition__Group__1__Impl : ( ( ruleVariable )* ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:428:1: ( ( ( ruleVariable )* ) )
            // InternalScheme.g:429:1: ( ( ruleVariable )* )
            {
            // InternalScheme.g:429:1: ( ( ruleVariable )* )
            // InternalScheme.g:430:2: ( ruleVariable )*
            {
             before(grammarAccess.getConditionAccess().getVariableParserRuleCall_1()); 
            // InternalScheme.g:431:2: ( ruleVariable )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_SCHEME_ID)||(LA6_0>=12 && LA6_0<=22)||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScheme.g:431:3: ruleVariable
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleVariable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getVariableParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalScheme.g:439:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:443:1: ( rule__Condition__Group__2__Impl )
            // InternalScheme.g:444:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalScheme.g:450:1: rule__Condition__Group__2__Impl : ( ']' ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:454:1: ( ( ']' ) )
            // InternalScheme.g:455:1: ( ']' )
            {
            // InternalScheme.g:455:1: ( ']' )
            // InternalScheme.g:456:2: ']'
            {
             before(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalScheme.g:466:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:470:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalScheme.g:471:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalScheme.g:478:1: rule__Function__Group__0__Impl : ( '(' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:482:1: ( ( '(' ) )
            // InternalScheme.g:483:1: ( '(' )
            {
            // InternalScheme.g:483:1: ( '(' )
            // InternalScheme.g:484:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalScheme.g:493:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:497:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalScheme.g:498:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalScheme.g:505:1: rule__Function__Group__1__Impl : ( ( ruleVariable )* ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:509:1: ( ( ( ruleVariable )* ) )
            // InternalScheme.g:510:1: ( ( ruleVariable )* )
            {
            // InternalScheme.g:510:1: ( ( ruleVariable )* )
            // InternalScheme.g:511:2: ( ruleVariable )*
            {
             before(grammarAccess.getFunctionAccess().getVariableParserRuleCall_1()); 
            // InternalScheme.g:512:2: ( ruleVariable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_SCHEME_ID)||(LA7_0>=12 && LA7_0<=22)||LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScheme.g:512:3: ruleVariable
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleVariable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getVariableParserRuleCall_1()); 

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
    // InternalScheme.g:520:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:524:1: ( rule__Function__Group__2__Impl )
            // InternalScheme.g:525:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__2__Impl();

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
    // InternalScheme.g:531:1: rule__Function__Group__2__Impl : ( ')' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:535:1: ( ( ')' ) )
            // InternalScheme.g:536:1: ( ')' )
            {
            // InternalScheme.g:536:1: ( ')' )
            // InternalScheme.g:537:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2()); 

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


    // $ANTLR start "rule__Model__FunctionsAssignment"
    // InternalScheme.g:547:1: rule__Model__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Model__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:551:1: ( ( ruleFunction ) )
            // InternalScheme.g:552:2: ( ruleFunction )
            {
            // InternalScheme.g:552:2: ( ruleFunction )
            // InternalScheme.g:553:3: ruleFunction
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000015FF0F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FFF0F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000017FF0F2L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000037FF0F0L});

}