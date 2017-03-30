package org.xtext.example.adaptdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'flow'", "'{'", "'};'", "'Services{'", "';'", "'}'", "'Types{'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'||'", "'&&'", "'()'", "'.'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "'name'", "':'", "'string'", "'number'", "'bool'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    // InternalAdaptDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAdaptDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalAdaptDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalAdaptDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= 'Services{' ( ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= 'Types{' ( (lv_types_12_0= ruleDefTypes ) ) otherlv_13= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_flowName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_services_0_0 = null;

        EObject lv_adaptationRules_4_0 = null;

        EObject lv_entity_6_0 = null;

        EObject lv_provider_8_0 = null;

        EObject lv_types_12_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:78:2: ( ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= 'Services{' ( ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= 'Types{' ( (lv_types_12_0= ruleDefTypes ) ) otherlv_13= '}' ) )
            // InternalAdaptDsl.g:79:2: ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= 'Services{' ( ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= 'Types{' ( (lv_types_12_0= ruleDefTypes ) ) otherlv_13= '}' )
            {
            // InternalAdaptDsl.g:79:2: ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= 'Services{' ( ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= 'Types{' ( (lv_types_12_0= ruleDefTypes ) ) otherlv_13= '}' )
            // InternalAdaptDsl.g:80:3: ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ( (lv_entity_6_0= ruleEntity ) )* otherlv_7= 'Services{' ( ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';' )* otherlv_10= '}' otherlv_11= 'Types{' ( (lv_types_12_0= ruleDefTypes ) ) otherlv_13= '}'
            {
            // InternalAdaptDsl.g:80:3: ( (lv_services_0_0= ruleServices ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:81:4: (lv_services_0_0= ruleServices )
                    {
                    // InternalAdaptDsl.g:81:4: (lv_services_0_0= ruleServices )
                    // InternalAdaptDsl.g:82:5: lv_services_0_0= ruleServices
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getServicesServicesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_services_0_0=ruleServices();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"services",
                    						lv_services_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Services");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFlowKeyword_1());
            		
            // InternalAdaptDsl.g:103:3: ( (lv_flowName_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:104:4: (lv_flowName_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:104:4: (lv_flowName_2_0= RULE_STRING )
            // InternalAdaptDsl.g:105:5: lv_flowName_2_0= RULE_STRING
            {
            lv_flowName_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_flowName_2_0, grammarAccess.getModelAccess().getFlowNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flowName",
            						lv_flowName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAdaptDsl.g:125:3: ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdaptDsl.g:126:4: (lv_adaptationRules_4_0= ruleAdaptationRule )
            	    {
            	    // InternalAdaptDsl.g:126:4: (lv_adaptationRules_4_0= ruleAdaptationRule )
            	    // InternalAdaptDsl.g:127:5: lv_adaptationRules_4_0= ruleAdaptationRule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_adaptationRules_4_0=ruleAdaptationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"adaptationRules",
            	    						lv_adaptationRules_4_0,
            	    						"org.xtext.example.adaptdsl.AdaptDsl.AdaptationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_5());
            		
            // InternalAdaptDsl.g:148:3: ( (lv_entity_6_0= ruleEntity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==58) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAdaptDsl.g:149:4: (lv_entity_6_0= ruleEntity )
            	    {
            	    // InternalAdaptDsl.g:149:4: (lv_entity_6_0= ruleEntity )
            	    // InternalAdaptDsl.g:150:5: lv_entity_6_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntityEntityParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_entity_6_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_6_0,
            	    						"org.xtext.example.adaptdsl.AdaptDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getModelAccess().getServicesKeyword_7());
            		
            // InternalAdaptDsl.g:171:3: ( ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAdaptDsl.g:172:4: ( (lv_provider_8_0= ruleProvider ) ) otherlv_9= ';'
            	    {
            	    // InternalAdaptDsl.g:172:4: ( (lv_provider_8_0= ruleProvider ) )
            	    // InternalAdaptDsl.g:173:5: (lv_provider_8_0= ruleProvider )
            	    {
            	    // InternalAdaptDsl.g:173:5: (lv_provider_8_0= ruleProvider )
            	    // InternalAdaptDsl.g:174:6: lv_provider_8_0= ruleProvider
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getProviderProviderParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_provider_8_0=ruleProvider();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"provider",
            	    							lv_provider_8_0,
            	    							"org.xtext.example.adaptdsl.AdaptDsl.Provider");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getSemicolonKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getTypesKeyword_10());
            		
            // InternalAdaptDsl.g:204:3: ( (lv_types_12_0= ruleDefTypes ) )
            // InternalAdaptDsl.g:205:4: (lv_types_12_0= ruleDefTypes )
            {
            // InternalAdaptDsl.g:205:4: (lv_types_12_0= ruleDefTypes )
            // InternalAdaptDsl.g:206:5: lv_types_12_0= ruleDefTypes
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTypesDefTypesParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_types_12_0=ruleDefTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"types",
            						lv_types_12_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.DefTypes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleServices"
    // InternalAdaptDsl.g:231:1: entryRuleServices returns [EObject current=null] : iv_ruleServices= ruleServices EOF ;
    public final EObject entryRuleServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServices = null;


        try {
            // InternalAdaptDsl.g:231:49: (iv_ruleServices= ruleServices EOF )
            // InternalAdaptDsl.g:232:2: iv_ruleServices= ruleServices EOF
            {
             newCompositeNode(grammarAccess.getServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServices=ruleServices();

            state._fsp--;

             current =iv_ruleServices; 
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
    // $ANTLR end "entryRuleServices"


    // $ANTLR start "ruleServices"
    // InternalAdaptDsl.g:238:1: ruleServices returns [EObject current=null] : ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? ) ;
    public final EObject ruleServices() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:244:2: ( ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? ) )
            // InternalAdaptDsl.g:245:2: ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? )
            {
            // InternalAdaptDsl.g:245:2: ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? )
            // InternalAdaptDsl.g:246:3: ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )?
            {
            // InternalAdaptDsl.g:246:3: ( (lv_this_0_0= ruleService ) )
            // InternalAdaptDsl.g:247:4: (lv_this_0_0= ruleService )
            {
            // InternalAdaptDsl.g:247:4: (lv_this_0_0= ruleService )
            // InternalAdaptDsl.g:248:5: lv_this_0_0= ruleService
            {

            					newCompositeNode(grammarAccess.getServicesAccess().getThisServiceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_this_0_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicesRule());
            					}
            					set(
            						current,
            						"this",
            						lv_this_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:265:3: ( (lv_next_1_0= ruleServices ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdaptDsl.g:266:4: (lv_next_1_0= ruleServices )
                    {
                    // InternalAdaptDsl.g:266:4: (lv_next_1_0= ruleServices )
                    // InternalAdaptDsl.g:267:5: lv_next_1_0= ruleServices
                    {

                    					newCompositeNode(grammarAccess.getServicesAccess().getNextServicesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleServices();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServicesRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Services");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleServices"


    // $ANTLR start "entryRuleService"
    // InternalAdaptDsl.g:288:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAdaptDsl.g:288:48: (iv_ruleService= ruleService EOF )
            // InternalAdaptDsl.g:289:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAdaptDsl.g:295:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_loc_3_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_functions_7_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:301:2: ( (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' ) )
            // InternalAdaptDsl.g:302:2: (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' )
            {
            // InternalAdaptDsl.g:302:2: (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' )
            // InternalAdaptDsl.g:303:3: otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalAdaptDsl.g:307:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:308:4: (lv_type_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:308:4: (lv_type_1_0= RULE_ID )
            // InternalAdaptDsl.g:309:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_type_1_0, grammarAccess.getServiceAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getFromKeyword_2());
            		
            // InternalAdaptDsl.g:329:3: ( (lv_loc_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:330:4: (lv_loc_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:330:4: (lv_loc_3_0= RULE_STRING )
            // InternalAdaptDsl.g:331:5: lv_loc_3_0= RULE_STRING
            {
            lv_loc_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_loc_3_0, grammarAccess.getServiceAccess().getLocSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"loc",
            						lv_loc_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getAsKeyword_4());
            		
            // InternalAdaptDsl.g:351:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalAdaptDsl.g:352:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:352:4: (lv_id_5_0= RULE_STRING )
            // InternalAdaptDsl.g:353:5: lv_id_5_0= RULE_STRING
            {
            lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_id_5_0, grammarAccess.getServiceAccess().getIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAdaptDsl.g:373:3: ( (lv_functions_7_0= ruleFunctions ) )
            // InternalAdaptDsl.g:374:4: (lv_functions_7_0= ruleFunctions )
            {
            // InternalAdaptDsl.g:374:4: (lv_functions_7_0= ruleFunctions )
            // InternalAdaptDsl.g:375:5: lv_functions_7_0= ruleFunctions
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getFunctionsFunctionsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_functions_7_0=ruleFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"functions",
            						lv_functions_7_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Functions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleFunctions"
    // InternalAdaptDsl.g:400:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalAdaptDsl.g:400:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalAdaptDsl.g:401:2: iv_ruleFunctions= ruleFunctions EOF
            {
             newCompositeNode(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;

             current =iv_ruleFunctions; 
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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalAdaptDsl.g:407:1: ruleFunctions returns [EObject current=null] : ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:413:2: ( ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? ) )
            // InternalAdaptDsl.g:414:2: ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? )
            {
            // InternalAdaptDsl.g:414:2: ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? )
            // InternalAdaptDsl.g:415:3: ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )?
            {
            // InternalAdaptDsl.g:415:3: ( (lv_this_0_0= ruleFunction ) )
            // InternalAdaptDsl.g:416:4: (lv_this_0_0= ruleFunction )
            {
            // InternalAdaptDsl.g:416:4: (lv_this_0_0= ruleFunction )
            // InternalAdaptDsl.g:417:5: lv_this_0_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getThisFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_this_0_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"this",
            						lv_this_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:434:3: ( (lv_next_1_0= ruleFunctions ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdaptDsl.g:435:4: (lv_next_1_0= ruleFunctions )
                    {
                    // InternalAdaptDsl.g:435:4: (lv_next_1_0= ruleFunctions )
                    // InternalAdaptDsl.g:436:5: lv_next_1_0= ruleFunctions
                    {

                    					newCompositeNode(grammarAccess.getFunctionsAccess().getNextFunctionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleFunctions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionsRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Functions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleFunction"
    // InternalAdaptDsl.g:457:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalAdaptDsl.g:457:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalAdaptDsl.g:458:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalAdaptDsl.g:464:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:470:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalAdaptDsl.g:471:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:471:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalAdaptDsl.g:472:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalAdaptDsl.g:476:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:477:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:477:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptDsl.g:478:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getAsKeyword_2());
            		
            // InternalAdaptDsl.g:498:3: ( (lv_id_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:499:4: (lv_id_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:499:4: (lv_id_3_0= RULE_STRING )
            // InternalAdaptDsl.g:500:5: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_id_3_0, grammarAccess.getFunctionAccess().getIdSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleAdaptationRule"
    // InternalAdaptDsl.g:524:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // InternalAdaptDsl.g:524:55: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // InternalAdaptDsl.g:525:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
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
    // $ANTLR end "entryRuleAdaptationRule"


    // $ANTLR start "ruleAdaptationRule"
    // InternalAdaptDsl.g:531:1: ruleAdaptationRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_level_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_factType_7_0=null;
        Token lv_factName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_expr_12_0 = null;

        EObject lv_actionCollection_16_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:537:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' ) )
            // InternalAdaptDsl.g:538:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' )
            {
            // InternalAdaptDsl.g:538:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' )
            // InternalAdaptDsl.g:539:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0());
            		
            // InternalAdaptDsl.g:543:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdaptDsl.g:544:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:544:4: (lv_name_1_0= RULE_STRING )
            // InternalAdaptDsl.g:545:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAdaptationRuleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3());
            		
            // InternalAdaptDsl.g:569:3: ( (lv_level_4_0= RULE_INT ) )
            // InternalAdaptDsl.g:570:4: (lv_level_4_0= RULE_INT )
            {
            // InternalAdaptDsl.g:570:4: (lv_level_4_0= RULE_INT )
            // InternalAdaptDsl.g:571:5: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_level_4_0, grammarAccess.getAdaptationRuleAccess().getLevelINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6());
            		
            // InternalAdaptDsl.g:595:3: ( (lv_factType_7_0= RULE_ID ) )
            // InternalAdaptDsl.g:596:4: (lv_factType_7_0= RULE_ID )
            {
            // InternalAdaptDsl.g:596:4: (lv_factType_7_0= RULE_ID )
            // InternalAdaptDsl.g:597:5: lv_factType_7_0= RULE_ID
            {
            lv_factType_7_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_factType_7_0, grammarAccess.getAdaptationRuleAccess().getFactTypeIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factType",
            						lv_factType_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAdaptDsl.g:613:3: ( (lv_factName_8_0= RULE_ID ) )
            // InternalAdaptDsl.g:614:4: (lv_factName_8_0= RULE_ID )
            {
            // InternalAdaptDsl.g:614:4: (lv_factName_8_0= RULE_ID )
            // InternalAdaptDsl.g:615:5: lv_factName_8_0= RULE_ID
            {
            lv_factName_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_factName_8_0, grammarAccess.getAdaptationRuleAccess().getFactNameIDTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factName",
            						lv_factName_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getAdaptationRuleAccess().getIFKeyword_10());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_11, grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11());
            		
            // InternalAdaptDsl.g:643:3: ( (lv_expr_12_0= ruleConditionalOR ) )
            // InternalAdaptDsl.g:644:4: (lv_expr_12_0= ruleConditionalOR )
            {
            // InternalAdaptDsl.g:644:4: (lv_expr_12_0= ruleConditionalOR )
            // InternalAdaptDsl.g:645:5: lv_expr_12_0= ruleConditionalOR
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_25);
            lv_expr_12_0=ruleConditionalOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptationRuleRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_12_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ConditionalOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_13, grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_14, grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14());
            		
            otherlv_15=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_15, grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15());
            		
            // InternalAdaptDsl.g:674:3: ( (lv_actionCollection_16_0= ruleActions ) )
            // InternalAdaptDsl.g:675:4: (lv_actionCollection_16_0= ruleActions )
            {
            // InternalAdaptDsl.g:675:4: (lv_actionCollection_16_0= ruleActions )
            // InternalAdaptDsl.g:676:5: lv_actionCollection_16_0= ruleActions
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_25);
            lv_actionCollection_16_0=ruleActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptationRuleRule());
            					}
            					set(
            						current,
            						"actionCollection",
            						lv_actionCollection_16_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Actions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17());
            		
            otherlv_18=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleAdaptationRule"


    // $ANTLR start "entryRuleConditionalOR"
    // InternalAdaptDsl.g:709:1: entryRuleConditionalOR returns [EObject current=null] : iv_ruleConditionalOR= ruleConditionalOR EOF ;
    public final EObject entryRuleConditionalOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOR = null;


        try {
            // InternalAdaptDsl.g:709:54: (iv_ruleConditionalOR= ruleConditionalOR EOF )
            // InternalAdaptDsl.g:710:2: iv_ruleConditionalOR= ruleConditionalOR EOF
            {
             newCompositeNode(grammarAccess.getConditionalORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOR=ruleConditionalOR();

            state._fsp--;

             current =iv_ruleConditionalOR; 
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
    // $ANTLR end "entryRuleConditionalOR"


    // $ANTLR start "ruleConditionalOR"
    // InternalAdaptDsl.g:716:1: ruleConditionalOR returns [EObject current=null] : ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? ) ;
    public final EObject ruleConditionalOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:722:2: ( ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? ) )
            // InternalAdaptDsl.g:723:2: ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? )
            {
            // InternalAdaptDsl.g:723:2: ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? )
            // InternalAdaptDsl.g:724:3: ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )?
            {
            // InternalAdaptDsl.g:724:3: ( (lv_left_0_0= ruleConditionalAND ) )
            // InternalAdaptDsl.g:725:4: (lv_left_0_0= ruleConditionalAND )
            {
            // InternalAdaptDsl.g:725:4: (lv_left_0_0= ruleConditionalAND )
            // InternalAdaptDsl.g:726:5: lv_left_0_0= ruleConditionalAND
            {

            					newCompositeNode(grammarAccess.getConditionalORAccess().getLeftConditionalANDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_left_0_0=ruleConditionalAND();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalORRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ConditionalAND");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:743:3: (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdaptDsl.g:744:4: otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:748:4: ( (lv_right_2_0= ruleConditionalOR ) )
                    // InternalAdaptDsl.g:749:5: (lv_right_2_0= ruleConditionalOR )
                    {
                    // InternalAdaptDsl.g:749:5: (lv_right_2_0= ruleConditionalOR )
                    // InternalAdaptDsl.g:750:6: lv_right_2_0= ruleConditionalOR
                    {

                    						newCompositeNode(grammarAccess.getConditionalORAccess().getRightConditionalORParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleConditionalOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalORRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.ConditionalOR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConditionalOR"


    // $ANTLR start "entryRuleConditionalAND"
    // InternalAdaptDsl.g:772:1: entryRuleConditionalAND returns [EObject current=null] : iv_ruleConditionalAND= ruleConditionalAND EOF ;
    public final EObject entryRuleConditionalAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAND = null;


        try {
            // InternalAdaptDsl.g:772:55: (iv_ruleConditionalAND= ruleConditionalAND EOF )
            // InternalAdaptDsl.g:773:2: iv_ruleConditionalAND= ruleConditionalAND EOF
            {
             newCompositeNode(grammarAccess.getConditionalANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAND=ruleConditionalAND();

            state._fsp--;

             current =iv_ruleConditionalAND; 
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
    // $ANTLR end "entryRuleConditionalAND"


    // $ANTLR start "ruleConditionalAND"
    // InternalAdaptDsl.g:779:1: ruleConditionalAND returns [EObject current=null] : ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? ) ;
    public final EObject ruleConditionalAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:785:2: ( ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? ) )
            // InternalAdaptDsl.g:786:2: ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? )
            {
            // InternalAdaptDsl.g:786:2: ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? )
            // InternalAdaptDsl.g:787:3: ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )?
            {
            // InternalAdaptDsl.g:787:3: ( (lv_left_0_0= ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:788:4: (lv_left_0_0= ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:788:4: (lv_left_0_0= ruleConditionalPrimary )
            // InternalAdaptDsl.g:789:5: lv_left_0_0= ruleConditionalPrimary
            {

            					newCompositeNode(grammarAccess.getConditionalANDAccess().getLeftConditionalPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_left_0_0=ruleConditionalPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalANDRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ConditionalPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:806:3: (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdaptDsl.g:807:4: otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:811:4: ( (lv_right_2_0= ruleConditionalAND ) )
                    // InternalAdaptDsl.g:812:5: (lv_right_2_0= ruleConditionalAND )
                    {
                    // InternalAdaptDsl.g:812:5: (lv_right_2_0= ruleConditionalAND )
                    // InternalAdaptDsl.g:813:6: lv_right_2_0= ruleConditionalAND
                    {

                    						newCompositeNode(grammarAccess.getConditionalANDAccess().getRightConditionalANDParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleConditionalAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalANDRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.ConditionalAND");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleConditionalAND"


    // $ANTLR start "entryRuleConditionalPrimary"
    // InternalAdaptDsl.g:835:1: entryRuleConditionalPrimary returns [EObject current=null] : iv_ruleConditionalPrimary= ruleConditionalPrimary EOF ;
    public final EObject entryRuleConditionalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalPrimary = null;


        try {
            // InternalAdaptDsl.g:835:59: (iv_ruleConditionalPrimary= ruleConditionalPrimary EOF )
            // InternalAdaptDsl.g:836:2: iv_ruleConditionalPrimary= ruleConditionalPrimary EOF
            {
             newCompositeNode(grammarAccess.getConditionalPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalPrimary=ruleConditionalPrimary();

            state._fsp--;

             current =iv_ruleConditionalPrimary; 
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
    // $ANTLR end "entryRuleConditionalPrimary"


    // $ANTLR start "ruleConditionalPrimary"
    // InternalAdaptDsl.g:842:1: ruleConditionalPrimary returns [EObject current=null] : ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) ) ;
    public final EObject ruleConditionalPrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_cond_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:848:2: ( ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) ) )
            // InternalAdaptDsl.g:849:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )
            {
            // InternalAdaptDsl.g:849:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:850:3: ( (lv_cond_0_0= ruleStringCondition ) )
                    {
                    // InternalAdaptDsl.g:850:3: ( (lv_cond_0_0= ruleStringCondition ) )
                    // InternalAdaptDsl.g:851:4: (lv_cond_0_0= ruleStringCondition )
                    {
                    // InternalAdaptDsl.g:851:4: (lv_cond_0_0= ruleStringCondition )
                    // InternalAdaptDsl.g:852:5: lv_cond_0_0= ruleStringCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalPrimaryAccess().getCondStringConditionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_0_0=ruleStringCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.StringCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:870:3: ( (lv_cond_1_0= ruleNumberCondition ) )
                    {
                    // InternalAdaptDsl.g:870:3: ( (lv_cond_1_0= ruleNumberCondition ) )
                    // InternalAdaptDsl.g:871:4: (lv_cond_1_0= ruleNumberCondition )
                    {
                    // InternalAdaptDsl.g:871:4: (lv_cond_1_0= ruleNumberCondition )
                    // InternalAdaptDsl.g:872:5: lv_cond_1_0= ruleNumberCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalPrimaryAccess().getCondNumberConditionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_1_0=ruleNumberCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.NumberCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:890:3: ( (lv_cond_2_0= ruleBooleanCondition ) )
                    {
                    // InternalAdaptDsl.g:890:3: ( (lv_cond_2_0= ruleBooleanCondition ) )
                    // InternalAdaptDsl.g:891:4: (lv_cond_2_0= ruleBooleanCondition )
                    {
                    // InternalAdaptDsl.g:891:4: (lv_cond_2_0= ruleBooleanCondition )
                    // InternalAdaptDsl.g:892:5: lv_cond_2_0= ruleBooleanCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalPrimaryAccess().getCondBooleanConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_2_0=ruleBooleanCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.BooleanCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleConditionalPrimary"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalAdaptDsl.g:913:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalAdaptDsl.g:913:57: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalAdaptDsl.g:914:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalAdaptDsl.g:920:1: ruleBooleanCondition returns [EObject current=null] : ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        AntlrDatatypeRuleToken lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_fact_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:926:2: ( ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) ) )
            // InternalAdaptDsl.g:927:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )
            {
            // InternalAdaptDsl.g:927:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalAdaptDsl.g:928:3: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) )
                    {
                    // InternalAdaptDsl.g:928:3: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) )
                    // InternalAdaptDsl.g:929:4: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) )
                    {
                    // InternalAdaptDsl.g:929:4: ( (lv_fact_0_0= ruleFact ) )
                    // InternalAdaptDsl.g:930:5: (lv_fact_0_0= ruleFact )
                    {
                    // InternalAdaptDsl.g:930:5: (lv_fact_0_0= ruleFact )
                    // InternalAdaptDsl.g:931:6: lv_fact_0_0= ruleFact
                    {

                    						newCompositeNode(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_fact_0_0=ruleFact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    						}
                    						set(
                    							current,
                    							"fact",
                    							lv_fact_0_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.Fact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAdaptDsl.g:948:4: ( (lv_op_1_0= ruleBoolOperators ) )
                    // InternalAdaptDsl.g:949:5: (lv_op_1_0= ruleBoolOperators )
                    {
                    // InternalAdaptDsl.g:949:5: (lv_op_1_0= ruleBoolOperators )
                    // InternalAdaptDsl.g:950:6: lv_op_1_0= ruleBoolOperators
                    {

                    						newCompositeNode(grammarAccess.getBooleanConditionAccess().getOpBoolOperatorsParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_op_1_0=ruleBoolOperators();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.BoolOperators");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAdaptDsl.g:967:4: ( (lv_val_2_0= RULE_BOOL ) )
                    // InternalAdaptDsl.g:968:5: (lv_val_2_0= RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:968:5: (lv_val_2_0= RULE_BOOL )
                    // InternalAdaptDsl.g:969:6: lv_val_2_0= RULE_BOOL
                    {
                    lv_val_2_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    						newLeafNode(lv_val_2_0, grammarAccess.getBooleanConditionAccess().getValBOOLTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.BOOL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:987:3: ( (lv_fact_3_0= ruleFact ) )
                    {
                    // InternalAdaptDsl.g:987:3: ( (lv_fact_3_0= ruleFact ) )
                    // InternalAdaptDsl.g:988:4: (lv_fact_3_0= ruleFact )
                    {
                    // InternalAdaptDsl.g:988:4: (lv_fact_3_0= ruleFact )
                    // InternalAdaptDsl.g:989:5: lv_fact_3_0= ruleFact
                    {

                    					newCompositeNode(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fact_3_0=ruleFact();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    					}
                    					set(
                    						current,
                    						"fact",
                    						lv_fact_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Fact");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleNumberCondition"
    // InternalAdaptDsl.g:1010:1: entryRuleNumberCondition returns [EObject current=null] : iv_ruleNumberCondition= ruleNumberCondition EOF ;
    public final EObject entryRuleNumberCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberCondition = null;


        try {
            // InternalAdaptDsl.g:1010:56: (iv_ruleNumberCondition= ruleNumberCondition EOF )
            // InternalAdaptDsl.g:1011:2: iv_ruleNumberCondition= ruleNumberCondition EOF
            {
             newCompositeNode(grammarAccess.getNumberConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberCondition=ruleNumberCondition();

            state._fsp--;

             current =iv_ruleNumberCondition; 
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
    // $ANTLR end "entryRuleNumberCondition"


    // $ANTLR start "ruleNumberCondition"
    // InternalAdaptDsl.g:1017:1: ruleNumberCondition returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        AntlrDatatypeRuleToken lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1023:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) ) )
            // InternalAdaptDsl.g:1024:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) )
            {
            // InternalAdaptDsl.g:1024:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:1025:3: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:1025:3: ( (lv_fact_0_0= ruleFact ) )
            // InternalAdaptDsl.g:1026:4: (lv_fact_0_0= ruleFact )
            {
            // InternalAdaptDsl.g:1026:4: (lv_fact_0_0= ruleFact )
            // InternalAdaptDsl.g:1027:5: lv_fact_0_0= ruleFact
            {

            					newCompositeNode(grammarAccess.getNumberConditionAccess().getFactFactParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_fact_0_0=ruleFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberConditionRule());
            					}
            					set(
            						current,
            						"fact",
            						lv_fact_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Fact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1044:3: ( (lv_op_1_0= ruleNumberOperators ) )
            // InternalAdaptDsl.g:1045:4: (lv_op_1_0= ruleNumberOperators )
            {
            // InternalAdaptDsl.g:1045:4: (lv_op_1_0= ruleNumberOperators )
            // InternalAdaptDsl.g:1046:5: lv_op_1_0= ruleNumberOperators
            {

            					newCompositeNode(grammarAccess.getNumberConditionAccess().getOpNumberOperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_op_1_0=ruleNumberOperators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberConditionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.NumberOperators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1063:3: ( (lv_val_2_0= RULE_INT ) )
            // InternalAdaptDsl.g:1064:4: (lv_val_2_0= RULE_INT )
            {
            // InternalAdaptDsl.g:1064:4: (lv_val_2_0= RULE_INT )
            // InternalAdaptDsl.g:1065:5: lv_val_2_0= RULE_INT
            {
            lv_val_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_val_2_0, grammarAccess.getNumberConditionAccess().getValINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleNumberCondition"


    // $ANTLR start "entryRuleStringCondition"
    // InternalAdaptDsl.g:1085:1: entryRuleStringCondition returns [EObject current=null] : iv_ruleStringCondition= ruleStringCondition EOF ;
    public final EObject entryRuleStringCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringCondition = null;


        try {
            // InternalAdaptDsl.g:1085:56: (iv_ruleStringCondition= ruleStringCondition EOF )
            // InternalAdaptDsl.g:1086:2: iv_ruleStringCondition= ruleStringCondition EOF
            {
             newCompositeNode(grammarAccess.getStringConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringCondition=ruleStringCondition();

            state._fsp--;

             current =iv_ruleStringCondition; 
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
    // $ANTLR end "entryRuleStringCondition"


    // $ANTLR start "ruleStringCondition"
    // InternalAdaptDsl.g:1092:1: ruleStringCondition returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        AntlrDatatypeRuleToken lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1098:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) ) )
            // InternalAdaptDsl.g:1099:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) )
            {
            // InternalAdaptDsl.g:1099:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:1100:3: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:1100:3: ( (lv_fact_0_0= ruleFact ) )
            // InternalAdaptDsl.g:1101:4: (lv_fact_0_0= ruleFact )
            {
            // InternalAdaptDsl.g:1101:4: (lv_fact_0_0= ruleFact )
            // InternalAdaptDsl.g:1102:5: lv_fact_0_0= ruleFact
            {

            					newCompositeNode(grammarAccess.getStringConditionAccess().getFactFactParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_fact_0_0=ruleFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConditionRule());
            					}
            					set(
            						current,
            						"fact",
            						lv_fact_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Fact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1119:3: ( (lv_op_1_0= ruleStringOperators ) )
            // InternalAdaptDsl.g:1120:4: (lv_op_1_0= ruleStringOperators )
            {
            // InternalAdaptDsl.g:1120:4: (lv_op_1_0= ruleStringOperators )
            // InternalAdaptDsl.g:1121:5: lv_op_1_0= ruleStringOperators
            {

            					newCompositeNode(grammarAccess.getStringConditionAccess().getOpStringOperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_op_1_0=ruleStringOperators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConditionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.StringOperators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1138:3: ( (lv_val_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:1139:4: (lv_val_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:1139:4: (lv_val_2_0= RULE_STRING )
            // InternalAdaptDsl.g:1140:5: lv_val_2_0= RULE_STRING
            {
            lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_2_0, grammarAccess.getStringConditionAccess().getValSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleStringCondition"


    // $ANTLR start "entryRuleFact"
    // InternalAdaptDsl.g:1160:1: entryRuleFact returns [String current=null] : iv_ruleFact= ruleFact EOF ;
    public final String entryRuleFact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFact = null;


        try {
            // InternalAdaptDsl.g:1160:44: (iv_ruleFact= ruleFact EOF )
            // InternalAdaptDsl.g:1161:2: iv_ruleFact= ruleFact EOF
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
    // InternalAdaptDsl.g:1167:1: ruleFact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleFact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1173:2: ( (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* ) )
            // InternalAdaptDsl.g:1174:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* )
            {
            // InternalAdaptDsl.g:1174:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* )
            // InternalAdaptDsl.g:1175:3: this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFactAccess().getIDTerminalRuleCall_0());
            		
            // InternalAdaptDsl.g:1182:3: (kw= '()' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdaptDsl.g:1183:4: kw= '()'
                    {
                    kw=(Token)match(input,32,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalAdaptDsl.g:1189:3: (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAdaptDsl.g:1190:4: kw= '.' this_ID_3= RULE_ID (kw= '()' )?
            	    {
            	    kw=(Token)match(input,33,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFactAccess().getFullStopKeyword_2_0());
            	    			
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getFactAccess().getIDTerminalRuleCall_2_1());
            	    			
            	    // InternalAdaptDsl.g:1202:4: (kw= '()' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==32) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAdaptDsl.g:1203:5: kw= '()'
            	            {
            	            kw=(Token)match(input,32,FOLLOW_35); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_2_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleFactProperty"
    // InternalAdaptDsl.g:1214:1: entryRuleFactProperty returns [String current=null] : iv_ruleFactProperty= ruleFactProperty EOF ;
    public final String entryRuleFactProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactProperty = null;


        try {
            // InternalAdaptDsl.g:1214:52: (iv_ruleFactProperty= ruleFactProperty EOF )
            // InternalAdaptDsl.g:1215:2: iv_ruleFactProperty= ruleFactProperty EOF
            {
             newCompositeNode(grammarAccess.getFactPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactProperty=ruleFactProperty();

            state._fsp--;

             current =iv_ruleFactProperty.getText(); 
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
    // $ANTLR end "entryRuleFactProperty"


    // $ANTLR start "ruleFactProperty"
    // InternalAdaptDsl.g:1221:1: ruleFactProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleFactProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_Value_8 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1227:2: ( (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? ) )
            // InternalAdaptDsl.g:1228:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? )
            {
            // InternalAdaptDsl.g:1228:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? )
            // InternalAdaptDsl.g:1229:3: this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_0());
            		
            // InternalAdaptDsl.g:1236:3: (kw= '()' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAdaptDsl.g:1237:4: kw= '()'
                    {
                    kw=(Token)match(input,32,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalAdaptDsl.g:1243:3: (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        int LA16_2 = input.LA(3);

                        if ( ((LA16_2>=32 && LA16_2<=33)) ) {
                            alt16=1;
                        }


                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalAdaptDsl.g:1244:4: kw= '.' this_ID_3= RULE_ID (kw= '()' )?
            	    {
            	    kw=(Token)match(input,33,FOLLOW_12); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0());
            	    			
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_36); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_2_1());
            	    			
            	    // InternalAdaptDsl.g:1256:4: (kw= '()' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==32) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAdaptDsl.g:1257:5: kw= '()'
            	            {
            	            kw=(Token)match(input,32,FOLLOW_37); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            kw=(Token)match(input,33,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFactPropertyAccess().getFullStopKeyword_3());
            		
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_38); 

            			current.merge(this_ID_6);
            		

            			newLeafNode(this_ID_6, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_4());
            		
            // InternalAdaptDsl.g:1276:3: (kw= '(' this_Value_8= ruleValue kw= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAdaptDsl.g:1277:4: kw= '(' this_Value_8= ruleValue kw= ')'
                    {
                    kw=(Token)match(input,27,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getFactPropertyAccess().getValueParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_25);
                    this_Value_8=ruleValue();

                    state._fsp--;


                    				current.merge(this_Value_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,28,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleFactProperty"


    // $ANTLR start "entryRuleNumberOperators"
    // InternalAdaptDsl.g:1302:1: entryRuleNumberOperators returns [String current=null] : iv_ruleNumberOperators= ruleNumberOperators EOF ;
    public final String entryRuleNumberOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberOperators = null;


        try {
            // InternalAdaptDsl.g:1302:55: (iv_ruleNumberOperators= ruleNumberOperators EOF )
            // InternalAdaptDsl.g:1303:2: iv_ruleNumberOperators= ruleNumberOperators EOF
            {
             newCompositeNode(grammarAccess.getNumberOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberOperators=ruleNumberOperators();

            state._fsp--;

             current =iv_ruleNumberOperators.getText(); 
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
    // $ANTLR end "entryRuleNumberOperators"


    // $ANTLR start "ruleNumberOperators"
    // InternalAdaptDsl.g:1309:1: ruleNumberOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleNumberOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1315:2: ( (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) )
            // InternalAdaptDsl.g:1316:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1316:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            case 37:
                {
                alt18=4;
                }
                break;
            case 38:
                {
                alt18=5;
                }
                break;
            case 39:
                {
                alt18=6;
                }
                break;
            case 40:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAdaptDsl.g:1317:3: kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1323:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1329:3: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1335:3: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1341:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1347:3: kw= '<='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1353:3: kw= '==='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_6());
                    		

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
    // $ANTLR end "ruleNumberOperators"


    // $ANTLR start "entryRuleStringOperators"
    // InternalAdaptDsl.g:1362:1: entryRuleStringOperators returns [String current=null] : iv_ruleStringOperators= ruleStringOperators EOF ;
    public final String entryRuleStringOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOperators = null;


        try {
            // InternalAdaptDsl.g:1362:55: (iv_ruleStringOperators= ruleStringOperators EOF )
            // InternalAdaptDsl.g:1363:2: iv_ruleStringOperators= ruleStringOperators EOF
            {
             newCompositeNode(grammarAccess.getStringOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOperators=ruleStringOperators();

            state._fsp--;

             current =iv_ruleStringOperators.getText(); 
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
    // $ANTLR end "entryRuleStringOperators"


    // $ANTLR start "ruleStringOperators"
    // InternalAdaptDsl.g:1369:1: ruleStringOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleStringOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1375:2: ( (kw= '==' | kw= '!=' | kw= '===' ) )
            // InternalAdaptDsl.g:1376:2: (kw= '==' | kw= '!=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1376:2: (kw= '==' | kw= '!=' | kw= '===' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAdaptDsl.g:1377:3: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1383:3: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1389:3: kw= '==='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
                    		

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
    // $ANTLR end "ruleStringOperators"


    // $ANTLR start "entryRuleBoolOperators"
    // InternalAdaptDsl.g:1398:1: entryRuleBoolOperators returns [String current=null] : iv_ruleBoolOperators= ruleBoolOperators EOF ;
    public final String entryRuleBoolOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOperators = null;


        try {
            // InternalAdaptDsl.g:1398:53: (iv_ruleBoolOperators= ruleBoolOperators EOF )
            // InternalAdaptDsl.g:1399:2: iv_ruleBoolOperators= ruleBoolOperators EOF
            {
             newCompositeNode(grammarAccess.getBoolOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolOperators=ruleBoolOperators();

            state._fsp--;

             current =iv_ruleBoolOperators.getText(); 
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
    // $ANTLR end "entryRuleBoolOperators"


    // $ANTLR start "ruleBoolOperators"
    // InternalAdaptDsl.g:1405:1: ruleBoolOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1411:2: ( (kw= '==' | kw= '!=' ) )
            // InternalAdaptDsl.g:1412:2: (kw= '==' | kw= '!=' )
            {
            // InternalAdaptDsl.g:1412:2: (kw= '==' | kw= '!=' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:1413:3: kw= '=='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1419:3: kw= '!='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolOperators"


    // $ANTLR start "entryRuleActions"
    // InternalAdaptDsl.g:1428:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalAdaptDsl.g:1428:48: (iv_ruleActions= ruleActions EOF )
            // InternalAdaptDsl.g:1429:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
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
    // InternalAdaptDsl.g:1435:1: ruleActions returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1441:2: ( ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) )
            // InternalAdaptDsl.g:1442:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            {
            // InternalAdaptDsl.g:1442:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            // InternalAdaptDsl.g:1443:3: ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )?
            {
            // InternalAdaptDsl.g:1443:3: ( (lv_action_0_0= ruleAction ) )
            // InternalAdaptDsl.g:1444:4: (lv_action_0_0= ruleAction )
            {
            // InternalAdaptDsl.g:1444:4: (lv_action_0_0= ruleAction )
            // InternalAdaptDsl.g:1445:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getActionsAccess().getActionActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_action_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionsRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1462:3: ( (lv_next_1_0= ruleActions ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41||(LA21_0>=43 && LA21_0<=57)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAdaptDsl.g:1463:4: (lv_next_1_0= ruleActions )
                    {
                    // InternalAdaptDsl.g:1463:4: (lv_next_1_0= ruleActions )
                    // InternalAdaptDsl.g:1464:5: lv_next_1_0= ruleActions
                    {

                    					newCompositeNode(grammarAccess.getActionsAccess().getNextActionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleActions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionsRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Actions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleAction"
    // InternalAdaptDsl.g:1485:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAdaptDsl.g:1485:47: (iv_ruleAction= ruleAction EOF )
            // InternalAdaptDsl.g:1486:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // InternalAdaptDsl.g:1492:1: ruleAction returns [EObject current=null] : ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionCategory_0_0 = null;

        EObject lv_actionCategory_1_0 = null;

        EObject lv_actionCategory_2_0 = null;

        EObject lv_actionCategory_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1498:2: ( ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) )
            // InternalAdaptDsl.g:1499:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            {
            // InternalAdaptDsl.g:1499:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 41:
            case 43:
            case 44:
                {
                alt22=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt22=2;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt22=3;
                }
                break;
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:1500:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    {
                    // InternalAdaptDsl.g:1500:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    // InternalAdaptDsl.g:1501:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    {
                    // InternalAdaptDsl.g:1501:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    // InternalAdaptDsl.g:1502:5: lv_actionCategory_0_0= ruleServiceOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryServiceOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_0_0=ruleServiceOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ServiceOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1520:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1520:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    // InternalAdaptDsl.g:1521:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    {
                    // InternalAdaptDsl.g:1521:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    // InternalAdaptDsl.g:1522:5: lv_actionCategory_1_0= ruleTaskChangeOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryTaskChangeOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_1_0=ruleTaskChangeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.TaskChangeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1540:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1540:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    // InternalAdaptDsl.g:1541:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    {
                    // InternalAdaptDsl.g:1541:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    // InternalAdaptDsl.g:1542:5: lv_actionCategory_2_0= ruleNavigationChangeOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryNavigationChangeOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_2_0=ruleNavigationChangeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.NavigationChangeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1560:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1560:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    // InternalAdaptDsl.g:1561:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    {
                    // InternalAdaptDsl.g:1561:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    // InternalAdaptDsl.g:1562:5: lv_actionCategory_3_0= ruleLayoutChangeOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryLayoutChangeOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_3_0=ruleLayoutChangeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.LayoutChangeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleServiceOperation"
    // InternalAdaptDsl.g:1583:1: entryRuleServiceOperation returns [EObject current=null] : iv_ruleServiceOperation= ruleServiceOperation EOF ;
    public final EObject entryRuleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceOperation = null;


        try {
            // InternalAdaptDsl.g:1583:57: (iv_ruleServiceOperation= ruleServiceOperation EOF )
            // InternalAdaptDsl.g:1584:2: iv_ruleServiceOperation= ruleServiceOperation EOF
            {
             newCompositeNode(grammarAccess.getServiceOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceOperation=ruleServiceOperation();

            state._fsp--;

             current =iv_ruleServiceOperation; 
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
    // $ANTLR end "entryRuleServiceOperation"


    // $ANTLR start "ruleServiceOperation"
    // InternalAdaptDsl.g:1590:1: ruleServiceOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) ;
    public final EObject ruleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1596:2: ( ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) )
            // InternalAdaptDsl.g:1597:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            {
            // InternalAdaptDsl.g:1597:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 44:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAdaptDsl.g:1598:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    {
                    // InternalAdaptDsl.g:1598:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    // InternalAdaptDsl.g:1599:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    {
                    // InternalAdaptDsl.g:1599:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    // InternalAdaptDsl.g:1600:5: lv_operation_0_0= ruleServiceFunctionCallOperation
                    {

                    					newCompositeNode(grammarAccess.getServiceOperationAccess().getOperationServiceFunctionCallOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleServiceFunctionCallOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ServiceFunctionCallOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1618:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    {
                    // InternalAdaptDsl.g:1618:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    // InternalAdaptDsl.g:1619:4: (lv_operation_1_0= ruleEditFactOperation )
                    {
                    // InternalAdaptDsl.g:1619:4: (lv_operation_1_0= ruleEditFactOperation )
                    // InternalAdaptDsl.g:1620:5: lv_operation_1_0= ruleEditFactOperation
                    {

                    					newCompositeNode(grammarAccess.getServiceOperationAccess().getOperationEditFactOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleEditFactOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.EditFactOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1638:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    {
                    // InternalAdaptDsl.g:1638:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    // InternalAdaptDsl.g:1639:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    {
                    // InternalAdaptDsl.g:1639:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    // InternalAdaptDsl.g:1640:5: lv_operation_2_0= ruleSetDisplayPropertyOperation
                    {

                    					newCompositeNode(grammarAccess.getServiceOperationAccess().getOperationSetDisplayPropertyOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleSetDisplayPropertyOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.SetDisplayPropertyOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleServiceOperation"


    // $ANTLR start "entryRuleServiceFunctionCallOperation"
    // InternalAdaptDsl.g:1661:1: entryRuleServiceFunctionCallOperation returns [EObject current=null] : iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF ;
    public final EObject entryRuleServiceFunctionCallOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceFunctionCallOperation = null;


        try {
            // InternalAdaptDsl.g:1661:69: (iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF )
            // InternalAdaptDsl.g:1662:2: iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF
            {
             newCompositeNode(grammarAccess.getServiceFunctionCallOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceFunctionCallOperation=ruleServiceFunctionCallOperation();

            state._fsp--;

             current =iv_ruleServiceFunctionCallOperation; 
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
    // $ANTLR end "entryRuleServiceFunctionCallOperation"


    // $ANTLR start "ruleServiceFunctionCallOperation"
    // InternalAdaptDsl.g:1668:1: ruleServiceFunctionCallOperation returns [EObject current=null] : (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleServiceFunctionCallOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_2_0=null;
        Token otherlv_3=null;
        Token lv_function_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_val_6_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1674:2: ( (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:1675:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:1675:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:1676:3: otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1684:3: ( (lv_service_2_0= RULE_ID ) )
            // InternalAdaptDsl.g:1685:4: (lv_service_2_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1685:4: (lv_service_2_0= RULE_ID )
            // InternalAdaptDsl.g:1686:5: lv_service_2_0= RULE_ID
            {
            lv_service_2_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_service_2_0, grammarAccess.getServiceFunctionCallOperationAccess().getServiceIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFunctionCallOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service",
            						lv_service_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:1706:3: ( (lv_function_4_0= RULE_ID ) )
            // InternalAdaptDsl.g:1707:4: (lv_function_4_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1707:4: (lv_function_4_0= RULE_ID )
            // InternalAdaptDsl.g:1708:5: lv_function_4_0= RULE_ID
            {
            lv_function_4_0=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(lv_function_4_0, grammarAccess.getServiceFunctionCallOperationAccess().getFunctionIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFunctionCallOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:1728:3: ( (lv_val_6_0= ruleValue ) )
            // InternalAdaptDsl.g:1729:4: (lv_val_6_0= ruleValue )
            {
            // InternalAdaptDsl.g:1729:4: (lv_val_6_0= ruleValue )
            // InternalAdaptDsl.g:1730:5: lv_val_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getServiceFunctionCallOperationAccess().getValValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_val_6_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceFunctionCallOperationRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_6_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleServiceFunctionCallOperation"


    // $ANTLR start "entryRuleEditFactOperation"
    // InternalAdaptDsl.g:1759:1: entryRuleEditFactOperation returns [EObject current=null] : iv_ruleEditFactOperation= ruleEditFactOperation EOF ;
    public final EObject entryRuleEditFactOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditFactOperation = null;


        try {
            // InternalAdaptDsl.g:1759:58: (iv_ruleEditFactOperation= ruleEditFactOperation EOF )
            // InternalAdaptDsl.g:1760:2: iv_ruleEditFactOperation= ruleEditFactOperation EOF
            {
             newCompositeNode(grammarAccess.getEditFactOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditFactOperation=ruleEditFactOperation();

            state._fsp--;

             current =iv_ruleEditFactOperation; 
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
    // $ANTLR end "entryRuleEditFactOperation"


    // $ANTLR start "ruleEditFactOperation"
    // InternalAdaptDsl.g:1766:1: ruleEditFactOperation returns [EObject current=null] : (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleEditFactOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_prop_2_0 = null;

        AntlrDatatypeRuleToken lv_val_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1772:2: ( (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:1773:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:1773:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:1774:3: otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1782:3: ( (lv_prop_2_0= ruleFactProperty ) )
            // InternalAdaptDsl.g:1783:4: (lv_prop_2_0= ruleFactProperty )
            {
            // InternalAdaptDsl.g:1783:4: (lv_prop_2_0= ruleFactProperty )
            // InternalAdaptDsl.g:1784:5: lv_prop_2_0= ruleFactProperty
            {

            					newCompositeNode(grammarAccess.getEditFactOperationAccess().getPropFactPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
            lv_prop_2_0=ruleFactProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEditFactOperationRule());
            					}
            					set(
            						current,
            						"prop",
            						lv_prop_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FactProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1801:3: (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:1802:4: otherlv_3= ',' ( (lv_val_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalAdaptDsl.g:1806:4: ( (lv_val_4_0= ruleValue ) )
                    // InternalAdaptDsl.g:1807:5: (lv_val_4_0= ruleValue )
                    {
                    // InternalAdaptDsl.g:1807:5: (lv_val_4_0= ruleValue )
                    // InternalAdaptDsl.g:1808:6: lv_val_4_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getEditFactOperationAccess().getValValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_val_4_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEditFactOperationRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_4_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleEditFactOperation"


    // $ANTLR start "entryRuleSetDisplayPropertyOperation"
    // InternalAdaptDsl.g:1838:1: entryRuleSetDisplayPropertyOperation returns [EObject current=null] : iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF ;
    public final EObject entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDisplayPropertyOperation = null;


        try {
            // InternalAdaptDsl.g:1838:68: (iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptDsl.g:1839:2: iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF
            {
             newCompositeNode(grammarAccess.getSetDisplayPropertyOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetDisplayPropertyOperation=ruleSetDisplayPropertyOperation();

            state._fsp--;

             current =iv_ruleSetDisplayPropertyOperation; 
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
    // $ANTLR end "entryRuleSetDisplayPropertyOperation"


    // $ANTLR start "ruleSetDisplayPropertyOperation"
    // InternalAdaptDsl.g:1845:1: ruleSetDisplayPropertyOperation returns [EObject current=null] : (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleSetDisplayPropertyOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_propertyValue_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1851:2: ( (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:1852:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:1852:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:1853:3: otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1861:3: ( (lv_property_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:1862:4: (lv_property_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:1862:4: (lv_property_2_0= RULE_STRING )
            // InternalAdaptDsl.g:1863:5: lv_property_2_0= RULE_STRING
            {
            lv_property_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_property_2_0, grammarAccess.getSetDisplayPropertyOperationAccess().getPropertySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetDisplayPropertyOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:1883:3: ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:1884:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:1884:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:1885:5: lv_propertyValue_4_0= ruleDisplayPropertyValue
            {

            					newCompositeNode(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueDisplayPropertyValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_propertyValue_4_0=ruleDisplayPropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetDisplayPropertyOperationRule());
            					}
            					set(
            						current,
            						"propertyValue",
            						lv_propertyValue_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.DisplayPropertyValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleSetDisplayPropertyOperation"


    // $ANTLR start "entryRuleDisplayPropertyValue"
    // InternalAdaptDsl.g:1914:1: entryRuleDisplayPropertyValue returns [EObject current=null] : iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF ;
    public final EObject entryRuleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayPropertyValue = null;


        try {
            // InternalAdaptDsl.g:1914:61: (iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF )
            // InternalAdaptDsl.g:1915:2: iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getDisplayPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplayPropertyValue=ruleDisplayPropertyValue();

            state._fsp--;

             current =iv_ruleDisplayPropertyValue; 
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
    // $ANTLR end "entryRuleDisplayPropertyValue"


    // $ANTLR start "ruleDisplayPropertyValue"
    // InternalAdaptDsl.g:1921:1: ruleDisplayPropertyValue returns [EObject current=null] : ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) ;
    public final EObject ruleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyClass_0_0 = null;

        EObject lv_propertyClass_1_0 = null;

        EObject lv_propertyClass_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1927:2: ( ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) )
            // InternalAdaptDsl.g:1928:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            {
            // InternalAdaptDsl.g:1928:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
                {
                alt25=2;
                }
                break;
            case RULE_BOOL:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAdaptDsl.g:1929:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    {
                    // InternalAdaptDsl.g:1929:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    // InternalAdaptDsl.g:1930:4: (lv_propertyClass_0_0= ruleIntValue )
                    {
                    // InternalAdaptDsl.g:1930:4: (lv_propertyClass_0_0= ruleIntValue )
                    // InternalAdaptDsl.g:1931:5: lv_propertyClass_0_0= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassIntValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyClass_0_0=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDisplayPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"propertyClass",
                    						lv_propertyClass_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1949:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    {
                    // InternalAdaptDsl.g:1949:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    // InternalAdaptDsl.g:1950:4: (lv_propertyClass_1_0= ruleStringValue )
                    {
                    // InternalAdaptDsl.g:1950:4: (lv_propertyClass_1_0= ruleStringValue )
                    // InternalAdaptDsl.g:1951:5: lv_propertyClass_1_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassStringValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyClass_1_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDisplayPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"propertyClass",
                    						lv_propertyClass_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1969:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    {
                    // InternalAdaptDsl.g:1969:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    // InternalAdaptDsl.g:1970:4: (lv_propertyClass_2_0= ruleBoolValue )
                    {
                    // InternalAdaptDsl.g:1970:4: (lv_propertyClass_2_0= ruleBoolValue )
                    // InternalAdaptDsl.g:1971:5: lv_propertyClass_2_0= ruleBoolValue
                    {

                    					newCompositeNode(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassBoolValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyClass_2_0=ruleBoolValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDisplayPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"propertyClass",
                    						lv_propertyClass_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.BoolValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleDisplayPropertyValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalAdaptDsl.g:1992:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAdaptDsl.g:1992:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAdaptDsl.g:1993:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalAdaptDsl.g:1999:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2005:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:2006:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:2006:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAdaptDsl.g:2007:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAdaptDsl.g:2007:3: (lv_value_0_0= RULE_INT )
            // InternalAdaptDsl.g:2008:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalAdaptDsl.g:2027:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAdaptDsl.g:2027:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAdaptDsl.g:2028:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalAdaptDsl.g:2034:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2040:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:2041:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:2041:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2042:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2042:3: (lv_value_0_0= RULE_STRING )
            // InternalAdaptDsl.g:2043:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalAdaptDsl.g:2062:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalAdaptDsl.g:2062:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalAdaptDsl.g:2063:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
             newCompositeNode(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;

             current =iv_ruleBoolValue; 
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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalAdaptDsl.g:2069:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2075:2: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // InternalAdaptDsl.g:2076:2: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // InternalAdaptDsl.g:2076:2: ( (lv_value_0_0= RULE_BOOL ) )
            // InternalAdaptDsl.g:2077:3: (lv_value_0_0= RULE_BOOL )
            {
            // InternalAdaptDsl.g:2077:3: (lv_value_0_0= RULE_BOOL )
            // InternalAdaptDsl.g:2078:4: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBoolValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.adaptdsl.AdaptDsl.BOOL");
            			

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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleTaskChangeOperation"
    // InternalAdaptDsl.g:2097:1: entryRuleTaskChangeOperation returns [EObject current=null] : iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF ;
    public final EObject entryRuleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2097:60: (iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:2098:2: iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getTaskChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskChangeOperation=ruleTaskChangeOperation();

            state._fsp--;

             current =iv_ruleTaskChangeOperation; 
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
    // InternalAdaptDsl.g:2104:1: ruleTaskChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) ) ;
    public final EObject ruleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2110:2: ( ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) ) )
            // InternalAdaptDsl.g:2111:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) )
            {
            // InternalAdaptDsl.g:2111:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt26=1;
                }
                break;
            case 46:
                {
                alt26=2;
                }
                break;
            case 47:
                {
                alt26=3;
                }
                break;
            case 48:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAdaptDsl.g:2112:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2112:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    // InternalAdaptDsl.g:2113:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2113:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    // InternalAdaptDsl.g:2114:5: lv_operation_0_0= ruleAddViewComponentOperation
                    {

                    					newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleAddViewComponentOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AddViewComponentOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:2132:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2132:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    // InternalAdaptDsl.g:2133:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2133:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    // InternalAdaptDsl.g:2134:5: lv_operation_1_0= ruleDeleteViewComponentOperation
                    {

                    					newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleDeleteViewComponentOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.DeleteViewComponentOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:2152:3: ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) )
                    {
                    // InternalAdaptDsl.g:2152:3: ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) )
                    // InternalAdaptDsl.g:2153:4: (lv_operation_2_0= ruleAddViewComponentButtonOperation )
                    {
                    // InternalAdaptDsl.g:2153:4: (lv_operation_2_0= ruleAddViewComponentButtonOperation )
                    // InternalAdaptDsl.g:2154:5: lv_operation_2_0= ruleAddViewComponentButtonOperation
                    {

                    					newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentButtonOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleAddViewComponentButtonOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AddViewComponentButtonOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:2172:3: ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) )
                    {
                    // InternalAdaptDsl.g:2172:3: ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) )
                    // InternalAdaptDsl.g:2173:4: (lv_operation_3_0= ruleDeleteViewComponentButtonOperation )
                    {
                    // InternalAdaptDsl.g:2173:4: (lv_operation_3_0= ruleDeleteViewComponentButtonOperation )
                    // InternalAdaptDsl.g:2174:5: lv_operation_3_0= ruleDeleteViewComponentButtonOperation
                    {

                    					newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentButtonOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleDeleteViewComponentButtonOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.DeleteViewComponentButtonOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleTaskChangeOperation"


    // $ANTLR start "entryRuleAddViewComponentOperation"
    // InternalAdaptDsl.g:2195:1: entryRuleAddViewComponentOperation returns [EObject current=null] : iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF ;
    public final EObject entryRuleAddViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2195:66: (iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:2196:2: iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF
            {
             newCompositeNode(grammarAccess.getAddViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddViewComponentOperation=ruleAddViewComponentOperation();

            state._fsp--;

             current =iv_ruleAddViewComponentOperation; 
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
    // InternalAdaptDsl.g:2202:1: ruleAddViewComponentOperation returns [EObject current=null] : (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleAddViewComponentOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;

        AntlrDatatypeRuleToken lv_target_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2208:2: ( (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2209:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2209:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2210:3: otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2218:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2219:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2219:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2220:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddViewComponentOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2241:3: ( (lv_target_4_0= ruleTargetContainer ) )
            // InternalAdaptDsl.g:2242:4: (lv_target_4_0= ruleTargetContainer )
            {
            // InternalAdaptDsl.g:2242:4: (lv_target_4_0= ruleTargetContainer )
            // InternalAdaptDsl.g:2243:5: lv_target_4_0= ruleTargetContainer
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getTargetTargetContainerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_target_4_0=ruleTargetContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddViewComponentOperationRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.TargetContainer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6());
            		

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
    // InternalAdaptDsl.g:2272:1: entryRuleDeleteViewComponentOperation returns [EObject current=null] : iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF ;
    public final EObject entryRuleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2272:69: (iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:2273:2: iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteViewComponentOperation=ruleDeleteViewComponentOperation();

            state._fsp--;

             current =iv_ruleDeleteViewComponentOperation; 
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
    // InternalAdaptDsl.g:2279:1: ruleDeleteViewComponentOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2285:2: ( (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2286:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2286:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2287:3: otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2295:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2296:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2296:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2297:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteViewComponentOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleAddViewComponentButtonOperation"
    // InternalAdaptDsl.g:2326:1: entryRuleAddViewComponentButtonOperation returns [EObject current=null] : iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF ;
    public final EObject entryRuleAddViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentButtonOperation = null;


        try {
            // InternalAdaptDsl.g:2326:72: (iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:2327:2: iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF
            {
             newCompositeNode(grammarAccess.getAddViewComponentButtonOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddViewComponentButtonOperation=ruleAddViewComponentButtonOperation();

            state._fsp--;

             current =iv_ruleAddViewComponentButtonOperation; 
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
    // $ANTLR end "entryRuleAddViewComponentButtonOperation"


    // $ANTLR start "ruleAddViewComponentButtonOperation"
    // InternalAdaptDsl.g:2333:1: ruleAddViewComponentButtonOperation returns [EObject current=null] : (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleAddViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_langKey_4_0=null;
        Token otherlv_5=null;
        Token lv_action_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2339:2: ( (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:2340:2: (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:2340:2: (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:2341:3: otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentButtonOperationAccess().getAddViewComponentButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2349:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2350:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2350:4: (lv_id_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2351:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_id_2_0, grammarAccess.getAddViewComponentButtonOperationAccess().getIdSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddViewComponentButtonOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2371:3: ( (lv_langKey_4_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2372:4: (lv_langKey_4_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2372:4: (lv_langKey_4_0= RULE_STRING )
            // InternalAdaptDsl.g:2373:5: lv_langKey_4_0= RULE_STRING
            {
            lv_langKey_4_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_langKey_4_0, grammarAccess.getAddViewComponentButtonOperationAccess().getLangKeySTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddViewComponentButtonOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"langKey",
            						lv_langKey_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:2393:3: ( (lv_action_6_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2394:4: (lv_action_6_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2394:4: (lv_action_6_0= RULE_STRING )
            // InternalAdaptDsl.g:2395:5: lv_action_6_0= RULE_STRING
            {
            lv_action_6_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_action_6_0, grammarAccess.getAddViewComponentButtonOperationAccess().getActionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddViewComponentButtonOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getAddViewComponentButtonOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAddViewComponentButtonOperationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleAddViewComponentButtonOperation"


    // $ANTLR start "entryRuleDeleteViewComponentButtonOperation"
    // InternalAdaptDsl.g:2423:1: entryRuleDeleteViewComponentButtonOperation returns [EObject current=null] : iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF ;
    public final EObject entryRuleDeleteViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentButtonOperation = null;


        try {
            // InternalAdaptDsl.g:2423:75: (iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:2424:2: iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewComponentButtonOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteViewComponentButtonOperation=ruleDeleteViewComponentButtonOperation();

            state._fsp--;

             current =iv_ruleDeleteViewComponentButtonOperation; 
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
    // $ANTLR end "entryRuleDeleteViewComponentButtonOperation"


    // $ANTLR start "ruleDeleteViewComponentButtonOperation"
    // InternalAdaptDsl.g:2430:1: ruleDeleteViewComponentButtonOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2436:2: ( (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2437:2: (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2437:2: (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2438:3: otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentButtonOperationAccess().getDeleteViewComponentButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2446:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2447:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2447:4: (lv_id_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2448:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_id_2_0, grammarAccess.getDeleteViewComponentButtonOperationAccess().getIdSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteViewComponentButtonOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteViewComponentButtonOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteViewComponentButtonOperationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeleteViewComponentButtonOperation"


    // $ANTLR start "entryRuleViewComponent"
    // InternalAdaptDsl.g:2476:1: entryRuleViewComponent returns [String current=null] : iv_ruleViewComponent= ruleViewComponent EOF ;
    public final String entryRuleViewComponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleViewComponent = null;


        try {
            // InternalAdaptDsl.g:2476:53: (iv_ruleViewComponent= ruleViewComponent EOF )
            // InternalAdaptDsl.g:2477:2: iv_ruleViewComponent= ruleViewComponent EOF
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
    // InternalAdaptDsl.g:2483:1: ruleViewComponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleViewComponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2489:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2490:2: this_ID_0= RULE_ID
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
    // InternalAdaptDsl.g:2500:1: entryRuleTargetContainer returns [String current=null] : iv_ruleTargetContainer= ruleTargetContainer EOF ;
    public final String entryRuleTargetContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTargetContainer = null;


        try {
            // InternalAdaptDsl.g:2500:55: (iv_ruleTargetContainer= ruleTargetContainer EOF )
            // InternalAdaptDsl.g:2501:2: iv_ruleTargetContainer= ruleTargetContainer EOF
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
    // InternalAdaptDsl.g:2507:1: ruleTargetContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTargetContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2513:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2514:2: this_ID_0= RULE_ID
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
    // InternalAdaptDsl.g:2524:1: entryRuleNavigationChangeOperation returns [EObject current=null] : iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF ;
    public final EObject entryRuleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2524:66: (iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:2525:2: iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getNavigationChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationChangeOperation=ruleNavigationChangeOperation();

            state._fsp--;

             current =iv_ruleNavigationChangeOperation; 
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
    // InternalAdaptDsl.g:2531:1: ruleNavigationChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) ;
    public final EObject ruleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2537:2: ( ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) )
            // InternalAdaptDsl.g:2538:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            {
            // InternalAdaptDsl.g:2538:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt27=1;
                }
                break;
            case 50:
                {
                alt27=2;
                }
                break;
            case 51:
                {
                alt27=3;
                }
                break;
            case 52:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:2539:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2539:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    // InternalAdaptDsl.g:2540:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2540:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    // InternalAdaptDsl.g:2541:5: lv_operation_0_0= ruleAddNavLinkOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationAddNavLinkOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleAddNavLinkOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AddNavLinkOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:2559:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2559:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    // InternalAdaptDsl.g:2560:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2560:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    // InternalAdaptDsl.g:2561:5: lv_operation_1_0= ruleDeleteNavLinkOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationDeleteNavLinkOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleDeleteNavLinkOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.DeleteNavLinkOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:2579:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2579:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    // InternalAdaptDsl.g:2580:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2580:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    // InternalAdaptDsl.g:2581:5: lv_operation_2_0= ruleRedirectNavLinkOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationRedirectNavLinkOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleRedirectNavLinkOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.RedirectNavLinkOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:2599:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    {
                    // InternalAdaptDsl.g:2599:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    // InternalAdaptDsl.g:2600:4: (lv_operation_3_0= ruleClearNavOperation )
                    {
                    // InternalAdaptDsl.g:2600:4: (lv_operation_3_0= ruleClearNavOperation )
                    // InternalAdaptDsl.g:2601:5: lv_operation_3_0= ruleClearNavOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationClearNavOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleClearNavOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ClearNavOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleNavigationChangeOperation"


    // $ANTLR start "entryRuleAddNavLinkOperation"
    // InternalAdaptDsl.g:2622:1: entryRuleAddNavLinkOperation returns [EObject current=null] : iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF ;
    public final EObject entryRuleAddNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2622:60: (iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:2623:2: iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getAddNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddNavLinkOperation=ruleAddNavLinkOperation();

            state._fsp--;

             current =iv_ruleAddNavLinkOperation; 
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
    // InternalAdaptDsl.g:2629:1: ruleAddNavLinkOperation returns [EObject current=null] : (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleAddNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2635:2: ( (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2636:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2636:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2637:3: otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2645:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2646:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2646:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2647:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddNavLinkOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2668:3: ( (lv_text_4_0= ruleText ) )
            // InternalAdaptDsl.g:2669:4: (lv_text_4_0= ruleText )
            {
            // InternalAdaptDsl.g:2669:4: (lv_text_4_0= ruleText )
            // InternalAdaptDsl.g:2670:5: lv_text_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getTextTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_text_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddNavLinkOperationRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6());
            		

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
    // InternalAdaptDsl.g:2699:1: entryRuleDeleteNavLinkOperation returns [EObject current=null] : iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF ;
    public final EObject entryRuleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2699:63: (iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:2700:2: iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteNavLinkOperation=ruleDeleteNavLinkOperation();

            state._fsp--;

             current =iv_ruleDeleteNavLinkOperation; 
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
    // InternalAdaptDsl.g:2706:1: ruleDeleteNavLinkOperation returns [EObject current=null] : (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2712:2: ( (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2713:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2713:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2714:3: otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2722:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2723:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2723:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2724:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteNavLinkOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4());
            		

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
    // InternalAdaptDsl.g:2753:1: entryRuleRedirectNavLinkOperation returns [EObject current=null] : iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF ;
    public final EObject entryRuleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirectNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2753:65: (iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:2754:2: iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getRedirectNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedirectNavLinkOperation=ruleRedirectNavLinkOperation();

            state._fsp--;

             current =iv_ruleRedirectNavLinkOperation; 
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
    // InternalAdaptDsl.g:2760:1: ruleRedirectNavLinkOperation returns [EObject current=null] : (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2766:2: ( (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2767:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2767:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2768:3: otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2776:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2777:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2777:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2778:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedirectNavLinkOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleClearNavOperation"
    // InternalAdaptDsl.g:2807:1: entryRuleClearNavOperation returns [EObject current=null] : iv_ruleClearNavOperation= ruleClearNavOperation EOF ;
    public final EObject entryRuleClearNavOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearNavOperation = null;


        try {
            // InternalAdaptDsl.g:2807:58: (iv_ruleClearNavOperation= ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:2808:2: iv_ruleClearNavOperation= ruleClearNavOperation EOF
            {
             newCompositeNode(grammarAccess.getClearNavOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClearNavOperation=ruleClearNavOperation();

            state._fsp--;

             current =iv_ruleClearNavOperation; 
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
    // $ANTLR end "entryRuleClearNavOperation"


    // $ANTLR start "ruleClearNavOperation"
    // InternalAdaptDsl.g:2814:1: ruleClearNavOperation returns [EObject current=null] : ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) ;
    public final EObject ruleClearNavOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2820:2: ( ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) )
            // InternalAdaptDsl.g:2821:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:2821:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            // InternalAdaptDsl.g:2822:3: () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';'
            {
            // InternalAdaptDsl.g:2822:3: ()
            // InternalAdaptDsl.g:2823:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleClearNavOperation"


    // $ANTLR start "entryRuleText"
    // InternalAdaptDsl.g:2845:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalAdaptDsl.g:2845:44: (iv_ruleText= ruleText EOF )
            // InternalAdaptDsl.g:2846:2: iv_ruleText= ruleText EOF
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
    // InternalAdaptDsl.g:2852:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2858:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:2859:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:2869:1: entryRuleLayoutChangeOperation returns [EObject current=null] : iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF ;
    public final EObject entryRuleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2869:62: (iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:2870:2: iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getLayoutChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutChangeOperation=ruleLayoutChangeOperation();

            state._fsp--;

             current =iv_ruleLayoutChangeOperation; 
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
    // InternalAdaptDsl.g:2876:1: ruleLayoutChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) ;
    public final EObject ruleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;

        EObject lv_operation_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2882:2: ( ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) )
            // InternalAdaptDsl.g:2883:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            {
            // InternalAdaptDsl.g:2883:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt28=1;
                }
                break;
            case 53:
                {
                alt28=2;
                }
                break;
            case 56:
                {
                alt28=3;
                }
                break;
            case 57:
                {
                alt28=4;
                }
                break;
            case 54:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAdaptDsl.g:2884:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    {
                    // InternalAdaptDsl.g:2884:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    // InternalAdaptDsl.g:2885:4: (lv_operation_0_0= ruleChangeFontOperation )
                    {
                    // InternalAdaptDsl.g:2885:4: (lv_operation_0_0= ruleChangeFontOperation )
                    // InternalAdaptDsl.g:2886:5: lv_operation_0_0= ruleChangeFontOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleChangeFontOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeFontOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:2904:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    {
                    // InternalAdaptDsl.g:2904:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    // InternalAdaptDsl.g:2905:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    {
                    // InternalAdaptDsl.g:2905:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    // InternalAdaptDsl.g:2906:5: lv_operation_1_0= ruleChangeFontSizeOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontSizeOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleChangeFontSizeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeFontSizeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:2924:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:2924:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    // InternalAdaptDsl.g:2925:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    {
                    // InternalAdaptDsl.g:2925:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    // InternalAdaptDsl.g:2926:5: lv_operation_2_0= ruleChangeTableCssClassOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeTableCssClassOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleChangeTableCssClassOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeTableCssClassOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:2944:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:2944:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    // InternalAdaptDsl.g:2945:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    {
                    // InternalAdaptDsl.g:2945:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    // InternalAdaptDsl.g:2946:5: lv_operation_3_0= ruleAdaptCssClassOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationAdaptCssClassOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleAdaptCssClassOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AdaptCssClassOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:2964:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    {
                    // InternalAdaptDsl.g:2964:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    // InternalAdaptDsl.g:2965:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    {
                    // InternalAdaptDsl.g:2965:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    // InternalAdaptDsl.g:2966:5: lv_operation_4_0= ruleChangeColorSchemeOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeColorSchemeOperationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_4_0=ruleChangeColorSchemeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_4_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeColorSchemeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleLayoutChangeOperation"


    // $ANTLR start "entryRuleChangeFontSizeOperation"
    // InternalAdaptDsl.g:2987:1: entryRuleChangeFontSizeOperation returns [EObject current=null] : iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF ;
    public final EObject entryRuleChangeFontSizeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontSizeOperation = null;


        try {
            // InternalAdaptDsl.g:2987:64: (iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:2988:2: iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeFontSizeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeFontSizeOperation=ruleChangeFontSizeOperation();

            state._fsp--;

             current =iv_ruleChangeFontSizeOperation; 
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
    // InternalAdaptDsl.g:2994:1: ruleChangeFontSizeOperation returns [EObject current=null] : (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleChangeFontSizeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_sizePrimary_2_0 = null;

        AntlrDatatypeRuleToken lv_sizeSecondary_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3000:2: ( (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3001:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3001:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:3002:3: otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3010:3: ( (lv_sizePrimary_2_0= ruleFontSize ) )
            // InternalAdaptDsl.g:3011:4: (lv_sizePrimary_2_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:3011:4: (lv_sizePrimary_2_0= ruleFontSize )
            // InternalAdaptDsl.g:3012:5: lv_sizePrimary_2_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryFontSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_sizePrimary_2_0=ruleFontSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeFontSizeOperationRule());
            					}
            					set(
            						current,
            						"sizePrimary",
            						lv_sizePrimary_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FontSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3033:3: ( (lv_sizeSecondary_4_0= ruleFontSize ) )
            // InternalAdaptDsl.g:3034:4: (lv_sizeSecondary_4_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:3034:4: (lv_sizeSecondary_4_0= ruleFontSize )
            // InternalAdaptDsl.g:3035:5: lv_sizeSecondary_4_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryFontSizeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_sizeSecondary_4_0=ruleFontSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeFontSizeOperationRule());
            					}
            					set(
            						current,
            						"sizeSecondary",
            						lv_sizeSecondary_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FontSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6());
            		

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


    // $ANTLR start "entryRuleChangeColorSchemeOperation"
    // InternalAdaptDsl.g:3064:1: entryRuleChangeColorSchemeOperation returns [EObject current=null] : iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF ;
    public final EObject entryRuleChangeColorSchemeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeColorSchemeOperation = null;


        try {
            // InternalAdaptDsl.g:3064:67: (iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:3065:2: iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeColorSchemeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeColorSchemeOperation=ruleChangeColorSchemeOperation();

            state._fsp--;

             current =iv_ruleChangeColorSchemeOperation; 
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
    // $ANTLR end "entryRuleChangeColorSchemeOperation"


    // $ANTLR start "ruleChangeColorSchemeOperation"
    // InternalAdaptDsl.g:3071:1: ruleChangeColorSchemeOperation returns [EObject current=null] : (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleChangeColorSchemeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_colorPrimary_2_0 = null;

        AntlrDatatypeRuleToken lv_colorSecondary_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3077:2: ( (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3078:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3078:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:3079:3: otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3087:3: ( (lv_colorPrimary_2_0= ruleColor ) )
            // InternalAdaptDsl.g:3088:4: (lv_colorPrimary_2_0= ruleColor )
            {
            // InternalAdaptDsl.g:3088:4: (lv_colorPrimary_2_0= ruleColor )
            // InternalAdaptDsl.g:3089:5: lv_colorPrimary_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_colorPrimary_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeColorSchemeOperationRule());
            					}
            					set(
            						current,
            						"colorPrimary",
            						lv_colorPrimary_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3110:3: ( (lv_colorSecondary_4_0= ruleColor ) )
            // InternalAdaptDsl.g:3111:4: (lv_colorSecondary_4_0= ruleColor )
            {
            // InternalAdaptDsl.g:3111:4: (lv_colorSecondary_4_0= ruleColor )
            // InternalAdaptDsl.g:3112:5: lv_colorSecondary_4_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryColorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_colorSecondary_4_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeColorSchemeOperationRule());
            					}
            					set(
            						current,
            						"colorSecondary",
            						lv_colorSecondary_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleChangeColorSchemeOperation"


    // $ANTLR start "entryRuleChangeFontOperation"
    // InternalAdaptDsl.g:3141:1: entryRuleChangeFontOperation returns [EObject current=null] : iv_ruleChangeFontOperation= ruleChangeFontOperation EOF ;
    public final EObject entryRuleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontOperation = null;


        try {
            // InternalAdaptDsl.g:3141:60: (iv_ruleChangeFontOperation= ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:3142:2: iv_ruleChangeFontOperation= ruleChangeFontOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeFontOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeFontOperation=ruleChangeFontOperation();

            state._fsp--;

             current =iv_ruleChangeFontOperation; 
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
    // InternalAdaptDsl.g:3148:1: ruleChangeFontOperation returns [EObject current=null] : (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3154:2: ( (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:3155:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:3155:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:3156:3: otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3164:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:3165:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:3165:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:3166:5: lv_text_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getChangeFontOperationAccess().getTextTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_text_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeFontOperationRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4());
            		

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
    // InternalAdaptDsl.g:3195:1: entryRuleChangeTableCssClassOperation returns [EObject current=null] : iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF ;
    public final EObject entryRuleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTableCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:3195:69: (iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:3196:2: iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeTableCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeTableCssClassOperation=ruleChangeTableCssClassOperation();

            state._fsp--;

             current =iv_ruleChangeTableCssClassOperation; 
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
    // InternalAdaptDsl.g:3202:1: ruleChangeTableCssClassOperation returns [EObject current=null] : (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3208:2: ( (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:3209:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:3209:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:3210:3: otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3218:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:3219:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:3219:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:3220:5: lv_text_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getChangeTableCssClassOperationAccess().getTextTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_text_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeTableCssClassOperationRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleAdaptCssClassOperation"
    // InternalAdaptDsl.g:3249:1: entryRuleAdaptCssClassOperation returns [EObject current=null] : iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF ;
    public final EObject entryRuleAdaptCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:3249:63: (iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:3250:2: iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF
            {
             newCompositeNode(grammarAccess.getAdaptCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptCssClassOperation=ruleAdaptCssClassOperation();

            state._fsp--;

             current =iv_ruleAdaptCssClassOperation; 
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
    // $ANTLR end "entryRuleAdaptCssClassOperation"


    // $ANTLR start "ruleAdaptCssClassOperation"
    // InternalAdaptDsl.g:3256:1: ruleAdaptCssClassOperation returns [EObject current=null] : (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleAdaptCssClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_cssClass_2_0 = null;

        AntlrDatatypeRuleToken lv_cssAttribute_4_0 = null;

        AntlrDatatypeRuleToken lv_cssAttributeValue_6_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3262:2: ( (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:3263:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:3263:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:3264:3: otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3272:3: ( (lv_cssClass_2_0= ruleCssClass ) )
            // InternalAdaptDsl.g:3273:4: (lv_cssClass_2_0= ruleCssClass )
            {
            // InternalAdaptDsl.g:3273:4: (lv_cssClass_2_0= ruleCssClass )
            // InternalAdaptDsl.g:3274:5: lv_cssClass_2_0= ruleCssClass
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssClassCssClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_cssClass_2_0=ruleCssClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptCssClassOperationRule());
            					}
            					set(
            						current,
            						"cssClass",
            						lv_cssClass_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.CssClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3295:3: ( (lv_cssAttribute_4_0= ruleAttribute ) )
            // InternalAdaptDsl.g:3296:4: (lv_cssAttribute_4_0= ruleAttribute )
            {
            // InternalAdaptDsl.g:3296:4: (lv_cssAttribute_4_0= ruleAttribute )
            // InternalAdaptDsl.g:3297:5: lv_cssAttribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_41);
            lv_cssAttribute_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptCssClassOperationRule());
            					}
            					set(
            						current,
            						"cssAttribute",
            						lv_cssAttribute_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:3318:3: ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) )
            // InternalAdaptDsl.g:3319:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            {
            // InternalAdaptDsl.g:3319:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            // InternalAdaptDsl.g:3320:5: lv_cssAttributeValue_6_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAttributeValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_cssAttributeValue_6_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptCssClassOperationRule());
            					}
            					set(
            						current,
            						"cssAttributeValue",
            						lv_cssAttributeValue_6_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleAdaptCssClassOperation"


    // $ANTLR start "entryRuleCssClass"
    // InternalAdaptDsl.g:3349:1: entryRuleCssClass returns [String current=null] : iv_ruleCssClass= ruleCssClass EOF ;
    public final String entryRuleCssClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCssClass = null;


        try {
            // InternalAdaptDsl.g:3349:48: (iv_ruleCssClass= ruleCssClass EOF )
            // InternalAdaptDsl.g:3350:2: iv_ruleCssClass= ruleCssClass EOF
            {
             newCompositeNode(grammarAccess.getCssClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCssClass=ruleCssClass();

            state._fsp--;

             current =iv_ruleCssClass.getText(); 
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
    // $ANTLR end "entryRuleCssClass"


    // $ANTLR start "ruleCssClass"
    // InternalAdaptDsl.g:3356:1: ruleCssClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCssClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3362:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3363:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getCssClassAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleCssClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalAdaptDsl.g:3373:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // InternalAdaptDsl.g:3373:49: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalAdaptDsl.g:3374:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute.getText(); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalAdaptDsl.g:3380:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3386:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3387:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalAdaptDsl.g:3397:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalAdaptDsl.g:3397:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalAdaptDsl.g:3398:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue.getText(); 
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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalAdaptDsl.g:3404:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3410:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3411:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleColor"
    // InternalAdaptDsl.g:3421:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalAdaptDsl.g:3421:45: (iv_ruleColor= ruleColor EOF )
            // InternalAdaptDsl.g:3422:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalAdaptDsl.g:3428:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3434:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3435:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getColorAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleFontSize"
    // InternalAdaptDsl.g:3445:1: entryRuleFontSize returns [String current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final String entryRuleFontSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFontSize = null;


        try {
            // InternalAdaptDsl.g:3445:48: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalAdaptDsl.g:3446:2: iv_ruleFontSize= ruleFontSize EOF
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
    // InternalAdaptDsl.g:3452:1: ruleFontSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleFontSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3458:2: (this_INT_0= RULE_INT )
            // InternalAdaptDsl.g:3459:2: this_INT_0= RULE_INT
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


    // $ANTLR start "entryRuleValue"
    // InternalAdaptDsl.g:3469:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalAdaptDsl.g:3469:45: (iv_ruleValue= ruleValue EOF )
            // InternalAdaptDsl.g:3470:2: iv_ruleValue= ruleValue EOF
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
    // InternalAdaptDsl.g:3476:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_BOOL_2=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3482:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) )
            // InternalAdaptDsl.g:3483:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            {
            // InternalAdaptDsl.g:3483:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt29=1;
                }
                break;
            case RULE_STRING:
                {
                alt29=2;
                }
                break;
            case RULE_BOOL:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalAdaptDsl.g:3484:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:3492:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:3500:3: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			current.merge(this_BOOL_2);
                    		

                    			newLeafNode(this_BOOL_2, grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2());
                    		

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


    // $ANTLR start "entryRuleEntity"
    // InternalAdaptDsl.g:3511:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAdaptDsl.g:3511:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAdaptDsl.g:3512:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAdaptDsl.g:3518:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3524:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // InternalAdaptDsl.g:3525:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // InternalAdaptDsl.g:3525:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}' )
            // InternalAdaptDsl.g:3526:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalAdaptDsl.g:3530:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:3531:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3531:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptDsl.g:3532:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdaptDsl.g:3552:3: ( (lv_property_3_0= ruleProperty ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==59) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAdaptDsl.g:3553:4: (lv_property_3_0= ruleProperty )
            	    {
            	    // InternalAdaptDsl.g:3553:4: (lv_property_3_0= ruleProperty )
            	    // InternalAdaptDsl.g:3554:5: lv_property_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertyPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_property_3_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"property",
            	    						lv_property_3_0,
            	    						"org.xtext.example.adaptdsl.AdaptDsl.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalAdaptDsl.g:3579:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAdaptDsl.g:3579:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAdaptDsl.g:3580:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalAdaptDsl.g:3586:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTYPE ) ) otherlv_4= 'from' ( (lv_provider_5_0= ruleProvider ) ) otherlv_6= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_provider_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3592:2: ( (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTYPE ) ) otherlv_4= 'from' ( (lv_provider_5_0= ruleProvider ) ) otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3593:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTYPE ) ) otherlv_4= 'from' ( (lv_provider_5_0= ruleProvider ) ) otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3593:2: (otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTYPE ) ) otherlv_4= 'from' ( (lv_provider_5_0= ruleProvider ) ) otherlv_6= ';' )
            // InternalAdaptDsl.g:3594:3: otherlv_0= 'name' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTYPE ) ) otherlv_4= 'from' ( (lv_provider_5_0= ruleProvider ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getNameKeyword_0());
            		
            // InternalAdaptDsl.g:3598:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdaptDsl.g:3599:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:3599:4: (lv_name_1_0= RULE_STRING )
            // InternalAdaptDsl.g:3600:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,60,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getColonKeyword_2());
            		
            // InternalAdaptDsl.g:3620:3: ( (lv_type_3_0= ruleTYPE ) )
            // InternalAdaptDsl.g:3621:4: (lv_type_3_0= ruleTYPE )
            {
            // InternalAdaptDsl.g:3621:4: (lv_type_3_0= ruleTYPE )
            // InternalAdaptDsl.g:3622:5: lv_type_3_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTYPEEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_3_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getFromKeyword_4());
            		
            // InternalAdaptDsl.g:3643:3: ( (lv_provider_5_0= ruleProvider ) )
            // InternalAdaptDsl.g:3644:4: (lv_provider_5_0= ruleProvider )
            {
            // InternalAdaptDsl.g:3644:4: (lv_provider_5_0= ruleProvider )
            // InternalAdaptDsl.g:3645:5: lv_provider_5_0= ruleProvider
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getProviderProviderParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_provider_5_0=ruleProvider();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"provider",
            						lv_provider_5_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Provider");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleProvider"
    // InternalAdaptDsl.g:3670:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalAdaptDsl.g:3670:49: (iv_ruleProvider= ruleProvider EOF )
            // InternalAdaptDsl.g:3671:2: iv_ruleProvider= ruleProvider EOF
            {
             newCompositeNode(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvider=ruleProvider();

            state._fsp--;

             current =iv_ruleProvider; 
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
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalAdaptDsl.g:3677:1: ruleProvider returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3683:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:3684:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:3684:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:3685:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:3685:3: (lv_name_0_0= RULE_STRING )
            // InternalAdaptDsl.g:3686:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProviderAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProviderRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleDefTypes"
    // InternalAdaptDsl.g:3705:1: entryRuleDefTypes returns [EObject current=null] : iv_ruleDefTypes= ruleDefTypes EOF ;
    public final EObject entryRuleDefTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefTypes = null;


        try {
            // InternalAdaptDsl.g:3705:49: (iv_ruleDefTypes= ruleDefTypes EOF )
            // InternalAdaptDsl.g:3706:2: iv_ruleDefTypes= ruleDefTypes EOF
            {
             newCompositeNode(grammarAccess.getDefTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefTypes=ruleDefTypes();

            state._fsp--;

             current =iv_ruleDefTypes; 
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
    // $ANTLR end "entryRuleDefTypes"


    // $ANTLR start "ruleDefTypes"
    // InternalAdaptDsl.g:3712:1: ruleDefTypes returns [EObject current=null] : ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? ) ;
    public final EObject ruleDefTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3718:2: ( ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? ) )
            // InternalAdaptDsl.g:3719:2: ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? )
            {
            // InternalAdaptDsl.g:3719:2: ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? )
            // InternalAdaptDsl.g:3720:3: ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )?
            {
            // InternalAdaptDsl.g:3720:3: ( (lv_this_0_0= ruleDefType ) )
            // InternalAdaptDsl.g:3721:4: (lv_this_0_0= ruleDefType )
            {
            // InternalAdaptDsl.g:3721:4: (lv_this_0_0= ruleDefType )
            // InternalAdaptDsl.g:3722:5: lv_this_0_0= ruleDefType
            {

            					newCompositeNode(grammarAccess.getDefTypesAccess().getThisDefTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_47);
            lv_this_0_0=ruleDefType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefTypesRule());
            					}
            					set(
            						current,
            						"this",
            						lv_this_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.DefType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:3739:3: ( (lv_next_1_0= ruleDefTypes ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdaptDsl.g:3740:4: (lv_next_1_0= ruleDefTypes )
                    {
                    // InternalAdaptDsl.g:3740:4: (lv_next_1_0= ruleDefTypes )
                    // InternalAdaptDsl.g:3741:5: lv_next_1_0= ruleDefTypes
                    {

                    					newCompositeNode(grammarAccess.getDefTypesAccess().getNextDefTypesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleDefTypes();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDefTypesRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.DefTypes");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDefTypes"


    // $ANTLR start "entryRuleDefType"
    // InternalAdaptDsl.g:3762:1: entryRuleDefType returns [EObject current=null] : iv_ruleDefType= ruleDefType EOF ;
    public final EObject entryRuleDefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefType = null;


        try {
            // InternalAdaptDsl.g:3762:48: (iv_ruleDefType= ruleDefType EOF )
            // InternalAdaptDsl.g:3763:2: iv_ruleDefType= ruleDefType EOF
            {
             newCompositeNode(grammarAccess.getDefTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefType=ruleDefType();

            state._fsp--;

             current =iv_ruleDefType; 
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
    // $ANTLR end "entryRuleDefType"


    // $ANTLR start "ruleDefType"
    // InternalAdaptDsl.g:3769:1: ruleDefType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' ) ;
    public final EObject ruleDefType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_enums_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3775:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' ) )
            // InternalAdaptDsl.g:3776:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:3776:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' )
            // InternalAdaptDsl.g:3777:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';'
            {
            // InternalAdaptDsl.g:3777:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3778:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3778:4: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3779:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDefTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDefTypeAccess().getColonKeyword_1());
            		
            // InternalAdaptDsl.g:3799:3: ( (lv_enums_2_0= ruleEnums ) )
            // InternalAdaptDsl.g:3800:4: (lv_enums_2_0= ruleEnums )
            {
            // InternalAdaptDsl.g:3800:4: (lv_enums_2_0= ruleEnums )
            // InternalAdaptDsl.g:3801:5: lv_enums_2_0= ruleEnums
            {

            					newCompositeNode(grammarAccess.getDefTypeAccess().getEnumsEnumsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_enums_2_0=ruleEnums();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefTypeRule());
            					}
            					set(
            						current,
            						"enums",
            						lv_enums_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Enums");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDefTypeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDefType"


    // $ANTLR start "entryRuleEnums"
    // InternalAdaptDsl.g:3826:1: entryRuleEnums returns [EObject current=null] : iv_ruleEnums= ruleEnums EOF ;
    public final EObject entryRuleEnums() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnums = null;


        try {
            // InternalAdaptDsl.g:3826:46: (iv_ruleEnums= ruleEnums EOF )
            // InternalAdaptDsl.g:3827:2: iv_ruleEnums= ruleEnums EOF
            {
             newCompositeNode(grammarAccess.getEnumsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnums=ruleEnums();

            state._fsp--;

             current =iv_ruleEnums; 
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
    // $ANTLR end "entryRuleEnums"


    // $ANTLR start "ruleEnums"
    // InternalAdaptDsl.g:3833:1: ruleEnums returns [EObject current=null] : ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? ) ;
    public final EObject ruleEnums() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_this_0_0 = null;

        EObject lv_next_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3839:2: ( ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? ) )
            // InternalAdaptDsl.g:3840:2: ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? )
            {
            // InternalAdaptDsl.g:3840:2: ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? )
            // InternalAdaptDsl.g:3841:3: ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )?
            {
            // InternalAdaptDsl.g:3841:3: ( (lv_this_0_0= ruleEnum ) )
            // InternalAdaptDsl.g:3842:4: (lv_this_0_0= ruleEnum )
            {
            // InternalAdaptDsl.g:3842:4: (lv_this_0_0= ruleEnum )
            // InternalAdaptDsl.g:3843:5: lv_this_0_0= ruleEnum
            {

            					newCompositeNode(grammarAccess.getEnumsAccess().getThisEnumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
            lv_this_0_0=ruleEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumsRule());
            					}
            					set(
            						current,
            						"this",
            						lv_this_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Enum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:3860:3: (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==42) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAdaptDsl.g:3861:4: otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) )
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumsAccess().getCommaKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:3865:4: ( (lv_next_2_0= ruleEnums ) )
                    // InternalAdaptDsl.g:3866:5: (lv_next_2_0= ruleEnums )
                    {
                    // InternalAdaptDsl.g:3866:5: (lv_next_2_0= ruleEnums )
                    // InternalAdaptDsl.g:3867:6: lv_next_2_0= ruleEnums
                    {

                    						newCompositeNode(grammarAccess.getEnumsAccess().getNextEnumsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_next_2_0=ruleEnums();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumsRule());
                    						}
                    						set(
                    							current,
                    							"next",
                    							lv_next_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.Enums");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleEnums"


    // $ANTLR start "entryRuleEnum"
    // InternalAdaptDsl.g:3889:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalAdaptDsl.g:3889:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalAdaptDsl.g:3890:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // InternalAdaptDsl.g:3896:1: ruleEnum returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3902:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:3903:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:3903:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:3904:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:3904:3: (lv_name_0_0= RULE_STRING )
            // InternalAdaptDsl.g:3905:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEnumAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEnumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "ruleTYPE"
    // InternalAdaptDsl.g:3924:1: ruleTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'bool' ) ) ;
    public final Enumerator ruleTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3930:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'bool' ) ) )
            // InternalAdaptDsl.g:3931:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'bool' ) )
            {
            // InternalAdaptDsl.g:3931:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'bool' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt33=1;
                }
                break;
            case 62:
                {
                alt33=2;
                }
                break;
            case 63:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAdaptDsl.g:3932:3: (enumLiteral_0= 'string' )
                    {
                    // InternalAdaptDsl.g:3932:3: (enumLiteral_0= 'string' )
                    // InternalAdaptDsl.g:3933:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPEAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:3940:3: (enumLiteral_1= 'number' )
                    {
                    // InternalAdaptDsl.g:3940:3: (enumLiteral_1= 'number' )
                    // InternalAdaptDsl.g:3941:4: enumLiteral_1= 'number'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPEAccess().getNUMBEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:3948:3: (enumLiteral_2= 'bool' )
                    {
                    // InternalAdaptDsl.g:3948:3: (enumLiteral_2= 'bool' )
                    // InternalAdaptDsl.g:3949:4: enumLiteral_2= 'bool'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTYPEAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPEAccess().getBOOLEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTYPE"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\2\10\6\uffff\1\10\1\uffff\1\10";
    static final String dfa_3s = "\1\5\2\34\1\5\3\4\2\uffff\1\34\1\uffff\1\34";
    static final String dfa_4s = "\1\5\2\50\1\5\2\7\1\6\2\uffff\1\50\1\uffff\1\50";
    static final String dfa_5s = "\7\uffff\1\2\1\3\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\10\1\uffff\2\10\1\2\1\3\2\7\1\4\1\5\2\7\1\6",
            "\1\10\1\uffff\2\10\1\uffff\1\3\2\7\1\4\1\5\2\7\1\6",
            "\1\11",
            "\1\12\1\uffff\1\7\1\10",
            "\1\12\1\uffff\1\7\1\10",
            "\1\12\1\uffff\1\7",
            "",
            "",
            "\1\10\1\uffff\2\10\1\13\1\3\2\7\1\4\1\5\2\7\1\6",
            "",
            "\1\10\1\uffff\2\10\1\uffff\1\3\2\7\1\4\1\5\2\7\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "849:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\2\4\3\uffff\2\4";
    static final String dfa_10s = "\1\5\2\34\1\5\2\uffff\2\34";
    static final String dfa_11s = "\1\5\2\45\1\5\2\uffff\2\45";
    static final String dfa_12s = "\4\uffff\1\2\1\1\2\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\1\uffff\2\4\1\2\1\3\2\uffff\2\5",
            "\1\4\1\uffff\2\4\1\uffff\1\3\2\uffff\2\5",
            "\1\6",
            "",
            "",
            "\1\4\1\uffff\2\4\1\7\1\3\2\uffff\2\5",
            "\1\4\1\uffff\2\4\1\uffff\1\3\2\uffff\2\5"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "927:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x03FFFA0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001FC00000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000013000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x03FFFA0000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000002L});

}