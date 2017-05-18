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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContextModel{'", "'Providers{'", "';'", "'};'", "'DefTypes{'", "'AdaptationModel{'", "'flow'", "'{'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'.get'", "'()'", "'.'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "'provider'", "'update'", "':'", "'string'", "'number'", "'boolean'", "'eventTriggered'", "'slow'", "'fast'"
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
    // InternalAdaptDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_contextModel_0_0= ruleContextModel ) ) ( (lv_adaptationModel_1_0= ruleAdaptationModel ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contextModel_0_0 = null;

        EObject lv_adaptationModel_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:77:2: ( ( ( (lv_contextModel_0_0= ruleContextModel ) ) ( (lv_adaptationModel_1_0= ruleAdaptationModel ) ) ) )
            // InternalAdaptDsl.g:78:2: ( ( (lv_contextModel_0_0= ruleContextModel ) ) ( (lv_adaptationModel_1_0= ruleAdaptationModel ) ) )
            {
            // InternalAdaptDsl.g:78:2: ( ( (lv_contextModel_0_0= ruleContextModel ) ) ( (lv_adaptationModel_1_0= ruleAdaptationModel ) ) )
            // InternalAdaptDsl.g:79:3: ( (lv_contextModel_0_0= ruleContextModel ) ) ( (lv_adaptationModel_1_0= ruleAdaptationModel ) )
            {
            // InternalAdaptDsl.g:79:3: ( (lv_contextModel_0_0= ruleContextModel ) )
            // InternalAdaptDsl.g:80:4: (lv_contextModel_0_0= ruleContextModel )
            {
            // InternalAdaptDsl.g:80:4: (lv_contextModel_0_0= ruleContextModel )
            // InternalAdaptDsl.g:81:5: lv_contextModel_0_0= ruleContextModel
            {

            					newCompositeNode(grammarAccess.getModelAccess().getContextModelContextModelParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_contextModel_0_0=ruleContextModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"contextModel",
            						lv_contextModel_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ContextModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:98:3: ( (lv_adaptationModel_1_0= ruleAdaptationModel ) )
            // InternalAdaptDsl.g:99:4: (lv_adaptationModel_1_0= ruleAdaptationModel )
            {
            // InternalAdaptDsl.g:99:4: (lv_adaptationModel_1_0= ruleAdaptationModel )
            // InternalAdaptDsl.g:100:5: lv_adaptationModel_1_0= ruleAdaptationModel
            {

            					newCompositeNode(grammarAccess.getModelAccess().getAdaptationModelAdaptationModelParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_adaptationModel_1_0=ruleAdaptationModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"adaptationModel",
            						lv_adaptationModel_1_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.AdaptationModel");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleContextModel"
    // InternalAdaptDsl.g:121:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalAdaptDsl.g:121:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalAdaptDsl.g:122:2: iv_ruleContextModel= ruleContextModel EOF
            {
             newCompositeNode(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextModel=ruleContextModel();

            state._fsp--;

             current =iv_ruleContextModel; 
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
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalAdaptDsl.g:128:1: ruleContextModel returns [EObject current=null] : (otherlv_0= 'ContextModel{' ( (lv_entity_1_0= ruleEntity ) )+ (otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};' )? (otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};' )? otherlv_9= '};' ) ;
    public final EObject ruleContextModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_entity_1_0 = null;

        EObject lv_provider_3_0 = null;

        EObject lv_types_7_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:134:2: ( (otherlv_0= 'ContextModel{' ( (lv_entity_1_0= ruleEntity ) )+ (otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};' )? (otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};' )? otherlv_9= '};' ) )
            // InternalAdaptDsl.g:135:2: (otherlv_0= 'ContextModel{' ( (lv_entity_1_0= ruleEntity ) )+ (otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};' )? (otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};' )? otherlv_9= '};' )
            {
            // InternalAdaptDsl.g:135:2: (otherlv_0= 'ContextModel{' ( (lv_entity_1_0= ruleEntity ) )+ (otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};' )? (otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};' )? otherlv_9= '};' )
            // InternalAdaptDsl.g:136:3: otherlv_0= 'ContextModel{' ( (lv_entity_1_0= ruleEntity ) )+ (otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};' )? (otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};' )? otherlv_9= '};'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContextModelAccess().getContextModelKeyword_0());
            		
            // InternalAdaptDsl.g:140:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==61) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAdaptDsl.g:141:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalAdaptDsl.g:141:4: (lv_entity_1_0= ruleEntity )
            	    // InternalAdaptDsl.g:142:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entity_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_1_0,
            	    						"org.xtext.example.adaptdsl.AdaptDsl.Entity");
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

            // InternalAdaptDsl.g:159:3: (otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdaptDsl.g:160:4: otherlv_2= 'Providers{' ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )* otherlv_5= '};'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getContextModelAccess().getProvidersKeyword_2_0());
                    			
                    // InternalAdaptDsl.g:164:4: ( ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAdaptDsl.g:165:5: ( (lv_provider_3_0= ruleProvider ) ) otherlv_4= ';'
                    	    {
                    	    // InternalAdaptDsl.g:165:5: ( (lv_provider_3_0= ruleProvider ) )
                    	    // InternalAdaptDsl.g:166:6: (lv_provider_3_0= ruleProvider )
                    	    {
                    	    // InternalAdaptDsl.g:166:6: (lv_provider_3_0= ruleProvider )
                    	    // InternalAdaptDsl.g:167:7: lv_provider_3_0= ruleProvider
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextModelAccess().getProviderProviderParserRuleCall_2_1_0_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_provider_3_0=ruleProvider();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContextModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"provider",
                    	    								lv_provider_3_0,
                    	    								"org.xtext.example.adaptdsl.AdaptDsl.Provider");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getContextModelAccess().getSemicolonKeyword_2_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAdaptDsl.g:194:3: (otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAdaptDsl.g:195:4: otherlv_6= 'DefTypes{' ( (lv_types_7_0= ruleDefTypes ) ) otherlv_8= '};'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getContextModelAccess().getDefTypesKeyword_3_0());
                    			
                    // InternalAdaptDsl.g:199:4: ( (lv_types_7_0= ruleDefTypes ) )
                    // InternalAdaptDsl.g:200:5: (lv_types_7_0= ruleDefTypes )
                    {
                    // InternalAdaptDsl.g:200:5: (lv_types_7_0= ruleDefTypes )
                    // InternalAdaptDsl.g:201:6: lv_types_7_0= ruleDefTypes
                    {

                    						newCompositeNode(grammarAccess.getContextModelAccess().getTypesDefTypesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_types_7_0=ruleDefTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextModelRule());
                    						}
                    						set(
                    							current,
                    							"types",
                    							lv_types_7_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.DefTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContextModelAccess().getRightCurlyBracketSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleAdaptationModel"
    // InternalAdaptDsl.g:231:1: entryRuleAdaptationModel returns [EObject current=null] : iv_ruleAdaptationModel= ruleAdaptationModel EOF ;
    public final EObject entryRuleAdaptationModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationModel = null;


        try {
            // InternalAdaptDsl.g:231:56: (iv_ruleAdaptationModel= ruleAdaptationModel EOF )
            // InternalAdaptDsl.g:232:2: iv_ruleAdaptationModel= ruleAdaptationModel EOF
            {
             newCompositeNode(grammarAccess.getAdaptationModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptationModel=ruleAdaptationModel();

            state._fsp--;

             current =iv_ruleAdaptationModel; 
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
    // $ANTLR end "entryRuleAdaptationModel"


    // $ANTLR start "ruleAdaptationModel"
    // InternalAdaptDsl.g:238:1: ruleAdaptationModel returns [EObject current=null] : (otherlv_0= 'AdaptationModel{' ( (lv_services_1_0= ruleServices ) )? otherlv_2= 'flow' ( (lv_flowName_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_adaptationRules_5_0= ruleAdaptationRule ) )+ otherlv_6= '};' otherlv_7= '};' ) ;
    public final EObject ruleAdaptationModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_flowName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_services_1_0 = null;

        EObject lv_adaptationRules_5_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:244:2: ( (otherlv_0= 'AdaptationModel{' ( (lv_services_1_0= ruleServices ) )? otherlv_2= 'flow' ( (lv_flowName_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_adaptationRules_5_0= ruleAdaptationRule ) )+ otherlv_6= '};' otherlv_7= '};' ) )
            // InternalAdaptDsl.g:245:2: (otherlv_0= 'AdaptationModel{' ( (lv_services_1_0= ruleServices ) )? otherlv_2= 'flow' ( (lv_flowName_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_adaptationRules_5_0= ruleAdaptationRule ) )+ otherlv_6= '};' otherlv_7= '};' )
            {
            // InternalAdaptDsl.g:245:2: (otherlv_0= 'AdaptationModel{' ( (lv_services_1_0= ruleServices ) )? otherlv_2= 'flow' ( (lv_flowName_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_adaptationRules_5_0= ruleAdaptationRule ) )+ otherlv_6= '};' otherlv_7= '};' )
            // InternalAdaptDsl.g:246:3: otherlv_0= 'AdaptationModel{' ( (lv_services_1_0= ruleServices ) )? otherlv_2= 'flow' ( (lv_flowName_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_adaptationRules_5_0= ruleAdaptationRule ) )+ otherlv_6= '};' otherlv_7= '};'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptationModelAccess().getAdaptationModelKeyword_0());
            		
            // InternalAdaptDsl.g:250:3: ( (lv_services_1_0= ruleServices ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdaptDsl.g:251:4: (lv_services_1_0= ruleServices )
                    {
                    // InternalAdaptDsl.g:251:4: (lv_services_1_0= ruleServices )
                    // InternalAdaptDsl.g:252:5: lv_services_1_0= ruleServices
                    {

                    					newCompositeNode(grammarAccess.getAdaptationModelAccess().getServicesServicesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_services_1_0=ruleServices();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
                    					}
                    					set(
                    						current,
                    						"services",
                    						lv_services_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Services");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptationModelAccess().getFlowKeyword_2());
            		
            // InternalAdaptDsl.g:273:3: ( (lv_flowName_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:274:4: (lv_flowName_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:274:4: (lv_flowName_3_0= RULE_STRING )
            // InternalAdaptDsl.g:275:5: lv_flowName_3_0= RULE_STRING
            {
            lv_flowName_3_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_flowName_3_0, grammarAccess.getAdaptationModelAccess().getFlowNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flowName",
            						lv_flowName_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getAdaptationModelAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAdaptDsl.g:295:3: ( (lv_adaptationRules_5_0= ruleAdaptationRule ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAdaptDsl.g:296:4: (lv_adaptationRules_5_0= ruleAdaptationRule )
            	    {
            	    // InternalAdaptDsl.g:296:4: (lv_adaptationRules_5_0= ruleAdaptationRule )
            	    // InternalAdaptDsl.g:297:5: lv_adaptationRules_5_0= ruleAdaptationRule
            	    {

            	    					newCompositeNode(grammarAccess.getAdaptationModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_adaptationRules_5_0=ruleAdaptationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAdaptationModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"adaptationRules",
            	    						lv_adaptationRules_5_0,
            	    						"org.xtext.example.adaptdsl.AdaptDsl.AdaptationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getAdaptationModelAccess().getRightCurlyBracketSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAdaptationModelAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleAdaptationModel"


    // $ANTLR start "entryRuleServices"
    // InternalAdaptDsl.g:326:1: entryRuleServices returns [EObject current=null] : iv_ruleServices= ruleServices EOF ;
    public final EObject entryRuleServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServices = null;


        try {
            // InternalAdaptDsl.g:326:49: (iv_ruleServices= ruleServices EOF )
            // InternalAdaptDsl.g:327:2: iv_ruleServices= ruleServices EOF
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
    // InternalAdaptDsl.g:333:1: ruleServices returns [EObject current=null] : ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? ) ;
    public final EObject ruleServices() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:339:2: ( ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? ) )
            // InternalAdaptDsl.g:340:2: ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? )
            {
            // InternalAdaptDsl.g:340:2: ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? )
            // InternalAdaptDsl.g:341:3: ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )?
            {
            // InternalAdaptDsl.g:341:3: ( (lv_this_0_0= ruleService ) )
            // InternalAdaptDsl.g:342:4: (lv_this_0_0= ruleService )
            {
            // InternalAdaptDsl.g:342:4: (lv_this_0_0= ruleService )
            // InternalAdaptDsl.g:343:5: lv_this_0_0= ruleService
            {

            					newCompositeNode(grammarAccess.getServicesAccess().getThisServiceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalAdaptDsl.g:360:3: ( (lv_next_1_0= ruleServices ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdaptDsl.g:361:4: (lv_next_1_0= ruleServices )
                    {
                    // InternalAdaptDsl.g:361:4: (lv_next_1_0= ruleServices )
                    // InternalAdaptDsl.g:362:5: lv_next_1_0= ruleServices
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
    // InternalAdaptDsl.g:383:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAdaptDsl.g:383:48: (iv_ruleService= ruleService EOF )
            // InternalAdaptDsl.g:384:2: iv_ruleService= ruleService EOF
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
    // InternalAdaptDsl.g:390:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' ) ;
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
            // InternalAdaptDsl.g:396:2: ( (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' ) )
            // InternalAdaptDsl.g:397:2: (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' )
            {
            // InternalAdaptDsl.g:397:2: (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' )
            // InternalAdaptDsl.g:398:3: otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalAdaptDsl.g:402:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:403:4: (lv_type_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:403:4: (lv_type_1_0= RULE_ID )
            // InternalAdaptDsl.g:404:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getFromKeyword_2());
            		
            // InternalAdaptDsl.g:424:3: ( (lv_loc_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:425:4: (lv_loc_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:425:4: (lv_loc_3_0= RULE_STRING )
            // InternalAdaptDsl.g:426:5: lv_loc_3_0= RULE_STRING
            {
            lv_loc_3_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_4=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getAsKeyword_4());
            		
            // InternalAdaptDsl.g:446:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalAdaptDsl.g:447:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:447:4: (lv_id_5_0= RULE_STRING )
            // InternalAdaptDsl.g:448:5: lv_id_5_0= RULE_STRING
            {
            lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_6=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAdaptDsl.g:468:3: ( (lv_functions_7_0= ruleFunctions ) )
            // InternalAdaptDsl.g:469:4: (lv_functions_7_0= ruleFunctions )
            {
            // InternalAdaptDsl.g:469:4: (lv_functions_7_0= ruleFunctions )
            // InternalAdaptDsl.g:470:5: lv_functions_7_0= ruleFunctions
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getFunctionsFunctionsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalAdaptDsl.g:495:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalAdaptDsl.g:495:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalAdaptDsl.g:496:2: iv_ruleFunctions= ruleFunctions EOF
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
    // InternalAdaptDsl.g:502:1: ruleFunctions returns [EObject current=null] : ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:508:2: ( ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? ) )
            // InternalAdaptDsl.g:509:2: ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? )
            {
            // InternalAdaptDsl.g:509:2: ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? )
            // InternalAdaptDsl.g:510:3: ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )?
            {
            // InternalAdaptDsl.g:510:3: ( (lv_this_0_0= ruleFunction ) )
            // InternalAdaptDsl.g:511:4: (lv_this_0_0= ruleFunction )
            {
            // InternalAdaptDsl.g:511:4: (lv_this_0_0= ruleFunction )
            // InternalAdaptDsl.g:512:5: lv_this_0_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getThisFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalAdaptDsl.g:529:3: ( (lv_next_1_0= ruleFunctions ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAdaptDsl.g:530:4: (lv_next_1_0= ruleFunctions )
                    {
                    // InternalAdaptDsl.g:530:4: (lv_next_1_0= ruleFunctions )
                    // InternalAdaptDsl.g:531:5: lv_next_1_0= ruleFunctions
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
    // InternalAdaptDsl.g:552:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalAdaptDsl.g:552:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalAdaptDsl.g:553:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalAdaptDsl.g:559:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:565:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalAdaptDsl.g:566:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:566:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalAdaptDsl.g:567:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalAdaptDsl.g:571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:572:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptDsl.g:573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getAsKeyword_2());
            		
            // InternalAdaptDsl.g:593:3: ( (lv_id_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:594:4: (lv_id_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:594:4: (lv_id_3_0= RULE_STRING )
            // InternalAdaptDsl.g:595:5: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:619:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // InternalAdaptDsl.g:619:55: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // InternalAdaptDsl.g:620:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
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
    // InternalAdaptDsl.g:626:1: ruleAdaptationRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= ruleFactName ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_factName_8_0 = null;

        EObject lv_expr_12_0 = null;

        EObject lv_actionCollection_16_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:632:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= ruleFactName ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' ) )
            // InternalAdaptDsl.g:633:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= ruleFactName ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' )
            {
            // InternalAdaptDsl.g:633:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= ruleFactName ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' )
            // InternalAdaptDsl.g:634:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= ruleFactName ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0());
            		
            // InternalAdaptDsl.g:638:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdaptDsl.g:639:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:639:4: (lv_name_1_0= RULE_STRING )
            // InternalAdaptDsl.g:640:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3());
            		
            // InternalAdaptDsl.g:664:3: ( (lv_level_4_0= RULE_INT ) )
            // InternalAdaptDsl.g:665:4: (lv_level_4_0= RULE_INT )
            {
            // InternalAdaptDsl.g:665:4: (lv_level_4_0= RULE_INT )
            // InternalAdaptDsl.g:666:5: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_7); 

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

            otherlv_5=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6());
            		
            // InternalAdaptDsl.g:690:3: ( (lv_factType_7_0= RULE_ID ) )
            // InternalAdaptDsl.g:691:4: (lv_factType_7_0= RULE_ID )
            {
            // InternalAdaptDsl.g:691:4: (lv_factType_7_0= RULE_ID )
            // InternalAdaptDsl.g:692:5: lv_factType_7_0= RULE_ID
            {
            lv_factType_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalAdaptDsl.g:708:3: ( (lv_factName_8_0= ruleFactName ) )
            // InternalAdaptDsl.g:709:4: (lv_factName_8_0= ruleFactName )
            {
            // InternalAdaptDsl.g:709:4: (lv_factName_8_0= ruleFactName )
            // InternalAdaptDsl.g:710:5: lv_factName_8_0= ruleFactName
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getFactNameFactNameParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_factName_8_0=ruleFactName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptationRuleRule());
            					}
            					set(
            						current,
            						"factName",
            						lv_factName_8_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FactName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getAdaptationRuleAccess().getIFKeyword_10());
            		
            otherlv_11=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11());
            		
            // InternalAdaptDsl.g:739:3: ( (lv_expr_12_0= ruleConditionalOR ) )
            // InternalAdaptDsl.g:740:4: (lv_expr_12_0= ruleConditionalOR )
            {
            // InternalAdaptDsl.g:740:4: (lv_expr_12_0= ruleConditionalOR )
            // InternalAdaptDsl.g:741:5: lv_expr_12_0= ruleConditionalOR
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_13=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_13, grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_14, grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14());
            		
            otherlv_15=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_15, grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15());
            		
            // InternalAdaptDsl.g:770:3: ( (lv_actionCollection_16_0= ruleActions ) )
            // InternalAdaptDsl.g:771:4: (lv_actionCollection_16_0= ruleActions )
            {
            // InternalAdaptDsl.g:771:4: (lv_actionCollection_16_0= ruleActions )
            // InternalAdaptDsl.g:772:5: lv_actionCollection_16_0= ruleActions
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_17=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_30); 

            			newLeafNode(otherlv_18, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,31,FOLLOW_2); 

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
    // InternalAdaptDsl.g:805:1: entryRuleConditionalOR returns [EObject current=null] : iv_ruleConditionalOR= ruleConditionalOR EOF ;
    public final EObject entryRuleConditionalOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOR = null;


        try {
            // InternalAdaptDsl.g:805:54: (iv_ruleConditionalOR= ruleConditionalOR EOF )
            // InternalAdaptDsl.g:806:2: iv_ruleConditionalOR= ruleConditionalOR EOF
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
    // InternalAdaptDsl.g:812:1: ruleConditionalOR returns [EObject current=null] : ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? ) ;
    public final EObject ruleConditionalOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:818:2: ( ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? ) )
            // InternalAdaptDsl.g:819:2: ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? )
            {
            // InternalAdaptDsl.g:819:2: ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? )
            // InternalAdaptDsl.g:820:3: ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )?
            {
            // InternalAdaptDsl.g:820:3: ( (lv_left_0_0= ruleConditionalAND ) )
            // InternalAdaptDsl.g:821:4: (lv_left_0_0= ruleConditionalAND )
            {
            // InternalAdaptDsl.g:821:4: (lv_left_0_0= ruleConditionalAND )
            // InternalAdaptDsl.g:822:5: lv_left_0_0= ruleConditionalAND
            {

            					newCompositeNode(grammarAccess.getConditionalORAccess().getLeftConditionalANDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalAdaptDsl.g:839:3: (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:840:4: otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:844:4: ( (lv_right_2_0= ruleConditionalOR ) )
                    // InternalAdaptDsl.g:845:5: (lv_right_2_0= ruleConditionalOR )
                    {
                    // InternalAdaptDsl.g:845:5: (lv_right_2_0= ruleConditionalOR )
                    // InternalAdaptDsl.g:846:6: lv_right_2_0= ruleConditionalOR
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
    // InternalAdaptDsl.g:868:1: entryRuleConditionalAND returns [EObject current=null] : iv_ruleConditionalAND= ruleConditionalAND EOF ;
    public final EObject entryRuleConditionalAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAND = null;


        try {
            // InternalAdaptDsl.g:868:55: (iv_ruleConditionalAND= ruleConditionalAND EOF )
            // InternalAdaptDsl.g:869:2: iv_ruleConditionalAND= ruleConditionalAND EOF
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
    // InternalAdaptDsl.g:875:1: ruleConditionalAND returns [EObject current=null] : ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? ) ;
    public final EObject ruleConditionalAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:881:2: ( ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? ) )
            // InternalAdaptDsl.g:882:2: ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? )
            {
            // InternalAdaptDsl.g:882:2: ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? )
            // InternalAdaptDsl.g:883:3: ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )?
            {
            // InternalAdaptDsl.g:883:3: ( (lv_left_0_0= ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:884:4: (lv_left_0_0= ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:884:4: (lv_left_0_0= ruleConditionalPrimary )
            // InternalAdaptDsl.g:885:5: lv_left_0_0= ruleConditionalPrimary
            {

            					newCompositeNode(grammarAccess.getConditionalANDAccess().getLeftConditionalPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalAdaptDsl.g:902:3: (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAdaptDsl.g:903:4: otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:907:4: ( (lv_right_2_0= ruleConditionalAND ) )
                    // InternalAdaptDsl.g:908:5: (lv_right_2_0= ruleConditionalAND )
                    {
                    // InternalAdaptDsl.g:908:5: (lv_right_2_0= ruleConditionalAND )
                    // InternalAdaptDsl.g:909:6: lv_right_2_0= ruleConditionalAND
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
    // InternalAdaptDsl.g:931:1: entryRuleConditionalPrimary returns [EObject current=null] : iv_ruleConditionalPrimary= ruleConditionalPrimary EOF ;
    public final EObject entryRuleConditionalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalPrimary = null;


        try {
            // InternalAdaptDsl.g:931:59: (iv_ruleConditionalPrimary= ruleConditionalPrimary EOF )
            // InternalAdaptDsl.g:932:2: iv_ruleConditionalPrimary= ruleConditionalPrimary EOF
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
    // InternalAdaptDsl.g:938:1: ruleConditionalPrimary returns [EObject current=null] : ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) ) ;
    public final EObject ruleConditionalPrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_cond_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:944:2: ( ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) ) )
            // InternalAdaptDsl.g:945:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )
            {
            // InternalAdaptDsl.g:945:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalAdaptDsl.g:946:3: ( (lv_cond_0_0= ruleStringCondition ) )
                    {
                    // InternalAdaptDsl.g:946:3: ( (lv_cond_0_0= ruleStringCondition ) )
                    // InternalAdaptDsl.g:947:4: (lv_cond_0_0= ruleStringCondition )
                    {
                    // InternalAdaptDsl.g:947:4: (lv_cond_0_0= ruleStringCondition )
                    // InternalAdaptDsl.g:948:5: lv_cond_0_0= ruleStringCondition
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
                    // InternalAdaptDsl.g:966:3: ( (lv_cond_1_0= ruleNumberCondition ) )
                    {
                    // InternalAdaptDsl.g:966:3: ( (lv_cond_1_0= ruleNumberCondition ) )
                    // InternalAdaptDsl.g:967:4: (lv_cond_1_0= ruleNumberCondition )
                    {
                    // InternalAdaptDsl.g:967:4: (lv_cond_1_0= ruleNumberCondition )
                    // InternalAdaptDsl.g:968:5: lv_cond_1_0= ruleNumberCondition
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
                    // InternalAdaptDsl.g:986:3: ( (lv_cond_2_0= ruleBooleanCondition ) )
                    {
                    // InternalAdaptDsl.g:986:3: ( (lv_cond_2_0= ruleBooleanCondition ) )
                    // InternalAdaptDsl.g:987:4: (lv_cond_2_0= ruleBooleanCondition )
                    {
                    // InternalAdaptDsl.g:987:4: (lv_cond_2_0= ruleBooleanCondition )
                    // InternalAdaptDsl.g:988:5: lv_cond_2_0= ruleBooleanCondition
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
    // InternalAdaptDsl.g:1009:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalAdaptDsl.g:1009:57: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalAdaptDsl.g:1010:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
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
    // InternalAdaptDsl.g:1016:1: ruleBooleanCondition returns [EObject current=null] : ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_fact_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1022:2: ( ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) ) )
            // InternalAdaptDsl.g:1023:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )
            {
            // InternalAdaptDsl.g:1023:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAdaptDsl.g:1024:3: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) )
                    {
                    // InternalAdaptDsl.g:1024:3: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) )
                    // InternalAdaptDsl.g:1025:4: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) )
                    {
                    // InternalAdaptDsl.g:1025:4: ( (lv_fact_0_0= ruleFact ) )
                    // InternalAdaptDsl.g:1026:5: (lv_fact_0_0= ruleFact )
                    {
                    // InternalAdaptDsl.g:1026:5: (lv_fact_0_0= ruleFact )
                    // InternalAdaptDsl.g:1027:6: lv_fact_0_0= ruleFact
                    {

                    						newCompositeNode(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    // InternalAdaptDsl.g:1044:4: ( (lv_op_1_0= ruleBoolOperators ) )
                    // InternalAdaptDsl.g:1045:5: (lv_op_1_0= ruleBoolOperators )
                    {
                    // InternalAdaptDsl.g:1045:5: (lv_op_1_0= ruleBoolOperators )
                    // InternalAdaptDsl.g:1046:6: lv_op_1_0= ruleBoolOperators
                    {

                    						newCompositeNode(grammarAccess.getBooleanConditionAccess().getOpBoolOperatorsParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    // InternalAdaptDsl.g:1063:4: ( (lv_val_2_0= RULE_BOOL ) )
                    // InternalAdaptDsl.g:1064:5: (lv_val_2_0= RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:1064:5: (lv_val_2_0= RULE_BOOL )
                    // InternalAdaptDsl.g:1065:6: lv_val_2_0= RULE_BOOL
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
                    // InternalAdaptDsl.g:1083:3: ( (lv_fact_3_0= ruleFact ) )
                    {
                    // InternalAdaptDsl.g:1083:3: ( (lv_fact_3_0= ruleFact ) )
                    // InternalAdaptDsl.g:1084:4: (lv_fact_3_0= ruleFact )
                    {
                    // InternalAdaptDsl.g:1084:4: (lv_fact_3_0= ruleFact )
                    // InternalAdaptDsl.g:1085:5: lv_fact_3_0= ruleFact
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
    // InternalAdaptDsl.g:1106:1: entryRuleNumberCondition returns [EObject current=null] : iv_ruleNumberCondition= ruleNumberCondition EOF ;
    public final EObject entryRuleNumberCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberCondition = null;


        try {
            // InternalAdaptDsl.g:1106:56: (iv_ruleNumberCondition= ruleNumberCondition EOF )
            // InternalAdaptDsl.g:1107:2: iv_ruleNumberCondition= ruleNumberCondition EOF
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
    // InternalAdaptDsl.g:1113:1: ruleNumberCondition returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1119:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) ) )
            // InternalAdaptDsl.g:1120:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) )
            {
            // InternalAdaptDsl.g:1120:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:1121:3: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:1121:3: ( (lv_fact_0_0= ruleFact ) )
            // InternalAdaptDsl.g:1122:4: (lv_fact_0_0= ruleFact )
            {
            // InternalAdaptDsl.g:1122:4: (lv_fact_0_0= ruleFact )
            // InternalAdaptDsl.g:1123:5: lv_fact_0_0= ruleFact
            {

            					newCompositeNode(grammarAccess.getNumberConditionAccess().getFactFactParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
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

            // InternalAdaptDsl.g:1140:3: ( (lv_op_1_0= ruleNumberOperators ) )
            // InternalAdaptDsl.g:1141:4: (lv_op_1_0= ruleNumberOperators )
            {
            // InternalAdaptDsl.g:1141:4: (lv_op_1_0= ruleNumberOperators )
            // InternalAdaptDsl.g:1142:5: lv_op_1_0= ruleNumberOperators
            {

            					newCompositeNode(grammarAccess.getNumberConditionAccess().getOpNumberOperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            // InternalAdaptDsl.g:1159:3: ( (lv_val_2_0= RULE_INT ) )
            // InternalAdaptDsl.g:1160:4: (lv_val_2_0= RULE_INT )
            {
            // InternalAdaptDsl.g:1160:4: (lv_val_2_0= RULE_INT )
            // InternalAdaptDsl.g:1161:5: lv_val_2_0= RULE_INT
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
    // InternalAdaptDsl.g:1181:1: entryRuleStringCondition returns [EObject current=null] : iv_ruleStringCondition= ruleStringCondition EOF ;
    public final EObject entryRuleStringCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringCondition = null;


        try {
            // InternalAdaptDsl.g:1181:56: (iv_ruleStringCondition= ruleStringCondition EOF )
            // InternalAdaptDsl.g:1182:2: iv_ruleStringCondition= ruleStringCondition EOF
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
    // InternalAdaptDsl.g:1188:1: ruleStringCondition returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        EObject lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1194:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) ) )
            // InternalAdaptDsl.g:1195:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) )
            {
            // InternalAdaptDsl.g:1195:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:1196:3: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:1196:3: ( (lv_fact_0_0= ruleFact ) )
            // InternalAdaptDsl.g:1197:4: (lv_fact_0_0= ruleFact )
            {
            // InternalAdaptDsl.g:1197:4: (lv_fact_0_0= ruleFact )
            // InternalAdaptDsl.g:1198:5: lv_fact_0_0= ruleFact
            {

            					newCompositeNode(grammarAccess.getStringConditionAccess().getFactFactParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalAdaptDsl.g:1215:3: ( (lv_op_1_0= ruleStringOperators ) )
            // InternalAdaptDsl.g:1216:4: (lv_op_1_0= ruleStringOperators )
            {
            // InternalAdaptDsl.g:1216:4: (lv_op_1_0= ruleStringOperators )
            // InternalAdaptDsl.g:1217:5: lv_op_1_0= ruleStringOperators
            {

            					newCompositeNode(grammarAccess.getStringConditionAccess().getOpStringOperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalAdaptDsl.g:1234:3: ( (lv_val_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:1235:4: (lv_val_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:1235:4: (lv_val_2_0= RULE_STRING )
            // InternalAdaptDsl.g:1236:5: lv_val_2_0= RULE_STRING
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
    // InternalAdaptDsl.g:1256:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // InternalAdaptDsl.g:1256:45: (iv_ruleFact= ruleFact EOF )
            // InternalAdaptDsl.g:1257:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
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
    // InternalAdaptDsl.g:1263:1: ruleFact returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.get' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '()' ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_propertyName_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1269:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.get' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '()' ) )
            // InternalAdaptDsl.g:1270:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.get' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '()' )
            {
            // InternalAdaptDsl.g:1270:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.get' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '()' )
            // InternalAdaptDsl.g:1271:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.get' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '()'
            {
            // InternalAdaptDsl.g:1271:3: ( (otherlv_0= RULE_ID ) )
            // InternalAdaptDsl.g:1272:4: (otherlv_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1272:4: (otherlv_0= RULE_ID )
            // InternalAdaptDsl.g:1273:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_0, grammarAccess.getFactAccess().getFactNameFactNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFactAccess().getGetKeyword_1());
            		
            // InternalAdaptDsl.g:1288:3: ( (otherlv_2= RULE_ID ) )
            // InternalAdaptDsl.g:1289:4: (otherlv_2= RULE_ID )
            {
            // InternalAdaptDsl.g:1289:4: (otherlv_2= RULE_ID )
            // InternalAdaptDsl.g:1290:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_2, grammarAccess.getFactAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFactAccess().getGetKeyword_4());
            		
            // InternalAdaptDsl.g:1309:3: ( (lv_propertyName_5_0= RULE_ID ) )
            // InternalAdaptDsl.g:1310:4: (lv_propertyName_5_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1310:4: (lv_propertyName_5_0= RULE_ID )
            // InternalAdaptDsl.g:1311:5: lv_propertyName_5_0= RULE_ID
            {
            lv_propertyName_5_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_propertyName_5_0, grammarAccess.getFactAccess().getPropertyNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"propertyName",
            						lv_propertyName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_6());
            		

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


    // $ANTLR start "entryRuleFactName"
    // InternalAdaptDsl.g:1335:1: entryRuleFactName returns [EObject current=null] : iv_ruleFactName= ruleFactName EOF ;
    public final EObject entryRuleFactName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactName = null;


        try {
            // InternalAdaptDsl.g:1335:49: (iv_ruleFactName= ruleFactName EOF )
            // InternalAdaptDsl.g:1336:2: iv_ruleFactName= ruleFactName EOF
            {
             newCompositeNode(grammarAccess.getFactNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactName=ruleFactName();

            state._fsp--;

             current =iv_ruleFactName; 
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
    // $ANTLR end "entryRuleFactName"


    // $ANTLR start "ruleFactName"
    // InternalAdaptDsl.g:1342:1: ruleFactName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFactName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1348:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAdaptDsl.g:1349:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAdaptDsl.g:1349:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:1350:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1350:3: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:1351:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFactNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFactNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleFactName"


    // $ANTLR start "entryRuleFactProperty"
    // InternalAdaptDsl.g:1370:1: entryRuleFactProperty returns [String current=null] : iv_ruleFactProperty= ruleFactProperty EOF ;
    public final String entryRuleFactProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactProperty = null;


        try {
            // InternalAdaptDsl.g:1370:52: (iv_ruleFactProperty= ruleFactProperty EOF )
            // InternalAdaptDsl.g:1371:2: iv_ruleFactProperty= ruleFactProperty EOF
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
    // InternalAdaptDsl.g:1377:1: ruleFactProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleFactProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_Value_8 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1383:2: ( (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? ) )
            // InternalAdaptDsl.g:1384:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? )
            {
            // InternalAdaptDsl.g:1384:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? )
            // InternalAdaptDsl.g:1385:3: this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_0());
            		
            // InternalAdaptDsl.g:1392:3: (kw= '()' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAdaptDsl.g:1393:4: kw= '()'
                    {
                    kw=(Token)match(input,35,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalAdaptDsl.g:1399:3: (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_ID) ) {
                        int LA15_2 = input.LA(3);

                        if ( ((LA15_2>=35 && LA15_2<=36)) ) {
                            alt15=1;
                        }


                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalAdaptDsl.g:1400:4: kw= '.' this_ID_3= RULE_ID (kw= '()' )?
            	    {
            	    kw=(Token)match(input,36,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0());
            	    			
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_39); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_2_1());
            	    			
            	    // InternalAdaptDsl.g:1412:4: (kw= '()' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==35) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAdaptDsl.g:1413:5: kw= '()'
            	            {
            	            kw=(Token)match(input,35,FOLLOW_40); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            kw=(Token)match(input,36,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFactPropertyAccess().getFullStopKeyword_3());
            		
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_41); 

            			current.merge(this_ID_6);
            		

            			newLeafNode(this_ID_6, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_4());
            		
            // InternalAdaptDsl.g:1432:3: (kw= '(' this_Value_8= ruleValue kw= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptDsl.g:1433:4: kw= '(' this_Value_8= ruleValue kw= ')'
                    {
                    kw=(Token)match(input,28,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getFactPropertyAccess().getValueParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_27);
                    this_Value_8=ruleValue();

                    state._fsp--;


                    				current.merge(this_Value_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,29,FOLLOW_2); 

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
    // InternalAdaptDsl.g:1458:1: entryRuleNumberOperators returns [String current=null] : iv_ruleNumberOperators= ruleNumberOperators EOF ;
    public final String entryRuleNumberOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberOperators = null;


        try {
            // InternalAdaptDsl.g:1458:55: (iv_ruleNumberOperators= ruleNumberOperators EOF )
            // InternalAdaptDsl.g:1459:2: iv_ruleNumberOperators= ruleNumberOperators EOF
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
    // InternalAdaptDsl.g:1465:1: ruleNumberOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleNumberOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1471:2: ( (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) )
            // InternalAdaptDsl.g:1472:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1472:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            case 41:
                {
                alt17=5;
                }
                break;
            case 42:
                {
                alt17=6;
                }
                break;
            case 43:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdaptDsl.g:1473:3: kw= '>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1479:3: kw= '<'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1485:3: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1491:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1497:3: kw= '>='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1503:3: kw= '<='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1509:3: kw= '==='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAdaptDsl.g:1518:1: entryRuleStringOperators returns [String current=null] : iv_ruleStringOperators= ruleStringOperators EOF ;
    public final String entryRuleStringOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOperators = null;


        try {
            // InternalAdaptDsl.g:1518:55: (iv_ruleStringOperators= ruleStringOperators EOF )
            // InternalAdaptDsl.g:1519:2: iv_ruleStringOperators= ruleStringOperators EOF
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
    // InternalAdaptDsl.g:1525:1: ruleStringOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleStringOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1531:2: ( (kw= '==' | kw= '!=' | kw= '===' ) )
            // InternalAdaptDsl.g:1532:2: (kw= '==' | kw= '!=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1532:2: (kw= '==' | kw= '!=' | kw= '===' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt18=1;
                }
                break;
            case 40:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAdaptDsl.g:1533:3: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1539:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1545:3: kw= '==='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

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
    // InternalAdaptDsl.g:1554:1: entryRuleBoolOperators returns [String current=null] : iv_ruleBoolOperators= ruleBoolOperators EOF ;
    public final String entryRuleBoolOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOperators = null;


        try {
            // InternalAdaptDsl.g:1554:53: (iv_ruleBoolOperators= ruleBoolOperators EOF )
            // InternalAdaptDsl.g:1555:2: iv_ruleBoolOperators= ruleBoolOperators EOF
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
    // InternalAdaptDsl.g:1561:1: ruleBoolOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1567:2: ( (kw= '==' | kw= '!=' ) )
            // InternalAdaptDsl.g:1568:2: (kw= '==' | kw= '!=' )
            {
            // InternalAdaptDsl.g:1568:2: (kw= '==' | kw= '!=' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            else if ( (LA19_0==40) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptDsl.g:1569:3: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1575:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalAdaptDsl.g:1584:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalAdaptDsl.g:1584:48: (iv_ruleActions= ruleActions EOF )
            // InternalAdaptDsl.g:1585:2: iv_ruleActions= ruleActions EOF
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
    // InternalAdaptDsl.g:1591:1: ruleActions returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1597:2: ( ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) )
            // InternalAdaptDsl.g:1598:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            {
            // InternalAdaptDsl.g:1598:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            // InternalAdaptDsl.g:1599:3: ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )?
            {
            // InternalAdaptDsl.g:1599:3: ( (lv_action_0_0= ruleAction ) )
            // InternalAdaptDsl.g:1600:4: (lv_action_0_0= ruleAction )
            {
            // InternalAdaptDsl.g:1600:4: (lv_action_0_0= ruleAction )
            // InternalAdaptDsl.g:1601:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getActionsAccess().getActionActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAdaptDsl.g:1618:3: ( (lv_next_1_0= ruleActions ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44||(LA20_0>=46 && LA20_0<=60)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:1619:4: (lv_next_1_0= ruleActions )
                    {
                    // InternalAdaptDsl.g:1619:4: (lv_next_1_0= ruleActions )
                    // InternalAdaptDsl.g:1620:5: lv_next_1_0= ruleActions
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
    // InternalAdaptDsl.g:1641:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAdaptDsl.g:1641:47: (iv_ruleAction= ruleAction EOF )
            // InternalAdaptDsl.g:1642:2: iv_ruleAction= ruleAction EOF
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
    // InternalAdaptDsl.g:1648:1: ruleAction returns [EObject current=null] : ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionCategory_0_0 = null;

        EObject lv_actionCategory_1_0 = null;

        EObject lv_actionCategory_2_0 = null;

        EObject lv_actionCategory_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1654:2: ( ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) )
            // InternalAdaptDsl.g:1655:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            {
            // InternalAdaptDsl.g:1655:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 44:
            case 46:
            case 47:
                {
                alt21=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt21=2;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt21=3;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAdaptDsl.g:1656:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    {
                    // InternalAdaptDsl.g:1656:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    // InternalAdaptDsl.g:1657:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    {
                    // InternalAdaptDsl.g:1657:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    // InternalAdaptDsl.g:1658:5: lv_actionCategory_0_0= ruleServiceOperation
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
                    // InternalAdaptDsl.g:1676:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1676:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    // InternalAdaptDsl.g:1677:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    {
                    // InternalAdaptDsl.g:1677:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    // InternalAdaptDsl.g:1678:5: lv_actionCategory_1_0= ruleTaskChangeOperation
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
                    // InternalAdaptDsl.g:1696:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1696:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    // InternalAdaptDsl.g:1697:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    {
                    // InternalAdaptDsl.g:1697:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    // InternalAdaptDsl.g:1698:5: lv_actionCategory_2_0= ruleNavigationChangeOperation
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
                    // InternalAdaptDsl.g:1716:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1716:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    // InternalAdaptDsl.g:1717:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    {
                    // InternalAdaptDsl.g:1717:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    // InternalAdaptDsl.g:1718:5: lv_actionCategory_3_0= ruleLayoutChangeOperation
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
    // InternalAdaptDsl.g:1739:1: entryRuleServiceOperation returns [EObject current=null] : iv_ruleServiceOperation= ruleServiceOperation EOF ;
    public final EObject entryRuleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceOperation = null;


        try {
            // InternalAdaptDsl.g:1739:57: (iv_ruleServiceOperation= ruleServiceOperation EOF )
            // InternalAdaptDsl.g:1740:2: iv_ruleServiceOperation= ruleServiceOperation EOF
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
    // InternalAdaptDsl.g:1746:1: ruleServiceOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) ;
    public final EObject ruleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1752:2: ( ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) )
            // InternalAdaptDsl.g:1753:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            {
            // InternalAdaptDsl.g:1753:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt22=1;
                }
                break;
            case 46:
                {
                alt22=2;
                }
                break;
            case 47:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:1754:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    {
                    // InternalAdaptDsl.g:1754:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    // InternalAdaptDsl.g:1755:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    {
                    // InternalAdaptDsl.g:1755:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    // InternalAdaptDsl.g:1756:5: lv_operation_0_0= ruleServiceFunctionCallOperation
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
                    // InternalAdaptDsl.g:1774:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    {
                    // InternalAdaptDsl.g:1774:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    // InternalAdaptDsl.g:1775:4: (lv_operation_1_0= ruleEditFactOperation )
                    {
                    // InternalAdaptDsl.g:1775:4: (lv_operation_1_0= ruleEditFactOperation )
                    // InternalAdaptDsl.g:1776:5: lv_operation_1_0= ruleEditFactOperation
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
                    // InternalAdaptDsl.g:1794:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    {
                    // InternalAdaptDsl.g:1794:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    // InternalAdaptDsl.g:1795:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    {
                    // InternalAdaptDsl.g:1795:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    // InternalAdaptDsl.g:1796:5: lv_operation_2_0= ruleSetDisplayPropertyOperation
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
    // InternalAdaptDsl.g:1817:1: entryRuleServiceFunctionCallOperation returns [EObject current=null] : iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF ;
    public final EObject entryRuleServiceFunctionCallOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceFunctionCallOperation = null;


        try {
            // InternalAdaptDsl.g:1817:69: (iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF )
            // InternalAdaptDsl.g:1818:2: iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF
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
    // InternalAdaptDsl.g:1824:1: ruleServiceFunctionCallOperation returns [EObject current=null] : (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // InternalAdaptDsl.g:1830:2: ( (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:1831:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:1831:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:1832:3: otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1840:3: ( (lv_service_2_0= RULE_ID ) )
            // InternalAdaptDsl.g:1841:4: (lv_service_2_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1841:4: (lv_service_2_0= RULE_ID )
            // InternalAdaptDsl.g:1842:5: lv_service_2_0= RULE_ID
            {
            lv_service_2_0=(Token)match(input,RULE_ID,FOLLOW_44); 

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

            otherlv_3=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:1862:3: ( (lv_function_4_0= RULE_ID ) )
            // InternalAdaptDsl.g:1863:4: (lv_function_4_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1863:4: (lv_function_4_0= RULE_ID )
            // InternalAdaptDsl.g:1864:5: lv_function_4_0= RULE_ID
            {
            lv_function_4_0=(Token)match(input,RULE_ID,FOLLOW_44); 

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

            otherlv_5=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:1884:3: ( (lv_val_6_0= ruleValue ) )
            // InternalAdaptDsl.g:1885:4: (lv_val_6_0= ruleValue )
            {
            // InternalAdaptDsl.g:1885:4: (lv_val_6_0= ruleValue )
            // InternalAdaptDsl.g:1886:5: lv_val_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getServiceFunctionCallOperationAccess().getValValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_7=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:1915:1: entryRuleEditFactOperation returns [EObject current=null] : iv_ruleEditFactOperation= ruleEditFactOperation EOF ;
    public final EObject entryRuleEditFactOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditFactOperation = null;


        try {
            // InternalAdaptDsl.g:1915:58: (iv_ruleEditFactOperation= ruleEditFactOperation EOF )
            // InternalAdaptDsl.g:1916:2: iv_ruleEditFactOperation= ruleEditFactOperation EOF
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
    // InternalAdaptDsl.g:1922:1: ruleEditFactOperation returns [EObject current=null] : (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:1928:2: ( (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:1929:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:1929:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:1930:3: otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1938:3: ( (lv_prop_2_0= ruleFactProperty ) )
            // InternalAdaptDsl.g:1939:4: (lv_prop_2_0= ruleFactProperty )
            {
            // InternalAdaptDsl.g:1939:4: (lv_prop_2_0= ruleFactProperty )
            // InternalAdaptDsl.g:1940:5: lv_prop_2_0= ruleFactProperty
            {

            					newCompositeNode(grammarAccess.getEditFactOperationAccess().getPropFactPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalAdaptDsl.g:1957:3: (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAdaptDsl.g:1958:4: otherlv_3= ',' ( (lv_val_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalAdaptDsl.g:1962:4: ( (lv_val_4_0= ruleValue ) )
                    // InternalAdaptDsl.g:1963:5: (lv_val_4_0= ruleValue )
                    {
                    // InternalAdaptDsl.g:1963:5: (lv_val_4_0= ruleValue )
                    // InternalAdaptDsl.g:1964:6: lv_val_4_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getEditFactOperationAccess().getValValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:1994:1: entryRuleSetDisplayPropertyOperation returns [EObject current=null] : iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF ;
    public final EObject entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDisplayPropertyOperation = null;


        try {
            // InternalAdaptDsl.g:1994:68: (iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptDsl.g:1995:2: iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF
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
    // InternalAdaptDsl.g:2001:1: ruleSetDisplayPropertyOperation returns [EObject current=null] : (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:2007:2: ( (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2008:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2008:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2009:3: otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2017:3: ( (lv_property_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2018:4: (lv_property_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2018:4: (lv_property_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2019:5: lv_property_2_0= RULE_STRING
            {
            lv_property_2_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_3=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2039:3: ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:2040:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:2040:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:2041:5: lv_propertyValue_4_0= ruleDisplayPropertyValue
            {

            					newCompositeNode(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueDisplayPropertyValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2070:1: entryRuleDisplayPropertyValue returns [EObject current=null] : iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF ;
    public final EObject entryRuleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayPropertyValue = null;


        try {
            // InternalAdaptDsl.g:2070:61: (iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF )
            // InternalAdaptDsl.g:2071:2: iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF
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
    // InternalAdaptDsl.g:2077:1: ruleDisplayPropertyValue returns [EObject current=null] : ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) ;
    public final EObject ruleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyClass_0_0 = null;

        EObject lv_propertyClass_1_0 = null;

        EObject lv_propertyClass_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2083:2: ( ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) )
            // InternalAdaptDsl.g:2084:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            {
            // InternalAdaptDsl.g:2084:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt24=1;
                }
                break;
            case RULE_STRING:
                {
                alt24=2;
                }
                break;
            case RULE_BOOL:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:2085:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    {
                    // InternalAdaptDsl.g:2085:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    // InternalAdaptDsl.g:2086:4: (lv_propertyClass_0_0= ruleIntValue )
                    {
                    // InternalAdaptDsl.g:2086:4: (lv_propertyClass_0_0= ruleIntValue )
                    // InternalAdaptDsl.g:2087:5: lv_propertyClass_0_0= ruleIntValue
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
                    // InternalAdaptDsl.g:2105:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    {
                    // InternalAdaptDsl.g:2105:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    // InternalAdaptDsl.g:2106:4: (lv_propertyClass_1_0= ruleStringValue )
                    {
                    // InternalAdaptDsl.g:2106:4: (lv_propertyClass_1_0= ruleStringValue )
                    // InternalAdaptDsl.g:2107:5: lv_propertyClass_1_0= ruleStringValue
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
                    // InternalAdaptDsl.g:2125:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    {
                    // InternalAdaptDsl.g:2125:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    // InternalAdaptDsl.g:2126:4: (lv_propertyClass_2_0= ruleBoolValue )
                    {
                    // InternalAdaptDsl.g:2126:4: (lv_propertyClass_2_0= ruleBoolValue )
                    // InternalAdaptDsl.g:2127:5: lv_propertyClass_2_0= ruleBoolValue
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
    // InternalAdaptDsl.g:2148:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAdaptDsl.g:2148:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAdaptDsl.g:2149:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalAdaptDsl.g:2155:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2161:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:2162:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:2162:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAdaptDsl.g:2163:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAdaptDsl.g:2163:3: (lv_value_0_0= RULE_INT )
            // InternalAdaptDsl.g:2164:4: lv_value_0_0= RULE_INT
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
    // InternalAdaptDsl.g:2183:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAdaptDsl.g:2183:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAdaptDsl.g:2184:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalAdaptDsl.g:2190:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2196:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:2197:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:2197:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2198:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2198:3: (lv_value_0_0= RULE_STRING )
            // InternalAdaptDsl.g:2199:4: lv_value_0_0= RULE_STRING
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
    // InternalAdaptDsl.g:2218:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalAdaptDsl.g:2218:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalAdaptDsl.g:2219:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalAdaptDsl.g:2225:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2231:2: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // InternalAdaptDsl.g:2232:2: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // InternalAdaptDsl.g:2232:2: ( (lv_value_0_0= RULE_BOOL ) )
            // InternalAdaptDsl.g:2233:3: (lv_value_0_0= RULE_BOOL )
            {
            // InternalAdaptDsl.g:2233:3: (lv_value_0_0= RULE_BOOL )
            // InternalAdaptDsl.g:2234:4: lv_value_0_0= RULE_BOOL
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
    // InternalAdaptDsl.g:2253:1: entryRuleTaskChangeOperation returns [EObject current=null] : iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF ;
    public final EObject entryRuleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2253:60: (iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:2254:2: iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF
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
    // InternalAdaptDsl.g:2260:1: ruleTaskChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) ) ;
    public final EObject ruleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2266:2: ( ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) ) )
            // InternalAdaptDsl.g:2267:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) )
            {
            // InternalAdaptDsl.g:2267:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt25=1;
                }
                break;
            case 49:
                {
                alt25=2;
                }
                break;
            case 50:
                {
                alt25=3;
                }
                break;
            case 51:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAdaptDsl.g:2268:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2268:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    // InternalAdaptDsl.g:2269:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2269:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    // InternalAdaptDsl.g:2270:5: lv_operation_0_0= ruleAddViewComponentOperation
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
                    // InternalAdaptDsl.g:2288:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2288:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    // InternalAdaptDsl.g:2289:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2289:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    // InternalAdaptDsl.g:2290:5: lv_operation_1_0= ruleDeleteViewComponentOperation
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
                    // InternalAdaptDsl.g:2308:3: ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) )
                    {
                    // InternalAdaptDsl.g:2308:3: ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) )
                    // InternalAdaptDsl.g:2309:4: (lv_operation_2_0= ruleAddViewComponentButtonOperation )
                    {
                    // InternalAdaptDsl.g:2309:4: (lv_operation_2_0= ruleAddViewComponentButtonOperation )
                    // InternalAdaptDsl.g:2310:5: lv_operation_2_0= ruleAddViewComponentButtonOperation
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
                    // InternalAdaptDsl.g:2328:3: ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) )
                    {
                    // InternalAdaptDsl.g:2328:3: ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) )
                    // InternalAdaptDsl.g:2329:4: (lv_operation_3_0= ruleDeleteViewComponentButtonOperation )
                    {
                    // InternalAdaptDsl.g:2329:4: (lv_operation_3_0= ruleDeleteViewComponentButtonOperation )
                    // InternalAdaptDsl.g:2330:5: lv_operation_3_0= ruleDeleteViewComponentButtonOperation
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
    // InternalAdaptDsl.g:2351:1: entryRuleAddViewComponentOperation returns [EObject current=null] : iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF ;
    public final EObject entryRuleAddViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2351:66: (iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:2352:2: iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF
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
    // InternalAdaptDsl.g:2358:1: ruleAddViewComponentOperation returns [EObject current=null] : (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:2364:2: ( (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2365:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2365:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2366:3: otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2374:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2375:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2375:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2376:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_3=(Token)match(input,45,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2397:3: ( (lv_target_4_0= ruleTargetContainer ) )
            // InternalAdaptDsl.g:2398:4: (lv_target_4_0= ruleTargetContainer )
            {
            // InternalAdaptDsl.g:2398:4: (lv_target_4_0= ruleTargetContainer )
            // InternalAdaptDsl.g:2399:5: lv_target_4_0= ruleTargetContainer
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getTargetTargetContainerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2428:1: entryRuleDeleteViewComponentOperation returns [EObject current=null] : iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF ;
    public final EObject entryRuleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2428:69: (iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:2429:2: iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF
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
    // InternalAdaptDsl.g:2435:1: ruleDeleteViewComponentOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2441:2: ( (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2442:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2442:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2443:3: otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2451:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2452:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2452:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2453:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2482:1: entryRuleAddViewComponentButtonOperation returns [EObject current=null] : iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF ;
    public final EObject entryRuleAddViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentButtonOperation = null;


        try {
            // InternalAdaptDsl.g:2482:72: (iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:2483:2: iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF
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
    // InternalAdaptDsl.g:2489:1: ruleAddViewComponentButtonOperation returns [EObject current=null] : (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // InternalAdaptDsl.g:2495:2: ( (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:2496:2: (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:2496:2: (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:2497:3: otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentButtonOperationAccess().getAddViewComponentButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2505:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2506:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2506:4: (lv_id_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2507:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_3=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2527:3: ( (lv_langKey_4_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2528:4: (lv_langKey_4_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2528:4: (lv_langKey_4_0= RULE_STRING )
            // InternalAdaptDsl.g:2529:5: lv_langKey_4_0= RULE_STRING
            {
            lv_langKey_4_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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

            otherlv_5=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAddViewComponentButtonOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:2549:3: ( (lv_action_6_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2550:4: (lv_action_6_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2550:4: (lv_action_6_0= RULE_STRING )
            // InternalAdaptDsl.g:2551:5: lv_action_6_0= RULE_STRING
            {
            lv_action_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_7=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAddViewComponentButtonOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2579:1: entryRuleDeleteViewComponentButtonOperation returns [EObject current=null] : iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF ;
    public final EObject entryRuleDeleteViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentButtonOperation = null;


        try {
            // InternalAdaptDsl.g:2579:75: (iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:2580:2: iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF
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
    // InternalAdaptDsl.g:2586:1: ruleDeleteViewComponentButtonOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2592:2: ( (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2593:2: (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2593:2: (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2594:3: otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentButtonOperationAccess().getDeleteViewComponentButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2602:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2603:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2603:4: (lv_id_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2604:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteViewComponentButtonOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2632:1: entryRuleViewComponent returns [String current=null] : iv_ruleViewComponent= ruleViewComponent EOF ;
    public final String entryRuleViewComponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleViewComponent = null;


        try {
            // InternalAdaptDsl.g:2632:53: (iv_ruleViewComponent= ruleViewComponent EOF )
            // InternalAdaptDsl.g:2633:2: iv_ruleViewComponent= ruleViewComponent EOF
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
    // InternalAdaptDsl.g:2639:1: ruleViewComponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleViewComponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2645:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2646:2: this_ID_0= RULE_ID
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
    // InternalAdaptDsl.g:2656:1: entryRuleTargetContainer returns [String current=null] : iv_ruleTargetContainer= ruleTargetContainer EOF ;
    public final String entryRuleTargetContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTargetContainer = null;


        try {
            // InternalAdaptDsl.g:2656:55: (iv_ruleTargetContainer= ruleTargetContainer EOF )
            // InternalAdaptDsl.g:2657:2: iv_ruleTargetContainer= ruleTargetContainer EOF
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
    // InternalAdaptDsl.g:2663:1: ruleTargetContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTargetContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2669:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2670:2: this_ID_0= RULE_ID
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
    // InternalAdaptDsl.g:2680:1: entryRuleNavigationChangeOperation returns [EObject current=null] : iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF ;
    public final EObject entryRuleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2680:66: (iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:2681:2: iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF
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
    // InternalAdaptDsl.g:2687:1: ruleNavigationChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) ;
    public final EObject ruleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2693:2: ( ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) )
            // InternalAdaptDsl.g:2694:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            {
            // InternalAdaptDsl.g:2694:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt26=1;
                }
                break;
            case 53:
                {
                alt26=2;
                }
                break;
            case 54:
                {
                alt26=3;
                }
                break;
            case 55:
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
                    // InternalAdaptDsl.g:2695:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2695:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    // InternalAdaptDsl.g:2696:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2696:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    // InternalAdaptDsl.g:2697:5: lv_operation_0_0= ruleAddNavLinkOperation
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
                    // InternalAdaptDsl.g:2715:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2715:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    // InternalAdaptDsl.g:2716:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2716:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    // InternalAdaptDsl.g:2717:5: lv_operation_1_0= ruleDeleteNavLinkOperation
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
                    // InternalAdaptDsl.g:2735:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2735:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    // InternalAdaptDsl.g:2736:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2736:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    // InternalAdaptDsl.g:2737:5: lv_operation_2_0= ruleRedirectNavLinkOperation
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
                    // InternalAdaptDsl.g:2755:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    {
                    // InternalAdaptDsl.g:2755:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    // InternalAdaptDsl.g:2756:4: (lv_operation_3_0= ruleClearNavOperation )
                    {
                    // InternalAdaptDsl.g:2756:4: (lv_operation_3_0= ruleClearNavOperation )
                    // InternalAdaptDsl.g:2757:5: lv_operation_3_0= ruleClearNavOperation
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
    // InternalAdaptDsl.g:2778:1: entryRuleAddNavLinkOperation returns [EObject current=null] : iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF ;
    public final EObject entryRuleAddNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2778:60: (iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:2779:2: iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF
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
    // InternalAdaptDsl.g:2785:1: ruleAddNavLinkOperation returns [EObject current=null] : (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:2791:2: ( (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2792:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2792:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2793:3: otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2801:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2802:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2802:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2803:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_3=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2824:3: ( (lv_text_4_0= ruleText ) )
            // InternalAdaptDsl.g:2825:4: (lv_text_4_0= ruleText )
            {
            // InternalAdaptDsl.g:2825:4: (lv_text_4_0= ruleText )
            // InternalAdaptDsl.g:2826:5: lv_text_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getTextTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2855:1: entryRuleDeleteNavLinkOperation returns [EObject current=null] : iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF ;
    public final EObject entryRuleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2855:63: (iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:2856:2: iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF
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
    // InternalAdaptDsl.g:2862:1: ruleDeleteNavLinkOperation returns [EObject current=null] : (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2868:2: ( (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2869:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2869:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2870:3: otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2878:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2879:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2879:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2880:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2909:1: entryRuleRedirectNavLinkOperation returns [EObject current=null] : iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF ;
    public final EObject entryRuleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirectNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2909:65: (iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:2910:2: iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF
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
    // InternalAdaptDsl.g:2916:1: ruleRedirectNavLinkOperation returns [EObject current=null] : (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2922:2: ( (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2923:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2923:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2924:3: otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2932:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2933:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2933:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2934:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:2963:1: entryRuleClearNavOperation returns [EObject current=null] : iv_ruleClearNavOperation= ruleClearNavOperation EOF ;
    public final EObject entryRuleClearNavOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearNavOperation = null;


        try {
            // InternalAdaptDsl.g:2963:58: (iv_ruleClearNavOperation= ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:2964:2: iv_ruleClearNavOperation= ruleClearNavOperation EOF
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
    // InternalAdaptDsl.g:2970:1: ruleClearNavOperation returns [EObject current=null] : ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) ;
    public final EObject ruleClearNavOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2976:2: ( ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) )
            // InternalAdaptDsl.g:2977:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:2977:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            // InternalAdaptDsl.g:2978:3: () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';'
            {
            // InternalAdaptDsl.g:2978:3: ()
            // InternalAdaptDsl.g:2979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3001:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalAdaptDsl.g:3001:44: (iv_ruleText= ruleText EOF )
            // InternalAdaptDsl.g:3002:2: iv_ruleText= ruleText EOF
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
    // InternalAdaptDsl.g:3008:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3014:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3015:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3025:1: entryRuleLayoutChangeOperation returns [EObject current=null] : iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF ;
    public final EObject entryRuleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutChangeOperation = null;


        try {
            // InternalAdaptDsl.g:3025:62: (iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:3026:2: iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF
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
    // InternalAdaptDsl.g:3032:1: ruleLayoutChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) ;
    public final EObject ruleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;

        EObject lv_operation_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3038:2: ( ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) )
            // InternalAdaptDsl.g:3039:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            {
            // InternalAdaptDsl.g:3039:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt27=1;
                }
                break;
            case 56:
                {
                alt27=2;
                }
                break;
            case 59:
                {
                alt27=3;
                }
                break;
            case 60:
                {
                alt27=4;
                }
                break;
            case 57:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:3040:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    {
                    // InternalAdaptDsl.g:3040:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    // InternalAdaptDsl.g:3041:4: (lv_operation_0_0= ruleChangeFontOperation )
                    {
                    // InternalAdaptDsl.g:3041:4: (lv_operation_0_0= ruleChangeFontOperation )
                    // InternalAdaptDsl.g:3042:5: lv_operation_0_0= ruleChangeFontOperation
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
                    // InternalAdaptDsl.g:3060:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    {
                    // InternalAdaptDsl.g:3060:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    // InternalAdaptDsl.g:3061:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    {
                    // InternalAdaptDsl.g:3061:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    // InternalAdaptDsl.g:3062:5: lv_operation_1_0= ruleChangeFontSizeOperation
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
                    // InternalAdaptDsl.g:3080:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:3080:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    // InternalAdaptDsl.g:3081:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    {
                    // InternalAdaptDsl.g:3081:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    // InternalAdaptDsl.g:3082:5: lv_operation_2_0= ruleChangeTableCssClassOperation
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
                    // InternalAdaptDsl.g:3100:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:3100:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    // InternalAdaptDsl.g:3101:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    {
                    // InternalAdaptDsl.g:3101:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    // InternalAdaptDsl.g:3102:5: lv_operation_3_0= ruleAdaptCssClassOperation
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
                    // InternalAdaptDsl.g:3120:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    {
                    // InternalAdaptDsl.g:3120:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    // InternalAdaptDsl.g:3121:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    {
                    // InternalAdaptDsl.g:3121:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    // InternalAdaptDsl.g:3122:5: lv_operation_4_0= ruleChangeColorSchemeOperation
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
    // InternalAdaptDsl.g:3143:1: entryRuleChangeFontSizeOperation returns [EObject current=null] : iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF ;
    public final EObject entryRuleChangeFontSizeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontSizeOperation = null;


        try {
            // InternalAdaptDsl.g:3143:64: (iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:3144:2: iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF
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
    // InternalAdaptDsl.g:3150:1: ruleChangeFontSizeOperation returns [EObject current=null] : (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:3156:2: ( (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3157:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3157:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:3158:3: otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3166:3: ( (lv_sizePrimary_2_0= ruleFontSize ) )
            // InternalAdaptDsl.g:3167:4: (lv_sizePrimary_2_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:3167:4: (lv_sizePrimary_2_0= ruleFontSize )
            // InternalAdaptDsl.g:3168:5: lv_sizePrimary_2_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryFontSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_3=(Token)match(input,45,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3189:3: ( (lv_sizeSecondary_4_0= ruleFontSize ) )
            // InternalAdaptDsl.g:3190:4: (lv_sizeSecondary_4_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:3190:4: (lv_sizeSecondary_4_0= ruleFontSize )
            // InternalAdaptDsl.g:3191:5: lv_sizeSecondary_4_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryFontSizeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3220:1: entryRuleChangeColorSchemeOperation returns [EObject current=null] : iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF ;
    public final EObject entryRuleChangeColorSchemeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeColorSchemeOperation = null;


        try {
            // InternalAdaptDsl.g:3220:67: (iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:3221:2: iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF
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
    // InternalAdaptDsl.g:3227:1: ruleChangeColorSchemeOperation returns [EObject current=null] : (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:3233:2: ( (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3234:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3234:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:3235:3: otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3243:3: ( (lv_colorPrimary_2_0= ruleColor ) )
            // InternalAdaptDsl.g:3244:4: (lv_colorPrimary_2_0= ruleColor )
            {
            // InternalAdaptDsl.g:3244:4: (lv_colorPrimary_2_0= ruleColor )
            // InternalAdaptDsl.g:3245:5: lv_colorPrimary_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_3=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3266:3: ( (lv_colorSecondary_4_0= ruleColor ) )
            // InternalAdaptDsl.g:3267:4: (lv_colorSecondary_4_0= ruleColor )
            {
            // InternalAdaptDsl.g:3267:4: (lv_colorSecondary_4_0= ruleColor )
            // InternalAdaptDsl.g:3268:5: lv_colorSecondary_4_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryColorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_5=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3297:1: entryRuleChangeFontOperation returns [EObject current=null] : iv_ruleChangeFontOperation= ruleChangeFontOperation EOF ;
    public final EObject entryRuleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontOperation = null;


        try {
            // InternalAdaptDsl.g:3297:60: (iv_ruleChangeFontOperation= ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:3298:2: iv_ruleChangeFontOperation= ruleChangeFontOperation EOF
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
    // InternalAdaptDsl.g:3304:1: ruleChangeFontOperation returns [EObject current=null] : (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3310:2: ( (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:3311:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:3311:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:3312:3: otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3320:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:3321:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:3321:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:3322:5: lv_text_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getChangeFontOperationAccess().getTextTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3351:1: entryRuleChangeTableCssClassOperation returns [EObject current=null] : iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF ;
    public final EObject entryRuleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTableCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:3351:69: (iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:3352:2: iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF
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
    // InternalAdaptDsl.g:3358:1: ruleChangeTableCssClassOperation returns [EObject current=null] : (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3364:2: ( (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:3365:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:3365:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:3366:3: otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3374:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:3375:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:3375:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:3376:5: lv_text_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getChangeTableCssClassOperationAccess().getTextTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3405:1: entryRuleAdaptCssClassOperation returns [EObject current=null] : iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF ;
    public final EObject entryRuleAdaptCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:3405:63: (iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:3406:2: iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF
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
    // InternalAdaptDsl.g:3412:1: ruleAdaptCssClassOperation returns [EObject current=null] : (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // InternalAdaptDsl.g:3418:2: ( (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:3419:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:3419:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:3420:3: otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3428:3: ( (lv_cssClass_2_0= ruleCssClass ) )
            // InternalAdaptDsl.g:3429:4: (lv_cssClass_2_0= ruleCssClass )
            {
            // InternalAdaptDsl.g:3429:4: (lv_cssClass_2_0= ruleCssClass )
            // InternalAdaptDsl.g:3430:5: lv_cssClass_2_0= ruleCssClass
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssClassCssClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_3=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3451:3: ( (lv_cssAttribute_4_0= ruleAttribute ) )
            // InternalAdaptDsl.g:3452:4: (lv_cssAttribute_4_0= ruleAttribute )
            {
            // InternalAdaptDsl.g:3452:4: (lv_cssAttribute_4_0= ruleAttribute )
            // InternalAdaptDsl.g:3453:5: lv_cssAttribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_5=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:3474:3: ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) )
            // InternalAdaptDsl.g:3475:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            {
            // InternalAdaptDsl.g:3475:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            // InternalAdaptDsl.g:3476:5: lv_cssAttributeValue_6_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAttributeValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_7=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:3505:1: entryRuleCssClass returns [String current=null] : iv_ruleCssClass= ruleCssClass EOF ;
    public final String entryRuleCssClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCssClass = null;


        try {
            // InternalAdaptDsl.g:3505:48: (iv_ruleCssClass= ruleCssClass EOF )
            // InternalAdaptDsl.g:3506:2: iv_ruleCssClass= ruleCssClass EOF
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
    // InternalAdaptDsl.g:3512:1: ruleCssClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCssClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3518:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3519:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3529:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // InternalAdaptDsl.g:3529:49: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalAdaptDsl.g:3530:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalAdaptDsl.g:3536:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3542:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3543:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3553:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalAdaptDsl.g:3553:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalAdaptDsl.g:3554:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalAdaptDsl.g:3560:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3566:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3567:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3577:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalAdaptDsl.g:3577:45: (iv_ruleColor= ruleColor EOF )
            // InternalAdaptDsl.g:3578:2: iv_ruleColor= ruleColor EOF
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
    // InternalAdaptDsl.g:3584:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3590:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3591:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3601:1: entryRuleFontSize returns [String current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final String entryRuleFontSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFontSize = null;


        try {
            // InternalAdaptDsl.g:3601:48: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalAdaptDsl.g:3602:2: iv_ruleFontSize= ruleFontSize EOF
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
    // InternalAdaptDsl.g:3608:1: ruleFontSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleFontSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3614:2: (this_INT_0= RULE_INT )
            // InternalAdaptDsl.g:3615:2: this_INT_0= RULE_INT
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
    // InternalAdaptDsl.g:3625:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalAdaptDsl.g:3625:45: (iv_ruleValue= ruleValue EOF )
            // InternalAdaptDsl.g:3626:2: iv_ruleValue= ruleValue EOF
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
    // InternalAdaptDsl.g:3632:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_BOOL_2=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3638:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) )
            // InternalAdaptDsl.g:3639:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            {
            // InternalAdaptDsl.g:3639:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt28=1;
                }
                break;
            case RULE_STRING:
                {
                alt28=2;
                }
                break;
            case RULE_BOOL:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAdaptDsl.g:3640:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:3648:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:3656:3: this_BOOL_2= RULE_BOOL
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
    // InternalAdaptDsl.g:3667:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAdaptDsl.g:3667:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAdaptDsl.g:3668:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalAdaptDsl.g:3674:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3680:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' ) )
            // InternalAdaptDsl.g:3681:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' )
            {
            // InternalAdaptDsl.g:3681:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' )
            // InternalAdaptDsl.g:3682:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalAdaptDsl.g:3686:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:3687:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3687:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptDsl.g:3688:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAdaptDsl.g:3708:3: ( (lv_property_3_0= ruleProperty ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAdaptDsl.g:3709:4: (lv_property_3_0= ruleProperty )
            	    {
            	    // InternalAdaptDsl.g:3709:4: (lv_property_3_0= ruleProperty )
            	    // InternalAdaptDsl.g:3710:5: lv_property_3_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getPropertyPropertyParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketSemicolonKeyword_4());
            		

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
    // InternalAdaptDsl.g:3735:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAdaptDsl.g:3735:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAdaptDsl.g:3736:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAdaptDsl.g:3742:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_type_2_0 = null;

        EObject lv_update_8_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3748:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' ) )
            // InternalAdaptDsl.g:3749:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' )
            {
            // InternalAdaptDsl.g:3749:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' )
            // InternalAdaptDsl.g:3750:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};'
            {
            // InternalAdaptDsl.g:3750:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3751:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3751:4: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3752:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAdaptDsl.g:3772:3: ( (lv_type_2_0= ruleTYPE ) )
            // InternalAdaptDsl.g:3773:4: (lv_type_2_0= ruleTYPE )
            {
            // InternalAdaptDsl.g:3773:4: (lv_type_2_0= ruleTYPE )
            // InternalAdaptDsl.g:3774:5: lv_type_2_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTYPEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_44);
            lv_type_2_0=ruleTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.TYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,62,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getProviderKeyword_4());
            		
            // InternalAdaptDsl.g:3799:3: ( (otherlv_5= RULE_ID ) )
            // InternalAdaptDsl.g:3800:4: (otherlv_5= RULE_ID )
            {
            // InternalAdaptDsl.g:3800:4: (otherlv_5= RULE_ID )
            // InternalAdaptDsl.g:3801:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getProviderProviderCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_48); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,63,FOLLOW_49); 

            			newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getUpdateKeyword_7());
            		
            // InternalAdaptDsl.g:3820:3: ( (lv_update_8_0= ruleUpdateType ) )
            // InternalAdaptDsl.g:3821:4: (lv_update_8_0= ruleUpdateType )
            {
            // InternalAdaptDsl.g:3821:4: (lv_update_8_0= ruleUpdateType )
            // InternalAdaptDsl.g:3822:5: lv_update_8_0= ruleUpdateType
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getUpdateUpdateTypeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_update_8_0=ruleUpdateType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"update",
            						lv_update_8_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.UpdateType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getRightCurlyBracketSemicolonKeyword_9());
            		

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
    // InternalAdaptDsl.g:3847:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalAdaptDsl.g:3847:49: (iv_ruleProvider= ruleProvider EOF )
            // InternalAdaptDsl.g:3848:2: iv_ruleProvider= ruleProvider EOF
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
    // InternalAdaptDsl.g:3854:1: ruleProvider returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3860:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAdaptDsl.g:3861:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAdaptDsl.g:3861:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3862:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3862:3: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3863:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProviderRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
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
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleDefTypes"
    // InternalAdaptDsl.g:3882:1: entryRuleDefTypes returns [EObject current=null] : iv_ruleDefTypes= ruleDefTypes EOF ;
    public final EObject entryRuleDefTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefTypes = null;


        try {
            // InternalAdaptDsl.g:3882:49: (iv_ruleDefTypes= ruleDefTypes EOF )
            // InternalAdaptDsl.g:3883:2: iv_ruleDefTypes= ruleDefTypes EOF
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
    // InternalAdaptDsl.g:3889:1: ruleDefTypes returns [EObject current=null] : ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? ) ;
    public final EObject ruleDefTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3895:2: ( ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? ) )
            // InternalAdaptDsl.g:3896:2: ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? )
            {
            // InternalAdaptDsl.g:3896:2: ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? )
            // InternalAdaptDsl.g:3897:3: ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )?
            {
            // InternalAdaptDsl.g:3897:3: ( (lv_this_0_0= ruleDefType ) )
            // InternalAdaptDsl.g:3898:4: (lv_this_0_0= ruleDefType )
            {
            // InternalAdaptDsl.g:3898:4: (lv_this_0_0= ruleDefType )
            // InternalAdaptDsl.g:3899:5: lv_this_0_0= ruleDefType
            {

            					newCompositeNode(grammarAccess.getDefTypesAccess().getThisDefTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalAdaptDsl.g:3916:3: ( (lv_next_1_0= ruleDefTypes ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAdaptDsl.g:3917:4: (lv_next_1_0= ruleDefTypes )
                    {
                    // InternalAdaptDsl.g:3917:4: (lv_next_1_0= ruleDefTypes )
                    // InternalAdaptDsl.g:3918:5: lv_next_1_0= ruleDefTypes
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
    // InternalAdaptDsl.g:3939:1: entryRuleDefType returns [EObject current=null] : iv_ruleDefType= ruleDefType EOF ;
    public final EObject entryRuleDefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefType = null;


        try {
            // InternalAdaptDsl.g:3939:48: (iv_ruleDefType= ruleDefType EOF )
            // InternalAdaptDsl.g:3940:2: iv_ruleDefType= ruleDefType EOF
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
    // InternalAdaptDsl.g:3946:1: ruleDefType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' ) ;
    public final EObject ruleDefType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_enums_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3952:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' ) )
            // InternalAdaptDsl.g:3953:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:3953:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' )
            // InternalAdaptDsl.g:3954:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';'
            {
            // InternalAdaptDsl.g:3954:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3955:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3955:4: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3956:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_51); 

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

            otherlv_1=(Token)match(input,64,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDefTypeAccess().getColonKeyword_1());
            		
            // InternalAdaptDsl.g:3976:3: ( (lv_enums_2_0= ruleEnums ) )
            // InternalAdaptDsl.g:3977:4: (lv_enums_2_0= ruleEnums )
            {
            // InternalAdaptDsl.g:3977:4: (lv_enums_2_0= ruleEnums )
            // InternalAdaptDsl.g:3978:5: lv_enums_2_0= ruleEnums
            {

            					newCompositeNode(grammarAccess.getDefTypeAccess().getEnumsEnumsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

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
    // InternalAdaptDsl.g:4003:1: entryRuleEnums returns [EObject current=null] : iv_ruleEnums= ruleEnums EOF ;
    public final EObject entryRuleEnums() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnums = null;


        try {
            // InternalAdaptDsl.g:4003:46: (iv_ruleEnums= ruleEnums EOF )
            // InternalAdaptDsl.g:4004:2: iv_ruleEnums= ruleEnums EOF
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
    // InternalAdaptDsl.g:4010:1: ruleEnums returns [EObject current=null] : ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? ) ;
    public final EObject ruleEnums() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_this_0_0 = null;

        EObject lv_next_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:4016:2: ( ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? ) )
            // InternalAdaptDsl.g:4017:2: ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? )
            {
            // InternalAdaptDsl.g:4017:2: ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? )
            // InternalAdaptDsl.g:4018:3: ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )?
            {
            // InternalAdaptDsl.g:4018:3: ( (lv_this_0_0= ruleEnum ) )
            // InternalAdaptDsl.g:4019:4: (lv_this_0_0= ruleEnum )
            {
            // InternalAdaptDsl.g:4019:4: (lv_this_0_0= ruleEnum )
            // InternalAdaptDsl.g:4020:5: lv_this_0_0= ruleEnum
            {

            					newCompositeNode(grammarAccess.getEnumsAccess().getThisEnumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalAdaptDsl.g:4037:3: (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAdaptDsl.g:4038:4: otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) )
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumsAccess().getCommaKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:4042:4: ( (lv_next_2_0= ruleEnums ) )
                    // InternalAdaptDsl.g:4043:5: (lv_next_2_0= ruleEnums )
                    {
                    // InternalAdaptDsl.g:4043:5: (lv_next_2_0= ruleEnums )
                    // InternalAdaptDsl.g:4044:6: lv_next_2_0= ruleEnums
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
    // InternalAdaptDsl.g:4066:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalAdaptDsl.g:4066:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalAdaptDsl.g:4067:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalAdaptDsl.g:4073:1: ruleEnum returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:4079:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:4080:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:4080:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:4081:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:4081:3: (lv_name_0_0= RULE_STRING )
            // InternalAdaptDsl.g:4082:4: lv_name_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleTYPE"
    // InternalAdaptDsl.g:4101:1: entryRuleTYPE returns [EObject current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final EObject entryRuleTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE = null;


        try {
            // InternalAdaptDsl.g:4101:45: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalAdaptDsl.g:4102:2: iv_ruleTYPE= ruleTYPE EOF
            {
             newCompositeNode(grammarAccess.getTYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;

             current =iv_ruleTYPE; 
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
    // $ANTLR end "entryRuleTYPE"


    // $ANTLR start "ruleTYPE"
    // InternalAdaptDsl.g:4108:1: ruleTYPE returns [EObject current=null] : ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_number_1_0=null;
        Token lv_boolean_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:4114:2: ( ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalAdaptDsl.g:4115:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalAdaptDsl.g:4115:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt32=1;
                }
                break;
            case 66:
                {
                alt32=2;
                }
                break;
            case 67:
                {
                alt32=3;
                }
                break;
            case RULE_ID:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAdaptDsl.g:4116:3: ( (lv_string_0_0= 'string' ) )
                    {
                    // InternalAdaptDsl.g:4116:3: ( (lv_string_0_0= 'string' ) )
                    // InternalAdaptDsl.g:4117:4: (lv_string_0_0= 'string' )
                    {
                    // InternalAdaptDsl.g:4117:4: (lv_string_0_0= 'string' )
                    // InternalAdaptDsl.g:4118:5: lv_string_0_0= 'string'
                    {
                    lv_string_0_0=(Token)match(input,65,FOLLOW_2); 

                    					newLeafNode(lv_string_0_0, grammarAccess.getTYPEAccess().getStringStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    					setWithLastConsumed(current, "string", lv_string_0_0, "string");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:4131:3: ( (lv_number_1_0= 'number' ) )
                    {
                    // InternalAdaptDsl.g:4131:3: ( (lv_number_1_0= 'number' ) )
                    // InternalAdaptDsl.g:4132:4: (lv_number_1_0= 'number' )
                    {
                    // InternalAdaptDsl.g:4132:4: (lv_number_1_0= 'number' )
                    // InternalAdaptDsl.g:4133:5: lv_number_1_0= 'number'
                    {
                    lv_number_1_0=(Token)match(input,66,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getTYPEAccess().getNumberNumberKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    					setWithLastConsumed(current, "number", lv_number_1_0, "number");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:4146:3: ( (lv_boolean_2_0= 'boolean' ) )
                    {
                    // InternalAdaptDsl.g:4146:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // InternalAdaptDsl.g:4147:4: (lv_boolean_2_0= 'boolean' )
                    {
                    // InternalAdaptDsl.g:4147:4: (lv_boolean_2_0= 'boolean' )
                    // InternalAdaptDsl.g:4148:5: lv_boolean_2_0= 'boolean'
                    {
                    lv_boolean_2_0=(Token)match(input,67,FOLLOW_2); 

                    					newLeafNode(lv_boolean_2_0, grammarAccess.getTYPEAccess().getBooleanBooleanKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    					setWithLastConsumed(current, "boolean", lv_boolean_2_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:4161:3: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalAdaptDsl.g:4161:3: ( (otherlv_3= RULE_ID ) )
                    // InternalAdaptDsl.g:4162:4: (otherlv_3= RULE_ID )
                    {
                    // InternalAdaptDsl.g:4162:4: (otherlv_3= RULE_ID )
                    // InternalAdaptDsl.g:4163:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTYPERule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getTYPEAccess().getDeftypeDefTypeCrossReference_3_0());
                    				

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
    // $ANTLR end "ruleTYPE"


    // $ANTLR start "entryRuleUpdateType"
    // InternalAdaptDsl.g:4178:1: entryRuleUpdateType returns [EObject current=null] : iv_ruleUpdateType= ruleUpdateType EOF ;
    public final EObject entryRuleUpdateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateType = null;


        try {
            // InternalAdaptDsl.g:4178:51: (iv_ruleUpdateType= ruleUpdateType EOF )
            // InternalAdaptDsl.g:4179:2: iv_ruleUpdateType= ruleUpdateType EOF
            {
             newCompositeNode(grammarAccess.getUpdateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateType=ruleUpdateType();

            state._fsp--;

             current =iv_ruleUpdateType; 
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
    // $ANTLR end "entryRuleUpdateType"


    // $ANTLR start "ruleUpdateType"
    // InternalAdaptDsl.g:4185:1: ruleUpdateType returns [EObject current=null] : ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) ) ;
    public final EObject ruleUpdateType() throws RecognitionException {
        EObject current = null;

        Token lv_event_0_0=null;
        Token lv_slow_1_0=null;
        Token lv_fast_2_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:4191:2: ( ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) ) )
            // InternalAdaptDsl.g:4192:2: ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) )
            {
            // InternalAdaptDsl.g:4192:2: ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt33=1;
                }
                break;
            case 69:
                {
                alt33=2;
                }
                break;
            case 70:
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
                    // InternalAdaptDsl.g:4193:3: ( (lv_event_0_0= 'eventTriggered' ) )
                    {
                    // InternalAdaptDsl.g:4193:3: ( (lv_event_0_0= 'eventTriggered' ) )
                    // InternalAdaptDsl.g:4194:4: (lv_event_0_0= 'eventTriggered' )
                    {
                    // InternalAdaptDsl.g:4194:4: (lv_event_0_0= 'eventTriggered' )
                    // InternalAdaptDsl.g:4195:5: lv_event_0_0= 'eventTriggered'
                    {
                    lv_event_0_0=(Token)match(input,68,FOLLOW_2); 

                    					newLeafNode(lv_event_0_0, grammarAccess.getUpdateTypeAccess().getEventEventTriggeredKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUpdateTypeRule());
                    					}
                    					setWithLastConsumed(current, "event", lv_event_0_0, "eventTriggered");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:4208:3: ( (lv_slow_1_0= 'slow' ) )
                    {
                    // InternalAdaptDsl.g:4208:3: ( (lv_slow_1_0= 'slow' ) )
                    // InternalAdaptDsl.g:4209:4: (lv_slow_1_0= 'slow' )
                    {
                    // InternalAdaptDsl.g:4209:4: (lv_slow_1_0= 'slow' )
                    // InternalAdaptDsl.g:4210:5: lv_slow_1_0= 'slow'
                    {
                    lv_slow_1_0=(Token)match(input,69,FOLLOW_2); 

                    					newLeafNode(lv_slow_1_0, grammarAccess.getUpdateTypeAccess().getSlowSlowKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUpdateTypeRule());
                    					}
                    					setWithLastConsumed(current, "slow", lv_slow_1_0, "slow");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:4223:3: ( (lv_fast_2_0= 'fast' ) )
                    {
                    // InternalAdaptDsl.g:4223:3: ( (lv_fast_2_0= 'fast' ) )
                    // InternalAdaptDsl.g:4224:4: (lv_fast_2_0= 'fast' )
                    {
                    // InternalAdaptDsl.g:4224:4: (lv_fast_2_0= 'fast' )
                    // InternalAdaptDsl.g:4225:5: lv_fast_2_0= 'fast'
                    {
                    lv_fast_2_0=(Token)match(input,70,FOLLOW_2); 

                    					newLeafNode(lv_fast_2_0, grammarAccess.getUpdateTypeAccess().getFastFastKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUpdateTypeRule());
                    					}
                    					setWithLastConsumed(current, "fast", lv_fast_2_0, "fast");
                    				

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
    // $ANTLR end "ruleUpdateType"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\7\uffff\1\14\6\uffff";
    static final String dfa_3s = "\1\5\1\42\1\5\1\43\1\42\1\5\1\43\1\35\3\4\3\uffff";
    static final String dfa_4s = "\1\5\1\42\1\5\1\43\1\42\1\5\1\43\1\53\2\7\1\6\3\uffff";
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
            "\1\14\2\uffff\2\14\3\uffff\2\13\1\10\1\11\2\13\1\12",
            "\1\15\1\uffff\1\13\1\14",
            "\1\15\1\uffff\1\13\1\14",
            "\1\15\1\uffff\1\13",
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

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "945:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\7\uffff\1\10\2\uffff";
    static final String dfa_10s = "\1\5\1\42\1\5\1\43\1\42\1\5\1\43\1\35\2\uffff";
    static final String dfa_11s = "\1\5\1\42\1\5\1\43\1\42\1\5\1\43\1\50\2\uffff";
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
            "\1\10\2\uffff\2\10\5\uffff\2\11",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1023:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x200000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x1FFFD00000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000FE000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000098000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1FFFD00000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000020L,0x000000000000000EL});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000002L});

}