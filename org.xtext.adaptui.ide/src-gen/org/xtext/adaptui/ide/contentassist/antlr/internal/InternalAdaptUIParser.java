package org.xtext.adaptui.ide.contentassist.antlr.internal;

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
import org.xtext.adaptui.services.AdaptUIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptUIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'ContextModel{'", "'};'", "'Providers{'", "';'", "'DefTypes{'", "'AdaptationModel{'", "'flow'", "'{'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'.get'", "'()'", "'.set'", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "'type'", "'provider'", "'update'", "':'", "'string'", "'number'", "'boolean'", "'eventTriggered'", "'slow'", "'fast'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
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


        public InternalAdaptUIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdaptUIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdaptUIParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAdaptUI.g"; }


    	private AdaptUIGrammarAccess grammarAccess;

    	public void setGrammarAccess(AdaptUIGrammarAccess grammarAccess) {
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
    // InternalAdaptUI.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAdaptUI.g:54:1: ( ruleModel EOF )
            // InternalAdaptUI.g:55:1: ruleModel EOF
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
    // InternalAdaptUI.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAdaptUI.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAdaptUI.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAdaptUI.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAdaptUI.g:69:3: ( rule__Model__Group__0 )
            // InternalAdaptUI.g:69:4: rule__Model__Group__0
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


    // $ANTLR start "entryRuleContextModel"
    // InternalAdaptUI.g:78:1: entryRuleContextModel : ruleContextModel EOF ;
    public final void entryRuleContextModel() throws RecognitionException {
        try {
            // InternalAdaptUI.g:79:1: ( ruleContextModel EOF )
            // InternalAdaptUI.g:80:1: ruleContextModel EOF
            {
             before(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            ruleContextModel();

            state._fsp--;

             after(grammarAccess.getContextModelRule()); 
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
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalAdaptUI.g:87:1: ruleContextModel : ( ( rule__ContextModel__Group__0 ) ) ;
    public final void ruleContextModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:91:2: ( ( ( rule__ContextModel__Group__0 ) ) )
            // InternalAdaptUI.g:92:2: ( ( rule__ContextModel__Group__0 ) )
            {
            // InternalAdaptUI.g:92:2: ( ( rule__ContextModel__Group__0 ) )
            // InternalAdaptUI.g:93:3: ( rule__ContextModel__Group__0 )
            {
             before(grammarAccess.getContextModelAccess().getGroup()); 
            // InternalAdaptUI.g:94:3: ( rule__ContextModel__Group__0 )
            // InternalAdaptUI.g:94:4: rule__ContextModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleAdaptationModel"
    // InternalAdaptUI.g:103:1: entryRuleAdaptationModel : ruleAdaptationModel EOF ;
    public final void entryRuleAdaptationModel() throws RecognitionException {
        try {
            // InternalAdaptUI.g:104:1: ( ruleAdaptationModel EOF )
            // InternalAdaptUI.g:105:1: ruleAdaptationModel EOF
            {
             before(grammarAccess.getAdaptationModelRule()); 
            pushFollow(FOLLOW_1);
            ruleAdaptationModel();

            state._fsp--;

             after(grammarAccess.getAdaptationModelRule()); 
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
    // $ANTLR end "entryRuleAdaptationModel"


    // $ANTLR start "ruleAdaptationModel"
    // InternalAdaptUI.g:112:1: ruleAdaptationModel : ( ( rule__AdaptationModel__Group__0 ) ) ;
    public final void ruleAdaptationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:116:2: ( ( ( rule__AdaptationModel__Group__0 ) ) )
            // InternalAdaptUI.g:117:2: ( ( rule__AdaptationModel__Group__0 ) )
            {
            // InternalAdaptUI.g:117:2: ( ( rule__AdaptationModel__Group__0 ) )
            // InternalAdaptUI.g:118:3: ( rule__AdaptationModel__Group__0 )
            {
             before(grammarAccess.getAdaptationModelAccess().getGroup()); 
            // InternalAdaptUI.g:119:3: ( rule__AdaptationModel__Group__0 )
            // InternalAdaptUI.g:119:4: rule__AdaptationModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdaptationModel"


    // $ANTLR start "entryRuleServices"
    // InternalAdaptUI.g:128:1: entryRuleServices : ruleServices EOF ;
    public final void entryRuleServices() throws RecognitionException {
        try {
            // InternalAdaptUI.g:129:1: ( ruleServices EOF )
            // InternalAdaptUI.g:130:1: ruleServices EOF
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
    // InternalAdaptUI.g:137:1: ruleServices : ( ( rule__Services__Group__0 ) ) ;
    public final void ruleServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:141:2: ( ( ( rule__Services__Group__0 ) ) )
            // InternalAdaptUI.g:142:2: ( ( rule__Services__Group__0 ) )
            {
            // InternalAdaptUI.g:142:2: ( ( rule__Services__Group__0 ) )
            // InternalAdaptUI.g:143:3: ( rule__Services__Group__0 )
            {
             before(grammarAccess.getServicesAccess().getGroup()); 
            // InternalAdaptUI.g:144:3: ( rule__Services__Group__0 )
            // InternalAdaptUI.g:144:4: rule__Services__Group__0
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
    // InternalAdaptUI.g:153:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalAdaptUI.g:154:1: ( ruleService EOF )
            // InternalAdaptUI.g:155:1: ruleService EOF
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
    // InternalAdaptUI.g:162:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:166:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalAdaptUI.g:167:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalAdaptUI.g:167:2: ( ( rule__Service__Group__0 ) )
            // InternalAdaptUI.g:168:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalAdaptUI.g:169:3: ( rule__Service__Group__0 )
            // InternalAdaptUI.g:169:4: rule__Service__Group__0
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
    // InternalAdaptUI.g:178:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalAdaptUI.g:179:1: ( ruleFunctions EOF )
            // InternalAdaptUI.g:180:1: ruleFunctions EOF
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
    // InternalAdaptUI.g:187:1: ruleFunctions : ( ( rule__Functions__Group__0 ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:191:2: ( ( ( rule__Functions__Group__0 ) ) )
            // InternalAdaptUI.g:192:2: ( ( rule__Functions__Group__0 ) )
            {
            // InternalAdaptUI.g:192:2: ( ( rule__Functions__Group__0 ) )
            // InternalAdaptUI.g:193:3: ( rule__Functions__Group__0 )
            {
             before(grammarAccess.getFunctionsAccess().getGroup()); 
            // InternalAdaptUI.g:194:3: ( rule__Functions__Group__0 )
            // InternalAdaptUI.g:194:4: rule__Functions__Group__0
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
    // InternalAdaptUI.g:203:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalAdaptUI.g:204:1: ( ruleFunction EOF )
            // InternalAdaptUI.g:205:1: ruleFunction EOF
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
    // InternalAdaptUI.g:212:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:216:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalAdaptUI.g:217:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalAdaptUI.g:217:2: ( ( rule__Function__Group__0 ) )
            // InternalAdaptUI.g:218:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalAdaptUI.g:219:3: ( rule__Function__Group__0 )
            // InternalAdaptUI.g:219:4: rule__Function__Group__0
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
    // InternalAdaptUI.g:228:1: entryRuleAdaptationRule : ruleAdaptationRule EOF ;
    public final void entryRuleAdaptationRule() throws RecognitionException {
        try {
            // InternalAdaptUI.g:229:1: ( ruleAdaptationRule EOF )
            // InternalAdaptUI.g:230:1: ruleAdaptationRule EOF
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
    // InternalAdaptUI.g:237:1: ruleAdaptationRule : ( ( rule__AdaptationRule__Group__0 ) ) ;
    public final void ruleAdaptationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:241:2: ( ( ( rule__AdaptationRule__Group__0 ) ) )
            // InternalAdaptUI.g:242:2: ( ( rule__AdaptationRule__Group__0 ) )
            {
            // InternalAdaptUI.g:242:2: ( ( rule__AdaptationRule__Group__0 ) )
            // InternalAdaptUI.g:243:3: ( rule__AdaptationRule__Group__0 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getGroup()); 
            // InternalAdaptUI.g:244:3: ( rule__AdaptationRule__Group__0 )
            // InternalAdaptUI.g:244:4: rule__AdaptationRule__Group__0
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
    // InternalAdaptUI.g:253:1: entryRuleConditionalOR : ruleConditionalOR EOF ;
    public final void entryRuleConditionalOR() throws RecognitionException {
        try {
            // InternalAdaptUI.g:254:1: ( ruleConditionalOR EOF )
            // InternalAdaptUI.g:255:1: ruleConditionalOR EOF
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
    // InternalAdaptUI.g:262:1: ruleConditionalOR : ( ( rule__ConditionalOR__Group__0 ) ) ;
    public final void ruleConditionalOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:266:2: ( ( ( rule__ConditionalOR__Group__0 ) ) )
            // InternalAdaptUI.g:267:2: ( ( rule__ConditionalOR__Group__0 ) )
            {
            // InternalAdaptUI.g:267:2: ( ( rule__ConditionalOR__Group__0 ) )
            // InternalAdaptUI.g:268:3: ( rule__ConditionalOR__Group__0 )
            {
             before(grammarAccess.getConditionalORAccess().getGroup()); 
            // InternalAdaptUI.g:269:3: ( rule__ConditionalOR__Group__0 )
            // InternalAdaptUI.g:269:4: rule__ConditionalOR__Group__0
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
    // InternalAdaptUI.g:278:1: entryRuleConditionalAND : ruleConditionalAND EOF ;
    public final void entryRuleConditionalAND() throws RecognitionException {
        try {
            // InternalAdaptUI.g:279:1: ( ruleConditionalAND EOF )
            // InternalAdaptUI.g:280:1: ruleConditionalAND EOF
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
    // InternalAdaptUI.g:287:1: ruleConditionalAND : ( ( rule__ConditionalAND__Group__0 ) ) ;
    public final void ruleConditionalAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:291:2: ( ( ( rule__ConditionalAND__Group__0 ) ) )
            // InternalAdaptUI.g:292:2: ( ( rule__ConditionalAND__Group__0 ) )
            {
            // InternalAdaptUI.g:292:2: ( ( rule__ConditionalAND__Group__0 ) )
            // InternalAdaptUI.g:293:3: ( rule__ConditionalAND__Group__0 )
            {
             before(grammarAccess.getConditionalANDAccess().getGroup()); 
            // InternalAdaptUI.g:294:3: ( rule__ConditionalAND__Group__0 )
            // InternalAdaptUI.g:294:4: rule__ConditionalAND__Group__0
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
    // InternalAdaptUI.g:303:1: entryRuleConditionalPrimary : ruleConditionalPrimary EOF ;
    public final void entryRuleConditionalPrimary() throws RecognitionException {
        try {
            // InternalAdaptUI.g:304:1: ( ruleConditionalPrimary EOF )
            // InternalAdaptUI.g:305:1: ruleConditionalPrimary EOF
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
    // InternalAdaptUI.g:312:1: ruleConditionalPrimary : ( ( rule__ConditionalPrimary__Alternatives ) ) ;
    public final void ruleConditionalPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:316:2: ( ( ( rule__ConditionalPrimary__Alternatives ) ) )
            // InternalAdaptUI.g:317:2: ( ( rule__ConditionalPrimary__Alternatives ) )
            {
            // InternalAdaptUI.g:317:2: ( ( rule__ConditionalPrimary__Alternatives ) )
            // InternalAdaptUI.g:318:3: ( rule__ConditionalPrimary__Alternatives )
            {
             before(grammarAccess.getConditionalPrimaryAccess().getAlternatives()); 
            // InternalAdaptUI.g:319:3: ( rule__ConditionalPrimary__Alternatives )
            // InternalAdaptUI.g:319:4: rule__ConditionalPrimary__Alternatives
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
    // InternalAdaptUI.g:328:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // InternalAdaptUI.g:329:1: ( ruleBooleanCondition EOF )
            // InternalAdaptUI.g:330:1: ruleBooleanCondition EOF
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
    // InternalAdaptUI.g:337:1: ruleBooleanCondition : ( ( rule__BooleanCondition__Alternatives ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:341:2: ( ( ( rule__BooleanCondition__Alternatives ) ) )
            // InternalAdaptUI.g:342:2: ( ( rule__BooleanCondition__Alternatives ) )
            {
            // InternalAdaptUI.g:342:2: ( ( rule__BooleanCondition__Alternatives ) )
            // InternalAdaptUI.g:343:3: ( rule__BooleanCondition__Alternatives )
            {
             before(grammarAccess.getBooleanConditionAccess().getAlternatives()); 
            // InternalAdaptUI.g:344:3: ( rule__BooleanCondition__Alternatives )
            // InternalAdaptUI.g:344:4: rule__BooleanCondition__Alternatives
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
    // InternalAdaptUI.g:353:1: entryRuleNumberCondition : ruleNumberCondition EOF ;
    public final void entryRuleNumberCondition() throws RecognitionException {
        try {
            // InternalAdaptUI.g:354:1: ( ruleNumberCondition EOF )
            // InternalAdaptUI.g:355:1: ruleNumberCondition EOF
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
    // InternalAdaptUI.g:362:1: ruleNumberCondition : ( ( rule__NumberCondition__Group__0 ) ) ;
    public final void ruleNumberCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:366:2: ( ( ( rule__NumberCondition__Group__0 ) ) )
            // InternalAdaptUI.g:367:2: ( ( rule__NumberCondition__Group__0 ) )
            {
            // InternalAdaptUI.g:367:2: ( ( rule__NumberCondition__Group__0 ) )
            // InternalAdaptUI.g:368:3: ( rule__NumberCondition__Group__0 )
            {
             before(grammarAccess.getNumberConditionAccess().getGroup()); 
            // InternalAdaptUI.g:369:3: ( rule__NumberCondition__Group__0 )
            // InternalAdaptUI.g:369:4: rule__NumberCondition__Group__0
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
    // InternalAdaptUI.g:378:1: entryRuleStringCondition : ruleStringCondition EOF ;
    public final void entryRuleStringCondition() throws RecognitionException {
        try {
            // InternalAdaptUI.g:379:1: ( ruleStringCondition EOF )
            // InternalAdaptUI.g:380:1: ruleStringCondition EOF
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
    // InternalAdaptUI.g:387:1: ruleStringCondition : ( ( rule__StringCondition__Group__0 ) ) ;
    public final void ruleStringCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:391:2: ( ( ( rule__StringCondition__Group__0 ) ) )
            // InternalAdaptUI.g:392:2: ( ( rule__StringCondition__Group__0 ) )
            {
            // InternalAdaptUI.g:392:2: ( ( rule__StringCondition__Group__0 ) )
            // InternalAdaptUI.g:393:3: ( rule__StringCondition__Group__0 )
            {
             before(grammarAccess.getStringConditionAccess().getGroup()); 
            // InternalAdaptUI.g:394:3: ( rule__StringCondition__Group__0 )
            // InternalAdaptUI.g:394:4: rule__StringCondition__Group__0
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
    // InternalAdaptUI.g:403:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalAdaptUI.g:404:1: ( ruleFact EOF )
            // InternalAdaptUI.g:405:1: ruleFact EOF
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
    // InternalAdaptUI.g:412:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:416:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalAdaptUI.g:417:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalAdaptUI.g:417:2: ( ( rule__Fact__Group__0 ) )
            // InternalAdaptUI.g:418:3: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // InternalAdaptUI.g:419:3: ( rule__Fact__Group__0 )
            // InternalAdaptUI.g:419:4: rule__Fact__Group__0
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


    // $ANTLR start "entryRuleFactName"
    // InternalAdaptUI.g:428:1: entryRuleFactName : ruleFactName EOF ;
    public final void entryRuleFactName() throws RecognitionException {
        try {
            // InternalAdaptUI.g:429:1: ( ruleFactName EOF )
            // InternalAdaptUI.g:430:1: ruleFactName EOF
            {
             before(grammarAccess.getFactNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFactName();

            state._fsp--;

             after(grammarAccess.getFactNameRule()); 
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
    // $ANTLR end "entryRuleFactName"


    // $ANTLR start "ruleFactName"
    // InternalAdaptUI.g:437:1: ruleFactName : ( ( rule__FactName__NameAssignment ) ) ;
    public final void ruleFactName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:441:2: ( ( ( rule__FactName__NameAssignment ) ) )
            // InternalAdaptUI.g:442:2: ( ( rule__FactName__NameAssignment ) )
            {
            // InternalAdaptUI.g:442:2: ( ( rule__FactName__NameAssignment ) )
            // InternalAdaptUI.g:443:3: ( rule__FactName__NameAssignment )
            {
             before(grammarAccess.getFactNameAccess().getNameAssignment()); 
            // InternalAdaptUI.g:444:3: ( rule__FactName__NameAssignment )
            // InternalAdaptUI.g:444:4: rule__FactName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FactName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFactNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactName"


    // $ANTLR start "entryRuleFactProperty"
    // InternalAdaptUI.g:453:1: entryRuleFactProperty : ruleFactProperty EOF ;
    public final void entryRuleFactProperty() throws RecognitionException {
        try {
            // InternalAdaptUI.g:454:1: ( ruleFactProperty EOF )
            // InternalAdaptUI.g:455:1: ruleFactProperty EOF
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
    // InternalAdaptUI.g:462:1: ruleFactProperty : ( ( rule__FactProperty__Group__0 ) ) ;
    public final void ruleFactProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:466:2: ( ( ( rule__FactProperty__Group__0 ) ) )
            // InternalAdaptUI.g:467:2: ( ( rule__FactProperty__Group__0 ) )
            {
            // InternalAdaptUI.g:467:2: ( ( rule__FactProperty__Group__0 ) )
            // InternalAdaptUI.g:468:3: ( rule__FactProperty__Group__0 )
            {
             before(grammarAccess.getFactPropertyAccess().getGroup()); 
            // InternalAdaptUI.g:469:3: ( rule__FactProperty__Group__0 )
            // InternalAdaptUI.g:469:4: rule__FactProperty__Group__0
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
    // InternalAdaptUI.g:478:1: entryRuleNumberOperators : ruleNumberOperators EOF ;
    public final void entryRuleNumberOperators() throws RecognitionException {
        try {
            // InternalAdaptUI.g:479:1: ( ruleNumberOperators EOF )
            // InternalAdaptUI.g:480:1: ruleNumberOperators EOF
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
    // InternalAdaptUI.g:487:1: ruleNumberOperators : ( ( rule__NumberOperators__Alternatives ) ) ;
    public final void ruleNumberOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:491:2: ( ( ( rule__NumberOperators__Alternatives ) ) )
            // InternalAdaptUI.g:492:2: ( ( rule__NumberOperators__Alternatives ) )
            {
            // InternalAdaptUI.g:492:2: ( ( rule__NumberOperators__Alternatives ) )
            // InternalAdaptUI.g:493:3: ( rule__NumberOperators__Alternatives )
            {
             before(grammarAccess.getNumberOperatorsAccess().getAlternatives()); 
            // InternalAdaptUI.g:494:3: ( rule__NumberOperators__Alternatives )
            // InternalAdaptUI.g:494:4: rule__NumberOperators__Alternatives
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
    // InternalAdaptUI.g:503:1: entryRuleStringOperators : ruleStringOperators EOF ;
    public final void entryRuleStringOperators() throws RecognitionException {
        try {
            // InternalAdaptUI.g:504:1: ( ruleStringOperators EOF )
            // InternalAdaptUI.g:505:1: ruleStringOperators EOF
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
    // InternalAdaptUI.g:512:1: ruleStringOperators : ( ( rule__StringOperators__Alternatives ) ) ;
    public final void ruleStringOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:516:2: ( ( ( rule__StringOperators__Alternatives ) ) )
            // InternalAdaptUI.g:517:2: ( ( rule__StringOperators__Alternatives ) )
            {
            // InternalAdaptUI.g:517:2: ( ( rule__StringOperators__Alternatives ) )
            // InternalAdaptUI.g:518:3: ( rule__StringOperators__Alternatives )
            {
             before(grammarAccess.getStringOperatorsAccess().getAlternatives()); 
            // InternalAdaptUI.g:519:3: ( rule__StringOperators__Alternatives )
            // InternalAdaptUI.g:519:4: rule__StringOperators__Alternatives
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
    // InternalAdaptUI.g:528:1: entryRuleBoolOperators : ruleBoolOperators EOF ;
    public final void entryRuleBoolOperators() throws RecognitionException {
        try {
            // InternalAdaptUI.g:529:1: ( ruleBoolOperators EOF )
            // InternalAdaptUI.g:530:1: ruleBoolOperators EOF
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
    // InternalAdaptUI.g:537:1: ruleBoolOperators : ( ( rule__BoolOperators__Alternatives ) ) ;
    public final void ruleBoolOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:541:2: ( ( ( rule__BoolOperators__Alternatives ) ) )
            // InternalAdaptUI.g:542:2: ( ( rule__BoolOperators__Alternatives ) )
            {
            // InternalAdaptUI.g:542:2: ( ( rule__BoolOperators__Alternatives ) )
            // InternalAdaptUI.g:543:3: ( rule__BoolOperators__Alternatives )
            {
             before(grammarAccess.getBoolOperatorsAccess().getAlternatives()); 
            // InternalAdaptUI.g:544:3: ( rule__BoolOperators__Alternatives )
            // InternalAdaptUI.g:544:4: rule__BoolOperators__Alternatives
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
    // InternalAdaptUI.g:553:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalAdaptUI.g:554:1: ( ruleActions EOF )
            // InternalAdaptUI.g:555:1: ruleActions EOF
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
    // InternalAdaptUI.g:562:1: ruleActions : ( ( rule__Actions__Group__0 ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:566:2: ( ( ( rule__Actions__Group__0 ) ) )
            // InternalAdaptUI.g:567:2: ( ( rule__Actions__Group__0 ) )
            {
            // InternalAdaptUI.g:567:2: ( ( rule__Actions__Group__0 ) )
            // InternalAdaptUI.g:568:3: ( rule__Actions__Group__0 )
            {
             before(grammarAccess.getActionsAccess().getGroup()); 
            // InternalAdaptUI.g:569:3: ( rule__Actions__Group__0 )
            // InternalAdaptUI.g:569:4: rule__Actions__Group__0
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
    // InternalAdaptUI.g:578:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalAdaptUI.g:579:1: ( ruleAction EOF )
            // InternalAdaptUI.g:580:1: ruleAction EOF
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
    // InternalAdaptUI.g:587:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:591:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalAdaptUI.g:592:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalAdaptUI.g:592:2: ( ( rule__Action__Alternatives ) )
            // InternalAdaptUI.g:593:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalAdaptUI.g:594:3: ( rule__Action__Alternatives )
            // InternalAdaptUI.g:594:4: rule__Action__Alternatives
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
    // InternalAdaptUI.g:603:1: entryRuleServiceOperation : ruleServiceOperation EOF ;
    public final void entryRuleServiceOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:604:1: ( ruleServiceOperation EOF )
            // InternalAdaptUI.g:605:1: ruleServiceOperation EOF
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
    // InternalAdaptUI.g:612:1: ruleServiceOperation : ( ( rule__ServiceOperation__Alternatives ) ) ;
    public final void ruleServiceOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:616:2: ( ( ( rule__ServiceOperation__Alternatives ) ) )
            // InternalAdaptUI.g:617:2: ( ( rule__ServiceOperation__Alternatives ) )
            {
            // InternalAdaptUI.g:617:2: ( ( rule__ServiceOperation__Alternatives ) )
            // InternalAdaptUI.g:618:3: ( rule__ServiceOperation__Alternatives )
            {
             before(grammarAccess.getServiceOperationAccess().getAlternatives()); 
            // InternalAdaptUI.g:619:3: ( rule__ServiceOperation__Alternatives )
            // InternalAdaptUI.g:619:4: rule__ServiceOperation__Alternatives
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
    // InternalAdaptUI.g:628:1: entryRuleServiceFunctionCallOperation : ruleServiceFunctionCallOperation EOF ;
    public final void entryRuleServiceFunctionCallOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:629:1: ( ruleServiceFunctionCallOperation EOF )
            // InternalAdaptUI.g:630:1: ruleServiceFunctionCallOperation EOF
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
    // InternalAdaptUI.g:637:1: ruleServiceFunctionCallOperation : ( ( rule__ServiceFunctionCallOperation__Group__0 ) ) ;
    public final void ruleServiceFunctionCallOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:641:2: ( ( ( rule__ServiceFunctionCallOperation__Group__0 ) ) )
            // InternalAdaptUI.g:642:2: ( ( rule__ServiceFunctionCallOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:642:2: ( ( rule__ServiceFunctionCallOperation__Group__0 ) )
            // InternalAdaptUI.g:643:3: ( rule__ServiceFunctionCallOperation__Group__0 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getGroup()); 
            // InternalAdaptUI.g:644:3: ( rule__ServiceFunctionCallOperation__Group__0 )
            // InternalAdaptUI.g:644:4: rule__ServiceFunctionCallOperation__Group__0
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
    // InternalAdaptUI.g:653:1: entryRuleEditFactOperation : ruleEditFactOperation EOF ;
    public final void entryRuleEditFactOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:654:1: ( ruleEditFactOperation EOF )
            // InternalAdaptUI.g:655:1: ruleEditFactOperation EOF
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
    // InternalAdaptUI.g:662:1: ruleEditFactOperation : ( ( rule__EditFactOperation__Group__0 ) ) ;
    public final void ruleEditFactOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:666:2: ( ( ( rule__EditFactOperation__Group__0 ) ) )
            // InternalAdaptUI.g:667:2: ( ( rule__EditFactOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:667:2: ( ( rule__EditFactOperation__Group__0 ) )
            // InternalAdaptUI.g:668:3: ( rule__EditFactOperation__Group__0 )
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup()); 
            // InternalAdaptUI.g:669:3: ( rule__EditFactOperation__Group__0 )
            // InternalAdaptUI.g:669:4: rule__EditFactOperation__Group__0
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
    // InternalAdaptUI.g:678:1: entryRuleSetDisplayPropertyOperation : ruleSetDisplayPropertyOperation EOF ;
    public final void entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:679:1: ( ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptUI.g:680:1: ruleSetDisplayPropertyOperation EOF
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
    // InternalAdaptUI.g:687:1: ruleSetDisplayPropertyOperation : ( ( rule__SetDisplayPropertyOperation__Group__0 ) ) ;
    public final void ruleSetDisplayPropertyOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:691:2: ( ( ( rule__SetDisplayPropertyOperation__Group__0 ) ) )
            // InternalAdaptUI.g:692:2: ( ( rule__SetDisplayPropertyOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:692:2: ( ( rule__SetDisplayPropertyOperation__Group__0 ) )
            // InternalAdaptUI.g:693:3: ( rule__SetDisplayPropertyOperation__Group__0 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getGroup()); 
            // InternalAdaptUI.g:694:3: ( rule__SetDisplayPropertyOperation__Group__0 )
            // InternalAdaptUI.g:694:4: rule__SetDisplayPropertyOperation__Group__0
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
    // InternalAdaptUI.g:703:1: entryRuleDisplayPropertyValue : ruleDisplayPropertyValue EOF ;
    public final void entryRuleDisplayPropertyValue() throws RecognitionException {
        try {
            // InternalAdaptUI.g:704:1: ( ruleDisplayPropertyValue EOF )
            // InternalAdaptUI.g:705:1: ruleDisplayPropertyValue EOF
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
    // InternalAdaptUI.g:712:1: ruleDisplayPropertyValue : ( ( rule__DisplayPropertyValue__Alternatives ) ) ;
    public final void ruleDisplayPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:716:2: ( ( ( rule__DisplayPropertyValue__Alternatives ) ) )
            // InternalAdaptUI.g:717:2: ( ( rule__DisplayPropertyValue__Alternatives ) )
            {
            // InternalAdaptUI.g:717:2: ( ( rule__DisplayPropertyValue__Alternatives ) )
            // InternalAdaptUI.g:718:3: ( rule__DisplayPropertyValue__Alternatives )
            {
             before(grammarAccess.getDisplayPropertyValueAccess().getAlternatives()); 
            // InternalAdaptUI.g:719:3: ( rule__DisplayPropertyValue__Alternatives )
            // InternalAdaptUI.g:719:4: rule__DisplayPropertyValue__Alternatives
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
    // InternalAdaptUI.g:728:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAdaptUI.g:729:1: ( ruleIntValue EOF )
            // InternalAdaptUI.g:730:1: ruleIntValue EOF
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
    // InternalAdaptUI.g:737:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:741:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalAdaptUI.g:742:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalAdaptUI.g:742:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalAdaptUI.g:743:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalAdaptUI.g:744:3: ( rule__IntValue__ValueAssignment )
            // InternalAdaptUI.g:744:4: rule__IntValue__ValueAssignment
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
    // InternalAdaptUI.g:753:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAdaptUI.g:754:1: ( ruleStringValue EOF )
            // InternalAdaptUI.g:755:1: ruleStringValue EOF
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
    // InternalAdaptUI.g:762:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:766:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalAdaptUI.g:767:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalAdaptUI.g:767:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalAdaptUI.g:768:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalAdaptUI.g:769:3: ( rule__StringValue__ValueAssignment )
            // InternalAdaptUI.g:769:4: rule__StringValue__ValueAssignment
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
    // InternalAdaptUI.g:778:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalAdaptUI.g:779:1: ( ruleBoolValue EOF )
            // InternalAdaptUI.g:780:1: ruleBoolValue EOF
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
    // InternalAdaptUI.g:787:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:791:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalAdaptUI.g:792:2: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalAdaptUI.g:792:2: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalAdaptUI.g:793:3: ( rule__BoolValue__ValueAssignment )
            {
             before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            // InternalAdaptUI.g:794:3: ( rule__BoolValue__ValueAssignment )
            // InternalAdaptUI.g:794:4: rule__BoolValue__ValueAssignment
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
    // InternalAdaptUI.g:803:1: entryRuleTaskChangeOperation : ruleTaskChangeOperation EOF ;
    public final void entryRuleTaskChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:804:1: ( ruleTaskChangeOperation EOF )
            // InternalAdaptUI.g:805:1: ruleTaskChangeOperation EOF
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
    // InternalAdaptUI.g:812:1: ruleTaskChangeOperation : ( ( rule__TaskChangeOperation__Alternatives ) ) ;
    public final void ruleTaskChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:816:2: ( ( ( rule__TaskChangeOperation__Alternatives ) ) )
            // InternalAdaptUI.g:817:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            {
            // InternalAdaptUI.g:817:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            // InternalAdaptUI.g:818:3: ( rule__TaskChangeOperation__Alternatives )
            {
             before(grammarAccess.getTaskChangeOperationAccess().getAlternatives()); 
            // InternalAdaptUI.g:819:3: ( rule__TaskChangeOperation__Alternatives )
            // InternalAdaptUI.g:819:4: rule__TaskChangeOperation__Alternatives
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
    // InternalAdaptUI.g:828:1: entryRuleAddViewComponentOperation : ruleAddViewComponentOperation EOF ;
    public final void entryRuleAddViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:829:1: ( ruleAddViewComponentOperation EOF )
            // InternalAdaptUI.g:830:1: ruleAddViewComponentOperation EOF
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
    // InternalAdaptUI.g:837:1: ruleAddViewComponentOperation : ( ( rule__AddViewComponentOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:841:2: ( ( ( rule__AddViewComponentOperation__Group__0 ) ) )
            // InternalAdaptUI.g:842:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:842:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            // InternalAdaptUI.g:843:3: ( rule__AddViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getGroup()); 
            // InternalAdaptUI.g:844:3: ( rule__AddViewComponentOperation__Group__0 )
            // InternalAdaptUI.g:844:4: rule__AddViewComponentOperation__Group__0
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
    // InternalAdaptUI.g:853:1: entryRuleDeleteViewComponentOperation : ruleDeleteViewComponentOperation EOF ;
    public final void entryRuleDeleteViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:854:1: ( ruleDeleteViewComponentOperation EOF )
            // InternalAdaptUI.g:855:1: ruleDeleteViewComponentOperation EOF
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
    // InternalAdaptUI.g:862:1: ruleDeleteViewComponentOperation : ( ( rule__DeleteViewComponentOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:866:2: ( ( ( rule__DeleteViewComponentOperation__Group__0 ) ) )
            // InternalAdaptUI.g:867:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:867:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            // InternalAdaptUI.g:868:3: ( rule__DeleteViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getGroup()); 
            // InternalAdaptUI.g:869:3: ( rule__DeleteViewComponentOperation__Group__0 )
            // InternalAdaptUI.g:869:4: rule__DeleteViewComponentOperation__Group__0
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
    // InternalAdaptUI.g:878:1: entryRuleAddViewComponentButtonOperation : ruleAddViewComponentButtonOperation EOF ;
    public final void entryRuleAddViewComponentButtonOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:879:1: ( ruleAddViewComponentButtonOperation EOF )
            // InternalAdaptUI.g:880:1: ruleAddViewComponentButtonOperation EOF
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
    // InternalAdaptUI.g:887:1: ruleAddViewComponentButtonOperation : ( ( rule__AddViewComponentButtonOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentButtonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:891:2: ( ( ( rule__AddViewComponentButtonOperation__Group__0 ) ) )
            // InternalAdaptUI.g:892:2: ( ( rule__AddViewComponentButtonOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:892:2: ( ( rule__AddViewComponentButtonOperation__Group__0 ) )
            // InternalAdaptUI.g:893:3: ( rule__AddViewComponentButtonOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getGroup()); 
            // InternalAdaptUI.g:894:3: ( rule__AddViewComponentButtonOperation__Group__0 )
            // InternalAdaptUI.g:894:4: rule__AddViewComponentButtonOperation__Group__0
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
    // InternalAdaptUI.g:903:1: entryRuleDeleteViewComponentButtonOperation : ruleDeleteViewComponentButtonOperation EOF ;
    public final void entryRuleDeleteViewComponentButtonOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:904:1: ( ruleDeleteViewComponentButtonOperation EOF )
            // InternalAdaptUI.g:905:1: ruleDeleteViewComponentButtonOperation EOF
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
    // InternalAdaptUI.g:912:1: ruleDeleteViewComponentButtonOperation : ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentButtonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:916:2: ( ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) ) )
            // InternalAdaptUI.g:917:2: ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:917:2: ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) )
            // InternalAdaptUI.g:918:3: ( rule__DeleteViewComponentButtonOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getGroup()); 
            // InternalAdaptUI.g:919:3: ( rule__DeleteViewComponentButtonOperation__Group__0 )
            // InternalAdaptUI.g:919:4: rule__DeleteViewComponentButtonOperation__Group__0
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
    // InternalAdaptUI.g:928:1: entryRuleViewComponent : ruleViewComponent EOF ;
    public final void entryRuleViewComponent() throws RecognitionException {
        try {
            // InternalAdaptUI.g:929:1: ( ruleViewComponent EOF )
            // InternalAdaptUI.g:930:1: ruleViewComponent EOF
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
    // InternalAdaptUI.g:937:1: ruleViewComponent : ( RULE_ID ) ;
    public final void ruleViewComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:941:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:942:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:942:2: ( RULE_ID )
            // InternalAdaptUI.g:943:3: RULE_ID
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
    // InternalAdaptUI.g:953:1: entryRuleTargetContainer : ruleTargetContainer EOF ;
    public final void entryRuleTargetContainer() throws RecognitionException {
        try {
            // InternalAdaptUI.g:954:1: ( ruleTargetContainer EOF )
            // InternalAdaptUI.g:955:1: ruleTargetContainer EOF
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
    // InternalAdaptUI.g:962:1: ruleTargetContainer : ( RULE_ID ) ;
    public final void ruleTargetContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:966:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:967:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:967:2: ( RULE_ID )
            // InternalAdaptUI.g:968:3: RULE_ID
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
    // InternalAdaptUI.g:978:1: entryRuleNavigationChangeOperation : ruleNavigationChangeOperation EOF ;
    public final void entryRuleNavigationChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:979:1: ( ruleNavigationChangeOperation EOF )
            // InternalAdaptUI.g:980:1: ruleNavigationChangeOperation EOF
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
    // InternalAdaptUI.g:987:1: ruleNavigationChangeOperation : ( ( rule__NavigationChangeOperation__Alternatives ) ) ;
    public final void ruleNavigationChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:991:2: ( ( ( rule__NavigationChangeOperation__Alternatives ) ) )
            // InternalAdaptUI.g:992:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            {
            // InternalAdaptUI.g:992:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            // InternalAdaptUI.g:993:3: ( rule__NavigationChangeOperation__Alternatives )
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getAlternatives()); 
            // InternalAdaptUI.g:994:3: ( rule__NavigationChangeOperation__Alternatives )
            // InternalAdaptUI.g:994:4: rule__NavigationChangeOperation__Alternatives
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
    // InternalAdaptUI.g:1003:1: entryRuleAddNavLinkOperation : ruleAddNavLinkOperation EOF ;
    public final void entryRuleAddNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1004:1: ( ruleAddNavLinkOperation EOF )
            // InternalAdaptUI.g:1005:1: ruleAddNavLinkOperation EOF
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
    // InternalAdaptUI.g:1012:1: ruleAddNavLinkOperation : ( ( rule__AddNavLinkOperation__Group__0 ) ) ;
    public final void ruleAddNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1016:2: ( ( ( rule__AddNavLinkOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1017:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1017:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            // InternalAdaptUI.g:1018:3: ( rule__AddNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1019:3: ( rule__AddNavLinkOperation__Group__0 )
            // InternalAdaptUI.g:1019:4: rule__AddNavLinkOperation__Group__0
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
    // InternalAdaptUI.g:1028:1: entryRuleDeleteNavLinkOperation : ruleDeleteNavLinkOperation EOF ;
    public final void entryRuleDeleteNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1029:1: ( ruleDeleteNavLinkOperation EOF )
            // InternalAdaptUI.g:1030:1: ruleDeleteNavLinkOperation EOF
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
    // InternalAdaptUI.g:1037:1: ruleDeleteNavLinkOperation : ( ( rule__DeleteNavLinkOperation__Group__0 ) ) ;
    public final void ruleDeleteNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1041:2: ( ( ( rule__DeleteNavLinkOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1042:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1042:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            // InternalAdaptUI.g:1043:3: ( rule__DeleteNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1044:3: ( rule__DeleteNavLinkOperation__Group__0 )
            // InternalAdaptUI.g:1044:4: rule__DeleteNavLinkOperation__Group__0
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
    // InternalAdaptUI.g:1053:1: entryRuleRedirectNavLinkOperation : ruleRedirectNavLinkOperation EOF ;
    public final void entryRuleRedirectNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1054:1: ( ruleRedirectNavLinkOperation EOF )
            // InternalAdaptUI.g:1055:1: ruleRedirectNavLinkOperation EOF
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
    // InternalAdaptUI.g:1062:1: ruleRedirectNavLinkOperation : ( ( rule__RedirectNavLinkOperation__Group__0 ) ) ;
    public final void ruleRedirectNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1066:2: ( ( ( rule__RedirectNavLinkOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1067:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1067:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            // InternalAdaptUI.g:1068:3: ( rule__RedirectNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1069:3: ( rule__RedirectNavLinkOperation__Group__0 )
            // InternalAdaptUI.g:1069:4: rule__RedirectNavLinkOperation__Group__0
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
    // InternalAdaptUI.g:1078:1: entryRuleClearNavOperation : ruleClearNavOperation EOF ;
    public final void entryRuleClearNavOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1079:1: ( ruleClearNavOperation EOF )
            // InternalAdaptUI.g:1080:1: ruleClearNavOperation EOF
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
    // InternalAdaptUI.g:1087:1: ruleClearNavOperation : ( ( rule__ClearNavOperation__Group__0 ) ) ;
    public final void ruleClearNavOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1091:2: ( ( ( rule__ClearNavOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1092:2: ( ( rule__ClearNavOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1092:2: ( ( rule__ClearNavOperation__Group__0 ) )
            // InternalAdaptUI.g:1093:3: ( rule__ClearNavOperation__Group__0 )
            {
             before(grammarAccess.getClearNavOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1094:3: ( rule__ClearNavOperation__Group__0 )
            // InternalAdaptUI.g:1094:4: rule__ClearNavOperation__Group__0
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
    // InternalAdaptUI.g:1103:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1104:1: ( ruleText EOF )
            // InternalAdaptUI.g:1105:1: ruleText EOF
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
    // InternalAdaptUI.g:1112:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1116:2: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:1117:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:1117:2: ( RULE_STRING )
            // InternalAdaptUI.g:1118:3: RULE_STRING
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
    // InternalAdaptUI.g:1128:1: entryRuleLayoutChangeOperation : ruleLayoutChangeOperation EOF ;
    public final void entryRuleLayoutChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1129:1: ( ruleLayoutChangeOperation EOF )
            // InternalAdaptUI.g:1130:1: ruleLayoutChangeOperation EOF
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
    // InternalAdaptUI.g:1137:1: ruleLayoutChangeOperation : ( ( rule__LayoutChangeOperation__Alternatives ) ) ;
    public final void ruleLayoutChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1141:2: ( ( ( rule__LayoutChangeOperation__Alternatives ) ) )
            // InternalAdaptUI.g:1142:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            {
            // InternalAdaptUI.g:1142:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            // InternalAdaptUI.g:1143:3: ( rule__LayoutChangeOperation__Alternatives )
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getAlternatives()); 
            // InternalAdaptUI.g:1144:3: ( rule__LayoutChangeOperation__Alternatives )
            // InternalAdaptUI.g:1144:4: rule__LayoutChangeOperation__Alternatives
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
    // InternalAdaptUI.g:1153:1: entryRuleChangeFontSizeOperation : ruleChangeFontSizeOperation EOF ;
    public final void entryRuleChangeFontSizeOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1154:1: ( ruleChangeFontSizeOperation EOF )
            // InternalAdaptUI.g:1155:1: ruleChangeFontSizeOperation EOF
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
    // InternalAdaptUI.g:1162:1: ruleChangeFontSizeOperation : ( ( rule__ChangeFontSizeOperation__Group__0 ) ) ;
    public final void ruleChangeFontSizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1166:2: ( ( ( rule__ChangeFontSizeOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1167:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1167:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            // InternalAdaptUI.g:1168:3: ( rule__ChangeFontSizeOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1169:3: ( rule__ChangeFontSizeOperation__Group__0 )
            // InternalAdaptUI.g:1169:4: rule__ChangeFontSizeOperation__Group__0
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
    // InternalAdaptUI.g:1178:1: entryRuleChangeColorSchemeOperation : ruleChangeColorSchemeOperation EOF ;
    public final void entryRuleChangeColorSchemeOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1179:1: ( ruleChangeColorSchemeOperation EOF )
            // InternalAdaptUI.g:1180:1: ruleChangeColorSchemeOperation EOF
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
    // InternalAdaptUI.g:1187:1: ruleChangeColorSchemeOperation : ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) ;
    public final void ruleChangeColorSchemeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1191:2: ( ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1192:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1192:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            // InternalAdaptUI.g:1193:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1194:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            // InternalAdaptUI.g:1194:4: rule__ChangeColorSchemeOperation__Group__0
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
    // InternalAdaptUI.g:1203:1: entryRuleChangeFontOperation : ruleChangeFontOperation EOF ;
    public final void entryRuleChangeFontOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1204:1: ( ruleChangeFontOperation EOF )
            // InternalAdaptUI.g:1205:1: ruleChangeFontOperation EOF
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
    // InternalAdaptUI.g:1212:1: ruleChangeFontOperation : ( ( rule__ChangeFontOperation__Group__0 ) ) ;
    public final void ruleChangeFontOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1216:2: ( ( ( rule__ChangeFontOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1217:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1217:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            // InternalAdaptUI.g:1218:3: ( rule__ChangeFontOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1219:3: ( rule__ChangeFontOperation__Group__0 )
            // InternalAdaptUI.g:1219:4: rule__ChangeFontOperation__Group__0
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
    // InternalAdaptUI.g:1228:1: entryRuleChangeTableCssClassOperation : ruleChangeTableCssClassOperation EOF ;
    public final void entryRuleChangeTableCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1229:1: ( ruleChangeTableCssClassOperation EOF )
            // InternalAdaptUI.g:1230:1: ruleChangeTableCssClassOperation EOF
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
    // InternalAdaptUI.g:1237:1: ruleChangeTableCssClassOperation : ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) ;
    public final void ruleChangeTableCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1241:2: ( ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1242:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1242:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            // InternalAdaptUI.g:1243:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1244:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            // InternalAdaptUI.g:1244:4: rule__ChangeTableCssClassOperation__Group__0
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
    // InternalAdaptUI.g:1253:1: entryRuleAdaptCssClassOperation : ruleAdaptCssClassOperation EOF ;
    public final void entryRuleAdaptCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1254:1: ( ruleAdaptCssClassOperation EOF )
            // InternalAdaptUI.g:1255:1: ruleAdaptCssClassOperation EOF
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
    // InternalAdaptUI.g:1262:1: ruleAdaptCssClassOperation : ( ( rule__AdaptCssClassOperation__Group__0 ) ) ;
    public final void ruleAdaptCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1266:2: ( ( ( rule__AdaptCssClassOperation__Group__0 ) ) )
            // InternalAdaptUI.g:1267:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            {
            // InternalAdaptUI.g:1267:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            // InternalAdaptUI.g:1268:3: ( rule__AdaptCssClassOperation__Group__0 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getGroup()); 
            // InternalAdaptUI.g:1269:3: ( rule__AdaptCssClassOperation__Group__0 )
            // InternalAdaptUI.g:1269:4: rule__AdaptCssClassOperation__Group__0
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
    // InternalAdaptUI.g:1278:1: entryRuleCssClass : ruleCssClass EOF ;
    public final void entryRuleCssClass() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1279:1: ( ruleCssClass EOF )
            // InternalAdaptUI.g:1280:1: ruleCssClass EOF
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
    // InternalAdaptUI.g:1287:1: ruleCssClass : ( RULE_STRING ) ;
    public final void ruleCssClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1291:2: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:1292:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:1292:2: ( RULE_STRING )
            // InternalAdaptUI.g:1293:3: RULE_STRING
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
    // InternalAdaptUI.g:1303:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1304:1: ( ruleAttribute EOF )
            // InternalAdaptUI.g:1305:1: ruleAttribute EOF
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
    // InternalAdaptUI.g:1312:1: ruleAttribute : ( RULE_STRING ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1316:2: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:1317:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:1317:2: ( RULE_STRING )
            // InternalAdaptUI.g:1318:3: RULE_STRING
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
    // InternalAdaptUI.g:1328:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1329:1: ( ruleAttributeValue EOF )
            // InternalAdaptUI.g:1330:1: ruleAttributeValue EOF
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
    // InternalAdaptUI.g:1337:1: ruleAttributeValue : ( RULE_STRING ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1341:2: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:1342:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:1342:2: ( RULE_STRING )
            // InternalAdaptUI.g:1343:3: RULE_STRING
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
    // InternalAdaptUI.g:1353:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1354:1: ( ruleColor EOF )
            // InternalAdaptUI.g:1355:1: ruleColor EOF
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
    // InternalAdaptUI.g:1362:1: ruleColor : ( RULE_STRING ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1366:2: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:1367:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:1367:2: ( RULE_STRING )
            // InternalAdaptUI.g:1368:3: RULE_STRING
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
    // InternalAdaptUI.g:1378:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1379:1: ( ruleFontSize EOF )
            // InternalAdaptUI.g:1380:1: ruleFontSize EOF
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
    // InternalAdaptUI.g:1387:1: ruleFontSize : ( RULE_INT ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1391:2: ( ( RULE_INT ) )
            // InternalAdaptUI.g:1392:2: ( RULE_INT )
            {
            // InternalAdaptUI.g:1392:2: ( RULE_INT )
            // InternalAdaptUI.g:1393:3: RULE_INT
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
    // InternalAdaptUI.g:1403:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1404:1: ( ruleValue EOF )
            // InternalAdaptUI.g:1405:1: ruleValue EOF
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
    // InternalAdaptUI.g:1412:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1416:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAdaptUI.g:1417:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAdaptUI.g:1417:2: ( ( rule__Value__Alternatives ) )
            // InternalAdaptUI.g:1418:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAdaptUI.g:1419:3: ( rule__Value__Alternatives )
            // InternalAdaptUI.g:1419:4: rule__Value__Alternatives
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
    // InternalAdaptUI.g:1428:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1429:1: ( ruleEntity EOF )
            // InternalAdaptUI.g:1430:1: ruleEntity EOF
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
    // InternalAdaptUI.g:1437:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1441:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAdaptUI.g:1442:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAdaptUI.g:1442:2: ( ( rule__Entity__Group__0 ) )
            // InternalAdaptUI.g:1443:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAdaptUI.g:1444:3: ( rule__Entity__Group__0 )
            // InternalAdaptUI.g:1444:4: rule__Entity__Group__0
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
    // InternalAdaptUI.g:1453:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1454:1: ( ruleProperty EOF )
            // InternalAdaptUI.g:1455:1: ruleProperty EOF
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
    // InternalAdaptUI.g:1462:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1466:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalAdaptUI.g:1467:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalAdaptUI.g:1467:2: ( ( rule__Property__Group__0 ) )
            // InternalAdaptUI.g:1468:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalAdaptUI.g:1469:3: ( rule__Property__Group__0 )
            // InternalAdaptUI.g:1469:4: rule__Property__Group__0
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
    // InternalAdaptUI.g:1478:1: entryRuleProvider : ruleProvider EOF ;
    public final void entryRuleProvider() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1479:1: ( ruleProvider EOF )
            // InternalAdaptUI.g:1480:1: ruleProvider EOF
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
    // InternalAdaptUI.g:1487:1: ruleProvider : ( ( rule__Provider__NameAssignment ) ) ;
    public final void ruleProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1491:2: ( ( ( rule__Provider__NameAssignment ) ) )
            // InternalAdaptUI.g:1492:2: ( ( rule__Provider__NameAssignment ) )
            {
            // InternalAdaptUI.g:1492:2: ( ( rule__Provider__NameAssignment ) )
            // InternalAdaptUI.g:1493:3: ( rule__Provider__NameAssignment )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment()); 
            // InternalAdaptUI.g:1494:3: ( rule__Provider__NameAssignment )
            // InternalAdaptUI.g:1494:4: rule__Provider__NameAssignment
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
    // InternalAdaptUI.g:1503:1: entryRuleDefTypes : ruleDefTypes EOF ;
    public final void entryRuleDefTypes() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1504:1: ( ruleDefTypes EOF )
            // InternalAdaptUI.g:1505:1: ruleDefTypes EOF
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
    // InternalAdaptUI.g:1512:1: ruleDefTypes : ( ( rule__DefTypes__Group__0 ) ) ;
    public final void ruleDefTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1516:2: ( ( ( rule__DefTypes__Group__0 ) ) )
            // InternalAdaptUI.g:1517:2: ( ( rule__DefTypes__Group__0 ) )
            {
            // InternalAdaptUI.g:1517:2: ( ( rule__DefTypes__Group__0 ) )
            // InternalAdaptUI.g:1518:3: ( rule__DefTypes__Group__0 )
            {
             before(grammarAccess.getDefTypesAccess().getGroup()); 
            // InternalAdaptUI.g:1519:3: ( rule__DefTypes__Group__0 )
            // InternalAdaptUI.g:1519:4: rule__DefTypes__Group__0
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
    // InternalAdaptUI.g:1528:1: entryRuleDefType : ruleDefType EOF ;
    public final void entryRuleDefType() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1529:1: ( ruleDefType EOF )
            // InternalAdaptUI.g:1530:1: ruleDefType EOF
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
    // InternalAdaptUI.g:1537:1: ruleDefType : ( ( rule__DefType__Group__0 ) ) ;
    public final void ruleDefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1541:2: ( ( ( rule__DefType__Group__0 ) ) )
            // InternalAdaptUI.g:1542:2: ( ( rule__DefType__Group__0 ) )
            {
            // InternalAdaptUI.g:1542:2: ( ( rule__DefType__Group__0 ) )
            // InternalAdaptUI.g:1543:3: ( rule__DefType__Group__0 )
            {
             before(grammarAccess.getDefTypeAccess().getGroup()); 
            // InternalAdaptUI.g:1544:3: ( rule__DefType__Group__0 )
            // InternalAdaptUI.g:1544:4: rule__DefType__Group__0
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
    // InternalAdaptUI.g:1553:1: entryRuleEnums : ruleEnums EOF ;
    public final void entryRuleEnums() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1554:1: ( ruleEnums EOF )
            // InternalAdaptUI.g:1555:1: ruleEnums EOF
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
    // InternalAdaptUI.g:1562:1: ruleEnums : ( ( rule__Enums__Group__0 ) ) ;
    public final void ruleEnums() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1566:2: ( ( ( rule__Enums__Group__0 ) ) )
            // InternalAdaptUI.g:1567:2: ( ( rule__Enums__Group__0 ) )
            {
            // InternalAdaptUI.g:1567:2: ( ( rule__Enums__Group__0 ) )
            // InternalAdaptUI.g:1568:3: ( rule__Enums__Group__0 )
            {
             before(grammarAccess.getEnumsAccess().getGroup()); 
            // InternalAdaptUI.g:1569:3: ( rule__Enums__Group__0 )
            // InternalAdaptUI.g:1569:4: rule__Enums__Group__0
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
    // InternalAdaptUI.g:1578:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1579:1: ( ruleEnum EOF )
            // InternalAdaptUI.g:1580:1: ruleEnum EOF
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
    // InternalAdaptUI.g:1587:1: ruleEnum : ( ( rule__Enum__NameAssignment ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1591:2: ( ( ( rule__Enum__NameAssignment ) ) )
            // InternalAdaptUI.g:1592:2: ( ( rule__Enum__NameAssignment ) )
            {
            // InternalAdaptUI.g:1592:2: ( ( rule__Enum__NameAssignment ) )
            // InternalAdaptUI.g:1593:3: ( rule__Enum__NameAssignment )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment()); 
            // InternalAdaptUI.g:1594:3: ( rule__Enum__NameAssignment )
            // InternalAdaptUI.g:1594:4: rule__Enum__NameAssignment
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


    // $ANTLR start "entryRuleTYPE"
    // InternalAdaptUI.g:1603:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1604:1: ( ruleTYPE EOF )
            // InternalAdaptUI.g:1605:1: ruleTYPE EOF
            {
             before(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getTYPERule()); 
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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalAdaptUI.g:1612:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1616:2: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalAdaptUI.g:1617:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalAdaptUI.g:1617:2: ( ( rule__TYPE__Alternatives ) )
            // InternalAdaptUI.g:1618:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalAdaptUI.g:1619:3: ( rule__TYPE__Alternatives )
            // InternalAdaptUI.g:1619:4: rule__TYPE__Alternatives
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


    // $ANTLR start "entryRuleUpdateType"
    // InternalAdaptUI.g:1628:1: entryRuleUpdateType : ruleUpdateType EOF ;
    public final void entryRuleUpdateType() throws RecognitionException {
        try {
            // InternalAdaptUI.g:1629:1: ( ruleUpdateType EOF )
            // InternalAdaptUI.g:1630:1: ruleUpdateType EOF
            {
             before(grammarAccess.getUpdateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateType();

            state._fsp--;

             after(grammarAccess.getUpdateTypeRule()); 
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
    // $ANTLR end "entryRuleUpdateType"


    // $ANTLR start "ruleUpdateType"
    // InternalAdaptUI.g:1637:1: ruleUpdateType : ( ( rule__UpdateType__Alternatives ) ) ;
    public final void ruleUpdateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1641:2: ( ( ( rule__UpdateType__Alternatives ) ) )
            // InternalAdaptUI.g:1642:2: ( ( rule__UpdateType__Alternatives ) )
            {
            // InternalAdaptUI.g:1642:2: ( ( rule__UpdateType__Alternatives ) )
            // InternalAdaptUI.g:1643:3: ( rule__UpdateType__Alternatives )
            {
             before(grammarAccess.getUpdateTypeAccess().getAlternatives()); 
            // InternalAdaptUI.g:1644:3: ( rule__UpdateType__Alternatives )
            // InternalAdaptUI.g:1644:4: rule__UpdateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UpdateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUpdateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdateType"


    // $ANTLR start "rule__ConditionalPrimary__Alternatives"
    // InternalAdaptUI.g:1652:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );
    public final void rule__ConditionalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1656:1: ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptUI.g:1657:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1657:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    // InternalAdaptUI.g:1658:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_0()); 
                    // InternalAdaptUI.g:1659:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    // InternalAdaptUI.g:1659:4: rule__ConditionalPrimary__CondAssignment_0
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
                    // InternalAdaptUI.g:1663:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1663:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    // InternalAdaptUI.g:1664:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_1()); 
                    // InternalAdaptUI.g:1665:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    // InternalAdaptUI.g:1665:4: rule__ConditionalPrimary__CondAssignment_1
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
                    // InternalAdaptUI.g:1669:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1669:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    // InternalAdaptUI.g:1670:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_2()); 
                    // InternalAdaptUI.g:1671:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    // InternalAdaptUI.g:1671:4: rule__ConditionalPrimary__CondAssignment_2
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
    // InternalAdaptUI.g:1679:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );
    public final void rule__BooleanCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1683:1: ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptUI.g:1684:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    {
                    // InternalAdaptUI.g:1684:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    // InternalAdaptUI.g:1685:3: ( rule__BooleanCondition__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getGroup_0()); 
                    // InternalAdaptUI.g:1686:3: ( rule__BooleanCondition__Group_0__0 )
                    // InternalAdaptUI.g:1686:4: rule__BooleanCondition__Group_0__0
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
                    // InternalAdaptUI.g:1690:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1690:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    // InternalAdaptUI.g:1691:3: ( rule__BooleanCondition__FactAssignment_1 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getFactAssignment_1()); 
                    // InternalAdaptUI.g:1692:3: ( rule__BooleanCondition__FactAssignment_1 )
                    // InternalAdaptUI.g:1692:4: rule__BooleanCondition__FactAssignment_1
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
    // InternalAdaptUI.g:1700:1: rule__NumberOperators__Alternatives : ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) );
    public final void rule__NumberOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1704:1: ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) )
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
                    // InternalAdaptUI.g:1705:2: ( '>' )
                    {
                    // InternalAdaptUI.g:1705:2: ( '>' )
                    // InternalAdaptUI.g:1706:3: '>'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptUI.g:1711:2: ( '<' )
                    {
                    // InternalAdaptUI.g:1711:2: ( '<' )
                    // InternalAdaptUI.g:1712:3: '<'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptUI.g:1717:2: ( '==' )
                    {
                    // InternalAdaptUI.g:1717:2: ( '==' )
                    // InternalAdaptUI.g:1718:3: '=='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptUI.g:1723:2: ( '!=' )
                    {
                    // InternalAdaptUI.g:1723:2: ( '!=' )
                    // InternalAdaptUI.g:1724:3: '!='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptUI.g:1729:2: ( '>=' )
                    {
                    // InternalAdaptUI.g:1729:2: ( '>=' )
                    // InternalAdaptUI.g:1730:3: '>='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptUI.g:1735:2: ( '<=' )
                    {
                    // InternalAdaptUI.g:1735:2: ( '<=' )
                    // InternalAdaptUI.g:1736:3: '<='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAdaptUI.g:1741:2: ( '===' )
                    {
                    // InternalAdaptUI.g:1741:2: ( '===' )
                    // InternalAdaptUI.g:1742:3: '==='
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
    // InternalAdaptUI.g:1751:1: rule__StringOperators__Alternatives : ( ( '==' ) | ( '!=' ) | ( '===' ) );
    public final void rule__StringOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1755:1: ( ( '==' ) | ( '!=' ) | ( '===' ) )
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
                    // InternalAdaptUI.g:1756:2: ( '==' )
                    {
                    // InternalAdaptUI.g:1756:2: ( '==' )
                    // InternalAdaptUI.g:1757:3: '=='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptUI.g:1762:2: ( '!=' )
                    {
                    // InternalAdaptUI.g:1762:2: ( '!=' )
                    // InternalAdaptUI.g:1763:3: '!='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptUI.g:1768:2: ( '===' )
                    {
                    // InternalAdaptUI.g:1768:2: ( '===' )
                    // InternalAdaptUI.g:1769:3: '==='
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
    // InternalAdaptUI.g:1778:1: rule__BoolOperators__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__BoolOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1782:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalAdaptUI.g:1783:2: ( '==' )
                    {
                    // InternalAdaptUI.g:1783:2: ( '==' )
                    // InternalAdaptUI.g:1784:3: '=='
                    {
                     before(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptUI.g:1789:2: ( '!=' )
                    {
                    // InternalAdaptUI.g:1789:2: ( '!=' )
                    // InternalAdaptUI.g:1790:3: '!='
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
    // InternalAdaptUI.g:1799:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1803:1: ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) )
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
                    // InternalAdaptUI.g:1804:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1804:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    // InternalAdaptUI.g:1805:3: ( rule__Action__ActionCategoryAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_0()); 
                    // InternalAdaptUI.g:1806:3: ( rule__Action__ActionCategoryAssignment_0 )
                    // InternalAdaptUI.g:1806:4: rule__Action__ActionCategoryAssignment_0
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
                    // InternalAdaptUI.g:1810:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1810:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    // InternalAdaptUI.g:1811:3: ( rule__Action__ActionCategoryAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_1()); 
                    // InternalAdaptUI.g:1812:3: ( rule__Action__ActionCategoryAssignment_1 )
                    // InternalAdaptUI.g:1812:4: rule__Action__ActionCategoryAssignment_1
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
                    // InternalAdaptUI.g:1816:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1816:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    // InternalAdaptUI.g:1817:3: ( rule__Action__ActionCategoryAssignment_2 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_2()); 
                    // InternalAdaptUI.g:1818:3: ( rule__Action__ActionCategoryAssignment_2 )
                    // InternalAdaptUI.g:1818:4: rule__Action__ActionCategoryAssignment_2
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
                    // InternalAdaptUI.g:1822:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    {
                    // InternalAdaptUI.g:1822:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    // InternalAdaptUI.g:1823:3: ( rule__Action__ActionCategoryAssignment_3 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_3()); 
                    // InternalAdaptUI.g:1824:3: ( rule__Action__ActionCategoryAssignment_3 )
                    // InternalAdaptUI.g:1824:4: rule__Action__ActionCategoryAssignment_3
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
    // InternalAdaptUI.g:1832:1: rule__ServiceOperation__Alternatives : ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) );
    public final void rule__ServiceOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1836:1: ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) )
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
                    // InternalAdaptUI.g:1837:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1837:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    // InternalAdaptUI.g:1838:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptUI.g:1839:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    // InternalAdaptUI.g:1839:4: rule__ServiceOperation__OperationAssignment_0
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
                    // InternalAdaptUI.g:1843:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1843:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    // InternalAdaptUI.g:1844:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptUI.g:1845:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    // InternalAdaptUI.g:1845:4: rule__ServiceOperation__OperationAssignment_1
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
                    // InternalAdaptUI.g:1849:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1849:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    // InternalAdaptUI.g:1850:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptUI.g:1851:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    // InternalAdaptUI.g:1851:4: rule__ServiceOperation__OperationAssignment_2
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
    // InternalAdaptUI.g:1859:1: rule__DisplayPropertyValue__Alternatives : ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) );
    public final void rule__DisplayPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1863:1: ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) )
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
                    // InternalAdaptUI.g:1864:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1864:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    // InternalAdaptUI.g:1865:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_0()); 
                    // InternalAdaptUI.g:1866:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    // InternalAdaptUI.g:1866:4: rule__DisplayPropertyValue__PropertyClassAssignment_0
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
                    // InternalAdaptUI.g:1870:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1870:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    // InternalAdaptUI.g:1871:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_1()); 
                    // InternalAdaptUI.g:1872:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    // InternalAdaptUI.g:1872:4: rule__DisplayPropertyValue__PropertyClassAssignment_1
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
                    // InternalAdaptUI.g:1876:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1876:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    // InternalAdaptUI.g:1877:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_2()); 
                    // InternalAdaptUI.g:1878:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    // InternalAdaptUI.g:1878:4: rule__DisplayPropertyValue__PropertyClassAssignment_2
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
    // InternalAdaptUI.g:1886:1: rule__TaskChangeOperation__Alternatives : ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__TaskChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1890:1: ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) )
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
                    // InternalAdaptUI.g:1891:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1891:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptUI.g:1892:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptUI.g:1893:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    // InternalAdaptUI.g:1893:4: rule__TaskChangeOperation__OperationAssignment_0
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
                    // InternalAdaptUI.g:1897:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1897:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptUI.g:1898:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptUI.g:1899:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    // InternalAdaptUI.g:1899:4: rule__TaskChangeOperation__OperationAssignment_1
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
                    // InternalAdaptUI.g:1903:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1903:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptUI.g:1904:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptUI.g:1905:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    // InternalAdaptUI.g:1905:4: rule__TaskChangeOperation__OperationAssignment_2
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
                    // InternalAdaptUI.g:1909:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptUI.g:1909:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptUI.g:1910:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptUI.g:1911:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    // InternalAdaptUI.g:1911:4: rule__TaskChangeOperation__OperationAssignment_3
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
    // InternalAdaptUI.g:1919:1: rule__NavigationChangeOperation__Alternatives : ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__NavigationChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1923:1: ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) )
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
                    // InternalAdaptUI.g:1924:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1924:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptUI.g:1925:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptUI.g:1926:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    // InternalAdaptUI.g:1926:4: rule__NavigationChangeOperation__OperationAssignment_0
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
                    // InternalAdaptUI.g:1930:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1930:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptUI.g:1931:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptUI.g:1932:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    // InternalAdaptUI.g:1932:4: rule__NavigationChangeOperation__OperationAssignment_1
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
                    // InternalAdaptUI.g:1936:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1936:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptUI.g:1937:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptUI.g:1938:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    // InternalAdaptUI.g:1938:4: rule__NavigationChangeOperation__OperationAssignment_2
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
                    // InternalAdaptUI.g:1942:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptUI.g:1942:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptUI.g:1943:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptUI.g:1944:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    // InternalAdaptUI.g:1944:4: rule__NavigationChangeOperation__OperationAssignment_3
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
    // InternalAdaptUI.g:1952:1: rule__LayoutChangeOperation__Alternatives : ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) );
    public final void rule__LayoutChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1956:1: ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) )
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
                    // InternalAdaptUI.g:1957:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:1957:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptUI.g:1958:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptUI.g:1959:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    // InternalAdaptUI.g:1959:4: rule__LayoutChangeOperation__OperationAssignment_0
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
                    // InternalAdaptUI.g:1963:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:1963:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptUI.g:1964:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptUI.g:1965:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    // InternalAdaptUI.g:1965:4: rule__LayoutChangeOperation__OperationAssignment_1
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
                    // InternalAdaptUI.g:1969:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:1969:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptUI.g:1970:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptUI.g:1971:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    // InternalAdaptUI.g:1971:4: rule__LayoutChangeOperation__OperationAssignment_2
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
                    // InternalAdaptUI.g:1975:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptUI.g:1975:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptUI.g:1976:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptUI.g:1977:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    // InternalAdaptUI.g:1977:4: rule__LayoutChangeOperation__OperationAssignment_3
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
                    // InternalAdaptUI.g:1981:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    {
                    // InternalAdaptUI.g:1981:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    // InternalAdaptUI.g:1982:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_4()); 
                    // InternalAdaptUI.g:1983:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    // InternalAdaptUI.g:1983:4: rule__LayoutChangeOperation__OperationAssignment_4
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
    // InternalAdaptUI.g:1991:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:1995:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) )
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
                    // InternalAdaptUI.g:1996:2: ( RULE_INT )
                    {
                    // InternalAdaptUI.g:1996:2: ( RULE_INT )
                    // InternalAdaptUI.g:1997:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptUI.g:2002:2: ( RULE_STRING )
                    {
                    // InternalAdaptUI.g:2002:2: ( RULE_STRING )
                    // InternalAdaptUI.g:2003:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptUI.g:2008:2: ( RULE_BOOL )
                    {
                    // InternalAdaptUI.g:2008:2: ( RULE_BOOL )
                    // InternalAdaptUI.g:2009:3: RULE_BOOL
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
    // InternalAdaptUI.g:2018:1: rule__TYPE__Alternatives : ( ( ( rule__TYPE__StringAssignment_0 ) ) | ( ( rule__TYPE__NumberAssignment_1 ) ) | ( ( rule__TYPE__BooleanAssignment_2 ) ) | ( ( rule__TYPE__DeftypeAssignment_3 ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2022:1: ( ( ( rule__TYPE__StringAssignment_0 ) ) | ( ( rule__TYPE__NumberAssignment_1 ) ) | ( ( rule__TYPE__BooleanAssignment_2 ) ) | ( ( rule__TYPE__DeftypeAssignment_3 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt13=1;
                }
                break;
            case 67:
                {
                alt13=2;
                }
                break;
            case 68:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAdaptUI.g:2023:2: ( ( rule__TYPE__StringAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:2023:2: ( ( rule__TYPE__StringAssignment_0 ) )
                    // InternalAdaptUI.g:2024:3: ( rule__TYPE__StringAssignment_0 )
                    {
                     before(grammarAccess.getTYPEAccess().getStringAssignment_0()); 
                    // InternalAdaptUI.g:2025:3: ( rule__TYPE__StringAssignment_0 )
                    // InternalAdaptUI.g:2025:4: rule__TYPE__StringAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE__StringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTYPEAccess().getStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptUI.g:2029:2: ( ( rule__TYPE__NumberAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:2029:2: ( ( rule__TYPE__NumberAssignment_1 ) )
                    // InternalAdaptUI.g:2030:3: ( rule__TYPE__NumberAssignment_1 )
                    {
                     before(grammarAccess.getTYPEAccess().getNumberAssignment_1()); 
                    // InternalAdaptUI.g:2031:3: ( rule__TYPE__NumberAssignment_1 )
                    // InternalAdaptUI.g:2031:4: rule__TYPE__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTYPEAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptUI.g:2035:2: ( ( rule__TYPE__BooleanAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:2035:2: ( ( rule__TYPE__BooleanAssignment_2 ) )
                    // InternalAdaptUI.g:2036:3: ( rule__TYPE__BooleanAssignment_2 )
                    {
                     before(grammarAccess.getTYPEAccess().getBooleanAssignment_2()); 
                    // InternalAdaptUI.g:2037:3: ( rule__TYPE__BooleanAssignment_2 )
                    // InternalAdaptUI.g:2037:4: rule__TYPE__BooleanAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE__BooleanAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTYPEAccess().getBooleanAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptUI.g:2041:2: ( ( rule__TYPE__DeftypeAssignment_3 ) )
                    {
                    // InternalAdaptUI.g:2041:2: ( ( rule__TYPE__DeftypeAssignment_3 ) )
                    // InternalAdaptUI.g:2042:3: ( rule__TYPE__DeftypeAssignment_3 )
                    {
                     before(grammarAccess.getTYPEAccess().getDeftypeAssignment_3()); 
                    // InternalAdaptUI.g:2043:3: ( rule__TYPE__DeftypeAssignment_3 )
                    // InternalAdaptUI.g:2043:4: rule__TYPE__DeftypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE__DeftypeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTYPEAccess().getDeftypeAssignment_3()); 

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


    // $ANTLR start "rule__UpdateType__Alternatives"
    // InternalAdaptUI.g:2051:1: rule__UpdateType__Alternatives : ( ( ( rule__UpdateType__EventAssignment_0 ) ) | ( ( rule__UpdateType__SlowAssignment_1 ) ) | ( ( rule__UpdateType__FastAssignment_2 ) ) );
    public final void rule__UpdateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2055:1: ( ( ( rule__UpdateType__EventAssignment_0 ) ) | ( ( rule__UpdateType__SlowAssignment_1 ) ) | ( ( rule__UpdateType__FastAssignment_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt14=1;
                }
                break;
            case 70:
                {
                alt14=2;
                }
                break;
            case 71:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAdaptUI.g:2056:2: ( ( rule__UpdateType__EventAssignment_0 ) )
                    {
                    // InternalAdaptUI.g:2056:2: ( ( rule__UpdateType__EventAssignment_0 ) )
                    // InternalAdaptUI.g:2057:3: ( rule__UpdateType__EventAssignment_0 )
                    {
                     before(grammarAccess.getUpdateTypeAccess().getEventAssignment_0()); 
                    // InternalAdaptUI.g:2058:3: ( rule__UpdateType__EventAssignment_0 )
                    // InternalAdaptUI.g:2058:4: rule__UpdateType__EventAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateType__EventAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateTypeAccess().getEventAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptUI.g:2062:2: ( ( rule__UpdateType__SlowAssignment_1 ) )
                    {
                    // InternalAdaptUI.g:2062:2: ( ( rule__UpdateType__SlowAssignment_1 ) )
                    // InternalAdaptUI.g:2063:3: ( rule__UpdateType__SlowAssignment_1 )
                    {
                     before(grammarAccess.getUpdateTypeAccess().getSlowAssignment_1()); 
                    // InternalAdaptUI.g:2064:3: ( rule__UpdateType__SlowAssignment_1 )
                    // InternalAdaptUI.g:2064:4: rule__UpdateType__SlowAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateType__SlowAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateTypeAccess().getSlowAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptUI.g:2068:2: ( ( rule__UpdateType__FastAssignment_2 ) )
                    {
                    // InternalAdaptUI.g:2068:2: ( ( rule__UpdateType__FastAssignment_2 ) )
                    // InternalAdaptUI.g:2069:3: ( rule__UpdateType__FastAssignment_2 )
                    {
                     before(grammarAccess.getUpdateTypeAccess().getFastAssignment_2()); 
                    // InternalAdaptUI.g:2070:3: ( rule__UpdateType__FastAssignment_2 )
                    // InternalAdaptUI.g:2070:4: rule__UpdateType__FastAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateType__FastAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUpdateTypeAccess().getFastAssignment_2()); 

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
    // $ANTLR end "rule__UpdateType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAdaptUI.g:2078:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2082:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptUI.g:2083:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAdaptUI.g:2090:1: rule__Model__Group__0__Impl : ( ( rule__Model__ContextModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2094:1: ( ( ( rule__Model__ContextModelAssignment_0 ) ) )
            // InternalAdaptUI.g:2095:1: ( ( rule__Model__ContextModelAssignment_0 ) )
            {
            // InternalAdaptUI.g:2095:1: ( ( rule__Model__ContextModelAssignment_0 ) )
            // InternalAdaptUI.g:2096:2: ( rule__Model__ContextModelAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getContextModelAssignment_0()); 
            // InternalAdaptUI.g:2097:2: ( rule__Model__ContextModelAssignment_0 )
            // InternalAdaptUI.g:2097:3: rule__Model__ContextModelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ContextModelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getContextModelAssignment_0()); 

            }


            }

        }
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
    // InternalAdaptUI.g:2105:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2109:1: ( rule__Model__Group__1__Impl )
            // InternalAdaptUI.g:2110:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptUI.g:2116:1: rule__Model__Group__1__Impl : ( ( rule__Model__AdaptationModelAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2120:1: ( ( ( rule__Model__AdaptationModelAssignment_1 ) ) )
            // InternalAdaptUI.g:2121:1: ( ( rule__Model__AdaptationModelAssignment_1 ) )
            {
            // InternalAdaptUI.g:2121:1: ( ( rule__Model__AdaptationModelAssignment_1 ) )
            // InternalAdaptUI.g:2122:2: ( rule__Model__AdaptationModelAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAdaptationModelAssignment_1()); 
            // InternalAdaptUI.g:2123:2: ( rule__Model__AdaptationModelAssignment_1 )
            // InternalAdaptUI.g:2123:3: rule__Model__AdaptationModelAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__AdaptationModelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAdaptationModelAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContextModel__Group__0"
    // InternalAdaptUI.g:2132:1: rule__ContextModel__Group__0 : rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 ;
    public final void rule__ContextModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2136:1: ( rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 )
            // InternalAdaptUI.g:2137:2: rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContextModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__0"


    // $ANTLR start "rule__ContextModel__Group__0__Impl"
    // InternalAdaptUI.g:2144:1: rule__ContextModel__Group__0__Impl : ( 'ContextModel{' ) ;
    public final void rule__ContextModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2148:1: ( ( 'ContextModel{' ) )
            // InternalAdaptUI.g:2149:1: ( 'ContextModel{' )
            {
            // InternalAdaptUI.g:2149:1: ( 'ContextModel{' )
            // InternalAdaptUI.g:2150:2: 'ContextModel{'
            {
             before(grammarAccess.getContextModelAccess().getContextModelKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getContextModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__0__Impl"


    // $ANTLR start "rule__ContextModel__Group__1"
    // InternalAdaptUI.g:2159:1: rule__ContextModel__Group__1 : rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 ;
    public final void rule__ContextModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2163:1: ( rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 )
            // InternalAdaptUI.g:2164:2: rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ContextModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__1"


    // $ANTLR start "rule__ContextModel__Group__1__Impl"
    // InternalAdaptUI.g:2171:1: rule__ContextModel__Group__1__Impl : ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) ) ;
    public final void rule__ContextModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2175:1: ( ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) ) )
            // InternalAdaptUI.g:2176:1: ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) )
            {
            // InternalAdaptUI.g:2176:1: ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) )
            // InternalAdaptUI.g:2177:2: ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* )
            {
            // InternalAdaptUI.g:2177:2: ( ( rule__ContextModel__EntityAssignment_1 ) )
            // InternalAdaptUI.g:2178:3: ( rule__ContextModel__EntityAssignment_1 )
            {
             before(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 
            // InternalAdaptUI.g:2179:3: ( rule__ContextModel__EntityAssignment_1 )
            // InternalAdaptUI.g:2179:4: rule__ContextModel__EntityAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__ContextModel__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 

            }

            // InternalAdaptUI.g:2182:2: ( ( rule__ContextModel__EntityAssignment_1 )* )
            // InternalAdaptUI.g:2183:3: ( rule__ContextModel__EntityAssignment_1 )*
            {
             before(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 
            // InternalAdaptUI.g:2184:3: ( rule__ContextModel__EntityAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==61) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdaptUI.g:2184:4: rule__ContextModel__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ContextModel__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__ContextModel__Group__1__Impl"


    // $ANTLR start "rule__ContextModel__Group__2"
    // InternalAdaptUI.g:2193:1: rule__ContextModel__Group__2 : rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 ;
    public final void rule__ContextModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2197:1: ( rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 )
            // InternalAdaptUI.g:2198:2: rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ContextModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__2"


    // $ANTLR start "rule__ContextModel__Group__2__Impl"
    // InternalAdaptUI.g:2205:1: rule__ContextModel__Group__2__Impl : ( ( rule__ContextModel__Group_2__0 )? ) ;
    public final void rule__ContextModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2209:1: ( ( ( rule__ContextModel__Group_2__0 )? ) )
            // InternalAdaptUI.g:2210:1: ( ( rule__ContextModel__Group_2__0 )? )
            {
            // InternalAdaptUI.g:2210:1: ( ( rule__ContextModel__Group_2__0 )? )
            // InternalAdaptUI.g:2211:2: ( rule__ContextModel__Group_2__0 )?
            {
             before(grammarAccess.getContextModelAccess().getGroup_2()); 
            // InternalAdaptUI.g:2212:2: ( rule__ContextModel__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptUI.g:2212:3: rule__ContextModel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__2__Impl"


    // $ANTLR start "rule__ContextModel__Group__3"
    // InternalAdaptUI.g:2220:1: rule__ContextModel__Group__3 : rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 ;
    public final void rule__ContextModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2224:1: ( rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 )
            // InternalAdaptUI.g:2225:2: rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ContextModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__3"


    // $ANTLR start "rule__ContextModel__Group__3__Impl"
    // InternalAdaptUI.g:2232:1: rule__ContextModel__Group__3__Impl : ( ( rule__ContextModel__Group_3__0 )? ) ;
    public final void rule__ContextModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2236:1: ( ( ( rule__ContextModel__Group_3__0 )? ) )
            // InternalAdaptUI.g:2237:1: ( ( rule__ContextModel__Group_3__0 )? )
            {
            // InternalAdaptUI.g:2237:1: ( ( rule__ContextModel__Group_3__0 )? )
            // InternalAdaptUI.g:2238:2: ( rule__ContextModel__Group_3__0 )?
            {
             before(grammarAccess.getContextModelAccess().getGroup_3()); 
            // InternalAdaptUI.g:2239:2: ( rule__ContextModel__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdaptUI.g:2239:3: rule__ContextModel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextModelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__3__Impl"


    // $ANTLR start "rule__ContextModel__Group__4"
    // InternalAdaptUI.g:2247:1: rule__ContextModel__Group__4 : rule__ContextModel__Group__4__Impl ;
    public final void rule__ContextModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2251:1: ( rule__ContextModel__Group__4__Impl )
            // InternalAdaptUI.g:2252:2: rule__ContextModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__4"


    // $ANTLR start "rule__ContextModel__Group__4__Impl"
    // InternalAdaptUI.g:2258:1: rule__ContextModel__Group__4__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2262:1: ( ( '};' ) )
            // InternalAdaptUI.g:2263:1: ( '};' )
            {
            // InternalAdaptUI.g:2263:1: ( '};' )
            // InternalAdaptUI.g:2264:2: '};'
            {
             before(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group__4__Impl"


    // $ANTLR start "rule__ContextModel__Group_2__0"
    // InternalAdaptUI.g:2274:1: rule__ContextModel__Group_2__0 : rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1 ;
    public final void rule__ContextModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2278:1: ( rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1 )
            // InternalAdaptUI.g:2279:2: rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ContextModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2__0"


    // $ANTLR start "rule__ContextModel__Group_2__0__Impl"
    // InternalAdaptUI.g:2286:1: rule__ContextModel__Group_2__0__Impl : ( 'Providers{' ) ;
    public final void rule__ContextModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2290:1: ( ( 'Providers{' ) )
            // InternalAdaptUI.g:2291:1: ( 'Providers{' )
            {
            // InternalAdaptUI.g:2291:1: ( 'Providers{' )
            // InternalAdaptUI.g:2292:2: 'Providers{'
            {
             before(grammarAccess.getContextModelAccess().getProvidersKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getProvidersKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2__0__Impl"


    // $ANTLR start "rule__ContextModel__Group_2__1"
    // InternalAdaptUI.g:2301:1: rule__ContextModel__Group_2__1 : rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2 ;
    public final void rule__ContextModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2305:1: ( rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2 )
            // InternalAdaptUI.g:2306:2: rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__ContextModel__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2__1"


    // $ANTLR start "rule__ContextModel__Group_2__1__Impl"
    // InternalAdaptUI.g:2313:1: rule__ContextModel__Group_2__1__Impl : ( ( rule__ContextModel__Group_2_1__0 )* ) ;
    public final void rule__ContextModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2317:1: ( ( ( rule__ContextModel__Group_2_1__0 )* ) )
            // InternalAdaptUI.g:2318:1: ( ( rule__ContextModel__Group_2_1__0 )* )
            {
            // InternalAdaptUI.g:2318:1: ( ( rule__ContextModel__Group_2_1__0 )* )
            // InternalAdaptUI.g:2319:2: ( rule__ContextModel__Group_2_1__0 )*
            {
             before(grammarAccess.getContextModelAccess().getGroup_2_1()); 
            // InternalAdaptUI.g:2320:2: ( rule__ContextModel__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAdaptUI.g:2320:3: rule__ContextModel__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ContextModel__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2__1__Impl"


    // $ANTLR start "rule__ContextModel__Group_2__2"
    // InternalAdaptUI.g:2328:1: rule__ContextModel__Group_2__2 : rule__ContextModel__Group_2__2__Impl ;
    public final void rule__ContextModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2332:1: ( rule__ContextModel__Group_2__2__Impl )
            // InternalAdaptUI.g:2333:2: rule__ContextModel__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2__2"


    // $ANTLR start "rule__ContextModel__Group_2__2__Impl"
    // InternalAdaptUI.g:2339:1: rule__ContextModel__Group_2__2__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2343:1: ( ( '};' ) )
            // InternalAdaptUI.g:2344:1: ( '};' )
            {
            // InternalAdaptUI.g:2344:1: ( '};' )
            // InternalAdaptUI.g:2345:2: '};'
            {
             before(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2__2__Impl"


    // $ANTLR start "rule__ContextModel__Group_2_1__0"
    // InternalAdaptUI.g:2355:1: rule__ContextModel__Group_2_1__0 : rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1 ;
    public final void rule__ContextModel__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2359:1: ( rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1 )
            // InternalAdaptUI.g:2360:2: rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ContextModel__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2_1__0"


    // $ANTLR start "rule__ContextModel__Group_2_1__0__Impl"
    // InternalAdaptUI.g:2367:1: rule__ContextModel__Group_2_1__0__Impl : ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) ) ;
    public final void rule__ContextModel__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2371:1: ( ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) ) )
            // InternalAdaptUI.g:2372:1: ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) )
            {
            // InternalAdaptUI.g:2372:1: ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) )
            // InternalAdaptUI.g:2373:2: ( rule__ContextModel__ProviderAssignment_2_1_0 )
            {
             before(grammarAccess.getContextModelAccess().getProviderAssignment_2_1_0()); 
            // InternalAdaptUI.g:2374:2: ( rule__ContextModel__ProviderAssignment_2_1_0 )
            // InternalAdaptUI.g:2374:3: rule__ContextModel__ProviderAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__ProviderAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getProviderAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2_1__0__Impl"


    // $ANTLR start "rule__ContextModel__Group_2_1__1"
    // InternalAdaptUI.g:2382:1: rule__ContextModel__Group_2_1__1 : rule__ContextModel__Group_2_1__1__Impl ;
    public final void rule__ContextModel__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2386:1: ( rule__ContextModel__Group_2_1__1__Impl )
            // InternalAdaptUI.g:2387:2: rule__ContextModel__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2_1__1"


    // $ANTLR start "rule__ContextModel__Group_2_1__1__Impl"
    // InternalAdaptUI.g:2393:1: rule__ContextModel__Group_2_1__1__Impl : ( ';' ) ;
    public final void rule__ContextModel__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2397:1: ( ( ';' ) )
            // InternalAdaptUI.g:2398:1: ( ';' )
            {
            // InternalAdaptUI.g:2398:1: ( ';' )
            // InternalAdaptUI.g:2399:2: ';'
            {
             before(grammarAccess.getContextModelAccess().getSemicolonKeyword_2_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getSemicolonKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_2_1__1__Impl"


    // $ANTLR start "rule__ContextModel__Group_3__0"
    // InternalAdaptUI.g:2409:1: rule__ContextModel__Group_3__0 : rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1 ;
    public final void rule__ContextModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2413:1: ( rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1 )
            // InternalAdaptUI.g:2414:2: rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ContextModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_3__0"


    // $ANTLR start "rule__ContextModel__Group_3__0__Impl"
    // InternalAdaptUI.g:2421:1: rule__ContextModel__Group_3__0__Impl : ( 'DefTypes{' ) ;
    public final void rule__ContextModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2425:1: ( ( 'DefTypes{' ) )
            // InternalAdaptUI.g:2426:1: ( 'DefTypes{' )
            {
            // InternalAdaptUI.g:2426:1: ( 'DefTypes{' )
            // InternalAdaptUI.g:2427:2: 'DefTypes{'
            {
             before(grammarAccess.getContextModelAccess().getDefTypesKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getDefTypesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_3__0__Impl"


    // $ANTLR start "rule__ContextModel__Group_3__1"
    // InternalAdaptUI.g:2436:1: rule__ContextModel__Group_3__1 : rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2 ;
    public final void rule__ContextModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2440:1: ( rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2 )
            // InternalAdaptUI.g:2441:2: rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__ContextModel__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_3__1"


    // $ANTLR start "rule__ContextModel__Group_3__1__Impl"
    // InternalAdaptUI.g:2448:1: rule__ContextModel__Group_3__1__Impl : ( ( rule__ContextModel__TypesAssignment_3_1 ) ) ;
    public final void rule__ContextModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2452:1: ( ( ( rule__ContextModel__TypesAssignment_3_1 ) ) )
            // InternalAdaptUI.g:2453:1: ( ( rule__ContextModel__TypesAssignment_3_1 ) )
            {
            // InternalAdaptUI.g:2453:1: ( ( rule__ContextModel__TypesAssignment_3_1 ) )
            // InternalAdaptUI.g:2454:2: ( rule__ContextModel__TypesAssignment_3_1 )
            {
             before(grammarAccess.getContextModelAccess().getTypesAssignment_3_1()); 
            // InternalAdaptUI.g:2455:2: ( rule__ContextModel__TypesAssignment_3_1 )
            // InternalAdaptUI.g:2455:3: rule__ContextModel__TypesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__TypesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getTypesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_3__1__Impl"


    // $ANTLR start "rule__ContextModel__Group_3__2"
    // InternalAdaptUI.g:2463:1: rule__ContextModel__Group_3__2 : rule__ContextModel__Group_3__2__Impl ;
    public final void rule__ContextModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2467:1: ( rule__ContextModel__Group_3__2__Impl )
            // InternalAdaptUI.g:2468:2: rule__ContextModel__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_3__2"


    // $ANTLR start "rule__ContextModel__Group_3__2__Impl"
    // InternalAdaptUI.g:2474:1: rule__ContextModel__Group_3__2__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2478:1: ( ( '};' ) )
            // InternalAdaptUI.g:2479:1: ( '};' )
            {
            // InternalAdaptUI.g:2479:1: ( '};' )
            // InternalAdaptUI.g:2480:2: '};'
            {
             before(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_3__2__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__0"
    // InternalAdaptUI.g:2490:1: rule__AdaptationModel__Group__0 : rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 ;
    public final void rule__AdaptationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2494:1: ( rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 )
            // InternalAdaptUI.g:2495:2: rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AdaptationModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__0"


    // $ANTLR start "rule__AdaptationModel__Group__0__Impl"
    // InternalAdaptUI.g:2502:1: rule__AdaptationModel__Group__0__Impl : ( 'AdaptationModel{' ) ;
    public final void rule__AdaptationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2506:1: ( ( 'AdaptationModel{' ) )
            // InternalAdaptUI.g:2507:1: ( 'AdaptationModel{' )
            {
            // InternalAdaptUI.g:2507:1: ( 'AdaptationModel{' )
            // InternalAdaptUI.g:2508:2: 'AdaptationModel{'
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationModelKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAdaptationModelAccess().getAdaptationModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__0__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__1"
    // InternalAdaptUI.g:2517:1: rule__AdaptationModel__Group__1 : rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2 ;
    public final void rule__AdaptationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2521:1: ( rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2 )
            // InternalAdaptUI.g:2522:2: rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AdaptationModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__1"


    // $ANTLR start "rule__AdaptationModel__Group__1__Impl"
    // InternalAdaptUI.g:2529:1: rule__AdaptationModel__Group__1__Impl : ( ( rule__AdaptationModel__ServicesAssignment_1 )? ) ;
    public final void rule__AdaptationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2533:1: ( ( ( rule__AdaptationModel__ServicesAssignment_1 )? ) )
            // InternalAdaptUI.g:2534:1: ( ( rule__AdaptationModel__ServicesAssignment_1 )? )
            {
            // InternalAdaptUI.g:2534:1: ( ( rule__AdaptationModel__ServicesAssignment_1 )? )
            // InternalAdaptUI.g:2535:2: ( rule__AdaptationModel__ServicesAssignment_1 )?
            {
             before(grammarAccess.getAdaptationModelAccess().getServicesAssignment_1()); 
            // InternalAdaptUI.g:2536:2: ( rule__AdaptationModel__ServicesAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptUI.g:2536:3: rule__AdaptationModel__ServicesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdaptationModel__ServicesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAdaptationModelAccess().getServicesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__1__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__2"
    // InternalAdaptUI.g:2544:1: rule__AdaptationModel__Group__2 : rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3 ;
    public final void rule__AdaptationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2548:1: ( rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3 )
            // InternalAdaptUI.g:2549:2: rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__AdaptationModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__2"


    // $ANTLR start "rule__AdaptationModel__Group__2__Impl"
    // InternalAdaptUI.g:2556:1: rule__AdaptationModel__Group__2__Impl : ( 'flow' ) ;
    public final void rule__AdaptationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2560:1: ( ( 'flow' ) )
            // InternalAdaptUI.g:2561:1: ( 'flow' )
            {
            // InternalAdaptUI.g:2561:1: ( 'flow' )
            // InternalAdaptUI.g:2562:2: 'flow'
            {
             before(grammarAccess.getAdaptationModelAccess().getFlowKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdaptationModelAccess().getFlowKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__2__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__3"
    // InternalAdaptUI.g:2571:1: rule__AdaptationModel__Group__3 : rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4 ;
    public final void rule__AdaptationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2575:1: ( rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4 )
            // InternalAdaptUI.g:2576:2: rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__AdaptationModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__3"


    // $ANTLR start "rule__AdaptationModel__Group__3__Impl"
    // InternalAdaptUI.g:2583:1: rule__AdaptationModel__Group__3__Impl : ( ( rule__AdaptationModel__FlowNameAssignment_3 ) ) ;
    public final void rule__AdaptationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2587:1: ( ( ( rule__AdaptationModel__FlowNameAssignment_3 ) ) )
            // InternalAdaptUI.g:2588:1: ( ( rule__AdaptationModel__FlowNameAssignment_3 ) )
            {
            // InternalAdaptUI.g:2588:1: ( ( rule__AdaptationModel__FlowNameAssignment_3 ) )
            // InternalAdaptUI.g:2589:2: ( rule__AdaptationModel__FlowNameAssignment_3 )
            {
             before(grammarAccess.getAdaptationModelAccess().getFlowNameAssignment_3()); 
            // InternalAdaptUI.g:2590:2: ( rule__AdaptationModel__FlowNameAssignment_3 )
            // InternalAdaptUI.g:2590:3: rule__AdaptationModel__FlowNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationModel__FlowNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationModelAccess().getFlowNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__3__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__4"
    // InternalAdaptUI.g:2598:1: rule__AdaptationModel__Group__4 : rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5 ;
    public final void rule__AdaptationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2602:1: ( rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5 )
            // InternalAdaptUI.g:2603:2: rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__AdaptationModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__4"


    // $ANTLR start "rule__AdaptationModel__Group__4__Impl"
    // InternalAdaptUI.g:2610:1: rule__AdaptationModel__Group__4__Impl : ( '{' ) ;
    public final void rule__AdaptationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2614:1: ( ( '{' ) )
            // InternalAdaptUI.g:2615:1: ( '{' )
            {
            // InternalAdaptUI.g:2615:1: ( '{' )
            // InternalAdaptUI.g:2616:2: '{'
            {
             before(grammarAccess.getAdaptationModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAdaptationModelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__4__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__5"
    // InternalAdaptUI.g:2625:1: rule__AdaptationModel__Group__5 : rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6 ;
    public final void rule__AdaptationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2629:1: ( rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6 )
            // InternalAdaptUI.g:2630:2: rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__AdaptationModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__5"


    // $ANTLR start "rule__AdaptationModel__Group__5__Impl"
    // InternalAdaptUI.g:2637:1: rule__AdaptationModel__Group__5__Impl : ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) ) ;
    public final void rule__AdaptationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2641:1: ( ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) ) )
            // InternalAdaptUI.g:2642:1: ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) )
            {
            // InternalAdaptUI.g:2642:1: ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) )
            // InternalAdaptUI.g:2643:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* )
            {
            // InternalAdaptUI.g:2643:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) )
            // InternalAdaptUI.g:2644:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 
            // InternalAdaptUI.g:2645:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )
            // InternalAdaptUI.g:2645:4: rule__AdaptationModel__AdaptationRulesAssignment_5
            {
            pushFollow(FOLLOW_16);
            rule__AdaptationModel__AdaptationRulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 

            }

            // InternalAdaptUI.g:2648:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* )
            // InternalAdaptUI.g:2649:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 
            // InternalAdaptUI.g:2650:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAdaptUI.g:2650:4: rule__AdaptationModel__AdaptationRulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AdaptationModel__AdaptationRulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 

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
    // $ANTLR end "rule__AdaptationModel__Group__5__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__6"
    // InternalAdaptUI.g:2659:1: rule__AdaptationModel__Group__6 : rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7 ;
    public final void rule__AdaptationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2663:1: ( rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7 )
            // InternalAdaptUI.g:2664:2: rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__AdaptationModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__6"


    // $ANTLR start "rule__AdaptationModel__Group__6__Impl"
    // InternalAdaptUI.g:2671:1: rule__AdaptationModel__Group__6__Impl : ( '};' ) ;
    public final void rule__AdaptationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2675:1: ( ( '};' ) )
            // InternalAdaptUI.g:2676:1: ( '};' )
            {
            // InternalAdaptUI.g:2676:1: ( '};' )
            // InternalAdaptUI.g:2677:2: '};'
            {
             before(grammarAccess.getAdaptationModelAccess().getRightCurlyBracketSemicolonKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAdaptationModelAccess().getRightCurlyBracketSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__6__Impl"


    // $ANTLR start "rule__AdaptationModel__Group__7"
    // InternalAdaptUI.g:2686:1: rule__AdaptationModel__Group__7 : rule__AdaptationModel__Group__7__Impl ;
    public final void rule__AdaptationModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2690:1: ( rule__AdaptationModel__Group__7__Impl )
            // InternalAdaptUI.g:2691:2: rule__AdaptationModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__7"


    // $ANTLR start "rule__AdaptationModel__Group__7__Impl"
    // InternalAdaptUI.g:2697:1: rule__AdaptationModel__Group__7__Impl : ( '};' ) ;
    public final void rule__AdaptationModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2701:1: ( ( '};' ) )
            // InternalAdaptUI.g:2702:1: ( '};' )
            {
            // InternalAdaptUI.g:2702:1: ( '};' )
            // InternalAdaptUI.g:2703:2: '};'
            {
             before(grammarAccess.getAdaptationModelAccess().getRightCurlyBracketSemicolonKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAdaptationModelAccess().getRightCurlyBracketSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__Group__7__Impl"


    // $ANTLR start "rule__Services__Group__0"
    // InternalAdaptUI.g:2713:1: rule__Services__Group__0 : rule__Services__Group__0__Impl rule__Services__Group__1 ;
    public final void rule__Services__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2717:1: ( rule__Services__Group__0__Impl rule__Services__Group__1 )
            // InternalAdaptUI.g:2718:2: rule__Services__Group__0__Impl rule__Services__Group__1
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
    // InternalAdaptUI.g:2725:1: rule__Services__Group__0__Impl : ( ( rule__Services__ThisAssignment_0 ) ) ;
    public final void rule__Services__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2729:1: ( ( ( rule__Services__ThisAssignment_0 ) ) )
            // InternalAdaptUI.g:2730:1: ( ( rule__Services__ThisAssignment_0 ) )
            {
            // InternalAdaptUI.g:2730:1: ( ( rule__Services__ThisAssignment_0 ) )
            // InternalAdaptUI.g:2731:2: ( rule__Services__ThisAssignment_0 )
            {
             before(grammarAccess.getServicesAccess().getThisAssignment_0()); 
            // InternalAdaptUI.g:2732:2: ( rule__Services__ThisAssignment_0 )
            // InternalAdaptUI.g:2732:3: rule__Services__ThisAssignment_0
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
    // InternalAdaptUI.g:2740:1: rule__Services__Group__1 : rule__Services__Group__1__Impl ;
    public final void rule__Services__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2744:1: ( rule__Services__Group__1__Impl )
            // InternalAdaptUI.g:2745:2: rule__Services__Group__1__Impl
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
    // InternalAdaptUI.g:2751:1: rule__Services__Group__1__Impl : ( ( rule__Services__NextAssignment_1 )? ) ;
    public final void rule__Services__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2755:1: ( ( ( rule__Services__NextAssignment_1 )? ) )
            // InternalAdaptUI.g:2756:1: ( ( rule__Services__NextAssignment_1 )? )
            {
            // InternalAdaptUI.g:2756:1: ( ( rule__Services__NextAssignment_1 )? )
            // InternalAdaptUI.g:2757:2: ( rule__Services__NextAssignment_1 )?
            {
             before(grammarAccess.getServicesAccess().getNextAssignment_1()); 
            // InternalAdaptUI.g:2758:2: ( rule__Services__NextAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdaptUI.g:2758:3: rule__Services__NextAssignment_1
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
    // InternalAdaptUI.g:2767:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2771:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAdaptUI.g:2772:2: rule__Service__Group__0__Impl rule__Service__Group__1
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
    // InternalAdaptUI.g:2779:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2783:1: ( ( 'service' ) )
            // InternalAdaptUI.g:2784:1: ( 'service' )
            {
            // InternalAdaptUI.g:2784:1: ( 'service' )
            // InternalAdaptUI.g:2785:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdaptUI.g:2794:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2798:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAdaptUI.g:2799:2: rule__Service__Group__1__Impl rule__Service__Group__2
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
    // InternalAdaptUI.g:2806:1: rule__Service__Group__1__Impl : ( ( rule__Service__TypeAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2810:1: ( ( ( rule__Service__TypeAssignment_1 ) ) )
            // InternalAdaptUI.g:2811:1: ( ( rule__Service__TypeAssignment_1 ) )
            {
            // InternalAdaptUI.g:2811:1: ( ( rule__Service__TypeAssignment_1 ) )
            // InternalAdaptUI.g:2812:2: ( rule__Service__TypeAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_1()); 
            // InternalAdaptUI.g:2813:2: ( rule__Service__TypeAssignment_1 )
            // InternalAdaptUI.g:2813:3: rule__Service__TypeAssignment_1
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
    // InternalAdaptUI.g:2821:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2825:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAdaptUI.g:2826:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:2833:1: rule__Service__Group__2__Impl : ( 'from' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2837:1: ( ( 'from' ) )
            // InternalAdaptUI.g:2838:1: ( 'from' )
            {
            // InternalAdaptUI.g:2838:1: ( 'from' )
            // InternalAdaptUI.g:2839:2: 'from'
            {
             before(grammarAccess.getServiceAccess().getFromKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAdaptUI.g:2848:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2852:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAdaptUI.g:2853:2: rule__Service__Group__3__Impl rule__Service__Group__4
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
    // InternalAdaptUI.g:2860:1: rule__Service__Group__3__Impl : ( ( rule__Service__LocAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2864:1: ( ( ( rule__Service__LocAssignment_3 ) ) )
            // InternalAdaptUI.g:2865:1: ( ( rule__Service__LocAssignment_3 ) )
            {
            // InternalAdaptUI.g:2865:1: ( ( rule__Service__LocAssignment_3 ) )
            // InternalAdaptUI.g:2866:2: ( rule__Service__LocAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getLocAssignment_3()); 
            // InternalAdaptUI.g:2867:2: ( rule__Service__LocAssignment_3 )
            // InternalAdaptUI.g:2867:3: rule__Service__LocAssignment_3
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
    // InternalAdaptUI.g:2875:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2879:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAdaptUI.g:2880:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:2887:1: rule__Service__Group__4__Impl : ( 'as' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2891:1: ( ( 'as' ) )
            // InternalAdaptUI.g:2892:1: ( 'as' )
            {
            // InternalAdaptUI.g:2892:1: ( 'as' )
            // InternalAdaptUI.g:2893:2: 'as'
            {
             before(grammarAccess.getServiceAccess().getAsKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdaptUI.g:2902:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2906:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAdaptUI.g:2907:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptUI.g:2914:1: rule__Service__Group__5__Impl : ( ( rule__Service__IdAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2918:1: ( ( ( rule__Service__IdAssignment_5 ) ) )
            // InternalAdaptUI.g:2919:1: ( ( rule__Service__IdAssignment_5 ) )
            {
            // InternalAdaptUI.g:2919:1: ( ( rule__Service__IdAssignment_5 ) )
            // InternalAdaptUI.g:2920:2: ( rule__Service__IdAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getIdAssignment_5()); 
            // InternalAdaptUI.g:2921:2: ( rule__Service__IdAssignment_5 )
            // InternalAdaptUI.g:2921:3: rule__Service__IdAssignment_5
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
    // InternalAdaptUI.g:2929:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2933:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAdaptUI.g:2934:2: rule__Service__Group__6__Impl rule__Service__Group__7
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
    // InternalAdaptUI.g:2941:1: rule__Service__Group__6__Impl : ( '{' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2945:1: ( ( '{' ) )
            // InternalAdaptUI.g:2946:1: ( '{' )
            {
            // InternalAdaptUI.g:2946:1: ( '{' )
            // InternalAdaptUI.g:2947:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdaptUI.g:2956:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2960:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAdaptUI.g:2961:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalAdaptUI.g:2968:1: rule__Service__Group__7__Impl : ( ( rule__Service__FunctionsAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2972:1: ( ( ( rule__Service__FunctionsAssignment_7 ) ) )
            // InternalAdaptUI.g:2973:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            {
            // InternalAdaptUI.g:2973:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            // InternalAdaptUI.g:2974:2: ( rule__Service__FunctionsAssignment_7 )
            {
             before(grammarAccess.getServiceAccess().getFunctionsAssignment_7()); 
            // InternalAdaptUI.g:2975:2: ( rule__Service__FunctionsAssignment_7 )
            // InternalAdaptUI.g:2975:3: rule__Service__FunctionsAssignment_7
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
    // InternalAdaptUI.g:2983:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2987:1: ( rule__Service__Group__8__Impl )
            // InternalAdaptUI.g:2988:2: rule__Service__Group__8__Impl
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
    // InternalAdaptUI.g:2994:1: rule__Service__Group__8__Impl : ( '};' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:2998:1: ( ( '};' ) )
            // InternalAdaptUI.g:2999:1: ( '};' )
            {
            // InternalAdaptUI.g:2999:1: ( '};' )
            // InternalAdaptUI.g:3000:2: '};'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_8()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAdaptUI.g:3010:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3014:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalAdaptUI.g:3015:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
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
    // InternalAdaptUI.g:3022:1: rule__Functions__Group__0__Impl : ( ( rule__Functions__ThisAssignment_0 ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3026:1: ( ( ( rule__Functions__ThisAssignment_0 ) ) )
            // InternalAdaptUI.g:3027:1: ( ( rule__Functions__ThisAssignment_0 ) )
            {
            // InternalAdaptUI.g:3027:1: ( ( rule__Functions__ThisAssignment_0 ) )
            // InternalAdaptUI.g:3028:2: ( rule__Functions__ThisAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getThisAssignment_0()); 
            // InternalAdaptUI.g:3029:2: ( rule__Functions__ThisAssignment_0 )
            // InternalAdaptUI.g:3029:3: rule__Functions__ThisAssignment_0
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
    // InternalAdaptUI.g:3037:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3041:1: ( rule__Functions__Group__1__Impl )
            // InternalAdaptUI.g:3042:2: rule__Functions__Group__1__Impl
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
    // InternalAdaptUI.g:3048:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__NextAssignment_1 )? ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3052:1: ( ( ( rule__Functions__NextAssignment_1 )? ) )
            // InternalAdaptUI.g:3053:1: ( ( rule__Functions__NextAssignment_1 )? )
            {
            // InternalAdaptUI.g:3053:1: ( ( rule__Functions__NextAssignment_1 )? )
            // InternalAdaptUI.g:3054:2: ( rule__Functions__NextAssignment_1 )?
            {
             before(grammarAccess.getFunctionsAccess().getNextAssignment_1()); 
            // InternalAdaptUI.g:3055:2: ( rule__Functions__NextAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptUI.g:3055:3: rule__Functions__NextAssignment_1
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
    // InternalAdaptUI.g:3064:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3068:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalAdaptUI.g:3069:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalAdaptUI.g:3076:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3080:1: ( ( 'function' ) )
            // InternalAdaptUI.g:3081:1: ( 'function' )
            {
            // InternalAdaptUI.g:3081:1: ( 'function' )
            // InternalAdaptUI.g:3082:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdaptUI.g:3091:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3095:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalAdaptUI.g:3096:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalAdaptUI.g:3103:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3107:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalAdaptUI.g:3108:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalAdaptUI.g:3108:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalAdaptUI.g:3109:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalAdaptUI.g:3110:2: ( rule__Function__NameAssignment_1 )
            // InternalAdaptUI.g:3110:3: rule__Function__NameAssignment_1
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
    // InternalAdaptUI.g:3118:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3122:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalAdaptUI.g:3123:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:3130:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3134:1: ( ( 'as' ) )
            // InternalAdaptUI.g:3135:1: ( 'as' )
            {
            // InternalAdaptUI.g:3135:1: ( 'as' )
            // InternalAdaptUI.g:3136:2: 'as'
            {
             before(grammarAccess.getFunctionAccess().getAsKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdaptUI.g:3145:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3149:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalAdaptUI.g:3150:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:3157:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3161:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalAdaptUI.g:3162:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalAdaptUI.g:3162:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalAdaptUI.g:3163:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalAdaptUI.g:3164:2: ( rule__Function__IdAssignment_3 )
            // InternalAdaptUI.g:3164:3: rule__Function__IdAssignment_3
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
    // InternalAdaptUI.g:3172:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3176:1: ( rule__Function__Group__4__Impl )
            // InternalAdaptUI.g:3177:2: rule__Function__Group__4__Impl
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
    // InternalAdaptUI.g:3183:1: rule__Function__Group__4__Impl : ( ';' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3187:1: ( ( ';' ) )
            // InternalAdaptUI.g:3188:1: ( ';' )
            {
            // InternalAdaptUI.g:3188:1: ( ';' )
            // InternalAdaptUI.g:3189:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:3199:1: rule__AdaptationRule__Group__0 : rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 ;
    public final void rule__AdaptationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3203:1: ( rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 )
            // InternalAdaptUI.g:3204:2: rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:3211:1: rule__AdaptationRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AdaptationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3215:1: ( ( 'rule' ) )
            // InternalAdaptUI.g:3216:1: ( 'rule' )
            {
            // InternalAdaptUI.g:3216:1: ( 'rule' )
            // InternalAdaptUI.g:3217:2: 'rule'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdaptUI.g:3226:1: rule__AdaptationRule__Group__1 : rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 ;
    public final void rule__AdaptationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3230:1: ( rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 )
            // InternalAdaptUI.g:3231:2: rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptUI.g:3238:1: rule__AdaptationRule__Group__1__Impl : ( ( rule__AdaptationRule__NameAssignment_1 ) ) ;
    public final void rule__AdaptationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3242:1: ( ( ( rule__AdaptationRule__NameAssignment_1 ) ) )
            // InternalAdaptUI.g:3243:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            {
            // InternalAdaptUI.g:3243:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            // InternalAdaptUI.g:3244:2: ( rule__AdaptationRule__NameAssignment_1 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getNameAssignment_1()); 
            // InternalAdaptUI.g:3245:2: ( rule__AdaptationRule__NameAssignment_1 )
            // InternalAdaptUI.g:3245:3: rule__AdaptationRule__NameAssignment_1
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
    // InternalAdaptUI.g:3253:1: rule__AdaptationRule__Group__2 : rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 ;
    public final void rule__AdaptationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3257:1: ( rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 )
            // InternalAdaptUI.g:3258:2: rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3
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
    // InternalAdaptUI.g:3265:1: rule__AdaptationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AdaptationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3269:1: ( ( '{' ) )
            // InternalAdaptUI.g:3270:1: ( '{' )
            {
            // InternalAdaptUI.g:3270:1: ( '{' )
            // InternalAdaptUI.g:3271:2: '{'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdaptUI.g:3280:1: rule__AdaptationRule__Group__3 : rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 ;
    public final void rule__AdaptationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3284:1: ( rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 )
            // InternalAdaptUI.g:3285:2: rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4
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
    // InternalAdaptUI.g:3292:1: rule__AdaptationRule__Group__3__Impl : ( 'LEVEL' ) ;
    public final void rule__AdaptationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3296:1: ( ( 'LEVEL' ) )
            // InternalAdaptUI.g:3297:1: ( 'LEVEL' )
            {
            // InternalAdaptUI.g:3297:1: ( 'LEVEL' )
            // InternalAdaptUI.g:3298:2: 'LEVEL'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdaptUI.g:3307:1: rule__AdaptationRule__Group__4 : rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 ;
    public final void rule__AdaptationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3311:1: ( rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 )
            // InternalAdaptUI.g:3312:2: rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:3319:1: rule__AdaptationRule__Group__4__Impl : ( ( rule__AdaptationRule__LevelAssignment_4 ) ) ;
    public final void rule__AdaptationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3323:1: ( ( ( rule__AdaptationRule__LevelAssignment_4 ) ) )
            // InternalAdaptUI.g:3324:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            {
            // InternalAdaptUI.g:3324:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            // InternalAdaptUI.g:3325:2: ( rule__AdaptationRule__LevelAssignment_4 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getLevelAssignment_4()); 
            // InternalAdaptUI.g:3326:2: ( rule__AdaptationRule__LevelAssignment_4 )
            // InternalAdaptUI.g:3326:3: rule__AdaptationRule__LevelAssignment_4
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
    // InternalAdaptUI.g:3334:1: rule__AdaptationRule__Group__5 : rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 ;
    public final void rule__AdaptationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3338:1: ( rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 )
            // InternalAdaptUI.g:3339:2: rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6
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
    // InternalAdaptUI.g:3346:1: rule__AdaptationRule__Group__5__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3350:1: ( ( ';' ) )
            // InternalAdaptUI.g:3351:1: ( ';' )
            {
            // InternalAdaptUI.g:3351:1: ( ';' )
            // InternalAdaptUI.g:3352:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:3361:1: rule__AdaptationRule__Group__6 : rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 ;
    public final void rule__AdaptationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3365:1: ( rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 )
            // InternalAdaptUI.g:3366:2: rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7
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
    // InternalAdaptUI.g:3373:1: rule__AdaptationRule__Group__6__Impl : ( 'FACT' ) ;
    public final void rule__AdaptationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3377:1: ( ( 'FACT' ) )
            // InternalAdaptUI.g:3378:1: ( 'FACT' )
            {
            // InternalAdaptUI.g:3378:1: ( 'FACT' )
            // InternalAdaptUI.g:3379:2: 'FACT'
            {
             before(grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdaptUI.g:3388:1: rule__AdaptationRule__Group__7 : rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 ;
    public final void rule__AdaptationRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3392:1: ( rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 )
            // InternalAdaptUI.g:3393:2: rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8
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
    // InternalAdaptUI.g:3400:1: rule__AdaptationRule__Group__7__Impl : ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) ;
    public final void rule__AdaptationRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3404:1: ( ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) )
            // InternalAdaptUI.g:3405:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            {
            // InternalAdaptUI.g:3405:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            // InternalAdaptUI.g:3406:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_7()); 
            // InternalAdaptUI.g:3407:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            // InternalAdaptUI.g:3407:3: rule__AdaptationRule__FactTypeAssignment_7
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
    // InternalAdaptUI.g:3415:1: rule__AdaptationRule__Group__8 : rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 ;
    public final void rule__AdaptationRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3419:1: ( rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 )
            // InternalAdaptUI.g:3420:2: rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:3427:1: rule__AdaptationRule__Group__8__Impl : ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) ;
    public final void rule__AdaptationRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3431:1: ( ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) )
            // InternalAdaptUI.g:3432:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            {
            // InternalAdaptUI.g:3432:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            // InternalAdaptUI.g:3433:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_8()); 
            // InternalAdaptUI.g:3434:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            // InternalAdaptUI.g:3434:3: rule__AdaptationRule__FactNameAssignment_8
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
    // InternalAdaptUI.g:3442:1: rule__AdaptationRule__Group__9 : rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 ;
    public final void rule__AdaptationRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3446:1: ( rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 )
            // InternalAdaptUI.g:3447:2: rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10
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
    // InternalAdaptUI.g:3454:1: rule__AdaptationRule__Group__9__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3458:1: ( ( ';' ) )
            // InternalAdaptUI.g:3459:1: ( ';' )
            {
            // InternalAdaptUI.g:3459:1: ( ';' )
            // InternalAdaptUI.g:3460:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:3469:1: rule__AdaptationRule__Group__10 : rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 ;
    public final void rule__AdaptationRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3473:1: ( rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 )
            // InternalAdaptUI.g:3474:2: rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11
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
    // InternalAdaptUI.g:3481:1: rule__AdaptationRule__Group__10__Impl : ( 'IF' ) ;
    public final void rule__AdaptationRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3485:1: ( ( 'IF' ) )
            // InternalAdaptUI.g:3486:1: ( 'IF' )
            {
            // InternalAdaptUI.g:3486:1: ( 'IF' )
            // InternalAdaptUI.g:3487:2: 'IF'
            {
             before(grammarAccess.getAdaptationRuleAccess().getIFKeyword_10()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptUI.g:3496:1: rule__AdaptationRule__Group__11 : rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 ;
    public final void rule__AdaptationRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3500:1: ( rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 )
            // InternalAdaptUI.g:3501:2: rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12
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
    // InternalAdaptUI.g:3508:1: rule__AdaptationRule__Group__11__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3512:1: ( ( '(' ) )
            // InternalAdaptUI.g:3513:1: ( '(' )
            {
            // InternalAdaptUI.g:3513:1: ( '(' )
            // InternalAdaptUI.g:3514:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:3523:1: rule__AdaptationRule__Group__12 : rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 ;
    public final void rule__AdaptationRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3527:1: ( rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 )
            // InternalAdaptUI.g:3528:2: rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13
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
    // InternalAdaptUI.g:3535:1: rule__AdaptationRule__Group__12__Impl : ( ( rule__AdaptationRule__ExprAssignment_12 ) ) ;
    public final void rule__AdaptationRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3539:1: ( ( ( rule__AdaptationRule__ExprAssignment_12 ) ) )
            // InternalAdaptUI.g:3540:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            {
            // InternalAdaptUI.g:3540:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            // InternalAdaptUI.g:3541:2: ( rule__AdaptationRule__ExprAssignment_12 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprAssignment_12()); 
            // InternalAdaptUI.g:3542:2: ( rule__AdaptationRule__ExprAssignment_12 )
            // InternalAdaptUI.g:3542:3: rule__AdaptationRule__ExprAssignment_12
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
    // InternalAdaptUI.g:3550:1: rule__AdaptationRule__Group__13 : rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 ;
    public final void rule__AdaptationRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3554:1: ( rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 )
            // InternalAdaptUI.g:3555:2: rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14
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
    // InternalAdaptUI.g:3562:1: rule__AdaptationRule__Group__13__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3566:1: ( ( ')' ) )
            // InternalAdaptUI.g:3567:1: ( ')' )
            {
            // InternalAdaptUI.g:3567:1: ( ')' )
            // InternalAdaptUI.g:3568:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:3577:1: rule__AdaptationRule__Group__14 : rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 ;
    public final void rule__AdaptationRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3581:1: ( rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 )
            // InternalAdaptUI.g:3582:2: rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15
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
    // InternalAdaptUI.g:3589:1: rule__AdaptationRule__Group__14__Impl : ( 'THEN' ) ;
    public final void rule__AdaptationRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3593:1: ( ( 'THEN' ) )
            // InternalAdaptUI.g:3594:1: ( 'THEN' )
            {
            // InternalAdaptUI.g:3594:1: ( 'THEN' )
            // InternalAdaptUI.g:3595:2: 'THEN'
            {
             before(grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptUI.g:3604:1: rule__AdaptationRule__Group__15 : rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 ;
    public final void rule__AdaptationRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3608:1: ( rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 )
            // InternalAdaptUI.g:3609:2: rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16
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
    // InternalAdaptUI.g:3616:1: rule__AdaptationRule__Group__15__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3620:1: ( ( '(' ) )
            // InternalAdaptUI.g:3621:1: ( '(' )
            {
            // InternalAdaptUI.g:3621:1: ( '(' )
            // InternalAdaptUI.g:3622:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:3631:1: rule__AdaptationRule__Group__16 : rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 ;
    public final void rule__AdaptationRule__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3635:1: ( rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 )
            // InternalAdaptUI.g:3636:2: rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17
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
    // InternalAdaptUI.g:3643:1: rule__AdaptationRule__Group__16__Impl : ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) ;
    public final void rule__AdaptationRule__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3647:1: ( ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) )
            // InternalAdaptUI.g:3648:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            {
            // InternalAdaptUI.g:3648:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            // InternalAdaptUI.g:3649:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_16()); 
            // InternalAdaptUI.g:3650:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            // InternalAdaptUI.g:3650:3: rule__AdaptationRule__ActionCollectionAssignment_16
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
    // InternalAdaptUI.g:3658:1: rule__AdaptationRule__Group__17 : rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 ;
    public final void rule__AdaptationRule__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3662:1: ( rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 )
            // InternalAdaptUI.g:3663:2: rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:3670:1: rule__AdaptationRule__Group__17__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3674:1: ( ( ')' ) )
            // InternalAdaptUI.g:3675:1: ( ')' )
            {
            // InternalAdaptUI.g:3675:1: ( ')' )
            // InternalAdaptUI.g:3676:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:3685:1: rule__AdaptationRule__Group__18 : rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 ;
    public final void rule__AdaptationRule__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3689:1: ( rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 )
            // InternalAdaptUI.g:3690:2: rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19
            {
            pushFollow(FOLLOW_29);
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
    // InternalAdaptUI.g:3697:1: rule__AdaptationRule__Group__18__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3701:1: ( ( ';' ) )
            // InternalAdaptUI.g:3702:1: ( ';' )
            {
            // InternalAdaptUI.g:3702:1: ( ';' )
            // InternalAdaptUI.g:3703:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:3712:1: rule__AdaptationRule__Group__19 : rule__AdaptationRule__Group__19__Impl ;
    public final void rule__AdaptationRule__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3716:1: ( rule__AdaptationRule__Group__19__Impl )
            // InternalAdaptUI.g:3717:2: rule__AdaptationRule__Group__19__Impl
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
    // InternalAdaptUI.g:3723:1: rule__AdaptationRule__Group__19__Impl : ( '}' ) ;
    public final void rule__AdaptationRule__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3727:1: ( ( '}' ) )
            // InternalAdaptUI.g:3728:1: ( '}' )
            {
            // InternalAdaptUI.g:3728:1: ( '}' )
            // InternalAdaptUI.g:3729:2: '}'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_19()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptUI.g:3739:1: rule__ConditionalOR__Group__0 : rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 ;
    public final void rule__ConditionalOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3743:1: ( rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 )
            // InternalAdaptUI.g:3744:2: rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalAdaptUI.g:3751:1: rule__ConditionalOR__Group__0__Impl : ( ( rule__ConditionalOR__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3755:1: ( ( ( rule__ConditionalOR__LeftAssignment_0 ) ) )
            // InternalAdaptUI.g:3756:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            {
            // InternalAdaptUI.g:3756:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            // InternalAdaptUI.g:3757:2: ( rule__ConditionalOR__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalORAccess().getLeftAssignment_0()); 
            // InternalAdaptUI.g:3758:2: ( rule__ConditionalOR__LeftAssignment_0 )
            // InternalAdaptUI.g:3758:3: rule__ConditionalOR__LeftAssignment_0
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
    // InternalAdaptUI.g:3766:1: rule__ConditionalOR__Group__1 : rule__ConditionalOR__Group__1__Impl ;
    public final void rule__ConditionalOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3770:1: ( rule__ConditionalOR__Group__1__Impl )
            // InternalAdaptUI.g:3771:2: rule__ConditionalOR__Group__1__Impl
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
    // InternalAdaptUI.g:3777:1: rule__ConditionalOR__Group__1__Impl : ( ( rule__ConditionalOR__Group_1__0 )? ) ;
    public final void rule__ConditionalOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3781:1: ( ( ( rule__ConditionalOR__Group_1__0 )? ) )
            // InternalAdaptUI.g:3782:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            {
            // InternalAdaptUI.g:3782:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            // InternalAdaptUI.g:3783:2: ( rule__ConditionalOR__Group_1__0 )?
            {
             before(grammarAccess.getConditionalORAccess().getGroup_1()); 
            // InternalAdaptUI.g:3784:2: ( rule__ConditionalOR__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptUI.g:3784:3: rule__ConditionalOR__Group_1__0
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
    // InternalAdaptUI.g:3793:1: rule__ConditionalOR__Group_1__0 : rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 ;
    public final void rule__ConditionalOR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3797:1: ( rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 )
            // InternalAdaptUI.g:3798:2: rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1
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
    // InternalAdaptUI.g:3805:1: rule__ConditionalOR__Group_1__0__Impl : ( '||' ) ;
    public final void rule__ConditionalOR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3809:1: ( ( '||' ) )
            // InternalAdaptUI.g:3810:1: ( '||' )
            {
            // InternalAdaptUI.g:3810:1: ( '||' )
            // InternalAdaptUI.g:3811:2: '||'
            {
             before(grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdaptUI.g:3820:1: rule__ConditionalOR__Group_1__1 : rule__ConditionalOR__Group_1__1__Impl ;
    public final void rule__ConditionalOR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3824:1: ( rule__ConditionalOR__Group_1__1__Impl )
            // InternalAdaptUI.g:3825:2: rule__ConditionalOR__Group_1__1__Impl
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
    // InternalAdaptUI.g:3831:1: rule__ConditionalOR__Group_1__1__Impl : ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalOR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3835:1: ( ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) )
            // InternalAdaptUI.g:3836:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            {
            // InternalAdaptUI.g:3836:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            // InternalAdaptUI.g:3837:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalORAccess().getRightAssignment_1_1()); 
            // InternalAdaptUI.g:3838:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            // InternalAdaptUI.g:3838:3: rule__ConditionalOR__RightAssignment_1_1
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
    // InternalAdaptUI.g:3847:1: rule__ConditionalAND__Group__0 : rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 ;
    public final void rule__ConditionalAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3851:1: ( rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 )
            // InternalAdaptUI.g:3852:2: rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAdaptUI.g:3859:1: rule__ConditionalAND__Group__0__Impl : ( ( rule__ConditionalAND__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3863:1: ( ( ( rule__ConditionalAND__LeftAssignment_0 ) ) )
            // InternalAdaptUI.g:3864:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            {
            // InternalAdaptUI.g:3864:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            // InternalAdaptUI.g:3865:2: ( rule__ConditionalAND__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalANDAccess().getLeftAssignment_0()); 
            // InternalAdaptUI.g:3866:2: ( rule__ConditionalAND__LeftAssignment_0 )
            // InternalAdaptUI.g:3866:3: rule__ConditionalAND__LeftAssignment_0
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
    // InternalAdaptUI.g:3874:1: rule__ConditionalAND__Group__1 : rule__ConditionalAND__Group__1__Impl ;
    public final void rule__ConditionalAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3878:1: ( rule__ConditionalAND__Group__1__Impl )
            // InternalAdaptUI.g:3879:2: rule__ConditionalAND__Group__1__Impl
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
    // InternalAdaptUI.g:3885:1: rule__ConditionalAND__Group__1__Impl : ( ( rule__ConditionalAND__Group_1__0 )? ) ;
    public final void rule__ConditionalAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3889:1: ( ( ( rule__ConditionalAND__Group_1__0 )? ) )
            // InternalAdaptUI.g:3890:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            {
            // InternalAdaptUI.g:3890:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            // InternalAdaptUI.g:3891:2: ( rule__ConditionalAND__Group_1__0 )?
            {
             before(grammarAccess.getConditionalANDAccess().getGroup_1()); 
            // InternalAdaptUI.g:3892:2: ( rule__ConditionalAND__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptUI.g:3892:3: rule__ConditionalAND__Group_1__0
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
    // InternalAdaptUI.g:3901:1: rule__ConditionalAND__Group_1__0 : rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 ;
    public final void rule__ConditionalAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3905:1: ( rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 )
            // InternalAdaptUI.g:3906:2: rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1
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
    // InternalAdaptUI.g:3913:1: rule__ConditionalAND__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__ConditionalAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3917:1: ( ( '&&' ) )
            // InternalAdaptUI.g:3918:1: ( '&&' )
            {
            // InternalAdaptUI.g:3918:1: ( '&&' )
            // InternalAdaptUI.g:3919:2: '&&'
            {
             before(grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAdaptUI.g:3928:1: rule__ConditionalAND__Group_1__1 : rule__ConditionalAND__Group_1__1__Impl ;
    public final void rule__ConditionalAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3932:1: ( rule__ConditionalAND__Group_1__1__Impl )
            // InternalAdaptUI.g:3933:2: rule__ConditionalAND__Group_1__1__Impl
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
    // InternalAdaptUI.g:3939:1: rule__ConditionalAND__Group_1__1__Impl : ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3943:1: ( ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) )
            // InternalAdaptUI.g:3944:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            {
            // InternalAdaptUI.g:3944:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            // InternalAdaptUI.g:3945:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalANDAccess().getRightAssignment_1_1()); 
            // InternalAdaptUI.g:3946:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            // InternalAdaptUI.g:3946:3: rule__ConditionalAND__RightAssignment_1_1
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
    // InternalAdaptUI.g:3955:1: rule__BooleanCondition__Group_0__0 : rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 ;
    public final void rule__BooleanCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3959:1: ( rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 )
            // InternalAdaptUI.g:3960:2: rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAdaptUI.g:3967:1: rule__BooleanCondition__Group_0__0__Impl : ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) ;
    public final void rule__BooleanCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3971:1: ( ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) )
            // InternalAdaptUI.g:3972:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            {
            // InternalAdaptUI.g:3972:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            // InternalAdaptUI.g:3973:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getFactAssignment_0_0()); 
            // InternalAdaptUI.g:3974:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            // InternalAdaptUI.g:3974:3: rule__BooleanCondition__FactAssignment_0_0
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
    // InternalAdaptUI.g:3982:1: rule__BooleanCondition__Group_0__1 : rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 ;
    public final void rule__BooleanCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3986:1: ( rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 )
            // InternalAdaptUI.g:3987:2: rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAdaptUI.g:3994:1: rule__BooleanCondition__Group_0__1__Impl : ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) ;
    public final void rule__BooleanCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:3998:1: ( ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) )
            // InternalAdaptUI.g:3999:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            {
            // InternalAdaptUI.g:3999:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            // InternalAdaptUI.g:4000:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getBooleanConditionAccess().getOpAssignment_0_1()); 
            // InternalAdaptUI.g:4001:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            // InternalAdaptUI.g:4001:3: rule__BooleanCondition__OpAssignment_0_1
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
    // InternalAdaptUI.g:4009:1: rule__BooleanCondition__Group_0__2 : rule__BooleanCondition__Group_0__2__Impl ;
    public final void rule__BooleanCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4013:1: ( rule__BooleanCondition__Group_0__2__Impl )
            // InternalAdaptUI.g:4014:2: rule__BooleanCondition__Group_0__2__Impl
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
    // InternalAdaptUI.g:4020:1: rule__BooleanCondition__Group_0__2__Impl : ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) ;
    public final void rule__BooleanCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4024:1: ( ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) )
            // InternalAdaptUI.g:4025:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            {
            // InternalAdaptUI.g:4025:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            // InternalAdaptUI.g:4026:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            {
             before(grammarAccess.getBooleanConditionAccess().getValAssignment_0_2()); 
            // InternalAdaptUI.g:4027:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            // InternalAdaptUI.g:4027:3: rule__BooleanCondition__ValAssignment_0_2
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
    // InternalAdaptUI.g:4036:1: rule__NumberCondition__Group__0 : rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 ;
    public final void rule__NumberCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4040:1: ( rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 )
            // InternalAdaptUI.g:4041:2: rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptUI.g:4048:1: rule__NumberCondition__Group__0__Impl : ( ( rule__NumberCondition__FactAssignment_0 ) ) ;
    public final void rule__NumberCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4052:1: ( ( ( rule__NumberCondition__FactAssignment_0 ) ) )
            // InternalAdaptUI.g:4053:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            {
            // InternalAdaptUI.g:4053:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            // InternalAdaptUI.g:4054:2: ( rule__NumberCondition__FactAssignment_0 )
            {
             before(grammarAccess.getNumberConditionAccess().getFactAssignment_0()); 
            // InternalAdaptUI.g:4055:2: ( rule__NumberCondition__FactAssignment_0 )
            // InternalAdaptUI.g:4055:3: rule__NumberCondition__FactAssignment_0
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
    // InternalAdaptUI.g:4063:1: rule__NumberCondition__Group__1 : rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 ;
    public final void rule__NumberCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4067:1: ( rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 )
            // InternalAdaptUI.g:4068:2: rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2
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
    // InternalAdaptUI.g:4075:1: rule__NumberCondition__Group__1__Impl : ( ( rule__NumberCondition__OpAssignment_1 ) ) ;
    public final void rule__NumberCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4079:1: ( ( ( rule__NumberCondition__OpAssignment_1 ) ) )
            // InternalAdaptUI.g:4080:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            {
            // InternalAdaptUI.g:4080:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            // InternalAdaptUI.g:4081:2: ( rule__NumberCondition__OpAssignment_1 )
            {
             before(grammarAccess.getNumberConditionAccess().getOpAssignment_1()); 
            // InternalAdaptUI.g:4082:2: ( rule__NumberCondition__OpAssignment_1 )
            // InternalAdaptUI.g:4082:3: rule__NumberCondition__OpAssignment_1
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
    // InternalAdaptUI.g:4090:1: rule__NumberCondition__Group__2 : rule__NumberCondition__Group__2__Impl ;
    public final void rule__NumberCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4094:1: ( rule__NumberCondition__Group__2__Impl )
            // InternalAdaptUI.g:4095:2: rule__NumberCondition__Group__2__Impl
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
    // InternalAdaptUI.g:4101:1: rule__NumberCondition__Group__2__Impl : ( ( rule__NumberCondition__ValAssignment_2 ) ) ;
    public final void rule__NumberCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4105:1: ( ( ( rule__NumberCondition__ValAssignment_2 ) ) )
            // InternalAdaptUI.g:4106:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            {
            // InternalAdaptUI.g:4106:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            // InternalAdaptUI.g:4107:2: ( rule__NumberCondition__ValAssignment_2 )
            {
             before(grammarAccess.getNumberConditionAccess().getValAssignment_2()); 
            // InternalAdaptUI.g:4108:2: ( rule__NumberCondition__ValAssignment_2 )
            // InternalAdaptUI.g:4108:3: rule__NumberCondition__ValAssignment_2
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
    // InternalAdaptUI.g:4117:1: rule__StringCondition__Group__0 : rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 ;
    public final void rule__StringCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4121:1: ( rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 )
            // InternalAdaptUI.g:4122:2: rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAdaptUI.g:4129:1: rule__StringCondition__Group__0__Impl : ( ( rule__StringCondition__FactAssignment_0 ) ) ;
    public final void rule__StringCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4133:1: ( ( ( rule__StringCondition__FactAssignment_0 ) ) )
            // InternalAdaptUI.g:4134:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            {
            // InternalAdaptUI.g:4134:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            // InternalAdaptUI.g:4135:2: ( rule__StringCondition__FactAssignment_0 )
            {
             before(grammarAccess.getStringConditionAccess().getFactAssignment_0()); 
            // InternalAdaptUI.g:4136:2: ( rule__StringCondition__FactAssignment_0 )
            // InternalAdaptUI.g:4136:3: rule__StringCondition__FactAssignment_0
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
    // InternalAdaptUI.g:4144:1: rule__StringCondition__Group__1 : rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 ;
    public final void rule__StringCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4148:1: ( rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 )
            // InternalAdaptUI.g:4149:2: rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:4156:1: rule__StringCondition__Group__1__Impl : ( ( rule__StringCondition__OpAssignment_1 ) ) ;
    public final void rule__StringCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4160:1: ( ( ( rule__StringCondition__OpAssignment_1 ) ) )
            // InternalAdaptUI.g:4161:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            {
            // InternalAdaptUI.g:4161:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            // InternalAdaptUI.g:4162:2: ( rule__StringCondition__OpAssignment_1 )
            {
             before(grammarAccess.getStringConditionAccess().getOpAssignment_1()); 
            // InternalAdaptUI.g:4163:2: ( rule__StringCondition__OpAssignment_1 )
            // InternalAdaptUI.g:4163:3: rule__StringCondition__OpAssignment_1
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
    // InternalAdaptUI.g:4171:1: rule__StringCondition__Group__2 : rule__StringCondition__Group__2__Impl ;
    public final void rule__StringCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4175:1: ( rule__StringCondition__Group__2__Impl )
            // InternalAdaptUI.g:4176:2: rule__StringCondition__Group__2__Impl
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
    // InternalAdaptUI.g:4182:1: rule__StringCondition__Group__2__Impl : ( ( rule__StringCondition__ValAssignment_2 ) ) ;
    public final void rule__StringCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4186:1: ( ( ( rule__StringCondition__ValAssignment_2 ) ) )
            // InternalAdaptUI.g:4187:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            {
            // InternalAdaptUI.g:4187:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            // InternalAdaptUI.g:4188:2: ( rule__StringCondition__ValAssignment_2 )
            {
             before(grammarAccess.getStringConditionAccess().getValAssignment_2()); 
            // InternalAdaptUI.g:4189:2: ( rule__StringCondition__ValAssignment_2 )
            // InternalAdaptUI.g:4189:3: rule__StringCondition__ValAssignment_2
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
    // InternalAdaptUI.g:4198:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4202:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalAdaptUI.g:4203:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptUI.g:4210:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__FactNameAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4214:1: ( ( ( rule__Fact__FactNameAssignment_0 ) ) )
            // InternalAdaptUI.g:4215:1: ( ( rule__Fact__FactNameAssignment_0 ) )
            {
            // InternalAdaptUI.g:4215:1: ( ( rule__Fact__FactNameAssignment_0 ) )
            // InternalAdaptUI.g:4216:2: ( rule__Fact__FactNameAssignment_0 )
            {
             before(grammarAccess.getFactAccess().getFactNameAssignment_0()); 
            // InternalAdaptUI.g:4217:2: ( rule__Fact__FactNameAssignment_0 )
            // InternalAdaptUI.g:4217:3: rule__Fact__FactNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__FactNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getFactNameAssignment_0()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4225:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4229:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // InternalAdaptUI.g:4230:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:4237:1: rule__Fact__Group__1__Impl : ( '.get' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4241:1: ( ( '.get' ) )
            // InternalAdaptUI.g:4242:1: ( '.get' )
            {
            // InternalAdaptUI.g:4242:1: ( '.get' )
            // InternalAdaptUI.g:4243:2: '.get'
            {
             before(grammarAccess.getFactAccess().getGetKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getGetKeyword_1()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4252:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl rule__Fact__Group__3 ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4256:1: ( rule__Fact__Group__2__Impl rule__Fact__Group__3 )
            // InternalAdaptUI.g:4257:2: rule__Fact__Group__2__Impl rule__Fact__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Fact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__3();

            state._fsp--;


            }

        }
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
    // InternalAdaptUI.g:4264:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__EntityAssignment_2 ) ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4268:1: ( ( ( rule__Fact__EntityAssignment_2 ) ) )
            // InternalAdaptUI.g:4269:1: ( ( rule__Fact__EntityAssignment_2 ) )
            {
            // InternalAdaptUI.g:4269:1: ( ( rule__Fact__EntityAssignment_2 ) )
            // InternalAdaptUI.g:4270:2: ( rule__Fact__EntityAssignment_2 )
            {
             before(grammarAccess.getFactAccess().getEntityAssignment_2()); 
            // InternalAdaptUI.g:4271:2: ( rule__Fact__EntityAssignment_2 )
            // InternalAdaptUI.g:4271:3: rule__Fact__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fact__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getEntityAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Fact__Group__3"
    // InternalAdaptUI.g:4279:1: rule__Fact__Group__3 : rule__Fact__Group__3__Impl rule__Fact__Group__4 ;
    public final void rule__Fact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4283:1: ( rule__Fact__Group__3__Impl rule__Fact__Group__4 )
            // InternalAdaptUI.g:4284:2: rule__Fact__Group__3__Impl rule__Fact__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Fact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__3"


    // $ANTLR start "rule__Fact__Group__3__Impl"
    // InternalAdaptUI.g:4291:1: rule__Fact__Group__3__Impl : ( '()' ) ;
    public final void rule__Fact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4295:1: ( ( '()' ) )
            // InternalAdaptUI.g:4296:1: ( '()' )
            {
            // InternalAdaptUI.g:4296:1: ( '()' )
            // InternalAdaptUI.g:4297:2: '()'
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__3__Impl"


    // $ANTLR start "rule__Fact__Group__4"
    // InternalAdaptUI.g:4306:1: rule__Fact__Group__4 : rule__Fact__Group__4__Impl rule__Fact__Group__5 ;
    public final void rule__Fact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4310:1: ( rule__Fact__Group__4__Impl rule__Fact__Group__5 )
            // InternalAdaptUI.g:4311:2: rule__Fact__Group__4__Impl rule__Fact__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Fact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__4"


    // $ANTLR start "rule__Fact__Group__4__Impl"
    // InternalAdaptUI.g:4318:1: rule__Fact__Group__4__Impl : ( '.get' ) ;
    public final void rule__Fact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4322:1: ( ( '.get' ) )
            // InternalAdaptUI.g:4323:1: ( '.get' )
            {
            // InternalAdaptUI.g:4323:1: ( '.get' )
            // InternalAdaptUI.g:4324:2: '.get'
            {
             before(grammarAccess.getFactAccess().getGetKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getGetKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__4__Impl"


    // $ANTLR start "rule__Fact__Group__5"
    // InternalAdaptUI.g:4333:1: rule__Fact__Group__5 : rule__Fact__Group__5__Impl rule__Fact__Group__6 ;
    public final void rule__Fact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4337:1: ( rule__Fact__Group__5__Impl rule__Fact__Group__6 )
            // InternalAdaptUI.g:4338:2: rule__Fact__Group__5__Impl rule__Fact__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Fact__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__5"


    // $ANTLR start "rule__Fact__Group__5__Impl"
    // InternalAdaptUI.g:4345:1: rule__Fact__Group__5__Impl : ( ( rule__Fact__PropertyNameAssignment_5 ) ) ;
    public final void rule__Fact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4349:1: ( ( ( rule__Fact__PropertyNameAssignment_5 ) ) )
            // InternalAdaptUI.g:4350:1: ( ( rule__Fact__PropertyNameAssignment_5 ) )
            {
            // InternalAdaptUI.g:4350:1: ( ( rule__Fact__PropertyNameAssignment_5 ) )
            // InternalAdaptUI.g:4351:2: ( rule__Fact__PropertyNameAssignment_5 )
            {
             before(grammarAccess.getFactAccess().getPropertyNameAssignment_5()); 
            // InternalAdaptUI.g:4352:2: ( rule__Fact__PropertyNameAssignment_5 )
            // InternalAdaptUI.g:4352:3: rule__Fact__PropertyNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Fact__PropertyNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getPropertyNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__5__Impl"


    // $ANTLR start "rule__Fact__Group__6"
    // InternalAdaptUI.g:4360:1: rule__Fact__Group__6 : rule__Fact__Group__6__Impl ;
    public final void rule__Fact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4364:1: ( rule__Fact__Group__6__Impl )
            // InternalAdaptUI.g:4365:2: rule__Fact__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__6"


    // $ANTLR start "rule__Fact__Group__6__Impl"
    // InternalAdaptUI.g:4371:1: rule__Fact__Group__6__Impl : ( '()' ) ;
    public final void rule__Fact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4375:1: ( ( '()' ) )
            // InternalAdaptUI.g:4376:1: ( '()' )
            {
            // InternalAdaptUI.g:4376:1: ( '()' )
            // InternalAdaptUI.g:4377:2: '()'
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__6__Impl"


    // $ANTLR start "rule__FactProperty__Group__0"
    // InternalAdaptUI.g:4387:1: rule__FactProperty__Group__0 : rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 ;
    public final void rule__FactProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4391:1: ( rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 )
            // InternalAdaptUI.g:4392:2: rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptUI.g:4399:1: rule__FactProperty__Group__0__Impl : ( ( rule__FactProperty__FactNameAssignment_0 ) ) ;
    public final void rule__FactProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4403:1: ( ( ( rule__FactProperty__FactNameAssignment_0 ) ) )
            // InternalAdaptUI.g:4404:1: ( ( rule__FactProperty__FactNameAssignment_0 ) )
            {
            // InternalAdaptUI.g:4404:1: ( ( rule__FactProperty__FactNameAssignment_0 ) )
            // InternalAdaptUI.g:4405:2: ( rule__FactProperty__FactNameAssignment_0 )
            {
             before(grammarAccess.getFactPropertyAccess().getFactNameAssignment_0()); 
            // InternalAdaptUI.g:4406:2: ( rule__FactProperty__FactNameAssignment_0 )
            // InternalAdaptUI.g:4406:3: rule__FactProperty__FactNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__FactNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactPropertyAccess().getFactNameAssignment_0()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4414:1: rule__FactProperty__Group__1 : rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 ;
    public final void rule__FactProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4418:1: ( rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 )
            // InternalAdaptUI.g:4419:2: rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:4426:1: rule__FactProperty__Group__1__Impl : ( '.get' ) ;
    public final void rule__FactProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4430:1: ( ( '.get' ) )
            // InternalAdaptUI.g:4431:1: ( '.get' )
            {
            // InternalAdaptUI.g:4431:1: ( '.get' )
            // InternalAdaptUI.g:4432:2: '.get'
            {
             before(grammarAccess.getFactPropertyAccess().getGetKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getGetKeyword_1()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4441:1: rule__FactProperty__Group__2 : rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 ;
    public final void rule__FactProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4445:1: ( rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 )
            // InternalAdaptUI.g:4446:2: rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalAdaptUI.g:4453:1: rule__FactProperty__Group__2__Impl : ( ( rule__FactProperty__EntityAssignment_2 ) ) ;
    public final void rule__FactProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4457:1: ( ( ( rule__FactProperty__EntityAssignment_2 ) ) )
            // InternalAdaptUI.g:4458:1: ( ( rule__FactProperty__EntityAssignment_2 ) )
            {
            // InternalAdaptUI.g:4458:1: ( ( rule__FactProperty__EntityAssignment_2 ) )
            // InternalAdaptUI.g:4459:2: ( rule__FactProperty__EntityAssignment_2 )
            {
             before(grammarAccess.getFactPropertyAccess().getEntityAssignment_2()); 
            // InternalAdaptUI.g:4460:2: ( rule__FactProperty__EntityAssignment_2 )
            // InternalAdaptUI.g:4460:3: rule__FactProperty__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFactPropertyAccess().getEntityAssignment_2()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4468:1: rule__FactProperty__Group__3 : rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 ;
    public final void rule__FactProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4472:1: ( rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 )
            // InternalAdaptUI.g:4473:2: rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptUI.g:4480:1: rule__FactProperty__Group__3__Impl : ( '()' ) ;
    public final void rule__FactProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4484:1: ( ( '()' ) )
            // InternalAdaptUI.g:4485:1: ( '()' )
            {
            // InternalAdaptUI.g:4485:1: ( '()' )
            // InternalAdaptUI.g:4486:2: '()'
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4495:1: rule__FactProperty__Group__4 : rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 ;
    public final void rule__FactProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4499:1: ( rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 )
            // InternalAdaptUI.g:4500:2: rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:4507:1: rule__FactProperty__Group__4__Impl : ( '.set' ) ;
    public final void rule__FactProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4511:1: ( ( '.set' ) )
            // InternalAdaptUI.g:4512:1: ( '.set' )
            {
            // InternalAdaptUI.g:4512:1: ( '.set' )
            // InternalAdaptUI.g:4513:2: '.set'
            {
             before(grammarAccess.getFactPropertyAccess().getSetKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getSetKeyword_4()); 

            }


            }

        }
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
    // InternalAdaptUI.g:4522:1: rule__FactProperty__Group__5 : rule__FactProperty__Group__5__Impl rule__FactProperty__Group__6 ;
    public final void rule__FactProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4526:1: ( rule__FactProperty__Group__5__Impl rule__FactProperty__Group__6 )
            // InternalAdaptUI.g:4527:2: rule__FactProperty__Group__5__Impl rule__FactProperty__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__FactProperty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__6();

            state._fsp--;


            }

        }
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
    // InternalAdaptUI.g:4534:1: rule__FactProperty__Group__5__Impl : ( ( rule__FactProperty__PropertyNameAssignment_5 ) ) ;
    public final void rule__FactProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4538:1: ( ( ( rule__FactProperty__PropertyNameAssignment_5 ) ) )
            // InternalAdaptUI.g:4539:1: ( ( rule__FactProperty__PropertyNameAssignment_5 ) )
            {
            // InternalAdaptUI.g:4539:1: ( ( rule__FactProperty__PropertyNameAssignment_5 ) )
            // InternalAdaptUI.g:4540:2: ( rule__FactProperty__PropertyNameAssignment_5 )
            {
             before(grammarAccess.getFactPropertyAccess().getPropertyNameAssignment_5()); 
            // InternalAdaptUI.g:4541:2: ( rule__FactProperty__PropertyNameAssignment_5 )
            // InternalAdaptUI.g:4541:3: rule__FactProperty__PropertyNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__PropertyNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFactPropertyAccess().getPropertyNameAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__FactProperty__Group__6"
    // InternalAdaptUI.g:4549:1: rule__FactProperty__Group__6 : rule__FactProperty__Group__6__Impl rule__FactProperty__Group__7 ;
    public final void rule__FactProperty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4553:1: ( rule__FactProperty__Group__6__Impl rule__FactProperty__Group__7 )
            // InternalAdaptUI.g:4554:2: rule__FactProperty__Group__6__Impl rule__FactProperty__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__FactProperty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__Group__6"


    // $ANTLR start "rule__FactProperty__Group__6__Impl"
    // InternalAdaptUI.g:4561:1: rule__FactProperty__Group__6__Impl : ( '(' ) ;
    public final void rule__FactProperty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4565:1: ( ( '(' ) )
            // InternalAdaptUI.g:4566:1: ( '(' )
            {
            // InternalAdaptUI.g:4566:1: ( '(' )
            // InternalAdaptUI.g:4567:2: '('
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__Group__6__Impl"


    // $ANTLR start "rule__FactProperty__Group__7"
    // InternalAdaptUI.g:4576:1: rule__FactProperty__Group__7 : rule__FactProperty__Group__7__Impl rule__FactProperty__Group__8 ;
    public final void rule__FactProperty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4580:1: ( rule__FactProperty__Group__7__Impl rule__FactProperty__Group__8 )
            // InternalAdaptUI.g:4581:2: rule__FactProperty__Group__7__Impl rule__FactProperty__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__FactProperty__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__Group__7"


    // $ANTLR start "rule__FactProperty__Group__7__Impl"
    // InternalAdaptUI.g:4588:1: rule__FactProperty__Group__7__Impl : ( ( rule__FactProperty__ValueAssignment_7 ) ) ;
    public final void rule__FactProperty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4592:1: ( ( ( rule__FactProperty__ValueAssignment_7 ) ) )
            // InternalAdaptUI.g:4593:1: ( ( rule__FactProperty__ValueAssignment_7 ) )
            {
            // InternalAdaptUI.g:4593:1: ( ( rule__FactProperty__ValueAssignment_7 ) )
            // InternalAdaptUI.g:4594:2: ( rule__FactProperty__ValueAssignment_7 )
            {
             before(grammarAccess.getFactPropertyAccess().getValueAssignment_7()); 
            // InternalAdaptUI.g:4595:2: ( rule__FactProperty__ValueAssignment_7 )
            // InternalAdaptUI.g:4595:3: rule__FactProperty__ValueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__ValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFactPropertyAccess().getValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__Group__7__Impl"


    // $ANTLR start "rule__FactProperty__Group__8"
    // InternalAdaptUI.g:4603:1: rule__FactProperty__Group__8 : rule__FactProperty__Group__8__Impl ;
    public final void rule__FactProperty__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4607:1: ( rule__FactProperty__Group__8__Impl )
            // InternalAdaptUI.g:4608:2: rule__FactProperty__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactProperty__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__Group__8"


    // $ANTLR start "rule__FactProperty__Group__8__Impl"
    // InternalAdaptUI.g:4614:1: rule__FactProperty__Group__8__Impl : ( ')' ) ;
    public final void rule__FactProperty__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4618:1: ( ( ')' ) )
            // InternalAdaptUI.g:4619:1: ( ')' )
            {
            // InternalAdaptUI.g:4619:1: ( ')' )
            // InternalAdaptUI.g:4620:2: ')'
            {
             before(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_8()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__Group__8__Impl"


    // $ANTLR start "rule__Actions__Group__0"
    // InternalAdaptUI.g:4630:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4634:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalAdaptUI.g:4635:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
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
    // InternalAdaptUI.g:4642:1: rule__Actions__Group__0__Impl : ( ( rule__Actions__ActionAssignment_0 ) ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4646:1: ( ( ( rule__Actions__ActionAssignment_0 ) ) )
            // InternalAdaptUI.g:4647:1: ( ( rule__Actions__ActionAssignment_0 ) )
            {
            // InternalAdaptUI.g:4647:1: ( ( rule__Actions__ActionAssignment_0 ) )
            // InternalAdaptUI.g:4648:2: ( rule__Actions__ActionAssignment_0 )
            {
             before(grammarAccess.getActionsAccess().getActionAssignment_0()); 
            // InternalAdaptUI.g:4649:2: ( rule__Actions__ActionAssignment_0 )
            // InternalAdaptUI.g:4649:3: rule__Actions__ActionAssignment_0
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
    // InternalAdaptUI.g:4657:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4661:1: ( rule__Actions__Group__1__Impl )
            // InternalAdaptUI.g:4662:2: rule__Actions__Group__1__Impl
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
    // InternalAdaptUI.g:4668:1: rule__Actions__Group__1__Impl : ( ( rule__Actions__NextAssignment_1 )? ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4672:1: ( ( ( rule__Actions__NextAssignment_1 )? ) )
            // InternalAdaptUI.g:4673:1: ( ( rule__Actions__NextAssignment_1 )? )
            {
            // InternalAdaptUI.g:4673:1: ( ( rule__Actions__NextAssignment_1 )? )
            // InternalAdaptUI.g:4674:2: ( rule__Actions__NextAssignment_1 )?
            {
             before(grammarAccess.getActionsAccess().getNextAssignment_1()); 
            // InternalAdaptUI.g:4675:2: ( rule__Actions__NextAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44||(LA25_0>=46 && LA25_0<=60)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptUI.g:4675:3: rule__Actions__NextAssignment_1
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
    // InternalAdaptUI.g:4684:1: rule__ServiceFunctionCallOperation__Group__0 : rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 ;
    public final void rule__ServiceFunctionCallOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4688:1: ( rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 )
            // InternalAdaptUI.g:4689:2: rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1
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
    // InternalAdaptUI.g:4696:1: rule__ServiceFunctionCallOperation__Group__0__Impl : ( 'functionCall' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4700:1: ( ( 'functionCall' ) )
            // InternalAdaptUI.g:4701:1: ( 'functionCall' )
            {
            // InternalAdaptUI.g:4701:1: ( 'functionCall' )
            // InternalAdaptUI.g:4702:2: 'functionCall'
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
    // InternalAdaptUI.g:4711:1: rule__ServiceFunctionCallOperation__Group__1 : rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 ;
    public final void rule__ServiceFunctionCallOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4715:1: ( rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 )
            // InternalAdaptUI.g:4716:2: rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2
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
    // InternalAdaptUI.g:4723:1: rule__ServiceFunctionCallOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4727:1: ( ( '(' ) )
            // InternalAdaptUI.g:4728:1: ( '(' )
            {
            // InternalAdaptUI.g:4728:1: ( '(' )
            // InternalAdaptUI.g:4729:2: '('
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:4738:1: rule__ServiceFunctionCallOperation__Group__2 : rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 ;
    public final void rule__ServiceFunctionCallOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4742:1: ( rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 )
            // InternalAdaptUI.g:4743:2: rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:4750:1: rule__ServiceFunctionCallOperation__Group__2__Impl : ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4754:1: ( ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) )
            // InternalAdaptUI.g:4755:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            {
            // InternalAdaptUI.g:4755:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            // InternalAdaptUI.g:4756:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getServiceAssignment_2()); 
            // InternalAdaptUI.g:4757:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            // InternalAdaptUI.g:4757:3: rule__ServiceFunctionCallOperation__ServiceAssignment_2
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
    // InternalAdaptUI.g:4765:1: rule__ServiceFunctionCallOperation__Group__3 : rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 ;
    public final void rule__ServiceFunctionCallOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4769:1: ( rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 )
            // InternalAdaptUI.g:4770:2: rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4
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
    // InternalAdaptUI.g:4777:1: rule__ServiceFunctionCallOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4781:1: ( ( ',' ) )
            // InternalAdaptUI.g:4782:1: ( ',' )
            {
            // InternalAdaptUI.g:4782:1: ( ',' )
            // InternalAdaptUI.g:4783:2: ','
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
    // InternalAdaptUI.g:4792:1: rule__ServiceFunctionCallOperation__Group__4 : rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 ;
    public final void rule__ServiceFunctionCallOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4796:1: ( rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 )
            // InternalAdaptUI.g:4797:2: rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:4804:1: rule__ServiceFunctionCallOperation__Group__4__Impl : ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4808:1: ( ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) )
            // InternalAdaptUI.g:4809:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            {
            // InternalAdaptUI.g:4809:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            // InternalAdaptUI.g:4810:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionAssignment_4()); 
            // InternalAdaptUI.g:4811:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            // InternalAdaptUI.g:4811:3: rule__ServiceFunctionCallOperation__FunctionAssignment_4
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
    // InternalAdaptUI.g:4819:1: rule__ServiceFunctionCallOperation__Group__5 : rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 ;
    public final void rule__ServiceFunctionCallOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4823:1: ( rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 )
            // InternalAdaptUI.g:4824:2: rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptUI.g:4831:1: rule__ServiceFunctionCallOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4835:1: ( ( ',' ) )
            // InternalAdaptUI.g:4836:1: ( ',' )
            {
            // InternalAdaptUI.g:4836:1: ( ',' )
            // InternalAdaptUI.g:4837:2: ','
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
    // InternalAdaptUI.g:4846:1: rule__ServiceFunctionCallOperation__Group__6 : rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 ;
    public final void rule__ServiceFunctionCallOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4850:1: ( rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 )
            // InternalAdaptUI.g:4851:2: rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7
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
    // InternalAdaptUI.g:4858:1: rule__ServiceFunctionCallOperation__Group__6__Impl : ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4862:1: ( ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) )
            // InternalAdaptUI.g:4863:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            {
            // InternalAdaptUI.g:4863:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            // InternalAdaptUI.g:4864:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getValAssignment_6()); 
            // InternalAdaptUI.g:4865:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            // InternalAdaptUI.g:4865:3: rule__ServiceFunctionCallOperation__ValAssignment_6
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
    // InternalAdaptUI.g:4873:1: rule__ServiceFunctionCallOperation__Group__7 : rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 ;
    public final void rule__ServiceFunctionCallOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4877:1: ( rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 )
            // InternalAdaptUI.g:4878:2: rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:4885:1: rule__ServiceFunctionCallOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4889:1: ( ( ')' ) )
            // InternalAdaptUI.g:4890:1: ( ')' )
            {
            // InternalAdaptUI.g:4890:1: ( ')' )
            // InternalAdaptUI.g:4891:2: ')'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:4900:1: rule__ServiceFunctionCallOperation__Group__8 : rule__ServiceFunctionCallOperation__Group__8__Impl ;
    public final void rule__ServiceFunctionCallOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4904:1: ( rule__ServiceFunctionCallOperation__Group__8__Impl )
            // InternalAdaptUI.g:4905:2: rule__ServiceFunctionCallOperation__Group__8__Impl
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
    // InternalAdaptUI.g:4911:1: rule__ServiceFunctionCallOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4915:1: ( ( ';' ) )
            // InternalAdaptUI.g:4916:1: ( ';' )
            {
            // InternalAdaptUI.g:4916:1: ( ';' )
            // InternalAdaptUI.g:4917:2: ';'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:4927:1: rule__EditFactOperation__Group__0 : rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 ;
    public final void rule__EditFactOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4931:1: ( rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 )
            // InternalAdaptUI.g:4932:2: rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1
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
    // InternalAdaptUI.g:4939:1: rule__EditFactOperation__Group__0__Impl : ( 'editFact' ) ;
    public final void rule__EditFactOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4943:1: ( ( 'editFact' ) )
            // InternalAdaptUI.g:4944:1: ( 'editFact' )
            {
            // InternalAdaptUI.g:4944:1: ( 'editFact' )
            // InternalAdaptUI.g:4945:2: 'editFact'
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
    // InternalAdaptUI.g:4954:1: rule__EditFactOperation__Group__1 : rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 ;
    public final void rule__EditFactOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4958:1: ( rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 )
            // InternalAdaptUI.g:4959:2: rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2
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
    // InternalAdaptUI.g:4966:1: rule__EditFactOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EditFactOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4970:1: ( ( '(' ) )
            // InternalAdaptUI.g:4971:1: ( '(' )
            {
            // InternalAdaptUI.g:4971:1: ( '(' )
            // InternalAdaptUI.g:4972:2: '('
            {
             before(grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:4981:1: rule__EditFactOperation__Group__2 : rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 ;
    public final void rule__EditFactOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4985:1: ( rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 )
            // InternalAdaptUI.g:4986:2: rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptUI.g:4993:1: rule__EditFactOperation__Group__2__Impl : ( ( rule__EditFactOperation__PropAssignment_2 ) ) ;
    public final void rule__EditFactOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:4997:1: ( ( ( rule__EditFactOperation__PropAssignment_2 ) ) )
            // InternalAdaptUI.g:4998:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            {
            // InternalAdaptUI.g:4998:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            // InternalAdaptUI.g:4999:2: ( rule__EditFactOperation__PropAssignment_2 )
            {
             before(grammarAccess.getEditFactOperationAccess().getPropAssignment_2()); 
            // InternalAdaptUI.g:5000:2: ( rule__EditFactOperation__PropAssignment_2 )
            // InternalAdaptUI.g:5000:3: rule__EditFactOperation__PropAssignment_2
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
    // InternalAdaptUI.g:5008:1: rule__EditFactOperation__Group__3 : rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 ;
    public final void rule__EditFactOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5012:1: ( rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 )
            // InternalAdaptUI.g:5013:2: rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptUI.g:5020:1: rule__EditFactOperation__Group__3__Impl : ( ( rule__EditFactOperation__Group_3__0 )? ) ;
    public final void rule__EditFactOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5024:1: ( ( ( rule__EditFactOperation__Group_3__0 )? ) )
            // InternalAdaptUI.g:5025:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            {
            // InternalAdaptUI.g:5025:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            // InternalAdaptUI.g:5026:2: ( rule__EditFactOperation__Group_3__0 )?
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup_3()); 
            // InternalAdaptUI.g:5027:2: ( rule__EditFactOperation__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptUI.g:5027:3: rule__EditFactOperation__Group_3__0
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
    // InternalAdaptUI.g:5035:1: rule__EditFactOperation__Group__4 : rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 ;
    public final void rule__EditFactOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5039:1: ( rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 )
            // InternalAdaptUI.g:5040:2: rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:5047:1: rule__EditFactOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__EditFactOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5051:1: ( ( ')' ) )
            // InternalAdaptUI.g:5052:1: ( ')' )
            {
            // InternalAdaptUI.g:5052:1: ( ')' )
            // InternalAdaptUI.g:5053:2: ')'
            {
             before(grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:5062:1: rule__EditFactOperation__Group__5 : rule__EditFactOperation__Group__5__Impl ;
    public final void rule__EditFactOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5066:1: ( rule__EditFactOperation__Group__5__Impl )
            // InternalAdaptUI.g:5067:2: rule__EditFactOperation__Group__5__Impl
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
    // InternalAdaptUI.g:5073:1: rule__EditFactOperation__Group__5__Impl : ( ';' ) ;
    public final void rule__EditFactOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5077:1: ( ( ';' ) )
            // InternalAdaptUI.g:5078:1: ( ';' )
            {
            // InternalAdaptUI.g:5078:1: ( ';' )
            // InternalAdaptUI.g:5079:2: ';'
            {
             before(grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:5089:1: rule__EditFactOperation__Group_3__0 : rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 ;
    public final void rule__EditFactOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5093:1: ( rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 )
            // InternalAdaptUI.g:5094:2: rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptUI.g:5101:1: rule__EditFactOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EditFactOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5105:1: ( ( ',' ) )
            // InternalAdaptUI.g:5106:1: ( ',' )
            {
            // InternalAdaptUI.g:5106:1: ( ',' )
            // InternalAdaptUI.g:5107:2: ','
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
    // InternalAdaptUI.g:5116:1: rule__EditFactOperation__Group_3__1 : rule__EditFactOperation__Group_3__1__Impl ;
    public final void rule__EditFactOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5120:1: ( rule__EditFactOperation__Group_3__1__Impl )
            // InternalAdaptUI.g:5121:2: rule__EditFactOperation__Group_3__1__Impl
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
    // InternalAdaptUI.g:5127:1: rule__EditFactOperation__Group_3__1__Impl : ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) ;
    public final void rule__EditFactOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5131:1: ( ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) )
            // InternalAdaptUI.g:5132:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            {
            // InternalAdaptUI.g:5132:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            // InternalAdaptUI.g:5133:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            {
             before(grammarAccess.getEditFactOperationAccess().getValAssignment_3_1()); 
            // InternalAdaptUI.g:5134:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            // InternalAdaptUI.g:5134:3: rule__EditFactOperation__ValAssignment_3_1
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
    // InternalAdaptUI.g:5143:1: rule__SetDisplayPropertyOperation__Group__0 : rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 ;
    public final void rule__SetDisplayPropertyOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5147:1: ( rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 )
            // InternalAdaptUI.g:5148:2: rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1
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
    // InternalAdaptUI.g:5155:1: rule__SetDisplayPropertyOperation__Group__0__Impl : ( 'setDisplayProperty' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5159:1: ( ( 'setDisplayProperty' ) )
            // InternalAdaptUI.g:5160:1: ( 'setDisplayProperty' )
            {
            // InternalAdaptUI.g:5160:1: ( 'setDisplayProperty' )
            // InternalAdaptUI.g:5161:2: 'setDisplayProperty'
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
    // InternalAdaptUI.g:5170:1: rule__SetDisplayPropertyOperation__Group__1 : rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 ;
    public final void rule__SetDisplayPropertyOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5174:1: ( rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 )
            // InternalAdaptUI.g:5175:2: rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:5182:1: rule__SetDisplayPropertyOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5186:1: ( ( '(' ) )
            // InternalAdaptUI.g:5187:1: ( '(' )
            {
            // InternalAdaptUI.g:5187:1: ( '(' )
            // InternalAdaptUI.g:5188:2: '('
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:5197:1: rule__SetDisplayPropertyOperation__Group__2 : rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 ;
    public final void rule__SetDisplayPropertyOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5201:1: ( rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 )
            // InternalAdaptUI.g:5202:2: rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:5209:1: rule__SetDisplayPropertyOperation__Group__2__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5213:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) )
            // InternalAdaptUI.g:5214:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            {
            // InternalAdaptUI.g:5214:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            // InternalAdaptUI.g:5215:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyAssignment_2()); 
            // InternalAdaptUI.g:5216:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            // InternalAdaptUI.g:5216:3: rule__SetDisplayPropertyOperation__PropertyAssignment_2
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
    // InternalAdaptUI.g:5224:1: rule__SetDisplayPropertyOperation__Group__3 : rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 ;
    public final void rule__SetDisplayPropertyOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5228:1: ( rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 )
            // InternalAdaptUI.g:5229:2: rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptUI.g:5236:1: rule__SetDisplayPropertyOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5240:1: ( ( ',' ) )
            // InternalAdaptUI.g:5241:1: ( ',' )
            {
            // InternalAdaptUI.g:5241:1: ( ',' )
            // InternalAdaptUI.g:5242:2: ','
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
    // InternalAdaptUI.g:5251:1: rule__SetDisplayPropertyOperation__Group__4 : rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 ;
    public final void rule__SetDisplayPropertyOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5255:1: ( rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 )
            // InternalAdaptUI.g:5256:2: rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5
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
    // InternalAdaptUI.g:5263:1: rule__SetDisplayPropertyOperation__Group__4__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5267:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) )
            // InternalAdaptUI.g:5268:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            {
            // InternalAdaptUI.g:5268:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            // InternalAdaptUI.g:5269:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueAssignment_4()); 
            // InternalAdaptUI.g:5270:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            // InternalAdaptUI.g:5270:3: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4
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
    // InternalAdaptUI.g:5278:1: rule__SetDisplayPropertyOperation__Group__5 : rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 ;
    public final void rule__SetDisplayPropertyOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5282:1: ( rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 )
            // InternalAdaptUI.g:5283:2: rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:5290:1: rule__SetDisplayPropertyOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5294:1: ( ( ')' ) )
            // InternalAdaptUI.g:5295:1: ( ')' )
            {
            // InternalAdaptUI.g:5295:1: ( ')' )
            // InternalAdaptUI.g:5296:2: ')'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:5305:1: rule__SetDisplayPropertyOperation__Group__6 : rule__SetDisplayPropertyOperation__Group__6__Impl ;
    public final void rule__SetDisplayPropertyOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5309:1: ( rule__SetDisplayPropertyOperation__Group__6__Impl )
            // InternalAdaptUI.g:5310:2: rule__SetDisplayPropertyOperation__Group__6__Impl
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
    // InternalAdaptUI.g:5316:1: rule__SetDisplayPropertyOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5320:1: ( ( ';' ) )
            // InternalAdaptUI.g:5321:1: ( ';' )
            {
            // InternalAdaptUI.g:5321:1: ( ';' )
            // InternalAdaptUI.g:5322:2: ';'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:5332:1: rule__AddViewComponentOperation__Group__0 : rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 ;
    public final void rule__AddViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5336:1: ( rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 )
            // InternalAdaptUI.g:5337:2: rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1
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
    // InternalAdaptUI.g:5344:1: rule__AddViewComponentOperation__Group__0__Impl : ( 'addViewComponent' ) ;
    public final void rule__AddViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5348:1: ( ( 'addViewComponent' ) )
            // InternalAdaptUI.g:5349:1: ( 'addViewComponent' )
            {
            // InternalAdaptUI.g:5349:1: ( 'addViewComponent' )
            // InternalAdaptUI.g:5350:2: 'addViewComponent'
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
    // InternalAdaptUI.g:5359:1: rule__AddViewComponentOperation__Group__1 : rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 ;
    public final void rule__AddViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5363:1: ( rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 )
            // InternalAdaptUI.g:5364:2: rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2
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
    // InternalAdaptUI.g:5371:1: rule__AddViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5375:1: ( ( '(' ) )
            // InternalAdaptUI.g:5376:1: ( '(' )
            {
            // InternalAdaptUI.g:5376:1: ( '(' )
            // InternalAdaptUI.g:5377:2: '('
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:5386:1: rule__AddViewComponentOperation__Group__2 : rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 ;
    public final void rule__AddViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5390:1: ( rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 )
            // InternalAdaptUI.g:5391:2: rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:5398:1: rule__AddViewComponentOperation__Group__2__Impl : ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5402:1: ( ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptUI.g:5403:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptUI.g:5403:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptUI.g:5404:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptUI.g:5405:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptUI.g:5405:3: rule__AddViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptUI.g:5413:1: rule__AddViewComponentOperation__Group__3 : rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 ;
    public final void rule__AddViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5417:1: ( rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 )
            // InternalAdaptUI.g:5418:2: rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4
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
    // InternalAdaptUI.g:5425:1: rule__AddViewComponentOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5429:1: ( ( ',' ) )
            // InternalAdaptUI.g:5430:1: ( ',' )
            {
            // InternalAdaptUI.g:5430:1: ( ',' )
            // InternalAdaptUI.g:5431:2: ','
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
    // InternalAdaptUI.g:5440:1: rule__AddViewComponentOperation__Group__4 : rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 ;
    public final void rule__AddViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5444:1: ( rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 )
            // InternalAdaptUI.g:5445:2: rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5
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
    // InternalAdaptUI.g:5452:1: rule__AddViewComponentOperation__Group__4__Impl : ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) ;
    public final void rule__AddViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5456:1: ( ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) )
            // InternalAdaptUI.g:5457:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            {
            // InternalAdaptUI.g:5457:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            // InternalAdaptUI.g:5458:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetAssignment_4()); 
            // InternalAdaptUI.g:5459:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            // InternalAdaptUI.g:5459:3: rule__AddViewComponentOperation__TargetAssignment_4
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
    // InternalAdaptUI.g:5467:1: rule__AddViewComponentOperation__Group__5 : rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 ;
    public final void rule__AddViewComponentOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5471:1: ( rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 )
            // InternalAdaptUI.g:5472:2: rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:5479:1: rule__AddViewComponentOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddViewComponentOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5483:1: ( ( ')' ) )
            // InternalAdaptUI.g:5484:1: ( ')' )
            {
            // InternalAdaptUI.g:5484:1: ( ')' )
            // InternalAdaptUI.g:5485:2: ')'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:5494:1: rule__AddViewComponentOperation__Group__6 : rule__AddViewComponentOperation__Group__6__Impl ;
    public final void rule__AddViewComponentOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5498:1: ( rule__AddViewComponentOperation__Group__6__Impl )
            // InternalAdaptUI.g:5499:2: rule__AddViewComponentOperation__Group__6__Impl
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
    // InternalAdaptUI.g:5505:1: rule__AddViewComponentOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddViewComponentOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5509:1: ( ( ';' ) )
            // InternalAdaptUI.g:5510:1: ( ';' )
            {
            // InternalAdaptUI.g:5510:1: ( ';' )
            // InternalAdaptUI.g:5511:2: ';'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:5521:1: rule__DeleteViewComponentOperation__Group__0 : rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 ;
    public final void rule__DeleteViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5525:1: ( rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 )
            // InternalAdaptUI.g:5526:2: rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1
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
    // InternalAdaptUI.g:5533:1: rule__DeleteViewComponentOperation__Group__0__Impl : ( 'deleteViewComponent' ) ;
    public final void rule__DeleteViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5537:1: ( ( 'deleteViewComponent' ) )
            // InternalAdaptUI.g:5538:1: ( 'deleteViewComponent' )
            {
            // InternalAdaptUI.g:5538:1: ( 'deleteViewComponent' )
            // InternalAdaptUI.g:5539:2: 'deleteViewComponent'
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
    // InternalAdaptUI.g:5548:1: rule__DeleteViewComponentOperation__Group__1 : rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 ;
    public final void rule__DeleteViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5552:1: ( rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 )
            // InternalAdaptUI.g:5553:2: rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2
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
    // InternalAdaptUI.g:5560:1: rule__DeleteViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5564:1: ( ( '(' ) )
            // InternalAdaptUI.g:5565:1: ( '(' )
            {
            // InternalAdaptUI.g:5565:1: ( '(' )
            // InternalAdaptUI.g:5566:2: '('
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:5575:1: rule__DeleteViewComponentOperation__Group__2 : rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 ;
    public final void rule__DeleteViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5579:1: ( rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 )
            // InternalAdaptUI.g:5580:2: rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3
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
    // InternalAdaptUI.g:5587:1: rule__DeleteViewComponentOperation__Group__2__Impl : ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5591:1: ( ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptUI.g:5592:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptUI.g:5592:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptUI.g:5593:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptUI.g:5594:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptUI.g:5594:3: rule__DeleteViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptUI.g:5602:1: rule__DeleteViewComponentOperation__Group__3 : rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 ;
    public final void rule__DeleteViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5606:1: ( rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 )
            // InternalAdaptUI.g:5607:2: rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:5614:1: rule__DeleteViewComponentOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5618:1: ( ( ')' ) )
            // InternalAdaptUI.g:5619:1: ( ')' )
            {
            // InternalAdaptUI.g:5619:1: ( ')' )
            // InternalAdaptUI.g:5620:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:5629:1: rule__DeleteViewComponentOperation__Group__4 : rule__DeleteViewComponentOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5633:1: ( rule__DeleteViewComponentOperation__Group__4__Impl )
            // InternalAdaptUI.g:5634:2: rule__DeleteViewComponentOperation__Group__4__Impl
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
    // InternalAdaptUI.g:5640:1: rule__DeleteViewComponentOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5644:1: ( ( ';' ) )
            // InternalAdaptUI.g:5645:1: ( ';' )
            {
            // InternalAdaptUI.g:5645:1: ( ';' )
            // InternalAdaptUI.g:5646:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:5656:1: rule__AddViewComponentButtonOperation__Group__0 : rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 ;
    public final void rule__AddViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5660:1: ( rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 )
            // InternalAdaptUI.g:5661:2: rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1
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
    // InternalAdaptUI.g:5668:1: rule__AddViewComponentButtonOperation__Group__0__Impl : ( 'addViewComponentButton' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5672:1: ( ( 'addViewComponentButton' ) )
            // InternalAdaptUI.g:5673:1: ( 'addViewComponentButton' )
            {
            // InternalAdaptUI.g:5673:1: ( 'addViewComponentButton' )
            // InternalAdaptUI.g:5674:2: 'addViewComponentButton'
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
    // InternalAdaptUI.g:5683:1: rule__AddViewComponentButtonOperation__Group__1 : rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 ;
    public final void rule__AddViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5687:1: ( rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 )
            // InternalAdaptUI.g:5688:2: rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:5695:1: rule__AddViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5699:1: ( ( '(' ) )
            // InternalAdaptUI.g:5700:1: ( '(' )
            {
            // InternalAdaptUI.g:5700:1: ( '(' )
            // InternalAdaptUI.g:5701:2: '('
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:5710:1: rule__AddViewComponentButtonOperation__Group__2 : rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 ;
    public final void rule__AddViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5714:1: ( rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 )
            // InternalAdaptUI.g:5715:2: rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:5722:1: rule__AddViewComponentButtonOperation__Group__2__Impl : ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5726:1: ( ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptUI.g:5727:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptUI.g:5727:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptUI.g:5728:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptUI.g:5729:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptUI.g:5729:3: rule__AddViewComponentButtonOperation__IdAssignment_2
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
    // InternalAdaptUI.g:5737:1: rule__AddViewComponentButtonOperation__Group__3 : rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 ;
    public final void rule__AddViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5741:1: ( rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 )
            // InternalAdaptUI.g:5742:2: rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:5749:1: rule__AddViewComponentButtonOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5753:1: ( ( ',' ) )
            // InternalAdaptUI.g:5754:1: ( ',' )
            {
            // InternalAdaptUI.g:5754:1: ( ',' )
            // InternalAdaptUI.g:5755:2: ','
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
    // InternalAdaptUI.g:5764:1: rule__AddViewComponentButtonOperation__Group__4 : rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 ;
    public final void rule__AddViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5768:1: ( rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 )
            // InternalAdaptUI.g:5769:2: rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:5776:1: rule__AddViewComponentButtonOperation__Group__4__Impl : ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5780:1: ( ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) )
            // InternalAdaptUI.g:5781:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            {
            // InternalAdaptUI.g:5781:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            // InternalAdaptUI.g:5782:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeyAssignment_4()); 
            // InternalAdaptUI.g:5783:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            // InternalAdaptUI.g:5783:3: rule__AddViewComponentButtonOperation__LangKeyAssignment_4
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
    // InternalAdaptUI.g:5791:1: rule__AddViewComponentButtonOperation__Group__5 : rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 ;
    public final void rule__AddViewComponentButtonOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5795:1: ( rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 )
            // InternalAdaptUI.g:5796:2: rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:5803:1: rule__AddViewComponentButtonOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5807:1: ( ( ',' ) )
            // InternalAdaptUI.g:5808:1: ( ',' )
            {
            // InternalAdaptUI.g:5808:1: ( ',' )
            // InternalAdaptUI.g:5809:2: ','
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
    // InternalAdaptUI.g:5818:1: rule__AddViewComponentButtonOperation__Group__6 : rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 ;
    public final void rule__AddViewComponentButtonOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5822:1: ( rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 )
            // InternalAdaptUI.g:5823:2: rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7
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
    // InternalAdaptUI.g:5830:1: rule__AddViewComponentButtonOperation__Group__6__Impl : ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5834:1: ( ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) )
            // InternalAdaptUI.g:5835:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            {
            // InternalAdaptUI.g:5835:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            // InternalAdaptUI.g:5836:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getActionAssignment_6()); 
            // InternalAdaptUI.g:5837:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            // InternalAdaptUI.g:5837:3: rule__AddViewComponentButtonOperation__ActionAssignment_6
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
    // InternalAdaptUI.g:5845:1: rule__AddViewComponentButtonOperation__Group__7 : rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 ;
    public final void rule__AddViewComponentButtonOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5849:1: ( rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 )
            // InternalAdaptUI.g:5850:2: rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:5857:1: rule__AddViewComponentButtonOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5861:1: ( ( ')' ) )
            // InternalAdaptUI.g:5862:1: ( ')' )
            {
            // InternalAdaptUI.g:5862:1: ( ')' )
            // InternalAdaptUI.g:5863:2: ')'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:5872:1: rule__AddViewComponentButtonOperation__Group__8 : rule__AddViewComponentButtonOperation__Group__8__Impl ;
    public final void rule__AddViewComponentButtonOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5876:1: ( rule__AddViewComponentButtonOperation__Group__8__Impl )
            // InternalAdaptUI.g:5877:2: rule__AddViewComponentButtonOperation__Group__8__Impl
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
    // InternalAdaptUI.g:5883:1: rule__AddViewComponentButtonOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5887:1: ( ( ';' ) )
            // InternalAdaptUI.g:5888:1: ( ';' )
            {
            // InternalAdaptUI.g:5888:1: ( ';' )
            // InternalAdaptUI.g:5889:2: ';'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getSemicolonKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:5899:1: rule__DeleteViewComponentButtonOperation__Group__0 : rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5903:1: ( rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 )
            // InternalAdaptUI.g:5904:2: rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1
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
    // InternalAdaptUI.g:5911:1: rule__DeleteViewComponentButtonOperation__Group__0__Impl : ( 'deleteViewComponentButton' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5915:1: ( ( 'deleteViewComponentButton' ) )
            // InternalAdaptUI.g:5916:1: ( 'deleteViewComponentButton' )
            {
            // InternalAdaptUI.g:5916:1: ( 'deleteViewComponentButton' )
            // InternalAdaptUI.g:5917:2: 'deleteViewComponentButton'
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
    // InternalAdaptUI.g:5926:1: rule__DeleteViewComponentButtonOperation__Group__1 : rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5930:1: ( rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 )
            // InternalAdaptUI.g:5931:2: rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:5938:1: rule__DeleteViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5942:1: ( ( '(' ) )
            // InternalAdaptUI.g:5943:1: ( '(' )
            {
            // InternalAdaptUI.g:5943:1: ( '(' )
            // InternalAdaptUI.g:5944:2: '('
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:5953:1: rule__DeleteViewComponentButtonOperation__Group__2 : rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5957:1: ( rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 )
            // InternalAdaptUI.g:5958:2: rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3
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
    // InternalAdaptUI.g:5965:1: rule__DeleteViewComponentButtonOperation__Group__2__Impl : ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5969:1: ( ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptUI.g:5970:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptUI.g:5970:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptUI.g:5971:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptUI.g:5972:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptUI.g:5972:3: rule__DeleteViewComponentButtonOperation__IdAssignment_2
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
    // InternalAdaptUI.g:5980:1: rule__DeleteViewComponentButtonOperation__Group__3 : rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5984:1: ( rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 )
            // InternalAdaptUI.g:5985:2: rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:5992:1: rule__DeleteViewComponentButtonOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:5996:1: ( ( ')' ) )
            // InternalAdaptUI.g:5997:1: ( ')' )
            {
            // InternalAdaptUI.g:5997:1: ( ')' )
            // InternalAdaptUI.g:5998:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:6007:1: rule__DeleteViewComponentButtonOperation__Group__4 : rule__DeleteViewComponentButtonOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6011:1: ( rule__DeleteViewComponentButtonOperation__Group__4__Impl )
            // InternalAdaptUI.g:6012:2: rule__DeleteViewComponentButtonOperation__Group__4__Impl
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
    // InternalAdaptUI.g:6018:1: rule__DeleteViewComponentButtonOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6022:1: ( ( ';' ) )
            // InternalAdaptUI.g:6023:1: ( ';' )
            {
            // InternalAdaptUI.g:6023:1: ( ';' )
            // InternalAdaptUI.g:6024:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6034:1: rule__AddNavLinkOperation__Group__0 : rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 ;
    public final void rule__AddNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6038:1: ( rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 )
            // InternalAdaptUI.g:6039:2: rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1
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
    // InternalAdaptUI.g:6046:1: rule__AddNavLinkOperation__Group__0__Impl : ( 'addNavLink' ) ;
    public final void rule__AddNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6050:1: ( ( 'addNavLink' ) )
            // InternalAdaptUI.g:6051:1: ( 'addNavLink' )
            {
            // InternalAdaptUI.g:6051:1: ( 'addNavLink' )
            // InternalAdaptUI.g:6052:2: 'addNavLink'
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
    // InternalAdaptUI.g:6061:1: rule__AddNavLinkOperation__Group__1 : rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 ;
    public final void rule__AddNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6065:1: ( rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 )
            // InternalAdaptUI.g:6066:2: rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2
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
    // InternalAdaptUI.g:6073:1: rule__AddNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6077:1: ( ( '(' ) )
            // InternalAdaptUI.g:6078:1: ( '(' )
            {
            // InternalAdaptUI.g:6078:1: ( '(' )
            // InternalAdaptUI.g:6079:2: '('
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:6088:1: rule__AddNavLinkOperation__Group__2 : rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 ;
    public final void rule__AddNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6092:1: ( rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 )
            // InternalAdaptUI.g:6093:2: rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:6100:1: rule__AddNavLinkOperation__Group__2__Impl : ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6104:1: ( ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptUI.g:6105:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptUI.g:6105:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptUI.g:6106:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptUI.g:6107:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptUI.g:6107:3: rule__AddNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptUI.g:6115:1: rule__AddNavLinkOperation__Group__3 : rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 ;
    public final void rule__AddNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6119:1: ( rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 )
            // InternalAdaptUI.g:6120:2: rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:6127:1: rule__AddNavLinkOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6131:1: ( ( ',' ) )
            // InternalAdaptUI.g:6132:1: ( ',' )
            {
            // InternalAdaptUI.g:6132:1: ( ',' )
            // InternalAdaptUI.g:6133:2: ','
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
    // InternalAdaptUI.g:6142:1: rule__AddNavLinkOperation__Group__4 : rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 ;
    public final void rule__AddNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6146:1: ( rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 )
            // InternalAdaptUI.g:6147:2: rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5
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
    // InternalAdaptUI.g:6154:1: rule__AddNavLinkOperation__Group__4__Impl : ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) ;
    public final void rule__AddNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6158:1: ( ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) )
            // InternalAdaptUI.g:6159:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            {
            // InternalAdaptUI.g:6159:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            // InternalAdaptUI.g:6160:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextAssignment_4()); 
            // InternalAdaptUI.g:6161:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            // InternalAdaptUI.g:6161:3: rule__AddNavLinkOperation__TextAssignment_4
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
    // InternalAdaptUI.g:6169:1: rule__AddNavLinkOperation__Group__5 : rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 ;
    public final void rule__AddNavLinkOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6173:1: ( rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 )
            // InternalAdaptUI.g:6174:2: rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:6181:1: rule__AddNavLinkOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddNavLinkOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6185:1: ( ( ')' ) )
            // InternalAdaptUI.g:6186:1: ( ')' )
            {
            // InternalAdaptUI.g:6186:1: ( ')' )
            // InternalAdaptUI.g:6187:2: ')'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:6196:1: rule__AddNavLinkOperation__Group__6 : rule__AddNavLinkOperation__Group__6__Impl ;
    public final void rule__AddNavLinkOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6200:1: ( rule__AddNavLinkOperation__Group__6__Impl )
            // InternalAdaptUI.g:6201:2: rule__AddNavLinkOperation__Group__6__Impl
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
    // InternalAdaptUI.g:6207:1: rule__AddNavLinkOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddNavLinkOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6211:1: ( ( ';' ) )
            // InternalAdaptUI.g:6212:1: ( ';' )
            {
            // InternalAdaptUI.g:6212:1: ( ';' )
            // InternalAdaptUI.g:6213:2: ';'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6223:1: rule__DeleteNavLinkOperation__Group__0 : rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 ;
    public final void rule__DeleteNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6227:1: ( rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 )
            // InternalAdaptUI.g:6228:2: rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1
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
    // InternalAdaptUI.g:6235:1: rule__DeleteNavLinkOperation__Group__0__Impl : ( 'deleteNavLink' ) ;
    public final void rule__DeleteNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6239:1: ( ( 'deleteNavLink' ) )
            // InternalAdaptUI.g:6240:1: ( 'deleteNavLink' )
            {
            // InternalAdaptUI.g:6240:1: ( 'deleteNavLink' )
            // InternalAdaptUI.g:6241:2: 'deleteNavLink'
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
    // InternalAdaptUI.g:6250:1: rule__DeleteNavLinkOperation__Group__1 : rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 ;
    public final void rule__DeleteNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6254:1: ( rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 )
            // InternalAdaptUI.g:6255:2: rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2
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
    // InternalAdaptUI.g:6262:1: rule__DeleteNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6266:1: ( ( '(' ) )
            // InternalAdaptUI.g:6267:1: ( '(' )
            {
            // InternalAdaptUI.g:6267:1: ( '(' )
            // InternalAdaptUI.g:6268:2: '('
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:6277:1: rule__DeleteNavLinkOperation__Group__2 : rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 ;
    public final void rule__DeleteNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6281:1: ( rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 )
            // InternalAdaptUI.g:6282:2: rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3
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
    // InternalAdaptUI.g:6289:1: rule__DeleteNavLinkOperation__Group__2__Impl : ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6293:1: ( ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptUI.g:6294:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptUI.g:6294:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptUI.g:6295:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptUI.g:6296:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptUI.g:6296:3: rule__DeleteNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptUI.g:6304:1: rule__DeleteNavLinkOperation__Group__3 : rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 ;
    public final void rule__DeleteNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6308:1: ( rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 )
            // InternalAdaptUI.g:6309:2: rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:6316:1: rule__DeleteNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6320:1: ( ( ')' ) )
            // InternalAdaptUI.g:6321:1: ( ')' )
            {
            // InternalAdaptUI.g:6321:1: ( ')' )
            // InternalAdaptUI.g:6322:2: ')'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:6331:1: rule__DeleteNavLinkOperation__Group__4 : rule__DeleteNavLinkOperation__Group__4__Impl ;
    public final void rule__DeleteNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6335:1: ( rule__DeleteNavLinkOperation__Group__4__Impl )
            // InternalAdaptUI.g:6336:2: rule__DeleteNavLinkOperation__Group__4__Impl
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
    // InternalAdaptUI.g:6342:1: rule__DeleteNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6346:1: ( ( ';' ) )
            // InternalAdaptUI.g:6347:1: ( ';' )
            {
            // InternalAdaptUI.g:6347:1: ( ';' )
            // InternalAdaptUI.g:6348:2: ';'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6358:1: rule__RedirectNavLinkOperation__Group__0 : rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 ;
    public final void rule__RedirectNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6362:1: ( rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 )
            // InternalAdaptUI.g:6363:2: rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1
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
    // InternalAdaptUI.g:6370:1: rule__RedirectNavLinkOperation__Group__0__Impl : ( 'redirectNavLink' ) ;
    public final void rule__RedirectNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6374:1: ( ( 'redirectNavLink' ) )
            // InternalAdaptUI.g:6375:1: ( 'redirectNavLink' )
            {
            // InternalAdaptUI.g:6375:1: ( 'redirectNavLink' )
            // InternalAdaptUI.g:6376:2: 'redirectNavLink'
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
    // InternalAdaptUI.g:6385:1: rule__RedirectNavLinkOperation__Group__1 : rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 ;
    public final void rule__RedirectNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6389:1: ( rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 )
            // InternalAdaptUI.g:6390:2: rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2
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
    // InternalAdaptUI.g:6397:1: rule__RedirectNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__RedirectNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6401:1: ( ( '(' ) )
            // InternalAdaptUI.g:6402:1: ( '(' )
            {
            // InternalAdaptUI.g:6402:1: ( '(' )
            // InternalAdaptUI.g:6403:2: '('
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:6412:1: rule__RedirectNavLinkOperation__Group__2 : rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 ;
    public final void rule__RedirectNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6416:1: ( rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 )
            // InternalAdaptUI.g:6417:2: rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3
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
    // InternalAdaptUI.g:6424:1: rule__RedirectNavLinkOperation__Group__2__Impl : ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__RedirectNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6428:1: ( ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptUI.g:6429:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptUI.g:6429:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptUI.g:6430:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptUI.g:6431:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptUI.g:6431:3: rule__RedirectNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptUI.g:6439:1: rule__RedirectNavLinkOperation__Group__3 : rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 ;
    public final void rule__RedirectNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6443:1: ( rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 )
            // InternalAdaptUI.g:6444:2: rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:6451:1: rule__RedirectNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RedirectNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6455:1: ( ( ')' ) )
            // InternalAdaptUI.g:6456:1: ( ')' )
            {
            // InternalAdaptUI.g:6456:1: ( ')' )
            // InternalAdaptUI.g:6457:2: ')'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:6466:1: rule__RedirectNavLinkOperation__Group__4 : rule__RedirectNavLinkOperation__Group__4__Impl ;
    public final void rule__RedirectNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6470:1: ( rule__RedirectNavLinkOperation__Group__4__Impl )
            // InternalAdaptUI.g:6471:2: rule__RedirectNavLinkOperation__Group__4__Impl
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
    // InternalAdaptUI.g:6477:1: rule__RedirectNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__RedirectNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6481:1: ( ( ';' ) )
            // InternalAdaptUI.g:6482:1: ( ';' )
            {
            // InternalAdaptUI.g:6482:1: ( ';' )
            // InternalAdaptUI.g:6483:2: ';'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6493:1: rule__ClearNavOperation__Group__0 : rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 ;
    public final void rule__ClearNavOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6497:1: ( rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 )
            // InternalAdaptUI.g:6498:2: rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdaptUI.g:6505:1: rule__ClearNavOperation__Group__0__Impl : ( () ) ;
    public final void rule__ClearNavOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6509:1: ( ( () ) )
            // InternalAdaptUI.g:6510:1: ( () )
            {
            // InternalAdaptUI.g:6510:1: ( () )
            // InternalAdaptUI.g:6511:2: ()
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0()); 
            // InternalAdaptUI.g:6512:2: ()
            // InternalAdaptUI.g:6512:3: 
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
    // InternalAdaptUI.g:6520:1: rule__ClearNavOperation__Group__1 : rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 ;
    public final void rule__ClearNavOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6524:1: ( rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 )
            // InternalAdaptUI.g:6525:2: rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2
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
    // InternalAdaptUI.g:6532:1: rule__ClearNavOperation__Group__1__Impl : ( 'clearNavigation' ) ;
    public final void rule__ClearNavOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6536:1: ( ( 'clearNavigation' ) )
            // InternalAdaptUI.g:6537:1: ( 'clearNavigation' )
            {
            // InternalAdaptUI.g:6537:1: ( 'clearNavigation' )
            // InternalAdaptUI.g:6538:2: 'clearNavigation'
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
    // InternalAdaptUI.g:6547:1: rule__ClearNavOperation__Group__2 : rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 ;
    public final void rule__ClearNavOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6551:1: ( rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 )
            // InternalAdaptUI.g:6552:2: rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:6559:1: rule__ClearNavOperation__Group__2__Impl : ( '()' ) ;
    public final void rule__ClearNavOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6563:1: ( ( '()' ) )
            // InternalAdaptUI.g:6564:1: ( '()' )
            {
            // InternalAdaptUI.g:6564:1: ( '()' )
            // InternalAdaptUI.g:6565:2: '()'
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
    // InternalAdaptUI.g:6574:1: rule__ClearNavOperation__Group__3 : rule__ClearNavOperation__Group__3__Impl ;
    public final void rule__ClearNavOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6578:1: ( rule__ClearNavOperation__Group__3__Impl )
            // InternalAdaptUI.g:6579:2: rule__ClearNavOperation__Group__3__Impl
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
    // InternalAdaptUI.g:6585:1: rule__ClearNavOperation__Group__3__Impl : ( ';' ) ;
    public final void rule__ClearNavOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6589:1: ( ( ';' ) )
            // InternalAdaptUI.g:6590:1: ( ';' )
            {
            // InternalAdaptUI.g:6590:1: ( ';' )
            // InternalAdaptUI.g:6591:2: ';'
            {
             before(grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6601:1: rule__ChangeFontSizeOperation__Group__0 : rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 ;
    public final void rule__ChangeFontSizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6605:1: ( rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 )
            // InternalAdaptUI.g:6606:2: rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1
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
    // InternalAdaptUI.g:6613:1: rule__ChangeFontSizeOperation__Group__0__Impl : ( 'changeFontSize' ) ;
    public final void rule__ChangeFontSizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6617:1: ( ( 'changeFontSize' ) )
            // InternalAdaptUI.g:6618:1: ( 'changeFontSize' )
            {
            // InternalAdaptUI.g:6618:1: ( 'changeFontSize' )
            // InternalAdaptUI.g:6619:2: 'changeFontSize'
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
    // InternalAdaptUI.g:6628:1: rule__ChangeFontSizeOperation__Group__1 : rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 ;
    public final void rule__ChangeFontSizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6632:1: ( rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 )
            // InternalAdaptUI.g:6633:2: rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2
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
    // InternalAdaptUI.g:6640:1: rule__ChangeFontSizeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontSizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6644:1: ( ( '(' ) )
            // InternalAdaptUI.g:6645:1: ( '(' )
            {
            // InternalAdaptUI.g:6645:1: ( '(' )
            // InternalAdaptUI.g:6646:2: '('
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:6655:1: rule__ChangeFontSizeOperation__Group__2 : rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 ;
    public final void rule__ChangeFontSizeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6659:1: ( rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 )
            // InternalAdaptUI.g:6660:2: rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:6667:1: rule__ChangeFontSizeOperation__Group__2__Impl : ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6671:1: ( ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) )
            // InternalAdaptUI.g:6672:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            {
            // InternalAdaptUI.g:6672:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            // InternalAdaptUI.g:6673:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryAssignment_2()); 
            // InternalAdaptUI.g:6674:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            // InternalAdaptUI.g:6674:3: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2
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
    // InternalAdaptUI.g:6682:1: rule__ChangeFontSizeOperation__Group__3 : rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 ;
    public final void rule__ChangeFontSizeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6686:1: ( rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 )
            // InternalAdaptUI.g:6687:2: rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4
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
    // InternalAdaptUI.g:6694:1: rule__ChangeFontSizeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeFontSizeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6698:1: ( ( ',' ) )
            // InternalAdaptUI.g:6699:1: ( ',' )
            {
            // InternalAdaptUI.g:6699:1: ( ',' )
            // InternalAdaptUI.g:6700:2: ','
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
    // InternalAdaptUI.g:6709:1: rule__ChangeFontSizeOperation__Group__4 : rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 ;
    public final void rule__ChangeFontSizeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6713:1: ( rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 )
            // InternalAdaptUI.g:6714:2: rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5
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
    // InternalAdaptUI.g:6721:1: rule__ChangeFontSizeOperation__Group__4__Impl : ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6725:1: ( ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) )
            // InternalAdaptUI.g:6726:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            {
            // InternalAdaptUI.g:6726:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            // InternalAdaptUI.g:6727:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryAssignment_4()); 
            // InternalAdaptUI.g:6728:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            // InternalAdaptUI.g:6728:3: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4
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
    // InternalAdaptUI.g:6736:1: rule__ChangeFontSizeOperation__Group__5 : rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 ;
    public final void rule__ChangeFontSizeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6740:1: ( rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 )
            // InternalAdaptUI.g:6741:2: rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:6748:1: rule__ChangeFontSizeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeFontSizeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6752:1: ( ( ')' ) )
            // InternalAdaptUI.g:6753:1: ( ')' )
            {
            // InternalAdaptUI.g:6753:1: ( ')' )
            // InternalAdaptUI.g:6754:2: ')'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:6763:1: rule__ChangeFontSizeOperation__Group__6 : rule__ChangeFontSizeOperation__Group__6__Impl ;
    public final void rule__ChangeFontSizeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6767:1: ( rule__ChangeFontSizeOperation__Group__6__Impl )
            // InternalAdaptUI.g:6768:2: rule__ChangeFontSizeOperation__Group__6__Impl
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
    // InternalAdaptUI.g:6774:1: rule__ChangeFontSizeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeFontSizeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6778:1: ( ( ';' ) )
            // InternalAdaptUI.g:6779:1: ( ';' )
            {
            // InternalAdaptUI.g:6779:1: ( ';' )
            // InternalAdaptUI.g:6780:2: ';'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6790:1: rule__ChangeColorSchemeOperation__Group__0 : rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 ;
    public final void rule__ChangeColorSchemeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6794:1: ( rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 )
            // InternalAdaptUI.g:6795:2: rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1
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
    // InternalAdaptUI.g:6802:1: rule__ChangeColorSchemeOperation__Group__0__Impl : ( 'changeColorScheme' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6806:1: ( ( 'changeColorScheme' ) )
            // InternalAdaptUI.g:6807:1: ( 'changeColorScheme' )
            {
            // InternalAdaptUI.g:6807:1: ( 'changeColorScheme' )
            // InternalAdaptUI.g:6808:2: 'changeColorScheme'
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
    // InternalAdaptUI.g:6817:1: rule__ChangeColorSchemeOperation__Group__1 : rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 ;
    public final void rule__ChangeColorSchemeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6821:1: ( rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 )
            // InternalAdaptUI.g:6822:2: rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:6829:1: rule__ChangeColorSchemeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6833:1: ( ( '(' ) )
            // InternalAdaptUI.g:6834:1: ( '(' )
            {
            // InternalAdaptUI.g:6834:1: ( '(' )
            // InternalAdaptUI.g:6835:2: '('
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:6844:1: rule__ChangeColorSchemeOperation__Group__2 : rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 ;
    public final void rule__ChangeColorSchemeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6848:1: ( rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 )
            // InternalAdaptUI.g:6849:2: rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:6856:1: rule__ChangeColorSchemeOperation__Group__2__Impl : ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6860:1: ( ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) )
            // InternalAdaptUI.g:6861:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            {
            // InternalAdaptUI.g:6861:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            // InternalAdaptUI.g:6862:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryAssignment_2()); 
            // InternalAdaptUI.g:6863:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            // InternalAdaptUI.g:6863:3: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2
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
    // InternalAdaptUI.g:6871:1: rule__ChangeColorSchemeOperation__Group__3 : rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 ;
    public final void rule__ChangeColorSchemeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6875:1: ( rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 )
            // InternalAdaptUI.g:6876:2: rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:6883:1: rule__ChangeColorSchemeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6887:1: ( ( ',' ) )
            // InternalAdaptUI.g:6888:1: ( ',' )
            {
            // InternalAdaptUI.g:6888:1: ( ',' )
            // InternalAdaptUI.g:6889:2: ','
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
    // InternalAdaptUI.g:6898:1: rule__ChangeColorSchemeOperation__Group__4 : rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 ;
    public final void rule__ChangeColorSchemeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6902:1: ( rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 )
            // InternalAdaptUI.g:6903:2: rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5
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
    // InternalAdaptUI.g:6910:1: rule__ChangeColorSchemeOperation__Group__4__Impl : ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6914:1: ( ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) )
            // InternalAdaptUI.g:6915:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            {
            // InternalAdaptUI.g:6915:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            // InternalAdaptUI.g:6916:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryAssignment_4()); 
            // InternalAdaptUI.g:6917:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            // InternalAdaptUI.g:6917:3: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4
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
    // InternalAdaptUI.g:6925:1: rule__ChangeColorSchemeOperation__Group__5 : rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 ;
    public final void rule__ChangeColorSchemeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6929:1: ( rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 )
            // InternalAdaptUI.g:6930:2: rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:6937:1: rule__ChangeColorSchemeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6941:1: ( ( ')' ) )
            // InternalAdaptUI.g:6942:1: ( ')' )
            {
            // InternalAdaptUI.g:6942:1: ( ')' )
            // InternalAdaptUI.g:6943:2: ')'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:6952:1: rule__ChangeColorSchemeOperation__Group__6 : rule__ChangeColorSchemeOperation__Group__6__Impl ;
    public final void rule__ChangeColorSchemeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6956:1: ( rule__ChangeColorSchemeOperation__Group__6__Impl )
            // InternalAdaptUI.g:6957:2: rule__ChangeColorSchemeOperation__Group__6__Impl
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
    // InternalAdaptUI.g:6963:1: rule__ChangeColorSchemeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6967:1: ( ( ';' ) )
            // InternalAdaptUI.g:6968:1: ( ';' )
            {
            // InternalAdaptUI.g:6968:1: ( ';' )
            // InternalAdaptUI.g:6969:2: ';'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:6979:1: rule__ChangeFontOperation__Group__0 : rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 ;
    public final void rule__ChangeFontOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6983:1: ( rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 )
            // InternalAdaptUI.g:6984:2: rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1
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
    // InternalAdaptUI.g:6991:1: rule__ChangeFontOperation__Group__0__Impl : ( 'changeFont' ) ;
    public final void rule__ChangeFontOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:6995:1: ( ( 'changeFont' ) )
            // InternalAdaptUI.g:6996:1: ( 'changeFont' )
            {
            // InternalAdaptUI.g:6996:1: ( 'changeFont' )
            // InternalAdaptUI.g:6997:2: 'changeFont'
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
    // InternalAdaptUI.g:7006:1: rule__ChangeFontOperation__Group__1 : rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 ;
    public final void rule__ChangeFontOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7010:1: ( rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 )
            // InternalAdaptUI.g:7011:2: rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:7018:1: rule__ChangeFontOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7022:1: ( ( '(' ) )
            // InternalAdaptUI.g:7023:1: ( '(' )
            {
            // InternalAdaptUI.g:7023:1: ( '(' )
            // InternalAdaptUI.g:7024:2: '('
            {
             before(grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:7033:1: rule__ChangeFontOperation__Group__2 : rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 ;
    public final void rule__ChangeFontOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7037:1: ( rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 )
            // InternalAdaptUI.g:7038:2: rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3
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
    // InternalAdaptUI.g:7045:1: rule__ChangeFontOperation__Group__2__Impl : ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeFontOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7049:1: ( ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) )
            // InternalAdaptUI.g:7050:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            {
            // InternalAdaptUI.g:7050:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            // InternalAdaptUI.g:7051:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextAssignment_2()); 
            // InternalAdaptUI.g:7052:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            // InternalAdaptUI.g:7052:3: rule__ChangeFontOperation__TextAssignment_2
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
    // InternalAdaptUI.g:7060:1: rule__ChangeFontOperation__Group__3 : rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 ;
    public final void rule__ChangeFontOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7064:1: ( rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 )
            // InternalAdaptUI.g:7065:2: rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:7072:1: rule__ChangeFontOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7076:1: ( ( ')' ) )
            // InternalAdaptUI.g:7077:1: ( ')' )
            {
            // InternalAdaptUI.g:7077:1: ( ')' )
            // InternalAdaptUI.g:7078:2: ')'
            {
             before(grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:7087:1: rule__ChangeFontOperation__Group__4 : rule__ChangeFontOperation__Group__4__Impl ;
    public final void rule__ChangeFontOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7091:1: ( rule__ChangeFontOperation__Group__4__Impl )
            // InternalAdaptUI.g:7092:2: rule__ChangeFontOperation__Group__4__Impl
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
    // InternalAdaptUI.g:7098:1: rule__ChangeFontOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7102:1: ( ( ';' ) )
            // InternalAdaptUI.g:7103:1: ( ';' )
            {
            // InternalAdaptUI.g:7103:1: ( ';' )
            // InternalAdaptUI.g:7104:2: ';'
            {
             before(grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:7114:1: rule__ChangeTableCssClassOperation__Group__0 : rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 ;
    public final void rule__ChangeTableCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7118:1: ( rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 )
            // InternalAdaptUI.g:7119:2: rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1
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
    // InternalAdaptUI.g:7126:1: rule__ChangeTableCssClassOperation__Group__0__Impl : ( 'changeTableCss' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7130:1: ( ( 'changeTableCss' ) )
            // InternalAdaptUI.g:7131:1: ( 'changeTableCss' )
            {
            // InternalAdaptUI.g:7131:1: ( 'changeTableCss' )
            // InternalAdaptUI.g:7132:2: 'changeTableCss'
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
    // InternalAdaptUI.g:7141:1: rule__ChangeTableCssClassOperation__Group__1 : rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 ;
    public final void rule__ChangeTableCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7145:1: ( rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 )
            // InternalAdaptUI.g:7146:2: rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:7153:1: rule__ChangeTableCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7157:1: ( ( '(' ) )
            // InternalAdaptUI.g:7158:1: ( '(' )
            {
            // InternalAdaptUI.g:7158:1: ( '(' )
            // InternalAdaptUI.g:7159:2: '('
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:7168:1: rule__ChangeTableCssClassOperation__Group__2 : rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 ;
    public final void rule__ChangeTableCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7172:1: ( rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 )
            // InternalAdaptUI.g:7173:2: rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3
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
    // InternalAdaptUI.g:7180:1: rule__ChangeTableCssClassOperation__Group__2__Impl : ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeTableCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7184:1: ( ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) )
            // InternalAdaptUI.g:7185:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            {
            // InternalAdaptUI.g:7185:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            // InternalAdaptUI.g:7186:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextAssignment_2()); 
            // InternalAdaptUI.g:7187:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            // InternalAdaptUI.g:7187:3: rule__ChangeTableCssClassOperation__TextAssignment_2
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
    // InternalAdaptUI.g:7195:1: rule__ChangeTableCssClassOperation__Group__3 : rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 ;
    public final void rule__ChangeTableCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7199:1: ( rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 )
            // InternalAdaptUI.g:7200:2: rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:7207:1: rule__ChangeTableCssClassOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7211:1: ( ( ')' ) )
            // InternalAdaptUI.g:7212:1: ( ')' )
            {
            // InternalAdaptUI.g:7212:1: ( ')' )
            // InternalAdaptUI.g:7213:2: ')'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:7222:1: rule__ChangeTableCssClassOperation__Group__4 : rule__ChangeTableCssClassOperation__Group__4__Impl ;
    public final void rule__ChangeTableCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7226:1: ( rule__ChangeTableCssClassOperation__Group__4__Impl )
            // InternalAdaptUI.g:7227:2: rule__ChangeTableCssClassOperation__Group__4__Impl
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
    // InternalAdaptUI.g:7233:1: rule__ChangeTableCssClassOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7237:1: ( ( ';' ) )
            // InternalAdaptUI.g:7238:1: ( ';' )
            {
            // InternalAdaptUI.g:7238:1: ( ';' )
            // InternalAdaptUI.g:7239:2: ';'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:7249:1: rule__AdaptCssClassOperation__Group__0 : rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 ;
    public final void rule__AdaptCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7253:1: ( rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 )
            // InternalAdaptUI.g:7254:2: rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1
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
    // InternalAdaptUI.g:7261:1: rule__AdaptCssClassOperation__Group__0__Impl : ( 'adaptCssClass' ) ;
    public final void rule__AdaptCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7265:1: ( ( 'adaptCssClass' ) )
            // InternalAdaptUI.g:7266:1: ( 'adaptCssClass' )
            {
            // InternalAdaptUI.g:7266:1: ( 'adaptCssClass' )
            // InternalAdaptUI.g:7267:2: 'adaptCssClass'
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
    // InternalAdaptUI.g:7276:1: rule__AdaptCssClassOperation__Group__1 : rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 ;
    public final void rule__AdaptCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7280:1: ( rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 )
            // InternalAdaptUI.g:7281:2: rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:7288:1: rule__AdaptCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AdaptCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7292:1: ( ( '(' ) )
            // InternalAdaptUI.g:7293:1: ( '(' )
            {
            // InternalAdaptUI.g:7293:1: ( '(' )
            // InternalAdaptUI.g:7294:2: '('
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptUI.g:7303:1: rule__AdaptCssClassOperation__Group__2 : rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 ;
    public final void rule__AdaptCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7307:1: ( rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 )
            // InternalAdaptUI.g:7308:2: rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:7315:1: rule__AdaptCssClassOperation__Group__2__Impl : ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7319:1: ( ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) )
            // InternalAdaptUI.g:7320:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            {
            // InternalAdaptUI.g:7320:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            // InternalAdaptUI.g:7321:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssClassAssignment_2()); 
            // InternalAdaptUI.g:7322:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            // InternalAdaptUI.g:7322:3: rule__AdaptCssClassOperation__CssClassAssignment_2
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
    // InternalAdaptUI.g:7330:1: rule__AdaptCssClassOperation__Group__3 : rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 ;
    public final void rule__AdaptCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7334:1: ( rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 )
            // InternalAdaptUI.g:7335:2: rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:7342:1: rule__AdaptCssClassOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7346:1: ( ( ',' ) )
            // InternalAdaptUI.g:7347:1: ( ',' )
            {
            // InternalAdaptUI.g:7347:1: ( ',' )
            // InternalAdaptUI.g:7348:2: ','
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
    // InternalAdaptUI.g:7357:1: rule__AdaptCssClassOperation__Group__4 : rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 ;
    public final void rule__AdaptCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7361:1: ( rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 )
            // InternalAdaptUI.g:7362:2: rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:7369:1: rule__AdaptCssClassOperation__Group__4__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7373:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) )
            // InternalAdaptUI.g:7374:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            {
            // InternalAdaptUI.g:7374:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            // InternalAdaptUI.g:7375:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAssignment_4()); 
            // InternalAdaptUI.g:7376:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            // InternalAdaptUI.g:7376:3: rule__AdaptCssClassOperation__CssAttributeAssignment_4
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
    // InternalAdaptUI.g:7384:1: rule__AdaptCssClassOperation__Group__5 : rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 ;
    public final void rule__AdaptCssClassOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7388:1: ( rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 )
            // InternalAdaptUI.g:7389:2: rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:7396:1: rule__AdaptCssClassOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7400:1: ( ( ',' ) )
            // InternalAdaptUI.g:7401:1: ( ',' )
            {
            // InternalAdaptUI.g:7401:1: ( ',' )
            // InternalAdaptUI.g:7402:2: ','
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
    // InternalAdaptUI.g:7411:1: rule__AdaptCssClassOperation__Group__6 : rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 ;
    public final void rule__AdaptCssClassOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7415:1: ( rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 )
            // InternalAdaptUI.g:7416:2: rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7
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
    // InternalAdaptUI.g:7423:1: rule__AdaptCssClassOperation__Group__6__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7427:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) )
            // InternalAdaptUI.g:7428:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            {
            // InternalAdaptUI.g:7428:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            // InternalAdaptUI.g:7429:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAssignment_6()); 
            // InternalAdaptUI.g:7430:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            // InternalAdaptUI.g:7430:3: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6
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
    // InternalAdaptUI.g:7438:1: rule__AdaptCssClassOperation__Group__7 : rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 ;
    public final void rule__AdaptCssClassOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7442:1: ( rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 )
            // InternalAdaptUI.g:7443:2: rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:7450:1: rule__AdaptCssClassOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AdaptCssClassOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7454:1: ( ( ')' ) )
            // InternalAdaptUI.g:7455:1: ( ')' )
            {
            // InternalAdaptUI.g:7455:1: ( ')' )
            // InternalAdaptUI.g:7456:2: ')'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptUI.g:7465:1: rule__AdaptCssClassOperation__Group__8 : rule__AdaptCssClassOperation__Group__8__Impl ;
    public final void rule__AdaptCssClassOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7469:1: ( rule__AdaptCssClassOperation__Group__8__Impl )
            // InternalAdaptUI.g:7470:2: rule__AdaptCssClassOperation__Group__8__Impl
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
    // InternalAdaptUI.g:7476:1: rule__AdaptCssClassOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AdaptCssClassOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7480:1: ( ( ';' ) )
            // InternalAdaptUI.g:7481:1: ( ';' )
            {
            // InternalAdaptUI.g:7481:1: ( ';' )
            // InternalAdaptUI.g:7482:2: ';'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:7492:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7496:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAdaptUI.g:7497:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:7504:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7508:1: ( ( 'Entity' ) )
            // InternalAdaptUI.g:7509:1: ( 'Entity' )
            {
            // InternalAdaptUI.g:7509:1: ( 'Entity' )
            // InternalAdaptUI.g:7510:2: 'Entity'
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
    // InternalAdaptUI.g:7519:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7523:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAdaptUI.g:7524:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptUI.g:7531:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7535:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalAdaptUI.g:7536:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalAdaptUI.g:7536:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalAdaptUI.g:7537:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalAdaptUI.g:7538:2: ( rule__Entity__NameAssignment_1 )
            // InternalAdaptUI.g:7538:3: rule__Entity__NameAssignment_1
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
    // InternalAdaptUI.g:7546:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7550:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAdaptUI.g:7551:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:7558:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7562:1: ( ( '{' ) )
            // InternalAdaptUI.g:7563:1: ( '{' )
            {
            // InternalAdaptUI.g:7563:1: ( '{' )
            // InternalAdaptUI.g:7564:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdaptUI.g:7573:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7577:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAdaptUI.g:7578:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAdaptUI.g:7585:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7589:1: ( ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) ) )
            // InternalAdaptUI.g:7590:1: ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) )
            {
            // InternalAdaptUI.g:7590:1: ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) )
            // InternalAdaptUI.g:7591:2: ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* )
            {
            // InternalAdaptUI.g:7591:2: ( ( rule__Entity__PropertyAssignment_3 ) )
            // InternalAdaptUI.g:7592:3: ( rule__Entity__PropertyAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 
            // InternalAdaptUI.g:7593:3: ( rule__Entity__PropertyAssignment_3 )
            // InternalAdaptUI.g:7593:4: rule__Entity__PropertyAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 

            }

            // InternalAdaptUI.g:7596:2: ( ( rule__Entity__PropertyAssignment_3 )* )
            // InternalAdaptUI.g:7597:3: ( rule__Entity__PropertyAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 
            // InternalAdaptUI.g:7598:3: ( rule__Entity__PropertyAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAdaptUI.g:7598:4: rule__Entity__PropertyAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__PropertyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalAdaptUI.g:7607:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7611:1: ( rule__Entity__Group__4__Impl )
            // InternalAdaptUI.g:7612:2: rule__Entity__Group__4__Impl
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
    // InternalAdaptUI.g:7618:1: rule__Entity__Group__4__Impl : ( '};' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7622:1: ( ( '};' ) )
            // InternalAdaptUI.g:7623:1: ( '};' )
            {
            // InternalAdaptUI.g:7623:1: ( '};' )
            // InternalAdaptUI.g:7624:2: '};'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketSemicolonKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketSemicolonKeyword_4()); 

            }


            }

        }
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
    // InternalAdaptUI.g:7634:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7638:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalAdaptUI.g:7639:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptUI.g:7646:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7650:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalAdaptUI.g:7651:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalAdaptUI.g:7651:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalAdaptUI.g:7652:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalAdaptUI.g:7653:2: ( rule__Property__NameAssignment_0 )
            // InternalAdaptUI.g:7653:3: rule__Property__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalAdaptUI.g:7661:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7665:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalAdaptUI.g:7666:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdaptUI.g:7673:1: rule__Property__Group__1__Impl : ( '{' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7677:1: ( ( '{' ) )
            // InternalAdaptUI.g:7678:1: ( '{' )
            {
            // InternalAdaptUI.g:7678:1: ( '{' )
            // InternalAdaptUI.g:7679:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalAdaptUI.g:7688:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7692:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalAdaptUI.g:7693:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalAdaptUI.g:7700:1: rule__Property__Group__2__Impl : ( 'type' ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7704:1: ( ( 'type' ) )
            // InternalAdaptUI.g:7705:1: ( 'type' )
            {
            // InternalAdaptUI.g:7705:1: ( 'type' )
            // InternalAdaptUI.g:7706:2: 'type'
            {
             before(grammarAccess.getPropertyAccess().getTypeKeyword_2()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getTypeKeyword_2()); 

            }


            }

        }
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
    // InternalAdaptUI.g:7715:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7719:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalAdaptUI.g:7720:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:7727:1: rule__Property__Group__3__Impl : ( ( rule__Property__TypeAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7731:1: ( ( ( rule__Property__TypeAssignment_3 ) ) )
            // InternalAdaptUI.g:7732:1: ( ( rule__Property__TypeAssignment_3 ) )
            {
            // InternalAdaptUI.g:7732:1: ( ( rule__Property__TypeAssignment_3 ) )
            // InternalAdaptUI.g:7733:2: ( rule__Property__TypeAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_3()); 
            // InternalAdaptUI.g:7734:2: ( rule__Property__TypeAssignment_3 )
            // InternalAdaptUI.g:7734:3: rule__Property__TypeAssignment_3
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
    // InternalAdaptUI.g:7742:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7746:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalAdaptUI.g:7747:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdaptUI.g:7754:1: rule__Property__Group__4__Impl : ( ',' ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7758:1: ( ( ',' ) )
            // InternalAdaptUI.g:7759:1: ( ',' )
            {
            // InternalAdaptUI.g:7759:1: ( ',' )
            // InternalAdaptUI.g:7760:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_4()); 

            }


            }

        }
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
    // InternalAdaptUI.g:7769:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7773:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // InternalAdaptUI.g:7774:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:7781:1: rule__Property__Group__5__Impl : ( 'provider' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7785:1: ( ( 'provider' ) )
            // InternalAdaptUI.g:7786:1: ( 'provider' )
            {
            // InternalAdaptUI.g:7786:1: ( 'provider' )
            // InternalAdaptUI.g:7787:2: 'provider'
            {
             before(grammarAccess.getPropertyAccess().getProviderKeyword_5()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getProviderKeyword_5()); 

            }


            }

        }
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
    // InternalAdaptUI.g:7796:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7800:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // InternalAdaptUI.g:7801:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__Property__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__7();

            state._fsp--;


            }

        }
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
    // InternalAdaptUI.g:7808:1: rule__Property__Group__6__Impl : ( ( rule__Property__ProviderAssignment_6 ) ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7812:1: ( ( ( rule__Property__ProviderAssignment_6 ) ) )
            // InternalAdaptUI.g:7813:1: ( ( rule__Property__ProviderAssignment_6 ) )
            {
            // InternalAdaptUI.g:7813:1: ( ( rule__Property__ProviderAssignment_6 ) )
            // InternalAdaptUI.g:7814:2: ( rule__Property__ProviderAssignment_6 )
            {
             before(grammarAccess.getPropertyAccess().getProviderAssignment_6()); 
            // InternalAdaptUI.g:7815:2: ( rule__Property__ProviderAssignment_6 )
            // InternalAdaptUI.g:7815:3: rule__Property__ProviderAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Property__ProviderAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getProviderAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Property__Group__7"
    // InternalAdaptUI.g:7823:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7827:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // InternalAdaptUI.g:7828:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FOLLOW_46);
            rule__Property__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7"


    // $ANTLR start "rule__Property__Group__7__Impl"
    // InternalAdaptUI.g:7835:1: rule__Property__Group__7__Impl : ( ',' ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7839:1: ( ( ',' ) )
            // InternalAdaptUI.g:7840:1: ( ',' )
            {
            // InternalAdaptUI.g:7840:1: ( ',' )
            // InternalAdaptUI.g:7841:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__7__Impl"


    // $ANTLR start "rule__Property__Group__8"
    // InternalAdaptUI.g:7850:1: rule__Property__Group__8 : rule__Property__Group__8__Impl rule__Property__Group__9 ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7854:1: ( rule__Property__Group__8__Impl rule__Property__Group__9 )
            // InternalAdaptUI.g:7855:2: rule__Property__Group__8__Impl rule__Property__Group__9
            {
            pushFollow(FOLLOW_47);
            rule__Property__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8"


    // $ANTLR start "rule__Property__Group__8__Impl"
    // InternalAdaptUI.g:7862:1: rule__Property__Group__8__Impl : ( 'update' ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7866:1: ( ( 'update' ) )
            // InternalAdaptUI.g:7867:1: ( 'update' )
            {
            // InternalAdaptUI.g:7867:1: ( 'update' )
            // InternalAdaptUI.g:7868:2: 'update'
            {
             before(grammarAccess.getPropertyAccess().getUpdateKeyword_8()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getUpdateKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__8__Impl"


    // $ANTLR start "rule__Property__Group__9"
    // InternalAdaptUI.g:7877:1: rule__Property__Group__9 : rule__Property__Group__9__Impl rule__Property__Group__10 ;
    public final void rule__Property__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7881:1: ( rule__Property__Group__9__Impl rule__Property__Group__10 )
            // InternalAdaptUI.g:7882:2: rule__Property__Group__9__Impl rule__Property__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Property__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__9"


    // $ANTLR start "rule__Property__Group__9__Impl"
    // InternalAdaptUI.g:7889:1: rule__Property__Group__9__Impl : ( ( rule__Property__UpdateAssignment_9 ) ) ;
    public final void rule__Property__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7893:1: ( ( ( rule__Property__UpdateAssignment_9 ) ) )
            // InternalAdaptUI.g:7894:1: ( ( rule__Property__UpdateAssignment_9 ) )
            {
            // InternalAdaptUI.g:7894:1: ( ( rule__Property__UpdateAssignment_9 ) )
            // InternalAdaptUI.g:7895:2: ( rule__Property__UpdateAssignment_9 )
            {
             before(grammarAccess.getPropertyAccess().getUpdateAssignment_9()); 
            // InternalAdaptUI.g:7896:2: ( rule__Property__UpdateAssignment_9 )
            // InternalAdaptUI.g:7896:3: rule__Property__UpdateAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Property__UpdateAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getUpdateAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__9__Impl"


    // $ANTLR start "rule__Property__Group__10"
    // InternalAdaptUI.g:7904:1: rule__Property__Group__10 : rule__Property__Group__10__Impl ;
    public final void rule__Property__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7908:1: ( rule__Property__Group__10__Impl )
            // InternalAdaptUI.g:7909:2: rule__Property__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10"


    // $ANTLR start "rule__Property__Group__10__Impl"
    // InternalAdaptUI.g:7915:1: rule__Property__Group__10__Impl : ( '};' ) ;
    public final void rule__Property__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7919:1: ( ( '};' ) )
            // InternalAdaptUI.g:7920:1: ( '};' )
            {
            // InternalAdaptUI.g:7920:1: ( '};' )
            // InternalAdaptUI.g:7921:2: '};'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketSemicolonKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__10__Impl"


    // $ANTLR start "rule__DefTypes__Group__0"
    // InternalAdaptUI.g:7931:1: rule__DefTypes__Group__0 : rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 ;
    public final void rule__DefTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7935:1: ( rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 )
            // InternalAdaptUI.g:7936:2: rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptUI.g:7943:1: rule__DefTypes__Group__0__Impl : ( ( rule__DefTypes__ThisAssignment_0 ) ) ;
    public final void rule__DefTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7947:1: ( ( ( rule__DefTypes__ThisAssignment_0 ) ) )
            // InternalAdaptUI.g:7948:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            {
            // InternalAdaptUI.g:7948:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            // InternalAdaptUI.g:7949:2: ( rule__DefTypes__ThisAssignment_0 )
            {
             before(grammarAccess.getDefTypesAccess().getThisAssignment_0()); 
            // InternalAdaptUI.g:7950:2: ( rule__DefTypes__ThisAssignment_0 )
            // InternalAdaptUI.g:7950:3: rule__DefTypes__ThisAssignment_0
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
    // InternalAdaptUI.g:7958:1: rule__DefTypes__Group__1 : rule__DefTypes__Group__1__Impl ;
    public final void rule__DefTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7962:1: ( rule__DefTypes__Group__1__Impl )
            // InternalAdaptUI.g:7963:2: rule__DefTypes__Group__1__Impl
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
    // InternalAdaptUI.g:7969:1: rule__DefTypes__Group__1__Impl : ( ( rule__DefTypes__NextAssignment_1 )? ) ;
    public final void rule__DefTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7973:1: ( ( ( rule__DefTypes__NextAssignment_1 )? ) )
            // InternalAdaptUI.g:7974:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            {
            // InternalAdaptUI.g:7974:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            // InternalAdaptUI.g:7975:2: ( rule__DefTypes__NextAssignment_1 )?
            {
             before(grammarAccess.getDefTypesAccess().getNextAssignment_1()); 
            // InternalAdaptUI.g:7976:2: ( rule__DefTypes__NextAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAdaptUI.g:7976:3: rule__DefTypes__NextAssignment_1
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
    // InternalAdaptUI.g:7985:1: rule__DefType__Group__0 : rule__DefType__Group__0__Impl rule__DefType__Group__1 ;
    public final void rule__DefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:7989:1: ( rule__DefType__Group__0__Impl rule__DefType__Group__1 )
            // InternalAdaptUI.g:7990:2: rule__DefType__Group__0__Impl rule__DefType__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalAdaptUI.g:7997:1: rule__DefType__Group__0__Impl : ( ( rule__DefType__NameAssignment_0 ) ) ;
    public final void rule__DefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8001:1: ( ( ( rule__DefType__NameAssignment_0 ) ) )
            // InternalAdaptUI.g:8002:1: ( ( rule__DefType__NameAssignment_0 ) )
            {
            // InternalAdaptUI.g:8002:1: ( ( rule__DefType__NameAssignment_0 ) )
            // InternalAdaptUI.g:8003:2: ( rule__DefType__NameAssignment_0 )
            {
             before(grammarAccess.getDefTypeAccess().getNameAssignment_0()); 
            // InternalAdaptUI.g:8004:2: ( rule__DefType__NameAssignment_0 )
            // InternalAdaptUI.g:8004:3: rule__DefType__NameAssignment_0
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
    // InternalAdaptUI.g:8012:1: rule__DefType__Group__1 : rule__DefType__Group__1__Impl rule__DefType__Group__2 ;
    public final void rule__DefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8016:1: ( rule__DefType__Group__1__Impl rule__DefType__Group__2 )
            // InternalAdaptUI.g:8017:2: rule__DefType__Group__1__Impl rule__DefType__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:8024:1: rule__DefType__Group__1__Impl : ( ':' ) ;
    public final void rule__DefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8028:1: ( ( ':' ) )
            // InternalAdaptUI.g:8029:1: ( ':' )
            {
            // InternalAdaptUI.g:8029:1: ( ':' )
            // InternalAdaptUI.g:8030:2: ':'
            {
             before(grammarAccess.getDefTypeAccess().getColonKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdaptUI.g:8039:1: rule__DefType__Group__2 : rule__DefType__Group__2__Impl rule__DefType__Group__3 ;
    public final void rule__DefType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8043:1: ( rule__DefType__Group__2__Impl rule__DefType__Group__3 )
            // InternalAdaptUI.g:8044:2: rule__DefType__Group__2__Impl rule__DefType__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptUI.g:8051:1: rule__DefType__Group__2__Impl : ( ( rule__DefType__EnumsAssignment_2 ) ) ;
    public final void rule__DefType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8055:1: ( ( ( rule__DefType__EnumsAssignment_2 ) ) )
            // InternalAdaptUI.g:8056:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            {
            // InternalAdaptUI.g:8056:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            // InternalAdaptUI.g:8057:2: ( rule__DefType__EnumsAssignment_2 )
            {
             before(grammarAccess.getDefTypeAccess().getEnumsAssignment_2()); 
            // InternalAdaptUI.g:8058:2: ( rule__DefType__EnumsAssignment_2 )
            // InternalAdaptUI.g:8058:3: rule__DefType__EnumsAssignment_2
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
    // InternalAdaptUI.g:8066:1: rule__DefType__Group__3 : rule__DefType__Group__3__Impl ;
    public final void rule__DefType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8070:1: ( rule__DefType__Group__3__Impl )
            // InternalAdaptUI.g:8071:2: rule__DefType__Group__3__Impl
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
    // InternalAdaptUI.g:8077:1: rule__DefType__Group__3__Impl : ( ';' ) ;
    public final void rule__DefType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8081:1: ( ( ';' ) )
            // InternalAdaptUI.g:8082:1: ( ';' )
            {
            // InternalAdaptUI.g:8082:1: ( ';' )
            // InternalAdaptUI.g:8083:2: ';'
            {
             before(grammarAccess.getDefTypeAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalAdaptUI.g:8093:1: rule__Enums__Group__0 : rule__Enums__Group__0__Impl rule__Enums__Group__1 ;
    public final void rule__Enums__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8097:1: ( rule__Enums__Group__0__Impl rule__Enums__Group__1 )
            // InternalAdaptUI.g:8098:2: rule__Enums__Group__0__Impl rule__Enums__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptUI.g:8105:1: rule__Enums__Group__0__Impl : ( ( rule__Enums__ThisAssignment_0 ) ) ;
    public final void rule__Enums__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8109:1: ( ( ( rule__Enums__ThisAssignment_0 ) ) )
            // InternalAdaptUI.g:8110:1: ( ( rule__Enums__ThisAssignment_0 ) )
            {
            // InternalAdaptUI.g:8110:1: ( ( rule__Enums__ThisAssignment_0 ) )
            // InternalAdaptUI.g:8111:2: ( rule__Enums__ThisAssignment_0 )
            {
             before(grammarAccess.getEnumsAccess().getThisAssignment_0()); 
            // InternalAdaptUI.g:8112:2: ( rule__Enums__ThisAssignment_0 )
            // InternalAdaptUI.g:8112:3: rule__Enums__ThisAssignment_0
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
    // InternalAdaptUI.g:8120:1: rule__Enums__Group__1 : rule__Enums__Group__1__Impl ;
    public final void rule__Enums__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8124:1: ( rule__Enums__Group__1__Impl )
            // InternalAdaptUI.g:8125:2: rule__Enums__Group__1__Impl
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
    // InternalAdaptUI.g:8131:1: rule__Enums__Group__1__Impl : ( ( rule__Enums__Group_1__0 )? ) ;
    public final void rule__Enums__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8135:1: ( ( ( rule__Enums__Group_1__0 )? ) )
            // InternalAdaptUI.g:8136:1: ( ( rule__Enums__Group_1__0 )? )
            {
            // InternalAdaptUI.g:8136:1: ( ( rule__Enums__Group_1__0 )? )
            // InternalAdaptUI.g:8137:2: ( rule__Enums__Group_1__0 )?
            {
             before(grammarAccess.getEnumsAccess().getGroup_1()); 
            // InternalAdaptUI.g:8138:2: ( rule__Enums__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdaptUI.g:8138:3: rule__Enums__Group_1__0
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
    // InternalAdaptUI.g:8147:1: rule__Enums__Group_1__0 : rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 ;
    public final void rule__Enums__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8151:1: ( rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 )
            // InternalAdaptUI.g:8152:2: rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptUI.g:8159:1: rule__Enums__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enums__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8163:1: ( ( ',' ) )
            // InternalAdaptUI.g:8164:1: ( ',' )
            {
            // InternalAdaptUI.g:8164:1: ( ',' )
            // InternalAdaptUI.g:8165:2: ','
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
    // InternalAdaptUI.g:8174:1: rule__Enums__Group_1__1 : rule__Enums__Group_1__1__Impl ;
    public final void rule__Enums__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8178:1: ( rule__Enums__Group_1__1__Impl )
            // InternalAdaptUI.g:8179:2: rule__Enums__Group_1__1__Impl
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
    // InternalAdaptUI.g:8185:1: rule__Enums__Group_1__1__Impl : ( ( rule__Enums__NextAssignment_1_1 ) ) ;
    public final void rule__Enums__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8189:1: ( ( ( rule__Enums__NextAssignment_1_1 ) ) )
            // InternalAdaptUI.g:8190:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            {
            // InternalAdaptUI.g:8190:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            // InternalAdaptUI.g:8191:2: ( rule__Enums__NextAssignment_1_1 )
            {
             before(grammarAccess.getEnumsAccess().getNextAssignment_1_1()); 
            // InternalAdaptUI.g:8192:2: ( rule__Enums__NextAssignment_1_1 )
            // InternalAdaptUI.g:8192:3: rule__Enums__NextAssignment_1_1
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


    // $ANTLR start "rule__Model__ContextModelAssignment_0"
    // InternalAdaptUI.g:8201:1: rule__Model__ContextModelAssignment_0 : ( ruleContextModel ) ;
    public final void rule__Model__ContextModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8205:1: ( ( ruleContextModel ) )
            // InternalAdaptUI.g:8206:2: ( ruleContextModel )
            {
            // InternalAdaptUI.g:8206:2: ( ruleContextModel )
            // InternalAdaptUI.g:8207:3: ruleContextModel
            {
             before(grammarAccess.getModelAccess().getContextModelContextModelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContextModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContextModelContextModelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContextModelAssignment_0"


    // $ANTLR start "rule__Model__AdaptationModelAssignment_1"
    // InternalAdaptUI.g:8216:1: rule__Model__AdaptationModelAssignment_1 : ( ruleAdaptationModel ) ;
    public final void rule__Model__AdaptationModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8220:1: ( ( ruleAdaptationModel ) )
            // InternalAdaptUI.g:8221:2: ( ruleAdaptationModel )
            {
            // InternalAdaptUI.g:8221:2: ( ruleAdaptationModel )
            // InternalAdaptUI.g:8222:3: ruleAdaptationModel
            {
             before(grammarAccess.getModelAccess().getAdaptationModelAdaptationModelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdaptationModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAdaptationModelAdaptationModelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AdaptationModelAssignment_1"


    // $ANTLR start "rule__ContextModel__EntityAssignment_1"
    // InternalAdaptUI.g:8231:1: rule__ContextModel__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__ContextModel__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8235:1: ( ( ruleEntity ) )
            // InternalAdaptUI.g:8236:2: ( ruleEntity )
            {
            // InternalAdaptUI.g:8236:2: ( ruleEntity )
            // InternalAdaptUI.g:8237:3: ruleEntity
            {
             before(grammarAccess.getContextModelAccess().getEntityEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getEntityEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__EntityAssignment_1"


    // $ANTLR start "rule__ContextModel__ProviderAssignment_2_1_0"
    // InternalAdaptUI.g:8246:1: rule__ContextModel__ProviderAssignment_2_1_0 : ( ruleProvider ) ;
    public final void rule__ContextModel__ProviderAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8250:1: ( ( ruleProvider ) )
            // InternalAdaptUI.g:8251:2: ( ruleProvider )
            {
            // InternalAdaptUI.g:8251:2: ( ruleProvider )
            // InternalAdaptUI.g:8252:3: ruleProvider
            {
             before(grammarAccess.getContextModelAccess().getProviderProviderParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProvider();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getProviderProviderParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__ProviderAssignment_2_1_0"


    // $ANTLR start "rule__ContextModel__TypesAssignment_3_1"
    // InternalAdaptUI.g:8261:1: rule__ContextModel__TypesAssignment_3_1 : ( ruleDefTypes ) ;
    public final void rule__ContextModel__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8265:1: ( ( ruleDefTypes ) )
            // InternalAdaptUI.g:8266:2: ( ruleDefTypes )
            {
            // InternalAdaptUI.g:8266:2: ( ruleDefTypes )
            // InternalAdaptUI.g:8267:3: ruleDefTypes
            {
             before(grammarAccess.getContextModelAccess().getTypesDefTypesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefTypes();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getTypesDefTypesParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__TypesAssignment_3_1"


    // $ANTLR start "rule__AdaptationModel__ServicesAssignment_1"
    // InternalAdaptUI.g:8276:1: rule__AdaptationModel__ServicesAssignment_1 : ( ruleServices ) ;
    public final void rule__AdaptationModel__ServicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8280:1: ( ( ruleServices ) )
            // InternalAdaptUI.g:8281:2: ( ruleServices )
            {
            // InternalAdaptUI.g:8281:2: ( ruleServices )
            // InternalAdaptUI.g:8282:3: ruleServices
            {
             before(grammarAccess.getAdaptationModelAccess().getServicesServicesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServices();

            state._fsp--;

             after(grammarAccess.getAdaptationModelAccess().getServicesServicesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__ServicesAssignment_1"


    // $ANTLR start "rule__AdaptationModel__FlowNameAssignment_3"
    // InternalAdaptUI.g:8291:1: rule__AdaptationModel__FlowNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AdaptationModel__FlowNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8295:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:8296:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:8296:2: ( RULE_STRING )
            // InternalAdaptUI.g:8297:3: RULE_STRING
            {
             before(grammarAccess.getAdaptationModelAccess().getFlowNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAdaptationModelAccess().getFlowNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__FlowNameAssignment_3"


    // $ANTLR start "rule__AdaptationModel__AdaptationRulesAssignment_5"
    // InternalAdaptUI.g:8306:1: rule__AdaptationModel__AdaptationRulesAssignment_5 : ( ruleAdaptationRule ) ;
    public final void rule__AdaptationModel__AdaptationRulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8310:1: ( ( ruleAdaptationRule ) )
            // InternalAdaptUI.g:8311:2: ( ruleAdaptationRule )
            {
            // InternalAdaptUI.g:8311:2: ( ruleAdaptationRule )
            // InternalAdaptUI.g:8312:3: ruleAdaptationRule
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAdaptationRule();

            state._fsp--;

             after(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationModel__AdaptationRulesAssignment_5"


    // $ANTLR start "rule__Services__ThisAssignment_0"
    // InternalAdaptUI.g:8321:1: rule__Services__ThisAssignment_0 : ( ruleService ) ;
    public final void rule__Services__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8325:1: ( ( ruleService ) )
            // InternalAdaptUI.g:8326:2: ( ruleService )
            {
            // InternalAdaptUI.g:8326:2: ( ruleService )
            // InternalAdaptUI.g:8327:3: ruleService
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
    // InternalAdaptUI.g:8336:1: rule__Services__NextAssignment_1 : ( ruleServices ) ;
    public final void rule__Services__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8340:1: ( ( ruleServices ) )
            // InternalAdaptUI.g:8341:2: ( ruleServices )
            {
            // InternalAdaptUI.g:8341:2: ( ruleServices )
            // InternalAdaptUI.g:8342:3: ruleServices
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
    // InternalAdaptUI.g:8351:1: rule__Service__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8355:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8356:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:8356:2: ( RULE_ID )
            // InternalAdaptUI.g:8357:3: RULE_ID
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
    // InternalAdaptUI.g:8366:1: rule__Service__LocAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Service__LocAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8370:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:8371:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:8371:2: ( RULE_STRING )
            // InternalAdaptUI.g:8372:3: RULE_STRING
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
    // InternalAdaptUI.g:8381:1: rule__Service__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Service__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8385:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:8386:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:8386:2: ( RULE_STRING )
            // InternalAdaptUI.g:8387:3: RULE_STRING
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
    // InternalAdaptUI.g:8396:1: rule__Service__FunctionsAssignment_7 : ( ruleFunctions ) ;
    public final void rule__Service__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8400:1: ( ( ruleFunctions ) )
            // InternalAdaptUI.g:8401:2: ( ruleFunctions )
            {
            // InternalAdaptUI.g:8401:2: ( ruleFunctions )
            // InternalAdaptUI.g:8402:3: ruleFunctions
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
    // InternalAdaptUI.g:8411:1: rule__Functions__ThisAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8415:1: ( ( ruleFunction ) )
            // InternalAdaptUI.g:8416:2: ( ruleFunction )
            {
            // InternalAdaptUI.g:8416:2: ( ruleFunction )
            // InternalAdaptUI.g:8417:3: ruleFunction
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
    // InternalAdaptUI.g:8426:1: rule__Functions__NextAssignment_1 : ( ruleFunctions ) ;
    public final void rule__Functions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8430:1: ( ( ruleFunctions ) )
            // InternalAdaptUI.g:8431:2: ( ruleFunctions )
            {
            // InternalAdaptUI.g:8431:2: ( ruleFunctions )
            // InternalAdaptUI.g:8432:3: ruleFunctions
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
    // InternalAdaptUI.g:8441:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8445:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8446:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:8446:2: ( RULE_ID )
            // InternalAdaptUI.g:8447:3: RULE_ID
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
    // InternalAdaptUI.g:8456:1: rule__Function__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8460:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:8461:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:8461:2: ( RULE_STRING )
            // InternalAdaptUI.g:8462:3: RULE_STRING
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
    // InternalAdaptUI.g:8471:1: rule__AdaptationRule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdaptationRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8475:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:8476:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:8476:2: ( RULE_STRING )
            // InternalAdaptUI.g:8477:3: RULE_STRING
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
    // InternalAdaptUI.g:8486:1: rule__AdaptationRule__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__AdaptationRule__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8490:1: ( ( RULE_INT ) )
            // InternalAdaptUI.g:8491:2: ( RULE_INT )
            {
            // InternalAdaptUI.g:8491:2: ( RULE_INT )
            // InternalAdaptUI.g:8492:3: RULE_INT
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
    // InternalAdaptUI.g:8501:1: rule__AdaptationRule__FactTypeAssignment_7 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8505:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8506:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:8506:2: ( RULE_ID )
            // InternalAdaptUI.g:8507:3: RULE_ID
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
    // InternalAdaptUI.g:8516:1: rule__AdaptationRule__FactNameAssignment_8 : ( ruleFactName ) ;
    public final void rule__AdaptationRule__FactNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8520:1: ( ( ruleFactName ) )
            // InternalAdaptUI.g:8521:2: ( ruleFactName )
            {
            // InternalAdaptUI.g:8521:2: ( ruleFactName )
            // InternalAdaptUI.g:8522:3: ruleFactName
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameFactNameParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFactName();

            state._fsp--;

             after(grammarAccess.getAdaptationRuleAccess().getFactNameFactNameParserRuleCall_8_0()); 

            }


            }

        }
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
    // InternalAdaptUI.g:8531:1: rule__AdaptationRule__ExprAssignment_12 : ( ruleConditionalOR ) ;
    public final void rule__AdaptationRule__ExprAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8535:1: ( ( ruleConditionalOR ) )
            // InternalAdaptUI.g:8536:2: ( ruleConditionalOR )
            {
            // InternalAdaptUI.g:8536:2: ( ruleConditionalOR )
            // InternalAdaptUI.g:8537:3: ruleConditionalOR
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
    // InternalAdaptUI.g:8546:1: rule__AdaptationRule__ActionCollectionAssignment_16 : ( ruleActions ) ;
    public final void rule__AdaptationRule__ActionCollectionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8550:1: ( ( ruleActions ) )
            // InternalAdaptUI.g:8551:2: ( ruleActions )
            {
            // InternalAdaptUI.g:8551:2: ( ruleActions )
            // InternalAdaptUI.g:8552:3: ruleActions
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
    // InternalAdaptUI.g:8561:1: rule__ConditionalOR__LeftAssignment_0 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalOR__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8565:1: ( ( ruleConditionalAND ) )
            // InternalAdaptUI.g:8566:2: ( ruleConditionalAND )
            {
            // InternalAdaptUI.g:8566:2: ( ruleConditionalAND )
            // InternalAdaptUI.g:8567:3: ruleConditionalAND
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
    // InternalAdaptUI.g:8576:1: rule__ConditionalOR__RightAssignment_1_1 : ( ruleConditionalOR ) ;
    public final void rule__ConditionalOR__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8580:1: ( ( ruleConditionalOR ) )
            // InternalAdaptUI.g:8581:2: ( ruleConditionalOR )
            {
            // InternalAdaptUI.g:8581:2: ( ruleConditionalOR )
            // InternalAdaptUI.g:8582:3: ruleConditionalOR
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
    // InternalAdaptUI.g:8591:1: rule__ConditionalAND__LeftAssignment_0 : ( ruleConditionalPrimary ) ;
    public final void rule__ConditionalAND__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8595:1: ( ( ruleConditionalPrimary ) )
            // InternalAdaptUI.g:8596:2: ( ruleConditionalPrimary )
            {
            // InternalAdaptUI.g:8596:2: ( ruleConditionalPrimary )
            // InternalAdaptUI.g:8597:3: ruleConditionalPrimary
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
    // InternalAdaptUI.g:8606:1: rule__ConditionalAND__RightAssignment_1_1 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalAND__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8610:1: ( ( ruleConditionalAND ) )
            // InternalAdaptUI.g:8611:2: ( ruleConditionalAND )
            {
            // InternalAdaptUI.g:8611:2: ( ruleConditionalAND )
            // InternalAdaptUI.g:8612:3: ruleConditionalAND
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
    // InternalAdaptUI.g:8621:1: rule__ConditionalPrimary__CondAssignment_0 : ( ruleStringCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8625:1: ( ( ruleStringCondition ) )
            // InternalAdaptUI.g:8626:2: ( ruleStringCondition )
            {
            // InternalAdaptUI.g:8626:2: ( ruleStringCondition )
            // InternalAdaptUI.g:8627:3: ruleStringCondition
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
    // InternalAdaptUI.g:8636:1: rule__ConditionalPrimary__CondAssignment_1 : ( ruleNumberCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8640:1: ( ( ruleNumberCondition ) )
            // InternalAdaptUI.g:8641:2: ( ruleNumberCondition )
            {
            // InternalAdaptUI.g:8641:2: ( ruleNumberCondition )
            // InternalAdaptUI.g:8642:3: ruleNumberCondition
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
    // InternalAdaptUI.g:8651:1: rule__ConditionalPrimary__CondAssignment_2 : ( ruleBooleanCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8655:1: ( ( ruleBooleanCondition ) )
            // InternalAdaptUI.g:8656:2: ( ruleBooleanCondition )
            {
            // InternalAdaptUI.g:8656:2: ( ruleBooleanCondition )
            // InternalAdaptUI.g:8657:3: ruleBooleanCondition
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
    // InternalAdaptUI.g:8666:1: rule__BooleanCondition__FactAssignment_0_0 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8670:1: ( ( ruleFact ) )
            // InternalAdaptUI.g:8671:2: ( ruleFact )
            {
            // InternalAdaptUI.g:8671:2: ( ruleFact )
            // InternalAdaptUI.g:8672:3: ruleFact
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
    // InternalAdaptUI.g:8681:1: rule__BooleanCondition__OpAssignment_0_1 : ( ruleBoolOperators ) ;
    public final void rule__BooleanCondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8685:1: ( ( ruleBoolOperators ) )
            // InternalAdaptUI.g:8686:2: ( ruleBoolOperators )
            {
            // InternalAdaptUI.g:8686:2: ( ruleBoolOperators )
            // InternalAdaptUI.g:8687:3: ruleBoolOperators
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
    // InternalAdaptUI.g:8696:1: rule__BooleanCondition__ValAssignment_0_2 : ( RULE_BOOL ) ;
    public final void rule__BooleanCondition__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8700:1: ( ( RULE_BOOL ) )
            // InternalAdaptUI.g:8701:2: ( RULE_BOOL )
            {
            // InternalAdaptUI.g:8701:2: ( RULE_BOOL )
            // InternalAdaptUI.g:8702:3: RULE_BOOL
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
    // InternalAdaptUI.g:8711:1: rule__BooleanCondition__FactAssignment_1 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8715:1: ( ( ruleFact ) )
            // InternalAdaptUI.g:8716:2: ( ruleFact )
            {
            // InternalAdaptUI.g:8716:2: ( ruleFact )
            // InternalAdaptUI.g:8717:3: ruleFact
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
    // InternalAdaptUI.g:8726:1: rule__NumberCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__NumberCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8730:1: ( ( ruleFact ) )
            // InternalAdaptUI.g:8731:2: ( ruleFact )
            {
            // InternalAdaptUI.g:8731:2: ( ruleFact )
            // InternalAdaptUI.g:8732:3: ruleFact
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
    // InternalAdaptUI.g:8741:1: rule__NumberCondition__OpAssignment_1 : ( ruleNumberOperators ) ;
    public final void rule__NumberCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8745:1: ( ( ruleNumberOperators ) )
            // InternalAdaptUI.g:8746:2: ( ruleNumberOperators )
            {
            // InternalAdaptUI.g:8746:2: ( ruleNumberOperators )
            // InternalAdaptUI.g:8747:3: ruleNumberOperators
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
    // InternalAdaptUI.g:8756:1: rule__NumberCondition__ValAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8760:1: ( ( RULE_INT ) )
            // InternalAdaptUI.g:8761:2: ( RULE_INT )
            {
            // InternalAdaptUI.g:8761:2: ( RULE_INT )
            // InternalAdaptUI.g:8762:3: RULE_INT
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
    // InternalAdaptUI.g:8771:1: rule__StringCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__StringCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8775:1: ( ( ruleFact ) )
            // InternalAdaptUI.g:8776:2: ( ruleFact )
            {
            // InternalAdaptUI.g:8776:2: ( ruleFact )
            // InternalAdaptUI.g:8777:3: ruleFact
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
    // InternalAdaptUI.g:8786:1: rule__StringCondition__OpAssignment_1 : ( ruleStringOperators ) ;
    public final void rule__StringCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8790:1: ( ( ruleStringOperators ) )
            // InternalAdaptUI.g:8791:2: ( ruleStringOperators )
            {
            // InternalAdaptUI.g:8791:2: ( ruleStringOperators )
            // InternalAdaptUI.g:8792:3: ruleStringOperators
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
    // InternalAdaptUI.g:8801:1: rule__StringCondition__ValAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8805:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:8806:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:8806:2: ( RULE_STRING )
            // InternalAdaptUI.g:8807:3: RULE_STRING
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


    // $ANTLR start "rule__Fact__FactNameAssignment_0"
    // InternalAdaptUI.g:8816:1: rule__Fact__FactNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Fact__FactNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8820:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptUI.g:8821:2: ( ( RULE_ID ) )
            {
            // InternalAdaptUI.g:8821:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8822:3: ( RULE_ID )
            {
             before(grammarAccess.getFactAccess().getFactNameFactNameCrossReference_0_0()); 
            // InternalAdaptUI.g:8823:3: ( RULE_ID )
            // InternalAdaptUI.g:8824:4: RULE_ID
            {
             before(grammarAccess.getFactAccess().getFactNameFactNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getFactNameFactNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFactAccess().getFactNameFactNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__FactNameAssignment_0"


    // $ANTLR start "rule__Fact__EntityAssignment_2"
    // InternalAdaptUI.g:8835:1: rule__Fact__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fact__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8839:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptUI.g:8840:2: ( ( RULE_ID ) )
            {
            // InternalAdaptUI.g:8840:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8841:3: ( RULE_ID )
            {
             before(grammarAccess.getFactAccess().getEntityEntityCrossReference_2_0()); 
            // InternalAdaptUI.g:8842:3: ( RULE_ID )
            // InternalAdaptUI.g:8843:4: RULE_ID
            {
             before(grammarAccess.getFactAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFactAccess().getEntityEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__EntityAssignment_2"


    // $ANTLR start "rule__Fact__PropertyNameAssignment_5"
    // InternalAdaptUI.g:8854:1: rule__Fact__PropertyNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Fact__PropertyNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8858:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8859:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:8859:2: ( RULE_ID )
            // InternalAdaptUI.g:8860:3: RULE_ID
            {
             before(grammarAccess.getFactAccess().getPropertyNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getPropertyNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__PropertyNameAssignment_5"


    // $ANTLR start "rule__FactName__NameAssignment"
    // InternalAdaptUI.g:8869:1: rule__FactName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FactName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8873:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8874:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:8874:2: ( RULE_ID )
            // InternalAdaptUI.g:8875:3: RULE_ID
            {
             before(grammarAccess.getFactNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactName__NameAssignment"


    // $ANTLR start "rule__FactProperty__FactNameAssignment_0"
    // InternalAdaptUI.g:8884:1: rule__FactProperty__FactNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FactProperty__FactNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8888:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptUI.g:8889:2: ( ( RULE_ID ) )
            {
            // InternalAdaptUI.g:8889:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8890:3: ( RULE_ID )
            {
             before(grammarAccess.getFactPropertyAccess().getFactNameFactNameCrossReference_0_0()); 
            // InternalAdaptUI.g:8891:3: ( RULE_ID )
            // InternalAdaptUI.g:8892:4: RULE_ID
            {
             before(grammarAccess.getFactPropertyAccess().getFactNameFactNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getFactNameFactNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFactPropertyAccess().getFactNameFactNameCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__FactNameAssignment_0"


    // $ANTLR start "rule__FactProperty__EntityAssignment_2"
    // InternalAdaptUI.g:8903:1: rule__FactProperty__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__FactProperty__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8907:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptUI.g:8908:2: ( ( RULE_ID ) )
            {
            // InternalAdaptUI.g:8908:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8909:3: ( RULE_ID )
            {
             before(grammarAccess.getFactPropertyAccess().getEntityEntityCrossReference_2_0()); 
            // InternalAdaptUI.g:8910:3: ( RULE_ID )
            // InternalAdaptUI.g:8911:4: RULE_ID
            {
             before(grammarAccess.getFactPropertyAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getEntityEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFactPropertyAccess().getEntityEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__EntityAssignment_2"


    // $ANTLR start "rule__FactProperty__PropertyNameAssignment_5"
    // InternalAdaptUI.g:8922:1: rule__FactProperty__PropertyNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__FactProperty__PropertyNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8926:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:8927:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:8927:2: ( RULE_ID )
            // InternalAdaptUI.g:8928:3: RULE_ID
            {
             before(grammarAccess.getFactPropertyAccess().getPropertyNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactPropertyAccess().getPropertyNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__PropertyNameAssignment_5"


    // $ANTLR start "rule__FactProperty__ValueAssignment_7"
    // InternalAdaptUI.g:8937:1: rule__FactProperty__ValueAssignment_7 : ( ruleValue ) ;
    public final void rule__FactProperty__ValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8941:1: ( ( ruleValue ) )
            // InternalAdaptUI.g:8942:2: ( ruleValue )
            {
            // InternalAdaptUI.g:8942:2: ( ruleValue )
            // InternalAdaptUI.g:8943:3: ruleValue
            {
             before(grammarAccess.getFactPropertyAccess().getValueValueParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFactPropertyAccess().getValueValueParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactProperty__ValueAssignment_7"


    // $ANTLR start "rule__Actions__ActionAssignment_0"
    // InternalAdaptUI.g:8952:1: rule__Actions__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Actions__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8956:1: ( ( ruleAction ) )
            // InternalAdaptUI.g:8957:2: ( ruleAction )
            {
            // InternalAdaptUI.g:8957:2: ( ruleAction )
            // InternalAdaptUI.g:8958:3: ruleAction
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
    // InternalAdaptUI.g:8967:1: rule__Actions__NextAssignment_1 : ( ruleActions ) ;
    public final void rule__Actions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8971:1: ( ( ruleActions ) )
            // InternalAdaptUI.g:8972:2: ( ruleActions )
            {
            // InternalAdaptUI.g:8972:2: ( ruleActions )
            // InternalAdaptUI.g:8973:3: ruleActions
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
    // InternalAdaptUI.g:8982:1: rule__Action__ActionCategoryAssignment_0 : ( ruleServiceOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:8986:1: ( ( ruleServiceOperation ) )
            // InternalAdaptUI.g:8987:2: ( ruleServiceOperation )
            {
            // InternalAdaptUI.g:8987:2: ( ruleServiceOperation )
            // InternalAdaptUI.g:8988:3: ruleServiceOperation
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
    // InternalAdaptUI.g:8997:1: rule__Action__ActionCategoryAssignment_1 : ( ruleTaskChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9001:1: ( ( ruleTaskChangeOperation ) )
            // InternalAdaptUI.g:9002:2: ( ruleTaskChangeOperation )
            {
            // InternalAdaptUI.g:9002:2: ( ruleTaskChangeOperation )
            // InternalAdaptUI.g:9003:3: ruleTaskChangeOperation
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
    // InternalAdaptUI.g:9012:1: rule__Action__ActionCategoryAssignment_2 : ( ruleNavigationChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9016:1: ( ( ruleNavigationChangeOperation ) )
            // InternalAdaptUI.g:9017:2: ( ruleNavigationChangeOperation )
            {
            // InternalAdaptUI.g:9017:2: ( ruleNavigationChangeOperation )
            // InternalAdaptUI.g:9018:3: ruleNavigationChangeOperation
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
    // InternalAdaptUI.g:9027:1: rule__Action__ActionCategoryAssignment_3 : ( ruleLayoutChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9031:1: ( ( ruleLayoutChangeOperation ) )
            // InternalAdaptUI.g:9032:2: ( ruleLayoutChangeOperation )
            {
            // InternalAdaptUI.g:9032:2: ( ruleLayoutChangeOperation )
            // InternalAdaptUI.g:9033:3: ruleLayoutChangeOperation
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
    // InternalAdaptUI.g:9042:1: rule__ServiceOperation__OperationAssignment_0 : ( ruleServiceFunctionCallOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9046:1: ( ( ruleServiceFunctionCallOperation ) )
            // InternalAdaptUI.g:9047:2: ( ruleServiceFunctionCallOperation )
            {
            // InternalAdaptUI.g:9047:2: ( ruleServiceFunctionCallOperation )
            // InternalAdaptUI.g:9048:3: ruleServiceFunctionCallOperation
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
    // InternalAdaptUI.g:9057:1: rule__ServiceOperation__OperationAssignment_1 : ( ruleEditFactOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9061:1: ( ( ruleEditFactOperation ) )
            // InternalAdaptUI.g:9062:2: ( ruleEditFactOperation )
            {
            // InternalAdaptUI.g:9062:2: ( ruleEditFactOperation )
            // InternalAdaptUI.g:9063:3: ruleEditFactOperation
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
    // InternalAdaptUI.g:9072:1: rule__ServiceOperation__OperationAssignment_2 : ( ruleSetDisplayPropertyOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9076:1: ( ( ruleSetDisplayPropertyOperation ) )
            // InternalAdaptUI.g:9077:2: ( ruleSetDisplayPropertyOperation )
            {
            // InternalAdaptUI.g:9077:2: ( ruleSetDisplayPropertyOperation )
            // InternalAdaptUI.g:9078:3: ruleSetDisplayPropertyOperation
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
    // InternalAdaptUI.g:9087:1: rule__ServiceFunctionCallOperation__ServiceAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9091:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9092:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:9092:2: ( RULE_ID )
            // InternalAdaptUI.g:9093:3: RULE_ID
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
    // InternalAdaptUI.g:9102:1: rule__ServiceFunctionCallOperation__FunctionAssignment_4 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9106:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9107:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:9107:2: ( RULE_ID )
            // InternalAdaptUI.g:9108:3: RULE_ID
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
    // InternalAdaptUI.g:9117:1: rule__ServiceFunctionCallOperation__ValAssignment_6 : ( ruleValue ) ;
    public final void rule__ServiceFunctionCallOperation__ValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9121:1: ( ( ruleValue ) )
            // InternalAdaptUI.g:9122:2: ( ruleValue )
            {
            // InternalAdaptUI.g:9122:2: ( ruleValue )
            // InternalAdaptUI.g:9123:3: ruleValue
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
    // InternalAdaptUI.g:9132:1: rule__EditFactOperation__PropAssignment_2 : ( ruleFactProperty ) ;
    public final void rule__EditFactOperation__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9136:1: ( ( ruleFactProperty ) )
            // InternalAdaptUI.g:9137:2: ( ruleFactProperty )
            {
            // InternalAdaptUI.g:9137:2: ( ruleFactProperty )
            // InternalAdaptUI.g:9138:3: ruleFactProperty
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
    // InternalAdaptUI.g:9147:1: rule__EditFactOperation__ValAssignment_3_1 : ( ruleValue ) ;
    public final void rule__EditFactOperation__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9151:1: ( ( ruleValue ) )
            // InternalAdaptUI.g:9152:2: ( ruleValue )
            {
            // InternalAdaptUI.g:9152:2: ( ruleValue )
            // InternalAdaptUI.g:9153:3: ruleValue
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
    // InternalAdaptUI.g:9162:1: rule__SetDisplayPropertyOperation__PropertyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9166:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9167:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9167:2: ( RULE_STRING )
            // InternalAdaptUI.g:9168:3: RULE_STRING
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
    // InternalAdaptUI.g:9177:1: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 : ( ruleDisplayPropertyValue ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9181:1: ( ( ruleDisplayPropertyValue ) )
            // InternalAdaptUI.g:9182:2: ( ruleDisplayPropertyValue )
            {
            // InternalAdaptUI.g:9182:2: ( ruleDisplayPropertyValue )
            // InternalAdaptUI.g:9183:3: ruleDisplayPropertyValue
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
    // InternalAdaptUI.g:9192:1: rule__DisplayPropertyValue__PropertyClassAssignment_0 : ( ruleIntValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9196:1: ( ( ruleIntValue ) )
            // InternalAdaptUI.g:9197:2: ( ruleIntValue )
            {
            // InternalAdaptUI.g:9197:2: ( ruleIntValue )
            // InternalAdaptUI.g:9198:3: ruleIntValue
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
    // InternalAdaptUI.g:9207:1: rule__DisplayPropertyValue__PropertyClassAssignment_1 : ( ruleStringValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9211:1: ( ( ruleStringValue ) )
            // InternalAdaptUI.g:9212:2: ( ruleStringValue )
            {
            // InternalAdaptUI.g:9212:2: ( ruleStringValue )
            // InternalAdaptUI.g:9213:3: ruleStringValue
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
    // InternalAdaptUI.g:9222:1: rule__DisplayPropertyValue__PropertyClassAssignment_2 : ( ruleBoolValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9226:1: ( ( ruleBoolValue ) )
            // InternalAdaptUI.g:9227:2: ( ruleBoolValue )
            {
            // InternalAdaptUI.g:9227:2: ( ruleBoolValue )
            // InternalAdaptUI.g:9228:3: ruleBoolValue
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
    // InternalAdaptUI.g:9237:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9241:1: ( ( RULE_INT ) )
            // InternalAdaptUI.g:9242:2: ( RULE_INT )
            {
            // InternalAdaptUI.g:9242:2: ( RULE_INT )
            // InternalAdaptUI.g:9243:3: RULE_INT
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
    // InternalAdaptUI.g:9252:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9256:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9257:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9257:2: ( RULE_STRING )
            // InternalAdaptUI.g:9258:3: RULE_STRING
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
    // InternalAdaptUI.g:9267:1: rule__BoolValue__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9271:1: ( ( RULE_BOOL ) )
            // InternalAdaptUI.g:9272:2: ( RULE_BOOL )
            {
            // InternalAdaptUI.g:9272:2: ( RULE_BOOL )
            // InternalAdaptUI.g:9273:3: RULE_BOOL
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
    // InternalAdaptUI.g:9282:1: rule__TaskChangeOperation__OperationAssignment_0 : ( ruleAddViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9286:1: ( ( ruleAddViewComponentOperation ) )
            // InternalAdaptUI.g:9287:2: ( ruleAddViewComponentOperation )
            {
            // InternalAdaptUI.g:9287:2: ( ruleAddViewComponentOperation )
            // InternalAdaptUI.g:9288:3: ruleAddViewComponentOperation
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
    // InternalAdaptUI.g:9297:1: rule__TaskChangeOperation__OperationAssignment_1 : ( ruleDeleteViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9301:1: ( ( ruleDeleteViewComponentOperation ) )
            // InternalAdaptUI.g:9302:2: ( ruleDeleteViewComponentOperation )
            {
            // InternalAdaptUI.g:9302:2: ( ruleDeleteViewComponentOperation )
            // InternalAdaptUI.g:9303:3: ruleDeleteViewComponentOperation
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
    // InternalAdaptUI.g:9312:1: rule__TaskChangeOperation__OperationAssignment_2 : ( ruleAddViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9316:1: ( ( ruleAddViewComponentButtonOperation ) )
            // InternalAdaptUI.g:9317:2: ( ruleAddViewComponentButtonOperation )
            {
            // InternalAdaptUI.g:9317:2: ( ruleAddViewComponentButtonOperation )
            // InternalAdaptUI.g:9318:3: ruleAddViewComponentButtonOperation
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
    // InternalAdaptUI.g:9327:1: rule__TaskChangeOperation__OperationAssignment_3 : ( ruleDeleteViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9331:1: ( ( ruleDeleteViewComponentButtonOperation ) )
            // InternalAdaptUI.g:9332:2: ( ruleDeleteViewComponentButtonOperation )
            {
            // InternalAdaptUI.g:9332:2: ( ruleDeleteViewComponentButtonOperation )
            // InternalAdaptUI.g:9333:3: ruleDeleteViewComponentButtonOperation
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
    // InternalAdaptUI.g:9342:1: rule__AddViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9346:1: ( ( ruleViewComponent ) )
            // InternalAdaptUI.g:9347:2: ( ruleViewComponent )
            {
            // InternalAdaptUI.g:9347:2: ( ruleViewComponent )
            // InternalAdaptUI.g:9348:3: ruleViewComponent
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
    // InternalAdaptUI.g:9357:1: rule__AddViewComponentOperation__TargetAssignment_4 : ( ruleTargetContainer ) ;
    public final void rule__AddViewComponentOperation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9361:1: ( ( ruleTargetContainer ) )
            // InternalAdaptUI.g:9362:2: ( ruleTargetContainer )
            {
            // InternalAdaptUI.g:9362:2: ( ruleTargetContainer )
            // InternalAdaptUI.g:9363:3: ruleTargetContainer
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
    // InternalAdaptUI.g:9372:1: rule__DeleteViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9376:1: ( ( ruleViewComponent ) )
            // InternalAdaptUI.g:9377:2: ( ruleViewComponent )
            {
            // InternalAdaptUI.g:9377:2: ( ruleViewComponent )
            // InternalAdaptUI.g:9378:3: ruleViewComponent
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
    // InternalAdaptUI.g:9387:1: rule__AddViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9391:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9392:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9392:2: ( RULE_STRING )
            // InternalAdaptUI.g:9393:3: RULE_STRING
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
    // InternalAdaptUI.g:9402:1: rule__AddViewComponentButtonOperation__LangKeyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__LangKeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9406:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9407:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9407:2: ( RULE_STRING )
            // InternalAdaptUI.g:9408:3: RULE_STRING
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
    // InternalAdaptUI.g:9417:1: rule__AddViewComponentButtonOperation__ActionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9421:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9422:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9422:2: ( RULE_STRING )
            // InternalAdaptUI.g:9423:3: RULE_STRING
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
    // InternalAdaptUI.g:9432:1: rule__DeleteViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DeleteViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9436:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9437:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9437:2: ( RULE_STRING )
            // InternalAdaptUI.g:9438:3: RULE_STRING
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
    // InternalAdaptUI.g:9447:1: rule__NavigationChangeOperation__OperationAssignment_0 : ( ruleAddNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9451:1: ( ( ruleAddNavLinkOperation ) )
            // InternalAdaptUI.g:9452:2: ( ruleAddNavLinkOperation )
            {
            // InternalAdaptUI.g:9452:2: ( ruleAddNavLinkOperation )
            // InternalAdaptUI.g:9453:3: ruleAddNavLinkOperation
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
    // InternalAdaptUI.g:9462:1: rule__NavigationChangeOperation__OperationAssignment_1 : ( ruleDeleteNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9466:1: ( ( ruleDeleteNavLinkOperation ) )
            // InternalAdaptUI.g:9467:2: ( ruleDeleteNavLinkOperation )
            {
            // InternalAdaptUI.g:9467:2: ( ruleDeleteNavLinkOperation )
            // InternalAdaptUI.g:9468:3: ruleDeleteNavLinkOperation
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
    // InternalAdaptUI.g:9477:1: rule__NavigationChangeOperation__OperationAssignment_2 : ( ruleRedirectNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9481:1: ( ( ruleRedirectNavLinkOperation ) )
            // InternalAdaptUI.g:9482:2: ( ruleRedirectNavLinkOperation )
            {
            // InternalAdaptUI.g:9482:2: ( ruleRedirectNavLinkOperation )
            // InternalAdaptUI.g:9483:3: ruleRedirectNavLinkOperation
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
    // InternalAdaptUI.g:9492:1: rule__NavigationChangeOperation__OperationAssignment_3 : ( ruleClearNavOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9496:1: ( ( ruleClearNavOperation ) )
            // InternalAdaptUI.g:9497:2: ( ruleClearNavOperation )
            {
            // InternalAdaptUI.g:9497:2: ( ruleClearNavOperation )
            // InternalAdaptUI.g:9498:3: ruleClearNavOperation
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
    // InternalAdaptUI.g:9507:1: rule__AddNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9511:1: ( ( ruleViewComponent ) )
            // InternalAdaptUI.g:9512:2: ( ruleViewComponent )
            {
            // InternalAdaptUI.g:9512:2: ( ruleViewComponent )
            // InternalAdaptUI.g:9513:3: ruleViewComponent
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
    // InternalAdaptUI.g:9522:1: rule__AddNavLinkOperation__TextAssignment_4 : ( ruleText ) ;
    public final void rule__AddNavLinkOperation__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9526:1: ( ( ruleText ) )
            // InternalAdaptUI.g:9527:2: ( ruleText )
            {
            // InternalAdaptUI.g:9527:2: ( ruleText )
            // InternalAdaptUI.g:9528:3: ruleText
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
    // InternalAdaptUI.g:9537:1: rule__DeleteNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9541:1: ( ( ruleViewComponent ) )
            // InternalAdaptUI.g:9542:2: ( ruleViewComponent )
            {
            // InternalAdaptUI.g:9542:2: ( ruleViewComponent )
            // InternalAdaptUI.g:9543:3: ruleViewComponent
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
    // InternalAdaptUI.g:9552:1: rule__RedirectNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__RedirectNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9556:1: ( ( ruleViewComponent ) )
            // InternalAdaptUI.g:9557:2: ( ruleViewComponent )
            {
            // InternalAdaptUI.g:9557:2: ( ruleViewComponent )
            // InternalAdaptUI.g:9558:3: ruleViewComponent
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
    // InternalAdaptUI.g:9567:1: rule__LayoutChangeOperation__OperationAssignment_0 : ( ruleChangeFontOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9571:1: ( ( ruleChangeFontOperation ) )
            // InternalAdaptUI.g:9572:2: ( ruleChangeFontOperation )
            {
            // InternalAdaptUI.g:9572:2: ( ruleChangeFontOperation )
            // InternalAdaptUI.g:9573:3: ruleChangeFontOperation
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
    // InternalAdaptUI.g:9582:1: rule__LayoutChangeOperation__OperationAssignment_1 : ( ruleChangeFontSizeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9586:1: ( ( ruleChangeFontSizeOperation ) )
            // InternalAdaptUI.g:9587:2: ( ruleChangeFontSizeOperation )
            {
            // InternalAdaptUI.g:9587:2: ( ruleChangeFontSizeOperation )
            // InternalAdaptUI.g:9588:3: ruleChangeFontSizeOperation
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
    // InternalAdaptUI.g:9597:1: rule__LayoutChangeOperation__OperationAssignment_2 : ( ruleChangeTableCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9601:1: ( ( ruleChangeTableCssClassOperation ) )
            // InternalAdaptUI.g:9602:2: ( ruleChangeTableCssClassOperation )
            {
            // InternalAdaptUI.g:9602:2: ( ruleChangeTableCssClassOperation )
            // InternalAdaptUI.g:9603:3: ruleChangeTableCssClassOperation
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
    // InternalAdaptUI.g:9612:1: rule__LayoutChangeOperation__OperationAssignment_3 : ( ruleAdaptCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9616:1: ( ( ruleAdaptCssClassOperation ) )
            // InternalAdaptUI.g:9617:2: ( ruleAdaptCssClassOperation )
            {
            // InternalAdaptUI.g:9617:2: ( ruleAdaptCssClassOperation )
            // InternalAdaptUI.g:9618:3: ruleAdaptCssClassOperation
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
    // InternalAdaptUI.g:9627:1: rule__LayoutChangeOperation__OperationAssignment_4 : ( ruleChangeColorSchemeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9631:1: ( ( ruleChangeColorSchemeOperation ) )
            // InternalAdaptUI.g:9632:2: ( ruleChangeColorSchemeOperation )
            {
            // InternalAdaptUI.g:9632:2: ( ruleChangeColorSchemeOperation )
            // InternalAdaptUI.g:9633:3: ruleChangeColorSchemeOperation
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
    // InternalAdaptUI.g:9642:1: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizePrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9646:1: ( ( ruleFontSize ) )
            // InternalAdaptUI.g:9647:2: ( ruleFontSize )
            {
            // InternalAdaptUI.g:9647:2: ( ruleFontSize )
            // InternalAdaptUI.g:9648:3: ruleFontSize
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
    // InternalAdaptUI.g:9657:1: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9661:1: ( ( ruleFontSize ) )
            // InternalAdaptUI.g:9662:2: ( ruleFontSize )
            {
            // InternalAdaptUI.g:9662:2: ( ruleFontSize )
            // InternalAdaptUI.g:9663:3: ruleFontSize
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
    // InternalAdaptUI.g:9672:1: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9676:1: ( ( ruleColor ) )
            // InternalAdaptUI.g:9677:2: ( ruleColor )
            {
            // InternalAdaptUI.g:9677:2: ( ruleColor )
            // InternalAdaptUI.g:9678:3: ruleColor
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
    // InternalAdaptUI.g:9687:1: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9691:1: ( ( ruleColor ) )
            // InternalAdaptUI.g:9692:2: ( ruleColor )
            {
            // InternalAdaptUI.g:9692:2: ( ruleColor )
            // InternalAdaptUI.g:9693:3: ruleColor
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
    // InternalAdaptUI.g:9702:1: rule__ChangeFontOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeFontOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9706:1: ( ( ruleText ) )
            // InternalAdaptUI.g:9707:2: ( ruleText )
            {
            // InternalAdaptUI.g:9707:2: ( ruleText )
            // InternalAdaptUI.g:9708:3: ruleText
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
    // InternalAdaptUI.g:9717:1: rule__ChangeTableCssClassOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeTableCssClassOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9721:1: ( ( ruleText ) )
            // InternalAdaptUI.g:9722:2: ( ruleText )
            {
            // InternalAdaptUI.g:9722:2: ( ruleText )
            // InternalAdaptUI.g:9723:3: ruleText
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
    // InternalAdaptUI.g:9732:1: rule__AdaptCssClassOperation__CssClassAssignment_2 : ( ruleCssClass ) ;
    public final void rule__AdaptCssClassOperation__CssClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9736:1: ( ( ruleCssClass ) )
            // InternalAdaptUI.g:9737:2: ( ruleCssClass )
            {
            // InternalAdaptUI.g:9737:2: ( ruleCssClass )
            // InternalAdaptUI.g:9738:3: ruleCssClass
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
    // InternalAdaptUI.g:9747:1: rule__AdaptCssClassOperation__CssAttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9751:1: ( ( ruleAttribute ) )
            // InternalAdaptUI.g:9752:2: ( ruleAttribute )
            {
            // InternalAdaptUI.g:9752:2: ( ruleAttribute )
            // InternalAdaptUI.g:9753:3: ruleAttribute
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
    // InternalAdaptUI.g:9762:1: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 : ( ruleAttributeValue ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9766:1: ( ( ruleAttributeValue ) )
            // InternalAdaptUI.g:9767:2: ( ruleAttributeValue )
            {
            // InternalAdaptUI.g:9767:2: ( ruleAttributeValue )
            // InternalAdaptUI.g:9768:3: ruleAttributeValue
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
    // InternalAdaptUI.g:9777:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9781:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9782:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:9782:2: ( RULE_ID )
            // InternalAdaptUI.g:9783:3: RULE_ID
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
    // InternalAdaptUI.g:9792:1: rule__Entity__PropertyAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9796:1: ( ( ruleProperty ) )
            // InternalAdaptUI.g:9797:2: ( ruleProperty )
            {
            // InternalAdaptUI.g:9797:2: ( ruleProperty )
            // InternalAdaptUI.g:9798:3: ruleProperty
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


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalAdaptUI.g:9807:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9811:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9812:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:9812:2: ( RULE_ID )
            // InternalAdaptUI.g:9813:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_3"
    // InternalAdaptUI.g:9822:1: rule__Property__TypeAssignment_3 : ( ruleTYPE ) ;
    public final void rule__Property__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9826:1: ( ( ruleTYPE ) )
            // InternalAdaptUI.g:9827:2: ( ruleTYPE )
            {
            // InternalAdaptUI.g:9827:2: ( ruleTYPE )
            // InternalAdaptUI.g:9828:3: ruleTYPE
            {
             before(grammarAccess.getPropertyAccess().getTypeTYPEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTYPEParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Property__ProviderAssignment_6"
    // InternalAdaptUI.g:9837:1: rule__Property__ProviderAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ProviderAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9841:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptUI.g:9842:2: ( ( RULE_ID ) )
            {
            // InternalAdaptUI.g:9842:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9843:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderCrossReference_6_0()); 
            // InternalAdaptUI.g:9844:3: ( RULE_ID )
            // InternalAdaptUI.g:9845:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getProviderProviderIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getProviderProviderCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ProviderAssignment_6"


    // $ANTLR start "rule__Property__UpdateAssignment_9"
    // InternalAdaptUI.g:9856:1: rule__Property__UpdateAssignment_9 : ( ruleUpdateType ) ;
    public final void rule__Property__UpdateAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9860:1: ( ( ruleUpdateType ) )
            // InternalAdaptUI.g:9861:2: ( ruleUpdateType )
            {
            // InternalAdaptUI.g:9861:2: ( ruleUpdateType )
            // InternalAdaptUI.g:9862:3: ruleUpdateType
            {
             before(grammarAccess.getPropertyAccess().getUpdateUpdateTypeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getUpdateUpdateTypeParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__UpdateAssignment_9"


    // $ANTLR start "rule__Provider__NameAssignment"
    // InternalAdaptUI.g:9871:1: rule__Provider__NameAssignment : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9875:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9876:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:9876:2: ( RULE_ID )
            // InternalAdaptUI.g:9877:3: RULE_ID
            {
             before(grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalAdaptUI.g:9886:1: rule__DefTypes__ThisAssignment_0 : ( ruleDefType ) ;
    public final void rule__DefTypes__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9890:1: ( ( ruleDefType ) )
            // InternalAdaptUI.g:9891:2: ( ruleDefType )
            {
            // InternalAdaptUI.g:9891:2: ( ruleDefType )
            // InternalAdaptUI.g:9892:3: ruleDefType
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
    // InternalAdaptUI.g:9901:1: rule__DefTypes__NextAssignment_1 : ( ruleDefTypes ) ;
    public final void rule__DefTypes__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9905:1: ( ( ruleDefTypes ) )
            // InternalAdaptUI.g:9906:2: ( ruleDefTypes )
            {
            // InternalAdaptUI.g:9906:2: ( ruleDefTypes )
            // InternalAdaptUI.g:9907:3: ruleDefTypes
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
    // InternalAdaptUI.g:9916:1: rule__DefType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9920:1: ( ( RULE_ID ) )
            // InternalAdaptUI.g:9921:2: ( RULE_ID )
            {
            // InternalAdaptUI.g:9921:2: ( RULE_ID )
            // InternalAdaptUI.g:9922:3: RULE_ID
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
    // InternalAdaptUI.g:9931:1: rule__DefType__EnumsAssignment_2 : ( ruleEnums ) ;
    public final void rule__DefType__EnumsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9935:1: ( ( ruleEnums ) )
            // InternalAdaptUI.g:9936:2: ( ruleEnums )
            {
            // InternalAdaptUI.g:9936:2: ( ruleEnums )
            // InternalAdaptUI.g:9937:3: ruleEnums
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
    // InternalAdaptUI.g:9946:1: rule__Enums__ThisAssignment_0 : ( ruleEnum ) ;
    public final void rule__Enums__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9950:1: ( ( ruleEnum ) )
            // InternalAdaptUI.g:9951:2: ( ruleEnum )
            {
            // InternalAdaptUI.g:9951:2: ( ruleEnum )
            // InternalAdaptUI.g:9952:3: ruleEnum
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
    // InternalAdaptUI.g:9961:1: rule__Enums__NextAssignment_1_1 : ( ruleEnums ) ;
    public final void rule__Enums__NextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9965:1: ( ( ruleEnums ) )
            // InternalAdaptUI.g:9966:2: ( ruleEnums )
            {
            // InternalAdaptUI.g:9966:2: ( ruleEnums )
            // InternalAdaptUI.g:9967:3: ruleEnums
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
    // InternalAdaptUI.g:9976:1: rule__Enum__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Enum__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9980:1: ( ( RULE_STRING ) )
            // InternalAdaptUI.g:9981:2: ( RULE_STRING )
            {
            // InternalAdaptUI.g:9981:2: ( RULE_STRING )
            // InternalAdaptUI.g:9982:3: RULE_STRING
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


    // $ANTLR start "rule__TYPE__StringAssignment_0"
    // InternalAdaptUI.g:9991:1: rule__TYPE__StringAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__TYPE__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:9995:1: ( ( ( 'string' ) ) )
            // InternalAdaptUI.g:9996:2: ( ( 'string' ) )
            {
            // InternalAdaptUI.g:9996:2: ( ( 'string' ) )
            // InternalAdaptUI.g:9997:3: ( 'string' )
            {
             before(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 
            // InternalAdaptUI.g:9998:3: ( 'string' )
            // InternalAdaptUI.g:9999:4: 'string'
            {
             before(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 

            }

             after(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE__StringAssignment_0"


    // $ANTLR start "rule__TYPE__NumberAssignment_1"
    // InternalAdaptUI.g:10010:1: rule__TYPE__NumberAssignment_1 : ( ( 'number' ) ) ;
    public final void rule__TYPE__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:10014:1: ( ( ( 'number' ) ) )
            // InternalAdaptUI.g:10015:2: ( ( 'number' ) )
            {
            // InternalAdaptUI.g:10015:2: ( ( 'number' ) )
            // InternalAdaptUI.g:10016:3: ( 'number' )
            {
             before(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 
            // InternalAdaptUI.g:10017:3: ( 'number' )
            // InternalAdaptUI.g:10018:4: 'number'
            {
             before(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 

            }

             after(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE__NumberAssignment_1"


    // $ANTLR start "rule__TYPE__BooleanAssignment_2"
    // InternalAdaptUI.g:10029:1: rule__TYPE__BooleanAssignment_2 : ( ( 'boolean' ) ) ;
    public final void rule__TYPE__BooleanAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:10033:1: ( ( ( 'boolean' ) ) )
            // InternalAdaptUI.g:10034:2: ( ( 'boolean' ) )
            {
            // InternalAdaptUI.g:10034:2: ( ( 'boolean' ) )
            // InternalAdaptUI.g:10035:3: ( 'boolean' )
            {
             before(grammarAccess.getTYPEAccess().getBooleanBooleanKeyword_2_0()); 
            // InternalAdaptUI.g:10036:3: ( 'boolean' )
            // InternalAdaptUI.g:10037:4: 'boolean'
            {
             before(grammarAccess.getTYPEAccess().getBooleanBooleanKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getTYPEAccess().getBooleanBooleanKeyword_2_0()); 

            }

             after(grammarAccess.getTYPEAccess().getBooleanBooleanKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE__BooleanAssignment_2"


    // $ANTLR start "rule__TYPE__DeftypeAssignment_3"
    // InternalAdaptUI.g:10048:1: rule__TYPE__DeftypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TYPE__DeftypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:10052:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptUI.g:10053:2: ( ( RULE_ID ) )
            {
            // InternalAdaptUI.g:10053:2: ( ( RULE_ID ) )
            // InternalAdaptUI.g:10054:3: ( RULE_ID )
            {
             before(grammarAccess.getTYPEAccess().getDeftypeDefTypeCrossReference_3_0()); 
            // InternalAdaptUI.g:10055:3: ( RULE_ID )
            // InternalAdaptUI.g:10056:4: RULE_ID
            {
             before(grammarAccess.getTYPEAccess().getDeftypeDefTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTYPEAccess().getDeftypeDefTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTYPEAccess().getDeftypeDefTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE__DeftypeAssignment_3"


    // $ANTLR start "rule__UpdateType__EventAssignment_0"
    // InternalAdaptUI.g:10067:1: rule__UpdateType__EventAssignment_0 : ( ( 'eventTriggered' ) ) ;
    public final void rule__UpdateType__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:10071:1: ( ( ( 'eventTriggered' ) ) )
            // InternalAdaptUI.g:10072:2: ( ( 'eventTriggered' ) )
            {
            // InternalAdaptUI.g:10072:2: ( ( 'eventTriggered' ) )
            // InternalAdaptUI.g:10073:3: ( 'eventTriggered' )
            {
             before(grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0()); 
            // InternalAdaptUI.g:10074:3: ( 'eventTriggered' )
            // InternalAdaptUI.g:10075:4: 'eventTriggered'
            {
             before(grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0()); 

            }

             after(grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateType__EventAssignment_0"


    // $ANTLR start "rule__UpdateType__SlowAssignment_1"
    // InternalAdaptUI.g:10086:1: rule__UpdateType__SlowAssignment_1 : ( ( 'slow' ) ) ;
    public final void rule__UpdateType__SlowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:10090:1: ( ( ( 'slow' ) ) )
            // InternalAdaptUI.g:10091:2: ( ( 'slow' ) )
            {
            // InternalAdaptUI.g:10091:2: ( ( 'slow' ) )
            // InternalAdaptUI.g:10092:3: ( 'slow' )
            {
             before(grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0()); 
            // InternalAdaptUI.g:10093:3: ( 'slow' )
            // InternalAdaptUI.g:10094:4: 'slow'
            {
             before(grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0()); 

            }

             after(grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateType__SlowAssignment_1"


    // $ANTLR start "rule__UpdateType__FastAssignment_2"
    // InternalAdaptUI.g:10105:1: rule__UpdateType__FastAssignment_2 : ( ( 'fast' ) ) ;
    public final void rule__UpdateType__FastAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptUI.g:10109:1: ( ( ( 'fast' ) ) )
            // InternalAdaptUI.g:10110:2: ( ( 'fast' ) )
            {
            // InternalAdaptUI.g:10110:2: ( ( 'fast' ) )
            // InternalAdaptUI.g:10111:3: ( 'fast' )
            {
             before(grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0()); 
            // InternalAdaptUI.g:10112:3: ( 'fast' )
            // InternalAdaptUI.g:10113:4: 'fast'
            {
             before(grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0()); 

            }

             after(grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateType__FastAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\7\uffff\1\14\6\uffff";
    static final String dfa_3s = "\1\4\1\51\1\4\1\52\1\51\1\4\1\52\1\14\3\5\3\uffff";
    static final String dfa_4s = "\1\4\1\51\1\4\1\52\1\51\1\4\1\52\1\50\2\7\1\6\3\uffff";
    static final String dfa_5s = "\13\uffff\1\2\1\3\1\1";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\2\13\1\10\1\11\2\13\1\12\21\uffff\1\14\2\uffff\2\14",
            "\1\15\1\13\1\14",
            "\1\15\1\13\1\14",
            "\1\15\1\13",
            "",
            "",
            ""
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
            return "1652:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\7\uffff\1\11\2\uffff";
    static final String dfa_10s = "\1\4\1\51\1\4\1\52\1\51\1\4\1\52\1\16\2\uffff";
    static final String dfa_11s = "\1\4\1\51\1\4\1\52\1\51\1\4\1\52\1\50\2\uffff";
    static final String dfa_12s = "\10\uffff\1\1\1\2";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\2\10\24\uffff\1\11\2\uffff\2\11",
            "",
            ""
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
            return "1679:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1FFFD00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});

}