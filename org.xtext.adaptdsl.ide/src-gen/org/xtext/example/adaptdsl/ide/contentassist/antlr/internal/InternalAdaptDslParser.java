package org.xtext.example.adaptdsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.adaptdsl.services.AdaptDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'flow'", "'{'", "'};'", "'service'", "'from'", "'as'", "'function'", "';'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'()'", "'.'", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAdaptDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdaptDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdaptDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAdaptDsl.g"; }


    	private AdaptDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(AdaptDslGrammarAccess grammarAccess) {
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
    // InternalAdaptDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:54:1: ( ruleModel EOF )
            // InternalAdaptDsl.g:55:1: ruleModel EOF
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
    // InternalAdaptDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAdaptDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAdaptDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAdaptDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAdaptDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalAdaptDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleServices"
    // InternalAdaptDsl.g:78:1: entryRuleServices : ruleServices EOF ;
    public final void entryRuleServices() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:79:1: ( ruleServices EOF )
            // InternalAdaptDsl.g:80:1: ruleServices EOF
            {
             before(grammarAccess.getServicesRule()); 
            pushFollow(FOLLOW_1);
            ruleServices();

            state._fsp--;

             after(grammarAccess.getServicesRule()); 
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
    // $ANTLR end "entryRuleServices"


    // $ANTLR start "ruleServices"
    // InternalAdaptDsl.g:87:1: ruleServices : ( ( rule__Services__Group__0 ) ) ;
    public final void ruleServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:91:2: ( ( ( rule__Services__Group__0 ) ) )
            // InternalAdaptDsl.g:92:2: ( ( rule__Services__Group__0 ) )
            {
            // InternalAdaptDsl.g:92:2: ( ( rule__Services__Group__0 ) )
            // InternalAdaptDsl.g:93:3: ( rule__Services__Group__0 )
            {
             before(grammarAccess.getServicesAccess().getGroup()); 
            // InternalAdaptDsl.g:94:3: ( rule__Services__Group__0 )
            // InternalAdaptDsl.g:94:4: rule__Services__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Services__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServicesAccess().getGroup()); 

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
    // $ANTLR end "ruleServices"


    // $ANTLR start "entryRuleService"
    // InternalAdaptDsl.g:103:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:104:1: ( ruleService EOF )
            // InternalAdaptDsl.g:105:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAdaptDsl.g:112:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:116:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalAdaptDsl.g:117:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalAdaptDsl.g:117:2: ( ( rule__Service__Group__0 ) )
            // InternalAdaptDsl.g:118:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalAdaptDsl.g:119:3: ( rule__Service__Group__0 )
            // InternalAdaptDsl.g:119:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleFunctions"
    // InternalAdaptDsl.g:128:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:129:1: ( ruleFunctions EOF )
            // InternalAdaptDsl.g:130:1: ruleFunctions EOF
            {
             before(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getFunctionsRule()); 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalAdaptDsl.g:137:1: ruleFunctions : ( ( rule__Functions__Group__0 ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:141:2: ( ( ( rule__Functions__Group__0 ) ) )
            // InternalAdaptDsl.g:142:2: ( ( rule__Functions__Group__0 ) )
            {
            // InternalAdaptDsl.g:142:2: ( ( rule__Functions__Group__0 ) )
            // InternalAdaptDsl.g:143:3: ( rule__Functions__Group__0 )
            {
             before(grammarAccess.getFunctionsAccess().getGroup()); 
            // InternalAdaptDsl.g:144:3: ( rule__Functions__Group__0 )
            // InternalAdaptDsl.g:144:4: rule__Functions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Functions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleFunction"
    // InternalAdaptDsl.g:153:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:154:1: ( ruleFunction EOF )
            // InternalAdaptDsl.g:155:1: ruleFunction EOF
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
    // InternalAdaptDsl.g:162:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:166:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalAdaptDsl.g:167:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalAdaptDsl.g:167:2: ( ( rule__Function__Group__0 ) )
            // InternalAdaptDsl.g:168:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalAdaptDsl.g:169:3: ( rule__Function__Group__0 )
            // InternalAdaptDsl.g:169:4: rule__Function__Group__0
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


    // $ANTLR start "entryRuleAdaptationRule"
    // InternalAdaptDsl.g:178:1: entryRuleAdaptationRule : ruleAdaptationRule EOF ;
    public final void entryRuleAdaptationRule() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:179:1: ( ruleAdaptationRule EOF )
            // InternalAdaptDsl.g:180:1: ruleAdaptationRule EOF
            {
             before(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleAdaptationRule();

            state._fsp--;

             after(grammarAccess.getAdaptationRuleRule()); 
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
    // $ANTLR end "entryRuleAdaptationRule"


    // $ANTLR start "ruleAdaptationRule"
    // InternalAdaptDsl.g:187:1: ruleAdaptationRule : ( ( rule__AdaptationRule__Group__0 ) ) ;
    public final void ruleAdaptationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:191:2: ( ( ( rule__AdaptationRule__Group__0 ) ) )
            // InternalAdaptDsl.g:192:2: ( ( rule__AdaptationRule__Group__0 ) )
            {
            // InternalAdaptDsl.g:192:2: ( ( rule__AdaptationRule__Group__0 ) )
            // InternalAdaptDsl.g:193:3: ( rule__AdaptationRule__Group__0 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getGroup()); 
            // InternalAdaptDsl.g:194:3: ( rule__AdaptationRule__Group__0 )
            // InternalAdaptDsl.g:194:4: rule__AdaptationRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleAdaptationRule"


    // $ANTLR start "entryRuleConditionalOR"
    // InternalAdaptDsl.g:203:1: entryRuleConditionalOR : ruleConditionalOR EOF ;
    public final void entryRuleConditionalOR() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:204:1: ( ruleConditionalOR EOF )
            // InternalAdaptDsl.g:205:1: ruleConditionalOR EOF
            {
             before(grammarAccess.getConditionalORRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalOR();

            state._fsp--;

             after(grammarAccess.getConditionalORRule()); 
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
    // $ANTLR end "entryRuleConditionalOR"


    // $ANTLR start "ruleConditionalOR"
    // InternalAdaptDsl.g:212:1: ruleConditionalOR : ( ( rule__ConditionalOR__Group__0 ) ) ;
    public final void ruleConditionalOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:216:2: ( ( ( rule__ConditionalOR__Group__0 ) ) )
            // InternalAdaptDsl.g:217:2: ( ( rule__ConditionalOR__Group__0 ) )
            {
            // InternalAdaptDsl.g:217:2: ( ( rule__ConditionalOR__Group__0 ) )
            // InternalAdaptDsl.g:218:3: ( rule__ConditionalOR__Group__0 )
            {
             before(grammarAccess.getConditionalORAccess().getGroup()); 
            // InternalAdaptDsl.g:219:3: ( rule__ConditionalOR__Group__0 )
            // InternalAdaptDsl.g:219:4: rule__ConditionalOR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalORAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalOR"


    // $ANTLR start "entryRuleConditionalAND"
    // InternalAdaptDsl.g:228:1: entryRuleConditionalAND : ruleConditionalAND EOF ;
    public final void entryRuleConditionalAND() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:229:1: ( ruleConditionalAND EOF )
            // InternalAdaptDsl.g:230:1: ruleConditionalAND EOF
            {
             before(grammarAccess.getConditionalANDRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalAND();

            state._fsp--;

             after(grammarAccess.getConditionalANDRule()); 
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
    // $ANTLR end "entryRuleConditionalAND"


    // $ANTLR start "ruleConditionalAND"
    // InternalAdaptDsl.g:237:1: ruleConditionalAND : ( ( rule__ConditionalAND__Group__0 ) ) ;
    public final void ruleConditionalAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:241:2: ( ( ( rule__ConditionalAND__Group__0 ) ) )
            // InternalAdaptDsl.g:242:2: ( ( rule__ConditionalAND__Group__0 ) )
            {
            // InternalAdaptDsl.g:242:2: ( ( rule__ConditionalAND__Group__0 ) )
            // InternalAdaptDsl.g:243:3: ( rule__ConditionalAND__Group__0 )
            {
             before(grammarAccess.getConditionalANDAccess().getGroup()); 
            // InternalAdaptDsl.g:244:3: ( rule__ConditionalAND__Group__0 )
            // InternalAdaptDsl.g:244:4: rule__ConditionalAND__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAND__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalANDAccess().getGroup()); 

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
    // $ANTLR end "ruleConditionalAND"


    // $ANTLR start "entryRuleConditionalPrimary"
    // InternalAdaptDsl.g:253:1: entryRuleConditionalPrimary : ruleConditionalPrimary EOF ;
    public final void entryRuleConditionalPrimary() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:254:1: ( ruleConditionalPrimary EOF )
            // InternalAdaptDsl.g:255:1: ruleConditionalPrimary EOF
            {
             before(grammarAccess.getConditionalPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionalPrimary();

            state._fsp--;

             after(grammarAccess.getConditionalPrimaryRule()); 
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
    // $ANTLR end "entryRuleConditionalPrimary"


    // $ANTLR start "ruleConditionalPrimary"
    // InternalAdaptDsl.g:262:1: ruleConditionalPrimary : ( ( rule__ConditionalPrimary__Alternatives ) ) ;
    public final void ruleConditionalPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:266:2: ( ( ( rule__ConditionalPrimary__Alternatives ) ) )
            // InternalAdaptDsl.g:267:2: ( ( rule__ConditionalPrimary__Alternatives ) )
            {
            // InternalAdaptDsl.g:267:2: ( ( rule__ConditionalPrimary__Alternatives ) )
            // InternalAdaptDsl.g:268:3: ( rule__ConditionalPrimary__Alternatives )
            {
             before(grammarAccess.getConditionalPrimaryAccess().getAlternatives()); 
            // InternalAdaptDsl.g:269:3: ( rule__ConditionalPrimary__Alternatives )
            // InternalAdaptDsl.g:269:4: rule__ConditionalPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionalPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConditionalPrimary"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalAdaptDsl.g:278:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:279:1: ( ruleBooleanCondition EOF )
            // InternalAdaptDsl.g:280:1: ruleBooleanCondition EOF
            {
             before(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getBooleanConditionRule()); 
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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalAdaptDsl.g:287:1: ruleBooleanCondition : ( ( rule__BooleanCondition__Alternatives ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:291:2: ( ( ( rule__BooleanCondition__Alternatives ) ) )
            // InternalAdaptDsl.g:292:2: ( ( rule__BooleanCondition__Alternatives ) )
            {
            // InternalAdaptDsl.g:292:2: ( ( rule__BooleanCondition__Alternatives ) )
            // InternalAdaptDsl.g:293:3: ( rule__BooleanCondition__Alternatives )
            {
             before(grammarAccess.getBooleanConditionAccess().getAlternatives()); 
            // InternalAdaptDsl.g:294:3: ( rule__BooleanCondition__Alternatives )
            // InternalAdaptDsl.g:294:4: rule__BooleanCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleNumberCondition"
    // InternalAdaptDsl.g:303:1: entryRuleNumberCondition : ruleNumberCondition EOF ;
    public final void entryRuleNumberCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:304:1: ( ruleNumberCondition EOF )
            // InternalAdaptDsl.g:305:1: ruleNumberCondition EOF
            {
             before(grammarAccess.getNumberConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberCondition();

            state._fsp--;

             after(grammarAccess.getNumberConditionRule()); 
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
    // $ANTLR end "entryRuleNumberCondition"


    // $ANTLR start "ruleNumberCondition"
    // InternalAdaptDsl.g:312:1: ruleNumberCondition : ( ( rule__NumberCondition__Group__0 ) ) ;
    public final void ruleNumberCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:316:2: ( ( ( rule__NumberCondition__Group__0 ) ) )
            // InternalAdaptDsl.g:317:2: ( ( rule__NumberCondition__Group__0 ) )
            {
            // InternalAdaptDsl.g:317:2: ( ( rule__NumberCondition__Group__0 ) )
            // InternalAdaptDsl.g:318:3: ( rule__NumberCondition__Group__0 )
            {
             before(grammarAccess.getNumberConditionAccess().getGroup()); 
            // InternalAdaptDsl.g:319:3: ( rule__NumberCondition__Group__0 )
            // InternalAdaptDsl.g:319:4: rule__NumberCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberCondition"


    // $ANTLR start "entryRuleStringCondition"
    // InternalAdaptDsl.g:328:1: entryRuleStringCondition : ruleStringCondition EOF ;
    public final void entryRuleStringCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:329:1: ( ruleStringCondition EOF )
            // InternalAdaptDsl.g:330:1: ruleStringCondition EOF
            {
             before(grammarAccess.getStringConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringCondition();

            state._fsp--;

             after(grammarAccess.getStringConditionRule()); 
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
    // $ANTLR end "entryRuleStringCondition"


    // $ANTLR start "ruleStringCondition"
    // InternalAdaptDsl.g:337:1: ruleStringCondition : ( ( rule__StringCondition__Group__0 ) ) ;
    public final void ruleStringCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:341:2: ( ( ( rule__StringCondition__Group__0 ) ) )
            // InternalAdaptDsl.g:342:2: ( ( rule__StringCondition__Group__0 ) )
            {
            // InternalAdaptDsl.g:342:2: ( ( rule__StringCondition__Group__0 ) )
            // InternalAdaptDsl.g:343:3: ( rule__StringCondition__Group__0 )
            {
             before(grammarAccess.getStringConditionAccess().getGroup()); 
            // InternalAdaptDsl.g:344:3: ( rule__StringCondition__Group__0 )
            // InternalAdaptDsl.g:344:4: rule__StringCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleStringCondition"


    // $ANTLR start "entryRuleFact"
    // InternalAdaptDsl.g:353:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:354:1: ( ruleFact EOF )
            // InternalAdaptDsl.g:355:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalAdaptDsl.g:362:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:366:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalAdaptDsl.g:367:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalAdaptDsl.g:367:2: ( ( rule__Fact__Group__0 ) )
            // InternalAdaptDsl.g:368:3: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // InternalAdaptDsl.g:369:3: ( rule__Fact__Group__0 )
            // InternalAdaptDsl.g:369:4: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleFactProperty"
    // InternalAdaptDsl.g:378:1: entryRuleFactProperty : ruleFactProperty EOF ;
    public final void entryRuleFactProperty() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:379:1: ( ruleFactProperty EOF )
            // InternalAdaptDsl.g:380:1: ruleFactProperty EOF
            {
             before(grammarAccess.getFactPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleFactProperty();

            state._fsp--;

             after(grammarAccess.getFactPropertyRule()); 
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
    // $ANTLR end "entryRuleFactProperty"


    // $ANTLR start "ruleFactProperty"
    // InternalAdaptDsl.g:387:1: ruleFactProperty : ( ( rule__FactProperty__Group__0 ) ) ;
    public final void ruleFactProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:391:2: ( ( ( rule__FactProperty__Group__0 ) ) )
            // InternalAdaptDsl.g:392:2: ( ( rule__FactProperty__Group__0 ) )
            {
            // InternalAdaptDsl.g:392:2: ( ( rule__FactProperty__Group__0 ) )
            // InternalAdaptDsl.g:393:3: ( rule__FactProperty__Group__0 )
            {
             before(grammarAccess.getFactPropertyAccess().getGroup()); 
            // InternalAdaptDsl.g:394:3: ( rule__FactProperty__Group__0 )
            // InternalAdaptDsl.g:394:4: rule__FactProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleFactProperty"


    // $ANTLR start "entryRuleNumberOperators"
    // InternalAdaptDsl.g:403:1: entryRuleNumberOperators : ruleNumberOperators EOF ;
    public final void entryRuleNumberOperators() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:404:1: ( ruleNumberOperators EOF )
            // InternalAdaptDsl.g:405:1: ruleNumberOperators EOF
            {
             before(grammarAccess.getNumberOperatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberOperators();

            state._fsp--;

             after(grammarAccess.getNumberOperatorsRule()); 
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
    // $ANTLR end "entryRuleNumberOperators"


    // $ANTLR start "ruleNumberOperators"
    // InternalAdaptDsl.g:412:1: ruleNumberOperators : ( ( rule__NumberOperators__Alternatives ) ) ;
    public final void ruleNumberOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:416:2: ( ( ( rule__NumberOperators__Alternatives ) ) )
            // InternalAdaptDsl.g:417:2: ( ( rule__NumberOperators__Alternatives ) )
            {
            // InternalAdaptDsl.g:417:2: ( ( rule__NumberOperators__Alternatives ) )
            // InternalAdaptDsl.g:418:3: ( rule__NumberOperators__Alternatives )
            {
             before(grammarAccess.getNumberOperatorsAccess().getAlternatives()); 
            // InternalAdaptDsl.g:419:3: ( rule__NumberOperators__Alternatives )
            // InternalAdaptDsl.g:419:4: rule__NumberOperators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberOperators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberOperatorsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumberOperators"


    // $ANTLR start "entryRuleStringOperators"
    // InternalAdaptDsl.g:428:1: entryRuleStringOperators : ruleStringOperators EOF ;
    public final void entryRuleStringOperators() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:429:1: ( ruleStringOperators EOF )
            // InternalAdaptDsl.g:430:1: ruleStringOperators EOF
            {
             before(grammarAccess.getStringOperatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOperators();

            state._fsp--;

             after(grammarAccess.getStringOperatorsRule()); 
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
    // $ANTLR end "entryRuleStringOperators"


    // $ANTLR start "ruleStringOperators"
    // InternalAdaptDsl.g:437:1: ruleStringOperators : ( ( rule__StringOperators__Alternatives ) ) ;
    public final void ruleStringOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:441:2: ( ( ( rule__StringOperators__Alternatives ) ) )
            // InternalAdaptDsl.g:442:2: ( ( rule__StringOperators__Alternatives ) )
            {
            // InternalAdaptDsl.g:442:2: ( ( rule__StringOperators__Alternatives ) )
            // InternalAdaptDsl.g:443:3: ( rule__StringOperators__Alternatives )
            {
             before(grammarAccess.getStringOperatorsAccess().getAlternatives()); 
            // InternalAdaptDsl.g:444:3: ( rule__StringOperators__Alternatives )
            // InternalAdaptDsl.g:444:4: rule__StringOperators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringOperators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringOperatorsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringOperators"


    // $ANTLR start "entryRuleBoolOperators"
    // InternalAdaptDsl.g:453:1: entryRuleBoolOperators : ruleBoolOperators EOF ;
    public final void entryRuleBoolOperators() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:454:1: ( ruleBoolOperators EOF )
            // InternalAdaptDsl.g:455:1: ruleBoolOperators EOF
            {
             before(grammarAccess.getBoolOperatorsRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolOperators();

            state._fsp--;

             after(grammarAccess.getBoolOperatorsRule()); 
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
    // $ANTLR end "entryRuleBoolOperators"


    // $ANTLR start "ruleBoolOperators"
    // InternalAdaptDsl.g:462:1: ruleBoolOperators : ( ( rule__BoolOperators__Alternatives ) ) ;
    public final void ruleBoolOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:466:2: ( ( ( rule__BoolOperators__Alternatives ) ) )
            // InternalAdaptDsl.g:467:2: ( ( rule__BoolOperators__Alternatives ) )
            {
            // InternalAdaptDsl.g:467:2: ( ( rule__BoolOperators__Alternatives ) )
            // InternalAdaptDsl.g:468:3: ( rule__BoolOperators__Alternatives )
            {
             before(grammarAccess.getBoolOperatorsAccess().getAlternatives()); 
            // InternalAdaptDsl.g:469:3: ( rule__BoolOperators__Alternatives )
            // InternalAdaptDsl.g:469:4: rule__BoolOperators__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperators__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperatorsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBoolOperators"


    // $ANTLR start "entryRuleActions"
    // InternalAdaptDsl.g:478:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:479:1: ( ruleActions EOF )
            // InternalAdaptDsl.g:480:1: ruleActions EOF
            {
             before(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsRule()); 
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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalAdaptDsl.g:487:1: ruleActions : ( ( rule__Actions__Group__0 ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:491:2: ( ( ( rule__Actions__Group__0 ) ) )
            // InternalAdaptDsl.g:492:2: ( ( rule__Actions__Group__0 ) )
            {
            // InternalAdaptDsl.g:492:2: ( ( rule__Actions__Group__0 ) )
            // InternalAdaptDsl.g:493:3: ( rule__Actions__Group__0 )
            {
             before(grammarAccess.getActionsAccess().getGroup()); 
            // InternalAdaptDsl.g:494:3: ( rule__Actions__Group__0 )
            // InternalAdaptDsl.g:494:4: rule__Actions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getGroup()); 

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleAction"
    // InternalAdaptDsl.g:503:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:504:1: ( ruleAction EOF )
            // InternalAdaptDsl.g:505:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAdaptDsl.g:512:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:516:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalAdaptDsl.g:517:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalAdaptDsl.g:517:2: ( ( rule__Action__Alternatives ) )
            // InternalAdaptDsl.g:518:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalAdaptDsl.g:519:3: ( rule__Action__Alternatives )
            // InternalAdaptDsl.g:519:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleServiceOperation"
    // InternalAdaptDsl.g:528:1: entryRuleServiceOperation : ruleServiceOperation EOF ;
    public final void entryRuleServiceOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:529:1: ( ruleServiceOperation EOF )
            // InternalAdaptDsl.g:530:1: ruleServiceOperation EOF
            {
             before(grammarAccess.getServiceOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceOperation();

            state._fsp--;

             after(grammarAccess.getServiceOperationRule()); 
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
    // $ANTLR end "entryRuleServiceOperation"


    // $ANTLR start "ruleServiceOperation"
    // InternalAdaptDsl.g:537:1: ruleServiceOperation : ( ( rule__ServiceOperation__Alternatives ) ) ;
    public final void ruleServiceOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:541:2: ( ( ( rule__ServiceOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:542:2: ( ( rule__ServiceOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:542:2: ( ( rule__ServiceOperation__Alternatives ) )
            // InternalAdaptDsl.g:543:3: ( rule__ServiceOperation__Alternatives )
            {
             before(grammarAccess.getServiceOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:544:3: ( rule__ServiceOperation__Alternatives )
            // InternalAdaptDsl.g:544:4: rule__ServiceOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleServiceOperation"


    // $ANTLR start "entryRuleServiceFunctionCallOperation"
    // InternalAdaptDsl.g:553:1: entryRuleServiceFunctionCallOperation : ruleServiceFunctionCallOperation EOF ;
    public final void entryRuleServiceFunctionCallOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:554:1: ( ruleServiceFunctionCallOperation EOF )
            // InternalAdaptDsl.g:555:1: ruleServiceFunctionCallOperation EOF
            {
             before(grammarAccess.getServiceFunctionCallOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceFunctionCallOperation();

            state._fsp--;

             after(grammarAccess.getServiceFunctionCallOperationRule()); 
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
    // $ANTLR end "entryRuleServiceFunctionCallOperation"


    // $ANTLR start "ruleServiceFunctionCallOperation"
    // InternalAdaptDsl.g:562:1: ruleServiceFunctionCallOperation : ( ( rule__ServiceFunctionCallOperation__Group__0 ) ) ;
    public final void ruleServiceFunctionCallOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:566:2: ( ( ( rule__ServiceFunctionCallOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:567:2: ( ( rule__ServiceFunctionCallOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:567:2: ( ( rule__ServiceFunctionCallOperation__Group__0 ) )
            // InternalAdaptDsl.g:568:3: ( rule__ServiceFunctionCallOperation__Group__0 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:569:3: ( rule__ServiceFunctionCallOperation__Group__0 )
            // InternalAdaptDsl.g:569:4: rule__ServiceFunctionCallOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceFunctionCallOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceFunctionCallOperation"


    // $ANTLR start "entryRuleEditFactOperation"
    // InternalAdaptDsl.g:578:1: entryRuleEditFactOperation : ruleEditFactOperation EOF ;
    public final void entryRuleEditFactOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:579:1: ( ruleEditFactOperation EOF )
            // InternalAdaptDsl.g:580:1: ruleEditFactOperation EOF
            {
             before(grammarAccess.getEditFactOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEditFactOperation();

            state._fsp--;

             after(grammarAccess.getEditFactOperationRule()); 
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
    // $ANTLR end "entryRuleEditFactOperation"


    // $ANTLR start "ruleEditFactOperation"
    // InternalAdaptDsl.g:587:1: ruleEditFactOperation : ( ( rule__EditFactOperation__Group__0 ) ) ;
    public final void ruleEditFactOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:591:2: ( ( ( rule__EditFactOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:592:2: ( ( rule__EditFactOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:592:2: ( ( rule__EditFactOperation__Group__0 ) )
            // InternalAdaptDsl.g:593:3: ( rule__EditFactOperation__Group__0 )
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:594:3: ( rule__EditFactOperation__Group__0 )
            // InternalAdaptDsl.g:594:4: rule__EditFactOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEditFactOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleEditFactOperation"


    // $ANTLR start "entryRuleSetDisplayPropertyOperation"
    // InternalAdaptDsl.g:603:1: entryRuleSetDisplayPropertyOperation : ruleSetDisplayPropertyOperation EOF ;
    public final void entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:604:1: ( ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptDsl.g:605:1: ruleSetDisplayPropertyOperation EOF
            {
             before(grammarAccess.getSetDisplayPropertyOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleSetDisplayPropertyOperation();

            state._fsp--;

             after(grammarAccess.getSetDisplayPropertyOperationRule()); 
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
    // $ANTLR end "entryRuleSetDisplayPropertyOperation"


    // $ANTLR start "ruleSetDisplayPropertyOperation"
    // InternalAdaptDsl.g:612:1: ruleSetDisplayPropertyOperation : ( ( rule__SetDisplayPropertyOperation__Group__0 ) ) ;
    public final void ruleSetDisplayPropertyOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:616:2: ( ( ( rule__SetDisplayPropertyOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:617:2: ( ( rule__SetDisplayPropertyOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:617:2: ( ( rule__SetDisplayPropertyOperation__Group__0 ) )
            // InternalAdaptDsl.g:618:3: ( rule__SetDisplayPropertyOperation__Group__0 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:619:3: ( rule__SetDisplayPropertyOperation__Group__0 )
            // InternalAdaptDsl.g:619:4: rule__SetDisplayPropertyOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetDisplayPropertyOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleSetDisplayPropertyOperation"


    // $ANTLR start "entryRuleDisplayPropertyValue"
    // InternalAdaptDsl.g:628:1: entryRuleDisplayPropertyValue : ruleDisplayPropertyValue EOF ;
    public final void entryRuleDisplayPropertyValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:629:1: ( ruleDisplayPropertyValue EOF )
            // InternalAdaptDsl.g:630:1: ruleDisplayPropertyValue EOF
            {
             before(grammarAccess.getDisplayPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDisplayPropertyValue();

            state._fsp--;

             after(grammarAccess.getDisplayPropertyValueRule()); 
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
    // $ANTLR end "entryRuleDisplayPropertyValue"


    // $ANTLR start "ruleDisplayPropertyValue"
    // InternalAdaptDsl.g:637:1: ruleDisplayPropertyValue : ( ( rule__DisplayPropertyValue__Alternatives ) ) ;
    public final void ruleDisplayPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:641:2: ( ( ( rule__DisplayPropertyValue__Alternatives ) ) )
            // InternalAdaptDsl.g:642:2: ( ( rule__DisplayPropertyValue__Alternatives ) )
            {
            // InternalAdaptDsl.g:642:2: ( ( rule__DisplayPropertyValue__Alternatives ) )
            // InternalAdaptDsl.g:643:3: ( rule__DisplayPropertyValue__Alternatives )
            {
             before(grammarAccess.getDisplayPropertyValueAccess().getAlternatives()); 
            // InternalAdaptDsl.g:644:3: ( rule__DisplayPropertyValue__Alternatives )
            // InternalAdaptDsl.g:644:4: rule__DisplayPropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DisplayPropertyValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDisplayPropertyValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDisplayPropertyValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalAdaptDsl.g:653:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:654:1: ( ruleIntValue EOF )
            // InternalAdaptDsl.g:655:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalAdaptDsl.g:662:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:666:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalAdaptDsl.g:667:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalAdaptDsl.g:667:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalAdaptDsl.g:668:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalAdaptDsl.g:669:3: ( rule__IntValue__ValueAssignment )
            // InternalAdaptDsl.g:669:4: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalAdaptDsl.g:678:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:679:1: ( ruleStringValue EOF )
            // InternalAdaptDsl.g:680:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalAdaptDsl.g:687:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:691:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalAdaptDsl.g:692:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalAdaptDsl.g:692:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalAdaptDsl.g:693:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalAdaptDsl.g:694:3: ( rule__StringValue__ValueAssignment )
            // InternalAdaptDsl.g:694:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalAdaptDsl.g:703:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:704:1: ( ruleBoolValue EOF )
            // InternalAdaptDsl.g:705:1: ruleBoolValue EOF
            {
             before(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolValue();

            state._fsp--;

             after(grammarAccess.getBoolValueRule()); 
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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalAdaptDsl.g:712:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:716:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalAdaptDsl.g:717:2: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalAdaptDsl.g:717:2: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalAdaptDsl.g:718:3: ( rule__BoolValue__ValueAssignment )
            {
             before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            // InternalAdaptDsl.g:719:3: ( rule__BoolValue__ValueAssignment )
            // InternalAdaptDsl.g:719:4: rule__BoolValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BoolValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBoolValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleTaskChangeOperation"
    // InternalAdaptDsl.g:728:1: entryRuleTaskChangeOperation : ruleTaskChangeOperation EOF ;
    public final void entryRuleTaskChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:729:1: ( ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:730:1: ruleTaskChangeOperation EOF
            {
             before(grammarAccess.getTaskChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskChangeOperation();

            state._fsp--;

             after(grammarAccess.getTaskChangeOperationRule()); 
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
    // $ANTLR end "entryRuleTaskChangeOperation"


    // $ANTLR start "ruleTaskChangeOperation"
    // InternalAdaptDsl.g:737:1: ruleTaskChangeOperation : ( ( rule__TaskChangeOperation__Alternatives ) ) ;
    public final void ruleTaskChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:741:2: ( ( ( rule__TaskChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:742:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:742:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:743:3: ( rule__TaskChangeOperation__Alternatives )
            {
             before(grammarAccess.getTaskChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:744:3: ( rule__TaskChangeOperation__Alternatives )
            // InternalAdaptDsl.g:744:4: rule__TaskChangeOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TaskChangeOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTaskChangeOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTaskChangeOperation"


    // $ANTLR start "entryRuleAddViewComponentOperation"
    // InternalAdaptDsl.g:753:1: entryRuleAddViewComponentOperation : ruleAddViewComponentOperation EOF ;
    public final void entryRuleAddViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:754:1: ( ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:755:1: ruleAddViewComponentOperation EOF
            {
             before(grammarAccess.getAddViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleAddViewComponentOperation();

            state._fsp--;

             after(grammarAccess.getAddViewComponentOperationRule()); 
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
    // $ANTLR end "entryRuleAddViewComponentOperation"


    // $ANTLR start "ruleAddViewComponentOperation"
    // InternalAdaptDsl.g:762:1: ruleAddViewComponentOperation : ( ( rule__AddViewComponentOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:766:2: ( ( ( rule__AddViewComponentOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:767:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:767:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            // InternalAdaptDsl.g:768:3: ( rule__AddViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:769:3: ( rule__AddViewComponentOperation__Group__0 )
            // InternalAdaptDsl.g:769:4: rule__AddViewComponentOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleAddViewComponentOperation"


    // $ANTLR start "entryRuleDeleteViewComponentOperation"
    // InternalAdaptDsl.g:778:1: entryRuleDeleteViewComponentOperation : ruleDeleteViewComponentOperation EOF ;
    public final void entryRuleDeleteViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:779:1: ( ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:780:1: ruleDeleteViewComponentOperation EOF
            {
             before(grammarAccess.getDeleteViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteViewComponentOperation();

            state._fsp--;

             after(grammarAccess.getDeleteViewComponentOperationRule()); 
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
    // $ANTLR end "entryRuleDeleteViewComponentOperation"


    // $ANTLR start "ruleDeleteViewComponentOperation"
    // InternalAdaptDsl.g:787:1: ruleDeleteViewComponentOperation : ( ( rule__DeleteViewComponentOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:791:2: ( ( ( rule__DeleteViewComponentOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:792:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:792:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            // InternalAdaptDsl.g:793:3: ( rule__DeleteViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:794:3: ( rule__DeleteViewComponentOperation__Group__0 )
            // InternalAdaptDsl.g:794:4: rule__DeleteViewComponentOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteViewComponentOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleDeleteViewComponentOperation"


    // $ANTLR start "entryRuleViewComponent"
    // InternalAdaptDsl.g:803:1: entryRuleViewComponent : ruleViewComponent EOF ;
    public final void entryRuleViewComponent() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:804:1: ( ruleViewComponent EOF )
            // InternalAdaptDsl.g:805:1: ruleViewComponent EOF
            {
             before(grammarAccess.getViewComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getViewComponentRule()); 
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
    // $ANTLR end "entryRuleViewComponent"


    // $ANTLR start "ruleViewComponent"
    // InternalAdaptDsl.g:812:1: ruleViewComponent : ( RULE_ID ) ;
    public final void ruleViewComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:816:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:817:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:817:2: ( RULE_ID )
            // InternalAdaptDsl.g:818:3: RULE_ID
            {
             before(grammarAccess.getViewComponentAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getViewComponentAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleViewComponent"


    // $ANTLR start "entryRuleTargetContainer"
    // InternalAdaptDsl.g:828:1: entryRuleTargetContainer : ruleTargetContainer EOF ;
    public final void entryRuleTargetContainer() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:829:1: ( ruleTargetContainer EOF )
            // InternalAdaptDsl.g:830:1: ruleTargetContainer EOF
            {
             before(grammarAccess.getTargetContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetContainer();

            state._fsp--;

             after(grammarAccess.getTargetContainerRule()); 
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
    // $ANTLR end "entryRuleTargetContainer"


    // $ANTLR start "ruleTargetContainer"
    // InternalAdaptDsl.g:837:1: ruleTargetContainer : ( RULE_ID ) ;
    public final void ruleTargetContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:841:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:842:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:842:2: ( RULE_ID )
            // InternalAdaptDsl.g:843:3: RULE_ID
            {
             before(grammarAccess.getTargetContainerAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetContainerAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleTargetContainer"


    // $ANTLR start "entryRuleNavigationChangeOperation"
    // InternalAdaptDsl.g:853:1: entryRuleNavigationChangeOperation : ruleNavigationChangeOperation EOF ;
    public final void entryRuleNavigationChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:854:1: ( ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:855:1: ruleNavigationChangeOperation EOF
            {
             before(grammarAccess.getNavigationChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigationChangeOperation();

            state._fsp--;

             after(grammarAccess.getNavigationChangeOperationRule()); 
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
    // $ANTLR end "entryRuleNavigationChangeOperation"


    // $ANTLR start "ruleNavigationChangeOperation"
    // InternalAdaptDsl.g:862:1: ruleNavigationChangeOperation : ( ( rule__NavigationChangeOperation__Alternatives ) ) ;
    public final void ruleNavigationChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:866:2: ( ( ( rule__NavigationChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:867:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:867:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:868:3: ( rule__NavigationChangeOperation__Alternatives )
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:869:3: ( rule__NavigationChangeOperation__Alternatives )
            // InternalAdaptDsl.g:869:4: rule__NavigationChangeOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NavigationChangeOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNavigationChangeOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNavigationChangeOperation"


    // $ANTLR start "entryRuleAddNavLinkOperation"
    // InternalAdaptDsl.g:878:1: entryRuleAddNavLinkOperation : ruleAddNavLinkOperation EOF ;
    public final void entryRuleAddNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:879:1: ( ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:880:1: ruleAddNavLinkOperation EOF
            {
             before(grammarAccess.getAddNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleAddNavLinkOperation();

            state._fsp--;

             after(grammarAccess.getAddNavLinkOperationRule()); 
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
    // $ANTLR end "entryRuleAddNavLinkOperation"


    // $ANTLR start "ruleAddNavLinkOperation"
    // InternalAdaptDsl.g:887:1: ruleAddNavLinkOperation : ( ( rule__AddNavLinkOperation__Group__0 ) ) ;
    public final void ruleAddNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:891:2: ( ( ( rule__AddNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:892:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:892:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:893:3: ( rule__AddNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:894:3: ( rule__AddNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:894:4: rule__AddNavLinkOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddNavLinkOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleAddNavLinkOperation"


    // $ANTLR start "entryRuleDeleteNavLinkOperation"
    // InternalAdaptDsl.g:903:1: entryRuleDeleteNavLinkOperation : ruleDeleteNavLinkOperation EOF ;
    public final void entryRuleDeleteNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:904:1: ( ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:905:1: ruleDeleteNavLinkOperation EOF
            {
             before(grammarAccess.getDeleteNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteNavLinkOperation();

            state._fsp--;

             after(grammarAccess.getDeleteNavLinkOperationRule()); 
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
    // $ANTLR end "entryRuleDeleteNavLinkOperation"


    // $ANTLR start "ruleDeleteNavLinkOperation"
    // InternalAdaptDsl.g:912:1: ruleDeleteNavLinkOperation : ( ( rule__DeleteNavLinkOperation__Group__0 ) ) ;
    public final void ruleDeleteNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:916:2: ( ( ( rule__DeleteNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:917:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:917:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:918:3: ( rule__DeleteNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:919:3: ( rule__DeleteNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:919:4: rule__DeleteNavLinkOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteNavLinkOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleDeleteNavLinkOperation"


    // $ANTLR start "entryRuleRedirectNavLinkOperation"
    // InternalAdaptDsl.g:928:1: entryRuleRedirectNavLinkOperation : ruleRedirectNavLinkOperation EOF ;
    public final void entryRuleRedirectNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:929:1: ( ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:930:1: ruleRedirectNavLinkOperation EOF
            {
             before(grammarAccess.getRedirectNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleRedirectNavLinkOperation();

            state._fsp--;

             after(grammarAccess.getRedirectNavLinkOperationRule()); 
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
    // $ANTLR end "entryRuleRedirectNavLinkOperation"


    // $ANTLR start "ruleRedirectNavLinkOperation"
    // InternalAdaptDsl.g:937:1: ruleRedirectNavLinkOperation : ( ( rule__RedirectNavLinkOperation__Group__0 ) ) ;
    public final void ruleRedirectNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:941:2: ( ( ( rule__RedirectNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:942:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:942:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:943:3: ( rule__RedirectNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:944:3: ( rule__RedirectNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:944:4: rule__RedirectNavLinkOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRedirectNavLinkOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleRedirectNavLinkOperation"


    // $ANTLR start "entryRuleClearNavOperation"
    // InternalAdaptDsl.g:953:1: entryRuleClearNavOperation : ruleClearNavOperation EOF ;
    public final void entryRuleClearNavOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:954:1: ( ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:955:1: ruleClearNavOperation EOF
            {
             before(grammarAccess.getClearNavOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleClearNavOperation();

            state._fsp--;

             after(grammarAccess.getClearNavOperationRule()); 
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
    // $ANTLR end "entryRuleClearNavOperation"


    // $ANTLR start "ruleClearNavOperation"
    // InternalAdaptDsl.g:962:1: ruleClearNavOperation : ( ( rule__ClearNavOperation__Group__0 ) ) ;
    public final void ruleClearNavOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:966:2: ( ( ( rule__ClearNavOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:967:2: ( ( rule__ClearNavOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:967:2: ( ( rule__ClearNavOperation__Group__0 ) )
            // InternalAdaptDsl.g:968:3: ( rule__ClearNavOperation__Group__0 )
            {
             before(grammarAccess.getClearNavOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:969:3: ( rule__ClearNavOperation__Group__0 )
            // InternalAdaptDsl.g:969:4: rule__ClearNavOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClearNavOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClearNavOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleClearNavOperation"


    // $ANTLR start "entryRuleText"
    // InternalAdaptDsl.g:978:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:979:1: ( ruleText EOF )
            // InternalAdaptDsl.g:980:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalAdaptDsl.g:987:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:991:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:992:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:992:2: ( RULE_STRING )
            // InternalAdaptDsl.g:993:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLayoutChangeOperation"
    // InternalAdaptDsl.g:1003:1: entryRuleLayoutChangeOperation : ruleLayoutChangeOperation EOF ;
    public final void entryRuleLayoutChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1004:1: ( ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:1005:1: ruleLayoutChangeOperation EOF
            {
             before(grammarAccess.getLayoutChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleLayoutChangeOperation();

            state._fsp--;

             after(grammarAccess.getLayoutChangeOperationRule()); 
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
    // $ANTLR end "entryRuleLayoutChangeOperation"


    // $ANTLR start "ruleLayoutChangeOperation"
    // InternalAdaptDsl.g:1012:1: ruleLayoutChangeOperation : ( ( rule__LayoutChangeOperation__Alternatives ) ) ;
    public final void ruleLayoutChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1016:2: ( ( ( rule__LayoutChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:1017:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:1017:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:1018:3: ( rule__LayoutChangeOperation__Alternatives )
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1019:3: ( rule__LayoutChangeOperation__Alternatives )
            // InternalAdaptDsl.g:1019:4: rule__LayoutChangeOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LayoutChangeOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutChangeOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLayoutChangeOperation"


    // $ANTLR start "entryRuleChangeFontSizeOperation"
    // InternalAdaptDsl.g:1028:1: entryRuleChangeFontSizeOperation : ruleChangeFontSizeOperation EOF ;
    public final void entryRuleChangeFontSizeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1029:1: ( ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:1030:1: ruleChangeFontSizeOperation EOF
            {
             before(grammarAccess.getChangeFontSizeOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeFontSizeOperation();

            state._fsp--;

             after(grammarAccess.getChangeFontSizeOperationRule()); 
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
    // $ANTLR end "entryRuleChangeFontSizeOperation"


    // $ANTLR start "ruleChangeFontSizeOperation"
    // InternalAdaptDsl.g:1037:1: ruleChangeFontSizeOperation : ( ( rule__ChangeFontSizeOperation__Group__0 ) ) ;
    public final void ruleChangeFontSizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1041:2: ( ( ( rule__ChangeFontSizeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1042:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1042:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            // InternalAdaptDsl.g:1043:3: ( rule__ChangeFontSizeOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1044:3: ( rule__ChangeFontSizeOperation__Group__0 )
            // InternalAdaptDsl.g:1044:4: rule__ChangeFontSizeOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeFontSizeOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleChangeFontSizeOperation"


    // $ANTLR start "entryRuleChangeColorSchemeOperation"
    // InternalAdaptDsl.g:1053:1: entryRuleChangeColorSchemeOperation : ruleChangeColorSchemeOperation EOF ;
    public final void entryRuleChangeColorSchemeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1054:1: ( ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:1055:1: ruleChangeColorSchemeOperation EOF
            {
             before(grammarAccess.getChangeColorSchemeOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeColorSchemeOperation();

            state._fsp--;

             after(grammarAccess.getChangeColorSchemeOperationRule()); 
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
    // $ANTLR end "entryRuleChangeColorSchemeOperation"


    // $ANTLR start "ruleChangeColorSchemeOperation"
    // InternalAdaptDsl.g:1062:1: ruleChangeColorSchemeOperation : ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) ;
    public final void ruleChangeColorSchemeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1066:2: ( ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1067:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1067:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            // InternalAdaptDsl.g:1068:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1069:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            // InternalAdaptDsl.g:1069:4: rule__ChangeColorSchemeOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeColorSchemeOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleChangeColorSchemeOperation"


    // $ANTLR start "entryRuleChangeFontOperation"
    // InternalAdaptDsl.g:1078:1: entryRuleChangeFontOperation : ruleChangeFontOperation EOF ;
    public final void entryRuleChangeFontOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1079:1: ( ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:1080:1: ruleChangeFontOperation EOF
            {
             before(grammarAccess.getChangeFontOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeFontOperation();

            state._fsp--;

             after(grammarAccess.getChangeFontOperationRule()); 
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
    // $ANTLR end "entryRuleChangeFontOperation"


    // $ANTLR start "ruleChangeFontOperation"
    // InternalAdaptDsl.g:1087:1: ruleChangeFontOperation : ( ( rule__ChangeFontOperation__Group__0 ) ) ;
    public final void ruleChangeFontOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1091:2: ( ( ( rule__ChangeFontOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1092:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1092:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            // InternalAdaptDsl.g:1093:3: ( rule__ChangeFontOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1094:3: ( rule__ChangeFontOperation__Group__0 )
            // InternalAdaptDsl.g:1094:4: rule__ChangeFontOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeFontOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleChangeFontOperation"


    // $ANTLR start "entryRuleChangeTableCssClassOperation"
    // InternalAdaptDsl.g:1103:1: entryRuleChangeTableCssClassOperation : ruleChangeTableCssClassOperation EOF ;
    public final void entryRuleChangeTableCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1104:1: ( ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:1105:1: ruleChangeTableCssClassOperation EOF
            {
             before(grammarAccess.getChangeTableCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleChangeTableCssClassOperation();

            state._fsp--;

             after(grammarAccess.getChangeTableCssClassOperationRule()); 
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
    // $ANTLR end "entryRuleChangeTableCssClassOperation"


    // $ANTLR start "ruleChangeTableCssClassOperation"
    // InternalAdaptDsl.g:1112:1: ruleChangeTableCssClassOperation : ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) ;
    public final void ruleChangeTableCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1116:2: ( ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1117:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1117:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:1118:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1119:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:1119:4: rule__ChangeTableCssClassOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeTableCssClassOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleChangeTableCssClassOperation"


    // $ANTLR start "entryRuleAdaptCssClassOperation"
    // InternalAdaptDsl.g:1128:1: entryRuleAdaptCssClassOperation : ruleAdaptCssClassOperation EOF ;
    public final void entryRuleAdaptCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1129:1: ( ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:1130:1: ruleAdaptCssClassOperation EOF
            {
             before(grammarAccess.getAdaptCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleAdaptCssClassOperation();

            state._fsp--;

             after(grammarAccess.getAdaptCssClassOperationRule()); 
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
    // $ANTLR end "entryRuleAdaptCssClassOperation"


    // $ANTLR start "ruleAdaptCssClassOperation"
    // InternalAdaptDsl.g:1137:1: ruleAdaptCssClassOperation : ( ( rule__AdaptCssClassOperation__Group__0 ) ) ;
    public final void ruleAdaptCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1141:2: ( ( ( rule__AdaptCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1142:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1142:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:1143:3: ( rule__AdaptCssClassOperation__Group__0 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1144:3: ( rule__AdaptCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:1144:4: rule__AdaptCssClassOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdaptCssClassOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleAdaptCssClassOperation"


    // $ANTLR start "entryRuleCssClass"
    // InternalAdaptDsl.g:1153:1: entryRuleCssClass : ruleCssClass EOF ;
    public final void entryRuleCssClass() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1154:1: ( ruleCssClass EOF )
            // InternalAdaptDsl.g:1155:1: ruleCssClass EOF
            {
             before(grammarAccess.getCssClassRule()); 
            pushFollow(FOLLOW_1);
            ruleCssClass();

            state._fsp--;

             after(grammarAccess.getCssClassRule()); 
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
    // $ANTLR end "entryRuleCssClass"


    // $ANTLR start "ruleCssClass"
    // InternalAdaptDsl.g:1162:1: ruleCssClass : ( RULE_STRING ) ;
    public final void ruleCssClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1166:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1167:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1167:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1168:3: RULE_STRING
            {
             before(grammarAccess.getCssClassAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCssClassAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleCssClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalAdaptDsl.g:1178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1179:1: ( ruleAttribute EOF )
            // InternalAdaptDsl.g:1180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalAdaptDsl.g:1187:1: ruleAttribute : ( RULE_STRING ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1191:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1192:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1192:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1193:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalAdaptDsl.g:1203:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1204:1: ( ruleAttributeValue EOF )
            // InternalAdaptDsl.g:1205:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalAdaptDsl.g:1212:1: ruleAttributeValue : ( RULE_STRING ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1216:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1217:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1217:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1218:3: RULE_STRING
            {
             before(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleColor"
    // InternalAdaptDsl.g:1228:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1229:1: ( ruleColor EOF )
            // InternalAdaptDsl.g:1230:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalAdaptDsl.g:1237:1: ruleColor : ( RULE_STRING ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1241:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1242:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1242:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1243:3: RULE_STRING
            {
             before(grammarAccess.getColorAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleFontSize"
    // InternalAdaptDsl.g:1253:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1254:1: ( ruleFontSize EOF )
            // InternalAdaptDsl.g:1255:1: ruleFontSize EOF
            {
             before(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getFontSizeRule()); 
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
    // $ANTLR end "entryRuleFontSize"


    // $ANTLR start "ruleFontSize"
    // InternalAdaptDsl.g:1262:1: ruleFontSize : ( RULE_INT ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1266:2: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:1267:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:1267:2: ( RULE_INT )
            // InternalAdaptDsl.g:1268:3: RULE_INT
            {
             before(grammarAccess.getFontSizeAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFontSizeAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleFontSize"


    // $ANTLR start "entryRuleValue"
    // InternalAdaptDsl.g:1278:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1279:1: ( ruleValue EOF )
            // InternalAdaptDsl.g:1280:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalAdaptDsl.g:1287:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1291:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAdaptDsl.g:1292:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAdaptDsl.g:1292:2: ( ( rule__Value__Alternatives ) )
            // InternalAdaptDsl.g:1293:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1294:3: ( rule__Value__Alternatives )
            // InternalAdaptDsl.g:1294:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "rule__ConditionalPrimary__Alternatives"
    // InternalAdaptDsl.g:1302:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );
    public final void rule__ConditionalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1306:1: ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:1307:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1307:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    // InternalAdaptDsl.g:1308:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_0()); 
                    // InternalAdaptDsl.g:1309:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    // InternalAdaptDsl.g:1309:4: rule__ConditionalPrimary__CondAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalPrimary__CondAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1313:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1313:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    // InternalAdaptDsl.g:1314:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_1()); 
                    // InternalAdaptDsl.g:1315:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    // InternalAdaptDsl.g:1315:4: rule__ConditionalPrimary__CondAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalPrimary__CondAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1319:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1319:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    // InternalAdaptDsl.g:1320:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_2()); 
                    // InternalAdaptDsl.g:1321:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    // InternalAdaptDsl.g:1321:4: rule__ConditionalPrimary__CondAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalPrimary__CondAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_2()); 

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
    // $ANTLR end "rule__ConditionalPrimary__Alternatives"


    // $ANTLR start "rule__BooleanCondition__Alternatives"
    // InternalAdaptDsl.g:1329:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );
    public final void rule__BooleanCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1333:1: ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptDsl.g:1334:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    {
                    // InternalAdaptDsl.g:1334:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    // InternalAdaptDsl.g:1335:3: ( rule__BooleanCondition__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getGroup_0()); 
                    // InternalAdaptDsl.g:1336:3: ( rule__BooleanCondition__Group_0__0 )
                    // InternalAdaptDsl.g:1336:4: rule__BooleanCondition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanCondition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1340:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1340:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    // InternalAdaptDsl.g:1341:3: ( rule__BooleanCondition__FactAssignment_1 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getFactAssignment_1()); 
                    // InternalAdaptDsl.g:1342:3: ( rule__BooleanCondition__FactAssignment_1 )
                    // InternalAdaptDsl.g:1342:4: rule__BooleanCondition__FactAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanCondition__FactAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBooleanConditionAccess().getFactAssignment_1()); 

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
    // $ANTLR end "rule__BooleanCondition__Alternatives"


    // $ANTLR start "rule__NumberOperators__Alternatives"
    // InternalAdaptDsl.g:1350:1: rule__NumberOperators__Alternatives : ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) );
    public final void rule__NumberOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1354:1: ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            case 18:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAdaptDsl.g:1355:2: ( '>' )
                    {
                    // InternalAdaptDsl.g:1355:2: ( '>' )
                    // InternalAdaptDsl.g:1356:3: '>'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1361:2: ( '<' )
                    {
                    // InternalAdaptDsl.g:1361:2: ( '<' )
                    // InternalAdaptDsl.g:1362:3: '<'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1367:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1367:2: ( '==' )
                    // InternalAdaptDsl.g:1368:3: '=='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1373:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1373:2: ( '!=' )
                    // InternalAdaptDsl.g:1374:3: '!='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1379:2: ( '>=' )
                    {
                    // InternalAdaptDsl.g:1379:2: ( '>=' )
                    // InternalAdaptDsl.g:1380:3: '>='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1385:2: ( '<=' )
                    {
                    // InternalAdaptDsl.g:1385:2: ( '<=' )
                    // InternalAdaptDsl.g:1386:3: '<='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1391:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1391:2: ( '===' )
                    // InternalAdaptDsl.g:1392:3: '==='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_6()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_6()); 

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
    // $ANTLR end "rule__NumberOperators__Alternatives"


    // $ANTLR start "rule__StringOperators__Alternatives"
    // InternalAdaptDsl.g:1401:1: rule__StringOperators__Alternatives : ( ( '==' ) | ( '!=' ) | ( '===' ) );
    public final void rule__StringOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1405:1: ( ( '==' ) | ( '!=' ) | ( '===' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAdaptDsl.g:1406:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1406:2: ( '==' )
                    // InternalAdaptDsl.g:1407:3: '=='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1412:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1412:2: ( '!=' )
                    // InternalAdaptDsl.g:1413:3: '!='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1418:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1418:2: ( '===' )
                    // InternalAdaptDsl.g:1419:3: '==='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__StringOperators__Alternatives"


    // $ANTLR start "rule__BoolOperators__Alternatives"
    // InternalAdaptDsl.g:1428:1: rule__BoolOperators__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__BoolOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1432:1: ( ( '==' ) | ( '!=' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdaptDsl.g:1433:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1433:2: ( '==' )
                    // InternalAdaptDsl.g:1434:3: '=='
                    {
                     before(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1439:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1439:2: ( '!=' )
                    // InternalAdaptDsl.g:1440:3: '!='
                    {
                     before(grammarAccess.getBoolOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBoolOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__BoolOperators__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalAdaptDsl.g:1449:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1453:1: ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 39:
            case 41:
            case 42:
                {
                alt6=1;
                }
                break;
            case 43:
            case 44:
                {
                alt6=2;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt6=3;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAdaptDsl.g:1454:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1454:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    // InternalAdaptDsl.g:1455:3: ( rule__Action__ActionCategoryAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_0()); 
                    // InternalAdaptDsl.g:1456:3: ( rule__Action__ActionCategoryAssignment_0 )
                    // InternalAdaptDsl.g:1456:4: rule__Action__ActionCategoryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ActionCategoryAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getActionCategoryAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1460:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1460:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    // InternalAdaptDsl.g:1461:3: ( rule__Action__ActionCategoryAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_1()); 
                    // InternalAdaptDsl.g:1462:3: ( rule__Action__ActionCategoryAssignment_1 )
                    // InternalAdaptDsl.g:1462:4: rule__Action__ActionCategoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ActionCategoryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getActionCategoryAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1466:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1466:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    // InternalAdaptDsl.g:1467:3: ( rule__Action__ActionCategoryAssignment_2 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_2()); 
                    // InternalAdaptDsl.g:1468:3: ( rule__Action__ActionCategoryAssignment_2 )
                    // InternalAdaptDsl.g:1468:4: rule__Action__ActionCategoryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ActionCategoryAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getActionCategoryAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1472:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1472:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    // InternalAdaptDsl.g:1473:3: ( rule__Action__ActionCategoryAssignment_3 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_3()); 
                    // InternalAdaptDsl.g:1474:3: ( rule__Action__ActionCategoryAssignment_3 )
                    // InternalAdaptDsl.g:1474:4: rule__Action__ActionCategoryAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ActionCategoryAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getActionCategoryAssignment_3()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__ServiceOperation__Alternatives"
    // InternalAdaptDsl.g:1482:1: rule__ServiceOperation__Alternatives : ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) );
    public final void rule__ServiceOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1486:1: ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 42:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAdaptDsl.g:1487:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1487:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1488:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1489:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1489:4: rule__ServiceOperation__OperationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceOperation__OperationAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceOperationAccess().getOperationAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1493:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1493:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1494:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1495:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1495:4: rule__ServiceOperation__OperationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceOperation__OperationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceOperationAccess().getOperationAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1499:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1499:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1500:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1501:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1501:4: rule__ServiceOperation__OperationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceOperation__OperationAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceOperationAccess().getOperationAssignment_2()); 

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
    // $ANTLR end "rule__ServiceOperation__Alternatives"


    // $ANTLR start "rule__DisplayPropertyValue__Alternatives"
    // InternalAdaptDsl.g:1509:1: rule__DisplayPropertyValue__Alternatives : ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) );
    public final void rule__DisplayPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1513:1: ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_BOOL:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalAdaptDsl.g:1514:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1514:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    // InternalAdaptDsl.g:1515:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_0()); 
                    // InternalAdaptDsl.g:1516:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    // InternalAdaptDsl.g:1516:4: rule__DisplayPropertyValue__PropertyClassAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DisplayPropertyValue__PropertyClassAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1520:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1520:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    // InternalAdaptDsl.g:1521:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_1()); 
                    // InternalAdaptDsl.g:1522:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    // InternalAdaptDsl.g:1522:4: rule__DisplayPropertyValue__PropertyClassAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DisplayPropertyValue__PropertyClassAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1526:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1526:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    // InternalAdaptDsl.g:1527:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_2()); 
                    // InternalAdaptDsl.g:1528:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    // InternalAdaptDsl.g:1528:4: rule__DisplayPropertyValue__PropertyClassAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DisplayPropertyValue__PropertyClassAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_2()); 

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
    // $ANTLR end "rule__DisplayPropertyValue__Alternatives"


    // $ANTLR start "rule__TaskChangeOperation__Alternatives"
    // InternalAdaptDsl.g:1536:1: rule__TaskChangeOperation__Alternatives : ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) );
    public final void rule__TaskChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1540:1: ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            else if ( (LA9_0==44) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:1541:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1541:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1542:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1543:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1543:4: rule__TaskChangeOperation__OperationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskChangeOperation__OperationAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1547:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1547:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1548:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1549:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1549:4: rule__TaskChangeOperation__OperationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskChangeOperation__OperationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 

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
    // $ANTLR end "rule__TaskChangeOperation__Alternatives"


    // $ANTLR start "rule__NavigationChangeOperation__Alternatives"
    // InternalAdaptDsl.g:1557:1: rule__NavigationChangeOperation__Alternatives : ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__NavigationChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1561:1: ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt10=1;
                }
                break;
            case 46:
                {
                alt10=2;
                }
                break;
            case 47:
                {
                alt10=3;
                }
                break;
            case 48:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAdaptDsl.g:1562:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1562:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1563:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1564:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1564:4: rule__NavigationChangeOperation__OperationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationChangeOperation__OperationAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1568:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1568:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1569:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1570:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1570:4: rule__NavigationChangeOperation__OperationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationChangeOperation__OperationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1574:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1574:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1575:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1576:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1576:4: rule__NavigationChangeOperation__OperationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationChangeOperation__OperationAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1580:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1580:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1581:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1582:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1582:4: rule__NavigationChangeOperation__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavigationChangeOperation__OperationAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_3()); 

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
    // $ANTLR end "rule__NavigationChangeOperation__Alternatives"


    // $ANTLR start "rule__LayoutChangeOperation__Alternatives"
    // InternalAdaptDsl.g:1590:1: rule__LayoutChangeOperation__Alternatives : ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) );
    public final void rule__LayoutChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1594:1: ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 49:
                {
                alt11=2;
                }
                break;
            case 52:
                {
                alt11=3;
                }
                break;
            case 53:
                {
                alt11=4;
                }
                break;
            case 50:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAdaptDsl.g:1595:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1595:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1596:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1597:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1597:4: rule__LayoutChangeOperation__OperationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutChangeOperation__OperationAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1601:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1601:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1602:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1603:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1603:4: rule__LayoutChangeOperation__OperationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutChangeOperation__OperationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1607:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1607:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1608:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1609:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1609:4: rule__LayoutChangeOperation__OperationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutChangeOperation__OperationAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1613:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1613:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1614:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1615:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1615:4: rule__LayoutChangeOperation__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutChangeOperation__OperationAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1619:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    {
                    // InternalAdaptDsl.g:1619:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    // InternalAdaptDsl.g:1620:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_4()); 
                    // InternalAdaptDsl.g:1621:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    // InternalAdaptDsl.g:1621:4: rule__LayoutChangeOperation__OperationAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutChangeOperation__OperationAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_4()); 

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
    // $ANTLR end "rule__LayoutChangeOperation__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalAdaptDsl.g:1629:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1633:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_BOOL:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAdaptDsl.g:1634:2: ( RULE_INT )
                    {
                    // InternalAdaptDsl.g:1634:2: ( RULE_INT )
                    // InternalAdaptDsl.g:1635:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1640:2: ( RULE_STRING )
                    {
                    // InternalAdaptDsl.g:1640:2: ( RULE_STRING )
                    // InternalAdaptDsl.g:1641:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1646:2: ( RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:1646:2: ( RULE_BOOL )
                    // InternalAdaptDsl.g:1647:3: RULE_BOOL
                    {
                     before(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAdaptDsl.g:1656:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1660:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptDsl.g:1661:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAdaptDsl.g:1668:1: rule__Model__Group__0__Impl : ( ( rule__Model__ServicesAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1672:1: ( ( ( rule__Model__ServicesAssignment_0 )? ) )
            // InternalAdaptDsl.g:1673:1: ( ( rule__Model__ServicesAssignment_0 )? )
            {
            // InternalAdaptDsl.g:1673:1: ( ( rule__Model__ServicesAssignment_0 )? )
            // InternalAdaptDsl.g:1674:2: ( rule__Model__ServicesAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getServicesAssignment_0()); 
            // InternalAdaptDsl.g:1675:2: ( rule__Model__ServicesAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdaptDsl.g:1675:3: rule__Model__ServicesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ServicesAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getServicesAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAdaptDsl.g:1683:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1687:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAdaptDsl.g:1688:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAdaptDsl.g:1695:1: rule__Model__Group__1__Impl : ( 'flow' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1699:1: ( ( 'flow' ) )
            // InternalAdaptDsl.g:1700:1: ( 'flow' )
            {
            // InternalAdaptDsl.g:1700:1: ( 'flow' )
            // InternalAdaptDsl.g:1701:2: 'flow'
            {
             before(grammarAccess.getModelAccess().getFlowKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFlowKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAdaptDsl.g:1710:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1714:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAdaptDsl.g:1715:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAdaptDsl.g:1722:1: rule__Model__Group__2__Impl : ( ( rule__Model__FlowNameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1726:1: ( ( ( rule__Model__FlowNameAssignment_2 ) ) )
            // InternalAdaptDsl.g:1727:1: ( ( rule__Model__FlowNameAssignment_2 ) )
            {
            // InternalAdaptDsl.g:1727:1: ( ( rule__Model__FlowNameAssignment_2 ) )
            // InternalAdaptDsl.g:1728:2: ( rule__Model__FlowNameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getFlowNameAssignment_2()); 
            // InternalAdaptDsl.g:1729:2: ( rule__Model__FlowNameAssignment_2 )
            // InternalAdaptDsl.g:1729:3: rule__Model__FlowNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__FlowNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFlowNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalAdaptDsl.g:1737:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1741:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAdaptDsl.g:1742:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAdaptDsl.g:1749:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1753:1: ( ( '{' ) )
            // InternalAdaptDsl.g:1754:1: ( '{' )
            {
            // InternalAdaptDsl.g:1754:1: ( '{' )
            // InternalAdaptDsl.g:1755:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalAdaptDsl.g:1764:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1768:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalAdaptDsl.g:1769:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalAdaptDsl.g:1776:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1780:1: ( ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) ) )
            // InternalAdaptDsl.g:1781:1: ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) )
            {
            // InternalAdaptDsl.g:1781:1: ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) )
            // InternalAdaptDsl.g:1782:2: ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* )
            {
            // InternalAdaptDsl.g:1782:2: ( ( rule__Model__AdaptationRulesAssignment_4 ) )
            // InternalAdaptDsl.g:1783:3: ( rule__Model__AdaptationRulesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 
            // InternalAdaptDsl.g:1784:3: ( rule__Model__AdaptationRulesAssignment_4 )
            // InternalAdaptDsl.g:1784:4: rule__Model__AdaptationRulesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Model__AdaptationRulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 

            }

            // InternalAdaptDsl.g:1787:2: ( ( rule__Model__AdaptationRulesAssignment_4 )* )
            // InternalAdaptDsl.g:1788:3: ( rule__Model__AdaptationRulesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 
            // InternalAdaptDsl.g:1789:3: ( rule__Model__AdaptationRulesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAdaptDsl.g:1789:4: rule__Model__AdaptationRulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__AdaptationRulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 

            }


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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalAdaptDsl.g:1798:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1802:1: ( rule__Model__Group__5__Impl )
            // InternalAdaptDsl.g:1803:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalAdaptDsl.g:1809:1: rule__Model__Group__5__Impl : ( '};' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1813:1: ( ( '};' ) )
            // InternalAdaptDsl.g:1814:1: ( '};' )
            {
            // InternalAdaptDsl.g:1814:1: ( '};' )
            // InternalAdaptDsl.g:1815:2: '};'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Services__Group__0"
    // InternalAdaptDsl.g:1825:1: rule__Services__Group__0 : rule__Services__Group__0__Impl rule__Services__Group__1 ;
    public final void rule__Services__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1829:1: ( rule__Services__Group__0__Impl rule__Services__Group__1 )
            // InternalAdaptDsl.g:1830:2: rule__Services__Group__0__Impl rule__Services__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Services__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Services__Group__1();

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
    // $ANTLR end "rule__Services__Group__0"


    // $ANTLR start "rule__Services__Group__0__Impl"
    // InternalAdaptDsl.g:1837:1: rule__Services__Group__0__Impl : ( ( rule__Services__ThisAssignment_0 ) ) ;
    public final void rule__Services__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1841:1: ( ( ( rule__Services__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:1842:1: ( ( rule__Services__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:1842:1: ( ( rule__Services__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:1843:2: ( rule__Services__ThisAssignment_0 )
            {
             before(grammarAccess.getServicesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:1844:2: ( rule__Services__ThisAssignment_0 )
            // InternalAdaptDsl.g:1844:3: rule__Services__ThisAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Services__ThisAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServicesAccess().getThisAssignment_0()); 

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
    // $ANTLR end "rule__Services__Group__0__Impl"


    // $ANTLR start "rule__Services__Group__1"
    // InternalAdaptDsl.g:1852:1: rule__Services__Group__1 : rule__Services__Group__1__Impl ;
    public final void rule__Services__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1856:1: ( rule__Services__Group__1__Impl )
            // InternalAdaptDsl.g:1857:2: rule__Services__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Services__Group__1__Impl();

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
    // $ANTLR end "rule__Services__Group__1"


    // $ANTLR start "rule__Services__Group__1__Impl"
    // InternalAdaptDsl.g:1863:1: rule__Services__Group__1__Impl : ( ( rule__Services__NextAssignment_1 )? ) ;
    public final void rule__Services__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1867:1: ( ( ( rule__Services__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:1868:1: ( ( rule__Services__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:1868:1: ( ( rule__Services__NextAssignment_1 )? )
            // InternalAdaptDsl.g:1869:2: ( rule__Services__NextAssignment_1 )?
            {
             before(grammarAccess.getServicesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:1870:2: ( rule__Services__NextAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdaptDsl.g:1870:3: rule__Services__NextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Services__NextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServicesAccess().getNextAssignment_1()); 

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
    // $ANTLR end "rule__Services__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalAdaptDsl.g:1879:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1883:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAdaptDsl.g:1884:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalAdaptDsl.g:1891:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1895:1: ( ( 'service' ) )
            // InternalAdaptDsl.g:1896:1: ( 'service' )
            {
            // InternalAdaptDsl.g:1896:1: ( 'service' )
            // InternalAdaptDsl.g:1897:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalAdaptDsl.g:1906:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1910:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAdaptDsl.g:1911:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalAdaptDsl.g:1918:1: rule__Service__Group__1__Impl : ( ( rule__Service__TypeAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1922:1: ( ( ( rule__Service__TypeAssignment_1 ) ) )
            // InternalAdaptDsl.g:1923:1: ( ( rule__Service__TypeAssignment_1 ) )
            {
            // InternalAdaptDsl.g:1923:1: ( ( rule__Service__TypeAssignment_1 ) )
            // InternalAdaptDsl.g:1924:2: ( rule__Service__TypeAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_1()); 
            // InternalAdaptDsl.g:1925:2: ( rule__Service__TypeAssignment_1 )
            // InternalAdaptDsl.g:1925:3: rule__Service__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalAdaptDsl.g:1933:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1937:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAdaptDsl.g:1938:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalAdaptDsl.g:1945:1: rule__Service__Group__2__Impl : ( 'from' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1949:1: ( ( 'from' ) )
            // InternalAdaptDsl.g:1950:1: ( 'from' )
            {
            // InternalAdaptDsl.g:1950:1: ( 'from' )
            // InternalAdaptDsl.g:1951:2: 'from'
            {
             before(grammarAccess.getServiceAccess().getFromKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalAdaptDsl.g:1960:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1964:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAdaptDsl.g:1965:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalAdaptDsl.g:1972:1: rule__Service__Group__3__Impl : ( ( rule__Service__LocAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1976:1: ( ( ( rule__Service__LocAssignment_3 ) ) )
            // InternalAdaptDsl.g:1977:1: ( ( rule__Service__LocAssignment_3 ) )
            {
            // InternalAdaptDsl.g:1977:1: ( ( rule__Service__LocAssignment_3 ) )
            // InternalAdaptDsl.g:1978:2: ( rule__Service__LocAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getLocAssignment_3()); 
            // InternalAdaptDsl.g:1979:2: ( rule__Service__LocAssignment_3 )
            // InternalAdaptDsl.g:1979:3: rule__Service__LocAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__LocAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getLocAssignment_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalAdaptDsl.g:1987:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1991:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAdaptDsl.g:1992:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalAdaptDsl.g:1999:1: rule__Service__Group__4__Impl : ( 'as' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2003:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:2004:1: ( 'as' )
            {
            // InternalAdaptDsl.g:2004:1: ( 'as' )
            // InternalAdaptDsl.g:2005:2: 'as'
            {
             before(grammarAccess.getServiceAccess().getAsKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getAsKeyword_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalAdaptDsl.g:2014:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2018:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAdaptDsl.g:2019:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalAdaptDsl.g:2026:1: rule__Service__Group__5__Impl : ( ( rule__Service__IdAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2030:1: ( ( ( rule__Service__IdAssignment_5 ) ) )
            // InternalAdaptDsl.g:2031:1: ( ( rule__Service__IdAssignment_5 ) )
            {
            // InternalAdaptDsl.g:2031:1: ( ( rule__Service__IdAssignment_5 ) )
            // InternalAdaptDsl.g:2032:2: ( rule__Service__IdAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getIdAssignment_5()); 
            // InternalAdaptDsl.g:2033:2: ( rule__Service__IdAssignment_5 )
            // InternalAdaptDsl.g:2033:3: rule__Service__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__IdAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getIdAssignment_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalAdaptDsl.g:2041:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2045:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAdaptDsl.g:2046:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalAdaptDsl.g:2053:1: rule__Service__Group__6__Impl : ( '{' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2057:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2058:1: ( '{' )
            {
            // InternalAdaptDsl.g:2058:1: ( '{' )
            // InternalAdaptDsl.g:2059:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalAdaptDsl.g:2068:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2072:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAdaptDsl.g:2073:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalAdaptDsl.g:2080:1: rule__Service__Group__7__Impl : ( ( rule__Service__FunctionsAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2084:1: ( ( ( rule__Service__FunctionsAssignment_7 ) ) )
            // InternalAdaptDsl.g:2085:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            {
            // InternalAdaptDsl.g:2085:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            // InternalAdaptDsl.g:2086:2: ( rule__Service__FunctionsAssignment_7 )
            {
             before(grammarAccess.getServiceAccess().getFunctionsAssignment_7()); 
            // InternalAdaptDsl.g:2087:2: ( rule__Service__FunctionsAssignment_7 )
            // InternalAdaptDsl.g:2087:3: rule__Service__FunctionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Service__FunctionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getFunctionsAssignment_7()); 

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
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalAdaptDsl.g:2095:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2099:1: ( rule__Service__Group__8__Impl )
            // InternalAdaptDsl.g:2100:2: rule__Service__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__8__Impl();

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalAdaptDsl.g:2106:1: rule__Service__Group__8__Impl : ( '};' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2110:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2111:1: ( '};' )
            {
            // InternalAdaptDsl.g:2111:1: ( '};' )
            // InternalAdaptDsl.g:2112:2: '};'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Functions__Group__0"
    // InternalAdaptDsl.g:2122:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2126:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalAdaptDsl.g:2127:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Functions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Functions__Group__1();

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
    // $ANTLR end "rule__Functions__Group__0"


    // $ANTLR start "rule__Functions__Group__0__Impl"
    // InternalAdaptDsl.g:2134:1: rule__Functions__Group__0__Impl : ( ( rule__Functions__ThisAssignment_0 ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2138:1: ( ( ( rule__Functions__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:2139:1: ( ( rule__Functions__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2139:1: ( ( rule__Functions__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:2140:2: ( rule__Functions__ThisAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:2141:2: ( rule__Functions__ThisAssignment_0 )
            // InternalAdaptDsl.g:2141:3: rule__Functions__ThisAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Functions__ThisAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionsAccess().getThisAssignment_0()); 

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
    // $ANTLR end "rule__Functions__Group__0__Impl"


    // $ANTLR start "rule__Functions__Group__1"
    // InternalAdaptDsl.g:2149:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2153:1: ( rule__Functions__Group__1__Impl )
            // InternalAdaptDsl.g:2154:2: rule__Functions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Functions__Group__1__Impl();

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
    // $ANTLR end "rule__Functions__Group__1"


    // $ANTLR start "rule__Functions__Group__1__Impl"
    // InternalAdaptDsl.g:2160:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__NextAssignment_1 )? ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2164:1: ( ( ( rule__Functions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:2165:1: ( ( rule__Functions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2165:1: ( ( rule__Functions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:2166:2: ( rule__Functions__NextAssignment_1 )?
            {
             before(grammarAccess.getFunctionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:2167:2: ( rule__Functions__NextAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptDsl.g:2167:3: rule__Functions__NextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Functions__NextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionsAccess().getNextAssignment_1()); 

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
    // $ANTLR end "rule__Functions__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalAdaptDsl.g:2176:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2180:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalAdaptDsl.g:2181:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptDsl.g:2188:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2192:1: ( ( 'function' ) )
            // InternalAdaptDsl.g:2193:1: ( 'function' )
            {
            // InternalAdaptDsl.g:2193:1: ( 'function' )
            // InternalAdaptDsl.g:2194:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

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
    // InternalAdaptDsl.g:2203:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2207:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalAdaptDsl.g:2208:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:2215:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2219:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:2220:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2220:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalAdaptDsl.g:2221:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:2222:2: ( rule__Function__NameAssignment_1 )
            // InternalAdaptDsl.g:2222:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // InternalAdaptDsl.g:2230:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2234:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalAdaptDsl.g:2235:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalAdaptDsl.g:2242:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2246:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:2247:1: ( 'as' )
            {
            // InternalAdaptDsl.g:2247:1: ( 'as' )
            // InternalAdaptDsl.g:2248:2: 'as'
            {
             before(grammarAccess.getFunctionAccess().getAsKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getAsKeyword_2()); 

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
    // InternalAdaptDsl.g:2257:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2261:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalAdaptDsl.g:2262:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // InternalAdaptDsl.g:2269:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2273:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalAdaptDsl.g:2274:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2274:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalAdaptDsl.g:2275:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalAdaptDsl.g:2276:2: ( rule__Function__IdAssignment_3 )
            // InternalAdaptDsl.g:2276:3: rule__Function__IdAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getIdAssignment_3()); 

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


    // $ANTLR start "rule__Function__Group__4"
    // InternalAdaptDsl.g:2284:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2288:1: ( rule__Function__Group__4__Impl )
            // InternalAdaptDsl.g:2289:2: rule__Function__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__4__Impl();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalAdaptDsl.g:2295:1: rule__Function__Group__4__Impl : ( ';' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2299:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2300:1: ( ';' )
            {
            // InternalAdaptDsl.g:2300:1: ( ';' )
            // InternalAdaptDsl.g:2301:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__0"
    // InternalAdaptDsl.g:2311:1: rule__AdaptationRule__Group__0 : rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 ;
    public final void rule__AdaptationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2315:1: ( rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 )
            // InternalAdaptDsl.g:2316:2: rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AdaptationRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__1();

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
    // $ANTLR end "rule__AdaptationRule__Group__0"


    // $ANTLR start "rule__AdaptationRule__Group__0__Impl"
    // InternalAdaptDsl.g:2323:1: rule__AdaptationRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AdaptationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2327:1: ( ( 'rule' ) )
            // InternalAdaptDsl.g:2328:1: ( 'rule' )
            {
            // InternalAdaptDsl.g:2328:1: ( 'rule' )
            // InternalAdaptDsl.g:2329:2: 'rule'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__0__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__1"
    // InternalAdaptDsl.g:2338:1: rule__AdaptationRule__Group__1 : rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 ;
    public final void rule__AdaptationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2342:1: ( rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 )
            // InternalAdaptDsl.g:2343:2: rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AdaptationRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__2();

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
    // $ANTLR end "rule__AdaptationRule__Group__1"


    // $ANTLR start "rule__AdaptationRule__Group__1__Impl"
    // InternalAdaptDsl.g:2350:1: rule__AdaptationRule__Group__1__Impl : ( ( rule__AdaptationRule__NameAssignment_1 ) ) ;
    public final void rule__AdaptationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2354:1: ( ( ( rule__AdaptationRule__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:2355:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2355:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            // InternalAdaptDsl.g:2356:2: ( rule__AdaptationRule__NameAssignment_1 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:2357:2: ( rule__AdaptationRule__NameAssignment_1 )
            // InternalAdaptDsl.g:2357:3: rule__AdaptationRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__1__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__2"
    // InternalAdaptDsl.g:2365:1: rule__AdaptationRule__Group__2 : rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 ;
    public final void rule__AdaptationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2369:1: ( rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 )
            // InternalAdaptDsl.g:2370:2: rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__AdaptationRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__3();

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
    // $ANTLR end "rule__AdaptationRule__Group__2"


    // $ANTLR start "rule__AdaptationRule__Group__2__Impl"
    // InternalAdaptDsl.g:2377:1: rule__AdaptationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AdaptationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2381:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2382:1: ( '{' )
            {
            // InternalAdaptDsl.g:2382:1: ( '{' )
            // InternalAdaptDsl.g:2383:2: '{'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__2__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__3"
    // InternalAdaptDsl.g:2392:1: rule__AdaptationRule__Group__3 : rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 ;
    public final void rule__AdaptationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2396:1: ( rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 )
            // InternalAdaptDsl.g:2397:2: rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__AdaptationRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__4();

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
    // $ANTLR end "rule__AdaptationRule__Group__3"


    // $ANTLR start "rule__AdaptationRule__Group__3__Impl"
    // InternalAdaptDsl.g:2404:1: rule__AdaptationRule__Group__3__Impl : ( 'LEVEL' ) ;
    public final void rule__AdaptationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2408:1: ( ( 'LEVEL' ) )
            // InternalAdaptDsl.g:2409:1: ( 'LEVEL' )
            {
            // InternalAdaptDsl.g:2409:1: ( 'LEVEL' )
            // InternalAdaptDsl.g:2410:2: 'LEVEL'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__3__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__4"
    // InternalAdaptDsl.g:2419:1: rule__AdaptationRule__Group__4 : rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 ;
    public final void rule__AdaptationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2423:1: ( rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 )
            // InternalAdaptDsl.g:2424:2: rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__AdaptationRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__5();

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
    // $ANTLR end "rule__AdaptationRule__Group__4"


    // $ANTLR start "rule__AdaptationRule__Group__4__Impl"
    // InternalAdaptDsl.g:2431:1: rule__AdaptationRule__Group__4__Impl : ( ( rule__AdaptationRule__LevelAssignment_4 ) ) ;
    public final void rule__AdaptationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2435:1: ( ( ( rule__AdaptationRule__LevelAssignment_4 ) ) )
            // InternalAdaptDsl.g:2436:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            {
            // InternalAdaptDsl.g:2436:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            // InternalAdaptDsl.g:2437:2: ( rule__AdaptationRule__LevelAssignment_4 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getLevelAssignment_4()); 
            // InternalAdaptDsl.g:2438:2: ( rule__AdaptationRule__LevelAssignment_4 )
            // InternalAdaptDsl.g:2438:3: rule__AdaptationRule__LevelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__LevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getLevelAssignment_4()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__4__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__5"
    // InternalAdaptDsl.g:2446:1: rule__AdaptationRule__Group__5 : rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 ;
    public final void rule__AdaptationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2450:1: ( rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 )
            // InternalAdaptDsl.g:2451:2: rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__AdaptationRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__6();

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
    // $ANTLR end "rule__AdaptationRule__Group__5"


    // $ANTLR start "rule__AdaptationRule__Group__5__Impl"
    // InternalAdaptDsl.g:2458:1: rule__AdaptationRule__Group__5__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2462:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2463:1: ( ';' )
            {
            // InternalAdaptDsl.g:2463:1: ( ';' )
            // InternalAdaptDsl.g:2464:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__5__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__6"
    // InternalAdaptDsl.g:2473:1: rule__AdaptationRule__Group__6 : rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 ;
    public final void rule__AdaptationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2477:1: ( rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 )
            // InternalAdaptDsl.g:2478:2: rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__AdaptationRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__7();

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
    // $ANTLR end "rule__AdaptationRule__Group__6"


    // $ANTLR start "rule__AdaptationRule__Group__6__Impl"
    // InternalAdaptDsl.g:2485:1: rule__AdaptationRule__Group__6__Impl : ( 'FACT' ) ;
    public final void rule__AdaptationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2489:1: ( ( 'FACT' ) )
            // InternalAdaptDsl.g:2490:1: ( 'FACT' )
            {
            // InternalAdaptDsl.g:2490:1: ( 'FACT' )
            // InternalAdaptDsl.g:2491:2: 'FACT'
            {
             before(grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__6__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__7"
    // InternalAdaptDsl.g:2500:1: rule__AdaptationRule__Group__7 : rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 ;
    public final void rule__AdaptationRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2504:1: ( rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 )
            // InternalAdaptDsl.g:2505:2: rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__AdaptationRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__8();

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
    // $ANTLR end "rule__AdaptationRule__Group__7"


    // $ANTLR start "rule__AdaptationRule__Group__7__Impl"
    // InternalAdaptDsl.g:2512:1: rule__AdaptationRule__Group__7__Impl : ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) ;
    public final void rule__AdaptationRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2516:1: ( ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) )
            // InternalAdaptDsl.g:2517:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            {
            // InternalAdaptDsl.g:2517:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            // InternalAdaptDsl.g:2518:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_7()); 
            // InternalAdaptDsl.g:2519:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            // InternalAdaptDsl.g:2519:3: rule__AdaptationRule__FactTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__FactTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_7()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__7__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__8"
    // InternalAdaptDsl.g:2527:1: rule__AdaptationRule__Group__8 : rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 ;
    public final void rule__AdaptationRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2531:1: ( rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 )
            // InternalAdaptDsl.g:2532:2: rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__AdaptationRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__9();

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
    // $ANTLR end "rule__AdaptationRule__Group__8"


    // $ANTLR start "rule__AdaptationRule__Group__8__Impl"
    // InternalAdaptDsl.g:2539:1: rule__AdaptationRule__Group__8__Impl : ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) ;
    public final void rule__AdaptationRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2543:1: ( ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) )
            // InternalAdaptDsl.g:2544:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            {
            // InternalAdaptDsl.g:2544:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            // InternalAdaptDsl.g:2545:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_8()); 
            // InternalAdaptDsl.g:2546:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            // InternalAdaptDsl.g:2546:3: rule__AdaptationRule__FactNameAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__FactNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_8()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__8__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__9"
    // InternalAdaptDsl.g:2554:1: rule__AdaptationRule__Group__9 : rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 ;
    public final void rule__AdaptationRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2558:1: ( rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 )
            // InternalAdaptDsl.g:2559:2: rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__AdaptationRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__10();

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
    // $ANTLR end "rule__AdaptationRule__Group__9"


    // $ANTLR start "rule__AdaptationRule__Group__9__Impl"
    // InternalAdaptDsl.g:2566:1: rule__AdaptationRule__Group__9__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2570:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2571:1: ( ';' )
            {
            // InternalAdaptDsl.g:2571:1: ( ';' )
            // InternalAdaptDsl.g:2572:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__9__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__10"
    // InternalAdaptDsl.g:2581:1: rule__AdaptationRule__Group__10 : rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 ;
    public final void rule__AdaptationRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2585:1: ( rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 )
            // InternalAdaptDsl.g:2586:2: rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__AdaptationRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__11();

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
    // $ANTLR end "rule__AdaptationRule__Group__10"


    // $ANTLR start "rule__AdaptationRule__Group__10__Impl"
    // InternalAdaptDsl.g:2593:1: rule__AdaptationRule__Group__10__Impl : ( 'IF' ) ;
    public final void rule__AdaptationRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2597:1: ( ( 'IF' ) )
            // InternalAdaptDsl.g:2598:1: ( 'IF' )
            {
            // InternalAdaptDsl.g:2598:1: ( 'IF' )
            // InternalAdaptDsl.g:2599:2: 'IF'
            {
             before(grammarAccess.getAdaptationRuleAccess().getIFKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getIFKeyword_10()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__10__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__11"
    // InternalAdaptDsl.g:2608:1: rule__AdaptationRule__Group__11 : rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 ;
    public final void rule__AdaptationRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2612:1: ( rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 )
            // InternalAdaptDsl.g:2613:2: rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__AdaptationRule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__12();

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
    // $ANTLR end "rule__AdaptationRule__Group__11"


    // $ANTLR start "rule__AdaptationRule__Group__11__Impl"
    // InternalAdaptDsl.g:2620:1: rule__AdaptationRule__Group__11__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2624:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2625:1: ( '(' )
            {
            // InternalAdaptDsl.g:2625:1: ( '(' )
            // InternalAdaptDsl.g:2626:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__11__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__12"
    // InternalAdaptDsl.g:2635:1: rule__AdaptationRule__Group__12 : rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 ;
    public final void rule__AdaptationRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2639:1: ( rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 )
            // InternalAdaptDsl.g:2640:2: rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13
            {
            pushFollow(FOLLOW_20);
            rule__AdaptationRule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__13();

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
    // $ANTLR end "rule__AdaptationRule__Group__12"


    // $ANTLR start "rule__AdaptationRule__Group__12__Impl"
    // InternalAdaptDsl.g:2647:1: rule__AdaptationRule__Group__12__Impl : ( ( rule__AdaptationRule__ExprAssignment_12 ) ) ;
    public final void rule__AdaptationRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2651:1: ( ( ( rule__AdaptationRule__ExprAssignment_12 ) ) )
            // InternalAdaptDsl.g:2652:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            {
            // InternalAdaptDsl.g:2652:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            // InternalAdaptDsl.g:2653:2: ( rule__AdaptationRule__ExprAssignment_12 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprAssignment_12()); 
            // InternalAdaptDsl.g:2654:2: ( rule__AdaptationRule__ExprAssignment_12 )
            // InternalAdaptDsl.g:2654:3: rule__AdaptationRule__ExprAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__ExprAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getExprAssignment_12()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__12__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__13"
    // InternalAdaptDsl.g:2662:1: rule__AdaptationRule__Group__13 : rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 ;
    public final void rule__AdaptationRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2666:1: ( rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 )
            // InternalAdaptDsl.g:2667:2: rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__AdaptationRule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__14();

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
    // $ANTLR end "rule__AdaptationRule__Group__13"


    // $ANTLR start "rule__AdaptationRule__Group__13__Impl"
    // InternalAdaptDsl.g:2674:1: rule__AdaptationRule__Group__13__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2678:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2679:1: ( ')' )
            {
            // InternalAdaptDsl.g:2679:1: ( ')' )
            // InternalAdaptDsl.g:2680:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__13__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__14"
    // InternalAdaptDsl.g:2689:1: rule__AdaptationRule__Group__14 : rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 ;
    public final void rule__AdaptationRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2693:1: ( rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 )
            // InternalAdaptDsl.g:2694:2: rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__AdaptationRule__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__15();

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
    // $ANTLR end "rule__AdaptationRule__Group__14"


    // $ANTLR start "rule__AdaptationRule__Group__14__Impl"
    // InternalAdaptDsl.g:2701:1: rule__AdaptationRule__Group__14__Impl : ( 'THEN' ) ;
    public final void rule__AdaptationRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2705:1: ( ( 'THEN' ) )
            // InternalAdaptDsl.g:2706:1: ( 'THEN' )
            {
            // InternalAdaptDsl.g:2706:1: ( 'THEN' )
            // InternalAdaptDsl.g:2707:2: 'THEN'
            {
             before(grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__14__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__15"
    // InternalAdaptDsl.g:2716:1: rule__AdaptationRule__Group__15 : rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 ;
    public final void rule__AdaptationRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2720:1: ( rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 )
            // InternalAdaptDsl.g:2721:2: rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16
            {
            pushFollow(FOLLOW_22);
            rule__AdaptationRule__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__16();

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
    // $ANTLR end "rule__AdaptationRule__Group__15"


    // $ANTLR start "rule__AdaptationRule__Group__15__Impl"
    // InternalAdaptDsl.g:2728:1: rule__AdaptationRule__Group__15__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2732:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2733:1: ( '(' )
            {
            // InternalAdaptDsl.g:2733:1: ( '(' )
            // InternalAdaptDsl.g:2734:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__15__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__16"
    // InternalAdaptDsl.g:2743:1: rule__AdaptationRule__Group__16 : rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 ;
    public final void rule__AdaptationRule__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2747:1: ( rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 )
            // InternalAdaptDsl.g:2748:2: rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17
            {
            pushFollow(FOLLOW_20);
            rule__AdaptationRule__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__17();

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
    // $ANTLR end "rule__AdaptationRule__Group__16"


    // $ANTLR start "rule__AdaptationRule__Group__16__Impl"
    // InternalAdaptDsl.g:2755:1: rule__AdaptationRule__Group__16__Impl : ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) ;
    public final void rule__AdaptationRule__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2759:1: ( ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) )
            // InternalAdaptDsl.g:2760:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            {
            // InternalAdaptDsl.g:2760:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            // InternalAdaptDsl.g:2761:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_16()); 
            // InternalAdaptDsl.g:2762:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            // InternalAdaptDsl.g:2762:3: rule__AdaptationRule__ActionCollectionAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__ActionCollectionAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_16()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__16__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__17"
    // InternalAdaptDsl.g:2770:1: rule__AdaptationRule__Group__17 : rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 ;
    public final void rule__AdaptationRule__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2774:1: ( rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 )
            // InternalAdaptDsl.g:2775:2: rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__AdaptationRule__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__18();

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
    // $ANTLR end "rule__AdaptationRule__Group__17"


    // $ANTLR start "rule__AdaptationRule__Group__17__Impl"
    // InternalAdaptDsl.g:2782:1: rule__AdaptationRule__Group__17__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2786:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2787:1: ( ')' )
            {
            // InternalAdaptDsl.g:2787:1: ( ')' )
            // InternalAdaptDsl.g:2788:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__17__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__18"
    // InternalAdaptDsl.g:2797:1: rule__AdaptationRule__Group__18 : rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 ;
    public final void rule__AdaptationRule__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2801:1: ( rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 )
            // InternalAdaptDsl.g:2802:2: rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19
            {
            pushFollow(FOLLOW_23);
            rule__AdaptationRule__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__19();

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
    // $ANTLR end "rule__AdaptationRule__Group__18"


    // $ANTLR start "rule__AdaptationRule__Group__18__Impl"
    // InternalAdaptDsl.g:2809:1: rule__AdaptationRule__Group__18__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2813:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2814:1: ( ';' )
            {
            // InternalAdaptDsl.g:2814:1: ( ';' )
            // InternalAdaptDsl.g:2815:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__18__Impl"


    // $ANTLR start "rule__AdaptationRule__Group__19"
    // InternalAdaptDsl.g:2824:1: rule__AdaptationRule__Group__19 : rule__AdaptationRule__Group__19__Impl ;
    public final void rule__AdaptationRule__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2828:1: ( rule__AdaptationRule__Group__19__Impl )
            // InternalAdaptDsl.g:2829:2: rule__AdaptationRule__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__19__Impl();

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
    // $ANTLR end "rule__AdaptationRule__Group__19"


    // $ANTLR start "rule__AdaptationRule__Group__19__Impl"
    // InternalAdaptDsl.g:2835:1: rule__AdaptationRule__Group__19__Impl : ( '}' ) ;
    public final void rule__AdaptationRule__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2839:1: ( ( '}' ) )
            // InternalAdaptDsl.g:2840:1: ( '}' )
            {
            // InternalAdaptDsl.g:2840:1: ( '}' )
            // InternalAdaptDsl.g:2841:2: '}'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_19()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__AdaptationRule__Group__19__Impl"


    // $ANTLR start "rule__ConditionalOR__Group__0"
    // InternalAdaptDsl.g:2851:1: rule__ConditionalOR__Group__0 : rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 ;
    public final void rule__ConditionalOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2855:1: ( rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 )
            // InternalAdaptDsl.g:2856:2: rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ConditionalOR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalOR__Group__1();

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
    // $ANTLR end "rule__ConditionalOR__Group__0"


    // $ANTLR start "rule__ConditionalOR__Group__0__Impl"
    // InternalAdaptDsl.g:2863:1: rule__ConditionalOR__Group__0__Impl : ( ( rule__ConditionalOR__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2867:1: ( ( ( rule__ConditionalOR__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:2868:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2868:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:2869:2: ( rule__ConditionalOR__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalORAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:2870:2: ( rule__ConditionalOR__LeftAssignment_0 )
            // InternalAdaptDsl.g:2870:3: rule__ConditionalOR__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOR__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalORAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__ConditionalOR__Group__0__Impl"


    // $ANTLR start "rule__ConditionalOR__Group__1"
    // InternalAdaptDsl.g:2878:1: rule__ConditionalOR__Group__1 : rule__ConditionalOR__Group__1__Impl ;
    public final void rule__ConditionalOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2882:1: ( rule__ConditionalOR__Group__1__Impl )
            // InternalAdaptDsl.g:2883:2: rule__ConditionalOR__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOR__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionalOR__Group__1"


    // $ANTLR start "rule__ConditionalOR__Group__1__Impl"
    // InternalAdaptDsl.g:2889:1: rule__ConditionalOR__Group__1__Impl : ( ( rule__ConditionalOR__Group_1__0 )? ) ;
    public final void rule__ConditionalOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2893:1: ( ( ( rule__ConditionalOR__Group_1__0 )? ) )
            // InternalAdaptDsl.g:2894:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:2894:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            // InternalAdaptDsl.g:2895:2: ( rule__ConditionalOR__Group_1__0 )?
            {
             before(grammarAccess.getConditionalORAccess().getGroup_1()); 
            // InternalAdaptDsl.g:2896:2: ( rule__ConditionalOR__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdaptDsl.g:2896:3: rule__ConditionalOR__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalOR__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalORAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionalOR__Group__1__Impl"


    // $ANTLR start "rule__ConditionalOR__Group_1__0"
    // InternalAdaptDsl.g:2905:1: rule__ConditionalOR__Group_1__0 : rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 ;
    public final void rule__ConditionalOR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2909:1: ( rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 )
            // InternalAdaptDsl.g:2910:2: rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ConditionalOR__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalOR__Group_1__1();

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
    // $ANTLR end "rule__ConditionalOR__Group_1__0"


    // $ANTLR start "rule__ConditionalOR__Group_1__0__Impl"
    // InternalAdaptDsl.g:2917:1: rule__ConditionalOR__Group_1__0__Impl : ( '||' ) ;
    public final void rule__ConditionalOR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2921:1: ( ( '||' ) )
            // InternalAdaptDsl.g:2922:1: ( '||' )
            {
            // InternalAdaptDsl.g:2922:1: ( '||' )
            // InternalAdaptDsl.g:2923:2: '||'
            {
             before(grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0()); 

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
    // $ANTLR end "rule__ConditionalOR__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalOR__Group_1__1"
    // InternalAdaptDsl.g:2932:1: rule__ConditionalOR__Group_1__1 : rule__ConditionalOR__Group_1__1__Impl ;
    public final void rule__ConditionalOR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2936:1: ( rule__ConditionalOR__Group_1__1__Impl )
            // InternalAdaptDsl.g:2937:2: rule__ConditionalOR__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOR__Group_1__1__Impl();

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
    // $ANTLR end "rule__ConditionalOR__Group_1__1"


    // $ANTLR start "rule__ConditionalOR__Group_1__1__Impl"
    // InternalAdaptDsl.g:2943:1: rule__ConditionalOR__Group_1__1__Impl : ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalOR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2947:1: ( ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:2948:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:2948:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:2949:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalORAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:2950:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            // InternalAdaptDsl.g:2950:3: rule__ConditionalOR__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalOR__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalORAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__ConditionalOR__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalAND__Group__0"
    // InternalAdaptDsl.g:2959:1: rule__ConditionalAND__Group__0 : rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 ;
    public final void rule__ConditionalAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2963:1: ( rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 )
            // InternalAdaptDsl.g:2964:2: rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ConditionalAND__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalAND__Group__1();

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
    // $ANTLR end "rule__ConditionalAND__Group__0"


    // $ANTLR start "rule__ConditionalAND__Group__0__Impl"
    // InternalAdaptDsl.g:2971:1: rule__ConditionalAND__Group__0__Impl : ( ( rule__ConditionalAND__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2975:1: ( ( ( rule__ConditionalAND__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:2976:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2976:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:2977:2: ( rule__ConditionalAND__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalANDAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:2978:2: ( rule__ConditionalAND__LeftAssignment_0 )
            // InternalAdaptDsl.g:2978:3: rule__ConditionalAND__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAND__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalANDAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__ConditionalAND__Group__0__Impl"


    // $ANTLR start "rule__ConditionalAND__Group__1"
    // InternalAdaptDsl.g:2986:1: rule__ConditionalAND__Group__1 : rule__ConditionalAND__Group__1__Impl ;
    public final void rule__ConditionalAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2990:1: ( rule__ConditionalAND__Group__1__Impl )
            // InternalAdaptDsl.g:2991:2: rule__ConditionalAND__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAND__Group__1__Impl();

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
    // $ANTLR end "rule__ConditionalAND__Group__1"


    // $ANTLR start "rule__ConditionalAND__Group__1__Impl"
    // InternalAdaptDsl.g:2997:1: rule__ConditionalAND__Group__1__Impl : ( ( rule__ConditionalAND__Group_1__0 )? ) ;
    public final void rule__ConditionalAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3001:1: ( ( ( rule__ConditionalAND__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3002:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3002:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            // InternalAdaptDsl.g:3003:2: ( rule__ConditionalAND__Group_1__0 )?
            {
             before(grammarAccess.getConditionalANDAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3004:2: ( rule__ConditionalAND__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptDsl.g:3004:3: rule__ConditionalAND__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionalAND__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalANDAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ConditionalAND__Group__1__Impl"


    // $ANTLR start "rule__ConditionalAND__Group_1__0"
    // InternalAdaptDsl.g:3013:1: rule__ConditionalAND__Group_1__0 : rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 ;
    public final void rule__ConditionalAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3017:1: ( rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 )
            // InternalAdaptDsl.g:3018:2: rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ConditionalAND__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionalAND__Group_1__1();

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
    // $ANTLR end "rule__ConditionalAND__Group_1__0"


    // $ANTLR start "rule__ConditionalAND__Group_1__0__Impl"
    // InternalAdaptDsl.g:3025:1: rule__ConditionalAND__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__ConditionalAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3029:1: ( ( '&&' ) )
            // InternalAdaptDsl.g:3030:1: ( '&&' )
            {
            // InternalAdaptDsl.g:3030:1: ( '&&' )
            // InternalAdaptDsl.g:3031:2: '&&'
            {
             before(grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0()); 

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
    // $ANTLR end "rule__ConditionalAND__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalAND__Group_1__1"
    // InternalAdaptDsl.g:3040:1: rule__ConditionalAND__Group_1__1 : rule__ConditionalAND__Group_1__1__Impl ;
    public final void rule__ConditionalAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3044:1: ( rule__ConditionalAND__Group_1__1__Impl )
            // InternalAdaptDsl.g:3045:2: rule__ConditionalAND__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAND__Group_1__1__Impl();

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
    // $ANTLR end "rule__ConditionalAND__Group_1__1"


    // $ANTLR start "rule__ConditionalAND__Group_1__1__Impl"
    // InternalAdaptDsl.g:3051:1: rule__ConditionalAND__Group_1__1__Impl : ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3055:1: ( ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3056:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3056:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3057:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalANDAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3058:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3058:3: rule__ConditionalAND__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ConditionalAND__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalANDAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__ConditionalAND__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanCondition__Group_0__0"
    // InternalAdaptDsl.g:3067:1: rule__BooleanCondition__Group_0__0 : rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 ;
    public final void rule__BooleanCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3071:1: ( rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 )
            // InternalAdaptDsl.g:3072:2: rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__BooleanCondition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanCondition__Group_0__1();

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
    // $ANTLR end "rule__BooleanCondition__Group_0__0"


    // $ANTLR start "rule__BooleanCondition__Group_0__0__Impl"
    // InternalAdaptDsl.g:3079:1: rule__BooleanCondition__Group_0__0__Impl : ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) ;
    public final void rule__BooleanCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3083:1: ( ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) )
            // InternalAdaptDsl.g:3084:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            {
            // InternalAdaptDsl.g:3084:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            // InternalAdaptDsl.g:3085:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getFactAssignment_0_0()); 
            // InternalAdaptDsl.g:3086:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            // InternalAdaptDsl.g:3086:3: rule__BooleanCondition__FactAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanCondition__FactAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getFactAssignment_0_0()); 

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
    // $ANTLR end "rule__BooleanCondition__Group_0__0__Impl"


    // $ANTLR start "rule__BooleanCondition__Group_0__1"
    // InternalAdaptDsl.g:3094:1: rule__BooleanCondition__Group_0__1 : rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 ;
    public final void rule__BooleanCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3098:1: ( rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 )
            // InternalAdaptDsl.g:3099:2: rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__BooleanCondition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanCondition__Group_0__2();

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
    // $ANTLR end "rule__BooleanCondition__Group_0__1"


    // $ANTLR start "rule__BooleanCondition__Group_0__1__Impl"
    // InternalAdaptDsl.g:3106:1: rule__BooleanCondition__Group_0__1__Impl : ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) ;
    public final void rule__BooleanCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3110:1: ( ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) )
            // InternalAdaptDsl.g:3111:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            {
            // InternalAdaptDsl.g:3111:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            // InternalAdaptDsl.g:3112:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getBooleanConditionAccess().getOpAssignment_0_1()); 
            // InternalAdaptDsl.g:3113:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            // InternalAdaptDsl.g:3113:3: rule__BooleanCondition__OpAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanCondition__OpAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getOpAssignment_0_1()); 

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
    // $ANTLR end "rule__BooleanCondition__Group_0__1__Impl"


    // $ANTLR start "rule__BooleanCondition__Group_0__2"
    // InternalAdaptDsl.g:3121:1: rule__BooleanCondition__Group_0__2 : rule__BooleanCondition__Group_0__2__Impl ;
    public final void rule__BooleanCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3125:1: ( rule__BooleanCondition__Group_0__2__Impl )
            // InternalAdaptDsl.g:3126:2: rule__BooleanCondition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanCondition__Group_0__2__Impl();

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
    // $ANTLR end "rule__BooleanCondition__Group_0__2"


    // $ANTLR start "rule__BooleanCondition__Group_0__2__Impl"
    // InternalAdaptDsl.g:3132:1: rule__BooleanCondition__Group_0__2__Impl : ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) ;
    public final void rule__BooleanCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3136:1: ( ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) )
            // InternalAdaptDsl.g:3137:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            {
            // InternalAdaptDsl.g:3137:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            // InternalAdaptDsl.g:3138:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            {
             before(grammarAccess.getBooleanConditionAccess().getValAssignment_0_2()); 
            // InternalAdaptDsl.g:3139:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            // InternalAdaptDsl.g:3139:3: rule__BooleanCondition__ValAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanCondition__ValAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanConditionAccess().getValAssignment_0_2()); 

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
    // $ANTLR end "rule__BooleanCondition__Group_0__2__Impl"


    // $ANTLR start "rule__NumberCondition__Group__0"
    // InternalAdaptDsl.g:3148:1: rule__NumberCondition__Group__0 : rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 ;
    public final void rule__NumberCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3152:1: ( rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 )
            // InternalAdaptDsl.g:3153:2: rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__NumberCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberCondition__Group__1();

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
    // $ANTLR end "rule__NumberCondition__Group__0"


    // $ANTLR start "rule__NumberCondition__Group__0__Impl"
    // InternalAdaptDsl.g:3160:1: rule__NumberCondition__Group__0__Impl : ( ( rule__NumberCondition__FactAssignment_0 ) ) ;
    public final void rule__NumberCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3164:1: ( ( ( rule__NumberCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:3165:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3165:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:3166:2: ( rule__NumberCondition__FactAssignment_0 )
            {
             before(grammarAccess.getNumberConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:3167:2: ( rule__NumberCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:3167:3: rule__NumberCondition__FactAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberCondition__FactAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberConditionAccess().getFactAssignment_0()); 

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
    // $ANTLR end "rule__NumberCondition__Group__0__Impl"


    // $ANTLR start "rule__NumberCondition__Group__1"
    // InternalAdaptDsl.g:3175:1: rule__NumberCondition__Group__1 : rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 ;
    public final void rule__NumberCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3179:1: ( rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 )
            // InternalAdaptDsl.g:3180:2: rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__NumberCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberCondition__Group__2();

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
    // $ANTLR end "rule__NumberCondition__Group__1"


    // $ANTLR start "rule__NumberCondition__Group__1__Impl"
    // InternalAdaptDsl.g:3187:1: rule__NumberCondition__Group__1__Impl : ( ( rule__NumberCondition__OpAssignment_1 ) ) ;
    public final void rule__NumberCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3191:1: ( ( ( rule__NumberCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:3192:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3192:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:3193:2: ( rule__NumberCondition__OpAssignment_1 )
            {
             before(grammarAccess.getNumberConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:3194:2: ( rule__NumberCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:3194:3: rule__NumberCondition__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberCondition__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberConditionAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__NumberCondition__Group__1__Impl"


    // $ANTLR start "rule__NumberCondition__Group__2"
    // InternalAdaptDsl.g:3202:1: rule__NumberCondition__Group__2 : rule__NumberCondition__Group__2__Impl ;
    public final void rule__NumberCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3206:1: ( rule__NumberCondition__Group__2__Impl )
            // InternalAdaptDsl.g:3207:2: rule__NumberCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberCondition__Group__2__Impl();

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
    // $ANTLR end "rule__NumberCondition__Group__2"


    // $ANTLR start "rule__NumberCondition__Group__2__Impl"
    // InternalAdaptDsl.g:3213:1: rule__NumberCondition__Group__2__Impl : ( ( rule__NumberCondition__ValAssignment_2 ) ) ;
    public final void rule__NumberCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3217:1: ( ( ( rule__NumberCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:3218:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:3218:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:3219:2: ( rule__NumberCondition__ValAssignment_2 )
            {
             before(grammarAccess.getNumberConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:3220:2: ( rule__NumberCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:3220:3: rule__NumberCondition__ValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumberCondition__ValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberConditionAccess().getValAssignment_2()); 

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
    // $ANTLR end "rule__NumberCondition__Group__2__Impl"


    // $ANTLR start "rule__StringCondition__Group__0"
    // InternalAdaptDsl.g:3229:1: rule__StringCondition__Group__0 : rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 ;
    public final void rule__StringCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3233:1: ( rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 )
            // InternalAdaptDsl.g:3234:2: rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__StringCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringCondition__Group__1();

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
    // $ANTLR end "rule__StringCondition__Group__0"


    // $ANTLR start "rule__StringCondition__Group__0__Impl"
    // InternalAdaptDsl.g:3241:1: rule__StringCondition__Group__0__Impl : ( ( rule__StringCondition__FactAssignment_0 ) ) ;
    public final void rule__StringCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3245:1: ( ( ( rule__StringCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:3246:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3246:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:3247:2: ( rule__StringCondition__FactAssignment_0 )
            {
             before(grammarAccess.getStringConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:3248:2: ( rule__StringCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:3248:3: rule__StringCondition__FactAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringCondition__FactAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringConditionAccess().getFactAssignment_0()); 

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
    // $ANTLR end "rule__StringCondition__Group__0__Impl"


    // $ANTLR start "rule__StringCondition__Group__1"
    // InternalAdaptDsl.g:3256:1: rule__StringCondition__Group__1 : rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 ;
    public final void rule__StringCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3260:1: ( rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 )
            // InternalAdaptDsl.g:3261:2: rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StringCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringCondition__Group__2();

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
    // $ANTLR end "rule__StringCondition__Group__1"


    // $ANTLR start "rule__StringCondition__Group__1__Impl"
    // InternalAdaptDsl.g:3268:1: rule__StringCondition__Group__1__Impl : ( ( rule__StringCondition__OpAssignment_1 ) ) ;
    public final void rule__StringCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3272:1: ( ( ( rule__StringCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:3273:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3273:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:3274:2: ( rule__StringCondition__OpAssignment_1 )
            {
             before(grammarAccess.getStringConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:3275:2: ( rule__StringCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:3275:3: rule__StringCondition__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringCondition__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringConditionAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__StringCondition__Group__1__Impl"


    // $ANTLR start "rule__StringCondition__Group__2"
    // InternalAdaptDsl.g:3283:1: rule__StringCondition__Group__2 : rule__StringCondition__Group__2__Impl ;
    public final void rule__StringCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3287:1: ( rule__StringCondition__Group__2__Impl )
            // InternalAdaptDsl.g:3288:2: rule__StringCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringCondition__Group__2__Impl();

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
    // $ANTLR end "rule__StringCondition__Group__2"


    // $ANTLR start "rule__StringCondition__Group__2__Impl"
    // InternalAdaptDsl.g:3294:1: rule__StringCondition__Group__2__Impl : ( ( rule__StringCondition__ValAssignment_2 ) ) ;
    public final void rule__StringCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3298:1: ( ( ( rule__StringCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:3299:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:3299:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:3300:2: ( rule__StringCondition__ValAssignment_2 )
            {
             before(grammarAccess.getStringConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:3301:2: ( rule__StringCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:3301:3: rule__StringCondition__ValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringCondition__ValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringConditionAccess().getValAssignment_2()); 

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
    // $ANTLR end "rule__StringCondition__Group__2__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // InternalAdaptDsl.g:3310:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3314:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalAdaptDsl.g:3315:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__1();

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
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // InternalAdaptDsl.g:3322:1: rule__Fact__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3326:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3327:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3327:1: ( RULE_ID )
            // InternalAdaptDsl.g:3328:2: RULE_ID
            {
             before(grammarAccess.getFactAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // InternalAdaptDsl.g:3337:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3341:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // InternalAdaptDsl.g:3342:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Fact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__2();

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
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // InternalAdaptDsl.g:3349:1: rule__Fact__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3353:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:3354:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:3354:1: ( ( '()' )? )
            // InternalAdaptDsl.g:3355:2: ( '()' )?
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:3356:2: ( '()' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptDsl.g:3356:3: '()'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__2"
    // InternalAdaptDsl.g:3364:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3368:1: ( rule__Fact__Group__2__Impl )
            // InternalAdaptDsl.g:3369:2: rule__Fact__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__2__Impl();

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
    // $ANTLR end "rule__Fact__Group__2"


    // $ANTLR start "rule__Fact__Group__2__Impl"
    // InternalAdaptDsl.g:3375:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__Group_2__0 )* ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3379:1: ( ( ( rule__Fact__Group_2__0 )* ) )
            // InternalAdaptDsl.g:3380:1: ( ( rule__Fact__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:3380:1: ( ( rule__Fact__Group_2__0 )* )
            // InternalAdaptDsl.g:3381:2: ( rule__Fact__Group_2__0 )*
            {
             before(grammarAccess.getFactAccess().getGroup_2()); 
            // InternalAdaptDsl.g:3382:2: ( rule__Fact__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAdaptDsl.g:3382:3: rule__Fact__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Fact__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFactAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Fact__Group__2__Impl"


    // $ANTLR start "rule__Fact__Group_2__0"
    // InternalAdaptDsl.g:3391:1: rule__Fact__Group_2__0 : rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 ;
    public final void rule__Fact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3395:1: ( rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 )
            // InternalAdaptDsl.g:3396:2: rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Fact__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group_2__1();

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
    // $ANTLR end "rule__Fact__Group_2__0"


    // $ANTLR start "rule__Fact__Group_2__0__Impl"
    // InternalAdaptDsl.g:3403:1: rule__Fact__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Fact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3407:1: ( ( '.' ) )
            // InternalAdaptDsl.g:3408:1: ( '.' )
            {
            // InternalAdaptDsl.g:3408:1: ( '.' )
            // InternalAdaptDsl.g:3409:2: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__Fact__Group_2__0__Impl"


    // $ANTLR start "rule__Fact__Group_2__1"
    // InternalAdaptDsl.g:3418:1: rule__Fact__Group_2__1 : rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2 ;
    public final void rule__Fact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3422:1: ( rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2 )
            // InternalAdaptDsl.g:3423:2: rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2
            {
            pushFollow(FOLLOW_32);
            rule__Fact__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group_2__2();

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
    // $ANTLR end "rule__Fact__Group_2__1"


    // $ANTLR start "rule__Fact__Group_2__1__Impl"
    // InternalAdaptDsl.g:3430:1: rule__Fact__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Fact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3434:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3435:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3435:1: ( RULE_ID )
            // InternalAdaptDsl.g:3436:2: RULE_ID
            {
             before(grammarAccess.getFactAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Fact__Group_2__1__Impl"


    // $ANTLR start "rule__Fact__Group_2__2"
    // InternalAdaptDsl.g:3445:1: rule__Fact__Group_2__2 : rule__Fact__Group_2__2__Impl ;
    public final void rule__Fact__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3449:1: ( rule__Fact__Group_2__2__Impl )
            // InternalAdaptDsl.g:3450:2: rule__Fact__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group_2__2__Impl();

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
    // $ANTLR end "rule__Fact__Group_2__2"


    // $ANTLR start "rule__Fact__Group_2__2__Impl"
    // InternalAdaptDsl.g:3456:1: rule__Fact__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__Fact__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3460:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:3461:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:3461:1: ( ( '()' )? )
            // InternalAdaptDsl.g:3462:2: ( '()' )?
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:3463:2: ( '()' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdaptDsl.g:3463:3: '()'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Fact__Group_2__2__Impl"


    // $ANTLR start "rule__FactProperty__Group__0"
    // InternalAdaptDsl.g:3472:1: rule__FactProperty__Group__0 : rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 ;
    public final void rule__FactProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3476:1: ( rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 )
            // InternalAdaptDsl.g:3477:2: rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FactProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__1();

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
    // $ANTLR end "rule__FactProperty__Group__0"


    // $ANTLR start "rule__FactProperty__Group__0__Impl"
    // InternalAdaptDsl.g:3484:1: rule__FactProperty__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3488:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3489:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3489:1: ( RULE_ID )
            // InternalAdaptDsl.g:3490:2: RULE_ID
            {
             before(grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FactProperty__Group__0__Impl"


    // $ANTLR start "rule__FactProperty__Group__1"
    // InternalAdaptDsl.g:3499:1: rule__FactProperty__Group__1 : rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 ;
    public final void rule__FactProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3503:1: ( rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 )
            // InternalAdaptDsl.g:3504:2: rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__FactProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__2();

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
    // $ANTLR end "rule__FactProperty__Group__1"


    // $ANTLR start "rule__FactProperty__Group__1__Impl"
    // InternalAdaptDsl.g:3511:1: rule__FactProperty__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3515:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:3516:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:3516:1: ( ( '()' )? )
            // InternalAdaptDsl.g:3517:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:3518:2: ( '()' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:3518:3: '()'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FactProperty__Group__1__Impl"


    // $ANTLR start "rule__FactProperty__Group__2"
    // InternalAdaptDsl.g:3526:1: rule__FactProperty__Group__2 : rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 ;
    public final void rule__FactProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3530:1: ( rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 )
            // InternalAdaptDsl.g:3531:2: rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__FactProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__3();

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
    // $ANTLR end "rule__FactProperty__Group__2"


    // $ANTLR start "rule__FactProperty__Group__2__Impl"
    // InternalAdaptDsl.g:3538:1: rule__FactProperty__Group__2__Impl : ( ( rule__FactProperty__Group_2__0 )* ) ;
    public final void rule__FactProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3542:1: ( ( ( rule__FactProperty__Group_2__0 )* ) )
            // InternalAdaptDsl.g:3543:1: ( ( rule__FactProperty__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:3543:1: ( ( rule__FactProperty__Group_2__0 )* )
            // InternalAdaptDsl.g:3544:2: ( rule__FactProperty__Group_2__0 )*
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_2()); 
            // InternalAdaptDsl.g:3545:2: ( rule__FactProperty__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID) ) {
                        int LA23_2 = input.LA(3);

                        if ( ((LA23_2>=37 && LA23_2<=38)) ) {
                            alt23=1;
                        }


                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalAdaptDsl.g:3545:3: rule__FactProperty__Group_2__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__FactProperty__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFactPropertyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FactProperty__Group__2__Impl"


    // $ANTLR start "rule__FactProperty__Group__3"
    // InternalAdaptDsl.g:3553:1: rule__FactProperty__Group__3 : rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 ;
    public final void rule__FactProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3557:1: ( rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 )
            // InternalAdaptDsl.g:3558:2: rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__FactProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__4();

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
    // $ANTLR end "rule__FactProperty__Group__3"


    // $ANTLR start "rule__FactProperty__Group__3__Impl"
    // InternalAdaptDsl.g:3565:1: rule__FactProperty__Group__3__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3569:1: ( ( '.' ) )
            // InternalAdaptDsl.g:3570:1: ( '.' )
            {
            // InternalAdaptDsl.g:3570:1: ( '.' )
            // InternalAdaptDsl.g:3571:2: '.'
            {
             before(grammarAccess.getFactPropertyAccess().getFullStopKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__FactProperty__Group__3__Impl"


    // $ANTLR start "rule__FactProperty__Group__4"
    // InternalAdaptDsl.g:3580:1: rule__FactProperty__Group__4 : rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 ;
    public final void rule__FactProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3584:1: ( rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 )
            // InternalAdaptDsl.g:3585:2: rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__FactProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__5();

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
    // $ANTLR end "rule__FactProperty__Group__4"


    // $ANTLR start "rule__FactProperty__Group__4__Impl"
    // InternalAdaptDsl.g:3592:1: rule__FactProperty__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3596:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3597:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3597:1: ( RULE_ID )
            // InternalAdaptDsl.g:3598:2: RULE_ID
            {
             before(grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_4()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__FactProperty__Group__4__Impl"


    // $ANTLR start "rule__FactProperty__Group__5"
    // InternalAdaptDsl.g:3607:1: rule__FactProperty__Group__5 : rule__FactProperty__Group__5__Impl ;
    public final void rule__FactProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3611:1: ( rule__FactProperty__Group__5__Impl )
            // InternalAdaptDsl.g:3612:2: rule__FactProperty__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__5__Impl();

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
    // $ANTLR end "rule__FactProperty__Group__5"


    // $ANTLR start "rule__FactProperty__Group__5__Impl"
    // InternalAdaptDsl.g:3618:1: rule__FactProperty__Group__5__Impl : ( ( rule__FactProperty__Group_5__0 )? ) ;
    public final void rule__FactProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3622:1: ( ( ( rule__FactProperty__Group_5__0 )? ) )
            // InternalAdaptDsl.g:3623:1: ( ( rule__FactProperty__Group_5__0 )? )
            {
            // InternalAdaptDsl.g:3623:1: ( ( rule__FactProperty__Group_5__0 )? )
            // InternalAdaptDsl.g:3624:2: ( rule__FactProperty__Group_5__0 )?
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_5()); 
            // InternalAdaptDsl.g:3625:2: ( rule__FactProperty__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:3625:3: rule__FactProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FactProperty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactPropertyAccess().getGroup_5()); 

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
    // $ANTLR end "rule__FactProperty__Group__5__Impl"


    // $ANTLR start "rule__FactProperty__Group_2__0"
    // InternalAdaptDsl.g:3634:1: rule__FactProperty__Group_2__0 : rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 ;
    public final void rule__FactProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3638:1: ( rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 )
            // InternalAdaptDsl.g:3639:2: rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__FactProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group_2__1();

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
    // $ANTLR end "rule__FactProperty__Group_2__0"


    // $ANTLR start "rule__FactProperty__Group_2__0__Impl"
    // InternalAdaptDsl.g:3646:1: rule__FactProperty__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3650:1: ( ( '.' ) )
            // InternalAdaptDsl.g:3651:1: ( '.' )
            {
            // InternalAdaptDsl.g:3651:1: ( '.' )
            // InternalAdaptDsl.g:3652:2: '.'
            {
             before(grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__FactProperty__Group_2__0__Impl"


    // $ANTLR start "rule__FactProperty__Group_2__1"
    // InternalAdaptDsl.g:3661:1: rule__FactProperty__Group_2__1 : rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 ;
    public final void rule__FactProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3665:1: ( rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 )
            // InternalAdaptDsl.g:3666:2: rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2
            {
            pushFollow(FOLLOW_32);
            rule__FactProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group_2__2();

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
    // $ANTLR end "rule__FactProperty__Group_2__1"


    // $ANTLR start "rule__FactProperty__Group_2__1__Impl"
    // InternalAdaptDsl.g:3673:1: rule__FactProperty__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3677:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3678:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3678:1: ( RULE_ID )
            // InternalAdaptDsl.g:3679:2: RULE_ID
            {
             before(grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__FactProperty__Group_2__1__Impl"


    // $ANTLR start "rule__FactProperty__Group_2__2"
    // InternalAdaptDsl.g:3688:1: rule__FactProperty__Group_2__2 : rule__FactProperty__Group_2__2__Impl ;
    public final void rule__FactProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3692:1: ( rule__FactProperty__Group_2__2__Impl )
            // InternalAdaptDsl.g:3693:2: rule__FactProperty__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__Group_2__2__Impl();

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
    // $ANTLR end "rule__FactProperty__Group_2__2"


    // $ANTLR start "rule__FactProperty__Group_2__2__Impl"
    // InternalAdaptDsl.g:3699:1: rule__FactProperty__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3703:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:3704:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:3704:1: ( ( '()' )? )
            // InternalAdaptDsl.g:3705:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:3706:2: ( '()' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptDsl.g:3706:3: '()'
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__FactProperty__Group_2__2__Impl"


    // $ANTLR start "rule__FactProperty__Group_5__0"
    // InternalAdaptDsl.g:3715:1: rule__FactProperty__Group_5__0 : rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 ;
    public final void rule__FactProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3719:1: ( rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 )
            // InternalAdaptDsl.g:3720:2: rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__FactProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group_5__1();

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
    // $ANTLR end "rule__FactProperty__Group_5__0"


    // $ANTLR start "rule__FactProperty__Group_5__0__Impl"
    // InternalAdaptDsl.g:3727:1: rule__FactProperty__Group_5__0__Impl : ( '(' ) ;
    public final void rule__FactProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3731:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3732:1: ( '(' )
            {
            // InternalAdaptDsl.g:3732:1: ( '(' )
            // InternalAdaptDsl.g:3733:2: '('
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0()); 

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
    // $ANTLR end "rule__FactProperty__Group_5__0__Impl"


    // $ANTLR start "rule__FactProperty__Group_5__1"
    // InternalAdaptDsl.g:3742:1: rule__FactProperty__Group_5__1 : rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 ;
    public final void rule__FactProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3746:1: ( rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 )
            // InternalAdaptDsl.g:3747:2: rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__FactProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group_5__2();

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
    // $ANTLR end "rule__FactProperty__Group_5__1"


    // $ANTLR start "rule__FactProperty__Group_5__1__Impl"
    // InternalAdaptDsl.g:3754:1: rule__FactProperty__Group_5__1__Impl : ( ruleValue ) ;
    public final void rule__FactProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3758:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:3759:1: ( ruleValue )
            {
            // InternalAdaptDsl.g:3759:1: ( ruleValue )
            // InternalAdaptDsl.g:3760:2: ruleValue
            {
             before(grammarAccess.getFactPropertyAccess().getValueParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFactPropertyAccess().getValueParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__FactProperty__Group_5__1__Impl"


    // $ANTLR start "rule__FactProperty__Group_5__2"
    // InternalAdaptDsl.g:3769:1: rule__FactProperty__Group_5__2 : rule__FactProperty__Group_5__2__Impl ;
    public final void rule__FactProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3773:1: ( rule__FactProperty__Group_5__2__Impl )
            // InternalAdaptDsl.g:3774:2: rule__FactProperty__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__Group_5__2__Impl();

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
    // $ANTLR end "rule__FactProperty__Group_5__2"


    // $ANTLR start "rule__FactProperty__Group_5__2__Impl"
    // InternalAdaptDsl.g:3780:1: rule__FactProperty__Group_5__2__Impl : ( ')' ) ;
    public final void rule__FactProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3784:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3785:1: ( ')' )
            {
            // InternalAdaptDsl.g:3785:1: ( ')' )
            // InternalAdaptDsl.g:3786:2: ')'
            {
             before(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2()); 

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
    // $ANTLR end "rule__FactProperty__Group_5__2__Impl"


    // $ANTLR start "rule__Actions__Group__0"
    // InternalAdaptDsl.g:3796:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3800:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalAdaptDsl.g:3801:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Actions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actions__Group__1();

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
    // $ANTLR end "rule__Actions__Group__0"


    // $ANTLR start "rule__Actions__Group__0__Impl"
    // InternalAdaptDsl.g:3808:1: rule__Actions__Group__0__Impl : ( ( rule__Actions__ActionAssignment_0 ) ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3812:1: ( ( ( rule__Actions__ActionAssignment_0 ) ) )
            // InternalAdaptDsl.g:3813:1: ( ( rule__Actions__ActionAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3813:1: ( ( rule__Actions__ActionAssignment_0 ) )
            // InternalAdaptDsl.g:3814:2: ( rule__Actions__ActionAssignment_0 )
            {
             before(grammarAccess.getActionsAccess().getActionAssignment_0()); 
            // InternalAdaptDsl.g:3815:2: ( rule__Actions__ActionAssignment_0 )
            // InternalAdaptDsl.g:3815:3: rule__Actions__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Actions__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getActionAssignment_0()); 

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
    // $ANTLR end "rule__Actions__Group__0__Impl"


    // $ANTLR start "rule__Actions__Group__1"
    // InternalAdaptDsl.g:3823:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3827:1: ( rule__Actions__Group__1__Impl )
            // InternalAdaptDsl.g:3828:2: rule__Actions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Group__1__Impl();

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
    // $ANTLR end "rule__Actions__Group__1"


    // $ANTLR start "rule__Actions__Group__1__Impl"
    // InternalAdaptDsl.g:3834:1: rule__Actions__Group__1__Impl : ( ( rule__Actions__NextAssignment_1 )? ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3838:1: ( ( ( rule__Actions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:3839:1: ( ( rule__Actions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:3839:1: ( ( rule__Actions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:3840:2: ( rule__Actions__NextAssignment_1 )?
            {
             before(grammarAccess.getActionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:3841:2: ( rule__Actions__NextAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39||(LA26_0>=41 && LA26_0<=53)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptDsl.g:3841:3: rule__Actions__NextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actions__NextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionsAccess().getNextAssignment_1()); 

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
    // $ANTLR end "rule__Actions__Group__1__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__0"
    // InternalAdaptDsl.g:3850:1: rule__ServiceFunctionCallOperation__Group__0 : rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 ;
    public final void rule__ServiceFunctionCallOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3854:1: ( rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 )
            // InternalAdaptDsl.g:3855:2: rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ServiceFunctionCallOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__1();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__0"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__0__Impl"
    // InternalAdaptDsl.g:3862:1: rule__ServiceFunctionCallOperation__Group__0__Impl : ( 'functionCall' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3866:1: ( ( 'functionCall' ) )
            // InternalAdaptDsl.g:3867:1: ( 'functionCall' )
            {
            // InternalAdaptDsl.g:3867:1: ( 'functionCall' )
            // InternalAdaptDsl.g:3868:2: 'functionCall'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__0__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__1"
    // InternalAdaptDsl.g:3877:1: rule__ServiceFunctionCallOperation__Group__1 : rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 ;
    public final void rule__ServiceFunctionCallOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3881:1: ( rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 )
            // InternalAdaptDsl.g:3882:2: rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ServiceFunctionCallOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__2();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__1"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__1__Impl"
    // InternalAdaptDsl.g:3889:1: rule__ServiceFunctionCallOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3893:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3894:1: ( '(' )
            {
            // InternalAdaptDsl.g:3894:1: ( '(' )
            // InternalAdaptDsl.g:3895:2: '('
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__1__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__2"
    // InternalAdaptDsl.g:3904:1: rule__ServiceFunctionCallOperation__Group__2 : rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 ;
    public final void rule__ServiceFunctionCallOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3908:1: ( rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 )
            // InternalAdaptDsl.g:3909:2: rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ServiceFunctionCallOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__3();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__2"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__2__Impl"
    // InternalAdaptDsl.g:3916:1: rule__ServiceFunctionCallOperation__Group__2__Impl : ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3920:1: ( ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) )
            // InternalAdaptDsl.g:3921:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            {
            // InternalAdaptDsl.g:3921:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            // InternalAdaptDsl.g:3922:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getServiceAssignment_2()); 
            // InternalAdaptDsl.g:3923:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            // InternalAdaptDsl.g:3923:3: rule__ServiceFunctionCallOperation__ServiceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__ServiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceFunctionCallOperationAccess().getServiceAssignment_2()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__2__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__3"
    // InternalAdaptDsl.g:3931:1: rule__ServiceFunctionCallOperation__Group__3 : rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 ;
    public final void rule__ServiceFunctionCallOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3935:1: ( rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 )
            // InternalAdaptDsl.g:3936:2: rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ServiceFunctionCallOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__4();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__3"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__3__Impl"
    // InternalAdaptDsl.g:3943:1: rule__ServiceFunctionCallOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3947:1: ( ( ',' ) )
            // InternalAdaptDsl.g:3948:1: ( ',' )
            {
            // InternalAdaptDsl.g:3948:1: ( ',' )
            // InternalAdaptDsl.g:3949:2: ','
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__3__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__4"
    // InternalAdaptDsl.g:3958:1: rule__ServiceFunctionCallOperation__Group__4 : rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 ;
    public final void rule__ServiceFunctionCallOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3962:1: ( rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 )
            // InternalAdaptDsl.g:3963:2: rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__ServiceFunctionCallOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__5();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__4"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__4__Impl"
    // InternalAdaptDsl.g:3970:1: rule__ServiceFunctionCallOperation__Group__4__Impl : ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3974:1: ( ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) )
            // InternalAdaptDsl.g:3975:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            {
            // InternalAdaptDsl.g:3975:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            // InternalAdaptDsl.g:3976:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionAssignment_4()); 
            // InternalAdaptDsl.g:3977:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            // InternalAdaptDsl.g:3977:3: rule__ServiceFunctionCallOperation__FunctionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__FunctionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionAssignment_4()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__4__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__5"
    // InternalAdaptDsl.g:3985:1: rule__ServiceFunctionCallOperation__Group__5 : rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 ;
    public final void rule__ServiceFunctionCallOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3989:1: ( rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 )
            // InternalAdaptDsl.g:3990:2: rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__ServiceFunctionCallOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__6();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__5"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__5__Impl"
    // InternalAdaptDsl.g:3997:1: rule__ServiceFunctionCallOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4001:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4002:1: ( ',' )
            {
            // InternalAdaptDsl.g:4002:1: ( ',' )
            // InternalAdaptDsl.g:4003:2: ','
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__5__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__6"
    // InternalAdaptDsl.g:4012:1: rule__ServiceFunctionCallOperation__Group__6 : rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 ;
    public final void rule__ServiceFunctionCallOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4016:1: ( rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 )
            // InternalAdaptDsl.g:4017:2: rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__ServiceFunctionCallOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__7();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__6"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__6__Impl"
    // InternalAdaptDsl.g:4024:1: rule__ServiceFunctionCallOperation__Group__6__Impl : ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4028:1: ( ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) )
            // InternalAdaptDsl.g:4029:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            {
            // InternalAdaptDsl.g:4029:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            // InternalAdaptDsl.g:4030:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getValAssignment_6()); 
            // InternalAdaptDsl.g:4031:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            // InternalAdaptDsl.g:4031:3: rule__ServiceFunctionCallOperation__ValAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__ValAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceFunctionCallOperationAccess().getValAssignment_6()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__6__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__7"
    // InternalAdaptDsl.g:4039:1: rule__ServiceFunctionCallOperation__Group__7 : rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 ;
    public final void rule__ServiceFunctionCallOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4043:1: ( rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 )
            // InternalAdaptDsl.g:4044:2: rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__ServiceFunctionCallOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__8();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__7"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__7__Impl"
    // InternalAdaptDsl.g:4051:1: rule__ServiceFunctionCallOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4055:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4056:1: ( ')' )
            {
            // InternalAdaptDsl.g:4056:1: ( ')' )
            // InternalAdaptDsl.g:4057:2: ')'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__7__Impl"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__8"
    // InternalAdaptDsl.g:4066:1: rule__ServiceFunctionCallOperation__Group__8 : rule__ServiceFunctionCallOperation__Group__8__Impl ;
    public final void rule__ServiceFunctionCallOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4070:1: ( rule__ServiceFunctionCallOperation__Group__8__Impl )
            // InternalAdaptDsl.g:4071:2: rule__ServiceFunctionCallOperation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceFunctionCallOperation__Group__8__Impl();

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__8"


    // $ANTLR start "rule__ServiceFunctionCallOperation__Group__8__Impl"
    // InternalAdaptDsl.g:4077:1: rule__ServiceFunctionCallOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4081:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4082:1: ( ';' )
            {
            // InternalAdaptDsl.g:4082:1: ( ';' )
            // InternalAdaptDsl.g:4083:2: ';'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__Group__8__Impl"


    // $ANTLR start "rule__EditFactOperation__Group__0"
    // InternalAdaptDsl.g:4093:1: rule__EditFactOperation__Group__0 : rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 ;
    public final void rule__EditFactOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4097:1: ( rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 )
            // InternalAdaptDsl.g:4098:2: rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EditFactOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__1();

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
    // $ANTLR end "rule__EditFactOperation__Group__0"


    // $ANTLR start "rule__EditFactOperation__Group__0__Impl"
    // InternalAdaptDsl.g:4105:1: rule__EditFactOperation__Group__0__Impl : ( 'editFact' ) ;
    public final void rule__EditFactOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4109:1: ( ( 'editFact' ) )
            // InternalAdaptDsl.g:4110:1: ( 'editFact' )
            {
            // InternalAdaptDsl.g:4110:1: ( 'editFact' )
            // InternalAdaptDsl.g:4111:2: 'editFact'
            {
             before(grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0()); 

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
    // $ANTLR end "rule__EditFactOperation__Group__0__Impl"


    // $ANTLR start "rule__EditFactOperation__Group__1"
    // InternalAdaptDsl.g:4120:1: rule__EditFactOperation__Group__1 : rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 ;
    public final void rule__EditFactOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4124:1: ( rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 )
            // InternalAdaptDsl.g:4125:2: rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EditFactOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__2();

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
    // $ANTLR end "rule__EditFactOperation__Group__1"


    // $ANTLR start "rule__EditFactOperation__Group__1__Impl"
    // InternalAdaptDsl.g:4132:1: rule__EditFactOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EditFactOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4136:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4137:1: ( '(' )
            {
            // InternalAdaptDsl.g:4137:1: ( '(' )
            // InternalAdaptDsl.g:4138:2: '('
            {
             before(grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__EditFactOperation__Group__1__Impl"


    // $ANTLR start "rule__EditFactOperation__Group__2"
    // InternalAdaptDsl.g:4147:1: rule__EditFactOperation__Group__2 : rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 ;
    public final void rule__EditFactOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4151:1: ( rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 )
            // InternalAdaptDsl.g:4152:2: rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__EditFactOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__3();

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
    // $ANTLR end "rule__EditFactOperation__Group__2"


    // $ANTLR start "rule__EditFactOperation__Group__2__Impl"
    // InternalAdaptDsl.g:4159:1: rule__EditFactOperation__Group__2__Impl : ( ( rule__EditFactOperation__PropAssignment_2 ) ) ;
    public final void rule__EditFactOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4163:1: ( ( ( rule__EditFactOperation__PropAssignment_2 ) ) )
            // InternalAdaptDsl.g:4164:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4164:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            // InternalAdaptDsl.g:4165:2: ( rule__EditFactOperation__PropAssignment_2 )
            {
             before(grammarAccess.getEditFactOperationAccess().getPropAssignment_2()); 
            // InternalAdaptDsl.g:4166:2: ( rule__EditFactOperation__PropAssignment_2 )
            // InternalAdaptDsl.g:4166:3: rule__EditFactOperation__PropAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EditFactOperation__PropAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEditFactOperationAccess().getPropAssignment_2()); 

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
    // $ANTLR end "rule__EditFactOperation__Group__2__Impl"


    // $ANTLR start "rule__EditFactOperation__Group__3"
    // InternalAdaptDsl.g:4174:1: rule__EditFactOperation__Group__3 : rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 ;
    public final void rule__EditFactOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4178:1: ( rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 )
            // InternalAdaptDsl.g:4179:2: rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__EditFactOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__4();

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
    // $ANTLR end "rule__EditFactOperation__Group__3"


    // $ANTLR start "rule__EditFactOperation__Group__3__Impl"
    // InternalAdaptDsl.g:4186:1: rule__EditFactOperation__Group__3__Impl : ( ( rule__EditFactOperation__Group_3__0 )? ) ;
    public final void rule__EditFactOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4190:1: ( ( ( rule__EditFactOperation__Group_3__0 )? ) )
            // InternalAdaptDsl.g:4191:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            {
            // InternalAdaptDsl.g:4191:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            // InternalAdaptDsl.g:4192:2: ( rule__EditFactOperation__Group_3__0 )?
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup_3()); 
            // InternalAdaptDsl.g:4193:2: ( rule__EditFactOperation__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:4193:3: rule__EditFactOperation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EditFactOperation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEditFactOperationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__EditFactOperation__Group__3__Impl"


    // $ANTLR start "rule__EditFactOperation__Group__4"
    // InternalAdaptDsl.g:4201:1: rule__EditFactOperation__Group__4 : rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 ;
    public final void rule__EditFactOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4205:1: ( rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 )
            // InternalAdaptDsl.g:4206:2: rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__EditFactOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__5();

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
    // $ANTLR end "rule__EditFactOperation__Group__4"


    // $ANTLR start "rule__EditFactOperation__Group__4__Impl"
    // InternalAdaptDsl.g:4213:1: rule__EditFactOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__EditFactOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4217:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4218:1: ( ')' )
            {
            // InternalAdaptDsl.g:4218:1: ( ')' )
            // InternalAdaptDsl.g:4219:2: ')'
            {
             before(grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__EditFactOperation__Group__4__Impl"


    // $ANTLR start "rule__EditFactOperation__Group__5"
    // InternalAdaptDsl.g:4228:1: rule__EditFactOperation__Group__5 : rule__EditFactOperation__Group__5__Impl ;
    public final void rule__EditFactOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4232:1: ( rule__EditFactOperation__Group__5__Impl )
            // InternalAdaptDsl.g:4233:2: rule__EditFactOperation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group__5__Impl();

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
    // $ANTLR end "rule__EditFactOperation__Group__5"


    // $ANTLR start "rule__EditFactOperation__Group__5__Impl"
    // InternalAdaptDsl.g:4239:1: rule__EditFactOperation__Group__5__Impl : ( ';' ) ;
    public final void rule__EditFactOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4243:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4244:1: ( ';' )
            {
            // InternalAdaptDsl.g:4244:1: ( ';' )
            // InternalAdaptDsl.g:4245:2: ';'
            {
             before(grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__EditFactOperation__Group__5__Impl"


    // $ANTLR start "rule__EditFactOperation__Group_3__0"
    // InternalAdaptDsl.g:4255:1: rule__EditFactOperation__Group_3__0 : rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 ;
    public final void rule__EditFactOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4259:1: ( rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 )
            // InternalAdaptDsl.g:4260:2: rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__EditFactOperation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group_3__1();

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
    // $ANTLR end "rule__EditFactOperation__Group_3__0"


    // $ANTLR start "rule__EditFactOperation__Group_3__0__Impl"
    // InternalAdaptDsl.g:4267:1: rule__EditFactOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EditFactOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4271:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4272:1: ( ',' )
            {
            // InternalAdaptDsl.g:4272:1: ( ',' )
            // InternalAdaptDsl.g:4273:2: ','
            {
             before(grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__EditFactOperation__Group_3__0__Impl"


    // $ANTLR start "rule__EditFactOperation__Group_3__1"
    // InternalAdaptDsl.g:4282:1: rule__EditFactOperation__Group_3__1 : rule__EditFactOperation__Group_3__1__Impl ;
    public final void rule__EditFactOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4286:1: ( rule__EditFactOperation__Group_3__1__Impl )
            // InternalAdaptDsl.g:4287:2: rule__EditFactOperation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EditFactOperation__Group_3__1__Impl();

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
    // $ANTLR end "rule__EditFactOperation__Group_3__1"


    // $ANTLR start "rule__EditFactOperation__Group_3__1__Impl"
    // InternalAdaptDsl.g:4293:1: rule__EditFactOperation__Group_3__1__Impl : ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) ;
    public final void rule__EditFactOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4297:1: ( ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) )
            // InternalAdaptDsl.g:4298:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            {
            // InternalAdaptDsl.g:4298:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            // InternalAdaptDsl.g:4299:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            {
             before(grammarAccess.getEditFactOperationAccess().getValAssignment_3_1()); 
            // InternalAdaptDsl.g:4300:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            // InternalAdaptDsl.g:4300:3: rule__EditFactOperation__ValAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EditFactOperation__ValAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEditFactOperationAccess().getValAssignment_3_1()); 

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
    // $ANTLR end "rule__EditFactOperation__Group_3__1__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__0"
    // InternalAdaptDsl.g:4309:1: rule__SetDisplayPropertyOperation__Group__0 : rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 ;
    public final void rule__SetDisplayPropertyOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4313:1: ( rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 )
            // InternalAdaptDsl.g:4314:2: rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SetDisplayPropertyOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__1();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__0"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__0__Impl"
    // InternalAdaptDsl.g:4321:1: rule__SetDisplayPropertyOperation__Group__0__Impl : ( 'setDisplayProperty' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4325:1: ( ( 'setDisplayProperty' ) )
            // InternalAdaptDsl.g:4326:1: ( 'setDisplayProperty' )
            {
            // InternalAdaptDsl.g:4326:1: ( 'setDisplayProperty' )
            // InternalAdaptDsl.g:4327:2: 'setDisplayProperty'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__0__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__1"
    // InternalAdaptDsl.g:4336:1: rule__SetDisplayPropertyOperation__Group__1 : rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 ;
    public final void rule__SetDisplayPropertyOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4340:1: ( rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 )
            // InternalAdaptDsl.g:4341:2: rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SetDisplayPropertyOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__2();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__1"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__1__Impl"
    // InternalAdaptDsl.g:4348:1: rule__SetDisplayPropertyOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4352:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4353:1: ( '(' )
            {
            // InternalAdaptDsl.g:4353:1: ( '(' )
            // InternalAdaptDsl.g:4354:2: '('
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__1__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__2"
    // InternalAdaptDsl.g:4363:1: rule__SetDisplayPropertyOperation__Group__2 : rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 ;
    public final void rule__SetDisplayPropertyOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4367:1: ( rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 )
            // InternalAdaptDsl.g:4368:2: rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__SetDisplayPropertyOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__3();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__2"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__2__Impl"
    // InternalAdaptDsl.g:4375:1: rule__SetDisplayPropertyOperation__Group__2__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4379:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) )
            // InternalAdaptDsl.g:4380:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4380:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            // InternalAdaptDsl.g:4381:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyAssignment_2()); 
            // InternalAdaptDsl.g:4382:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            // InternalAdaptDsl.g:4382:3: rule__SetDisplayPropertyOperation__PropertyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyAssignment_2()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__2__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__3"
    // InternalAdaptDsl.g:4390:1: rule__SetDisplayPropertyOperation__Group__3 : rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 ;
    public final void rule__SetDisplayPropertyOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4394:1: ( rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 )
            // InternalAdaptDsl.g:4395:2: rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__SetDisplayPropertyOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__4();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__3"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__3__Impl"
    // InternalAdaptDsl.g:4402:1: rule__SetDisplayPropertyOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4406:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4407:1: ( ',' )
            {
            // InternalAdaptDsl.g:4407:1: ( ',' )
            // InternalAdaptDsl.g:4408:2: ','
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__3__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__4"
    // InternalAdaptDsl.g:4417:1: rule__SetDisplayPropertyOperation__Group__4 : rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 ;
    public final void rule__SetDisplayPropertyOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4421:1: ( rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 )
            // InternalAdaptDsl.g:4422:2: rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__SetDisplayPropertyOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__5();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__4"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__4__Impl"
    // InternalAdaptDsl.g:4429:1: rule__SetDisplayPropertyOperation__Group__4__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4433:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) )
            // InternalAdaptDsl.g:4434:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4434:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            // InternalAdaptDsl.g:4435:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueAssignment_4()); 
            // InternalAdaptDsl.g:4436:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            // InternalAdaptDsl.g:4436:3: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__PropertyValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueAssignment_4()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__4__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__5"
    // InternalAdaptDsl.g:4444:1: rule__SetDisplayPropertyOperation__Group__5 : rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 ;
    public final void rule__SetDisplayPropertyOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4448:1: ( rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 )
            // InternalAdaptDsl.g:4449:2: rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__SetDisplayPropertyOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__6();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__5"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__5__Impl"
    // InternalAdaptDsl.g:4456:1: rule__SetDisplayPropertyOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4460:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4461:1: ( ')' )
            {
            // InternalAdaptDsl.g:4461:1: ( ')' )
            // InternalAdaptDsl.g:4462:2: ')'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__5__Impl"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__6"
    // InternalAdaptDsl.g:4471:1: rule__SetDisplayPropertyOperation__Group__6 : rule__SetDisplayPropertyOperation__Group__6__Impl ;
    public final void rule__SetDisplayPropertyOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4475:1: ( rule__SetDisplayPropertyOperation__Group__6__Impl )
            // InternalAdaptDsl.g:4476:2: rule__SetDisplayPropertyOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetDisplayPropertyOperation__Group__6__Impl();

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__6"


    // $ANTLR start "rule__SetDisplayPropertyOperation__Group__6__Impl"
    // InternalAdaptDsl.g:4482:1: rule__SetDisplayPropertyOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4486:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4487:1: ( ';' )
            {
            // InternalAdaptDsl.g:4487:1: ( ';' )
            // InternalAdaptDsl.g:4488:2: ';'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__Group__6__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__0"
    // InternalAdaptDsl.g:4498:1: rule__AddViewComponentOperation__Group__0 : rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 ;
    public final void rule__AddViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4502:1: ( rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:4503:2: rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AddViewComponentOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__1();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__0"


    // $ANTLR start "rule__AddViewComponentOperation__Group__0__Impl"
    // InternalAdaptDsl.g:4510:1: rule__AddViewComponentOperation__Group__0__Impl : ( 'addViewComponent' ) ;
    public final void rule__AddViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4514:1: ( ( 'addViewComponent' ) )
            // InternalAdaptDsl.g:4515:1: ( 'addViewComponent' )
            {
            // InternalAdaptDsl.g:4515:1: ( 'addViewComponent' )
            // InternalAdaptDsl.g:4516:2: 'addViewComponent'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__0__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__1"
    // InternalAdaptDsl.g:4525:1: rule__AddViewComponentOperation__Group__1 : rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 ;
    public final void rule__AddViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4529:1: ( rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:4530:2: rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AddViewComponentOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__2();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__1"


    // $ANTLR start "rule__AddViewComponentOperation__Group__1__Impl"
    // InternalAdaptDsl.g:4537:1: rule__AddViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4541:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4542:1: ( '(' )
            {
            // InternalAdaptDsl.g:4542:1: ( '(' )
            // InternalAdaptDsl.g:4543:2: '('
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__1__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__2"
    // InternalAdaptDsl.g:4552:1: rule__AddViewComponentOperation__Group__2 : rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 ;
    public final void rule__AddViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4556:1: ( rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:4557:2: rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__AddViewComponentOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__3();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__2"


    // $ANTLR start "rule__AddViewComponentOperation__Group__2__Impl"
    // InternalAdaptDsl.g:4564:1: rule__AddViewComponentOperation__Group__2__Impl : ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4568:1: ( ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:4569:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4569:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:4570:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:4571:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:4571:3: rule__AddViewComponentOperation__ViewCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__ViewCompAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentOperationAccess().getViewCompAssignment_2()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__2__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__3"
    // InternalAdaptDsl.g:4579:1: rule__AddViewComponentOperation__Group__3 : rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 ;
    public final void rule__AddViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4583:1: ( rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:4584:2: rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__AddViewComponentOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__4();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__3"


    // $ANTLR start "rule__AddViewComponentOperation__Group__3__Impl"
    // InternalAdaptDsl.g:4591:1: rule__AddViewComponentOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4595:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4596:1: ( ',' )
            {
            // InternalAdaptDsl.g:4596:1: ( ',' )
            // InternalAdaptDsl.g:4597:2: ','
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__3__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__4"
    // InternalAdaptDsl.g:4606:1: rule__AddViewComponentOperation__Group__4 : rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 ;
    public final void rule__AddViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4610:1: ( rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 )
            // InternalAdaptDsl.g:4611:2: rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__AddViewComponentOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__5();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__4"


    // $ANTLR start "rule__AddViewComponentOperation__Group__4__Impl"
    // InternalAdaptDsl.g:4618:1: rule__AddViewComponentOperation__Group__4__Impl : ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) ;
    public final void rule__AddViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4622:1: ( ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) )
            // InternalAdaptDsl.g:4623:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4623:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            // InternalAdaptDsl.g:4624:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetAssignment_4()); 
            // InternalAdaptDsl.g:4625:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            // InternalAdaptDsl.g:4625:3: rule__AddViewComponentOperation__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentOperationAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__4__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__5"
    // InternalAdaptDsl.g:4633:1: rule__AddViewComponentOperation__Group__5 : rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 ;
    public final void rule__AddViewComponentOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4637:1: ( rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 )
            // InternalAdaptDsl.g:4638:2: rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__AddViewComponentOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__6();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__5"


    // $ANTLR start "rule__AddViewComponentOperation__Group__5__Impl"
    // InternalAdaptDsl.g:4645:1: rule__AddViewComponentOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddViewComponentOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4649:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4650:1: ( ')' )
            {
            // InternalAdaptDsl.g:4650:1: ( ')' )
            // InternalAdaptDsl.g:4651:2: ')'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__5__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__6"
    // InternalAdaptDsl.g:4660:1: rule__AddViewComponentOperation__Group__6 : rule__AddViewComponentOperation__Group__6__Impl ;
    public final void rule__AddViewComponentOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4664:1: ( rule__AddViewComponentOperation__Group__6__Impl )
            // InternalAdaptDsl.g:4665:2: rule__AddViewComponentOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentOperation__Group__6__Impl();

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__6"


    // $ANTLR start "rule__AddViewComponentOperation__Group__6__Impl"
    // InternalAdaptDsl.g:4671:1: rule__AddViewComponentOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddViewComponentOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4675:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4676:1: ( ';' )
            {
            // InternalAdaptDsl.g:4676:1: ( ';' )
            // InternalAdaptDsl.g:4677:2: ';'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__Group__6__Impl"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__0"
    // InternalAdaptDsl.g:4687:1: rule__DeleteViewComponentOperation__Group__0 : rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 ;
    public final void rule__DeleteViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4691:1: ( rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:4692:2: rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DeleteViewComponentOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__Group__1();

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__0"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__0__Impl"
    // InternalAdaptDsl.g:4699:1: rule__DeleteViewComponentOperation__Group__0__Impl : ( 'deleteViewComponent' ) ;
    public final void rule__DeleteViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4703:1: ( ( 'deleteViewComponent' ) )
            // InternalAdaptDsl.g:4704:1: ( 'deleteViewComponent' )
            {
            // InternalAdaptDsl.g:4704:1: ( 'deleteViewComponent' )
            // InternalAdaptDsl.g:4705:2: 'deleteViewComponent'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0()); 

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__0__Impl"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__1"
    // InternalAdaptDsl.g:4714:1: rule__DeleteViewComponentOperation__Group__1 : rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 ;
    public final void rule__DeleteViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4718:1: ( rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:4719:2: rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DeleteViewComponentOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__Group__2();

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__1"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__1__Impl"
    // InternalAdaptDsl.g:4726:1: rule__DeleteViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4730:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4731:1: ( '(' )
            {
            // InternalAdaptDsl.g:4731:1: ( '(' )
            // InternalAdaptDsl.g:4732:2: '('
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__1__Impl"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__2"
    // InternalAdaptDsl.g:4741:1: rule__DeleteViewComponentOperation__Group__2 : rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 ;
    public final void rule__DeleteViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4745:1: ( rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:4746:2: rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DeleteViewComponentOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__Group__3();

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__2"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__2__Impl"
    // InternalAdaptDsl.g:4753:1: rule__DeleteViewComponentOperation__Group__2__Impl : ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4757:1: ( ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:4758:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4758:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:4759:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:4760:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:4760:3: rule__DeleteViewComponentOperation__ViewCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__ViewCompAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompAssignment_2()); 

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__2__Impl"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__3"
    // InternalAdaptDsl.g:4768:1: rule__DeleteViewComponentOperation__Group__3 : rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 ;
    public final void rule__DeleteViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4772:1: ( rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:4773:2: rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__DeleteViewComponentOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__Group__4();

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__3"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__3__Impl"
    // InternalAdaptDsl.g:4780:1: rule__DeleteViewComponentOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4784:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4785:1: ( ')' )
            {
            // InternalAdaptDsl.g:4785:1: ( ')' )
            // InternalAdaptDsl.g:4786:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__3__Impl"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__4"
    // InternalAdaptDsl.g:4795:1: rule__DeleteViewComponentOperation__Group__4 : rule__DeleteViewComponentOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4799:1: ( rule__DeleteViewComponentOperation__Group__4__Impl )
            // InternalAdaptDsl.g:4800:2: rule__DeleteViewComponentOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentOperation__Group__4__Impl();

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__4"


    // $ANTLR start "rule__DeleteViewComponentOperation__Group__4__Impl"
    // InternalAdaptDsl.g:4806:1: rule__DeleteViewComponentOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4810:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4811:1: ( ';' )
            {
            // InternalAdaptDsl.g:4811:1: ( ';' )
            // InternalAdaptDsl.g:4812:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__DeleteViewComponentOperation__Group__4__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__0"
    // InternalAdaptDsl.g:4822:1: rule__AddNavLinkOperation__Group__0 : rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 ;
    public final void rule__AddNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4826:1: ( rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:4827:2: rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AddNavLinkOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__1();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__0"


    // $ANTLR start "rule__AddNavLinkOperation__Group__0__Impl"
    // InternalAdaptDsl.g:4834:1: rule__AddNavLinkOperation__Group__0__Impl : ( 'addNavLink' ) ;
    public final void rule__AddNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4838:1: ( ( 'addNavLink' ) )
            // InternalAdaptDsl.g:4839:1: ( 'addNavLink' )
            {
            // InternalAdaptDsl.g:4839:1: ( 'addNavLink' )
            // InternalAdaptDsl.g:4840:2: 'addNavLink'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__0__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__1"
    // InternalAdaptDsl.g:4849:1: rule__AddNavLinkOperation__Group__1 : rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 ;
    public final void rule__AddNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4853:1: ( rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:4854:2: rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AddNavLinkOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__2();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__1"


    // $ANTLR start "rule__AddNavLinkOperation__Group__1__Impl"
    // InternalAdaptDsl.g:4861:1: rule__AddNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4865:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4866:1: ( '(' )
            {
            // InternalAdaptDsl.g:4866:1: ( '(' )
            // InternalAdaptDsl.g:4867:2: '('
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__1__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__2"
    // InternalAdaptDsl.g:4876:1: rule__AddNavLinkOperation__Group__2 : rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 ;
    public final void rule__AddNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4880:1: ( rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:4881:2: rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__AddNavLinkOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__3();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__2"


    // $ANTLR start "rule__AddNavLinkOperation__Group__2__Impl"
    // InternalAdaptDsl.g:4888:1: rule__AddNavLinkOperation__Group__2__Impl : ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4892:1: ( ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:4893:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4893:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:4894:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:4895:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:4895:3: rule__AddNavLinkOperation__ViewCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__ViewCompAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddNavLinkOperationAccess().getViewCompAssignment_2()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__2__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__3"
    // InternalAdaptDsl.g:4903:1: rule__AddNavLinkOperation__Group__3 : rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 ;
    public final void rule__AddNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4907:1: ( rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:4908:2: rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AddNavLinkOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__4();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__3"


    // $ANTLR start "rule__AddNavLinkOperation__Group__3__Impl"
    // InternalAdaptDsl.g:4915:1: rule__AddNavLinkOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4919:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4920:1: ( ',' )
            {
            // InternalAdaptDsl.g:4920:1: ( ',' )
            // InternalAdaptDsl.g:4921:2: ','
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__3__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__4"
    // InternalAdaptDsl.g:4930:1: rule__AddNavLinkOperation__Group__4 : rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 ;
    public final void rule__AddNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4934:1: ( rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 )
            // InternalAdaptDsl.g:4935:2: rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__AddNavLinkOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__5();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__4"


    // $ANTLR start "rule__AddNavLinkOperation__Group__4__Impl"
    // InternalAdaptDsl.g:4942:1: rule__AddNavLinkOperation__Group__4__Impl : ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) ;
    public final void rule__AddNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4946:1: ( ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) )
            // InternalAdaptDsl.g:4947:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4947:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            // InternalAdaptDsl.g:4948:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextAssignment_4()); 
            // InternalAdaptDsl.g:4949:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            // InternalAdaptDsl.g:4949:3: rule__AddNavLinkOperation__TextAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddNavLinkOperationAccess().getTextAssignment_4()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__4__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__5"
    // InternalAdaptDsl.g:4957:1: rule__AddNavLinkOperation__Group__5 : rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 ;
    public final void rule__AddNavLinkOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4961:1: ( rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 )
            // InternalAdaptDsl.g:4962:2: rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__AddNavLinkOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__6();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__5"


    // $ANTLR start "rule__AddNavLinkOperation__Group__5__Impl"
    // InternalAdaptDsl.g:4969:1: rule__AddNavLinkOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddNavLinkOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4973:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4974:1: ( ')' )
            {
            // InternalAdaptDsl.g:4974:1: ( ')' )
            // InternalAdaptDsl.g:4975:2: ')'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__5__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__6"
    // InternalAdaptDsl.g:4984:1: rule__AddNavLinkOperation__Group__6 : rule__AddNavLinkOperation__Group__6__Impl ;
    public final void rule__AddNavLinkOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4988:1: ( rule__AddNavLinkOperation__Group__6__Impl )
            // InternalAdaptDsl.g:4989:2: rule__AddNavLinkOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddNavLinkOperation__Group__6__Impl();

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__6"


    // $ANTLR start "rule__AddNavLinkOperation__Group__6__Impl"
    // InternalAdaptDsl.g:4995:1: rule__AddNavLinkOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddNavLinkOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4999:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5000:1: ( ';' )
            {
            // InternalAdaptDsl.g:5000:1: ( ';' )
            // InternalAdaptDsl.g:5001:2: ';'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__Group__6__Impl"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__0"
    // InternalAdaptDsl.g:5011:1: rule__DeleteNavLinkOperation__Group__0 : rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 ;
    public final void rule__DeleteNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5015:1: ( rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:5016:2: rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DeleteNavLinkOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__Group__1();

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__0"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5023:1: rule__DeleteNavLinkOperation__Group__0__Impl : ( 'deleteNavLink' ) ;
    public final void rule__DeleteNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5027:1: ( ( 'deleteNavLink' ) )
            // InternalAdaptDsl.g:5028:1: ( 'deleteNavLink' )
            {
            // InternalAdaptDsl.g:5028:1: ( 'deleteNavLink' )
            // InternalAdaptDsl.g:5029:2: 'deleteNavLink'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0()); 

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__0__Impl"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__1"
    // InternalAdaptDsl.g:5038:1: rule__DeleteNavLinkOperation__Group__1 : rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 ;
    public final void rule__DeleteNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5042:1: ( rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:5043:2: rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DeleteNavLinkOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__Group__2();

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__1"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5050:1: rule__DeleteNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5054:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5055:1: ( '(' )
            {
            // InternalAdaptDsl.g:5055:1: ( '(' )
            // InternalAdaptDsl.g:5056:2: '('
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__1__Impl"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__2"
    // InternalAdaptDsl.g:5065:1: rule__DeleteNavLinkOperation__Group__2 : rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 ;
    public final void rule__DeleteNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5069:1: ( rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:5070:2: rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DeleteNavLinkOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__Group__3();

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__2"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5077:1: rule__DeleteNavLinkOperation__Group__2__Impl : ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5081:1: ( ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5082:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5082:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5083:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5084:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5084:3: rule__DeleteNavLinkOperation__ViewCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__ViewCompAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompAssignment_2()); 

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__2__Impl"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__3"
    // InternalAdaptDsl.g:5092:1: rule__DeleteNavLinkOperation__Group__3 : rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 ;
    public final void rule__DeleteNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5096:1: ( rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:5097:2: rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__DeleteNavLinkOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__Group__4();

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__3"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5104:1: rule__DeleteNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5108:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5109:1: ( ')' )
            {
            // InternalAdaptDsl.g:5109:1: ( ')' )
            // InternalAdaptDsl.g:5110:2: ')'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__3__Impl"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__4"
    // InternalAdaptDsl.g:5119:1: rule__DeleteNavLinkOperation__Group__4 : rule__DeleteNavLinkOperation__Group__4__Impl ;
    public final void rule__DeleteNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5123:1: ( rule__DeleteNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5124:2: rule__DeleteNavLinkOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteNavLinkOperation__Group__4__Impl();

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__4"


    // $ANTLR start "rule__DeleteNavLinkOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5130:1: rule__DeleteNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5134:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5135:1: ( ';' )
            {
            // InternalAdaptDsl.g:5135:1: ( ';' )
            // InternalAdaptDsl.g:5136:2: ';'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__DeleteNavLinkOperation__Group__4__Impl"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__0"
    // InternalAdaptDsl.g:5146:1: rule__RedirectNavLinkOperation__Group__0 : rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 ;
    public final void rule__RedirectNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5150:1: ( rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:5151:2: rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RedirectNavLinkOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__Group__1();

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__0"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5158:1: rule__RedirectNavLinkOperation__Group__0__Impl : ( 'redirectNavLink' ) ;
    public final void rule__RedirectNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5162:1: ( ( 'redirectNavLink' ) )
            // InternalAdaptDsl.g:5163:1: ( 'redirectNavLink' )
            {
            // InternalAdaptDsl.g:5163:1: ( 'redirectNavLink' )
            // InternalAdaptDsl.g:5164:2: 'redirectNavLink'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0()); 

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__0__Impl"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__1"
    // InternalAdaptDsl.g:5173:1: rule__RedirectNavLinkOperation__Group__1 : rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 ;
    public final void rule__RedirectNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5177:1: ( rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:5178:2: rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__RedirectNavLinkOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__Group__2();

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__1"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5185:1: rule__RedirectNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__RedirectNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5189:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5190:1: ( '(' )
            {
            // InternalAdaptDsl.g:5190:1: ( '(' )
            // InternalAdaptDsl.g:5191:2: '('
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__1__Impl"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__2"
    // InternalAdaptDsl.g:5200:1: rule__RedirectNavLinkOperation__Group__2 : rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 ;
    public final void rule__RedirectNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5204:1: ( rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:5205:2: rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__RedirectNavLinkOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__Group__3();

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__2"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5212:1: rule__RedirectNavLinkOperation__Group__2__Impl : ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__RedirectNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5216:1: ( ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5217:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5217:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5218:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5219:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5219:3: rule__RedirectNavLinkOperation__ViewCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__ViewCompAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompAssignment_2()); 

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__2__Impl"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__3"
    // InternalAdaptDsl.g:5227:1: rule__RedirectNavLinkOperation__Group__3 : rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 ;
    public final void rule__RedirectNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5231:1: ( rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:5232:2: rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__RedirectNavLinkOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__Group__4();

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__3"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5239:1: rule__RedirectNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RedirectNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5243:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5244:1: ( ')' )
            {
            // InternalAdaptDsl.g:5244:1: ( ')' )
            // InternalAdaptDsl.g:5245:2: ')'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__3__Impl"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__4"
    // InternalAdaptDsl.g:5254:1: rule__RedirectNavLinkOperation__Group__4 : rule__RedirectNavLinkOperation__Group__4__Impl ;
    public final void rule__RedirectNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5258:1: ( rule__RedirectNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5259:2: rule__RedirectNavLinkOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RedirectNavLinkOperation__Group__4__Impl();

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__4"


    // $ANTLR start "rule__RedirectNavLinkOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5265:1: rule__RedirectNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__RedirectNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5269:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5270:1: ( ';' )
            {
            // InternalAdaptDsl.g:5270:1: ( ';' )
            // InternalAdaptDsl.g:5271:2: ';'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__RedirectNavLinkOperation__Group__4__Impl"


    // $ANTLR start "rule__ClearNavOperation__Group__0"
    // InternalAdaptDsl.g:5281:1: rule__ClearNavOperation__Group__0 : rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 ;
    public final void rule__ClearNavOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5285:1: ( rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 )
            // InternalAdaptDsl.g:5286:2: rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ClearNavOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClearNavOperation__Group__1();

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
    // $ANTLR end "rule__ClearNavOperation__Group__0"


    // $ANTLR start "rule__ClearNavOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5293:1: rule__ClearNavOperation__Group__0__Impl : ( () ) ;
    public final void rule__ClearNavOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5297:1: ( ( () ) )
            // InternalAdaptDsl.g:5298:1: ( () )
            {
            // InternalAdaptDsl.g:5298:1: ( () )
            // InternalAdaptDsl.g:5299:2: ()
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0()); 
            // InternalAdaptDsl.g:5300:2: ()
            // InternalAdaptDsl.g:5300:3: 
            {
            }

             after(grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClearNavOperation__Group__0__Impl"


    // $ANTLR start "rule__ClearNavOperation__Group__1"
    // InternalAdaptDsl.g:5308:1: rule__ClearNavOperation__Group__1 : rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 ;
    public final void rule__ClearNavOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5312:1: ( rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 )
            // InternalAdaptDsl.g:5313:2: rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ClearNavOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClearNavOperation__Group__2();

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
    // $ANTLR end "rule__ClearNavOperation__Group__1"


    // $ANTLR start "rule__ClearNavOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5320:1: rule__ClearNavOperation__Group__1__Impl : ( 'clearNavigation' ) ;
    public final void rule__ClearNavOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5324:1: ( ( 'clearNavigation' ) )
            // InternalAdaptDsl.g:5325:1: ( 'clearNavigation' )
            {
            // InternalAdaptDsl.g:5325:1: ( 'clearNavigation' )
            // InternalAdaptDsl.g:5326:2: 'clearNavigation'
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1()); 

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
    // $ANTLR end "rule__ClearNavOperation__Group__1__Impl"


    // $ANTLR start "rule__ClearNavOperation__Group__2"
    // InternalAdaptDsl.g:5335:1: rule__ClearNavOperation__Group__2 : rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 ;
    public final void rule__ClearNavOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5339:1: ( rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 )
            // InternalAdaptDsl.g:5340:2: rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ClearNavOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClearNavOperation__Group__3();

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
    // $ANTLR end "rule__ClearNavOperation__Group__2"


    // $ANTLR start "rule__ClearNavOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5347:1: rule__ClearNavOperation__Group__2__Impl : ( '()' ) ;
    public final void rule__ClearNavOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5351:1: ( ( '()' ) )
            // InternalAdaptDsl.g:5352:1: ( '()' )
            {
            // InternalAdaptDsl.g:5352:1: ( '()' )
            // InternalAdaptDsl.g:5353:2: '()'
            {
             before(grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ClearNavOperation__Group__2__Impl"


    // $ANTLR start "rule__ClearNavOperation__Group__3"
    // InternalAdaptDsl.g:5362:1: rule__ClearNavOperation__Group__3 : rule__ClearNavOperation__Group__3__Impl ;
    public final void rule__ClearNavOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5366:1: ( rule__ClearNavOperation__Group__3__Impl )
            // InternalAdaptDsl.g:5367:2: rule__ClearNavOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClearNavOperation__Group__3__Impl();

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
    // $ANTLR end "rule__ClearNavOperation__Group__3"


    // $ANTLR start "rule__ClearNavOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5373:1: rule__ClearNavOperation__Group__3__Impl : ( ';' ) ;
    public final void rule__ClearNavOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5377:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5378:1: ( ';' )
            {
            // InternalAdaptDsl.g:5378:1: ( ';' )
            // InternalAdaptDsl.g:5379:2: ';'
            {
             before(grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__ClearNavOperation__Group__3__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__0"
    // InternalAdaptDsl.g:5389:1: rule__ChangeFontSizeOperation__Group__0 : rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 ;
    public final void rule__ChangeFontSizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5393:1: ( rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 )
            // InternalAdaptDsl.g:5394:2: rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ChangeFontSizeOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__1();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__0"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5401:1: rule__ChangeFontSizeOperation__Group__0__Impl : ( 'changeFontSize' ) ;
    public final void rule__ChangeFontSizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5405:1: ( ( 'changeFontSize' ) )
            // InternalAdaptDsl.g:5406:1: ( 'changeFontSize' )
            {
            // InternalAdaptDsl.g:5406:1: ( 'changeFontSize' )
            // InternalAdaptDsl.g:5407:2: 'changeFontSize'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__0__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__1"
    // InternalAdaptDsl.g:5416:1: rule__ChangeFontSizeOperation__Group__1 : rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 ;
    public final void rule__ChangeFontSizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5420:1: ( rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 )
            // InternalAdaptDsl.g:5421:2: rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ChangeFontSizeOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__2();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__1"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5428:1: rule__ChangeFontSizeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontSizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5432:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5433:1: ( '(' )
            {
            // InternalAdaptDsl.g:5433:1: ( '(' )
            // InternalAdaptDsl.g:5434:2: '('
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__1__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__2"
    // InternalAdaptDsl.g:5443:1: rule__ChangeFontSizeOperation__Group__2 : rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 ;
    public final void rule__ChangeFontSizeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5447:1: ( rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 )
            // InternalAdaptDsl.g:5448:2: rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ChangeFontSizeOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__3();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__2"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5455:1: rule__ChangeFontSizeOperation__Group__2__Impl : ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5459:1: ( ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:5460:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5460:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:5461:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryAssignment_2()); 
            // InternalAdaptDsl.g:5462:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            // InternalAdaptDsl.g:5462:3: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__SizePrimaryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryAssignment_2()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__2__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__3"
    // InternalAdaptDsl.g:5470:1: rule__ChangeFontSizeOperation__Group__3 : rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 ;
    public final void rule__ChangeFontSizeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5474:1: ( rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 )
            // InternalAdaptDsl.g:5475:2: rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ChangeFontSizeOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__4();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__3"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5482:1: rule__ChangeFontSizeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeFontSizeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5486:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5487:1: ( ',' )
            {
            // InternalAdaptDsl.g:5487:1: ( ',' )
            // InternalAdaptDsl.g:5488:2: ','
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__3__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__4"
    // InternalAdaptDsl.g:5497:1: rule__ChangeFontSizeOperation__Group__4 : rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 ;
    public final void rule__ChangeFontSizeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5501:1: ( rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 )
            // InternalAdaptDsl.g:5502:2: rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ChangeFontSizeOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__5();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__4"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5509:1: rule__ChangeFontSizeOperation__Group__4__Impl : ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5513:1: ( ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:5514:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5514:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:5515:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:5516:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            // InternalAdaptDsl.g:5516:3: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryAssignment_4()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__4__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__5"
    // InternalAdaptDsl.g:5524:1: rule__ChangeFontSizeOperation__Group__5 : rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 ;
    public final void rule__ChangeFontSizeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5528:1: ( rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 )
            // InternalAdaptDsl.g:5529:2: rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ChangeFontSizeOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__6();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__5"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__5__Impl"
    // InternalAdaptDsl.g:5536:1: rule__ChangeFontSizeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeFontSizeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5540:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5541:1: ( ')' )
            {
            // InternalAdaptDsl.g:5541:1: ( ')' )
            // InternalAdaptDsl.g:5542:2: ')'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__5__Impl"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__6"
    // InternalAdaptDsl.g:5551:1: rule__ChangeFontSizeOperation__Group__6 : rule__ChangeFontSizeOperation__Group__6__Impl ;
    public final void rule__ChangeFontSizeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5555:1: ( rule__ChangeFontSizeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5556:2: rule__ChangeFontSizeOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__6__Impl();

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__6"


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__6__Impl"
    // InternalAdaptDsl.g:5562:1: rule__ChangeFontSizeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeFontSizeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5566:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5567:1: ( ';' )
            {
            // InternalAdaptDsl.g:5567:1: ( ';' )
            // InternalAdaptDsl.g:5568:2: ';'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__Group__6__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__0"
    // InternalAdaptDsl.g:5578:1: rule__ChangeColorSchemeOperation__Group__0 : rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 ;
    public final void rule__ChangeColorSchemeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5582:1: ( rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 )
            // InternalAdaptDsl.g:5583:2: rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ChangeColorSchemeOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__1();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__0"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5590:1: rule__ChangeColorSchemeOperation__Group__0__Impl : ( 'changeColorScheme' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5594:1: ( ( 'changeColorScheme' ) )
            // InternalAdaptDsl.g:5595:1: ( 'changeColorScheme' )
            {
            // InternalAdaptDsl.g:5595:1: ( 'changeColorScheme' )
            // InternalAdaptDsl.g:5596:2: 'changeColorScheme'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__0__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__1"
    // InternalAdaptDsl.g:5605:1: rule__ChangeColorSchemeOperation__Group__1 : rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 ;
    public final void rule__ChangeColorSchemeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5609:1: ( rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 )
            // InternalAdaptDsl.g:5610:2: rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ChangeColorSchemeOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__2();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__1"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5617:1: rule__ChangeColorSchemeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5621:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5622:1: ( '(' )
            {
            // InternalAdaptDsl.g:5622:1: ( '(' )
            // InternalAdaptDsl.g:5623:2: '('
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__1__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__2"
    // InternalAdaptDsl.g:5632:1: rule__ChangeColorSchemeOperation__Group__2 : rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 ;
    public final void rule__ChangeColorSchemeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5636:1: ( rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 )
            // InternalAdaptDsl.g:5637:2: rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__ChangeColorSchemeOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__3();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__2"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5644:1: rule__ChangeColorSchemeOperation__Group__2__Impl : ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5648:1: ( ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:5649:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5649:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:5650:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryAssignment_2()); 
            // InternalAdaptDsl.g:5651:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            // InternalAdaptDsl.g:5651:3: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryAssignment_2()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__2__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__3"
    // InternalAdaptDsl.g:5659:1: rule__ChangeColorSchemeOperation__Group__3 : rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 ;
    public final void rule__ChangeColorSchemeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5663:1: ( rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 )
            // InternalAdaptDsl.g:5664:2: rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ChangeColorSchemeOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__4();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__3"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5671:1: rule__ChangeColorSchemeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5675:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5676:1: ( ',' )
            {
            // InternalAdaptDsl.g:5676:1: ( ',' )
            // InternalAdaptDsl.g:5677:2: ','
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__3__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__4"
    // InternalAdaptDsl.g:5686:1: rule__ChangeColorSchemeOperation__Group__4 : rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 ;
    public final void rule__ChangeColorSchemeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5690:1: ( rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 )
            // InternalAdaptDsl.g:5691:2: rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ChangeColorSchemeOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__5();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__4"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5698:1: rule__ChangeColorSchemeOperation__Group__4__Impl : ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5702:1: ( ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:5703:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5703:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:5704:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:5705:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            // InternalAdaptDsl.g:5705:3: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryAssignment_4()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__4__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__5"
    // InternalAdaptDsl.g:5713:1: rule__ChangeColorSchemeOperation__Group__5 : rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 ;
    public final void rule__ChangeColorSchemeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5717:1: ( rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 )
            // InternalAdaptDsl.g:5718:2: rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ChangeColorSchemeOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__6();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__5"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__5__Impl"
    // InternalAdaptDsl.g:5725:1: rule__ChangeColorSchemeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5729:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5730:1: ( ')' )
            {
            // InternalAdaptDsl.g:5730:1: ( ')' )
            // InternalAdaptDsl.g:5731:2: ')'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__5__Impl"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__6"
    // InternalAdaptDsl.g:5740:1: rule__ChangeColorSchemeOperation__Group__6 : rule__ChangeColorSchemeOperation__Group__6__Impl ;
    public final void rule__ChangeColorSchemeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5744:1: ( rule__ChangeColorSchemeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5745:2: rule__ChangeColorSchemeOperation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeColorSchemeOperation__Group__6__Impl();

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__6"


    // $ANTLR start "rule__ChangeColorSchemeOperation__Group__6__Impl"
    // InternalAdaptDsl.g:5751:1: rule__ChangeColorSchemeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5755:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5756:1: ( ';' )
            {
            // InternalAdaptDsl.g:5756:1: ( ';' )
            // InternalAdaptDsl.g:5757:2: ';'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__Group__6__Impl"


    // $ANTLR start "rule__ChangeFontOperation__Group__0"
    // InternalAdaptDsl.g:5767:1: rule__ChangeFontOperation__Group__0 : rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 ;
    public final void rule__ChangeFontOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5771:1: ( rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 )
            // InternalAdaptDsl.g:5772:2: rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ChangeFontOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__Group__1();

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
    // $ANTLR end "rule__ChangeFontOperation__Group__0"


    // $ANTLR start "rule__ChangeFontOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5779:1: rule__ChangeFontOperation__Group__0__Impl : ( 'changeFont' ) ;
    public final void rule__ChangeFontOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5783:1: ( ( 'changeFont' ) )
            // InternalAdaptDsl.g:5784:1: ( 'changeFont' )
            {
            // InternalAdaptDsl.g:5784:1: ( 'changeFont' )
            // InternalAdaptDsl.g:5785:2: 'changeFont'
            {
             before(grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0()); 

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
    // $ANTLR end "rule__ChangeFontOperation__Group__0__Impl"


    // $ANTLR start "rule__ChangeFontOperation__Group__1"
    // InternalAdaptDsl.g:5794:1: rule__ChangeFontOperation__Group__1 : rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 ;
    public final void rule__ChangeFontOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5798:1: ( rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 )
            // InternalAdaptDsl.g:5799:2: rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ChangeFontOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__Group__2();

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
    // $ANTLR end "rule__ChangeFontOperation__Group__1"


    // $ANTLR start "rule__ChangeFontOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5806:1: rule__ChangeFontOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5810:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5811:1: ( '(' )
            {
            // InternalAdaptDsl.g:5811:1: ( '(' )
            // InternalAdaptDsl.g:5812:2: '('
            {
             before(grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ChangeFontOperation__Group__1__Impl"


    // $ANTLR start "rule__ChangeFontOperation__Group__2"
    // InternalAdaptDsl.g:5821:1: rule__ChangeFontOperation__Group__2 : rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 ;
    public final void rule__ChangeFontOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5825:1: ( rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 )
            // InternalAdaptDsl.g:5826:2: rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ChangeFontOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__Group__3();

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
    // $ANTLR end "rule__ChangeFontOperation__Group__2"


    // $ANTLR start "rule__ChangeFontOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5833:1: rule__ChangeFontOperation__Group__2__Impl : ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeFontOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5837:1: ( ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:5838:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5838:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:5839:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:5840:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:5840:3: rule__ChangeFontOperation__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeFontOperationAccess().getTextAssignment_2()); 

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
    // $ANTLR end "rule__ChangeFontOperation__Group__2__Impl"


    // $ANTLR start "rule__ChangeFontOperation__Group__3"
    // InternalAdaptDsl.g:5848:1: rule__ChangeFontOperation__Group__3 : rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 ;
    public final void rule__ChangeFontOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5852:1: ( rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 )
            // InternalAdaptDsl.g:5853:2: rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ChangeFontOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__Group__4();

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
    // $ANTLR end "rule__ChangeFontOperation__Group__3"


    // $ANTLR start "rule__ChangeFontOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5860:1: rule__ChangeFontOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5864:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5865:1: ( ')' )
            {
            // InternalAdaptDsl.g:5865:1: ( ')' )
            // InternalAdaptDsl.g:5866:2: ')'
            {
             before(grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ChangeFontOperation__Group__3__Impl"


    // $ANTLR start "rule__ChangeFontOperation__Group__4"
    // InternalAdaptDsl.g:5875:1: rule__ChangeFontOperation__Group__4 : rule__ChangeFontOperation__Group__4__Impl ;
    public final void rule__ChangeFontOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5879:1: ( rule__ChangeFontOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5880:2: rule__ChangeFontOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontOperation__Group__4__Impl();

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
    // $ANTLR end "rule__ChangeFontOperation__Group__4"


    // $ANTLR start "rule__ChangeFontOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5886:1: rule__ChangeFontOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5890:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5891:1: ( ';' )
            {
            // InternalAdaptDsl.g:5891:1: ( ';' )
            // InternalAdaptDsl.g:5892:2: ';'
            {
             before(grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ChangeFontOperation__Group__4__Impl"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__0"
    // InternalAdaptDsl.g:5902:1: rule__ChangeTableCssClassOperation__Group__0 : rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 ;
    public final void rule__ChangeTableCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5906:1: ( rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:5907:2: rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ChangeTableCssClassOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__1();

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__0"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5914:1: rule__ChangeTableCssClassOperation__Group__0__Impl : ( 'changeTableCss' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5918:1: ( ( 'changeTableCss' ) )
            // InternalAdaptDsl.g:5919:1: ( 'changeTableCss' )
            {
            // InternalAdaptDsl.g:5919:1: ( 'changeTableCss' )
            // InternalAdaptDsl.g:5920:2: 'changeTableCss'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0()); 

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__0__Impl"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__1"
    // InternalAdaptDsl.g:5929:1: rule__ChangeTableCssClassOperation__Group__1 : rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 ;
    public final void rule__ChangeTableCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5933:1: ( rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:5934:2: rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ChangeTableCssClassOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__2();

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__1"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5941:1: rule__ChangeTableCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5945:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5946:1: ( '(' )
            {
            // InternalAdaptDsl.g:5946:1: ( '(' )
            // InternalAdaptDsl.g:5947:2: '('
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__1__Impl"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__2"
    // InternalAdaptDsl.g:5956:1: rule__ChangeTableCssClassOperation__Group__2 : rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 ;
    public final void rule__ChangeTableCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5960:1: ( rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:5961:2: rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ChangeTableCssClassOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__3();

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__2"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5968:1: rule__ChangeTableCssClassOperation__Group__2__Impl : ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeTableCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5972:1: ( ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:5973:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5973:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:5974:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:5975:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:5975:3: rule__ChangeTableCssClassOperation__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChangeTableCssClassOperationAccess().getTextAssignment_2()); 

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__2__Impl"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__3"
    // InternalAdaptDsl.g:5983:1: rule__ChangeTableCssClassOperation__Group__3 : rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 ;
    public final void rule__ChangeTableCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5987:1: ( rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:5988:2: rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ChangeTableCssClassOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__4();

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__3"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5995:1: rule__ChangeTableCssClassOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5999:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6000:1: ( ')' )
            {
            // InternalAdaptDsl.g:6000:1: ( ')' )
            // InternalAdaptDsl.g:6001:2: ')'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__3__Impl"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__4"
    // InternalAdaptDsl.g:6010:1: rule__ChangeTableCssClassOperation__Group__4 : rule__ChangeTableCssClassOperation__Group__4__Impl ;
    public final void rule__ChangeTableCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6014:1: ( rule__ChangeTableCssClassOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6015:2: rule__ChangeTableCssClassOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__4__Impl();

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__4"


    // $ANTLR start "rule__ChangeTableCssClassOperation__Group__4__Impl"
    // InternalAdaptDsl.g:6021:1: rule__ChangeTableCssClassOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6025:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6026:1: ( ';' )
            {
            // InternalAdaptDsl.g:6026:1: ( ';' )
            // InternalAdaptDsl.g:6027:2: ';'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__Group__4__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__0"
    // InternalAdaptDsl.g:6037:1: rule__AdaptCssClassOperation__Group__0 : rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 ;
    public final void rule__AdaptCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6041:1: ( rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:6042:2: rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AdaptCssClassOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__1();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__0"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__0__Impl"
    // InternalAdaptDsl.g:6049:1: rule__AdaptCssClassOperation__Group__0__Impl : ( 'adaptCssClass' ) ;
    public final void rule__AdaptCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6053:1: ( ( 'adaptCssClass' ) )
            // InternalAdaptDsl.g:6054:1: ( 'adaptCssClass' )
            {
            // InternalAdaptDsl.g:6054:1: ( 'adaptCssClass' )
            // InternalAdaptDsl.g:6055:2: 'adaptCssClass'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__0__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__1"
    // InternalAdaptDsl.g:6064:1: rule__AdaptCssClassOperation__Group__1 : rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 ;
    public final void rule__AdaptCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6068:1: ( rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:6069:2: rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AdaptCssClassOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__2();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__1"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__1__Impl"
    // InternalAdaptDsl.g:6076:1: rule__AdaptCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AdaptCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6080:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6081:1: ( '(' )
            {
            // InternalAdaptDsl.g:6081:1: ( '(' )
            // InternalAdaptDsl.g:6082:2: '('
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__1__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__2"
    // InternalAdaptDsl.g:6091:1: rule__AdaptCssClassOperation__Group__2 : rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 ;
    public final void rule__AdaptCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6095:1: ( rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:6096:2: rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__AdaptCssClassOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__3();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__2"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__2__Impl"
    // InternalAdaptDsl.g:6103:1: rule__AdaptCssClassOperation__Group__2__Impl : ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6107:1: ( ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) )
            // InternalAdaptDsl.g:6108:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6108:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            // InternalAdaptDsl.g:6109:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssClassAssignment_2()); 
            // InternalAdaptDsl.g:6110:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            // InternalAdaptDsl.g:6110:3: rule__AdaptCssClassOperation__CssClassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__CssClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAdaptCssClassOperationAccess().getCssClassAssignment_2()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__2__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__3"
    // InternalAdaptDsl.g:6118:1: rule__AdaptCssClassOperation__Group__3 : rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 ;
    public final void rule__AdaptCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6122:1: ( rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:6123:2: rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AdaptCssClassOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__4();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__3"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__3__Impl"
    // InternalAdaptDsl.g:6130:1: rule__AdaptCssClassOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6134:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6135:1: ( ',' )
            {
            // InternalAdaptDsl.g:6135:1: ( ',' )
            // InternalAdaptDsl.g:6136:2: ','
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__3__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__4"
    // InternalAdaptDsl.g:6145:1: rule__AdaptCssClassOperation__Group__4 : rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 ;
    public final void rule__AdaptCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6149:1: ( rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 )
            // InternalAdaptDsl.g:6150:2: rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__AdaptCssClassOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__5();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__4"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__4__Impl"
    // InternalAdaptDsl.g:6157:1: rule__AdaptCssClassOperation__Group__4__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6161:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) )
            // InternalAdaptDsl.g:6162:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6162:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            // InternalAdaptDsl.g:6163:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAssignment_4()); 
            // InternalAdaptDsl.g:6164:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            // InternalAdaptDsl.g:6164:3: rule__AdaptCssClassOperation__CssAttributeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__CssAttributeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAssignment_4()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__4__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__5"
    // InternalAdaptDsl.g:6172:1: rule__AdaptCssClassOperation__Group__5 : rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 ;
    public final void rule__AdaptCssClassOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6176:1: ( rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 )
            // InternalAdaptDsl.g:6177:2: rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__AdaptCssClassOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__6();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__5"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__5__Impl"
    // InternalAdaptDsl.g:6184:1: rule__AdaptCssClassOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6188:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6189:1: ( ',' )
            {
            // InternalAdaptDsl.g:6189:1: ( ',' )
            // InternalAdaptDsl.g:6190:2: ','
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__5__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__6"
    // InternalAdaptDsl.g:6199:1: rule__AdaptCssClassOperation__Group__6 : rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 ;
    public final void rule__AdaptCssClassOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6203:1: ( rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 )
            // InternalAdaptDsl.g:6204:2: rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__AdaptCssClassOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__7();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__6"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__6__Impl"
    // InternalAdaptDsl.g:6211:1: rule__AdaptCssClassOperation__Group__6__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6215:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) )
            // InternalAdaptDsl.g:6216:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            {
            // InternalAdaptDsl.g:6216:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            // InternalAdaptDsl.g:6217:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAssignment_6()); 
            // InternalAdaptDsl.g:6218:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            // InternalAdaptDsl.g:6218:3: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__CssAttributeValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAssignment_6()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__6__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__7"
    // InternalAdaptDsl.g:6226:1: rule__AdaptCssClassOperation__Group__7 : rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 ;
    public final void rule__AdaptCssClassOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6230:1: ( rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 )
            // InternalAdaptDsl.g:6231:2: rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__AdaptCssClassOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__8();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__7"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__7__Impl"
    // InternalAdaptDsl.g:6238:1: rule__AdaptCssClassOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AdaptCssClassOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6242:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6243:1: ( ')' )
            {
            // InternalAdaptDsl.g:6243:1: ( ')' )
            // InternalAdaptDsl.g:6244:2: ')'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__7__Impl"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__8"
    // InternalAdaptDsl.g:6253:1: rule__AdaptCssClassOperation__Group__8 : rule__AdaptCssClassOperation__Group__8__Impl ;
    public final void rule__AdaptCssClassOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6257:1: ( rule__AdaptCssClassOperation__Group__8__Impl )
            // InternalAdaptDsl.g:6258:2: rule__AdaptCssClassOperation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdaptCssClassOperation__Group__8__Impl();

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__8"


    // $ANTLR start "rule__AdaptCssClassOperation__Group__8__Impl"
    // InternalAdaptDsl.g:6264:1: rule__AdaptCssClassOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AdaptCssClassOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6268:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6269:1: ( ';' )
            {
            // InternalAdaptDsl.g:6269:1: ( ';' )
            // InternalAdaptDsl.g:6270:2: ';'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__Group__8__Impl"


    // $ANTLR start "rule__Model__ServicesAssignment_0"
    // InternalAdaptDsl.g:6280:1: rule__Model__ServicesAssignment_0 : ( ruleServices ) ;
    public final void rule__Model__ServicesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6284:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:6285:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:6285:2: ( ruleServices )
            // InternalAdaptDsl.g:6286:3: ruleServices
            {
             before(grammarAccess.getModelAccess().getServicesServicesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleServices();

            state._fsp--;

             after(grammarAccess.getModelAccess().getServicesServicesParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ServicesAssignment_0"


    // $ANTLR start "rule__Model__FlowNameAssignment_2"
    // InternalAdaptDsl.g:6295:1: rule__Model__FlowNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Model__FlowNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6299:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:6300:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:6300:2: ( RULE_STRING )
            // InternalAdaptDsl.g:6301:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getFlowNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFlowNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__FlowNameAssignment_2"


    // $ANTLR start "rule__Model__AdaptationRulesAssignment_4"
    // InternalAdaptDsl.g:6310:1: rule__Model__AdaptationRulesAssignment_4 : ( ruleAdaptationRule ) ;
    public final void rule__Model__AdaptationRulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6314:1: ( ( ruleAdaptationRule ) )
            // InternalAdaptDsl.g:6315:2: ( ruleAdaptationRule )
            {
            // InternalAdaptDsl.g:6315:2: ( ruleAdaptationRule )
            // InternalAdaptDsl.g:6316:3: ruleAdaptationRule
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAdaptationRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__AdaptationRulesAssignment_4"


    // $ANTLR start "rule__Services__ThisAssignment_0"
    // InternalAdaptDsl.g:6325:1: rule__Services__ThisAssignment_0 : ( ruleService ) ;
    public final void rule__Services__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6329:1: ( ( ruleService ) )
            // InternalAdaptDsl.g:6330:2: ( ruleService )
            {
            // InternalAdaptDsl.g:6330:2: ( ruleService )
            // InternalAdaptDsl.g:6331:3: ruleService
            {
             before(grammarAccess.getServicesAccess().getThisServiceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServicesAccess().getThisServiceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Services__ThisAssignment_0"


    // $ANTLR start "rule__Services__NextAssignment_1"
    // InternalAdaptDsl.g:6340:1: rule__Services__NextAssignment_1 : ( ruleServices ) ;
    public final void rule__Services__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6344:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:6345:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:6345:2: ( ruleServices )
            // InternalAdaptDsl.g:6346:3: ruleServices
            {
             before(grammarAccess.getServicesAccess().getNextServicesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServices();

            state._fsp--;

             after(grammarAccess.getServicesAccess().getNextServicesParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Services__NextAssignment_1"


    // $ANTLR start "rule__Service__TypeAssignment_1"
    // InternalAdaptDsl.g:6355:1: rule__Service__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6359:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:6360:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:6360:2: ( RULE_ID )
            // InternalAdaptDsl.g:6361:3: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getTypeIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__TypeAssignment_1"


    // $ANTLR start "rule__Service__LocAssignment_3"
    // InternalAdaptDsl.g:6370:1: rule__Service__LocAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Service__LocAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6374:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:6375:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:6375:2: ( RULE_STRING )
            // InternalAdaptDsl.g:6376:3: RULE_STRING
            {
             before(grammarAccess.getServiceAccess().getLocSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLocSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Service__LocAssignment_3"


    // $ANTLR start "rule__Service__IdAssignment_5"
    // InternalAdaptDsl.g:6385:1: rule__Service__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Service__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6389:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:6390:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:6390:2: ( RULE_STRING )
            // InternalAdaptDsl.g:6391:3: RULE_STRING
            {
             before(grammarAccess.getServiceAccess().getIdSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getIdSTRINGTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Service__IdAssignment_5"


    // $ANTLR start "rule__Service__FunctionsAssignment_7"
    // InternalAdaptDsl.g:6400:1: rule__Service__FunctionsAssignment_7 : ( ruleFunctions ) ;
    public final void rule__Service__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6404:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:6405:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:6405:2: ( ruleFunctions )
            // InternalAdaptDsl.g:6406:3: ruleFunctions
            {
             before(grammarAccess.getServiceAccess().getFunctionsFunctionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getFunctionsFunctionsParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Service__FunctionsAssignment_7"


    // $ANTLR start "rule__Functions__ThisAssignment_0"
    // InternalAdaptDsl.g:6415:1: rule__Functions__ThisAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6419:1: ( ( ruleFunction ) )
            // InternalAdaptDsl.g:6420:2: ( ruleFunction )
            {
            // InternalAdaptDsl.g:6420:2: ( ruleFunction )
            // InternalAdaptDsl.g:6421:3: ruleFunction
            {
             before(grammarAccess.getFunctionsAccess().getThisFunctionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionsAccess().getThisFunctionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Functions__ThisAssignment_0"


    // $ANTLR start "rule__Functions__NextAssignment_1"
    // InternalAdaptDsl.g:6430:1: rule__Functions__NextAssignment_1 : ( ruleFunctions ) ;
    public final void rule__Functions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6434:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:6435:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:6435:2: ( ruleFunctions )
            // InternalAdaptDsl.g:6436:3: ruleFunctions
            {
             before(grammarAccess.getFunctionsAccess().getNextFunctionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctions();

            state._fsp--;

             after(grammarAccess.getFunctionsAccess().getNextFunctionsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Functions__NextAssignment_1"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalAdaptDsl.g:6445:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6449:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:6450:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:6450:2: ( RULE_ID )
            // InternalAdaptDsl.g:6451:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__IdAssignment_3"
    // InternalAdaptDsl.g:6460:1: rule__Function__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6464:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:6465:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:6465:2: ( RULE_STRING )
            // InternalAdaptDsl.g:6466:3: RULE_STRING
            {
             before(grammarAccess.getFunctionAccess().getIdSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getIdSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Function__IdAssignment_3"


    // $ANTLR start "rule__AdaptationRule__NameAssignment_1"
    // InternalAdaptDsl.g:6475:1: rule__AdaptationRule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdaptationRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6479:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:6480:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:6480:2: ( RULE_STRING )
            // InternalAdaptDsl.g:6481:3: RULE_STRING
            {
             before(grammarAccess.getAdaptationRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AdaptationRule__NameAssignment_1"


    // $ANTLR start "rule__AdaptationRule__LevelAssignment_4"
    // InternalAdaptDsl.g:6490:1: rule__AdaptationRule__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__AdaptationRule__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6494:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:6495:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:6495:2: ( RULE_INT )
            // InternalAdaptDsl.g:6496:3: RULE_INT
            {
             before(grammarAccess.getAdaptationRuleAccess().getLevelINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLevelINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__AdaptationRule__LevelAssignment_4"


    // $ANTLR start "rule__AdaptationRule__FactTypeAssignment_7"
    // InternalAdaptDsl.g:6505:1: rule__AdaptationRule__FactTypeAssignment_7 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6509:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:6510:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:6510:2: ( RULE_ID )
            // InternalAdaptDsl.g:6511:3: RULE_ID
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getFactTypeIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__AdaptationRule__FactTypeAssignment_7"


    // $ANTLR start "rule__AdaptationRule__FactNameAssignment_8"
    // InternalAdaptDsl.g:6520:1: rule__AdaptationRule__FactNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6524:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:6525:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:6525:2: ( RULE_ID )
            // InternalAdaptDsl.g:6526:3: RULE_ID
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getFactNameIDTerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__AdaptationRule__FactNameAssignment_8"


    // $ANTLR start "rule__AdaptationRule__ExprAssignment_12"
    // InternalAdaptDsl.g:6535:1: rule__AdaptationRule__ExprAssignment_12 : ( ruleConditionalOR ) ;
    public final void rule__AdaptationRule__ExprAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6539:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:6540:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:6540:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:6541:3: ruleConditionalOR
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalOR();

            state._fsp--;

             after(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__AdaptationRule__ExprAssignment_12"


    // $ANTLR start "rule__AdaptationRule__ActionCollectionAssignment_16"
    // InternalAdaptDsl.g:6550:1: rule__AdaptationRule__ActionCollectionAssignment_16 : ( ruleActions ) ;
    public final void rule__AdaptationRule__ActionCollectionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6554:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:6555:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:6555:2: ( ruleActions )
            // InternalAdaptDsl.g:6556:3: ruleActions
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__AdaptationRule__ActionCollectionAssignment_16"


    // $ANTLR start "rule__ConditionalOR__LeftAssignment_0"
    // InternalAdaptDsl.g:6565:1: rule__ConditionalOR__LeftAssignment_0 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalOR__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6569:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:6570:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:6570:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:6571:3: ruleConditionalAND
            {
             before(grammarAccess.getConditionalORAccess().getLeftConditionalANDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalAND();

            state._fsp--;

             after(grammarAccess.getConditionalORAccess().getLeftConditionalANDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalOR__LeftAssignment_0"


    // $ANTLR start "rule__ConditionalOR__RightAssignment_1_1"
    // InternalAdaptDsl.g:6580:1: rule__ConditionalOR__RightAssignment_1_1 : ( ruleConditionalOR ) ;
    public final void rule__ConditionalOR__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6584:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:6585:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:6585:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:6586:3: ruleConditionalOR
            {
             before(grammarAccess.getConditionalORAccess().getRightConditionalORParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalOR();

            state._fsp--;

             after(grammarAccess.getConditionalORAccess().getRightConditionalORParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ConditionalOR__RightAssignment_1_1"


    // $ANTLR start "rule__ConditionalAND__LeftAssignment_0"
    // InternalAdaptDsl.g:6595:1: rule__ConditionalAND__LeftAssignment_0 : ( ruleConditionalPrimary ) ;
    public final void rule__ConditionalAND__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6599:1: ( ( ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:6600:2: ( ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:6600:2: ( ruleConditionalPrimary )
            // InternalAdaptDsl.g:6601:3: ruleConditionalPrimary
            {
             before(grammarAccess.getConditionalANDAccess().getLeftConditionalPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalPrimary();

            state._fsp--;

             after(grammarAccess.getConditionalANDAccess().getLeftConditionalPrimaryParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalAND__LeftAssignment_0"


    // $ANTLR start "rule__ConditionalAND__RightAssignment_1_1"
    // InternalAdaptDsl.g:6610:1: rule__ConditionalAND__RightAssignment_1_1 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalAND__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6614:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:6615:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:6615:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:6616:3: ruleConditionalAND
            {
             before(grammarAccess.getConditionalANDAccess().getRightConditionalANDParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalAND();

            state._fsp--;

             after(grammarAccess.getConditionalANDAccess().getRightConditionalANDParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__ConditionalAND__RightAssignment_1_1"


    // $ANTLR start "rule__ConditionalPrimary__CondAssignment_0"
    // InternalAdaptDsl.g:6625:1: rule__ConditionalPrimary__CondAssignment_0 : ( ruleStringCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6629:1: ( ( ruleStringCondition ) )
            // InternalAdaptDsl.g:6630:2: ( ruleStringCondition )
            {
            // InternalAdaptDsl.g:6630:2: ( ruleStringCondition )
            // InternalAdaptDsl.g:6631:3: ruleStringCondition
            {
             before(grammarAccess.getConditionalPrimaryAccess().getCondStringConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringCondition();

            state._fsp--;

             after(grammarAccess.getConditionalPrimaryAccess().getCondStringConditionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ConditionalPrimary__CondAssignment_0"


    // $ANTLR start "rule__ConditionalPrimary__CondAssignment_1"
    // InternalAdaptDsl.g:6640:1: rule__ConditionalPrimary__CondAssignment_1 : ( ruleNumberCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6644:1: ( ( ruleNumberCondition ) )
            // InternalAdaptDsl.g:6645:2: ( ruleNumberCondition )
            {
            // InternalAdaptDsl.g:6645:2: ( ruleNumberCondition )
            // InternalAdaptDsl.g:6646:3: ruleNumberCondition
            {
             before(grammarAccess.getConditionalPrimaryAccess().getCondNumberConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberCondition();

            state._fsp--;

             after(grammarAccess.getConditionalPrimaryAccess().getCondNumberConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConditionalPrimary__CondAssignment_1"


    // $ANTLR start "rule__ConditionalPrimary__CondAssignment_2"
    // InternalAdaptDsl.g:6655:1: rule__ConditionalPrimary__CondAssignment_2 : ( ruleBooleanCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6659:1: ( ( ruleBooleanCondition ) )
            // InternalAdaptDsl.g:6660:2: ( ruleBooleanCondition )
            {
            // InternalAdaptDsl.g:6660:2: ( ruleBooleanCondition )
            // InternalAdaptDsl.g:6661:3: ruleBooleanCondition
            {
             before(grammarAccess.getConditionalPrimaryAccess().getCondBooleanConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanCondition();

            state._fsp--;

             after(grammarAccess.getConditionalPrimaryAccess().getCondBooleanConditionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConditionalPrimary__CondAssignment_2"


    // $ANTLR start "rule__BooleanCondition__FactAssignment_0_0"
    // InternalAdaptDsl.g:6670:1: rule__BooleanCondition__FactAssignment_0_0 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6674:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:6675:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:6675:2: ( ruleFact )
            // InternalAdaptDsl.g:6676:3: ruleFact
            {
             before(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__BooleanCondition__FactAssignment_0_0"


    // $ANTLR start "rule__BooleanCondition__OpAssignment_0_1"
    // InternalAdaptDsl.g:6685:1: rule__BooleanCondition__OpAssignment_0_1 : ( ruleBoolOperators ) ;
    public final void rule__BooleanCondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6689:1: ( ( ruleBoolOperators ) )
            // InternalAdaptDsl.g:6690:2: ( ruleBoolOperators )
            {
            // InternalAdaptDsl.g:6690:2: ( ruleBoolOperators )
            // InternalAdaptDsl.g:6691:3: ruleBoolOperators
            {
             before(grammarAccess.getBooleanConditionAccess().getOpBoolOperatorsParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOperators();

            state._fsp--;

             after(grammarAccess.getBooleanConditionAccess().getOpBoolOperatorsParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__BooleanCondition__OpAssignment_0_1"


    // $ANTLR start "rule__BooleanCondition__ValAssignment_0_2"
    // InternalAdaptDsl.g:6700:1: rule__BooleanCondition__ValAssignment_0_2 : ( RULE_BOOL ) ;
    public final void rule__BooleanCondition__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6704:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:6705:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:6705:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:6706:3: RULE_BOOL
            {
             before(grammarAccess.getBooleanConditionAccess().getValBOOLTerminalRuleCall_0_2_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getBooleanConditionAccess().getValBOOLTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__BooleanCondition__ValAssignment_0_2"


    // $ANTLR start "rule__BooleanCondition__FactAssignment_1"
    // InternalAdaptDsl.g:6715:1: rule__BooleanCondition__FactAssignment_1 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6719:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:6720:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:6720:2: ( ruleFact )
            // InternalAdaptDsl.g:6721:3: ruleFact
            {
             before(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BooleanCondition__FactAssignment_1"


    // $ANTLR start "rule__NumberCondition__FactAssignment_0"
    // InternalAdaptDsl.g:6730:1: rule__NumberCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__NumberCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6734:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:6735:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:6735:2: ( ruleFact )
            // InternalAdaptDsl.g:6736:3: ruleFact
            {
             before(grammarAccess.getNumberConditionAccess().getFactFactParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getNumberConditionAccess().getFactFactParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumberCondition__FactAssignment_0"


    // $ANTLR start "rule__NumberCondition__OpAssignment_1"
    // InternalAdaptDsl.g:6745:1: rule__NumberCondition__OpAssignment_1 : ( ruleNumberOperators ) ;
    public final void rule__NumberCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6749:1: ( ( ruleNumberOperators ) )
            // InternalAdaptDsl.g:6750:2: ( ruleNumberOperators )
            {
            // InternalAdaptDsl.g:6750:2: ( ruleNumberOperators )
            // InternalAdaptDsl.g:6751:3: ruleNumberOperators
            {
             before(grammarAccess.getNumberConditionAccess().getOpNumberOperatorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumberOperators();

            state._fsp--;

             after(grammarAccess.getNumberConditionAccess().getOpNumberOperatorsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberCondition__OpAssignment_1"


    // $ANTLR start "rule__NumberCondition__ValAssignment_2"
    // InternalAdaptDsl.g:6760:1: rule__NumberCondition__ValAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6764:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:6765:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:6765:2: ( RULE_INT )
            // InternalAdaptDsl.g:6766:3: RULE_INT
            {
             before(grammarAccess.getNumberConditionAccess().getValINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberConditionAccess().getValINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__NumberCondition__ValAssignment_2"


    // $ANTLR start "rule__StringCondition__FactAssignment_0"
    // InternalAdaptDsl.g:6775:1: rule__StringCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__StringCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6779:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:6780:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:6780:2: ( ruleFact )
            // InternalAdaptDsl.g:6781:3: ruleFact
            {
             before(grammarAccess.getStringConditionAccess().getFactFactParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getStringConditionAccess().getFactFactParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__StringCondition__FactAssignment_0"


    // $ANTLR start "rule__StringCondition__OpAssignment_1"
    // InternalAdaptDsl.g:6790:1: rule__StringCondition__OpAssignment_1 : ( ruleStringOperators ) ;
    public final void rule__StringCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6794:1: ( ( ruleStringOperators ) )
            // InternalAdaptDsl.g:6795:2: ( ruleStringOperators )
            {
            // InternalAdaptDsl.g:6795:2: ( ruleStringOperators )
            // InternalAdaptDsl.g:6796:3: ruleStringOperators
            {
             before(grammarAccess.getStringConditionAccess().getOpStringOperatorsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOperators();

            state._fsp--;

             after(grammarAccess.getStringConditionAccess().getOpStringOperatorsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StringCondition__OpAssignment_1"


    // $ANTLR start "rule__StringCondition__ValAssignment_2"
    // InternalAdaptDsl.g:6805:1: rule__StringCondition__ValAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6809:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:6810:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:6810:2: ( RULE_STRING )
            // InternalAdaptDsl.g:6811:3: RULE_STRING
            {
             before(grammarAccess.getStringConditionAccess().getValSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringConditionAccess().getValSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__StringCondition__ValAssignment_2"


    // $ANTLR start "rule__Actions__ActionAssignment_0"
    // InternalAdaptDsl.g:6820:1: rule__Actions__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Actions__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6824:1: ( ( ruleAction ) )
            // InternalAdaptDsl.g:6825:2: ( ruleAction )
            {
            // InternalAdaptDsl.g:6825:2: ( ruleAction )
            // InternalAdaptDsl.g:6826:3: ruleAction
            {
             before(grammarAccess.getActionsAccess().getActionActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getActionActionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Actions__ActionAssignment_0"


    // $ANTLR start "rule__Actions__NextAssignment_1"
    // InternalAdaptDsl.g:6835:1: rule__Actions__NextAssignment_1 : ( ruleActions ) ;
    public final void rule__Actions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6839:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:6840:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:6840:2: ( ruleActions )
            // InternalAdaptDsl.g:6841:3: ruleActions
            {
             before(grammarAccess.getActionsAccess().getNextActionsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getActionsAccess().getNextActionsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actions__NextAssignment_1"


    // $ANTLR start "rule__Action__ActionCategoryAssignment_0"
    // InternalAdaptDsl.g:6850:1: rule__Action__ActionCategoryAssignment_0 : ( ruleServiceOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6854:1: ( ( ruleServiceOperation ) )
            // InternalAdaptDsl.g:6855:2: ( ruleServiceOperation )
            {
            // InternalAdaptDsl.g:6855:2: ( ruleServiceOperation )
            // InternalAdaptDsl.g:6856:3: ruleServiceOperation
            {
             before(grammarAccess.getActionAccess().getActionCategoryServiceOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceOperation();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionCategoryServiceOperationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Action__ActionCategoryAssignment_0"


    // $ANTLR start "rule__Action__ActionCategoryAssignment_1"
    // InternalAdaptDsl.g:6865:1: rule__Action__ActionCategoryAssignment_1 : ( ruleTaskChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6869:1: ( ( ruleTaskChangeOperation ) )
            // InternalAdaptDsl.g:6870:2: ( ruleTaskChangeOperation )
            {
            // InternalAdaptDsl.g:6870:2: ( ruleTaskChangeOperation )
            // InternalAdaptDsl.g:6871:3: ruleTaskChangeOperation
            {
             before(grammarAccess.getActionAccess().getActionCategoryTaskChangeOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskChangeOperation();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionCategoryTaskChangeOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Action__ActionCategoryAssignment_1"


    // $ANTLR start "rule__Action__ActionCategoryAssignment_2"
    // InternalAdaptDsl.g:6880:1: rule__Action__ActionCategoryAssignment_2 : ( ruleNavigationChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6884:1: ( ( ruleNavigationChangeOperation ) )
            // InternalAdaptDsl.g:6885:2: ( ruleNavigationChangeOperation )
            {
            // InternalAdaptDsl.g:6885:2: ( ruleNavigationChangeOperation )
            // InternalAdaptDsl.g:6886:3: ruleNavigationChangeOperation
            {
             before(grammarAccess.getActionAccess().getActionCategoryNavigationChangeOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigationChangeOperation();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionCategoryNavigationChangeOperationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Action__ActionCategoryAssignment_2"


    // $ANTLR start "rule__Action__ActionCategoryAssignment_3"
    // InternalAdaptDsl.g:6895:1: rule__Action__ActionCategoryAssignment_3 : ( ruleLayoutChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6899:1: ( ( ruleLayoutChangeOperation ) )
            // InternalAdaptDsl.g:6900:2: ( ruleLayoutChangeOperation )
            {
            // InternalAdaptDsl.g:6900:2: ( ruleLayoutChangeOperation )
            // InternalAdaptDsl.g:6901:3: ruleLayoutChangeOperation
            {
             before(grammarAccess.getActionAccess().getActionCategoryLayoutChangeOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLayoutChangeOperation();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionCategoryLayoutChangeOperationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Action__ActionCategoryAssignment_3"


    // $ANTLR start "rule__ServiceOperation__OperationAssignment_0"
    // InternalAdaptDsl.g:6910:1: rule__ServiceOperation__OperationAssignment_0 : ( ruleServiceFunctionCallOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6914:1: ( ( ruleServiceFunctionCallOperation ) )
            // InternalAdaptDsl.g:6915:2: ( ruleServiceFunctionCallOperation )
            {
            // InternalAdaptDsl.g:6915:2: ( ruleServiceFunctionCallOperation )
            // InternalAdaptDsl.g:6916:3: ruleServiceFunctionCallOperation
            {
             before(grammarAccess.getServiceOperationAccess().getOperationServiceFunctionCallOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceFunctionCallOperation();

            state._fsp--;

             after(grammarAccess.getServiceOperationAccess().getOperationServiceFunctionCallOperationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ServiceOperation__OperationAssignment_0"


    // $ANTLR start "rule__ServiceOperation__OperationAssignment_1"
    // InternalAdaptDsl.g:6925:1: rule__ServiceOperation__OperationAssignment_1 : ( ruleEditFactOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6929:1: ( ( ruleEditFactOperation ) )
            // InternalAdaptDsl.g:6930:2: ( ruleEditFactOperation )
            {
            // InternalAdaptDsl.g:6930:2: ( ruleEditFactOperation )
            // InternalAdaptDsl.g:6931:3: ruleEditFactOperation
            {
             before(grammarAccess.getServiceOperationAccess().getOperationEditFactOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEditFactOperation();

            state._fsp--;

             after(grammarAccess.getServiceOperationAccess().getOperationEditFactOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServiceOperation__OperationAssignment_1"


    // $ANTLR start "rule__ServiceOperation__OperationAssignment_2"
    // InternalAdaptDsl.g:6940:1: rule__ServiceOperation__OperationAssignment_2 : ( ruleSetDisplayPropertyOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6944:1: ( ( ruleSetDisplayPropertyOperation ) )
            // InternalAdaptDsl.g:6945:2: ( ruleSetDisplayPropertyOperation )
            {
            // InternalAdaptDsl.g:6945:2: ( ruleSetDisplayPropertyOperation )
            // InternalAdaptDsl.g:6946:3: ruleSetDisplayPropertyOperation
            {
             before(grammarAccess.getServiceOperationAccess().getOperationSetDisplayPropertyOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSetDisplayPropertyOperation();

            state._fsp--;

             after(grammarAccess.getServiceOperationAccess().getOperationSetDisplayPropertyOperationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ServiceOperation__OperationAssignment_2"


    // $ANTLR start "rule__ServiceFunctionCallOperation__ServiceAssignment_2"
    // InternalAdaptDsl.g:6955:1: rule__ServiceFunctionCallOperation__ServiceAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6959:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:6960:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:6960:2: ( RULE_ID )
            // InternalAdaptDsl.g:6961:3: RULE_ID
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getServiceIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getServiceIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__ServiceAssignment_2"


    // $ANTLR start "rule__ServiceFunctionCallOperation__FunctionAssignment_4"
    // InternalAdaptDsl.g:6970:1: rule__ServiceFunctionCallOperation__FunctionAssignment_4 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6974:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:6975:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:6975:2: ( RULE_ID )
            // InternalAdaptDsl.g:6976:3: RULE_ID
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__FunctionAssignment_4"


    // $ANTLR start "rule__ServiceFunctionCallOperation__ValAssignment_6"
    // InternalAdaptDsl.g:6985:1: rule__ServiceFunctionCallOperation__ValAssignment_6 : ( ruleValue ) ;
    public final void rule__ServiceFunctionCallOperation__ValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6989:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:6990:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:6990:2: ( ruleValue )
            // InternalAdaptDsl.g:6991:3: ruleValue
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getValValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getServiceFunctionCallOperationAccess().getValValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ServiceFunctionCallOperation__ValAssignment_6"


    // $ANTLR start "rule__EditFactOperation__PropAssignment_2"
    // InternalAdaptDsl.g:7000:1: rule__EditFactOperation__PropAssignment_2 : ( ruleFactProperty ) ;
    public final void rule__EditFactOperation__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7004:1: ( ( ruleFactProperty ) )
            // InternalAdaptDsl.g:7005:2: ( ruleFactProperty )
            {
            // InternalAdaptDsl.g:7005:2: ( ruleFactProperty )
            // InternalAdaptDsl.g:7006:3: ruleFactProperty
            {
             before(grammarAccess.getEditFactOperationAccess().getPropFactPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactProperty();

            state._fsp--;

             after(grammarAccess.getEditFactOperationAccess().getPropFactPropertyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EditFactOperation__PropAssignment_2"


    // $ANTLR start "rule__EditFactOperation__ValAssignment_3_1"
    // InternalAdaptDsl.g:7015:1: rule__EditFactOperation__ValAssignment_3_1 : ( ruleValue ) ;
    public final void rule__EditFactOperation__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7019:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:7020:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:7020:2: ( ruleValue )
            // InternalAdaptDsl.g:7021:3: ruleValue
            {
             before(grammarAccess.getEditFactOperationAccess().getValValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getEditFactOperationAccess().getValValueParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__EditFactOperation__ValAssignment_3_1"


    // $ANTLR start "rule__SetDisplayPropertyOperation__PropertyAssignment_2"
    // InternalAdaptDsl.g:7030:1: rule__SetDisplayPropertyOperation__PropertyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7034:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:7035:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:7035:2: ( RULE_STRING )
            // InternalAdaptDsl.g:7036:3: RULE_STRING
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertySTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertySTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__PropertyAssignment_2"


    // $ANTLR start "rule__SetDisplayPropertyOperation__PropertyValueAssignment_4"
    // InternalAdaptDsl.g:7045:1: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 : ( ruleDisplayPropertyValue ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7049:1: ( ( ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:7050:2: ( ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:7050:2: ( ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:7051:3: ruleDisplayPropertyValue
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueDisplayPropertyValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDisplayPropertyValue();

            state._fsp--;

             after(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueDisplayPropertyValueParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SetDisplayPropertyOperation__PropertyValueAssignment_4"


    // $ANTLR start "rule__DisplayPropertyValue__PropertyClassAssignment_0"
    // InternalAdaptDsl.g:7060:1: rule__DisplayPropertyValue__PropertyClassAssignment_0 : ( ruleIntValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7064:1: ( ( ruleIntValue ) )
            // InternalAdaptDsl.g:7065:2: ( ruleIntValue )
            {
            // InternalAdaptDsl.g:7065:2: ( ruleIntValue )
            // InternalAdaptDsl.g:7066:3: ruleIntValue
            {
             before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassIntValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassIntValueParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DisplayPropertyValue__PropertyClassAssignment_0"


    // $ANTLR start "rule__DisplayPropertyValue__PropertyClassAssignment_1"
    // InternalAdaptDsl.g:7075:1: rule__DisplayPropertyValue__PropertyClassAssignment_1 : ( ruleStringValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7079:1: ( ( ruleStringValue ) )
            // InternalAdaptDsl.g:7080:2: ( ruleStringValue )
            {
            // InternalAdaptDsl.g:7080:2: ( ruleStringValue )
            // InternalAdaptDsl.g:7081:3: ruleStringValue
            {
             before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassStringValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassStringValueParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DisplayPropertyValue__PropertyClassAssignment_1"


    // $ANTLR start "rule__DisplayPropertyValue__PropertyClassAssignment_2"
    // InternalAdaptDsl.g:7090:1: rule__DisplayPropertyValue__PropertyClassAssignment_2 : ( ruleBoolValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7094:1: ( ( ruleBoolValue ) )
            // InternalAdaptDsl.g:7095:2: ( ruleBoolValue )
            {
            // InternalAdaptDsl.g:7095:2: ( ruleBoolValue )
            // InternalAdaptDsl.g:7096:3: ruleBoolValue
            {
             before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassBoolValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolValue();

            state._fsp--;

             after(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassBoolValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DisplayPropertyValue__PropertyClassAssignment_2"


    // $ANTLR start "rule__IntValue__ValueAssignment"
    // InternalAdaptDsl.g:7105:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7109:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:7110:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:7110:2: ( RULE_INT )
            // InternalAdaptDsl.g:7111:3: RULE_INT
            {
             before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalAdaptDsl.g:7120:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7124:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:7125:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:7125:2: ( RULE_STRING )
            // InternalAdaptDsl.g:7126:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__BoolValue__ValueAssignment"
    // InternalAdaptDsl.g:7135:1: rule__BoolValue__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7139:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:7140:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:7140:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:7141:3: RULE_BOOL
            {
             before(grammarAccess.getBoolValueAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getBoolValueAccess().getValueBOOLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__BoolValue__ValueAssignment"


    // $ANTLR start "rule__TaskChangeOperation__OperationAssignment_0"
    // InternalAdaptDsl.g:7150:1: rule__TaskChangeOperation__OperationAssignment_0 : ( ruleAddViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7154:1: ( ( ruleAddViewComponentOperation ) )
            // InternalAdaptDsl.g:7155:2: ( ruleAddViewComponentOperation )
            {
            // InternalAdaptDsl.g:7155:2: ( ruleAddViewComponentOperation )
            // InternalAdaptDsl.g:7156:3: ruleAddViewComponentOperation
            {
             before(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddViewComponentOperation();

            state._fsp--;

             after(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentOperationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TaskChangeOperation__OperationAssignment_0"


    // $ANTLR start "rule__TaskChangeOperation__OperationAssignment_1"
    // InternalAdaptDsl.g:7165:1: rule__TaskChangeOperation__OperationAssignment_1 : ( ruleDeleteViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7169:1: ( ( ruleDeleteViewComponentOperation ) )
            // InternalAdaptDsl.g:7170:2: ( ruleDeleteViewComponentOperation )
            {
            // InternalAdaptDsl.g:7170:2: ( ruleDeleteViewComponentOperation )
            // InternalAdaptDsl.g:7171:3: ruleDeleteViewComponentOperation
            {
             before(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeleteViewComponentOperation();

            state._fsp--;

             after(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TaskChangeOperation__OperationAssignment_1"


    // $ANTLR start "rule__AddViewComponentOperation__ViewCompAssignment_2"
    // InternalAdaptDsl.g:7180:1: rule__AddViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7184:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:7185:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:7185:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:7186:3: ruleViewComponent
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getAddViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__ViewCompAssignment_2"


    // $ANTLR start "rule__AddViewComponentOperation__TargetAssignment_4"
    // InternalAdaptDsl.g:7195:1: rule__AddViewComponentOperation__TargetAssignment_4 : ( ruleTargetContainer ) ;
    public final void rule__AddViewComponentOperation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7199:1: ( ( ruleTargetContainer ) )
            // InternalAdaptDsl.g:7200:2: ( ruleTargetContainer )
            {
            // InternalAdaptDsl.g:7200:2: ( ruleTargetContainer )
            // InternalAdaptDsl.g:7201:3: ruleTargetContainer
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetTargetContainerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetContainer();

            state._fsp--;

             after(grammarAccess.getAddViewComponentOperationAccess().getTargetTargetContainerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AddViewComponentOperation__TargetAssignment_4"


    // $ANTLR start "rule__DeleteViewComponentOperation__ViewCompAssignment_2"
    // InternalAdaptDsl.g:7210:1: rule__DeleteViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7214:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:7215:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:7215:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:7216:3: ruleViewComponent
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeleteViewComponentOperation__ViewCompAssignment_2"


    // $ANTLR start "rule__NavigationChangeOperation__OperationAssignment_0"
    // InternalAdaptDsl.g:7225:1: rule__NavigationChangeOperation__OperationAssignment_0 : ( ruleAddNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7229:1: ( ( ruleAddNavLinkOperation ) )
            // InternalAdaptDsl.g:7230:2: ( ruleAddNavLinkOperation )
            {
            // InternalAdaptDsl.g:7230:2: ( ruleAddNavLinkOperation )
            // InternalAdaptDsl.g:7231:3: ruleAddNavLinkOperation
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getOperationAddNavLinkOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAddNavLinkOperation();

            state._fsp--;

             after(grammarAccess.getNavigationChangeOperationAccess().getOperationAddNavLinkOperationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NavigationChangeOperation__OperationAssignment_0"


    // $ANTLR start "rule__NavigationChangeOperation__OperationAssignment_1"
    // InternalAdaptDsl.g:7240:1: rule__NavigationChangeOperation__OperationAssignment_1 : ( ruleDeleteNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7244:1: ( ( ruleDeleteNavLinkOperation ) )
            // InternalAdaptDsl.g:7245:2: ( ruleDeleteNavLinkOperation )
            {
            // InternalAdaptDsl.g:7245:2: ( ruleDeleteNavLinkOperation )
            // InternalAdaptDsl.g:7246:3: ruleDeleteNavLinkOperation
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getOperationDeleteNavLinkOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeleteNavLinkOperation();

            state._fsp--;

             after(grammarAccess.getNavigationChangeOperationAccess().getOperationDeleteNavLinkOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NavigationChangeOperation__OperationAssignment_1"


    // $ANTLR start "rule__NavigationChangeOperation__OperationAssignment_2"
    // InternalAdaptDsl.g:7255:1: rule__NavigationChangeOperation__OperationAssignment_2 : ( ruleRedirectNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7259:1: ( ( ruleRedirectNavLinkOperation ) )
            // InternalAdaptDsl.g:7260:2: ( ruleRedirectNavLinkOperation )
            {
            // InternalAdaptDsl.g:7260:2: ( ruleRedirectNavLinkOperation )
            // InternalAdaptDsl.g:7261:3: ruleRedirectNavLinkOperation
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getOperationRedirectNavLinkOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRedirectNavLinkOperation();

            state._fsp--;

             after(grammarAccess.getNavigationChangeOperationAccess().getOperationRedirectNavLinkOperationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NavigationChangeOperation__OperationAssignment_2"


    // $ANTLR start "rule__NavigationChangeOperation__OperationAssignment_3"
    // InternalAdaptDsl.g:7270:1: rule__NavigationChangeOperation__OperationAssignment_3 : ( ruleClearNavOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7274:1: ( ( ruleClearNavOperation ) )
            // InternalAdaptDsl.g:7275:2: ( ruleClearNavOperation )
            {
            // InternalAdaptDsl.g:7275:2: ( ruleClearNavOperation )
            // InternalAdaptDsl.g:7276:3: ruleClearNavOperation
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getOperationClearNavOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClearNavOperation();

            state._fsp--;

             after(grammarAccess.getNavigationChangeOperationAccess().getOperationClearNavOperationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NavigationChangeOperation__OperationAssignment_3"


    // $ANTLR start "rule__AddNavLinkOperation__ViewCompAssignment_2"
    // InternalAdaptDsl.g:7285:1: rule__AddNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7289:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:7290:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:7290:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:7291:3: ruleViewComponent
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getAddNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__ViewCompAssignment_2"


    // $ANTLR start "rule__AddNavLinkOperation__TextAssignment_4"
    // InternalAdaptDsl.g:7300:1: rule__AddNavLinkOperation__TextAssignment_4 : ( ruleText ) ;
    public final void rule__AddNavLinkOperation__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7304:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:7305:2: ( ruleText )
            {
            // InternalAdaptDsl.g:7305:2: ( ruleText )
            // InternalAdaptDsl.g:7306:3: ruleText
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getAddNavLinkOperationAccess().getTextTextParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AddNavLinkOperation__TextAssignment_4"


    // $ANTLR start "rule__DeleteNavLinkOperation__ViewCompAssignment_2"
    // InternalAdaptDsl.g:7315:1: rule__DeleteNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7319:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:7320:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:7320:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:7321:3: ruleViewComponent
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeleteNavLinkOperation__ViewCompAssignment_2"


    // $ANTLR start "rule__RedirectNavLinkOperation__ViewCompAssignment_2"
    // InternalAdaptDsl.g:7330:1: rule__RedirectNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__RedirectNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7334:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:7335:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:7335:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:7336:3: ruleViewComponent
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RedirectNavLinkOperation__ViewCompAssignment_2"


    // $ANTLR start "rule__LayoutChangeOperation__OperationAssignment_0"
    // InternalAdaptDsl.g:7345:1: rule__LayoutChangeOperation__OperationAssignment_0 : ( ruleChangeFontOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7349:1: ( ( ruleChangeFontOperation ) )
            // InternalAdaptDsl.g:7350:2: ( ruleChangeFontOperation )
            {
            // InternalAdaptDsl.g:7350:2: ( ruleChangeFontOperation )
            // InternalAdaptDsl.g:7351:3: ruleChangeFontOperation
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontOperationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChangeFontOperation();

            state._fsp--;

             after(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontOperationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LayoutChangeOperation__OperationAssignment_0"


    // $ANTLR start "rule__LayoutChangeOperation__OperationAssignment_1"
    // InternalAdaptDsl.g:7360:1: rule__LayoutChangeOperation__OperationAssignment_1 : ( ruleChangeFontSizeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7364:1: ( ( ruleChangeFontSizeOperation ) )
            // InternalAdaptDsl.g:7365:2: ( ruleChangeFontSizeOperation )
            {
            // InternalAdaptDsl.g:7365:2: ( ruleChangeFontSizeOperation )
            // InternalAdaptDsl.g:7366:3: ruleChangeFontSizeOperation
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontSizeOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChangeFontSizeOperation();

            state._fsp--;

             after(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontSizeOperationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LayoutChangeOperation__OperationAssignment_1"


    // $ANTLR start "rule__LayoutChangeOperation__OperationAssignment_2"
    // InternalAdaptDsl.g:7375:1: rule__LayoutChangeOperation__OperationAssignment_2 : ( ruleChangeTableCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7379:1: ( ( ruleChangeTableCssClassOperation ) )
            // InternalAdaptDsl.g:7380:2: ( ruleChangeTableCssClassOperation )
            {
            // InternalAdaptDsl.g:7380:2: ( ruleChangeTableCssClassOperation )
            // InternalAdaptDsl.g:7381:3: ruleChangeTableCssClassOperation
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeTableCssClassOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleChangeTableCssClassOperation();

            state._fsp--;

             after(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeTableCssClassOperationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LayoutChangeOperation__OperationAssignment_2"


    // $ANTLR start "rule__LayoutChangeOperation__OperationAssignment_3"
    // InternalAdaptDsl.g:7390:1: rule__LayoutChangeOperation__OperationAssignment_3 : ( ruleAdaptCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7394:1: ( ( ruleAdaptCssClassOperation ) )
            // InternalAdaptDsl.g:7395:2: ( ruleAdaptCssClassOperation )
            {
            // InternalAdaptDsl.g:7395:2: ( ruleAdaptCssClassOperation )
            // InternalAdaptDsl.g:7396:3: ruleAdaptCssClassOperation
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getOperationAdaptCssClassOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAdaptCssClassOperation();

            state._fsp--;

             after(grammarAccess.getLayoutChangeOperationAccess().getOperationAdaptCssClassOperationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LayoutChangeOperation__OperationAssignment_3"


    // $ANTLR start "rule__LayoutChangeOperation__OperationAssignment_4"
    // InternalAdaptDsl.g:7405:1: rule__LayoutChangeOperation__OperationAssignment_4 : ( ruleChangeColorSchemeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7409:1: ( ( ruleChangeColorSchemeOperation ) )
            // InternalAdaptDsl.g:7410:2: ( ruleChangeColorSchemeOperation )
            {
            // InternalAdaptDsl.g:7410:2: ( ruleChangeColorSchemeOperation )
            // InternalAdaptDsl.g:7411:3: ruleChangeColorSchemeOperation
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeColorSchemeOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleChangeColorSchemeOperation();

            state._fsp--;

             after(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeColorSchemeOperationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LayoutChangeOperation__OperationAssignment_4"


    // $ANTLR start "rule__ChangeFontSizeOperation__SizePrimaryAssignment_2"
    // InternalAdaptDsl.g:7420:1: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizePrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7424:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:7425:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:7425:2: ( ruleFontSize )
            // InternalAdaptDsl.g:7426:3: ruleFontSize
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryFontSizeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryFontSizeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__SizePrimaryAssignment_2"


    // $ANTLR start "rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4"
    // InternalAdaptDsl.g:7435:1: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7439:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:7440:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:7440:2: ( ruleFontSize )
            // InternalAdaptDsl.g:7441:3: ruleFontSize
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryFontSizeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryFontSizeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4"


    // $ANTLR start "rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2"
    // InternalAdaptDsl.g:7450:1: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7454:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:7455:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:7455:2: ( ruleColor )
            // InternalAdaptDsl.g:7456:3: ruleColor
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryColorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryColorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2"


    // $ANTLR start "rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4"
    // InternalAdaptDsl.g:7465:1: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7469:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:7470:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:7470:2: ( ruleColor )
            // InternalAdaptDsl.g:7471:3: ruleColor
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryColorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryColorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4"


    // $ANTLR start "rule__ChangeFontOperation__TextAssignment_2"
    // InternalAdaptDsl.g:7480:1: rule__ChangeFontOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeFontOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7484:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:7485:2: ( ruleText )
            {
            // InternalAdaptDsl.g:7485:2: ( ruleText )
            // InternalAdaptDsl.g:7486:3: ruleText
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getChangeFontOperationAccess().getTextTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChangeFontOperation__TextAssignment_2"


    // $ANTLR start "rule__ChangeTableCssClassOperation__TextAssignment_2"
    // InternalAdaptDsl.g:7495:1: rule__ChangeTableCssClassOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeTableCssClassOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7499:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:7500:2: ( ruleText )
            {
            // InternalAdaptDsl.g:7500:2: ( ruleText )
            // InternalAdaptDsl.g:7501:3: ruleText
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getChangeTableCssClassOperationAccess().getTextTextParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChangeTableCssClassOperation__TextAssignment_2"


    // $ANTLR start "rule__AdaptCssClassOperation__CssClassAssignment_2"
    // InternalAdaptDsl.g:7510:1: rule__AdaptCssClassOperation__CssClassAssignment_2 : ( ruleCssClass ) ;
    public final void rule__AdaptCssClassOperation__CssClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7514:1: ( ( ruleCssClass ) )
            // InternalAdaptDsl.g:7515:2: ( ruleCssClass )
            {
            // InternalAdaptDsl.g:7515:2: ( ruleCssClass )
            // InternalAdaptDsl.g:7516:3: ruleCssClass
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssClassCssClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCssClass();

            state._fsp--;

             after(grammarAccess.getAdaptCssClassOperationAccess().getCssClassCssClassParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__CssClassAssignment_2"


    // $ANTLR start "rule__AdaptCssClassOperation__CssAttributeAssignment_4"
    // InternalAdaptDsl.g:7525:1: rule__AdaptCssClassOperation__CssAttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7529:1: ( ( ruleAttribute ) )
            // InternalAdaptDsl.g:7530:2: ( ruleAttribute )
            {
            // InternalAdaptDsl.g:7530:2: ( ruleAttribute )
            // InternalAdaptDsl.g:7531:3: ruleAttribute
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__CssAttributeAssignment_4"


    // $ANTLR start "rule__AdaptCssClassOperation__CssAttributeValueAssignment_6"
    // InternalAdaptDsl.g:7540:1: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 : ( ruleAttributeValue ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7544:1: ( ( ruleAttributeValue ) )
            // InternalAdaptDsl.g:7545:2: ( ruleAttributeValue )
            {
            // InternalAdaptDsl.g:7545:2: ( ruleAttributeValue )
            // InternalAdaptDsl.g:7546:3: ruleAttributeValue
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAttributeValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAttributeValueParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AdaptCssClassOperation__CssAttributeValueAssignment_6"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\2\10\6\uffff\1\10\1\uffff\1\10";
    static final String dfa_3s = "\1\4\2\14\1\4\1\uffff\3\5\1\uffff\1\14\1\uffff\1\14";
    static final String dfa_4s = "\1\4\2\46\1\4\1\uffff\2\7\1\6\1\uffff\1\46\1\uffff\1\46";
    static final String dfa_5s = "\4\uffff\1\2\3\uffff\1\3\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\2\4\1\5\1\6\2\4\1\7\15\uffff\1\10\2\uffff\2\10\1\2\1\3",
            "\2\4\1\5\1\6\2\4\1\7\15\uffff\1\10\2\uffff\2\10\1\uffff\1\3",
            "\1\11",
            "",
            "\1\12\1\4\1\10",
            "\1\12\1\4\1\10",
            "\1\12\1\4",
            "",
            "\2\4\1\5\1\6\2\4\1\7\15\uffff\1\10\2\uffff\2\10\1\13\1\3",
            "",
            "\2\4\1\5\1\6\2\4\1\7\15\uffff\1\10\2\uffff\2\10\1\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1302:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\2\5\3\uffff\2\5";
    static final String dfa_10s = "\1\4\2\16\1\4\2\uffff\2\16";
    static final String dfa_11s = "\1\4\2\46\1\4\2\uffff\2\46";
    static final String dfa_12s = "\4\uffff\1\1\1\2\2\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\2\4\20\uffff\1\5\2\uffff\2\5\1\2\1\3",
            "\2\4\20\uffff\1\5\2\uffff\2\5\1\uffff\1\3",
            "\1\6",
            "",
            "",
            "\2\4\20\uffff\1\5\2\uffff\2\5\1\7\1\3",
            "\2\4\20\uffff\1\5\2\uffff\2\5\1\uffff\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1329:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x003FFE8000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001E00000000000L});

}