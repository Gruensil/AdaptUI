package org.xtext.example.adaptdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.adaptdsl.services.AdaptDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'{'", "'IF'", "'('", "')'", "'THEN'", "';'", "'}'", "'AND'", "'&'", "'OR'", "'|'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'addViewComponent'", "','", "'deleteViewComponent'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'changeFontSize'", "'changeFont'", "'changeTableCss'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
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

        public InternalAdaptDslParser(TokenStream input, AdaptDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AdaptDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAdaptDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAdaptDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAdaptDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAdaptDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_adaptationRules_0_0= ruleadaptionRule ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_adaptationRules_0_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:77:2: ( ( (lv_adaptationRules_0_0= ruleadaptionRule ) )+ )
            // InternalAdaptDsl.g:78:2: ( (lv_adaptationRules_0_0= ruleadaptionRule ) )+
            {
            // InternalAdaptDsl.g:78:2: ( (lv_adaptationRules_0_0= ruleadaptionRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAdaptDsl.g:79:3: (lv_adaptationRules_0_0= ruleadaptionRule )
            	    {
            	    // InternalAdaptDsl.g:79:3: (lv_adaptationRules_0_0= ruleadaptionRule )
            	    // InternalAdaptDsl.g:80:4: lv_adaptationRules_0_0= ruleadaptionRule
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getAdaptationRulesAdaptionRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_adaptationRules_0_0=ruleadaptionRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"adaptationRules",
            	    					lv_adaptationRules_0_0,
            	    					"org.xtext.example.adaptdsl.AdaptDsl.adaptionRule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleadaptionRule"
    // InternalAdaptDsl.g:100:1: entryRuleadaptionRule returns [EObject current=null] : iv_ruleadaptionRule= ruleadaptionRule EOF ;
    public final EObject entryRuleadaptionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadaptionRule = null;


        try {
            // InternalAdaptDsl.g:100:53: (iv_ruleadaptionRule= ruleadaptionRule EOF )
            // InternalAdaptDsl.g:101:2: iv_ruleadaptionRule= ruleadaptionRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleadaptionRule=ruleadaptionRule();

            state._fsp--;

             current =iv_ruleadaptionRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadaptionRule"


    // $ANTLR start "ruleadaptionRule"
    // InternalAdaptDsl.g:107:1: ruleadaptionRule returns [EObject current=null] : (otherlv_0= 'rule' this_RuleName_1= ruleRuleName otherlv_2= '{' otherlv_3= 'IF' otherlv_4= '(' ruleConditions otherlv_6= ')' otherlv_7= 'THEN' otherlv_8= '(' ruleActions otherlv_10= ')' otherlv_11= ';' otherlv_12= '}' ) ;
    public final EObject ruleadaptionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject this_RuleName_1 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:113:2: ( (otherlv_0= 'rule' this_RuleName_1= ruleRuleName otherlv_2= '{' otherlv_3= 'IF' otherlv_4= '(' ruleConditions otherlv_6= ')' otherlv_7= 'THEN' otherlv_8= '(' ruleActions otherlv_10= ')' otherlv_11= ';' otherlv_12= '}' ) )
            // InternalAdaptDsl.g:114:2: (otherlv_0= 'rule' this_RuleName_1= ruleRuleName otherlv_2= '{' otherlv_3= 'IF' otherlv_4= '(' ruleConditions otherlv_6= ')' otherlv_7= 'THEN' otherlv_8= '(' ruleActions otherlv_10= ')' otherlv_11= ';' otherlv_12= '}' )
            {
            // InternalAdaptDsl.g:114:2: (otherlv_0= 'rule' this_RuleName_1= ruleRuleName otherlv_2= '{' otherlv_3= 'IF' otherlv_4= '(' ruleConditions otherlv_6= ')' otherlv_7= 'THEN' otherlv_8= '(' ruleActions otherlv_10= ')' otherlv_11= ';' otherlv_12= '}' )
            // InternalAdaptDsl.g:115:3: otherlv_0= 'rule' this_RuleName_1= ruleRuleName otherlv_2= '{' otherlv_3= 'IF' otherlv_4= '(' ruleConditions otherlv_6= ')' otherlv_7= 'THEN' otherlv_8= '(' ruleActions otherlv_10= ')' otherlv_11= ';' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptionRuleAccess().getRuleKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAdaptionRuleAccess().getRuleNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_5);
            this_RuleName_1=ruleRuleName();

            state._fsp--;


            			current = this_RuleName_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptionRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptionRuleAccess().getIFKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_4());
            		

            			newCompositeNode(grammarAccess.getAdaptionRuleAccess().getConditionsParserRuleCall_5());
            		
            pushFollow(FOLLOW_8);
            ruleConditions();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_6=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAdaptionRuleAccess().getTHENKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_8());
            		

            			newCompositeNode(grammarAccess.getAdaptionRuleAccess().getActionsParserRuleCall_9());
            		
            pushFollow(FOLLOW_8);
            ruleActions();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_10=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getAdaptionRuleAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAdaptionRuleAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadaptionRule"


    // $ANTLR start "entryRuleRuleName"
    // InternalAdaptDsl.g:181:1: entryRuleRuleName returns [EObject current=null] : iv_ruleRuleName= ruleRuleName EOF ;
    public final EObject entryRuleRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleName = null;


        try {
            // InternalAdaptDsl.g:181:49: (iv_ruleRuleName= ruleRuleName EOF )
            // InternalAdaptDsl.g:182:2: iv_ruleRuleName= ruleRuleName EOF
            {
             newCompositeNode(grammarAccess.getRuleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleName=ruleRuleName();

            state._fsp--;

             current =iv_ruleRuleName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleName"


    // $ANTLR start "ruleRuleName"
    // InternalAdaptDsl.g:188:1: ruleRuleName returns [EObject current=null] : ( (lv_rule_0_0= RULE_ID ) ) ;
    public final EObject ruleRuleName() throws RecognitionException {
        EObject current = null;

        Token lv_rule_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:194:2: ( ( (lv_rule_0_0= RULE_ID ) ) )
            // InternalAdaptDsl.g:195:2: ( (lv_rule_0_0= RULE_ID ) )
            {
            // InternalAdaptDsl.g:195:2: ( (lv_rule_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:196:3: (lv_rule_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:196:3: (lv_rule_0_0= RULE_ID )
            // InternalAdaptDsl.g:197:4: lv_rule_0_0= RULE_ID
            {
            lv_rule_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_rule_0_0, grammarAccess.getRuleNameAccess().getRuleIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRuleNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"rule",
            					lv_rule_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleName"


    // $ANTLR start "entryRuleConditions"
    // InternalAdaptDsl.g:216:1: entryRuleConditions returns [String current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final String entryRuleConditions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditions = null;


        try {
            // InternalAdaptDsl.g:216:50: (iv_ruleConditions= ruleConditions EOF )
            // InternalAdaptDsl.g:217:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalAdaptDsl.g:223:1: ruleConditions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Condition_0= ruleCondition (this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition )* ) ;
    public final AntlrDatatypeRuleToken ruleConditions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Condition_0 = null;

        AntlrDatatypeRuleToken this_AndOr_1 = null;

        AntlrDatatypeRuleToken this_Condition_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:229:2: ( (this_Condition_0= ruleCondition (this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition )* ) )
            // InternalAdaptDsl.g:230:2: (this_Condition_0= ruleCondition (this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition )* )
            {
            // InternalAdaptDsl.g:230:2: (this_Condition_0= ruleCondition (this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition )* )
            // InternalAdaptDsl.g:231:3: this_Condition_0= ruleCondition (this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition )*
            {

            			newCompositeNode(grammarAccess.getConditionsAccess().getConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Condition_0=ruleCondition();

            state._fsp--;


            			current.merge(this_Condition_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalAdaptDsl.g:241:3: (this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdaptDsl.g:242:4: this_AndOr_1= ruleAndOr this_Condition_2= ruleCondition
            	    {

            	    				newCompositeNode(grammarAccess.getConditionsAccess().getAndOrParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_4);
            	    this_AndOr_1=ruleAndOr();

            	    state._fsp--;


            	    				current.merge(this_AndOr_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    				newCompositeNode(grammarAccess.getConditionsAccess().getConditionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_13);
            	    this_Condition_2=ruleCondition();

            	    state._fsp--;


            	    				current.merge(this_Condition_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleCondition"
    // InternalAdaptDsl.g:267:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalAdaptDsl.g:267:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalAdaptDsl.g:268:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAdaptDsl.g:274:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue ) | (this_Fact_3= ruleFact kw= '(' kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Fact_0 = null;

        AntlrDatatypeRuleToken this_Operator_1 = null;

        AntlrDatatypeRuleToken this_Value_2 = null;

        AntlrDatatypeRuleToken this_Fact_3 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:280:2: ( ( (this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue ) | (this_Fact_3= ruleFact kw= '(' kw= ')' ) ) )
            // InternalAdaptDsl.g:281:2: ( (this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue ) | (this_Fact_3= ruleFact kw= '(' kw= ')' ) )
            {
            // InternalAdaptDsl.g:281:2: ( (this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue ) | (this_Fact_3= ruleFact kw= '(' kw= ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==14) ) {
                    alt3=2;
                }
                else if ( ((LA3_1>=23 && LA3_1<=28)) ) {
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
                    // InternalAdaptDsl.g:282:3: (this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue )
                    {
                    // InternalAdaptDsl.g:282:3: (this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue )
                    // InternalAdaptDsl.g:283:4: this_Fact_0= ruleFact this_Operator_1= ruleOperator this_Value_2= ruleValue
                    {

                    				newCompositeNode(grammarAccess.getConditionAccess().getFactParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_14);
                    this_Fact_0=ruleFact();

                    state._fsp--;


                    				current.merge(this_Fact_0);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getConditionAccess().getOperatorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Operator_1=ruleOperator();

                    state._fsp--;


                    				current.merge(this_Operator_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getConditionAccess().getValueParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Value_2=ruleValue();

                    state._fsp--;


                    				current.merge(this_Value_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:315:3: (this_Fact_3= ruleFact kw= '(' kw= ')' )
                    {
                    // InternalAdaptDsl.g:315:3: (this_Fact_3= ruleFact kw= '(' kw= ')' )
                    // InternalAdaptDsl.g:316:4: this_Fact_3= ruleFact kw= '(' kw= ')'
                    {

                    				newCompositeNode(grammarAccess.getConditionAccess().getFactParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Fact_3=ruleFact();

                    state._fsp--;


                    				current.merge(this_Fact_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,14,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1());
                    			
                    kw=(Token)match(input,15,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAndOr"
    // InternalAdaptDsl.g:341:1: entryRuleAndOr returns [String current=null] : iv_ruleAndOr= ruleAndOr EOF ;
    public final String entryRuleAndOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOr = null;


        try {
            // InternalAdaptDsl.g:341:45: (iv_ruleAndOr= ruleAndOr EOF )
            // InternalAdaptDsl.g:342:2: iv_ruleAndOr= ruleAndOr EOF
            {
             newCompositeNode(grammarAccess.getAndOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndOr=ruleAndOr();

            state._fsp--;

             current =iv_ruleAndOr.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndOr"


    // $ANTLR start "ruleAndOr"
    // InternalAdaptDsl.g:348:1: ruleAndOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AND' | kw= '&' | kw= 'OR' | kw= '|' ) ;
    public final AntlrDatatypeRuleToken ruleAndOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:354:2: ( (kw= 'AND' | kw= '&' | kw= 'OR' | kw= '|' ) )
            // InternalAdaptDsl.g:355:2: (kw= 'AND' | kw= '&' | kw= 'OR' | kw= '|' )
            {
            // InternalAdaptDsl.g:355:2: (kw= 'AND' | kw= '&' | kw= 'OR' | kw= '|' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
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
                    // InternalAdaptDsl.g:356:3: kw= 'AND'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOrAccess().getANDKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:362:3: kw= '&'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOrAccess().getAmpersandKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:368:3: kw= 'OR'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOrAccess().getORKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:374:3: kw= '|'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAndOrAccess().getVerticalLineKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOr"


    // $ANTLR start "entryRuleFact"
    // InternalAdaptDsl.g:383:1: entryRuleFact returns [String current=null] : iv_ruleFact= ruleFact EOF ;
    public final String entryRuleFact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFact = null;


        try {
            // InternalAdaptDsl.g:383:44: (iv_ruleFact= ruleFact EOF )
            // InternalAdaptDsl.g:384:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalAdaptDsl.g:390:1: ruleFact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleFact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:396:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:397:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getFactAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleOperator"
    // InternalAdaptDsl.g:407:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalAdaptDsl.g:407:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalAdaptDsl.g:408:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalAdaptDsl.g:414:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:420:2: ( (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' ) )
            // InternalAdaptDsl.g:421:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' )
            {
            // InternalAdaptDsl.g:421:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
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
                    // InternalAdaptDsl.g:422:3: kw= '>'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:428:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:434:3: kw= '=='
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:440:3: kw= '!='
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:446:3: kw= '>='
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:452:3: kw= '<='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleValue"
    // InternalAdaptDsl.g:461:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalAdaptDsl.g:461:45: (iv_ruleValue= ruleValue EOF )
            // InternalAdaptDsl.g:462:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalAdaptDsl.g:468:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:474:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalAdaptDsl.g:475:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalAdaptDsl.g:475:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
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
                    // InternalAdaptDsl.g:476:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:484:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleActions"
    // InternalAdaptDsl.g:495:1: entryRuleActions returns [String current=null] : iv_ruleActions= ruleActions EOF ;
    public final String entryRuleActions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActions = null;


        try {
            // InternalAdaptDsl.g:495:47: (iv_ruleActions= ruleActions EOF )
            // InternalAdaptDsl.g:496:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalAdaptDsl.g:502:1: ruleActions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Action_0= ruleAction )* ;
    public final AntlrDatatypeRuleToken ruleActions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Action_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:508:2: ( (this_Action_0= ruleAction )* )
            // InternalAdaptDsl.g:509:2: (this_Action_0= ruleAction )*
            {
            // InternalAdaptDsl.g:509:2: (this_Action_0= ruleAction )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29||(LA7_0>=31 && LA7_0<=37)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAdaptDsl.g:510:3: this_Action_0= ruleAction
            	    {

            	    			newCompositeNode(grammarAccess.getActionsAccess().getActionParserRuleCall());
            	    		
            	    pushFollow(FOLLOW_16);
            	    this_Action_0=ruleAction();

            	    state._fsp--;


            	    			current.merge(this_Action_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleAction"
    // InternalAdaptDsl.g:524:1: entryRuleAction returns [String current=null] : iv_ruleAction= ruleAction EOF ;
    public final String entryRuleAction() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAction = null;


        try {
            // InternalAdaptDsl.g:524:46: (iv_ruleAction= ruleAction EOF )
            // InternalAdaptDsl.g:525:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAdaptDsl.g:531:1: ruleAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TaskChangeOperation_0= ruleTaskChangeOperation | this_NavigationChangeOperation_1= ruleNavigationChangeOperation | this_LayoutChangeOperation_2= ruleLayoutChangeOperation ) ;
    public final AntlrDatatypeRuleToken ruleAction() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_TaskChangeOperation_0 = null;

        AntlrDatatypeRuleToken this_NavigationChangeOperation_1 = null;

        AntlrDatatypeRuleToken this_LayoutChangeOperation_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:537:2: ( (this_TaskChangeOperation_0= ruleTaskChangeOperation | this_NavigationChangeOperation_1= ruleNavigationChangeOperation | this_LayoutChangeOperation_2= ruleLayoutChangeOperation ) )
            // InternalAdaptDsl.g:538:2: (this_TaskChangeOperation_0= ruleTaskChangeOperation | this_NavigationChangeOperation_1= ruleNavigationChangeOperation | this_LayoutChangeOperation_2= ruleLayoutChangeOperation )
            {
            // InternalAdaptDsl.g:538:2: (this_TaskChangeOperation_0= ruleTaskChangeOperation | this_NavigationChangeOperation_1= ruleNavigationChangeOperation | this_LayoutChangeOperation_2= ruleLayoutChangeOperation )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
            case 31:
                {
                alt8=1;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt8=2;
                }
                break;
            case 35:
            case 36:
            case 37:
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
                    // InternalAdaptDsl.g:539:3: this_TaskChangeOperation_0= ruleTaskChangeOperation
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTaskChangeOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskChangeOperation_0=ruleTaskChangeOperation();

                    state._fsp--;


                    			current.merge(this_TaskChangeOperation_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:550:3: this_NavigationChangeOperation_1= ruleNavigationChangeOperation
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getNavigationChangeOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigationChangeOperation_1=ruleNavigationChangeOperation();

                    state._fsp--;


                    			current.merge(this_NavigationChangeOperation_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:561:3: this_LayoutChangeOperation_2= ruleLayoutChangeOperation
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLayoutChangeOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LayoutChangeOperation_2=ruleLayoutChangeOperation();

                    state._fsp--;


                    			current.merge(this_LayoutChangeOperation_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTaskChangeOperation"
    // InternalAdaptDsl.g:575:1: entryRuleTaskChangeOperation returns [String current=null] : iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF ;
    public final String entryRuleTaskChangeOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTaskChangeOperation = null;


        try {
            // InternalAdaptDsl.g:575:59: (iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:576:2: iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getTaskChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskChangeOperation=ruleTaskChangeOperation();

            state._fsp--;

             current =iv_ruleTaskChangeOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskChangeOperation"


    // $ANTLR start "ruleTaskChangeOperation"
    // InternalAdaptDsl.g:582:1: ruleTaskChangeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AddViewComponentOperation_0= ruleAddViewComponentOperation | this_DeleteViewComponentOperation_1= ruleDeleteViewComponentOperation ) ;
    public final AntlrDatatypeRuleToken ruleTaskChangeOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AddViewComponentOperation_0 = null;

        AntlrDatatypeRuleToken this_DeleteViewComponentOperation_1 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:588:2: ( (this_AddViewComponentOperation_0= ruleAddViewComponentOperation | this_DeleteViewComponentOperation_1= ruleDeleteViewComponentOperation ) )
            // InternalAdaptDsl.g:589:2: (this_AddViewComponentOperation_0= ruleAddViewComponentOperation | this_DeleteViewComponentOperation_1= ruleDeleteViewComponentOperation )
            {
            // InternalAdaptDsl.g:589:2: (this_AddViewComponentOperation_0= ruleAddViewComponentOperation | this_DeleteViewComponentOperation_1= ruleDeleteViewComponentOperation )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:590:3: this_AddViewComponentOperation_0= ruleAddViewComponentOperation
                    {

                    			newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getAddViewComponentOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddViewComponentOperation_0=ruleAddViewComponentOperation();

                    state._fsp--;


                    			current.merge(this_AddViewComponentOperation_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:601:3: this_DeleteViewComponentOperation_1= ruleDeleteViewComponentOperation
                    {

                    			newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getDeleteViewComponentOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteViewComponentOperation_1=ruleDeleteViewComponentOperation();

                    state._fsp--;


                    			current.merge(this_DeleteViewComponentOperation_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskChangeOperation"


    // $ANTLR start "entryRuleAddViewComponentOperation"
    // InternalAdaptDsl.g:615:1: entryRuleAddViewComponentOperation returns [String current=null] : iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF ;
    public final String entryRuleAddViewComponentOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:615:65: (iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:616:2: iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF
            {
             newCompositeNode(grammarAccess.getAddViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddViewComponentOperation=ruleAddViewComponentOperation();

            state._fsp--;

             current =iv_ruleAddViewComponentOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddViewComponentOperation"


    // $ANTLR start "ruleAddViewComponentOperation"
    // InternalAdaptDsl.g:622:1: ruleAddViewComponentOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'addViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_TargetContainer_4= ruleTargetContainer kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAddViewComponentOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ViewComponent_2 = null;

        AntlrDatatypeRuleToken this_TargetContainer_4 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:628:2: ( (kw= 'addViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_TargetContainer_4= ruleTargetContainer kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:629:2: (kw= 'addViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_TargetContainer_4= ruleTargetContainer kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:629:2: (kw= 'addViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_TargetContainer_4= ruleTargetContainer kw= ')' kw= ';' )
            // InternalAdaptDsl.g:630:3: kw= 'addViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_TargetContainer_4= ruleTargetContainer kw= ')' kw= ';'
            {
            kw=(Token)match(input,29,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getViewComponentParserRuleCall_2());
            		
            pushFollow(FOLLOW_17);
            this_ViewComponent_2=ruleViewComponent();

            state._fsp--;


            			current.merge(this_ViewComponent_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,30,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3());
            		

            			newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getTargetContainerParserRuleCall_4());
            		
            pushFollow(FOLLOW_8);
            this_TargetContainer_4=ruleTargetContainer();

            state._fsp--;


            			current.merge(this_TargetContainer_4);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddViewComponentOperation"


    // $ANTLR start "entryRuleDeleteViewComponentOperation"
    // InternalAdaptDsl.g:679:1: entryRuleDeleteViewComponentOperation returns [String current=null] : iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF ;
    public final String entryRuleDeleteViewComponentOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeleteViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:679:68: (iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:680:2: iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteViewComponentOperation=ruleDeleteViewComponentOperation();

            state._fsp--;

             current =iv_ruleDeleteViewComponentOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteViewComponentOperation"


    // $ANTLR start "ruleDeleteViewComponentOperation"
    // InternalAdaptDsl.g:686:1: ruleDeleteViewComponentOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'deleteViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleDeleteViewComponentOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ViewComponent_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:692:2: ( (kw= 'deleteViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:693:2: (kw= 'deleteViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:693:2: (kw= 'deleteViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' )
            // InternalAdaptDsl.g:694:3: kw= 'deleteViewComponent' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';'
            {
            kw=(Token)match(input,31,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDeleteViewComponentOperationAccess().getViewComponentParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_ViewComponent_2=ruleViewComponent();

            state._fsp--;


            			current.merge(this_ViewComponent_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteViewComponentOperation"


    // $ANTLR start "entryRuleViewComponent"
    // InternalAdaptDsl.g:728:1: entryRuleViewComponent returns [String current=null] : iv_ruleViewComponent= ruleViewComponent EOF ;
    public final String entryRuleViewComponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleViewComponent = null;


        try {
            // InternalAdaptDsl.g:728:53: (iv_ruleViewComponent= ruleViewComponent EOF )
            // InternalAdaptDsl.g:729:2: iv_ruleViewComponent= ruleViewComponent EOF
            {
             newCompositeNode(grammarAccess.getViewComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewComponent=ruleViewComponent();

            state._fsp--;

             current =iv_ruleViewComponent.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewComponent"


    // $ANTLR start "ruleViewComponent"
    // InternalAdaptDsl.g:735:1: ruleViewComponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleViewComponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:741:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:742:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getViewComponentAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewComponent"


    // $ANTLR start "entryRuleTargetContainer"
    // InternalAdaptDsl.g:752:1: entryRuleTargetContainer returns [String current=null] : iv_ruleTargetContainer= ruleTargetContainer EOF ;
    public final String entryRuleTargetContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTargetContainer = null;


        try {
            // InternalAdaptDsl.g:752:55: (iv_ruleTargetContainer= ruleTargetContainer EOF )
            // InternalAdaptDsl.g:753:2: iv_ruleTargetContainer= ruleTargetContainer EOF
            {
             newCompositeNode(grammarAccess.getTargetContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetContainer=ruleTargetContainer();

            state._fsp--;

             current =iv_ruleTargetContainer.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetContainer"


    // $ANTLR start "ruleTargetContainer"
    // InternalAdaptDsl.g:759:1: ruleTargetContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTargetContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:765:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:766:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getTargetContainerAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetContainer"


    // $ANTLR start "entryRuleNavigationChangeOperation"
    // InternalAdaptDsl.g:776:1: entryRuleNavigationChangeOperation returns [String current=null] : iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF ;
    public final String entryRuleNavigationChangeOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigationChangeOperation = null;


        try {
            // InternalAdaptDsl.g:776:65: (iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:777:2: iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getNavigationChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationChangeOperation=ruleNavigationChangeOperation();

            state._fsp--;

             current =iv_ruleNavigationChangeOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationChangeOperation"


    // $ANTLR start "ruleNavigationChangeOperation"
    // InternalAdaptDsl.g:783:1: ruleNavigationChangeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AddNavLinkOperation_0= ruleAddNavLinkOperation | this_DeleteNavLinkOperation_1= ruleDeleteNavLinkOperation | this_RedirectNavLinkOperation_2= ruleRedirectNavLinkOperation ) ;
    public final AntlrDatatypeRuleToken ruleNavigationChangeOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_AddNavLinkOperation_0 = null;

        AntlrDatatypeRuleToken this_DeleteNavLinkOperation_1 = null;

        AntlrDatatypeRuleToken this_RedirectNavLinkOperation_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:789:2: ( (this_AddNavLinkOperation_0= ruleAddNavLinkOperation | this_DeleteNavLinkOperation_1= ruleDeleteNavLinkOperation | this_RedirectNavLinkOperation_2= ruleRedirectNavLinkOperation ) )
            // InternalAdaptDsl.g:790:2: (this_AddNavLinkOperation_0= ruleAddNavLinkOperation | this_DeleteNavLinkOperation_1= ruleDeleteNavLinkOperation | this_RedirectNavLinkOperation_2= ruleRedirectNavLinkOperation )
            {
            // InternalAdaptDsl.g:790:2: (this_AddNavLinkOperation_0= ruleAddNavLinkOperation | this_DeleteNavLinkOperation_1= ruleDeleteNavLinkOperation | this_RedirectNavLinkOperation_2= ruleRedirectNavLinkOperation )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
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
                    // InternalAdaptDsl.g:791:3: this_AddNavLinkOperation_0= ruleAddNavLinkOperation
                    {

                    			newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getAddNavLinkOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddNavLinkOperation_0=ruleAddNavLinkOperation();

                    state._fsp--;


                    			current.merge(this_AddNavLinkOperation_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:802:3: this_DeleteNavLinkOperation_1= ruleDeleteNavLinkOperation
                    {

                    			newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getDeleteNavLinkOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteNavLinkOperation_1=ruleDeleteNavLinkOperation();

                    state._fsp--;


                    			current.merge(this_DeleteNavLinkOperation_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:813:3: this_RedirectNavLinkOperation_2= ruleRedirectNavLinkOperation
                    {

                    			newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getRedirectNavLinkOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RedirectNavLinkOperation_2=ruleRedirectNavLinkOperation();

                    state._fsp--;


                    			current.merge(this_RedirectNavLinkOperation_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationChangeOperation"


    // $ANTLR start "entryRuleAddNavLinkOperation"
    // InternalAdaptDsl.g:827:1: entryRuleAddNavLinkOperation returns [String current=null] : iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF ;
    public final String entryRuleAddNavLinkOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:827:59: (iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:828:2: iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getAddNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddNavLinkOperation=ruleAddNavLinkOperation();

            state._fsp--;

             current =iv_ruleAddNavLinkOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddNavLinkOperation"


    // $ANTLR start "ruleAddNavLinkOperation"
    // InternalAdaptDsl.g:834:1: ruleAddNavLinkOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'addNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_Text_4= ruleText kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleAddNavLinkOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ViewComponent_2 = null;

        AntlrDatatypeRuleToken this_Text_4 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:840:2: ( (kw= 'addNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_Text_4= ruleText kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:841:2: (kw= 'addNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_Text_4= ruleText kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:841:2: (kw= 'addNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_Text_4= ruleText kw= ')' kw= ';' )
            // InternalAdaptDsl.g:842:3: kw= 'addNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ',' this_Text_4= ruleText kw= ')' kw= ';'
            {
            kw=(Token)match(input,32,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getViewComponentParserRuleCall_2());
            		
            pushFollow(FOLLOW_17);
            this_ViewComponent_2=ruleViewComponent();

            state._fsp--;


            			current.merge(this_ViewComponent_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,30,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3());
            		

            			newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getTextParserRuleCall_4());
            		
            pushFollow(FOLLOW_8);
            this_Text_4=ruleText();

            state._fsp--;


            			current.merge(this_Text_4);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddNavLinkOperation"


    // $ANTLR start "entryRuleDeleteNavLinkOperation"
    // InternalAdaptDsl.g:891:1: entryRuleDeleteNavLinkOperation returns [String current=null] : iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF ;
    public final String entryRuleDeleteNavLinkOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeleteNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:891:62: (iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:892:2: iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteNavLinkOperation=ruleDeleteNavLinkOperation();

            state._fsp--;

             current =iv_ruleDeleteNavLinkOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteNavLinkOperation"


    // $ANTLR start "ruleDeleteNavLinkOperation"
    // InternalAdaptDsl.g:898:1: ruleDeleteNavLinkOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'deleteNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleDeleteNavLinkOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ViewComponent_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:904:2: ( (kw= 'deleteNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:905:2: (kw= 'deleteNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:905:2: (kw= 'deleteNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' )
            // InternalAdaptDsl.g:906:3: kw= 'deleteNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';'
            {
            kw=(Token)match(input,33,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getDeleteNavLinkOperationAccess().getViewComponentParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_ViewComponent_2=ruleViewComponent();

            state._fsp--;


            			current.merge(this_ViewComponent_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteNavLinkOperation"


    // $ANTLR start "entryRuleRedirectNavLinkOperation"
    // InternalAdaptDsl.g:940:1: entryRuleRedirectNavLinkOperation returns [String current=null] : iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF ;
    public final String entryRuleRedirectNavLinkOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRedirectNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:940:64: (iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:941:2: iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getRedirectNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedirectNavLinkOperation=ruleRedirectNavLinkOperation();

            state._fsp--;

             current =iv_ruleRedirectNavLinkOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRedirectNavLinkOperation"


    // $ANTLR start "ruleRedirectNavLinkOperation"
    // InternalAdaptDsl.g:947:1: ruleRedirectNavLinkOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'redirectNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleRedirectNavLinkOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ViewComponent_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:953:2: ( (kw= 'redirectNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:954:2: (kw= 'redirectNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:954:2: (kw= 'redirectNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';' )
            // InternalAdaptDsl.g:955:3: kw= 'redirectNavLink' kw= '(' this_ViewComponent_2= ruleViewComponent kw= ')' kw= ';'
            {
            kw=(Token)match(input,34,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getRedirectNavLinkOperationAccess().getViewComponentParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_ViewComponent_2=ruleViewComponent();

            state._fsp--;


            			current.merge(this_ViewComponent_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRedirectNavLinkOperation"


    // $ANTLR start "entryRuleText"
    // InternalAdaptDsl.g:989:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalAdaptDsl.g:989:44: (iv_ruleText= ruleText EOF )
            // InternalAdaptDsl.g:990:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalAdaptDsl.g:996:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1002:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:1003:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getTextAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLayoutChangeOperation"
    // InternalAdaptDsl.g:1013:1: entryRuleLayoutChangeOperation returns [String current=null] : iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF ;
    public final String entryRuleLayoutChangeOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLayoutChangeOperation = null;


        try {
            // InternalAdaptDsl.g:1013:61: (iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:1014:2: iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getLayoutChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutChangeOperation=ruleLayoutChangeOperation();

            state._fsp--;

             current =iv_ruleLayoutChangeOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayoutChangeOperation"


    // $ANTLR start "ruleLayoutChangeOperation"
    // InternalAdaptDsl.g:1020:1: ruleLayoutChangeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ChangeFontOperation_0= ruleChangeFontOperation | this_ChangeFontSizeOperation_1= ruleChangeFontSizeOperation | this_ChangeTableCssClassOperation_2= ruleChangeTableCssClassOperation ) ;
    public final AntlrDatatypeRuleToken ruleLayoutChangeOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ChangeFontOperation_0 = null;

        AntlrDatatypeRuleToken this_ChangeFontSizeOperation_1 = null;

        AntlrDatatypeRuleToken this_ChangeTableCssClassOperation_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1026:2: ( (this_ChangeFontOperation_0= ruleChangeFontOperation | this_ChangeFontSizeOperation_1= ruleChangeFontSizeOperation | this_ChangeTableCssClassOperation_2= ruleChangeTableCssClassOperation ) )
            // InternalAdaptDsl.g:1027:2: (this_ChangeFontOperation_0= ruleChangeFontOperation | this_ChangeFontSizeOperation_1= ruleChangeFontSizeOperation | this_ChangeTableCssClassOperation_2= ruleChangeTableCssClassOperation )
            {
            // InternalAdaptDsl.g:1027:2: (this_ChangeFontOperation_0= ruleChangeFontOperation | this_ChangeFontSizeOperation_1= ruleChangeFontSizeOperation | this_ChangeTableCssClassOperation_2= ruleChangeTableCssClassOperation )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt11=1;
                }
                break;
            case 35:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalAdaptDsl.g:1028:3: this_ChangeFontOperation_0= ruleChangeFontOperation
                    {

                    			newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getChangeFontOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeFontOperation_0=ruleChangeFontOperation();

                    state._fsp--;


                    			current.merge(this_ChangeFontOperation_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1039:3: this_ChangeFontSizeOperation_1= ruleChangeFontSizeOperation
                    {

                    			newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getChangeFontSizeOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeFontSizeOperation_1=ruleChangeFontSizeOperation();

                    state._fsp--;


                    			current.merge(this_ChangeFontSizeOperation_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1050:3: this_ChangeTableCssClassOperation_2= ruleChangeTableCssClassOperation
                    {

                    			newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getChangeTableCssClassOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ChangeTableCssClassOperation_2=ruleChangeTableCssClassOperation();

                    state._fsp--;


                    			current.merge(this_ChangeTableCssClassOperation_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutChangeOperation"


    // $ANTLR start "entryRuleChangeFontSizeOperation"
    // InternalAdaptDsl.g:1064:1: entryRuleChangeFontSizeOperation returns [String current=null] : iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF ;
    public final String entryRuleChangeFontSizeOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChangeFontSizeOperation = null;


        try {
            // InternalAdaptDsl.g:1064:63: (iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:1065:2: iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeFontSizeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeFontSizeOperation=ruleChangeFontSizeOperation();

            state._fsp--;

             current =iv_ruleChangeFontSizeOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeFontSizeOperation"


    // $ANTLR start "ruleChangeFontSizeOperation"
    // InternalAdaptDsl.g:1071:1: ruleChangeFontSizeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'changeFontSize' kw= '(' this_FontSize_2= ruleFontSize kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleChangeFontSizeOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FontSize_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1077:2: ( (kw= 'changeFontSize' kw= '(' this_FontSize_2= ruleFontSize kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:1078:2: (kw= 'changeFontSize' kw= '(' this_FontSize_2= ruleFontSize kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:1078:2: (kw= 'changeFontSize' kw= '(' this_FontSize_2= ruleFontSize kw= ')' kw= ';' )
            // InternalAdaptDsl.g:1079:3: kw= 'changeFontSize' kw= '(' this_FontSize_2= ruleFontSize kw= ')' kw= ';'
            {
            kw=(Token)match(input,35,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getFontSizeParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_FontSize_2=ruleFontSize();

            state._fsp--;


            			current.merge(this_FontSize_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeFontSizeOperation"


    // $ANTLR start "entryRuleChangeFontOperation"
    // InternalAdaptDsl.g:1113:1: entryRuleChangeFontOperation returns [String current=null] : iv_ruleChangeFontOperation= ruleChangeFontOperation EOF ;
    public final String entryRuleChangeFontOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChangeFontOperation = null;


        try {
            // InternalAdaptDsl.g:1113:59: (iv_ruleChangeFontOperation= ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:1114:2: iv_ruleChangeFontOperation= ruleChangeFontOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeFontOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeFontOperation=ruleChangeFontOperation();

            state._fsp--;

             current =iv_ruleChangeFontOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeFontOperation"


    // $ANTLR start "ruleChangeFontOperation"
    // InternalAdaptDsl.g:1120:1: ruleChangeFontOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'changeFont' kw= '(' this_Text_2= ruleText kw= ')' kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleChangeFontOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Text_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1126:2: ( (kw= 'changeFont' kw= '(' this_Text_2= ruleText kw= ')' kw= ';' ) )
            // InternalAdaptDsl.g:1127:2: (kw= 'changeFont' kw= '(' this_Text_2= ruleText kw= ')' kw= ';' )
            {
            // InternalAdaptDsl.g:1127:2: (kw= 'changeFont' kw= '(' this_Text_2= ruleText kw= ')' kw= ';' )
            // InternalAdaptDsl.g:1128:3: kw= 'changeFont' kw= '(' this_Text_2= ruleText kw= ')' kw= ';'
            {
            kw=(Token)match(input,36,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getChangeFontOperationAccess().getTextParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_Text_2=ruleText();

            state._fsp--;


            			current.merge(this_Text_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3());
            		
            kw=(Token)match(input,17,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeFontOperation"


    // $ANTLR start "entryRuleChangeTableCssClassOperation"
    // InternalAdaptDsl.g:1162:1: entryRuleChangeTableCssClassOperation returns [String current=null] : iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF ;
    public final String entryRuleChangeTableCssClassOperation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChangeTableCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:1162:68: (iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:1163:2: iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeTableCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeTableCssClassOperation=ruleChangeTableCssClassOperation();

            state._fsp--;

             current =iv_ruleChangeTableCssClassOperation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeTableCssClassOperation"


    // $ANTLR start "ruleChangeTableCssClassOperation"
    // InternalAdaptDsl.g:1169:1: ruleChangeTableCssClassOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'changeTableCss' kw= '(' this_Text_2= ruleText kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleChangeTableCssClassOperation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Text_2 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1175:2: ( (kw= 'changeTableCss' kw= '(' this_Text_2= ruleText kw= ')' ) )
            // InternalAdaptDsl.g:1176:2: (kw= 'changeTableCss' kw= '(' this_Text_2= ruleText kw= ')' )
            {
            // InternalAdaptDsl.g:1176:2: (kw= 'changeTableCss' kw= '(' this_Text_2= ruleText kw= ')' )
            // InternalAdaptDsl.g:1177:3: kw= 'changeTableCss' kw= '(' this_Text_2= ruleText kw= ')'
            {
            kw=(Token)match(input,37,FOLLOW_7); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0());
            		
            kw=(Token)match(input,14,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getChangeTableCssClassOperationAccess().getTextParserRuleCall_2());
            		
            pushFollow(FOLLOW_8);
            this_Text_2=ruleText();

            state._fsp--;


            			current.merge(this_Text_2);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,15,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChangeTableCssClassOperation"


    // $ANTLR start "entryRuleFontSize"
    // InternalAdaptDsl.g:1206:1: entryRuleFontSize returns [String current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final String entryRuleFontSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFontSize = null;


        try {
            // InternalAdaptDsl.g:1206:48: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalAdaptDsl.g:1207:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFontSize"


    // $ANTLR start "ruleFontSize"
    // InternalAdaptDsl.g:1213:1: ruleFontSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleFontSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1219:2: (this_INT_0= RULE_INT )
            // InternalAdaptDsl.g:1220:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getFontSizeAccess().getINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFontSize"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003FA0008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000003FA0000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});

}