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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'ContextModel{'", "'};'", "'{'", "'Services{'", "';'", "'Types{'", "'AdaptationModel{'", "'flow'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'M'", "'.get'", "'()'", "'.'", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "'provider'", "'update'", "':'", "'string'", "'number'", "'bool'", "'eventTriggered'", "'slow'", "'fast'"
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


    // $ANTLR start "entryRuleContextModel"
    // InternalAdaptDsl.g:78:1: entryRuleContextModel : ruleContextModel EOF ;
    public final void entryRuleContextModel() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:79:1: ( ruleContextModel EOF )
            // InternalAdaptDsl.g:80:1: ruleContextModel EOF
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
    // InternalAdaptDsl.g:87:1: ruleContextModel : ( ( rule__ContextModel__Group__0 ) ) ;
    public final void ruleContextModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:91:2: ( ( ( rule__ContextModel__Group__0 ) ) )
            // InternalAdaptDsl.g:92:2: ( ( rule__ContextModel__Group__0 ) )
            {
            // InternalAdaptDsl.g:92:2: ( ( rule__ContextModel__Group__0 ) )
            // InternalAdaptDsl.g:93:3: ( rule__ContextModel__Group__0 )
            {
             before(grammarAccess.getContextModelAccess().getGroup()); 
            // InternalAdaptDsl.g:94:3: ( rule__ContextModel__Group__0 )
            // InternalAdaptDsl.g:94:4: rule__ContextModel__Group__0
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
    // InternalAdaptDsl.g:103:1: entryRuleAdaptationModel : ruleAdaptationModel EOF ;
    public final void entryRuleAdaptationModel() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:104:1: ( ruleAdaptationModel EOF )
            // InternalAdaptDsl.g:105:1: ruleAdaptationModel EOF
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
    // InternalAdaptDsl.g:112:1: ruleAdaptationModel : ( ( rule__AdaptationModel__Group__0 ) ) ;
    public final void ruleAdaptationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:116:2: ( ( ( rule__AdaptationModel__Group__0 ) ) )
            // InternalAdaptDsl.g:117:2: ( ( rule__AdaptationModel__Group__0 ) )
            {
            // InternalAdaptDsl.g:117:2: ( ( rule__AdaptationModel__Group__0 ) )
            // InternalAdaptDsl.g:118:3: ( rule__AdaptationModel__Group__0 )
            {
             before(grammarAccess.getAdaptationModelAccess().getGroup()); 
            // InternalAdaptDsl.g:119:3: ( rule__AdaptationModel__Group__0 )
            // InternalAdaptDsl.g:119:4: rule__AdaptationModel__Group__0
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
    // InternalAdaptDsl.g:128:1: entryRuleServices : ruleServices EOF ;
    public final void entryRuleServices() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:129:1: ( ruleServices EOF )
            // InternalAdaptDsl.g:130:1: ruleServices EOF
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
    // InternalAdaptDsl.g:137:1: ruleServices : ( ( rule__Services__Group__0 ) ) ;
    public final void ruleServices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:141:2: ( ( ( rule__Services__Group__0 ) ) )
            // InternalAdaptDsl.g:142:2: ( ( rule__Services__Group__0 ) )
            {
            // InternalAdaptDsl.g:142:2: ( ( rule__Services__Group__0 ) )
            // InternalAdaptDsl.g:143:3: ( rule__Services__Group__0 )
            {
             before(grammarAccess.getServicesAccess().getGroup()); 
            // InternalAdaptDsl.g:144:3: ( rule__Services__Group__0 )
            // InternalAdaptDsl.g:144:4: rule__Services__Group__0
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
    // InternalAdaptDsl.g:153:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:154:1: ( ruleService EOF )
            // InternalAdaptDsl.g:155:1: ruleService EOF
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
    // InternalAdaptDsl.g:162:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:166:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalAdaptDsl.g:167:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalAdaptDsl.g:167:2: ( ( rule__Service__Group__0 ) )
            // InternalAdaptDsl.g:168:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalAdaptDsl.g:169:3: ( rule__Service__Group__0 )
            // InternalAdaptDsl.g:169:4: rule__Service__Group__0
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
    // InternalAdaptDsl.g:178:1: entryRuleFunctions : ruleFunctions EOF ;
    public final void entryRuleFunctions() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:179:1: ( ruleFunctions EOF )
            // InternalAdaptDsl.g:180:1: ruleFunctions EOF
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
    // InternalAdaptDsl.g:187:1: ruleFunctions : ( ( rule__Functions__Group__0 ) ) ;
    public final void ruleFunctions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:191:2: ( ( ( rule__Functions__Group__0 ) ) )
            // InternalAdaptDsl.g:192:2: ( ( rule__Functions__Group__0 ) )
            {
            // InternalAdaptDsl.g:192:2: ( ( rule__Functions__Group__0 ) )
            // InternalAdaptDsl.g:193:3: ( rule__Functions__Group__0 )
            {
             before(grammarAccess.getFunctionsAccess().getGroup()); 
            // InternalAdaptDsl.g:194:3: ( rule__Functions__Group__0 )
            // InternalAdaptDsl.g:194:4: rule__Functions__Group__0
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
    // InternalAdaptDsl.g:203:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:204:1: ( ruleFunction EOF )
            // InternalAdaptDsl.g:205:1: ruleFunction EOF
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
    // InternalAdaptDsl.g:212:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:216:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalAdaptDsl.g:217:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalAdaptDsl.g:217:2: ( ( rule__Function__Group__0 ) )
            // InternalAdaptDsl.g:218:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalAdaptDsl.g:219:3: ( rule__Function__Group__0 )
            // InternalAdaptDsl.g:219:4: rule__Function__Group__0
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
    // InternalAdaptDsl.g:228:1: entryRuleAdaptationRule : ruleAdaptationRule EOF ;
    public final void entryRuleAdaptationRule() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:229:1: ( ruleAdaptationRule EOF )
            // InternalAdaptDsl.g:230:1: ruleAdaptationRule EOF
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
    // InternalAdaptDsl.g:237:1: ruleAdaptationRule : ( ( rule__AdaptationRule__Group__0 ) ) ;
    public final void ruleAdaptationRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:241:2: ( ( ( rule__AdaptationRule__Group__0 ) ) )
            // InternalAdaptDsl.g:242:2: ( ( rule__AdaptationRule__Group__0 ) )
            {
            // InternalAdaptDsl.g:242:2: ( ( rule__AdaptationRule__Group__0 ) )
            // InternalAdaptDsl.g:243:3: ( rule__AdaptationRule__Group__0 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getGroup()); 
            // InternalAdaptDsl.g:244:3: ( rule__AdaptationRule__Group__0 )
            // InternalAdaptDsl.g:244:4: rule__AdaptationRule__Group__0
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
    // InternalAdaptDsl.g:253:1: entryRuleConditionalOR : ruleConditionalOR EOF ;
    public final void entryRuleConditionalOR() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:254:1: ( ruleConditionalOR EOF )
            // InternalAdaptDsl.g:255:1: ruleConditionalOR EOF
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
    // InternalAdaptDsl.g:262:1: ruleConditionalOR : ( ( rule__ConditionalOR__Group__0 ) ) ;
    public final void ruleConditionalOR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:266:2: ( ( ( rule__ConditionalOR__Group__0 ) ) )
            // InternalAdaptDsl.g:267:2: ( ( rule__ConditionalOR__Group__0 ) )
            {
            // InternalAdaptDsl.g:267:2: ( ( rule__ConditionalOR__Group__0 ) )
            // InternalAdaptDsl.g:268:3: ( rule__ConditionalOR__Group__0 )
            {
             before(grammarAccess.getConditionalORAccess().getGroup()); 
            // InternalAdaptDsl.g:269:3: ( rule__ConditionalOR__Group__0 )
            // InternalAdaptDsl.g:269:4: rule__ConditionalOR__Group__0
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
    // InternalAdaptDsl.g:278:1: entryRuleConditionalAND : ruleConditionalAND EOF ;
    public final void entryRuleConditionalAND() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:279:1: ( ruleConditionalAND EOF )
            // InternalAdaptDsl.g:280:1: ruleConditionalAND EOF
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
    // InternalAdaptDsl.g:287:1: ruleConditionalAND : ( ( rule__ConditionalAND__Group__0 ) ) ;
    public final void ruleConditionalAND() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:291:2: ( ( ( rule__ConditionalAND__Group__0 ) ) )
            // InternalAdaptDsl.g:292:2: ( ( rule__ConditionalAND__Group__0 ) )
            {
            // InternalAdaptDsl.g:292:2: ( ( rule__ConditionalAND__Group__0 ) )
            // InternalAdaptDsl.g:293:3: ( rule__ConditionalAND__Group__0 )
            {
             before(grammarAccess.getConditionalANDAccess().getGroup()); 
            // InternalAdaptDsl.g:294:3: ( rule__ConditionalAND__Group__0 )
            // InternalAdaptDsl.g:294:4: rule__ConditionalAND__Group__0
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
    // InternalAdaptDsl.g:303:1: entryRuleConditionalPrimary : ruleConditionalPrimary EOF ;
    public final void entryRuleConditionalPrimary() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:304:1: ( ruleConditionalPrimary EOF )
            // InternalAdaptDsl.g:305:1: ruleConditionalPrimary EOF
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
    // InternalAdaptDsl.g:312:1: ruleConditionalPrimary : ( ( rule__ConditionalPrimary__Alternatives ) ) ;
    public final void ruleConditionalPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:316:2: ( ( ( rule__ConditionalPrimary__Alternatives ) ) )
            // InternalAdaptDsl.g:317:2: ( ( rule__ConditionalPrimary__Alternatives ) )
            {
            // InternalAdaptDsl.g:317:2: ( ( rule__ConditionalPrimary__Alternatives ) )
            // InternalAdaptDsl.g:318:3: ( rule__ConditionalPrimary__Alternatives )
            {
             before(grammarAccess.getConditionalPrimaryAccess().getAlternatives()); 
            // InternalAdaptDsl.g:319:3: ( rule__ConditionalPrimary__Alternatives )
            // InternalAdaptDsl.g:319:4: rule__ConditionalPrimary__Alternatives
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
    // InternalAdaptDsl.g:328:1: entryRuleBooleanCondition : ruleBooleanCondition EOF ;
    public final void entryRuleBooleanCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:329:1: ( ruleBooleanCondition EOF )
            // InternalAdaptDsl.g:330:1: ruleBooleanCondition EOF
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
    // InternalAdaptDsl.g:337:1: ruleBooleanCondition : ( ( rule__BooleanCondition__Alternatives ) ) ;
    public final void ruleBooleanCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:341:2: ( ( ( rule__BooleanCondition__Alternatives ) ) )
            // InternalAdaptDsl.g:342:2: ( ( rule__BooleanCondition__Alternatives ) )
            {
            // InternalAdaptDsl.g:342:2: ( ( rule__BooleanCondition__Alternatives ) )
            // InternalAdaptDsl.g:343:3: ( rule__BooleanCondition__Alternatives )
            {
             before(grammarAccess.getBooleanConditionAccess().getAlternatives()); 
            // InternalAdaptDsl.g:344:3: ( rule__BooleanCondition__Alternatives )
            // InternalAdaptDsl.g:344:4: rule__BooleanCondition__Alternatives
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
    // InternalAdaptDsl.g:353:1: entryRuleNumberCondition : ruleNumberCondition EOF ;
    public final void entryRuleNumberCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:354:1: ( ruleNumberCondition EOF )
            // InternalAdaptDsl.g:355:1: ruleNumberCondition EOF
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
    // InternalAdaptDsl.g:362:1: ruleNumberCondition : ( ( rule__NumberCondition__Group__0 ) ) ;
    public final void ruleNumberCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:366:2: ( ( ( rule__NumberCondition__Group__0 ) ) )
            // InternalAdaptDsl.g:367:2: ( ( rule__NumberCondition__Group__0 ) )
            {
            // InternalAdaptDsl.g:367:2: ( ( rule__NumberCondition__Group__0 ) )
            // InternalAdaptDsl.g:368:3: ( rule__NumberCondition__Group__0 )
            {
             before(grammarAccess.getNumberConditionAccess().getGroup()); 
            // InternalAdaptDsl.g:369:3: ( rule__NumberCondition__Group__0 )
            // InternalAdaptDsl.g:369:4: rule__NumberCondition__Group__0
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
    // InternalAdaptDsl.g:378:1: entryRuleStringCondition : ruleStringCondition EOF ;
    public final void entryRuleStringCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:379:1: ( ruleStringCondition EOF )
            // InternalAdaptDsl.g:380:1: ruleStringCondition EOF
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
    // InternalAdaptDsl.g:387:1: ruleStringCondition : ( ( rule__StringCondition__Group__0 ) ) ;
    public final void ruleStringCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:391:2: ( ( ( rule__StringCondition__Group__0 ) ) )
            // InternalAdaptDsl.g:392:2: ( ( rule__StringCondition__Group__0 ) )
            {
            // InternalAdaptDsl.g:392:2: ( ( rule__StringCondition__Group__0 ) )
            // InternalAdaptDsl.g:393:3: ( rule__StringCondition__Group__0 )
            {
             before(grammarAccess.getStringConditionAccess().getGroup()); 
            // InternalAdaptDsl.g:394:3: ( rule__StringCondition__Group__0 )
            // InternalAdaptDsl.g:394:4: rule__StringCondition__Group__0
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
    // InternalAdaptDsl.g:403:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:404:1: ( ruleFact EOF )
            // InternalAdaptDsl.g:405:1: ruleFact EOF
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
    // InternalAdaptDsl.g:412:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:416:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalAdaptDsl.g:417:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalAdaptDsl.g:417:2: ( ( rule__Fact__Group__0 ) )
            // InternalAdaptDsl.g:418:3: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // InternalAdaptDsl.g:419:3: ( rule__Fact__Group__0 )
            // InternalAdaptDsl.g:419:4: rule__Fact__Group__0
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
    // InternalAdaptDsl.g:428:1: entryRuleFactProperty : ruleFactProperty EOF ;
    public final void entryRuleFactProperty() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:429:1: ( ruleFactProperty EOF )
            // InternalAdaptDsl.g:430:1: ruleFactProperty EOF
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
    // InternalAdaptDsl.g:437:1: ruleFactProperty : ( ( rule__FactProperty__Group__0 ) ) ;
    public final void ruleFactProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:441:2: ( ( ( rule__FactProperty__Group__0 ) ) )
            // InternalAdaptDsl.g:442:2: ( ( rule__FactProperty__Group__0 ) )
            {
            // InternalAdaptDsl.g:442:2: ( ( rule__FactProperty__Group__0 ) )
            // InternalAdaptDsl.g:443:3: ( rule__FactProperty__Group__0 )
            {
             before(grammarAccess.getFactPropertyAccess().getGroup()); 
            // InternalAdaptDsl.g:444:3: ( rule__FactProperty__Group__0 )
            // InternalAdaptDsl.g:444:4: rule__FactProperty__Group__0
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
    // InternalAdaptDsl.g:453:1: entryRuleNumberOperators : ruleNumberOperators EOF ;
    public final void entryRuleNumberOperators() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:454:1: ( ruleNumberOperators EOF )
            // InternalAdaptDsl.g:455:1: ruleNumberOperators EOF
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
    // InternalAdaptDsl.g:462:1: ruleNumberOperators : ( ( rule__NumberOperators__Alternatives ) ) ;
    public final void ruleNumberOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:466:2: ( ( ( rule__NumberOperators__Alternatives ) ) )
            // InternalAdaptDsl.g:467:2: ( ( rule__NumberOperators__Alternatives ) )
            {
            // InternalAdaptDsl.g:467:2: ( ( rule__NumberOperators__Alternatives ) )
            // InternalAdaptDsl.g:468:3: ( rule__NumberOperators__Alternatives )
            {
             before(grammarAccess.getNumberOperatorsAccess().getAlternatives()); 
            // InternalAdaptDsl.g:469:3: ( rule__NumberOperators__Alternatives )
            // InternalAdaptDsl.g:469:4: rule__NumberOperators__Alternatives
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
    // InternalAdaptDsl.g:478:1: entryRuleStringOperators : ruleStringOperators EOF ;
    public final void entryRuleStringOperators() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:479:1: ( ruleStringOperators EOF )
            // InternalAdaptDsl.g:480:1: ruleStringOperators EOF
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
    // InternalAdaptDsl.g:487:1: ruleStringOperators : ( ( rule__StringOperators__Alternatives ) ) ;
    public final void ruleStringOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:491:2: ( ( ( rule__StringOperators__Alternatives ) ) )
            // InternalAdaptDsl.g:492:2: ( ( rule__StringOperators__Alternatives ) )
            {
            // InternalAdaptDsl.g:492:2: ( ( rule__StringOperators__Alternatives ) )
            // InternalAdaptDsl.g:493:3: ( rule__StringOperators__Alternatives )
            {
             before(grammarAccess.getStringOperatorsAccess().getAlternatives()); 
            // InternalAdaptDsl.g:494:3: ( rule__StringOperators__Alternatives )
            // InternalAdaptDsl.g:494:4: rule__StringOperators__Alternatives
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
    // InternalAdaptDsl.g:503:1: entryRuleBoolOperators : ruleBoolOperators EOF ;
    public final void entryRuleBoolOperators() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:504:1: ( ruleBoolOperators EOF )
            // InternalAdaptDsl.g:505:1: ruleBoolOperators EOF
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
    // InternalAdaptDsl.g:512:1: ruleBoolOperators : ( ( rule__BoolOperators__Alternatives ) ) ;
    public final void ruleBoolOperators() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:516:2: ( ( ( rule__BoolOperators__Alternatives ) ) )
            // InternalAdaptDsl.g:517:2: ( ( rule__BoolOperators__Alternatives ) )
            {
            // InternalAdaptDsl.g:517:2: ( ( rule__BoolOperators__Alternatives ) )
            // InternalAdaptDsl.g:518:3: ( rule__BoolOperators__Alternatives )
            {
             before(grammarAccess.getBoolOperatorsAccess().getAlternatives()); 
            // InternalAdaptDsl.g:519:3: ( rule__BoolOperators__Alternatives )
            // InternalAdaptDsl.g:519:4: rule__BoolOperators__Alternatives
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
    // InternalAdaptDsl.g:528:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:529:1: ( ruleActions EOF )
            // InternalAdaptDsl.g:530:1: ruleActions EOF
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
    // InternalAdaptDsl.g:537:1: ruleActions : ( ( rule__Actions__Group__0 ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:541:2: ( ( ( rule__Actions__Group__0 ) ) )
            // InternalAdaptDsl.g:542:2: ( ( rule__Actions__Group__0 ) )
            {
            // InternalAdaptDsl.g:542:2: ( ( rule__Actions__Group__0 ) )
            // InternalAdaptDsl.g:543:3: ( rule__Actions__Group__0 )
            {
             before(grammarAccess.getActionsAccess().getGroup()); 
            // InternalAdaptDsl.g:544:3: ( rule__Actions__Group__0 )
            // InternalAdaptDsl.g:544:4: rule__Actions__Group__0
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
    // InternalAdaptDsl.g:553:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:554:1: ( ruleAction EOF )
            // InternalAdaptDsl.g:555:1: ruleAction EOF
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
    // InternalAdaptDsl.g:562:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:566:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalAdaptDsl.g:567:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalAdaptDsl.g:567:2: ( ( rule__Action__Alternatives ) )
            // InternalAdaptDsl.g:568:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalAdaptDsl.g:569:3: ( rule__Action__Alternatives )
            // InternalAdaptDsl.g:569:4: rule__Action__Alternatives
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
    // InternalAdaptDsl.g:578:1: entryRuleServiceOperation : ruleServiceOperation EOF ;
    public final void entryRuleServiceOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:579:1: ( ruleServiceOperation EOF )
            // InternalAdaptDsl.g:580:1: ruleServiceOperation EOF
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
    // InternalAdaptDsl.g:587:1: ruleServiceOperation : ( ( rule__ServiceOperation__Alternatives ) ) ;
    public final void ruleServiceOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:591:2: ( ( ( rule__ServiceOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:592:2: ( ( rule__ServiceOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:592:2: ( ( rule__ServiceOperation__Alternatives ) )
            // InternalAdaptDsl.g:593:3: ( rule__ServiceOperation__Alternatives )
            {
             before(grammarAccess.getServiceOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:594:3: ( rule__ServiceOperation__Alternatives )
            // InternalAdaptDsl.g:594:4: rule__ServiceOperation__Alternatives
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
    // InternalAdaptDsl.g:603:1: entryRuleServiceFunctionCallOperation : ruleServiceFunctionCallOperation EOF ;
    public final void entryRuleServiceFunctionCallOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:604:1: ( ruleServiceFunctionCallOperation EOF )
            // InternalAdaptDsl.g:605:1: ruleServiceFunctionCallOperation EOF
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
    // InternalAdaptDsl.g:612:1: ruleServiceFunctionCallOperation : ( ( rule__ServiceFunctionCallOperation__Group__0 ) ) ;
    public final void ruleServiceFunctionCallOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:616:2: ( ( ( rule__ServiceFunctionCallOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:617:2: ( ( rule__ServiceFunctionCallOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:617:2: ( ( rule__ServiceFunctionCallOperation__Group__0 ) )
            // InternalAdaptDsl.g:618:3: ( rule__ServiceFunctionCallOperation__Group__0 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:619:3: ( rule__ServiceFunctionCallOperation__Group__0 )
            // InternalAdaptDsl.g:619:4: rule__ServiceFunctionCallOperation__Group__0
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
    // InternalAdaptDsl.g:628:1: entryRuleEditFactOperation : ruleEditFactOperation EOF ;
    public final void entryRuleEditFactOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:629:1: ( ruleEditFactOperation EOF )
            // InternalAdaptDsl.g:630:1: ruleEditFactOperation EOF
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
    // InternalAdaptDsl.g:637:1: ruleEditFactOperation : ( ( rule__EditFactOperation__Group__0 ) ) ;
    public final void ruleEditFactOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:641:2: ( ( ( rule__EditFactOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:642:2: ( ( rule__EditFactOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:642:2: ( ( rule__EditFactOperation__Group__0 ) )
            // InternalAdaptDsl.g:643:3: ( rule__EditFactOperation__Group__0 )
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:644:3: ( rule__EditFactOperation__Group__0 )
            // InternalAdaptDsl.g:644:4: rule__EditFactOperation__Group__0
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
    // InternalAdaptDsl.g:653:1: entryRuleSetDisplayPropertyOperation : ruleSetDisplayPropertyOperation EOF ;
    public final void entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:654:1: ( ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptDsl.g:655:1: ruleSetDisplayPropertyOperation EOF
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
    // InternalAdaptDsl.g:662:1: ruleSetDisplayPropertyOperation : ( ( rule__SetDisplayPropertyOperation__Group__0 ) ) ;
    public final void ruleSetDisplayPropertyOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:666:2: ( ( ( rule__SetDisplayPropertyOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:667:2: ( ( rule__SetDisplayPropertyOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:667:2: ( ( rule__SetDisplayPropertyOperation__Group__0 ) )
            // InternalAdaptDsl.g:668:3: ( rule__SetDisplayPropertyOperation__Group__0 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:669:3: ( rule__SetDisplayPropertyOperation__Group__0 )
            // InternalAdaptDsl.g:669:4: rule__SetDisplayPropertyOperation__Group__0
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
    // InternalAdaptDsl.g:678:1: entryRuleDisplayPropertyValue : ruleDisplayPropertyValue EOF ;
    public final void entryRuleDisplayPropertyValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:679:1: ( ruleDisplayPropertyValue EOF )
            // InternalAdaptDsl.g:680:1: ruleDisplayPropertyValue EOF
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
    // InternalAdaptDsl.g:687:1: ruleDisplayPropertyValue : ( ( rule__DisplayPropertyValue__Alternatives ) ) ;
    public final void ruleDisplayPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:691:2: ( ( ( rule__DisplayPropertyValue__Alternatives ) ) )
            // InternalAdaptDsl.g:692:2: ( ( rule__DisplayPropertyValue__Alternatives ) )
            {
            // InternalAdaptDsl.g:692:2: ( ( rule__DisplayPropertyValue__Alternatives ) )
            // InternalAdaptDsl.g:693:3: ( rule__DisplayPropertyValue__Alternatives )
            {
             before(grammarAccess.getDisplayPropertyValueAccess().getAlternatives()); 
            // InternalAdaptDsl.g:694:3: ( rule__DisplayPropertyValue__Alternatives )
            // InternalAdaptDsl.g:694:4: rule__DisplayPropertyValue__Alternatives
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
    // InternalAdaptDsl.g:703:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:704:1: ( ruleIntValue EOF )
            // InternalAdaptDsl.g:705:1: ruleIntValue EOF
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
    // InternalAdaptDsl.g:712:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:716:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalAdaptDsl.g:717:2: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalAdaptDsl.g:717:2: ( ( rule__IntValue__ValueAssignment ) )
            // InternalAdaptDsl.g:718:3: ( rule__IntValue__ValueAssignment )
            {
             before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            // InternalAdaptDsl.g:719:3: ( rule__IntValue__ValueAssignment )
            // InternalAdaptDsl.g:719:4: rule__IntValue__ValueAssignment
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
    // InternalAdaptDsl.g:728:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:729:1: ( ruleStringValue EOF )
            // InternalAdaptDsl.g:730:1: ruleStringValue EOF
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
    // InternalAdaptDsl.g:737:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:741:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalAdaptDsl.g:742:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalAdaptDsl.g:742:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalAdaptDsl.g:743:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalAdaptDsl.g:744:3: ( rule__StringValue__ValueAssignment )
            // InternalAdaptDsl.g:744:4: rule__StringValue__ValueAssignment
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
    // InternalAdaptDsl.g:753:1: entryRuleBoolValue : ruleBoolValue EOF ;
    public final void entryRuleBoolValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:754:1: ( ruleBoolValue EOF )
            // InternalAdaptDsl.g:755:1: ruleBoolValue EOF
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
    // InternalAdaptDsl.g:762:1: ruleBoolValue : ( ( rule__BoolValue__ValueAssignment ) ) ;
    public final void ruleBoolValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:766:2: ( ( ( rule__BoolValue__ValueAssignment ) ) )
            // InternalAdaptDsl.g:767:2: ( ( rule__BoolValue__ValueAssignment ) )
            {
            // InternalAdaptDsl.g:767:2: ( ( rule__BoolValue__ValueAssignment ) )
            // InternalAdaptDsl.g:768:3: ( rule__BoolValue__ValueAssignment )
            {
             before(grammarAccess.getBoolValueAccess().getValueAssignment()); 
            // InternalAdaptDsl.g:769:3: ( rule__BoolValue__ValueAssignment )
            // InternalAdaptDsl.g:769:4: rule__BoolValue__ValueAssignment
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
    // InternalAdaptDsl.g:778:1: entryRuleTaskChangeOperation : ruleTaskChangeOperation EOF ;
    public final void entryRuleTaskChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:779:1: ( ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:780:1: ruleTaskChangeOperation EOF
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
    // InternalAdaptDsl.g:787:1: ruleTaskChangeOperation : ( ( rule__TaskChangeOperation__Alternatives ) ) ;
    public final void ruleTaskChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:791:2: ( ( ( rule__TaskChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:792:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:792:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:793:3: ( rule__TaskChangeOperation__Alternatives )
            {
             before(grammarAccess.getTaskChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:794:3: ( rule__TaskChangeOperation__Alternatives )
            // InternalAdaptDsl.g:794:4: rule__TaskChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:803:1: entryRuleAddViewComponentOperation : ruleAddViewComponentOperation EOF ;
    public final void entryRuleAddViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:804:1: ( ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:805:1: ruleAddViewComponentOperation EOF
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
    // InternalAdaptDsl.g:812:1: ruleAddViewComponentOperation : ( ( rule__AddViewComponentOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:816:2: ( ( ( rule__AddViewComponentOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:817:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:817:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            // InternalAdaptDsl.g:818:3: ( rule__AddViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:819:3: ( rule__AddViewComponentOperation__Group__0 )
            // InternalAdaptDsl.g:819:4: rule__AddViewComponentOperation__Group__0
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
    // InternalAdaptDsl.g:828:1: entryRuleDeleteViewComponentOperation : ruleDeleteViewComponentOperation EOF ;
    public final void entryRuleDeleteViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:829:1: ( ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:830:1: ruleDeleteViewComponentOperation EOF
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
    // InternalAdaptDsl.g:837:1: ruleDeleteViewComponentOperation : ( ( rule__DeleteViewComponentOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:841:2: ( ( ( rule__DeleteViewComponentOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:842:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:842:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            // InternalAdaptDsl.g:843:3: ( rule__DeleteViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:844:3: ( rule__DeleteViewComponentOperation__Group__0 )
            // InternalAdaptDsl.g:844:4: rule__DeleteViewComponentOperation__Group__0
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
    // InternalAdaptDsl.g:853:1: entryRuleAddViewComponentButtonOperation : ruleAddViewComponentButtonOperation EOF ;
    public final void entryRuleAddViewComponentButtonOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:854:1: ( ruleAddViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:855:1: ruleAddViewComponentButtonOperation EOF
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
    // InternalAdaptDsl.g:862:1: ruleAddViewComponentButtonOperation : ( ( rule__AddViewComponentButtonOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentButtonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:866:2: ( ( ( rule__AddViewComponentButtonOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:867:2: ( ( rule__AddViewComponentButtonOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:867:2: ( ( rule__AddViewComponentButtonOperation__Group__0 ) )
            // InternalAdaptDsl.g:868:3: ( rule__AddViewComponentButtonOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:869:3: ( rule__AddViewComponentButtonOperation__Group__0 )
            // InternalAdaptDsl.g:869:4: rule__AddViewComponentButtonOperation__Group__0
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
    // InternalAdaptDsl.g:878:1: entryRuleDeleteViewComponentButtonOperation : ruleDeleteViewComponentButtonOperation EOF ;
    public final void entryRuleDeleteViewComponentButtonOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:879:1: ( ruleDeleteViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:880:1: ruleDeleteViewComponentButtonOperation EOF
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
    // InternalAdaptDsl.g:887:1: ruleDeleteViewComponentButtonOperation : ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentButtonOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:891:2: ( ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:892:2: ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:892:2: ( ( rule__DeleteViewComponentButtonOperation__Group__0 ) )
            // InternalAdaptDsl.g:893:3: ( rule__DeleteViewComponentButtonOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:894:3: ( rule__DeleteViewComponentButtonOperation__Group__0 )
            // InternalAdaptDsl.g:894:4: rule__DeleteViewComponentButtonOperation__Group__0
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
    // InternalAdaptDsl.g:903:1: entryRuleViewComponent : ruleViewComponent EOF ;
    public final void entryRuleViewComponent() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:904:1: ( ruleViewComponent EOF )
            // InternalAdaptDsl.g:905:1: ruleViewComponent EOF
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
    // InternalAdaptDsl.g:912:1: ruleViewComponent : ( RULE_ID ) ;
    public final void ruleViewComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:916:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:917:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:917:2: ( RULE_ID )
            // InternalAdaptDsl.g:918:3: RULE_ID
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
    // InternalAdaptDsl.g:928:1: entryRuleTargetContainer : ruleTargetContainer EOF ;
    public final void entryRuleTargetContainer() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:929:1: ( ruleTargetContainer EOF )
            // InternalAdaptDsl.g:930:1: ruleTargetContainer EOF
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
    // InternalAdaptDsl.g:937:1: ruleTargetContainer : ( RULE_ID ) ;
    public final void ruleTargetContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:941:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:942:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:942:2: ( RULE_ID )
            // InternalAdaptDsl.g:943:3: RULE_ID
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
    // InternalAdaptDsl.g:953:1: entryRuleNavigationChangeOperation : ruleNavigationChangeOperation EOF ;
    public final void entryRuleNavigationChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:954:1: ( ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:955:1: ruleNavigationChangeOperation EOF
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
    // InternalAdaptDsl.g:962:1: ruleNavigationChangeOperation : ( ( rule__NavigationChangeOperation__Alternatives ) ) ;
    public final void ruleNavigationChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:966:2: ( ( ( rule__NavigationChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:967:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:967:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:968:3: ( rule__NavigationChangeOperation__Alternatives )
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:969:3: ( rule__NavigationChangeOperation__Alternatives )
            // InternalAdaptDsl.g:969:4: rule__NavigationChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:978:1: entryRuleAddNavLinkOperation : ruleAddNavLinkOperation EOF ;
    public final void entryRuleAddNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:979:1: ( ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:980:1: ruleAddNavLinkOperation EOF
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
    // InternalAdaptDsl.g:987:1: ruleAddNavLinkOperation : ( ( rule__AddNavLinkOperation__Group__0 ) ) ;
    public final void ruleAddNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:991:2: ( ( ( rule__AddNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:992:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:992:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:993:3: ( rule__AddNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:994:3: ( rule__AddNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:994:4: rule__AddNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:1003:1: entryRuleDeleteNavLinkOperation : ruleDeleteNavLinkOperation EOF ;
    public final void entryRuleDeleteNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1004:1: ( ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:1005:1: ruleDeleteNavLinkOperation EOF
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
    // InternalAdaptDsl.g:1012:1: ruleDeleteNavLinkOperation : ( ( rule__DeleteNavLinkOperation__Group__0 ) ) ;
    public final void ruleDeleteNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1016:2: ( ( ( rule__DeleteNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1017:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1017:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:1018:3: ( rule__DeleteNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1019:3: ( rule__DeleteNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:1019:4: rule__DeleteNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:1028:1: entryRuleRedirectNavLinkOperation : ruleRedirectNavLinkOperation EOF ;
    public final void entryRuleRedirectNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1029:1: ( ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:1030:1: ruleRedirectNavLinkOperation EOF
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
    // InternalAdaptDsl.g:1037:1: ruleRedirectNavLinkOperation : ( ( rule__RedirectNavLinkOperation__Group__0 ) ) ;
    public final void ruleRedirectNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1041:2: ( ( ( rule__RedirectNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1042:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1042:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:1043:3: ( rule__RedirectNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1044:3: ( rule__RedirectNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:1044:4: rule__RedirectNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:1053:1: entryRuleClearNavOperation : ruleClearNavOperation EOF ;
    public final void entryRuleClearNavOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1054:1: ( ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:1055:1: ruleClearNavOperation EOF
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
    // InternalAdaptDsl.g:1062:1: ruleClearNavOperation : ( ( rule__ClearNavOperation__Group__0 ) ) ;
    public final void ruleClearNavOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1066:2: ( ( ( rule__ClearNavOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1067:2: ( ( rule__ClearNavOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1067:2: ( ( rule__ClearNavOperation__Group__0 ) )
            // InternalAdaptDsl.g:1068:3: ( rule__ClearNavOperation__Group__0 )
            {
             before(grammarAccess.getClearNavOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1069:3: ( rule__ClearNavOperation__Group__0 )
            // InternalAdaptDsl.g:1069:4: rule__ClearNavOperation__Group__0
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
    // InternalAdaptDsl.g:1078:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1079:1: ( ruleText EOF )
            // InternalAdaptDsl.g:1080:1: ruleText EOF
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
    // InternalAdaptDsl.g:1087:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1091:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1092:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1092:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1093:3: RULE_STRING
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
    // InternalAdaptDsl.g:1103:1: entryRuleLayoutChangeOperation : ruleLayoutChangeOperation EOF ;
    public final void entryRuleLayoutChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1104:1: ( ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:1105:1: ruleLayoutChangeOperation EOF
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
    // InternalAdaptDsl.g:1112:1: ruleLayoutChangeOperation : ( ( rule__LayoutChangeOperation__Alternatives ) ) ;
    public final void ruleLayoutChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1116:2: ( ( ( rule__LayoutChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:1117:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:1117:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:1118:3: ( rule__LayoutChangeOperation__Alternatives )
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1119:3: ( rule__LayoutChangeOperation__Alternatives )
            // InternalAdaptDsl.g:1119:4: rule__LayoutChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:1128:1: entryRuleChangeFontSizeOperation : ruleChangeFontSizeOperation EOF ;
    public final void entryRuleChangeFontSizeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1129:1: ( ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:1130:1: ruleChangeFontSizeOperation EOF
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
    // InternalAdaptDsl.g:1137:1: ruleChangeFontSizeOperation : ( ( rule__ChangeFontSizeOperation__Group__0 ) ) ;
    public final void ruleChangeFontSizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1141:2: ( ( ( rule__ChangeFontSizeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1142:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1142:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            // InternalAdaptDsl.g:1143:3: ( rule__ChangeFontSizeOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1144:3: ( rule__ChangeFontSizeOperation__Group__0 )
            // InternalAdaptDsl.g:1144:4: rule__ChangeFontSizeOperation__Group__0
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
    // InternalAdaptDsl.g:1153:1: entryRuleChangeColorSchemeOperation : ruleChangeColorSchemeOperation EOF ;
    public final void entryRuleChangeColorSchemeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1154:1: ( ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:1155:1: ruleChangeColorSchemeOperation EOF
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
    // InternalAdaptDsl.g:1162:1: ruleChangeColorSchemeOperation : ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) ;
    public final void ruleChangeColorSchemeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1166:2: ( ( ( rule__ChangeColorSchemeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1167:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1167:2: ( ( rule__ChangeColorSchemeOperation__Group__0 ) )
            // InternalAdaptDsl.g:1168:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1169:3: ( rule__ChangeColorSchemeOperation__Group__0 )
            // InternalAdaptDsl.g:1169:4: rule__ChangeColorSchemeOperation__Group__0
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
    // InternalAdaptDsl.g:1178:1: entryRuleChangeFontOperation : ruleChangeFontOperation EOF ;
    public final void entryRuleChangeFontOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1179:1: ( ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:1180:1: ruleChangeFontOperation EOF
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
    // InternalAdaptDsl.g:1187:1: ruleChangeFontOperation : ( ( rule__ChangeFontOperation__Group__0 ) ) ;
    public final void ruleChangeFontOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1191:2: ( ( ( rule__ChangeFontOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1192:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1192:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            // InternalAdaptDsl.g:1193:3: ( rule__ChangeFontOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1194:3: ( rule__ChangeFontOperation__Group__0 )
            // InternalAdaptDsl.g:1194:4: rule__ChangeFontOperation__Group__0
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
    // InternalAdaptDsl.g:1203:1: entryRuleChangeTableCssClassOperation : ruleChangeTableCssClassOperation EOF ;
    public final void entryRuleChangeTableCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1204:1: ( ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:1205:1: ruleChangeTableCssClassOperation EOF
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
    // InternalAdaptDsl.g:1212:1: ruleChangeTableCssClassOperation : ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) ;
    public final void ruleChangeTableCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1216:2: ( ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1217:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1217:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:1218:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1219:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:1219:4: rule__ChangeTableCssClassOperation__Group__0
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
    // InternalAdaptDsl.g:1228:1: entryRuleAdaptCssClassOperation : ruleAdaptCssClassOperation EOF ;
    public final void entryRuleAdaptCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1229:1: ( ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:1230:1: ruleAdaptCssClassOperation EOF
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
    // InternalAdaptDsl.g:1237:1: ruleAdaptCssClassOperation : ( ( rule__AdaptCssClassOperation__Group__0 ) ) ;
    public final void ruleAdaptCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1241:2: ( ( ( rule__AdaptCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:1242:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:1242:2: ( ( rule__AdaptCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:1243:3: ( rule__AdaptCssClassOperation__Group__0 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:1244:3: ( rule__AdaptCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:1244:4: rule__AdaptCssClassOperation__Group__0
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
    // InternalAdaptDsl.g:1253:1: entryRuleCssClass : ruleCssClass EOF ;
    public final void entryRuleCssClass() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1254:1: ( ruleCssClass EOF )
            // InternalAdaptDsl.g:1255:1: ruleCssClass EOF
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
    // InternalAdaptDsl.g:1262:1: ruleCssClass : ( RULE_STRING ) ;
    public final void ruleCssClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1266:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1267:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1267:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1268:3: RULE_STRING
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
    // InternalAdaptDsl.g:1278:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1279:1: ( ruleAttribute EOF )
            // InternalAdaptDsl.g:1280:1: ruleAttribute EOF
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
    // InternalAdaptDsl.g:1287:1: ruleAttribute : ( RULE_STRING ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1291:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1292:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1292:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1293:3: RULE_STRING
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
    // InternalAdaptDsl.g:1303:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1304:1: ( ruleAttributeValue EOF )
            // InternalAdaptDsl.g:1305:1: ruleAttributeValue EOF
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
    // InternalAdaptDsl.g:1312:1: ruleAttributeValue : ( RULE_STRING ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1316:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1317:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1317:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1318:3: RULE_STRING
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
    // InternalAdaptDsl.g:1328:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1329:1: ( ruleColor EOF )
            // InternalAdaptDsl.g:1330:1: ruleColor EOF
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
    // InternalAdaptDsl.g:1337:1: ruleColor : ( RULE_STRING ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1341:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:1342:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:1342:2: ( RULE_STRING )
            // InternalAdaptDsl.g:1343:3: RULE_STRING
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
    // InternalAdaptDsl.g:1353:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1354:1: ( ruleFontSize EOF )
            // InternalAdaptDsl.g:1355:1: ruleFontSize EOF
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
    // InternalAdaptDsl.g:1362:1: ruleFontSize : ( RULE_INT ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1366:2: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:1367:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:1367:2: ( RULE_INT )
            // InternalAdaptDsl.g:1368:3: RULE_INT
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
    // InternalAdaptDsl.g:1378:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1379:1: ( ruleValue EOF )
            // InternalAdaptDsl.g:1380:1: ruleValue EOF
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
    // InternalAdaptDsl.g:1387:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1391:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAdaptDsl.g:1392:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAdaptDsl.g:1392:2: ( ( rule__Value__Alternatives ) )
            // InternalAdaptDsl.g:1393:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1394:3: ( rule__Value__Alternatives )
            // InternalAdaptDsl.g:1394:4: rule__Value__Alternatives
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
    // InternalAdaptDsl.g:1403:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1404:1: ( ruleEntity EOF )
            // InternalAdaptDsl.g:1405:1: ruleEntity EOF
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
    // InternalAdaptDsl.g:1412:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1416:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAdaptDsl.g:1417:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAdaptDsl.g:1417:2: ( ( rule__Entity__Group__0 ) )
            // InternalAdaptDsl.g:1418:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAdaptDsl.g:1419:3: ( rule__Entity__Group__0 )
            // InternalAdaptDsl.g:1419:4: rule__Entity__Group__0
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
    // InternalAdaptDsl.g:1428:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1429:1: ( ruleProperty EOF )
            // InternalAdaptDsl.g:1430:1: ruleProperty EOF
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
    // InternalAdaptDsl.g:1437:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1441:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalAdaptDsl.g:1442:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalAdaptDsl.g:1442:2: ( ( rule__Property__Group__0 ) )
            // InternalAdaptDsl.g:1443:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalAdaptDsl.g:1444:3: ( rule__Property__Group__0 )
            // InternalAdaptDsl.g:1444:4: rule__Property__Group__0
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
    // InternalAdaptDsl.g:1453:1: entryRuleProvider : ruleProvider EOF ;
    public final void entryRuleProvider() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1454:1: ( ruleProvider EOF )
            // InternalAdaptDsl.g:1455:1: ruleProvider EOF
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
    // InternalAdaptDsl.g:1462:1: ruleProvider : ( ( rule__Provider__NameAssignment ) ) ;
    public final void ruleProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1466:2: ( ( ( rule__Provider__NameAssignment ) ) )
            // InternalAdaptDsl.g:1467:2: ( ( rule__Provider__NameAssignment ) )
            {
            // InternalAdaptDsl.g:1467:2: ( ( rule__Provider__NameAssignment ) )
            // InternalAdaptDsl.g:1468:3: ( rule__Provider__NameAssignment )
            {
             before(grammarAccess.getProviderAccess().getNameAssignment()); 
            // InternalAdaptDsl.g:1469:3: ( rule__Provider__NameAssignment )
            // InternalAdaptDsl.g:1469:4: rule__Provider__NameAssignment
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
    // InternalAdaptDsl.g:1478:1: entryRuleDefTypes : ruleDefTypes EOF ;
    public final void entryRuleDefTypes() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1479:1: ( ruleDefTypes EOF )
            // InternalAdaptDsl.g:1480:1: ruleDefTypes EOF
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
    // InternalAdaptDsl.g:1487:1: ruleDefTypes : ( ( rule__DefTypes__Group__0 ) ) ;
    public final void ruleDefTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1491:2: ( ( ( rule__DefTypes__Group__0 ) ) )
            // InternalAdaptDsl.g:1492:2: ( ( rule__DefTypes__Group__0 ) )
            {
            // InternalAdaptDsl.g:1492:2: ( ( rule__DefTypes__Group__0 ) )
            // InternalAdaptDsl.g:1493:3: ( rule__DefTypes__Group__0 )
            {
             before(grammarAccess.getDefTypesAccess().getGroup()); 
            // InternalAdaptDsl.g:1494:3: ( rule__DefTypes__Group__0 )
            // InternalAdaptDsl.g:1494:4: rule__DefTypes__Group__0
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
    // InternalAdaptDsl.g:1503:1: entryRuleDefType : ruleDefType EOF ;
    public final void entryRuleDefType() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1504:1: ( ruleDefType EOF )
            // InternalAdaptDsl.g:1505:1: ruleDefType EOF
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
    // InternalAdaptDsl.g:1512:1: ruleDefType : ( ( rule__DefType__Group__0 ) ) ;
    public final void ruleDefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1516:2: ( ( ( rule__DefType__Group__0 ) ) )
            // InternalAdaptDsl.g:1517:2: ( ( rule__DefType__Group__0 ) )
            {
            // InternalAdaptDsl.g:1517:2: ( ( rule__DefType__Group__0 ) )
            // InternalAdaptDsl.g:1518:3: ( rule__DefType__Group__0 )
            {
             before(grammarAccess.getDefTypeAccess().getGroup()); 
            // InternalAdaptDsl.g:1519:3: ( rule__DefType__Group__0 )
            // InternalAdaptDsl.g:1519:4: rule__DefType__Group__0
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
    // InternalAdaptDsl.g:1528:1: entryRuleEnums : ruleEnums EOF ;
    public final void entryRuleEnums() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1529:1: ( ruleEnums EOF )
            // InternalAdaptDsl.g:1530:1: ruleEnums EOF
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
    // InternalAdaptDsl.g:1537:1: ruleEnums : ( ( rule__Enums__Group__0 ) ) ;
    public final void ruleEnums() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1541:2: ( ( ( rule__Enums__Group__0 ) ) )
            // InternalAdaptDsl.g:1542:2: ( ( rule__Enums__Group__0 ) )
            {
            // InternalAdaptDsl.g:1542:2: ( ( rule__Enums__Group__0 ) )
            // InternalAdaptDsl.g:1543:3: ( rule__Enums__Group__0 )
            {
             before(grammarAccess.getEnumsAccess().getGroup()); 
            // InternalAdaptDsl.g:1544:3: ( rule__Enums__Group__0 )
            // InternalAdaptDsl.g:1544:4: rule__Enums__Group__0
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
    // InternalAdaptDsl.g:1553:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1554:1: ( ruleEnum EOF )
            // InternalAdaptDsl.g:1555:1: ruleEnum EOF
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
    // InternalAdaptDsl.g:1562:1: ruleEnum : ( ( rule__Enum__NameAssignment ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1566:2: ( ( ( rule__Enum__NameAssignment ) ) )
            // InternalAdaptDsl.g:1567:2: ( ( rule__Enum__NameAssignment ) )
            {
            // InternalAdaptDsl.g:1567:2: ( ( rule__Enum__NameAssignment ) )
            // InternalAdaptDsl.g:1568:3: ( rule__Enum__NameAssignment )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment()); 
            // InternalAdaptDsl.g:1569:3: ( rule__Enum__NameAssignment )
            // InternalAdaptDsl.g:1569:4: rule__Enum__NameAssignment
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
    // InternalAdaptDsl.g:1578:1: entryRuleTYPE : ruleTYPE EOF ;
    public final void entryRuleTYPE() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1579:1: ( ruleTYPE EOF )
            // InternalAdaptDsl.g:1580:1: ruleTYPE EOF
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
    // InternalAdaptDsl.g:1587:1: ruleTYPE : ( ( rule__TYPE__Alternatives ) ) ;
    public final void ruleTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1591:2: ( ( ( rule__TYPE__Alternatives ) ) )
            // InternalAdaptDsl.g:1592:2: ( ( rule__TYPE__Alternatives ) )
            {
            // InternalAdaptDsl.g:1592:2: ( ( rule__TYPE__Alternatives ) )
            // InternalAdaptDsl.g:1593:3: ( rule__TYPE__Alternatives )
            {
             before(grammarAccess.getTYPEAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1594:3: ( rule__TYPE__Alternatives )
            // InternalAdaptDsl.g:1594:4: rule__TYPE__Alternatives
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
    // InternalAdaptDsl.g:1603:1: entryRuleUpdateType : ruleUpdateType EOF ;
    public final void entryRuleUpdateType() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:1604:1: ( ruleUpdateType EOF )
            // InternalAdaptDsl.g:1605:1: ruleUpdateType EOF
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
    // InternalAdaptDsl.g:1612:1: ruleUpdateType : ( ( rule__UpdateType__Alternatives ) ) ;
    public final void ruleUpdateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1616:2: ( ( ( rule__UpdateType__Alternatives ) ) )
            // InternalAdaptDsl.g:1617:2: ( ( rule__UpdateType__Alternatives ) )
            {
            // InternalAdaptDsl.g:1617:2: ( ( rule__UpdateType__Alternatives ) )
            // InternalAdaptDsl.g:1618:3: ( rule__UpdateType__Alternatives )
            {
             before(grammarAccess.getUpdateTypeAccess().getAlternatives()); 
            // InternalAdaptDsl.g:1619:3: ( rule__UpdateType__Alternatives )
            // InternalAdaptDsl.g:1619:4: rule__UpdateType__Alternatives
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
    // InternalAdaptDsl.g:1627:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );
    public final void rule__ConditionalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1631:1: ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:1632:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1632:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    // InternalAdaptDsl.g:1633:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_0()); 
                    // InternalAdaptDsl.g:1634:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    // InternalAdaptDsl.g:1634:4: rule__ConditionalPrimary__CondAssignment_0
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
                    // InternalAdaptDsl.g:1638:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1638:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    // InternalAdaptDsl.g:1639:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_1()); 
                    // InternalAdaptDsl.g:1640:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    // InternalAdaptDsl.g:1640:4: rule__ConditionalPrimary__CondAssignment_1
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
                    // InternalAdaptDsl.g:1644:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1644:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    // InternalAdaptDsl.g:1645:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_2()); 
                    // InternalAdaptDsl.g:1646:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    // InternalAdaptDsl.g:1646:4: rule__ConditionalPrimary__CondAssignment_2
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
    // InternalAdaptDsl.g:1654:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );
    public final void rule__BooleanCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1658:1: ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptDsl.g:1659:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    {
                    // InternalAdaptDsl.g:1659:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    // InternalAdaptDsl.g:1660:3: ( rule__BooleanCondition__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getGroup_0()); 
                    // InternalAdaptDsl.g:1661:3: ( rule__BooleanCondition__Group_0__0 )
                    // InternalAdaptDsl.g:1661:4: rule__BooleanCondition__Group_0__0
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
                    // InternalAdaptDsl.g:1665:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1665:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    // InternalAdaptDsl.g:1666:3: ( rule__BooleanCondition__FactAssignment_1 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getFactAssignment_1()); 
                    // InternalAdaptDsl.g:1667:3: ( rule__BooleanCondition__FactAssignment_1 )
                    // InternalAdaptDsl.g:1667:4: rule__BooleanCondition__FactAssignment_1
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
    // InternalAdaptDsl.g:1675:1: rule__NumberOperators__Alternatives : ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) );
    public final void rule__NumberOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1679:1: ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) )
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
                    // InternalAdaptDsl.g:1680:2: ( '>' )
                    {
                    // InternalAdaptDsl.g:1680:2: ( '>' )
                    // InternalAdaptDsl.g:1681:3: '>'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1686:2: ( '<' )
                    {
                    // InternalAdaptDsl.g:1686:2: ( '<' )
                    // InternalAdaptDsl.g:1687:3: '<'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1692:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1692:2: ( '==' )
                    // InternalAdaptDsl.g:1693:3: '=='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1698:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1698:2: ( '!=' )
                    // InternalAdaptDsl.g:1699:3: '!='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1704:2: ( '>=' )
                    {
                    // InternalAdaptDsl.g:1704:2: ( '>=' )
                    // InternalAdaptDsl.g:1705:3: '>='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1710:2: ( '<=' )
                    {
                    // InternalAdaptDsl.g:1710:2: ( '<=' )
                    // InternalAdaptDsl.g:1711:3: '<='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1716:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1716:2: ( '===' )
                    // InternalAdaptDsl.g:1717:3: '==='
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
    // InternalAdaptDsl.g:1726:1: rule__StringOperators__Alternatives : ( ( '==' ) | ( '!=' ) | ( '===' ) );
    public final void rule__StringOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1730:1: ( ( '==' ) | ( '!=' ) | ( '===' ) )
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
                    // InternalAdaptDsl.g:1731:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1731:2: ( '==' )
                    // InternalAdaptDsl.g:1732:3: '=='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1737:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1737:2: ( '!=' )
                    // InternalAdaptDsl.g:1738:3: '!='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1743:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1743:2: ( '===' )
                    // InternalAdaptDsl.g:1744:3: '==='
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
    // InternalAdaptDsl.g:1753:1: rule__BoolOperators__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__BoolOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1757:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalAdaptDsl.g:1758:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1758:2: ( '==' )
                    // InternalAdaptDsl.g:1759:3: '=='
                    {
                     before(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1764:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1764:2: ( '!=' )
                    // InternalAdaptDsl.g:1765:3: '!='
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
    // InternalAdaptDsl.g:1774:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1778:1: ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) )
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
                    // InternalAdaptDsl.g:1779:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1779:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    // InternalAdaptDsl.g:1780:3: ( rule__Action__ActionCategoryAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_0()); 
                    // InternalAdaptDsl.g:1781:3: ( rule__Action__ActionCategoryAssignment_0 )
                    // InternalAdaptDsl.g:1781:4: rule__Action__ActionCategoryAssignment_0
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
                    // InternalAdaptDsl.g:1785:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1785:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    // InternalAdaptDsl.g:1786:3: ( rule__Action__ActionCategoryAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_1()); 
                    // InternalAdaptDsl.g:1787:3: ( rule__Action__ActionCategoryAssignment_1 )
                    // InternalAdaptDsl.g:1787:4: rule__Action__ActionCategoryAssignment_1
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
                    // InternalAdaptDsl.g:1791:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1791:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    // InternalAdaptDsl.g:1792:3: ( rule__Action__ActionCategoryAssignment_2 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_2()); 
                    // InternalAdaptDsl.g:1793:3: ( rule__Action__ActionCategoryAssignment_2 )
                    // InternalAdaptDsl.g:1793:4: rule__Action__ActionCategoryAssignment_2
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
                    // InternalAdaptDsl.g:1797:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1797:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    // InternalAdaptDsl.g:1798:3: ( rule__Action__ActionCategoryAssignment_3 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_3()); 
                    // InternalAdaptDsl.g:1799:3: ( rule__Action__ActionCategoryAssignment_3 )
                    // InternalAdaptDsl.g:1799:4: rule__Action__ActionCategoryAssignment_3
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
    // InternalAdaptDsl.g:1807:1: rule__ServiceOperation__Alternatives : ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) );
    public final void rule__ServiceOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1811:1: ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) )
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
                    // InternalAdaptDsl.g:1812:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1812:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1813:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1814:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1814:4: rule__ServiceOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1818:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1818:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1819:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1820:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1820:4: rule__ServiceOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1824:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1824:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1825:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1826:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1826:4: rule__ServiceOperation__OperationAssignment_2
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
    // InternalAdaptDsl.g:1834:1: rule__DisplayPropertyValue__Alternatives : ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) );
    public final void rule__DisplayPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1838:1: ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) )
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
                    // InternalAdaptDsl.g:1839:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1839:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    // InternalAdaptDsl.g:1840:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_0()); 
                    // InternalAdaptDsl.g:1841:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    // InternalAdaptDsl.g:1841:4: rule__DisplayPropertyValue__PropertyClassAssignment_0
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
                    // InternalAdaptDsl.g:1845:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1845:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    // InternalAdaptDsl.g:1846:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_1()); 
                    // InternalAdaptDsl.g:1847:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    // InternalAdaptDsl.g:1847:4: rule__DisplayPropertyValue__PropertyClassAssignment_1
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
                    // InternalAdaptDsl.g:1851:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1851:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    // InternalAdaptDsl.g:1852:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_2()); 
                    // InternalAdaptDsl.g:1853:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    // InternalAdaptDsl.g:1853:4: rule__DisplayPropertyValue__PropertyClassAssignment_2
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
    // InternalAdaptDsl.g:1861:1: rule__TaskChangeOperation__Alternatives : ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__TaskChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1865:1: ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) )
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
                    // InternalAdaptDsl.g:1866:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1866:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1867:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1868:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1868:4: rule__TaskChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1872:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1872:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1873:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1874:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1874:4: rule__TaskChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1878:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1878:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1879:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1880:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1880:4: rule__TaskChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1884:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1884:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1885:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1886:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1886:4: rule__TaskChangeOperation__OperationAssignment_3
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
    // InternalAdaptDsl.g:1894:1: rule__NavigationChangeOperation__Alternatives : ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__NavigationChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1898:1: ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) )
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
                    // InternalAdaptDsl.g:1899:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1899:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1900:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1901:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1901:4: rule__NavigationChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1905:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1905:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1906:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1907:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1907:4: rule__NavigationChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1911:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1911:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1912:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1913:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1913:4: rule__NavigationChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1917:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1917:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1918:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1919:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1919:4: rule__NavigationChangeOperation__OperationAssignment_3
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
    // InternalAdaptDsl.g:1927:1: rule__LayoutChangeOperation__Alternatives : ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) );
    public final void rule__LayoutChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1931:1: ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) )
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
                    // InternalAdaptDsl.g:1932:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1932:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1933:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1934:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1934:4: rule__LayoutChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1938:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1938:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1939:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1940:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1940:4: rule__LayoutChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1944:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1944:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1945:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1946:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1946:4: rule__LayoutChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1950:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1950:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1951:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1952:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1952:4: rule__LayoutChangeOperation__OperationAssignment_3
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
                    // InternalAdaptDsl.g:1956:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    {
                    // InternalAdaptDsl.g:1956:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    // InternalAdaptDsl.g:1957:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_4()); 
                    // InternalAdaptDsl.g:1958:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    // InternalAdaptDsl.g:1958:4: rule__LayoutChangeOperation__OperationAssignment_4
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
    // InternalAdaptDsl.g:1966:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1970:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) )
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
                    // InternalAdaptDsl.g:1971:2: ( RULE_INT )
                    {
                    // InternalAdaptDsl.g:1971:2: ( RULE_INT )
                    // InternalAdaptDsl.g:1972:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1977:2: ( RULE_STRING )
                    {
                    // InternalAdaptDsl.g:1977:2: ( RULE_STRING )
                    // InternalAdaptDsl.g:1978:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1983:2: ( RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:1983:2: ( RULE_BOOL )
                    // InternalAdaptDsl.g:1984:3: RULE_BOOL
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
    // InternalAdaptDsl.g:1993:1: rule__TYPE__Alternatives : ( ( ( rule__TYPE__StringAssignment_0 ) ) | ( ( rule__TYPE__NumberAssignment_1 ) ) | ( ( rule__TYPE__BoolAssignment_2 ) ) | ( ( rule__TYPE__DeftypeAssignment_3 ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1997:1: ( ( ( rule__TYPE__StringAssignment_0 ) ) | ( ( rule__TYPE__NumberAssignment_1 ) ) | ( ( rule__TYPE__BoolAssignment_2 ) ) | ( ( rule__TYPE__DeftypeAssignment_3 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt13=1;
                }
                break;
            case 66:
                {
                alt13=2;
                }
                break;
            case 67:
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
                    // InternalAdaptDsl.g:1998:2: ( ( rule__TYPE__StringAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1998:2: ( ( rule__TYPE__StringAssignment_0 ) )
                    // InternalAdaptDsl.g:1999:3: ( rule__TYPE__StringAssignment_0 )
                    {
                     before(grammarAccess.getTYPEAccess().getStringAssignment_0()); 
                    // InternalAdaptDsl.g:2000:3: ( rule__TYPE__StringAssignment_0 )
                    // InternalAdaptDsl.g:2000:4: rule__TYPE__StringAssignment_0
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
                    // InternalAdaptDsl.g:2004:2: ( ( rule__TYPE__NumberAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:2004:2: ( ( rule__TYPE__NumberAssignment_1 ) )
                    // InternalAdaptDsl.g:2005:3: ( rule__TYPE__NumberAssignment_1 )
                    {
                     before(grammarAccess.getTYPEAccess().getNumberAssignment_1()); 
                    // InternalAdaptDsl.g:2006:3: ( rule__TYPE__NumberAssignment_1 )
                    // InternalAdaptDsl.g:2006:4: rule__TYPE__NumberAssignment_1
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
                    // InternalAdaptDsl.g:2010:2: ( ( rule__TYPE__BoolAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:2010:2: ( ( rule__TYPE__BoolAssignment_2 ) )
                    // InternalAdaptDsl.g:2011:3: ( rule__TYPE__BoolAssignment_2 )
                    {
                     before(grammarAccess.getTYPEAccess().getBoolAssignment_2()); 
                    // InternalAdaptDsl.g:2012:3: ( rule__TYPE__BoolAssignment_2 )
                    // InternalAdaptDsl.g:2012:4: rule__TYPE__BoolAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE__BoolAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTYPEAccess().getBoolAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:2016:2: ( ( rule__TYPE__DeftypeAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:2016:2: ( ( rule__TYPE__DeftypeAssignment_3 ) )
                    // InternalAdaptDsl.g:2017:3: ( rule__TYPE__DeftypeAssignment_3 )
                    {
                     before(grammarAccess.getTYPEAccess().getDeftypeAssignment_3()); 
                    // InternalAdaptDsl.g:2018:3: ( rule__TYPE__DeftypeAssignment_3 )
                    // InternalAdaptDsl.g:2018:4: rule__TYPE__DeftypeAssignment_3
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
    // InternalAdaptDsl.g:2026:1: rule__UpdateType__Alternatives : ( ( ( rule__UpdateType__EventAssignment_0 ) ) | ( ( rule__UpdateType__SlowAssignment_1 ) ) | ( ( rule__UpdateType__FastAssignment_2 ) ) );
    public final void rule__UpdateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2030:1: ( ( ( rule__UpdateType__EventAssignment_0 ) ) | ( ( rule__UpdateType__SlowAssignment_1 ) ) | ( ( rule__UpdateType__FastAssignment_2 ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt14=1;
                }
                break;
            case 69:
                {
                alt14=2;
                }
                break;
            case 70:
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
                    // InternalAdaptDsl.g:2031:2: ( ( rule__UpdateType__EventAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:2031:2: ( ( rule__UpdateType__EventAssignment_0 ) )
                    // InternalAdaptDsl.g:2032:3: ( rule__UpdateType__EventAssignment_0 )
                    {
                     before(grammarAccess.getUpdateTypeAccess().getEventAssignment_0()); 
                    // InternalAdaptDsl.g:2033:3: ( rule__UpdateType__EventAssignment_0 )
                    // InternalAdaptDsl.g:2033:4: rule__UpdateType__EventAssignment_0
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
                    // InternalAdaptDsl.g:2037:2: ( ( rule__UpdateType__SlowAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:2037:2: ( ( rule__UpdateType__SlowAssignment_1 ) )
                    // InternalAdaptDsl.g:2038:3: ( rule__UpdateType__SlowAssignment_1 )
                    {
                     before(grammarAccess.getUpdateTypeAccess().getSlowAssignment_1()); 
                    // InternalAdaptDsl.g:2039:3: ( rule__UpdateType__SlowAssignment_1 )
                    // InternalAdaptDsl.g:2039:4: rule__UpdateType__SlowAssignment_1
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
                    // InternalAdaptDsl.g:2043:2: ( ( rule__UpdateType__FastAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:2043:2: ( ( rule__UpdateType__FastAssignment_2 ) )
                    // InternalAdaptDsl.g:2044:3: ( rule__UpdateType__FastAssignment_2 )
                    {
                     before(grammarAccess.getUpdateTypeAccess().getFastAssignment_2()); 
                    // InternalAdaptDsl.g:2045:3: ( rule__UpdateType__FastAssignment_2 )
                    // InternalAdaptDsl.g:2045:4: rule__UpdateType__FastAssignment_2
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
    // InternalAdaptDsl.g:2053:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2057:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptDsl.g:2058:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAdaptDsl.g:2065:1: rule__Model__Group__0__Impl : ( ( rule__Model__ContextModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2069:1: ( ( ( rule__Model__ContextModelAssignment_0 ) ) )
            // InternalAdaptDsl.g:2070:1: ( ( rule__Model__ContextModelAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2070:1: ( ( rule__Model__ContextModelAssignment_0 ) )
            // InternalAdaptDsl.g:2071:2: ( rule__Model__ContextModelAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getContextModelAssignment_0()); 
            // InternalAdaptDsl.g:2072:2: ( rule__Model__ContextModelAssignment_0 )
            // InternalAdaptDsl.g:2072:3: rule__Model__ContextModelAssignment_0
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
    // InternalAdaptDsl.g:2080:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2084:1: ( rule__Model__Group__1__Impl )
            // InternalAdaptDsl.g:2085:2: rule__Model__Group__1__Impl
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
    // InternalAdaptDsl.g:2091:1: rule__Model__Group__1__Impl : ( ( rule__Model__AdaptationModelAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2095:1: ( ( ( rule__Model__AdaptationModelAssignment_1 ) ) )
            // InternalAdaptDsl.g:2096:1: ( ( rule__Model__AdaptationModelAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2096:1: ( ( rule__Model__AdaptationModelAssignment_1 ) )
            // InternalAdaptDsl.g:2097:2: ( rule__Model__AdaptationModelAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAdaptationModelAssignment_1()); 
            // InternalAdaptDsl.g:2098:2: ( rule__Model__AdaptationModelAssignment_1 )
            // InternalAdaptDsl.g:2098:3: rule__Model__AdaptationModelAssignment_1
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
    // InternalAdaptDsl.g:2107:1: rule__ContextModel__Group__0 : rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 ;
    public final void rule__ContextModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2111:1: ( rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 )
            // InternalAdaptDsl.g:2112:2: rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1
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
    // InternalAdaptDsl.g:2119:1: rule__ContextModel__Group__0__Impl : ( 'ContextModel{' ) ;
    public final void rule__ContextModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2123:1: ( ( 'ContextModel{' ) )
            // InternalAdaptDsl.g:2124:1: ( 'ContextModel{' )
            {
            // InternalAdaptDsl.g:2124:1: ( 'ContextModel{' )
            // InternalAdaptDsl.g:2125:2: 'ContextModel{'
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
    // InternalAdaptDsl.g:2134:1: rule__ContextModel__Group__1 : rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 ;
    public final void rule__ContextModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2138:1: ( rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 )
            // InternalAdaptDsl.g:2139:2: rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2
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
    // InternalAdaptDsl.g:2146:1: rule__ContextModel__Group__1__Impl : ( ( ( rule__ContextModel__Group_1__0 ) ) ( ( rule__ContextModel__Group_1__0 )* ) ) ;
    public final void rule__ContextModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2150:1: ( ( ( ( rule__ContextModel__Group_1__0 ) ) ( ( rule__ContextModel__Group_1__0 )* ) ) )
            // InternalAdaptDsl.g:2151:1: ( ( ( rule__ContextModel__Group_1__0 ) ) ( ( rule__ContextModel__Group_1__0 )* ) )
            {
            // InternalAdaptDsl.g:2151:1: ( ( ( rule__ContextModel__Group_1__0 ) ) ( ( rule__ContextModel__Group_1__0 )* ) )
            // InternalAdaptDsl.g:2152:2: ( ( rule__ContextModel__Group_1__0 ) ) ( ( rule__ContextModel__Group_1__0 )* )
            {
            // InternalAdaptDsl.g:2152:2: ( ( rule__ContextModel__Group_1__0 ) )
            // InternalAdaptDsl.g:2153:3: ( rule__ContextModel__Group_1__0 )
            {
             before(grammarAccess.getContextModelAccess().getGroup_1()); 
            // InternalAdaptDsl.g:2154:3: ( rule__ContextModel__Group_1__0 )
            // InternalAdaptDsl.g:2154:4: rule__ContextModel__Group_1__0
            {
            pushFollow(FOLLOW_6);
            rule__ContextModel__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getGroup_1()); 

            }

            // InternalAdaptDsl.g:2157:2: ( ( rule__ContextModel__Group_1__0 )* )
            // InternalAdaptDsl.g:2158:3: ( rule__ContextModel__Group_1__0 )*
            {
             before(grammarAccess.getContextModelAccess().getGroup_1()); 
            // InternalAdaptDsl.g:2159:3: ( rule__ContextModel__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==61) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdaptDsl.g:2159:4: rule__ContextModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ContextModel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getGroup_1()); 

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
    // InternalAdaptDsl.g:2168:1: rule__ContextModel__Group__2 : rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 ;
    public final void rule__ContextModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2172:1: ( rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 )
            // InternalAdaptDsl.g:2173:2: rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3
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
    // InternalAdaptDsl.g:2180:1: rule__ContextModel__Group__2__Impl : ( ( rule__ContextModel__Group_2__0 )? ) ;
    public final void rule__ContextModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2184:1: ( ( ( rule__ContextModel__Group_2__0 )? ) )
            // InternalAdaptDsl.g:2185:1: ( ( rule__ContextModel__Group_2__0 )? )
            {
            // InternalAdaptDsl.g:2185:1: ( ( rule__ContextModel__Group_2__0 )? )
            // InternalAdaptDsl.g:2186:2: ( rule__ContextModel__Group_2__0 )?
            {
             before(grammarAccess.getContextModelAccess().getGroup_2()); 
            // InternalAdaptDsl.g:2187:2: ( rule__ContextModel__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptDsl.g:2187:3: rule__ContextModel__Group_2__0
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
    // InternalAdaptDsl.g:2195:1: rule__ContextModel__Group__3 : rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 ;
    public final void rule__ContextModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2199:1: ( rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 )
            // InternalAdaptDsl.g:2200:2: rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4
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
    // InternalAdaptDsl.g:2207:1: rule__ContextModel__Group__3__Impl : ( ( rule__ContextModel__Group_3__0 )? ) ;
    public final void rule__ContextModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2211:1: ( ( ( rule__ContextModel__Group_3__0 )? ) )
            // InternalAdaptDsl.g:2212:1: ( ( rule__ContextModel__Group_3__0 )? )
            {
            // InternalAdaptDsl.g:2212:1: ( ( rule__ContextModel__Group_3__0 )? )
            // InternalAdaptDsl.g:2213:2: ( rule__ContextModel__Group_3__0 )?
            {
             before(grammarAccess.getContextModelAccess().getGroup_3()); 
            // InternalAdaptDsl.g:2214:2: ( rule__ContextModel__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdaptDsl.g:2214:3: rule__ContextModel__Group_3__0
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
    // InternalAdaptDsl.g:2222:1: rule__ContextModel__Group__4 : rule__ContextModel__Group__4__Impl ;
    public final void rule__ContextModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2226:1: ( rule__ContextModel__Group__4__Impl )
            // InternalAdaptDsl.g:2227:2: rule__ContextModel__Group__4__Impl
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
    // InternalAdaptDsl.g:2233:1: rule__ContextModel__Group__4__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2237:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2238:1: ( '};' )
            {
            // InternalAdaptDsl.g:2238:1: ( '};' )
            // InternalAdaptDsl.g:2239:2: '};'
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


    // $ANTLR start "rule__ContextModel__Group_1__0"
    // InternalAdaptDsl.g:2249:1: rule__ContextModel__Group_1__0 : rule__ContextModel__Group_1__0__Impl rule__ContextModel__Group_1__1 ;
    public final void rule__ContextModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2253:1: ( rule__ContextModel__Group_1__0__Impl rule__ContextModel__Group_1__1 )
            // InternalAdaptDsl.g:2254:2: rule__ContextModel__Group_1__0__Impl rule__ContextModel__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ContextModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__0"


    // $ANTLR start "rule__ContextModel__Group_1__0__Impl"
    // InternalAdaptDsl.g:2261:1: rule__ContextModel__Group_1__0__Impl : ( ( rule__ContextModel__EntityAssignment_1_0 ) ) ;
    public final void rule__ContextModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2265:1: ( ( ( rule__ContextModel__EntityAssignment_1_0 ) ) )
            // InternalAdaptDsl.g:2266:1: ( ( rule__ContextModel__EntityAssignment_1_0 ) )
            {
            // InternalAdaptDsl.g:2266:1: ( ( rule__ContextModel__EntityAssignment_1_0 ) )
            // InternalAdaptDsl.g:2267:2: ( rule__ContextModel__EntityAssignment_1_0 )
            {
             before(grammarAccess.getContextModelAccess().getEntityAssignment_1_0()); 
            // InternalAdaptDsl.g:2268:2: ( rule__ContextModel__EntityAssignment_1_0 )
            // InternalAdaptDsl.g:2268:3: rule__ContextModel__EntityAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__EntityAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getEntityAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__0__Impl"


    // $ANTLR start "rule__ContextModel__Group_1__1"
    // InternalAdaptDsl.g:2276:1: rule__ContextModel__Group_1__1 : rule__ContextModel__Group_1__1__Impl rule__ContextModel__Group_1__2 ;
    public final void rule__ContextModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2280:1: ( rule__ContextModel__Group_1__1__Impl rule__ContextModel__Group_1__2 )
            // InternalAdaptDsl.g:2281:2: rule__ContextModel__Group_1__1__Impl rule__ContextModel__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__ContextModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__1"


    // $ANTLR start "rule__ContextModel__Group_1__1__Impl"
    // InternalAdaptDsl.g:2288:1: rule__ContextModel__Group_1__1__Impl : ( '{' ) ;
    public final void rule__ContextModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2292:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2293:1: ( '{' )
            {
            // InternalAdaptDsl.g:2293:1: ( '{' )
            // InternalAdaptDsl.g:2294:2: '{'
            {
             before(grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__1__Impl"


    // $ANTLR start "rule__ContextModel__Group_1__2"
    // InternalAdaptDsl.g:2303:1: rule__ContextModel__Group_1__2 : rule__ContextModel__Group_1__2__Impl rule__ContextModel__Group_1__3 ;
    public final void rule__ContextModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2307:1: ( rule__ContextModel__Group_1__2__Impl rule__ContextModel__Group_1__3 )
            // InternalAdaptDsl.g:2308:2: rule__ContextModel__Group_1__2__Impl rule__ContextModel__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__ContextModel__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__2"


    // $ANTLR start "rule__ContextModel__Group_1__2__Impl"
    // InternalAdaptDsl.g:2315:1: rule__ContextModel__Group_1__2__Impl : ( ( ( rule__ContextModel__PropertyAssignment_1_2 ) ) ( ( rule__ContextModel__PropertyAssignment_1_2 )* ) ) ;
    public final void rule__ContextModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2319:1: ( ( ( ( rule__ContextModel__PropertyAssignment_1_2 ) ) ( ( rule__ContextModel__PropertyAssignment_1_2 )* ) ) )
            // InternalAdaptDsl.g:2320:1: ( ( ( rule__ContextModel__PropertyAssignment_1_2 ) ) ( ( rule__ContextModel__PropertyAssignment_1_2 )* ) )
            {
            // InternalAdaptDsl.g:2320:1: ( ( ( rule__ContextModel__PropertyAssignment_1_2 ) ) ( ( rule__ContextModel__PropertyAssignment_1_2 )* ) )
            // InternalAdaptDsl.g:2321:2: ( ( rule__ContextModel__PropertyAssignment_1_2 ) ) ( ( rule__ContextModel__PropertyAssignment_1_2 )* )
            {
            // InternalAdaptDsl.g:2321:2: ( ( rule__ContextModel__PropertyAssignment_1_2 ) )
            // InternalAdaptDsl.g:2322:3: ( rule__ContextModel__PropertyAssignment_1_2 )
            {
             before(grammarAccess.getContextModelAccess().getPropertyAssignment_1_2()); 
            // InternalAdaptDsl.g:2323:3: ( rule__ContextModel__PropertyAssignment_1_2 )
            // InternalAdaptDsl.g:2323:4: rule__ContextModel__PropertyAssignment_1_2
            {
            pushFollow(FOLLOW_10);
            rule__ContextModel__PropertyAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getPropertyAssignment_1_2()); 

            }

            // InternalAdaptDsl.g:2326:2: ( ( rule__ContextModel__PropertyAssignment_1_2 )* )
            // InternalAdaptDsl.g:2327:3: ( rule__ContextModel__PropertyAssignment_1_2 )*
            {
             before(grammarAccess.getContextModelAccess().getPropertyAssignment_1_2()); 
            // InternalAdaptDsl.g:2328:3: ( rule__ContextModel__PropertyAssignment_1_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAdaptDsl.g:2328:4: rule__ContextModel__PropertyAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContextModel__PropertyAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getContextModelAccess().getPropertyAssignment_1_2()); 

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
    // $ANTLR end "rule__ContextModel__Group_1__2__Impl"


    // $ANTLR start "rule__ContextModel__Group_1__3"
    // InternalAdaptDsl.g:2337:1: rule__ContextModel__Group_1__3 : rule__ContextModel__Group_1__3__Impl ;
    public final void rule__ContextModel__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2341:1: ( rule__ContextModel__Group_1__3__Impl )
            // InternalAdaptDsl.g:2342:2: rule__ContextModel__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextModel__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__3"


    // $ANTLR start "rule__ContextModel__Group_1__3__Impl"
    // InternalAdaptDsl.g:2348:1: rule__ContextModel__Group_1__3__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2352:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2353:1: ( '};' )
            {
            // InternalAdaptDsl.g:2353:1: ( '};' )
            // InternalAdaptDsl.g:2354:2: '};'
            {
             before(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_1_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__Group_1__3__Impl"


    // $ANTLR start "rule__ContextModel__Group_2__0"
    // InternalAdaptDsl.g:2364:1: rule__ContextModel__Group_2__0 : rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1 ;
    public final void rule__ContextModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2368:1: ( rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1 )
            // InternalAdaptDsl.g:2369:2: rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAdaptDsl.g:2376:1: rule__ContextModel__Group_2__0__Impl : ( 'Services{' ) ;
    public final void rule__ContextModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2380:1: ( ( 'Services{' ) )
            // InternalAdaptDsl.g:2381:1: ( 'Services{' )
            {
            // InternalAdaptDsl.g:2381:1: ( 'Services{' )
            // InternalAdaptDsl.g:2382:2: 'Services{'
            {
             before(grammarAccess.getContextModelAccess().getServicesKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getServicesKeyword_2_0()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2391:1: rule__ContextModel__Group_2__1 : rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2 ;
    public final void rule__ContextModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2395:1: ( rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2 )
            // InternalAdaptDsl.g:2396:2: rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalAdaptDsl.g:2403:1: rule__ContextModel__Group_2__1__Impl : ( ( rule__ContextModel__Group_2_1__0 )* ) ;
    public final void rule__ContextModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2407:1: ( ( ( rule__ContextModel__Group_2_1__0 )* ) )
            // InternalAdaptDsl.g:2408:1: ( ( rule__ContextModel__Group_2_1__0 )* )
            {
            // InternalAdaptDsl.g:2408:1: ( ( rule__ContextModel__Group_2_1__0 )* )
            // InternalAdaptDsl.g:2409:2: ( rule__ContextModel__Group_2_1__0 )*
            {
             before(grammarAccess.getContextModelAccess().getGroup_2_1()); 
            // InternalAdaptDsl.g:2410:2: ( rule__ContextModel__Group_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAdaptDsl.g:2410:3: rule__ContextModel__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContextModel__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAdaptDsl.g:2418:1: rule__ContextModel__Group_2__2 : rule__ContextModel__Group_2__2__Impl ;
    public final void rule__ContextModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2422:1: ( rule__ContextModel__Group_2__2__Impl )
            // InternalAdaptDsl.g:2423:2: rule__ContextModel__Group_2__2__Impl
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
    // InternalAdaptDsl.g:2429:1: rule__ContextModel__Group_2__2__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2433:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2434:1: ( '};' )
            {
            // InternalAdaptDsl.g:2434:1: ( '};' )
            // InternalAdaptDsl.g:2435:2: '};'
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
    // InternalAdaptDsl.g:2445:1: rule__ContextModel__Group_2_1__0 : rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1 ;
    public final void rule__ContextModel__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2449:1: ( rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1 )
            // InternalAdaptDsl.g:2450:2: rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:2457:1: rule__ContextModel__Group_2_1__0__Impl : ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) ) ;
    public final void rule__ContextModel__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2461:1: ( ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) ) )
            // InternalAdaptDsl.g:2462:1: ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) )
            {
            // InternalAdaptDsl.g:2462:1: ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) )
            // InternalAdaptDsl.g:2463:2: ( rule__ContextModel__ProviderAssignment_2_1_0 )
            {
             before(grammarAccess.getContextModelAccess().getProviderAssignment_2_1_0()); 
            // InternalAdaptDsl.g:2464:2: ( rule__ContextModel__ProviderAssignment_2_1_0 )
            // InternalAdaptDsl.g:2464:3: rule__ContextModel__ProviderAssignment_2_1_0
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
    // InternalAdaptDsl.g:2472:1: rule__ContextModel__Group_2_1__1 : rule__ContextModel__Group_2_1__1__Impl ;
    public final void rule__ContextModel__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2476:1: ( rule__ContextModel__Group_2_1__1__Impl )
            // InternalAdaptDsl.g:2477:2: rule__ContextModel__Group_2_1__1__Impl
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
    // InternalAdaptDsl.g:2483:1: rule__ContextModel__Group_2_1__1__Impl : ( ';' ) ;
    public final void rule__ContextModel__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2487:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2488:1: ( ';' )
            {
            // InternalAdaptDsl.g:2488:1: ( ';' )
            // InternalAdaptDsl.g:2489:2: ';'
            {
             before(grammarAccess.getContextModelAccess().getSemicolonKeyword_2_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2499:1: rule__ContextModel__Group_3__0 : rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1 ;
    public final void rule__ContextModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2503:1: ( rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1 )
            // InternalAdaptDsl.g:2504:2: rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2511:1: rule__ContextModel__Group_3__0__Impl : ( 'Types{' ) ;
    public final void rule__ContextModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2515:1: ( ( 'Types{' ) )
            // InternalAdaptDsl.g:2516:1: ( 'Types{' )
            {
            // InternalAdaptDsl.g:2516:1: ( 'Types{' )
            // InternalAdaptDsl.g:2517:2: 'Types{'
            {
             before(grammarAccess.getContextModelAccess().getTypesKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContextModelAccess().getTypesKeyword_3_0()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2526:1: rule__ContextModel__Group_3__1 : rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2 ;
    public final void rule__ContextModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2530:1: ( rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2 )
            // InternalAdaptDsl.g:2531:2: rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2538:1: rule__ContextModel__Group_3__1__Impl : ( ( rule__ContextModel__TypesAssignment_3_1 ) ) ;
    public final void rule__ContextModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2542:1: ( ( ( rule__ContextModel__TypesAssignment_3_1 ) ) )
            // InternalAdaptDsl.g:2543:1: ( ( rule__ContextModel__TypesAssignment_3_1 ) )
            {
            // InternalAdaptDsl.g:2543:1: ( ( rule__ContextModel__TypesAssignment_3_1 ) )
            // InternalAdaptDsl.g:2544:2: ( rule__ContextModel__TypesAssignment_3_1 )
            {
             before(grammarAccess.getContextModelAccess().getTypesAssignment_3_1()); 
            // InternalAdaptDsl.g:2545:2: ( rule__ContextModel__TypesAssignment_3_1 )
            // InternalAdaptDsl.g:2545:3: rule__ContextModel__TypesAssignment_3_1
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
    // InternalAdaptDsl.g:2553:1: rule__ContextModel__Group_3__2 : rule__ContextModel__Group_3__2__Impl ;
    public final void rule__ContextModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2557:1: ( rule__ContextModel__Group_3__2__Impl )
            // InternalAdaptDsl.g:2558:2: rule__ContextModel__Group_3__2__Impl
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
    // InternalAdaptDsl.g:2564:1: rule__ContextModel__Group_3__2__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2568:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2569:1: ( '};' )
            {
            // InternalAdaptDsl.g:2569:1: ( '};' )
            // InternalAdaptDsl.g:2570:2: '};'
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
    // InternalAdaptDsl.g:2580:1: rule__AdaptationModel__Group__0 : rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 ;
    public final void rule__AdaptationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2584:1: ( rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 )
            // InternalAdaptDsl.g:2585:2: rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptDsl.g:2592:1: rule__AdaptationModel__Group__0__Impl : ( 'AdaptationModel{' ) ;
    public final void rule__AdaptationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2596:1: ( ( 'AdaptationModel{' ) )
            // InternalAdaptDsl.g:2597:1: ( 'AdaptationModel{' )
            {
            // InternalAdaptDsl.g:2597:1: ( 'AdaptationModel{' )
            // InternalAdaptDsl.g:2598:2: 'AdaptationModel{'
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationModelKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2607:1: rule__AdaptationModel__Group__1 : rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2 ;
    public final void rule__AdaptationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2611:1: ( rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2 )
            // InternalAdaptDsl.g:2612:2: rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptDsl.g:2619:1: rule__AdaptationModel__Group__1__Impl : ( ( rule__AdaptationModel__ServicesAssignment_1 )? ) ;
    public final void rule__AdaptationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2623:1: ( ( ( rule__AdaptationModel__ServicesAssignment_1 )? ) )
            // InternalAdaptDsl.g:2624:1: ( ( rule__AdaptationModel__ServicesAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2624:1: ( ( rule__AdaptationModel__ServicesAssignment_1 )? )
            // InternalAdaptDsl.g:2625:2: ( rule__AdaptationModel__ServicesAssignment_1 )?
            {
             before(grammarAccess.getAdaptationModelAccess().getServicesAssignment_1()); 
            // InternalAdaptDsl.g:2626:2: ( rule__AdaptationModel__ServicesAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:2626:3: rule__AdaptationModel__ServicesAssignment_1
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
    // InternalAdaptDsl.g:2634:1: rule__AdaptationModel__Group__2 : rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3 ;
    public final void rule__AdaptationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2638:1: ( rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3 )
            // InternalAdaptDsl.g:2639:2: rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:2646:1: rule__AdaptationModel__Group__2__Impl : ( 'flow' ) ;
    public final void rule__AdaptationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2650:1: ( ( 'flow' ) )
            // InternalAdaptDsl.g:2651:1: ( 'flow' )
            {
            // InternalAdaptDsl.g:2651:1: ( 'flow' )
            // InternalAdaptDsl.g:2652:2: 'flow'
            {
             before(grammarAccess.getAdaptationModelAccess().getFlowKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2661:1: rule__AdaptationModel__Group__3 : rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4 ;
    public final void rule__AdaptationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2665:1: ( rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4 )
            // InternalAdaptDsl.g:2666:2: rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalAdaptDsl.g:2673:1: rule__AdaptationModel__Group__3__Impl : ( ( rule__AdaptationModel__FlowNameAssignment_3 ) ) ;
    public final void rule__AdaptationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2677:1: ( ( ( rule__AdaptationModel__FlowNameAssignment_3 ) ) )
            // InternalAdaptDsl.g:2678:1: ( ( rule__AdaptationModel__FlowNameAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2678:1: ( ( rule__AdaptationModel__FlowNameAssignment_3 ) )
            // InternalAdaptDsl.g:2679:2: ( rule__AdaptationModel__FlowNameAssignment_3 )
            {
             before(grammarAccess.getAdaptationModelAccess().getFlowNameAssignment_3()); 
            // InternalAdaptDsl.g:2680:2: ( rule__AdaptationModel__FlowNameAssignment_3 )
            // InternalAdaptDsl.g:2680:3: rule__AdaptationModel__FlowNameAssignment_3
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
    // InternalAdaptDsl.g:2688:1: rule__AdaptationModel__Group__4 : rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5 ;
    public final void rule__AdaptationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2692:1: ( rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5 )
            // InternalAdaptDsl.g:2693:2: rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5
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
    // InternalAdaptDsl.g:2700:1: rule__AdaptationModel__Group__4__Impl : ( '{' ) ;
    public final void rule__AdaptationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2704:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2705:1: ( '{' )
            {
            // InternalAdaptDsl.g:2705:1: ( '{' )
            // InternalAdaptDsl.g:2706:2: '{'
            {
             before(grammarAccess.getAdaptationModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2715:1: rule__AdaptationModel__Group__5 : rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6 ;
    public final void rule__AdaptationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2719:1: ( rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6 )
            // InternalAdaptDsl.g:2720:2: rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2727:1: rule__AdaptationModel__Group__5__Impl : ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) ) ;
    public final void rule__AdaptationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2731:1: ( ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) ) )
            // InternalAdaptDsl.g:2732:1: ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) )
            {
            // InternalAdaptDsl.g:2732:1: ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) )
            // InternalAdaptDsl.g:2733:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* )
            {
            // InternalAdaptDsl.g:2733:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) )
            // InternalAdaptDsl.g:2734:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 
            // InternalAdaptDsl.g:2735:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )
            // InternalAdaptDsl.g:2735:4: rule__AdaptationModel__AdaptationRulesAssignment_5
            {
            pushFollow(FOLLOW_16);
            rule__AdaptationModel__AdaptationRulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 

            }

            // InternalAdaptDsl.g:2738:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* )
            // InternalAdaptDsl.g:2739:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 
            // InternalAdaptDsl.g:2740:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAdaptDsl.g:2740:4: rule__AdaptationModel__AdaptationRulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AdaptationModel__AdaptationRulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalAdaptDsl.g:2749:1: rule__AdaptationModel__Group__6 : rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7 ;
    public final void rule__AdaptationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2753:1: ( rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7 )
            // InternalAdaptDsl.g:2754:2: rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2761:1: rule__AdaptationModel__Group__6__Impl : ( '};' ) ;
    public final void rule__AdaptationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2765:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2766:1: ( '};' )
            {
            // InternalAdaptDsl.g:2766:1: ( '};' )
            // InternalAdaptDsl.g:2767:2: '};'
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
    // InternalAdaptDsl.g:2776:1: rule__AdaptationModel__Group__7 : rule__AdaptationModel__Group__7__Impl ;
    public final void rule__AdaptationModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2780:1: ( rule__AdaptationModel__Group__7__Impl )
            // InternalAdaptDsl.g:2781:2: rule__AdaptationModel__Group__7__Impl
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
    // InternalAdaptDsl.g:2787:1: rule__AdaptationModel__Group__7__Impl : ( '};' ) ;
    public final void rule__AdaptationModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2791:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2792:1: ( '};' )
            {
            // InternalAdaptDsl.g:2792:1: ( '};' )
            // InternalAdaptDsl.g:2793:2: '};'
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
    // InternalAdaptDsl.g:2803:1: rule__Services__Group__0 : rule__Services__Group__0__Impl rule__Services__Group__1 ;
    public final void rule__Services__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2807:1: ( rule__Services__Group__0__Impl rule__Services__Group__1 )
            // InternalAdaptDsl.g:2808:2: rule__Services__Group__0__Impl rule__Services__Group__1
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
    // InternalAdaptDsl.g:2815:1: rule__Services__Group__0__Impl : ( ( rule__Services__ThisAssignment_0 ) ) ;
    public final void rule__Services__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2819:1: ( ( ( rule__Services__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:2820:1: ( ( rule__Services__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2820:1: ( ( rule__Services__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:2821:2: ( rule__Services__ThisAssignment_0 )
            {
             before(grammarAccess.getServicesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:2822:2: ( rule__Services__ThisAssignment_0 )
            // InternalAdaptDsl.g:2822:3: rule__Services__ThisAssignment_0
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
    // InternalAdaptDsl.g:2830:1: rule__Services__Group__1 : rule__Services__Group__1__Impl ;
    public final void rule__Services__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2834:1: ( rule__Services__Group__1__Impl )
            // InternalAdaptDsl.g:2835:2: rule__Services__Group__1__Impl
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
    // InternalAdaptDsl.g:2841:1: rule__Services__Group__1__Impl : ( ( rule__Services__NextAssignment_1 )? ) ;
    public final void rule__Services__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2845:1: ( ( ( rule__Services__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:2846:1: ( ( rule__Services__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2846:1: ( ( rule__Services__NextAssignment_1 )? )
            // InternalAdaptDsl.g:2847:2: ( rule__Services__NextAssignment_1 )?
            {
             before(grammarAccess.getServicesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:2848:2: ( rule__Services__NextAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:2848:3: rule__Services__NextAssignment_1
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
    // InternalAdaptDsl.g:2857:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2861:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAdaptDsl.g:2862:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2869:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2873:1: ( ( 'service' ) )
            // InternalAdaptDsl.g:2874:1: ( 'service' )
            {
            // InternalAdaptDsl.g:2874:1: ( 'service' )
            // InternalAdaptDsl.g:2875:2: 'service'
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
    // InternalAdaptDsl.g:2884:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2888:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAdaptDsl.g:2889:2: rule__Service__Group__1__Impl rule__Service__Group__2
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
    // InternalAdaptDsl.g:2896:1: rule__Service__Group__1__Impl : ( ( rule__Service__TypeAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2900:1: ( ( ( rule__Service__TypeAssignment_1 ) ) )
            // InternalAdaptDsl.g:2901:1: ( ( rule__Service__TypeAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2901:1: ( ( rule__Service__TypeAssignment_1 ) )
            // InternalAdaptDsl.g:2902:2: ( rule__Service__TypeAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_1()); 
            // InternalAdaptDsl.g:2903:2: ( rule__Service__TypeAssignment_1 )
            // InternalAdaptDsl.g:2903:3: rule__Service__TypeAssignment_1
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
    // InternalAdaptDsl.g:2911:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2915:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAdaptDsl.g:2916:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:2923:1: rule__Service__Group__2__Impl : ( 'from' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2927:1: ( ( 'from' ) )
            // InternalAdaptDsl.g:2928:1: ( 'from' )
            {
            // InternalAdaptDsl.g:2928:1: ( 'from' )
            // InternalAdaptDsl.g:2929:2: 'from'
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
    // InternalAdaptDsl.g:2938:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2942:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAdaptDsl.g:2943:2: rule__Service__Group__3__Impl rule__Service__Group__4
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
    // InternalAdaptDsl.g:2950:1: rule__Service__Group__3__Impl : ( ( rule__Service__LocAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2954:1: ( ( ( rule__Service__LocAssignment_3 ) ) )
            // InternalAdaptDsl.g:2955:1: ( ( rule__Service__LocAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2955:1: ( ( rule__Service__LocAssignment_3 ) )
            // InternalAdaptDsl.g:2956:2: ( rule__Service__LocAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getLocAssignment_3()); 
            // InternalAdaptDsl.g:2957:2: ( rule__Service__LocAssignment_3 )
            // InternalAdaptDsl.g:2957:3: rule__Service__LocAssignment_3
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
    // InternalAdaptDsl.g:2965:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2969:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAdaptDsl.g:2970:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:2977:1: rule__Service__Group__4__Impl : ( 'as' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2981:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:2982:1: ( 'as' )
            {
            // InternalAdaptDsl.g:2982:1: ( 'as' )
            // InternalAdaptDsl.g:2983:2: 'as'
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
    // InternalAdaptDsl.g:2992:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2996:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAdaptDsl.g:2997:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalAdaptDsl.g:3004:1: rule__Service__Group__5__Impl : ( ( rule__Service__IdAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3008:1: ( ( ( rule__Service__IdAssignment_5 ) ) )
            // InternalAdaptDsl.g:3009:1: ( ( rule__Service__IdAssignment_5 ) )
            {
            // InternalAdaptDsl.g:3009:1: ( ( rule__Service__IdAssignment_5 ) )
            // InternalAdaptDsl.g:3010:2: ( rule__Service__IdAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getIdAssignment_5()); 
            // InternalAdaptDsl.g:3011:2: ( rule__Service__IdAssignment_5 )
            // InternalAdaptDsl.g:3011:3: rule__Service__IdAssignment_5
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
    // InternalAdaptDsl.g:3019:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3023:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAdaptDsl.g:3024:2: rule__Service__Group__6__Impl rule__Service__Group__7
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
    // InternalAdaptDsl.g:3031:1: rule__Service__Group__6__Impl : ( '{' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3035:1: ( ( '{' ) )
            // InternalAdaptDsl.g:3036:1: ( '{' )
            {
            // InternalAdaptDsl.g:3036:1: ( '{' )
            // InternalAdaptDsl.g:3037:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3046:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3050:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAdaptDsl.g:3051:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:3058:1: rule__Service__Group__7__Impl : ( ( rule__Service__FunctionsAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3062:1: ( ( ( rule__Service__FunctionsAssignment_7 ) ) )
            // InternalAdaptDsl.g:3063:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            {
            // InternalAdaptDsl.g:3063:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            // InternalAdaptDsl.g:3064:2: ( rule__Service__FunctionsAssignment_7 )
            {
             before(grammarAccess.getServiceAccess().getFunctionsAssignment_7()); 
            // InternalAdaptDsl.g:3065:2: ( rule__Service__FunctionsAssignment_7 )
            // InternalAdaptDsl.g:3065:3: rule__Service__FunctionsAssignment_7
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
    // InternalAdaptDsl.g:3073:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3077:1: ( rule__Service__Group__8__Impl )
            // InternalAdaptDsl.g:3078:2: rule__Service__Group__8__Impl
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
    // InternalAdaptDsl.g:3084:1: rule__Service__Group__8__Impl : ( '};' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3088:1: ( ( '};' ) )
            // InternalAdaptDsl.g:3089:1: ( '};' )
            {
            // InternalAdaptDsl.g:3089:1: ( '};' )
            // InternalAdaptDsl.g:3090:2: '};'
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
    // InternalAdaptDsl.g:3100:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3104:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalAdaptDsl.g:3105:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
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
    // InternalAdaptDsl.g:3112:1: rule__Functions__Group__0__Impl : ( ( rule__Functions__ThisAssignment_0 ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3116:1: ( ( ( rule__Functions__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:3117:1: ( ( rule__Functions__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3117:1: ( ( rule__Functions__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:3118:2: ( rule__Functions__ThisAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:3119:2: ( rule__Functions__ThisAssignment_0 )
            // InternalAdaptDsl.g:3119:3: rule__Functions__ThisAssignment_0
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
    // InternalAdaptDsl.g:3127:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3131:1: ( rule__Functions__Group__1__Impl )
            // InternalAdaptDsl.g:3132:2: rule__Functions__Group__1__Impl
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
    // InternalAdaptDsl.g:3138:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__NextAssignment_1 )? ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3142:1: ( ( ( rule__Functions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:3143:1: ( ( rule__Functions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:3143:1: ( ( rule__Functions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:3144:2: ( rule__Functions__NextAssignment_1 )?
            {
             before(grammarAccess.getFunctionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:3145:2: ( rule__Functions__NextAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptDsl.g:3145:3: rule__Functions__NextAssignment_1
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
    // InternalAdaptDsl.g:3154:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3158:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalAdaptDsl.g:3159:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:3166:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3170:1: ( ( 'function' ) )
            // InternalAdaptDsl.g:3171:1: ( 'function' )
            {
            // InternalAdaptDsl.g:3171:1: ( 'function' )
            // InternalAdaptDsl.g:3172:2: 'function'
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
    // InternalAdaptDsl.g:3181:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3185:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalAdaptDsl.g:3186:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalAdaptDsl.g:3193:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3197:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:3198:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3198:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalAdaptDsl.g:3199:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:3200:2: ( rule__Function__NameAssignment_1 )
            // InternalAdaptDsl.g:3200:3: rule__Function__NameAssignment_1
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
    // InternalAdaptDsl.g:3208:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3212:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalAdaptDsl.g:3213:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3220:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3224:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:3225:1: ( 'as' )
            {
            // InternalAdaptDsl.g:3225:1: ( 'as' )
            // InternalAdaptDsl.g:3226:2: 'as'
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
    // InternalAdaptDsl.g:3235:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3239:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalAdaptDsl.g:3240:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:3247:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3251:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalAdaptDsl.g:3252:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalAdaptDsl.g:3252:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalAdaptDsl.g:3253:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalAdaptDsl.g:3254:2: ( rule__Function__IdAssignment_3 )
            // InternalAdaptDsl.g:3254:3: rule__Function__IdAssignment_3
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
    // InternalAdaptDsl.g:3262:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3266:1: ( rule__Function__Group__4__Impl )
            // InternalAdaptDsl.g:3267:2: rule__Function__Group__4__Impl
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
    // InternalAdaptDsl.g:3273:1: rule__Function__Group__4__Impl : ( ';' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3277:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3278:1: ( ';' )
            {
            // InternalAdaptDsl.g:3278:1: ( ';' )
            // InternalAdaptDsl.g:3279:2: ';'
            {
             before(grammarAccess.getFunctionAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3289:1: rule__AdaptationRule__Group__0 : rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 ;
    public final void rule__AdaptationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3293:1: ( rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 )
            // InternalAdaptDsl.g:3294:2: rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:3301:1: rule__AdaptationRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AdaptationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3305:1: ( ( 'rule' ) )
            // InternalAdaptDsl.g:3306:1: ( 'rule' )
            {
            // InternalAdaptDsl.g:3306:1: ( 'rule' )
            // InternalAdaptDsl.g:3307:2: 'rule'
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
    // InternalAdaptDsl.g:3316:1: rule__AdaptationRule__Group__1 : rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 ;
    public final void rule__AdaptationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3320:1: ( rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 )
            // InternalAdaptDsl.g:3321:2: rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalAdaptDsl.g:3328:1: rule__AdaptationRule__Group__1__Impl : ( ( rule__AdaptationRule__NameAssignment_1 ) ) ;
    public final void rule__AdaptationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3332:1: ( ( ( rule__AdaptationRule__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:3333:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3333:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            // InternalAdaptDsl.g:3334:2: ( rule__AdaptationRule__NameAssignment_1 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:3335:2: ( rule__AdaptationRule__NameAssignment_1 )
            // InternalAdaptDsl.g:3335:3: rule__AdaptationRule__NameAssignment_1
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
    // InternalAdaptDsl.g:3343:1: rule__AdaptationRule__Group__2 : rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 ;
    public final void rule__AdaptationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3347:1: ( rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 )
            // InternalAdaptDsl.g:3348:2: rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3
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
    // InternalAdaptDsl.g:3355:1: rule__AdaptationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AdaptationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3359:1: ( ( '{' ) )
            // InternalAdaptDsl.g:3360:1: ( '{' )
            {
            // InternalAdaptDsl.g:3360:1: ( '{' )
            // InternalAdaptDsl.g:3361:2: '{'
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3370:1: rule__AdaptationRule__Group__3 : rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 ;
    public final void rule__AdaptationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3374:1: ( rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 )
            // InternalAdaptDsl.g:3375:2: rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:3382:1: rule__AdaptationRule__Group__3__Impl : ( 'FACT' ) ;
    public final void rule__AdaptationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3386:1: ( ( 'FACT' ) )
            // InternalAdaptDsl.g:3387:1: ( 'FACT' )
            {
            // InternalAdaptDsl.g:3387:1: ( 'FACT' )
            // InternalAdaptDsl.g:3388:2: 'FACT'
            {
             before(grammarAccess.getAdaptationRuleAccess().getFACTKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getFACTKeyword_3()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3397:1: rule__AdaptationRule__Group__4 : rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 ;
    public final void rule__AdaptationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3401:1: ( rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 )
            // InternalAdaptDsl.g:3402:2: rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:3409:1: rule__AdaptationRule__Group__4__Impl : ( ( rule__AdaptationRule__FactTypeAssignment_4 ) ) ;
    public final void rule__AdaptationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3413:1: ( ( ( rule__AdaptationRule__FactTypeAssignment_4 ) ) )
            // InternalAdaptDsl.g:3414:1: ( ( rule__AdaptationRule__FactTypeAssignment_4 ) )
            {
            // InternalAdaptDsl.g:3414:1: ( ( rule__AdaptationRule__FactTypeAssignment_4 ) )
            // InternalAdaptDsl.g:3415:2: ( rule__AdaptationRule__FactTypeAssignment_4 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_4()); 
            // InternalAdaptDsl.g:3416:2: ( rule__AdaptationRule__FactTypeAssignment_4 )
            // InternalAdaptDsl.g:3416:3: rule__AdaptationRule__FactTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__FactTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_4()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3424:1: rule__AdaptationRule__Group__5 : rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 ;
    public final void rule__AdaptationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3428:1: ( rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 )
            // InternalAdaptDsl.g:3429:2: rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:3436:1: rule__AdaptationRule__Group__5__Impl : ( ( rule__AdaptationRule__FactNameAssignment_5 ) ) ;
    public final void rule__AdaptationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3440:1: ( ( ( rule__AdaptationRule__FactNameAssignment_5 ) ) )
            // InternalAdaptDsl.g:3441:1: ( ( rule__AdaptationRule__FactNameAssignment_5 ) )
            {
            // InternalAdaptDsl.g:3441:1: ( ( rule__AdaptationRule__FactNameAssignment_5 ) )
            // InternalAdaptDsl.g:3442:2: ( rule__AdaptationRule__FactNameAssignment_5 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_5()); 
            // InternalAdaptDsl.g:3443:2: ( rule__AdaptationRule__FactNameAssignment_5 )
            // InternalAdaptDsl.g:3443:3: rule__AdaptationRule__FactNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__FactNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_5()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3451:1: rule__AdaptationRule__Group__6 : rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 ;
    public final void rule__AdaptationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3455:1: ( rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 )
            // InternalAdaptDsl.g:3456:2: rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalAdaptDsl.g:3463:1: rule__AdaptationRule__Group__6__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3467:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3468:1: ( ';' )
            {
            // InternalAdaptDsl.g:3468:1: ( ';' )
            // InternalAdaptDsl.g:3469:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_6()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3478:1: rule__AdaptationRule__Group__7 : rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 ;
    public final void rule__AdaptationRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3482:1: ( rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 )
            // InternalAdaptDsl.g:3483:2: rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:3490:1: rule__AdaptationRule__Group__7__Impl : ( 'IF' ) ;
    public final void rule__AdaptationRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3494:1: ( ( 'IF' ) )
            // InternalAdaptDsl.g:3495:1: ( 'IF' )
            {
            // InternalAdaptDsl.g:3495:1: ( 'IF' )
            // InternalAdaptDsl.g:3496:2: 'IF'
            {
             before(grammarAccess.getAdaptationRuleAccess().getIFKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getIFKeyword_7()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3505:1: rule__AdaptationRule__Group__8 : rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 ;
    public final void rule__AdaptationRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3509:1: ( rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 )
            // InternalAdaptDsl.g:3510:2: rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdaptDsl.g:3517:1: rule__AdaptationRule__Group__8__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3521:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3522:1: ( '(' )
            {
            // InternalAdaptDsl.g:3522:1: ( '(' )
            // InternalAdaptDsl.g:3523:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3532:1: rule__AdaptationRule__Group__9 : rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 ;
    public final void rule__AdaptationRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3536:1: ( rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 )
            // InternalAdaptDsl.g:3537:2: rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:3544:1: rule__AdaptationRule__Group__9__Impl : ( ( rule__AdaptationRule__ExprAssignment_9 ) ) ;
    public final void rule__AdaptationRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3548:1: ( ( ( rule__AdaptationRule__ExprAssignment_9 ) ) )
            // InternalAdaptDsl.g:3549:1: ( ( rule__AdaptationRule__ExprAssignment_9 ) )
            {
            // InternalAdaptDsl.g:3549:1: ( ( rule__AdaptationRule__ExprAssignment_9 ) )
            // InternalAdaptDsl.g:3550:2: ( rule__AdaptationRule__ExprAssignment_9 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprAssignment_9()); 
            // InternalAdaptDsl.g:3551:2: ( rule__AdaptationRule__ExprAssignment_9 )
            // InternalAdaptDsl.g:3551:3: rule__AdaptationRule__ExprAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__ExprAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getExprAssignment_9()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3559:1: rule__AdaptationRule__Group__10 : rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 ;
    public final void rule__AdaptationRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3563:1: ( rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 )
            // InternalAdaptDsl.g:3564:2: rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11
            {
            pushFollow(FOLLOW_26);
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
    // InternalAdaptDsl.g:3571:1: rule__AdaptationRule__Group__10__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3575:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3576:1: ( ')' )
            {
            // InternalAdaptDsl.g:3576:1: ( ')' )
            // InternalAdaptDsl.g:3577:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_10()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3586:1: rule__AdaptationRule__Group__11 : rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 ;
    public final void rule__AdaptationRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3590:1: ( rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 )
            // InternalAdaptDsl.g:3591:2: rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:3598:1: rule__AdaptationRule__Group__11__Impl : ( 'THEN' ) ;
    public final void rule__AdaptationRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3602:1: ( ( 'THEN' ) )
            // InternalAdaptDsl.g:3603:1: ( 'THEN' )
            {
            // InternalAdaptDsl.g:3603:1: ( 'THEN' )
            // InternalAdaptDsl.g:3604:2: 'THEN'
            {
             before(grammarAccess.getAdaptationRuleAccess().getTHENKeyword_11()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getTHENKeyword_11()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3613:1: rule__AdaptationRule__Group__12 : rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 ;
    public final void rule__AdaptationRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3617:1: ( rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 )
            // InternalAdaptDsl.g:3618:2: rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdaptDsl.g:3625:1: rule__AdaptationRule__Group__12__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3629:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3630:1: ( '(' )
            {
            // InternalAdaptDsl.g:3630:1: ( '(' )
            // InternalAdaptDsl.g:3631:2: '('
            {
             before(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_12()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_12()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3640:1: rule__AdaptationRule__Group__13 : rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 ;
    public final void rule__AdaptationRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3644:1: ( rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 )
            // InternalAdaptDsl.g:3645:2: rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:3652:1: rule__AdaptationRule__Group__13__Impl : ( ( rule__AdaptationRule__ActionCollectionAssignment_13 ) ) ;
    public final void rule__AdaptationRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3656:1: ( ( ( rule__AdaptationRule__ActionCollectionAssignment_13 ) ) )
            // InternalAdaptDsl.g:3657:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_13 ) )
            {
            // InternalAdaptDsl.g:3657:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_13 ) )
            // InternalAdaptDsl.g:3658:2: ( rule__AdaptationRule__ActionCollectionAssignment_13 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_13()); 
            // InternalAdaptDsl.g:3659:2: ( rule__AdaptationRule__ActionCollectionAssignment_13 )
            // InternalAdaptDsl.g:3659:3: rule__AdaptationRule__ActionCollectionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__ActionCollectionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_13()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3667:1: rule__AdaptationRule__Group__14 : rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 ;
    public final void rule__AdaptationRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3671:1: ( rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 )
            // InternalAdaptDsl.g:3672:2: rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:3679:1: rule__AdaptationRule__Group__14__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3683:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3684:1: ( ')' )
            {
            // InternalAdaptDsl.g:3684:1: ( ')' )
            // InternalAdaptDsl.g:3685:2: ')'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_14()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_14()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3694:1: rule__AdaptationRule__Group__15 : rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 ;
    public final void rule__AdaptationRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3698:1: ( rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 )
            // InternalAdaptDsl.g:3699:2: rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16
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
    // InternalAdaptDsl.g:3706:1: rule__AdaptationRule__Group__15__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3710:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3711:1: ( ';' )
            {
            // InternalAdaptDsl.g:3711:1: ( ';' )
            // InternalAdaptDsl.g:3712:2: ';'
            {
             before(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_15()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:3721:1: rule__AdaptationRule__Group__16 : rule__AdaptationRule__Group__16__Impl ;
    public final void rule__AdaptationRule__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3725:1: ( rule__AdaptationRule__Group__16__Impl )
            // InternalAdaptDsl.g:3726:2: rule__AdaptationRule__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdaptationRule__Group__16__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptDsl.g:3732:1: rule__AdaptationRule__Group__16__Impl : ( '}' ) ;
    public final void rule__AdaptationRule__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3736:1: ( ( '}' ) )
            // InternalAdaptDsl.g:3737:1: ( '}' )
            {
            // InternalAdaptDsl.g:3737:1: ( '}' )
            // InternalAdaptDsl.g:3738:2: '}'
            {
             before(grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_16()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
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


    // $ANTLR start "rule__ConditionalOR__Group__0"
    // InternalAdaptDsl.g:3748:1: rule__ConditionalOR__Group__0 : rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 ;
    public final void rule__ConditionalOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3752:1: ( rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 )
            // InternalAdaptDsl.g:3753:2: rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1
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
    // InternalAdaptDsl.g:3760:1: rule__ConditionalOR__Group__0__Impl : ( ( rule__ConditionalOR__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3764:1: ( ( ( rule__ConditionalOR__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:3765:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3765:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:3766:2: ( rule__ConditionalOR__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalORAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:3767:2: ( rule__ConditionalOR__LeftAssignment_0 )
            // InternalAdaptDsl.g:3767:3: rule__ConditionalOR__LeftAssignment_0
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
    // InternalAdaptDsl.g:3775:1: rule__ConditionalOR__Group__1 : rule__ConditionalOR__Group__1__Impl ;
    public final void rule__ConditionalOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3779:1: ( rule__ConditionalOR__Group__1__Impl )
            // InternalAdaptDsl.g:3780:2: rule__ConditionalOR__Group__1__Impl
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
    // InternalAdaptDsl.g:3786:1: rule__ConditionalOR__Group__1__Impl : ( ( rule__ConditionalOR__Group_1__0 )? ) ;
    public final void rule__ConditionalOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3790:1: ( ( ( rule__ConditionalOR__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3791:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3791:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            // InternalAdaptDsl.g:3792:2: ( rule__ConditionalOR__Group_1__0 )?
            {
             before(grammarAccess.getConditionalORAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3793:2: ( rule__ConditionalOR__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:3793:3: rule__ConditionalOR__Group_1__0
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
    // InternalAdaptDsl.g:3802:1: rule__ConditionalOR__Group_1__0 : rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 ;
    public final void rule__ConditionalOR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3806:1: ( rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 )
            // InternalAdaptDsl.g:3807:2: rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdaptDsl.g:3814:1: rule__ConditionalOR__Group_1__0__Impl : ( '||' ) ;
    public final void rule__ConditionalOR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3818:1: ( ( '||' ) )
            // InternalAdaptDsl.g:3819:1: ( '||' )
            {
            // InternalAdaptDsl.g:3819:1: ( '||' )
            // InternalAdaptDsl.g:3820:2: '||'
            {
             before(grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3829:1: rule__ConditionalOR__Group_1__1 : rule__ConditionalOR__Group_1__1__Impl ;
    public final void rule__ConditionalOR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3833:1: ( rule__ConditionalOR__Group_1__1__Impl )
            // InternalAdaptDsl.g:3834:2: rule__ConditionalOR__Group_1__1__Impl
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
    // InternalAdaptDsl.g:3840:1: rule__ConditionalOR__Group_1__1__Impl : ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalOR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3844:1: ( ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3845:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3845:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3846:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalORAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3847:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3847:3: rule__ConditionalOR__RightAssignment_1_1
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
    // InternalAdaptDsl.g:3856:1: rule__ConditionalAND__Group__0 : rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 ;
    public final void rule__ConditionalAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3860:1: ( rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 )
            // InternalAdaptDsl.g:3861:2: rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1
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
    // InternalAdaptDsl.g:3868:1: rule__ConditionalAND__Group__0__Impl : ( ( rule__ConditionalAND__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3872:1: ( ( ( rule__ConditionalAND__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:3873:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3873:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:3874:2: ( rule__ConditionalAND__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalANDAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:3875:2: ( rule__ConditionalAND__LeftAssignment_0 )
            // InternalAdaptDsl.g:3875:3: rule__ConditionalAND__LeftAssignment_0
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
    // InternalAdaptDsl.g:3883:1: rule__ConditionalAND__Group__1 : rule__ConditionalAND__Group__1__Impl ;
    public final void rule__ConditionalAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3887:1: ( rule__ConditionalAND__Group__1__Impl )
            // InternalAdaptDsl.g:3888:2: rule__ConditionalAND__Group__1__Impl
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
    // InternalAdaptDsl.g:3894:1: rule__ConditionalAND__Group__1__Impl : ( ( rule__ConditionalAND__Group_1__0 )? ) ;
    public final void rule__ConditionalAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3898:1: ( ( ( rule__ConditionalAND__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3899:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3899:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            // InternalAdaptDsl.g:3900:2: ( rule__ConditionalAND__Group_1__0 )?
            {
             before(grammarAccess.getConditionalANDAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3901:2: ( rule__ConditionalAND__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAdaptDsl.g:3901:3: rule__ConditionalAND__Group_1__0
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
    // InternalAdaptDsl.g:3910:1: rule__ConditionalAND__Group_1__0 : rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 ;
    public final void rule__ConditionalAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3914:1: ( rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 )
            // InternalAdaptDsl.g:3915:2: rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAdaptDsl.g:3922:1: rule__ConditionalAND__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__ConditionalAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3926:1: ( ( '&&' ) )
            // InternalAdaptDsl.g:3927:1: ( '&&' )
            {
            // InternalAdaptDsl.g:3927:1: ( '&&' )
            // InternalAdaptDsl.g:3928:2: '&&'
            {
             before(grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalAdaptDsl.g:3937:1: rule__ConditionalAND__Group_1__1 : rule__ConditionalAND__Group_1__1__Impl ;
    public final void rule__ConditionalAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3941:1: ( rule__ConditionalAND__Group_1__1__Impl )
            // InternalAdaptDsl.g:3942:2: rule__ConditionalAND__Group_1__1__Impl
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
    // InternalAdaptDsl.g:3948:1: rule__ConditionalAND__Group_1__1__Impl : ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3952:1: ( ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3953:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3953:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3954:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalANDAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3955:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3955:3: rule__ConditionalAND__RightAssignment_1_1
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
    // InternalAdaptDsl.g:3964:1: rule__BooleanCondition__Group_0__0 : rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 ;
    public final void rule__BooleanCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3968:1: ( rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 )
            // InternalAdaptDsl.g:3969:2: rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1
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
    // InternalAdaptDsl.g:3976:1: rule__BooleanCondition__Group_0__0__Impl : ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) ;
    public final void rule__BooleanCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3980:1: ( ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) )
            // InternalAdaptDsl.g:3981:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            {
            // InternalAdaptDsl.g:3981:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            // InternalAdaptDsl.g:3982:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getFactAssignment_0_0()); 
            // InternalAdaptDsl.g:3983:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            // InternalAdaptDsl.g:3983:3: rule__BooleanCondition__FactAssignment_0_0
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
    // InternalAdaptDsl.g:3991:1: rule__BooleanCondition__Group_0__1 : rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 ;
    public final void rule__BooleanCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3995:1: ( rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 )
            // InternalAdaptDsl.g:3996:2: rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2
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
    // InternalAdaptDsl.g:4003:1: rule__BooleanCondition__Group_0__1__Impl : ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) ;
    public final void rule__BooleanCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4007:1: ( ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) )
            // InternalAdaptDsl.g:4008:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            {
            // InternalAdaptDsl.g:4008:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            // InternalAdaptDsl.g:4009:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getBooleanConditionAccess().getOpAssignment_0_1()); 
            // InternalAdaptDsl.g:4010:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            // InternalAdaptDsl.g:4010:3: rule__BooleanCondition__OpAssignment_0_1
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
    // InternalAdaptDsl.g:4018:1: rule__BooleanCondition__Group_0__2 : rule__BooleanCondition__Group_0__2__Impl ;
    public final void rule__BooleanCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4022:1: ( rule__BooleanCondition__Group_0__2__Impl )
            // InternalAdaptDsl.g:4023:2: rule__BooleanCondition__Group_0__2__Impl
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
    // InternalAdaptDsl.g:4029:1: rule__BooleanCondition__Group_0__2__Impl : ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) ;
    public final void rule__BooleanCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4033:1: ( ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) )
            // InternalAdaptDsl.g:4034:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            {
            // InternalAdaptDsl.g:4034:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            // InternalAdaptDsl.g:4035:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            {
             before(grammarAccess.getBooleanConditionAccess().getValAssignment_0_2()); 
            // InternalAdaptDsl.g:4036:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            // InternalAdaptDsl.g:4036:3: rule__BooleanCondition__ValAssignment_0_2
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
    // InternalAdaptDsl.g:4045:1: rule__NumberCondition__Group__0 : rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 ;
    public final void rule__NumberCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4049:1: ( rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 )
            // InternalAdaptDsl.g:4050:2: rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1
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
    // InternalAdaptDsl.g:4057:1: rule__NumberCondition__Group__0__Impl : ( ( rule__NumberCondition__FactAssignment_0 ) ) ;
    public final void rule__NumberCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4061:1: ( ( ( rule__NumberCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:4062:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:4062:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:4063:2: ( rule__NumberCondition__FactAssignment_0 )
            {
             before(grammarAccess.getNumberConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:4064:2: ( rule__NumberCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:4064:3: rule__NumberCondition__FactAssignment_0
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
    // InternalAdaptDsl.g:4072:1: rule__NumberCondition__Group__1 : rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 ;
    public final void rule__NumberCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4076:1: ( rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 )
            // InternalAdaptDsl.g:4077:2: rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptDsl.g:4084:1: rule__NumberCondition__Group__1__Impl : ( ( rule__NumberCondition__OpAssignment_1 ) ) ;
    public final void rule__NumberCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4088:1: ( ( ( rule__NumberCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:4089:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:4089:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:4090:2: ( rule__NumberCondition__OpAssignment_1 )
            {
             before(grammarAccess.getNumberConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:4091:2: ( rule__NumberCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:4091:3: rule__NumberCondition__OpAssignment_1
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
    // InternalAdaptDsl.g:4099:1: rule__NumberCondition__Group__2 : rule__NumberCondition__Group__2__Impl ;
    public final void rule__NumberCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4103:1: ( rule__NumberCondition__Group__2__Impl )
            // InternalAdaptDsl.g:4104:2: rule__NumberCondition__Group__2__Impl
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
    // InternalAdaptDsl.g:4110:1: rule__NumberCondition__Group__2__Impl : ( ( rule__NumberCondition__ValAssignment_2 ) ) ;
    public final void rule__NumberCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4114:1: ( ( ( rule__NumberCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:4115:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4115:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:4116:2: ( rule__NumberCondition__ValAssignment_2 )
            {
             before(grammarAccess.getNumberConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:4117:2: ( rule__NumberCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:4117:3: rule__NumberCondition__ValAssignment_2
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
    // InternalAdaptDsl.g:4126:1: rule__StringCondition__Group__0 : rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 ;
    public final void rule__StringCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4130:1: ( rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 )
            // InternalAdaptDsl.g:4131:2: rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1
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
    // InternalAdaptDsl.g:4138:1: rule__StringCondition__Group__0__Impl : ( ( rule__StringCondition__FactAssignment_0 ) ) ;
    public final void rule__StringCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4142:1: ( ( ( rule__StringCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:4143:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:4143:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:4144:2: ( rule__StringCondition__FactAssignment_0 )
            {
             before(grammarAccess.getStringConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:4145:2: ( rule__StringCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:4145:3: rule__StringCondition__FactAssignment_0
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
    // InternalAdaptDsl.g:4153:1: rule__StringCondition__Group__1 : rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 ;
    public final void rule__StringCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4157:1: ( rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 )
            // InternalAdaptDsl.g:4158:2: rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:4165:1: rule__StringCondition__Group__1__Impl : ( ( rule__StringCondition__OpAssignment_1 ) ) ;
    public final void rule__StringCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4169:1: ( ( ( rule__StringCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:4170:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:4170:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:4171:2: ( rule__StringCondition__OpAssignment_1 )
            {
             before(grammarAccess.getStringConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:4172:2: ( rule__StringCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:4172:3: rule__StringCondition__OpAssignment_1
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
    // InternalAdaptDsl.g:4180:1: rule__StringCondition__Group__2 : rule__StringCondition__Group__2__Impl ;
    public final void rule__StringCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4184:1: ( rule__StringCondition__Group__2__Impl )
            // InternalAdaptDsl.g:4185:2: rule__StringCondition__Group__2__Impl
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
    // InternalAdaptDsl.g:4191:1: rule__StringCondition__Group__2__Impl : ( ( rule__StringCondition__ValAssignment_2 ) ) ;
    public final void rule__StringCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4195:1: ( ( ( rule__StringCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:4196:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4196:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:4197:2: ( rule__StringCondition__ValAssignment_2 )
            {
             before(grammarAccess.getStringConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:4198:2: ( rule__StringCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:4198:3: rule__StringCondition__ValAssignment_2
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
    // InternalAdaptDsl.g:4207:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4211:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalAdaptDsl.g:4212:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
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
    // InternalAdaptDsl.g:4219:1: rule__Fact__Group__0__Impl : ( 'M' ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4223:1: ( ( 'M' ) )
            // InternalAdaptDsl.g:4224:1: ( 'M' )
            {
            // InternalAdaptDsl.g:4224:1: ( 'M' )
            // InternalAdaptDsl.g:4225:2: 'M'
            {
             before(grammarAccess.getFactAccess().getMKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getMKeyword_0()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:4234:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4238:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // InternalAdaptDsl.g:4239:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:4246:1: rule__Fact__Group__1__Impl : ( '.get' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4250:1: ( ( '.get' ) )
            // InternalAdaptDsl.g:4251:1: ( '.get' )
            {
            // InternalAdaptDsl.g:4251:1: ( '.get' )
            // InternalAdaptDsl.g:4252:2: '.get'
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
    // InternalAdaptDsl.g:4261:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl rule__Fact__Group__3 ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4265:1: ( rule__Fact__Group__2__Impl rule__Fact__Group__3 )
            // InternalAdaptDsl.g:4266:2: rule__Fact__Group__2__Impl rule__Fact__Group__3
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
    // InternalAdaptDsl.g:4273:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__EntityAssignment_2 ) ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4277:1: ( ( ( rule__Fact__EntityAssignment_2 ) ) )
            // InternalAdaptDsl.g:4278:1: ( ( rule__Fact__EntityAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4278:1: ( ( rule__Fact__EntityAssignment_2 ) )
            // InternalAdaptDsl.g:4279:2: ( rule__Fact__EntityAssignment_2 )
            {
             before(grammarAccess.getFactAccess().getEntityAssignment_2()); 
            // InternalAdaptDsl.g:4280:2: ( rule__Fact__EntityAssignment_2 )
            // InternalAdaptDsl.g:4280:3: rule__Fact__EntityAssignment_2
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
    // InternalAdaptDsl.g:4288:1: rule__Fact__Group__3 : rule__Fact__Group__3__Impl rule__Fact__Group__4 ;
    public final void rule__Fact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4292:1: ( rule__Fact__Group__3__Impl rule__Fact__Group__4 )
            // InternalAdaptDsl.g:4293:2: rule__Fact__Group__3__Impl rule__Fact__Group__4
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
    // InternalAdaptDsl.g:4300:1: rule__Fact__Group__3__Impl : ( '()' ) ;
    public final void rule__Fact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4304:1: ( ( '()' ) )
            // InternalAdaptDsl.g:4305:1: ( '()' )
            {
            // InternalAdaptDsl.g:4305:1: ( '()' )
            // InternalAdaptDsl.g:4306:2: '()'
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
    // InternalAdaptDsl.g:4315:1: rule__Fact__Group__4 : rule__Fact__Group__4__Impl rule__Fact__Group__5 ;
    public final void rule__Fact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4319:1: ( rule__Fact__Group__4__Impl rule__Fact__Group__5 )
            // InternalAdaptDsl.g:4320:2: rule__Fact__Group__4__Impl rule__Fact__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:4327:1: rule__Fact__Group__4__Impl : ( '.get' ) ;
    public final void rule__Fact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4331:1: ( ( '.get' ) )
            // InternalAdaptDsl.g:4332:1: ( '.get' )
            {
            // InternalAdaptDsl.g:4332:1: ( '.get' )
            // InternalAdaptDsl.g:4333:2: '.get'
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
    // InternalAdaptDsl.g:4342:1: rule__Fact__Group__5 : rule__Fact__Group__5__Impl rule__Fact__Group__6 ;
    public final void rule__Fact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4346:1: ( rule__Fact__Group__5__Impl rule__Fact__Group__6 )
            // InternalAdaptDsl.g:4347:2: rule__Fact__Group__5__Impl rule__Fact__Group__6
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
    // InternalAdaptDsl.g:4354:1: rule__Fact__Group__5__Impl : ( ( rule__Fact__PropertyNameAssignment_5 ) ) ;
    public final void rule__Fact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4358:1: ( ( ( rule__Fact__PropertyNameAssignment_5 ) ) )
            // InternalAdaptDsl.g:4359:1: ( ( rule__Fact__PropertyNameAssignment_5 ) )
            {
            // InternalAdaptDsl.g:4359:1: ( ( rule__Fact__PropertyNameAssignment_5 ) )
            // InternalAdaptDsl.g:4360:2: ( rule__Fact__PropertyNameAssignment_5 )
            {
             before(grammarAccess.getFactAccess().getPropertyNameAssignment_5()); 
            // InternalAdaptDsl.g:4361:2: ( rule__Fact__PropertyNameAssignment_5 )
            // InternalAdaptDsl.g:4361:3: rule__Fact__PropertyNameAssignment_5
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
    // InternalAdaptDsl.g:4369:1: rule__Fact__Group__6 : rule__Fact__Group__6__Impl ;
    public final void rule__Fact__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4373:1: ( rule__Fact__Group__6__Impl )
            // InternalAdaptDsl.g:4374:2: rule__Fact__Group__6__Impl
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
    // InternalAdaptDsl.g:4380:1: rule__Fact__Group__6__Impl : ( '()' ) ;
    public final void rule__Fact__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4384:1: ( ( '()' ) )
            // InternalAdaptDsl.g:4385:1: ( '()' )
            {
            // InternalAdaptDsl.g:4385:1: ( '()' )
            // InternalAdaptDsl.g:4386:2: '()'
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
    // InternalAdaptDsl.g:4396:1: rule__FactProperty__Group__0 : rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 ;
    public final void rule__FactProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4400:1: ( rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 )
            // InternalAdaptDsl.g:4401:2: rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4408:1: rule__FactProperty__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4412:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4413:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4413:1: ( RULE_ID )
            // InternalAdaptDsl.g:4414:2: RULE_ID
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
    // InternalAdaptDsl.g:4423:1: rule__FactProperty__Group__1 : rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 ;
    public final void rule__FactProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4427:1: ( rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 )
            // InternalAdaptDsl.g:4428:2: rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4435:1: rule__FactProperty__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4439:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4440:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4440:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4441:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:4442:2: ( '()' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptDsl.g:4442:3: '()'
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
    // InternalAdaptDsl.g:4450:1: rule__FactProperty__Group__2 : rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 ;
    public final void rule__FactProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4454:1: ( rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 )
            // InternalAdaptDsl.g:4455:2: rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4462:1: rule__FactProperty__Group__2__Impl : ( ( rule__FactProperty__Group_2__0 )* ) ;
    public final void rule__FactProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4466:1: ( ( ( rule__FactProperty__Group_2__0 )* ) )
            // InternalAdaptDsl.g:4467:1: ( ( rule__FactProperty__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:4467:1: ( ( rule__FactProperty__Group_2__0 )* )
            // InternalAdaptDsl.g:4468:2: ( rule__FactProperty__Group_2__0 )*
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_2()); 
            // InternalAdaptDsl.g:4469:2: ( rule__FactProperty__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID) ) {
                        int LA27_2 = input.LA(3);

                        if ( ((LA27_2>=42 && LA27_2<=43)) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalAdaptDsl.g:4469:3: rule__FactProperty__Group_2__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FactProperty__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAdaptDsl.g:4477:1: rule__FactProperty__Group__3 : rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 ;
    public final void rule__FactProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4481:1: ( rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 )
            // InternalAdaptDsl.g:4482:2: rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:4489:1: rule__FactProperty__Group__3__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4493:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4494:1: ( '.' )
            {
            // InternalAdaptDsl.g:4494:1: ( '.' )
            // InternalAdaptDsl.g:4495:2: '.'
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
    // InternalAdaptDsl.g:4504:1: rule__FactProperty__Group__4 : rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 ;
    public final void rule__FactProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4508:1: ( rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 )
            // InternalAdaptDsl.g:4509:2: rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:4516:1: rule__FactProperty__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4520:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4521:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4521:1: ( RULE_ID )
            // InternalAdaptDsl.g:4522:2: RULE_ID
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
    // InternalAdaptDsl.g:4531:1: rule__FactProperty__Group__5 : rule__FactProperty__Group__5__Impl ;
    public final void rule__FactProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4535:1: ( rule__FactProperty__Group__5__Impl )
            // InternalAdaptDsl.g:4536:2: rule__FactProperty__Group__5__Impl
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
    // InternalAdaptDsl.g:4542:1: rule__FactProperty__Group__5__Impl : ( ( rule__FactProperty__Group_5__0 )? ) ;
    public final void rule__FactProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4546:1: ( ( ( rule__FactProperty__Group_5__0 )? ) )
            // InternalAdaptDsl.g:4547:1: ( ( rule__FactProperty__Group_5__0 )? )
            {
            // InternalAdaptDsl.g:4547:1: ( ( rule__FactProperty__Group_5__0 )? )
            // InternalAdaptDsl.g:4548:2: ( rule__FactProperty__Group_5__0 )?
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_5()); 
            // InternalAdaptDsl.g:4549:2: ( rule__FactProperty__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAdaptDsl.g:4549:3: rule__FactProperty__Group_5__0
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
    // InternalAdaptDsl.g:4558:1: rule__FactProperty__Group_2__0 : rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 ;
    public final void rule__FactProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4562:1: ( rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 )
            // InternalAdaptDsl.g:4563:2: rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:4570:1: rule__FactProperty__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4574:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4575:1: ( '.' )
            {
            // InternalAdaptDsl.g:4575:1: ( '.' )
            // InternalAdaptDsl.g:4576:2: '.'
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
    // InternalAdaptDsl.g:4585:1: rule__FactProperty__Group_2__1 : rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 ;
    public final void rule__FactProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4589:1: ( rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 )
            // InternalAdaptDsl.g:4590:2: rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2
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
    // InternalAdaptDsl.g:4597:1: rule__FactProperty__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4601:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4602:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4602:1: ( RULE_ID )
            // InternalAdaptDsl.g:4603:2: RULE_ID
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
    // InternalAdaptDsl.g:4612:1: rule__FactProperty__Group_2__2 : rule__FactProperty__Group_2__2__Impl ;
    public final void rule__FactProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4616:1: ( rule__FactProperty__Group_2__2__Impl )
            // InternalAdaptDsl.g:4617:2: rule__FactProperty__Group_2__2__Impl
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
    // InternalAdaptDsl.g:4623:1: rule__FactProperty__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4627:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4628:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4628:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4629:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:4630:2: ( '()' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdaptDsl.g:4630:3: '()'
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
    // InternalAdaptDsl.g:4639:1: rule__FactProperty__Group_5__0 : rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 ;
    public final void rule__FactProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4643:1: ( rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 )
            // InternalAdaptDsl.g:4644:2: rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptDsl.g:4651:1: rule__FactProperty__Group_5__0__Impl : ( '(' ) ;
    public final void rule__FactProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4655:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4656:1: ( '(' )
            {
            // InternalAdaptDsl.g:4656:1: ( '(' )
            // InternalAdaptDsl.g:4657:2: '('
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4666:1: rule__FactProperty__Group_5__1 : rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 ;
    public final void rule__FactProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4670:1: ( rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 )
            // InternalAdaptDsl.g:4671:2: rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:4678:1: rule__FactProperty__Group_5__1__Impl : ( ruleValue ) ;
    public final void rule__FactProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4682:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:4683:1: ( ruleValue )
            {
            // InternalAdaptDsl.g:4683:1: ( ruleValue )
            // InternalAdaptDsl.g:4684:2: ruleValue
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
    // InternalAdaptDsl.g:4693:1: rule__FactProperty__Group_5__2 : rule__FactProperty__Group_5__2__Impl ;
    public final void rule__FactProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4697:1: ( rule__FactProperty__Group_5__2__Impl )
            // InternalAdaptDsl.g:4698:2: rule__FactProperty__Group_5__2__Impl
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
    // InternalAdaptDsl.g:4704:1: rule__FactProperty__Group_5__2__Impl : ( ')' ) ;
    public final void rule__FactProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4708:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4709:1: ( ')' )
            {
            // InternalAdaptDsl.g:4709:1: ( ')' )
            // InternalAdaptDsl.g:4710:2: ')'
            {
             before(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4720:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4724:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalAdaptDsl.g:4725:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAdaptDsl.g:4732:1: rule__Actions__Group__0__Impl : ( ( rule__Actions__ActionAssignment_0 ) ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4736:1: ( ( ( rule__Actions__ActionAssignment_0 ) ) )
            // InternalAdaptDsl.g:4737:1: ( ( rule__Actions__ActionAssignment_0 ) )
            {
            // InternalAdaptDsl.g:4737:1: ( ( rule__Actions__ActionAssignment_0 ) )
            // InternalAdaptDsl.g:4738:2: ( rule__Actions__ActionAssignment_0 )
            {
             before(grammarAccess.getActionsAccess().getActionAssignment_0()); 
            // InternalAdaptDsl.g:4739:2: ( rule__Actions__ActionAssignment_0 )
            // InternalAdaptDsl.g:4739:3: rule__Actions__ActionAssignment_0
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
    // InternalAdaptDsl.g:4747:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4751:1: ( rule__Actions__Group__1__Impl )
            // InternalAdaptDsl.g:4752:2: rule__Actions__Group__1__Impl
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
    // InternalAdaptDsl.g:4758:1: rule__Actions__Group__1__Impl : ( ( rule__Actions__NextAssignment_1 )? ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4762:1: ( ( ( rule__Actions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:4763:1: ( ( rule__Actions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:4763:1: ( ( rule__Actions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:4764:2: ( rule__Actions__NextAssignment_1 )?
            {
             before(grammarAccess.getActionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:4765:2: ( rule__Actions__NextAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44||(LA30_0>=46 && LA30_0<=60)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdaptDsl.g:4765:3: rule__Actions__NextAssignment_1
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
    // InternalAdaptDsl.g:4774:1: rule__ServiceFunctionCallOperation__Group__0 : rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 ;
    public final void rule__ServiceFunctionCallOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4778:1: ( rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 )
            // InternalAdaptDsl.g:4779:2: rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:4786:1: rule__ServiceFunctionCallOperation__Group__0__Impl : ( 'functionCall' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4790:1: ( ( 'functionCall' ) )
            // InternalAdaptDsl.g:4791:1: ( 'functionCall' )
            {
            // InternalAdaptDsl.g:4791:1: ( 'functionCall' )
            // InternalAdaptDsl.g:4792:2: 'functionCall'
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
    // InternalAdaptDsl.g:4801:1: rule__ServiceFunctionCallOperation__Group__1 : rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 ;
    public final void rule__ServiceFunctionCallOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4805:1: ( rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 )
            // InternalAdaptDsl.g:4806:2: rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:4813:1: rule__ServiceFunctionCallOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4817:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4818:1: ( '(' )
            {
            // InternalAdaptDsl.g:4818:1: ( '(' )
            // InternalAdaptDsl.g:4819:2: '('
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4828:1: rule__ServiceFunctionCallOperation__Group__2 : rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 ;
    public final void rule__ServiceFunctionCallOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4832:1: ( rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 )
            // InternalAdaptDsl.g:4833:2: rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:4840:1: rule__ServiceFunctionCallOperation__Group__2__Impl : ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4844:1: ( ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) )
            // InternalAdaptDsl.g:4845:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4845:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            // InternalAdaptDsl.g:4846:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getServiceAssignment_2()); 
            // InternalAdaptDsl.g:4847:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            // InternalAdaptDsl.g:4847:3: rule__ServiceFunctionCallOperation__ServiceAssignment_2
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
    // InternalAdaptDsl.g:4855:1: rule__ServiceFunctionCallOperation__Group__3 : rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 ;
    public final void rule__ServiceFunctionCallOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4859:1: ( rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 )
            // InternalAdaptDsl.g:4860:2: rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:4867:1: rule__ServiceFunctionCallOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4871:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4872:1: ( ',' )
            {
            // InternalAdaptDsl.g:4872:1: ( ',' )
            // InternalAdaptDsl.g:4873:2: ','
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
    // InternalAdaptDsl.g:4882:1: rule__ServiceFunctionCallOperation__Group__4 : rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 ;
    public final void rule__ServiceFunctionCallOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4886:1: ( rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 )
            // InternalAdaptDsl.g:4887:2: rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:4894:1: rule__ServiceFunctionCallOperation__Group__4__Impl : ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4898:1: ( ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) )
            // InternalAdaptDsl.g:4899:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4899:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            // InternalAdaptDsl.g:4900:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionAssignment_4()); 
            // InternalAdaptDsl.g:4901:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            // InternalAdaptDsl.g:4901:3: rule__ServiceFunctionCallOperation__FunctionAssignment_4
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
    // InternalAdaptDsl.g:4909:1: rule__ServiceFunctionCallOperation__Group__5 : rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 ;
    public final void rule__ServiceFunctionCallOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4913:1: ( rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 )
            // InternalAdaptDsl.g:4914:2: rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptDsl.g:4921:1: rule__ServiceFunctionCallOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4925:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4926:1: ( ',' )
            {
            // InternalAdaptDsl.g:4926:1: ( ',' )
            // InternalAdaptDsl.g:4927:2: ','
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
    // InternalAdaptDsl.g:4936:1: rule__ServiceFunctionCallOperation__Group__6 : rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 ;
    public final void rule__ServiceFunctionCallOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4940:1: ( rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 )
            // InternalAdaptDsl.g:4941:2: rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:4948:1: rule__ServiceFunctionCallOperation__Group__6__Impl : ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4952:1: ( ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) )
            // InternalAdaptDsl.g:4953:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            {
            // InternalAdaptDsl.g:4953:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            // InternalAdaptDsl.g:4954:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getValAssignment_6()); 
            // InternalAdaptDsl.g:4955:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            // InternalAdaptDsl.g:4955:3: rule__ServiceFunctionCallOperation__ValAssignment_6
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
    // InternalAdaptDsl.g:4963:1: rule__ServiceFunctionCallOperation__Group__7 : rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 ;
    public final void rule__ServiceFunctionCallOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4967:1: ( rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 )
            // InternalAdaptDsl.g:4968:2: rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:4975:1: rule__ServiceFunctionCallOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4979:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4980:1: ( ')' )
            {
            // InternalAdaptDsl.g:4980:1: ( ')' )
            // InternalAdaptDsl.g:4981:2: ')'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4990:1: rule__ServiceFunctionCallOperation__Group__8 : rule__ServiceFunctionCallOperation__Group__8__Impl ;
    public final void rule__ServiceFunctionCallOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4994:1: ( rule__ServiceFunctionCallOperation__Group__8__Impl )
            // InternalAdaptDsl.g:4995:2: rule__ServiceFunctionCallOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:5001:1: rule__ServiceFunctionCallOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5005:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5006:1: ( ';' )
            {
            // InternalAdaptDsl.g:5006:1: ( ';' )
            // InternalAdaptDsl.g:5007:2: ';'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5017:1: rule__EditFactOperation__Group__0 : rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 ;
    public final void rule__EditFactOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5021:1: ( rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 )
            // InternalAdaptDsl.g:5022:2: rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:5029:1: rule__EditFactOperation__Group__0__Impl : ( 'editFact' ) ;
    public final void rule__EditFactOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5033:1: ( ( 'editFact' ) )
            // InternalAdaptDsl.g:5034:1: ( 'editFact' )
            {
            // InternalAdaptDsl.g:5034:1: ( 'editFact' )
            // InternalAdaptDsl.g:5035:2: 'editFact'
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
    // InternalAdaptDsl.g:5044:1: rule__EditFactOperation__Group__1 : rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 ;
    public final void rule__EditFactOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5048:1: ( rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 )
            // InternalAdaptDsl.g:5049:2: rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:5056:1: rule__EditFactOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EditFactOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5060:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5061:1: ( '(' )
            {
            // InternalAdaptDsl.g:5061:1: ( '(' )
            // InternalAdaptDsl.g:5062:2: '('
            {
             before(grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5071:1: rule__EditFactOperation__Group__2 : rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 ;
    public final void rule__EditFactOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5075:1: ( rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 )
            // InternalAdaptDsl.g:5076:2: rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdaptDsl.g:5083:1: rule__EditFactOperation__Group__2__Impl : ( ( rule__EditFactOperation__PropAssignment_2 ) ) ;
    public final void rule__EditFactOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5087:1: ( ( ( rule__EditFactOperation__PropAssignment_2 ) ) )
            // InternalAdaptDsl.g:5088:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5088:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            // InternalAdaptDsl.g:5089:2: ( rule__EditFactOperation__PropAssignment_2 )
            {
             before(grammarAccess.getEditFactOperationAccess().getPropAssignment_2()); 
            // InternalAdaptDsl.g:5090:2: ( rule__EditFactOperation__PropAssignment_2 )
            // InternalAdaptDsl.g:5090:3: rule__EditFactOperation__PropAssignment_2
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
    // InternalAdaptDsl.g:5098:1: rule__EditFactOperation__Group__3 : rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 ;
    public final void rule__EditFactOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5102:1: ( rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 )
            // InternalAdaptDsl.g:5103:2: rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalAdaptDsl.g:5110:1: rule__EditFactOperation__Group__3__Impl : ( ( rule__EditFactOperation__Group_3__0 )? ) ;
    public final void rule__EditFactOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5114:1: ( ( ( rule__EditFactOperation__Group_3__0 )? ) )
            // InternalAdaptDsl.g:5115:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            {
            // InternalAdaptDsl.g:5115:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            // InternalAdaptDsl.g:5116:2: ( rule__EditFactOperation__Group_3__0 )?
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup_3()); 
            // InternalAdaptDsl.g:5117:2: ( rule__EditFactOperation__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdaptDsl.g:5117:3: rule__EditFactOperation__Group_3__0
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
    // InternalAdaptDsl.g:5125:1: rule__EditFactOperation__Group__4 : rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 ;
    public final void rule__EditFactOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5129:1: ( rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 )
            // InternalAdaptDsl.g:5130:2: rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:5137:1: rule__EditFactOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__EditFactOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5141:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5142:1: ( ')' )
            {
            // InternalAdaptDsl.g:5142:1: ( ')' )
            // InternalAdaptDsl.g:5143:2: ')'
            {
             before(grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5152:1: rule__EditFactOperation__Group__5 : rule__EditFactOperation__Group__5__Impl ;
    public final void rule__EditFactOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5156:1: ( rule__EditFactOperation__Group__5__Impl )
            // InternalAdaptDsl.g:5157:2: rule__EditFactOperation__Group__5__Impl
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
    // InternalAdaptDsl.g:5163:1: rule__EditFactOperation__Group__5__Impl : ( ';' ) ;
    public final void rule__EditFactOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5167:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5168:1: ( ';' )
            {
            // InternalAdaptDsl.g:5168:1: ( ';' )
            // InternalAdaptDsl.g:5169:2: ';'
            {
             before(grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5179:1: rule__EditFactOperation__Group_3__0 : rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 ;
    public final void rule__EditFactOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5183:1: ( rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 )
            // InternalAdaptDsl.g:5184:2: rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptDsl.g:5191:1: rule__EditFactOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EditFactOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5195:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5196:1: ( ',' )
            {
            // InternalAdaptDsl.g:5196:1: ( ',' )
            // InternalAdaptDsl.g:5197:2: ','
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
    // InternalAdaptDsl.g:5206:1: rule__EditFactOperation__Group_3__1 : rule__EditFactOperation__Group_3__1__Impl ;
    public final void rule__EditFactOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5210:1: ( rule__EditFactOperation__Group_3__1__Impl )
            // InternalAdaptDsl.g:5211:2: rule__EditFactOperation__Group_3__1__Impl
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
    // InternalAdaptDsl.g:5217:1: rule__EditFactOperation__Group_3__1__Impl : ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) ;
    public final void rule__EditFactOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5221:1: ( ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) )
            // InternalAdaptDsl.g:5222:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            {
            // InternalAdaptDsl.g:5222:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            // InternalAdaptDsl.g:5223:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            {
             before(grammarAccess.getEditFactOperationAccess().getValAssignment_3_1()); 
            // InternalAdaptDsl.g:5224:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            // InternalAdaptDsl.g:5224:3: rule__EditFactOperation__ValAssignment_3_1
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
    // InternalAdaptDsl.g:5233:1: rule__SetDisplayPropertyOperation__Group__0 : rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 ;
    public final void rule__SetDisplayPropertyOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5237:1: ( rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 )
            // InternalAdaptDsl.g:5238:2: rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:5245:1: rule__SetDisplayPropertyOperation__Group__0__Impl : ( 'setDisplayProperty' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5249:1: ( ( 'setDisplayProperty' ) )
            // InternalAdaptDsl.g:5250:1: ( 'setDisplayProperty' )
            {
            // InternalAdaptDsl.g:5250:1: ( 'setDisplayProperty' )
            // InternalAdaptDsl.g:5251:2: 'setDisplayProperty'
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
    // InternalAdaptDsl.g:5260:1: rule__SetDisplayPropertyOperation__Group__1 : rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 ;
    public final void rule__SetDisplayPropertyOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5264:1: ( rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 )
            // InternalAdaptDsl.g:5265:2: rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5272:1: rule__SetDisplayPropertyOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5276:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5277:1: ( '(' )
            {
            // InternalAdaptDsl.g:5277:1: ( '(' )
            // InternalAdaptDsl.g:5278:2: '('
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5287:1: rule__SetDisplayPropertyOperation__Group__2 : rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 ;
    public final void rule__SetDisplayPropertyOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5291:1: ( rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 )
            // InternalAdaptDsl.g:5292:2: rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:5299:1: rule__SetDisplayPropertyOperation__Group__2__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5303:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) )
            // InternalAdaptDsl.g:5304:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5304:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            // InternalAdaptDsl.g:5305:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyAssignment_2()); 
            // InternalAdaptDsl.g:5306:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            // InternalAdaptDsl.g:5306:3: rule__SetDisplayPropertyOperation__PropertyAssignment_2
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
    // InternalAdaptDsl.g:5314:1: rule__SetDisplayPropertyOperation__Group__3 : rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 ;
    public final void rule__SetDisplayPropertyOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5318:1: ( rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 )
            // InternalAdaptDsl.g:5319:2: rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalAdaptDsl.g:5326:1: rule__SetDisplayPropertyOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5330:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5331:1: ( ',' )
            {
            // InternalAdaptDsl.g:5331:1: ( ',' )
            // InternalAdaptDsl.g:5332:2: ','
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
    // InternalAdaptDsl.g:5341:1: rule__SetDisplayPropertyOperation__Group__4 : rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 ;
    public final void rule__SetDisplayPropertyOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5345:1: ( rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 )
            // InternalAdaptDsl.g:5346:2: rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5353:1: rule__SetDisplayPropertyOperation__Group__4__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5357:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) )
            // InternalAdaptDsl.g:5358:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5358:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            // InternalAdaptDsl.g:5359:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueAssignment_4()); 
            // InternalAdaptDsl.g:5360:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            // InternalAdaptDsl.g:5360:3: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4
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
    // InternalAdaptDsl.g:5368:1: rule__SetDisplayPropertyOperation__Group__5 : rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 ;
    public final void rule__SetDisplayPropertyOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5372:1: ( rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 )
            // InternalAdaptDsl.g:5373:2: rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:5380:1: rule__SetDisplayPropertyOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5384:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5385:1: ( ')' )
            {
            // InternalAdaptDsl.g:5385:1: ( ')' )
            // InternalAdaptDsl.g:5386:2: ')'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5395:1: rule__SetDisplayPropertyOperation__Group__6 : rule__SetDisplayPropertyOperation__Group__6__Impl ;
    public final void rule__SetDisplayPropertyOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5399:1: ( rule__SetDisplayPropertyOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5400:2: rule__SetDisplayPropertyOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5406:1: rule__SetDisplayPropertyOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5410:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5411:1: ( ';' )
            {
            // InternalAdaptDsl.g:5411:1: ( ';' )
            // InternalAdaptDsl.g:5412:2: ';'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5422:1: rule__AddViewComponentOperation__Group__0 : rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 ;
    public final void rule__AddViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5426:1: ( rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:5427:2: rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:5434:1: rule__AddViewComponentOperation__Group__0__Impl : ( 'addViewComponent' ) ;
    public final void rule__AddViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5438:1: ( ( 'addViewComponent' ) )
            // InternalAdaptDsl.g:5439:1: ( 'addViewComponent' )
            {
            // InternalAdaptDsl.g:5439:1: ( 'addViewComponent' )
            // InternalAdaptDsl.g:5440:2: 'addViewComponent'
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
    // InternalAdaptDsl.g:5449:1: rule__AddViewComponentOperation__Group__1 : rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 ;
    public final void rule__AddViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5453:1: ( rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:5454:2: rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:5461:1: rule__AddViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5465:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5466:1: ( '(' )
            {
            // InternalAdaptDsl.g:5466:1: ( '(' )
            // InternalAdaptDsl.g:5467:2: '('
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5476:1: rule__AddViewComponentOperation__Group__2 : rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 ;
    public final void rule__AddViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5480:1: ( rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:5481:2: rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:5488:1: rule__AddViewComponentOperation__Group__2__Impl : ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5492:1: ( ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5493:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5493:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5494:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5495:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5495:3: rule__AddViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5503:1: rule__AddViewComponentOperation__Group__3 : rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 ;
    public final void rule__AddViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5507:1: ( rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:5508:2: rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:5515:1: rule__AddViewComponentOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5519:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5520:1: ( ',' )
            {
            // InternalAdaptDsl.g:5520:1: ( ',' )
            // InternalAdaptDsl.g:5521:2: ','
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
    // InternalAdaptDsl.g:5530:1: rule__AddViewComponentOperation__Group__4 : rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 ;
    public final void rule__AddViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5534:1: ( rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 )
            // InternalAdaptDsl.g:5535:2: rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5542:1: rule__AddViewComponentOperation__Group__4__Impl : ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) ;
    public final void rule__AddViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5546:1: ( ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) )
            // InternalAdaptDsl.g:5547:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5547:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            // InternalAdaptDsl.g:5548:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetAssignment_4()); 
            // InternalAdaptDsl.g:5549:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            // InternalAdaptDsl.g:5549:3: rule__AddViewComponentOperation__TargetAssignment_4
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
    // InternalAdaptDsl.g:5557:1: rule__AddViewComponentOperation__Group__5 : rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 ;
    public final void rule__AddViewComponentOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5561:1: ( rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 )
            // InternalAdaptDsl.g:5562:2: rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:5569:1: rule__AddViewComponentOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddViewComponentOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5573:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5574:1: ( ')' )
            {
            // InternalAdaptDsl.g:5574:1: ( ')' )
            // InternalAdaptDsl.g:5575:2: ')'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5584:1: rule__AddViewComponentOperation__Group__6 : rule__AddViewComponentOperation__Group__6__Impl ;
    public final void rule__AddViewComponentOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5588:1: ( rule__AddViewComponentOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5589:2: rule__AddViewComponentOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5595:1: rule__AddViewComponentOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddViewComponentOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5599:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5600:1: ( ';' )
            {
            // InternalAdaptDsl.g:5600:1: ( ';' )
            // InternalAdaptDsl.g:5601:2: ';'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5611:1: rule__DeleteViewComponentOperation__Group__0 : rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 ;
    public final void rule__DeleteViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5615:1: ( rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:5616:2: rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:5623:1: rule__DeleteViewComponentOperation__Group__0__Impl : ( 'deleteViewComponent' ) ;
    public final void rule__DeleteViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5627:1: ( ( 'deleteViewComponent' ) )
            // InternalAdaptDsl.g:5628:1: ( 'deleteViewComponent' )
            {
            // InternalAdaptDsl.g:5628:1: ( 'deleteViewComponent' )
            // InternalAdaptDsl.g:5629:2: 'deleteViewComponent'
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
    // InternalAdaptDsl.g:5638:1: rule__DeleteViewComponentOperation__Group__1 : rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 ;
    public final void rule__DeleteViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5642:1: ( rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:5643:2: rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:5650:1: rule__DeleteViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5654:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5655:1: ( '(' )
            {
            // InternalAdaptDsl.g:5655:1: ( '(' )
            // InternalAdaptDsl.g:5656:2: '('
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5665:1: rule__DeleteViewComponentOperation__Group__2 : rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 ;
    public final void rule__DeleteViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5669:1: ( rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:5670:2: rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5677:1: rule__DeleteViewComponentOperation__Group__2__Impl : ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5681:1: ( ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5682:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5682:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5683:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5684:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5684:3: rule__DeleteViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5692:1: rule__DeleteViewComponentOperation__Group__3 : rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 ;
    public final void rule__DeleteViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5696:1: ( rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:5697:2: rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:5704:1: rule__DeleteViewComponentOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5708:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5709:1: ( ')' )
            {
            // InternalAdaptDsl.g:5709:1: ( ')' )
            // InternalAdaptDsl.g:5710:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5719:1: rule__DeleteViewComponentOperation__Group__4 : rule__DeleteViewComponentOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5723:1: ( rule__DeleteViewComponentOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5724:2: rule__DeleteViewComponentOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:5730:1: rule__DeleteViewComponentOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5734:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5735:1: ( ';' )
            {
            // InternalAdaptDsl.g:5735:1: ( ';' )
            // InternalAdaptDsl.g:5736:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5746:1: rule__AddViewComponentButtonOperation__Group__0 : rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 ;
    public final void rule__AddViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5750:1: ( rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 )
            // InternalAdaptDsl.g:5751:2: rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:5758:1: rule__AddViewComponentButtonOperation__Group__0__Impl : ( 'addViewComponentButton' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5762:1: ( ( 'addViewComponentButton' ) )
            // InternalAdaptDsl.g:5763:1: ( 'addViewComponentButton' )
            {
            // InternalAdaptDsl.g:5763:1: ( 'addViewComponentButton' )
            // InternalAdaptDsl.g:5764:2: 'addViewComponentButton'
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
    // InternalAdaptDsl.g:5773:1: rule__AddViewComponentButtonOperation__Group__1 : rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 ;
    public final void rule__AddViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5777:1: ( rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 )
            // InternalAdaptDsl.g:5778:2: rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5785:1: rule__AddViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5789:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5790:1: ( '(' )
            {
            // InternalAdaptDsl.g:5790:1: ( '(' )
            // InternalAdaptDsl.g:5791:2: '('
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5800:1: rule__AddViewComponentButtonOperation__Group__2 : rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 ;
    public final void rule__AddViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5804:1: ( rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 )
            // InternalAdaptDsl.g:5805:2: rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:5812:1: rule__AddViewComponentButtonOperation__Group__2__Impl : ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5816:1: ( ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptDsl.g:5817:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5817:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptDsl.g:5818:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptDsl.g:5819:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptDsl.g:5819:3: rule__AddViewComponentButtonOperation__IdAssignment_2
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
    // InternalAdaptDsl.g:5827:1: rule__AddViewComponentButtonOperation__Group__3 : rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 ;
    public final void rule__AddViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5831:1: ( rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 )
            // InternalAdaptDsl.g:5832:2: rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5839:1: rule__AddViewComponentButtonOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5843:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5844:1: ( ',' )
            {
            // InternalAdaptDsl.g:5844:1: ( ',' )
            // InternalAdaptDsl.g:5845:2: ','
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
    // InternalAdaptDsl.g:5854:1: rule__AddViewComponentButtonOperation__Group__4 : rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 ;
    public final void rule__AddViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5858:1: ( rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 )
            // InternalAdaptDsl.g:5859:2: rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:5866:1: rule__AddViewComponentButtonOperation__Group__4__Impl : ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5870:1: ( ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) )
            // InternalAdaptDsl.g:5871:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5871:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            // InternalAdaptDsl.g:5872:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeyAssignment_4()); 
            // InternalAdaptDsl.g:5873:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            // InternalAdaptDsl.g:5873:3: rule__AddViewComponentButtonOperation__LangKeyAssignment_4
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
    // InternalAdaptDsl.g:5881:1: rule__AddViewComponentButtonOperation__Group__5 : rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 ;
    public final void rule__AddViewComponentButtonOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5885:1: ( rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 )
            // InternalAdaptDsl.g:5886:2: rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:5893:1: rule__AddViewComponentButtonOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5897:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5898:1: ( ',' )
            {
            // InternalAdaptDsl.g:5898:1: ( ',' )
            // InternalAdaptDsl.g:5899:2: ','
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
    // InternalAdaptDsl.g:5908:1: rule__AddViewComponentButtonOperation__Group__6 : rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 ;
    public final void rule__AddViewComponentButtonOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5912:1: ( rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 )
            // InternalAdaptDsl.g:5913:2: rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:5920:1: rule__AddViewComponentButtonOperation__Group__6__Impl : ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5924:1: ( ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) )
            // InternalAdaptDsl.g:5925:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            {
            // InternalAdaptDsl.g:5925:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            // InternalAdaptDsl.g:5926:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getActionAssignment_6()); 
            // InternalAdaptDsl.g:5927:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            // InternalAdaptDsl.g:5927:3: rule__AddViewComponentButtonOperation__ActionAssignment_6
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
    // InternalAdaptDsl.g:5935:1: rule__AddViewComponentButtonOperation__Group__7 : rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 ;
    public final void rule__AddViewComponentButtonOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5939:1: ( rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 )
            // InternalAdaptDsl.g:5940:2: rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:5947:1: rule__AddViewComponentButtonOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5951:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5952:1: ( ')' )
            {
            // InternalAdaptDsl.g:5952:1: ( ')' )
            // InternalAdaptDsl.g:5953:2: ')'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5962:1: rule__AddViewComponentButtonOperation__Group__8 : rule__AddViewComponentButtonOperation__Group__8__Impl ;
    public final void rule__AddViewComponentButtonOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5966:1: ( rule__AddViewComponentButtonOperation__Group__8__Impl )
            // InternalAdaptDsl.g:5967:2: rule__AddViewComponentButtonOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:5973:1: rule__AddViewComponentButtonOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5977:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5978:1: ( ';' )
            {
            // InternalAdaptDsl.g:5978:1: ( ';' )
            // InternalAdaptDsl.g:5979:2: ';'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getSemicolonKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5989:1: rule__DeleteViewComponentButtonOperation__Group__0 : rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5993:1: ( rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 )
            // InternalAdaptDsl.g:5994:2: rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:6001:1: rule__DeleteViewComponentButtonOperation__Group__0__Impl : ( 'deleteViewComponentButton' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6005:1: ( ( 'deleteViewComponentButton' ) )
            // InternalAdaptDsl.g:6006:1: ( 'deleteViewComponentButton' )
            {
            // InternalAdaptDsl.g:6006:1: ( 'deleteViewComponentButton' )
            // InternalAdaptDsl.g:6007:2: 'deleteViewComponentButton'
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
    // InternalAdaptDsl.g:6016:1: rule__DeleteViewComponentButtonOperation__Group__1 : rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6020:1: ( rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 )
            // InternalAdaptDsl.g:6021:2: rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:6028:1: rule__DeleteViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6032:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6033:1: ( '(' )
            {
            // InternalAdaptDsl.g:6033:1: ( '(' )
            // InternalAdaptDsl.g:6034:2: '('
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6043:1: rule__DeleteViewComponentButtonOperation__Group__2 : rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6047:1: ( rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 )
            // InternalAdaptDsl.g:6048:2: rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6055:1: rule__DeleteViewComponentButtonOperation__Group__2__Impl : ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6059:1: ( ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptDsl.g:6060:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6060:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptDsl.g:6061:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptDsl.g:6062:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptDsl.g:6062:3: rule__DeleteViewComponentButtonOperation__IdAssignment_2
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
    // InternalAdaptDsl.g:6070:1: rule__DeleteViewComponentButtonOperation__Group__3 : rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6074:1: ( rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 )
            // InternalAdaptDsl.g:6075:2: rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:6082:1: rule__DeleteViewComponentButtonOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6086:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6087:1: ( ')' )
            {
            // InternalAdaptDsl.g:6087:1: ( ')' )
            // InternalAdaptDsl.g:6088:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6097:1: rule__DeleteViewComponentButtonOperation__Group__4 : rule__DeleteViewComponentButtonOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6101:1: ( rule__DeleteViewComponentButtonOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6102:2: rule__DeleteViewComponentButtonOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6108:1: rule__DeleteViewComponentButtonOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6112:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6113:1: ( ';' )
            {
            // InternalAdaptDsl.g:6113:1: ( ';' )
            // InternalAdaptDsl.g:6114:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6124:1: rule__AddNavLinkOperation__Group__0 : rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 ;
    public final void rule__AddNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6128:1: ( rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6129:2: rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:6136:1: rule__AddNavLinkOperation__Group__0__Impl : ( 'addNavLink' ) ;
    public final void rule__AddNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6140:1: ( ( 'addNavLink' ) )
            // InternalAdaptDsl.g:6141:1: ( 'addNavLink' )
            {
            // InternalAdaptDsl.g:6141:1: ( 'addNavLink' )
            // InternalAdaptDsl.g:6142:2: 'addNavLink'
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
    // InternalAdaptDsl.g:6151:1: rule__AddNavLinkOperation__Group__1 : rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 ;
    public final void rule__AddNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6155:1: ( rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6156:2: rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:6163:1: rule__AddNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6167:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6168:1: ( '(' )
            {
            // InternalAdaptDsl.g:6168:1: ( '(' )
            // InternalAdaptDsl.g:6169:2: '('
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6178:1: rule__AddNavLinkOperation__Group__2 : rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 ;
    public final void rule__AddNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6182:1: ( rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6183:2: rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:6190:1: rule__AddNavLinkOperation__Group__2__Impl : ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6194:1: ( ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6195:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6195:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6196:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6197:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6197:3: rule__AddNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6205:1: rule__AddNavLinkOperation__Group__3 : rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 ;
    public final void rule__AddNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6209:1: ( rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6210:2: rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:6217:1: rule__AddNavLinkOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6221:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6222:1: ( ',' )
            {
            // InternalAdaptDsl.g:6222:1: ( ',' )
            // InternalAdaptDsl.g:6223:2: ','
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
    // InternalAdaptDsl.g:6232:1: rule__AddNavLinkOperation__Group__4 : rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 ;
    public final void rule__AddNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6236:1: ( rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 )
            // InternalAdaptDsl.g:6237:2: rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6244:1: rule__AddNavLinkOperation__Group__4__Impl : ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) ;
    public final void rule__AddNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6248:1: ( ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) )
            // InternalAdaptDsl.g:6249:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6249:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            // InternalAdaptDsl.g:6250:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextAssignment_4()); 
            // InternalAdaptDsl.g:6251:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            // InternalAdaptDsl.g:6251:3: rule__AddNavLinkOperation__TextAssignment_4
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
    // InternalAdaptDsl.g:6259:1: rule__AddNavLinkOperation__Group__5 : rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 ;
    public final void rule__AddNavLinkOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6263:1: ( rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 )
            // InternalAdaptDsl.g:6264:2: rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:6271:1: rule__AddNavLinkOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddNavLinkOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6275:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6276:1: ( ')' )
            {
            // InternalAdaptDsl.g:6276:1: ( ')' )
            // InternalAdaptDsl.g:6277:2: ')'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6286:1: rule__AddNavLinkOperation__Group__6 : rule__AddNavLinkOperation__Group__6__Impl ;
    public final void rule__AddNavLinkOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6290:1: ( rule__AddNavLinkOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6291:2: rule__AddNavLinkOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6297:1: rule__AddNavLinkOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddNavLinkOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6301:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6302:1: ( ';' )
            {
            // InternalAdaptDsl.g:6302:1: ( ';' )
            // InternalAdaptDsl.g:6303:2: ';'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6313:1: rule__DeleteNavLinkOperation__Group__0 : rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 ;
    public final void rule__DeleteNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6317:1: ( rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6318:2: rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:6325:1: rule__DeleteNavLinkOperation__Group__0__Impl : ( 'deleteNavLink' ) ;
    public final void rule__DeleteNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6329:1: ( ( 'deleteNavLink' ) )
            // InternalAdaptDsl.g:6330:1: ( 'deleteNavLink' )
            {
            // InternalAdaptDsl.g:6330:1: ( 'deleteNavLink' )
            // InternalAdaptDsl.g:6331:2: 'deleteNavLink'
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
    // InternalAdaptDsl.g:6340:1: rule__DeleteNavLinkOperation__Group__1 : rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 ;
    public final void rule__DeleteNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6344:1: ( rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6345:2: rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:6352:1: rule__DeleteNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6356:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6357:1: ( '(' )
            {
            // InternalAdaptDsl.g:6357:1: ( '(' )
            // InternalAdaptDsl.g:6358:2: '('
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6367:1: rule__DeleteNavLinkOperation__Group__2 : rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 ;
    public final void rule__DeleteNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6371:1: ( rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6372:2: rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6379:1: rule__DeleteNavLinkOperation__Group__2__Impl : ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6383:1: ( ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6384:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6384:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6385:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6386:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6386:3: rule__DeleteNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6394:1: rule__DeleteNavLinkOperation__Group__3 : rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 ;
    public final void rule__DeleteNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6398:1: ( rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6399:2: rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:6406:1: rule__DeleteNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6410:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6411:1: ( ')' )
            {
            // InternalAdaptDsl.g:6411:1: ( ')' )
            // InternalAdaptDsl.g:6412:2: ')'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6421:1: rule__DeleteNavLinkOperation__Group__4 : rule__DeleteNavLinkOperation__Group__4__Impl ;
    public final void rule__DeleteNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6425:1: ( rule__DeleteNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6426:2: rule__DeleteNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6432:1: rule__DeleteNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6436:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6437:1: ( ';' )
            {
            // InternalAdaptDsl.g:6437:1: ( ';' )
            // InternalAdaptDsl.g:6438:2: ';'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6448:1: rule__RedirectNavLinkOperation__Group__0 : rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 ;
    public final void rule__RedirectNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6452:1: ( rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6453:2: rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:6460:1: rule__RedirectNavLinkOperation__Group__0__Impl : ( 'redirectNavLink' ) ;
    public final void rule__RedirectNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6464:1: ( ( 'redirectNavLink' ) )
            // InternalAdaptDsl.g:6465:1: ( 'redirectNavLink' )
            {
            // InternalAdaptDsl.g:6465:1: ( 'redirectNavLink' )
            // InternalAdaptDsl.g:6466:2: 'redirectNavLink'
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
    // InternalAdaptDsl.g:6475:1: rule__RedirectNavLinkOperation__Group__1 : rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 ;
    public final void rule__RedirectNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6479:1: ( rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6480:2: rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:6487:1: rule__RedirectNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__RedirectNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6491:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6492:1: ( '(' )
            {
            // InternalAdaptDsl.g:6492:1: ( '(' )
            // InternalAdaptDsl.g:6493:2: '('
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6502:1: rule__RedirectNavLinkOperation__Group__2 : rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 ;
    public final void rule__RedirectNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6506:1: ( rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6507:2: rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6514:1: rule__RedirectNavLinkOperation__Group__2__Impl : ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__RedirectNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6518:1: ( ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6519:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6519:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6520:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6521:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6521:3: rule__RedirectNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6529:1: rule__RedirectNavLinkOperation__Group__3 : rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 ;
    public final void rule__RedirectNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6533:1: ( rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6534:2: rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:6541:1: rule__RedirectNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RedirectNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6545:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6546:1: ( ')' )
            {
            // InternalAdaptDsl.g:6546:1: ( ')' )
            // InternalAdaptDsl.g:6547:2: ')'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6556:1: rule__RedirectNavLinkOperation__Group__4 : rule__RedirectNavLinkOperation__Group__4__Impl ;
    public final void rule__RedirectNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6560:1: ( rule__RedirectNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6561:2: rule__RedirectNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6567:1: rule__RedirectNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__RedirectNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6571:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6572:1: ( ';' )
            {
            // InternalAdaptDsl.g:6572:1: ( ';' )
            // InternalAdaptDsl.g:6573:2: ';'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6583:1: rule__ClearNavOperation__Group__0 : rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 ;
    public final void rule__ClearNavOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6587:1: ( rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 )
            // InternalAdaptDsl.g:6588:2: rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdaptDsl.g:6595:1: rule__ClearNavOperation__Group__0__Impl : ( () ) ;
    public final void rule__ClearNavOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6599:1: ( ( () ) )
            // InternalAdaptDsl.g:6600:1: ( () )
            {
            // InternalAdaptDsl.g:6600:1: ( () )
            // InternalAdaptDsl.g:6601:2: ()
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0()); 
            // InternalAdaptDsl.g:6602:2: ()
            // InternalAdaptDsl.g:6602:3: 
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
    // InternalAdaptDsl.g:6610:1: rule__ClearNavOperation__Group__1 : rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 ;
    public final void rule__ClearNavOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6614:1: ( rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 )
            // InternalAdaptDsl.g:6615:2: rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2
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
    // InternalAdaptDsl.g:6622:1: rule__ClearNavOperation__Group__1__Impl : ( 'clearNavigation' ) ;
    public final void rule__ClearNavOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6626:1: ( ( 'clearNavigation' ) )
            // InternalAdaptDsl.g:6627:1: ( 'clearNavigation' )
            {
            // InternalAdaptDsl.g:6627:1: ( 'clearNavigation' )
            // InternalAdaptDsl.g:6628:2: 'clearNavigation'
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
    // InternalAdaptDsl.g:6637:1: rule__ClearNavOperation__Group__2 : rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 ;
    public final void rule__ClearNavOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6641:1: ( rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 )
            // InternalAdaptDsl.g:6642:2: rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:6649:1: rule__ClearNavOperation__Group__2__Impl : ( '()' ) ;
    public final void rule__ClearNavOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6653:1: ( ( '()' ) )
            // InternalAdaptDsl.g:6654:1: ( '()' )
            {
            // InternalAdaptDsl.g:6654:1: ( '()' )
            // InternalAdaptDsl.g:6655:2: '()'
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
    // InternalAdaptDsl.g:6664:1: rule__ClearNavOperation__Group__3 : rule__ClearNavOperation__Group__3__Impl ;
    public final void rule__ClearNavOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6668:1: ( rule__ClearNavOperation__Group__3__Impl )
            // InternalAdaptDsl.g:6669:2: rule__ClearNavOperation__Group__3__Impl
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
    // InternalAdaptDsl.g:6675:1: rule__ClearNavOperation__Group__3__Impl : ( ';' ) ;
    public final void rule__ClearNavOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6679:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6680:1: ( ';' )
            {
            // InternalAdaptDsl.g:6680:1: ( ';' )
            // InternalAdaptDsl.g:6681:2: ';'
            {
             before(grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6691:1: rule__ChangeFontSizeOperation__Group__0 : rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 ;
    public final void rule__ChangeFontSizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6695:1: ( rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 )
            // InternalAdaptDsl.g:6696:2: rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:6703:1: rule__ChangeFontSizeOperation__Group__0__Impl : ( 'changeFontSize' ) ;
    public final void rule__ChangeFontSizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6707:1: ( ( 'changeFontSize' ) )
            // InternalAdaptDsl.g:6708:1: ( 'changeFontSize' )
            {
            // InternalAdaptDsl.g:6708:1: ( 'changeFontSize' )
            // InternalAdaptDsl.g:6709:2: 'changeFontSize'
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
    // InternalAdaptDsl.g:6718:1: rule__ChangeFontSizeOperation__Group__1 : rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 ;
    public final void rule__ChangeFontSizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6722:1: ( rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 )
            // InternalAdaptDsl.g:6723:2: rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptDsl.g:6730:1: rule__ChangeFontSizeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontSizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6734:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6735:1: ( '(' )
            {
            // InternalAdaptDsl.g:6735:1: ( '(' )
            // InternalAdaptDsl.g:6736:2: '('
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6745:1: rule__ChangeFontSizeOperation__Group__2 : rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 ;
    public final void rule__ChangeFontSizeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6749:1: ( rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 )
            // InternalAdaptDsl.g:6750:2: rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:6757:1: rule__ChangeFontSizeOperation__Group__2__Impl : ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6761:1: ( ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:6762:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6762:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:6763:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryAssignment_2()); 
            // InternalAdaptDsl.g:6764:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            // InternalAdaptDsl.g:6764:3: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2
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
    // InternalAdaptDsl.g:6772:1: rule__ChangeFontSizeOperation__Group__3 : rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 ;
    public final void rule__ChangeFontSizeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6776:1: ( rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 )
            // InternalAdaptDsl.g:6777:2: rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalAdaptDsl.g:6784:1: rule__ChangeFontSizeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeFontSizeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6788:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6789:1: ( ',' )
            {
            // InternalAdaptDsl.g:6789:1: ( ',' )
            // InternalAdaptDsl.g:6790:2: ','
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
    // InternalAdaptDsl.g:6799:1: rule__ChangeFontSizeOperation__Group__4 : rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 ;
    public final void rule__ChangeFontSizeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6803:1: ( rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 )
            // InternalAdaptDsl.g:6804:2: rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:6811:1: rule__ChangeFontSizeOperation__Group__4__Impl : ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6815:1: ( ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:6816:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6816:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:6817:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:6818:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            // InternalAdaptDsl.g:6818:3: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4
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
    // InternalAdaptDsl.g:6826:1: rule__ChangeFontSizeOperation__Group__5 : rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 ;
    public final void rule__ChangeFontSizeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6830:1: ( rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 )
            // InternalAdaptDsl.g:6831:2: rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:6838:1: rule__ChangeFontSizeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeFontSizeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6842:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6843:1: ( ')' )
            {
            // InternalAdaptDsl.g:6843:1: ( ')' )
            // InternalAdaptDsl.g:6844:2: ')'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6853:1: rule__ChangeFontSizeOperation__Group__6 : rule__ChangeFontSizeOperation__Group__6__Impl ;
    public final void rule__ChangeFontSizeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6857:1: ( rule__ChangeFontSizeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6858:2: rule__ChangeFontSizeOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6864:1: rule__ChangeFontSizeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeFontSizeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6868:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6869:1: ( ';' )
            {
            // InternalAdaptDsl.g:6869:1: ( ';' )
            // InternalAdaptDsl.g:6870:2: ';'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6880:1: rule__ChangeColorSchemeOperation__Group__0 : rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 ;
    public final void rule__ChangeColorSchemeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6884:1: ( rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 )
            // InternalAdaptDsl.g:6885:2: rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:6892:1: rule__ChangeColorSchemeOperation__Group__0__Impl : ( 'changeColorScheme' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6896:1: ( ( 'changeColorScheme' ) )
            // InternalAdaptDsl.g:6897:1: ( 'changeColorScheme' )
            {
            // InternalAdaptDsl.g:6897:1: ( 'changeColorScheme' )
            // InternalAdaptDsl.g:6898:2: 'changeColorScheme'
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
    // InternalAdaptDsl.g:6907:1: rule__ChangeColorSchemeOperation__Group__1 : rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 ;
    public final void rule__ChangeColorSchemeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6911:1: ( rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 )
            // InternalAdaptDsl.g:6912:2: rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:6919:1: rule__ChangeColorSchemeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6923:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6924:1: ( '(' )
            {
            // InternalAdaptDsl.g:6924:1: ( '(' )
            // InternalAdaptDsl.g:6925:2: '('
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6934:1: rule__ChangeColorSchemeOperation__Group__2 : rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 ;
    public final void rule__ChangeColorSchemeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6938:1: ( rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 )
            // InternalAdaptDsl.g:6939:2: rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:6946:1: rule__ChangeColorSchemeOperation__Group__2__Impl : ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6950:1: ( ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:6951:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6951:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:6952:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryAssignment_2()); 
            // InternalAdaptDsl.g:6953:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            // InternalAdaptDsl.g:6953:3: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2
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
    // InternalAdaptDsl.g:6961:1: rule__ChangeColorSchemeOperation__Group__3 : rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 ;
    public final void rule__ChangeColorSchemeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6965:1: ( rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 )
            // InternalAdaptDsl.g:6966:2: rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:6973:1: rule__ChangeColorSchemeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6977:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6978:1: ( ',' )
            {
            // InternalAdaptDsl.g:6978:1: ( ',' )
            // InternalAdaptDsl.g:6979:2: ','
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
    // InternalAdaptDsl.g:6988:1: rule__ChangeColorSchemeOperation__Group__4 : rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 ;
    public final void rule__ChangeColorSchemeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6992:1: ( rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 )
            // InternalAdaptDsl.g:6993:2: rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:7000:1: rule__ChangeColorSchemeOperation__Group__4__Impl : ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7004:1: ( ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:7005:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:7005:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:7006:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:7007:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            // InternalAdaptDsl.g:7007:3: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4
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
    // InternalAdaptDsl.g:7015:1: rule__ChangeColorSchemeOperation__Group__5 : rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 ;
    public final void rule__ChangeColorSchemeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7019:1: ( rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 )
            // InternalAdaptDsl.g:7020:2: rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:7027:1: rule__ChangeColorSchemeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7031:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7032:1: ( ')' )
            {
            // InternalAdaptDsl.g:7032:1: ( ')' )
            // InternalAdaptDsl.g:7033:2: ')'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7042:1: rule__ChangeColorSchemeOperation__Group__6 : rule__ChangeColorSchemeOperation__Group__6__Impl ;
    public final void rule__ChangeColorSchemeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7046:1: ( rule__ChangeColorSchemeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:7047:2: rule__ChangeColorSchemeOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:7053:1: rule__ChangeColorSchemeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7057:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7058:1: ( ';' )
            {
            // InternalAdaptDsl.g:7058:1: ( ';' )
            // InternalAdaptDsl.g:7059:2: ';'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7069:1: rule__ChangeFontOperation__Group__0 : rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 ;
    public final void rule__ChangeFontOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7073:1: ( rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 )
            // InternalAdaptDsl.g:7074:2: rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:7081:1: rule__ChangeFontOperation__Group__0__Impl : ( 'changeFont' ) ;
    public final void rule__ChangeFontOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7085:1: ( ( 'changeFont' ) )
            // InternalAdaptDsl.g:7086:1: ( 'changeFont' )
            {
            // InternalAdaptDsl.g:7086:1: ( 'changeFont' )
            // InternalAdaptDsl.g:7087:2: 'changeFont'
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
    // InternalAdaptDsl.g:7096:1: rule__ChangeFontOperation__Group__1 : rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 ;
    public final void rule__ChangeFontOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7100:1: ( rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 )
            // InternalAdaptDsl.g:7101:2: rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:7108:1: rule__ChangeFontOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7112:1: ( ( '(' ) )
            // InternalAdaptDsl.g:7113:1: ( '(' )
            {
            // InternalAdaptDsl.g:7113:1: ( '(' )
            // InternalAdaptDsl.g:7114:2: '('
            {
             before(grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7123:1: rule__ChangeFontOperation__Group__2 : rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 ;
    public final void rule__ChangeFontOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7127:1: ( rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 )
            // InternalAdaptDsl.g:7128:2: rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:7135:1: rule__ChangeFontOperation__Group__2__Impl : ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeFontOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7139:1: ( ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:7140:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7140:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:7141:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:7142:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:7142:3: rule__ChangeFontOperation__TextAssignment_2
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
    // InternalAdaptDsl.g:7150:1: rule__ChangeFontOperation__Group__3 : rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 ;
    public final void rule__ChangeFontOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7154:1: ( rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 )
            // InternalAdaptDsl.g:7155:2: rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:7162:1: rule__ChangeFontOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7166:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7167:1: ( ')' )
            {
            // InternalAdaptDsl.g:7167:1: ( ')' )
            // InternalAdaptDsl.g:7168:2: ')'
            {
             before(grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7177:1: rule__ChangeFontOperation__Group__4 : rule__ChangeFontOperation__Group__4__Impl ;
    public final void rule__ChangeFontOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7181:1: ( rule__ChangeFontOperation__Group__4__Impl )
            // InternalAdaptDsl.g:7182:2: rule__ChangeFontOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:7188:1: rule__ChangeFontOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7192:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7193:1: ( ';' )
            {
            // InternalAdaptDsl.g:7193:1: ( ';' )
            // InternalAdaptDsl.g:7194:2: ';'
            {
             before(grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7204:1: rule__ChangeTableCssClassOperation__Group__0 : rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 ;
    public final void rule__ChangeTableCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7208:1: ( rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:7209:2: rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:7216:1: rule__ChangeTableCssClassOperation__Group__0__Impl : ( 'changeTableCss' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7220:1: ( ( 'changeTableCss' ) )
            // InternalAdaptDsl.g:7221:1: ( 'changeTableCss' )
            {
            // InternalAdaptDsl.g:7221:1: ( 'changeTableCss' )
            // InternalAdaptDsl.g:7222:2: 'changeTableCss'
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
    // InternalAdaptDsl.g:7231:1: rule__ChangeTableCssClassOperation__Group__1 : rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 ;
    public final void rule__ChangeTableCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7235:1: ( rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:7236:2: rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:7243:1: rule__ChangeTableCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7247:1: ( ( '(' ) )
            // InternalAdaptDsl.g:7248:1: ( '(' )
            {
            // InternalAdaptDsl.g:7248:1: ( '(' )
            // InternalAdaptDsl.g:7249:2: '('
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7258:1: rule__ChangeTableCssClassOperation__Group__2 : rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 ;
    public final void rule__ChangeTableCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7262:1: ( rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:7263:2: rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:7270:1: rule__ChangeTableCssClassOperation__Group__2__Impl : ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeTableCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7274:1: ( ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:7275:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7275:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:7276:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:7277:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:7277:3: rule__ChangeTableCssClassOperation__TextAssignment_2
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
    // InternalAdaptDsl.g:7285:1: rule__ChangeTableCssClassOperation__Group__3 : rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 ;
    public final void rule__ChangeTableCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7289:1: ( rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:7290:2: rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:7297:1: rule__ChangeTableCssClassOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7301:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7302:1: ( ')' )
            {
            // InternalAdaptDsl.g:7302:1: ( ')' )
            // InternalAdaptDsl.g:7303:2: ')'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7312:1: rule__ChangeTableCssClassOperation__Group__4 : rule__ChangeTableCssClassOperation__Group__4__Impl ;
    public final void rule__ChangeTableCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7316:1: ( rule__ChangeTableCssClassOperation__Group__4__Impl )
            // InternalAdaptDsl.g:7317:2: rule__ChangeTableCssClassOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:7323:1: rule__ChangeTableCssClassOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7327:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7328:1: ( ';' )
            {
            // InternalAdaptDsl.g:7328:1: ( ';' )
            // InternalAdaptDsl.g:7329:2: ';'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7339:1: rule__AdaptCssClassOperation__Group__0 : rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 ;
    public final void rule__AdaptCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7343:1: ( rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:7344:2: rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAdaptDsl.g:7351:1: rule__AdaptCssClassOperation__Group__0__Impl : ( 'adaptCssClass' ) ;
    public final void rule__AdaptCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7355:1: ( ( 'adaptCssClass' ) )
            // InternalAdaptDsl.g:7356:1: ( 'adaptCssClass' )
            {
            // InternalAdaptDsl.g:7356:1: ( 'adaptCssClass' )
            // InternalAdaptDsl.g:7357:2: 'adaptCssClass'
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
    // InternalAdaptDsl.g:7366:1: rule__AdaptCssClassOperation__Group__1 : rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 ;
    public final void rule__AdaptCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7370:1: ( rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:7371:2: rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:7378:1: rule__AdaptCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AdaptCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7382:1: ( ( '(' ) )
            // InternalAdaptDsl.g:7383:1: ( '(' )
            {
            // InternalAdaptDsl.g:7383:1: ( '(' )
            // InternalAdaptDsl.g:7384:2: '('
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7393:1: rule__AdaptCssClassOperation__Group__2 : rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 ;
    public final void rule__AdaptCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7397:1: ( rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:7398:2: rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:7405:1: rule__AdaptCssClassOperation__Group__2__Impl : ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7409:1: ( ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) )
            // InternalAdaptDsl.g:7410:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7410:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            // InternalAdaptDsl.g:7411:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssClassAssignment_2()); 
            // InternalAdaptDsl.g:7412:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            // InternalAdaptDsl.g:7412:3: rule__AdaptCssClassOperation__CssClassAssignment_2
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
    // InternalAdaptDsl.g:7420:1: rule__AdaptCssClassOperation__Group__3 : rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 ;
    public final void rule__AdaptCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7424:1: ( rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:7425:2: rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:7432:1: rule__AdaptCssClassOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7436:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7437:1: ( ',' )
            {
            // InternalAdaptDsl.g:7437:1: ( ',' )
            // InternalAdaptDsl.g:7438:2: ','
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
    // InternalAdaptDsl.g:7447:1: rule__AdaptCssClassOperation__Group__4 : rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 ;
    public final void rule__AdaptCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7451:1: ( rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 )
            // InternalAdaptDsl.g:7452:2: rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:7459:1: rule__AdaptCssClassOperation__Group__4__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7463:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) )
            // InternalAdaptDsl.g:7464:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            {
            // InternalAdaptDsl.g:7464:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            // InternalAdaptDsl.g:7465:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAssignment_4()); 
            // InternalAdaptDsl.g:7466:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            // InternalAdaptDsl.g:7466:3: rule__AdaptCssClassOperation__CssAttributeAssignment_4
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
    // InternalAdaptDsl.g:7474:1: rule__AdaptCssClassOperation__Group__5 : rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 ;
    public final void rule__AdaptCssClassOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7478:1: ( rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 )
            // InternalAdaptDsl.g:7479:2: rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:7486:1: rule__AdaptCssClassOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7490:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7491:1: ( ',' )
            {
            // InternalAdaptDsl.g:7491:1: ( ',' )
            // InternalAdaptDsl.g:7492:2: ','
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
    // InternalAdaptDsl.g:7501:1: rule__AdaptCssClassOperation__Group__6 : rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 ;
    public final void rule__AdaptCssClassOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7505:1: ( rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 )
            // InternalAdaptDsl.g:7506:2: rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalAdaptDsl.g:7513:1: rule__AdaptCssClassOperation__Group__6__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7517:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) )
            // InternalAdaptDsl.g:7518:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            {
            // InternalAdaptDsl.g:7518:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            // InternalAdaptDsl.g:7519:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAssignment_6()); 
            // InternalAdaptDsl.g:7520:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            // InternalAdaptDsl.g:7520:3: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6
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
    // InternalAdaptDsl.g:7528:1: rule__AdaptCssClassOperation__Group__7 : rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 ;
    public final void rule__AdaptCssClassOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7532:1: ( rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 )
            // InternalAdaptDsl.g:7533:2: rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:7540:1: rule__AdaptCssClassOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AdaptCssClassOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7544:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7545:1: ( ')' )
            {
            // InternalAdaptDsl.g:7545:1: ( ')' )
            // InternalAdaptDsl.g:7546:2: ')'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7555:1: rule__AdaptCssClassOperation__Group__8 : rule__AdaptCssClassOperation__Group__8__Impl ;
    public final void rule__AdaptCssClassOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7559:1: ( rule__AdaptCssClassOperation__Group__8__Impl )
            // InternalAdaptDsl.g:7560:2: rule__AdaptCssClassOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:7566:1: rule__AdaptCssClassOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AdaptCssClassOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7570:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7571:1: ( ';' )
            {
            // InternalAdaptDsl.g:7571:1: ( ';' )
            // InternalAdaptDsl.g:7572:2: ';'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7582:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7586:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAdaptDsl.g:7587:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:7594:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7598:1: ( ( 'Entity' ) )
            // InternalAdaptDsl.g:7599:1: ( 'Entity' )
            {
            // InternalAdaptDsl.g:7599:1: ( 'Entity' )
            // InternalAdaptDsl.g:7600:2: 'Entity'
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
    // InternalAdaptDsl.g:7609:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7613:1: ( rule__Entity__Group__1__Impl )
            // InternalAdaptDsl.g:7614:2: rule__Entity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptDsl.g:7620:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7624:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:7625:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:7625:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalAdaptDsl.g:7626:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:7627:2: ( rule__Entity__NameAssignment_1 )
            // InternalAdaptDsl.g:7627:3: rule__Entity__NameAssignment_1
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


    // $ANTLR start "rule__Property__Group__0"
    // InternalAdaptDsl.g:7636:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7640:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalAdaptDsl.g:7641:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAdaptDsl.g:7648:1: rule__Property__Group__0__Impl : ( ( rule__Property__NameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7652:1: ( ( ( rule__Property__NameAssignment_0 ) ) )
            // InternalAdaptDsl.g:7653:1: ( ( rule__Property__NameAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7653:1: ( ( rule__Property__NameAssignment_0 ) )
            // InternalAdaptDsl.g:7654:2: ( rule__Property__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_0()); 
            // InternalAdaptDsl.g:7655:2: ( rule__Property__NameAssignment_0 )
            // InternalAdaptDsl.g:7655:3: rule__Property__NameAssignment_0
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
    // InternalAdaptDsl.g:7663:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7667:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalAdaptDsl.g:7668:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalAdaptDsl.g:7675:1: rule__Property__Group__1__Impl : ( '{' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7679:1: ( ( '{' ) )
            // InternalAdaptDsl.g:7680:1: ( '{' )
            {
            // InternalAdaptDsl.g:7680:1: ( '{' )
            // InternalAdaptDsl.g:7681:2: '{'
            {
             before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7690:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7694:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalAdaptDsl.g:7695:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:7702:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7706:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalAdaptDsl.g:7707:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7707:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalAdaptDsl.g:7708:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalAdaptDsl.g:7709:2: ( rule__Property__TypeAssignment_2 )
            // InternalAdaptDsl.g:7709:3: rule__Property__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7717:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7721:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalAdaptDsl.g:7722:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalAdaptDsl.g:7729:1: rule__Property__Group__3__Impl : ( ',' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7733:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7734:1: ( ',' )
            {
            // InternalAdaptDsl.g:7734:1: ( ',' )
            // InternalAdaptDsl.g:7735:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7744:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7748:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalAdaptDsl.g:7749:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:7756:1: rule__Property__Group__4__Impl : ( 'provider' ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7760:1: ( ( 'provider' ) )
            // InternalAdaptDsl.g:7761:1: ( 'provider' )
            {
            // InternalAdaptDsl.g:7761:1: ( 'provider' )
            // InternalAdaptDsl.g:7762:2: 'provider'
            {
             before(grammarAccess.getPropertyAccess().getProviderKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getProviderKeyword_4()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7771:1: rule__Property__Group__5 : rule__Property__Group__5__Impl rule__Property__Group__6 ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7775:1: ( rule__Property__Group__5__Impl rule__Property__Group__6 )
            // InternalAdaptDsl.g:7776:2: rule__Property__Group__5__Impl rule__Property__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:7783:1: rule__Property__Group__5__Impl : ( ( rule__Property__ProviderAssignment_5 ) ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7787:1: ( ( ( rule__Property__ProviderAssignment_5 ) ) )
            // InternalAdaptDsl.g:7788:1: ( ( rule__Property__ProviderAssignment_5 ) )
            {
            // InternalAdaptDsl.g:7788:1: ( ( rule__Property__ProviderAssignment_5 ) )
            // InternalAdaptDsl.g:7789:2: ( rule__Property__ProviderAssignment_5 )
            {
             before(grammarAccess.getPropertyAccess().getProviderAssignment_5()); 
            // InternalAdaptDsl.g:7790:2: ( rule__Property__ProviderAssignment_5 )
            // InternalAdaptDsl.g:7790:3: rule__Property__ProviderAssignment_5
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
    // InternalAdaptDsl.g:7798:1: rule__Property__Group__6 : rule__Property__Group__6__Impl rule__Property__Group__7 ;
    public final void rule__Property__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7802:1: ( rule__Property__Group__6__Impl rule__Property__Group__7 )
            // InternalAdaptDsl.g:7803:2: rule__Property__Group__6__Impl rule__Property__Group__7
            {
            pushFollow(FOLLOW_46);
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
    // InternalAdaptDsl.g:7810:1: rule__Property__Group__6__Impl : ( ',' ) ;
    public final void rule__Property__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7814:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7815:1: ( ',' )
            {
            // InternalAdaptDsl.g:7815:1: ( ',' )
            // InternalAdaptDsl.g:7816:2: ','
            {
             before(grammarAccess.getPropertyAccess().getCommaKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getCommaKeyword_6()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7825:1: rule__Property__Group__7 : rule__Property__Group__7__Impl rule__Property__Group__8 ;
    public final void rule__Property__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7829:1: ( rule__Property__Group__7__Impl rule__Property__Group__8 )
            // InternalAdaptDsl.g:7830:2: rule__Property__Group__7__Impl rule__Property__Group__8
            {
            pushFollow(FOLLOW_47);
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
    // InternalAdaptDsl.g:7837:1: rule__Property__Group__7__Impl : ( 'update' ) ;
    public final void rule__Property__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7841:1: ( ( 'update' ) )
            // InternalAdaptDsl.g:7842:1: ( 'update' )
            {
            // InternalAdaptDsl.g:7842:1: ( 'update' )
            // InternalAdaptDsl.g:7843:2: 'update'
            {
             before(grammarAccess.getPropertyAccess().getUpdateKeyword_7()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getUpdateKeyword_7()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7852:1: rule__Property__Group__8 : rule__Property__Group__8__Impl rule__Property__Group__9 ;
    public final void rule__Property__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7856:1: ( rule__Property__Group__8__Impl rule__Property__Group__9 )
            // InternalAdaptDsl.g:7857:2: rule__Property__Group__8__Impl rule__Property__Group__9
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:7864:1: rule__Property__Group__8__Impl : ( ( rule__Property__UpdateAssignment_8 ) ) ;
    public final void rule__Property__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7868:1: ( ( ( rule__Property__UpdateAssignment_8 ) ) )
            // InternalAdaptDsl.g:7869:1: ( ( rule__Property__UpdateAssignment_8 ) )
            {
            // InternalAdaptDsl.g:7869:1: ( ( rule__Property__UpdateAssignment_8 ) )
            // InternalAdaptDsl.g:7870:2: ( rule__Property__UpdateAssignment_8 )
            {
             before(grammarAccess.getPropertyAccess().getUpdateAssignment_8()); 
            // InternalAdaptDsl.g:7871:2: ( rule__Property__UpdateAssignment_8 )
            // InternalAdaptDsl.g:7871:3: rule__Property__UpdateAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Property__UpdateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getUpdateAssignment_8()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7879:1: rule__Property__Group__9 : rule__Property__Group__9__Impl ;
    public final void rule__Property__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7883:1: ( rule__Property__Group__9__Impl )
            // InternalAdaptDsl.g:7884:2: rule__Property__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptDsl.g:7890:1: rule__Property__Group__9__Impl : ( '};' ) ;
    public final void rule__Property__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7894:1: ( ( '};' ) )
            // InternalAdaptDsl.g:7895:1: ( '};' )
            {
            // InternalAdaptDsl.g:7895:1: ( '};' )
            // InternalAdaptDsl.g:7896:2: '};'
            {
             before(grammarAccess.getPropertyAccess().getRightCurlyBracketSemicolonKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightCurlyBracketSemicolonKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__DefTypes__Group__0"
    // InternalAdaptDsl.g:7906:1: rule__DefTypes__Group__0 : rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 ;
    public final void rule__DefTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7910:1: ( rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 )
            // InternalAdaptDsl.g:7911:2: rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:7918:1: rule__DefTypes__Group__0__Impl : ( ( rule__DefTypes__ThisAssignment_0 ) ) ;
    public final void rule__DefTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7922:1: ( ( ( rule__DefTypes__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:7923:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7923:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:7924:2: ( rule__DefTypes__ThisAssignment_0 )
            {
             before(grammarAccess.getDefTypesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:7925:2: ( rule__DefTypes__ThisAssignment_0 )
            // InternalAdaptDsl.g:7925:3: rule__DefTypes__ThisAssignment_0
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
    // InternalAdaptDsl.g:7933:1: rule__DefTypes__Group__1 : rule__DefTypes__Group__1__Impl ;
    public final void rule__DefTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7937:1: ( rule__DefTypes__Group__1__Impl )
            // InternalAdaptDsl.g:7938:2: rule__DefTypes__Group__1__Impl
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
    // InternalAdaptDsl.g:7944:1: rule__DefTypes__Group__1__Impl : ( ( rule__DefTypes__NextAssignment_1 )? ) ;
    public final void rule__DefTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7948:1: ( ( ( rule__DefTypes__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:7949:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:7949:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            // InternalAdaptDsl.g:7950:2: ( rule__DefTypes__NextAssignment_1 )?
            {
             before(grammarAccess.getDefTypesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:7951:2: ( rule__DefTypes__NextAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdaptDsl.g:7951:3: rule__DefTypes__NextAssignment_1
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
    // InternalAdaptDsl.g:7960:1: rule__DefType__Group__0 : rule__DefType__Group__0__Impl rule__DefType__Group__1 ;
    public final void rule__DefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7964:1: ( rule__DefType__Group__0__Impl rule__DefType__Group__1 )
            // InternalAdaptDsl.g:7965:2: rule__DefType__Group__0__Impl rule__DefType__Group__1
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
    // InternalAdaptDsl.g:7972:1: rule__DefType__Group__0__Impl : ( ( rule__DefType__NameAssignment_0 ) ) ;
    public final void rule__DefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7976:1: ( ( ( rule__DefType__NameAssignment_0 ) ) )
            // InternalAdaptDsl.g:7977:1: ( ( rule__DefType__NameAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7977:1: ( ( rule__DefType__NameAssignment_0 ) )
            // InternalAdaptDsl.g:7978:2: ( rule__DefType__NameAssignment_0 )
            {
             before(grammarAccess.getDefTypeAccess().getNameAssignment_0()); 
            // InternalAdaptDsl.g:7979:2: ( rule__DefType__NameAssignment_0 )
            // InternalAdaptDsl.g:7979:3: rule__DefType__NameAssignment_0
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
    // InternalAdaptDsl.g:7987:1: rule__DefType__Group__1 : rule__DefType__Group__1__Impl rule__DefType__Group__2 ;
    public final void rule__DefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7991:1: ( rule__DefType__Group__1__Impl rule__DefType__Group__2 )
            // InternalAdaptDsl.g:7992:2: rule__DefType__Group__1__Impl rule__DefType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:7999:1: rule__DefType__Group__1__Impl : ( ':' ) ;
    public final void rule__DefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8003:1: ( ( ':' ) )
            // InternalAdaptDsl.g:8004:1: ( ':' )
            {
            // InternalAdaptDsl.g:8004:1: ( ':' )
            // InternalAdaptDsl.g:8005:2: ':'
            {
             before(grammarAccess.getDefTypeAccess().getColonKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdaptDsl.g:8014:1: rule__DefType__Group__2 : rule__DefType__Group__2__Impl rule__DefType__Group__3 ;
    public final void rule__DefType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8018:1: ( rule__DefType__Group__2__Impl rule__DefType__Group__3 )
            // InternalAdaptDsl.g:8019:2: rule__DefType__Group__2__Impl rule__DefType__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:8026:1: rule__DefType__Group__2__Impl : ( ( rule__DefType__EnumsAssignment_2 ) ) ;
    public final void rule__DefType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8030:1: ( ( ( rule__DefType__EnumsAssignment_2 ) ) )
            // InternalAdaptDsl.g:8031:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            {
            // InternalAdaptDsl.g:8031:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            // InternalAdaptDsl.g:8032:2: ( rule__DefType__EnumsAssignment_2 )
            {
             before(grammarAccess.getDefTypeAccess().getEnumsAssignment_2()); 
            // InternalAdaptDsl.g:8033:2: ( rule__DefType__EnumsAssignment_2 )
            // InternalAdaptDsl.g:8033:3: rule__DefType__EnumsAssignment_2
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
    // InternalAdaptDsl.g:8041:1: rule__DefType__Group__3 : rule__DefType__Group__3__Impl ;
    public final void rule__DefType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8045:1: ( rule__DefType__Group__3__Impl )
            // InternalAdaptDsl.g:8046:2: rule__DefType__Group__3__Impl
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
    // InternalAdaptDsl.g:8052:1: rule__DefType__Group__3__Impl : ( ';' ) ;
    public final void rule__DefType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8056:1: ( ( ';' ) )
            // InternalAdaptDsl.g:8057:1: ( ';' )
            {
            // InternalAdaptDsl.g:8057:1: ( ';' )
            // InternalAdaptDsl.g:8058:2: ';'
            {
             before(grammarAccess.getDefTypeAccess().getSemicolonKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:8068:1: rule__Enums__Group__0 : rule__Enums__Group__0__Impl rule__Enums__Group__1 ;
    public final void rule__Enums__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8072:1: ( rule__Enums__Group__0__Impl rule__Enums__Group__1 )
            // InternalAdaptDsl.g:8073:2: rule__Enums__Group__0__Impl rule__Enums__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAdaptDsl.g:8080:1: rule__Enums__Group__0__Impl : ( ( rule__Enums__ThisAssignment_0 ) ) ;
    public final void rule__Enums__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8084:1: ( ( ( rule__Enums__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:8085:1: ( ( rule__Enums__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:8085:1: ( ( rule__Enums__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:8086:2: ( rule__Enums__ThisAssignment_0 )
            {
             before(grammarAccess.getEnumsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:8087:2: ( rule__Enums__ThisAssignment_0 )
            // InternalAdaptDsl.g:8087:3: rule__Enums__ThisAssignment_0
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
    // InternalAdaptDsl.g:8095:1: rule__Enums__Group__1 : rule__Enums__Group__1__Impl ;
    public final void rule__Enums__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8099:1: ( rule__Enums__Group__1__Impl )
            // InternalAdaptDsl.g:8100:2: rule__Enums__Group__1__Impl
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
    // InternalAdaptDsl.g:8106:1: rule__Enums__Group__1__Impl : ( ( rule__Enums__Group_1__0 )? ) ;
    public final void rule__Enums__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8110:1: ( ( ( rule__Enums__Group_1__0 )? ) )
            // InternalAdaptDsl.g:8111:1: ( ( rule__Enums__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:8111:1: ( ( rule__Enums__Group_1__0 )? )
            // InternalAdaptDsl.g:8112:2: ( rule__Enums__Group_1__0 )?
            {
             before(grammarAccess.getEnumsAccess().getGroup_1()); 
            // InternalAdaptDsl.g:8113:2: ( rule__Enums__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAdaptDsl.g:8113:3: rule__Enums__Group_1__0
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
    // InternalAdaptDsl.g:8122:1: rule__Enums__Group_1__0 : rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 ;
    public final void rule__Enums__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8126:1: ( rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 )
            // InternalAdaptDsl.g:8127:2: rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAdaptDsl.g:8134:1: rule__Enums__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enums__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8138:1: ( ( ',' ) )
            // InternalAdaptDsl.g:8139:1: ( ',' )
            {
            // InternalAdaptDsl.g:8139:1: ( ',' )
            // InternalAdaptDsl.g:8140:2: ','
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
    // InternalAdaptDsl.g:8149:1: rule__Enums__Group_1__1 : rule__Enums__Group_1__1__Impl ;
    public final void rule__Enums__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8153:1: ( rule__Enums__Group_1__1__Impl )
            // InternalAdaptDsl.g:8154:2: rule__Enums__Group_1__1__Impl
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
    // InternalAdaptDsl.g:8160:1: rule__Enums__Group_1__1__Impl : ( ( rule__Enums__NextAssignment_1_1 ) ) ;
    public final void rule__Enums__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8164:1: ( ( ( rule__Enums__NextAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:8165:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:8165:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            // InternalAdaptDsl.g:8166:2: ( rule__Enums__NextAssignment_1_1 )
            {
             before(grammarAccess.getEnumsAccess().getNextAssignment_1_1()); 
            // InternalAdaptDsl.g:8167:2: ( rule__Enums__NextAssignment_1_1 )
            // InternalAdaptDsl.g:8167:3: rule__Enums__NextAssignment_1_1
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
    // InternalAdaptDsl.g:8176:1: rule__Model__ContextModelAssignment_0 : ( ruleContextModel ) ;
    public final void rule__Model__ContextModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8180:1: ( ( ruleContextModel ) )
            // InternalAdaptDsl.g:8181:2: ( ruleContextModel )
            {
            // InternalAdaptDsl.g:8181:2: ( ruleContextModel )
            // InternalAdaptDsl.g:8182:3: ruleContextModel
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
    // InternalAdaptDsl.g:8191:1: rule__Model__AdaptationModelAssignment_1 : ( ruleAdaptationModel ) ;
    public final void rule__Model__AdaptationModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8195:1: ( ( ruleAdaptationModel ) )
            // InternalAdaptDsl.g:8196:2: ( ruleAdaptationModel )
            {
            // InternalAdaptDsl.g:8196:2: ( ruleAdaptationModel )
            // InternalAdaptDsl.g:8197:3: ruleAdaptationModel
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


    // $ANTLR start "rule__ContextModel__EntityAssignment_1_0"
    // InternalAdaptDsl.g:8206:1: rule__ContextModel__EntityAssignment_1_0 : ( ruleEntity ) ;
    public final void rule__ContextModel__EntityAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8210:1: ( ( ruleEntity ) )
            // InternalAdaptDsl.g:8211:2: ( ruleEntity )
            {
            // InternalAdaptDsl.g:8211:2: ( ruleEntity )
            // InternalAdaptDsl.g:8212:3: ruleEntity
            {
             before(grammarAccess.getContextModelAccess().getEntityEntityParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getEntityEntityParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__EntityAssignment_1_0"


    // $ANTLR start "rule__ContextModel__PropertyAssignment_1_2"
    // InternalAdaptDsl.g:8221:1: rule__ContextModel__PropertyAssignment_1_2 : ( ruleProperty ) ;
    public final void rule__ContextModel__PropertyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8225:1: ( ( ruleProperty ) )
            // InternalAdaptDsl.g:8226:2: ( ruleProperty )
            {
            // InternalAdaptDsl.g:8226:2: ( ruleProperty )
            // InternalAdaptDsl.g:8227:3: ruleProperty
            {
             before(grammarAccess.getContextModelAccess().getPropertyPropertyParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getContextModelAccess().getPropertyPropertyParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextModel__PropertyAssignment_1_2"


    // $ANTLR start "rule__ContextModel__ProviderAssignment_2_1_0"
    // InternalAdaptDsl.g:8236:1: rule__ContextModel__ProviderAssignment_2_1_0 : ( ruleProvider ) ;
    public final void rule__ContextModel__ProviderAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8240:1: ( ( ruleProvider ) )
            // InternalAdaptDsl.g:8241:2: ( ruleProvider )
            {
            // InternalAdaptDsl.g:8241:2: ( ruleProvider )
            // InternalAdaptDsl.g:8242:3: ruleProvider
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
    // InternalAdaptDsl.g:8251:1: rule__ContextModel__TypesAssignment_3_1 : ( ruleDefTypes ) ;
    public final void rule__ContextModel__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8255:1: ( ( ruleDefTypes ) )
            // InternalAdaptDsl.g:8256:2: ( ruleDefTypes )
            {
            // InternalAdaptDsl.g:8256:2: ( ruleDefTypes )
            // InternalAdaptDsl.g:8257:3: ruleDefTypes
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
    // InternalAdaptDsl.g:8266:1: rule__AdaptationModel__ServicesAssignment_1 : ( ruleServices ) ;
    public final void rule__AdaptationModel__ServicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8270:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:8271:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:8271:2: ( ruleServices )
            // InternalAdaptDsl.g:8272:3: ruleServices
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
    // InternalAdaptDsl.g:8281:1: rule__AdaptationModel__FlowNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AdaptationModel__FlowNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8285:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8286:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8286:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8287:3: RULE_STRING
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
    // InternalAdaptDsl.g:8296:1: rule__AdaptationModel__AdaptationRulesAssignment_5 : ( ruleAdaptationRule ) ;
    public final void rule__AdaptationModel__AdaptationRulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8300:1: ( ( ruleAdaptationRule ) )
            // InternalAdaptDsl.g:8301:2: ( ruleAdaptationRule )
            {
            // InternalAdaptDsl.g:8301:2: ( ruleAdaptationRule )
            // InternalAdaptDsl.g:8302:3: ruleAdaptationRule
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
    // InternalAdaptDsl.g:8311:1: rule__Services__ThisAssignment_0 : ( ruleService ) ;
    public final void rule__Services__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8315:1: ( ( ruleService ) )
            // InternalAdaptDsl.g:8316:2: ( ruleService )
            {
            // InternalAdaptDsl.g:8316:2: ( ruleService )
            // InternalAdaptDsl.g:8317:3: ruleService
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
    // InternalAdaptDsl.g:8326:1: rule__Services__NextAssignment_1 : ( ruleServices ) ;
    public final void rule__Services__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8330:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:8331:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:8331:2: ( ruleServices )
            // InternalAdaptDsl.g:8332:3: ruleServices
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
    // InternalAdaptDsl.g:8341:1: rule__Service__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8345:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8346:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8346:2: ( RULE_ID )
            // InternalAdaptDsl.g:8347:3: RULE_ID
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
    // InternalAdaptDsl.g:8356:1: rule__Service__LocAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Service__LocAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8360:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8361:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8361:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8362:3: RULE_STRING
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
    // InternalAdaptDsl.g:8371:1: rule__Service__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Service__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8375:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8376:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8376:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8377:3: RULE_STRING
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
    // InternalAdaptDsl.g:8386:1: rule__Service__FunctionsAssignment_7 : ( ruleFunctions ) ;
    public final void rule__Service__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8390:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:8391:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:8391:2: ( ruleFunctions )
            // InternalAdaptDsl.g:8392:3: ruleFunctions
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
    // InternalAdaptDsl.g:8401:1: rule__Functions__ThisAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8405:1: ( ( ruleFunction ) )
            // InternalAdaptDsl.g:8406:2: ( ruleFunction )
            {
            // InternalAdaptDsl.g:8406:2: ( ruleFunction )
            // InternalAdaptDsl.g:8407:3: ruleFunction
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
    // InternalAdaptDsl.g:8416:1: rule__Functions__NextAssignment_1 : ( ruleFunctions ) ;
    public final void rule__Functions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8420:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:8421:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:8421:2: ( ruleFunctions )
            // InternalAdaptDsl.g:8422:3: ruleFunctions
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
    // InternalAdaptDsl.g:8431:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8435:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8436:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8436:2: ( RULE_ID )
            // InternalAdaptDsl.g:8437:3: RULE_ID
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
    // InternalAdaptDsl.g:8446:1: rule__Function__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8450:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8451:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8451:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8452:3: RULE_STRING
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
    // InternalAdaptDsl.g:8461:1: rule__AdaptationRule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdaptationRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8465:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8466:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8466:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8467:3: RULE_STRING
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


    // $ANTLR start "rule__AdaptationRule__FactTypeAssignment_4"
    // InternalAdaptDsl.g:8476:1: rule__AdaptationRule__FactTypeAssignment_4 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8480:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8481:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8481:2: ( RULE_ID )
            // InternalAdaptDsl.g:8482:3: RULE_ID
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getFactTypeIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationRule__FactTypeAssignment_4"


    // $ANTLR start "rule__AdaptationRule__FactNameAssignment_5"
    // InternalAdaptDsl.g:8491:1: rule__AdaptationRule__FactNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8495:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8496:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8496:2: ( RULE_ID )
            // InternalAdaptDsl.g:8497:3: RULE_ID
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdaptationRuleAccess().getFactNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationRule__FactNameAssignment_5"


    // $ANTLR start "rule__AdaptationRule__ExprAssignment_9"
    // InternalAdaptDsl.g:8506:1: rule__AdaptationRule__ExprAssignment_9 : ( ruleConditionalOR ) ;
    public final void rule__AdaptationRule__ExprAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8510:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:8511:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:8511:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:8512:3: ruleConditionalOR
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionalOR();

            state._fsp--;

             after(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationRule__ExprAssignment_9"


    // $ANTLR start "rule__AdaptationRule__ActionCollectionAssignment_13"
    // InternalAdaptDsl.g:8521:1: rule__AdaptationRule__ActionCollectionAssignment_13 : ( ruleActions ) ;
    public final void rule__AdaptationRule__ActionCollectionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8525:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:8526:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:8526:2: ( ruleActions )
            // InternalAdaptDsl.g:8527:3: ruleActions
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptationRule__ActionCollectionAssignment_13"


    // $ANTLR start "rule__ConditionalOR__LeftAssignment_0"
    // InternalAdaptDsl.g:8536:1: rule__ConditionalOR__LeftAssignment_0 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalOR__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8540:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:8541:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:8541:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:8542:3: ruleConditionalAND
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
    // InternalAdaptDsl.g:8551:1: rule__ConditionalOR__RightAssignment_1_1 : ( ruleConditionalOR ) ;
    public final void rule__ConditionalOR__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8555:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:8556:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:8556:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:8557:3: ruleConditionalOR
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
    // InternalAdaptDsl.g:8566:1: rule__ConditionalAND__LeftAssignment_0 : ( ruleConditionalPrimary ) ;
    public final void rule__ConditionalAND__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8570:1: ( ( ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:8571:2: ( ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:8571:2: ( ruleConditionalPrimary )
            // InternalAdaptDsl.g:8572:3: ruleConditionalPrimary
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
    // InternalAdaptDsl.g:8581:1: rule__ConditionalAND__RightAssignment_1_1 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalAND__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8585:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:8586:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:8586:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:8587:3: ruleConditionalAND
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
    // InternalAdaptDsl.g:8596:1: rule__ConditionalPrimary__CondAssignment_0 : ( ruleStringCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8600:1: ( ( ruleStringCondition ) )
            // InternalAdaptDsl.g:8601:2: ( ruleStringCondition )
            {
            // InternalAdaptDsl.g:8601:2: ( ruleStringCondition )
            // InternalAdaptDsl.g:8602:3: ruleStringCondition
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
    // InternalAdaptDsl.g:8611:1: rule__ConditionalPrimary__CondAssignment_1 : ( ruleNumberCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8615:1: ( ( ruleNumberCondition ) )
            // InternalAdaptDsl.g:8616:2: ( ruleNumberCondition )
            {
            // InternalAdaptDsl.g:8616:2: ( ruleNumberCondition )
            // InternalAdaptDsl.g:8617:3: ruleNumberCondition
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
    // InternalAdaptDsl.g:8626:1: rule__ConditionalPrimary__CondAssignment_2 : ( ruleBooleanCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8630:1: ( ( ruleBooleanCondition ) )
            // InternalAdaptDsl.g:8631:2: ( ruleBooleanCondition )
            {
            // InternalAdaptDsl.g:8631:2: ( ruleBooleanCondition )
            // InternalAdaptDsl.g:8632:3: ruleBooleanCondition
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
    // InternalAdaptDsl.g:8641:1: rule__BooleanCondition__FactAssignment_0_0 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8645:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8646:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8646:2: ( ruleFact )
            // InternalAdaptDsl.g:8647:3: ruleFact
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
    // InternalAdaptDsl.g:8656:1: rule__BooleanCondition__OpAssignment_0_1 : ( ruleBoolOperators ) ;
    public final void rule__BooleanCondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8660:1: ( ( ruleBoolOperators ) )
            // InternalAdaptDsl.g:8661:2: ( ruleBoolOperators )
            {
            // InternalAdaptDsl.g:8661:2: ( ruleBoolOperators )
            // InternalAdaptDsl.g:8662:3: ruleBoolOperators
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
    // InternalAdaptDsl.g:8671:1: rule__BooleanCondition__ValAssignment_0_2 : ( RULE_BOOL ) ;
    public final void rule__BooleanCondition__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8675:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:8676:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:8676:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:8677:3: RULE_BOOL
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
    // InternalAdaptDsl.g:8686:1: rule__BooleanCondition__FactAssignment_1 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8690:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8691:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8691:2: ( ruleFact )
            // InternalAdaptDsl.g:8692:3: ruleFact
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
    // InternalAdaptDsl.g:8701:1: rule__NumberCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__NumberCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8705:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8706:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8706:2: ( ruleFact )
            // InternalAdaptDsl.g:8707:3: ruleFact
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
    // InternalAdaptDsl.g:8716:1: rule__NumberCondition__OpAssignment_1 : ( ruleNumberOperators ) ;
    public final void rule__NumberCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8720:1: ( ( ruleNumberOperators ) )
            // InternalAdaptDsl.g:8721:2: ( ruleNumberOperators )
            {
            // InternalAdaptDsl.g:8721:2: ( ruleNumberOperators )
            // InternalAdaptDsl.g:8722:3: ruleNumberOperators
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
    // InternalAdaptDsl.g:8731:1: rule__NumberCondition__ValAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8735:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8736:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8736:2: ( RULE_INT )
            // InternalAdaptDsl.g:8737:3: RULE_INT
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
    // InternalAdaptDsl.g:8746:1: rule__StringCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__StringCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8750:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8751:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8751:2: ( ruleFact )
            // InternalAdaptDsl.g:8752:3: ruleFact
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
    // InternalAdaptDsl.g:8761:1: rule__StringCondition__OpAssignment_1 : ( ruleStringOperators ) ;
    public final void rule__StringCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8765:1: ( ( ruleStringOperators ) )
            // InternalAdaptDsl.g:8766:2: ( ruleStringOperators )
            {
            // InternalAdaptDsl.g:8766:2: ( ruleStringOperators )
            // InternalAdaptDsl.g:8767:3: ruleStringOperators
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
    // InternalAdaptDsl.g:8776:1: rule__StringCondition__ValAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8780:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8781:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8781:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8782:3: RULE_STRING
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


    // $ANTLR start "rule__Fact__EntityAssignment_2"
    // InternalAdaptDsl.g:8791:1: rule__Fact__EntityAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fact__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8795:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptDsl.g:8796:2: ( ( RULE_ID ) )
            {
            // InternalAdaptDsl.g:8796:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8797:3: ( RULE_ID )
            {
             before(grammarAccess.getFactAccess().getEntityEntityCrossReference_2_0()); 
            // InternalAdaptDsl.g:8798:3: ( RULE_ID )
            // InternalAdaptDsl.g:8799:4: RULE_ID
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
    // InternalAdaptDsl.g:8810:1: rule__Fact__PropertyNameAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Fact__PropertyNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8814:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptDsl.g:8815:2: ( ( RULE_ID ) )
            {
            // InternalAdaptDsl.g:8815:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8816:3: ( RULE_ID )
            {
             before(grammarAccess.getFactAccess().getPropertyNamePropertyCrossReference_5_0()); 
            // InternalAdaptDsl.g:8817:3: ( RULE_ID )
            // InternalAdaptDsl.g:8818:4: RULE_ID
            {
             before(grammarAccess.getFactAccess().getPropertyNamePropertyIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getPropertyNamePropertyIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getFactAccess().getPropertyNamePropertyCrossReference_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Actions__ActionAssignment_0"
    // InternalAdaptDsl.g:8829:1: rule__Actions__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Actions__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8833:1: ( ( ruleAction ) )
            // InternalAdaptDsl.g:8834:2: ( ruleAction )
            {
            // InternalAdaptDsl.g:8834:2: ( ruleAction )
            // InternalAdaptDsl.g:8835:3: ruleAction
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
    // InternalAdaptDsl.g:8844:1: rule__Actions__NextAssignment_1 : ( ruleActions ) ;
    public final void rule__Actions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8848:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:8849:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:8849:2: ( ruleActions )
            // InternalAdaptDsl.g:8850:3: ruleActions
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
    // InternalAdaptDsl.g:8859:1: rule__Action__ActionCategoryAssignment_0 : ( ruleServiceOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8863:1: ( ( ruleServiceOperation ) )
            // InternalAdaptDsl.g:8864:2: ( ruleServiceOperation )
            {
            // InternalAdaptDsl.g:8864:2: ( ruleServiceOperation )
            // InternalAdaptDsl.g:8865:3: ruleServiceOperation
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
    // InternalAdaptDsl.g:8874:1: rule__Action__ActionCategoryAssignment_1 : ( ruleTaskChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8878:1: ( ( ruleTaskChangeOperation ) )
            // InternalAdaptDsl.g:8879:2: ( ruleTaskChangeOperation )
            {
            // InternalAdaptDsl.g:8879:2: ( ruleTaskChangeOperation )
            // InternalAdaptDsl.g:8880:3: ruleTaskChangeOperation
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
    // InternalAdaptDsl.g:8889:1: rule__Action__ActionCategoryAssignment_2 : ( ruleNavigationChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8893:1: ( ( ruleNavigationChangeOperation ) )
            // InternalAdaptDsl.g:8894:2: ( ruleNavigationChangeOperation )
            {
            // InternalAdaptDsl.g:8894:2: ( ruleNavigationChangeOperation )
            // InternalAdaptDsl.g:8895:3: ruleNavigationChangeOperation
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
    // InternalAdaptDsl.g:8904:1: rule__Action__ActionCategoryAssignment_3 : ( ruleLayoutChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8908:1: ( ( ruleLayoutChangeOperation ) )
            // InternalAdaptDsl.g:8909:2: ( ruleLayoutChangeOperation )
            {
            // InternalAdaptDsl.g:8909:2: ( ruleLayoutChangeOperation )
            // InternalAdaptDsl.g:8910:3: ruleLayoutChangeOperation
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
    // InternalAdaptDsl.g:8919:1: rule__ServiceOperation__OperationAssignment_0 : ( ruleServiceFunctionCallOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8923:1: ( ( ruleServiceFunctionCallOperation ) )
            // InternalAdaptDsl.g:8924:2: ( ruleServiceFunctionCallOperation )
            {
            // InternalAdaptDsl.g:8924:2: ( ruleServiceFunctionCallOperation )
            // InternalAdaptDsl.g:8925:3: ruleServiceFunctionCallOperation
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
    // InternalAdaptDsl.g:8934:1: rule__ServiceOperation__OperationAssignment_1 : ( ruleEditFactOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8938:1: ( ( ruleEditFactOperation ) )
            // InternalAdaptDsl.g:8939:2: ( ruleEditFactOperation )
            {
            // InternalAdaptDsl.g:8939:2: ( ruleEditFactOperation )
            // InternalAdaptDsl.g:8940:3: ruleEditFactOperation
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
    // InternalAdaptDsl.g:8949:1: rule__ServiceOperation__OperationAssignment_2 : ( ruleSetDisplayPropertyOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8953:1: ( ( ruleSetDisplayPropertyOperation ) )
            // InternalAdaptDsl.g:8954:2: ( ruleSetDisplayPropertyOperation )
            {
            // InternalAdaptDsl.g:8954:2: ( ruleSetDisplayPropertyOperation )
            // InternalAdaptDsl.g:8955:3: ruleSetDisplayPropertyOperation
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
    // InternalAdaptDsl.g:8964:1: rule__ServiceFunctionCallOperation__ServiceAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8968:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8969:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8969:2: ( RULE_ID )
            // InternalAdaptDsl.g:8970:3: RULE_ID
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
    // InternalAdaptDsl.g:8979:1: rule__ServiceFunctionCallOperation__FunctionAssignment_4 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8983:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8984:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8984:2: ( RULE_ID )
            // InternalAdaptDsl.g:8985:3: RULE_ID
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
    // InternalAdaptDsl.g:8994:1: rule__ServiceFunctionCallOperation__ValAssignment_6 : ( ruleValue ) ;
    public final void rule__ServiceFunctionCallOperation__ValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8998:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:8999:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:8999:2: ( ruleValue )
            // InternalAdaptDsl.g:9000:3: ruleValue
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
    // InternalAdaptDsl.g:9009:1: rule__EditFactOperation__PropAssignment_2 : ( ruleFactProperty ) ;
    public final void rule__EditFactOperation__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9013:1: ( ( ruleFactProperty ) )
            // InternalAdaptDsl.g:9014:2: ( ruleFactProperty )
            {
            // InternalAdaptDsl.g:9014:2: ( ruleFactProperty )
            // InternalAdaptDsl.g:9015:3: ruleFactProperty
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
    // InternalAdaptDsl.g:9024:1: rule__EditFactOperation__ValAssignment_3_1 : ( ruleValue ) ;
    public final void rule__EditFactOperation__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9028:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:9029:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:9029:2: ( ruleValue )
            // InternalAdaptDsl.g:9030:3: ruleValue
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
    // InternalAdaptDsl.g:9039:1: rule__SetDisplayPropertyOperation__PropertyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9043:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9044:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9044:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9045:3: RULE_STRING
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
    // InternalAdaptDsl.g:9054:1: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 : ( ruleDisplayPropertyValue ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9058:1: ( ( ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:9059:2: ( ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:9059:2: ( ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:9060:3: ruleDisplayPropertyValue
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
    // InternalAdaptDsl.g:9069:1: rule__DisplayPropertyValue__PropertyClassAssignment_0 : ( ruleIntValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9073:1: ( ( ruleIntValue ) )
            // InternalAdaptDsl.g:9074:2: ( ruleIntValue )
            {
            // InternalAdaptDsl.g:9074:2: ( ruleIntValue )
            // InternalAdaptDsl.g:9075:3: ruleIntValue
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
    // InternalAdaptDsl.g:9084:1: rule__DisplayPropertyValue__PropertyClassAssignment_1 : ( ruleStringValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9088:1: ( ( ruleStringValue ) )
            // InternalAdaptDsl.g:9089:2: ( ruleStringValue )
            {
            // InternalAdaptDsl.g:9089:2: ( ruleStringValue )
            // InternalAdaptDsl.g:9090:3: ruleStringValue
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
    // InternalAdaptDsl.g:9099:1: rule__DisplayPropertyValue__PropertyClassAssignment_2 : ( ruleBoolValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9103:1: ( ( ruleBoolValue ) )
            // InternalAdaptDsl.g:9104:2: ( ruleBoolValue )
            {
            // InternalAdaptDsl.g:9104:2: ( ruleBoolValue )
            // InternalAdaptDsl.g:9105:3: ruleBoolValue
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
    // InternalAdaptDsl.g:9114:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9118:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:9119:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:9119:2: ( RULE_INT )
            // InternalAdaptDsl.g:9120:3: RULE_INT
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
    // InternalAdaptDsl.g:9129:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9133:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9134:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9134:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9135:3: RULE_STRING
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
    // InternalAdaptDsl.g:9144:1: rule__BoolValue__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9148:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:9149:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:9149:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:9150:3: RULE_BOOL
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
    // InternalAdaptDsl.g:9159:1: rule__TaskChangeOperation__OperationAssignment_0 : ( ruleAddViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9163:1: ( ( ruleAddViewComponentOperation ) )
            // InternalAdaptDsl.g:9164:2: ( ruleAddViewComponentOperation )
            {
            // InternalAdaptDsl.g:9164:2: ( ruleAddViewComponentOperation )
            // InternalAdaptDsl.g:9165:3: ruleAddViewComponentOperation
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
    // InternalAdaptDsl.g:9174:1: rule__TaskChangeOperation__OperationAssignment_1 : ( ruleDeleteViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9178:1: ( ( ruleDeleteViewComponentOperation ) )
            // InternalAdaptDsl.g:9179:2: ( ruleDeleteViewComponentOperation )
            {
            // InternalAdaptDsl.g:9179:2: ( ruleDeleteViewComponentOperation )
            // InternalAdaptDsl.g:9180:3: ruleDeleteViewComponentOperation
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
    // InternalAdaptDsl.g:9189:1: rule__TaskChangeOperation__OperationAssignment_2 : ( ruleAddViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9193:1: ( ( ruleAddViewComponentButtonOperation ) )
            // InternalAdaptDsl.g:9194:2: ( ruleAddViewComponentButtonOperation )
            {
            // InternalAdaptDsl.g:9194:2: ( ruleAddViewComponentButtonOperation )
            // InternalAdaptDsl.g:9195:3: ruleAddViewComponentButtonOperation
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
    // InternalAdaptDsl.g:9204:1: rule__TaskChangeOperation__OperationAssignment_3 : ( ruleDeleteViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9208:1: ( ( ruleDeleteViewComponentButtonOperation ) )
            // InternalAdaptDsl.g:9209:2: ( ruleDeleteViewComponentButtonOperation )
            {
            // InternalAdaptDsl.g:9209:2: ( ruleDeleteViewComponentButtonOperation )
            // InternalAdaptDsl.g:9210:3: ruleDeleteViewComponentButtonOperation
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
    // InternalAdaptDsl.g:9219:1: rule__AddViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9223:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9224:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9224:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9225:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9234:1: rule__AddViewComponentOperation__TargetAssignment_4 : ( ruleTargetContainer ) ;
    public final void rule__AddViewComponentOperation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9238:1: ( ( ruleTargetContainer ) )
            // InternalAdaptDsl.g:9239:2: ( ruleTargetContainer )
            {
            // InternalAdaptDsl.g:9239:2: ( ruleTargetContainer )
            // InternalAdaptDsl.g:9240:3: ruleTargetContainer
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
    // InternalAdaptDsl.g:9249:1: rule__DeleteViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9253:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9254:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9254:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9255:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9264:1: rule__AddViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9268:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9269:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9269:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9270:3: RULE_STRING
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
    // InternalAdaptDsl.g:9279:1: rule__AddViewComponentButtonOperation__LangKeyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__LangKeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9283:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9284:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9284:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9285:3: RULE_STRING
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
    // InternalAdaptDsl.g:9294:1: rule__AddViewComponentButtonOperation__ActionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9298:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9299:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9299:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9300:3: RULE_STRING
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
    // InternalAdaptDsl.g:9309:1: rule__DeleteViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DeleteViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9313:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9314:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9314:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9315:3: RULE_STRING
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
    // InternalAdaptDsl.g:9324:1: rule__NavigationChangeOperation__OperationAssignment_0 : ( ruleAddNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9328:1: ( ( ruleAddNavLinkOperation ) )
            // InternalAdaptDsl.g:9329:2: ( ruleAddNavLinkOperation )
            {
            // InternalAdaptDsl.g:9329:2: ( ruleAddNavLinkOperation )
            // InternalAdaptDsl.g:9330:3: ruleAddNavLinkOperation
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
    // InternalAdaptDsl.g:9339:1: rule__NavigationChangeOperation__OperationAssignment_1 : ( ruleDeleteNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9343:1: ( ( ruleDeleteNavLinkOperation ) )
            // InternalAdaptDsl.g:9344:2: ( ruleDeleteNavLinkOperation )
            {
            // InternalAdaptDsl.g:9344:2: ( ruleDeleteNavLinkOperation )
            // InternalAdaptDsl.g:9345:3: ruleDeleteNavLinkOperation
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
    // InternalAdaptDsl.g:9354:1: rule__NavigationChangeOperation__OperationAssignment_2 : ( ruleRedirectNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9358:1: ( ( ruleRedirectNavLinkOperation ) )
            // InternalAdaptDsl.g:9359:2: ( ruleRedirectNavLinkOperation )
            {
            // InternalAdaptDsl.g:9359:2: ( ruleRedirectNavLinkOperation )
            // InternalAdaptDsl.g:9360:3: ruleRedirectNavLinkOperation
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
    // InternalAdaptDsl.g:9369:1: rule__NavigationChangeOperation__OperationAssignment_3 : ( ruleClearNavOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9373:1: ( ( ruleClearNavOperation ) )
            // InternalAdaptDsl.g:9374:2: ( ruleClearNavOperation )
            {
            // InternalAdaptDsl.g:9374:2: ( ruleClearNavOperation )
            // InternalAdaptDsl.g:9375:3: ruleClearNavOperation
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
    // InternalAdaptDsl.g:9384:1: rule__AddNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9388:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9389:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9389:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9390:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9399:1: rule__AddNavLinkOperation__TextAssignment_4 : ( ruleText ) ;
    public final void rule__AddNavLinkOperation__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9403:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9404:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9404:2: ( ruleText )
            // InternalAdaptDsl.g:9405:3: ruleText
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
    // InternalAdaptDsl.g:9414:1: rule__DeleteNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9418:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9419:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9419:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9420:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9429:1: rule__RedirectNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__RedirectNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9433:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9434:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9434:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9435:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9444:1: rule__LayoutChangeOperation__OperationAssignment_0 : ( ruleChangeFontOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9448:1: ( ( ruleChangeFontOperation ) )
            // InternalAdaptDsl.g:9449:2: ( ruleChangeFontOperation )
            {
            // InternalAdaptDsl.g:9449:2: ( ruleChangeFontOperation )
            // InternalAdaptDsl.g:9450:3: ruleChangeFontOperation
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
    // InternalAdaptDsl.g:9459:1: rule__LayoutChangeOperation__OperationAssignment_1 : ( ruleChangeFontSizeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9463:1: ( ( ruleChangeFontSizeOperation ) )
            // InternalAdaptDsl.g:9464:2: ( ruleChangeFontSizeOperation )
            {
            // InternalAdaptDsl.g:9464:2: ( ruleChangeFontSizeOperation )
            // InternalAdaptDsl.g:9465:3: ruleChangeFontSizeOperation
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
    // InternalAdaptDsl.g:9474:1: rule__LayoutChangeOperation__OperationAssignment_2 : ( ruleChangeTableCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9478:1: ( ( ruleChangeTableCssClassOperation ) )
            // InternalAdaptDsl.g:9479:2: ( ruleChangeTableCssClassOperation )
            {
            // InternalAdaptDsl.g:9479:2: ( ruleChangeTableCssClassOperation )
            // InternalAdaptDsl.g:9480:3: ruleChangeTableCssClassOperation
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
    // InternalAdaptDsl.g:9489:1: rule__LayoutChangeOperation__OperationAssignment_3 : ( ruleAdaptCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9493:1: ( ( ruleAdaptCssClassOperation ) )
            // InternalAdaptDsl.g:9494:2: ( ruleAdaptCssClassOperation )
            {
            // InternalAdaptDsl.g:9494:2: ( ruleAdaptCssClassOperation )
            // InternalAdaptDsl.g:9495:3: ruleAdaptCssClassOperation
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
    // InternalAdaptDsl.g:9504:1: rule__LayoutChangeOperation__OperationAssignment_4 : ( ruleChangeColorSchemeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9508:1: ( ( ruleChangeColorSchemeOperation ) )
            // InternalAdaptDsl.g:9509:2: ( ruleChangeColorSchemeOperation )
            {
            // InternalAdaptDsl.g:9509:2: ( ruleChangeColorSchemeOperation )
            // InternalAdaptDsl.g:9510:3: ruleChangeColorSchemeOperation
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
    // InternalAdaptDsl.g:9519:1: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizePrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9523:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:9524:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:9524:2: ( ruleFontSize )
            // InternalAdaptDsl.g:9525:3: ruleFontSize
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
    // InternalAdaptDsl.g:9534:1: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9538:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:9539:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:9539:2: ( ruleFontSize )
            // InternalAdaptDsl.g:9540:3: ruleFontSize
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
    // InternalAdaptDsl.g:9549:1: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9553:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:9554:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:9554:2: ( ruleColor )
            // InternalAdaptDsl.g:9555:3: ruleColor
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
    // InternalAdaptDsl.g:9564:1: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9568:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:9569:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:9569:2: ( ruleColor )
            // InternalAdaptDsl.g:9570:3: ruleColor
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
    // InternalAdaptDsl.g:9579:1: rule__ChangeFontOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeFontOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9583:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9584:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9584:2: ( ruleText )
            // InternalAdaptDsl.g:9585:3: ruleText
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
    // InternalAdaptDsl.g:9594:1: rule__ChangeTableCssClassOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeTableCssClassOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9598:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9599:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9599:2: ( ruleText )
            // InternalAdaptDsl.g:9600:3: ruleText
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
    // InternalAdaptDsl.g:9609:1: rule__AdaptCssClassOperation__CssClassAssignment_2 : ( ruleCssClass ) ;
    public final void rule__AdaptCssClassOperation__CssClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9613:1: ( ( ruleCssClass ) )
            // InternalAdaptDsl.g:9614:2: ( ruleCssClass )
            {
            // InternalAdaptDsl.g:9614:2: ( ruleCssClass )
            // InternalAdaptDsl.g:9615:3: ruleCssClass
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
    // InternalAdaptDsl.g:9624:1: rule__AdaptCssClassOperation__CssAttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9628:1: ( ( ruleAttribute ) )
            // InternalAdaptDsl.g:9629:2: ( ruleAttribute )
            {
            // InternalAdaptDsl.g:9629:2: ( ruleAttribute )
            // InternalAdaptDsl.g:9630:3: ruleAttribute
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
    // InternalAdaptDsl.g:9639:1: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 : ( ruleAttributeValue ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9643:1: ( ( ruleAttributeValue ) )
            // InternalAdaptDsl.g:9644:2: ( ruleAttributeValue )
            {
            // InternalAdaptDsl.g:9644:2: ( ruleAttributeValue )
            // InternalAdaptDsl.g:9645:3: ruleAttributeValue
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
    // InternalAdaptDsl.g:9654:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9658:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9659:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9659:2: ( RULE_ID )
            // InternalAdaptDsl.g:9660:3: RULE_ID
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


    // $ANTLR start "rule__Property__NameAssignment_0"
    // InternalAdaptDsl.g:9669:1: rule__Property__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9673:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9674:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9674:2: ( RULE_ID )
            // InternalAdaptDsl.g:9675:3: RULE_ID
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


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // InternalAdaptDsl.g:9684:1: rule__Property__TypeAssignment_2 : ( ruleTYPE ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9688:1: ( ( ruleTYPE ) )
            // InternalAdaptDsl.g:9689:2: ( ruleTYPE )
            {
            // InternalAdaptDsl.g:9689:2: ( ruleTYPE )
            // InternalAdaptDsl.g:9690:3: ruleTYPE
            {
             before(grammarAccess.getPropertyAccess().getTypeTYPEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getTypeTYPEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__TypeAssignment_2"


    // $ANTLR start "rule__Property__ProviderAssignment_5"
    // InternalAdaptDsl.g:9699:1: rule__Property__ProviderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ProviderAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9703:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptDsl.g:9704:2: ( ( RULE_ID ) )
            {
            // InternalAdaptDsl.g:9704:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9705:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderCrossReference_5_0()); 
            // InternalAdaptDsl.g:9706:3: ( RULE_ID )
            // InternalAdaptDsl.g:9707:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getProviderProviderIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getProviderProviderCrossReference_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Property__UpdateAssignment_8"
    // InternalAdaptDsl.g:9718:1: rule__Property__UpdateAssignment_8 : ( ruleUpdateType ) ;
    public final void rule__Property__UpdateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9722:1: ( ( ruleUpdateType ) )
            // InternalAdaptDsl.g:9723:2: ( ruleUpdateType )
            {
            // InternalAdaptDsl.g:9723:2: ( ruleUpdateType )
            // InternalAdaptDsl.g:9724:3: ruleUpdateType
            {
             before(grammarAccess.getPropertyAccess().getUpdateUpdateTypeParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getUpdateUpdateTypeParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__UpdateAssignment_8"


    // $ANTLR start "rule__Provider__NameAssignment"
    // InternalAdaptDsl.g:9733:1: rule__Provider__NameAssignment : ( RULE_ID ) ;
    public final void rule__Provider__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9737:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9738:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9738:2: ( RULE_ID )
            // InternalAdaptDsl.g:9739:3: RULE_ID
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
    // InternalAdaptDsl.g:9748:1: rule__DefTypes__ThisAssignment_0 : ( ruleDefType ) ;
    public final void rule__DefTypes__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9752:1: ( ( ruleDefType ) )
            // InternalAdaptDsl.g:9753:2: ( ruleDefType )
            {
            // InternalAdaptDsl.g:9753:2: ( ruleDefType )
            // InternalAdaptDsl.g:9754:3: ruleDefType
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
    // InternalAdaptDsl.g:9763:1: rule__DefTypes__NextAssignment_1 : ( ruleDefTypes ) ;
    public final void rule__DefTypes__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9767:1: ( ( ruleDefTypes ) )
            // InternalAdaptDsl.g:9768:2: ( ruleDefTypes )
            {
            // InternalAdaptDsl.g:9768:2: ( ruleDefTypes )
            // InternalAdaptDsl.g:9769:3: ruleDefTypes
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
    // InternalAdaptDsl.g:9778:1: rule__DefType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9782:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9783:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9783:2: ( RULE_ID )
            // InternalAdaptDsl.g:9784:3: RULE_ID
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
    // InternalAdaptDsl.g:9793:1: rule__DefType__EnumsAssignment_2 : ( ruleEnums ) ;
    public final void rule__DefType__EnumsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9797:1: ( ( ruleEnums ) )
            // InternalAdaptDsl.g:9798:2: ( ruleEnums )
            {
            // InternalAdaptDsl.g:9798:2: ( ruleEnums )
            // InternalAdaptDsl.g:9799:3: ruleEnums
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
    // InternalAdaptDsl.g:9808:1: rule__Enums__ThisAssignment_0 : ( ruleEnum ) ;
    public final void rule__Enums__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9812:1: ( ( ruleEnum ) )
            // InternalAdaptDsl.g:9813:2: ( ruleEnum )
            {
            // InternalAdaptDsl.g:9813:2: ( ruleEnum )
            // InternalAdaptDsl.g:9814:3: ruleEnum
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
    // InternalAdaptDsl.g:9823:1: rule__Enums__NextAssignment_1_1 : ( ruleEnums ) ;
    public final void rule__Enums__NextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9827:1: ( ( ruleEnums ) )
            // InternalAdaptDsl.g:9828:2: ( ruleEnums )
            {
            // InternalAdaptDsl.g:9828:2: ( ruleEnums )
            // InternalAdaptDsl.g:9829:3: ruleEnums
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
    // InternalAdaptDsl.g:9838:1: rule__Enum__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Enum__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9842:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9843:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9843:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9844:3: RULE_STRING
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
    // InternalAdaptDsl.g:9853:1: rule__TYPE__StringAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__TYPE__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9857:1: ( ( ( 'string' ) ) )
            // InternalAdaptDsl.g:9858:2: ( ( 'string' ) )
            {
            // InternalAdaptDsl.g:9858:2: ( ( 'string' ) )
            // InternalAdaptDsl.g:9859:3: ( 'string' )
            {
             before(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 
            // InternalAdaptDsl.g:9860:3: ( 'string' )
            // InternalAdaptDsl.g:9861:4: 'string'
            {
             before(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalAdaptDsl.g:9872:1: rule__TYPE__NumberAssignment_1 : ( ( 'number' ) ) ;
    public final void rule__TYPE__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9876:1: ( ( ( 'number' ) ) )
            // InternalAdaptDsl.g:9877:2: ( ( 'number' ) )
            {
            // InternalAdaptDsl.g:9877:2: ( ( 'number' ) )
            // InternalAdaptDsl.g:9878:3: ( 'number' )
            {
             before(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 
            // InternalAdaptDsl.g:9879:3: ( 'number' )
            // InternalAdaptDsl.g:9880:4: 'number'
            {
             before(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 
            match(input,66,FOLLOW_2); 
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


    // $ANTLR start "rule__TYPE__BoolAssignment_2"
    // InternalAdaptDsl.g:9891:1: rule__TYPE__BoolAssignment_2 : ( ( 'bool' ) ) ;
    public final void rule__TYPE__BoolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9895:1: ( ( ( 'bool' ) ) )
            // InternalAdaptDsl.g:9896:2: ( ( 'bool' ) )
            {
            // InternalAdaptDsl.g:9896:2: ( ( 'bool' ) )
            // InternalAdaptDsl.g:9897:3: ( 'bool' )
            {
             before(grammarAccess.getTYPEAccess().getBoolBoolKeyword_2_0()); 
            // InternalAdaptDsl.g:9898:3: ( 'bool' )
            // InternalAdaptDsl.g:9899:4: 'bool'
            {
             before(grammarAccess.getTYPEAccess().getBoolBoolKeyword_2_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTYPEAccess().getBoolBoolKeyword_2_0()); 

            }

             after(grammarAccess.getTYPEAccess().getBoolBoolKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE__BoolAssignment_2"


    // $ANTLR start "rule__TYPE__DeftypeAssignment_3"
    // InternalAdaptDsl.g:9910:1: rule__TYPE__DeftypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TYPE__DeftypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9914:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptDsl.g:9915:2: ( ( RULE_ID ) )
            {
            // InternalAdaptDsl.g:9915:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9916:3: ( RULE_ID )
            {
             before(grammarAccess.getTYPEAccess().getDeftypeDefTypeCrossReference_3_0()); 
            // InternalAdaptDsl.g:9917:3: ( RULE_ID )
            // InternalAdaptDsl.g:9918:4: RULE_ID
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
    // InternalAdaptDsl.g:9929:1: rule__UpdateType__EventAssignment_0 : ( ( 'eventTriggered' ) ) ;
    public final void rule__UpdateType__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9933:1: ( ( ( 'eventTriggered' ) ) )
            // InternalAdaptDsl.g:9934:2: ( ( 'eventTriggered' ) )
            {
            // InternalAdaptDsl.g:9934:2: ( ( 'eventTriggered' ) )
            // InternalAdaptDsl.g:9935:3: ( 'eventTriggered' )
            {
             before(grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0()); 
            // InternalAdaptDsl.g:9936:3: ( 'eventTriggered' )
            // InternalAdaptDsl.g:9937:4: 'eventTriggered'
            {
             before(grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalAdaptDsl.g:9948:1: rule__UpdateType__SlowAssignment_1 : ( ( 'slow' ) ) ;
    public final void rule__UpdateType__SlowAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9952:1: ( ( ( 'slow' ) ) )
            // InternalAdaptDsl.g:9953:2: ( ( 'slow' ) )
            {
            // InternalAdaptDsl.g:9953:2: ( ( 'slow' ) )
            // InternalAdaptDsl.g:9954:3: ( 'slow' )
            {
             before(grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0()); 
            // InternalAdaptDsl.g:9955:3: ( 'slow' )
            // InternalAdaptDsl.g:9956:4: 'slow'
            {
             before(grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalAdaptDsl.g:9967:1: rule__UpdateType__FastAssignment_2 : ( ( 'fast' ) ) ;
    public final void rule__UpdateType__FastAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9971:1: ( ( ( 'fast' ) ) )
            // InternalAdaptDsl.g:9972:2: ( ( 'fast' ) )
            {
            // InternalAdaptDsl.g:9972:2: ( ( 'fast' ) )
            // InternalAdaptDsl.g:9973:3: ( 'fast' )
            {
             before(grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0()); 
            // InternalAdaptDsl.g:9974:3: ( 'fast' )
            // InternalAdaptDsl.g:9975:4: 'fast'
            {
             before(grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0()); 
            match(input,70,FOLLOW_2); 
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
    static final String dfa_3s = "\1\50\1\51\1\4\1\52\1\51\1\4\1\52\1\14\3\5\3\uffff";
    static final String dfa_4s = "\1\50\1\51\1\4\1\52\1\51\1\4\1\52\1\47\2\7\1\6\3\uffff";
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
            "\2\13\1\10\1\11\2\13\1\12\20\uffff\1\14\2\uffff\2\14",
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
            return "1627:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\7\uffff\1\10\2\uffff";
    static final String dfa_10s = "\1\50\1\51\1\4\1\52\1\51\1\4\1\52\1\16\2\uffff";
    static final String dfa_11s = "\1\50\1\51\1\4\1\52\1\51\1\4\1\52\1\47\2\uffff";
    static final String dfa_12s = "\10\uffff\1\2\1\1";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\2\11\23\uffff\1\10\2\uffff\2\10",
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
            return "1654:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1FFFD00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000EL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}