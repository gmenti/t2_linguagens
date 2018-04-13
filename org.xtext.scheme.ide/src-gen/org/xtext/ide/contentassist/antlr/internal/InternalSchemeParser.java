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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_SCHEME_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#t'", "'#f'", "'0'", "'1'", "'+'", "'-'", "'*'", "'/'", "'='", "'not'", "'\\''", "'('", "')'"
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

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
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


    // $ANTLR start "entryRuleFunction"
    // InternalScheme.g:153:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalScheme.g:154:1: ( ruleFunction EOF )
            // InternalScheme.g:155:1: ruleFunction EOF
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
    // InternalScheme.g:162:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:166:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalScheme.g:167:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalScheme.g:167:2: ( ( rule__Function__Group__0 ) )
            // InternalScheme.g:168:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalScheme.g:169:3: ( rule__Function__Group__0 )
            // InternalScheme.g:169:4: rule__Function__Group__0
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
    // InternalScheme.g:177:1: rule__Boolean__Alternatives : ( ( '#t' ) | ( '#f' ) | ( '0' ) | ( '1' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:181:1: ( ( '#t' ) | ( '#f' ) | ( '0' ) | ( '1' ) )
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
                    // InternalScheme.g:182:2: ( '#t' )
                    {
                    // InternalScheme.g:182:2: ( '#t' )
                    // InternalScheme.g:183:3: '#t'
                    {
                     before(grammarAccess.getBooleanAccess().getTKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:188:2: ( '#f' )
                    {
                    // InternalScheme.g:188:2: ( '#f' )
                    // InternalScheme.g:189:3: '#f'
                    {
                     before(grammarAccess.getBooleanAccess().getFKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:194:2: ( '0' )
                    {
                    // InternalScheme.g:194:2: ( '0' )
                    // InternalScheme.g:195:3: '0'
                    {
                     before(grammarAccess.getBooleanAccess().getDigitZeroKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getDigitZeroKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:200:2: ( '1' )
                    {
                    // InternalScheme.g:200:2: ( '1' )
                    // InternalScheme.g:201:3: '1'
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
    // InternalScheme.g:210:1: rule__Math__Alternatives : ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '=' ) );
    public final void rule__Math__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:214:1: ( ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '=' ) )
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
                    // InternalScheme.g:215:2: ( '+' )
                    {
                    // InternalScheme.g:215:2: ( '+' )
                    // InternalScheme.g:216:3: '+'
                    {
                     before(grammarAccess.getMathAccess().getPlusSignKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:221:2: ( '-' )
                    {
                    // InternalScheme.g:221:2: ( '-' )
                    // InternalScheme.g:222:3: '-'
                    {
                     before(grammarAccess.getMathAccess().getHyphenMinusKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:227:2: ( '*' )
                    {
                    // InternalScheme.g:227:2: ( '*' )
                    // InternalScheme.g:228:3: '*'
                    {
                     before(grammarAccess.getMathAccess().getAsteriskKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:233:2: ( '/' )
                    {
                    // InternalScheme.g:233:2: ( '/' )
                    // InternalScheme.g:234:3: '/'
                    {
                     before(grammarAccess.getMathAccess().getSolidusKeyword_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMathAccess().getSolidusKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScheme.g:239:2: ( '=' )
                    {
                    // InternalScheme.g:239:2: ( '=' )
                    // InternalScheme.g:240:3: '='
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
    // InternalScheme.g:249:1: rule__Variable__Alternatives_1 : ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) | ( ruleMath ) | ( RULE_SCHEME_ID ) | ( ruleFunction ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:253:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) | ( ruleMath ) | ( RULE_SCHEME_ID ) | ( ruleFunction ) )
            int alt4=7;
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
            case 22:
            case 23:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalScheme.g:254:2: ( RULE_STRING )
                    {
                    // InternalScheme.g:254:2: ( RULE_STRING )
                    // InternalScheme.g:255:3: RULE_STRING
                    {
                     before(grammarAccess.getVariableAccess().getSTRINGTerminalRuleCall_1_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getSTRINGTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:260:2: ( RULE_INT )
                    {
                    // InternalScheme.g:260:2: ( RULE_INT )
                    // InternalScheme.g:261:3: RULE_INT
                    {
                     before(grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:266:2: ( RULE_ID )
                    {
                    // InternalScheme.g:266:2: ( RULE_ID )
                    // InternalScheme.g:267:3: RULE_ID
                    {
                     before(grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:272:2: ( ruleBoolean )
                    {
                    // InternalScheme.g:272:2: ( ruleBoolean )
                    // InternalScheme.g:273:3: ruleBoolean
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
                    // InternalScheme.g:278:2: ( ruleMath )
                    {
                    // InternalScheme.g:278:2: ( ruleMath )
                    // InternalScheme.g:279:3: ruleMath
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
                    // InternalScheme.g:284:2: ( RULE_SCHEME_ID )
                    {
                    // InternalScheme.g:284:2: ( RULE_SCHEME_ID )
                    // InternalScheme.g:285:3: RULE_SCHEME_ID
                    {
                     before(grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_5()); 
                    match(input,RULE_SCHEME_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalScheme.g:290:2: ( ruleFunction )
                    {
                    // InternalScheme.g:290:2: ( ruleFunction )
                    // InternalScheme.g:291:3: ruleFunction
                    {
                     before(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_6()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_6()); 

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
    // InternalScheme.g:300:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:304:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalScheme.g:305:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalScheme.g:312:1: rule__Variable__Group__0__Impl : ( ( 'not' )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:316:1: ( ( ( 'not' )? ) )
            // InternalScheme.g:317:1: ( ( 'not' )? )
            {
            // InternalScheme.g:317:1: ( ( 'not' )? )
            // InternalScheme.g:318:2: ( 'not' )?
            {
             before(grammarAccess.getVariableAccess().getNotKeyword_0()); 
            // InternalScheme.g:319:2: ( 'not' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalScheme.g:319:3: 'not'
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
    // InternalScheme.g:327:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:331:1: ( rule__Variable__Group__1__Impl )
            // InternalScheme.g:332:2: rule__Variable__Group__1__Impl
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
    // InternalScheme.g:338:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:342:1: ( ( ( rule__Variable__Alternatives_1 ) ) )
            // InternalScheme.g:343:1: ( ( rule__Variable__Alternatives_1 ) )
            {
            // InternalScheme.g:343:1: ( ( rule__Variable__Alternatives_1 ) )
            // InternalScheme.g:344:2: ( rule__Variable__Alternatives_1 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalScheme.g:345:2: ( rule__Variable__Alternatives_1 )
            // InternalScheme.g:345:3: rule__Variable__Alternatives_1
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


    // $ANTLR start "rule__Function__Group__0"
    // InternalScheme.g:354:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:358:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalScheme.g:359:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalScheme.g:366:1: rule__Function__Group__0__Impl : ( ( '\\'' )? ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:370:1: ( ( ( '\\'' )? ) )
            // InternalScheme.g:371:1: ( ( '\\'' )? )
            {
            // InternalScheme.g:371:1: ( ( '\\'' )? )
            // InternalScheme.g:372:2: ( '\\'' )?
            {
             before(grammarAccess.getFunctionAccess().getApostropheKeyword_0()); 
            // InternalScheme.g:373:2: ( '\\'' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalScheme.g:373:3: '\\''
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getApostropheKeyword_0()); 

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
    // InternalScheme.g:381:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:385:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalScheme.g:386:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalScheme.g:393:1: rule__Function__Group__1__Impl : ( '(' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:397:1: ( ( '(' ) )
            // InternalScheme.g:398:1: ( '(' )
            {
            // InternalScheme.g:398:1: ( '(' )
            // InternalScheme.g:399:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalScheme.g:408:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:412:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalScheme.g:413:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalScheme.g:420:1: rule__Function__Group__2__Impl : ( ( ruleVariable )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:424:1: ( ( ( ruleVariable )* ) )
            // InternalScheme.g:425:1: ( ( ruleVariable )* )
            {
            // InternalScheme.g:425:1: ( ( ruleVariable )* )
            // InternalScheme.g:426:2: ( ruleVariable )*
            {
             before(grammarAccess.getFunctionAccess().getVariableParserRuleCall_2()); 
            // InternalScheme.g:427:2: ( ruleVariable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_SCHEME_ID)||(LA7_0>=12 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalScheme.g:427:3: ruleVariable
            	    {
            	    pushFollow(FOLLOW_7);
            	    ruleVariable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getVariableParserRuleCall_2()); 

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
    // InternalScheme.g:435:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:439:1: ( rule__Function__Group__3__Impl )
            // InternalScheme.g:440:2: rule__Function__Group__3__Impl
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
    // InternalScheme.g:446:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:450:1: ( ( ')' ) )
            // InternalScheme.g:451:1: ( ')' )
            {
            // InternalScheme.g:451:1: ( ')' )
            // InternalScheme.g:452:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalScheme.g:462:1: rule__Model__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Model__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:466:1: ( ( ruleFunction ) )
            // InternalScheme.g:467:2: ( ruleFunction )
            {
            // InternalScheme.g:467:2: ( ruleFunction )
            // InternalScheme.g:468:3: ruleFunction
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000DFF0F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001FFF0F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000FFF0F2L});

}