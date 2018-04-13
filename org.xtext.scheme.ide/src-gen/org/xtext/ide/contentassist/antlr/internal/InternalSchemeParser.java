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

                if ( (LA1_0==17) ) {
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


    // $ANTLR start "entryRuleVariable"
    // InternalScheme.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalScheme.g:104:1: ( ruleVariable EOF )
            // InternalScheme.g:105:1: ruleVariable EOF
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
    // InternalScheme.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalScheme.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalScheme.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalScheme.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalScheme.g:119:3: ( rule__Variable__Group__0 )
            // InternalScheme.g:119:4: rule__Variable__Group__0
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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalScheme.g:152:1: rule__Boolean__Alternatives : ( ( '#t' ) | ( '#f' ) | ( '0' ) | ( '1' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:156:1: ( ( '#t' ) | ( '#f' ) | ( '0' ) | ( '1' ) )
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
                    // InternalScheme.g:157:2: ( '#t' )
                    {
                    // InternalScheme.g:157:2: ( '#t' )
                    // InternalScheme.g:158:3: '#t'
                    {
                     before(grammarAccess.getBooleanAccess().getTKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:163:2: ( '#f' )
                    {
                    // InternalScheme.g:163:2: ( '#f' )
                    // InternalScheme.g:164:3: '#f'
                    {
                     before(grammarAccess.getBooleanAccess().getFKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:169:2: ( '0' )
                    {
                    // InternalScheme.g:169:2: ( '0' )
                    // InternalScheme.g:170:3: '0'
                    {
                     before(grammarAccess.getBooleanAccess().getDigitZeroKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getDigitZeroKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:175:2: ( '1' )
                    {
                    // InternalScheme.g:175:2: ( '1' )
                    // InternalScheme.g:176:3: '1'
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


    // $ANTLR start "rule__Variable__Alternatives_1"
    // InternalScheme.g:185:1: rule__Variable__Alternatives_1 : ( ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) | ( RULE_SCHEME_ID ) | ( ruleFunction ) );
    public final void rule__Variable__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:189:1: ( ( RULE_INT ) | ( RULE_ID ) | ( ruleBoolean ) | ( RULE_SCHEME_ID ) | ( ruleFunction ) )
            int alt3=5;
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
            case 12:
            case 13:
            case 14:
            case 15:
                {
                alt3=3;
                }
                break;
            case RULE_SCHEME_ID:
                {
                alt3=4;
                }
                break;
            case 17:
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
                    // InternalScheme.g:190:2: ( RULE_INT )
                    {
                    // InternalScheme.g:190:2: ( RULE_INT )
                    // InternalScheme.g:191:3: RULE_INT
                    {
                     before(grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScheme.g:196:2: ( RULE_ID )
                    {
                    // InternalScheme.g:196:2: ( RULE_ID )
                    // InternalScheme.g:197:3: RULE_ID
                    {
                     before(grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getIDTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalScheme.g:202:2: ( ruleBoolean )
                    {
                    // InternalScheme.g:202:2: ( ruleBoolean )
                    // InternalScheme.g:203:3: ruleBoolean
                    {
                     before(grammarAccess.getVariableAccess().getBooleanParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getBooleanParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalScheme.g:208:2: ( RULE_SCHEME_ID )
                    {
                    // InternalScheme.g:208:2: ( RULE_SCHEME_ID )
                    // InternalScheme.g:209:3: RULE_SCHEME_ID
                    {
                     before(grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_3()); 
                    match(input,RULE_SCHEME_ID,FOLLOW_2); 
                     after(grammarAccess.getVariableAccess().getSCHEME_IDTerminalRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalScheme.g:214:2: ( ruleFunction )
                    {
                    // InternalScheme.g:214:2: ( ruleFunction )
                    // InternalScheme.g:215:3: ruleFunction
                    {
                     before(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getVariableAccess().getFunctionParserRuleCall_1_4()); 

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
    // InternalScheme.g:224:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:228:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalScheme.g:229:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalScheme.g:236:1: rule__Variable__Group__0__Impl : ( ( 'not' )? ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:240:1: ( ( ( 'not' )? ) )
            // InternalScheme.g:241:1: ( ( 'not' )? )
            {
            // InternalScheme.g:241:1: ( ( 'not' )? )
            // InternalScheme.g:242:2: ( 'not' )?
            {
             before(grammarAccess.getVariableAccess().getNotKeyword_0()); 
            // InternalScheme.g:243:2: ( 'not' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalScheme.g:243:3: 'not'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalScheme.g:251:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:255:1: ( rule__Variable__Group__1__Impl )
            // InternalScheme.g:256:2: rule__Variable__Group__1__Impl
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
    // InternalScheme.g:262:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__Alternatives_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:266:1: ( ( ( rule__Variable__Alternatives_1 ) ) )
            // InternalScheme.g:267:1: ( ( rule__Variable__Alternatives_1 ) )
            {
            // InternalScheme.g:267:1: ( ( rule__Variable__Alternatives_1 ) )
            // InternalScheme.g:268:2: ( rule__Variable__Alternatives_1 )
            {
             before(grammarAccess.getVariableAccess().getAlternatives_1()); 
            // InternalScheme.g:269:2: ( rule__Variable__Alternatives_1 )
            // InternalScheme.g:269:3: rule__Variable__Alternatives_1
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
    // InternalScheme.g:278:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:282:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalScheme.g:283:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalScheme.g:290:1: rule__Function__Group__0__Impl : ( '(' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:294:1: ( ( '(' ) )
            // InternalScheme.g:295:1: ( '(' )
            {
            // InternalScheme.g:295:1: ( '(' )
            // InternalScheme.g:296:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalScheme.g:305:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:309:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalScheme.g:310:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalScheme.g:317:1: rule__Function__Group__1__Impl : ( RULE_SCHEME_ID ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:321:1: ( ( RULE_SCHEME_ID ) )
            // InternalScheme.g:322:1: ( RULE_SCHEME_ID )
            {
            // InternalScheme.g:322:1: ( RULE_SCHEME_ID )
            // InternalScheme.g:323:2: RULE_SCHEME_ID
            {
             before(grammarAccess.getFunctionAccess().getSCHEME_IDTerminalRuleCall_1()); 
            match(input,RULE_SCHEME_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSCHEME_IDTerminalRuleCall_1()); 

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
    // InternalScheme.g:332:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:336:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalScheme.g:337:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalScheme.g:344:1: rule__Function__Group__2__Impl : ( ( ruleVariable )* ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:348:1: ( ( ( ruleVariable )* ) )
            // InternalScheme.g:349:1: ( ( ruleVariable )* )
            {
            // InternalScheme.g:349:1: ( ( ruleVariable )* )
            // InternalScheme.g:350:2: ( ruleVariable )*
            {
             before(grammarAccess.getFunctionAccess().getVariableParserRuleCall_2()); 
            // InternalScheme.g:351:2: ( ruleVariable )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_SCHEME_ID)||(LA5_0>=12 && LA5_0<=17)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScheme.g:351:3: ruleVariable
            	    {
            	    pushFollow(FOLLOW_7);
            	    ruleVariable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalScheme.g:359:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:363:1: ( rule__Function__Group__3__Impl )
            // InternalScheme.g:364:2: rule__Function__Group__3__Impl
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
    // InternalScheme.g:370:1: rule__Function__Group__3__Impl : ( ')' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:374:1: ( ( ')' ) )
            // InternalScheme.g:375:1: ( ')' )
            {
            // InternalScheme.g:375:1: ( ')' )
            // InternalScheme.g:376:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalScheme.g:386:1: rule__Model__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Model__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScheme.g:390:1: ( ( ruleFunction ) )
            // InternalScheme.g:391:2: ( ruleFunction )
            {
            // InternalScheme.g:391:2: ( ruleFunction )
            // InternalScheme.g:392:3: ruleFunction
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000002F070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007F070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003F072L});

}