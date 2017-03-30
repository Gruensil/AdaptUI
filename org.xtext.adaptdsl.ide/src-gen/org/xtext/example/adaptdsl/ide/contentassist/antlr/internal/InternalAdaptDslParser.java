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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'string'", "'number'", "'bool'", "'flow'", "'{'", "'};'", "'Services{'", "'}'", "'Types{'", "';'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'||'", "'&&'", "'()'", "'.'", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "'name'", "':'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
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


    // $ANTLR start "entryRuleAddViewComponentButtonOperation"
    // InternalAdaptDsl.g:803:1: entryRuleAddViewComponentButtonOperation : ruleAddViewComponentButtonOperation EOF ;
    public final void entryRuleAddViewComponentButtonOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:804:1: ( ruleAddViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:805:1: ruleAddViewComponentButtonOperation EOF
            {
             before(grammarAccess.getAddViewComponentButtonOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleAddViewComponentButtonOperation();

            state._fsp--;

             after(grammarAccess.getAddViewComponentButtonOperationRule()); 
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
    // $ANTLR end "entryRuleAddViewComponentButtonOperation"


    // $ANTLR start "ruleAddViewComponentButtonOperation"
    // InternalAdaptDsl.g:812:1: ruleAddViewComponentButtonOperation : ( ( rule__AddViewComponentButtonOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentButtonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:816:2: ( ( ( rule__AddViewComponentButtonOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:817:2: ( ( rule__AddViewComponentButtonOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:817:2: ( ( rule__AddViewComponentButtonOperation__Group__0 ) )
            // InternalAdaptDsl.g:818:3: ( rule__AddViewComponentButtonOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:819:3: ( rule__AddViewComponentButtonOperation__Group__0 )
            // InternalAdaptDsl.g:819:4: rule__AddViewComponentButtonOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentButtonOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddViewComponentButtonOperation"


    // $ANTLR start "entryRuleDeleteViewComponentButtonOperation"
    // InternalAdaptDsl.g:828:1: entryRuleDeleteViewComponentButtonOperation : ruleDeleteViewComponentButtonOperation EOF ;
    public final void entryRuleDeleteViewComponentButtonOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:829:1: ( ruleDeleteViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:830:1: ruleDeleteViewComponentButtonOperation EOF
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteViewComponentButtonOperation();

            state._fsp--;

             after(grammarAccess.getDeleteViewComponentButtonOperationRule()); 
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
    // $ANTLR end "entryRuleDeleteViewComponentButtonOperation"


    // $ANTLR start "ruleDeleteViewComponentButtonOperation"
    // InternalAdaptDsl.g:837:1: ruleDeleteViewComponentButtonOperation : ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentButtonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:841:2: ( ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:842:2: ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:842:2: ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) )
            // InternalAdaptDsl.g:843:3: ( rule__DeleteViewComponentButtonOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:844:3: ( rule__DeleteViewComponentButtonOperation__Group__0 )
            // InternalAdaptDsl.g:844:4: rule__DeleteViewComponentButtonOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteViewComponentButtonOperation"


    // $ANTLR start "entryRuleViewComponent"
    // InternalAdaptDsl.g:853:1: entryRuleViewComponent : ruleViewComponent EOF ;
    public final void entryRuleViewComponent() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:854:1: ( ruleViewComponent EOF )
            // InternalAdaptDsl.g:855:1: ruleViewComponent EOF
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
    // InternalAdaptDsl.g:862:1: ruleViewComponent : ( RULE_ID ) ;
    public final void ruleViewComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:866:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:867:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:867:2: ( RULE_ID )
            // InternalAdaptDsl.g:868:3: RULE_ID
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
    // InternalAdaptDsl.g:878:1: entryRuleTargetContainer : ruleTargetContainer EOF ;
    public final void entryRuleTargetContainer() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:879:1: ( ruleTargetContainer EOF )
            // InternalAdaptDsl.g:880:1: ruleTargetContainer EOF
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
    // InternalAdaptDsl.g:887:1: ruleTargetContainer : ( RULE_ID ) ;
    public final void ruleTargetContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:891:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:892:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:892:2: ( RULE_ID )
            // InternalAdaptDsl.g:893:3: RULE_ID
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
    // InternalAdaptDsl.g:903:1: entryRuleNavigationChangeOperation : ruleNavigationChangeOperation EOF ;
    public final void entryRuleNavigationChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:904:1: ( ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:905:1: ruleNavigationChangeOperation EOF
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
    // InternalAdaptDsl.g:912:1: ruleNavigationChangeOperation : ( ( rule__NavigationChangeOperation__Alternatives ) ) ;
    public final void ruleNavigationChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:916:2: ( ( ( rule__NavigationChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:917:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:917:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:918:3: ( rule__NavigationChangeOperation__Alternatives )
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:919:3: ( rule__NavigationChangeOperation__Alternatives )
            // InternalAdaptDsl.g:919:4: rule__NavigationChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:928:1: entryRuleAddNavLinkOperation : ruleAddNavLinkOperation EOF ;
    public final void entryRuleAddNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:929:1: ( ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:930:1: ruleAddNavLinkOperation EOF
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
    // InternalAdaptDsl.g:937:1: ruleAddNavLinkOperation : ( ( rule__AddNavLinkOperation__Group__0 ) ) ;
    public final void ruleAddNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:941:2: ( ( ( rule__AddNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:942:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:942:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:943:3: ( rule__AddNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:944:3: ( rule__AddNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:944:4: rule__AddNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:953:1: entryRuleDeleteNavLinkOperation : ruleDeleteNavLinkOperation EOF ;
    public final void entryRuleDeleteNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:954:1: ( ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:955:1: ruleDeleteNavLinkOperation EOF
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
    // InternalAdaptDsl.g:962:1: ruleDeleteNavLinkOperation : ( ( rule__DeleteNavLinkOperation__Group__0 ) ) ;
    public final void ruleDeleteNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:966:2: ( ( ( rule__DeleteNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:967:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:967:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:968:3: ( rule__DeleteNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:969:3: ( rule__DeleteNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:969:4: rule__DeleteNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:978:1: entryRuleRedirectNavLinkOperation : ruleRedirectNavLinkOperation EOF ;
    public final void entryRuleRedirectNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:979:1: ( ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:980:1: ruleRedirectNavLinkOperation EOF
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
    // InternalAdaptDsl.g:987:1: ruleRedirectNavLinkOperation : ( ( rule__RedirectNavLinkOperation__Group__0 ) ) ;
    public final void ruleRedirectNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:991:2: ( ( ( rule__RedirectNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:992:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:992:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:993:3: ( rule__RedirectNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:994:3: ( rule__RedirectNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:994:4: rule__RedirectNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:1003:1: entryRuleClearNavOperation : ruleClearNavOperation EOF ;
    public final void entryRuleClearNavOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1004:1: ( ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:1005:1: ruleClearNavOperation EOF
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
    // InternalAdaptDsl.g:1012:1: ruleClearNavOperation : ( ( rule__ClearNavOperation__Group__0 ) ) ;
    public final void ruleClearNavOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1016:2: ( ( ( rule__ClearNavOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1017:2: ( ( rule__ClearNavOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1017:2: ( ( rule__ClearNavOperation__Group__0 ) )
            // InternalAdaptDsl.g:1018:3: ( rule__ClearNavOperation__Group__0 )
            {
             before(grammarAccess.getClearNavOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1019:3: ( rule__ClearNavOperation__Group__0 )
            // InternalAdaptDsl.g:1019:4: rule__ClearNavOperation__Group__0
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
    // InternalAdaptDsl.g:1028:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1029:1: ( ruleText EOF )
            // InternalAdaptDsl.g:1030:1: ruleText EOF
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
    // InternalAdaptDsl.g:1037:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1041:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1042:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1042:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1043:3: RULE_STRING
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
    // InternalAdaptDsl.g:1053:1: entryRuleLayoutChangeOperation : ruleLayoutChangeOperation EOF ;
    public final void entryRuleLayoutChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1054:1: ( ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:1055:1: ruleLayoutChangeOperation EOF
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
    // InternalAdaptDsl.g:1062:1: ruleLayoutChangeOperation : ( ( rule__LayoutChangeOperation__Alternatives ) ) ;
    public final void ruleLayoutChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1066:2: ( ( ( rule__LayoutChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:1067:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:1067:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:1068:3: ( rule__LayoutChangeOperation__Alternatives )
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1069:3: ( rule__LayoutChangeOperation__Alternatives )
            // InternalAdaptDsl.g:1069:4: rule__LayoutChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:1078:1: entryRuleChangeFontSizeOperation : ruleChangeFontSizeOperation EOF ;
    public final void entryRuleChangeFontSizeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1079:1: ( ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:1080:1: ruleChangeFontSizeOperation EOF
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
    // InternalAdaptDsl.g:1087:1: ruleChangeFontSizeOperation : ( ( rule__ChangeFontSizeOperation__Group__0 ) ) ;
    public final void ruleChangeFontSizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1091:2: ( ( ( rule__ChangeFontSizeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1092:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1092:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            // InternalAdaptDsl.g:1093:3: ( rule__ChangeFontSizeOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1094:3: ( rule__ChangeFontSizeOperation__Group__0 )
            // InternalAdaptDsl.g:1094:4: rule__ChangeFontSizeOperation__Group__0
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
    // InternalAdaptDsl.g:1103:1: entryRuleChangeColorSchemeOperation : ruleChangeColorSchemeOperation EOF ;
    public final void entryRuleChangeColorSchemeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1104:1: ( ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:1105:1: ruleChangeColorSchemeOperation EOF
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
    // InternalAdaptDsl.g:1112:1: ruleChangeColorSchemeOperation : ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) ;
    public final void ruleChangeColorSchemeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1116:2: ( ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1117:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1117:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            // InternalAdaptDsl.g:1118:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1119:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            // InternalAdaptDsl.g:1119:4: rule__ChangeColorSchemeOperation__Group__0
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
    // InternalAdaptDsl.g:1128:1: entryRuleChangeFontOperation : ruleChangeFontOperation EOF ;
    public final void entryRuleChangeFontOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1129:1: ( ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:1130:1: ruleChangeFontOperation EOF
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
    // InternalAdaptDsl.g:1137:1: ruleChangeFontOperation : ( ( rule__ChangeFontOperation__Group__0 ) ) ;
    public final void ruleChangeFontOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1141:2: ( ( ( rule__ChangeFontOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1142:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1142:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            // InternalAdaptDsl.g:1143:3: ( rule__ChangeFontOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1144:3: ( rule__ChangeFontOperation__Group__0 )
            // InternalAdaptDsl.g:1144:4: rule__ChangeFontOperation__Group__0
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
    // InternalAdaptDsl.g:1153:1: entryRuleChangeTableCssClassOperation : ruleChangeTableCssClassOperation EOF ;
    public final void entryRuleChangeTableCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1154:1: ( ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:1155:1: ruleChangeTableCssClassOperation EOF
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
    // InternalAdaptDsl.g:1162:1: ruleChangeTableCssClassOperation : ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) ;
    public final void ruleChangeTableCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1166:2: ( ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1167:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1167:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:1168:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1169:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:1169:4: rule__ChangeTableCssClassOperation__Group__0
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
    // InternalAdaptDsl.g:1178:1: entryRuleAdaptCssClassOperation : ruleAdaptCssClassOperation EOF ;
    public final void entryRuleAdaptCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1179:1: ( ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:1180:1: ruleAdaptCssClassOperation EOF
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
    // InternalAdaptDsl.g:1187:1: ruleAdaptCssClassOperation : ( ( rule__AdaptCssClassOperation__Group__0 ) ) ;
    public final void ruleAdaptCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1191:2: ( ( ( rule__AdaptCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1192:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1192:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:1193:3: ( rule__AdaptCssClassOperation__Group__0 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1194:3: ( rule__AdaptCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:1194:4: rule__AdaptCssClassOperation__Group__0
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
    // InternalAdaptDsl.g:1203:1: entryRuleCssClass : ruleCssClass EOF ;
    public final void entryRuleCssClass() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1204:1: ( ruleCssClass EOF )
            // InternalAdaptDsl.g:1205:1: ruleCssClass EOF
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
    // InternalAdaptDsl.g:1212:1: ruleCssClass : ( RULE_STRING ) ;
    public final void ruleCssClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1216:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1217:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1217:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1218:3: RULE_STRING
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
    // InternalAdaptDsl.g:1228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1229:1: ( ruleAttribute EOF )
            // InternalAdaptDsl.g:1230:1: ruleAttribute EOF
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
    // InternalAdaptDsl.g:1237:1: ruleAttribute : ( RULE_STRING ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1241:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1242:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1242:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1243:3: RULE_STRING
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
    // InternalAdaptDsl.g:1253:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1254:1: ( ruleAttributeValue EOF )
            // InternalAdaptDsl.g:1255:1: ruleAttributeValue EOF
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
    // InternalAdaptDsl.g:1262:1: ruleAttributeValue : ( RULE_STRING ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1266:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1267:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1267:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1268:3: RULE_STRING
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
    // InternalAdaptDsl.g:1278:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1279:1: ( ruleColor EOF )
            // InternalAdaptDsl.g:1280:1: ruleColor EOF
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
    // InternalAdaptDsl.g:1287:1: ruleColor : ( RULE_STRING ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1291:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1292:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1292:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1293:3: RULE_STRING
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
    // InternalAdaptDsl.g:1303:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1304:1: ( ruleFontSize EOF )
            // InternalAdaptDsl.g:1305:1: ruleFontSize EOF
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
    // InternalAdaptDsl.g:1312:1: ruleFontSize : ( RULE_INT ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1316:2: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:1317:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:1317:2: ( RULE_INT )
            // InternalAdaptDsl.g:1318:3: RULE_INT
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
    // InternalAdaptDsl.g:1328:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1329:1: ( ruleValue EOF )
            // InternalAdaptDsl.g:1330:1: ruleValue EOF
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
    // InternalAdaptDsl.g:1337:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1341:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAdaptDsl.g:1342:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAdaptDsl.g:1342:2: ( ( rule__Value__Alternatives ) )
            // InternalAdaptDsl.g:1343:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1344:3: ( rule__Value__Alternatives )
            // InternalAdaptDsl.g:1344:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleEntity"
    // InternalAdaptDsl.g:1353:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1354:1: ( ruleEntity EOF )
            // InternalAdaptDsl.g:1355:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAdaptDsl.g:1362:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1366:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAdaptDsl.g:1367:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAdaptDsl.g:1367:2: ( ( rule__Entity__Group__0 ) )
            // InternalAdaptDsl.g:1368:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAdaptDsl.g:1369:3: ( rule__Entity__Group__0 )
            // InternalAdaptDsl.g:1369:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalAdaptDsl.g:1378:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1379:1: ( ruleProperty EOF )
            // InternalAdaptDsl.g:1380:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalAdaptDsl.g:1387:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1391:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalAdaptDsl.g:1392:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalAdaptDsl.g:1392:2: ( ( rule__Property__Group__0 ) )
            // InternalAdaptDsl.g:1393:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalAdaptDsl.g:1394:3: ( rule__Property__Group__0 )
            // InternalAdaptDsl.g:1394:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleProvider"
    // InternalAdaptDsl.g:1403:1: entryRuleProvider : ruleProvider EOF ;
    public final void entryRuleProvider() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1404:1: ( ruleProvider EOF )
            // InternalAdaptDsl.g:1405:1: ruleProvider EOF
            {
             before(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getProviderRule()); 
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
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalAdaptDsl.g:1412:1: ruleProvider : ( ( rule__Provider__NameAssignment ) ) ;
    public final void ruleProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1416:2: ( ( ( rule__Provider__NameAssignment ) ) )
            // InternalAdaptDsl.g:1417:2: ( ( rule__Provider__NameAssignment ) )
            {
            // InternalAdaptDsl.g:1417:2: ( ( rule__Provider__NameAssignment ) )
            // InternalAdaptDsl.g:1418:3: ( rule__Provider__NameAssignment )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment()); 
            // InternalAdaptDsl.g:1419:3: ( rule__Provider__NameAssignment )
            // InternalAdaptDsl.g:1419:4: rule__Provider__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Provider__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProviderAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleDefTypes"
    // InternalAdaptDsl.g:1428:1: entryRuleDefTypes : ruleDefTypes EOF ;
    public final void entryRuleDefTypes() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1429:1: ( ruleDefTypes EOF )
            // InternalAdaptDsl.g:1430:1: ruleDefTypes EOF
            {
             before(grammarAccess.getDefTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleDefTypes();

            state._fsp--;

             after(grammarAccess.getDefTypesRule()); 
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
    // $ANTLR end "entryRuleDefTypes"


    // $ANTLR start "ruleDefTypes"
    // InternalAdaptDsl.g:1437:1: ruleDefTypes : ( ( rule__DefTypes__Group__0 ) ) ;
    public final void ruleDefTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1441:2: ( ( ( rule__DefTypes__Group__0 ) ) )
            // InternalAdaptDsl.g:1442:2: ( ( rule__DefTypes__Group__0 ) )
            {
            // InternalAdaptDsl.g:1442:2: ( ( rule__DefTypes__Group__0 ) )
            // InternalAdaptDsl.g:1443:3: ( rule__DefTypes__Group__0 )
            {
             before(grammarAccess.getDefTypesAccess().getGroup()); 
            // InternalAdaptDsl.g:1444:3: ( rule__DefTypes__Group__0 )
            // InternalAdaptDsl.g:1444:4: rule__DefTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefTypes"


    // $ANTLR start "entryRuleDefType"
    // InternalAdaptDsl.g:1453:1: entryRuleDefType : ruleDefType EOF ;
    public final void entryRuleDefType() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1454:1: ( ruleDefType EOF )
            // InternalAdaptDsl.g:1455:1: ruleDefType EOF
            {
             before(grammarAccess.getDefTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefType();

            state._fsp--;

             after(grammarAccess.getDefTypeRule()); 
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
    // $ANTLR end "entryRuleDefType"


    // $ANTLR start "ruleDefType"
    // InternalAdaptDsl.g:1462:1: ruleDefType : ( ( rule__DefType__Group__0 ) ) ;
    public final void ruleDefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1466:2: ( ( ( rule__DefType__Group__0 ) ) )
            // InternalAdaptDsl.g:1467:2: ( ( rule__DefType__Group__0 ) )
            {
            // InternalAdaptDsl.g:1467:2: ( ( rule__DefType__Group__0 ) )
            // InternalAdaptDsl.g:1468:3: ( rule__DefType__Group__0 )
            {
             before(grammarAccess.getDefTypeAccess().getGroup()); 
            // InternalAdaptDsl.g:1469:3: ( rule__DefType__Group__0 )
            // InternalAdaptDsl.g:1469:4: rule__DefType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefType"


    // $ANTLR start "entryRuleEnums"
    // InternalAdaptDsl.g:1478:1: entryRuleEnums : ruleEnums EOF ;
    public final void entryRuleEnums() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1479:1: ( ruleEnums EOF )
            // InternalAdaptDsl.g:1480:1: ruleEnums EOF
            {
             before(grammarAccess.getEnumsRule()); 
            pushFollow(FOLLOW_1);
            ruleEnums();

            state._fsp--;

             after(grammarAccess.getEnumsRule()); 
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
    // $ANTLR end "entryRuleEnums"


    // $ANTLR start "ruleEnums"
    // InternalAdaptDsl.g:1487:1: ruleEnums : ( ( rule__Enums__Group__0 ) ) ;
    public final void ruleEnums() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1491:2: ( ( ( rule__Enums__Group__0 ) ) )
            // InternalAdaptDsl.g:1492:2: ( ( rule__Enums__Group__0 ) )
            {
            // InternalAdaptDsl.g:1492:2: ( ( rule__Enums__Group__0 ) )
            // InternalAdaptDsl.g:1493:3: ( rule__Enums__Group__0 )
            {
             before(grammarAccess.getEnumsAccess().getGroup()); 
            // InternalAdaptDsl.g:1494:3: ( rule__Enums__Group__0 )
            // InternalAdaptDsl.g:1494:4: rule__Enums__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enums__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnums"


    // $ANTLR start "entryRuleEnum"
    // InternalAdaptDsl.g:1503:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1504:1: ( ruleEnum EOF )
            // InternalAdaptDsl.g:1505:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalAdaptDsl.g:1512:1: ruleEnum : ( ( rule__Enum__NameAssignment ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1516:2: ( ( ( rule__Enum__NameAssignment ) ) )
            // InternalAdaptDsl.g:1517:2: ( ( rule__Enum__NameAssignment ) )
            {
            // InternalAdaptDsl.g:1517:2: ( ( rule__Enum__NameAssignment ) )
            // InternalAdaptDsl.g:1518:3: ( rule__Enum__NameAssignment )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment()); 
            // InternalAdaptDsl.g:1519:3: ( rule__Enum__NameAssignment )
            // InternalAdaptDsl.g:1519:4: rule__Enum__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Enum__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "ruleTYPE"
    // InternalAdaptDsl.g:1528:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1532:1: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalAdaptDsl.g:1533:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalAdaptDsl.g:1533:2: ( ( rule__TYPE__Alternatives ) )
            // InternalAdaptDsl.g:1534:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1535:3: ( rule__TYPE__Alternatives )
            // InternalAdaptDsl.g:1535:4: rule__TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "rule__ConditionalPrimary__Alternatives"
    // InternalAdaptDsl.g:1543:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );
    public final void rule__ConditionalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1547:1: ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:1548:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1548:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    // InternalAdaptDsl.g:1549:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_0()); 
                    // InternalAdaptDsl.g:1550:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    // InternalAdaptDsl.g:1550:4: rule__ConditionalPrimary__CondAssignment_0
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
                    // InternalAdaptDsl.g:1554:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1554:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    // InternalAdaptDsl.g:1555:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_1()); 
                    // InternalAdaptDsl.g:1556:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    // InternalAdaptDsl.g:1556:4: rule__ConditionalPrimary__CondAssignment_1
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
                    // InternalAdaptDsl.g:1560:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1560:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    // InternalAdaptDsl.g:1561:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_2()); 
                    // InternalAdaptDsl.g:1562:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    // InternalAdaptDsl.g:1562:4: rule__ConditionalPrimary__CondAssignment_2
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
    // InternalAdaptDsl.g:1570:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );
    public final void rule__BooleanCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1574:1: ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptDsl.g:1575:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    {
                    // InternalAdaptDsl.g:1575:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    // InternalAdaptDsl.g:1576:3: ( rule__BooleanCondition__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getGroup_0()); 
                    // InternalAdaptDsl.g:1577:3: ( rule__BooleanCondition__Group_0__0 )
                    // InternalAdaptDsl.g:1577:4: rule__BooleanCondition__Group_0__0
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
                    // InternalAdaptDsl.g:1581:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1581:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    // InternalAdaptDsl.g:1582:3: ( rule__BooleanCondition__FactAssignment_1 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getFactAssignment_1()); 
                    // InternalAdaptDsl.g:1583:3: ( rule__BooleanCondition__FactAssignment_1 )
                    // InternalAdaptDsl.g:1583:4: rule__BooleanCondition__FactAssignment_1
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
    // InternalAdaptDsl.g:1591:1: rule__NumberOperators__Alternatives : ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) );
    public final void rule__NumberOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1595:1: ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) )
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
                    // InternalAdaptDsl.g:1596:2: ( '>' )
                    {
                    // InternalAdaptDsl.g:1596:2: ( '>' )
                    // InternalAdaptDsl.g:1597:3: '>'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1602:2: ( '<' )
                    {
                    // InternalAdaptDsl.g:1602:2: ( '<' )
                    // InternalAdaptDsl.g:1603:3: '<'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1608:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1608:2: ( '==' )
                    // InternalAdaptDsl.g:1609:3: '=='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1614:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1614:2: ( '!=' )
                    // InternalAdaptDsl.g:1615:3: '!='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1620:2: ( '>=' )
                    {
                    // InternalAdaptDsl.g:1620:2: ( '>=' )
                    // InternalAdaptDsl.g:1621:3: '>='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1626:2: ( '<=' )
                    {
                    // InternalAdaptDsl.g:1626:2: ( '<=' )
                    // InternalAdaptDsl.g:1627:3: '<='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1632:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1632:2: ( '===' )
                    // InternalAdaptDsl.g:1633:3: '==='
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
    // InternalAdaptDsl.g:1642:1: rule__StringOperators__Alternatives : ( ( '==' ) | ( '!=' ) | ( '===' ) );
    public final void rule__StringOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1646:1: ( ( '==' ) | ( '!=' ) | ( '===' ) )
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
                    // InternalAdaptDsl.g:1647:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1647:2: ( '==' )
                    // InternalAdaptDsl.g:1648:3: '=='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1653:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1653:2: ( '!=' )
                    // InternalAdaptDsl.g:1654:3: '!='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1659:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1659:2: ( '===' )
                    // InternalAdaptDsl.g:1660:3: '==='
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
    // InternalAdaptDsl.g:1669:1: rule__BoolOperators__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__BoolOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1673:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalAdaptDsl.g:1674:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1674:2: ( '==' )
                    // InternalAdaptDsl.g:1675:3: '=='
                    {
                     before(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1680:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1680:2: ( '!=' )
                    // InternalAdaptDsl.g:1681:3: '!='
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
    // InternalAdaptDsl.g:1690:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1694:1: ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 44:
            case 46:
            case 47:
                {
                alt6=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt6=2;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt6=3;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
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
                    // InternalAdaptDsl.g:1695:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1695:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    // InternalAdaptDsl.g:1696:3: ( rule__Action__ActionCategoryAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_0()); 
                    // InternalAdaptDsl.g:1697:3: ( rule__Action__ActionCategoryAssignment_0 )
                    // InternalAdaptDsl.g:1697:4: rule__Action__ActionCategoryAssignment_0
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
                    // InternalAdaptDsl.g:1701:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1701:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    // InternalAdaptDsl.g:1702:3: ( rule__Action__ActionCategoryAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_1()); 
                    // InternalAdaptDsl.g:1703:3: ( rule__Action__ActionCategoryAssignment_1 )
                    // InternalAdaptDsl.g:1703:4: rule__Action__ActionCategoryAssignment_1
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
                    // InternalAdaptDsl.g:1707:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1707:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    // InternalAdaptDsl.g:1708:3: ( rule__Action__ActionCategoryAssignment_2 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_2()); 
                    // InternalAdaptDsl.g:1709:3: ( rule__Action__ActionCategoryAssignment_2 )
                    // InternalAdaptDsl.g:1709:4: rule__Action__ActionCategoryAssignment_2
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
                    // InternalAdaptDsl.g:1713:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1713:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    // InternalAdaptDsl.g:1714:3: ( rule__Action__ActionCategoryAssignment_3 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_3()); 
                    // InternalAdaptDsl.g:1715:3: ( rule__Action__ActionCategoryAssignment_3 )
                    // InternalAdaptDsl.g:1715:4: rule__Action__ActionCategoryAssignment_3
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
    // InternalAdaptDsl.g:1723:1: rule__ServiceOperation__Alternatives : ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) );
    public final void rule__ServiceOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1727:1: ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 47:
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
                    // InternalAdaptDsl.g:1728:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1728:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1729:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1730:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1730:4: rule__ServiceOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1734:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1734:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1735:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1736:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1736:4: rule__ServiceOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1740:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1740:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1741:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1742:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1742:4: rule__ServiceOperation__OperationAssignment_2
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
    // InternalAdaptDsl.g:1750:1: rule__DisplayPropertyValue__Alternatives : ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) );
    public final void rule__DisplayPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1754:1: ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) )
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
                    // InternalAdaptDsl.g:1755:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1755:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    // InternalAdaptDsl.g:1756:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_0()); 
                    // InternalAdaptDsl.g:1757:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    // InternalAdaptDsl.g:1757:4: rule__DisplayPropertyValue__PropertyClassAssignment_0
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
                    // InternalAdaptDsl.g:1761:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1761:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    // InternalAdaptDsl.g:1762:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_1()); 
                    // InternalAdaptDsl.g:1763:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    // InternalAdaptDsl.g:1763:4: rule__DisplayPropertyValue__PropertyClassAssignment_1
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
                    // InternalAdaptDsl.g:1767:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1767:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    // InternalAdaptDsl.g:1768:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_2()); 
                    // InternalAdaptDsl.g:1769:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    // InternalAdaptDsl.g:1769:4: rule__DisplayPropertyValue__PropertyClassAssignment_2
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
    // InternalAdaptDsl.g:1777:1: rule__TaskChangeOperation__Alternatives : ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__TaskChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1781:1: ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt9=1;
                }
                break;
            case 49:
                {
                alt9=2;
                }
                break;
            case 50:
                {
                alt9=3;
                }
                break;
            case 51:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:1782:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1782:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1783:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1784:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1784:4: rule__TaskChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1788:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1788:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1789:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1790:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1790:4: rule__TaskChangeOperation__OperationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskChangeOperation__OperationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1794:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1794:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1795:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1796:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1796:4: rule__TaskChangeOperation__OperationAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskChangeOperation__OperationAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1800:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1800:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1801:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1802:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1802:4: rule__TaskChangeOperation__OperationAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskChangeOperation__OperationAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_3()); 

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
    // InternalAdaptDsl.g:1810:1: rule__NavigationChangeOperation__Alternatives : ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__NavigationChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1814:1: ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt10=1;
                }
                break;
            case 53:
                {
                alt10=2;
                }
                break;
            case 54:
                {
                alt10=3;
                }
                break;
            case 55:
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
                    // InternalAdaptDsl.g:1815:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1815:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1816:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1817:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1817:4: rule__NavigationChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1821:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1821:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1822:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1823:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1823:4: rule__NavigationChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1827:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1827:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1828:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1829:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1829:4: rule__NavigationChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1833:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1833:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1834:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1835:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1835:4: rule__NavigationChangeOperation__OperationAssignment_3
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
    // InternalAdaptDsl.g:1843:1: rule__LayoutChangeOperation__Alternatives : ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) );
    public final void rule__LayoutChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1847:1: ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt11=1;
                }
                break;
            case 56:
                {
                alt11=2;
                }
                break;
            case 59:
                {
                alt11=3;
                }
                break;
            case 60:
                {
                alt11=4;
                }
                break;
            case 57:
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
                    // InternalAdaptDsl.g:1848:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1848:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1849:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1850:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1850:4: rule__LayoutChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1854:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1854:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1855:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1856:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1856:4: rule__LayoutChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1860:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1860:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1861:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1862:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1862:4: rule__LayoutChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1866:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1866:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1867:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1868:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1868:4: rule__LayoutChangeOperation__OperationAssignment_3
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
                    // InternalAdaptDsl.g:1872:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    {
                    // InternalAdaptDsl.g:1872:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    // InternalAdaptDsl.g:1873:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_4()); 
                    // InternalAdaptDsl.g:1874:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    // InternalAdaptDsl.g:1874:4: rule__LayoutChangeOperation__OperationAssignment_4
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
    // InternalAdaptDsl.g:1882:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1886:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) )
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
                    // InternalAdaptDsl.g:1887:2: ( RULE_INT )
                    {
                    // InternalAdaptDsl.g:1887:2: ( RULE_INT )
                    // InternalAdaptDsl.g:1888:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1893:2: ( RULE_STRING )
                    {
                    // InternalAdaptDsl.g:1893:2: ( RULE_STRING )
                    // InternalAdaptDsl.g:1894:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1899:2: ( RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:1899:2: ( RULE_BOOL )
                    // InternalAdaptDsl.g:1900:3: RULE_BOOL
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


    // $ANTLR start "rule__TYPE__Alternatives"
    // InternalAdaptDsl.g:1909:1: rule__TYPE__Alternatives : ( ( ( 'string' ) ) | ( ( 'number' ) ) | ( ( 'bool' ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1913:1: ( ( ( 'string' ) ) | ( ( 'number' ) ) | ( ( 'bool' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAdaptDsl.g:1914:2: ( ( 'string' ) )
                    {
                    // InternalAdaptDsl.g:1914:2: ( ( 'string' ) )
                    // InternalAdaptDsl.g:1915:3: ( 'string' )
                    {
                     before(grammarAccess.getTYPEAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalAdaptDsl.g:1916:3: ( 'string' )
                    // InternalAdaptDsl.g:1916:4: 'string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1920:2: ( ( 'number' ) )
                    {
                    // InternalAdaptDsl.g:1920:2: ( ( 'number' ) )
                    // InternalAdaptDsl.g:1921:3: ( 'number' )
                    {
                     before(grammarAccess.getTYPEAccess().getNUMBEREnumLiteralDeclaration_1()); 
                    // InternalAdaptDsl.g:1922:3: ( 'number' )
                    // InternalAdaptDsl.g:1922:4: 'number'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getNUMBEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1926:2: ( ( 'bool' ) )
                    {
                    // InternalAdaptDsl.g:1926:2: ( ( 'bool' ) )
                    // InternalAdaptDsl.g:1927:3: ( 'bool' )
                    {
                     before(grammarAccess.getTYPEAccess().getBOOLEnumLiteralDeclaration_2()); 
                    // InternalAdaptDsl.g:1928:3: ( 'bool' )
                    // InternalAdaptDsl.g:1928:4: 'bool'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTYPEAccess().getBOOLEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TYPE__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAdaptDsl.g:1936:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1940:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptDsl.g:1941:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAdaptDsl.g:1948:1: rule__Model__Group__0__Impl : ( ( rule__Model__ServicesAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1952:1: ( ( ( rule__Model__ServicesAssignment_0 )? ) )
            // InternalAdaptDsl.g:1953:1: ( ( rule__Model__ServicesAssignment_0 )? )
            {
            // InternalAdaptDsl.g:1953:1: ( ( rule__Model__ServicesAssignment_0 )? )
            // InternalAdaptDsl.g:1954:2: ( rule__Model__ServicesAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getServicesAssignment_0()); 
            // InternalAdaptDsl.g:1955:2: ( rule__Model__ServicesAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdaptDsl.g:1955:3: rule__Model__ServicesAssignment_0
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
    // InternalAdaptDsl.g:1963:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1967:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAdaptDsl.g:1968:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAdaptDsl.g:1975:1: rule__Model__Group__1__Impl : ( 'flow' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1979:1: ( ( 'flow' ) )
            // InternalAdaptDsl.g:1980:1: ( 'flow' )
            {
            // InternalAdaptDsl.g:1980:1: ( 'flow' )
            // InternalAdaptDsl.g:1981:2: 'flow'
            {
             before(grammarAccess.getModelAccess().getFlowKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1990:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1994:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAdaptDsl.g:1995:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAdaptDsl.g:2002:1: rule__Model__Group__2__Impl : ( ( rule__Model__FlowNameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2006:1: ( ( ( rule__Model__FlowNameAssignment_2 ) ) )
            // InternalAdaptDsl.g:2007:1: ( ( rule__Model__FlowNameAssignment_2 ) )
            {
            // InternalAdaptDsl.g:2007:1: ( ( rule__Model__FlowNameAssignment_2 ) )
            // InternalAdaptDsl.g:2008:2: ( rule__Model__FlowNameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getFlowNameAssignment_2()); 
            // InternalAdaptDsl.g:2009:2: ( rule__Model__FlowNameAssignment_2 )
            // InternalAdaptDsl.g:2009:3: rule__Model__FlowNameAssignment_2
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
    // InternalAdaptDsl.g:2017:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2021:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAdaptDsl.g:2022:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalAdaptDsl.g:2029:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2033:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2034:1: ( '{' )
            {
            // InternalAdaptDsl.g:2034:1: ( '{' )
            // InternalAdaptDsl.g:2035:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2044:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2048:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalAdaptDsl.g:2049:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalAdaptDsl.g:2056:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2060:1: ( ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) ) )
            // InternalAdaptDsl.g:2061:1: ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) )
            {
            // InternalAdaptDsl.g:2061:1: ( ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* ) )
            // InternalAdaptDsl.g:2062:2: ( ( rule__Model__AdaptationRulesAssignment_4 ) ) ( ( rule__Model__AdaptationRulesAssignment_4 )* )
            {
            // InternalAdaptDsl.g:2062:2: ( ( rule__Model__AdaptationRulesAssignment_4 ) )
            // InternalAdaptDsl.g:2063:3: ( rule__Model__AdaptationRulesAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 
            // InternalAdaptDsl.g:2064:3: ( rule__Model__AdaptationRulesAssignment_4 )
            // InternalAdaptDsl.g:2064:4: rule__Model__AdaptationRulesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Model__AdaptationRulesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 

            }

            // InternalAdaptDsl.g:2067:2: ( ( rule__Model__AdaptationRulesAssignment_4 )* )
            // InternalAdaptDsl.g:2068:3: ( rule__Model__AdaptationRulesAssignment_4 )*
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAssignment_4()); 
            // InternalAdaptDsl.g:2069:3: ( rule__Model__AdaptationRulesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdaptDsl.g:2069:4: rule__Model__AdaptationRulesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__AdaptationRulesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalAdaptDsl.g:2078:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2082:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalAdaptDsl.g:2083:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

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
    // InternalAdaptDsl.g:2090:1: rule__Model__Group__5__Impl : ( '};' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2094:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2095:1: ( '};' )
            {
            // InternalAdaptDsl.g:2095:1: ( '};' )
            // InternalAdaptDsl.g:2096:2: '};'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_5()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__Group__6"
    // InternalAdaptDsl.g:2105:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2109:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalAdaptDsl.g:2110:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalAdaptDsl.g:2117:1: rule__Model__Group__6__Impl : ( ( rule__Model__EntityAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2121:1: ( ( ( rule__Model__EntityAssignment_6 )* ) )
            // InternalAdaptDsl.g:2122:1: ( ( rule__Model__EntityAssignment_6 )* )
            {
            // InternalAdaptDsl.g:2122:1: ( ( rule__Model__EntityAssignment_6 )* )
            // InternalAdaptDsl.g:2123:2: ( rule__Model__EntityAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getEntityAssignment_6()); 
            // InternalAdaptDsl.g:2124:2: ( rule__Model__EntityAssignment_6 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==61) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAdaptDsl.g:2124:3: rule__Model__EntityAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__EntityAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntityAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalAdaptDsl.g:2132:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2136:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalAdaptDsl.g:2137:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalAdaptDsl.g:2144:1: rule__Model__Group__7__Impl : ( 'Services{' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2148:1: ( ( 'Services{' ) )
            // InternalAdaptDsl.g:2149:1: ( 'Services{' )
            {
            // InternalAdaptDsl.g:2149:1: ( 'Services{' )
            // InternalAdaptDsl.g:2150:2: 'Services{'
            {
             before(grammarAccess.getModelAccess().getServicesKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getServicesKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalAdaptDsl.g:2159:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2163:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalAdaptDsl.g:2164:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalAdaptDsl.g:2171:1: rule__Model__Group__8__Impl : ( ( rule__Model__Group_8__0 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2175:1: ( ( ( rule__Model__Group_8__0 )* ) )
            // InternalAdaptDsl.g:2176:1: ( ( rule__Model__Group_8__0 )* )
            {
            // InternalAdaptDsl.g:2176:1: ( ( rule__Model__Group_8__0 )* )
            // InternalAdaptDsl.g:2177:2: ( rule__Model__Group_8__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_8()); 
            // InternalAdaptDsl.g:2178:2: ( rule__Model__Group_8__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAdaptDsl.g:2178:3: rule__Model__Group_8__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Model__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalAdaptDsl.g:2186:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2190:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalAdaptDsl.g:2191:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalAdaptDsl.g:2198:1: rule__Model__Group__9__Impl : ( '}' ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2202:1: ( ( '}' ) )
            // InternalAdaptDsl.g:2203:1: ( '}' )
            {
            // InternalAdaptDsl.g:2203:1: ( '}' )
            // InternalAdaptDsl.g:2204:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalAdaptDsl.g:2213:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2217:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalAdaptDsl.g:2218:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

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
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalAdaptDsl.g:2225:1: rule__Model__Group__10__Impl : ( 'Types{' ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2229:1: ( ( 'Types{' ) )
            // InternalAdaptDsl.g:2230:1: ( 'Types{' )
            {
            // InternalAdaptDsl.g:2230:1: ( 'Types{' )
            // InternalAdaptDsl.g:2231:2: 'Types{'
            {
             before(grammarAccess.getModelAccess().getTypesKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getTypesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalAdaptDsl.g:2240:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2244:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalAdaptDsl.g:2245:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

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
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalAdaptDsl.g:2252:1: rule__Model__Group__11__Impl : ( ( rule__Model__TypesAssignment_11 ) ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2256:1: ( ( ( rule__Model__TypesAssignment_11 ) ) )
            // InternalAdaptDsl.g:2257:1: ( ( rule__Model__TypesAssignment_11 ) )
            {
            // InternalAdaptDsl.g:2257:1: ( ( rule__Model__TypesAssignment_11 ) )
            // InternalAdaptDsl.g:2258:2: ( rule__Model__TypesAssignment_11 )
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_11()); 
            // InternalAdaptDsl.g:2259:2: ( rule__Model__TypesAssignment_11 )
            // InternalAdaptDsl.g:2259:3: rule__Model__TypesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Model__TypesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTypesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalAdaptDsl.g:2267:1: rule__Model__Group__12 : rule__Model__Group__12__Impl ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2271:1: ( rule__Model__Group__12__Impl )
            // InternalAdaptDsl.g:2272:2: rule__Model__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__12__Impl();

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
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalAdaptDsl.g:2278:1: rule__Model__Group__12__Impl : ( '}' ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2282:1: ( ( '}' ) )
            // InternalAdaptDsl.g:2283:1: ( '}' )
            {
            // InternalAdaptDsl.g:2283:1: ( '}' )
            // InternalAdaptDsl.g:2284:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group_8__0"
    // InternalAdaptDsl.g:2294:1: rule__Model__Group_8__0 : rule__Model__Group_8__0__Impl rule__Model__Group_8__1 ;
    public final void rule__Model__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2298:1: ( rule__Model__Group_8__0__Impl rule__Model__Group_8__1 )
            // InternalAdaptDsl.g:2299:2: rule__Model__Group_8__0__Impl rule__Model__Group_8__1
            {
            pushFollow(FOLLOW_16);
            rule__Model__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1();

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
    // $ANTLR end "rule__Model__Group_8__0"


    // $ANTLR start "rule__Model__Group_8__0__Impl"
    // InternalAdaptDsl.g:2306:1: rule__Model__Group_8__0__Impl : ( ( rule__Model__ProviderAssignment_8_0 ) ) ;
    public final void rule__Model__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2310:1: ( ( ( rule__Model__ProviderAssignment_8_0 ) ) )
            // InternalAdaptDsl.g:2311:1: ( ( rule__Model__ProviderAssignment_8_0 ) )
            {
            // InternalAdaptDsl.g:2311:1: ( ( rule__Model__ProviderAssignment_8_0 ) )
            // InternalAdaptDsl.g:2312:2: ( rule__Model__ProviderAssignment_8_0 )
            {
             before(grammarAccess.getModelAccess().getProviderAssignment_8_0()); 
            // InternalAdaptDsl.g:2313:2: ( rule__Model__ProviderAssignment_8_0 )
            // InternalAdaptDsl.g:2313:3: rule__Model__ProviderAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProviderAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProviderAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0__Impl"


    // $ANTLR start "rule__Model__Group_8__1"
    // InternalAdaptDsl.g:2321:1: rule__Model__Group_8__1 : rule__Model__Group_8__1__Impl ;
    public final void rule__Model__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2325:1: ( rule__Model__Group_8__1__Impl )
            // InternalAdaptDsl.g:2326:2: rule__Model__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1__Impl();

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
    // $ANTLR end "rule__Model__Group_8__1"


    // $ANTLR start "rule__Model__Group_8__1__Impl"
    // InternalAdaptDsl.g:2332:1: rule__Model__Group_8__1__Impl : ( ';' ) ;
    public final void rule__Model__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2336:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2337:1: ( ';' )
            {
            // InternalAdaptDsl.g:2337:1: ( ';' )
            // InternalAdaptDsl.g:2338:2: ';'
            {
             before(grammarAccess.getModelAccess().getSemicolonKeyword_8_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1__Impl"


    // $ANTLR start "rule__Services__Group__0"
    // InternalAdaptDsl.g:2348:1: rule__Services__Group__0 : rule__Services__Group__0__Impl rule__Services__Group__1 ;
    public final void rule__Services__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2352:1: ( rule__Services__Group__0__Impl rule__Services__Group__1 )
            // InternalAdaptDsl.g:2353:2: rule__Services__Group__0__Impl rule__Services__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalAdaptDsl.g:2360:1: rule__Services__Group__0__Impl : ( ( rule__Services__ThisAssignment_0 ) ) ;
    public final void rule__Services__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2364:1: ( ( ( rule__Services__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:2365:1: ( ( rule__Services__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2365:1: ( ( rule__Services__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:2366:2: ( rule__Services__ThisAssignment_0 )
            {
             before(grammarAccess.getServicesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:2367:2: ( rule__Services__ThisAssignment_0 )
            // InternalAdaptDsl.g:2367:3: rule__Services__ThisAssignment_0
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
    // InternalAdaptDsl.g:2375:1: rule__Services__Group__1 : rule__Services__Group__1__Impl ;
    public final void rule__Services__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2379:1: ( rule__Services__Group__1__Impl )
            // InternalAdaptDsl.g:2380:2: rule__Services__Group__1__Impl
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
    // InternalAdaptDsl.g:2386:1: rule__Services__Group__1__Impl : ( ( rule__Services__NextAssignment_1 )? ) ;
    public final void rule__Services__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2390:1: ( ( ( rule__Services__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:2391:1: ( ( rule__Services__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2391:1: ( ( rule__Services__NextAssignment_1 )? )
            // InternalAdaptDsl.g:2392:2: ( rule__Services__NextAssignment_1 )?
            {
             before(grammarAccess.getServicesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:2393:2: ( rule__Services__NextAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptDsl.g:2393:3: rule__Services__NextAssignment_1
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
    // InternalAdaptDsl.g:2402:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2406:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAdaptDsl.g:2407:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:2414:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2418:1: ( ( 'service' ) )
            // InternalAdaptDsl.g:2419:1: ( 'service' )
            {
            // InternalAdaptDsl.g:2419:1: ( 'service' )
            // InternalAdaptDsl.g:2420:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2429:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2433:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAdaptDsl.g:2434:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptDsl.g:2441:1: rule__Service__Group__1__Impl : ( ( rule__Service__TypeAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2445:1: ( ( ( rule__Service__TypeAssignment_1 ) ) )
            // InternalAdaptDsl.g:2446:1: ( ( rule__Service__TypeAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2446:1: ( ( rule__Service__TypeAssignment_1 ) )
            // InternalAdaptDsl.g:2447:2: ( rule__Service__TypeAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_1()); 
            // InternalAdaptDsl.g:2448:2: ( rule__Service__TypeAssignment_1 )
            // InternalAdaptDsl.g:2448:3: rule__Service__TypeAssignment_1
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
    // InternalAdaptDsl.g:2456:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2460:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAdaptDsl.g:2461:2: rule__Service__Group__2__Impl rule__Service__Group__3
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
    // InternalAdaptDsl.g:2468:1: rule__Service__Group__2__Impl : ( 'from' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2472:1: ( ( 'from' ) )
            // InternalAdaptDsl.g:2473:1: ( 'from' )
            {
            // InternalAdaptDsl.g:2473:1: ( 'from' )
            // InternalAdaptDsl.g:2474:2: 'from'
            {
             before(grammarAccess.getServiceAccess().getFromKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2483:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2487:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAdaptDsl.g:2488:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdaptDsl.g:2495:1: rule__Service__Group__3__Impl : ( ( rule__Service__LocAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2499:1: ( ( ( rule__Service__LocAssignment_3 ) ) )
            // InternalAdaptDsl.g:2500:1: ( ( rule__Service__LocAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2500:1: ( ( rule__Service__LocAssignment_3 ) )
            // InternalAdaptDsl.g:2501:2: ( rule__Service__LocAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getLocAssignment_3()); 
            // InternalAdaptDsl.g:2502:2: ( rule__Service__LocAssignment_3 )
            // InternalAdaptDsl.g:2502:3: rule__Service__LocAssignment_3
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
    // InternalAdaptDsl.g:2510:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2514:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAdaptDsl.g:2515:2: rule__Service__Group__4__Impl rule__Service__Group__5
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
    // InternalAdaptDsl.g:2522:1: rule__Service__Group__4__Impl : ( 'as' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2526:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:2527:1: ( 'as' )
            {
            // InternalAdaptDsl.g:2527:1: ( 'as' )
            // InternalAdaptDsl.g:2528:2: 'as'
            {
             before(grammarAccess.getServiceAccess().getAsKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2537:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2541:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAdaptDsl.g:2542:2: rule__Service__Group__5__Impl rule__Service__Group__6
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
    // InternalAdaptDsl.g:2549:1: rule__Service__Group__5__Impl : ( ( rule__Service__IdAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2553:1: ( ( ( rule__Service__IdAssignment_5 ) ) )
            // InternalAdaptDsl.g:2554:1: ( ( rule__Service__IdAssignment_5 ) )
            {
            // InternalAdaptDsl.g:2554:1: ( ( rule__Service__IdAssignment_5 ) )
            // InternalAdaptDsl.g:2555:2: ( rule__Service__IdAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getIdAssignment_5()); 
            // InternalAdaptDsl.g:2556:2: ( rule__Service__IdAssignment_5 )
            // InternalAdaptDsl.g:2556:3: rule__Service__IdAssignment_5
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
    // InternalAdaptDsl.g:2564:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2568:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAdaptDsl.g:2569:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalAdaptDsl.g:2576:1: rule__Service__Group__6__Impl : ( '{' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2580:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2581:1: ( '{' )
            {
            // InternalAdaptDsl.g:2581:1: ( '{' )
            // InternalAdaptDsl.g:2582:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2591:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2595:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAdaptDsl.g:2596:2: rule__Service__Group__7__Impl rule__Service__Group__8
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
    // InternalAdaptDsl.g:2603:1: rule__Service__Group__7__Impl : ( ( rule__Service__FunctionsAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2607:1: ( ( ( rule__Service__FunctionsAssignment_7 ) ) )
            // InternalAdaptDsl.g:2608:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            {
            // InternalAdaptDsl.g:2608:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            // InternalAdaptDsl.g:2609:2: ( rule__Service__FunctionsAssignment_7 )
            {
             before(grammarAccess.getServiceAccess().getFunctionsAssignment_7()); 
            // InternalAdaptDsl.g:2610:2: ( rule__Service__FunctionsAssignment_7 )
            // InternalAdaptDsl.g:2610:3: rule__Service__FunctionsAssignment_7
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
    // InternalAdaptDsl.g:2618:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2622:1: ( rule__Service__Group__8__Impl )
            // InternalAdaptDsl.g:2623:2: rule__Service__Group__8__Impl
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
    // InternalAdaptDsl.g:2629:1: rule__Service__Group__8__Impl : ( '};' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2633:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2634:1: ( '};' )
            {
            // InternalAdaptDsl.g:2634:1: ( '};' )
            // InternalAdaptDsl.g:2635:2: '};'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2645:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2649:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalAdaptDsl.g:2650:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAdaptDsl.g:2657:1: rule__Functions__Group__0__Impl : ( ( rule__Functions__ThisAssignment_0 ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2661:1: ( ( ( rule__Functions__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:2662:1: ( ( rule__Functions__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2662:1: ( ( rule__Functions__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:2663:2: ( rule__Functions__ThisAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:2664:2: ( rule__Functions__ThisAssignment_0 )
            // InternalAdaptDsl.g:2664:3: rule__Functions__ThisAssignment_0
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
    // InternalAdaptDsl.g:2672:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2676:1: ( rule__Functions__Group__1__Impl )
            // InternalAdaptDsl.g:2677:2: rule__Functions__Group__1__Impl
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
    // InternalAdaptDsl.g:2683:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__NextAssignment_1 )? ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2687:1: ( ( ( rule__Functions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:2688:1: ( ( rule__Functions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2688:1: ( ( rule__Functions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:2689:2: ( rule__Functions__NextAssignment_1 )?
            {
             before(grammarAccess.getFunctionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:2690:2: ( rule__Functions__NextAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptDsl.g:2690:3: rule__Functions__NextAssignment_1
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
    // InternalAdaptDsl.g:2699:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2703:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalAdaptDsl.g:2704:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:2711:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2715:1: ( ( 'function' ) )
            // InternalAdaptDsl.g:2716:1: ( 'function' )
            {
            // InternalAdaptDsl.g:2716:1: ( 'function' )
            // InternalAdaptDsl.g:2717:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2726:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2730:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalAdaptDsl.g:2731:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdaptDsl.g:2738:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2742:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:2743:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2743:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalAdaptDsl.g:2744:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:2745:2: ( rule__Function__NameAssignment_1 )
            // InternalAdaptDsl.g:2745:3: rule__Function__NameAssignment_1
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
    // InternalAdaptDsl.g:2753:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2757:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalAdaptDsl.g:2758:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalAdaptDsl.g:2765:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2769:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:2770:1: ( 'as' )
            {
            // InternalAdaptDsl.g:2770:1: ( 'as' )
            // InternalAdaptDsl.g:2771:2: 'as'
            {
             before(grammarAccess.getFunctionAccess().getAsKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2780:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2784:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalAdaptDsl.g:2785:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:2792:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2796:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalAdaptDsl.g:2797:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2797:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalAdaptDsl.g:2798:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalAdaptDsl.g:2799:2: ( rule__Function__IdAssignment_3 )
            // InternalAdaptDsl.g:2799:3: rule__Function__IdAssignment_3
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
    // InternalAdaptDsl.g:2807:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2811:1: ( rule__Function__Group__4__Impl )
            // InternalAdaptDsl.g:2812:2: rule__Function__Group__4__Impl
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
    // InternalAdaptDsl.g:2818:1: rule__Function__Group__4__Impl : ( ';' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2822:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2823:1: ( ';' )
            {
            // InternalAdaptDsl.g:2823:1: ( ';' )
            // InternalAdaptDsl.g:2824:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2834:1: rule__AdaptationRule__Group__0 : rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 ;
    public final void rule__AdaptationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2838:1: ( rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 )
            // InternalAdaptDsl.g:2839:2: rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1
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
    // InternalAdaptDsl.g:2846:1: rule__AdaptationRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AdaptationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2850:1: ( ( 'rule' ) )
            // InternalAdaptDsl.g:2851:1: ( 'rule' )
            {
            // InternalAdaptDsl.g:2851:1: ( 'rule' )
            // InternalAdaptDsl.g:2852:2: 'rule'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2861:1: rule__AdaptationRule__Group__1 : rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 ;
    public final void rule__AdaptationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2865:1: ( rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 )
            // InternalAdaptDsl.g:2866:2: rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2
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
    // InternalAdaptDsl.g:2873:1: rule__AdaptationRule__Group__1__Impl : ( ( rule__AdaptationRule__NameAssignment_1 ) ) ;
    public final void rule__AdaptationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2877:1: ( ( ( rule__AdaptationRule__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:2878:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2878:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            // InternalAdaptDsl.g:2879:2: ( rule__AdaptationRule__NameAssignment_1 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:2880:2: ( rule__AdaptationRule__NameAssignment_1 )
            // InternalAdaptDsl.g:2880:3: rule__AdaptationRule__NameAssignment_1
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
    // InternalAdaptDsl.g:2888:1: rule__AdaptationRule__Group__2 : rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 ;
    public final void rule__AdaptationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2892:1: ( rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 )
            // InternalAdaptDsl.g:2893:2: rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalAdaptDsl.g:2900:1: rule__AdaptationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AdaptationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2904:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2905:1: ( '{' )
            {
            // InternalAdaptDsl.g:2905:1: ( '{' )
            // InternalAdaptDsl.g:2906:2: '{'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2915:1: rule__AdaptationRule__Group__3 : rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 ;
    public final void rule__AdaptationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2919:1: ( rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 )
            // InternalAdaptDsl.g:2920:2: rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdaptDsl.g:2927:1: rule__AdaptationRule__Group__3__Impl : ( 'LEVEL' ) ;
    public final void rule__AdaptationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2931:1: ( ( 'LEVEL' ) )
            // InternalAdaptDsl.g:2932:1: ( 'LEVEL' )
            {
            // InternalAdaptDsl.g:2932:1: ( 'LEVEL' )
            // InternalAdaptDsl.g:2933:2: 'LEVEL'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2942:1: rule__AdaptationRule__Group__4 : rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 ;
    public final void rule__AdaptationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2946:1: ( rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 )
            // InternalAdaptDsl.g:2947:2: rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:2954:1: rule__AdaptationRule__Group__4__Impl : ( ( rule__AdaptationRule__LevelAssignment_4 ) ) ;
    public final void rule__AdaptationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2958:1: ( ( ( rule__AdaptationRule__LevelAssignment_4 ) ) )
            // InternalAdaptDsl.g:2959:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            {
            // InternalAdaptDsl.g:2959:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            // InternalAdaptDsl.g:2960:2: ( rule__AdaptationRule__LevelAssignment_4 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getLevelAssignment_4()); 
            // InternalAdaptDsl.g:2961:2: ( rule__AdaptationRule__LevelAssignment_4 )
            // InternalAdaptDsl.g:2961:3: rule__AdaptationRule__LevelAssignment_4
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
    // InternalAdaptDsl.g:2969:1: rule__AdaptationRule__Group__5 : rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 ;
    public final void rule__AdaptationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2973:1: ( rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 )
            // InternalAdaptDsl.g:2974:2: rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:2981:1: rule__AdaptationRule__Group__5__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2985:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2986:1: ( ';' )
            {
            // InternalAdaptDsl.g:2986:1: ( ';' )
            // InternalAdaptDsl.g:2987:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2996:1: rule__AdaptationRule__Group__6 : rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 ;
    public final void rule__AdaptationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3000:1: ( rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 )
            // InternalAdaptDsl.g:3001:2: rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3008:1: rule__AdaptationRule__Group__6__Impl : ( 'FACT' ) ;
    public final void rule__AdaptationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3012:1: ( ( 'FACT' ) )
            // InternalAdaptDsl.g:3013:1: ( 'FACT' )
            {
            // InternalAdaptDsl.g:3013:1: ( 'FACT' )
            // InternalAdaptDsl.g:3014:2: 'FACT'
            {
             before(grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3023:1: rule__AdaptationRule__Group__7 : rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 ;
    public final void rule__AdaptationRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3027:1: ( rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 )
            // InternalAdaptDsl.g:3028:2: rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3035:1: rule__AdaptationRule__Group__7__Impl : ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) ;
    public final void rule__AdaptationRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3039:1: ( ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) )
            // InternalAdaptDsl.g:3040:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            {
            // InternalAdaptDsl.g:3040:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            // InternalAdaptDsl.g:3041:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_7()); 
            // InternalAdaptDsl.g:3042:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            // InternalAdaptDsl.g:3042:3: rule__AdaptationRule__FactTypeAssignment_7
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
    // InternalAdaptDsl.g:3050:1: rule__AdaptationRule__Group__8 : rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 ;
    public final void rule__AdaptationRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3054:1: ( rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 )
            // InternalAdaptDsl.g:3055:2: rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:3062:1: rule__AdaptationRule__Group__8__Impl : ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) ;
    public final void rule__AdaptationRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3066:1: ( ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) )
            // InternalAdaptDsl.g:3067:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            {
            // InternalAdaptDsl.g:3067:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            // InternalAdaptDsl.g:3068:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_8()); 
            // InternalAdaptDsl.g:3069:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            // InternalAdaptDsl.g:3069:3: rule__AdaptationRule__FactNameAssignment_8
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
    // InternalAdaptDsl.g:3077:1: rule__AdaptationRule__Group__9 : rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 ;
    public final void rule__AdaptationRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3081:1: ( rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 )
            // InternalAdaptDsl.g:3082:2: rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdaptDsl.g:3089:1: rule__AdaptationRule__Group__9__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3093:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3094:1: ( ';' )
            {
            // InternalAdaptDsl.g:3094:1: ( ';' )
            // InternalAdaptDsl.g:3095:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3104:1: rule__AdaptationRule__Group__10 : rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 ;
    public final void rule__AdaptationRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3108:1: ( rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 )
            // InternalAdaptDsl.g:3109:2: rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:3116:1: rule__AdaptationRule__Group__10__Impl : ( 'IF' ) ;
    public final void rule__AdaptationRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3120:1: ( ( 'IF' ) )
            // InternalAdaptDsl.g:3121:1: ( 'IF' )
            {
            // InternalAdaptDsl.g:3121:1: ( 'IF' )
            // InternalAdaptDsl.g:3122:2: 'IF'
            {
             before(grammarAccess.getAdaptationRuleAccess().getIFKeyword_10()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3131:1: rule__AdaptationRule__Group__11 : rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 ;
    public final void rule__AdaptationRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3135:1: ( rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 )
            // InternalAdaptDsl.g:3136:2: rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3143:1: rule__AdaptationRule__Group__11__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3147:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3148:1: ( '(' )
            {
            // InternalAdaptDsl.g:3148:1: ( '(' )
            // InternalAdaptDsl.g:3149:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3158:1: rule__AdaptationRule__Group__12 : rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 ;
    public final void rule__AdaptationRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3162:1: ( rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 )
            // InternalAdaptDsl.g:3163:2: rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:3170:1: rule__AdaptationRule__Group__12__Impl : ( ( rule__AdaptationRule__ExprAssignment_12 ) ) ;
    public final void rule__AdaptationRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3174:1: ( ( ( rule__AdaptationRule__ExprAssignment_12 ) ) )
            // InternalAdaptDsl.g:3175:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            {
            // InternalAdaptDsl.g:3175:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            // InternalAdaptDsl.g:3176:2: ( rule__AdaptationRule__ExprAssignment_12 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprAssignment_12()); 
            // InternalAdaptDsl.g:3177:2: ( rule__AdaptationRule__ExprAssignment_12 )
            // InternalAdaptDsl.g:3177:3: rule__AdaptationRule__ExprAssignment_12
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
    // InternalAdaptDsl.g:3185:1: rule__AdaptationRule__Group__13 : rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 ;
    public final void rule__AdaptationRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3189:1: ( rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 )
            // InternalAdaptDsl.g:3190:2: rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdaptDsl.g:3197:1: rule__AdaptationRule__Group__13__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3201:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3202:1: ( ')' )
            {
            // InternalAdaptDsl.g:3202:1: ( ')' )
            // InternalAdaptDsl.g:3203:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3212:1: rule__AdaptationRule__Group__14 : rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 ;
    public final void rule__AdaptationRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3216:1: ( rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 )
            // InternalAdaptDsl.g:3217:2: rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:3224:1: rule__AdaptationRule__Group__14__Impl : ( 'THEN' ) ;
    public final void rule__AdaptationRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3228:1: ( ( 'THEN' ) )
            // InternalAdaptDsl.g:3229:1: ( 'THEN' )
            {
            // InternalAdaptDsl.g:3229:1: ( 'THEN' )
            // InternalAdaptDsl.g:3230:2: 'THEN'
            {
             before(grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3239:1: rule__AdaptationRule__Group__15 : rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 ;
    public final void rule__AdaptationRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3243:1: ( rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 )
            // InternalAdaptDsl.g:3244:2: rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdaptDsl.g:3251:1: rule__AdaptationRule__Group__15__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3255:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3256:1: ( '(' )
            {
            // InternalAdaptDsl.g:3256:1: ( '(' )
            // InternalAdaptDsl.g:3257:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3266:1: rule__AdaptationRule__Group__16 : rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 ;
    public final void rule__AdaptationRule__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3270:1: ( rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 )
            // InternalAdaptDsl.g:3271:2: rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:3278:1: rule__AdaptationRule__Group__16__Impl : ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) ;
    public final void rule__AdaptationRule__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3282:1: ( ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) )
            // InternalAdaptDsl.g:3283:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            {
            // InternalAdaptDsl.g:3283:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            // InternalAdaptDsl.g:3284:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_16()); 
            // InternalAdaptDsl.g:3285:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            // InternalAdaptDsl.g:3285:3: rule__AdaptationRule__ActionCollectionAssignment_16
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
    // InternalAdaptDsl.g:3293:1: rule__AdaptationRule__Group__17 : rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 ;
    public final void rule__AdaptationRule__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3297:1: ( rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 )
            // InternalAdaptDsl.g:3298:2: rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:3305:1: rule__AdaptationRule__Group__17__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3309:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3310:1: ( ')' )
            {
            // InternalAdaptDsl.g:3310:1: ( ')' )
            // InternalAdaptDsl.g:3311:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3320:1: rule__AdaptationRule__Group__18 : rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 ;
    public final void rule__AdaptationRule__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3324:1: ( rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 )
            // InternalAdaptDsl.g:3325:2: rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19
            {
            pushFollow(FOLLOW_15);
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
    // InternalAdaptDsl.g:3332:1: rule__AdaptationRule__Group__18__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3336:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3337:1: ( ';' )
            {
            // InternalAdaptDsl.g:3337:1: ( ';' )
            // InternalAdaptDsl.g:3338:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3347:1: rule__AdaptationRule__Group__19 : rule__AdaptationRule__Group__19__Impl ;
    public final void rule__AdaptationRule__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3351:1: ( rule__AdaptationRule__Group__19__Impl )
            // InternalAdaptDsl.g:3352:2: rule__AdaptationRule__Group__19__Impl
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
    // InternalAdaptDsl.g:3358:1: rule__AdaptationRule__Group__19__Impl : ( '}' ) ;
    public final void rule__AdaptationRule__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3362:1: ( ( '}' ) )
            // InternalAdaptDsl.g:3363:1: ( '}' )
            {
            // InternalAdaptDsl.g:3363:1: ( '}' )
            // InternalAdaptDsl.g:3364:2: '}'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_19()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3374:1: rule__ConditionalOR__Group__0 : rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 ;
    public final void rule__ConditionalOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3378:1: ( rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 )
            // InternalAdaptDsl.g:3379:2: rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdaptDsl.g:3386:1: rule__ConditionalOR__Group__0__Impl : ( ( rule__ConditionalOR__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3390:1: ( ( ( rule__ConditionalOR__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:3391:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3391:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:3392:2: ( rule__ConditionalOR__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalORAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:3393:2: ( rule__ConditionalOR__LeftAssignment_0 )
            // InternalAdaptDsl.g:3393:3: rule__ConditionalOR__LeftAssignment_0
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
    // InternalAdaptDsl.g:3401:1: rule__ConditionalOR__Group__1 : rule__ConditionalOR__Group__1__Impl ;
    public final void rule__ConditionalOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3405:1: ( rule__ConditionalOR__Group__1__Impl )
            // InternalAdaptDsl.g:3406:2: rule__ConditionalOR__Group__1__Impl
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
    // InternalAdaptDsl.g:3412:1: rule__ConditionalOR__Group__1__Impl : ( ( rule__ConditionalOR__Group_1__0 )? ) ;
    public final void rule__ConditionalOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3416:1: ( ( ( rule__ConditionalOR__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3417:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3417:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            // InternalAdaptDsl.g:3418:2: ( rule__ConditionalOR__Group_1__0 )?
            {
             before(grammarAccess.getConditionalORAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3419:2: ( rule__ConditionalOR__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:3419:3: rule__ConditionalOR__Group_1__0
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
    // InternalAdaptDsl.g:3428:1: rule__ConditionalOR__Group_1__0 : rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 ;
    public final void rule__ConditionalOR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3432:1: ( rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 )
            // InternalAdaptDsl.g:3433:2: rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3440:1: rule__ConditionalOR__Group_1__0__Impl : ( '||' ) ;
    public final void rule__ConditionalOR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3444:1: ( ( '||' ) )
            // InternalAdaptDsl.g:3445:1: ( '||' )
            {
            // InternalAdaptDsl.g:3445:1: ( '||' )
            // InternalAdaptDsl.g:3446:2: '||'
            {
             before(grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3455:1: rule__ConditionalOR__Group_1__1 : rule__ConditionalOR__Group_1__1__Impl ;
    public final void rule__ConditionalOR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3459:1: ( rule__ConditionalOR__Group_1__1__Impl )
            // InternalAdaptDsl.g:3460:2: rule__ConditionalOR__Group_1__1__Impl
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
    // InternalAdaptDsl.g:3466:1: rule__ConditionalOR__Group_1__1__Impl : ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalOR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3470:1: ( ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3471:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3471:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3472:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalORAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3473:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3473:3: rule__ConditionalOR__RightAssignment_1_1
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
    // InternalAdaptDsl.g:3482:1: rule__ConditionalAND__Group__0 : rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 ;
    public final void rule__ConditionalAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3486:1: ( rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 )
            // InternalAdaptDsl.g:3487:2: rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptDsl.g:3494:1: rule__ConditionalAND__Group__0__Impl : ( ( rule__ConditionalAND__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3498:1: ( ( ( rule__ConditionalAND__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:3499:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3499:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:3500:2: ( rule__ConditionalAND__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalANDAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:3501:2: ( rule__ConditionalAND__LeftAssignment_0 )
            // InternalAdaptDsl.g:3501:3: rule__ConditionalAND__LeftAssignment_0
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
    // InternalAdaptDsl.g:3509:1: rule__ConditionalAND__Group__1 : rule__ConditionalAND__Group__1__Impl ;
    public final void rule__ConditionalAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3513:1: ( rule__ConditionalAND__Group__1__Impl )
            // InternalAdaptDsl.g:3514:2: rule__ConditionalAND__Group__1__Impl
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
    // InternalAdaptDsl.g:3520:1: rule__ConditionalAND__Group__1__Impl : ( ( rule__ConditionalAND__Group_1__0 )? ) ;
    public final void rule__ConditionalAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3524:1: ( ( ( rule__ConditionalAND__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3525:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3525:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            // InternalAdaptDsl.g:3526:2: ( rule__ConditionalAND__Group_1__0 )?
            {
             before(grammarAccess.getConditionalANDAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3527:2: ( rule__ConditionalAND__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdaptDsl.g:3527:3: rule__ConditionalAND__Group_1__0
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
    // InternalAdaptDsl.g:3536:1: rule__ConditionalAND__Group_1__0 : rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 ;
    public final void rule__ConditionalAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3540:1: ( rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 )
            // InternalAdaptDsl.g:3541:2: rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3548:1: rule__ConditionalAND__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__ConditionalAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3552:1: ( ( '&&' ) )
            // InternalAdaptDsl.g:3553:1: ( '&&' )
            {
            // InternalAdaptDsl.g:3553:1: ( '&&' )
            // InternalAdaptDsl.g:3554:2: '&&'
            {
             before(grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3563:1: rule__ConditionalAND__Group_1__1 : rule__ConditionalAND__Group_1__1__Impl ;
    public final void rule__ConditionalAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3567:1: ( rule__ConditionalAND__Group_1__1__Impl )
            // InternalAdaptDsl.g:3568:2: rule__ConditionalAND__Group_1__1__Impl
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
    // InternalAdaptDsl.g:3574:1: rule__ConditionalAND__Group_1__1__Impl : ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3578:1: ( ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3579:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3579:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3580:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalANDAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3581:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3581:3: rule__ConditionalAND__RightAssignment_1_1
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
    // InternalAdaptDsl.g:3590:1: rule__BooleanCondition__Group_0__0 : rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 ;
    public final void rule__BooleanCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3594:1: ( rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 )
            // InternalAdaptDsl.g:3595:2: rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptDsl.g:3602:1: rule__BooleanCondition__Group_0__0__Impl : ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) ;
    public final void rule__BooleanCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3606:1: ( ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) )
            // InternalAdaptDsl.g:3607:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            {
            // InternalAdaptDsl.g:3607:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            // InternalAdaptDsl.g:3608:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getFactAssignment_0_0()); 
            // InternalAdaptDsl.g:3609:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            // InternalAdaptDsl.g:3609:3: rule__BooleanCondition__FactAssignment_0_0
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
    // InternalAdaptDsl.g:3617:1: rule__BooleanCondition__Group_0__1 : rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 ;
    public final void rule__BooleanCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3621:1: ( rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 )
            // InternalAdaptDsl.g:3622:2: rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptDsl.g:3629:1: rule__BooleanCondition__Group_0__1__Impl : ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) ;
    public final void rule__BooleanCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3633:1: ( ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) )
            // InternalAdaptDsl.g:3634:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            {
            // InternalAdaptDsl.g:3634:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            // InternalAdaptDsl.g:3635:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getBooleanConditionAccess().getOpAssignment_0_1()); 
            // InternalAdaptDsl.g:3636:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            // InternalAdaptDsl.g:3636:3: rule__BooleanCondition__OpAssignment_0_1
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
    // InternalAdaptDsl.g:3644:1: rule__BooleanCondition__Group_0__2 : rule__BooleanCondition__Group_0__2__Impl ;
    public final void rule__BooleanCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3648:1: ( rule__BooleanCondition__Group_0__2__Impl )
            // InternalAdaptDsl.g:3649:2: rule__BooleanCondition__Group_0__2__Impl
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
    // InternalAdaptDsl.g:3655:1: rule__BooleanCondition__Group_0__2__Impl : ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) ;
    public final void rule__BooleanCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3659:1: ( ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) )
            // InternalAdaptDsl.g:3660:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            {
            // InternalAdaptDsl.g:3660:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            // InternalAdaptDsl.g:3661:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            {
             before(grammarAccess.getBooleanConditionAccess().getValAssignment_0_2()); 
            // InternalAdaptDsl.g:3662:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            // InternalAdaptDsl.g:3662:3: rule__BooleanCondition__ValAssignment_0_2
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
    // InternalAdaptDsl.g:3671:1: rule__NumberCondition__Group__0 : rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 ;
    public final void rule__NumberCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3675:1: ( rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 )
            // InternalAdaptDsl.g:3676:2: rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdaptDsl.g:3683:1: rule__NumberCondition__Group__0__Impl : ( ( rule__NumberCondition__FactAssignment_0 ) ) ;
    public final void rule__NumberCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3687:1: ( ( ( rule__NumberCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:3688:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3688:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:3689:2: ( rule__NumberCondition__FactAssignment_0 )
            {
             before(grammarAccess.getNumberConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:3690:2: ( rule__NumberCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:3690:3: rule__NumberCondition__FactAssignment_0
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
    // InternalAdaptDsl.g:3698:1: rule__NumberCondition__Group__1 : rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 ;
    public final void rule__NumberCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3702:1: ( rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 )
            // InternalAdaptDsl.g:3703:2: rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdaptDsl.g:3710:1: rule__NumberCondition__Group__1__Impl : ( ( rule__NumberCondition__OpAssignment_1 ) ) ;
    public final void rule__NumberCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3714:1: ( ( ( rule__NumberCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:3715:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3715:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:3716:2: ( rule__NumberCondition__OpAssignment_1 )
            {
             before(grammarAccess.getNumberConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:3717:2: ( rule__NumberCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:3717:3: rule__NumberCondition__OpAssignment_1
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
    // InternalAdaptDsl.g:3725:1: rule__NumberCondition__Group__2 : rule__NumberCondition__Group__2__Impl ;
    public final void rule__NumberCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3729:1: ( rule__NumberCondition__Group__2__Impl )
            // InternalAdaptDsl.g:3730:2: rule__NumberCondition__Group__2__Impl
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
    // InternalAdaptDsl.g:3736:1: rule__NumberCondition__Group__2__Impl : ( ( rule__NumberCondition__ValAssignment_2 ) ) ;
    public final void rule__NumberCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3740:1: ( ( ( rule__NumberCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:3741:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:3741:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:3742:2: ( rule__NumberCondition__ValAssignment_2 )
            {
             before(grammarAccess.getNumberConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:3743:2: ( rule__NumberCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:3743:3: rule__NumberCondition__ValAssignment_2
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
    // InternalAdaptDsl.g:3752:1: rule__StringCondition__Group__0 : rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 ;
    public final void rule__StringCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3756:1: ( rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 )
            // InternalAdaptDsl.g:3757:2: rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptDsl.g:3764:1: rule__StringCondition__Group__0__Impl : ( ( rule__StringCondition__FactAssignment_0 ) ) ;
    public final void rule__StringCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3768:1: ( ( ( rule__StringCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:3769:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3769:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:3770:2: ( rule__StringCondition__FactAssignment_0 )
            {
             before(grammarAccess.getStringConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:3771:2: ( rule__StringCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:3771:3: rule__StringCondition__FactAssignment_0
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
    // InternalAdaptDsl.g:3779:1: rule__StringCondition__Group__1 : rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 ;
    public final void rule__StringCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3783:1: ( rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 )
            // InternalAdaptDsl.g:3784:2: rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2
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
    // InternalAdaptDsl.g:3791:1: rule__StringCondition__Group__1__Impl : ( ( rule__StringCondition__OpAssignment_1 ) ) ;
    public final void rule__StringCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3795:1: ( ( ( rule__StringCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:3796:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3796:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:3797:2: ( rule__StringCondition__OpAssignment_1 )
            {
             before(grammarAccess.getStringConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:3798:2: ( rule__StringCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:3798:3: rule__StringCondition__OpAssignment_1
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
    // InternalAdaptDsl.g:3806:1: rule__StringCondition__Group__2 : rule__StringCondition__Group__2__Impl ;
    public final void rule__StringCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3810:1: ( rule__StringCondition__Group__2__Impl )
            // InternalAdaptDsl.g:3811:2: rule__StringCondition__Group__2__Impl
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
    // InternalAdaptDsl.g:3817:1: rule__StringCondition__Group__2__Impl : ( ( rule__StringCondition__ValAssignment_2 ) ) ;
    public final void rule__StringCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3821:1: ( ( ( rule__StringCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:3822:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:3822:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:3823:2: ( rule__StringCondition__ValAssignment_2 )
            {
             before(grammarAccess.getStringConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:3824:2: ( rule__StringCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:3824:3: rule__StringCondition__ValAssignment_2
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
    // InternalAdaptDsl.g:3833:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3837:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalAdaptDsl.g:3838:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptDsl.g:3845:1: rule__Fact__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3849:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3850:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3850:1: ( RULE_ID )
            // InternalAdaptDsl.g:3851:2: RULE_ID
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
    // InternalAdaptDsl.g:3860:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3864:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // InternalAdaptDsl.g:3865:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptDsl.g:3872:1: rule__Fact__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3876:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:3877:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:3877:1: ( ( '()' )? )
            // InternalAdaptDsl.g:3878:2: ( '()' )?
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:3879:2: ( '()' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:3879:3: '()'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3887:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3891:1: ( rule__Fact__Group__2__Impl )
            // InternalAdaptDsl.g:3892:2: rule__Fact__Group__2__Impl
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
    // InternalAdaptDsl.g:3898:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__Group_2__0 )* ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3902:1: ( ( ( rule__Fact__Group_2__0 )* ) )
            // InternalAdaptDsl.g:3903:1: ( ( rule__Fact__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:3903:1: ( ( rule__Fact__Group_2__0 )* )
            // InternalAdaptDsl.g:3904:2: ( rule__Fact__Group_2__0 )*
            {
             before(grammarAccess.getFactAccess().getGroup_2()); 
            // InternalAdaptDsl.g:3905:2: ( rule__Fact__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAdaptDsl.g:3905:3: rule__Fact__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Fact__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAdaptDsl.g:3914:1: rule__Fact__Group_2__0 : rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 ;
    public final void rule__Fact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3918:1: ( rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 )
            // InternalAdaptDsl.g:3919:2: rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3926:1: rule__Fact__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Fact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3930:1: ( ( '.' ) )
            // InternalAdaptDsl.g:3931:1: ( '.' )
            {
            // InternalAdaptDsl.g:3931:1: ( '.' )
            // InternalAdaptDsl.g:3932:2: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3941:1: rule__Fact__Group_2__1 : rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2 ;
    public final void rule__Fact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3945:1: ( rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2 )
            // InternalAdaptDsl.g:3946:2: rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdaptDsl.g:3953:1: rule__Fact__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Fact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3957:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:3958:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:3958:1: ( RULE_ID )
            // InternalAdaptDsl.g:3959:2: RULE_ID
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
    // InternalAdaptDsl.g:3968:1: rule__Fact__Group_2__2 : rule__Fact__Group_2__2__Impl ;
    public final void rule__Fact__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3972:1: ( rule__Fact__Group_2__2__Impl )
            // InternalAdaptDsl.g:3973:2: rule__Fact__Group_2__2__Impl
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
    // InternalAdaptDsl.g:3979:1: rule__Fact__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__Fact__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3983:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:3984:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:3984:1: ( ( '()' )? )
            // InternalAdaptDsl.g:3985:2: ( '()' )?
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:3986:2: ( '()' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:3986:3: '()'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3995:1: rule__FactProperty__Group__0 : rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 ;
    public final void rule__FactProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3999:1: ( rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 )
            // InternalAdaptDsl.g:4000:2: rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptDsl.g:4007:1: rule__FactProperty__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4011:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4012:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4012:1: ( RULE_ID )
            // InternalAdaptDsl.g:4013:2: RULE_ID
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
    // InternalAdaptDsl.g:4022:1: rule__FactProperty__Group__1 : rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 ;
    public final void rule__FactProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4026:1: ( rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 )
            // InternalAdaptDsl.g:4027:2: rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptDsl.g:4034:1: rule__FactProperty__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4038:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4039:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4039:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4040:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:4041:2: ( '()' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptDsl.g:4041:3: '()'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4049:1: rule__FactProperty__Group__2 : rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 ;
    public final void rule__FactProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4053:1: ( rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 )
            // InternalAdaptDsl.g:4054:2: rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptDsl.g:4061:1: rule__FactProperty__Group__2__Impl : ( ( rule__FactProperty__Group_2__0 )* ) ;
    public final void rule__FactProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4065:1: ( ( ( rule__FactProperty__Group_2__0 )* ) )
            // InternalAdaptDsl.g:4066:1: ( ( rule__FactProperty__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:4066:1: ( ( rule__FactProperty__Group_2__0 )* )
            // InternalAdaptDsl.g:4067:2: ( rule__FactProperty__Group_2__0 )*
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_2()); 
            // InternalAdaptDsl.g:4068:2: ( rule__FactProperty__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==43) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_ID) ) {
                        int LA26_2 = input.LA(3);

                        if ( ((LA26_2>=42 && LA26_2<=43)) ) {
                            alt26=1;
                        }


                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalAdaptDsl.g:4068:3: rule__FactProperty__Group_2__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__FactProperty__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalAdaptDsl.g:4076:1: rule__FactProperty__Group__3 : rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 ;
    public final void rule__FactProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4080:1: ( rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 )
            // InternalAdaptDsl.g:4081:2: rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:4088:1: rule__FactProperty__Group__3__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4092:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4093:1: ( '.' )
            {
            // InternalAdaptDsl.g:4093:1: ( '.' )
            // InternalAdaptDsl.g:4094:2: '.'
            {
             before(grammarAccess.getFactPropertyAccess().getFullStopKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4103:1: rule__FactProperty__Group__4 : rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 ;
    public final void rule__FactProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4107:1: ( rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 )
            // InternalAdaptDsl.g:4108:2: rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:4115:1: rule__FactProperty__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4119:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4120:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4120:1: ( RULE_ID )
            // InternalAdaptDsl.g:4121:2: RULE_ID
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
    // InternalAdaptDsl.g:4130:1: rule__FactProperty__Group__5 : rule__FactProperty__Group__5__Impl ;
    public final void rule__FactProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4134:1: ( rule__FactProperty__Group__5__Impl )
            // InternalAdaptDsl.g:4135:2: rule__FactProperty__Group__5__Impl
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
    // InternalAdaptDsl.g:4141:1: rule__FactProperty__Group__5__Impl : ( ( rule__FactProperty__Group_5__0 )? ) ;
    public final void rule__FactProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4145:1: ( ( ( rule__FactProperty__Group_5__0 )? ) )
            // InternalAdaptDsl.g:4146:1: ( ( rule__FactProperty__Group_5__0 )? )
            {
            // InternalAdaptDsl.g:4146:1: ( ( rule__FactProperty__Group_5__0 )? )
            // InternalAdaptDsl.g:4147:2: ( rule__FactProperty__Group_5__0 )?
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_5()); 
            // InternalAdaptDsl.g:4148:2: ( rule__FactProperty__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:4148:3: rule__FactProperty__Group_5__0
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
    // InternalAdaptDsl.g:4157:1: rule__FactProperty__Group_2__0 : rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 ;
    public final void rule__FactProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4161:1: ( rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 )
            // InternalAdaptDsl.g:4162:2: rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:4169:1: rule__FactProperty__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4173:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4174:1: ( '.' )
            {
            // InternalAdaptDsl.g:4174:1: ( '.' )
            // InternalAdaptDsl.g:4175:2: '.'
            {
             before(grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4184:1: rule__FactProperty__Group_2__1 : rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 ;
    public final void rule__FactProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4188:1: ( rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 )
            // InternalAdaptDsl.g:4189:2: rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdaptDsl.g:4196:1: rule__FactProperty__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4200:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4201:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4201:1: ( RULE_ID )
            // InternalAdaptDsl.g:4202:2: RULE_ID
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
    // InternalAdaptDsl.g:4211:1: rule__FactProperty__Group_2__2 : rule__FactProperty__Group_2__2__Impl ;
    public final void rule__FactProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4215:1: ( rule__FactProperty__Group_2__2__Impl )
            // InternalAdaptDsl.g:4216:2: rule__FactProperty__Group_2__2__Impl
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
    // InternalAdaptDsl.g:4222:1: rule__FactProperty__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4226:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4227:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4227:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4228:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:4229:2: ( '()' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAdaptDsl.g:4229:3: '()'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4238:1: rule__FactProperty__Group_5__0 : rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 ;
    public final void rule__FactProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4242:1: ( rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 )
            // InternalAdaptDsl.g:4243:2: rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4250:1: rule__FactProperty__Group_5__0__Impl : ( '(' ) ;
    public final void rule__FactProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4254:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4255:1: ( '(' )
            {
            // InternalAdaptDsl.g:4255:1: ( '(' )
            // InternalAdaptDsl.g:4256:2: '('
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4265:1: rule__FactProperty__Group_5__1 : rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 ;
    public final void rule__FactProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4269:1: ( rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 )
            // InternalAdaptDsl.g:4270:2: rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:4277:1: rule__FactProperty__Group_5__1__Impl : ( ruleValue ) ;
    public final void rule__FactProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4281:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:4282:1: ( ruleValue )
            {
            // InternalAdaptDsl.g:4282:1: ( ruleValue )
            // InternalAdaptDsl.g:4283:2: ruleValue
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
    // InternalAdaptDsl.g:4292:1: rule__FactProperty__Group_5__2 : rule__FactProperty__Group_5__2__Impl ;
    public final void rule__FactProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4296:1: ( rule__FactProperty__Group_5__2__Impl )
            // InternalAdaptDsl.g:4297:2: rule__FactProperty__Group_5__2__Impl
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
    // InternalAdaptDsl.g:4303:1: rule__FactProperty__Group_5__2__Impl : ( ')' ) ;
    public final void rule__FactProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4307:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4308:1: ( ')' )
            {
            // InternalAdaptDsl.g:4308:1: ( ')' )
            // InternalAdaptDsl.g:4309:2: ')'
            {
             before(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4319:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4323:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalAdaptDsl.g:4324:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAdaptDsl.g:4331:1: rule__Actions__Group__0__Impl : ( ( rule__Actions__ActionAssignment_0 ) ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4335:1: ( ( ( rule__Actions__ActionAssignment_0 ) ) )
            // InternalAdaptDsl.g:4336:1: ( ( rule__Actions__ActionAssignment_0 ) )
            {
            // InternalAdaptDsl.g:4336:1: ( ( rule__Actions__ActionAssignment_0 ) )
            // InternalAdaptDsl.g:4337:2: ( rule__Actions__ActionAssignment_0 )
            {
             before(grammarAccess.getActionsAccess().getActionAssignment_0()); 
            // InternalAdaptDsl.g:4338:2: ( rule__Actions__ActionAssignment_0 )
            // InternalAdaptDsl.g:4338:3: rule__Actions__ActionAssignment_0
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
    // InternalAdaptDsl.g:4346:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4350:1: ( rule__Actions__Group__1__Impl )
            // InternalAdaptDsl.g:4351:2: rule__Actions__Group__1__Impl
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
    // InternalAdaptDsl.g:4357:1: rule__Actions__Group__1__Impl : ( ( rule__Actions__NextAssignment_1 )? ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4361:1: ( ( ( rule__Actions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:4362:1: ( ( rule__Actions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:4362:1: ( ( rule__Actions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:4363:2: ( rule__Actions__NextAssignment_1 )?
            {
             before(grammarAccess.getActionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:4364:2: ( rule__Actions__NextAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44||(LA29_0>=46 && LA29_0<=60)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdaptDsl.g:4364:3: rule__Actions__NextAssignment_1
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
    // InternalAdaptDsl.g:4373:1: rule__ServiceFunctionCallOperation__Group__0 : rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 ;
    public final void rule__ServiceFunctionCallOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4377:1: ( rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 )
            // InternalAdaptDsl.g:4378:2: rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:4385:1: rule__ServiceFunctionCallOperation__Group__0__Impl : ( 'functionCall' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4389:1: ( ( 'functionCall' ) )
            // InternalAdaptDsl.g:4390:1: ( 'functionCall' )
            {
            // InternalAdaptDsl.g:4390:1: ( 'functionCall' )
            // InternalAdaptDsl.g:4391:2: 'functionCall'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4400:1: rule__ServiceFunctionCallOperation__Group__1 : rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 ;
    public final void rule__ServiceFunctionCallOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4404:1: ( rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 )
            // InternalAdaptDsl.g:4405:2: rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:4412:1: rule__ServiceFunctionCallOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4416:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4417:1: ( '(' )
            {
            // InternalAdaptDsl.g:4417:1: ( '(' )
            // InternalAdaptDsl.g:4418:2: '('
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4427:1: rule__ServiceFunctionCallOperation__Group__2 : rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 ;
    public final void rule__ServiceFunctionCallOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4431:1: ( rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 )
            // InternalAdaptDsl.g:4432:2: rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:4439:1: rule__ServiceFunctionCallOperation__Group__2__Impl : ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4443:1: ( ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) )
            // InternalAdaptDsl.g:4444:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4444:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            // InternalAdaptDsl.g:4445:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getServiceAssignment_2()); 
            // InternalAdaptDsl.g:4446:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            // InternalAdaptDsl.g:4446:3: rule__ServiceFunctionCallOperation__ServiceAssignment_2
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
    // InternalAdaptDsl.g:4454:1: rule__ServiceFunctionCallOperation__Group__3 : rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 ;
    public final void rule__ServiceFunctionCallOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4458:1: ( rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 )
            // InternalAdaptDsl.g:4459:2: rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:4466:1: rule__ServiceFunctionCallOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4470:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4471:1: ( ',' )
            {
            // InternalAdaptDsl.g:4471:1: ( ',' )
            // InternalAdaptDsl.g:4472:2: ','
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4481:1: rule__ServiceFunctionCallOperation__Group__4 : rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 ;
    public final void rule__ServiceFunctionCallOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4485:1: ( rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 )
            // InternalAdaptDsl.g:4486:2: rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:4493:1: rule__ServiceFunctionCallOperation__Group__4__Impl : ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4497:1: ( ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) )
            // InternalAdaptDsl.g:4498:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4498:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            // InternalAdaptDsl.g:4499:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionAssignment_4()); 
            // InternalAdaptDsl.g:4500:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            // InternalAdaptDsl.g:4500:3: rule__ServiceFunctionCallOperation__FunctionAssignment_4
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
    // InternalAdaptDsl.g:4508:1: rule__ServiceFunctionCallOperation__Group__5 : rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 ;
    public final void rule__ServiceFunctionCallOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4512:1: ( rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 )
            // InternalAdaptDsl.g:4513:2: rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4520:1: rule__ServiceFunctionCallOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4524:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4525:1: ( ',' )
            {
            // InternalAdaptDsl.g:4525:1: ( ',' )
            // InternalAdaptDsl.g:4526:2: ','
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4535:1: rule__ServiceFunctionCallOperation__Group__6 : rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 ;
    public final void rule__ServiceFunctionCallOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4539:1: ( rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 )
            // InternalAdaptDsl.g:4540:2: rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:4547:1: rule__ServiceFunctionCallOperation__Group__6__Impl : ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4551:1: ( ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) )
            // InternalAdaptDsl.g:4552:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            {
            // InternalAdaptDsl.g:4552:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            // InternalAdaptDsl.g:4553:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getValAssignment_6()); 
            // InternalAdaptDsl.g:4554:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            // InternalAdaptDsl.g:4554:3: rule__ServiceFunctionCallOperation__ValAssignment_6
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
    // InternalAdaptDsl.g:4562:1: rule__ServiceFunctionCallOperation__Group__7 : rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 ;
    public final void rule__ServiceFunctionCallOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4566:1: ( rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 )
            // InternalAdaptDsl.g:4567:2: rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:4574:1: rule__ServiceFunctionCallOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4578:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4579:1: ( ')' )
            {
            // InternalAdaptDsl.g:4579:1: ( ')' )
            // InternalAdaptDsl.g:4580:2: ')'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4589:1: rule__ServiceFunctionCallOperation__Group__8 : rule__ServiceFunctionCallOperation__Group__8__Impl ;
    public final void rule__ServiceFunctionCallOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4593:1: ( rule__ServiceFunctionCallOperation__Group__8__Impl )
            // InternalAdaptDsl.g:4594:2: rule__ServiceFunctionCallOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:4600:1: rule__ServiceFunctionCallOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4604:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4605:1: ( ';' )
            {
            // InternalAdaptDsl.g:4605:1: ( ';' )
            // InternalAdaptDsl.g:4606:2: ';'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4616:1: rule__EditFactOperation__Group__0 : rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 ;
    public final void rule__EditFactOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4620:1: ( rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 )
            // InternalAdaptDsl.g:4621:2: rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:4628:1: rule__EditFactOperation__Group__0__Impl : ( 'editFact' ) ;
    public final void rule__EditFactOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4632:1: ( ( 'editFact' ) )
            // InternalAdaptDsl.g:4633:1: ( 'editFact' )
            {
            // InternalAdaptDsl.g:4633:1: ( 'editFact' )
            // InternalAdaptDsl.g:4634:2: 'editFact'
            {
             before(grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4643:1: rule__EditFactOperation__Group__1 : rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 ;
    public final void rule__EditFactOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4647:1: ( rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 )
            // InternalAdaptDsl.g:4648:2: rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:4655:1: rule__EditFactOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EditFactOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4659:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4660:1: ( '(' )
            {
            // InternalAdaptDsl.g:4660:1: ( '(' )
            // InternalAdaptDsl.g:4661:2: '('
            {
             before(grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4670:1: rule__EditFactOperation__Group__2 : rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 ;
    public final void rule__EditFactOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4674:1: ( rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 )
            // InternalAdaptDsl.g:4675:2: rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptDsl.g:4682:1: rule__EditFactOperation__Group__2__Impl : ( ( rule__EditFactOperation__PropAssignment_2 ) ) ;
    public final void rule__EditFactOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4686:1: ( ( ( rule__EditFactOperation__PropAssignment_2 ) ) )
            // InternalAdaptDsl.g:4687:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4687:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            // InternalAdaptDsl.g:4688:2: ( rule__EditFactOperation__PropAssignment_2 )
            {
             before(grammarAccess.getEditFactOperationAccess().getPropAssignment_2()); 
            // InternalAdaptDsl.g:4689:2: ( rule__EditFactOperation__PropAssignment_2 )
            // InternalAdaptDsl.g:4689:3: rule__EditFactOperation__PropAssignment_2
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
    // InternalAdaptDsl.g:4697:1: rule__EditFactOperation__Group__3 : rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 ;
    public final void rule__EditFactOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4701:1: ( rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 )
            // InternalAdaptDsl.g:4702:2: rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptDsl.g:4709:1: rule__EditFactOperation__Group__3__Impl : ( ( rule__EditFactOperation__Group_3__0 )? ) ;
    public final void rule__EditFactOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4713:1: ( ( ( rule__EditFactOperation__Group_3__0 )? ) )
            // InternalAdaptDsl.g:4714:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            {
            // InternalAdaptDsl.g:4714:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            // InternalAdaptDsl.g:4715:2: ( rule__EditFactOperation__Group_3__0 )?
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup_3()); 
            // InternalAdaptDsl.g:4716:2: ( rule__EditFactOperation__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdaptDsl.g:4716:3: rule__EditFactOperation__Group_3__0
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
    // InternalAdaptDsl.g:4724:1: rule__EditFactOperation__Group__4 : rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 ;
    public final void rule__EditFactOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4728:1: ( rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 )
            // InternalAdaptDsl.g:4729:2: rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:4736:1: rule__EditFactOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__EditFactOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4740:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4741:1: ( ')' )
            {
            // InternalAdaptDsl.g:4741:1: ( ')' )
            // InternalAdaptDsl.g:4742:2: ')'
            {
             before(grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4751:1: rule__EditFactOperation__Group__5 : rule__EditFactOperation__Group__5__Impl ;
    public final void rule__EditFactOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4755:1: ( rule__EditFactOperation__Group__5__Impl )
            // InternalAdaptDsl.g:4756:2: rule__EditFactOperation__Group__5__Impl
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
    // InternalAdaptDsl.g:4762:1: rule__EditFactOperation__Group__5__Impl : ( ';' ) ;
    public final void rule__EditFactOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4766:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4767:1: ( ';' )
            {
            // InternalAdaptDsl.g:4767:1: ( ';' )
            // InternalAdaptDsl.g:4768:2: ';'
            {
             before(grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4778:1: rule__EditFactOperation__Group_3__0 : rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 ;
    public final void rule__EditFactOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4782:1: ( rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 )
            // InternalAdaptDsl.g:4783:2: rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4790:1: rule__EditFactOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EditFactOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4794:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4795:1: ( ',' )
            {
            // InternalAdaptDsl.g:4795:1: ( ',' )
            // InternalAdaptDsl.g:4796:2: ','
            {
             before(grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4805:1: rule__EditFactOperation__Group_3__1 : rule__EditFactOperation__Group_3__1__Impl ;
    public final void rule__EditFactOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4809:1: ( rule__EditFactOperation__Group_3__1__Impl )
            // InternalAdaptDsl.g:4810:2: rule__EditFactOperation__Group_3__1__Impl
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
    // InternalAdaptDsl.g:4816:1: rule__EditFactOperation__Group_3__1__Impl : ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) ;
    public final void rule__EditFactOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4820:1: ( ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) )
            // InternalAdaptDsl.g:4821:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            {
            // InternalAdaptDsl.g:4821:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            // InternalAdaptDsl.g:4822:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            {
             before(grammarAccess.getEditFactOperationAccess().getValAssignment_3_1()); 
            // InternalAdaptDsl.g:4823:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            // InternalAdaptDsl.g:4823:3: rule__EditFactOperation__ValAssignment_3_1
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
    // InternalAdaptDsl.g:4832:1: rule__SetDisplayPropertyOperation__Group__0 : rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 ;
    public final void rule__SetDisplayPropertyOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4836:1: ( rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 )
            // InternalAdaptDsl.g:4837:2: rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:4844:1: rule__SetDisplayPropertyOperation__Group__0__Impl : ( 'setDisplayProperty' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4848:1: ( ( 'setDisplayProperty' ) )
            // InternalAdaptDsl.g:4849:1: ( 'setDisplayProperty' )
            {
            // InternalAdaptDsl.g:4849:1: ( 'setDisplayProperty' )
            // InternalAdaptDsl.g:4850:2: 'setDisplayProperty'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4859:1: rule__SetDisplayPropertyOperation__Group__1 : rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 ;
    public final void rule__SetDisplayPropertyOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4863:1: ( rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 )
            // InternalAdaptDsl.g:4864:2: rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2
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
    // InternalAdaptDsl.g:4871:1: rule__SetDisplayPropertyOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4875:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4876:1: ( '(' )
            {
            // InternalAdaptDsl.g:4876:1: ( '(' )
            // InternalAdaptDsl.g:4877:2: '('
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4886:1: rule__SetDisplayPropertyOperation__Group__2 : rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 ;
    public final void rule__SetDisplayPropertyOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4890:1: ( rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 )
            // InternalAdaptDsl.g:4891:2: rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:4898:1: rule__SetDisplayPropertyOperation__Group__2__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4902:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) )
            // InternalAdaptDsl.g:4903:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4903:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            // InternalAdaptDsl.g:4904:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyAssignment_2()); 
            // InternalAdaptDsl.g:4905:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            // InternalAdaptDsl.g:4905:3: rule__SetDisplayPropertyOperation__PropertyAssignment_2
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
    // InternalAdaptDsl.g:4913:1: rule__SetDisplayPropertyOperation__Group__3 : rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 ;
    public final void rule__SetDisplayPropertyOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4917:1: ( rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 )
            // InternalAdaptDsl.g:4918:2: rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4925:1: rule__SetDisplayPropertyOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4929:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4930:1: ( ',' )
            {
            // InternalAdaptDsl.g:4930:1: ( ',' )
            // InternalAdaptDsl.g:4931:2: ','
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4940:1: rule__SetDisplayPropertyOperation__Group__4 : rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 ;
    public final void rule__SetDisplayPropertyOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4944:1: ( rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 )
            // InternalAdaptDsl.g:4945:2: rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:4952:1: rule__SetDisplayPropertyOperation__Group__4__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4956:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) )
            // InternalAdaptDsl.g:4957:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4957:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            // InternalAdaptDsl.g:4958:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueAssignment_4()); 
            // InternalAdaptDsl.g:4959:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            // InternalAdaptDsl.g:4959:3: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4
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
    // InternalAdaptDsl.g:4967:1: rule__SetDisplayPropertyOperation__Group__5 : rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 ;
    public final void rule__SetDisplayPropertyOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4971:1: ( rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 )
            // InternalAdaptDsl.g:4972:2: rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:4979:1: rule__SetDisplayPropertyOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4983:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4984:1: ( ')' )
            {
            // InternalAdaptDsl.g:4984:1: ( ')' )
            // InternalAdaptDsl.g:4985:2: ')'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4994:1: rule__SetDisplayPropertyOperation__Group__6 : rule__SetDisplayPropertyOperation__Group__6__Impl ;
    public final void rule__SetDisplayPropertyOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4998:1: ( rule__SetDisplayPropertyOperation__Group__6__Impl )
            // InternalAdaptDsl.g:4999:2: rule__SetDisplayPropertyOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5005:1: rule__SetDisplayPropertyOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5009:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5010:1: ( ';' )
            {
            // InternalAdaptDsl.g:5010:1: ( ';' )
            // InternalAdaptDsl.g:5011:2: ';'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5021:1: rule__AddViewComponentOperation__Group__0 : rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 ;
    public final void rule__AddViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5025:1: ( rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:5026:2: rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5033:1: rule__AddViewComponentOperation__Group__0__Impl : ( 'addViewComponent' ) ;
    public final void rule__AddViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5037:1: ( ( 'addViewComponent' ) )
            // InternalAdaptDsl.g:5038:1: ( 'addViewComponent' )
            {
            // InternalAdaptDsl.g:5038:1: ( 'addViewComponent' )
            // InternalAdaptDsl.g:5039:2: 'addViewComponent'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5048:1: rule__AddViewComponentOperation__Group__1 : rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 ;
    public final void rule__AddViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5052:1: ( rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:5053:2: rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5060:1: rule__AddViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5064:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5065:1: ( '(' )
            {
            // InternalAdaptDsl.g:5065:1: ( '(' )
            // InternalAdaptDsl.g:5066:2: '('
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5075:1: rule__AddViewComponentOperation__Group__2 : rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 ;
    public final void rule__AddViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5079:1: ( rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:5080:2: rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:5087:1: rule__AddViewComponentOperation__Group__2__Impl : ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5091:1: ( ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5092:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5092:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5093:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5094:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5094:3: rule__AddViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5102:1: rule__AddViewComponentOperation__Group__3 : rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 ;
    public final void rule__AddViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5106:1: ( rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:5107:2: rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5114:1: rule__AddViewComponentOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5118:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5119:1: ( ',' )
            {
            // InternalAdaptDsl.g:5119:1: ( ',' )
            // InternalAdaptDsl.g:5120:2: ','
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5129:1: rule__AddViewComponentOperation__Group__4 : rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 ;
    public final void rule__AddViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5133:1: ( rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 )
            // InternalAdaptDsl.g:5134:2: rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:5141:1: rule__AddViewComponentOperation__Group__4__Impl : ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) ;
    public final void rule__AddViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5145:1: ( ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) )
            // InternalAdaptDsl.g:5146:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5146:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            // InternalAdaptDsl.g:5147:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetAssignment_4()); 
            // InternalAdaptDsl.g:5148:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            // InternalAdaptDsl.g:5148:3: rule__AddViewComponentOperation__TargetAssignment_4
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
    // InternalAdaptDsl.g:5156:1: rule__AddViewComponentOperation__Group__5 : rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 ;
    public final void rule__AddViewComponentOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5160:1: ( rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 )
            // InternalAdaptDsl.g:5161:2: rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:5168:1: rule__AddViewComponentOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddViewComponentOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5172:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5173:1: ( ')' )
            {
            // InternalAdaptDsl.g:5173:1: ( ')' )
            // InternalAdaptDsl.g:5174:2: ')'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5183:1: rule__AddViewComponentOperation__Group__6 : rule__AddViewComponentOperation__Group__6__Impl ;
    public final void rule__AddViewComponentOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5187:1: ( rule__AddViewComponentOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5188:2: rule__AddViewComponentOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5194:1: rule__AddViewComponentOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddViewComponentOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5198:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5199:1: ( ';' )
            {
            // InternalAdaptDsl.g:5199:1: ( ';' )
            // InternalAdaptDsl.g:5200:2: ';'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5210:1: rule__DeleteViewComponentOperation__Group__0 : rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 ;
    public final void rule__DeleteViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5214:1: ( rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:5215:2: rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5222:1: rule__DeleteViewComponentOperation__Group__0__Impl : ( 'deleteViewComponent' ) ;
    public final void rule__DeleteViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5226:1: ( ( 'deleteViewComponent' ) )
            // InternalAdaptDsl.g:5227:1: ( 'deleteViewComponent' )
            {
            // InternalAdaptDsl.g:5227:1: ( 'deleteViewComponent' )
            // InternalAdaptDsl.g:5228:2: 'deleteViewComponent'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5237:1: rule__DeleteViewComponentOperation__Group__1 : rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 ;
    public final void rule__DeleteViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5241:1: ( rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:5242:2: rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5249:1: rule__DeleteViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5253:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5254:1: ( '(' )
            {
            // InternalAdaptDsl.g:5254:1: ( '(' )
            // InternalAdaptDsl.g:5255:2: '('
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5264:1: rule__DeleteViewComponentOperation__Group__2 : rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 ;
    public final void rule__DeleteViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5268:1: ( rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:5269:2: rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:5276:1: rule__DeleteViewComponentOperation__Group__2__Impl : ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5280:1: ( ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5281:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5281:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5282:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5283:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5283:3: rule__DeleteViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5291:1: rule__DeleteViewComponentOperation__Group__3 : rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 ;
    public final void rule__DeleteViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5295:1: ( rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:5296:2: rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:5303:1: rule__DeleteViewComponentOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5307:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5308:1: ( ')' )
            {
            // InternalAdaptDsl.g:5308:1: ( ')' )
            // InternalAdaptDsl.g:5309:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5318:1: rule__DeleteViewComponentOperation__Group__4 : rule__DeleteViewComponentOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5322:1: ( rule__DeleteViewComponentOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5323:2: rule__DeleteViewComponentOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:5329:1: rule__DeleteViewComponentOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5333:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5334:1: ( ';' )
            {
            // InternalAdaptDsl.g:5334:1: ( ';' )
            // InternalAdaptDsl.g:5335:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__0"
    // InternalAdaptDsl.g:5345:1: rule__AddViewComponentButtonOperation__Group__0 : rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 ;
    public final void rule__AddViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5349:1: ( rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 )
            // InternalAdaptDsl.g:5350:2: rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AddViewComponentButtonOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__1();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__0"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5357:1: rule__AddViewComponentButtonOperation__Group__0__Impl : ( 'addViewComponentButton' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5361:1: ( ( 'addViewComponentButton' ) )
            // InternalAdaptDsl.g:5362:1: ( 'addViewComponentButton' )
            {
            // InternalAdaptDsl.g:5362:1: ( 'addViewComponentButton' )
            // InternalAdaptDsl.g:5363:2: 'addViewComponentButton'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getAddViewComponentButtonKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getAddViewComponentButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__0__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__1"
    // InternalAdaptDsl.g:5372:1: rule__AddViewComponentButtonOperation__Group__1 : rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 ;
    public final void rule__AddViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5376:1: ( rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 )
            // InternalAdaptDsl.g:5377:2: rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AddViewComponentButtonOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__2();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__1"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5384:1: rule__AddViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5388:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5389:1: ( '(' )
            {
            // InternalAdaptDsl.g:5389:1: ( '(' )
            // InternalAdaptDsl.g:5390:2: '('
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__1__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__2"
    // InternalAdaptDsl.g:5399:1: rule__AddViewComponentButtonOperation__Group__2 : rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 ;
    public final void rule__AddViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5403:1: ( rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 )
            // InternalAdaptDsl.g:5404:2: rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__AddViewComponentButtonOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__3();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__2"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5411:1: rule__AddViewComponentButtonOperation__Group__2__Impl : ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5415:1: ( ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptDsl.g:5416:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5416:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptDsl.g:5417:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptDsl.g:5418:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptDsl.g:5418:3: rule__AddViewComponentButtonOperation__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentButtonOperationAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__2__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__3"
    // InternalAdaptDsl.g:5426:1: rule__AddViewComponentButtonOperation__Group__3 : rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 ;
    public final void rule__AddViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5430:1: ( rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 )
            // InternalAdaptDsl.g:5431:2: rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AddViewComponentButtonOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__4();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__3"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5438:1: rule__AddViewComponentButtonOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5442:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5443:1: ( ',' )
            {
            // InternalAdaptDsl.g:5443:1: ( ',' )
            // InternalAdaptDsl.g:5444:2: ','
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__3__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__4"
    // InternalAdaptDsl.g:5453:1: rule__AddViewComponentButtonOperation__Group__4 : rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 ;
    public final void rule__AddViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5457:1: ( rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 )
            // InternalAdaptDsl.g:5458:2: rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__AddViewComponentButtonOperation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__5();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__4"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5465:1: rule__AddViewComponentButtonOperation__Group__4__Impl : ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5469:1: ( ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) )
            // InternalAdaptDsl.g:5470:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5470:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            // InternalAdaptDsl.g:5471:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeyAssignment_4()); 
            // InternalAdaptDsl.g:5472:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            // InternalAdaptDsl.g:5472:3: rule__AddViewComponentButtonOperation__LangKeyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__LangKeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__4__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__5"
    // InternalAdaptDsl.g:5480:1: rule__AddViewComponentButtonOperation__Group__5 : rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 ;
    public final void rule__AddViewComponentButtonOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5484:1: ( rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 )
            // InternalAdaptDsl.g:5485:2: rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__AddViewComponentButtonOperation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__6();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__5"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__5__Impl"
    // InternalAdaptDsl.g:5492:1: rule__AddViewComponentButtonOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5496:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5497:1: ( ',' )
            {
            // InternalAdaptDsl.g:5497:1: ( ',' )
            // InternalAdaptDsl.g:5498:2: ','
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__5__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__6"
    // InternalAdaptDsl.g:5507:1: rule__AddViewComponentButtonOperation__Group__6 : rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 ;
    public final void rule__AddViewComponentButtonOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5511:1: ( rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 )
            // InternalAdaptDsl.g:5512:2: rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__AddViewComponentButtonOperation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__7();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__6"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__6__Impl"
    // InternalAdaptDsl.g:5519:1: rule__AddViewComponentButtonOperation__Group__6__Impl : ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5523:1: ( ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) )
            // InternalAdaptDsl.g:5524:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            {
            // InternalAdaptDsl.g:5524:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            // InternalAdaptDsl.g:5525:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getActionAssignment_6()); 
            // InternalAdaptDsl.g:5526:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            // InternalAdaptDsl.g:5526:3: rule__AddViewComponentButtonOperation__ActionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__ActionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAddViewComponentButtonOperationAccess().getActionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__6__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__7"
    // InternalAdaptDsl.g:5534:1: rule__AddViewComponentButtonOperation__Group__7 : rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 ;
    public final void rule__AddViewComponentButtonOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5538:1: ( rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 )
            // InternalAdaptDsl.g:5539:2: rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__AddViewComponentButtonOperation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__8();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__7"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__7__Impl"
    // InternalAdaptDsl.g:5546:1: rule__AddViewComponentButtonOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5550:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5551:1: ( ')' )
            {
            // InternalAdaptDsl.g:5551:1: ( ')' )
            // InternalAdaptDsl.g:5552:2: ')'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__7__Impl"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__8"
    // InternalAdaptDsl.g:5561:1: rule__AddViewComponentButtonOperation__Group__8 : rule__AddViewComponentButtonOperation__Group__8__Impl ;
    public final void rule__AddViewComponentButtonOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5565:1: ( rule__AddViewComponentButtonOperation__Group__8__Impl )
            // InternalAdaptDsl.g:5566:2: rule__AddViewComponentButtonOperation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddViewComponentButtonOperation__Group__8__Impl();

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
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__8"


    // $ANTLR start "rule__AddViewComponentButtonOperation__Group__8__Impl"
    // InternalAdaptDsl.g:5572:1: rule__AddViewComponentButtonOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5576:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5577:1: ( ';' )
            {
            // InternalAdaptDsl.g:5577:1: ( ';' )
            // InternalAdaptDsl.g:5578:2: ';'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getSemicolonKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__Group__8__Impl"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__0"
    // InternalAdaptDsl.g:5588:1: rule__DeleteViewComponentButtonOperation__Group__0 : rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5592:1: ( rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 )
            // InternalAdaptDsl.g:5593:2: rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__DeleteViewComponentButtonOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__Group__1();

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
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__0"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__0__Impl"
    // InternalAdaptDsl.g:5600:1: rule__DeleteViewComponentButtonOperation__Group__0__Impl : ( 'deleteViewComponentButton' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5604:1: ( ( 'deleteViewComponentButton' ) )
            // InternalAdaptDsl.g:5605:1: ( 'deleteViewComponentButton' )
            {
            // InternalAdaptDsl.g:5605:1: ( 'deleteViewComponentButton' )
            // InternalAdaptDsl.g:5606:2: 'deleteViewComponentButton'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getDeleteViewComponentButtonKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getDeleteViewComponentButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__0__Impl"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__1"
    // InternalAdaptDsl.g:5615:1: rule__DeleteViewComponentButtonOperation__Group__1 : rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5619:1: ( rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 )
            // InternalAdaptDsl.g:5620:2: rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DeleteViewComponentButtonOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__Group__2();

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
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__1"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__1__Impl"
    // InternalAdaptDsl.g:5627:1: rule__DeleteViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5631:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5632:1: ( '(' )
            {
            // InternalAdaptDsl.g:5632:1: ( '(' )
            // InternalAdaptDsl.g:5633:2: '('
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__1__Impl"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__2"
    // InternalAdaptDsl.g:5642:1: rule__DeleteViewComponentButtonOperation__Group__2 : rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5646:1: ( rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 )
            // InternalAdaptDsl.g:5647:2: rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__DeleteViewComponentButtonOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__Group__3();

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
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__2"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__2__Impl"
    // InternalAdaptDsl.g:5654:1: rule__DeleteViewComponentButtonOperation__Group__2__Impl : ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5658:1: ( ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptDsl.g:5659:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5659:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptDsl.g:5660:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptDsl.g:5661:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptDsl.g:5661:3: rule__DeleteViewComponentButtonOperation__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__2__Impl"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__3"
    // InternalAdaptDsl.g:5669:1: rule__DeleteViewComponentButtonOperation__Group__3 : rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5673:1: ( rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 )
            // InternalAdaptDsl.g:5674:2: rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__DeleteViewComponentButtonOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__Group__4();

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
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__3"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__3__Impl"
    // InternalAdaptDsl.g:5681:1: rule__DeleteViewComponentButtonOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5685:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5686:1: ( ')' )
            {
            // InternalAdaptDsl.g:5686:1: ( ')' )
            // InternalAdaptDsl.g:5687:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__3__Impl"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__4"
    // InternalAdaptDsl.g:5696:1: rule__DeleteViewComponentButtonOperation__Group__4 : rule__DeleteViewComponentButtonOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5700:1: ( rule__DeleteViewComponentButtonOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5701:2: rule__DeleteViewComponentButtonOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteViewComponentButtonOperation__Group__4__Impl();

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
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__4"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__Group__4__Impl"
    // InternalAdaptDsl.g:5707:1: rule__DeleteViewComponentButtonOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5711:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5712:1: ( ';' )
            {
            // InternalAdaptDsl.g:5712:1: ( ';' )
            // InternalAdaptDsl.g:5713:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__Group__4__Impl"


    // $ANTLR start "rule__AddNavLinkOperation__Group__0"
    // InternalAdaptDsl.g:5723:1: rule__AddNavLinkOperation__Group__0 : rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 ;
    public final void rule__AddNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5727:1: ( rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:5728:2: rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5735:1: rule__AddNavLinkOperation__Group__0__Impl : ( 'addNavLink' ) ;
    public final void rule__AddNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5739:1: ( ( 'addNavLink' ) )
            // InternalAdaptDsl.g:5740:1: ( 'addNavLink' )
            {
            // InternalAdaptDsl.g:5740:1: ( 'addNavLink' )
            // InternalAdaptDsl.g:5741:2: 'addNavLink'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5750:1: rule__AddNavLinkOperation__Group__1 : rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 ;
    public final void rule__AddNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5754:1: ( rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:5755:2: rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5762:1: rule__AddNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5766:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5767:1: ( '(' )
            {
            // InternalAdaptDsl.g:5767:1: ( '(' )
            // InternalAdaptDsl.g:5768:2: '('
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5777:1: rule__AddNavLinkOperation__Group__2 : rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 ;
    public final void rule__AddNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5781:1: ( rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:5782:2: rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:5789:1: rule__AddNavLinkOperation__Group__2__Impl : ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5793:1: ( ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5794:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5794:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5795:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5796:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5796:3: rule__AddNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5804:1: rule__AddNavLinkOperation__Group__3 : rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 ;
    public final void rule__AddNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5808:1: ( rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:5809:2: rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4
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
    // InternalAdaptDsl.g:5816:1: rule__AddNavLinkOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5820:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5821:1: ( ',' )
            {
            // InternalAdaptDsl.g:5821:1: ( ',' )
            // InternalAdaptDsl.g:5822:2: ','
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5831:1: rule__AddNavLinkOperation__Group__4 : rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 ;
    public final void rule__AddNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5835:1: ( rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 )
            // InternalAdaptDsl.g:5836:2: rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:5843:1: rule__AddNavLinkOperation__Group__4__Impl : ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) ;
    public final void rule__AddNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5847:1: ( ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) )
            // InternalAdaptDsl.g:5848:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5848:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            // InternalAdaptDsl.g:5849:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextAssignment_4()); 
            // InternalAdaptDsl.g:5850:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            // InternalAdaptDsl.g:5850:3: rule__AddNavLinkOperation__TextAssignment_4
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
    // InternalAdaptDsl.g:5858:1: rule__AddNavLinkOperation__Group__5 : rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 ;
    public final void rule__AddNavLinkOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5862:1: ( rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 )
            // InternalAdaptDsl.g:5863:2: rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:5870:1: rule__AddNavLinkOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddNavLinkOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5874:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5875:1: ( ')' )
            {
            // InternalAdaptDsl.g:5875:1: ( ')' )
            // InternalAdaptDsl.g:5876:2: ')'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5885:1: rule__AddNavLinkOperation__Group__6 : rule__AddNavLinkOperation__Group__6__Impl ;
    public final void rule__AddNavLinkOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5889:1: ( rule__AddNavLinkOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5890:2: rule__AddNavLinkOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5896:1: rule__AddNavLinkOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddNavLinkOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5900:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5901:1: ( ';' )
            {
            // InternalAdaptDsl.g:5901:1: ( ';' )
            // InternalAdaptDsl.g:5902:2: ';'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5912:1: rule__DeleteNavLinkOperation__Group__0 : rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 ;
    public final void rule__DeleteNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5916:1: ( rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:5917:2: rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5924:1: rule__DeleteNavLinkOperation__Group__0__Impl : ( 'deleteNavLink' ) ;
    public final void rule__DeleteNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5928:1: ( ( 'deleteNavLink' ) )
            // InternalAdaptDsl.g:5929:1: ( 'deleteNavLink' )
            {
            // InternalAdaptDsl.g:5929:1: ( 'deleteNavLink' )
            // InternalAdaptDsl.g:5930:2: 'deleteNavLink'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5939:1: rule__DeleteNavLinkOperation__Group__1 : rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 ;
    public final void rule__DeleteNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5943:1: ( rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:5944:2: rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5951:1: rule__DeleteNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5955:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5956:1: ( '(' )
            {
            // InternalAdaptDsl.g:5956:1: ( '(' )
            // InternalAdaptDsl.g:5957:2: '('
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5966:1: rule__DeleteNavLinkOperation__Group__2 : rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 ;
    public final void rule__DeleteNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5970:1: ( rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:5971:2: rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:5978:1: rule__DeleteNavLinkOperation__Group__2__Impl : ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5982:1: ( ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5983:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5983:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5984:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5985:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5985:3: rule__DeleteNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5993:1: rule__DeleteNavLinkOperation__Group__3 : rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 ;
    public final void rule__DeleteNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5997:1: ( rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:5998:2: rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6005:1: rule__DeleteNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6009:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6010:1: ( ')' )
            {
            // InternalAdaptDsl.g:6010:1: ( ')' )
            // InternalAdaptDsl.g:6011:2: ')'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6020:1: rule__DeleteNavLinkOperation__Group__4 : rule__DeleteNavLinkOperation__Group__4__Impl ;
    public final void rule__DeleteNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6024:1: ( rule__DeleteNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6025:2: rule__DeleteNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6031:1: rule__DeleteNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6035:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6036:1: ( ';' )
            {
            // InternalAdaptDsl.g:6036:1: ( ';' )
            // InternalAdaptDsl.g:6037:2: ';'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6047:1: rule__RedirectNavLinkOperation__Group__0 : rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 ;
    public final void rule__RedirectNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6051:1: ( rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6052:2: rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6059:1: rule__RedirectNavLinkOperation__Group__0__Impl : ( 'redirectNavLink' ) ;
    public final void rule__RedirectNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6063:1: ( ( 'redirectNavLink' ) )
            // InternalAdaptDsl.g:6064:1: ( 'redirectNavLink' )
            {
            // InternalAdaptDsl.g:6064:1: ( 'redirectNavLink' )
            // InternalAdaptDsl.g:6065:2: 'redirectNavLink'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6074:1: rule__RedirectNavLinkOperation__Group__1 : rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 ;
    public final void rule__RedirectNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6078:1: ( rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6079:2: rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:6086:1: rule__RedirectNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__RedirectNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6090:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6091:1: ( '(' )
            {
            // InternalAdaptDsl.g:6091:1: ( '(' )
            // InternalAdaptDsl.g:6092:2: '('
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6101:1: rule__RedirectNavLinkOperation__Group__2 : rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 ;
    public final void rule__RedirectNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6105:1: ( rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6106:2: rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:6113:1: rule__RedirectNavLinkOperation__Group__2__Impl : ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__RedirectNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6117:1: ( ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6118:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6118:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6119:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6120:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6120:3: rule__RedirectNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6128:1: rule__RedirectNavLinkOperation__Group__3 : rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 ;
    public final void rule__RedirectNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6132:1: ( rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6133:2: rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6140:1: rule__RedirectNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RedirectNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6144:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6145:1: ( ')' )
            {
            // InternalAdaptDsl.g:6145:1: ( ')' )
            // InternalAdaptDsl.g:6146:2: ')'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6155:1: rule__RedirectNavLinkOperation__Group__4 : rule__RedirectNavLinkOperation__Group__4__Impl ;
    public final void rule__RedirectNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6159:1: ( rule__RedirectNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6160:2: rule__RedirectNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6166:1: rule__RedirectNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__RedirectNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6170:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6171:1: ( ';' )
            {
            // InternalAdaptDsl.g:6171:1: ( ';' )
            // InternalAdaptDsl.g:6172:2: ';'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6182:1: rule__ClearNavOperation__Group__0 : rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 ;
    public final void rule__ClearNavOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6186:1: ( rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 )
            // InternalAdaptDsl.g:6187:2: rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:6194:1: rule__ClearNavOperation__Group__0__Impl : ( () ) ;
    public final void rule__ClearNavOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6198:1: ( ( () ) )
            // InternalAdaptDsl.g:6199:1: ( () )
            {
            // InternalAdaptDsl.g:6199:1: ( () )
            // InternalAdaptDsl.g:6200:2: ()
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0()); 
            // InternalAdaptDsl.g:6201:2: ()
            // InternalAdaptDsl.g:6201:3: 
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
    // InternalAdaptDsl.g:6209:1: rule__ClearNavOperation__Group__1 : rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 ;
    public final void rule__ClearNavOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6213:1: ( rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 )
            // InternalAdaptDsl.g:6214:2: rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdaptDsl.g:6221:1: rule__ClearNavOperation__Group__1__Impl : ( 'clearNavigation' ) ;
    public final void rule__ClearNavOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6225:1: ( ( 'clearNavigation' ) )
            // InternalAdaptDsl.g:6226:1: ( 'clearNavigation' )
            {
            // InternalAdaptDsl.g:6226:1: ( 'clearNavigation' )
            // InternalAdaptDsl.g:6227:2: 'clearNavigation'
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6236:1: rule__ClearNavOperation__Group__2 : rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 ;
    public final void rule__ClearNavOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6240:1: ( rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 )
            // InternalAdaptDsl.g:6241:2: rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6248:1: rule__ClearNavOperation__Group__2__Impl : ( '()' ) ;
    public final void rule__ClearNavOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6252:1: ( ( '()' ) )
            // InternalAdaptDsl.g:6253:1: ( '()' )
            {
            // InternalAdaptDsl.g:6253:1: ( '()' )
            // InternalAdaptDsl.g:6254:2: '()'
            {
             before(grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6263:1: rule__ClearNavOperation__Group__3 : rule__ClearNavOperation__Group__3__Impl ;
    public final void rule__ClearNavOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6267:1: ( rule__ClearNavOperation__Group__3__Impl )
            // InternalAdaptDsl.g:6268:2: rule__ClearNavOperation__Group__3__Impl
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
    // InternalAdaptDsl.g:6274:1: rule__ClearNavOperation__Group__3__Impl : ( ';' ) ;
    public final void rule__ClearNavOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6278:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6279:1: ( ';' )
            {
            // InternalAdaptDsl.g:6279:1: ( ';' )
            // InternalAdaptDsl.g:6280:2: ';'
            {
             before(grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6290:1: rule__ChangeFontSizeOperation__Group__0 : rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 ;
    public final void rule__ChangeFontSizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6294:1: ( rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 )
            // InternalAdaptDsl.g:6295:2: rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6302:1: rule__ChangeFontSizeOperation__Group__0__Impl : ( 'changeFontSize' ) ;
    public final void rule__ChangeFontSizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6306:1: ( ( 'changeFontSize' ) )
            // InternalAdaptDsl.g:6307:1: ( 'changeFontSize' )
            {
            // InternalAdaptDsl.g:6307:1: ( 'changeFontSize' )
            // InternalAdaptDsl.g:6308:2: 'changeFontSize'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6317:1: rule__ChangeFontSizeOperation__Group__1 : rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 ;
    public final void rule__ChangeFontSizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6321:1: ( rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 )
            // InternalAdaptDsl.g:6322:2: rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdaptDsl.g:6329:1: rule__ChangeFontSizeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontSizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6333:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6334:1: ( '(' )
            {
            // InternalAdaptDsl.g:6334:1: ( '(' )
            // InternalAdaptDsl.g:6335:2: '('
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6344:1: rule__ChangeFontSizeOperation__Group__2 : rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 ;
    public final void rule__ChangeFontSizeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6348:1: ( rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 )
            // InternalAdaptDsl.g:6349:2: rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:6356:1: rule__ChangeFontSizeOperation__Group__2__Impl : ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6360:1: ( ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:6361:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6361:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:6362:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryAssignment_2()); 
            // InternalAdaptDsl.g:6363:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            // InternalAdaptDsl.g:6363:3: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2
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
    // InternalAdaptDsl.g:6371:1: rule__ChangeFontSizeOperation__Group__3 : rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 ;
    public final void rule__ChangeFontSizeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6375:1: ( rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 )
            // InternalAdaptDsl.g:6376:2: rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdaptDsl.g:6383:1: rule__ChangeFontSizeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeFontSizeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6387:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6388:1: ( ',' )
            {
            // InternalAdaptDsl.g:6388:1: ( ',' )
            // InternalAdaptDsl.g:6389:2: ','
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6398:1: rule__ChangeFontSizeOperation__Group__4 : rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 ;
    public final void rule__ChangeFontSizeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6402:1: ( rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 )
            // InternalAdaptDsl.g:6403:2: rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:6410:1: rule__ChangeFontSizeOperation__Group__4__Impl : ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6414:1: ( ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:6415:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6415:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:6416:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:6417:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            // InternalAdaptDsl.g:6417:3: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4
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
    // InternalAdaptDsl.g:6425:1: rule__ChangeFontSizeOperation__Group__5 : rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 ;
    public final void rule__ChangeFontSizeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6429:1: ( rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 )
            // InternalAdaptDsl.g:6430:2: rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6437:1: rule__ChangeFontSizeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeFontSizeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6441:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6442:1: ( ')' )
            {
            // InternalAdaptDsl.g:6442:1: ( ')' )
            // InternalAdaptDsl.g:6443:2: ')'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6452:1: rule__ChangeFontSizeOperation__Group__6 : rule__ChangeFontSizeOperation__Group__6__Impl ;
    public final void rule__ChangeFontSizeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6456:1: ( rule__ChangeFontSizeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6457:2: rule__ChangeFontSizeOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6463:1: rule__ChangeFontSizeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeFontSizeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6467:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6468:1: ( ';' )
            {
            // InternalAdaptDsl.g:6468:1: ( ';' )
            // InternalAdaptDsl.g:6469:2: ';'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6479:1: rule__ChangeColorSchemeOperation__Group__0 : rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 ;
    public final void rule__ChangeColorSchemeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6483:1: ( rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 )
            // InternalAdaptDsl.g:6484:2: rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6491:1: rule__ChangeColorSchemeOperation__Group__0__Impl : ( 'changeColorScheme' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6495:1: ( ( 'changeColorScheme' ) )
            // InternalAdaptDsl.g:6496:1: ( 'changeColorScheme' )
            {
            // InternalAdaptDsl.g:6496:1: ( 'changeColorScheme' )
            // InternalAdaptDsl.g:6497:2: 'changeColorScheme'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6506:1: rule__ChangeColorSchemeOperation__Group__1 : rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 ;
    public final void rule__ChangeColorSchemeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6510:1: ( rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 )
            // InternalAdaptDsl.g:6511:2: rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2
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
    // InternalAdaptDsl.g:6518:1: rule__ChangeColorSchemeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6522:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6523:1: ( '(' )
            {
            // InternalAdaptDsl.g:6523:1: ( '(' )
            // InternalAdaptDsl.g:6524:2: '('
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6533:1: rule__ChangeColorSchemeOperation__Group__2 : rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 ;
    public final void rule__ChangeColorSchemeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6537:1: ( rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 )
            // InternalAdaptDsl.g:6538:2: rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:6545:1: rule__ChangeColorSchemeOperation__Group__2__Impl : ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6549:1: ( ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:6550:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6550:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:6551:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryAssignment_2()); 
            // InternalAdaptDsl.g:6552:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            // InternalAdaptDsl.g:6552:3: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2
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
    // InternalAdaptDsl.g:6560:1: rule__ChangeColorSchemeOperation__Group__3 : rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 ;
    public final void rule__ChangeColorSchemeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6564:1: ( rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 )
            // InternalAdaptDsl.g:6565:2: rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4
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
    // InternalAdaptDsl.g:6572:1: rule__ChangeColorSchemeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6576:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6577:1: ( ',' )
            {
            // InternalAdaptDsl.g:6577:1: ( ',' )
            // InternalAdaptDsl.g:6578:2: ','
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6587:1: rule__ChangeColorSchemeOperation__Group__4 : rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 ;
    public final void rule__ChangeColorSchemeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6591:1: ( rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 )
            // InternalAdaptDsl.g:6592:2: rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:6599:1: rule__ChangeColorSchemeOperation__Group__4__Impl : ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6603:1: ( ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:6604:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6604:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:6605:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:6606:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            // InternalAdaptDsl.g:6606:3: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4
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
    // InternalAdaptDsl.g:6614:1: rule__ChangeColorSchemeOperation__Group__5 : rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 ;
    public final void rule__ChangeColorSchemeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6618:1: ( rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 )
            // InternalAdaptDsl.g:6619:2: rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6626:1: rule__ChangeColorSchemeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6630:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6631:1: ( ')' )
            {
            // InternalAdaptDsl.g:6631:1: ( ')' )
            // InternalAdaptDsl.g:6632:2: ')'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6641:1: rule__ChangeColorSchemeOperation__Group__6 : rule__ChangeColorSchemeOperation__Group__6__Impl ;
    public final void rule__ChangeColorSchemeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6645:1: ( rule__ChangeColorSchemeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6646:2: rule__ChangeColorSchemeOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6652:1: rule__ChangeColorSchemeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6656:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6657:1: ( ';' )
            {
            // InternalAdaptDsl.g:6657:1: ( ';' )
            // InternalAdaptDsl.g:6658:2: ';'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6668:1: rule__ChangeFontOperation__Group__0 : rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 ;
    public final void rule__ChangeFontOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6672:1: ( rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 )
            // InternalAdaptDsl.g:6673:2: rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6680:1: rule__ChangeFontOperation__Group__0__Impl : ( 'changeFont' ) ;
    public final void rule__ChangeFontOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6684:1: ( ( 'changeFont' ) )
            // InternalAdaptDsl.g:6685:1: ( 'changeFont' )
            {
            // InternalAdaptDsl.g:6685:1: ( 'changeFont' )
            // InternalAdaptDsl.g:6686:2: 'changeFont'
            {
             before(grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6695:1: rule__ChangeFontOperation__Group__1 : rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 ;
    public final void rule__ChangeFontOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6699:1: ( rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 )
            // InternalAdaptDsl.g:6700:2: rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2
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
    // InternalAdaptDsl.g:6707:1: rule__ChangeFontOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6711:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6712:1: ( '(' )
            {
            // InternalAdaptDsl.g:6712:1: ( '(' )
            // InternalAdaptDsl.g:6713:2: '('
            {
             before(grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6722:1: rule__ChangeFontOperation__Group__2 : rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 ;
    public final void rule__ChangeFontOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6726:1: ( rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 )
            // InternalAdaptDsl.g:6727:2: rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:6734:1: rule__ChangeFontOperation__Group__2__Impl : ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeFontOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6738:1: ( ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:6739:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6739:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:6740:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:6741:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:6741:3: rule__ChangeFontOperation__TextAssignment_2
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
    // InternalAdaptDsl.g:6749:1: rule__ChangeFontOperation__Group__3 : rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 ;
    public final void rule__ChangeFontOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6753:1: ( rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 )
            // InternalAdaptDsl.g:6754:2: rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6761:1: rule__ChangeFontOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6765:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6766:1: ( ')' )
            {
            // InternalAdaptDsl.g:6766:1: ( ')' )
            // InternalAdaptDsl.g:6767:2: ')'
            {
             before(grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6776:1: rule__ChangeFontOperation__Group__4 : rule__ChangeFontOperation__Group__4__Impl ;
    public final void rule__ChangeFontOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6780:1: ( rule__ChangeFontOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6781:2: rule__ChangeFontOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6787:1: rule__ChangeFontOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6791:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6792:1: ( ';' )
            {
            // InternalAdaptDsl.g:6792:1: ( ';' )
            // InternalAdaptDsl.g:6793:2: ';'
            {
             before(grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6803:1: rule__ChangeTableCssClassOperation__Group__0 : rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 ;
    public final void rule__ChangeTableCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6807:1: ( rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:6808:2: rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6815:1: rule__ChangeTableCssClassOperation__Group__0__Impl : ( 'changeTableCss' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6819:1: ( ( 'changeTableCss' ) )
            // InternalAdaptDsl.g:6820:1: ( 'changeTableCss' )
            {
            // InternalAdaptDsl.g:6820:1: ( 'changeTableCss' )
            // InternalAdaptDsl.g:6821:2: 'changeTableCss'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6830:1: rule__ChangeTableCssClassOperation__Group__1 : rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 ;
    public final void rule__ChangeTableCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6834:1: ( rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:6835:2: rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2
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
    // InternalAdaptDsl.g:6842:1: rule__ChangeTableCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6846:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6847:1: ( '(' )
            {
            // InternalAdaptDsl.g:6847:1: ( '(' )
            // InternalAdaptDsl.g:6848:2: '('
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6857:1: rule__ChangeTableCssClassOperation__Group__2 : rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 ;
    public final void rule__ChangeTableCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6861:1: ( rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:6862:2: rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:6869:1: rule__ChangeTableCssClassOperation__Group__2__Impl : ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeTableCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6873:1: ( ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:6874:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6874:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:6875:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:6876:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:6876:3: rule__ChangeTableCssClassOperation__TextAssignment_2
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
    // InternalAdaptDsl.g:6884:1: rule__ChangeTableCssClassOperation__Group__3 : rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 ;
    public final void rule__ChangeTableCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6888:1: ( rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:6889:2: rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:6896:1: rule__ChangeTableCssClassOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6900:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6901:1: ( ')' )
            {
            // InternalAdaptDsl.g:6901:1: ( ')' )
            // InternalAdaptDsl.g:6902:2: ')'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6911:1: rule__ChangeTableCssClassOperation__Group__4 : rule__ChangeTableCssClassOperation__Group__4__Impl ;
    public final void rule__ChangeTableCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6915:1: ( rule__ChangeTableCssClassOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6916:2: rule__ChangeTableCssClassOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6922:1: rule__ChangeTableCssClassOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6926:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6927:1: ( ';' )
            {
            // InternalAdaptDsl.g:6927:1: ( ';' )
            // InternalAdaptDsl.g:6928:2: ';'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6938:1: rule__AdaptCssClassOperation__Group__0 : rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 ;
    public final void rule__AdaptCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6942:1: ( rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:6943:2: rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6950:1: rule__AdaptCssClassOperation__Group__0__Impl : ( 'adaptCssClass' ) ;
    public final void rule__AdaptCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6954:1: ( ( 'adaptCssClass' ) )
            // InternalAdaptDsl.g:6955:1: ( 'adaptCssClass' )
            {
            // InternalAdaptDsl.g:6955:1: ( 'adaptCssClass' )
            // InternalAdaptDsl.g:6956:2: 'adaptCssClass'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6965:1: rule__AdaptCssClassOperation__Group__1 : rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 ;
    public final void rule__AdaptCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6969:1: ( rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:6970:2: rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2
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
    // InternalAdaptDsl.g:6977:1: rule__AdaptCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AdaptCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6981:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6982:1: ( '(' )
            {
            // InternalAdaptDsl.g:6982:1: ( '(' )
            // InternalAdaptDsl.g:6983:2: '('
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6992:1: rule__AdaptCssClassOperation__Group__2 : rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 ;
    public final void rule__AdaptCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6996:1: ( rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:6997:2: rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:7004:1: rule__AdaptCssClassOperation__Group__2__Impl : ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7008:1: ( ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) )
            // InternalAdaptDsl.g:7009:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7009:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            // InternalAdaptDsl.g:7010:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssClassAssignment_2()); 
            // InternalAdaptDsl.g:7011:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            // InternalAdaptDsl.g:7011:3: rule__AdaptCssClassOperation__CssClassAssignment_2
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
    // InternalAdaptDsl.g:7019:1: rule__AdaptCssClassOperation__Group__3 : rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 ;
    public final void rule__AdaptCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7023:1: ( rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:7024:2: rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4
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
    // InternalAdaptDsl.g:7031:1: rule__AdaptCssClassOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7035:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7036:1: ( ',' )
            {
            // InternalAdaptDsl.g:7036:1: ( ',' )
            // InternalAdaptDsl.g:7037:2: ','
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7046:1: rule__AdaptCssClassOperation__Group__4 : rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 ;
    public final void rule__AdaptCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7050:1: ( rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 )
            // InternalAdaptDsl.g:7051:2: rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:7058:1: rule__AdaptCssClassOperation__Group__4__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7062:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) )
            // InternalAdaptDsl.g:7063:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            {
            // InternalAdaptDsl.g:7063:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            // InternalAdaptDsl.g:7064:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAssignment_4()); 
            // InternalAdaptDsl.g:7065:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            // InternalAdaptDsl.g:7065:3: rule__AdaptCssClassOperation__CssAttributeAssignment_4
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
    // InternalAdaptDsl.g:7073:1: rule__AdaptCssClassOperation__Group__5 : rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 ;
    public final void rule__AdaptCssClassOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7077:1: ( rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 )
            // InternalAdaptDsl.g:7078:2: rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6
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
    // InternalAdaptDsl.g:7085:1: rule__AdaptCssClassOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7089:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7090:1: ( ',' )
            {
            // InternalAdaptDsl.g:7090:1: ( ',' )
            // InternalAdaptDsl.g:7091:2: ','
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7100:1: rule__AdaptCssClassOperation__Group__6 : rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 ;
    public final void rule__AdaptCssClassOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7104:1: ( rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 )
            // InternalAdaptDsl.g:7105:2: rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:7112:1: rule__AdaptCssClassOperation__Group__6__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7116:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) )
            // InternalAdaptDsl.g:7117:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            {
            // InternalAdaptDsl.g:7117:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            // InternalAdaptDsl.g:7118:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAssignment_6()); 
            // InternalAdaptDsl.g:7119:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            // InternalAdaptDsl.g:7119:3: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6
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
    // InternalAdaptDsl.g:7127:1: rule__AdaptCssClassOperation__Group__7 : rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 ;
    public final void rule__AdaptCssClassOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7131:1: ( rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 )
            // InternalAdaptDsl.g:7132:2: rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalAdaptDsl.g:7139:1: rule__AdaptCssClassOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AdaptCssClassOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7143:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7144:1: ( ')' )
            {
            // InternalAdaptDsl.g:7144:1: ( ')' )
            // InternalAdaptDsl.g:7145:2: ')'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7154:1: rule__AdaptCssClassOperation__Group__8 : rule__AdaptCssClassOperation__Group__8__Impl ;
    public final void rule__AdaptCssClassOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7158:1: ( rule__AdaptCssClassOperation__Group__8__Impl )
            // InternalAdaptDsl.g:7159:2: rule__AdaptCssClassOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:7165:1: rule__AdaptCssClassOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AdaptCssClassOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7169:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7170:1: ( ';' )
            {
            // InternalAdaptDsl.g:7170:1: ( ';' )
            // InternalAdaptDsl.g:7171:2: ';'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__Entity__Group__0"
    // InternalAdaptDsl.g:7181:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7185:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAdaptDsl.g:7186:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalAdaptDsl.g:7193:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7197:1: ( ( 'Entity' ) )
            // InternalAdaptDsl.g:7198:1: ( 'Entity' )
            {
            // InternalAdaptDsl.g:7198:1: ( 'Entity' )
            // InternalAdaptDsl.g:7199:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalAdaptDsl.g:7208:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7212:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAdaptDsl.g:7213:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalAdaptDsl.g:7220:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7224:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:7225:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:7225:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalAdaptDsl.g:7226:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:7227:2: ( rule__Entity__NameAssignment_1 )
            // InternalAdaptDsl.g:7227:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalAdaptDsl.g:7235:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7239:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAdaptDsl.g:7240:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalAdaptDsl.g:7247:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7251:1: ( ( '{' ) )
            // InternalAdaptDsl.g:7252:1: ( '{' )
            {
            // InternalAdaptDsl.g:7252:1: ( '{' )
            // InternalAdaptDsl.g:7253:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalAdaptDsl.g:7262:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7266:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAdaptDsl.g:7267:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalAdaptDsl.g:7274:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertyAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7278:1: ( ( ( rule__Entity__PropertyAssignment_3 )* ) )
            // InternalAdaptDsl.g:7279:1: ( ( rule__Entity__PropertyAssignment_3 )* )
            {
            // InternalAdaptDsl.g:7279:1: ( ( rule__Entity__PropertyAssignment_3 )* )
            // InternalAdaptDsl.g:7280:2: ( rule__Entity__PropertyAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 
            // InternalAdaptDsl.g:7281:2: ( rule__Entity__PropertyAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==62) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAdaptDsl.g:7281:3: rule__Entity__PropertyAssignment_3
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Entity__PropertyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalAdaptDsl.g:7289:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7293:1: ( rule__Entity__Group__4__Impl )
            // InternalAdaptDsl.g:7294:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalAdaptDsl.g:7300:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7304:1: ( ( '}' ) )
            // InternalAdaptDsl.g:7305:1: ( '}' )
            {
            // InternalAdaptDsl.g:7305:1: ( '}' )
            // InternalAdaptDsl.g:7306:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalAdaptDsl.g:7316:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7320:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalAdaptDsl.g:7321:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

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
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalAdaptDsl.g:7328:1: rule__Property__Group__0__Impl : ( 'name' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7332:1: ( ( 'name' ) )
            // InternalAdaptDsl.g:7333:1: ( 'name' )
            {
            // InternalAdaptDsl.g:7333:1: ( 'name' )
            // InternalAdaptDsl.g:7334:2: 'name'
            {
             before(grammarAccess.getPropertyAccess().getNameKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalAdaptDsl.g:7343:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7347:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalAdaptDsl.g:7348:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

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
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalAdaptDsl.g:7355:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7359:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:7360:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:7360:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalAdaptDsl.g:7361:2: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:7362:2: ( rule__Property__NameAssignment_1 )
            // InternalAdaptDsl.g:7362:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalAdaptDsl.g:7370:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7374:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalAdaptDsl.g:7375:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

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
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalAdaptDsl.g:7382:1: rule__Property__Group__2__Impl : ( ':' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7386:1: ( ( ':' ) )
            // InternalAdaptDsl.g:7387:1: ( ':' )
            {
            // InternalAdaptDsl.g:7387:1: ( ':' )
            // InternalAdaptDsl.g:7388:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalAdaptDsl.g:7397:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7401:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalAdaptDsl.g:7402:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

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
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalAdaptDsl.g:7409:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7413:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // InternalAdaptDsl.g:7414:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // InternalAdaptDsl.g:7414:1: ( ( rule__Property__TypeAssignment_3 ) )
            // InternalAdaptDsl.g:7415:2: ( rule__Property__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            // InternalAdaptDsl.g:7416:2: ( rule__Property__TypeAssignment_3 )
            // InternalAdaptDsl.g:7416:3: rule__Property__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalAdaptDsl.g:7424:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7428:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalAdaptDsl.g:7429:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

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
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalAdaptDsl.g:7436:1: rule__Property__Group__4__Impl : ( 'from' ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7440:1: ( ( 'from' ) )
            // InternalAdaptDsl.g:7441:1: ( 'from' )
            {
            // InternalAdaptDsl.g:7441:1: ( 'from' )
            // InternalAdaptDsl.g:7442:2: 'from'
            {
             before(grammarAccess.getPropertyAccess().getFromKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalAdaptDsl.g:7451:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7455:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // InternalAdaptDsl.g:7456:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Property__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__6();

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
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalAdaptDsl.g:7463:1: rule__Property__Group__5__Impl : ( ( rule__Property__ProviderAssignment_5 ) ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7467:1: ( ( ( rule__Property__ProviderAssignment_5 ) ) )
            // InternalAdaptDsl.g:7468:1: ( ( rule__Property__ProviderAssignment_5 ) )
            {
            // InternalAdaptDsl.g:7468:1: ( ( rule__Property__ProviderAssignment_5 ) )
            // InternalAdaptDsl.g:7469:2: ( rule__Property__ProviderAssignment_5 )
            {
             before(grammarAccess.getPropertyAccess().getProviderAssignment_5()); 
            // InternalAdaptDsl.g:7470:2: ( rule__Property__ProviderAssignment_5 )
            // InternalAdaptDsl.g:7470:3: rule__Property__ProviderAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Property__ProviderAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getProviderAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Property__Group__6"
    // InternalAdaptDsl.g:7478:1: rule__Property__Group__6 : rule__Property__Group__6__Impl ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7482:1: ( rule__Property__Group__6__Impl )
            // InternalAdaptDsl.g:7483:2: rule__Property__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__6__Impl();

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
    // $ANTLR end "rule__Property__Group__6"


    // $ANTLR start "rule__Property__Group__6__Impl"
    // InternalAdaptDsl.g:7489:1: rule__Property__Group__6__Impl : ( ';' ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7493:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7494:1: ( ';' )
            {
            // InternalAdaptDsl.g:7494:1: ( ';' )
            // InternalAdaptDsl.g:7495:2: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__6__Impl"


    // $ANTLR start "rule__DefTypes__Group__0"
    // InternalAdaptDsl.g:7505:1: rule__DefTypes__Group__0 : rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 ;
    public final void rule__DefTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7509:1: ( rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 )
            // InternalAdaptDsl.g:7510:2: rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DefTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefTypes__Group__1();

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
    // $ANTLR end "rule__DefTypes__Group__0"


    // $ANTLR start "rule__DefTypes__Group__0__Impl"
    // InternalAdaptDsl.g:7517:1: rule__DefTypes__Group__0__Impl : ( ( rule__DefTypes__ThisAssignment_0 ) ) ;
    public final void rule__DefTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7521:1: ( ( ( rule__DefTypes__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:7522:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7522:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:7523:2: ( rule__DefTypes__ThisAssignment_0 )
            {
             before(grammarAccess.getDefTypesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:7524:2: ( rule__DefTypes__ThisAssignment_0 )
            // InternalAdaptDsl.g:7524:3: rule__DefTypes__ThisAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefTypes__ThisAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefTypesAccess().getThisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefTypes__Group__0__Impl"


    // $ANTLR start "rule__DefTypes__Group__1"
    // InternalAdaptDsl.g:7532:1: rule__DefTypes__Group__1 : rule__DefTypes__Group__1__Impl ;
    public final void rule__DefTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7536:1: ( rule__DefTypes__Group__1__Impl )
            // InternalAdaptDsl.g:7537:2: rule__DefTypes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefTypes__Group__1__Impl();

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
    // $ANTLR end "rule__DefTypes__Group__1"


    // $ANTLR start "rule__DefTypes__Group__1__Impl"
    // InternalAdaptDsl.g:7543:1: rule__DefTypes__Group__1__Impl : ( ( rule__DefTypes__NextAssignment_1 )? ) ;
    public final void rule__DefTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7547:1: ( ( ( rule__DefTypes__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:7548:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:7548:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            // InternalAdaptDsl.g:7549:2: ( rule__DefTypes__NextAssignment_1 )?
            {
             before(grammarAccess.getDefTypesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:7550:2: ( rule__DefTypes__NextAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdaptDsl.g:7550:3: rule__DefTypes__NextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefTypes__NextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefTypesAccess().getNextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefTypes__Group__1__Impl"


    // $ANTLR start "rule__DefType__Group__0"
    // InternalAdaptDsl.g:7559:1: rule__DefType__Group__0 : rule__DefType__Group__0__Impl rule__DefType__Group__1 ;
    public final void rule__DefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7563:1: ( rule__DefType__Group__0__Impl rule__DefType__Group__1 )
            // InternalAdaptDsl.g:7564:2: rule__DefType__Group__0__Impl rule__DefType__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__DefType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefType__Group__1();

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
    // $ANTLR end "rule__DefType__Group__0"


    // $ANTLR start "rule__DefType__Group__0__Impl"
    // InternalAdaptDsl.g:7571:1: rule__DefType__Group__0__Impl : ( ( rule__DefType__NameAssignment_0 ) ) ;
    public final void rule__DefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7575:1: ( ( ( rule__DefType__NameAssignment_0 ) ) )
            // InternalAdaptDsl.g:7576:1: ( ( rule__DefType__NameAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7576:1: ( ( rule__DefType__NameAssignment_0 ) )
            // InternalAdaptDsl.g:7577:2: ( rule__DefType__NameAssignment_0 )
            {
             before(grammarAccess.getDefTypeAccess().getNameAssignment_0()); 
            // InternalAdaptDsl.g:7578:2: ( rule__DefType__NameAssignment_0 )
            // InternalAdaptDsl.g:7578:3: rule__DefType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DefType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefType__Group__0__Impl"


    // $ANTLR start "rule__DefType__Group__1"
    // InternalAdaptDsl.g:7586:1: rule__DefType__Group__1 : rule__DefType__Group__1__Impl rule__DefType__Group__2 ;
    public final void rule__DefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7590:1: ( rule__DefType__Group__1__Impl rule__DefType__Group__2 )
            // InternalAdaptDsl.g:7591:2: rule__DefType__Group__1__Impl rule__DefType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DefType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefType__Group__2();

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
    // $ANTLR end "rule__DefType__Group__1"


    // $ANTLR start "rule__DefType__Group__1__Impl"
    // InternalAdaptDsl.g:7598:1: rule__DefType__Group__1__Impl : ( ':' ) ;
    public final void rule__DefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7602:1: ( ( ':' ) )
            // InternalAdaptDsl.g:7603:1: ( ':' )
            {
            // InternalAdaptDsl.g:7603:1: ( ':' )
            // InternalAdaptDsl.g:7604:2: ':'
            {
             before(grammarAccess.getDefTypeAccess().getColonKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDefTypeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefType__Group__1__Impl"


    // $ANTLR start "rule__DefType__Group__2"
    // InternalAdaptDsl.g:7613:1: rule__DefType__Group__2 : rule__DefType__Group__2__Impl rule__DefType__Group__3 ;
    public final void rule__DefType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7617:1: ( rule__DefType__Group__2__Impl rule__DefType__Group__3 )
            // InternalAdaptDsl.g:7618:2: rule__DefType__Group__2__Impl rule__DefType__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__DefType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefType__Group__3();

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
    // $ANTLR end "rule__DefType__Group__2"


    // $ANTLR start "rule__DefType__Group__2__Impl"
    // InternalAdaptDsl.g:7625:1: rule__DefType__Group__2__Impl : ( ( rule__DefType__EnumsAssignment_2 ) ) ;
    public final void rule__DefType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7629:1: ( ( ( rule__DefType__EnumsAssignment_2 ) ) )
            // InternalAdaptDsl.g:7630:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7630:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            // InternalAdaptDsl.g:7631:2: ( rule__DefType__EnumsAssignment_2 )
            {
             before(grammarAccess.getDefTypeAccess().getEnumsAssignment_2()); 
            // InternalAdaptDsl.g:7632:2: ( rule__DefType__EnumsAssignment_2 )
            // InternalAdaptDsl.g:7632:3: rule__DefType__EnumsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefType__EnumsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefTypeAccess().getEnumsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefType__Group__2__Impl"


    // $ANTLR start "rule__DefType__Group__3"
    // InternalAdaptDsl.g:7640:1: rule__DefType__Group__3 : rule__DefType__Group__3__Impl ;
    public final void rule__DefType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7644:1: ( rule__DefType__Group__3__Impl )
            // InternalAdaptDsl.g:7645:2: rule__DefType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefType__Group__3__Impl();

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
    // $ANTLR end "rule__DefType__Group__3"


    // $ANTLR start "rule__DefType__Group__3__Impl"
    // InternalAdaptDsl.g:7651:1: rule__DefType__Group__3__Impl : ( ';' ) ;
    public final void rule__DefType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7655:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7656:1: ( ';' )
            {
            // InternalAdaptDsl.g:7656:1: ( ';' )
            // InternalAdaptDsl.g:7657:2: ';'
            {
             before(grammarAccess.getDefTypeAccess().getSemicolonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDefTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefType__Group__3__Impl"


    // $ANTLR start "rule__Enums__Group__0"
    // InternalAdaptDsl.g:7667:1: rule__Enums__Group__0 : rule__Enums__Group__0__Impl rule__Enums__Group__1 ;
    public final void rule__Enums__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7671:1: ( rule__Enums__Group__0__Impl rule__Enums__Group__1 )
            // InternalAdaptDsl.g:7672:2: rule__Enums__Group__0__Impl rule__Enums__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Enums__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enums__Group__1();

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
    // $ANTLR end "rule__Enums__Group__0"


    // $ANTLR start "rule__Enums__Group__0__Impl"
    // InternalAdaptDsl.g:7679:1: rule__Enums__Group__0__Impl : ( ( rule__Enums__ThisAssignment_0 ) ) ;
    public final void rule__Enums__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7683:1: ( ( ( rule__Enums__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:7684:1: ( ( rule__Enums__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7684:1: ( ( rule__Enums__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:7685:2: ( rule__Enums__ThisAssignment_0 )
            {
             before(grammarAccess.getEnumsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:7686:2: ( rule__Enums__ThisAssignment_0 )
            // InternalAdaptDsl.g:7686:3: rule__Enums__ThisAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Enums__ThisAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumsAccess().getThisAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enums__Group__0__Impl"


    // $ANTLR start "rule__Enums__Group__1"
    // InternalAdaptDsl.g:7694:1: rule__Enums__Group__1 : rule__Enums__Group__1__Impl ;
    public final void rule__Enums__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7698:1: ( rule__Enums__Group__1__Impl )
            // InternalAdaptDsl.g:7699:2: rule__Enums__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enums__Group__1__Impl();

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
    // $ANTLR end "rule__Enums__Group__1"


    // $ANTLR start "rule__Enums__Group__1__Impl"
    // InternalAdaptDsl.g:7705:1: rule__Enums__Group__1__Impl : ( ( rule__Enums__Group_1__0 )? ) ;
    public final void rule__Enums__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7709:1: ( ( ( rule__Enums__Group_1__0 )? ) )
            // InternalAdaptDsl.g:7710:1: ( ( rule__Enums__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:7710:1: ( ( rule__Enums__Group_1__0 )? )
            // InternalAdaptDsl.g:7711:2: ( rule__Enums__Group_1__0 )?
            {
             before(grammarAccess.getEnumsAccess().getGroup_1()); 
            // InternalAdaptDsl.g:7712:2: ( rule__Enums__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdaptDsl.g:7712:3: rule__Enums__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enums__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enums__Group__1__Impl"


    // $ANTLR start "rule__Enums__Group_1__0"
    // InternalAdaptDsl.g:7721:1: rule__Enums__Group_1__0 : rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 ;
    public final void rule__Enums__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7725:1: ( rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 )
            // InternalAdaptDsl.g:7726:2: rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Enums__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enums__Group_1__1();

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
    // $ANTLR end "rule__Enums__Group_1__0"


    // $ANTLR start "rule__Enums__Group_1__0__Impl"
    // InternalAdaptDsl.g:7733:1: rule__Enums__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enums__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7737:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7738:1: ( ',' )
            {
            // InternalAdaptDsl.g:7738:1: ( ',' )
            // InternalAdaptDsl.g:7739:2: ','
            {
             before(grammarAccess.getEnumsAccess().getCommaKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEnumsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enums__Group_1__0__Impl"


    // $ANTLR start "rule__Enums__Group_1__1"
    // InternalAdaptDsl.g:7748:1: rule__Enums__Group_1__1 : rule__Enums__Group_1__1__Impl ;
    public final void rule__Enums__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7752:1: ( rule__Enums__Group_1__1__Impl )
            // InternalAdaptDsl.g:7753:2: rule__Enums__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enums__Group_1__1__Impl();

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
    // $ANTLR end "rule__Enums__Group_1__1"


    // $ANTLR start "rule__Enums__Group_1__1__Impl"
    // InternalAdaptDsl.g:7759:1: rule__Enums__Group_1__1__Impl : ( ( rule__Enums__NextAssignment_1_1 ) ) ;
    public final void rule__Enums__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7763:1: ( ( ( rule__Enums__NextAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:7764:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:7764:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            // InternalAdaptDsl.g:7765:2: ( rule__Enums__NextAssignment_1_1 )
            {
             before(grammarAccess.getEnumsAccess().getNextAssignment_1_1()); 
            // InternalAdaptDsl.g:7766:2: ( rule__Enums__NextAssignment_1_1 )
            // InternalAdaptDsl.g:7766:3: rule__Enums__NextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Enums__NextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumsAccess().getNextAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enums__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ServicesAssignment_0"
    // InternalAdaptDsl.g:7775:1: rule__Model__ServicesAssignment_0 : ( ruleServices ) ;
    public final void rule__Model__ServicesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7779:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:7780:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:7780:2: ( ruleServices )
            // InternalAdaptDsl.g:7781:3: ruleServices
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
    // InternalAdaptDsl.g:7790:1: rule__Model__FlowNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Model__FlowNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7794:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:7795:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:7795:2: ( RULE_STRING )
            // InternalAdaptDsl.g:7796:3: RULE_STRING
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
    // InternalAdaptDsl.g:7805:1: rule__Model__AdaptationRulesAssignment_4 : ( ruleAdaptationRule ) ;
    public final void rule__Model__AdaptationRulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7809:1: ( ( ruleAdaptationRule ) )
            // InternalAdaptDsl.g:7810:2: ( ruleAdaptationRule )
            {
            // InternalAdaptDsl.g:7810:2: ( ruleAdaptationRule )
            // InternalAdaptDsl.g:7811:3: ruleAdaptationRule
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


    // $ANTLR start "rule__Model__EntityAssignment_6"
    // InternalAdaptDsl.g:7820:1: rule__Model__EntityAssignment_6 : ( ruleEntity ) ;
    public final void rule__Model__EntityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7824:1: ( ( ruleEntity ) )
            // InternalAdaptDsl.g:7825:2: ( ruleEntity )
            {
            // InternalAdaptDsl.g:7825:2: ( ruleEntity )
            // InternalAdaptDsl.g:7826:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntityEntityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntityEntityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntityAssignment_6"


    // $ANTLR start "rule__Model__ProviderAssignment_8_0"
    // InternalAdaptDsl.g:7835:1: rule__Model__ProviderAssignment_8_0 : ( ruleProvider ) ;
    public final void rule__Model__ProviderAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7839:1: ( ( ruleProvider ) )
            // InternalAdaptDsl.g:7840:2: ( ruleProvider )
            {
            // InternalAdaptDsl.g:7840:2: ( ruleProvider )
            // InternalAdaptDsl.g:7841:3: ruleProvider
            {
             before(grammarAccess.getModelAccess().getProviderProviderParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProviderProviderParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProviderAssignment_8_0"


    // $ANTLR start "rule__Model__TypesAssignment_11"
    // InternalAdaptDsl.g:7850:1: rule__Model__TypesAssignment_11 : ( ruleDefTypes ) ;
    public final void rule__Model__TypesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7854:1: ( ( ruleDefTypes ) )
            // InternalAdaptDsl.g:7855:2: ( ruleDefTypes )
            {
            // InternalAdaptDsl.g:7855:2: ( ruleDefTypes )
            // InternalAdaptDsl.g:7856:3: ruleDefTypes
            {
             before(grammarAccess.getModelAccess().getTypesDefTypesParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleDefTypes();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesDefTypesParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_11"


    // $ANTLR start "rule__Services__ThisAssignment_0"
    // InternalAdaptDsl.g:7865:1: rule__Services__ThisAssignment_0 : ( ruleService ) ;
    public final void rule__Services__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7869:1: ( ( ruleService ) )
            // InternalAdaptDsl.g:7870:2: ( ruleService )
            {
            // InternalAdaptDsl.g:7870:2: ( ruleService )
            // InternalAdaptDsl.g:7871:3: ruleService
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
    // InternalAdaptDsl.g:7880:1: rule__Services__NextAssignment_1 : ( ruleServices ) ;
    public final void rule__Services__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7884:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:7885:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:7885:2: ( ruleServices )
            // InternalAdaptDsl.g:7886:3: ruleServices
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
    // InternalAdaptDsl.g:7895:1: rule__Service__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7899:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:7900:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:7900:2: ( RULE_ID )
            // InternalAdaptDsl.g:7901:3: RULE_ID
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
    // InternalAdaptDsl.g:7910:1: rule__Service__LocAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Service__LocAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7914:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:7915:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:7915:2: ( RULE_STRING )
            // InternalAdaptDsl.g:7916:3: RULE_STRING
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
    // InternalAdaptDsl.g:7925:1: rule__Service__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Service__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7929:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:7930:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:7930:2: ( RULE_STRING )
            // InternalAdaptDsl.g:7931:3: RULE_STRING
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
    // InternalAdaptDsl.g:7940:1: rule__Service__FunctionsAssignment_7 : ( ruleFunctions ) ;
    public final void rule__Service__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7944:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:7945:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:7945:2: ( ruleFunctions )
            // InternalAdaptDsl.g:7946:3: ruleFunctions
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
    // InternalAdaptDsl.g:7955:1: rule__Functions__ThisAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7959:1: ( ( ruleFunction ) )
            // InternalAdaptDsl.g:7960:2: ( ruleFunction )
            {
            // InternalAdaptDsl.g:7960:2: ( ruleFunction )
            // InternalAdaptDsl.g:7961:3: ruleFunction
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
    // InternalAdaptDsl.g:7970:1: rule__Functions__NextAssignment_1 : ( ruleFunctions ) ;
    public final void rule__Functions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7974:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:7975:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:7975:2: ( ruleFunctions )
            // InternalAdaptDsl.g:7976:3: ruleFunctions
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
    // InternalAdaptDsl.g:7985:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7989:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:7990:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:7990:2: ( RULE_ID )
            // InternalAdaptDsl.g:7991:3: RULE_ID
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
    // InternalAdaptDsl.g:8000:1: rule__Function__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8004:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8005:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8005:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8006:3: RULE_STRING
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
    // InternalAdaptDsl.g:8015:1: rule__AdaptationRule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdaptationRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8019:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8020:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8020:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8021:3: RULE_STRING
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
    // InternalAdaptDsl.g:8030:1: rule__AdaptationRule__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__AdaptationRule__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8034:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8035:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8035:2: ( RULE_INT )
            // InternalAdaptDsl.g:8036:3: RULE_INT
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
    // InternalAdaptDsl.g:8045:1: rule__AdaptationRule__FactTypeAssignment_7 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8049:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8050:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8050:2: ( RULE_ID )
            // InternalAdaptDsl.g:8051:3: RULE_ID
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
    // InternalAdaptDsl.g:8060:1: rule__AdaptationRule__FactNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8064:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8065:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8065:2: ( RULE_ID )
            // InternalAdaptDsl.g:8066:3: RULE_ID
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
    // InternalAdaptDsl.g:8075:1: rule__AdaptationRule__ExprAssignment_12 : ( ruleConditionalOR ) ;
    public final void rule__AdaptationRule__ExprAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8079:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:8080:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:8080:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:8081:3: ruleConditionalOR
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
    // InternalAdaptDsl.g:8090:1: rule__AdaptationRule__ActionCollectionAssignment_16 : ( ruleActions ) ;
    public final void rule__AdaptationRule__ActionCollectionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8094:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:8095:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:8095:2: ( ruleActions )
            // InternalAdaptDsl.g:8096:3: ruleActions
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
    // InternalAdaptDsl.g:8105:1: rule__ConditionalOR__LeftAssignment_0 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalOR__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8109:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:8110:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:8110:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:8111:3: ruleConditionalAND
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
    // InternalAdaptDsl.g:8120:1: rule__ConditionalOR__RightAssignment_1_1 : ( ruleConditionalOR ) ;
    public final void rule__ConditionalOR__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8124:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:8125:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:8125:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:8126:3: ruleConditionalOR
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
    // InternalAdaptDsl.g:8135:1: rule__ConditionalAND__LeftAssignment_0 : ( ruleConditionalPrimary ) ;
    public final void rule__ConditionalAND__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8139:1: ( ( ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:8140:2: ( ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:8140:2: ( ruleConditionalPrimary )
            // InternalAdaptDsl.g:8141:3: ruleConditionalPrimary
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
    // InternalAdaptDsl.g:8150:1: rule__ConditionalAND__RightAssignment_1_1 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalAND__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8154:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:8155:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:8155:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:8156:3: ruleConditionalAND
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
    // InternalAdaptDsl.g:8165:1: rule__ConditionalPrimary__CondAssignment_0 : ( ruleStringCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8169:1: ( ( ruleStringCondition ) )
            // InternalAdaptDsl.g:8170:2: ( ruleStringCondition )
            {
            // InternalAdaptDsl.g:8170:2: ( ruleStringCondition )
            // InternalAdaptDsl.g:8171:3: ruleStringCondition
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
    // InternalAdaptDsl.g:8180:1: rule__ConditionalPrimary__CondAssignment_1 : ( ruleNumberCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8184:1: ( ( ruleNumberCondition ) )
            // InternalAdaptDsl.g:8185:2: ( ruleNumberCondition )
            {
            // InternalAdaptDsl.g:8185:2: ( ruleNumberCondition )
            // InternalAdaptDsl.g:8186:3: ruleNumberCondition
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
    // InternalAdaptDsl.g:8195:1: rule__ConditionalPrimary__CondAssignment_2 : ( ruleBooleanCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8199:1: ( ( ruleBooleanCondition ) )
            // InternalAdaptDsl.g:8200:2: ( ruleBooleanCondition )
            {
            // InternalAdaptDsl.g:8200:2: ( ruleBooleanCondition )
            // InternalAdaptDsl.g:8201:3: ruleBooleanCondition
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
    // InternalAdaptDsl.g:8210:1: rule__BooleanCondition__FactAssignment_0_0 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8214:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8215:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8215:2: ( ruleFact )
            // InternalAdaptDsl.g:8216:3: ruleFact
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
    // InternalAdaptDsl.g:8225:1: rule__BooleanCondition__OpAssignment_0_1 : ( ruleBoolOperators ) ;
    public final void rule__BooleanCondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8229:1: ( ( ruleBoolOperators ) )
            // InternalAdaptDsl.g:8230:2: ( ruleBoolOperators )
            {
            // InternalAdaptDsl.g:8230:2: ( ruleBoolOperators )
            // InternalAdaptDsl.g:8231:3: ruleBoolOperators
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
    // InternalAdaptDsl.g:8240:1: rule__BooleanCondition__ValAssignment_0_2 : ( RULE_BOOL ) ;
    public final void rule__BooleanCondition__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8244:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:8245:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:8245:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:8246:3: RULE_BOOL
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
    // InternalAdaptDsl.g:8255:1: rule__BooleanCondition__FactAssignment_1 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8259:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8260:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8260:2: ( ruleFact )
            // InternalAdaptDsl.g:8261:3: ruleFact
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
    // InternalAdaptDsl.g:8270:1: rule__NumberCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__NumberCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8274:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8275:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8275:2: ( ruleFact )
            // InternalAdaptDsl.g:8276:3: ruleFact
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
    // InternalAdaptDsl.g:8285:1: rule__NumberCondition__OpAssignment_1 : ( ruleNumberOperators ) ;
    public final void rule__NumberCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8289:1: ( ( ruleNumberOperators ) )
            // InternalAdaptDsl.g:8290:2: ( ruleNumberOperators )
            {
            // InternalAdaptDsl.g:8290:2: ( ruleNumberOperators )
            // InternalAdaptDsl.g:8291:3: ruleNumberOperators
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
    // InternalAdaptDsl.g:8300:1: rule__NumberCondition__ValAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8304:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8305:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8305:2: ( RULE_INT )
            // InternalAdaptDsl.g:8306:3: RULE_INT
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
    // InternalAdaptDsl.g:8315:1: rule__StringCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__StringCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8319:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8320:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8320:2: ( ruleFact )
            // InternalAdaptDsl.g:8321:3: ruleFact
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
    // InternalAdaptDsl.g:8330:1: rule__StringCondition__OpAssignment_1 : ( ruleStringOperators ) ;
    public final void rule__StringCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8334:1: ( ( ruleStringOperators ) )
            // InternalAdaptDsl.g:8335:2: ( ruleStringOperators )
            {
            // InternalAdaptDsl.g:8335:2: ( ruleStringOperators )
            // InternalAdaptDsl.g:8336:3: ruleStringOperators
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
    // InternalAdaptDsl.g:8345:1: rule__StringCondition__ValAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8349:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8350:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8350:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8351:3: RULE_STRING
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
    // InternalAdaptDsl.g:8360:1: rule__Actions__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Actions__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8364:1: ( ( ruleAction ) )
            // InternalAdaptDsl.g:8365:2: ( ruleAction )
            {
            // InternalAdaptDsl.g:8365:2: ( ruleAction )
            // InternalAdaptDsl.g:8366:3: ruleAction
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
    // InternalAdaptDsl.g:8375:1: rule__Actions__NextAssignment_1 : ( ruleActions ) ;
    public final void rule__Actions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8379:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:8380:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:8380:2: ( ruleActions )
            // InternalAdaptDsl.g:8381:3: ruleActions
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
    // InternalAdaptDsl.g:8390:1: rule__Action__ActionCategoryAssignment_0 : ( ruleServiceOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8394:1: ( ( ruleServiceOperation ) )
            // InternalAdaptDsl.g:8395:2: ( ruleServiceOperation )
            {
            // InternalAdaptDsl.g:8395:2: ( ruleServiceOperation )
            // InternalAdaptDsl.g:8396:3: ruleServiceOperation
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
    // InternalAdaptDsl.g:8405:1: rule__Action__ActionCategoryAssignment_1 : ( ruleTaskChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8409:1: ( ( ruleTaskChangeOperation ) )
            // InternalAdaptDsl.g:8410:2: ( ruleTaskChangeOperation )
            {
            // InternalAdaptDsl.g:8410:2: ( ruleTaskChangeOperation )
            // InternalAdaptDsl.g:8411:3: ruleTaskChangeOperation
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
    // InternalAdaptDsl.g:8420:1: rule__Action__ActionCategoryAssignment_2 : ( ruleNavigationChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8424:1: ( ( ruleNavigationChangeOperation ) )
            // InternalAdaptDsl.g:8425:2: ( ruleNavigationChangeOperation )
            {
            // InternalAdaptDsl.g:8425:2: ( ruleNavigationChangeOperation )
            // InternalAdaptDsl.g:8426:3: ruleNavigationChangeOperation
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
    // InternalAdaptDsl.g:8435:1: rule__Action__ActionCategoryAssignment_3 : ( ruleLayoutChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8439:1: ( ( ruleLayoutChangeOperation ) )
            // InternalAdaptDsl.g:8440:2: ( ruleLayoutChangeOperation )
            {
            // InternalAdaptDsl.g:8440:2: ( ruleLayoutChangeOperation )
            // InternalAdaptDsl.g:8441:3: ruleLayoutChangeOperation
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
    // InternalAdaptDsl.g:8450:1: rule__ServiceOperation__OperationAssignment_0 : ( ruleServiceFunctionCallOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8454:1: ( ( ruleServiceFunctionCallOperation ) )
            // InternalAdaptDsl.g:8455:2: ( ruleServiceFunctionCallOperation )
            {
            // InternalAdaptDsl.g:8455:2: ( ruleServiceFunctionCallOperation )
            // InternalAdaptDsl.g:8456:3: ruleServiceFunctionCallOperation
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
    // InternalAdaptDsl.g:8465:1: rule__ServiceOperation__OperationAssignment_1 : ( ruleEditFactOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8469:1: ( ( ruleEditFactOperation ) )
            // InternalAdaptDsl.g:8470:2: ( ruleEditFactOperation )
            {
            // InternalAdaptDsl.g:8470:2: ( ruleEditFactOperation )
            // InternalAdaptDsl.g:8471:3: ruleEditFactOperation
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
    // InternalAdaptDsl.g:8480:1: rule__ServiceOperation__OperationAssignment_2 : ( ruleSetDisplayPropertyOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8484:1: ( ( ruleSetDisplayPropertyOperation ) )
            // InternalAdaptDsl.g:8485:2: ( ruleSetDisplayPropertyOperation )
            {
            // InternalAdaptDsl.g:8485:2: ( ruleSetDisplayPropertyOperation )
            // InternalAdaptDsl.g:8486:3: ruleSetDisplayPropertyOperation
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
    // InternalAdaptDsl.g:8495:1: rule__ServiceFunctionCallOperation__ServiceAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8499:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8500:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8500:2: ( RULE_ID )
            // InternalAdaptDsl.g:8501:3: RULE_ID
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
    // InternalAdaptDsl.g:8510:1: rule__ServiceFunctionCallOperation__FunctionAssignment_4 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8514:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8515:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8515:2: ( RULE_ID )
            // InternalAdaptDsl.g:8516:3: RULE_ID
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
    // InternalAdaptDsl.g:8525:1: rule__ServiceFunctionCallOperation__ValAssignment_6 : ( ruleValue ) ;
    public final void rule__ServiceFunctionCallOperation__ValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8529:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:8530:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:8530:2: ( ruleValue )
            // InternalAdaptDsl.g:8531:3: ruleValue
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
    // InternalAdaptDsl.g:8540:1: rule__EditFactOperation__PropAssignment_2 : ( ruleFactProperty ) ;
    public final void rule__EditFactOperation__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8544:1: ( ( ruleFactProperty ) )
            // InternalAdaptDsl.g:8545:2: ( ruleFactProperty )
            {
            // InternalAdaptDsl.g:8545:2: ( ruleFactProperty )
            // InternalAdaptDsl.g:8546:3: ruleFactProperty
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
    // InternalAdaptDsl.g:8555:1: rule__EditFactOperation__ValAssignment_3_1 : ( ruleValue ) ;
    public final void rule__EditFactOperation__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8559:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:8560:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:8560:2: ( ruleValue )
            // InternalAdaptDsl.g:8561:3: ruleValue
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
    // InternalAdaptDsl.g:8570:1: rule__SetDisplayPropertyOperation__PropertyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8574:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8575:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8575:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8576:3: RULE_STRING
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
    // InternalAdaptDsl.g:8585:1: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 : ( ruleDisplayPropertyValue ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8589:1: ( ( ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:8590:2: ( ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:8590:2: ( ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:8591:3: ruleDisplayPropertyValue
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
    // InternalAdaptDsl.g:8600:1: rule__DisplayPropertyValue__PropertyClassAssignment_0 : ( ruleIntValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8604:1: ( ( ruleIntValue ) )
            // InternalAdaptDsl.g:8605:2: ( ruleIntValue )
            {
            // InternalAdaptDsl.g:8605:2: ( ruleIntValue )
            // InternalAdaptDsl.g:8606:3: ruleIntValue
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
    // InternalAdaptDsl.g:8615:1: rule__DisplayPropertyValue__PropertyClassAssignment_1 : ( ruleStringValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8619:1: ( ( ruleStringValue ) )
            // InternalAdaptDsl.g:8620:2: ( ruleStringValue )
            {
            // InternalAdaptDsl.g:8620:2: ( ruleStringValue )
            // InternalAdaptDsl.g:8621:3: ruleStringValue
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
    // InternalAdaptDsl.g:8630:1: rule__DisplayPropertyValue__PropertyClassAssignment_2 : ( ruleBoolValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8634:1: ( ( ruleBoolValue ) )
            // InternalAdaptDsl.g:8635:2: ( ruleBoolValue )
            {
            // InternalAdaptDsl.g:8635:2: ( ruleBoolValue )
            // InternalAdaptDsl.g:8636:3: ruleBoolValue
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
    // InternalAdaptDsl.g:8645:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8649:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8650:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8650:2: ( RULE_INT )
            // InternalAdaptDsl.g:8651:3: RULE_INT
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
    // InternalAdaptDsl.g:8660:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8664:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8665:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8665:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8666:3: RULE_STRING
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
    // InternalAdaptDsl.g:8675:1: rule__BoolValue__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8679:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:8680:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:8680:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:8681:3: RULE_BOOL
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
    // InternalAdaptDsl.g:8690:1: rule__TaskChangeOperation__OperationAssignment_0 : ( ruleAddViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8694:1: ( ( ruleAddViewComponentOperation ) )
            // InternalAdaptDsl.g:8695:2: ( ruleAddViewComponentOperation )
            {
            // InternalAdaptDsl.g:8695:2: ( ruleAddViewComponentOperation )
            // InternalAdaptDsl.g:8696:3: ruleAddViewComponentOperation
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
    // InternalAdaptDsl.g:8705:1: rule__TaskChangeOperation__OperationAssignment_1 : ( ruleDeleteViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8709:1: ( ( ruleDeleteViewComponentOperation ) )
            // InternalAdaptDsl.g:8710:2: ( ruleDeleteViewComponentOperation )
            {
            // InternalAdaptDsl.g:8710:2: ( ruleDeleteViewComponentOperation )
            // InternalAdaptDsl.g:8711:3: ruleDeleteViewComponentOperation
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


    // $ANTLR start "rule__TaskChangeOperation__OperationAssignment_2"
    // InternalAdaptDsl.g:8720:1: rule__TaskChangeOperation__OperationAssignment_2 : ( ruleAddViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8724:1: ( ( ruleAddViewComponentButtonOperation ) )
            // InternalAdaptDsl.g:8725:2: ( ruleAddViewComponentButtonOperation )
            {
            // InternalAdaptDsl.g:8725:2: ( ruleAddViewComponentButtonOperation )
            // InternalAdaptDsl.g:8726:3: ruleAddViewComponentButtonOperation
            {
             before(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentButtonOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddViewComponentButtonOperation();

            state._fsp--;

             after(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentButtonOperationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskChangeOperation__OperationAssignment_2"


    // $ANTLR start "rule__TaskChangeOperation__OperationAssignment_3"
    // InternalAdaptDsl.g:8735:1: rule__TaskChangeOperation__OperationAssignment_3 : ( ruleDeleteViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8739:1: ( ( ruleDeleteViewComponentButtonOperation ) )
            // InternalAdaptDsl.g:8740:2: ( ruleDeleteViewComponentButtonOperation )
            {
            // InternalAdaptDsl.g:8740:2: ( ruleDeleteViewComponentButtonOperation )
            // InternalAdaptDsl.g:8741:3: ruleDeleteViewComponentButtonOperation
            {
             before(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentButtonOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeleteViewComponentButtonOperation();

            state._fsp--;

             after(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentButtonOperationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskChangeOperation__OperationAssignment_3"


    // $ANTLR start "rule__AddViewComponentOperation__ViewCompAssignment_2"
    // InternalAdaptDsl.g:8750:1: rule__AddViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8754:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:8755:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:8755:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:8756:3: ruleViewComponent
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
    // InternalAdaptDsl.g:8765:1: rule__AddViewComponentOperation__TargetAssignment_4 : ( ruleTargetContainer ) ;
    public final void rule__AddViewComponentOperation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8769:1: ( ( ruleTargetContainer ) )
            // InternalAdaptDsl.g:8770:2: ( ruleTargetContainer )
            {
            // InternalAdaptDsl.g:8770:2: ( ruleTargetContainer )
            // InternalAdaptDsl.g:8771:3: ruleTargetContainer
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
    // InternalAdaptDsl.g:8780:1: rule__DeleteViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8784:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:8785:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:8785:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:8786:3: ruleViewComponent
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


    // $ANTLR start "rule__AddViewComponentButtonOperation__IdAssignment_2"
    // InternalAdaptDsl.g:8795:1: rule__AddViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8799:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8800:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8800:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8801:3: RULE_STRING
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__IdAssignment_2"


    // $ANTLR start "rule__AddViewComponentButtonOperation__LangKeyAssignment_4"
    // InternalAdaptDsl.g:8810:1: rule__AddViewComponentButtonOperation__LangKeyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__LangKeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8814:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8815:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8815:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8816:3: RULE_STRING
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeySTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeySTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__LangKeyAssignment_4"


    // $ANTLR start "rule__AddViewComponentButtonOperation__ActionAssignment_6"
    // InternalAdaptDsl.g:8825:1: rule__AddViewComponentButtonOperation__ActionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8829:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8830:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8830:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8831:3: RULE_STRING
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getActionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddViewComponentButtonOperationAccess().getActionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddViewComponentButtonOperation__ActionAssignment_6"


    // $ANTLR start "rule__DeleteViewComponentButtonOperation__IdAssignment_2"
    // InternalAdaptDsl.g:8840:1: rule__DeleteViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DeleteViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8844:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8845:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8845:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8846:3: RULE_STRING
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteViewComponentButtonOperation__IdAssignment_2"


    // $ANTLR start "rule__NavigationChangeOperation__OperationAssignment_0"
    // InternalAdaptDsl.g:8855:1: rule__NavigationChangeOperation__OperationAssignment_0 : ( ruleAddNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8859:1: ( ( ruleAddNavLinkOperation ) )
            // InternalAdaptDsl.g:8860:2: ( ruleAddNavLinkOperation )
            {
            // InternalAdaptDsl.g:8860:2: ( ruleAddNavLinkOperation )
            // InternalAdaptDsl.g:8861:3: ruleAddNavLinkOperation
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
    // InternalAdaptDsl.g:8870:1: rule__NavigationChangeOperation__OperationAssignment_1 : ( ruleDeleteNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8874:1: ( ( ruleDeleteNavLinkOperation ) )
            // InternalAdaptDsl.g:8875:2: ( ruleDeleteNavLinkOperation )
            {
            // InternalAdaptDsl.g:8875:2: ( ruleDeleteNavLinkOperation )
            // InternalAdaptDsl.g:8876:3: ruleDeleteNavLinkOperation
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
    // InternalAdaptDsl.g:8885:1: rule__NavigationChangeOperation__OperationAssignment_2 : ( ruleRedirectNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8889:1: ( ( ruleRedirectNavLinkOperation ) )
            // InternalAdaptDsl.g:8890:2: ( ruleRedirectNavLinkOperation )
            {
            // InternalAdaptDsl.g:8890:2: ( ruleRedirectNavLinkOperation )
            // InternalAdaptDsl.g:8891:3: ruleRedirectNavLinkOperation
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
    // InternalAdaptDsl.g:8900:1: rule__NavigationChangeOperation__OperationAssignment_3 : ( ruleClearNavOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8904:1: ( ( ruleClearNavOperation ) )
            // InternalAdaptDsl.g:8905:2: ( ruleClearNavOperation )
            {
            // InternalAdaptDsl.g:8905:2: ( ruleClearNavOperation )
            // InternalAdaptDsl.g:8906:3: ruleClearNavOperation
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
    // InternalAdaptDsl.g:8915:1: rule__AddNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8919:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:8920:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:8920:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:8921:3: ruleViewComponent
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
    // InternalAdaptDsl.g:8930:1: rule__AddNavLinkOperation__TextAssignment_4 : ( ruleText ) ;
    public final void rule__AddNavLinkOperation__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8934:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:8935:2: ( ruleText )
            {
            // InternalAdaptDsl.g:8935:2: ( ruleText )
            // InternalAdaptDsl.g:8936:3: ruleText
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
    // InternalAdaptDsl.g:8945:1: rule__DeleteNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8949:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:8950:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:8950:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:8951:3: ruleViewComponent
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
    // InternalAdaptDsl.g:8960:1: rule__RedirectNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__RedirectNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8964:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:8965:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:8965:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:8966:3: ruleViewComponent
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
    // InternalAdaptDsl.g:8975:1: rule__LayoutChangeOperation__OperationAssignment_0 : ( ruleChangeFontOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8979:1: ( ( ruleChangeFontOperation ) )
            // InternalAdaptDsl.g:8980:2: ( ruleChangeFontOperation )
            {
            // InternalAdaptDsl.g:8980:2: ( ruleChangeFontOperation )
            // InternalAdaptDsl.g:8981:3: ruleChangeFontOperation
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
    // InternalAdaptDsl.g:8990:1: rule__LayoutChangeOperation__OperationAssignment_1 : ( ruleChangeFontSizeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8994:1: ( ( ruleChangeFontSizeOperation ) )
            // InternalAdaptDsl.g:8995:2: ( ruleChangeFontSizeOperation )
            {
            // InternalAdaptDsl.g:8995:2: ( ruleChangeFontSizeOperation )
            // InternalAdaptDsl.g:8996:3: ruleChangeFontSizeOperation
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
    // InternalAdaptDsl.g:9005:1: rule__LayoutChangeOperation__OperationAssignment_2 : ( ruleChangeTableCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9009:1: ( ( ruleChangeTableCssClassOperation ) )
            // InternalAdaptDsl.g:9010:2: ( ruleChangeTableCssClassOperation )
            {
            // InternalAdaptDsl.g:9010:2: ( ruleChangeTableCssClassOperation )
            // InternalAdaptDsl.g:9011:3: ruleChangeTableCssClassOperation
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
    // InternalAdaptDsl.g:9020:1: rule__LayoutChangeOperation__OperationAssignment_3 : ( ruleAdaptCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9024:1: ( ( ruleAdaptCssClassOperation ) )
            // InternalAdaptDsl.g:9025:2: ( ruleAdaptCssClassOperation )
            {
            // InternalAdaptDsl.g:9025:2: ( ruleAdaptCssClassOperation )
            // InternalAdaptDsl.g:9026:3: ruleAdaptCssClassOperation
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
    // InternalAdaptDsl.g:9035:1: rule__LayoutChangeOperation__OperationAssignment_4 : ( ruleChangeColorSchemeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9039:1: ( ( ruleChangeColorSchemeOperation ) )
            // InternalAdaptDsl.g:9040:2: ( ruleChangeColorSchemeOperation )
            {
            // InternalAdaptDsl.g:9040:2: ( ruleChangeColorSchemeOperation )
            // InternalAdaptDsl.g:9041:3: ruleChangeColorSchemeOperation
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
    // InternalAdaptDsl.g:9050:1: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizePrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9054:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:9055:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:9055:2: ( ruleFontSize )
            // InternalAdaptDsl.g:9056:3: ruleFontSize
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
    // InternalAdaptDsl.g:9065:1: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9069:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:9070:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:9070:2: ( ruleFontSize )
            // InternalAdaptDsl.g:9071:3: ruleFontSize
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
    // InternalAdaptDsl.g:9080:1: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9084:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:9085:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:9085:2: ( ruleColor )
            // InternalAdaptDsl.g:9086:3: ruleColor
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
    // InternalAdaptDsl.g:9095:1: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9099:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:9100:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:9100:2: ( ruleColor )
            // InternalAdaptDsl.g:9101:3: ruleColor
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
    // InternalAdaptDsl.g:9110:1: rule__ChangeFontOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeFontOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9114:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9115:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9115:2: ( ruleText )
            // InternalAdaptDsl.g:9116:3: ruleText
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
    // InternalAdaptDsl.g:9125:1: rule__ChangeTableCssClassOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeTableCssClassOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9129:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9130:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9130:2: ( ruleText )
            // InternalAdaptDsl.g:9131:3: ruleText
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
    // InternalAdaptDsl.g:9140:1: rule__AdaptCssClassOperation__CssClassAssignment_2 : ( ruleCssClass ) ;
    public final void rule__AdaptCssClassOperation__CssClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9144:1: ( ( ruleCssClass ) )
            // InternalAdaptDsl.g:9145:2: ( ruleCssClass )
            {
            // InternalAdaptDsl.g:9145:2: ( ruleCssClass )
            // InternalAdaptDsl.g:9146:3: ruleCssClass
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
    // InternalAdaptDsl.g:9155:1: rule__AdaptCssClassOperation__CssAttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9159:1: ( ( ruleAttribute ) )
            // InternalAdaptDsl.g:9160:2: ( ruleAttribute )
            {
            // InternalAdaptDsl.g:9160:2: ( ruleAttribute )
            // InternalAdaptDsl.g:9161:3: ruleAttribute
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
    // InternalAdaptDsl.g:9170:1: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 : ( ruleAttributeValue ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9174:1: ( ( ruleAttributeValue ) )
            // InternalAdaptDsl.g:9175:2: ( ruleAttributeValue )
            {
            // InternalAdaptDsl.g:9175:2: ( ruleAttributeValue )
            // InternalAdaptDsl.g:9176:3: ruleAttributeValue
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


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalAdaptDsl.g:9185:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9189:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9190:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9190:2: ( RULE_ID )
            // InternalAdaptDsl.g:9191:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__PropertyAssignment_3"
    // InternalAdaptDsl.g:9200:1: rule__Entity__PropertyAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9204:1: ( ( ruleProperty ) )
            // InternalAdaptDsl.g:9205:2: ( ruleProperty )
            {
            // InternalAdaptDsl.g:9205:2: ( ruleProperty )
            // InternalAdaptDsl.g:9206:3: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertyPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertyPropertyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__PropertyAssignment_3"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalAdaptDsl.g:9215:1: rule__Property__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9219:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9220:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9220:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9221:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__TypeAssignment_3"
    // InternalAdaptDsl.g:9230:1: rule__Property__TypeAssignment_3 : ( ruleTYPE ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9234:1: ( ( ruleTYPE ) )
            // InternalAdaptDsl.g:9235:2: ( ruleTYPE )
            {
            // InternalAdaptDsl.g:9235:2: ( ruleTYPE )
            // InternalAdaptDsl.g:9236:3: ruleTYPE
            {
             before(grammarAccess.getPropertyAccess().getTypeTYPEEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTYPEEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_3"


    // $ANTLR start "rule__Property__ProviderAssignment_5"
    // InternalAdaptDsl.g:9245:1: rule__Property__ProviderAssignment_5 : ( ruleProvider ) ;
    public final void rule__Property__ProviderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9249:1: ( ( ruleProvider ) )
            // InternalAdaptDsl.g:9250:2: ( ruleProvider )
            {
            // InternalAdaptDsl.g:9250:2: ( ruleProvider )
            // InternalAdaptDsl.g:9251:3: ruleProvider
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getProviderProviderParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ProviderAssignment_5"


    // $ANTLR start "rule__Provider__NameAssignment"
    // InternalAdaptDsl.g:9260:1: rule__Provider__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Provider__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9264:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9265:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9265:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9266:3: RULE_STRING
            {
             before(grammarAccess.getProviderAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Provider__NameAssignment"


    // $ANTLR start "rule__DefTypes__ThisAssignment_0"
    // InternalAdaptDsl.g:9275:1: rule__DefTypes__ThisAssignment_0 : ( ruleDefType ) ;
    public final void rule__DefTypes__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9279:1: ( ( ruleDefType ) )
            // InternalAdaptDsl.g:9280:2: ( ruleDefType )
            {
            // InternalAdaptDsl.g:9280:2: ( ruleDefType )
            // InternalAdaptDsl.g:9281:3: ruleDefType
            {
             before(grammarAccess.getDefTypesAccess().getThisDefTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefType();

            state._fsp--;

             after(grammarAccess.getDefTypesAccess().getThisDefTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefTypes__ThisAssignment_0"


    // $ANTLR start "rule__DefTypes__NextAssignment_1"
    // InternalAdaptDsl.g:9290:1: rule__DefTypes__NextAssignment_1 : ( ruleDefTypes ) ;
    public final void rule__DefTypes__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9294:1: ( ( ruleDefTypes ) )
            // InternalAdaptDsl.g:9295:2: ( ruleDefTypes )
            {
            // InternalAdaptDsl.g:9295:2: ( ruleDefTypes )
            // InternalAdaptDsl.g:9296:3: ruleDefTypes
            {
             before(grammarAccess.getDefTypesAccess().getNextDefTypesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefTypes();

            state._fsp--;

             after(grammarAccess.getDefTypesAccess().getNextDefTypesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefTypes__NextAssignment_1"


    // $ANTLR start "rule__DefType__NameAssignment_0"
    // InternalAdaptDsl.g:9305:1: rule__DefType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9309:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9310:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9310:2: ( RULE_ID )
            // InternalAdaptDsl.g:9311:3: RULE_ID
            {
             before(grammarAccess.getDefTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefTypeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefType__NameAssignment_0"


    // $ANTLR start "rule__DefType__EnumsAssignment_2"
    // InternalAdaptDsl.g:9320:1: rule__DefType__EnumsAssignment_2 : ( ruleEnums ) ;
    public final void rule__DefType__EnumsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9324:1: ( ( ruleEnums ) )
            // InternalAdaptDsl.g:9325:2: ( ruleEnums )
            {
            // InternalAdaptDsl.g:9325:2: ( ruleEnums )
            // InternalAdaptDsl.g:9326:3: ruleEnums
            {
             before(grammarAccess.getDefTypeAccess().getEnumsEnumsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEnums();

            state._fsp--;

             after(grammarAccess.getDefTypeAccess().getEnumsEnumsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefType__EnumsAssignment_2"


    // $ANTLR start "rule__Enums__ThisAssignment_0"
    // InternalAdaptDsl.g:9335:1: rule__Enums__ThisAssignment_0 : ( ruleEnum ) ;
    public final void rule__Enums__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9339:1: ( ( ruleEnum ) )
            // InternalAdaptDsl.g:9340:2: ( ruleEnum )
            {
            // InternalAdaptDsl.g:9340:2: ( ruleEnum )
            // InternalAdaptDsl.g:9341:3: ruleEnum
            {
             before(grammarAccess.getEnumsAccess().getThisEnumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumsAccess().getThisEnumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enums__ThisAssignment_0"


    // $ANTLR start "rule__Enums__NextAssignment_1_1"
    // InternalAdaptDsl.g:9350:1: rule__Enums__NextAssignment_1_1 : ( ruleEnums ) ;
    public final void rule__Enums__NextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9354:1: ( ( ruleEnums ) )
            // InternalAdaptDsl.g:9355:2: ( ruleEnums )
            {
            // InternalAdaptDsl.g:9355:2: ( ruleEnums )
            // InternalAdaptDsl.g:9356:3: ruleEnums
            {
             before(grammarAccess.getEnumsAccess().getNextEnumsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnums();

            state._fsp--;

             after(grammarAccess.getEnumsAccess().getNextEnumsParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enums__NextAssignment_1_1"


    // $ANTLR start "rule__Enum__NameAssignment"
    // InternalAdaptDsl.g:9365:1: rule__Enum__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Enum__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9369:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9370:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9370:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9371:3: RULE_STRING
            {
             before(grammarAccess.getEnumAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\2\6\6\uffff\1\6\1\uffff\1\6";
    static final String dfa_3s = "\1\4\2\14\1\4\2\5\2\uffff\1\5\1\14\1\uffff\1\14";
    static final String dfa_4s = "\1\4\2\53\1\4\2\7\2\uffff\1\6\1\53\1\uffff\1\53";
    static final String dfa_5s = "\6\uffff\1\3\1\2\2\uffff\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\2\7\1\4\1\5\2\7\1\10\23\uffff\1\6\1\uffff\2\6\1\2\1\3",
            "\2\7\1\4\1\5\2\7\1\10\23\uffff\1\6\1\uffff\2\6\1\uffff\1\3",
            "\1\11",
            "\1\12\1\7\1\6",
            "\1\12\1\7\1\6",
            "",
            "",
            "\1\12\1\7",
            "\2\7\1\4\1\5\2\7\1\10\23\uffff\1\6\1\uffff\2\6\1\13\1\3",
            "",
            "\2\7\1\4\1\5\2\7\1\10\23\uffff\1\6\1\uffff\2\6\1\uffff\1\3"
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
            return "1543:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\2\5\3\uffff\2\5";
    static final String dfa_10s = "\1\4\2\16\1\4\2\uffff\2\16";
    static final String dfa_11s = "\1\4\2\53\1\4\2\uffff\2\53";
    static final String dfa_12s = "\4\uffff\1\1\1\2\2\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\2\4\26\uffff\1\5\1\uffff\2\5\1\2\1\3",
            "\2\4\26\uffff\1\5\1\uffff\2\5\1\uffff\1\3",
            "\1\6",
            "",
            "",
            "\2\4\26\uffff\1\5\1\uffff\2\5\1\7\1\3",
            "\2\4\26\uffff\1\5\1\uffff\2\5\1\uffff\1\3"
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
            return "1570:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1FFFD00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000380000L});

}