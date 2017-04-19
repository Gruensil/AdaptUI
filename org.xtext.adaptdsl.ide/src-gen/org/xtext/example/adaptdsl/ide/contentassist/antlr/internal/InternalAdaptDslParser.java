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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'ContextModel{'", "'};'", "'Services{'", "';'", "'Types{'", "'AdaptationModel{'", "'flow'", "'{'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'()'", "'.'", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "':'", "'string'", "'number'", "'bool'"
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
    public static final int T__64=64;
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


    // $ANTLR start "rule__ConditionalPrimary__Alternatives"
    // InternalAdaptDsl.g:1602:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );
    public final void rule__ConditionalPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1606:1: ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:1607:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1607:2: ( ( rule__ConditionalPrimary__CondAssignment_0 ) )
                    // InternalAdaptDsl.g:1608:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_0()); 
                    // InternalAdaptDsl.g:1609:3: ( rule__ConditionalPrimary__CondAssignment_0 )
                    // InternalAdaptDsl.g:1609:4: rule__ConditionalPrimary__CondAssignment_0
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
                    // InternalAdaptDsl.g:1613:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1613:2: ( ( rule__ConditionalPrimary__CondAssignment_1 ) )
                    // InternalAdaptDsl.g:1614:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_1()); 
                    // InternalAdaptDsl.g:1615:3: ( rule__ConditionalPrimary__CondAssignment_1 )
                    // InternalAdaptDsl.g:1615:4: rule__ConditionalPrimary__CondAssignment_1
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
                    // InternalAdaptDsl.g:1619:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1619:2: ( ( rule__ConditionalPrimary__CondAssignment_2 ) )
                    // InternalAdaptDsl.g:1620:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    {
                     before(grammarAccess.getConditionalPrimaryAccess().getCondAssignment_2()); 
                    // InternalAdaptDsl.g:1621:3: ( rule__ConditionalPrimary__CondAssignment_2 )
                    // InternalAdaptDsl.g:1621:4: rule__ConditionalPrimary__CondAssignment_2
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
    // InternalAdaptDsl.g:1629:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );
    public final void rule__BooleanCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1633:1: ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAdaptDsl.g:1634:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    {
                    // InternalAdaptDsl.g:1634:2: ( ( rule__BooleanCondition__Group_0__0 ) )
                    // InternalAdaptDsl.g:1635:3: ( rule__BooleanCondition__Group_0__0 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getGroup_0()); 
                    // InternalAdaptDsl.g:1636:3: ( rule__BooleanCondition__Group_0__0 )
                    // InternalAdaptDsl.g:1636:4: rule__BooleanCondition__Group_0__0
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
                    // InternalAdaptDsl.g:1640:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1640:2: ( ( rule__BooleanCondition__FactAssignment_1 ) )
                    // InternalAdaptDsl.g:1641:3: ( rule__BooleanCondition__FactAssignment_1 )
                    {
                     before(grammarAccess.getBooleanConditionAccess().getFactAssignment_1()); 
                    // InternalAdaptDsl.g:1642:3: ( rule__BooleanCondition__FactAssignment_1 )
                    // InternalAdaptDsl.g:1642:4: rule__BooleanCondition__FactAssignment_1
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
    // InternalAdaptDsl.g:1650:1: rule__NumberOperators__Alternatives : ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) );
    public final void rule__NumberOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1654:1: ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '===' ) )
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
                    // InternalAdaptDsl.g:1655:2: ( '>' )
                    {
                    // InternalAdaptDsl.g:1655:2: ( '>' )
                    // InternalAdaptDsl.g:1656:3: '>'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1661:2: ( '<' )
                    {
                    // InternalAdaptDsl.g:1661:2: ( '<' )
                    // InternalAdaptDsl.g:1662:3: '<'
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1667:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1667:2: ( '==' )
                    // InternalAdaptDsl.g:1668:3: '=='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1673:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1673:2: ( '!=' )
                    // InternalAdaptDsl.g:1674:3: '!='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1679:2: ( '>=' )
                    {
                    // InternalAdaptDsl.g:1679:2: ( '>=' )
                    // InternalAdaptDsl.g:1680:3: '>='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1685:2: ( '<=' )
                    {
                    // InternalAdaptDsl.g:1685:2: ( '<=' )
                    // InternalAdaptDsl.g:1686:3: '<='
                    {
                     before(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1691:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1691:2: ( '===' )
                    // InternalAdaptDsl.g:1692:3: '==='
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
    // InternalAdaptDsl.g:1701:1: rule__StringOperators__Alternatives : ( ( '==' ) | ( '!=' ) | ( '===' ) );
    public final void rule__StringOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1705:1: ( ( '==' ) | ( '!=' ) | ( '===' ) )
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
                    // InternalAdaptDsl.g:1706:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1706:2: ( '==' )
                    // InternalAdaptDsl.g:1707:3: '=='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1712:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1712:2: ( '!=' )
                    // InternalAdaptDsl.g:1713:3: '!='
                    {
                     before(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1718:2: ( '===' )
                    {
                    // InternalAdaptDsl.g:1718:2: ( '===' )
                    // InternalAdaptDsl.g:1719:3: '==='
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
    // InternalAdaptDsl.g:1728:1: rule__BoolOperators__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__BoolOperators__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1732:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalAdaptDsl.g:1733:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:1733:2: ( '==' )
                    // InternalAdaptDsl.g:1734:3: '=='
                    {
                     before(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1739:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:1739:2: ( '!=' )
                    // InternalAdaptDsl.g:1740:3: '!='
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
    // InternalAdaptDsl.g:1749:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1753:1: ( ( ( rule__Action__ActionCategoryAssignment_0 ) ) | ( ( rule__Action__ActionCategoryAssignment_1 ) ) | ( ( rule__Action__ActionCategoryAssignment_2 ) ) | ( ( rule__Action__ActionCategoryAssignment_3 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 43:
            case 45:
            case 46:
                {
                alt6=1;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt6=2;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt6=3;
                }
                break;
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
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
                    // InternalAdaptDsl.g:1754:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1754:2: ( ( rule__Action__ActionCategoryAssignment_0 ) )
                    // InternalAdaptDsl.g:1755:3: ( rule__Action__ActionCategoryAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_0()); 
                    // InternalAdaptDsl.g:1756:3: ( rule__Action__ActionCategoryAssignment_0 )
                    // InternalAdaptDsl.g:1756:4: rule__Action__ActionCategoryAssignment_0
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
                    // InternalAdaptDsl.g:1760:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1760:2: ( ( rule__Action__ActionCategoryAssignment_1 ) )
                    // InternalAdaptDsl.g:1761:3: ( rule__Action__ActionCategoryAssignment_1 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_1()); 
                    // InternalAdaptDsl.g:1762:3: ( rule__Action__ActionCategoryAssignment_1 )
                    // InternalAdaptDsl.g:1762:4: rule__Action__ActionCategoryAssignment_1
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
                    // InternalAdaptDsl.g:1766:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1766:2: ( ( rule__Action__ActionCategoryAssignment_2 ) )
                    // InternalAdaptDsl.g:1767:3: ( rule__Action__ActionCategoryAssignment_2 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_2()); 
                    // InternalAdaptDsl.g:1768:3: ( rule__Action__ActionCategoryAssignment_2 )
                    // InternalAdaptDsl.g:1768:4: rule__Action__ActionCategoryAssignment_2
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
                    // InternalAdaptDsl.g:1772:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1772:2: ( ( rule__Action__ActionCategoryAssignment_3 ) )
                    // InternalAdaptDsl.g:1773:3: ( rule__Action__ActionCategoryAssignment_3 )
                    {
                     before(grammarAccess.getActionAccess().getActionCategoryAssignment_3()); 
                    // InternalAdaptDsl.g:1774:3: ( rule__Action__ActionCategoryAssignment_3 )
                    // InternalAdaptDsl.g:1774:4: rule__Action__ActionCategoryAssignment_3
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
    // InternalAdaptDsl.g:1782:1: rule__ServiceOperation__Alternatives : ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) );
    public final void rule__ServiceOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1786:1: ( ( ( rule__ServiceOperation__OperationAssignment_0 ) ) | ( ( rule__ServiceOperation__OperationAssignment_1 ) ) | ( ( rule__ServiceOperation__OperationAssignment_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 45:
                {
                alt7=2;
                }
                break;
            case 46:
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
                    // InternalAdaptDsl.g:1787:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1787:2: ( ( rule__ServiceOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1788:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1789:3: ( rule__ServiceOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1789:4: rule__ServiceOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1793:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1793:2: ( ( rule__ServiceOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1794:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1795:3: ( rule__ServiceOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1795:4: rule__ServiceOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1799:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1799:2: ( ( rule__ServiceOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1800:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getServiceOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1801:3: ( rule__ServiceOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1801:4: rule__ServiceOperation__OperationAssignment_2
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
    // InternalAdaptDsl.g:1809:1: rule__DisplayPropertyValue__Alternatives : ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) );
    public final void rule__DisplayPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1813:1: ( ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) ) | ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) ) )
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
                    // InternalAdaptDsl.g:1814:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1814:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_0 ) )
                    // InternalAdaptDsl.g:1815:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_0()); 
                    // InternalAdaptDsl.g:1816:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_0 )
                    // InternalAdaptDsl.g:1816:4: rule__DisplayPropertyValue__PropertyClassAssignment_0
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
                    // InternalAdaptDsl.g:1820:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1820:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_1 ) )
                    // InternalAdaptDsl.g:1821:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_1()); 
                    // InternalAdaptDsl.g:1822:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_1 )
                    // InternalAdaptDsl.g:1822:4: rule__DisplayPropertyValue__PropertyClassAssignment_1
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
                    // InternalAdaptDsl.g:1826:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1826:2: ( ( rule__DisplayPropertyValue__PropertyClassAssignment_2 ) )
                    // InternalAdaptDsl.g:1827:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    {
                     before(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassAssignment_2()); 
                    // InternalAdaptDsl.g:1828:3: ( rule__DisplayPropertyValue__PropertyClassAssignment_2 )
                    // InternalAdaptDsl.g:1828:4: rule__DisplayPropertyValue__PropertyClassAssignment_2
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
    // InternalAdaptDsl.g:1836:1: rule__TaskChangeOperation__Alternatives : ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__TaskChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1840:1: ( ( ( rule__TaskChangeOperation__OperationAssignment_0 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_1 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_2 ) ) | ( ( rule__TaskChangeOperation__OperationAssignment_3 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt9=1;
                }
                break;
            case 48:
                {
                alt9=2;
                }
                break;
            case 49:
                {
                alt9=3;
                }
                break;
            case 50:
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
                    // InternalAdaptDsl.g:1841:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1841:2: ( ( rule__TaskChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1842:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1843:3: ( rule__TaskChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1843:4: rule__TaskChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1847:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1847:2: ( ( rule__TaskChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1848:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1849:3: ( rule__TaskChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1849:4: rule__TaskChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1853:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1853:2: ( ( rule__TaskChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1854:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1855:3: ( rule__TaskChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1855:4: rule__TaskChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1859:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1859:2: ( ( rule__TaskChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1860:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1861:3: ( rule__TaskChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1861:4: rule__TaskChangeOperation__OperationAssignment_3
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
    // InternalAdaptDsl.g:1869:1: rule__NavigationChangeOperation__Alternatives : ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) );
    public final void rule__NavigationChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1873:1: ( ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) ) | ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt10=1;
                }
                break;
            case 52:
                {
                alt10=2;
                }
                break;
            case 53:
                {
                alt10=3;
                }
                break;
            case 54:
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
                    // InternalAdaptDsl.g:1874:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1874:2: ( ( rule__NavigationChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1875:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1876:3: ( rule__NavigationChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1876:4: rule__NavigationChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1880:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1880:2: ( ( rule__NavigationChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1881:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1882:3: ( rule__NavigationChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1882:4: rule__NavigationChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1886:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1886:2: ( ( rule__NavigationChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1887:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1888:3: ( rule__NavigationChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1888:4: rule__NavigationChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1892:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1892:2: ( ( rule__NavigationChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1893:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1894:3: ( rule__NavigationChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1894:4: rule__NavigationChangeOperation__OperationAssignment_3
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
    // InternalAdaptDsl.g:1902:1: rule__LayoutChangeOperation__Alternatives : ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) );
    public final void rule__LayoutChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1906:1: ( ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) ) | ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt11=1;
                }
                break;
            case 55:
                {
                alt11=2;
                }
                break;
            case 58:
                {
                alt11=3;
                }
                break;
            case 59:
                {
                alt11=4;
                }
                break;
            case 56:
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
                    // InternalAdaptDsl.g:1907:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1907:2: ( ( rule__LayoutChangeOperation__OperationAssignment_0 ) )
                    // InternalAdaptDsl.g:1908:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_0()); 
                    // InternalAdaptDsl.g:1909:3: ( rule__LayoutChangeOperation__OperationAssignment_0 )
                    // InternalAdaptDsl.g:1909:4: rule__LayoutChangeOperation__OperationAssignment_0
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
                    // InternalAdaptDsl.g:1913:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1913:2: ( ( rule__LayoutChangeOperation__OperationAssignment_1 ) )
                    // InternalAdaptDsl.g:1914:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_1()); 
                    // InternalAdaptDsl.g:1915:3: ( rule__LayoutChangeOperation__OperationAssignment_1 )
                    // InternalAdaptDsl.g:1915:4: rule__LayoutChangeOperation__OperationAssignment_1
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
                    // InternalAdaptDsl.g:1919:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1919:2: ( ( rule__LayoutChangeOperation__OperationAssignment_2 ) )
                    // InternalAdaptDsl.g:1920:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_2()); 
                    // InternalAdaptDsl.g:1921:3: ( rule__LayoutChangeOperation__OperationAssignment_2 )
                    // InternalAdaptDsl.g:1921:4: rule__LayoutChangeOperation__OperationAssignment_2
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
                    // InternalAdaptDsl.g:1925:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1925:2: ( ( rule__LayoutChangeOperation__OperationAssignment_3 ) )
                    // InternalAdaptDsl.g:1926:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_3()); 
                    // InternalAdaptDsl.g:1927:3: ( rule__LayoutChangeOperation__OperationAssignment_3 )
                    // InternalAdaptDsl.g:1927:4: rule__LayoutChangeOperation__OperationAssignment_3
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
                    // InternalAdaptDsl.g:1931:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    {
                    // InternalAdaptDsl.g:1931:2: ( ( rule__LayoutChangeOperation__OperationAssignment_4 ) )
                    // InternalAdaptDsl.g:1932:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getOperationAssignment_4()); 
                    // InternalAdaptDsl.g:1933:3: ( rule__LayoutChangeOperation__OperationAssignment_4 )
                    // InternalAdaptDsl.g:1933:4: rule__LayoutChangeOperation__OperationAssignment_4
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
    // InternalAdaptDsl.g:1941:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1945:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_BOOL ) )
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
                    // InternalAdaptDsl.g:1946:2: ( RULE_INT )
                    {
                    // InternalAdaptDsl.g:1946:2: ( RULE_INT )
                    // InternalAdaptDsl.g:1947:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1952:2: ( RULE_STRING )
                    {
                    // InternalAdaptDsl.g:1952:2: ( RULE_STRING )
                    // InternalAdaptDsl.g:1953:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1958:2: ( RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:1958:2: ( RULE_BOOL )
                    // InternalAdaptDsl.g:1959:3: RULE_BOOL
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
    // InternalAdaptDsl.g:1968:1: rule__TYPE__Alternatives : ( ( ( rule__TYPE__StringAssignment_0 ) ) | ( ( rule__TYPE__NumberAssignment_1 ) ) | ( ( rule__TYPE__BoolAssignment_2 ) ) | ( ( rule__TYPE__DeftypeAssignment_3 ) ) );
    public final void rule__TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1972:1: ( ( ( rule__TYPE__StringAssignment_0 ) ) | ( ( rule__TYPE__NumberAssignment_1 ) ) | ( ( rule__TYPE__BoolAssignment_2 ) ) | ( ( rule__TYPE__DeftypeAssignment_3 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt13=1;
                }
                break;
            case 63:
                {
                alt13=2;
                }
                break;
            case 64:
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
                    // InternalAdaptDsl.g:1973:2: ( ( rule__TYPE__StringAssignment_0 ) )
                    {
                    // InternalAdaptDsl.g:1973:2: ( ( rule__TYPE__StringAssignment_0 ) )
                    // InternalAdaptDsl.g:1974:3: ( rule__TYPE__StringAssignment_0 )
                    {
                     before(grammarAccess.getTYPEAccess().getStringAssignment_0()); 
                    // InternalAdaptDsl.g:1975:3: ( rule__TYPE__StringAssignment_0 )
                    // InternalAdaptDsl.g:1975:4: rule__TYPE__StringAssignment_0
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
                    // InternalAdaptDsl.g:1979:2: ( ( rule__TYPE__NumberAssignment_1 ) )
                    {
                    // InternalAdaptDsl.g:1979:2: ( ( rule__TYPE__NumberAssignment_1 ) )
                    // InternalAdaptDsl.g:1980:3: ( rule__TYPE__NumberAssignment_1 )
                    {
                     before(grammarAccess.getTYPEAccess().getNumberAssignment_1()); 
                    // InternalAdaptDsl.g:1981:3: ( rule__TYPE__NumberAssignment_1 )
                    // InternalAdaptDsl.g:1981:4: rule__TYPE__NumberAssignment_1
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
                    // InternalAdaptDsl.g:1985:2: ( ( rule__TYPE__BoolAssignment_2 ) )
                    {
                    // InternalAdaptDsl.g:1985:2: ( ( rule__TYPE__BoolAssignment_2 ) )
                    // InternalAdaptDsl.g:1986:3: ( rule__TYPE__BoolAssignment_2 )
                    {
                     before(grammarAccess.getTYPEAccess().getBoolAssignment_2()); 
                    // InternalAdaptDsl.g:1987:3: ( rule__TYPE__BoolAssignment_2 )
                    // InternalAdaptDsl.g:1987:4: rule__TYPE__BoolAssignment_2
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
                    // InternalAdaptDsl.g:1991:2: ( ( rule__TYPE__DeftypeAssignment_3 ) )
                    {
                    // InternalAdaptDsl.g:1991:2: ( ( rule__TYPE__DeftypeAssignment_3 ) )
                    // InternalAdaptDsl.g:1992:3: ( rule__TYPE__DeftypeAssignment_3 )
                    {
                     before(grammarAccess.getTYPEAccess().getDeftypeAssignment_3()); 
                    // InternalAdaptDsl.g:1993:3: ( rule__TYPE__DeftypeAssignment_3 )
                    // InternalAdaptDsl.g:1993:4: rule__TYPE__DeftypeAssignment_3
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalAdaptDsl.g:2001:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2005:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAdaptDsl.g:2006:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAdaptDsl.g:2013:1: rule__Model__Group__0__Impl : ( ( rule__Model__ContextModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2017:1: ( ( ( rule__Model__ContextModelAssignment_0 ) ) )
            // InternalAdaptDsl.g:2018:1: ( ( rule__Model__ContextModelAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2018:1: ( ( rule__Model__ContextModelAssignment_0 ) )
            // InternalAdaptDsl.g:2019:2: ( rule__Model__ContextModelAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getContextModelAssignment_0()); 
            // InternalAdaptDsl.g:2020:2: ( rule__Model__ContextModelAssignment_0 )
            // InternalAdaptDsl.g:2020:3: rule__Model__ContextModelAssignment_0
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
    // InternalAdaptDsl.g:2028:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2032:1: ( rule__Model__Group__1__Impl )
            // InternalAdaptDsl.g:2033:2: rule__Model__Group__1__Impl
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
    // InternalAdaptDsl.g:2039:1: rule__Model__Group__1__Impl : ( ( rule__Model__AdaptationModelAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2043:1: ( ( ( rule__Model__AdaptationModelAssignment_1 ) ) )
            // InternalAdaptDsl.g:2044:1: ( ( rule__Model__AdaptationModelAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2044:1: ( ( rule__Model__AdaptationModelAssignment_1 ) )
            // InternalAdaptDsl.g:2045:2: ( rule__Model__AdaptationModelAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getAdaptationModelAssignment_1()); 
            // InternalAdaptDsl.g:2046:2: ( rule__Model__AdaptationModelAssignment_1 )
            // InternalAdaptDsl.g:2046:3: rule__Model__AdaptationModelAssignment_1
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
    // InternalAdaptDsl.g:2055:1: rule__ContextModel__Group__0 : rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 ;
    public final void rule__ContextModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2059:1: ( rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1 )
            // InternalAdaptDsl.g:2060:2: rule__ContextModel__Group__0__Impl rule__ContextModel__Group__1
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
    // InternalAdaptDsl.g:2067:1: rule__ContextModel__Group__0__Impl : ( 'ContextModel{' ) ;
    public final void rule__ContextModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2071:1: ( ( 'ContextModel{' ) )
            // InternalAdaptDsl.g:2072:1: ( 'ContextModel{' )
            {
            // InternalAdaptDsl.g:2072:1: ( 'ContextModel{' )
            // InternalAdaptDsl.g:2073:2: 'ContextModel{'
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
    // InternalAdaptDsl.g:2082:1: rule__ContextModel__Group__1 : rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 ;
    public final void rule__ContextModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2086:1: ( rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2 )
            // InternalAdaptDsl.g:2087:2: rule__ContextModel__Group__1__Impl rule__ContextModel__Group__2
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
    // InternalAdaptDsl.g:2094:1: rule__ContextModel__Group__1__Impl : ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) ) ;
    public final void rule__ContextModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2098:1: ( ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) ) )
            // InternalAdaptDsl.g:2099:1: ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) )
            {
            // InternalAdaptDsl.g:2099:1: ( ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* ) )
            // InternalAdaptDsl.g:2100:2: ( ( rule__ContextModel__EntityAssignment_1 ) ) ( ( rule__ContextModel__EntityAssignment_1 )* )
            {
            // InternalAdaptDsl.g:2100:2: ( ( rule__ContextModel__EntityAssignment_1 ) )
            // InternalAdaptDsl.g:2101:3: ( rule__ContextModel__EntityAssignment_1 )
            {
             before(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 
            // InternalAdaptDsl.g:2102:3: ( rule__ContextModel__EntityAssignment_1 )
            // InternalAdaptDsl.g:2102:4: rule__ContextModel__EntityAssignment_1
            {
            pushFollow(FOLLOW_6);
            rule__ContextModel__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 

            }

            // InternalAdaptDsl.g:2105:2: ( ( rule__ContextModel__EntityAssignment_1 )* )
            // InternalAdaptDsl.g:2106:3: ( rule__ContextModel__EntityAssignment_1 )*
            {
             before(grammarAccess.getContextModelAccess().getEntityAssignment_1()); 
            // InternalAdaptDsl.g:2107:3: ( rule__ContextModel__EntityAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==60) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAdaptDsl.g:2107:4: rule__ContextModel__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ContextModel__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalAdaptDsl.g:2116:1: rule__ContextModel__Group__2 : rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 ;
    public final void rule__ContextModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2120:1: ( rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3 )
            // InternalAdaptDsl.g:2121:2: rule__ContextModel__Group__2__Impl rule__ContextModel__Group__3
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
    // InternalAdaptDsl.g:2128:1: rule__ContextModel__Group__2__Impl : ( ( rule__ContextModel__Group_2__0 )? ) ;
    public final void rule__ContextModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2132:1: ( ( ( rule__ContextModel__Group_2__0 )? ) )
            // InternalAdaptDsl.g:2133:1: ( ( rule__ContextModel__Group_2__0 )? )
            {
            // InternalAdaptDsl.g:2133:1: ( ( rule__ContextModel__Group_2__0 )? )
            // InternalAdaptDsl.g:2134:2: ( rule__ContextModel__Group_2__0 )?
            {
             before(grammarAccess.getContextModelAccess().getGroup_2()); 
            // InternalAdaptDsl.g:2135:2: ( rule__ContextModel__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdaptDsl.g:2135:3: rule__ContextModel__Group_2__0
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
    // InternalAdaptDsl.g:2143:1: rule__ContextModel__Group__3 : rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 ;
    public final void rule__ContextModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2147:1: ( rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4 )
            // InternalAdaptDsl.g:2148:2: rule__ContextModel__Group__3__Impl rule__ContextModel__Group__4
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
    // InternalAdaptDsl.g:2155:1: rule__ContextModel__Group__3__Impl : ( ( rule__ContextModel__Group_3__0 )? ) ;
    public final void rule__ContextModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2159:1: ( ( ( rule__ContextModel__Group_3__0 )? ) )
            // InternalAdaptDsl.g:2160:1: ( ( rule__ContextModel__Group_3__0 )? )
            {
            // InternalAdaptDsl.g:2160:1: ( ( rule__ContextModel__Group_3__0 )? )
            // InternalAdaptDsl.g:2161:2: ( rule__ContextModel__Group_3__0 )?
            {
             before(grammarAccess.getContextModelAccess().getGroup_3()); 
            // InternalAdaptDsl.g:2162:2: ( rule__ContextModel__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptDsl.g:2162:3: rule__ContextModel__Group_3__0
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
    // InternalAdaptDsl.g:2170:1: rule__ContextModel__Group__4 : rule__ContextModel__Group__4__Impl ;
    public final void rule__ContextModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2174:1: ( rule__ContextModel__Group__4__Impl )
            // InternalAdaptDsl.g:2175:2: rule__ContextModel__Group__4__Impl
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
    // InternalAdaptDsl.g:2181:1: rule__ContextModel__Group__4__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2185:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2186:1: ( '};' )
            {
            // InternalAdaptDsl.g:2186:1: ( '};' )
            // InternalAdaptDsl.g:2187:2: '};'
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
    // InternalAdaptDsl.g:2197:1: rule__ContextModel__Group_2__0 : rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1 ;
    public final void rule__ContextModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2201:1: ( rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1 )
            // InternalAdaptDsl.g:2202:2: rule__ContextModel__Group_2__0__Impl rule__ContextModel__Group_2__1
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
    // InternalAdaptDsl.g:2209:1: rule__ContextModel__Group_2__0__Impl : ( 'Services{' ) ;
    public final void rule__ContextModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2213:1: ( ( 'Services{' ) )
            // InternalAdaptDsl.g:2214:1: ( 'Services{' )
            {
            // InternalAdaptDsl.g:2214:1: ( 'Services{' )
            // InternalAdaptDsl.g:2215:2: 'Services{'
            {
             before(grammarAccess.getContextModelAccess().getServicesKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2224:1: rule__ContextModel__Group_2__1 : rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2 ;
    public final void rule__ContextModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2228:1: ( rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2 )
            // InternalAdaptDsl.g:2229:2: rule__ContextModel__Group_2__1__Impl rule__ContextModel__Group_2__2
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
    // InternalAdaptDsl.g:2236:1: rule__ContextModel__Group_2__1__Impl : ( ( rule__ContextModel__Group_2_1__0 )* ) ;
    public final void rule__ContextModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2240:1: ( ( ( rule__ContextModel__Group_2_1__0 )* ) )
            // InternalAdaptDsl.g:2241:1: ( ( rule__ContextModel__Group_2_1__0 )* )
            {
            // InternalAdaptDsl.g:2241:1: ( ( rule__ContextModel__Group_2_1__0 )* )
            // InternalAdaptDsl.g:2242:2: ( rule__ContextModel__Group_2_1__0 )*
            {
             before(grammarAccess.getContextModelAccess().getGroup_2_1()); 
            // InternalAdaptDsl.g:2243:2: ( rule__ContextModel__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAdaptDsl.g:2243:3: rule__ContextModel__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ContextModel__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAdaptDsl.g:2251:1: rule__ContextModel__Group_2__2 : rule__ContextModel__Group_2__2__Impl ;
    public final void rule__ContextModel__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2255:1: ( rule__ContextModel__Group_2__2__Impl )
            // InternalAdaptDsl.g:2256:2: rule__ContextModel__Group_2__2__Impl
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
    // InternalAdaptDsl.g:2262:1: rule__ContextModel__Group_2__2__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2266:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2267:1: ( '};' )
            {
            // InternalAdaptDsl.g:2267:1: ( '};' )
            // InternalAdaptDsl.g:2268:2: '};'
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
    // InternalAdaptDsl.g:2278:1: rule__ContextModel__Group_2_1__0 : rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1 ;
    public final void rule__ContextModel__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2282:1: ( rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1 )
            // InternalAdaptDsl.g:2283:2: rule__ContextModel__Group_2_1__0__Impl rule__ContextModel__Group_2_1__1
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
    // InternalAdaptDsl.g:2290:1: rule__ContextModel__Group_2_1__0__Impl : ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) ) ;
    public final void rule__ContextModel__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2294:1: ( ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) ) )
            // InternalAdaptDsl.g:2295:1: ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) )
            {
            // InternalAdaptDsl.g:2295:1: ( ( rule__ContextModel__ProviderAssignment_2_1_0 ) )
            // InternalAdaptDsl.g:2296:2: ( rule__ContextModel__ProviderAssignment_2_1_0 )
            {
             before(grammarAccess.getContextModelAccess().getProviderAssignment_2_1_0()); 
            // InternalAdaptDsl.g:2297:2: ( rule__ContextModel__ProviderAssignment_2_1_0 )
            // InternalAdaptDsl.g:2297:3: rule__ContextModel__ProviderAssignment_2_1_0
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
    // InternalAdaptDsl.g:2305:1: rule__ContextModel__Group_2_1__1 : rule__ContextModel__Group_2_1__1__Impl ;
    public final void rule__ContextModel__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2309:1: ( rule__ContextModel__Group_2_1__1__Impl )
            // InternalAdaptDsl.g:2310:2: rule__ContextModel__Group_2_1__1__Impl
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
    // InternalAdaptDsl.g:2316:1: rule__ContextModel__Group_2_1__1__Impl : ( ';' ) ;
    public final void rule__ContextModel__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2320:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2321:1: ( ';' )
            {
            // InternalAdaptDsl.g:2321:1: ( ';' )
            // InternalAdaptDsl.g:2322:2: ';'
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
    // InternalAdaptDsl.g:2332:1: rule__ContextModel__Group_3__0 : rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1 ;
    public final void rule__ContextModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2336:1: ( rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1 )
            // InternalAdaptDsl.g:2337:2: rule__ContextModel__Group_3__0__Impl rule__ContextModel__Group_3__1
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
    // InternalAdaptDsl.g:2344:1: rule__ContextModel__Group_3__0__Impl : ( 'Types{' ) ;
    public final void rule__ContextModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2348:1: ( ( 'Types{' ) )
            // InternalAdaptDsl.g:2349:1: ( 'Types{' )
            {
            // InternalAdaptDsl.g:2349:1: ( 'Types{' )
            // InternalAdaptDsl.g:2350:2: 'Types{'
            {
             before(grammarAccess.getContextModelAccess().getTypesKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2359:1: rule__ContextModel__Group_3__1 : rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2 ;
    public final void rule__ContextModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2363:1: ( rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2 )
            // InternalAdaptDsl.g:2364:2: rule__ContextModel__Group_3__1__Impl rule__ContextModel__Group_3__2
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
    // InternalAdaptDsl.g:2371:1: rule__ContextModel__Group_3__1__Impl : ( ( rule__ContextModel__TypesAssignment_3_1 ) ) ;
    public final void rule__ContextModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2375:1: ( ( ( rule__ContextModel__TypesAssignment_3_1 ) ) )
            // InternalAdaptDsl.g:2376:1: ( ( rule__ContextModel__TypesAssignment_3_1 ) )
            {
            // InternalAdaptDsl.g:2376:1: ( ( rule__ContextModel__TypesAssignment_3_1 ) )
            // InternalAdaptDsl.g:2377:2: ( rule__ContextModel__TypesAssignment_3_1 )
            {
             before(grammarAccess.getContextModelAccess().getTypesAssignment_3_1()); 
            // InternalAdaptDsl.g:2378:2: ( rule__ContextModel__TypesAssignment_3_1 )
            // InternalAdaptDsl.g:2378:3: rule__ContextModel__TypesAssignment_3_1
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
    // InternalAdaptDsl.g:2386:1: rule__ContextModel__Group_3__2 : rule__ContextModel__Group_3__2__Impl ;
    public final void rule__ContextModel__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2390:1: ( rule__ContextModel__Group_3__2__Impl )
            // InternalAdaptDsl.g:2391:2: rule__ContextModel__Group_3__2__Impl
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
    // InternalAdaptDsl.g:2397:1: rule__ContextModel__Group_3__2__Impl : ( '};' ) ;
    public final void rule__ContextModel__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2401:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2402:1: ( '};' )
            {
            // InternalAdaptDsl.g:2402:1: ( '};' )
            // InternalAdaptDsl.g:2403:2: '};'
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
    // InternalAdaptDsl.g:2413:1: rule__AdaptationModel__Group__0 : rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 ;
    public final void rule__AdaptationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2417:1: ( rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1 )
            // InternalAdaptDsl.g:2418:2: rule__AdaptationModel__Group__0__Impl rule__AdaptationModel__Group__1
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
    // InternalAdaptDsl.g:2425:1: rule__AdaptationModel__Group__0__Impl : ( 'AdaptationModel{' ) ;
    public final void rule__AdaptationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2429:1: ( ( 'AdaptationModel{' ) )
            // InternalAdaptDsl.g:2430:1: ( 'AdaptationModel{' )
            {
            // InternalAdaptDsl.g:2430:1: ( 'AdaptationModel{' )
            // InternalAdaptDsl.g:2431:2: 'AdaptationModel{'
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
    // InternalAdaptDsl.g:2440:1: rule__AdaptationModel__Group__1 : rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2 ;
    public final void rule__AdaptationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2444:1: ( rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2 )
            // InternalAdaptDsl.g:2445:2: rule__AdaptationModel__Group__1__Impl rule__AdaptationModel__Group__2
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
    // InternalAdaptDsl.g:2452:1: rule__AdaptationModel__Group__1__Impl : ( ( rule__AdaptationModel__ServicesAssignment_1 )? ) ;
    public final void rule__AdaptationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2456:1: ( ( ( rule__AdaptationModel__ServicesAssignment_1 )? ) )
            // InternalAdaptDsl.g:2457:1: ( ( rule__AdaptationModel__ServicesAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2457:1: ( ( rule__AdaptationModel__ServicesAssignment_1 )? )
            // InternalAdaptDsl.g:2458:2: ( rule__AdaptationModel__ServicesAssignment_1 )?
            {
             before(grammarAccess.getAdaptationModelAccess().getServicesAssignment_1()); 
            // InternalAdaptDsl.g:2459:2: ( rule__AdaptationModel__ServicesAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptDsl.g:2459:3: rule__AdaptationModel__ServicesAssignment_1
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
    // InternalAdaptDsl.g:2467:1: rule__AdaptationModel__Group__2 : rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3 ;
    public final void rule__AdaptationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2471:1: ( rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3 )
            // InternalAdaptDsl.g:2472:2: rule__AdaptationModel__Group__2__Impl rule__AdaptationModel__Group__3
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
    // InternalAdaptDsl.g:2479:1: rule__AdaptationModel__Group__2__Impl : ( 'flow' ) ;
    public final void rule__AdaptationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2483:1: ( ( 'flow' ) )
            // InternalAdaptDsl.g:2484:1: ( 'flow' )
            {
            // InternalAdaptDsl.g:2484:1: ( 'flow' )
            // InternalAdaptDsl.g:2485:2: 'flow'
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
    // InternalAdaptDsl.g:2494:1: rule__AdaptationModel__Group__3 : rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4 ;
    public final void rule__AdaptationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2498:1: ( rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4 )
            // InternalAdaptDsl.g:2499:2: rule__AdaptationModel__Group__3__Impl rule__AdaptationModel__Group__4
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
    // InternalAdaptDsl.g:2506:1: rule__AdaptationModel__Group__3__Impl : ( ( rule__AdaptationModel__FlowNameAssignment_3 ) ) ;
    public final void rule__AdaptationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2510:1: ( ( ( rule__AdaptationModel__FlowNameAssignment_3 ) ) )
            // InternalAdaptDsl.g:2511:1: ( ( rule__AdaptationModel__FlowNameAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2511:1: ( ( rule__AdaptationModel__FlowNameAssignment_3 ) )
            // InternalAdaptDsl.g:2512:2: ( rule__AdaptationModel__FlowNameAssignment_3 )
            {
             before(grammarAccess.getAdaptationModelAccess().getFlowNameAssignment_3()); 
            // InternalAdaptDsl.g:2513:2: ( rule__AdaptationModel__FlowNameAssignment_3 )
            // InternalAdaptDsl.g:2513:3: rule__AdaptationModel__FlowNameAssignment_3
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
    // InternalAdaptDsl.g:2521:1: rule__AdaptationModel__Group__4 : rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5 ;
    public final void rule__AdaptationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2525:1: ( rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5 )
            // InternalAdaptDsl.g:2526:2: rule__AdaptationModel__Group__4__Impl rule__AdaptationModel__Group__5
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
    // InternalAdaptDsl.g:2533:1: rule__AdaptationModel__Group__4__Impl : ( '{' ) ;
    public final void rule__AdaptationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2537:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2538:1: ( '{' )
            {
            // InternalAdaptDsl.g:2538:1: ( '{' )
            // InternalAdaptDsl.g:2539:2: '{'
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
    // InternalAdaptDsl.g:2548:1: rule__AdaptationModel__Group__5 : rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6 ;
    public final void rule__AdaptationModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2552:1: ( rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6 )
            // InternalAdaptDsl.g:2553:2: rule__AdaptationModel__Group__5__Impl rule__AdaptationModel__Group__6
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
    // InternalAdaptDsl.g:2560:1: rule__AdaptationModel__Group__5__Impl : ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) ) ;
    public final void rule__AdaptationModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2564:1: ( ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) ) )
            // InternalAdaptDsl.g:2565:1: ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) )
            {
            // InternalAdaptDsl.g:2565:1: ( ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* ) )
            // InternalAdaptDsl.g:2566:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) ) ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* )
            {
            // InternalAdaptDsl.g:2566:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 ) )
            // InternalAdaptDsl.g:2567:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 
            // InternalAdaptDsl.g:2568:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )
            // InternalAdaptDsl.g:2568:4: rule__AdaptationModel__AdaptationRulesAssignment_5
            {
            pushFollow(FOLLOW_16);
            rule__AdaptationModel__AdaptationRulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 

            }

            // InternalAdaptDsl.g:2571:2: ( ( rule__AdaptationModel__AdaptationRulesAssignment_5 )* )
            // InternalAdaptDsl.g:2572:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )*
            {
             before(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAssignment_5()); 
            // InternalAdaptDsl.g:2573:3: ( rule__AdaptationModel__AdaptationRulesAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAdaptDsl.g:2573:4: rule__AdaptationModel__AdaptationRulesAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AdaptationModel__AdaptationRulesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAdaptDsl.g:2582:1: rule__AdaptationModel__Group__6 : rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7 ;
    public final void rule__AdaptationModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2586:1: ( rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7 )
            // InternalAdaptDsl.g:2587:2: rule__AdaptationModel__Group__6__Impl rule__AdaptationModel__Group__7
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
    // InternalAdaptDsl.g:2594:1: rule__AdaptationModel__Group__6__Impl : ( '};' ) ;
    public final void rule__AdaptationModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2598:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2599:1: ( '};' )
            {
            // InternalAdaptDsl.g:2599:1: ( '};' )
            // InternalAdaptDsl.g:2600:2: '};'
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
    // InternalAdaptDsl.g:2609:1: rule__AdaptationModel__Group__7 : rule__AdaptationModel__Group__7__Impl ;
    public final void rule__AdaptationModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2613:1: ( rule__AdaptationModel__Group__7__Impl )
            // InternalAdaptDsl.g:2614:2: rule__AdaptationModel__Group__7__Impl
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
    // InternalAdaptDsl.g:2620:1: rule__AdaptationModel__Group__7__Impl : ( '};' ) ;
    public final void rule__AdaptationModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2624:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2625:1: ( '};' )
            {
            // InternalAdaptDsl.g:2625:1: ( '};' )
            // InternalAdaptDsl.g:2626:2: '};'
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
    // InternalAdaptDsl.g:2636:1: rule__Services__Group__0 : rule__Services__Group__0__Impl rule__Services__Group__1 ;
    public final void rule__Services__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2640:1: ( rule__Services__Group__0__Impl rule__Services__Group__1 )
            // InternalAdaptDsl.g:2641:2: rule__Services__Group__0__Impl rule__Services__Group__1
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
    // InternalAdaptDsl.g:2648:1: rule__Services__Group__0__Impl : ( ( rule__Services__ThisAssignment_0 ) ) ;
    public final void rule__Services__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2652:1: ( ( ( rule__Services__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:2653:1: ( ( rule__Services__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2653:1: ( ( rule__Services__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:2654:2: ( rule__Services__ThisAssignment_0 )
            {
             before(grammarAccess.getServicesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:2655:2: ( rule__Services__ThisAssignment_0 )
            // InternalAdaptDsl.g:2655:3: rule__Services__ThisAssignment_0
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
    // InternalAdaptDsl.g:2663:1: rule__Services__Group__1 : rule__Services__Group__1__Impl ;
    public final void rule__Services__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2667:1: ( rule__Services__Group__1__Impl )
            // InternalAdaptDsl.g:2668:2: rule__Services__Group__1__Impl
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
    // InternalAdaptDsl.g:2674:1: rule__Services__Group__1__Impl : ( ( rule__Services__NextAssignment_1 )? ) ;
    public final void rule__Services__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2678:1: ( ( ( rule__Services__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:2679:1: ( ( rule__Services__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2679:1: ( ( rule__Services__NextAssignment_1 )? )
            // InternalAdaptDsl.g:2680:2: ( rule__Services__NextAssignment_1 )?
            {
             before(grammarAccess.getServicesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:2681:2: ( rule__Services__NextAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:2681:3: rule__Services__NextAssignment_1
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
    // InternalAdaptDsl.g:2690:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2694:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalAdaptDsl.g:2695:2: rule__Service__Group__0__Impl rule__Service__Group__1
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
    // InternalAdaptDsl.g:2702:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2706:1: ( ( 'service' ) )
            // InternalAdaptDsl.g:2707:1: ( 'service' )
            {
            // InternalAdaptDsl.g:2707:1: ( 'service' )
            // InternalAdaptDsl.g:2708:2: 'service'
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
    // InternalAdaptDsl.g:2717:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2721:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalAdaptDsl.g:2722:2: rule__Service__Group__1__Impl rule__Service__Group__2
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
    // InternalAdaptDsl.g:2729:1: rule__Service__Group__1__Impl : ( ( rule__Service__TypeAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2733:1: ( ( ( rule__Service__TypeAssignment_1 ) ) )
            // InternalAdaptDsl.g:2734:1: ( ( rule__Service__TypeAssignment_1 ) )
            {
            // InternalAdaptDsl.g:2734:1: ( ( rule__Service__TypeAssignment_1 ) )
            // InternalAdaptDsl.g:2735:2: ( rule__Service__TypeAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_1()); 
            // InternalAdaptDsl.g:2736:2: ( rule__Service__TypeAssignment_1 )
            // InternalAdaptDsl.g:2736:3: rule__Service__TypeAssignment_1
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
    // InternalAdaptDsl.g:2744:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2748:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalAdaptDsl.g:2749:2: rule__Service__Group__2__Impl rule__Service__Group__3
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
    // InternalAdaptDsl.g:2756:1: rule__Service__Group__2__Impl : ( 'from' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2760:1: ( ( 'from' ) )
            // InternalAdaptDsl.g:2761:1: ( 'from' )
            {
            // InternalAdaptDsl.g:2761:1: ( 'from' )
            // InternalAdaptDsl.g:2762:2: 'from'
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
    // InternalAdaptDsl.g:2771:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2775:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalAdaptDsl.g:2776:2: rule__Service__Group__3__Impl rule__Service__Group__4
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
    // InternalAdaptDsl.g:2783:1: rule__Service__Group__3__Impl : ( ( rule__Service__LocAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2787:1: ( ( ( rule__Service__LocAssignment_3 ) ) )
            // InternalAdaptDsl.g:2788:1: ( ( rule__Service__LocAssignment_3 ) )
            {
            // InternalAdaptDsl.g:2788:1: ( ( rule__Service__LocAssignment_3 ) )
            // InternalAdaptDsl.g:2789:2: ( rule__Service__LocAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getLocAssignment_3()); 
            // InternalAdaptDsl.g:2790:2: ( rule__Service__LocAssignment_3 )
            // InternalAdaptDsl.g:2790:3: rule__Service__LocAssignment_3
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
    // InternalAdaptDsl.g:2798:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2802:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalAdaptDsl.g:2803:2: rule__Service__Group__4__Impl rule__Service__Group__5
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
    // InternalAdaptDsl.g:2810:1: rule__Service__Group__4__Impl : ( 'as' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2814:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:2815:1: ( 'as' )
            {
            // InternalAdaptDsl.g:2815:1: ( 'as' )
            // InternalAdaptDsl.g:2816:2: 'as'
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
    // InternalAdaptDsl.g:2825:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2829:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalAdaptDsl.g:2830:2: rule__Service__Group__5__Impl rule__Service__Group__6
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
    // InternalAdaptDsl.g:2837:1: rule__Service__Group__5__Impl : ( ( rule__Service__IdAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2841:1: ( ( ( rule__Service__IdAssignment_5 ) ) )
            // InternalAdaptDsl.g:2842:1: ( ( rule__Service__IdAssignment_5 ) )
            {
            // InternalAdaptDsl.g:2842:1: ( ( rule__Service__IdAssignment_5 ) )
            // InternalAdaptDsl.g:2843:2: ( rule__Service__IdAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getIdAssignment_5()); 
            // InternalAdaptDsl.g:2844:2: ( rule__Service__IdAssignment_5 )
            // InternalAdaptDsl.g:2844:3: rule__Service__IdAssignment_5
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
    // InternalAdaptDsl.g:2852:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2856:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalAdaptDsl.g:2857:2: rule__Service__Group__6__Impl rule__Service__Group__7
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
    // InternalAdaptDsl.g:2864:1: rule__Service__Group__6__Impl : ( '{' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2868:1: ( ( '{' ) )
            // InternalAdaptDsl.g:2869:1: ( '{' )
            {
            // InternalAdaptDsl.g:2869:1: ( '{' )
            // InternalAdaptDsl.g:2870:2: '{'
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
    // InternalAdaptDsl.g:2879:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2883:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalAdaptDsl.g:2884:2: rule__Service__Group__7__Impl rule__Service__Group__8
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
    // InternalAdaptDsl.g:2891:1: rule__Service__Group__7__Impl : ( ( rule__Service__FunctionsAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2895:1: ( ( ( rule__Service__FunctionsAssignment_7 ) ) )
            // InternalAdaptDsl.g:2896:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            {
            // InternalAdaptDsl.g:2896:1: ( ( rule__Service__FunctionsAssignment_7 ) )
            // InternalAdaptDsl.g:2897:2: ( rule__Service__FunctionsAssignment_7 )
            {
             before(grammarAccess.getServiceAccess().getFunctionsAssignment_7()); 
            // InternalAdaptDsl.g:2898:2: ( rule__Service__FunctionsAssignment_7 )
            // InternalAdaptDsl.g:2898:3: rule__Service__FunctionsAssignment_7
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
    // InternalAdaptDsl.g:2906:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2910:1: ( rule__Service__Group__8__Impl )
            // InternalAdaptDsl.g:2911:2: rule__Service__Group__8__Impl
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
    // InternalAdaptDsl.g:2917:1: rule__Service__Group__8__Impl : ( '};' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2921:1: ( ( '};' ) )
            // InternalAdaptDsl.g:2922:1: ( '};' )
            {
            // InternalAdaptDsl.g:2922:1: ( '};' )
            // InternalAdaptDsl.g:2923:2: '};'
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
    // InternalAdaptDsl.g:2933:1: rule__Functions__Group__0 : rule__Functions__Group__0__Impl rule__Functions__Group__1 ;
    public final void rule__Functions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2937:1: ( rule__Functions__Group__0__Impl rule__Functions__Group__1 )
            // InternalAdaptDsl.g:2938:2: rule__Functions__Group__0__Impl rule__Functions__Group__1
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
    // InternalAdaptDsl.g:2945:1: rule__Functions__Group__0__Impl : ( ( rule__Functions__ThisAssignment_0 ) ) ;
    public final void rule__Functions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2949:1: ( ( ( rule__Functions__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:2950:1: ( ( rule__Functions__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:2950:1: ( ( rule__Functions__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:2951:2: ( rule__Functions__ThisAssignment_0 )
            {
             before(grammarAccess.getFunctionsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:2952:2: ( rule__Functions__ThisAssignment_0 )
            // InternalAdaptDsl.g:2952:3: rule__Functions__ThisAssignment_0
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
    // InternalAdaptDsl.g:2960:1: rule__Functions__Group__1 : rule__Functions__Group__1__Impl ;
    public final void rule__Functions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2964:1: ( rule__Functions__Group__1__Impl )
            // InternalAdaptDsl.g:2965:2: rule__Functions__Group__1__Impl
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
    // InternalAdaptDsl.g:2971:1: rule__Functions__Group__1__Impl : ( ( rule__Functions__NextAssignment_1 )? ) ;
    public final void rule__Functions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2975:1: ( ( ( rule__Functions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:2976:1: ( ( rule__Functions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:2976:1: ( ( rule__Functions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:2977:2: ( rule__Functions__NextAssignment_1 )?
            {
             before(grammarAccess.getFunctionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:2978:2: ( rule__Functions__NextAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdaptDsl.g:2978:3: rule__Functions__NextAssignment_1
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
    // InternalAdaptDsl.g:2987:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2991:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalAdaptDsl.g:2992:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalAdaptDsl.g:2999:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3003:1: ( ( 'function' ) )
            // InternalAdaptDsl.g:3004:1: ( 'function' )
            {
            // InternalAdaptDsl.g:3004:1: ( 'function' )
            // InternalAdaptDsl.g:3005:2: 'function'
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
    // InternalAdaptDsl.g:3014:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3018:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalAdaptDsl.g:3019:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalAdaptDsl.g:3026:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3030:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:3031:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3031:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalAdaptDsl.g:3032:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:3033:2: ( rule__Function__NameAssignment_1 )
            // InternalAdaptDsl.g:3033:3: rule__Function__NameAssignment_1
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
    // InternalAdaptDsl.g:3041:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3045:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalAdaptDsl.g:3046:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalAdaptDsl.g:3053:1: rule__Function__Group__2__Impl : ( 'as' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3057:1: ( ( 'as' ) )
            // InternalAdaptDsl.g:3058:1: ( 'as' )
            {
            // InternalAdaptDsl.g:3058:1: ( 'as' )
            // InternalAdaptDsl.g:3059:2: 'as'
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
    // InternalAdaptDsl.g:3068:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3072:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalAdaptDsl.g:3073:2: rule__Function__Group__3__Impl rule__Function__Group__4
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
    // InternalAdaptDsl.g:3080:1: rule__Function__Group__3__Impl : ( ( rule__Function__IdAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3084:1: ( ( ( rule__Function__IdAssignment_3 ) ) )
            // InternalAdaptDsl.g:3085:1: ( ( rule__Function__IdAssignment_3 ) )
            {
            // InternalAdaptDsl.g:3085:1: ( ( rule__Function__IdAssignment_3 ) )
            // InternalAdaptDsl.g:3086:2: ( rule__Function__IdAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getIdAssignment_3()); 
            // InternalAdaptDsl.g:3087:2: ( rule__Function__IdAssignment_3 )
            // InternalAdaptDsl.g:3087:3: rule__Function__IdAssignment_3
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
    // InternalAdaptDsl.g:3095:1: rule__Function__Group__4 : rule__Function__Group__4__Impl ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3099:1: ( rule__Function__Group__4__Impl )
            // InternalAdaptDsl.g:3100:2: rule__Function__Group__4__Impl
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
    // InternalAdaptDsl.g:3106:1: rule__Function__Group__4__Impl : ( ';' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3110:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3111:1: ( ';' )
            {
            // InternalAdaptDsl.g:3111:1: ( ';' )
            // InternalAdaptDsl.g:3112:2: ';'
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
    // InternalAdaptDsl.g:3122:1: rule__AdaptationRule__Group__0 : rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 ;
    public final void rule__AdaptationRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3126:1: ( rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1 )
            // InternalAdaptDsl.g:3127:2: rule__AdaptationRule__Group__0__Impl rule__AdaptationRule__Group__1
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
    // InternalAdaptDsl.g:3134:1: rule__AdaptationRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AdaptationRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3138:1: ( ( 'rule' ) )
            // InternalAdaptDsl.g:3139:1: ( 'rule' )
            {
            // InternalAdaptDsl.g:3139:1: ( 'rule' )
            // InternalAdaptDsl.g:3140:2: 'rule'
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
    // InternalAdaptDsl.g:3149:1: rule__AdaptationRule__Group__1 : rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 ;
    public final void rule__AdaptationRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3153:1: ( rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2 )
            // InternalAdaptDsl.g:3154:2: rule__AdaptationRule__Group__1__Impl rule__AdaptationRule__Group__2
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
    // InternalAdaptDsl.g:3161:1: rule__AdaptationRule__Group__1__Impl : ( ( rule__AdaptationRule__NameAssignment_1 ) ) ;
    public final void rule__AdaptationRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3165:1: ( ( ( rule__AdaptationRule__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:3166:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:3166:1: ( ( rule__AdaptationRule__NameAssignment_1 ) )
            // InternalAdaptDsl.g:3167:2: ( rule__AdaptationRule__NameAssignment_1 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:3168:2: ( rule__AdaptationRule__NameAssignment_1 )
            // InternalAdaptDsl.g:3168:3: rule__AdaptationRule__NameAssignment_1
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
    // InternalAdaptDsl.g:3176:1: rule__AdaptationRule__Group__2 : rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 ;
    public final void rule__AdaptationRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3180:1: ( rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3 )
            // InternalAdaptDsl.g:3181:2: rule__AdaptationRule__Group__2__Impl rule__AdaptationRule__Group__3
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
    // InternalAdaptDsl.g:3188:1: rule__AdaptationRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AdaptationRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3192:1: ( ( '{' ) )
            // InternalAdaptDsl.g:3193:1: ( '{' )
            {
            // InternalAdaptDsl.g:3193:1: ( '{' )
            // InternalAdaptDsl.g:3194:2: '{'
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
    // InternalAdaptDsl.g:3203:1: rule__AdaptationRule__Group__3 : rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 ;
    public final void rule__AdaptationRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3207:1: ( rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4 )
            // InternalAdaptDsl.g:3208:2: rule__AdaptationRule__Group__3__Impl rule__AdaptationRule__Group__4
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
    // InternalAdaptDsl.g:3215:1: rule__AdaptationRule__Group__3__Impl : ( 'LEVEL' ) ;
    public final void rule__AdaptationRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3219:1: ( ( 'LEVEL' ) )
            // InternalAdaptDsl.g:3220:1: ( 'LEVEL' )
            {
            // InternalAdaptDsl.g:3220:1: ( 'LEVEL' )
            // InternalAdaptDsl.g:3221:2: 'LEVEL'
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
    // InternalAdaptDsl.g:3230:1: rule__AdaptationRule__Group__4 : rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 ;
    public final void rule__AdaptationRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3234:1: ( rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5 )
            // InternalAdaptDsl.g:3235:2: rule__AdaptationRule__Group__4__Impl rule__AdaptationRule__Group__5
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
    // InternalAdaptDsl.g:3242:1: rule__AdaptationRule__Group__4__Impl : ( ( rule__AdaptationRule__LevelAssignment_4 ) ) ;
    public final void rule__AdaptationRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3246:1: ( ( ( rule__AdaptationRule__LevelAssignment_4 ) ) )
            // InternalAdaptDsl.g:3247:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            {
            // InternalAdaptDsl.g:3247:1: ( ( rule__AdaptationRule__LevelAssignment_4 ) )
            // InternalAdaptDsl.g:3248:2: ( rule__AdaptationRule__LevelAssignment_4 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getLevelAssignment_4()); 
            // InternalAdaptDsl.g:3249:2: ( rule__AdaptationRule__LevelAssignment_4 )
            // InternalAdaptDsl.g:3249:3: rule__AdaptationRule__LevelAssignment_4
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
    // InternalAdaptDsl.g:3257:1: rule__AdaptationRule__Group__5 : rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 ;
    public final void rule__AdaptationRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3261:1: ( rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6 )
            // InternalAdaptDsl.g:3262:2: rule__AdaptationRule__Group__5__Impl rule__AdaptationRule__Group__6
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
    // InternalAdaptDsl.g:3269:1: rule__AdaptationRule__Group__5__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3273:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3274:1: ( ';' )
            {
            // InternalAdaptDsl.g:3274:1: ( ';' )
            // InternalAdaptDsl.g:3275:2: ';'
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
    // InternalAdaptDsl.g:3284:1: rule__AdaptationRule__Group__6 : rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 ;
    public final void rule__AdaptationRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3288:1: ( rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7 )
            // InternalAdaptDsl.g:3289:2: rule__AdaptationRule__Group__6__Impl rule__AdaptationRule__Group__7
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
    // InternalAdaptDsl.g:3296:1: rule__AdaptationRule__Group__6__Impl : ( 'FACT' ) ;
    public final void rule__AdaptationRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3300:1: ( ( 'FACT' ) )
            // InternalAdaptDsl.g:3301:1: ( 'FACT' )
            {
            // InternalAdaptDsl.g:3301:1: ( 'FACT' )
            // InternalAdaptDsl.g:3302:2: 'FACT'
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
    // InternalAdaptDsl.g:3311:1: rule__AdaptationRule__Group__7 : rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 ;
    public final void rule__AdaptationRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3315:1: ( rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8 )
            // InternalAdaptDsl.g:3316:2: rule__AdaptationRule__Group__7__Impl rule__AdaptationRule__Group__8
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
    // InternalAdaptDsl.g:3323:1: rule__AdaptationRule__Group__7__Impl : ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) ;
    public final void rule__AdaptationRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3327:1: ( ( ( rule__AdaptationRule__FactTypeAssignment_7 ) ) )
            // InternalAdaptDsl.g:3328:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            {
            // InternalAdaptDsl.g:3328:1: ( ( rule__AdaptationRule__FactTypeAssignment_7 ) )
            // InternalAdaptDsl.g:3329:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactTypeAssignment_7()); 
            // InternalAdaptDsl.g:3330:2: ( rule__AdaptationRule__FactTypeAssignment_7 )
            // InternalAdaptDsl.g:3330:3: rule__AdaptationRule__FactTypeAssignment_7
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
    // InternalAdaptDsl.g:3338:1: rule__AdaptationRule__Group__8 : rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 ;
    public final void rule__AdaptationRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3342:1: ( rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9 )
            // InternalAdaptDsl.g:3343:2: rule__AdaptationRule__Group__8__Impl rule__AdaptationRule__Group__9
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
    // InternalAdaptDsl.g:3350:1: rule__AdaptationRule__Group__8__Impl : ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) ;
    public final void rule__AdaptationRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3354:1: ( ( ( rule__AdaptationRule__FactNameAssignment_8 ) ) )
            // InternalAdaptDsl.g:3355:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            {
            // InternalAdaptDsl.g:3355:1: ( ( rule__AdaptationRule__FactNameAssignment_8 ) )
            // InternalAdaptDsl.g:3356:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getFactNameAssignment_8()); 
            // InternalAdaptDsl.g:3357:2: ( rule__AdaptationRule__FactNameAssignment_8 )
            // InternalAdaptDsl.g:3357:3: rule__AdaptationRule__FactNameAssignment_8
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
    // InternalAdaptDsl.g:3365:1: rule__AdaptationRule__Group__9 : rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 ;
    public final void rule__AdaptationRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3369:1: ( rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10 )
            // InternalAdaptDsl.g:3370:2: rule__AdaptationRule__Group__9__Impl rule__AdaptationRule__Group__10
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
    // InternalAdaptDsl.g:3377:1: rule__AdaptationRule__Group__9__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3381:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3382:1: ( ';' )
            {
            // InternalAdaptDsl.g:3382:1: ( ';' )
            // InternalAdaptDsl.g:3383:2: ';'
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
    // InternalAdaptDsl.g:3392:1: rule__AdaptationRule__Group__10 : rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 ;
    public final void rule__AdaptationRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3396:1: ( rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11 )
            // InternalAdaptDsl.g:3397:2: rule__AdaptationRule__Group__10__Impl rule__AdaptationRule__Group__11
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
    // InternalAdaptDsl.g:3404:1: rule__AdaptationRule__Group__10__Impl : ( 'IF' ) ;
    public final void rule__AdaptationRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3408:1: ( ( 'IF' ) )
            // InternalAdaptDsl.g:3409:1: ( 'IF' )
            {
            // InternalAdaptDsl.g:3409:1: ( 'IF' )
            // InternalAdaptDsl.g:3410:2: 'IF'
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
    // InternalAdaptDsl.g:3419:1: rule__AdaptationRule__Group__11 : rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 ;
    public final void rule__AdaptationRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3423:1: ( rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12 )
            // InternalAdaptDsl.g:3424:2: rule__AdaptationRule__Group__11__Impl rule__AdaptationRule__Group__12
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
    // InternalAdaptDsl.g:3431:1: rule__AdaptationRule__Group__11__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3435:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3436:1: ( '(' )
            {
            // InternalAdaptDsl.g:3436:1: ( '(' )
            // InternalAdaptDsl.g:3437:2: '('
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
    // InternalAdaptDsl.g:3446:1: rule__AdaptationRule__Group__12 : rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 ;
    public final void rule__AdaptationRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3450:1: ( rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13 )
            // InternalAdaptDsl.g:3451:2: rule__AdaptationRule__Group__12__Impl rule__AdaptationRule__Group__13
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
    // InternalAdaptDsl.g:3458:1: rule__AdaptationRule__Group__12__Impl : ( ( rule__AdaptationRule__ExprAssignment_12 ) ) ;
    public final void rule__AdaptationRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3462:1: ( ( ( rule__AdaptationRule__ExprAssignment_12 ) ) )
            // InternalAdaptDsl.g:3463:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            {
            // InternalAdaptDsl.g:3463:1: ( ( rule__AdaptationRule__ExprAssignment_12 ) )
            // InternalAdaptDsl.g:3464:2: ( rule__AdaptationRule__ExprAssignment_12 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getExprAssignment_12()); 
            // InternalAdaptDsl.g:3465:2: ( rule__AdaptationRule__ExprAssignment_12 )
            // InternalAdaptDsl.g:3465:3: rule__AdaptationRule__ExprAssignment_12
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
    // InternalAdaptDsl.g:3473:1: rule__AdaptationRule__Group__13 : rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 ;
    public final void rule__AdaptationRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3477:1: ( rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14 )
            // InternalAdaptDsl.g:3478:2: rule__AdaptationRule__Group__13__Impl rule__AdaptationRule__Group__14
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
    // InternalAdaptDsl.g:3485:1: rule__AdaptationRule__Group__13__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3489:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3490:1: ( ')' )
            {
            // InternalAdaptDsl.g:3490:1: ( ')' )
            // InternalAdaptDsl.g:3491:2: ')'
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
    // InternalAdaptDsl.g:3500:1: rule__AdaptationRule__Group__14 : rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 ;
    public final void rule__AdaptationRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3504:1: ( rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15 )
            // InternalAdaptDsl.g:3505:2: rule__AdaptationRule__Group__14__Impl rule__AdaptationRule__Group__15
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
    // InternalAdaptDsl.g:3512:1: rule__AdaptationRule__Group__14__Impl : ( 'THEN' ) ;
    public final void rule__AdaptationRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3516:1: ( ( 'THEN' ) )
            // InternalAdaptDsl.g:3517:1: ( 'THEN' )
            {
            // InternalAdaptDsl.g:3517:1: ( 'THEN' )
            // InternalAdaptDsl.g:3518:2: 'THEN'
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
    // InternalAdaptDsl.g:3527:1: rule__AdaptationRule__Group__15 : rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 ;
    public final void rule__AdaptationRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3531:1: ( rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16 )
            // InternalAdaptDsl.g:3532:2: rule__AdaptationRule__Group__15__Impl rule__AdaptationRule__Group__16
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
    // InternalAdaptDsl.g:3539:1: rule__AdaptationRule__Group__15__Impl : ( '(' ) ;
    public final void rule__AdaptationRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3543:1: ( ( '(' ) )
            // InternalAdaptDsl.g:3544:1: ( '(' )
            {
            // InternalAdaptDsl.g:3544:1: ( '(' )
            // InternalAdaptDsl.g:3545:2: '('
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
    // InternalAdaptDsl.g:3554:1: rule__AdaptationRule__Group__16 : rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 ;
    public final void rule__AdaptationRule__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3558:1: ( rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17 )
            // InternalAdaptDsl.g:3559:2: rule__AdaptationRule__Group__16__Impl rule__AdaptationRule__Group__17
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
    // InternalAdaptDsl.g:3566:1: rule__AdaptationRule__Group__16__Impl : ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) ;
    public final void rule__AdaptationRule__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3570:1: ( ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) ) )
            // InternalAdaptDsl.g:3571:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            {
            // InternalAdaptDsl.g:3571:1: ( ( rule__AdaptationRule__ActionCollectionAssignment_16 ) )
            // InternalAdaptDsl.g:3572:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            {
             before(grammarAccess.getAdaptationRuleAccess().getActionCollectionAssignment_16()); 
            // InternalAdaptDsl.g:3573:2: ( rule__AdaptationRule__ActionCollectionAssignment_16 )
            // InternalAdaptDsl.g:3573:3: rule__AdaptationRule__ActionCollectionAssignment_16
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
    // InternalAdaptDsl.g:3581:1: rule__AdaptationRule__Group__17 : rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 ;
    public final void rule__AdaptationRule__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3585:1: ( rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18 )
            // InternalAdaptDsl.g:3586:2: rule__AdaptationRule__Group__17__Impl rule__AdaptationRule__Group__18
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
    // InternalAdaptDsl.g:3593:1: rule__AdaptationRule__Group__17__Impl : ( ')' ) ;
    public final void rule__AdaptationRule__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3597:1: ( ( ')' ) )
            // InternalAdaptDsl.g:3598:1: ( ')' )
            {
            // InternalAdaptDsl.g:3598:1: ( ')' )
            // InternalAdaptDsl.g:3599:2: ')'
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
    // InternalAdaptDsl.g:3608:1: rule__AdaptationRule__Group__18 : rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 ;
    public final void rule__AdaptationRule__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3612:1: ( rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19 )
            // InternalAdaptDsl.g:3613:2: rule__AdaptationRule__Group__18__Impl rule__AdaptationRule__Group__19
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
    // InternalAdaptDsl.g:3620:1: rule__AdaptationRule__Group__18__Impl : ( ';' ) ;
    public final void rule__AdaptationRule__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3624:1: ( ( ';' ) )
            // InternalAdaptDsl.g:3625:1: ( ';' )
            {
            // InternalAdaptDsl.g:3625:1: ( ';' )
            // InternalAdaptDsl.g:3626:2: ';'
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
    // InternalAdaptDsl.g:3635:1: rule__AdaptationRule__Group__19 : rule__AdaptationRule__Group__19__Impl ;
    public final void rule__AdaptationRule__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3639:1: ( rule__AdaptationRule__Group__19__Impl )
            // InternalAdaptDsl.g:3640:2: rule__AdaptationRule__Group__19__Impl
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
    // InternalAdaptDsl.g:3646:1: rule__AdaptationRule__Group__19__Impl : ( '}' ) ;
    public final void rule__AdaptationRule__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3650:1: ( ( '}' ) )
            // InternalAdaptDsl.g:3651:1: ( '}' )
            {
            // InternalAdaptDsl.g:3651:1: ( '}' )
            // InternalAdaptDsl.g:3652:2: '}'
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
    // InternalAdaptDsl.g:3662:1: rule__ConditionalOR__Group__0 : rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 ;
    public final void rule__ConditionalOR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3666:1: ( rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1 )
            // InternalAdaptDsl.g:3667:2: rule__ConditionalOR__Group__0__Impl rule__ConditionalOR__Group__1
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
    // InternalAdaptDsl.g:3674:1: rule__ConditionalOR__Group__0__Impl : ( ( rule__ConditionalOR__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalOR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3678:1: ( ( ( rule__ConditionalOR__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:3679:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3679:1: ( ( rule__ConditionalOR__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:3680:2: ( rule__ConditionalOR__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalORAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:3681:2: ( rule__ConditionalOR__LeftAssignment_0 )
            // InternalAdaptDsl.g:3681:3: rule__ConditionalOR__LeftAssignment_0
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
    // InternalAdaptDsl.g:3689:1: rule__ConditionalOR__Group__1 : rule__ConditionalOR__Group__1__Impl ;
    public final void rule__ConditionalOR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3693:1: ( rule__ConditionalOR__Group__1__Impl )
            // InternalAdaptDsl.g:3694:2: rule__ConditionalOR__Group__1__Impl
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
    // InternalAdaptDsl.g:3700:1: rule__ConditionalOR__Group__1__Impl : ( ( rule__ConditionalOR__Group_1__0 )? ) ;
    public final void rule__ConditionalOR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3704:1: ( ( ( rule__ConditionalOR__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3705:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3705:1: ( ( rule__ConditionalOR__Group_1__0 )? )
            // InternalAdaptDsl.g:3706:2: ( rule__ConditionalOR__Group_1__0 )?
            {
             before(grammarAccess.getConditionalORAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3707:2: ( rule__ConditionalOR__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:3707:3: rule__ConditionalOR__Group_1__0
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
    // InternalAdaptDsl.g:3716:1: rule__ConditionalOR__Group_1__0 : rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 ;
    public final void rule__ConditionalOR__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3720:1: ( rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1 )
            // InternalAdaptDsl.g:3721:2: rule__ConditionalOR__Group_1__0__Impl rule__ConditionalOR__Group_1__1
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
    // InternalAdaptDsl.g:3728:1: rule__ConditionalOR__Group_1__0__Impl : ( '||' ) ;
    public final void rule__ConditionalOR__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3732:1: ( ( '||' ) )
            // InternalAdaptDsl.g:3733:1: ( '||' )
            {
            // InternalAdaptDsl.g:3733:1: ( '||' )
            // InternalAdaptDsl.g:3734:2: '||'
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
    // InternalAdaptDsl.g:3743:1: rule__ConditionalOR__Group_1__1 : rule__ConditionalOR__Group_1__1__Impl ;
    public final void rule__ConditionalOR__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3747:1: ( rule__ConditionalOR__Group_1__1__Impl )
            // InternalAdaptDsl.g:3748:2: rule__ConditionalOR__Group_1__1__Impl
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
    // InternalAdaptDsl.g:3754:1: rule__ConditionalOR__Group_1__1__Impl : ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalOR__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3758:1: ( ( ( rule__ConditionalOR__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3759:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3759:1: ( ( rule__ConditionalOR__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3760:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalORAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3761:2: ( rule__ConditionalOR__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3761:3: rule__ConditionalOR__RightAssignment_1_1
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
    // InternalAdaptDsl.g:3770:1: rule__ConditionalAND__Group__0 : rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 ;
    public final void rule__ConditionalAND__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3774:1: ( rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1 )
            // InternalAdaptDsl.g:3775:2: rule__ConditionalAND__Group__0__Impl rule__ConditionalAND__Group__1
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
    // InternalAdaptDsl.g:3782:1: rule__ConditionalAND__Group__0__Impl : ( ( rule__ConditionalAND__LeftAssignment_0 ) ) ;
    public final void rule__ConditionalAND__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3786:1: ( ( ( rule__ConditionalAND__LeftAssignment_0 ) ) )
            // InternalAdaptDsl.g:3787:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3787:1: ( ( rule__ConditionalAND__LeftAssignment_0 ) )
            // InternalAdaptDsl.g:3788:2: ( rule__ConditionalAND__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionalANDAccess().getLeftAssignment_0()); 
            // InternalAdaptDsl.g:3789:2: ( rule__ConditionalAND__LeftAssignment_0 )
            // InternalAdaptDsl.g:3789:3: rule__ConditionalAND__LeftAssignment_0
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
    // InternalAdaptDsl.g:3797:1: rule__ConditionalAND__Group__1 : rule__ConditionalAND__Group__1__Impl ;
    public final void rule__ConditionalAND__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3801:1: ( rule__ConditionalAND__Group__1__Impl )
            // InternalAdaptDsl.g:3802:2: rule__ConditionalAND__Group__1__Impl
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
    // InternalAdaptDsl.g:3808:1: rule__ConditionalAND__Group__1__Impl : ( ( rule__ConditionalAND__Group_1__0 )? ) ;
    public final void rule__ConditionalAND__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3812:1: ( ( ( rule__ConditionalAND__Group_1__0 )? ) )
            // InternalAdaptDsl.g:3813:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:3813:1: ( ( rule__ConditionalAND__Group_1__0 )? )
            // InternalAdaptDsl.g:3814:2: ( rule__ConditionalAND__Group_1__0 )?
            {
             before(grammarAccess.getConditionalANDAccess().getGroup_1()); 
            // InternalAdaptDsl.g:3815:2: ( rule__ConditionalAND__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptDsl.g:3815:3: rule__ConditionalAND__Group_1__0
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
    // InternalAdaptDsl.g:3824:1: rule__ConditionalAND__Group_1__0 : rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 ;
    public final void rule__ConditionalAND__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3828:1: ( rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1 )
            // InternalAdaptDsl.g:3829:2: rule__ConditionalAND__Group_1__0__Impl rule__ConditionalAND__Group_1__1
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
    // InternalAdaptDsl.g:3836:1: rule__ConditionalAND__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__ConditionalAND__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3840:1: ( ( '&&' ) )
            // InternalAdaptDsl.g:3841:1: ( '&&' )
            {
            // InternalAdaptDsl.g:3841:1: ( '&&' )
            // InternalAdaptDsl.g:3842:2: '&&'
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
    // InternalAdaptDsl.g:3851:1: rule__ConditionalAND__Group_1__1 : rule__ConditionalAND__Group_1__1__Impl ;
    public final void rule__ConditionalAND__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3855:1: ( rule__ConditionalAND__Group_1__1__Impl )
            // InternalAdaptDsl.g:3856:2: rule__ConditionalAND__Group_1__1__Impl
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
    // InternalAdaptDsl.g:3862:1: rule__ConditionalAND__Group_1__1__Impl : ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) ;
    public final void rule__ConditionalAND__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3866:1: ( ( ( rule__ConditionalAND__RightAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:3867:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:3867:1: ( ( rule__ConditionalAND__RightAssignment_1_1 ) )
            // InternalAdaptDsl.g:3868:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            {
             before(grammarAccess.getConditionalANDAccess().getRightAssignment_1_1()); 
            // InternalAdaptDsl.g:3869:2: ( rule__ConditionalAND__RightAssignment_1_1 )
            // InternalAdaptDsl.g:3869:3: rule__ConditionalAND__RightAssignment_1_1
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
    // InternalAdaptDsl.g:3878:1: rule__BooleanCondition__Group_0__0 : rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 ;
    public final void rule__BooleanCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3882:1: ( rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1 )
            // InternalAdaptDsl.g:3883:2: rule__BooleanCondition__Group_0__0__Impl rule__BooleanCondition__Group_0__1
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
    // InternalAdaptDsl.g:3890:1: rule__BooleanCondition__Group_0__0__Impl : ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) ;
    public final void rule__BooleanCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3894:1: ( ( ( rule__BooleanCondition__FactAssignment_0_0 ) ) )
            // InternalAdaptDsl.g:3895:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            {
            // InternalAdaptDsl.g:3895:1: ( ( rule__BooleanCondition__FactAssignment_0_0 ) )
            // InternalAdaptDsl.g:3896:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            {
             before(grammarAccess.getBooleanConditionAccess().getFactAssignment_0_0()); 
            // InternalAdaptDsl.g:3897:2: ( rule__BooleanCondition__FactAssignment_0_0 )
            // InternalAdaptDsl.g:3897:3: rule__BooleanCondition__FactAssignment_0_0
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
    // InternalAdaptDsl.g:3905:1: rule__BooleanCondition__Group_0__1 : rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 ;
    public final void rule__BooleanCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3909:1: ( rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2 )
            // InternalAdaptDsl.g:3910:2: rule__BooleanCondition__Group_0__1__Impl rule__BooleanCondition__Group_0__2
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
    // InternalAdaptDsl.g:3917:1: rule__BooleanCondition__Group_0__1__Impl : ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) ;
    public final void rule__BooleanCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3921:1: ( ( ( rule__BooleanCondition__OpAssignment_0_1 ) ) )
            // InternalAdaptDsl.g:3922:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            {
            // InternalAdaptDsl.g:3922:1: ( ( rule__BooleanCondition__OpAssignment_0_1 ) )
            // InternalAdaptDsl.g:3923:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            {
             before(grammarAccess.getBooleanConditionAccess().getOpAssignment_0_1()); 
            // InternalAdaptDsl.g:3924:2: ( rule__BooleanCondition__OpAssignment_0_1 )
            // InternalAdaptDsl.g:3924:3: rule__BooleanCondition__OpAssignment_0_1
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
    // InternalAdaptDsl.g:3932:1: rule__BooleanCondition__Group_0__2 : rule__BooleanCondition__Group_0__2__Impl ;
    public final void rule__BooleanCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3936:1: ( rule__BooleanCondition__Group_0__2__Impl )
            // InternalAdaptDsl.g:3937:2: rule__BooleanCondition__Group_0__2__Impl
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
    // InternalAdaptDsl.g:3943:1: rule__BooleanCondition__Group_0__2__Impl : ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) ;
    public final void rule__BooleanCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3947:1: ( ( ( rule__BooleanCondition__ValAssignment_0_2 ) ) )
            // InternalAdaptDsl.g:3948:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            {
            // InternalAdaptDsl.g:3948:1: ( ( rule__BooleanCondition__ValAssignment_0_2 ) )
            // InternalAdaptDsl.g:3949:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            {
             before(grammarAccess.getBooleanConditionAccess().getValAssignment_0_2()); 
            // InternalAdaptDsl.g:3950:2: ( rule__BooleanCondition__ValAssignment_0_2 )
            // InternalAdaptDsl.g:3950:3: rule__BooleanCondition__ValAssignment_0_2
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
    // InternalAdaptDsl.g:3959:1: rule__NumberCondition__Group__0 : rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 ;
    public final void rule__NumberCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3963:1: ( rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1 )
            // InternalAdaptDsl.g:3964:2: rule__NumberCondition__Group__0__Impl rule__NumberCondition__Group__1
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
    // InternalAdaptDsl.g:3971:1: rule__NumberCondition__Group__0__Impl : ( ( rule__NumberCondition__FactAssignment_0 ) ) ;
    public final void rule__NumberCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3975:1: ( ( ( rule__NumberCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:3976:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:3976:1: ( ( rule__NumberCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:3977:2: ( rule__NumberCondition__FactAssignment_0 )
            {
             before(grammarAccess.getNumberConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:3978:2: ( rule__NumberCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:3978:3: rule__NumberCondition__FactAssignment_0
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
    // InternalAdaptDsl.g:3986:1: rule__NumberCondition__Group__1 : rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 ;
    public final void rule__NumberCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:3990:1: ( rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2 )
            // InternalAdaptDsl.g:3991:2: rule__NumberCondition__Group__1__Impl rule__NumberCondition__Group__2
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
    // InternalAdaptDsl.g:3998:1: rule__NumberCondition__Group__1__Impl : ( ( rule__NumberCondition__OpAssignment_1 ) ) ;
    public final void rule__NumberCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4002:1: ( ( ( rule__NumberCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:4003:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:4003:1: ( ( rule__NumberCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:4004:2: ( rule__NumberCondition__OpAssignment_1 )
            {
             before(grammarAccess.getNumberConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:4005:2: ( rule__NumberCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:4005:3: rule__NumberCondition__OpAssignment_1
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
    // InternalAdaptDsl.g:4013:1: rule__NumberCondition__Group__2 : rule__NumberCondition__Group__2__Impl ;
    public final void rule__NumberCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4017:1: ( rule__NumberCondition__Group__2__Impl )
            // InternalAdaptDsl.g:4018:2: rule__NumberCondition__Group__2__Impl
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
    // InternalAdaptDsl.g:4024:1: rule__NumberCondition__Group__2__Impl : ( ( rule__NumberCondition__ValAssignment_2 ) ) ;
    public final void rule__NumberCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4028:1: ( ( ( rule__NumberCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:4029:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4029:1: ( ( rule__NumberCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:4030:2: ( rule__NumberCondition__ValAssignment_2 )
            {
             before(grammarAccess.getNumberConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:4031:2: ( rule__NumberCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:4031:3: rule__NumberCondition__ValAssignment_2
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
    // InternalAdaptDsl.g:4040:1: rule__StringCondition__Group__0 : rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 ;
    public final void rule__StringCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4044:1: ( rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1 )
            // InternalAdaptDsl.g:4045:2: rule__StringCondition__Group__0__Impl rule__StringCondition__Group__1
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
    // InternalAdaptDsl.g:4052:1: rule__StringCondition__Group__0__Impl : ( ( rule__StringCondition__FactAssignment_0 ) ) ;
    public final void rule__StringCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4056:1: ( ( ( rule__StringCondition__FactAssignment_0 ) ) )
            // InternalAdaptDsl.g:4057:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            {
            // InternalAdaptDsl.g:4057:1: ( ( rule__StringCondition__FactAssignment_0 ) )
            // InternalAdaptDsl.g:4058:2: ( rule__StringCondition__FactAssignment_0 )
            {
             before(grammarAccess.getStringConditionAccess().getFactAssignment_0()); 
            // InternalAdaptDsl.g:4059:2: ( rule__StringCondition__FactAssignment_0 )
            // InternalAdaptDsl.g:4059:3: rule__StringCondition__FactAssignment_0
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
    // InternalAdaptDsl.g:4067:1: rule__StringCondition__Group__1 : rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 ;
    public final void rule__StringCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4071:1: ( rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2 )
            // InternalAdaptDsl.g:4072:2: rule__StringCondition__Group__1__Impl rule__StringCondition__Group__2
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
    // InternalAdaptDsl.g:4079:1: rule__StringCondition__Group__1__Impl : ( ( rule__StringCondition__OpAssignment_1 ) ) ;
    public final void rule__StringCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4083:1: ( ( ( rule__StringCondition__OpAssignment_1 ) ) )
            // InternalAdaptDsl.g:4084:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            {
            // InternalAdaptDsl.g:4084:1: ( ( rule__StringCondition__OpAssignment_1 ) )
            // InternalAdaptDsl.g:4085:2: ( rule__StringCondition__OpAssignment_1 )
            {
             before(grammarAccess.getStringConditionAccess().getOpAssignment_1()); 
            // InternalAdaptDsl.g:4086:2: ( rule__StringCondition__OpAssignment_1 )
            // InternalAdaptDsl.g:4086:3: rule__StringCondition__OpAssignment_1
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
    // InternalAdaptDsl.g:4094:1: rule__StringCondition__Group__2 : rule__StringCondition__Group__2__Impl ;
    public final void rule__StringCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4098:1: ( rule__StringCondition__Group__2__Impl )
            // InternalAdaptDsl.g:4099:2: rule__StringCondition__Group__2__Impl
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
    // InternalAdaptDsl.g:4105:1: rule__StringCondition__Group__2__Impl : ( ( rule__StringCondition__ValAssignment_2 ) ) ;
    public final void rule__StringCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4109:1: ( ( ( rule__StringCondition__ValAssignment_2 ) ) )
            // InternalAdaptDsl.g:4110:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4110:1: ( ( rule__StringCondition__ValAssignment_2 ) )
            // InternalAdaptDsl.g:4111:2: ( rule__StringCondition__ValAssignment_2 )
            {
             before(grammarAccess.getStringConditionAccess().getValAssignment_2()); 
            // InternalAdaptDsl.g:4112:2: ( rule__StringCondition__ValAssignment_2 )
            // InternalAdaptDsl.g:4112:3: rule__StringCondition__ValAssignment_2
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
    // InternalAdaptDsl.g:4121:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4125:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalAdaptDsl.g:4126:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
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
    // InternalAdaptDsl.g:4133:1: rule__Fact__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4137:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4138:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4138:1: ( RULE_ID )
            // InternalAdaptDsl.g:4139:2: RULE_ID
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
    // InternalAdaptDsl.g:4148:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4152:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // InternalAdaptDsl.g:4153:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptDsl.g:4160:1: rule__Fact__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4164:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4165:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4165:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4166:2: ( '()' )?
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:4167:2: ( '()' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:4167:3: '()'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4175:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4179:1: ( rule__Fact__Group__2__Impl )
            // InternalAdaptDsl.g:4180:2: rule__Fact__Group__2__Impl
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
    // InternalAdaptDsl.g:4186:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__Group_2__0 )* ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4190:1: ( ( ( rule__Fact__Group_2__0 )* ) )
            // InternalAdaptDsl.g:4191:1: ( ( rule__Fact__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:4191:1: ( ( rule__Fact__Group_2__0 )* )
            // InternalAdaptDsl.g:4192:2: ( rule__Fact__Group_2__0 )*
            {
             before(grammarAccess.getFactAccess().getGroup_2()); 
            // InternalAdaptDsl.g:4193:2: ( rule__Fact__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAdaptDsl.g:4193:3: rule__Fact__Group_2__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Fact__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAdaptDsl.g:4202:1: rule__Fact__Group_2__0 : rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 ;
    public final void rule__Fact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4206:1: ( rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 )
            // InternalAdaptDsl.g:4207:2: rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1
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
    // InternalAdaptDsl.g:4214:1: rule__Fact__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Fact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4218:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4219:1: ( '.' )
            {
            // InternalAdaptDsl.g:4219:1: ( '.' )
            // InternalAdaptDsl.g:4220:2: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4229:1: rule__Fact__Group_2__1 : rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2 ;
    public final void rule__Fact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4233:1: ( rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2 )
            // InternalAdaptDsl.g:4234:2: rule__Fact__Group_2__1__Impl rule__Fact__Group_2__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4241:1: rule__Fact__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Fact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4245:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4246:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4246:1: ( RULE_ID )
            // InternalAdaptDsl.g:4247:2: RULE_ID
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
    // InternalAdaptDsl.g:4256:1: rule__Fact__Group_2__2 : rule__Fact__Group_2__2__Impl ;
    public final void rule__Fact__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4260:1: ( rule__Fact__Group_2__2__Impl )
            // InternalAdaptDsl.g:4261:2: rule__Fact__Group_2__2__Impl
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
    // InternalAdaptDsl.g:4267:1: rule__Fact__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__Fact__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4271:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4272:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4272:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4273:2: ( '()' )?
            {
             before(grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:4274:2: ( '()' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptDsl.g:4274:3: '()'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4283:1: rule__FactProperty__Group__0 : rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 ;
    public final void rule__FactProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4287:1: ( rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1 )
            // InternalAdaptDsl.g:4288:2: rule__FactProperty__Group__0__Impl rule__FactProperty__Group__1
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
    // InternalAdaptDsl.g:4295:1: rule__FactProperty__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4299:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4300:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4300:1: ( RULE_ID )
            // InternalAdaptDsl.g:4301:2: RULE_ID
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
    // InternalAdaptDsl.g:4310:1: rule__FactProperty__Group__1 : rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 ;
    public final void rule__FactProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4314:1: ( rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2 )
            // InternalAdaptDsl.g:4315:2: rule__FactProperty__Group__1__Impl rule__FactProperty__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptDsl.g:4322:1: rule__FactProperty__Group__1__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4326:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4327:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4327:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4328:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1()); 
            // InternalAdaptDsl.g:4329:2: ( '()' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:4329:3: '()'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4337:1: rule__FactProperty__Group__2 : rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 ;
    public final void rule__FactProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4341:1: ( rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3 )
            // InternalAdaptDsl.g:4342:2: rule__FactProperty__Group__2__Impl rule__FactProperty__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalAdaptDsl.g:4349:1: rule__FactProperty__Group__2__Impl : ( ( rule__FactProperty__Group_2__0 )* ) ;
    public final void rule__FactProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4353:1: ( ( ( rule__FactProperty__Group_2__0 )* ) )
            // InternalAdaptDsl.g:4354:1: ( ( rule__FactProperty__Group_2__0 )* )
            {
            // InternalAdaptDsl.g:4354:1: ( ( rule__FactProperty__Group_2__0 )* )
            // InternalAdaptDsl.g:4355:2: ( rule__FactProperty__Group_2__0 )*
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_2()); 
            // InternalAdaptDsl.g:4356:2: ( rule__FactProperty__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        int LA28_2 = input.LA(3);

                        if ( ((LA28_2>=41 && LA28_2<=42)) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalAdaptDsl.g:4356:3: rule__FactProperty__Group_2__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__FactProperty__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAdaptDsl.g:4364:1: rule__FactProperty__Group__3 : rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 ;
    public final void rule__FactProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4368:1: ( rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4 )
            // InternalAdaptDsl.g:4369:2: rule__FactProperty__Group__3__Impl rule__FactProperty__Group__4
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
    // InternalAdaptDsl.g:4376:1: rule__FactProperty__Group__3__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4380:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4381:1: ( '.' )
            {
            // InternalAdaptDsl.g:4381:1: ( '.' )
            // InternalAdaptDsl.g:4382:2: '.'
            {
             before(grammarAccess.getFactPropertyAccess().getFullStopKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4391:1: rule__FactProperty__Group__4 : rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 ;
    public final void rule__FactProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4395:1: ( rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5 )
            // InternalAdaptDsl.g:4396:2: rule__FactProperty__Group__4__Impl rule__FactProperty__Group__5
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
    // InternalAdaptDsl.g:4403:1: rule__FactProperty__Group__4__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4407:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4408:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4408:1: ( RULE_ID )
            // InternalAdaptDsl.g:4409:2: RULE_ID
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
    // InternalAdaptDsl.g:4418:1: rule__FactProperty__Group__5 : rule__FactProperty__Group__5__Impl ;
    public final void rule__FactProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4422:1: ( rule__FactProperty__Group__5__Impl )
            // InternalAdaptDsl.g:4423:2: rule__FactProperty__Group__5__Impl
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
    // InternalAdaptDsl.g:4429:1: rule__FactProperty__Group__5__Impl : ( ( rule__FactProperty__Group_5__0 )? ) ;
    public final void rule__FactProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4433:1: ( ( ( rule__FactProperty__Group_5__0 )? ) )
            // InternalAdaptDsl.g:4434:1: ( ( rule__FactProperty__Group_5__0 )? )
            {
            // InternalAdaptDsl.g:4434:1: ( ( rule__FactProperty__Group_5__0 )? )
            // InternalAdaptDsl.g:4435:2: ( rule__FactProperty__Group_5__0 )?
            {
             before(grammarAccess.getFactPropertyAccess().getGroup_5()); 
            // InternalAdaptDsl.g:4436:2: ( rule__FactProperty__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAdaptDsl.g:4436:3: rule__FactProperty__Group_5__0
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
    // InternalAdaptDsl.g:4445:1: rule__FactProperty__Group_2__0 : rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 ;
    public final void rule__FactProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4449:1: ( rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1 )
            // InternalAdaptDsl.g:4450:2: rule__FactProperty__Group_2__0__Impl rule__FactProperty__Group_2__1
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
    // InternalAdaptDsl.g:4457:1: rule__FactProperty__Group_2__0__Impl : ( '.' ) ;
    public final void rule__FactProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4461:1: ( ( '.' ) )
            // InternalAdaptDsl.g:4462:1: ( '.' )
            {
            // InternalAdaptDsl.g:4462:1: ( '.' )
            // InternalAdaptDsl.g:4463:2: '.'
            {
             before(grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4472:1: rule__FactProperty__Group_2__1 : rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 ;
    public final void rule__FactProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4476:1: ( rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2 )
            // InternalAdaptDsl.g:4477:2: rule__FactProperty__Group_2__1__Impl rule__FactProperty__Group_2__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:4484:1: rule__FactProperty__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__FactProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4488:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:4489:1: ( RULE_ID )
            {
            // InternalAdaptDsl.g:4489:1: ( RULE_ID )
            // InternalAdaptDsl.g:4490:2: RULE_ID
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
    // InternalAdaptDsl.g:4499:1: rule__FactProperty__Group_2__2 : rule__FactProperty__Group_2__2__Impl ;
    public final void rule__FactProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4503:1: ( rule__FactProperty__Group_2__2__Impl )
            // InternalAdaptDsl.g:4504:2: rule__FactProperty__Group_2__2__Impl
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
    // InternalAdaptDsl.g:4510:1: rule__FactProperty__Group_2__2__Impl : ( ( '()' )? ) ;
    public final void rule__FactProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4514:1: ( ( ( '()' )? ) )
            // InternalAdaptDsl.g:4515:1: ( ( '()' )? )
            {
            // InternalAdaptDsl.g:4515:1: ( ( '()' )? )
            // InternalAdaptDsl.g:4516:2: ( '()' )?
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2()); 
            // InternalAdaptDsl.g:4517:2: ( '()' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdaptDsl.g:4517:3: '()'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4526:1: rule__FactProperty__Group_5__0 : rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 ;
    public final void rule__FactProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4530:1: ( rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1 )
            // InternalAdaptDsl.g:4531:2: rule__FactProperty__Group_5__0__Impl rule__FactProperty__Group_5__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAdaptDsl.g:4538:1: rule__FactProperty__Group_5__0__Impl : ( '(' ) ;
    public final void rule__FactProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4542:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4543:1: ( '(' )
            {
            // InternalAdaptDsl.g:4543:1: ( '(' )
            // InternalAdaptDsl.g:4544:2: '('
            {
             before(grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4553:1: rule__FactProperty__Group_5__1 : rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 ;
    public final void rule__FactProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4557:1: ( rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2 )
            // InternalAdaptDsl.g:4558:2: rule__FactProperty__Group_5__1__Impl rule__FactProperty__Group_5__2
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
    // InternalAdaptDsl.g:4565:1: rule__FactProperty__Group_5__1__Impl : ( ruleValue ) ;
    public final void rule__FactProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4569:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:4570:1: ( ruleValue )
            {
            // InternalAdaptDsl.g:4570:1: ( ruleValue )
            // InternalAdaptDsl.g:4571:2: ruleValue
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
    // InternalAdaptDsl.g:4580:1: rule__FactProperty__Group_5__2 : rule__FactProperty__Group_5__2__Impl ;
    public final void rule__FactProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4584:1: ( rule__FactProperty__Group_5__2__Impl )
            // InternalAdaptDsl.g:4585:2: rule__FactProperty__Group_5__2__Impl
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
    // InternalAdaptDsl.g:4591:1: rule__FactProperty__Group_5__2__Impl : ( ')' ) ;
    public final void rule__FactProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4595:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4596:1: ( ')' )
            {
            // InternalAdaptDsl.g:4596:1: ( ')' )
            // InternalAdaptDsl.g:4597:2: ')'
            {
             before(grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4607:1: rule__Actions__Group__0 : rule__Actions__Group__0__Impl rule__Actions__Group__1 ;
    public final void rule__Actions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4611:1: ( rule__Actions__Group__0__Impl rule__Actions__Group__1 )
            // InternalAdaptDsl.g:4612:2: rule__Actions__Group__0__Impl rule__Actions__Group__1
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
    // InternalAdaptDsl.g:4619:1: rule__Actions__Group__0__Impl : ( ( rule__Actions__ActionAssignment_0 ) ) ;
    public final void rule__Actions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4623:1: ( ( ( rule__Actions__ActionAssignment_0 ) ) )
            // InternalAdaptDsl.g:4624:1: ( ( rule__Actions__ActionAssignment_0 ) )
            {
            // InternalAdaptDsl.g:4624:1: ( ( rule__Actions__ActionAssignment_0 ) )
            // InternalAdaptDsl.g:4625:2: ( rule__Actions__ActionAssignment_0 )
            {
             before(grammarAccess.getActionsAccess().getActionAssignment_0()); 
            // InternalAdaptDsl.g:4626:2: ( rule__Actions__ActionAssignment_0 )
            // InternalAdaptDsl.g:4626:3: rule__Actions__ActionAssignment_0
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
    // InternalAdaptDsl.g:4634:1: rule__Actions__Group__1 : rule__Actions__Group__1__Impl ;
    public final void rule__Actions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4638:1: ( rule__Actions__Group__1__Impl )
            // InternalAdaptDsl.g:4639:2: rule__Actions__Group__1__Impl
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
    // InternalAdaptDsl.g:4645:1: rule__Actions__Group__1__Impl : ( ( rule__Actions__NextAssignment_1 )? ) ;
    public final void rule__Actions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4649:1: ( ( ( rule__Actions__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:4650:1: ( ( rule__Actions__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:4650:1: ( ( rule__Actions__NextAssignment_1 )? )
            // InternalAdaptDsl.g:4651:2: ( rule__Actions__NextAssignment_1 )?
            {
             before(grammarAccess.getActionsAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:4652:2: ( rule__Actions__NextAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43||(LA31_0>=45 && LA31_0<=59)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdaptDsl.g:4652:3: rule__Actions__NextAssignment_1
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
    // InternalAdaptDsl.g:4661:1: rule__ServiceFunctionCallOperation__Group__0 : rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 ;
    public final void rule__ServiceFunctionCallOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4665:1: ( rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1 )
            // InternalAdaptDsl.g:4666:2: rule__ServiceFunctionCallOperation__Group__0__Impl rule__ServiceFunctionCallOperation__Group__1
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
    // InternalAdaptDsl.g:4673:1: rule__ServiceFunctionCallOperation__Group__0__Impl : ( 'functionCall' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4677:1: ( ( 'functionCall' ) )
            // InternalAdaptDsl.g:4678:1: ( 'functionCall' )
            {
            // InternalAdaptDsl.g:4678:1: ( 'functionCall' )
            // InternalAdaptDsl.g:4679:2: 'functionCall'
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4688:1: rule__ServiceFunctionCallOperation__Group__1 : rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 ;
    public final void rule__ServiceFunctionCallOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4692:1: ( rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2 )
            // InternalAdaptDsl.g:4693:2: rule__ServiceFunctionCallOperation__Group__1__Impl rule__ServiceFunctionCallOperation__Group__2
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
    // InternalAdaptDsl.g:4700:1: rule__ServiceFunctionCallOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4704:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4705:1: ( '(' )
            {
            // InternalAdaptDsl.g:4705:1: ( '(' )
            // InternalAdaptDsl.g:4706:2: '('
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
    // InternalAdaptDsl.g:4715:1: rule__ServiceFunctionCallOperation__Group__2 : rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 ;
    public final void rule__ServiceFunctionCallOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4719:1: ( rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3 )
            // InternalAdaptDsl.g:4720:2: rule__ServiceFunctionCallOperation__Group__2__Impl rule__ServiceFunctionCallOperation__Group__3
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
    // InternalAdaptDsl.g:4727:1: rule__ServiceFunctionCallOperation__Group__2__Impl : ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4731:1: ( ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) ) )
            // InternalAdaptDsl.g:4732:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4732:1: ( ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 ) )
            // InternalAdaptDsl.g:4733:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getServiceAssignment_2()); 
            // InternalAdaptDsl.g:4734:2: ( rule__ServiceFunctionCallOperation__ServiceAssignment_2 )
            // InternalAdaptDsl.g:4734:3: rule__ServiceFunctionCallOperation__ServiceAssignment_2
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
    // InternalAdaptDsl.g:4742:1: rule__ServiceFunctionCallOperation__Group__3 : rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 ;
    public final void rule__ServiceFunctionCallOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4746:1: ( rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4 )
            // InternalAdaptDsl.g:4747:2: rule__ServiceFunctionCallOperation__Group__3__Impl rule__ServiceFunctionCallOperation__Group__4
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
    // InternalAdaptDsl.g:4754:1: rule__ServiceFunctionCallOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4758:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4759:1: ( ',' )
            {
            // InternalAdaptDsl.g:4759:1: ( ',' )
            // InternalAdaptDsl.g:4760:2: ','
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4769:1: rule__ServiceFunctionCallOperation__Group__4 : rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 ;
    public final void rule__ServiceFunctionCallOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4773:1: ( rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5 )
            // InternalAdaptDsl.g:4774:2: rule__ServiceFunctionCallOperation__Group__4__Impl rule__ServiceFunctionCallOperation__Group__5
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
    // InternalAdaptDsl.g:4781:1: rule__ServiceFunctionCallOperation__Group__4__Impl : ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4785:1: ( ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) ) )
            // InternalAdaptDsl.g:4786:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            {
            // InternalAdaptDsl.g:4786:1: ( ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 ) )
            // InternalAdaptDsl.g:4787:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getFunctionAssignment_4()); 
            // InternalAdaptDsl.g:4788:2: ( rule__ServiceFunctionCallOperation__FunctionAssignment_4 )
            // InternalAdaptDsl.g:4788:3: rule__ServiceFunctionCallOperation__FunctionAssignment_4
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
    // InternalAdaptDsl.g:4796:1: rule__ServiceFunctionCallOperation__Group__5 : rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 ;
    public final void rule__ServiceFunctionCallOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4800:1: ( rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6 )
            // InternalAdaptDsl.g:4801:2: rule__ServiceFunctionCallOperation__Group__5__Impl rule__ServiceFunctionCallOperation__Group__6
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
    // InternalAdaptDsl.g:4808:1: rule__ServiceFunctionCallOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4812:1: ( ( ',' ) )
            // InternalAdaptDsl.g:4813:1: ( ',' )
            {
            // InternalAdaptDsl.g:4813:1: ( ',' )
            // InternalAdaptDsl.g:4814:2: ','
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4823:1: rule__ServiceFunctionCallOperation__Group__6 : rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 ;
    public final void rule__ServiceFunctionCallOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4827:1: ( rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7 )
            // InternalAdaptDsl.g:4828:2: rule__ServiceFunctionCallOperation__Group__6__Impl rule__ServiceFunctionCallOperation__Group__7
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
    // InternalAdaptDsl.g:4835:1: rule__ServiceFunctionCallOperation__Group__6__Impl : ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) ;
    public final void rule__ServiceFunctionCallOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4839:1: ( ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) ) )
            // InternalAdaptDsl.g:4840:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            {
            // InternalAdaptDsl.g:4840:1: ( ( rule__ServiceFunctionCallOperation__ValAssignment_6 ) )
            // InternalAdaptDsl.g:4841:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            {
             before(grammarAccess.getServiceFunctionCallOperationAccess().getValAssignment_6()); 
            // InternalAdaptDsl.g:4842:2: ( rule__ServiceFunctionCallOperation__ValAssignment_6 )
            // InternalAdaptDsl.g:4842:3: rule__ServiceFunctionCallOperation__ValAssignment_6
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
    // InternalAdaptDsl.g:4850:1: rule__ServiceFunctionCallOperation__Group__7 : rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 ;
    public final void rule__ServiceFunctionCallOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4854:1: ( rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8 )
            // InternalAdaptDsl.g:4855:2: rule__ServiceFunctionCallOperation__Group__7__Impl rule__ServiceFunctionCallOperation__Group__8
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
    // InternalAdaptDsl.g:4862:1: rule__ServiceFunctionCallOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4866:1: ( ( ')' ) )
            // InternalAdaptDsl.g:4867:1: ( ')' )
            {
            // InternalAdaptDsl.g:4867:1: ( ')' )
            // InternalAdaptDsl.g:4868:2: ')'
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
    // InternalAdaptDsl.g:4877:1: rule__ServiceFunctionCallOperation__Group__8 : rule__ServiceFunctionCallOperation__Group__8__Impl ;
    public final void rule__ServiceFunctionCallOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4881:1: ( rule__ServiceFunctionCallOperation__Group__8__Impl )
            // InternalAdaptDsl.g:4882:2: rule__ServiceFunctionCallOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:4888:1: rule__ServiceFunctionCallOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__ServiceFunctionCallOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4892:1: ( ( ';' ) )
            // InternalAdaptDsl.g:4893:1: ( ';' )
            {
            // InternalAdaptDsl.g:4893:1: ( ';' )
            // InternalAdaptDsl.g:4894:2: ';'
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
    // InternalAdaptDsl.g:4904:1: rule__EditFactOperation__Group__0 : rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 ;
    public final void rule__EditFactOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4908:1: ( rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1 )
            // InternalAdaptDsl.g:4909:2: rule__EditFactOperation__Group__0__Impl rule__EditFactOperation__Group__1
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
    // InternalAdaptDsl.g:4916:1: rule__EditFactOperation__Group__0__Impl : ( 'editFact' ) ;
    public final void rule__EditFactOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4920:1: ( ( 'editFact' ) )
            // InternalAdaptDsl.g:4921:1: ( 'editFact' )
            {
            // InternalAdaptDsl.g:4921:1: ( 'editFact' )
            // InternalAdaptDsl.g:4922:2: 'editFact'
            {
             before(grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalAdaptDsl.g:4931:1: rule__EditFactOperation__Group__1 : rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 ;
    public final void rule__EditFactOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4935:1: ( rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2 )
            // InternalAdaptDsl.g:4936:2: rule__EditFactOperation__Group__1__Impl rule__EditFactOperation__Group__2
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
    // InternalAdaptDsl.g:4943:1: rule__EditFactOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__EditFactOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4947:1: ( ( '(' ) )
            // InternalAdaptDsl.g:4948:1: ( '(' )
            {
            // InternalAdaptDsl.g:4948:1: ( '(' )
            // InternalAdaptDsl.g:4949:2: '('
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
    // InternalAdaptDsl.g:4958:1: rule__EditFactOperation__Group__2 : rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 ;
    public final void rule__EditFactOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4962:1: ( rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3 )
            // InternalAdaptDsl.g:4963:2: rule__EditFactOperation__Group__2__Impl rule__EditFactOperation__Group__3
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
    // InternalAdaptDsl.g:4970:1: rule__EditFactOperation__Group__2__Impl : ( ( rule__EditFactOperation__PropAssignment_2 ) ) ;
    public final void rule__EditFactOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4974:1: ( ( ( rule__EditFactOperation__PropAssignment_2 ) ) )
            // InternalAdaptDsl.g:4975:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            {
            // InternalAdaptDsl.g:4975:1: ( ( rule__EditFactOperation__PropAssignment_2 ) )
            // InternalAdaptDsl.g:4976:2: ( rule__EditFactOperation__PropAssignment_2 )
            {
             before(grammarAccess.getEditFactOperationAccess().getPropAssignment_2()); 
            // InternalAdaptDsl.g:4977:2: ( rule__EditFactOperation__PropAssignment_2 )
            // InternalAdaptDsl.g:4977:3: rule__EditFactOperation__PropAssignment_2
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
    // InternalAdaptDsl.g:4985:1: rule__EditFactOperation__Group__3 : rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 ;
    public final void rule__EditFactOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:4989:1: ( rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4 )
            // InternalAdaptDsl.g:4990:2: rule__EditFactOperation__Group__3__Impl rule__EditFactOperation__Group__4
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
    // InternalAdaptDsl.g:4997:1: rule__EditFactOperation__Group__3__Impl : ( ( rule__EditFactOperation__Group_3__0 )? ) ;
    public final void rule__EditFactOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5001:1: ( ( ( rule__EditFactOperation__Group_3__0 )? ) )
            // InternalAdaptDsl.g:5002:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            {
            // InternalAdaptDsl.g:5002:1: ( ( rule__EditFactOperation__Group_3__0 )? )
            // InternalAdaptDsl.g:5003:2: ( rule__EditFactOperation__Group_3__0 )?
            {
             before(grammarAccess.getEditFactOperationAccess().getGroup_3()); 
            // InternalAdaptDsl.g:5004:2: ( rule__EditFactOperation__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdaptDsl.g:5004:3: rule__EditFactOperation__Group_3__0
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
    // InternalAdaptDsl.g:5012:1: rule__EditFactOperation__Group__4 : rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 ;
    public final void rule__EditFactOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5016:1: ( rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5 )
            // InternalAdaptDsl.g:5017:2: rule__EditFactOperation__Group__4__Impl rule__EditFactOperation__Group__5
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
    // InternalAdaptDsl.g:5024:1: rule__EditFactOperation__Group__4__Impl : ( ')' ) ;
    public final void rule__EditFactOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5028:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5029:1: ( ')' )
            {
            // InternalAdaptDsl.g:5029:1: ( ')' )
            // InternalAdaptDsl.g:5030:2: ')'
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
    // InternalAdaptDsl.g:5039:1: rule__EditFactOperation__Group__5 : rule__EditFactOperation__Group__5__Impl ;
    public final void rule__EditFactOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5043:1: ( rule__EditFactOperation__Group__5__Impl )
            // InternalAdaptDsl.g:5044:2: rule__EditFactOperation__Group__5__Impl
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
    // InternalAdaptDsl.g:5050:1: rule__EditFactOperation__Group__5__Impl : ( ';' ) ;
    public final void rule__EditFactOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5054:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5055:1: ( ';' )
            {
            // InternalAdaptDsl.g:5055:1: ( ';' )
            // InternalAdaptDsl.g:5056:2: ';'
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
    // InternalAdaptDsl.g:5066:1: rule__EditFactOperation__Group_3__0 : rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 ;
    public final void rule__EditFactOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5070:1: ( rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1 )
            // InternalAdaptDsl.g:5071:2: rule__EditFactOperation__Group_3__0__Impl rule__EditFactOperation__Group_3__1
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
    // InternalAdaptDsl.g:5078:1: rule__EditFactOperation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__EditFactOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5082:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5083:1: ( ',' )
            {
            // InternalAdaptDsl.g:5083:1: ( ',' )
            // InternalAdaptDsl.g:5084:2: ','
            {
             before(grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5093:1: rule__EditFactOperation__Group_3__1 : rule__EditFactOperation__Group_3__1__Impl ;
    public final void rule__EditFactOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5097:1: ( rule__EditFactOperation__Group_3__1__Impl )
            // InternalAdaptDsl.g:5098:2: rule__EditFactOperation__Group_3__1__Impl
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
    // InternalAdaptDsl.g:5104:1: rule__EditFactOperation__Group_3__1__Impl : ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) ;
    public final void rule__EditFactOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5108:1: ( ( ( rule__EditFactOperation__ValAssignment_3_1 ) ) )
            // InternalAdaptDsl.g:5109:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            {
            // InternalAdaptDsl.g:5109:1: ( ( rule__EditFactOperation__ValAssignment_3_1 ) )
            // InternalAdaptDsl.g:5110:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            {
             before(grammarAccess.getEditFactOperationAccess().getValAssignment_3_1()); 
            // InternalAdaptDsl.g:5111:2: ( rule__EditFactOperation__ValAssignment_3_1 )
            // InternalAdaptDsl.g:5111:3: rule__EditFactOperation__ValAssignment_3_1
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
    // InternalAdaptDsl.g:5120:1: rule__SetDisplayPropertyOperation__Group__0 : rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 ;
    public final void rule__SetDisplayPropertyOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5124:1: ( rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1 )
            // InternalAdaptDsl.g:5125:2: rule__SetDisplayPropertyOperation__Group__0__Impl rule__SetDisplayPropertyOperation__Group__1
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
    // InternalAdaptDsl.g:5132:1: rule__SetDisplayPropertyOperation__Group__0__Impl : ( 'setDisplayProperty' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5136:1: ( ( 'setDisplayProperty' ) )
            // InternalAdaptDsl.g:5137:1: ( 'setDisplayProperty' )
            {
            // InternalAdaptDsl.g:5137:1: ( 'setDisplayProperty' )
            // InternalAdaptDsl.g:5138:2: 'setDisplayProperty'
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5147:1: rule__SetDisplayPropertyOperation__Group__1 : rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 ;
    public final void rule__SetDisplayPropertyOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5151:1: ( rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2 )
            // InternalAdaptDsl.g:5152:2: rule__SetDisplayPropertyOperation__Group__1__Impl rule__SetDisplayPropertyOperation__Group__2
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
    // InternalAdaptDsl.g:5159:1: rule__SetDisplayPropertyOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5163:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5164:1: ( '(' )
            {
            // InternalAdaptDsl.g:5164:1: ( '(' )
            // InternalAdaptDsl.g:5165:2: '('
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
    // InternalAdaptDsl.g:5174:1: rule__SetDisplayPropertyOperation__Group__2 : rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 ;
    public final void rule__SetDisplayPropertyOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5178:1: ( rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3 )
            // InternalAdaptDsl.g:5179:2: rule__SetDisplayPropertyOperation__Group__2__Impl rule__SetDisplayPropertyOperation__Group__3
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
    // InternalAdaptDsl.g:5186:1: rule__SetDisplayPropertyOperation__Group__2__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5190:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) ) )
            // InternalAdaptDsl.g:5191:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5191:1: ( ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 ) )
            // InternalAdaptDsl.g:5192:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyAssignment_2()); 
            // InternalAdaptDsl.g:5193:2: ( rule__SetDisplayPropertyOperation__PropertyAssignment_2 )
            // InternalAdaptDsl.g:5193:3: rule__SetDisplayPropertyOperation__PropertyAssignment_2
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
    // InternalAdaptDsl.g:5201:1: rule__SetDisplayPropertyOperation__Group__3 : rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 ;
    public final void rule__SetDisplayPropertyOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5205:1: ( rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4 )
            // InternalAdaptDsl.g:5206:2: rule__SetDisplayPropertyOperation__Group__3__Impl rule__SetDisplayPropertyOperation__Group__4
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
    // InternalAdaptDsl.g:5213:1: rule__SetDisplayPropertyOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5217:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5218:1: ( ',' )
            {
            // InternalAdaptDsl.g:5218:1: ( ',' )
            // InternalAdaptDsl.g:5219:2: ','
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5228:1: rule__SetDisplayPropertyOperation__Group__4 : rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 ;
    public final void rule__SetDisplayPropertyOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5232:1: ( rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5 )
            // InternalAdaptDsl.g:5233:2: rule__SetDisplayPropertyOperation__Group__4__Impl rule__SetDisplayPropertyOperation__Group__5
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
    // InternalAdaptDsl.g:5240:1: rule__SetDisplayPropertyOperation__Group__4__Impl : ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) ;
    public final void rule__SetDisplayPropertyOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5244:1: ( ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) ) )
            // InternalAdaptDsl.g:5245:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5245:1: ( ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 ) )
            // InternalAdaptDsl.g:5246:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            {
             before(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueAssignment_4()); 
            // InternalAdaptDsl.g:5247:2: ( rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 )
            // InternalAdaptDsl.g:5247:3: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4
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
    // InternalAdaptDsl.g:5255:1: rule__SetDisplayPropertyOperation__Group__5 : rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 ;
    public final void rule__SetDisplayPropertyOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5259:1: ( rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6 )
            // InternalAdaptDsl.g:5260:2: rule__SetDisplayPropertyOperation__Group__5__Impl rule__SetDisplayPropertyOperation__Group__6
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
    // InternalAdaptDsl.g:5267:1: rule__SetDisplayPropertyOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5271:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5272:1: ( ')' )
            {
            // InternalAdaptDsl.g:5272:1: ( ')' )
            // InternalAdaptDsl.g:5273:2: ')'
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
    // InternalAdaptDsl.g:5282:1: rule__SetDisplayPropertyOperation__Group__6 : rule__SetDisplayPropertyOperation__Group__6__Impl ;
    public final void rule__SetDisplayPropertyOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5286:1: ( rule__SetDisplayPropertyOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5287:2: rule__SetDisplayPropertyOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5293:1: rule__SetDisplayPropertyOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__SetDisplayPropertyOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5297:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5298:1: ( ';' )
            {
            // InternalAdaptDsl.g:5298:1: ( ';' )
            // InternalAdaptDsl.g:5299:2: ';'
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
    // InternalAdaptDsl.g:5309:1: rule__AddViewComponentOperation__Group__0 : rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 ;
    public final void rule__AddViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5313:1: ( rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:5314:2: rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1
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
    // InternalAdaptDsl.g:5321:1: rule__AddViewComponentOperation__Group__0__Impl : ( 'addViewComponent' ) ;
    public final void rule__AddViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5325:1: ( ( 'addViewComponent' ) )
            // InternalAdaptDsl.g:5326:1: ( 'addViewComponent' )
            {
            // InternalAdaptDsl.g:5326:1: ( 'addViewComponent' )
            // InternalAdaptDsl.g:5327:2: 'addViewComponent'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5336:1: rule__AddViewComponentOperation__Group__1 : rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 ;
    public final void rule__AddViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5340:1: ( rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:5341:2: rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2
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
    // InternalAdaptDsl.g:5348:1: rule__AddViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5352:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5353:1: ( '(' )
            {
            // InternalAdaptDsl.g:5353:1: ( '(' )
            // InternalAdaptDsl.g:5354:2: '('
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
    // InternalAdaptDsl.g:5363:1: rule__AddViewComponentOperation__Group__2 : rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 ;
    public final void rule__AddViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5367:1: ( rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:5368:2: rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3
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
    // InternalAdaptDsl.g:5375:1: rule__AddViewComponentOperation__Group__2__Impl : ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5379:1: ( ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5380:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5380:1: ( ( rule__AddViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5381:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5382:2: ( rule__AddViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5382:3: rule__AddViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5390:1: rule__AddViewComponentOperation__Group__3 : rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 ;
    public final void rule__AddViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5394:1: ( rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:5395:2: rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4
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
    // InternalAdaptDsl.g:5402:1: rule__AddViewComponentOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5406:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5407:1: ( ',' )
            {
            // InternalAdaptDsl.g:5407:1: ( ',' )
            // InternalAdaptDsl.g:5408:2: ','
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5417:1: rule__AddViewComponentOperation__Group__4 : rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 ;
    public final void rule__AddViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5421:1: ( rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 )
            // InternalAdaptDsl.g:5422:2: rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5
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
    // InternalAdaptDsl.g:5429:1: rule__AddViewComponentOperation__Group__4__Impl : ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) ;
    public final void rule__AddViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5433:1: ( ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) ) )
            // InternalAdaptDsl.g:5434:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5434:1: ( ( rule__AddViewComponentOperation__TargetAssignment_4 ) )
            // InternalAdaptDsl.g:5435:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetAssignment_4()); 
            // InternalAdaptDsl.g:5436:2: ( rule__AddViewComponentOperation__TargetAssignment_4 )
            // InternalAdaptDsl.g:5436:3: rule__AddViewComponentOperation__TargetAssignment_4
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
    // InternalAdaptDsl.g:5444:1: rule__AddViewComponentOperation__Group__5 : rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 ;
    public final void rule__AddViewComponentOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5448:1: ( rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 )
            // InternalAdaptDsl.g:5449:2: rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6
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
    // InternalAdaptDsl.g:5456:1: rule__AddViewComponentOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddViewComponentOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5460:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5461:1: ( ')' )
            {
            // InternalAdaptDsl.g:5461:1: ( ')' )
            // InternalAdaptDsl.g:5462:2: ')'
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
    // InternalAdaptDsl.g:5471:1: rule__AddViewComponentOperation__Group__6 : rule__AddViewComponentOperation__Group__6__Impl ;
    public final void rule__AddViewComponentOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5475:1: ( rule__AddViewComponentOperation__Group__6__Impl )
            // InternalAdaptDsl.g:5476:2: rule__AddViewComponentOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:5482:1: rule__AddViewComponentOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddViewComponentOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5486:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5487:1: ( ';' )
            {
            // InternalAdaptDsl.g:5487:1: ( ';' )
            // InternalAdaptDsl.g:5488:2: ';'
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
    // InternalAdaptDsl.g:5498:1: rule__DeleteViewComponentOperation__Group__0 : rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 ;
    public final void rule__DeleteViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5502:1: ( rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:5503:2: rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1
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
    // InternalAdaptDsl.g:5510:1: rule__DeleteViewComponentOperation__Group__0__Impl : ( 'deleteViewComponent' ) ;
    public final void rule__DeleteViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5514:1: ( ( 'deleteViewComponent' ) )
            // InternalAdaptDsl.g:5515:1: ( 'deleteViewComponent' )
            {
            // InternalAdaptDsl.g:5515:1: ( 'deleteViewComponent' )
            // InternalAdaptDsl.g:5516:2: 'deleteViewComponent'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5525:1: rule__DeleteViewComponentOperation__Group__1 : rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 ;
    public final void rule__DeleteViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5529:1: ( rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:5530:2: rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2
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
    // InternalAdaptDsl.g:5537:1: rule__DeleteViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5541:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5542:1: ( '(' )
            {
            // InternalAdaptDsl.g:5542:1: ( '(' )
            // InternalAdaptDsl.g:5543:2: '('
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
    // InternalAdaptDsl.g:5552:1: rule__DeleteViewComponentOperation__Group__2 : rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 ;
    public final void rule__DeleteViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5556:1: ( rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:5557:2: rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3
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
    // InternalAdaptDsl.g:5564:1: rule__DeleteViewComponentOperation__Group__2__Impl : ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5568:1: ( ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:5569:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5569:1: ( ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:5570:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:5571:2: ( rule__DeleteViewComponentOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:5571:3: rule__DeleteViewComponentOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:5579:1: rule__DeleteViewComponentOperation__Group__3 : rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 ;
    public final void rule__DeleteViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5583:1: ( rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:5584:2: rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4
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
    // InternalAdaptDsl.g:5591:1: rule__DeleteViewComponentOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5595:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5596:1: ( ')' )
            {
            // InternalAdaptDsl.g:5596:1: ( ')' )
            // InternalAdaptDsl.g:5597:2: ')'
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
    // InternalAdaptDsl.g:5606:1: rule__DeleteViewComponentOperation__Group__4 : rule__DeleteViewComponentOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5610:1: ( rule__DeleteViewComponentOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5611:2: rule__DeleteViewComponentOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:5617:1: rule__DeleteViewComponentOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5621:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5622:1: ( ';' )
            {
            // InternalAdaptDsl.g:5622:1: ( ';' )
            // InternalAdaptDsl.g:5623:2: ';'
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
    // InternalAdaptDsl.g:5633:1: rule__AddViewComponentButtonOperation__Group__0 : rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 ;
    public final void rule__AddViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5637:1: ( rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1 )
            // InternalAdaptDsl.g:5638:2: rule__AddViewComponentButtonOperation__Group__0__Impl rule__AddViewComponentButtonOperation__Group__1
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
    // InternalAdaptDsl.g:5645:1: rule__AddViewComponentButtonOperation__Group__0__Impl : ( 'addViewComponentButton' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5649:1: ( ( 'addViewComponentButton' ) )
            // InternalAdaptDsl.g:5650:1: ( 'addViewComponentButton' )
            {
            // InternalAdaptDsl.g:5650:1: ( 'addViewComponentButton' )
            // InternalAdaptDsl.g:5651:2: 'addViewComponentButton'
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getAddViewComponentButtonKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5660:1: rule__AddViewComponentButtonOperation__Group__1 : rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 ;
    public final void rule__AddViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5664:1: ( rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2 )
            // InternalAdaptDsl.g:5665:2: rule__AddViewComponentButtonOperation__Group__1__Impl rule__AddViewComponentButtonOperation__Group__2
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
    // InternalAdaptDsl.g:5672:1: rule__AddViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5676:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5677:1: ( '(' )
            {
            // InternalAdaptDsl.g:5677:1: ( '(' )
            // InternalAdaptDsl.g:5678:2: '('
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
    // InternalAdaptDsl.g:5687:1: rule__AddViewComponentButtonOperation__Group__2 : rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 ;
    public final void rule__AddViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5691:1: ( rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3 )
            // InternalAdaptDsl.g:5692:2: rule__AddViewComponentButtonOperation__Group__2__Impl rule__AddViewComponentButtonOperation__Group__3
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
    // InternalAdaptDsl.g:5699:1: rule__AddViewComponentButtonOperation__Group__2__Impl : ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5703:1: ( ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptDsl.g:5704:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5704:1: ( ( rule__AddViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptDsl.g:5705:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptDsl.g:5706:2: ( rule__AddViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptDsl.g:5706:3: rule__AddViewComponentButtonOperation__IdAssignment_2
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
    // InternalAdaptDsl.g:5714:1: rule__AddViewComponentButtonOperation__Group__3 : rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 ;
    public final void rule__AddViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5718:1: ( rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4 )
            // InternalAdaptDsl.g:5719:2: rule__AddViewComponentButtonOperation__Group__3__Impl rule__AddViewComponentButtonOperation__Group__4
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
    // InternalAdaptDsl.g:5726:1: rule__AddViewComponentButtonOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5730:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5731:1: ( ',' )
            {
            // InternalAdaptDsl.g:5731:1: ( ',' )
            // InternalAdaptDsl.g:5732:2: ','
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5741:1: rule__AddViewComponentButtonOperation__Group__4 : rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 ;
    public final void rule__AddViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5745:1: ( rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5 )
            // InternalAdaptDsl.g:5746:2: rule__AddViewComponentButtonOperation__Group__4__Impl rule__AddViewComponentButtonOperation__Group__5
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
    // InternalAdaptDsl.g:5753:1: rule__AddViewComponentButtonOperation__Group__4__Impl : ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5757:1: ( ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) ) )
            // InternalAdaptDsl.g:5758:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            {
            // InternalAdaptDsl.g:5758:1: ( ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 ) )
            // InternalAdaptDsl.g:5759:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeyAssignment_4()); 
            // InternalAdaptDsl.g:5760:2: ( rule__AddViewComponentButtonOperation__LangKeyAssignment_4 )
            // InternalAdaptDsl.g:5760:3: rule__AddViewComponentButtonOperation__LangKeyAssignment_4
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
    // InternalAdaptDsl.g:5768:1: rule__AddViewComponentButtonOperation__Group__5 : rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 ;
    public final void rule__AddViewComponentButtonOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5772:1: ( rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6 )
            // InternalAdaptDsl.g:5773:2: rule__AddViewComponentButtonOperation__Group__5__Impl rule__AddViewComponentButtonOperation__Group__6
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
    // InternalAdaptDsl.g:5780:1: rule__AddViewComponentButtonOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5784:1: ( ( ',' ) )
            // InternalAdaptDsl.g:5785:1: ( ',' )
            {
            // InternalAdaptDsl.g:5785:1: ( ',' )
            // InternalAdaptDsl.g:5786:2: ','
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5795:1: rule__AddViewComponentButtonOperation__Group__6 : rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 ;
    public final void rule__AddViewComponentButtonOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5799:1: ( rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7 )
            // InternalAdaptDsl.g:5800:2: rule__AddViewComponentButtonOperation__Group__6__Impl rule__AddViewComponentButtonOperation__Group__7
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
    // InternalAdaptDsl.g:5807:1: rule__AddViewComponentButtonOperation__Group__6__Impl : ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) ;
    public final void rule__AddViewComponentButtonOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5811:1: ( ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) ) )
            // InternalAdaptDsl.g:5812:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            {
            // InternalAdaptDsl.g:5812:1: ( ( rule__AddViewComponentButtonOperation__ActionAssignment_6 ) )
            // InternalAdaptDsl.g:5813:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            {
             before(grammarAccess.getAddViewComponentButtonOperationAccess().getActionAssignment_6()); 
            // InternalAdaptDsl.g:5814:2: ( rule__AddViewComponentButtonOperation__ActionAssignment_6 )
            // InternalAdaptDsl.g:5814:3: rule__AddViewComponentButtonOperation__ActionAssignment_6
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
    // InternalAdaptDsl.g:5822:1: rule__AddViewComponentButtonOperation__Group__7 : rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 ;
    public final void rule__AddViewComponentButtonOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5826:1: ( rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8 )
            // InternalAdaptDsl.g:5827:2: rule__AddViewComponentButtonOperation__Group__7__Impl rule__AddViewComponentButtonOperation__Group__8
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
    // InternalAdaptDsl.g:5834:1: rule__AddViewComponentButtonOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5838:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5839:1: ( ')' )
            {
            // InternalAdaptDsl.g:5839:1: ( ')' )
            // InternalAdaptDsl.g:5840:2: ')'
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
    // InternalAdaptDsl.g:5849:1: rule__AddViewComponentButtonOperation__Group__8 : rule__AddViewComponentButtonOperation__Group__8__Impl ;
    public final void rule__AddViewComponentButtonOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5853:1: ( rule__AddViewComponentButtonOperation__Group__8__Impl )
            // InternalAdaptDsl.g:5854:2: rule__AddViewComponentButtonOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:5860:1: rule__AddViewComponentButtonOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AddViewComponentButtonOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5864:1: ( ( ';' ) )
            // InternalAdaptDsl.g:5865:1: ( ';' )
            {
            // InternalAdaptDsl.g:5865:1: ( ';' )
            // InternalAdaptDsl.g:5866:2: ';'
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
    // InternalAdaptDsl.g:5876:1: rule__DeleteViewComponentButtonOperation__Group__0 : rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5880:1: ( rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1 )
            // InternalAdaptDsl.g:5881:2: rule__DeleteViewComponentButtonOperation__Group__0__Impl rule__DeleteViewComponentButtonOperation__Group__1
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
    // InternalAdaptDsl.g:5888:1: rule__DeleteViewComponentButtonOperation__Group__0__Impl : ( 'deleteViewComponentButton' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5892:1: ( ( 'deleteViewComponentButton' ) )
            // InternalAdaptDsl.g:5893:1: ( 'deleteViewComponentButton' )
            {
            // InternalAdaptDsl.g:5893:1: ( 'deleteViewComponentButton' )
            // InternalAdaptDsl.g:5894:2: 'deleteViewComponentButton'
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getDeleteViewComponentButtonKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalAdaptDsl.g:5903:1: rule__DeleteViewComponentButtonOperation__Group__1 : rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5907:1: ( rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2 )
            // InternalAdaptDsl.g:5908:2: rule__DeleteViewComponentButtonOperation__Group__1__Impl rule__DeleteViewComponentButtonOperation__Group__2
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
    // InternalAdaptDsl.g:5915:1: rule__DeleteViewComponentButtonOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5919:1: ( ( '(' ) )
            // InternalAdaptDsl.g:5920:1: ( '(' )
            {
            // InternalAdaptDsl.g:5920:1: ( '(' )
            // InternalAdaptDsl.g:5921:2: '('
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
    // InternalAdaptDsl.g:5930:1: rule__DeleteViewComponentButtonOperation__Group__2 : rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5934:1: ( rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3 )
            // InternalAdaptDsl.g:5935:2: rule__DeleteViewComponentButtonOperation__Group__2__Impl rule__DeleteViewComponentButtonOperation__Group__3
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
    // InternalAdaptDsl.g:5942:1: rule__DeleteViewComponentButtonOperation__Group__2__Impl : ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5946:1: ( ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) ) )
            // InternalAdaptDsl.g:5947:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            {
            // InternalAdaptDsl.g:5947:1: ( ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 ) )
            // InternalAdaptDsl.g:5948:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            {
             before(grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdAssignment_2()); 
            // InternalAdaptDsl.g:5949:2: ( rule__DeleteViewComponentButtonOperation__IdAssignment_2 )
            // InternalAdaptDsl.g:5949:3: rule__DeleteViewComponentButtonOperation__IdAssignment_2
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
    // InternalAdaptDsl.g:5957:1: rule__DeleteViewComponentButtonOperation__Group__3 : rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5961:1: ( rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4 )
            // InternalAdaptDsl.g:5962:2: rule__DeleteViewComponentButtonOperation__Group__3__Impl rule__DeleteViewComponentButtonOperation__Group__4
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
    // InternalAdaptDsl.g:5969:1: rule__DeleteViewComponentButtonOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5973:1: ( ( ')' ) )
            // InternalAdaptDsl.g:5974:1: ( ')' )
            {
            // InternalAdaptDsl.g:5974:1: ( ')' )
            // InternalAdaptDsl.g:5975:2: ')'
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
    // InternalAdaptDsl.g:5984:1: rule__DeleteViewComponentButtonOperation__Group__4 : rule__DeleteViewComponentButtonOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5988:1: ( rule__DeleteViewComponentButtonOperation__Group__4__Impl )
            // InternalAdaptDsl.g:5989:2: rule__DeleteViewComponentButtonOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:5995:1: rule__DeleteViewComponentButtonOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentButtonOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:5999:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6000:1: ( ';' )
            {
            // InternalAdaptDsl.g:6000:1: ( ';' )
            // InternalAdaptDsl.g:6001:2: ';'
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
    // InternalAdaptDsl.g:6011:1: rule__AddNavLinkOperation__Group__0 : rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 ;
    public final void rule__AddNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6015:1: ( rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6016:2: rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1
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
    // InternalAdaptDsl.g:6023:1: rule__AddNavLinkOperation__Group__0__Impl : ( 'addNavLink' ) ;
    public final void rule__AddNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6027:1: ( ( 'addNavLink' ) )
            // InternalAdaptDsl.g:6028:1: ( 'addNavLink' )
            {
            // InternalAdaptDsl.g:6028:1: ( 'addNavLink' )
            // InternalAdaptDsl.g:6029:2: 'addNavLink'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6038:1: rule__AddNavLinkOperation__Group__1 : rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 ;
    public final void rule__AddNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6042:1: ( rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6043:2: rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2
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
    // InternalAdaptDsl.g:6050:1: rule__AddNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6054:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6055:1: ( '(' )
            {
            // InternalAdaptDsl.g:6055:1: ( '(' )
            // InternalAdaptDsl.g:6056:2: '('
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
    // InternalAdaptDsl.g:6065:1: rule__AddNavLinkOperation__Group__2 : rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 ;
    public final void rule__AddNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6069:1: ( rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6070:2: rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3
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
    // InternalAdaptDsl.g:6077:1: rule__AddNavLinkOperation__Group__2__Impl : ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__AddNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6081:1: ( ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6082:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6082:1: ( ( rule__AddNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6083:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6084:2: ( rule__AddNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6084:3: rule__AddNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6092:1: rule__AddNavLinkOperation__Group__3 : rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 ;
    public final void rule__AddNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6096:1: ( rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6097:2: rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4
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
    // InternalAdaptDsl.g:6104:1: rule__AddNavLinkOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6108:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6109:1: ( ',' )
            {
            // InternalAdaptDsl.g:6109:1: ( ',' )
            // InternalAdaptDsl.g:6110:2: ','
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6119:1: rule__AddNavLinkOperation__Group__4 : rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 ;
    public final void rule__AddNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6123:1: ( rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 )
            // InternalAdaptDsl.g:6124:2: rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5
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
    // InternalAdaptDsl.g:6131:1: rule__AddNavLinkOperation__Group__4__Impl : ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) ;
    public final void rule__AddNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6135:1: ( ( ( rule__AddNavLinkOperation__TextAssignment_4 ) ) )
            // InternalAdaptDsl.g:6136:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6136:1: ( ( rule__AddNavLinkOperation__TextAssignment_4 ) )
            // InternalAdaptDsl.g:6137:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextAssignment_4()); 
            // InternalAdaptDsl.g:6138:2: ( rule__AddNavLinkOperation__TextAssignment_4 )
            // InternalAdaptDsl.g:6138:3: rule__AddNavLinkOperation__TextAssignment_4
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
    // InternalAdaptDsl.g:6146:1: rule__AddNavLinkOperation__Group__5 : rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 ;
    public final void rule__AddNavLinkOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6150:1: ( rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 )
            // InternalAdaptDsl.g:6151:2: rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6
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
    // InternalAdaptDsl.g:6158:1: rule__AddNavLinkOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddNavLinkOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6162:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6163:1: ( ')' )
            {
            // InternalAdaptDsl.g:6163:1: ( ')' )
            // InternalAdaptDsl.g:6164:2: ')'
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
    // InternalAdaptDsl.g:6173:1: rule__AddNavLinkOperation__Group__6 : rule__AddNavLinkOperation__Group__6__Impl ;
    public final void rule__AddNavLinkOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6177:1: ( rule__AddNavLinkOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6178:2: rule__AddNavLinkOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6184:1: rule__AddNavLinkOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddNavLinkOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6188:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6189:1: ( ';' )
            {
            // InternalAdaptDsl.g:6189:1: ( ';' )
            // InternalAdaptDsl.g:6190:2: ';'
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
    // InternalAdaptDsl.g:6200:1: rule__DeleteNavLinkOperation__Group__0 : rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 ;
    public final void rule__DeleteNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6204:1: ( rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6205:2: rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1
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
    // InternalAdaptDsl.g:6212:1: rule__DeleteNavLinkOperation__Group__0__Impl : ( 'deleteNavLink' ) ;
    public final void rule__DeleteNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6216:1: ( ( 'deleteNavLink' ) )
            // InternalAdaptDsl.g:6217:1: ( 'deleteNavLink' )
            {
            // InternalAdaptDsl.g:6217:1: ( 'deleteNavLink' )
            // InternalAdaptDsl.g:6218:2: 'deleteNavLink'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6227:1: rule__DeleteNavLinkOperation__Group__1 : rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 ;
    public final void rule__DeleteNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6231:1: ( rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6232:2: rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2
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
    // InternalAdaptDsl.g:6239:1: rule__DeleteNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6243:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6244:1: ( '(' )
            {
            // InternalAdaptDsl.g:6244:1: ( '(' )
            // InternalAdaptDsl.g:6245:2: '('
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
    // InternalAdaptDsl.g:6254:1: rule__DeleteNavLinkOperation__Group__2 : rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 ;
    public final void rule__DeleteNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6258:1: ( rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6259:2: rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3
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
    // InternalAdaptDsl.g:6266:1: rule__DeleteNavLinkOperation__Group__2__Impl : ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__DeleteNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6270:1: ( ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6271:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6271:1: ( ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6272:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6273:2: ( rule__DeleteNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6273:3: rule__DeleteNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6281:1: rule__DeleteNavLinkOperation__Group__3 : rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 ;
    public final void rule__DeleteNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6285:1: ( rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6286:2: rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4
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
    // InternalAdaptDsl.g:6293:1: rule__DeleteNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6297:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6298:1: ( ')' )
            {
            // InternalAdaptDsl.g:6298:1: ( ')' )
            // InternalAdaptDsl.g:6299:2: ')'
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
    // InternalAdaptDsl.g:6308:1: rule__DeleteNavLinkOperation__Group__4 : rule__DeleteNavLinkOperation__Group__4__Impl ;
    public final void rule__DeleteNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6312:1: ( rule__DeleteNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6313:2: rule__DeleteNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6319:1: rule__DeleteNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6323:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6324:1: ( ';' )
            {
            // InternalAdaptDsl.g:6324:1: ( ';' )
            // InternalAdaptDsl.g:6325:2: ';'
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
    // InternalAdaptDsl.g:6335:1: rule__RedirectNavLinkOperation__Group__0 : rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 ;
    public final void rule__RedirectNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6339:1: ( rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:6340:2: rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1
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
    // InternalAdaptDsl.g:6347:1: rule__RedirectNavLinkOperation__Group__0__Impl : ( 'redirectNavLink' ) ;
    public final void rule__RedirectNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6351:1: ( ( 'redirectNavLink' ) )
            // InternalAdaptDsl.g:6352:1: ( 'redirectNavLink' )
            {
            // InternalAdaptDsl.g:6352:1: ( 'redirectNavLink' )
            // InternalAdaptDsl.g:6353:2: 'redirectNavLink'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6362:1: rule__RedirectNavLinkOperation__Group__1 : rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 ;
    public final void rule__RedirectNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6366:1: ( rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:6367:2: rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2
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
    // InternalAdaptDsl.g:6374:1: rule__RedirectNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__RedirectNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6378:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6379:1: ( '(' )
            {
            // InternalAdaptDsl.g:6379:1: ( '(' )
            // InternalAdaptDsl.g:6380:2: '('
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
    // InternalAdaptDsl.g:6389:1: rule__RedirectNavLinkOperation__Group__2 : rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 ;
    public final void rule__RedirectNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6393:1: ( rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:6394:2: rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3
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
    // InternalAdaptDsl.g:6401:1: rule__RedirectNavLinkOperation__Group__2__Impl : ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) ;
    public final void rule__RedirectNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6405:1: ( ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) ) )
            // InternalAdaptDsl.g:6406:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6406:1: ( ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 ) )
            // InternalAdaptDsl.g:6407:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompAssignment_2()); 
            // InternalAdaptDsl.g:6408:2: ( rule__RedirectNavLinkOperation__ViewCompAssignment_2 )
            // InternalAdaptDsl.g:6408:3: rule__RedirectNavLinkOperation__ViewCompAssignment_2
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
    // InternalAdaptDsl.g:6416:1: rule__RedirectNavLinkOperation__Group__3 : rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 ;
    public final void rule__RedirectNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6420:1: ( rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:6421:2: rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4
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
    // InternalAdaptDsl.g:6428:1: rule__RedirectNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RedirectNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6432:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6433:1: ( ')' )
            {
            // InternalAdaptDsl.g:6433:1: ( ')' )
            // InternalAdaptDsl.g:6434:2: ')'
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
    // InternalAdaptDsl.g:6443:1: rule__RedirectNavLinkOperation__Group__4 : rule__RedirectNavLinkOperation__Group__4__Impl ;
    public final void rule__RedirectNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6447:1: ( rule__RedirectNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:6448:2: rule__RedirectNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:6454:1: rule__RedirectNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__RedirectNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6458:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6459:1: ( ';' )
            {
            // InternalAdaptDsl.g:6459:1: ( ';' )
            // InternalAdaptDsl.g:6460:2: ';'
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
    // InternalAdaptDsl.g:6470:1: rule__ClearNavOperation__Group__0 : rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 ;
    public final void rule__ClearNavOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6474:1: ( rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1 )
            // InternalAdaptDsl.g:6475:2: rule__ClearNavOperation__Group__0__Impl rule__ClearNavOperation__Group__1
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
    // InternalAdaptDsl.g:6482:1: rule__ClearNavOperation__Group__0__Impl : ( () ) ;
    public final void rule__ClearNavOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6486:1: ( ( () ) )
            // InternalAdaptDsl.g:6487:1: ( () )
            {
            // InternalAdaptDsl.g:6487:1: ( () )
            // InternalAdaptDsl.g:6488:2: ()
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0()); 
            // InternalAdaptDsl.g:6489:2: ()
            // InternalAdaptDsl.g:6489:3: 
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
    // InternalAdaptDsl.g:6497:1: rule__ClearNavOperation__Group__1 : rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 ;
    public final void rule__ClearNavOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6501:1: ( rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2 )
            // InternalAdaptDsl.g:6502:2: rule__ClearNavOperation__Group__1__Impl rule__ClearNavOperation__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAdaptDsl.g:6509:1: rule__ClearNavOperation__Group__1__Impl : ( 'clearNavigation' ) ;
    public final void rule__ClearNavOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6513:1: ( ( 'clearNavigation' ) )
            // InternalAdaptDsl.g:6514:1: ( 'clearNavigation' )
            {
            // InternalAdaptDsl.g:6514:1: ( 'clearNavigation' )
            // InternalAdaptDsl.g:6515:2: 'clearNavigation'
            {
             before(grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6524:1: rule__ClearNavOperation__Group__2 : rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 ;
    public final void rule__ClearNavOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6528:1: ( rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3 )
            // InternalAdaptDsl.g:6529:2: rule__ClearNavOperation__Group__2__Impl rule__ClearNavOperation__Group__3
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
    // InternalAdaptDsl.g:6536:1: rule__ClearNavOperation__Group__2__Impl : ( '()' ) ;
    public final void rule__ClearNavOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6540:1: ( ( '()' ) )
            // InternalAdaptDsl.g:6541:1: ( '()' )
            {
            // InternalAdaptDsl.g:6541:1: ( '()' )
            // InternalAdaptDsl.g:6542:2: '()'
            {
             before(grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6551:1: rule__ClearNavOperation__Group__3 : rule__ClearNavOperation__Group__3__Impl ;
    public final void rule__ClearNavOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6555:1: ( rule__ClearNavOperation__Group__3__Impl )
            // InternalAdaptDsl.g:6556:2: rule__ClearNavOperation__Group__3__Impl
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
    // InternalAdaptDsl.g:6562:1: rule__ClearNavOperation__Group__3__Impl : ( ';' ) ;
    public final void rule__ClearNavOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6566:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6567:1: ( ';' )
            {
            // InternalAdaptDsl.g:6567:1: ( ';' )
            // InternalAdaptDsl.g:6568:2: ';'
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
    // InternalAdaptDsl.g:6578:1: rule__ChangeFontSizeOperation__Group__0 : rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 ;
    public final void rule__ChangeFontSizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6582:1: ( rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 )
            // InternalAdaptDsl.g:6583:2: rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1
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
    // InternalAdaptDsl.g:6590:1: rule__ChangeFontSizeOperation__Group__0__Impl : ( 'changeFontSize' ) ;
    public final void rule__ChangeFontSizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6594:1: ( ( 'changeFontSize' ) )
            // InternalAdaptDsl.g:6595:1: ( 'changeFontSize' )
            {
            // InternalAdaptDsl.g:6595:1: ( 'changeFontSize' )
            // InternalAdaptDsl.g:6596:2: 'changeFontSize'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6605:1: rule__ChangeFontSizeOperation__Group__1 : rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 ;
    public final void rule__ChangeFontSizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6609:1: ( rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 )
            // InternalAdaptDsl.g:6610:2: rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2
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
    // InternalAdaptDsl.g:6617:1: rule__ChangeFontSizeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontSizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6621:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6622:1: ( '(' )
            {
            // InternalAdaptDsl.g:6622:1: ( '(' )
            // InternalAdaptDsl.g:6623:2: '('
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
    // InternalAdaptDsl.g:6632:1: rule__ChangeFontSizeOperation__Group__2 : rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 ;
    public final void rule__ChangeFontSizeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6636:1: ( rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 )
            // InternalAdaptDsl.g:6637:2: rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3
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
    // InternalAdaptDsl.g:6644:1: rule__ChangeFontSizeOperation__Group__2__Impl : ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6648:1: ( ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:6649:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6649:1: ( ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:6650:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryAssignment_2()); 
            // InternalAdaptDsl.g:6651:2: ( rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 )
            // InternalAdaptDsl.g:6651:3: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2
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
    // InternalAdaptDsl.g:6659:1: rule__ChangeFontSizeOperation__Group__3 : rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 ;
    public final void rule__ChangeFontSizeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6663:1: ( rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 )
            // InternalAdaptDsl.g:6664:2: rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4
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
    // InternalAdaptDsl.g:6671:1: rule__ChangeFontSizeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeFontSizeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6675:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6676:1: ( ',' )
            {
            // InternalAdaptDsl.g:6676:1: ( ',' )
            // InternalAdaptDsl.g:6677:2: ','
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6686:1: rule__ChangeFontSizeOperation__Group__4 : rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 ;
    public final void rule__ChangeFontSizeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6690:1: ( rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5 )
            // InternalAdaptDsl.g:6691:2: rule__ChangeFontSizeOperation__Group__4__Impl rule__ChangeFontSizeOperation__Group__5
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
    // InternalAdaptDsl.g:6698:1: rule__ChangeFontSizeOperation__Group__4__Impl : ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeFontSizeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6702:1: ( ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:6703:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6703:1: ( ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:6704:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:6705:2: ( rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 )
            // InternalAdaptDsl.g:6705:3: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4
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
    // InternalAdaptDsl.g:6713:1: rule__ChangeFontSizeOperation__Group__5 : rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 ;
    public final void rule__ChangeFontSizeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6717:1: ( rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6 )
            // InternalAdaptDsl.g:6718:2: rule__ChangeFontSizeOperation__Group__5__Impl rule__ChangeFontSizeOperation__Group__6
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
    // InternalAdaptDsl.g:6725:1: rule__ChangeFontSizeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeFontSizeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6729:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6730:1: ( ')' )
            {
            // InternalAdaptDsl.g:6730:1: ( ')' )
            // InternalAdaptDsl.g:6731:2: ')'
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
    // InternalAdaptDsl.g:6740:1: rule__ChangeFontSizeOperation__Group__6 : rule__ChangeFontSizeOperation__Group__6__Impl ;
    public final void rule__ChangeFontSizeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6744:1: ( rule__ChangeFontSizeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6745:2: rule__ChangeFontSizeOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6751:1: rule__ChangeFontSizeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeFontSizeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6755:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6756:1: ( ';' )
            {
            // InternalAdaptDsl.g:6756:1: ( ';' )
            // InternalAdaptDsl.g:6757:2: ';'
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
    // InternalAdaptDsl.g:6767:1: rule__ChangeColorSchemeOperation__Group__0 : rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 ;
    public final void rule__ChangeColorSchemeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6771:1: ( rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1 )
            // InternalAdaptDsl.g:6772:2: rule__ChangeColorSchemeOperation__Group__0__Impl rule__ChangeColorSchemeOperation__Group__1
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
    // InternalAdaptDsl.g:6779:1: rule__ChangeColorSchemeOperation__Group__0__Impl : ( 'changeColorScheme' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6783:1: ( ( 'changeColorScheme' ) )
            // InternalAdaptDsl.g:6784:1: ( 'changeColorScheme' )
            {
            // InternalAdaptDsl.g:6784:1: ( 'changeColorScheme' )
            // InternalAdaptDsl.g:6785:2: 'changeColorScheme'
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6794:1: rule__ChangeColorSchemeOperation__Group__1 : rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 ;
    public final void rule__ChangeColorSchemeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6798:1: ( rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2 )
            // InternalAdaptDsl.g:6799:2: rule__ChangeColorSchemeOperation__Group__1__Impl rule__ChangeColorSchemeOperation__Group__2
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
    // InternalAdaptDsl.g:6806:1: rule__ChangeColorSchemeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6810:1: ( ( '(' ) )
            // InternalAdaptDsl.g:6811:1: ( '(' )
            {
            // InternalAdaptDsl.g:6811:1: ( '(' )
            // InternalAdaptDsl.g:6812:2: '('
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
    // InternalAdaptDsl.g:6821:1: rule__ChangeColorSchemeOperation__Group__2 : rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 ;
    public final void rule__ChangeColorSchemeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6825:1: ( rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3 )
            // InternalAdaptDsl.g:6826:2: rule__ChangeColorSchemeOperation__Group__2__Impl rule__ChangeColorSchemeOperation__Group__3
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
    // InternalAdaptDsl.g:6833:1: rule__ChangeColorSchemeOperation__Group__2__Impl : ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6837:1: ( ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) ) )
            // InternalAdaptDsl.g:6838:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            {
            // InternalAdaptDsl.g:6838:1: ( ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 ) )
            // InternalAdaptDsl.g:6839:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryAssignment_2()); 
            // InternalAdaptDsl.g:6840:2: ( rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 )
            // InternalAdaptDsl.g:6840:3: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2
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
    // InternalAdaptDsl.g:6848:1: rule__ChangeColorSchemeOperation__Group__3 : rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 ;
    public final void rule__ChangeColorSchemeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6852:1: ( rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4 )
            // InternalAdaptDsl.g:6853:2: rule__ChangeColorSchemeOperation__Group__3__Impl rule__ChangeColorSchemeOperation__Group__4
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
    // InternalAdaptDsl.g:6860:1: rule__ChangeColorSchemeOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6864:1: ( ( ',' ) )
            // InternalAdaptDsl.g:6865:1: ( ',' )
            {
            // InternalAdaptDsl.g:6865:1: ( ',' )
            // InternalAdaptDsl.g:6866:2: ','
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6875:1: rule__ChangeColorSchemeOperation__Group__4 : rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 ;
    public final void rule__ChangeColorSchemeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6879:1: ( rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5 )
            // InternalAdaptDsl.g:6880:2: rule__ChangeColorSchemeOperation__Group__4__Impl rule__ChangeColorSchemeOperation__Group__5
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
    // InternalAdaptDsl.g:6887:1: rule__ChangeColorSchemeOperation__Group__4__Impl : ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) ;
    public final void rule__ChangeColorSchemeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6891:1: ( ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) ) )
            // InternalAdaptDsl.g:6892:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            {
            // InternalAdaptDsl.g:6892:1: ( ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 ) )
            // InternalAdaptDsl.g:6893:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            {
             before(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryAssignment_4()); 
            // InternalAdaptDsl.g:6894:2: ( rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 )
            // InternalAdaptDsl.g:6894:3: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4
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
    // InternalAdaptDsl.g:6902:1: rule__ChangeColorSchemeOperation__Group__5 : rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 ;
    public final void rule__ChangeColorSchemeOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6906:1: ( rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6 )
            // InternalAdaptDsl.g:6907:2: rule__ChangeColorSchemeOperation__Group__5__Impl rule__ChangeColorSchemeOperation__Group__6
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
    // InternalAdaptDsl.g:6914:1: rule__ChangeColorSchemeOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6918:1: ( ( ')' ) )
            // InternalAdaptDsl.g:6919:1: ( ')' )
            {
            // InternalAdaptDsl.g:6919:1: ( ')' )
            // InternalAdaptDsl.g:6920:2: ')'
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
    // InternalAdaptDsl.g:6929:1: rule__ChangeColorSchemeOperation__Group__6 : rule__ChangeColorSchemeOperation__Group__6__Impl ;
    public final void rule__ChangeColorSchemeOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6933:1: ( rule__ChangeColorSchemeOperation__Group__6__Impl )
            // InternalAdaptDsl.g:6934:2: rule__ChangeColorSchemeOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:6940:1: rule__ChangeColorSchemeOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__ChangeColorSchemeOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6944:1: ( ( ';' ) )
            // InternalAdaptDsl.g:6945:1: ( ';' )
            {
            // InternalAdaptDsl.g:6945:1: ( ';' )
            // InternalAdaptDsl.g:6946:2: ';'
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
    // InternalAdaptDsl.g:6956:1: rule__ChangeFontOperation__Group__0 : rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 ;
    public final void rule__ChangeFontOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6960:1: ( rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 )
            // InternalAdaptDsl.g:6961:2: rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1
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
    // InternalAdaptDsl.g:6968:1: rule__ChangeFontOperation__Group__0__Impl : ( 'changeFont' ) ;
    public final void rule__ChangeFontOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6972:1: ( ( 'changeFont' ) )
            // InternalAdaptDsl.g:6973:1: ( 'changeFont' )
            {
            // InternalAdaptDsl.g:6973:1: ( 'changeFont' )
            // InternalAdaptDsl.g:6974:2: 'changeFont'
            {
             before(grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalAdaptDsl.g:6983:1: rule__ChangeFontOperation__Group__1 : rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 ;
    public final void rule__ChangeFontOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6987:1: ( rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 )
            // InternalAdaptDsl.g:6988:2: rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2
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
    // InternalAdaptDsl.g:6995:1: rule__ChangeFontOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:6999:1: ( ( '(' ) )
            // InternalAdaptDsl.g:7000:1: ( '(' )
            {
            // InternalAdaptDsl.g:7000:1: ( '(' )
            // InternalAdaptDsl.g:7001:2: '('
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
    // InternalAdaptDsl.g:7010:1: rule__ChangeFontOperation__Group__2 : rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 ;
    public final void rule__ChangeFontOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7014:1: ( rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 )
            // InternalAdaptDsl.g:7015:2: rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3
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
    // InternalAdaptDsl.g:7022:1: rule__ChangeFontOperation__Group__2__Impl : ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeFontOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7026:1: ( ( ( rule__ChangeFontOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:7027:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7027:1: ( ( rule__ChangeFontOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:7028:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:7029:2: ( rule__ChangeFontOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:7029:3: rule__ChangeFontOperation__TextAssignment_2
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
    // InternalAdaptDsl.g:7037:1: rule__ChangeFontOperation__Group__3 : rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 ;
    public final void rule__ChangeFontOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7041:1: ( rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 )
            // InternalAdaptDsl.g:7042:2: rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4
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
    // InternalAdaptDsl.g:7049:1: rule__ChangeFontOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7053:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7054:1: ( ')' )
            {
            // InternalAdaptDsl.g:7054:1: ( ')' )
            // InternalAdaptDsl.g:7055:2: ')'
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
    // InternalAdaptDsl.g:7064:1: rule__ChangeFontOperation__Group__4 : rule__ChangeFontOperation__Group__4__Impl ;
    public final void rule__ChangeFontOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7068:1: ( rule__ChangeFontOperation__Group__4__Impl )
            // InternalAdaptDsl.g:7069:2: rule__ChangeFontOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:7075:1: rule__ChangeFontOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7079:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7080:1: ( ';' )
            {
            // InternalAdaptDsl.g:7080:1: ( ';' )
            // InternalAdaptDsl.g:7081:2: ';'
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
    // InternalAdaptDsl.g:7091:1: rule__ChangeTableCssClassOperation__Group__0 : rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 ;
    public final void rule__ChangeTableCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7095:1: ( rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:7096:2: rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1
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
    // InternalAdaptDsl.g:7103:1: rule__ChangeTableCssClassOperation__Group__0__Impl : ( 'changeTableCss' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7107:1: ( ( 'changeTableCss' ) )
            // InternalAdaptDsl.g:7108:1: ( 'changeTableCss' )
            {
            // InternalAdaptDsl.g:7108:1: ( 'changeTableCss' )
            // InternalAdaptDsl.g:7109:2: 'changeTableCss'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7118:1: rule__ChangeTableCssClassOperation__Group__1 : rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 ;
    public final void rule__ChangeTableCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7122:1: ( rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:7123:2: rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2
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
    // InternalAdaptDsl.g:7130:1: rule__ChangeTableCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7134:1: ( ( '(' ) )
            // InternalAdaptDsl.g:7135:1: ( '(' )
            {
            // InternalAdaptDsl.g:7135:1: ( '(' )
            // InternalAdaptDsl.g:7136:2: '('
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
    // InternalAdaptDsl.g:7145:1: rule__ChangeTableCssClassOperation__Group__2 : rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 ;
    public final void rule__ChangeTableCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7149:1: ( rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:7150:2: rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3
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
    // InternalAdaptDsl.g:7157:1: rule__ChangeTableCssClassOperation__Group__2__Impl : ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) ;
    public final void rule__ChangeTableCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7161:1: ( ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) ) )
            // InternalAdaptDsl.g:7162:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7162:1: ( ( rule__ChangeTableCssClassOperation__TextAssignment_2 ) )
            // InternalAdaptDsl.g:7163:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextAssignment_2()); 
            // InternalAdaptDsl.g:7164:2: ( rule__ChangeTableCssClassOperation__TextAssignment_2 )
            // InternalAdaptDsl.g:7164:3: rule__ChangeTableCssClassOperation__TextAssignment_2
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
    // InternalAdaptDsl.g:7172:1: rule__ChangeTableCssClassOperation__Group__3 : rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 ;
    public final void rule__ChangeTableCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7176:1: ( rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:7177:2: rule__ChangeTableCssClassOperation__Group__3__Impl rule__ChangeTableCssClassOperation__Group__4
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
    // InternalAdaptDsl.g:7184:1: rule__ChangeTableCssClassOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7188:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7189:1: ( ')' )
            {
            // InternalAdaptDsl.g:7189:1: ( ')' )
            // InternalAdaptDsl.g:7190:2: ')'
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
    // InternalAdaptDsl.g:7199:1: rule__ChangeTableCssClassOperation__Group__4 : rule__ChangeTableCssClassOperation__Group__4__Impl ;
    public final void rule__ChangeTableCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7203:1: ( rule__ChangeTableCssClassOperation__Group__4__Impl )
            // InternalAdaptDsl.g:7204:2: rule__ChangeTableCssClassOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:7210:1: rule__ChangeTableCssClassOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7214:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7215:1: ( ';' )
            {
            // InternalAdaptDsl.g:7215:1: ( ';' )
            // InternalAdaptDsl.g:7216:2: ';'
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
    // InternalAdaptDsl.g:7226:1: rule__AdaptCssClassOperation__Group__0 : rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 ;
    public final void rule__AdaptCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7230:1: ( rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:7231:2: rule__AdaptCssClassOperation__Group__0__Impl rule__AdaptCssClassOperation__Group__1
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
    // InternalAdaptDsl.g:7238:1: rule__AdaptCssClassOperation__Group__0__Impl : ( 'adaptCssClass' ) ;
    public final void rule__AdaptCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7242:1: ( ( 'adaptCssClass' ) )
            // InternalAdaptDsl.g:7243:1: ( 'adaptCssClass' )
            {
            // InternalAdaptDsl.g:7243:1: ( 'adaptCssClass' )
            // InternalAdaptDsl.g:7244:2: 'adaptCssClass'
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7253:1: rule__AdaptCssClassOperation__Group__1 : rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 ;
    public final void rule__AdaptCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7257:1: ( rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:7258:2: rule__AdaptCssClassOperation__Group__1__Impl rule__AdaptCssClassOperation__Group__2
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
    // InternalAdaptDsl.g:7265:1: rule__AdaptCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AdaptCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7269:1: ( ( '(' ) )
            // InternalAdaptDsl.g:7270:1: ( '(' )
            {
            // InternalAdaptDsl.g:7270:1: ( '(' )
            // InternalAdaptDsl.g:7271:2: '('
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
    // InternalAdaptDsl.g:7280:1: rule__AdaptCssClassOperation__Group__2 : rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 ;
    public final void rule__AdaptCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7284:1: ( rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:7285:2: rule__AdaptCssClassOperation__Group__2__Impl rule__AdaptCssClassOperation__Group__3
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
    // InternalAdaptDsl.g:7292:1: rule__AdaptCssClassOperation__Group__2__Impl : ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7296:1: ( ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) ) )
            // InternalAdaptDsl.g:7297:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7297:1: ( ( rule__AdaptCssClassOperation__CssClassAssignment_2 ) )
            // InternalAdaptDsl.g:7298:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssClassAssignment_2()); 
            // InternalAdaptDsl.g:7299:2: ( rule__AdaptCssClassOperation__CssClassAssignment_2 )
            // InternalAdaptDsl.g:7299:3: rule__AdaptCssClassOperation__CssClassAssignment_2
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
    // InternalAdaptDsl.g:7307:1: rule__AdaptCssClassOperation__Group__3 : rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 ;
    public final void rule__AdaptCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7311:1: ( rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4 )
            // InternalAdaptDsl.g:7312:2: rule__AdaptCssClassOperation__Group__3__Impl rule__AdaptCssClassOperation__Group__4
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
    // InternalAdaptDsl.g:7319:1: rule__AdaptCssClassOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7323:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7324:1: ( ',' )
            {
            // InternalAdaptDsl.g:7324:1: ( ',' )
            // InternalAdaptDsl.g:7325:2: ','
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7334:1: rule__AdaptCssClassOperation__Group__4 : rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 ;
    public final void rule__AdaptCssClassOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7338:1: ( rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5 )
            // InternalAdaptDsl.g:7339:2: rule__AdaptCssClassOperation__Group__4__Impl rule__AdaptCssClassOperation__Group__5
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
    // InternalAdaptDsl.g:7346:1: rule__AdaptCssClassOperation__Group__4__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7350:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) ) )
            // InternalAdaptDsl.g:7351:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            {
            // InternalAdaptDsl.g:7351:1: ( ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 ) )
            // InternalAdaptDsl.g:7352:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAssignment_4()); 
            // InternalAdaptDsl.g:7353:2: ( rule__AdaptCssClassOperation__CssAttributeAssignment_4 )
            // InternalAdaptDsl.g:7353:3: rule__AdaptCssClassOperation__CssAttributeAssignment_4
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
    // InternalAdaptDsl.g:7361:1: rule__AdaptCssClassOperation__Group__5 : rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 ;
    public final void rule__AdaptCssClassOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7365:1: ( rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6 )
            // InternalAdaptDsl.g:7366:2: rule__AdaptCssClassOperation__Group__5__Impl rule__AdaptCssClassOperation__Group__6
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
    // InternalAdaptDsl.g:7373:1: rule__AdaptCssClassOperation__Group__5__Impl : ( ',' ) ;
    public final void rule__AdaptCssClassOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7377:1: ( ( ',' ) )
            // InternalAdaptDsl.g:7378:1: ( ',' )
            {
            // InternalAdaptDsl.g:7378:1: ( ',' )
            // InternalAdaptDsl.g:7379:2: ','
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7388:1: rule__AdaptCssClassOperation__Group__6 : rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 ;
    public final void rule__AdaptCssClassOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7392:1: ( rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7 )
            // InternalAdaptDsl.g:7393:2: rule__AdaptCssClassOperation__Group__6__Impl rule__AdaptCssClassOperation__Group__7
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
    // InternalAdaptDsl.g:7400:1: rule__AdaptCssClassOperation__Group__6__Impl : ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) ;
    public final void rule__AdaptCssClassOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7404:1: ( ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) ) )
            // InternalAdaptDsl.g:7405:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            {
            // InternalAdaptDsl.g:7405:1: ( ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 ) )
            // InternalAdaptDsl.g:7406:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            {
             before(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAssignment_6()); 
            // InternalAdaptDsl.g:7407:2: ( rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 )
            // InternalAdaptDsl.g:7407:3: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6
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
    // InternalAdaptDsl.g:7415:1: rule__AdaptCssClassOperation__Group__7 : rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 ;
    public final void rule__AdaptCssClassOperation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7419:1: ( rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8 )
            // InternalAdaptDsl.g:7420:2: rule__AdaptCssClassOperation__Group__7__Impl rule__AdaptCssClassOperation__Group__8
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
    // InternalAdaptDsl.g:7427:1: rule__AdaptCssClassOperation__Group__7__Impl : ( ')' ) ;
    public final void rule__AdaptCssClassOperation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7431:1: ( ( ')' ) )
            // InternalAdaptDsl.g:7432:1: ( ')' )
            {
            // InternalAdaptDsl.g:7432:1: ( ')' )
            // InternalAdaptDsl.g:7433:2: ')'
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
    // InternalAdaptDsl.g:7442:1: rule__AdaptCssClassOperation__Group__8 : rule__AdaptCssClassOperation__Group__8__Impl ;
    public final void rule__AdaptCssClassOperation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7446:1: ( rule__AdaptCssClassOperation__Group__8__Impl )
            // InternalAdaptDsl.g:7447:2: rule__AdaptCssClassOperation__Group__8__Impl
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
    // InternalAdaptDsl.g:7453:1: rule__AdaptCssClassOperation__Group__8__Impl : ( ';' ) ;
    public final void rule__AdaptCssClassOperation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7457:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7458:1: ( ';' )
            {
            // InternalAdaptDsl.g:7458:1: ( ';' )
            // InternalAdaptDsl.g:7459:2: ';'
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
    // InternalAdaptDsl.g:7469:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7473:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAdaptDsl.g:7474:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalAdaptDsl.g:7481:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7485:1: ( ( 'Entity' ) )
            // InternalAdaptDsl.g:7486:1: ( 'Entity' )
            {
            // InternalAdaptDsl.g:7486:1: ( 'Entity' )
            // InternalAdaptDsl.g:7487:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7496:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7500:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAdaptDsl.g:7501:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalAdaptDsl.g:7508:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7512:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalAdaptDsl.g:7513:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalAdaptDsl.g:7513:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalAdaptDsl.g:7514:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalAdaptDsl.g:7515:2: ( rule__Entity__NameAssignment_1 )
            // InternalAdaptDsl.g:7515:3: rule__Entity__NameAssignment_1
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
    // InternalAdaptDsl.g:7523:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7527:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAdaptDsl.g:7528:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAdaptDsl.g:7535:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7539:1: ( ( '{' ) )
            // InternalAdaptDsl.g:7540:1: ( '{' )
            {
            // InternalAdaptDsl.g:7540:1: ( '{' )
            // InternalAdaptDsl.g:7541:2: '{'
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
    // InternalAdaptDsl.g:7550:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7554:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAdaptDsl.g:7555:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalAdaptDsl.g:7562:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7566:1: ( ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) ) )
            // InternalAdaptDsl.g:7567:1: ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) )
            {
            // InternalAdaptDsl.g:7567:1: ( ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* ) )
            // InternalAdaptDsl.g:7568:2: ( ( rule__Entity__PropertyAssignment_3 ) ) ( ( rule__Entity__PropertyAssignment_3 )* )
            {
            // InternalAdaptDsl.g:7568:2: ( ( rule__Entity__PropertyAssignment_3 ) )
            // InternalAdaptDsl.g:7569:3: ( rule__Entity__PropertyAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 
            // InternalAdaptDsl.g:7570:3: ( rule__Entity__PropertyAssignment_3 )
            // InternalAdaptDsl.g:7570:4: rule__Entity__PropertyAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__PropertyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 

            }

            // InternalAdaptDsl.g:7573:2: ( ( rule__Entity__PropertyAssignment_3 )* )
            // InternalAdaptDsl.g:7574:3: ( rule__Entity__PropertyAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertyAssignment_3()); 
            // InternalAdaptDsl.g:7575:3: ( rule__Entity__PropertyAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_STRING) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAdaptDsl.g:7575:4: rule__Entity__PropertyAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__PropertyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAdaptDsl.g:7584:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7588:1: ( rule__Entity__Group__4__Impl )
            // InternalAdaptDsl.g:7589:2: rule__Entity__Group__4__Impl
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
    // InternalAdaptDsl.g:7595:1: rule__Entity__Group__4__Impl : ( '};' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7599:1: ( ( '};' ) )
            // InternalAdaptDsl.g:7600:1: ( '};' )
            {
            // InternalAdaptDsl.g:7600:1: ( '};' )
            // InternalAdaptDsl.g:7601:2: '};'
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
    // InternalAdaptDsl.g:7611:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7615:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalAdaptDsl.g:7616:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdaptDsl.g:7623:1: rule__Property__Group__0__Impl : ( ( rule__Property__PropertyNameAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7627:1: ( ( ( rule__Property__PropertyNameAssignment_0 ) ) )
            // InternalAdaptDsl.g:7628:1: ( ( rule__Property__PropertyNameAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7628:1: ( ( rule__Property__PropertyNameAssignment_0 ) )
            // InternalAdaptDsl.g:7629:2: ( rule__Property__PropertyNameAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getPropertyNameAssignment_0()); 
            // InternalAdaptDsl.g:7630:2: ( rule__Property__PropertyNameAssignment_0 )
            // InternalAdaptDsl.g:7630:3: rule__Property__PropertyNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Property__PropertyNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getPropertyNameAssignment_0()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7638:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7642:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalAdaptDsl.g:7643:2: rule__Property__Group__1__Impl rule__Property__Group__2
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
    // InternalAdaptDsl.g:7650:1: rule__Property__Group__1__Impl : ( ':' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7654:1: ( ( ':' ) )
            // InternalAdaptDsl.g:7655:1: ( ':' )
            {
            // InternalAdaptDsl.g:7655:1: ( ':' )
            // InternalAdaptDsl.g:7656:2: ':'
            {
             before(grammarAccess.getPropertyAccess().getColonKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7665:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7669:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalAdaptDsl.g:7670:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptDsl.g:7677:1: rule__Property__Group__2__Impl : ( ( rule__Property__TypeAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7681:1: ( ( ( rule__Property__TypeAssignment_2 ) ) )
            // InternalAdaptDsl.g:7682:1: ( ( rule__Property__TypeAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7682:1: ( ( rule__Property__TypeAssignment_2 ) )
            // InternalAdaptDsl.g:7683:2: ( rule__Property__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getTypeAssignment_2()); 
            // InternalAdaptDsl.g:7684:2: ( rule__Property__TypeAssignment_2 )
            // InternalAdaptDsl.g:7684:3: rule__Property__TypeAssignment_2
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
    // InternalAdaptDsl.g:7692:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7696:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalAdaptDsl.g:7697:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalAdaptDsl.g:7704:1: rule__Property__Group__3__Impl : ( 'from' ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7708:1: ( ( 'from' ) )
            // InternalAdaptDsl.g:7709:1: ( 'from' )
            {
            // InternalAdaptDsl.g:7709:1: ( 'from' )
            // InternalAdaptDsl.g:7710:2: 'from'
            {
             before(grammarAccess.getPropertyAccess().getFromKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getFromKeyword_3()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7719:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7723:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalAdaptDsl.g:7724:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:7731:1: rule__Property__Group__4__Impl : ( ( rule__Property__ProviderAssignment_4 ) ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7735:1: ( ( ( rule__Property__ProviderAssignment_4 ) ) )
            // InternalAdaptDsl.g:7736:1: ( ( rule__Property__ProviderAssignment_4 ) )
            {
            // InternalAdaptDsl.g:7736:1: ( ( rule__Property__ProviderAssignment_4 ) )
            // InternalAdaptDsl.g:7737:2: ( rule__Property__ProviderAssignment_4 )
            {
             before(grammarAccess.getPropertyAccess().getProviderAssignment_4()); 
            // InternalAdaptDsl.g:7738:2: ( rule__Property__ProviderAssignment_4 )
            // InternalAdaptDsl.g:7738:3: rule__Property__ProviderAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Property__ProviderAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getProviderAssignment_4()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:7746:1: rule__Property__Group__5 : rule__Property__Group__5__Impl ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7750:1: ( rule__Property__Group__5__Impl )
            // InternalAdaptDsl.g:7751:2: rule__Property__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptDsl.g:7757:1: rule__Property__Group__5__Impl : ( ';' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7761:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7762:1: ( ';' )
            {
            // InternalAdaptDsl.g:7762:1: ( ';' )
            // InternalAdaptDsl.g:7763:2: ';'
            {
             before(grammarAccess.getPropertyAccess().getSemicolonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__DefTypes__Group__0"
    // InternalAdaptDsl.g:7773:1: rule__DefTypes__Group__0 : rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 ;
    public final void rule__DefTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7777:1: ( rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1 )
            // InternalAdaptDsl.g:7778:2: rule__DefTypes__Group__0__Impl rule__DefTypes__Group__1
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
    // InternalAdaptDsl.g:7785:1: rule__DefTypes__Group__0__Impl : ( ( rule__DefTypes__ThisAssignment_0 ) ) ;
    public final void rule__DefTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7789:1: ( ( ( rule__DefTypes__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:7790:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7790:1: ( ( rule__DefTypes__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:7791:2: ( rule__DefTypes__ThisAssignment_0 )
            {
             before(grammarAccess.getDefTypesAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:7792:2: ( rule__DefTypes__ThisAssignment_0 )
            // InternalAdaptDsl.g:7792:3: rule__DefTypes__ThisAssignment_0
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
    // InternalAdaptDsl.g:7800:1: rule__DefTypes__Group__1 : rule__DefTypes__Group__1__Impl ;
    public final void rule__DefTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7804:1: ( rule__DefTypes__Group__1__Impl )
            // InternalAdaptDsl.g:7805:2: rule__DefTypes__Group__1__Impl
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
    // InternalAdaptDsl.g:7811:1: rule__DefTypes__Group__1__Impl : ( ( rule__DefTypes__NextAssignment_1 )? ) ;
    public final void rule__DefTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7815:1: ( ( ( rule__DefTypes__NextAssignment_1 )? ) )
            // InternalAdaptDsl.g:7816:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            {
            // InternalAdaptDsl.g:7816:1: ( ( rule__DefTypes__NextAssignment_1 )? )
            // InternalAdaptDsl.g:7817:2: ( rule__DefTypes__NextAssignment_1 )?
            {
             before(grammarAccess.getDefTypesAccess().getNextAssignment_1()); 
            // InternalAdaptDsl.g:7818:2: ( rule__DefTypes__NextAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAdaptDsl.g:7818:3: rule__DefTypes__NextAssignment_1
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
    // InternalAdaptDsl.g:7827:1: rule__DefType__Group__0 : rule__DefType__Group__0__Impl rule__DefType__Group__1 ;
    public final void rule__DefType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7831:1: ( rule__DefType__Group__0__Impl rule__DefType__Group__1 )
            // InternalAdaptDsl.g:7832:2: rule__DefType__Group__0__Impl rule__DefType__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAdaptDsl.g:7839:1: rule__DefType__Group__0__Impl : ( ( rule__DefType__NameAssignment_0 ) ) ;
    public final void rule__DefType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7843:1: ( ( ( rule__DefType__NameAssignment_0 ) ) )
            // InternalAdaptDsl.g:7844:1: ( ( rule__DefType__NameAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7844:1: ( ( rule__DefType__NameAssignment_0 ) )
            // InternalAdaptDsl.g:7845:2: ( rule__DefType__NameAssignment_0 )
            {
             before(grammarAccess.getDefTypeAccess().getNameAssignment_0()); 
            // InternalAdaptDsl.g:7846:2: ( rule__DefType__NameAssignment_0 )
            // InternalAdaptDsl.g:7846:3: rule__DefType__NameAssignment_0
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
    // InternalAdaptDsl.g:7854:1: rule__DefType__Group__1 : rule__DefType__Group__1__Impl rule__DefType__Group__2 ;
    public final void rule__DefType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7858:1: ( rule__DefType__Group__1__Impl rule__DefType__Group__2 )
            // InternalAdaptDsl.g:7859:2: rule__DefType__Group__1__Impl rule__DefType__Group__2
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
    // InternalAdaptDsl.g:7866:1: rule__DefType__Group__1__Impl : ( ':' ) ;
    public final void rule__DefType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7870:1: ( ( ':' ) )
            // InternalAdaptDsl.g:7871:1: ( ':' )
            {
            // InternalAdaptDsl.g:7871:1: ( ':' )
            // InternalAdaptDsl.g:7872:2: ':'
            {
             before(grammarAccess.getDefTypeAccess().getColonKeyword_1()); 
            match(input,61,FOLLOW_2); 
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
    // InternalAdaptDsl.g:7881:1: rule__DefType__Group__2 : rule__DefType__Group__2__Impl rule__DefType__Group__3 ;
    public final void rule__DefType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7885:1: ( rule__DefType__Group__2__Impl rule__DefType__Group__3 )
            // InternalAdaptDsl.g:7886:2: rule__DefType__Group__2__Impl rule__DefType__Group__3
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
    // InternalAdaptDsl.g:7893:1: rule__DefType__Group__2__Impl : ( ( rule__DefType__EnumsAssignment_2 ) ) ;
    public final void rule__DefType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7897:1: ( ( ( rule__DefType__EnumsAssignment_2 ) ) )
            // InternalAdaptDsl.g:7898:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            {
            // InternalAdaptDsl.g:7898:1: ( ( rule__DefType__EnumsAssignment_2 ) )
            // InternalAdaptDsl.g:7899:2: ( rule__DefType__EnumsAssignment_2 )
            {
             before(grammarAccess.getDefTypeAccess().getEnumsAssignment_2()); 
            // InternalAdaptDsl.g:7900:2: ( rule__DefType__EnumsAssignment_2 )
            // InternalAdaptDsl.g:7900:3: rule__DefType__EnumsAssignment_2
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
    // InternalAdaptDsl.g:7908:1: rule__DefType__Group__3 : rule__DefType__Group__3__Impl ;
    public final void rule__DefType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7912:1: ( rule__DefType__Group__3__Impl )
            // InternalAdaptDsl.g:7913:2: rule__DefType__Group__3__Impl
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
    // InternalAdaptDsl.g:7919:1: rule__DefType__Group__3__Impl : ( ';' ) ;
    public final void rule__DefType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7923:1: ( ( ';' ) )
            // InternalAdaptDsl.g:7924:1: ( ';' )
            {
            // InternalAdaptDsl.g:7924:1: ( ';' )
            // InternalAdaptDsl.g:7925:2: ';'
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
    // InternalAdaptDsl.g:7935:1: rule__Enums__Group__0 : rule__Enums__Group__0__Impl rule__Enums__Group__1 ;
    public final void rule__Enums__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7939:1: ( rule__Enums__Group__0__Impl rule__Enums__Group__1 )
            // InternalAdaptDsl.g:7940:2: rule__Enums__Group__0__Impl rule__Enums__Group__1
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
    // InternalAdaptDsl.g:7947:1: rule__Enums__Group__0__Impl : ( ( rule__Enums__ThisAssignment_0 ) ) ;
    public final void rule__Enums__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7951:1: ( ( ( rule__Enums__ThisAssignment_0 ) ) )
            // InternalAdaptDsl.g:7952:1: ( ( rule__Enums__ThisAssignment_0 ) )
            {
            // InternalAdaptDsl.g:7952:1: ( ( rule__Enums__ThisAssignment_0 ) )
            // InternalAdaptDsl.g:7953:2: ( rule__Enums__ThisAssignment_0 )
            {
             before(grammarAccess.getEnumsAccess().getThisAssignment_0()); 
            // InternalAdaptDsl.g:7954:2: ( rule__Enums__ThisAssignment_0 )
            // InternalAdaptDsl.g:7954:3: rule__Enums__ThisAssignment_0
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
    // InternalAdaptDsl.g:7962:1: rule__Enums__Group__1 : rule__Enums__Group__1__Impl ;
    public final void rule__Enums__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7966:1: ( rule__Enums__Group__1__Impl )
            // InternalAdaptDsl.g:7967:2: rule__Enums__Group__1__Impl
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
    // InternalAdaptDsl.g:7973:1: rule__Enums__Group__1__Impl : ( ( rule__Enums__Group_1__0 )? ) ;
    public final void rule__Enums__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7977:1: ( ( ( rule__Enums__Group_1__0 )? ) )
            // InternalAdaptDsl.g:7978:1: ( ( rule__Enums__Group_1__0 )? )
            {
            // InternalAdaptDsl.g:7978:1: ( ( rule__Enums__Group_1__0 )? )
            // InternalAdaptDsl.g:7979:2: ( rule__Enums__Group_1__0 )?
            {
             before(grammarAccess.getEnumsAccess().getGroup_1()); 
            // InternalAdaptDsl.g:7980:2: ( rule__Enums__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAdaptDsl.g:7980:3: rule__Enums__Group_1__0
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
    // InternalAdaptDsl.g:7989:1: rule__Enums__Group_1__0 : rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 ;
    public final void rule__Enums__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:7993:1: ( rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1 )
            // InternalAdaptDsl.g:7994:2: rule__Enums__Group_1__0__Impl rule__Enums__Group_1__1
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
    // InternalAdaptDsl.g:8001:1: rule__Enums__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Enums__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8005:1: ( ( ',' ) )
            // InternalAdaptDsl.g:8006:1: ( ',' )
            {
            // InternalAdaptDsl.g:8006:1: ( ',' )
            // InternalAdaptDsl.g:8007:2: ','
            {
             before(grammarAccess.getEnumsAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalAdaptDsl.g:8016:1: rule__Enums__Group_1__1 : rule__Enums__Group_1__1__Impl ;
    public final void rule__Enums__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8020:1: ( rule__Enums__Group_1__1__Impl )
            // InternalAdaptDsl.g:8021:2: rule__Enums__Group_1__1__Impl
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
    // InternalAdaptDsl.g:8027:1: rule__Enums__Group_1__1__Impl : ( ( rule__Enums__NextAssignment_1_1 ) ) ;
    public final void rule__Enums__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8031:1: ( ( ( rule__Enums__NextAssignment_1_1 ) ) )
            // InternalAdaptDsl.g:8032:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            {
            // InternalAdaptDsl.g:8032:1: ( ( rule__Enums__NextAssignment_1_1 ) )
            // InternalAdaptDsl.g:8033:2: ( rule__Enums__NextAssignment_1_1 )
            {
             before(grammarAccess.getEnumsAccess().getNextAssignment_1_1()); 
            // InternalAdaptDsl.g:8034:2: ( rule__Enums__NextAssignment_1_1 )
            // InternalAdaptDsl.g:8034:3: rule__Enums__NextAssignment_1_1
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
    // InternalAdaptDsl.g:8043:1: rule__Model__ContextModelAssignment_0 : ( ruleContextModel ) ;
    public final void rule__Model__ContextModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8047:1: ( ( ruleContextModel ) )
            // InternalAdaptDsl.g:8048:2: ( ruleContextModel )
            {
            // InternalAdaptDsl.g:8048:2: ( ruleContextModel )
            // InternalAdaptDsl.g:8049:3: ruleContextModel
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
    // InternalAdaptDsl.g:8058:1: rule__Model__AdaptationModelAssignment_1 : ( ruleAdaptationModel ) ;
    public final void rule__Model__AdaptationModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8062:1: ( ( ruleAdaptationModel ) )
            // InternalAdaptDsl.g:8063:2: ( ruleAdaptationModel )
            {
            // InternalAdaptDsl.g:8063:2: ( ruleAdaptationModel )
            // InternalAdaptDsl.g:8064:3: ruleAdaptationModel
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
    // InternalAdaptDsl.g:8073:1: rule__ContextModel__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__ContextModel__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8077:1: ( ( ruleEntity ) )
            // InternalAdaptDsl.g:8078:2: ( ruleEntity )
            {
            // InternalAdaptDsl.g:8078:2: ( ruleEntity )
            // InternalAdaptDsl.g:8079:3: ruleEntity
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
    // InternalAdaptDsl.g:8088:1: rule__ContextModel__ProviderAssignment_2_1_0 : ( ruleProvider ) ;
    public final void rule__ContextModel__ProviderAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8092:1: ( ( ruleProvider ) )
            // InternalAdaptDsl.g:8093:2: ( ruleProvider )
            {
            // InternalAdaptDsl.g:8093:2: ( ruleProvider )
            // InternalAdaptDsl.g:8094:3: ruleProvider
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
    // InternalAdaptDsl.g:8103:1: rule__ContextModel__TypesAssignment_3_1 : ( ruleDefTypes ) ;
    public final void rule__ContextModel__TypesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8107:1: ( ( ruleDefTypes ) )
            // InternalAdaptDsl.g:8108:2: ( ruleDefTypes )
            {
            // InternalAdaptDsl.g:8108:2: ( ruleDefTypes )
            // InternalAdaptDsl.g:8109:3: ruleDefTypes
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
    // InternalAdaptDsl.g:8118:1: rule__AdaptationModel__ServicesAssignment_1 : ( ruleServices ) ;
    public final void rule__AdaptationModel__ServicesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8122:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:8123:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:8123:2: ( ruleServices )
            // InternalAdaptDsl.g:8124:3: ruleServices
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
    // InternalAdaptDsl.g:8133:1: rule__AdaptationModel__FlowNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__AdaptationModel__FlowNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8137:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8138:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8138:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8139:3: RULE_STRING
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
    // InternalAdaptDsl.g:8148:1: rule__AdaptationModel__AdaptationRulesAssignment_5 : ( ruleAdaptationRule ) ;
    public final void rule__AdaptationModel__AdaptationRulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8152:1: ( ( ruleAdaptationRule ) )
            // InternalAdaptDsl.g:8153:2: ( ruleAdaptationRule )
            {
            // InternalAdaptDsl.g:8153:2: ( ruleAdaptationRule )
            // InternalAdaptDsl.g:8154:3: ruleAdaptationRule
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
    // InternalAdaptDsl.g:8163:1: rule__Services__ThisAssignment_0 : ( ruleService ) ;
    public final void rule__Services__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8167:1: ( ( ruleService ) )
            // InternalAdaptDsl.g:8168:2: ( ruleService )
            {
            // InternalAdaptDsl.g:8168:2: ( ruleService )
            // InternalAdaptDsl.g:8169:3: ruleService
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
    // InternalAdaptDsl.g:8178:1: rule__Services__NextAssignment_1 : ( ruleServices ) ;
    public final void rule__Services__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8182:1: ( ( ruleServices ) )
            // InternalAdaptDsl.g:8183:2: ( ruleServices )
            {
            // InternalAdaptDsl.g:8183:2: ( ruleServices )
            // InternalAdaptDsl.g:8184:3: ruleServices
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
    // InternalAdaptDsl.g:8193:1: rule__Service__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8197:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8198:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8198:2: ( RULE_ID )
            // InternalAdaptDsl.g:8199:3: RULE_ID
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
    // InternalAdaptDsl.g:8208:1: rule__Service__LocAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Service__LocAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8212:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8213:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8213:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8214:3: RULE_STRING
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
    // InternalAdaptDsl.g:8223:1: rule__Service__IdAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Service__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8227:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8228:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8228:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8229:3: RULE_STRING
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
    // InternalAdaptDsl.g:8238:1: rule__Service__FunctionsAssignment_7 : ( ruleFunctions ) ;
    public final void rule__Service__FunctionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8242:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:8243:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:8243:2: ( ruleFunctions )
            // InternalAdaptDsl.g:8244:3: ruleFunctions
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
    // InternalAdaptDsl.g:8253:1: rule__Functions__ThisAssignment_0 : ( ruleFunction ) ;
    public final void rule__Functions__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8257:1: ( ( ruleFunction ) )
            // InternalAdaptDsl.g:8258:2: ( ruleFunction )
            {
            // InternalAdaptDsl.g:8258:2: ( ruleFunction )
            // InternalAdaptDsl.g:8259:3: ruleFunction
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
    // InternalAdaptDsl.g:8268:1: rule__Functions__NextAssignment_1 : ( ruleFunctions ) ;
    public final void rule__Functions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8272:1: ( ( ruleFunctions ) )
            // InternalAdaptDsl.g:8273:2: ( ruleFunctions )
            {
            // InternalAdaptDsl.g:8273:2: ( ruleFunctions )
            // InternalAdaptDsl.g:8274:3: ruleFunctions
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
    // InternalAdaptDsl.g:8283:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8287:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8288:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8288:2: ( RULE_ID )
            // InternalAdaptDsl.g:8289:3: RULE_ID
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
    // InternalAdaptDsl.g:8298:1: rule__Function__IdAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Function__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8302:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8303:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8303:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8304:3: RULE_STRING
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
    // InternalAdaptDsl.g:8313:1: rule__AdaptationRule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__AdaptationRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8317:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8318:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8318:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8319:3: RULE_STRING
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
    // InternalAdaptDsl.g:8328:1: rule__AdaptationRule__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__AdaptationRule__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8332:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8333:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8333:2: ( RULE_INT )
            // InternalAdaptDsl.g:8334:3: RULE_INT
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
    // InternalAdaptDsl.g:8343:1: rule__AdaptationRule__FactTypeAssignment_7 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8347:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8348:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8348:2: ( RULE_ID )
            // InternalAdaptDsl.g:8349:3: RULE_ID
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
    // InternalAdaptDsl.g:8358:1: rule__AdaptationRule__FactNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__AdaptationRule__FactNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8362:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8363:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8363:2: ( RULE_ID )
            // InternalAdaptDsl.g:8364:3: RULE_ID
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
    // InternalAdaptDsl.g:8373:1: rule__AdaptationRule__ExprAssignment_12 : ( ruleConditionalOR ) ;
    public final void rule__AdaptationRule__ExprAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8377:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:8378:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:8378:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:8379:3: ruleConditionalOR
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
    // InternalAdaptDsl.g:8388:1: rule__AdaptationRule__ActionCollectionAssignment_16 : ( ruleActions ) ;
    public final void rule__AdaptationRule__ActionCollectionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8392:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:8393:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:8393:2: ( ruleActions )
            // InternalAdaptDsl.g:8394:3: ruleActions
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
    // InternalAdaptDsl.g:8403:1: rule__ConditionalOR__LeftAssignment_0 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalOR__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8407:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:8408:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:8408:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:8409:3: ruleConditionalAND
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
    // InternalAdaptDsl.g:8418:1: rule__ConditionalOR__RightAssignment_1_1 : ( ruleConditionalOR ) ;
    public final void rule__ConditionalOR__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8422:1: ( ( ruleConditionalOR ) )
            // InternalAdaptDsl.g:8423:2: ( ruleConditionalOR )
            {
            // InternalAdaptDsl.g:8423:2: ( ruleConditionalOR )
            // InternalAdaptDsl.g:8424:3: ruleConditionalOR
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
    // InternalAdaptDsl.g:8433:1: rule__ConditionalAND__LeftAssignment_0 : ( ruleConditionalPrimary ) ;
    public final void rule__ConditionalAND__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8437:1: ( ( ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:8438:2: ( ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:8438:2: ( ruleConditionalPrimary )
            // InternalAdaptDsl.g:8439:3: ruleConditionalPrimary
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
    // InternalAdaptDsl.g:8448:1: rule__ConditionalAND__RightAssignment_1_1 : ( ruleConditionalAND ) ;
    public final void rule__ConditionalAND__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8452:1: ( ( ruleConditionalAND ) )
            // InternalAdaptDsl.g:8453:2: ( ruleConditionalAND )
            {
            // InternalAdaptDsl.g:8453:2: ( ruleConditionalAND )
            // InternalAdaptDsl.g:8454:3: ruleConditionalAND
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
    // InternalAdaptDsl.g:8463:1: rule__ConditionalPrimary__CondAssignment_0 : ( ruleStringCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8467:1: ( ( ruleStringCondition ) )
            // InternalAdaptDsl.g:8468:2: ( ruleStringCondition )
            {
            // InternalAdaptDsl.g:8468:2: ( ruleStringCondition )
            // InternalAdaptDsl.g:8469:3: ruleStringCondition
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
    // InternalAdaptDsl.g:8478:1: rule__ConditionalPrimary__CondAssignment_1 : ( ruleNumberCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8482:1: ( ( ruleNumberCondition ) )
            // InternalAdaptDsl.g:8483:2: ( ruleNumberCondition )
            {
            // InternalAdaptDsl.g:8483:2: ( ruleNumberCondition )
            // InternalAdaptDsl.g:8484:3: ruleNumberCondition
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
    // InternalAdaptDsl.g:8493:1: rule__ConditionalPrimary__CondAssignment_2 : ( ruleBooleanCondition ) ;
    public final void rule__ConditionalPrimary__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8497:1: ( ( ruleBooleanCondition ) )
            // InternalAdaptDsl.g:8498:2: ( ruleBooleanCondition )
            {
            // InternalAdaptDsl.g:8498:2: ( ruleBooleanCondition )
            // InternalAdaptDsl.g:8499:3: ruleBooleanCondition
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
    // InternalAdaptDsl.g:8508:1: rule__BooleanCondition__FactAssignment_0_0 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8512:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8513:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8513:2: ( ruleFact )
            // InternalAdaptDsl.g:8514:3: ruleFact
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
    // InternalAdaptDsl.g:8523:1: rule__BooleanCondition__OpAssignment_0_1 : ( ruleBoolOperators ) ;
    public final void rule__BooleanCondition__OpAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8527:1: ( ( ruleBoolOperators ) )
            // InternalAdaptDsl.g:8528:2: ( ruleBoolOperators )
            {
            // InternalAdaptDsl.g:8528:2: ( ruleBoolOperators )
            // InternalAdaptDsl.g:8529:3: ruleBoolOperators
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
    // InternalAdaptDsl.g:8538:1: rule__BooleanCondition__ValAssignment_0_2 : ( RULE_BOOL ) ;
    public final void rule__BooleanCondition__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8542:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:8543:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:8543:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:8544:3: RULE_BOOL
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
    // InternalAdaptDsl.g:8553:1: rule__BooleanCondition__FactAssignment_1 : ( ruleFact ) ;
    public final void rule__BooleanCondition__FactAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8557:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8558:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8558:2: ( ruleFact )
            // InternalAdaptDsl.g:8559:3: ruleFact
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
    // InternalAdaptDsl.g:8568:1: rule__NumberCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__NumberCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8572:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8573:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8573:2: ( ruleFact )
            // InternalAdaptDsl.g:8574:3: ruleFact
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
    // InternalAdaptDsl.g:8583:1: rule__NumberCondition__OpAssignment_1 : ( ruleNumberOperators ) ;
    public final void rule__NumberCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8587:1: ( ( ruleNumberOperators ) )
            // InternalAdaptDsl.g:8588:2: ( ruleNumberOperators )
            {
            // InternalAdaptDsl.g:8588:2: ( ruleNumberOperators )
            // InternalAdaptDsl.g:8589:3: ruleNumberOperators
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
    // InternalAdaptDsl.g:8598:1: rule__NumberCondition__ValAssignment_2 : ( RULE_INT ) ;
    public final void rule__NumberCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8602:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8603:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8603:2: ( RULE_INT )
            // InternalAdaptDsl.g:8604:3: RULE_INT
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
    // InternalAdaptDsl.g:8613:1: rule__StringCondition__FactAssignment_0 : ( ruleFact ) ;
    public final void rule__StringCondition__FactAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8617:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:8618:2: ( ruleFact )
            {
            // InternalAdaptDsl.g:8618:2: ( ruleFact )
            // InternalAdaptDsl.g:8619:3: ruleFact
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
    // InternalAdaptDsl.g:8628:1: rule__StringCondition__OpAssignment_1 : ( ruleStringOperators ) ;
    public final void rule__StringCondition__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8632:1: ( ( ruleStringOperators ) )
            // InternalAdaptDsl.g:8633:2: ( ruleStringOperators )
            {
            // InternalAdaptDsl.g:8633:2: ( ruleStringOperators )
            // InternalAdaptDsl.g:8634:3: ruleStringOperators
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
    // InternalAdaptDsl.g:8643:1: rule__StringCondition__ValAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringCondition__ValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8647:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8648:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8648:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8649:3: RULE_STRING
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
    // InternalAdaptDsl.g:8658:1: rule__Actions__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Actions__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8662:1: ( ( ruleAction ) )
            // InternalAdaptDsl.g:8663:2: ( ruleAction )
            {
            // InternalAdaptDsl.g:8663:2: ( ruleAction )
            // InternalAdaptDsl.g:8664:3: ruleAction
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
    // InternalAdaptDsl.g:8673:1: rule__Actions__NextAssignment_1 : ( ruleActions ) ;
    public final void rule__Actions__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8677:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:8678:2: ( ruleActions )
            {
            // InternalAdaptDsl.g:8678:2: ( ruleActions )
            // InternalAdaptDsl.g:8679:3: ruleActions
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
    // InternalAdaptDsl.g:8688:1: rule__Action__ActionCategoryAssignment_0 : ( ruleServiceOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8692:1: ( ( ruleServiceOperation ) )
            // InternalAdaptDsl.g:8693:2: ( ruleServiceOperation )
            {
            // InternalAdaptDsl.g:8693:2: ( ruleServiceOperation )
            // InternalAdaptDsl.g:8694:3: ruleServiceOperation
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
    // InternalAdaptDsl.g:8703:1: rule__Action__ActionCategoryAssignment_1 : ( ruleTaskChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8707:1: ( ( ruleTaskChangeOperation ) )
            // InternalAdaptDsl.g:8708:2: ( ruleTaskChangeOperation )
            {
            // InternalAdaptDsl.g:8708:2: ( ruleTaskChangeOperation )
            // InternalAdaptDsl.g:8709:3: ruleTaskChangeOperation
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
    // InternalAdaptDsl.g:8718:1: rule__Action__ActionCategoryAssignment_2 : ( ruleNavigationChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8722:1: ( ( ruleNavigationChangeOperation ) )
            // InternalAdaptDsl.g:8723:2: ( ruleNavigationChangeOperation )
            {
            // InternalAdaptDsl.g:8723:2: ( ruleNavigationChangeOperation )
            // InternalAdaptDsl.g:8724:3: ruleNavigationChangeOperation
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
    // InternalAdaptDsl.g:8733:1: rule__Action__ActionCategoryAssignment_3 : ( ruleLayoutChangeOperation ) ;
    public final void rule__Action__ActionCategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8737:1: ( ( ruleLayoutChangeOperation ) )
            // InternalAdaptDsl.g:8738:2: ( ruleLayoutChangeOperation )
            {
            // InternalAdaptDsl.g:8738:2: ( ruleLayoutChangeOperation )
            // InternalAdaptDsl.g:8739:3: ruleLayoutChangeOperation
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
    // InternalAdaptDsl.g:8748:1: rule__ServiceOperation__OperationAssignment_0 : ( ruleServiceFunctionCallOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8752:1: ( ( ruleServiceFunctionCallOperation ) )
            // InternalAdaptDsl.g:8753:2: ( ruleServiceFunctionCallOperation )
            {
            // InternalAdaptDsl.g:8753:2: ( ruleServiceFunctionCallOperation )
            // InternalAdaptDsl.g:8754:3: ruleServiceFunctionCallOperation
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
    // InternalAdaptDsl.g:8763:1: rule__ServiceOperation__OperationAssignment_1 : ( ruleEditFactOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8767:1: ( ( ruleEditFactOperation ) )
            // InternalAdaptDsl.g:8768:2: ( ruleEditFactOperation )
            {
            // InternalAdaptDsl.g:8768:2: ( ruleEditFactOperation )
            // InternalAdaptDsl.g:8769:3: ruleEditFactOperation
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
    // InternalAdaptDsl.g:8778:1: rule__ServiceOperation__OperationAssignment_2 : ( ruleSetDisplayPropertyOperation ) ;
    public final void rule__ServiceOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8782:1: ( ( ruleSetDisplayPropertyOperation ) )
            // InternalAdaptDsl.g:8783:2: ( ruleSetDisplayPropertyOperation )
            {
            // InternalAdaptDsl.g:8783:2: ( ruleSetDisplayPropertyOperation )
            // InternalAdaptDsl.g:8784:3: ruleSetDisplayPropertyOperation
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
    // InternalAdaptDsl.g:8793:1: rule__ServiceFunctionCallOperation__ServiceAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__ServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8797:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8798:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8798:2: ( RULE_ID )
            // InternalAdaptDsl.g:8799:3: RULE_ID
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
    // InternalAdaptDsl.g:8808:1: rule__ServiceFunctionCallOperation__FunctionAssignment_4 : ( RULE_ID ) ;
    public final void rule__ServiceFunctionCallOperation__FunctionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8812:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:8813:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:8813:2: ( RULE_ID )
            // InternalAdaptDsl.g:8814:3: RULE_ID
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
    // InternalAdaptDsl.g:8823:1: rule__ServiceFunctionCallOperation__ValAssignment_6 : ( ruleValue ) ;
    public final void rule__ServiceFunctionCallOperation__ValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8827:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:8828:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:8828:2: ( ruleValue )
            // InternalAdaptDsl.g:8829:3: ruleValue
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
    // InternalAdaptDsl.g:8838:1: rule__EditFactOperation__PropAssignment_2 : ( ruleFactProperty ) ;
    public final void rule__EditFactOperation__PropAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8842:1: ( ( ruleFactProperty ) )
            // InternalAdaptDsl.g:8843:2: ( ruleFactProperty )
            {
            // InternalAdaptDsl.g:8843:2: ( ruleFactProperty )
            // InternalAdaptDsl.g:8844:3: ruleFactProperty
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
    // InternalAdaptDsl.g:8853:1: rule__EditFactOperation__ValAssignment_3_1 : ( ruleValue ) ;
    public final void rule__EditFactOperation__ValAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8857:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:8858:2: ( ruleValue )
            {
            // InternalAdaptDsl.g:8858:2: ( ruleValue )
            // InternalAdaptDsl.g:8859:3: ruleValue
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
    // InternalAdaptDsl.g:8868:1: rule__SetDisplayPropertyOperation__PropertyAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8872:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8873:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8873:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8874:3: RULE_STRING
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
    // InternalAdaptDsl.g:8883:1: rule__SetDisplayPropertyOperation__PropertyValueAssignment_4 : ( ruleDisplayPropertyValue ) ;
    public final void rule__SetDisplayPropertyOperation__PropertyValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8887:1: ( ( ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:8888:2: ( ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:8888:2: ( ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:8889:3: ruleDisplayPropertyValue
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
    // InternalAdaptDsl.g:8898:1: rule__DisplayPropertyValue__PropertyClassAssignment_0 : ( ruleIntValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8902:1: ( ( ruleIntValue ) )
            // InternalAdaptDsl.g:8903:2: ( ruleIntValue )
            {
            // InternalAdaptDsl.g:8903:2: ( ruleIntValue )
            // InternalAdaptDsl.g:8904:3: ruleIntValue
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
    // InternalAdaptDsl.g:8913:1: rule__DisplayPropertyValue__PropertyClassAssignment_1 : ( ruleStringValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8917:1: ( ( ruleStringValue ) )
            // InternalAdaptDsl.g:8918:2: ( ruleStringValue )
            {
            // InternalAdaptDsl.g:8918:2: ( ruleStringValue )
            // InternalAdaptDsl.g:8919:3: ruleStringValue
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
    // InternalAdaptDsl.g:8928:1: rule__DisplayPropertyValue__PropertyClassAssignment_2 : ( ruleBoolValue ) ;
    public final void rule__DisplayPropertyValue__PropertyClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8932:1: ( ( ruleBoolValue ) )
            // InternalAdaptDsl.g:8933:2: ( ruleBoolValue )
            {
            // InternalAdaptDsl.g:8933:2: ( ruleBoolValue )
            // InternalAdaptDsl.g:8934:3: ruleBoolValue
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
    // InternalAdaptDsl.g:8943:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8947:1: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:8948:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:8948:2: ( RULE_INT )
            // InternalAdaptDsl.g:8949:3: RULE_INT
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
    // InternalAdaptDsl.g:8958:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8962:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:8963:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:8963:2: ( RULE_STRING )
            // InternalAdaptDsl.g:8964:3: RULE_STRING
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
    // InternalAdaptDsl.g:8973:1: rule__BoolValue__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BoolValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8977:1: ( ( RULE_BOOL ) )
            // InternalAdaptDsl.g:8978:2: ( RULE_BOOL )
            {
            // InternalAdaptDsl.g:8978:2: ( RULE_BOOL )
            // InternalAdaptDsl.g:8979:3: RULE_BOOL
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
    // InternalAdaptDsl.g:8988:1: rule__TaskChangeOperation__OperationAssignment_0 : ( ruleAddViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:8992:1: ( ( ruleAddViewComponentOperation ) )
            // InternalAdaptDsl.g:8993:2: ( ruleAddViewComponentOperation )
            {
            // InternalAdaptDsl.g:8993:2: ( ruleAddViewComponentOperation )
            // InternalAdaptDsl.g:8994:3: ruleAddViewComponentOperation
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
    // InternalAdaptDsl.g:9003:1: rule__TaskChangeOperation__OperationAssignment_1 : ( ruleDeleteViewComponentOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9007:1: ( ( ruleDeleteViewComponentOperation ) )
            // InternalAdaptDsl.g:9008:2: ( ruleDeleteViewComponentOperation )
            {
            // InternalAdaptDsl.g:9008:2: ( ruleDeleteViewComponentOperation )
            // InternalAdaptDsl.g:9009:3: ruleDeleteViewComponentOperation
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
    // InternalAdaptDsl.g:9018:1: rule__TaskChangeOperation__OperationAssignment_2 : ( ruleAddViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9022:1: ( ( ruleAddViewComponentButtonOperation ) )
            // InternalAdaptDsl.g:9023:2: ( ruleAddViewComponentButtonOperation )
            {
            // InternalAdaptDsl.g:9023:2: ( ruleAddViewComponentButtonOperation )
            // InternalAdaptDsl.g:9024:3: ruleAddViewComponentButtonOperation
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
    // InternalAdaptDsl.g:9033:1: rule__TaskChangeOperation__OperationAssignment_3 : ( ruleDeleteViewComponentButtonOperation ) ;
    public final void rule__TaskChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9037:1: ( ( ruleDeleteViewComponentButtonOperation ) )
            // InternalAdaptDsl.g:9038:2: ( ruleDeleteViewComponentButtonOperation )
            {
            // InternalAdaptDsl.g:9038:2: ( ruleDeleteViewComponentButtonOperation )
            // InternalAdaptDsl.g:9039:3: ruleDeleteViewComponentButtonOperation
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
    // InternalAdaptDsl.g:9048:1: rule__AddViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9052:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9053:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9053:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9054:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9063:1: rule__AddViewComponentOperation__TargetAssignment_4 : ( ruleTargetContainer ) ;
    public final void rule__AddViewComponentOperation__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9067:1: ( ( ruleTargetContainer ) )
            // InternalAdaptDsl.g:9068:2: ( ruleTargetContainer )
            {
            // InternalAdaptDsl.g:9068:2: ( ruleTargetContainer )
            // InternalAdaptDsl.g:9069:3: ruleTargetContainer
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
    // InternalAdaptDsl.g:9078:1: rule__DeleteViewComponentOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteViewComponentOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9082:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9083:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9083:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9084:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9093:1: rule__AddViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9097:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9098:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9098:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9099:3: RULE_STRING
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
    // InternalAdaptDsl.g:9108:1: rule__AddViewComponentButtonOperation__LangKeyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__LangKeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9112:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9113:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9113:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9114:3: RULE_STRING
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
    // InternalAdaptDsl.g:9123:1: rule__AddViewComponentButtonOperation__ActionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__AddViewComponentButtonOperation__ActionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9127:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9128:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9128:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9129:3: RULE_STRING
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
    // InternalAdaptDsl.g:9138:1: rule__DeleteViewComponentButtonOperation__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DeleteViewComponentButtonOperation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9142:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9143:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9143:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9144:3: RULE_STRING
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
    // InternalAdaptDsl.g:9153:1: rule__NavigationChangeOperation__OperationAssignment_0 : ( ruleAddNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9157:1: ( ( ruleAddNavLinkOperation ) )
            // InternalAdaptDsl.g:9158:2: ( ruleAddNavLinkOperation )
            {
            // InternalAdaptDsl.g:9158:2: ( ruleAddNavLinkOperation )
            // InternalAdaptDsl.g:9159:3: ruleAddNavLinkOperation
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
    // InternalAdaptDsl.g:9168:1: rule__NavigationChangeOperation__OperationAssignment_1 : ( ruleDeleteNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9172:1: ( ( ruleDeleteNavLinkOperation ) )
            // InternalAdaptDsl.g:9173:2: ( ruleDeleteNavLinkOperation )
            {
            // InternalAdaptDsl.g:9173:2: ( ruleDeleteNavLinkOperation )
            // InternalAdaptDsl.g:9174:3: ruleDeleteNavLinkOperation
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
    // InternalAdaptDsl.g:9183:1: rule__NavigationChangeOperation__OperationAssignment_2 : ( ruleRedirectNavLinkOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9187:1: ( ( ruleRedirectNavLinkOperation ) )
            // InternalAdaptDsl.g:9188:2: ( ruleRedirectNavLinkOperation )
            {
            // InternalAdaptDsl.g:9188:2: ( ruleRedirectNavLinkOperation )
            // InternalAdaptDsl.g:9189:3: ruleRedirectNavLinkOperation
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
    // InternalAdaptDsl.g:9198:1: rule__NavigationChangeOperation__OperationAssignment_3 : ( ruleClearNavOperation ) ;
    public final void rule__NavigationChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9202:1: ( ( ruleClearNavOperation ) )
            // InternalAdaptDsl.g:9203:2: ( ruleClearNavOperation )
            {
            // InternalAdaptDsl.g:9203:2: ( ruleClearNavOperation )
            // InternalAdaptDsl.g:9204:3: ruleClearNavOperation
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
    // InternalAdaptDsl.g:9213:1: rule__AddNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__AddNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9217:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9218:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9218:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9219:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9228:1: rule__AddNavLinkOperation__TextAssignment_4 : ( ruleText ) ;
    public final void rule__AddNavLinkOperation__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9232:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9233:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9233:2: ( ruleText )
            // InternalAdaptDsl.g:9234:3: ruleText
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
    // InternalAdaptDsl.g:9243:1: rule__DeleteNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__DeleteNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9247:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9248:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9248:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9249:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9258:1: rule__RedirectNavLinkOperation__ViewCompAssignment_2 : ( ruleViewComponent ) ;
    public final void rule__RedirectNavLinkOperation__ViewCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9262:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:9263:2: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:9263:2: ( ruleViewComponent )
            // InternalAdaptDsl.g:9264:3: ruleViewComponent
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
    // InternalAdaptDsl.g:9273:1: rule__LayoutChangeOperation__OperationAssignment_0 : ( ruleChangeFontOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9277:1: ( ( ruleChangeFontOperation ) )
            // InternalAdaptDsl.g:9278:2: ( ruleChangeFontOperation )
            {
            // InternalAdaptDsl.g:9278:2: ( ruleChangeFontOperation )
            // InternalAdaptDsl.g:9279:3: ruleChangeFontOperation
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
    // InternalAdaptDsl.g:9288:1: rule__LayoutChangeOperation__OperationAssignment_1 : ( ruleChangeFontSizeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9292:1: ( ( ruleChangeFontSizeOperation ) )
            // InternalAdaptDsl.g:9293:2: ( ruleChangeFontSizeOperation )
            {
            // InternalAdaptDsl.g:9293:2: ( ruleChangeFontSizeOperation )
            // InternalAdaptDsl.g:9294:3: ruleChangeFontSizeOperation
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
    // InternalAdaptDsl.g:9303:1: rule__LayoutChangeOperation__OperationAssignment_2 : ( ruleChangeTableCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9307:1: ( ( ruleChangeTableCssClassOperation ) )
            // InternalAdaptDsl.g:9308:2: ( ruleChangeTableCssClassOperation )
            {
            // InternalAdaptDsl.g:9308:2: ( ruleChangeTableCssClassOperation )
            // InternalAdaptDsl.g:9309:3: ruleChangeTableCssClassOperation
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
    // InternalAdaptDsl.g:9318:1: rule__LayoutChangeOperation__OperationAssignment_3 : ( ruleAdaptCssClassOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9322:1: ( ( ruleAdaptCssClassOperation ) )
            // InternalAdaptDsl.g:9323:2: ( ruleAdaptCssClassOperation )
            {
            // InternalAdaptDsl.g:9323:2: ( ruleAdaptCssClassOperation )
            // InternalAdaptDsl.g:9324:3: ruleAdaptCssClassOperation
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
    // InternalAdaptDsl.g:9333:1: rule__LayoutChangeOperation__OperationAssignment_4 : ( ruleChangeColorSchemeOperation ) ;
    public final void rule__LayoutChangeOperation__OperationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9337:1: ( ( ruleChangeColorSchemeOperation ) )
            // InternalAdaptDsl.g:9338:2: ( ruleChangeColorSchemeOperation )
            {
            // InternalAdaptDsl.g:9338:2: ( ruleChangeColorSchemeOperation )
            // InternalAdaptDsl.g:9339:3: ruleChangeColorSchemeOperation
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
    // InternalAdaptDsl.g:9348:1: rule__ChangeFontSizeOperation__SizePrimaryAssignment_2 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizePrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9352:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:9353:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:9353:2: ( ruleFontSize )
            // InternalAdaptDsl.g:9354:3: ruleFontSize
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
    // InternalAdaptDsl.g:9363:1: rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4 : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__SizeSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9367:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:9368:2: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:9368:2: ( ruleFontSize )
            // InternalAdaptDsl.g:9369:3: ruleFontSize
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
    // InternalAdaptDsl.g:9378:1: rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorPrimaryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9382:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:9383:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:9383:2: ( ruleColor )
            // InternalAdaptDsl.g:9384:3: ruleColor
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
    // InternalAdaptDsl.g:9393:1: rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4 : ( ruleColor ) ;
    public final void rule__ChangeColorSchemeOperation__ColorSecondaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9397:1: ( ( ruleColor ) )
            // InternalAdaptDsl.g:9398:2: ( ruleColor )
            {
            // InternalAdaptDsl.g:9398:2: ( ruleColor )
            // InternalAdaptDsl.g:9399:3: ruleColor
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
    // InternalAdaptDsl.g:9408:1: rule__ChangeFontOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeFontOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9412:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9413:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9413:2: ( ruleText )
            // InternalAdaptDsl.g:9414:3: ruleText
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
    // InternalAdaptDsl.g:9423:1: rule__ChangeTableCssClassOperation__TextAssignment_2 : ( ruleText ) ;
    public final void rule__ChangeTableCssClassOperation__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9427:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:9428:2: ( ruleText )
            {
            // InternalAdaptDsl.g:9428:2: ( ruleText )
            // InternalAdaptDsl.g:9429:3: ruleText
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
    // InternalAdaptDsl.g:9438:1: rule__AdaptCssClassOperation__CssClassAssignment_2 : ( ruleCssClass ) ;
    public final void rule__AdaptCssClassOperation__CssClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9442:1: ( ( ruleCssClass ) )
            // InternalAdaptDsl.g:9443:2: ( ruleCssClass )
            {
            // InternalAdaptDsl.g:9443:2: ( ruleCssClass )
            // InternalAdaptDsl.g:9444:3: ruleCssClass
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
    // InternalAdaptDsl.g:9453:1: rule__AdaptCssClassOperation__CssAttributeAssignment_4 : ( ruleAttribute ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9457:1: ( ( ruleAttribute ) )
            // InternalAdaptDsl.g:9458:2: ( ruleAttribute )
            {
            // InternalAdaptDsl.g:9458:2: ( ruleAttribute )
            // InternalAdaptDsl.g:9459:3: ruleAttribute
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
    // InternalAdaptDsl.g:9468:1: rule__AdaptCssClassOperation__CssAttributeValueAssignment_6 : ( ruleAttributeValue ) ;
    public final void rule__AdaptCssClassOperation__CssAttributeValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9472:1: ( ( ruleAttributeValue ) )
            // InternalAdaptDsl.g:9473:2: ( ruleAttributeValue )
            {
            // InternalAdaptDsl.g:9473:2: ( ruleAttributeValue )
            // InternalAdaptDsl.g:9474:3: ruleAttributeValue
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
    // InternalAdaptDsl.g:9483:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9487:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9488:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9488:2: ( RULE_ID )
            // InternalAdaptDsl.g:9489:3: RULE_ID
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
    // InternalAdaptDsl.g:9498:1: rule__Entity__PropertyAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9502:1: ( ( ruleProperty ) )
            // InternalAdaptDsl.g:9503:2: ( ruleProperty )
            {
            // InternalAdaptDsl.g:9503:2: ( ruleProperty )
            // InternalAdaptDsl.g:9504:3: ruleProperty
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


    // $ANTLR start "rule__Property__PropertyNameAssignment_0"
    // InternalAdaptDsl.g:9513:1: rule__Property__PropertyNameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Property__PropertyNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9517:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9518:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9518:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9519:3: RULE_STRING
            {
             before(grammarAccess.getPropertyAccess().getPropertyNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getPropertyNameSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__PropertyNameAssignment_0"


    // $ANTLR start "rule__Property__TypeAssignment_2"
    // InternalAdaptDsl.g:9528:1: rule__Property__TypeAssignment_2 : ( ruleTYPE ) ;
    public final void rule__Property__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9532:1: ( ( ruleTYPE ) )
            // InternalAdaptDsl.g:9533:2: ( ruleTYPE )
            {
            // InternalAdaptDsl.g:9533:2: ( ruleTYPE )
            // InternalAdaptDsl.g:9534:3: ruleTYPE
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


    // $ANTLR start "rule__Property__ProviderAssignment_4"
    // InternalAdaptDsl.g:9543:1: rule__Property__ProviderAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ProviderAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9547:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptDsl.g:9548:2: ( ( RULE_ID ) )
            {
            // InternalAdaptDsl.g:9548:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9549:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderCrossReference_4_0()); 
            // InternalAdaptDsl.g:9550:3: ( RULE_ID )
            // InternalAdaptDsl.g:9551:4: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getProviderProviderIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getProviderProviderIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getProviderProviderCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ProviderAssignment_4"


    // $ANTLR start "rule__Provider__NameAssignment"
    // InternalAdaptDsl.g:9562:1: rule__Provider__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Provider__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9566:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9567:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9567:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9568:3: RULE_STRING
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
    // InternalAdaptDsl.g:9577:1: rule__DefTypes__ThisAssignment_0 : ( ruleDefType ) ;
    public final void rule__DefTypes__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9581:1: ( ( ruleDefType ) )
            // InternalAdaptDsl.g:9582:2: ( ruleDefType )
            {
            // InternalAdaptDsl.g:9582:2: ( ruleDefType )
            // InternalAdaptDsl.g:9583:3: ruleDefType
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
    // InternalAdaptDsl.g:9592:1: rule__DefTypes__NextAssignment_1 : ( ruleDefTypes ) ;
    public final void rule__DefTypes__NextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9596:1: ( ( ruleDefTypes ) )
            // InternalAdaptDsl.g:9597:2: ( ruleDefTypes )
            {
            // InternalAdaptDsl.g:9597:2: ( ruleDefTypes )
            // InternalAdaptDsl.g:9598:3: ruleDefTypes
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
    // InternalAdaptDsl.g:9607:1: rule__DefType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9611:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9612:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:9612:2: ( RULE_ID )
            // InternalAdaptDsl.g:9613:3: RULE_ID
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
    // InternalAdaptDsl.g:9622:1: rule__DefType__EnumsAssignment_2 : ( ruleEnums ) ;
    public final void rule__DefType__EnumsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9626:1: ( ( ruleEnums ) )
            // InternalAdaptDsl.g:9627:2: ( ruleEnums )
            {
            // InternalAdaptDsl.g:9627:2: ( ruleEnums )
            // InternalAdaptDsl.g:9628:3: ruleEnums
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
    // InternalAdaptDsl.g:9637:1: rule__Enums__ThisAssignment_0 : ( ruleEnum ) ;
    public final void rule__Enums__ThisAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9641:1: ( ( ruleEnum ) )
            // InternalAdaptDsl.g:9642:2: ( ruleEnum )
            {
            // InternalAdaptDsl.g:9642:2: ( ruleEnum )
            // InternalAdaptDsl.g:9643:3: ruleEnum
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
    // InternalAdaptDsl.g:9652:1: rule__Enums__NextAssignment_1_1 : ( ruleEnums ) ;
    public final void rule__Enums__NextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9656:1: ( ( ruleEnums ) )
            // InternalAdaptDsl.g:9657:2: ( ruleEnums )
            {
            // InternalAdaptDsl.g:9657:2: ( ruleEnums )
            // InternalAdaptDsl.g:9658:3: ruleEnums
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
    // InternalAdaptDsl.g:9667:1: rule__Enum__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Enum__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9671:1: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:9672:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:9672:2: ( RULE_STRING )
            // InternalAdaptDsl.g:9673:3: RULE_STRING
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
    // InternalAdaptDsl.g:9682:1: rule__TYPE__StringAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__TYPE__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9686:1: ( ( ( 'string' ) ) )
            // InternalAdaptDsl.g:9687:2: ( ( 'string' ) )
            {
            // InternalAdaptDsl.g:9687:2: ( ( 'string' ) )
            // InternalAdaptDsl.g:9688:3: ( 'string' )
            {
             before(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 
            // InternalAdaptDsl.g:9689:3: ( 'string' )
            // InternalAdaptDsl.g:9690:4: 'string'
            {
             before(grammarAccess.getTYPEAccess().getStringStringKeyword_0_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalAdaptDsl.g:9701:1: rule__TYPE__NumberAssignment_1 : ( ( 'number' ) ) ;
    public final void rule__TYPE__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9705:1: ( ( ( 'number' ) ) )
            // InternalAdaptDsl.g:9706:2: ( ( 'number' ) )
            {
            // InternalAdaptDsl.g:9706:2: ( ( 'number' ) )
            // InternalAdaptDsl.g:9707:3: ( 'number' )
            {
             before(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 
            // InternalAdaptDsl.g:9708:3: ( 'number' )
            // InternalAdaptDsl.g:9709:4: 'number'
            {
             before(grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalAdaptDsl.g:9720:1: rule__TYPE__BoolAssignment_2 : ( ( 'bool' ) ) ;
    public final void rule__TYPE__BoolAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9724:1: ( ( ( 'bool' ) ) )
            // InternalAdaptDsl.g:9725:2: ( ( 'bool' ) )
            {
            // InternalAdaptDsl.g:9725:2: ( ( 'bool' ) )
            // InternalAdaptDsl.g:9726:3: ( 'bool' )
            {
             before(grammarAccess.getTYPEAccess().getBoolBoolKeyword_2_0()); 
            // InternalAdaptDsl.g:9727:3: ( 'bool' )
            // InternalAdaptDsl.g:9728:4: 'bool'
            {
             before(grammarAccess.getTYPEAccess().getBoolBoolKeyword_2_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalAdaptDsl.g:9739:1: rule__TYPE__DeftypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TYPE__DeftypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:9743:1: ( ( ( RULE_ID ) ) )
            // InternalAdaptDsl.g:9744:2: ( ( RULE_ID ) )
            {
            // InternalAdaptDsl.g:9744:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:9745:3: ( RULE_ID )
            {
             before(grammarAccess.getTYPEAccess().getDeftypeDefTypeCrossReference_3_0()); 
            // InternalAdaptDsl.g:9746:3: ( RULE_ID )
            // InternalAdaptDsl.g:9747:4: RULE_ID
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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\2\7\6\uffff\1\7\1\uffff\1\7";
    static final String dfa_3s = "\1\4\2\14\1\4\3\5\2\uffff\1\14\1\uffff\1\14";
    static final String dfa_4s = "\1\4\2\52\1\4\2\7\1\6\2\uffff\1\52\1\uffff\1\52";
    static final String dfa_5s = "\7\uffff\1\3\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\2\10\1\4\1\5\2\10\1\6\21\uffff\1\7\2\uffff\2\7\1\2\1\3",
            "\2\10\1\4\1\5\2\10\1\6\21\uffff\1\7\2\uffff\2\7\1\uffff\1\3",
            "\1\11",
            "\1\12\1\10\1\7",
            "\1\12\1\10\1\7",
            "\1\12\1\10",
            "",
            "",
            "\2\10\1\4\1\5\2\10\1\6\21\uffff\1\7\2\uffff\2\7\1\13\1\3",
            "",
            "\2\10\1\4\1\5\2\10\1\6\21\uffff\1\7\2\uffff\2\7\1\uffff\1\3"
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
            return "1602:1: rule__ConditionalPrimary__Alternatives : ( ( ( rule__ConditionalPrimary__CondAssignment_0 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_1 ) ) | ( ( rule__ConditionalPrimary__CondAssignment_2 ) ) );";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\2\4\3\uffff\2\4";
    static final String dfa_10s = "\1\4\2\16\1\4\2\uffff\2\16";
    static final String dfa_11s = "\1\4\2\52\1\4\2\uffff\2\52";
    static final String dfa_12s = "\4\uffff\1\2\1\1\2\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\2\5\24\uffff\1\4\2\uffff\2\4\1\2\1\3",
            "\2\5\24\uffff\1\4\2\uffff\2\4\1\uffff\1\3",
            "\1\6",
            "",
            "",
            "\2\5\24\uffff\1\4\2\uffff\2\4\1\7\1\3",
            "\2\5\24\uffff\1\4\2\uffff\2\4\1\uffff\1\3"
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
            return "1629:1: rule__BooleanCondition__Alternatives : ( ( ( rule__BooleanCondition__Group_0__0 ) ) | ( ( rule__BooleanCondition__FactAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
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
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0FFFE80000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000007F000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000101000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0xC000000000000010L,0x0000000000000001L});

}