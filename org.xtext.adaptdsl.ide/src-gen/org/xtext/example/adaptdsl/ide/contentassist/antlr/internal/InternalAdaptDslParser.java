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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AND'", "'&'", "'OR'", "'|'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'rule'", "'{'", "'IF'", "'('", "')'", "'THEN'", "';'", "'}'", "'addViewComponent'", "','", "'deleteViewComponent'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'changeFontSize'", "'changeFont'", "'changeTableCss'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalAdaptDsl.g:62:1: ruleModel : ( ( ( rule__Model__AdaptationRulesAssignment ) ) ( ( rule__Model__AdaptationRulesAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:66:2: ( ( ( ( rule__Model__AdaptationRulesAssignment ) ) ( ( rule__Model__AdaptationRulesAssignment )* ) ) )
            // InternalAdaptDsl.g:67:2: ( ( ( rule__Model__AdaptationRulesAssignment ) ) ( ( rule__Model__AdaptationRulesAssignment )* ) )
            {
            // InternalAdaptDsl.g:67:2: ( ( ( rule__Model__AdaptationRulesAssignment ) ) ( ( rule__Model__AdaptationRulesAssignment )* ) )
            // InternalAdaptDsl.g:68:3: ( ( rule__Model__AdaptationRulesAssignment ) ) ( ( rule__Model__AdaptationRulesAssignment )* )
            {
            // InternalAdaptDsl.g:68:3: ( ( rule__Model__AdaptationRulesAssignment ) )
            // InternalAdaptDsl.g:69:4: ( rule__Model__AdaptationRulesAssignment )
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAssignment()); 
            // InternalAdaptDsl.g:70:4: ( rule__Model__AdaptationRulesAssignment )
            // InternalAdaptDsl.g:70:5: rule__Model__AdaptationRulesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Model__AdaptationRulesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAdaptationRulesAssignment()); 

            }

            // InternalAdaptDsl.g:73:3: ( ( rule__Model__AdaptationRulesAssignment )* )
            // InternalAdaptDsl.g:74:4: ( rule__Model__AdaptationRulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAssignment()); 
            // InternalAdaptDsl.g:75:4: ( rule__Model__AdaptationRulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAdaptDsl.g:75:5: rule__Model__AdaptationRulesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AdaptationRulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAdaptationRulesAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleadaptionRule"
    // InternalAdaptDsl.g:85:1: entryRuleadaptionRule : ruleadaptionRule EOF ;
    public final void entryRuleadaptionRule() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:86:1: ( ruleadaptionRule EOF )
            // InternalAdaptDsl.g:87:1: ruleadaptionRule EOF
            {
             before(grammarAccess.getAdaptionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleadaptionRule();

            state._fsp--;

             after(grammarAccess.getAdaptionRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleadaptionRule"


    // $ANTLR start "ruleadaptionRule"
    // InternalAdaptDsl.g:94:1: ruleadaptionRule : ( ( rule__AdaptionRule__Group__0 ) ) ;
    public final void ruleadaptionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:98:2: ( ( ( rule__AdaptionRule__Group__0 ) ) )
            // InternalAdaptDsl.g:99:2: ( ( rule__AdaptionRule__Group__0 ) )
            {
            // InternalAdaptDsl.g:99:2: ( ( rule__AdaptionRule__Group__0 ) )
            // InternalAdaptDsl.g:100:3: ( rule__AdaptionRule__Group__0 )
            {
             before(grammarAccess.getAdaptionRuleAccess().getGroup()); 
            // InternalAdaptDsl.g:101:3: ( rule__AdaptionRule__Group__0 )
            // InternalAdaptDsl.g:101:4: rule__AdaptionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdaptionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleadaptionRule"


    // $ANTLR start "entryRuleRuleName"
    // InternalAdaptDsl.g:110:1: entryRuleRuleName : ruleRuleName EOF ;
    public final void entryRuleRuleName() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:111:1: ( ruleRuleName EOF )
            // InternalAdaptDsl.g:112:1: ruleRuleName EOF
            {
             before(grammarAccess.getRuleNameRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleName();

            state._fsp--;

             after(grammarAccess.getRuleNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleName"


    // $ANTLR start "ruleRuleName"
    // InternalAdaptDsl.g:119:1: ruleRuleName : ( ( rule__RuleName__RuleAssignment ) ) ;
    public final void ruleRuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:123:2: ( ( ( rule__RuleName__RuleAssignment ) ) )
            // InternalAdaptDsl.g:124:2: ( ( rule__RuleName__RuleAssignment ) )
            {
            // InternalAdaptDsl.g:124:2: ( ( rule__RuleName__RuleAssignment ) )
            // InternalAdaptDsl.g:125:3: ( rule__RuleName__RuleAssignment )
            {
             before(grammarAccess.getRuleNameAccess().getRuleAssignment()); 
            // InternalAdaptDsl.g:126:3: ( rule__RuleName__RuleAssignment )
            // InternalAdaptDsl.g:126:4: rule__RuleName__RuleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RuleName__RuleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRuleNameAccess().getRuleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleName"


    // $ANTLR start "entryRuleConditions"
    // InternalAdaptDsl.g:135:1: entryRuleConditions : ruleConditions EOF ;
    public final void entryRuleConditions() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:136:1: ( ruleConditions EOF )
            // InternalAdaptDsl.g:137:1: ruleConditions EOF
            {
             before(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            ruleConditions();

            state._fsp--;

             after(grammarAccess.getConditionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalAdaptDsl.g:144:1: ruleConditions : ( ( rule__Conditions__Group__0 ) ) ;
    public final void ruleConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:148:2: ( ( ( rule__Conditions__Group__0 ) ) )
            // InternalAdaptDsl.g:149:2: ( ( rule__Conditions__Group__0 ) )
            {
            // InternalAdaptDsl.g:149:2: ( ( rule__Conditions__Group__0 ) )
            // InternalAdaptDsl.g:150:3: ( rule__Conditions__Group__0 )
            {
             before(grammarAccess.getConditionsAccess().getGroup()); 
            // InternalAdaptDsl.g:151:3: ( rule__Conditions__Group__0 )
            // InternalAdaptDsl.g:151:4: rule__Conditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalAdaptDsl.g:160:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:161:1: ( ruleCondition EOF )
            // InternalAdaptDsl.g:162:1: ruleCondition EOF
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
    // InternalAdaptDsl.g:169:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:173:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalAdaptDsl.g:174:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalAdaptDsl.g:174:2: ( ( rule__Condition__Alternatives ) )
            // InternalAdaptDsl.g:175:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalAdaptDsl.g:176:3: ( rule__Condition__Alternatives )
            // InternalAdaptDsl.g:176:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAndOr"
    // InternalAdaptDsl.g:185:1: entryRuleAndOr : ruleAndOr EOF ;
    public final void entryRuleAndOr() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:186:1: ( ruleAndOr EOF )
            // InternalAdaptDsl.g:187:1: ruleAndOr EOF
            {
             before(grammarAccess.getAndOrRule()); 
            pushFollow(FOLLOW_1);
            ruleAndOr();

            state._fsp--;

             after(grammarAccess.getAndOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndOr"


    // $ANTLR start "ruleAndOr"
    // InternalAdaptDsl.g:194:1: ruleAndOr : ( ( rule__AndOr__Alternatives ) ) ;
    public final void ruleAndOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:198:2: ( ( ( rule__AndOr__Alternatives ) ) )
            // InternalAdaptDsl.g:199:2: ( ( rule__AndOr__Alternatives ) )
            {
            // InternalAdaptDsl.g:199:2: ( ( rule__AndOr__Alternatives ) )
            // InternalAdaptDsl.g:200:3: ( rule__AndOr__Alternatives )
            {
             before(grammarAccess.getAndOrAccess().getAlternatives()); 
            // InternalAdaptDsl.g:201:3: ( rule__AndOr__Alternatives )
            // InternalAdaptDsl.g:201:4: rule__AndOr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AndOr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAndOrAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOr"


    // $ANTLR start "entryRuleFact"
    // InternalAdaptDsl.g:210:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:211:1: ( ruleFact EOF )
            // InternalAdaptDsl.g:212:1: ruleFact EOF
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
    // InternalAdaptDsl.g:219:1: ruleFact : ( RULE_ID ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:223:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:224:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:224:2: ( RULE_ID )
            // InternalAdaptDsl.g:225:3: RULE_ID
            {
             before(grammarAccess.getFactAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getIDTerminalRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOperator"
    // InternalAdaptDsl.g:235:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:236:1: ( ruleOperator EOF )
            // InternalAdaptDsl.g:237:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalAdaptDsl.g:244:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:248:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalAdaptDsl.g:249:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalAdaptDsl.g:249:2: ( ( rule__Operator__Alternatives ) )
            // InternalAdaptDsl.g:250:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalAdaptDsl.g:251:3: ( rule__Operator__Alternatives )
            // InternalAdaptDsl.g:251:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleValue"
    // InternalAdaptDsl.g:260:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:261:1: ( ruleValue EOF )
            // InternalAdaptDsl.g:262:1: ruleValue EOF
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
    // InternalAdaptDsl.g:269:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:273:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAdaptDsl.g:274:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalAdaptDsl.g:274:2: ( ( rule__Value__Alternatives ) )
            // InternalAdaptDsl.g:275:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalAdaptDsl.g:276:3: ( rule__Value__Alternatives )
            // InternalAdaptDsl.g:276:4: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleActions"
    // InternalAdaptDsl.g:285:1: entryRuleActions : ruleActions EOF ;
    public final void entryRuleActions() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:286:1: ( ruleActions EOF )
            // InternalAdaptDsl.g:287:1: ruleActions EOF
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
    // InternalAdaptDsl.g:294:1: ruleActions : ( ( ruleAction )* ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:298:2: ( ( ( ruleAction )* ) )
            // InternalAdaptDsl.g:299:2: ( ( ruleAction )* )
            {
            // InternalAdaptDsl.g:299:2: ( ( ruleAction )* )
            // InternalAdaptDsl.g:300:3: ( ruleAction )*
            {
             before(grammarAccess.getActionsAccess().getActionParserRuleCall()); 
            // InternalAdaptDsl.g:301:3: ( ruleAction )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==29||(LA2_0>=31 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdaptDsl.g:301:4: ruleAction
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleAction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getActionsAccess().getActionParserRuleCall()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:310:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:311:1: ( ruleAction EOF )
            // InternalAdaptDsl.g:312:1: ruleAction EOF
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
    // InternalAdaptDsl.g:319:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:323:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalAdaptDsl.g:324:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalAdaptDsl.g:324:2: ( ( rule__Action__Alternatives ) )
            // InternalAdaptDsl.g:325:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalAdaptDsl.g:326:3: ( rule__Action__Alternatives )
            // InternalAdaptDsl.g:326:4: rule__Action__Alternatives
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


    // $ANTLR start "entryRuleTaskChangeOperation"
    // InternalAdaptDsl.g:335:1: entryRuleTaskChangeOperation : ruleTaskChangeOperation EOF ;
    public final void entryRuleTaskChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:336:1: ( ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:337:1: ruleTaskChangeOperation EOF
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
    // InternalAdaptDsl.g:344:1: ruleTaskChangeOperation : ( ( rule__TaskChangeOperation__Alternatives ) ) ;
    public final void ruleTaskChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:348:2: ( ( ( rule__TaskChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:349:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:349:2: ( ( rule__TaskChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:350:3: ( rule__TaskChangeOperation__Alternatives )
            {
             before(grammarAccess.getTaskChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:351:3: ( rule__TaskChangeOperation__Alternatives )
            // InternalAdaptDsl.g:351:4: rule__TaskChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:360:1: entryRuleAddViewComponentOperation : ruleAddViewComponentOperation EOF ;
    public final void entryRuleAddViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:361:1: ( ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:362:1: ruleAddViewComponentOperation EOF
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
    // InternalAdaptDsl.g:369:1: ruleAddViewComponentOperation : ( ( rule__AddViewComponentOperation__Group__0 ) ) ;
    public final void ruleAddViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:373:2: ( ( ( rule__AddViewComponentOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:374:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:374:2: ( ( rule__AddViewComponentOperation__Group__0 ) )
            // InternalAdaptDsl.g:375:3: ( rule__AddViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:376:3: ( rule__AddViewComponentOperation__Group__0 )
            // InternalAdaptDsl.g:376:4: rule__AddViewComponentOperation__Group__0
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
    // InternalAdaptDsl.g:385:1: entryRuleDeleteViewComponentOperation : ruleDeleteViewComponentOperation EOF ;
    public final void entryRuleDeleteViewComponentOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:386:1: ( ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:387:1: ruleDeleteViewComponentOperation EOF
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
    // InternalAdaptDsl.g:394:1: ruleDeleteViewComponentOperation : ( ( rule__DeleteViewComponentOperation__Group__0 ) ) ;
    public final void ruleDeleteViewComponentOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:398:2: ( ( ( rule__DeleteViewComponentOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:399:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:399:2: ( ( rule__DeleteViewComponentOperation__Group__0 ) )
            // InternalAdaptDsl.g:400:3: ( rule__DeleteViewComponentOperation__Group__0 )
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:401:3: ( rule__DeleteViewComponentOperation__Group__0 )
            // InternalAdaptDsl.g:401:4: rule__DeleteViewComponentOperation__Group__0
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
    // InternalAdaptDsl.g:410:1: entryRuleViewComponent : ruleViewComponent EOF ;
    public final void entryRuleViewComponent() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:411:1: ( ruleViewComponent EOF )
            // InternalAdaptDsl.g:412:1: ruleViewComponent EOF
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
    // InternalAdaptDsl.g:419:1: ruleViewComponent : ( RULE_ID ) ;
    public final void ruleViewComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:423:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:424:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:424:2: ( RULE_ID )
            // InternalAdaptDsl.g:425:3: RULE_ID
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
    // InternalAdaptDsl.g:435:1: entryRuleTargetContainer : ruleTargetContainer EOF ;
    public final void entryRuleTargetContainer() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:436:1: ( ruleTargetContainer EOF )
            // InternalAdaptDsl.g:437:1: ruleTargetContainer EOF
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
    // InternalAdaptDsl.g:444:1: ruleTargetContainer : ( RULE_ID ) ;
    public final void ruleTargetContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:448:2: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:449:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:449:2: ( RULE_ID )
            // InternalAdaptDsl.g:450:3: RULE_ID
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
    // InternalAdaptDsl.g:460:1: entryRuleNavigationChangeOperation : ruleNavigationChangeOperation EOF ;
    public final void entryRuleNavigationChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:461:1: ( ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:462:1: ruleNavigationChangeOperation EOF
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
    // InternalAdaptDsl.g:469:1: ruleNavigationChangeOperation : ( ( rule__NavigationChangeOperation__Alternatives ) ) ;
    public final void ruleNavigationChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:473:2: ( ( ( rule__NavigationChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:474:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:474:2: ( ( rule__NavigationChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:475:3: ( rule__NavigationChangeOperation__Alternatives )
            {
             before(grammarAccess.getNavigationChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:476:3: ( rule__NavigationChangeOperation__Alternatives )
            // InternalAdaptDsl.g:476:4: rule__NavigationChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:485:1: entryRuleAddNavLinkOperation : ruleAddNavLinkOperation EOF ;
    public final void entryRuleAddNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:486:1: ( ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:487:1: ruleAddNavLinkOperation EOF
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
    // InternalAdaptDsl.g:494:1: ruleAddNavLinkOperation : ( ( rule__AddNavLinkOperation__Group__0 ) ) ;
    public final void ruleAddNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:498:2: ( ( ( rule__AddNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:499:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:499:2: ( ( rule__AddNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:500:3: ( rule__AddNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:501:3: ( rule__AddNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:501:4: rule__AddNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:510:1: entryRuleDeleteNavLinkOperation : ruleDeleteNavLinkOperation EOF ;
    public final void entryRuleDeleteNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:511:1: ( ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:512:1: ruleDeleteNavLinkOperation EOF
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
    // InternalAdaptDsl.g:519:1: ruleDeleteNavLinkOperation : ( ( rule__DeleteNavLinkOperation__Group__0 ) ) ;
    public final void ruleDeleteNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:523:2: ( ( ( rule__DeleteNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:524:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:524:2: ( ( rule__DeleteNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:525:3: ( rule__DeleteNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:526:3: ( rule__DeleteNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:526:4: rule__DeleteNavLinkOperation__Group__0
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
    // InternalAdaptDsl.g:535:1: entryRuleRedirectNavLinkOperation : ruleRedirectNavLinkOperation EOF ;
    public final void entryRuleRedirectNavLinkOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:536:1: ( ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:537:1: ruleRedirectNavLinkOperation EOF
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
    // InternalAdaptDsl.g:544:1: ruleRedirectNavLinkOperation : ( ( rule__RedirectNavLinkOperation__Group__0 ) ) ;
    public final void ruleRedirectNavLinkOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:548:2: ( ( ( rule__RedirectNavLinkOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:549:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:549:2: ( ( rule__RedirectNavLinkOperation__Group__0 ) )
            // InternalAdaptDsl.g:550:3: ( rule__RedirectNavLinkOperation__Group__0 )
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:551:3: ( rule__RedirectNavLinkOperation__Group__0 )
            // InternalAdaptDsl.g:551:4: rule__RedirectNavLinkOperation__Group__0
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


    // $ANTLR start "entryRuleText"
    // InternalAdaptDsl.g:560:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:561:1: ( ruleText EOF )
            // InternalAdaptDsl.g:562:1: ruleText EOF
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
    // InternalAdaptDsl.g:569:1: ruleText : ( RULE_STRING ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:573:2: ( ( RULE_STRING ) )
            // InternalAdaptDsl.g:574:2: ( RULE_STRING )
            {
            // InternalAdaptDsl.g:574:2: ( RULE_STRING )
            // InternalAdaptDsl.g:575:3: RULE_STRING
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
    // InternalAdaptDsl.g:585:1: entryRuleLayoutChangeOperation : ruleLayoutChangeOperation EOF ;
    public final void entryRuleLayoutChangeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:586:1: ( ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:587:1: ruleLayoutChangeOperation EOF
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
    // InternalAdaptDsl.g:594:1: ruleLayoutChangeOperation : ( ( rule__LayoutChangeOperation__Alternatives ) ) ;
    public final void ruleLayoutChangeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:598:2: ( ( ( rule__LayoutChangeOperation__Alternatives ) ) )
            // InternalAdaptDsl.g:599:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            {
            // InternalAdaptDsl.g:599:2: ( ( rule__LayoutChangeOperation__Alternatives ) )
            // InternalAdaptDsl.g:600:3: ( rule__LayoutChangeOperation__Alternatives )
            {
             before(grammarAccess.getLayoutChangeOperationAccess().getAlternatives()); 
            // InternalAdaptDsl.g:601:3: ( rule__LayoutChangeOperation__Alternatives )
            // InternalAdaptDsl.g:601:4: rule__LayoutChangeOperation__Alternatives
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
    // InternalAdaptDsl.g:610:1: entryRuleChangeFontSizeOperation : ruleChangeFontSizeOperation EOF ;
    public final void entryRuleChangeFontSizeOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:611:1: ( ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:612:1: ruleChangeFontSizeOperation EOF
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
    // InternalAdaptDsl.g:619:1: ruleChangeFontSizeOperation : ( ( rule__ChangeFontSizeOperation__Group__0 ) ) ;
    public final void ruleChangeFontSizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:623:2: ( ( ( rule__ChangeFontSizeOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:624:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:624:2: ( ( rule__ChangeFontSizeOperation__Group__0 ) )
            // InternalAdaptDsl.g:625:3: ( rule__ChangeFontSizeOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:626:3: ( rule__ChangeFontSizeOperation__Group__0 )
            // InternalAdaptDsl.g:626:4: rule__ChangeFontSizeOperation__Group__0
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


    // $ANTLR start "entryRuleChangeFontOperation"
    // InternalAdaptDsl.g:635:1: entryRuleChangeFontOperation : ruleChangeFontOperation EOF ;
    public final void entryRuleChangeFontOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:636:1: ( ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:637:1: ruleChangeFontOperation EOF
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
    // InternalAdaptDsl.g:644:1: ruleChangeFontOperation : ( ( rule__ChangeFontOperation__Group__0 ) ) ;
    public final void ruleChangeFontOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:648:2: ( ( ( rule__ChangeFontOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:649:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:649:2: ( ( rule__ChangeFontOperation__Group__0 ) )
            // InternalAdaptDsl.g:650:3: ( rule__ChangeFontOperation__Group__0 )
            {
             before(grammarAccess.getChangeFontOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:651:3: ( rule__ChangeFontOperation__Group__0 )
            // InternalAdaptDsl.g:651:4: rule__ChangeFontOperation__Group__0
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
    // InternalAdaptDsl.g:660:1: entryRuleChangeTableCssClassOperation : ruleChangeTableCssClassOperation EOF ;
    public final void entryRuleChangeTableCssClassOperation() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:661:1: ( ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:662:1: ruleChangeTableCssClassOperation EOF
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
    // InternalAdaptDsl.g:669:1: ruleChangeTableCssClassOperation : ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) ;
    public final void ruleChangeTableCssClassOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:673:2: ( ( ( rule__ChangeTableCssClassOperation__Group__0 ) ) )
            // InternalAdaptDsl.g:674:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            {
            // InternalAdaptDsl.g:674:2: ( ( rule__ChangeTableCssClassOperation__Group__0 ) )
            // InternalAdaptDsl.g:675:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getGroup()); 
            // InternalAdaptDsl.g:676:3: ( rule__ChangeTableCssClassOperation__Group__0 )
            // InternalAdaptDsl.g:676:4: rule__ChangeTableCssClassOperation__Group__0
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


    // $ANTLR start "entryRuleFontSize"
    // InternalAdaptDsl.g:685:1: entryRuleFontSize : ruleFontSize EOF ;
    public final void entryRuleFontSize() throws RecognitionException {
        try {
            // InternalAdaptDsl.g:686:1: ( ruleFontSize EOF )
            // InternalAdaptDsl.g:687:1: ruleFontSize EOF
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
    // InternalAdaptDsl.g:694:1: ruleFontSize : ( RULE_INT ) ;
    public final void ruleFontSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:698:2: ( ( RULE_INT ) )
            // InternalAdaptDsl.g:699:2: ( RULE_INT )
            {
            // InternalAdaptDsl.g:699:2: ( RULE_INT )
            // InternalAdaptDsl.g:700:3: RULE_INT
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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalAdaptDsl.g:709:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:713:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==24) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=15 && LA3_1<=20)) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdaptDsl.g:714:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalAdaptDsl.g:714:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalAdaptDsl.g:715:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalAdaptDsl.g:716:3: ( rule__Condition__Group_0__0 )
                    // InternalAdaptDsl.g:716:4: rule__Condition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:720:2: ( ( rule__Condition__Group_1__0 ) )
                    {
                    // InternalAdaptDsl.g:720:2: ( ( rule__Condition__Group_1__0 ) )
                    // InternalAdaptDsl.g:721:3: ( rule__Condition__Group_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_1()); 
                    // InternalAdaptDsl.g:722:3: ( rule__Condition__Group_1__0 )
                    // InternalAdaptDsl.g:722:4: rule__Condition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__AndOr__Alternatives"
    // InternalAdaptDsl.g:730:1: rule__AndOr__Alternatives : ( ( 'AND' ) | ( '&' ) | ( 'OR' ) | ( '|' ) );
    public final void rule__AndOr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:734:1: ( ( 'AND' ) | ( '&' ) | ( 'OR' ) | ( '|' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAdaptDsl.g:735:2: ( 'AND' )
                    {
                    // InternalAdaptDsl.g:735:2: ( 'AND' )
                    // InternalAdaptDsl.g:736:3: 'AND'
                    {
                     before(grammarAccess.getAndOrAccess().getANDKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAndOrAccess().getANDKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:741:2: ( '&' )
                    {
                    // InternalAdaptDsl.g:741:2: ( '&' )
                    // InternalAdaptDsl.g:742:3: '&'
                    {
                     before(grammarAccess.getAndOrAccess().getAmpersandKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAndOrAccess().getAmpersandKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:747:2: ( 'OR' )
                    {
                    // InternalAdaptDsl.g:747:2: ( 'OR' )
                    // InternalAdaptDsl.g:748:3: 'OR'
                    {
                     before(grammarAccess.getAndOrAccess().getORKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAndOrAccess().getORKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:753:2: ( '|' )
                    {
                    // InternalAdaptDsl.g:753:2: ( '|' )
                    // InternalAdaptDsl.g:754:3: '|'
                    {
                     before(grammarAccess.getAndOrAccess().getVerticalLineKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAndOrAccess().getVerticalLineKeyword_3()); 

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
    // $ANTLR end "rule__AndOr__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalAdaptDsl.g:763:1: rule__Operator__Alternatives : ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:767:1: ( ( '>' ) | ( '<' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 19:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAdaptDsl.g:768:2: ( '>' )
                    {
                    // InternalAdaptDsl.g:768:2: ( '>' )
                    // InternalAdaptDsl.g:769:3: '>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:774:2: ( '<' )
                    {
                    // InternalAdaptDsl.g:774:2: ( '<' )
                    // InternalAdaptDsl.g:775:3: '<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:780:2: ( '==' )
                    {
                    // InternalAdaptDsl.g:780:2: ( '==' )
                    // InternalAdaptDsl.g:781:3: '=='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:786:2: ( '!=' )
                    {
                    // InternalAdaptDsl.g:786:2: ( '!=' )
                    // InternalAdaptDsl.g:787:3: '!='
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:792:2: ( '>=' )
                    {
                    // InternalAdaptDsl.g:792:2: ( '>=' )
                    // InternalAdaptDsl.g:793:3: '>='
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:798:2: ( '<=' )
                    {
                    // InternalAdaptDsl.g:798:2: ( '<=' )
                    // InternalAdaptDsl.g:799:3: '<='
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalAdaptDsl.g:808:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:812:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdaptDsl.g:813:2: ( RULE_INT )
                    {
                    // InternalAdaptDsl.g:813:2: ( RULE_INT )
                    // InternalAdaptDsl.g:814:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:819:2: ( RULE_STRING )
                    {
                    // InternalAdaptDsl.g:819:2: ( RULE_STRING )
                    // InternalAdaptDsl.g:820:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__Action__Alternatives"
    // InternalAdaptDsl.g:829:1: rule__Action__Alternatives : ( ( ruleTaskChangeOperation ) | ( ruleNavigationChangeOperation ) | ( ruleLayoutChangeOperation ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:833:1: ( ( ruleTaskChangeOperation ) | ( ruleNavigationChangeOperation ) | ( ruleLayoutChangeOperation ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt7=2;
                }
                break;
            case 35:
            case 36:
            case 37:
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
                    // InternalAdaptDsl.g:834:2: ( ruleTaskChangeOperation )
                    {
                    // InternalAdaptDsl.g:834:2: ( ruleTaskChangeOperation )
                    // InternalAdaptDsl.g:835:3: ruleTaskChangeOperation
                    {
                     before(grammarAccess.getActionAccess().getTaskChangeOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTaskChangeOperation();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTaskChangeOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:840:2: ( ruleNavigationChangeOperation )
                    {
                    // InternalAdaptDsl.g:840:2: ( ruleNavigationChangeOperation )
                    // InternalAdaptDsl.g:841:3: ruleNavigationChangeOperation
                    {
                     before(grammarAccess.getActionAccess().getNavigationChangeOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigationChangeOperation();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getNavigationChangeOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:846:2: ( ruleLayoutChangeOperation )
                    {
                    // InternalAdaptDsl.g:846:2: ( ruleLayoutChangeOperation )
                    // InternalAdaptDsl.g:847:3: ruleLayoutChangeOperation
                    {
                     before(grammarAccess.getActionAccess().getLayoutChangeOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLayoutChangeOperation();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getLayoutChangeOperationParserRuleCall_2()); 

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


    // $ANTLR start "rule__TaskChangeOperation__Alternatives"
    // InternalAdaptDsl.g:856:1: rule__TaskChangeOperation__Alternatives : ( ( ruleAddViewComponentOperation ) | ( ruleDeleteViewComponentOperation ) );
    public final void rule__TaskChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:860:1: ( ( ruleAddViewComponentOperation ) | ( ruleDeleteViewComponentOperation ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdaptDsl.g:861:2: ( ruleAddViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:861:2: ( ruleAddViewComponentOperation )
                    // InternalAdaptDsl.g:862:3: ruleAddViewComponentOperation
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getAddViewComponentOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddViewComponentOperation();

                    state._fsp--;

                     after(grammarAccess.getTaskChangeOperationAccess().getAddViewComponentOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:867:2: ( ruleDeleteViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:867:2: ( ruleDeleteViewComponentOperation )
                    // InternalAdaptDsl.g:868:3: ruleDeleteViewComponentOperation
                    {
                     before(grammarAccess.getTaskChangeOperationAccess().getDeleteViewComponentOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteViewComponentOperation();

                    state._fsp--;

                     after(grammarAccess.getTaskChangeOperationAccess().getDeleteViewComponentOperationParserRuleCall_1()); 

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
    // InternalAdaptDsl.g:877:1: rule__NavigationChangeOperation__Alternatives : ( ( ruleAddNavLinkOperation ) | ( ruleDeleteNavLinkOperation ) | ( ruleRedirectNavLinkOperation ) );
    public final void rule__NavigationChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:881:1: ( ( ruleAddNavLinkOperation ) | ( ruleDeleteNavLinkOperation ) | ( ruleRedirectNavLinkOperation ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:882:2: ( ruleAddNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:882:2: ( ruleAddNavLinkOperation )
                    // InternalAdaptDsl.g:883:3: ruleAddNavLinkOperation
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getAddNavLinkOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddNavLinkOperation();

                    state._fsp--;

                     after(grammarAccess.getNavigationChangeOperationAccess().getAddNavLinkOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:888:2: ( ruleDeleteNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:888:2: ( ruleDeleteNavLinkOperation )
                    // InternalAdaptDsl.g:889:3: ruleDeleteNavLinkOperation
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getDeleteNavLinkOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteNavLinkOperation();

                    state._fsp--;

                     after(grammarAccess.getNavigationChangeOperationAccess().getDeleteNavLinkOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:894:2: ( ruleRedirectNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:894:2: ( ruleRedirectNavLinkOperation )
                    // InternalAdaptDsl.g:895:3: ruleRedirectNavLinkOperation
                    {
                     before(grammarAccess.getNavigationChangeOperationAccess().getRedirectNavLinkOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRedirectNavLinkOperation();

                    state._fsp--;

                     after(grammarAccess.getNavigationChangeOperationAccess().getRedirectNavLinkOperationParserRuleCall_2()); 

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
    // InternalAdaptDsl.g:904:1: rule__LayoutChangeOperation__Alternatives : ( ( ruleChangeFontOperation ) | ( ruleChangeFontSizeOperation ) | ( ruleChangeTableCssClassOperation ) );
    public final void rule__LayoutChangeOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:908:1: ( ( ruleChangeFontOperation ) | ( ruleChangeFontSizeOperation ) | ( ruleChangeTableCssClassOperation ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 35:
                {
                alt10=2;
                }
                break;
            case 37:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalAdaptDsl.g:909:2: ( ruleChangeFontOperation )
                    {
                    // InternalAdaptDsl.g:909:2: ( ruleChangeFontOperation )
                    // InternalAdaptDsl.g:910:3: ruleChangeFontOperation
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getChangeFontOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeFontOperation();

                    state._fsp--;

                     after(grammarAccess.getLayoutChangeOperationAccess().getChangeFontOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:915:2: ( ruleChangeFontSizeOperation )
                    {
                    // InternalAdaptDsl.g:915:2: ( ruleChangeFontSizeOperation )
                    // InternalAdaptDsl.g:916:3: ruleChangeFontSizeOperation
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getChangeFontSizeOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeFontSizeOperation();

                    state._fsp--;

                     after(grammarAccess.getLayoutChangeOperationAccess().getChangeFontSizeOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:921:2: ( ruleChangeTableCssClassOperation )
                    {
                    // InternalAdaptDsl.g:921:2: ( ruleChangeTableCssClassOperation )
                    // InternalAdaptDsl.g:922:3: ruleChangeTableCssClassOperation
                    {
                     before(grammarAccess.getLayoutChangeOperationAccess().getChangeTableCssClassOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleChangeTableCssClassOperation();

                    state._fsp--;

                     after(grammarAccess.getLayoutChangeOperationAccess().getChangeTableCssClassOperationParserRuleCall_2()); 

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


    // $ANTLR start "rule__AdaptionRule__Group__0"
    // InternalAdaptDsl.g:931:1: rule__AdaptionRule__Group__0 : rule__AdaptionRule__Group__0__Impl rule__AdaptionRule__Group__1 ;
    public final void rule__AdaptionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:935:1: ( rule__AdaptionRule__Group__0__Impl rule__AdaptionRule__Group__1 )
            // InternalAdaptDsl.g:936:2: rule__AdaptionRule__Group__0__Impl rule__AdaptionRule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AdaptionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__0"


    // $ANTLR start "rule__AdaptionRule__Group__0__Impl"
    // InternalAdaptDsl.g:943:1: rule__AdaptionRule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__AdaptionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:947:1: ( ( 'rule' ) )
            // InternalAdaptDsl.g:948:1: ( 'rule' )
            {
            // InternalAdaptDsl.g:948:1: ( 'rule' )
            // InternalAdaptDsl.g:949:2: 'rule'
            {
             before(grammarAccess.getAdaptionRuleAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__0__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__1"
    // InternalAdaptDsl.g:958:1: rule__AdaptionRule__Group__1 : rule__AdaptionRule__Group__1__Impl rule__AdaptionRule__Group__2 ;
    public final void rule__AdaptionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:962:1: ( rule__AdaptionRule__Group__1__Impl rule__AdaptionRule__Group__2 )
            // InternalAdaptDsl.g:963:2: rule__AdaptionRule__Group__1__Impl rule__AdaptionRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AdaptionRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__1"


    // $ANTLR start "rule__AdaptionRule__Group__1__Impl"
    // InternalAdaptDsl.g:970:1: rule__AdaptionRule__Group__1__Impl : ( ruleRuleName ) ;
    public final void rule__AdaptionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:974:1: ( ( ruleRuleName ) )
            // InternalAdaptDsl.g:975:1: ( ruleRuleName )
            {
            // InternalAdaptDsl.g:975:1: ( ruleRuleName )
            // InternalAdaptDsl.g:976:2: ruleRuleName
            {
             before(grammarAccess.getAdaptionRuleAccess().getRuleNameParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleRuleName();

            state._fsp--;

             after(grammarAccess.getAdaptionRuleAccess().getRuleNameParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__1__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__2"
    // InternalAdaptDsl.g:985:1: rule__AdaptionRule__Group__2 : rule__AdaptionRule__Group__2__Impl rule__AdaptionRule__Group__3 ;
    public final void rule__AdaptionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:989:1: ( rule__AdaptionRule__Group__2__Impl rule__AdaptionRule__Group__3 )
            // InternalAdaptDsl.g:990:2: rule__AdaptionRule__Group__2__Impl rule__AdaptionRule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__AdaptionRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__2"


    // $ANTLR start "rule__AdaptionRule__Group__2__Impl"
    // InternalAdaptDsl.g:997:1: rule__AdaptionRule__Group__2__Impl : ( '{' ) ;
    public final void rule__AdaptionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1001:1: ( ( '{' ) )
            // InternalAdaptDsl.g:1002:1: ( '{' )
            {
            // InternalAdaptDsl.g:1002:1: ( '{' )
            // InternalAdaptDsl.g:1003:2: '{'
            {
             before(grammarAccess.getAdaptionRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__2__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__3"
    // InternalAdaptDsl.g:1012:1: rule__AdaptionRule__Group__3 : rule__AdaptionRule__Group__3__Impl rule__AdaptionRule__Group__4 ;
    public final void rule__AdaptionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1016:1: ( rule__AdaptionRule__Group__3__Impl rule__AdaptionRule__Group__4 )
            // InternalAdaptDsl.g:1017:2: rule__AdaptionRule__Group__3__Impl rule__AdaptionRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__AdaptionRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__3"


    // $ANTLR start "rule__AdaptionRule__Group__3__Impl"
    // InternalAdaptDsl.g:1024:1: rule__AdaptionRule__Group__3__Impl : ( 'IF' ) ;
    public final void rule__AdaptionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1028:1: ( ( 'IF' ) )
            // InternalAdaptDsl.g:1029:1: ( 'IF' )
            {
            // InternalAdaptDsl.g:1029:1: ( 'IF' )
            // InternalAdaptDsl.g:1030:2: 'IF'
            {
             before(grammarAccess.getAdaptionRuleAccess().getIFKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getIFKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__3__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__4"
    // InternalAdaptDsl.g:1039:1: rule__AdaptionRule__Group__4 : rule__AdaptionRule__Group__4__Impl rule__AdaptionRule__Group__5 ;
    public final void rule__AdaptionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1043:1: ( rule__AdaptionRule__Group__4__Impl rule__AdaptionRule__Group__5 )
            // InternalAdaptDsl.g:1044:2: rule__AdaptionRule__Group__4__Impl rule__AdaptionRule__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__AdaptionRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__4"


    // $ANTLR start "rule__AdaptionRule__Group__4__Impl"
    // InternalAdaptDsl.g:1051:1: rule__AdaptionRule__Group__4__Impl : ( '(' ) ;
    public final void rule__AdaptionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1055:1: ( ( '(' ) )
            // InternalAdaptDsl.g:1056:1: ( '(' )
            {
            // InternalAdaptDsl.g:1056:1: ( '(' )
            // InternalAdaptDsl.g:1057:2: '('
            {
             before(grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__4__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__5"
    // InternalAdaptDsl.g:1066:1: rule__AdaptionRule__Group__5 : rule__AdaptionRule__Group__5__Impl rule__AdaptionRule__Group__6 ;
    public final void rule__AdaptionRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1070:1: ( rule__AdaptionRule__Group__5__Impl rule__AdaptionRule__Group__6 )
            // InternalAdaptDsl.g:1071:2: rule__AdaptionRule__Group__5__Impl rule__AdaptionRule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__AdaptionRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__5"


    // $ANTLR start "rule__AdaptionRule__Group__5__Impl"
    // InternalAdaptDsl.g:1078:1: rule__AdaptionRule__Group__5__Impl : ( ruleConditions ) ;
    public final void rule__AdaptionRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1082:1: ( ( ruleConditions ) )
            // InternalAdaptDsl.g:1083:1: ( ruleConditions )
            {
            // InternalAdaptDsl.g:1083:1: ( ruleConditions )
            // InternalAdaptDsl.g:1084:2: ruleConditions
            {
             before(grammarAccess.getAdaptionRuleAccess().getConditionsParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleConditions();

            state._fsp--;

             after(grammarAccess.getAdaptionRuleAccess().getConditionsParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__5__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__6"
    // InternalAdaptDsl.g:1093:1: rule__AdaptionRule__Group__6 : rule__AdaptionRule__Group__6__Impl rule__AdaptionRule__Group__7 ;
    public final void rule__AdaptionRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1097:1: ( rule__AdaptionRule__Group__6__Impl rule__AdaptionRule__Group__7 )
            // InternalAdaptDsl.g:1098:2: rule__AdaptionRule__Group__6__Impl rule__AdaptionRule__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__AdaptionRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__6"


    // $ANTLR start "rule__AdaptionRule__Group__6__Impl"
    // InternalAdaptDsl.g:1105:1: rule__AdaptionRule__Group__6__Impl : ( ')' ) ;
    public final void rule__AdaptionRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1109:1: ( ( ')' ) )
            // InternalAdaptDsl.g:1110:1: ( ')' )
            {
            // InternalAdaptDsl.g:1110:1: ( ')' )
            // InternalAdaptDsl.g:1111:2: ')'
            {
             before(grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__6__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__7"
    // InternalAdaptDsl.g:1120:1: rule__AdaptionRule__Group__7 : rule__AdaptionRule__Group__7__Impl rule__AdaptionRule__Group__8 ;
    public final void rule__AdaptionRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1124:1: ( rule__AdaptionRule__Group__7__Impl rule__AdaptionRule__Group__8 )
            // InternalAdaptDsl.g:1125:2: rule__AdaptionRule__Group__7__Impl rule__AdaptionRule__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__AdaptionRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__7"


    // $ANTLR start "rule__AdaptionRule__Group__7__Impl"
    // InternalAdaptDsl.g:1132:1: rule__AdaptionRule__Group__7__Impl : ( 'THEN' ) ;
    public final void rule__AdaptionRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1136:1: ( ( 'THEN' ) )
            // InternalAdaptDsl.g:1137:1: ( 'THEN' )
            {
            // InternalAdaptDsl.g:1137:1: ( 'THEN' )
            // InternalAdaptDsl.g:1138:2: 'THEN'
            {
             before(grammarAccess.getAdaptionRuleAccess().getTHENKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getTHENKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__7__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__8"
    // InternalAdaptDsl.g:1147:1: rule__AdaptionRule__Group__8 : rule__AdaptionRule__Group__8__Impl rule__AdaptionRule__Group__9 ;
    public final void rule__AdaptionRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1151:1: ( rule__AdaptionRule__Group__8__Impl rule__AdaptionRule__Group__9 )
            // InternalAdaptDsl.g:1152:2: rule__AdaptionRule__Group__8__Impl rule__AdaptionRule__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__AdaptionRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__8"


    // $ANTLR start "rule__AdaptionRule__Group__8__Impl"
    // InternalAdaptDsl.g:1159:1: rule__AdaptionRule__Group__8__Impl : ( '(' ) ;
    public final void rule__AdaptionRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1163:1: ( ( '(' ) )
            // InternalAdaptDsl.g:1164:1: ( '(' )
            {
            // InternalAdaptDsl.g:1164:1: ( '(' )
            // InternalAdaptDsl.g:1165:2: '('
            {
             before(grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__8__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__9"
    // InternalAdaptDsl.g:1174:1: rule__AdaptionRule__Group__9 : rule__AdaptionRule__Group__9__Impl rule__AdaptionRule__Group__10 ;
    public final void rule__AdaptionRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1178:1: ( rule__AdaptionRule__Group__9__Impl rule__AdaptionRule__Group__10 )
            // InternalAdaptDsl.g:1179:2: rule__AdaptionRule__Group__9__Impl rule__AdaptionRule__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__AdaptionRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__9"


    // $ANTLR start "rule__AdaptionRule__Group__9__Impl"
    // InternalAdaptDsl.g:1186:1: rule__AdaptionRule__Group__9__Impl : ( ruleActions ) ;
    public final void rule__AdaptionRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1190:1: ( ( ruleActions ) )
            // InternalAdaptDsl.g:1191:1: ( ruleActions )
            {
            // InternalAdaptDsl.g:1191:1: ( ruleActions )
            // InternalAdaptDsl.g:1192:2: ruleActions
            {
             before(grammarAccess.getAdaptionRuleAccess().getActionsParserRuleCall_9()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getAdaptionRuleAccess().getActionsParserRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__9__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__10"
    // InternalAdaptDsl.g:1201:1: rule__AdaptionRule__Group__10 : rule__AdaptionRule__Group__10__Impl rule__AdaptionRule__Group__11 ;
    public final void rule__AdaptionRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1205:1: ( rule__AdaptionRule__Group__10__Impl rule__AdaptionRule__Group__11 )
            // InternalAdaptDsl.g:1206:2: rule__AdaptionRule__Group__10__Impl rule__AdaptionRule__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__AdaptionRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__10"


    // $ANTLR start "rule__AdaptionRule__Group__10__Impl"
    // InternalAdaptDsl.g:1213:1: rule__AdaptionRule__Group__10__Impl : ( ')' ) ;
    public final void rule__AdaptionRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1217:1: ( ( ')' ) )
            // InternalAdaptDsl.g:1218:1: ( ')' )
            {
            // InternalAdaptDsl.g:1218:1: ( ')' )
            // InternalAdaptDsl.g:1219:2: ')'
            {
             before(grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__10__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__11"
    // InternalAdaptDsl.g:1228:1: rule__AdaptionRule__Group__11 : rule__AdaptionRule__Group__11__Impl rule__AdaptionRule__Group__12 ;
    public final void rule__AdaptionRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1232:1: ( rule__AdaptionRule__Group__11__Impl rule__AdaptionRule__Group__12 )
            // InternalAdaptDsl.g:1233:2: rule__AdaptionRule__Group__11__Impl rule__AdaptionRule__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__AdaptionRule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__11"


    // $ANTLR start "rule__AdaptionRule__Group__11__Impl"
    // InternalAdaptDsl.g:1240:1: rule__AdaptionRule__Group__11__Impl : ( ';' ) ;
    public final void rule__AdaptionRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1244:1: ( ( ';' ) )
            // InternalAdaptDsl.g:1245:1: ( ';' )
            {
            // InternalAdaptDsl.g:1245:1: ( ';' )
            // InternalAdaptDsl.g:1246:2: ';'
            {
             before(grammarAccess.getAdaptionRuleAccess().getSemicolonKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__11__Impl"


    // $ANTLR start "rule__AdaptionRule__Group__12"
    // InternalAdaptDsl.g:1255:1: rule__AdaptionRule__Group__12 : rule__AdaptionRule__Group__12__Impl ;
    public final void rule__AdaptionRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1259:1: ( rule__AdaptionRule__Group__12__Impl )
            // InternalAdaptDsl.g:1260:2: rule__AdaptionRule__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdaptionRule__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__12"


    // $ANTLR start "rule__AdaptionRule__Group__12__Impl"
    // InternalAdaptDsl.g:1266:1: rule__AdaptionRule__Group__12__Impl : ( '}' ) ;
    public final void rule__AdaptionRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1270:1: ( ( '}' ) )
            // InternalAdaptDsl.g:1271:1: ( '}' )
            {
            // InternalAdaptDsl.g:1271:1: ( '}' )
            // InternalAdaptDsl.g:1272:2: '}'
            {
             before(grammarAccess.getAdaptionRuleAccess().getRightCurlyBracketKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAdaptionRuleAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdaptionRule__Group__12__Impl"


    // $ANTLR start "rule__Conditions__Group__0"
    // InternalAdaptDsl.g:1282:1: rule__Conditions__Group__0 : rule__Conditions__Group__0__Impl rule__Conditions__Group__1 ;
    public final void rule__Conditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1286:1: ( rule__Conditions__Group__0__Impl rule__Conditions__Group__1 )
            // InternalAdaptDsl.g:1287:2: rule__Conditions__Group__0__Impl rule__Conditions__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Conditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__0"


    // $ANTLR start "rule__Conditions__Group__0__Impl"
    // InternalAdaptDsl.g:1294:1: rule__Conditions__Group__0__Impl : ( ruleCondition ) ;
    public final void rule__Conditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1298:1: ( ( ruleCondition ) )
            // InternalAdaptDsl.g:1299:1: ( ruleCondition )
            {
            // InternalAdaptDsl.g:1299:1: ( ruleCondition )
            // InternalAdaptDsl.g:1300:2: ruleCondition
            {
             before(grammarAccess.getConditionsAccess().getConditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionsAccess().getConditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__0__Impl"


    // $ANTLR start "rule__Conditions__Group__1"
    // InternalAdaptDsl.g:1309:1: rule__Conditions__Group__1 : rule__Conditions__Group__1__Impl ;
    public final void rule__Conditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1313:1: ( rule__Conditions__Group__1__Impl )
            // InternalAdaptDsl.g:1314:2: rule__Conditions__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__1"


    // $ANTLR start "rule__Conditions__Group__1__Impl"
    // InternalAdaptDsl.g:1320:1: rule__Conditions__Group__1__Impl : ( ( rule__Conditions__Group_1__0 )* ) ;
    public final void rule__Conditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1324:1: ( ( ( rule__Conditions__Group_1__0 )* ) )
            // InternalAdaptDsl.g:1325:1: ( ( rule__Conditions__Group_1__0 )* )
            {
            // InternalAdaptDsl.g:1325:1: ( ( rule__Conditions__Group_1__0 )* )
            // InternalAdaptDsl.g:1326:2: ( rule__Conditions__Group_1__0 )*
            {
             before(grammarAccess.getConditionsAccess().getGroup_1()); 
            // InternalAdaptDsl.g:1327:2: ( rule__Conditions__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=11 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAdaptDsl.g:1327:3: rule__Conditions__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Conditions__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getConditionsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__1__Impl"


    // $ANTLR start "rule__Conditions__Group_1__0"
    // InternalAdaptDsl.g:1336:1: rule__Conditions__Group_1__0 : rule__Conditions__Group_1__0__Impl rule__Conditions__Group_1__1 ;
    public final void rule__Conditions__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1340:1: ( rule__Conditions__Group_1__0__Impl rule__Conditions__Group_1__1 )
            // InternalAdaptDsl.g:1341:2: rule__Conditions__Group_1__0__Impl rule__Conditions__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Conditions__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group_1__0"


    // $ANTLR start "rule__Conditions__Group_1__0__Impl"
    // InternalAdaptDsl.g:1348:1: rule__Conditions__Group_1__0__Impl : ( ruleAndOr ) ;
    public final void rule__Conditions__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1352:1: ( ( ruleAndOr ) )
            // InternalAdaptDsl.g:1353:1: ( ruleAndOr )
            {
            // InternalAdaptDsl.g:1353:1: ( ruleAndOr )
            // InternalAdaptDsl.g:1354:2: ruleAndOr
            {
             before(grammarAccess.getConditionsAccess().getAndOrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOr();

            state._fsp--;

             after(grammarAccess.getConditionsAccess().getAndOrParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group_1__0__Impl"


    // $ANTLR start "rule__Conditions__Group_1__1"
    // InternalAdaptDsl.g:1363:1: rule__Conditions__Group_1__1 : rule__Conditions__Group_1__1__Impl ;
    public final void rule__Conditions__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1367:1: ( rule__Conditions__Group_1__1__Impl )
            // InternalAdaptDsl.g:1368:2: rule__Conditions__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group_1__1"


    // $ANTLR start "rule__Conditions__Group_1__1__Impl"
    // InternalAdaptDsl.g:1374:1: rule__Conditions__Group_1__1__Impl : ( ruleCondition ) ;
    public final void rule__Conditions__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1378:1: ( ( ruleCondition ) )
            // InternalAdaptDsl.g:1379:1: ( ruleCondition )
            {
            // InternalAdaptDsl.g:1379:1: ( ruleCondition )
            // InternalAdaptDsl.g:1380:2: ruleCondition
            {
             before(grammarAccess.getConditionsAccess().getConditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionsAccess().getConditionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalAdaptDsl.g:1390:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1394:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalAdaptDsl.g:1395:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // InternalAdaptDsl.g:1402:1: rule__Condition__Group_0__0__Impl : ( ruleFact ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1406:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:1407:1: ( ruleFact )
            {
            // InternalAdaptDsl.g:1407:1: ( ruleFact )
            // InternalAdaptDsl.g:1408:2: ruleFact
            {
             before(grammarAccess.getConditionAccess().getFactParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getFactParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // InternalAdaptDsl.g:1417:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1421:1: ( rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 )
            // InternalAdaptDsl.g:1422:2: rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // InternalAdaptDsl.g:1429:1: rule__Condition__Group_0__1__Impl : ( ruleOperator ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1433:1: ( ( ruleOperator ) )
            // InternalAdaptDsl.g:1434:1: ( ruleOperator )
            {
            // InternalAdaptDsl.g:1434:1: ( ruleOperator )
            // InternalAdaptDsl.g:1435:2: ruleOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__2"
    // InternalAdaptDsl.g:1444:1: rule__Condition__Group_0__2 : rule__Condition__Group_0__2__Impl ;
    public final void rule__Condition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1448:1: ( rule__Condition__Group_0__2__Impl )
            // InternalAdaptDsl.g:1449:2: rule__Condition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2"


    // $ANTLR start "rule__Condition__Group_0__2__Impl"
    // InternalAdaptDsl.g:1455:1: rule__Condition__Group_0__2__Impl : ( ruleValue ) ;
    public final void rule__Condition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1459:1: ( ( ruleValue ) )
            // InternalAdaptDsl.g:1460:1: ( ruleValue )
            {
            // InternalAdaptDsl.g:1460:1: ( ruleValue )
            // InternalAdaptDsl.g:1461:2: ruleValue
            {
             before(grammarAccess.getConditionAccess().getValueParserRuleCall_0_2()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValueParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalAdaptDsl.g:1471:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1475:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalAdaptDsl.g:1476:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalAdaptDsl.g:1483:1: rule__Condition__Group_1__0__Impl : ( ruleFact ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1487:1: ( ( ruleFact ) )
            // InternalAdaptDsl.g:1488:1: ( ruleFact )
            {
            // InternalAdaptDsl.g:1488:1: ( ruleFact )
            // InternalAdaptDsl.g:1489:2: ruleFact
            {
             before(grammarAccess.getConditionAccess().getFactParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getFactParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalAdaptDsl.g:1498:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1502:1: ( rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2 )
            // InternalAdaptDsl.g:1503:2: rule__Condition__Group_1__1__Impl rule__Condition__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalAdaptDsl.g:1510:1: rule__Condition__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1514:1: ( ( '(' ) )
            // InternalAdaptDsl.g:1515:1: ( '(' )
            {
            // InternalAdaptDsl.g:1515:1: ( '(' )
            // InternalAdaptDsl.g:1516:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__2"
    // InternalAdaptDsl.g:1525:1: rule__Condition__Group_1__2 : rule__Condition__Group_1__2__Impl ;
    public final void rule__Condition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1529:1: ( rule__Condition__Group_1__2__Impl )
            // InternalAdaptDsl.g:1530:2: rule__Condition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__2"


    // $ANTLR start "rule__Condition__Group_1__2__Impl"
    // InternalAdaptDsl.g:1536:1: rule__Condition__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Condition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1540:1: ( ( ')' ) )
            // InternalAdaptDsl.g:1541:1: ( ')' )
            {
            // InternalAdaptDsl.g:1541:1: ( ')' )
            // InternalAdaptDsl.g:1542:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__2__Impl"


    // $ANTLR start "rule__AddViewComponentOperation__Group__0"
    // InternalAdaptDsl.g:1552:1: rule__AddViewComponentOperation__Group__0 : rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 ;
    public final void rule__AddViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1556:1: ( rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:1557:2: rule__AddViewComponentOperation__Group__0__Impl rule__AddViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:1564:1: rule__AddViewComponentOperation__Group__0__Impl : ( 'addViewComponent' ) ;
    public final void rule__AddViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1568:1: ( ( 'addViewComponent' ) )
            // InternalAdaptDsl.g:1569:1: ( 'addViewComponent' )
            {
            // InternalAdaptDsl.g:1569:1: ( 'addViewComponent' )
            // InternalAdaptDsl.g:1570:2: 'addViewComponent'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1579:1: rule__AddViewComponentOperation__Group__1 : rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 ;
    public final void rule__AddViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1583:1: ( rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:1584:2: rule__AddViewComponentOperation__Group__1__Impl rule__AddViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdaptDsl.g:1591:1: rule__AddViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1595:1: ( ( '(' ) )
            // InternalAdaptDsl.g:1596:1: ( '(' )
            {
            // InternalAdaptDsl.g:1596:1: ( '(' )
            // InternalAdaptDsl.g:1597:2: '('
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1606:1: rule__AddViewComponentOperation__Group__2 : rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 ;
    public final void rule__AddViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1610:1: ( rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:1611:2: rule__AddViewComponentOperation__Group__2__Impl rule__AddViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptDsl.g:1618:1: rule__AddViewComponentOperation__Group__2__Impl : ( ruleViewComponent ) ;
    public final void rule__AddViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1622:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:1623:1: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:1623:1: ( ruleViewComponent )
            // InternalAdaptDsl.g:1624:2: ruleViewComponent
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getViewComponentParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getAddViewComponentOperationAccess().getViewComponentParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:1633:1: rule__AddViewComponentOperation__Group__3 : rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 ;
    public final void rule__AddViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1637:1: ( rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:1638:2: rule__AddViewComponentOperation__Group__3__Impl rule__AddViewComponentOperation__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdaptDsl.g:1645:1: rule__AddViewComponentOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1649:1: ( ( ',' ) )
            // InternalAdaptDsl.g:1650:1: ( ',' )
            {
            // InternalAdaptDsl.g:1650:1: ( ',' )
            // InternalAdaptDsl.g:1651:2: ','
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1660:1: rule__AddViewComponentOperation__Group__4 : rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 ;
    public final void rule__AddViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1664:1: ( rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5 )
            // InternalAdaptDsl.g:1665:2: rule__AddViewComponentOperation__Group__4__Impl rule__AddViewComponentOperation__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:1672:1: rule__AddViewComponentOperation__Group__4__Impl : ( ruleTargetContainer ) ;
    public final void rule__AddViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1676:1: ( ( ruleTargetContainer ) )
            // InternalAdaptDsl.g:1677:1: ( ruleTargetContainer )
            {
            // InternalAdaptDsl.g:1677:1: ( ruleTargetContainer )
            // InternalAdaptDsl.g:1678:2: ruleTargetContainer
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getTargetContainerParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleTargetContainer();

            state._fsp--;

             after(grammarAccess.getAddViewComponentOperationAccess().getTargetContainerParserRuleCall_4()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:1687:1: rule__AddViewComponentOperation__Group__5 : rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 ;
    public final void rule__AddViewComponentOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1691:1: ( rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6 )
            // InternalAdaptDsl.g:1692:2: rule__AddViewComponentOperation__Group__5__Impl rule__AddViewComponentOperation__Group__6
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
    // InternalAdaptDsl.g:1699:1: rule__AddViewComponentOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddViewComponentOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1703:1: ( ( ')' ) )
            // InternalAdaptDsl.g:1704:1: ( ')' )
            {
            // InternalAdaptDsl.g:1704:1: ( ')' )
            // InternalAdaptDsl.g:1705:2: ')'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1714:1: rule__AddViewComponentOperation__Group__6 : rule__AddViewComponentOperation__Group__6__Impl ;
    public final void rule__AddViewComponentOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1718:1: ( rule__AddViewComponentOperation__Group__6__Impl )
            // InternalAdaptDsl.g:1719:2: rule__AddViewComponentOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:1725:1: rule__AddViewComponentOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddViewComponentOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1729:1: ( ( ';' ) )
            // InternalAdaptDsl.g:1730:1: ( ';' )
            {
            // InternalAdaptDsl.g:1730:1: ( ';' )
            // InternalAdaptDsl.g:1731:2: ';'
            {
             before(grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1741:1: rule__DeleteViewComponentOperation__Group__0 : rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 ;
    public final void rule__DeleteViewComponentOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1745:1: ( rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1 )
            // InternalAdaptDsl.g:1746:2: rule__DeleteViewComponentOperation__Group__0__Impl rule__DeleteViewComponentOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:1753:1: rule__DeleteViewComponentOperation__Group__0__Impl : ( 'deleteViewComponent' ) ;
    public final void rule__DeleteViewComponentOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1757:1: ( ( 'deleteViewComponent' ) )
            // InternalAdaptDsl.g:1758:1: ( 'deleteViewComponent' )
            {
            // InternalAdaptDsl.g:1758:1: ( 'deleteViewComponent' )
            // InternalAdaptDsl.g:1759:2: 'deleteViewComponent'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1768:1: rule__DeleteViewComponentOperation__Group__1 : rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 ;
    public final void rule__DeleteViewComponentOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1772:1: ( rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2 )
            // InternalAdaptDsl.g:1773:2: rule__DeleteViewComponentOperation__Group__1__Impl rule__DeleteViewComponentOperation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdaptDsl.g:1780:1: rule__DeleteViewComponentOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteViewComponentOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1784:1: ( ( '(' ) )
            // InternalAdaptDsl.g:1785:1: ( '(' )
            {
            // InternalAdaptDsl.g:1785:1: ( '(' )
            // InternalAdaptDsl.g:1786:2: '('
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1795:1: rule__DeleteViewComponentOperation__Group__2 : rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 ;
    public final void rule__DeleteViewComponentOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1799:1: ( rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3 )
            // InternalAdaptDsl.g:1800:2: rule__DeleteViewComponentOperation__Group__2__Impl rule__DeleteViewComponentOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:1807:1: rule__DeleteViewComponentOperation__Group__2__Impl : ( ruleViewComponent ) ;
    public final void rule__DeleteViewComponentOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1811:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:1812:1: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:1812:1: ( ruleViewComponent )
            // InternalAdaptDsl.g:1813:2: ruleViewComponent
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getViewComponentParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getDeleteViewComponentOperationAccess().getViewComponentParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:1822:1: rule__DeleteViewComponentOperation__Group__3 : rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 ;
    public final void rule__DeleteViewComponentOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1826:1: ( rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4 )
            // InternalAdaptDsl.g:1827:2: rule__DeleteViewComponentOperation__Group__3__Impl rule__DeleteViewComponentOperation__Group__4
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
    // InternalAdaptDsl.g:1834:1: rule__DeleteViewComponentOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteViewComponentOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1838:1: ( ( ')' ) )
            // InternalAdaptDsl.g:1839:1: ( ')' )
            {
            // InternalAdaptDsl.g:1839:1: ( ')' )
            // InternalAdaptDsl.g:1840:2: ')'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1849:1: rule__DeleteViewComponentOperation__Group__4 : rule__DeleteViewComponentOperation__Group__4__Impl ;
    public final void rule__DeleteViewComponentOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1853:1: ( rule__DeleteViewComponentOperation__Group__4__Impl )
            // InternalAdaptDsl.g:1854:2: rule__DeleteViewComponentOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:1860:1: rule__DeleteViewComponentOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteViewComponentOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1864:1: ( ( ';' ) )
            // InternalAdaptDsl.g:1865:1: ( ';' )
            {
            // InternalAdaptDsl.g:1865:1: ( ';' )
            // InternalAdaptDsl.g:1866:2: ';'
            {
             before(grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1876:1: rule__AddNavLinkOperation__Group__0 : rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 ;
    public final void rule__AddNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1880:1: ( rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:1881:2: rule__AddNavLinkOperation__Group__0__Impl rule__AddNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:1888:1: rule__AddNavLinkOperation__Group__0__Impl : ( 'addNavLink' ) ;
    public final void rule__AddNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1892:1: ( ( 'addNavLink' ) )
            // InternalAdaptDsl.g:1893:1: ( 'addNavLink' )
            {
            // InternalAdaptDsl.g:1893:1: ( 'addNavLink' )
            // InternalAdaptDsl.g:1894:2: 'addNavLink'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1903:1: rule__AddNavLinkOperation__Group__1 : rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 ;
    public final void rule__AddNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1907:1: ( rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:1908:2: rule__AddNavLinkOperation__Group__1__Impl rule__AddNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdaptDsl.g:1915:1: rule__AddNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__AddNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1919:1: ( ( '(' ) )
            // InternalAdaptDsl.g:1920:1: ( '(' )
            {
            // InternalAdaptDsl.g:1920:1: ( '(' )
            // InternalAdaptDsl.g:1921:2: '('
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1930:1: rule__AddNavLinkOperation__Group__2 : rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 ;
    public final void rule__AddNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1934:1: ( rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:1935:2: rule__AddNavLinkOperation__Group__2__Impl rule__AddNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalAdaptDsl.g:1942:1: rule__AddNavLinkOperation__Group__2__Impl : ( ruleViewComponent ) ;
    public final void rule__AddNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1946:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:1947:1: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:1947:1: ( ruleViewComponent )
            // InternalAdaptDsl.g:1948:2: ruleViewComponent
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getViewComponentParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getAddNavLinkOperationAccess().getViewComponentParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:1957:1: rule__AddNavLinkOperation__Group__3 : rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 ;
    public final void rule__AddNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1961:1: ( rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:1962:2: rule__AddNavLinkOperation__Group__3__Impl rule__AddNavLinkOperation__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdaptDsl.g:1969:1: rule__AddNavLinkOperation__Group__3__Impl : ( ',' ) ;
    public final void rule__AddNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1973:1: ( ( ',' ) )
            // InternalAdaptDsl.g:1974:1: ( ',' )
            {
            // InternalAdaptDsl.g:1974:1: ( ',' )
            // InternalAdaptDsl.g:1975:2: ','
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAdaptDsl.g:1984:1: rule__AddNavLinkOperation__Group__4 : rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 ;
    public final void rule__AddNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:1988:1: ( rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5 )
            // InternalAdaptDsl.g:1989:2: rule__AddNavLinkOperation__Group__4__Impl rule__AddNavLinkOperation__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:1996:1: rule__AddNavLinkOperation__Group__4__Impl : ( ruleText ) ;
    public final void rule__AddNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2000:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:2001:1: ( ruleText )
            {
            // InternalAdaptDsl.g:2001:1: ( ruleText )
            // InternalAdaptDsl.g:2002:2: ruleText
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getTextParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getAddNavLinkOperationAccess().getTextParserRuleCall_4()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2011:1: rule__AddNavLinkOperation__Group__5 : rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 ;
    public final void rule__AddNavLinkOperation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2015:1: ( rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6 )
            // InternalAdaptDsl.g:2016:2: rule__AddNavLinkOperation__Group__5__Impl rule__AddNavLinkOperation__Group__6
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
    // InternalAdaptDsl.g:2023:1: rule__AddNavLinkOperation__Group__5__Impl : ( ')' ) ;
    public final void rule__AddNavLinkOperation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2027:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2028:1: ( ')' )
            {
            // InternalAdaptDsl.g:2028:1: ( ')' )
            // InternalAdaptDsl.g:2029:2: ')'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2038:1: rule__AddNavLinkOperation__Group__6 : rule__AddNavLinkOperation__Group__6__Impl ;
    public final void rule__AddNavLinkOperation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2042:1: ( rule__AddNavLinkOperation__Group__6__Impl )
            // InternalAdaptDsl.g:2043:2: rule__AddNavLinkOperation__Group__6__Impl
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
    // InternalAdaptDsl.g:2049:1: rule__AddNavLinkOperation__Group__6__Impl : ( ';' ) ;
    public final void rule__AddNavLinkOperation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2053:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2054:1: ( ';' )
            {
            // InternalAdaptDsl.g:2054:1: ( ';' )
            // InternalAdaptDsl.g:2055:2: ';'
            {
             before(grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2065:1: rule__DeleteNavLinkOperation__Group__0 : rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 ;
    public final void rule__DeleteNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2069:1: ( rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:2070:2: rule__DeleteNavLinkOperation__Group__0__Impl rule__DeleteNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2077:1: rule__DeleteNavLinkOperation__Group__0__Impl : ( 'deleteNavLink' ) ;
    public final void rule__DeleteNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2081:1: ( ( 'deleteNavLink' ) )
            // InternalAdaptDsl.g:2082:1: ( 'deleteNavLink' )
            {
            // InternalAdaptDsl.g:2082:1: ( 'deleteNavLink' )
            // InternalAdaptDsl.g:2083:2: 'deleteNavLink'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2092:1: rule__DeleteNavLinkOperation__Group__1 : rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 ;
    public final void rule__DeleteNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2096:1: ( rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:2097:2: rule__DeleteNavLinkOperation__Group__1__Impl rule__DeleteNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdaptDsl.g:2104:1: rule__DeleteNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__DeleteNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2108:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2109:1: ( '(' )
            {
            // InternalAdaptDsl.g:2109:1: ( '(' )
            // InternalAdaptDsl.g:2110:2: '('
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2119:1: rule__DeleteNavLinkOperation__Group__2 : rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 ;
    public final void rule__DeleteNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2123:1: ( rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:2124:2: rule__DeleteNavLinkOperation__Group__2__Impl rule__DeleteNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2131:1: rule__DeleteNavLinkOperation__Group__2__Impl : ( ruleViewComponent ) ;
    public final void rule__DeleteNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2135:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:2136:1: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:2136:1: ( ruleViewComponent )
            // InternalAdaptDsl.g:2137:2: ruleViewComponent
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getViewComponentParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getDeleteNavLinkOperationAccess().getViewComponentParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2146:1: rule__DeleteNavLinkOperation__Group__3 : rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 ;
    public final void rule__DeleteNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2150:1: ( rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:2151:2: rule__DeleteNavLinkOperation__Group__3__Impl rule__DeleteNavLinkOperation__Group__4
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
    // InternalAdaptDsl.g:2158:1: rule__DeleteNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__DeleteNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2162:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2163:1: ( ')' )
            {
            // InternalAdaptDsl.g:2163:1: ( ')' )
            // InternalAdaptDsl.g:2164:2: ')'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2173:1: rule__DeleteNavLinkOperation__Group__4 : rule__DeleteNavLinkOperation__Group__4__Impl ;
    public final void rule__DeleteNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2177:1: ( rule__DeleteNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:2178:2: rule__DeleteNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:2184:1: rule__DeleteNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2188:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2189:1: ( ';' )
            {
            // InternalAdaptDsl.g:2189:1: ( ';' )
            // InternalAdaptDsl.g:2190:2: ';'
            {
             before(grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2200:1: rule__RedirectNavLinkOperation__Group__0 : rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 ;
    public final void rule__RedirectNavLinkOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2204:1: ( rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1 )
            // InternalAdaptDsl.g:2205:2: rule__RedirectNavLinkOperation__Group__0__Impl rule__RedirectNavLinkOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2212:1: rule__RedirectNavLinkOperation__Group__0__Impl : ( 'redirectNavLink' ) ;
    public final void rule__RedirectNavLinkOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2216:1: ( ( 'redirectNavLink' ) )
            // InternalAdaptDsl.g:2217:1: ( 'redirectNavLink' )
            {
            // InternalAdaptDsl.g:2217:1: ( 'redirectNavLink' )
            // InternalAdaptDsl.g:2218:2: 'redirectNavLink'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2227:1: rule__RedirectNavLinkOperation__Group__1 : rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 ;
    public final void rule__RedirectNavLinkOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2231:1: ( rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2 )
            // InternalAdaptDsl.g:2232:2: rule__RedirectNavLinkOperation__Group__1__Impl rule__RedirectNavLinkOperation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalAdaptDsl.g:2239:1: rule__RedirectNavLinkOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__RedirectNavLinkOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2243:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2244:1: ( '(' )
            {
            // InternalAdaptDsl.g:2244:1: ( '(' )
            // InternalAdaptDsl.g:2245:2: '('
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2254:1: rule__RedirectNavLinkOperation__Group__2 : rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 ;
    public final void rule__RedirectNavLinkOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2258:1: ( rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3 )
            // InternalAdaptDsl.g:2259:2: rule__RedirectNavLinkOperation__Group__2__Impl rule__RedirectNavLinkOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2266:1: rule__RedirectNavLinkOperation__Group__2__Impl : ( ruleViewComponent ) ;
    public final void rule__RedirectNavLinkOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2270:1: ( ( ruleViewComponent ) )
            // InternalAdaptDsl.g:2271:1: ( ruleViewComponent )
            {
            // InternalAdaptDsl.g:2271:1: ( ruleViewComponent )
            // InternalAdaptDsl.g:2272:2: ruleViewComponent
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getViewComponentParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleViewComponent();

            state._fsp--;

             after(grammarAccess.getRedirectNavLinkOperationAccess().getViewComponentParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2281:1: rule__RedirectNavLinkOperation__Group__3 : rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 ;
    public final void rule__RedirectNavLinkOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2285:1: ( rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4 )
            // InternalAdaptDsl.g:2286:2: rule__RedirectNavLinkOperation__Group__3__Impl rule__RedirectNavLinkOperation__Group__4
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
    // InternalAdaptDsl.g:2293:1: rule__RedirectNavLinkOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__RedirectNavLinkOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2297:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2298:1: ( ')' )
            {
            // InternalAdaptDsl.g:2298:1: ( ')' )
            // InternalAdaptDsl.g:2299:2: ')'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2308:1: rule__RedirectNavLinkOperation__Group__4 : rule__RedirectNavLinkOperation__Group__4__Impl ;
    public final void rule__RedirectNavLinkOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2312:1: ( rule__RedirectNavLinkOperation__Group__4__Impl )
            // InternalAdaptDsl.g:2313:2: rule__RedirectNavLinkOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:2319:1: rule__RedirectNavLinkOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__RedirectNavLinkOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2323:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2324:1: ( ';' )
            {
            // InternalAdaptDsl.g:2324:1: ( ';' )
            // InternalAdaptDsl.g:2325:2: ';'
            {
             before(grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
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


    // $ANTLR start "rule__ChangeFontSizeOperation__Group__0"
    // InternalAdaptDsl.g:2335:1: rule__ChangeFontSizeOperation__Group__0 : rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 ;
    public final void rule__ChangeFontSizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2339:1: ( rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1 )
            // InternalAdaptDsl.g:2340:2: rule__ChangeFontSizeOperation__Group__0__Impl rule__ChangeFontSizeOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2347:1: rule__ChangeFontSizeOperation__Group__0__Impl : ( 'changeFontSize' ) ;
    public final void rule__ChangeFontSizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2351:1: ( ( 'changeFontSize' ) )
            // InternalAdaptDsl.g:2352:1: ( 'changeFontSize' )
            {
            // InternalAdaptDsl.g:2352:1: ( 'changeFontSize' )
            // InternalAdaptDsl.g:2353:2: 'changeFontSize'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2362:1: rule__ChangeFontSizeOperation__Group__1 : rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 ;
    public final void rule__ChangeFontSizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2366:1: ( rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2 )
            // InternalAdaptDsl.g:2367:2: rule__ChangeFontSizeOperation__Group__1__Impl rule__ChangeFontSizeOperation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalAdaptDsl.g:2374:1: rule__ChangeFontSizeOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontSizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2378:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2379:1: ( '(' )
            {
            // InternalAdaptDsl.g:2379:1: ( '(' )
            // InternalAdaptDsl.g:2380:2: '('
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2389:1: rule__ChangeFontSizeOperation__Group__2 : rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 ;
    public final void rule__ChangeFontSizeOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2393:1: ( rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3 )
            // InternalAdaptDsl.g:2394:2: rule__ChangeFontSizeOperation__Group__2__Impl rule__ChangeFontSizeOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2401:1: rule__ChangeFontSizeOperation__Group__2__Impl : ( ruleFontSize ) ;
    public final void rule__ChangeFontSizeOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2405:1: ( ( ruleFontSize ) )
            // InternalAdaptDsl.g:2406:1: ( ruleFontSize )
            {
            // InternalAdaptDsl.g:2406:1: ( ruleFontSize )
            // InternalAdaptDsl.g:2407:2: ruleFontSize
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getFontSizeParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleFontSize();

            state._fsp--;

             after(grammarAccess.getChangeFontSizeOperationAccess().getFontSizeParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2416:1: rule__ChangeFontSizeOperation__Group__3 : rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 ;
    public final void rule__ChangeFontSizeOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2420:1: ( rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4 )
            // InternalAdaptDsl.g:2421:2: rule__ChangeFontSizeOperation__Group__3__Impl rule__ChangeFontSizeOperation__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalAdaptDsl.g:2428:1: rule__ChangeFontSizeOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontSizeOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2432:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2433:1: ( ')' )
            {
            // InternalAdaptDsl.g:2433:1: ( ')' )
            // InternalAdaptDsl.g:2434:2: ')'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2443:1: rule__ChangeFontSizeOperation__Group__4 : rule__ChangeFontSizeOperation__Group__4__Impl ;
    public final void rule__ChangeFontSizeOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2447:1: ( rule__ChangeFontSizeOperation__Group__4__Impl )
            // InternalAdaptDsl.g:2448:2: rule__ChangeFontSizeOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeFontSizeOperation__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptDsl.g:2454:1: rule__ChangeFontSizeOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontSizeOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2458:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2459:1: ( ';' )
            {
            // InternalAdaptDsl.g:2459:1: ( ';' )
            // InternalAdaptDsl.g:2460:2: ';'
            {
             before(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ChangeFontOperation__Group__0"
    // InternalAdaptDsl.g:2470:1: rule__ChangeFontOperation__Group__0 : rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 ;
    public final void rule__ChangeFontOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2474:1: ( rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1 )
            // InternalAdaptDsl.g:2475:2: rule__ChangeFontOperation__Group__0__Impl rule__ChangeFontOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2482:1: rule__ChangeFontOperation__Group__0__Impl : ( 'changeFont' ) ;
    public final void rule__ChangeFontOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2486:1: ( ( 'changeFont' ) )
            // InternalAdaptDsl.g:2487:1: ( 'changeFont' )
            {
            // InternalAdaptDsl.g:2487:1: ( 'changeFont' )
            // InternalAdaptDsl.g:2488:2: 'changeFont'
            {
             before(grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2497:1: rule__ChangeFontOperation__Group__1 : rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 ;
    public final void rule__ChangeFontOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2501:1: ( rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2 )
            // InternalAdaptDsl.g:2502:2: rule__ChangeFontOperation__Group__1__Impl rule__ChangeFontOperation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdaptDsl.g:2509:1: rule__ChangeFontOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeFontOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2513:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2514:1: ( '(' )
            {
            // InternalAdaptDsl.g:2514:1: ( '(' )
            // InternalAdaptDsl.g:2515:2: '('
            {
             before(grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2524:1: rule__ChangeFontOperation__Group__2 : rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 ;
    public final void rule__ChangeFontOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2528:1: ( rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3 )
            // InternalAdaptDsl.g:2529:2: rule__ChangeFontOperation__Group__2__Impl rule__ChangeFontOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2536:1: rule__ChangeFontOperation__Group__2__Impl : ( ruleText ) ;
    public final void rule__ChangeFontOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2540:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:2541:1: ( ruleText )
            {
            // InternalAdaptDsl.g:2541:1: ( ruleText )
            // InternalAdaptDsl.g:2542:2: ruleText
            {
             before(grammarAccess.getChangeFontOperationAccess().getTextParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getChangeFontOperationAccess().getTextParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2551:1: rule__ChangeFontOperation__Group__3 : rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 ;
    public final void rule__ChangeFontOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2555:1: ( rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4 )
            // InternalAdaptDsl.g:2556:2: rule__ChangeFontOperation__Group__3__Impl rule__ChangeFontOperation__Group__4
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
    // InternalAdaptDsl.g:2563:1: rule__ChangeFontOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeFontOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2567:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2568:1: ( ')' )
            {
            // InternalAdaptDsl.g:2568:1: ( ')' )
            // InternalAdaptDsl.g:2569:2: ')'
            {
             before(grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2578:1: rule__ChangeFontOperation__Group__4 : rule__ChangeFontOperation__Group__4__Impl ;
    public final void rule__ChangeFontOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2582:1: ( rule__ChangeFontOperation__Group__4__Impl )
            // InternalAdaptDsl.g:2583:2: rule__ChangeFontOperation__Group__4__Impl
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
    // InternalAdaptDsl.g:2589:1: rule__ChangeFontOperation__Group__4__Impl : ( ';' ) ;
    public final void rule__ChangeFontOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2593:1: ( ( ';' ) )
            // InternalAdaptDsl.g:2594:1: ( ';' )
            {
            // InternalAdaptDsl.g:2594:1: ( ';' )
            // InternalAdaptDsl.g:2595:2: ';'
            {
             before(grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2605:1: rule__ChangeTableCssClassOperation__Group__0 : rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 ;
    public final void rule__ChangeTableCssClassOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2609:1: ( rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1 )
            // InternalAdaptDsl.g:2610:2: rule__ChangeTableCssClassOperation__Group__0__Impl rule__ChangeTableCssClassOperation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAdaptDsl.g:2617:1: rule__ChangeTableCssClassOperation__Group__0__Impl : ( 'changeTableCss' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2621:1: ( ( 'changeTableCss' ) )
            // InternalAdaptDsl.g:2622:1: ( 'changeTableCss' )
            {
            // InternalAdaptDsl.g:2622:1: ( 'changeTableCss' )
            // InternalAdaptDsl.g:2623:2: 'changeTableCss'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2632:1: rule__ChangeTableCssClassOperation__Group__1 : rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 ;
    public final void rule__ChangeTableCssClassOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2636:1: ( rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2 )
            // InternalAdaptDsl.g:2637:2: rule__ChangeTableCssClassOperation__Group__1__Impl rule__ChangeTableCssClassOperation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAdaptDsl.g:2644:1: rule__ChangeTableCssClassOperation__Group__1__Impl : ( '(' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2648:1: ( ( '(' ) )
            // InternalAdaptDsl.g:2649:1: ( '(' )
            {
            // InternalAdaptDsl.g:2649:1: ( '(' )
            // InternalAdaptDsl.g:2650:2: '('
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalAdaptDsl.g:2659:1: rule__ChangeTableCssClassOperation__Group__2 : rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 ;
    public final void rule__ChangeTableCssClassOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2663:1: ( rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3 )
            // InternalAdaptDsl.g:2664:2: rule__ChangeTableCssClassOperation__Group__2__Impl rule__ChangeTableCssClassOperation__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalAdaptDsl.g:2671:1: rule__ChangeTableCssClassOperation__Group__2__Impl : ( ruleText ) ;
    public final void rule__ChangeTableCssClassOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2675:1: ( ( ruleText ) )
            // InternalAdaptDsl.g:2676:1: ( ruleText )
            {
            // InternalAdaptDsl.g:2676:1: ( ruleText )
            // InternalAdaptDsl.g:2677:2: ruleText
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getTextParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getChangeTableCssClassOperationAccess().getTextParserRuleCall_2()); 

            }


            }

        }
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
    // InternalAdaptDsl.g:2686:1: rule__ChangeTableCssClassOperation__Group__3 : rule__ChangeTableCssClassOperation__Group__3__Impl ;
    public final void rule__ChangeTableCssClassOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2690:1: ( rule__ChangeTableCssClassOperation__Group__3__Impl )
            // InternalAdaptDsl.g:2691:2: rule__ChangeTableCssClassOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChangeTableCssClassOperation__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalAdaptDsl.g:2697:1: rule__ChangeTableCssClassOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__ChangeTableCssClassOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2701:1: ( ( ')' ) )
            // InternalAdaptDsl.g:2702:1: ( ')' )
            {
            // InternalAdaptDsl.g:2702:1: ( ')' )
            // InternalAdaptDsl.g:2703:2: ')'
            {
             before(grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__AdaptationRulesAssignment"
    // InternalAdaptDsl.g:2713:1: rule__Model__AdaptationRulesAssignment : ( ruleadaptionRule ) ;
    public final void rule__Model__AdaptationRulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2717:1: ( ( ruleadaptionRule ) )
            // InternalAdaptDsl.g:2718:2: ( ruleadaptionRule )
            {
            // InternalAdaptDsl.g:2718:2: ( ruleadaptionRule )
            // InternalAdaptDsl.g:2719:3: ruleadaptionRule
            {
             before(grammarAccess.getModelAccess().getAdaptationRulesAdaptionRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleadaptionRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAdaptationRulesAdaptionRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AdaptationRulesAssignment"


    // $ANTLR start "rule__RuleName__RuleAssignment"
    // InternalAdaptDsl.g:2728:1: rule__RuleName__RuleAssignment : ( RULE_ID ) ;
    public final void rule__RuleName__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAdaptDsl.g:2732:1: ( ( RULE_ID ) )
            // InternalAdaptDsl.g:2733:2: ( RULE_ID )
            {
            // InternalAdaptDsl.g:2733:2: ( RULE_ID )
            // InternalAdaptDsl.g:2734:3: RULE_ID
            {
             before(grammarAccess.getRuleNameAccess().getRuleIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleNameAccess().getRuleIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleName__RuleAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000003FA0000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000003FA0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}