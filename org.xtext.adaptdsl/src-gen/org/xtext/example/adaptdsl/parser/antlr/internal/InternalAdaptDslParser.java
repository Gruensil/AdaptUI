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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContextModel{'", "'Providers{'", "';'", "'};'", "'DefTypes{'", "'AdaptationModel{'", "'flow'", "'{'", "'service'", "'from'", "'as'", "'function'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'.get'", "'()'", "'.set'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addViewComponentButton'", "'deleteViewComponentButton'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'", "'Entity'", "'provider'", "'update'", "':'", "'string'", "'number'", "'boolean'", "'eventTriggered'", "'slow'", "'fast'"
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
    // InternalAdaptDsl.g:1370:1: entryRuleFactProperty returns [EObject current=null] : iv_ruleFactProperty= ruleFactProperty EOF ;
    public final EObject entryRuleFactProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactProperty = null;


        try {
            // InternalAdaptDsl.g:1370:53: (iv_ruleFactProperty= ruleFactProperty EOF )
            // InternalAdaptDsl.g:1371:2: iv_ruleFactProperty= ruleFactProperty EOF
            {
             newCompositeNode(grammarAccess.getFactPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactProperty=ruleFactProperty();

            state._fsp--;

             current =iv_ruleFactProperty; 
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
    // InternalAdaptDsl.g:1377:1: ruleFactProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.set' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_value_7_0= ruleValue ) ) otherlv_8= ')' ) ;
    public final EObject ruleFactProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_propertyName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1383:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.set' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_value_7_0= ruleValue ) ) otherlv_8= ')' ) )
            // InternalAdaptDsl.g:1384:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.set' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_value_7_0= ruleValue ) ) otherlv_8= ')' )
            {
            // InternalAdaptDsl.g:1384:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.set' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_value_7_0= ruleValue ) ) otherlv_8= ')' )
            // InternalAdaptDsl.g:1385:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.get' ( (otherlv_2= RULE_ID ) ) otherlv_3= '()' otherlv_4= '.set' ( (lv_propertyName_5_0= RULE_ID ) ) otherlv_6= '(' ( (lv_value_7_0= ruleValue ) ) otherlv_8= ')'
            {
            // InternalAdaptDsl.g:1385:3: ( (otherlv_0= RULE_ID ) )
            // InternalAdaptDsl.g:1386:4: (otherlv_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1386:4: (otherlv_0= RULE_ID )
            // InternalAdaptDsl.g:1387:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_0, grammarAccess.getFactPropertyAccess().getFactNameFactNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFactPropertyAccess().getGetKeyword_1());
            		
            // InternalAdaptDsl.g:1402:3: ( (otherlv_2= RULE_ID ) )
            // InternalAdaptDsl.g:1403:4: (otherlv_2= RULE_ID )
            {
            // InternalAdaptDsl.g:1403:4: (otherlv_2= RULE_ID )
            // InternalAdaptDsl.g:1404:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_2, grammarAccess.getFactPropertyAccess().getEntityEntityCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,36,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getFactPropertyAccess().getSetKeyword_4());
            		
            // InternalAdaptDsl.g:1423:3: ( (lv_propertyName_5_0= RULE_ID ) )
            // InternalAdaptDsl.g:1424:4: (lv_propertyName_5_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1424:4: (lv_propertyName_5_0= RULE_ID )
            // InternalAdaptDsl.g:1425:5: lv_propertyName_5_0= RULE_ID
            {
            lv_propertyName_5_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_propertyName_5_0, grammarAccess.getFactPropertyAccess().getPropertyNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFactPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"propertyName",
            						lv_propertyName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_40); 

            			newLeafNode(otherlv_6, grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_6());
            		
            // InternalAdaptDsl.g:1445:3: ( (lv_value_7_0= ruleValue ) )
            // InternalAdaptDsl.g:1446:4: (lv_value_7_0= ruleValue )
            {
            // InternalAdaptDsl.g:1446:4: (lv_value_7_0= ruleValue )
            // InternalAdaptDsl.g:1447:5: lv_value_7_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getFactPropertyAccess().getValueValueParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_7_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_8());
            		

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
    // InternalAdaptDsl.g:1472:1: entryRuleNumberOperators returns [String current=null] : iv_ruleNumberOperators= ruleNumberOperators EOF ;
    public final String entryRuleNumberOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberOperators = null;


        try {
            // InternalAdaptDsl.g:1472:55: (iv_ruleNumberOperators= ruleNumberOperators EOF )
            // InternalAdaptDsl.g:1473:2: iv_ruleNumberOperators= ruleNumberOperators EOF
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
    // InternalAdaptDsl.g:1479:1: ruleNumberOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleNumberOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1485:2: ( (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) )
            // InternalAdaptDsl.g:1486:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1486:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            case 41:
                {
                alt13=5;
                }
                break;
            case 42:
                {
                alt13=6;
                }
                break;
            case 43:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAdaptDsl.g:1487:3: kw= '>'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1493:3: kw= '<'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1499:3: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1505:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1511:3: kw= '>='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1517:3: kw= '<='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1523:3: kw= '==='
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
    // InternalAdaptDsl.g:1532:1: entryRuleStringOperators returns [String current=null] : iv_ruleStringOperators= ruleStringOperators EOF ;
    public final String entryRuleStringOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOperators = null;


        try {
            // InternalAdaptDsl.g:1532:55: (iv_ruleStringOperators= ruleStringOperators EOF )
            // InternalAdaptDsl.g:1533:2: iv_ruleStringOperators= ruleStringOperators EOF
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
    // InternalAdaptDsl.g:1539:1: ruleStringOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleStringOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1545:2: ( (kw= '==' | kw= '!=' | kw= '===' ) )
            // InternalAdaptDsl.g:1546:2: (kw= '==' | kw= '!=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1546:2: (kw= '==' | kw= '!=' | kw= '===' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 43:
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
                    // InternalAdaptDsl.g:1547:3: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1553:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1559:3: kw= '==='
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
    // InternalAdaptDsl.g:1568:1: entryRuleBoolOperators returns [String current=null] : iv_ruleBoolOperators= ruleBoolOperators EOF ;
    public final String entryRuleBoolOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOperators = null;


        try {
            // InternalAdaptDsl.g:1568:53: (iv_ruleBoolOperators= ruleBoolOperators EOF )
            // InternalAdaptDsl.g:1569:2: iv_ruleBoolOperators= ruleBoolOperators EOF
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
    // InternalAdaptDsl.g:1575:1: ruleBoolOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1581:2: ( (kw= '==' | kw= '!=' ) )
            // InternalAdaptDsl.g:1582:2: (kw= '==' | kw= '!=' )
            {
            // InternalAdaptDsl.g:1582:2: (kw= '==' | kw= '!=' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdaptDsl.g:1583:3: kw= '=='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1589:3: kw= '!='
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
    // InternalAdaptDsl.g:1598:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalAdaptDsl.g:1598:48: (iv_ruleActions= ruleActions EOF )
            // InternalAdaptDsl.g:1599:2: iv_ruleActions= ruleActions EOF
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
    // InternalAdaptDsl.g:1605:1: ruleActions returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1611:2: ( ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) )
            // InternalAdaptDsl.g:1612:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            {
            // InternalAdaptDsl.g:1612:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            // InternalAdaptDsl.g:1613:3: ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )?
            {
            // InternalAdaptDsl.g:1613:3: ( (lv_action_0_0= ruleAction ) )
            // InternalAdaptDsl.g:1614:4: (lv_action_0_0= ruleAction )
            {
            // InternalAdaptDsl.g:1614:4: (lv_action_0_0= ruleAction )
            // InternalAdaptDsl.g:1615:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getActionsAccess().getActionActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalAdaptDsl.g:1632:3: ( (lv_next_1_0= ruleActions ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44||(LA16_0>=46 && LA16_0<=60)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAdaptDsl.g:1633:4: (lv_next_1_0= ruleActions )
                    {
                    // InternalAdaptDsl.g:1633:4: (lv_next_1_0= ruleActions )
                    // InternalAdaptDsl.g:1634:5: lv_next_1_0= ruleActions
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
    // InternalAdaptDsl.g:1655:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAdaptDsl.g:1655:47: (iv_ruleAction= ruleAction EOF )
            // InternalAdaptDsl.g:1656:2: iv_ruleAction= ruleAction EOF
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
    // InternalAdaptDsl.g:1662:1: ruleAction returns [EObject current=null] : ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionCategory_0_0 = null;

        EObject lv_actionCategory_1_0 = null;

        EObject lv_actionCategory_2_0 = null;

        EObject lv_actionCategory_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1668:2: ( ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) )
            // InternalAdaptDsl.g:1669:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            {
            // InternalAdaptDsl.g:1669:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 44:
            case 46:
            case 47:
                {
                alt17=1;
                }
                break;
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt17=2;
                }
                break;
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt17=3;
                }
                break;
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdaptDsl.g:1670:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    {
                    // InternalAdaptDsl.g:1670:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    // InternalAdaptDsl.g:1671:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    {
                    // InternalAdaptDsl.g:1671:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    // InternalAdaptDsl.g:1672:5: lv_actionCategory_0_0= ruleServiceOperation
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
                    // InternalAdaptDsl.g:1690:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1690:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    // InternalAdaptDsl.g:1691:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    {
                    // InternalAdaptDsl.g:1691:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    // InternalAdaptDsl.g:1692:5: lv_actionCategory_1_0= ruleTaskChangeOperation
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
                    // InternalAdaptDsl.g:1710:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1710:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    // InternalAdaptDsl.g:1711:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    {
                    // InternalAdaptDsl.g:1711:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    // InternalAdaptDsl.g:1712:5: lv_actionCategory_2_0= ruleNavigationChangeOperation
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
                    // InternalAdaptDsl.g:1730:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1730:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    // InternalAdaptDsl.g:1731:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    {
                    // InternalAdaptDsl.g:1731:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    // InternalAdaptDsl.g:1732:5: lv_actionCategory_3_0= ruleLayoutChangeOperation
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
    // InternalAdaptDsl.g:1753:1: entryRuleServiceOperation returns [EObject current=null] : iv_ruleServiceOperation= ruleServiceOperation EOF ;
    public final EObject entryRuleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceOperation = null;


        try {
            // InternalAdaptDsl.g:1753:57: (iv_ruleServiceOperation= ruleServiceOperation EOF )
            // InternalAdaptDsl.g:1754:2: iv_ruleServiceOperation= ruleServiceOperation EOF
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
    // InternalAdaptDsl.g:1760:1: ruleServiceOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) ;
    public final EObject ruleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1766:2: ( ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) )
            // InternalAdaptDsl.g:1767:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            {
            // InternalAdaptDsl.g:1767:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
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
                    // InternalAdaptDsl.g:1768:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    {
                    // InternalAdaptDsl.g:1768:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    // InternalAdaptDsl.g:1769:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    {
                    // InternalAdaptDsl.g:1769:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    // InternalAdaptDsl.g:1770:5: lv_operation_0_0= ruleServiceFunctionCallOperation
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
                    // InternalAdaptDsl.g:1788:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    {
                    // InternalAdaptDsl.g:1788:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    // InternalAdaptDsl.g:1789:4: (lv_operation_1_0= ruleEditFactOperation )
                    {
                    // InternalAdaptDsl.g:1789:4: (lv_operation_1_0= ruleEditFactOperation )
                    // InternalAdaptDsl.g:1790:5: lv_operation_1_0= ruleEditFactOperation
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
                    // InternalAdaptDsl.g:1808:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    {
                    // InternalAdaptDsl.g:1808:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    // InternalAdaptDsl.g:1809:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    {
                    // InternalAdaptDsl.g:1809:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    // InternalAdaptDsl.g:1810:5: lv_operation_2_0= ruleSetDisplayPropertyOperation
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
    // InternalAdaptDsl.g:1831:1: entryRuleServiceFunctionCallOperation returns [EObject current=null] : iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF ;
    public final EObject entryRuleServiceFunctionCallOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceFunctionCallOperation = null;


        try {
            // InternalAdaptDsl.g:1831:69: (iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF )
            // InternalAdaptDsl.g:1832:2: iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF
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
    // InternalAdaptDsl.g:1838:1: ruleServiceFunctionCallOperation returns [EObject current=null] : (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // InternalAdaptDsl.g:1844:2: ( (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:1845:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:1845:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:1846:3: otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1854:3: ( (lv_service_2_0= RULE_ID ) )
            // InternalAdaptDsl.g:1855:4: (lv_service_2_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1855:4: (lv_service_2_0= RULE_ID )
            // InternalAdaptDsl.g:1856:5: lv_service_2_0= RULE_ID
            {
            lv_service_2_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalAdaptDsl.g:1876:3: ( (lv_function_4_0= RULE_ID ) )
            // InternalAdaptDsl.g:1877:4: (lv_function_4_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1877:4: (lv_function_4_0= RULE_ID )
            // InternalAdaptDsl.g:1878:5: lv_function_4_0= RULE_ID
            {
            lv_function_4_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            otherlv_5=(Token)match(input,45,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:1898:3: ( (lv_val_6_0= ruleValue ) )
            // InternalAdaptDsl.g:1899:4: (lv_val_6_0= ruleValue )
            {
            // InternalAdaptDsl.g:1899:4: (lv_val_6_0= ruleValue )
            // InternalAdaptDsl.g:1900:5: lv_val_6_0= ruleValue
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
    // InternalAdaptDsl.g:1929:1: entryRuleEditFactOperation returns [EObject current=null] : iv_ruleEditFactOperation= ruleEditFactOperation EOF ;
    public final EObject entryRuleEditFactOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditFactOperation = null;


        try {
            // InternalAdaptDsl.g:1929:58: (iv_ruleEditFactOperation= ruleEditFactOperation EOF )
            // InternalAdaptDsl.g:1930:2: iv_ruleEditFactOperation= ruleEditFactOperation EOF
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
    // InternalAdaptDsl.g:1936:1: ruleEditFactOperation returns [EObject current=null] : (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleEditFactOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_prop_2_0 = null;

        AntlrDatatypeRuleToken lv_val_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1942:2: ( (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:1943:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:1943:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:1944:3: otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1952:3: ( (lv_prop_2_0= ruleFactProperty ) )
            // InternalAdaptDsl.g:1953:4: (lv_prop_2_0= ruleFactProperty )
            {
            // InternalAdaptDsl.g:1953:4: (lv_prop_2_0= ruleFactProperty )
            // InternalAdaptDsl.g:1954:5: lv_prop_2_0= ruleFactProperty
            {

            					newCompositeNode(grammarAccess.getEditFactOperationAccess().getPropFactPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalAdaptDsl.g:1971:3: (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptDsl.g:1972:4: otherlv_3= ',' ( (lv_val_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalAdaptDsl.g:1976:4: ( (lv_val_4_0= ruleValue ) )
                    // InternalAdaptDsl.g:1977:5: (lv_val_4_0= ruleValue )
                    {
                    // InternalAdaptDsl.g:1977:5: (lv_val_4_0= ruleValue )
                    // InternalAdaptDsl.g:1978:6: lv_val_4_0= ruleValue
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
    // InternalAdaptDsl.g:2008:1: entryRuleSetDisplayPropertyOperation returns [EObject current=null] : iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF ;
    public final EObject entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDisplayPropertyOperation = null;


        try {
            // InternalAdaptDsl.g:2008:68: (iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptDsl.g:2009:2: iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF
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
    // InternalAdaptDsl.g:2015:1: ruleSetDisplayPropertyOperation returns [EObject current=null] : (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:2021:2: ( (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2022:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2022:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2023:3: otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2031:3: ( (lv_property_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2032:4: (lv_property_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2032:4: (lv_property_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2033:5: lv_property_2_0= RULE_STRING
            {
            lv_property_2_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

            otherlv_3=(Token)match(input,45,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2053:3: ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:2054:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:2054:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:2055:5: lv_propertyValue_4_0= ruleDisplayPropertyValue
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
    // InternalAdaptDsl.g:2084:1: entryRuleDisplayPropertyValue returns [EObject current=null] : iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF ;
    public final EObject entryRuleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayPropertyValue = null;


        try {
            // InternalAdaptDsl.g:2084:61: (iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF )
            // InternalAdaptDsl.g:2085:2: iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF
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
    // InternalAdaptDsl.g:2091:1: ruleDisplayPropertyValue returns [EObject current=null] : ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) ;
    public final EObject ruleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyClass_0_0 = null;

        EObject lv_propertyClass_1_0 = null;

        EObject lv_propertyClass_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2097:2: ( ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) )
            // InternalAdaptDsl.g:2098:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            {
            // InternalAdaptDsl.g:2098:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            case RULE_BOOL:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:2099:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    {
                    // InternalAdaptDsl.g:2099:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    // InternalAdaptDsl.g:2100:4: (lv_propertyClass_0_0= ruleIntValue )
                    {
                    // InternalAdaptDsl.g:2100:4: (lv_propertyClass_0_0= ruleIntValue )
                    // InternalAdaptDsl.g:2101:5: lv_propertyClass_0_0= ruleIntValue
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
                    // InternalAdaptDsl.g:2119:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    {
                    // InternalAdaptDsl.g:2119:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    // InternalAdaptDsl.g:2120:4: (lv_propertyClass_1_0= ruleStringValue )
                    {
                    // InternalAdaptDsl.g:2120:4: (lv_propertyClass_1_0= ruleStringValue )
                    // InternalAdaptDsl.g:2121:5: lv_propertyClass_1_0= ruleStringValue
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
                    // InternalAdaptDsl.g:2139:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    {
                    // InternalAdaptDsl.g:2139:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    // InternalAdaptDsl.g:2140:4: (lv_propertyClass_2_0= ruleBoolValue )
                    {
                    // InternalAdaptDsl.g:2140:4: (lv_propertyClass_2_0= ruleBoolValue )
                    // InternalAdaptDsl.g:2141:5: lv_propertyClass_2_0= ruleBoolValue
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
    // InternalAdaptDsl.g:2162:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAdaptDsl.g:2162:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAdaptDsl.g:2163:2: iv_ruleIntValue= ruleIntValue EOF
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
    // InternalAdaptDsl.g:2169:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2175:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:2176:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:2176:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAdaptDsl.g:2177:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAdaptDsl.g:2177:3: (lv_value_0_0= RULE_INT )
            // InternalAdaptDsl.g:2178:4: lv_value_0_0= RULE_INT
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
    // InternalAdaptDsl.g:2197:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAdaptDsl.g:2197:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAdaptDsl.g:2198:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalAdaptDsl.g:2204:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2210:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:2211:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:2211:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2212:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2212:3: (lv_value_0_0= RULE_STRING )
            // InternalAdaptDsl.g:2213:4: lv_value_0_0= RULE_STRING
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
    // InternalAdaptDsl.g:2232:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalAdaptDsl.g:2232:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalAdaptDsl.g:2233:2: iv_ruleBoolValue= ruleBoolValue EOF
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
    // InternalAdaptDsl.g:2239:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2245:2: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // InternalAdaptDsl.g:2246:2: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // InternalAdaptDsl.g:2246:2: ( (lv_value_0_0= RULE_BOOL ) )
            // InternalAdaptDsl.g:2247:3: (lv_value_0_0= RULE_BOOL )
            {
            // InternalAdaptDsl.g:2247:3: (lv_value_0_0= RULE_BOOL )
            // InternalAdaptDsl.g:2248:4: lv_value_0_0= RULE_BOOL
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
    // InternalAdaptDsl.g:2267:1: entryRuleTaskChangeOperation returns [EObject current=null] : iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF ;
    public final EObject entryRuleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2267:60: (iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:2268:2: iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF
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
    // InternalAdaptDsl.g:2274:1: ruleTaskChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) ) ;
    public final EObject ruleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2280:2: ( ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) ) )
            // InternalAdaptDsl.g:2281:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) )
            {
            // InternalAdaptDsl.g:2281:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) | ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) ) | ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt21=1;
                }
                break;
            case 49:
                {
                alt21=2;
                }
                break;
            case 50:
                {
                alt21=3;
                }
                break;
            case 51:
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
                    // InternalAdaptDsl.g:2282:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2282:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    // InternalAdaptDsl.g:2283:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2283:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    // InternalAdaptDsl.g:2284:5: lv_operation_0_0= ruleAddViewComponentOperation
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
                    // InternalAdaptDsl.g:2302:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2302:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    // InternalAdaptDsl.g:2303:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2303:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    // InternalAdaptDsl.g:2304:5: lv_operation_1_0= ruleDeleteViewComponentOperation
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
                    // InternalAdaptDsl.g:2322:3: ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) )
                    {
                    // InternalAdaptDsl.g:2322:3: ( (lv_operation_2_0= ruleAddViewComponentButtonOperation ) )
                    // InternalAdaptDsl.g:2323:4: (lv_operation_2_0= ruleAddViewComponentButtonOperation )
                    {
                    // InternalAdaptDsl.g:2323:4: (lv_operation_2_0= ruleAddViewComponentButtonOperation )
                    // InternalAdaptDsl.g:2324:5: lv_operation_2_0= ruleAddViewComponentButtonOperation
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
                    // InternalAdaptDsl.g:2342:3: ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) )
                    {
                    // InternalAdaptDsl.g:2342:3: ( (lv_operation_3_0= ruleDeleteViewComponentButtonOperation ) )
                    // InternalAdaptDsl.g:2343:4: (lv_operation_3_0= ruleDeleteViewComponentButtonOperation )
                    {
                    // InternalAdaptDsl.g:2343:4: (lv_operation_3_0= ruleDeleteViewComponentButtonOperation )
                    // InternalAdaptDsl.g:2344:5: lv_operation_3_0= ruleDeleteViewComponentButtonOperation
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
    // InternalAdaptDsl.g:2365:1: entryRuleAddViewComponentOperation returns [EObject current=null] : iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF ;
    public final EObject entryRuleAddViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2365:66: (iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:2366:2: iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF
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
    // InternalAdaptDsl.g:2372:1: ruleAddViewComponentOperation returns [EObject current=null] : (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:2378:2: ( (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2379:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2379:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2380:3: otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2388:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2389:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2389:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2390:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalAdaptDsl.g:2411:3: ( (lv_target_4_0= ruleTargetContainer ) )
            // InternalAdaptDsl.g:2412:4: (lv_target_4_0= ruleTargetContainer )
            {
            // InternalAdaptDsl.g:2412:4: (lv_target_4_0= ruleTargetContainer )
            // InternalAdaptDsl.g:2413:5: lv_target_4_0= ruleTargetContainer
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
    // InternalAdaptDsl.g:2442:1: entryRuleDeleteViewComponentOperation returns [EObject current=null] : iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF ;
    public final EObject entryRuleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2442:69: (iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:2443:2: iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF
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
    // InternalAdaptDsl.g:2449:1: ruleDeleteViewComponentOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2455:2: ( (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2456:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2456:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2457:3: otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2465:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2466:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2466:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2467:5: lv_viewComp_2_0= ruleViewComponent
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
    // InternalAdaptDsl.g:2496:1: entryRuleAddViewComponentButtonOperation returns [EObject current=null] : iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF ;
    public final EObject entryRuleAddViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentButtonOperation = null;


        try {
            // InternalAdaptDsl.g:2496:72: (iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:2497:2: iv_ruleAddViewComponentButtonOperation= ruleAddViewComponentButtonOperation EOF
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
    // InternalAdaptDsl.g:2503:1: ruleAddViewComponentButtonOperation returns [EObject current=null] : (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // InternalAdaptDsl.g:2509:2: ( (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:2510:2: (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:2510:2: (otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:2511:3: otherlv_0= 'addViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_langKey_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_action_6_0= RULE_STRING ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentButtonOperationAccess().getAddViewComponentButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2519:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2520:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2520:4: (lv_id_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2521:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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
            		
            // InternalAdaptDsl.g:2541:3: ( (lv_langKey_4_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2542:4: (lv_langKey_4_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2542:4: (lv_langKey_4_0= RULE_STRING )
            // InternalAdaptDsl.g:2543:5: lv_langKey_4_0= RULE_STRING
            {
            lv_langKey_4_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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
            		
            // InternalAdaptDsl.g:2563:3: ( (lv_action_6_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2564:4: (lv_action_6_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2564:4: (lv_action_6_0= RULE_STRING )
            // InternalAdaptDsl.g:2565:5: lv_action_6_0= RULE_STRING
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
    // InternalAdaptDsl.g:2593:1: entryRuleDeleteViewComponentButtonOperation returns [EObject current=null] : iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF ;
    public final EObject entryRuleDeleteViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentButtonOperation = null;


        try {
            // InternalAdaptDsl.g:2593:75: (iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF )
            // InternalAdaptDsl.g:2594:2: iv_ruleDeleteViewComponentButtonOperation= ruleDeleteViewComponentButtonOperation EOF
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
    // InternalAdaptDsl.g:2600:1: ruleDeleteViewComponentButtonOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentButtonOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2606:2: ( (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2607:2: (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2607:2: (otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2608:3: otherlv_0= 'deleteViewComponentButton' otherlv_1= '(' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentButtonOperationAccess().getDeleteViewComponentButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentButtonOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2616:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:2617:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:2617:4: (lv_id_2_0= RULE_STRING )
            // InternalAdaptDsl.g:2618:5: lv_id_2_0= RULE_STRING
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
    // InternalAdaptDsl.g:2646:1: entryRuleViewComponent returns [String current=null] : iv_ruleViewComponent= ruleViewComponent EOF ;
    public final String entryRuleViewComponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleViewComponent = null;


        try {
            // InternalAdaptDsl.g:2646:53: (iv_ruleViewComponent= ruleViewComponent EOF )
            // InternalAdaptDsl.g:2647:2: iv_ruleViewComponent= ruleViewComponent EOF
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
    // InternalAdaptDsl.g:2653:1: ruleViewComponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleViewComponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2659:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2660:2: this_ID_0= RULE_ID
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
    // InternalAdaptDsl.g:2670:1: entryRuleTargetContainer returns [String current=null] : iv_ruleTargetContainer= ruleTargetContainer EOF ;
    public final String entryRuleTargetContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTargetContainer = null;


        try {
            // InternalAdaptDsl.g:2670:55: (iv_ruleTargetContainer= ruleTargetContainer EOF )
            // InternalAdaptDsl.g:2671:2: iv_ruleTargetContainer= ruleTargetContainer EOF
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
    // InternalAdaptDsl.g:2677:1: ruleTargetContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTargetContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2683:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2684:2: this_ID_0= RULE_ID
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
    // InternalAdaptDsl.g:2694:1: entryRuleNavigationChangeOperation returns [EObject current=null] : iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF ;
    public final EObject entryRuleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2694:66: (iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:2695:2: iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF
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
    // InternalAdaptDsl.g:2701:1: ruleNavigationChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) ;
    public final EObject ruleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2707:2: ( ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) )
            // InternalAdaptDsl.g:2708:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            {
            // InternalAdaptDsl.g:2708:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt22=1;
                }
                break;
            case 53:
                {
                alt22=2;
                }
                break;
            case 54:
                {
                alt22=3;
                }
                break;
            case 55:
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
                    // InternalAdaptDsl.g:2709:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2709:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    // InternalAdaptDsl.g:2710:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2710:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    // InternalAdaptDsl.g:2711:5: lv_operation_0_0= ruleAddNavLinkOperation
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
                    // InternalAdaptDsl.g:2729:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2729:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    // InternalAdaptDsl.g:2730:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2730:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    // InternalAdaptDsl.g:2731:5: lv_operation_1_0= ruleDeleteNavLinkOperation
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
                    // InternalAdaptDsl.g:2749:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2749:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    // InternalAdaptDsl.g:2750:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2750:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    // InternalAdaptDsl.g:2751:5: lv_operation_2_0= ruleRedirectNavLinkOperation
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
                    // InternalAdaptDsl.g:2769:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    {
                    // InternalAdaptDsl.g:2769:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    // InternalAdaptDsl.g:2770:4: (lv_operation_3_0= ruleClearNavOperation )
                    {
                    // InternalAdaptDsl.g:2770:4: (lv_operation_3_0= ruleClearNavOperation )
                    // InternalAdaptDsl.g:2771:5: lv_operation_3_0= ruleClearNavOperation
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
    // InternalAdaptDsl.g:2792:1: entryRuleAddNavLinkOperation returns [EObject current=null] : iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF ;
    public final EObject entryRuleAddNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2792:60: (iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:2793:2: iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF
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
    // InternalAdaptDsl.g:2799:1: ruleAddNavLinkOperation returns [EObject current=null] : (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:2805:2: ( (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2806:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2806:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2807:3: otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2815:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2816:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2816:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2817:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalAdaptDsl.g:2838:3: ( (lv_text_4_0= ruleText ) )
            // InternalAdaptDsl.g:2839:4: (lv_text_4_0= ruleText )
            {
            // InternalAdaptDsl.g:2839:4: (lv_text_4_0= ruleText )
            // InternalAdaptDsl.g:2840:5: lv_text_4_0= ruleText
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
    // InternalAdaptDsl.g:2869:1: entryRuleDeleteNavLinkOperation returns [EObject current=null] : iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF ;
    public final EObject entryRuleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2869:63: (iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:2870:2: iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF
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
    // InternalAdaptDsl.g:2876:1: ruleDeleteNavLinkOperation returns [EObject current=null] : (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2882:2: ( (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2883:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2883:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2884:3: otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2892:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2893:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2893:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2894:5: lv_viewComp_2_0= ruleViewComponent
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
    // InternalAdaptDsl.g:2923:1: entryRuleRedirectNavLinkOperation returns [EObject current=null] : iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF ;
    public final EObject entryRuleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirectNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2923:65: (iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:2924:2: iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF
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
    // InternalAdaptDsl.g:2930:1: ruleRedirectNavLinkOperation returns [EObject current=null] : (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2936:2: ( (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2937:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2937:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2938:3: otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2946:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2947:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2947:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2948:5: lv_viewComp_2_0= ruleViewComponent
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
    // InternalAdaptDsl.g:2977:1: entryRuleClearNavOperation returns [EObject current=null] : iv_ruleClearNavOperation= ruleClearNavOperation EOF ;
    public final EObject entryRuleClearNavOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearNavOperation = null;


        try {
            // InternalAdaptDsl.g:2977:58: (iv_ruleClearNavOperation= ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:2978:2: iv_ruleClearNavOperation= ruleClearNavOperation EOF
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
    // InternalAdaptDsl.g:2984:1: ruleClearNavOperation returns [EObject current=null] : ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) ;
    public final EObject ruleClearNavOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2990:2: ( ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) )
            // InternalAdaptDsl.g:2991:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:2991:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            // InternalAdaptDsl.g:2992:3: () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';'
            {
            // InternalAdaptDsl.g:2992:3: ()
            // InternalAdaptDsl.g:2993:4: 
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
    // InternalAdaptDsl.g:3015:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalAdaptDsl.g:3015:44: (iv_ruleText= ruleText EOF )
            // InternalAdaptDsl.g:3016:2: iv_ruleText= ruleText EOF
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
    // InternalAdaptDsl.g:3022:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3028:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3029:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3039:1: entryRuleLayoutChangeOperation returns [EObject current=null] : iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF ;
    public final EObject entryRuleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutChangeOperation = null;


        try {
            // InternalAdaptDsl.g:3039:62: (iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:3040:2: iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF
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
    // InternalAdaptDsl.g:3046:1: ruleLayoutChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) ;
    public final EObject ruleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;

        EObject lv_operation_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3052:2: ( ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) )
            // InternalAdaptDsl.g:3053:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            {
            // InternalAdaptDsl.g:3053:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt23=1;
                }
                break;
            case 56:
                {
                alt23=2;
                }
                break;
            case 59:
                {
                alt23=3;
                }
                break;
            case 60:
                {
                alt23=4;
                }
                break;
            case 57:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAdaptDsl.g:3054:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    {
                    // InternalAdaptDsl.g:3054:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    // InternalAdaptDsl.g:3055:4: (lv_operation_0_0= ruleChangeFontOperation )
                    {
                    // InternalAdaptDsl.g:3055:4: (lv_operation_0_0= ruleChangeFontOperation )
                    // InternalAdaptDsl.g:3056:5: lv_operation_0_0= ruleChangeFontOperation
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
                    // InternalAdaptDsl.g:3074:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    {
                    // InternalAdaptDsl.g:3074:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    // InternalAdaptDsl.g:3075:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    {
                    // InternalAdaptDsl.g:3075:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    // InternalAdaptDsl.g:3076:5: lv_operation_1_0= ruleChangeFontSizeOperation
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
                    // InternalAdaptDsl.g:3094:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:3094:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    // InternalAdaptDsl.g:3095:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    {
                    // InternalAdaptDsl.g:3095:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    // InternalAdaptDsl.g:3096:5: lv_operation_2_0= ruleChangeTableCssClassOperation
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
                    // InternalAdaptDsl.g:3114:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:3114:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    // InternalAdaptDsl.g:3115:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    {
                    // InternalAdaptDsl.g:3115:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    // InternalAdaptDsl.g:3116:5: lv_operation_3_0= ruleAdaptCssClassOperation
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
                    // InternalAdaptDsl.g:3134:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    {
                    // InternalAdaptDsl.g:3134:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    // InternalAdaptDsl.g:3135:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    {
                    // InternalAdaptDsl.g:3135:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    // InternalAdaptDsl.g:3136:5: lv_operation_4_0= ruleChangeColorSchemeOperation
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
    // InternalAdaptDsl.g:3157:1: entryRuleChangeFontSizeOperation returns [EObject current=null] : iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF ;
    public final EObject entryRuleChangeFontSizeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontSizeOperation = null;


        try {
            // InternalAdaptDsl.g:3157:64: (iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:3158:2: iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF
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
    // InternalAdaptDsl.g:3164:1: ruleChangeFontSizeOperation returns [EObject current=null] : (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:3170:2: ( (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3171:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3171:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:3172:3: otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3180:3: ( (lv_sizePrimary_2_0= ruleFontSize ) )
            // InternalAdaptDsl.g:3181:4: (lv_sizePrimary_2_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:3181:4: (lv_sizePrimary_2_0= ruleFontSize )
            // InternalAdaptDsl.g:3182:5: lv_sizePrimary_2_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryFontSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalAdaptDsl.g:3203:3: ( (lv_sizeSecondary_4_0= ruleFontSize ) )
            // InternalAdaptDsl.g:3204:4: (lv_sizeSecondary_4_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:3204:4: (lv_sizeSecondary_4_0= ruleFontSize )
            // InternalAdaptDsl.g:3205:5: lv_sizeSecondary_4_0= ruleFontSize
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
    // InternalAdaptDsl.g:3234:1: entryRuleChangeColorSchemeOperation returns [EObject current=null] : iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF ;
    public final EObject entryRuleChangeColorSchemeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeColorSchemeOperation = null;


        try {
            // InternalAdaptDsl.g:3234:67: (iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:3235:2: iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF
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
    // InternalAdaptDsl.g:3241:1: ruleChangeColorSchemeOperation returns [EObject current=null] : (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) ;
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
            // InternalAdaptDsl.g:3247:2: ( (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:3248:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:3248:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:3249:3: otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3257:3: ( (lv_colorPrimary_2_0= ruleColor ) )
            // InternalAdaptDsl.g:3258:4: (lv_colorPrimary_2_0= ruleColor )
            {
            // InternalAdaptDsl.g:3258:4: (lv_colorPrimary_2_0= ruleColor )
            // InternalAdaptDsl.g:3259:5: lv_colorPrimary_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalAdaptDsl.g:3280:3: ( (lv_colorSecondary_4_0= ruleColor ) )
            // InternalAdaptDsl.g:3281:4: (lv_colorSecondary_4_0= ruleColor )
            {
            // InternalAdaptDsl.g:3281:4: (lv_colorSecondary_4_0= ruleColor )
            // InternalAdaptDsl.g:3282:5: lv_colorSecondary_4_0= ruleColor
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
    // InternalAdaptDsl.g:3311:1: entryRuleChangeFontOperation returns [EObject current=null] : iv_ruleChangeFontOperation= ruleChangeFontOperation EOF ;
    public final EObject entryRuleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontOperation = null;


        try {
            // InternalAdaptDsl.g:3311:60: (iv_ruleChangeFontOperation= ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:3312:2: iv_ruleChangeFontOperation= ruleChangeFontOperation EOF
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
    // InternalAdaptDsl.g:3318:1: ruleChangeFontOperation returns [EObject current=null] : (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3324:2: ( (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:3325:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:3325:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:3326:3: otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3334:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:3335:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:3335:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:3336:5: lv_text_2_0= ruleText
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
    // InternalAdaptDsl.g:3365:1: entryRuleChangeTableCssClassOperation returns [EObject current=null] : iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF ;
    public final EObject entryRuleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTableCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:3365:69: (iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:3366:2: iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF
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
    // InternalAdaptDsl.g:3372:1: ruleChangeTableCssClassOperation returns [EObject current=null] : (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3378:2: ( (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:3379:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:3379:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:3380:3: otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3388:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:3389:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:3389:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:3390:5: lv_text_2_0= ruleText
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
    // InternalAdaptDsl.g:3419:1: entryRuleAdaptCssClassOperation returns [EObject current=null] : iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF ;
    public final EObject entryRuleAdaptCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:3419:63: (iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:3420:2: iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF
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
    // InternalAdaptDsl.g:3426:1: ruleAdaptCssClassOperation returns [EObject current=null] : (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
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
            // InternalAdaptDsl.g:3432:2: ( (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:3433:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:3433:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:3434:3: otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3442:3: ( (lv_cssClass_2_0= ruleCssClass ) )
            // InternalAdaptDsl.g:3443:4: (lv_cssClass_2_0= ruleCssClass )
            {
            // InternalAdaptDsl.g:3443:4: (lv_cssClass_2_0= ruleCssClass )
            // InternalAdaptDsl.g:3444:5: lv_cssClass_2_0= ruleCssClass
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssClassCssClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalAdaptDsl.g:3465:3: ( (lv_cssAttribute_4_0= ruleAttribute ) )
            // InternalAdaptDsl.g:3466:4: (lv_cssAttribute_4_0= ruleAttribute )
            {
            // InternalAdaptDsl.g:3466:4: (lv_cssAttribute_4_0= ruleAttribute )
            // InternalAdaptDsl.g:3467:5: lv_cssAttribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
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
            		
            // InternalAdaptDsl.g:3488:3: ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) )
            // InternalAdaptDsl.g:3489:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            {
            // InternalAdaptDsl.g:3489:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            // InternalAdaptDsl.g:3490:5: lv_cssAttributeValue_6_0= ruleAttributeValue
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
    // InternalAdaptDsl.g:3519:1: entryRuleCssClass returns [String current=null] : iv_ruleCssClass= ruleCssClass EOF ;
    public final String entryRuleCssClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCssClass = null;


        try {
            // InternalAdaptDsl.g:3519:48: (iv_ruleCssClass= ruleCssClass EOF )
            // InternalAdaptDsl.g:3520:2: iv_ruleCssClass= ruleCssClass EOF
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
    // InternalAdaptDsl.g:3526:1: ruleCssClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCssClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3532:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3533:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3543:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // InternalAdaptDsl.g:3543:49: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalAdaptDsl.g:3544:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalAdaptDsl.g:3550:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3556:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3557:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3567:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalAdaptDsl.g:3567:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalAdaptDsl.g:3568:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalAdaptDsl.g:3574:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3580:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3581:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3591:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalAdaptDsl.g:3591:45: (iv_ruleColor= ruleColor EOF )
            // InternalAdaptDsl.g:3592:2: iv_ruleColor= ruleColor EOF
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
    // InternalAdaptDsl.g:3598:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3604:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3605:2: this_STRING_0= RULE_STRING
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
    // InternalAdaptDsl.g:3615:1: entryRuleFontSize returns [String current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final String entryRuleFontSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFontSize = null;


        try {
            // InternalAdaptDsl.g:3615:48: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalAdaptDsl.g:3616:2: iv_ruleFontSize= ruleFontSize EOF
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
    // InternalAdaptDsl.g:3622:1: ruleFontSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleFontSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3628:2: (this_INT_0= RULE_INT )
            // InternalAdaptDsl.g:3629:2: this_INT_0= RULE_INT
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
    // InternalAdaptDsl.g:3639:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalAdaptDsl.g:3639:45: (iv_ruleValue= ruleValue EOF )
            // InternalAdaptDsl.g:3640:2: iv_ruleValue= ruleValue EOF
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
    // InternalAdaptDsl.g:3646:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_BOOL_2=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3652:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) )
            // InternalAdaptDsl.g:3653:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            {
            // InternalAdaptDsl.g:3653:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
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
                    // InternalAdaptDsl.g:3654:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:3662:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:3670:3: this_BOOL_2= RULE_BOOL
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
    // InternalAdaptDsl.g:3681:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAdaptDsl.g:3681:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAdaptDsl.g:3682:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalAdaptDsl.g:3688:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3694:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' ) )
            // InternalAdaptDsl.g:3695:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' )
            {
            // InternalAdaptDsl.g:3695:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};' )
            // InternalAdaptDsl.g:3696:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_property_3_0= ruleProperty ) )+ otherlv_4= '};'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalAdaptDsl.g:3700:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:3701:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3701:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptDsl.g:3702:5: lv_name_1_0= RULE_ID
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
            		
            // InternalAdaptDsl.g:3722:3: ( (lv_property_3_0= ruleProperty ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAdaptDsl.g:3723:4: (lv_property_3_0= ruleProperty )
            	    {
            	    // InternalAdaptDsl.g:3723:4: (lv_property_3_0= ruleProperty )
            	    // InternalAdaptDsl.g:3724:5: lv_property_3_0= ruleProperty
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // InternalAdaptDsl.g:3749:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalAdaptDsl.g:3749:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalAdaptDsl.g:3750:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalAdaptDsl.g:3756:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' ) ;
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
            // InternalAdaptDsl.g:3762:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' ) )
            // InternalAdaptDsl.g:3763:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' )
            {
            // InternalAdaptDsl.g:3763:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};' )
            // InternalAdaptDsl.g:3764:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_type_2_0= ruleTYPE ) ) otherlv_3= ',' otherlv_4= 'provider' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' otherlv_7= 'update' ( (lv_update_8_0= ruleUpdateType ) ) otherlv_9= '};'
            {
            // InternalAdaptDsl.g:3764:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3765:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3765:4: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3766:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,19,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAdaptDsl.g:3786:3: ( (lv_type_2_0= ruleTYPE ) )
            // InternalAdaptDsl.g:3787:4: (lv_type_2_0= ruleTYPE )
            {
            // InternalAdaptDsl.g:3787:4: (lv_type_2_0= ruleTYPE )
            // InternalAdaptDsl.g:3788:5: lv_type_2_0= ruleTYPE
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTYPEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,62,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getProviderKeyword_4());
            		
            // InternalAdaptDsl.g:3813:3: ( (otherlv_5= RULE_ID ) )
            // InternalAdaptDsl.g:3814:4: (otherlv_5= RULE_ID )
            {
            // InternalAdaptDsl.g:3814:4: (otherlv_5= RULE_ID )
            // InternalAdaptDsl.g:3815:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getProviderProviderCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getPropertyAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,63,FOLLOW_47); 

            			newLeafNode(otherlv_7, grammarAccess.getPropertyAccess().getUpdateKeyword_7());
            		
            // InternalAdaptDsl.g:3834:3: ( (lv_update_8_0= ruleUpdateType ) )
            // InternalAdaptDsl.g:3835:4: (lv_update_8_0= ruleUpdateType )
            {
            // InternalAdaptDsl.g:3835:4: (lv_update_8_0= ruleUpdateType )
            // InternalAdaptDsl.g:3836:5: lv_update_8_0= ruleUpdateType
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
    // InternalAdaptDsl.g:3861:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalAdaptDsl.g:3861:49: (iv_ruleProvider= ruleProvider EOF )
            // InternalAdaptDsl.g:3862:2: iv_ruleProvider= ruleProvider EOF
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
    // InternalAdaptDsl.g:3868:1: ruleProvider returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3874:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAdaptDsl.g:3875:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAdaptDsl.g:3875:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3876:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3876:3: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3877:4: lv_name_0_0= RULE_ID
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
    // InternalAdaptDsl.g:3896:1: entryRuleDefTypes returns [EObject current=null] : iv_ruleDefTypes= ruleDefTypes EOF ;
    public final EObject entryRuleDefTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefTypes = null;


        try {
            // InternalAdaptDsl.g:3896:49: (iv_ruleDefTypes= ruleDefTypes EOF )
            // InternalAdaptDsl.g:3897:2: iv_ruleDefTypes= ruleDefTypes EOF
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
    // InternalAdaptDsl.g:3903:1: ruleDefTypes returns [EObject current=null] : ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? ) ;
    public final EObject ruleDefTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3909:2: ( ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? ) )
            // InternalAdaptDsl.g:3910:2: ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? )
            {
            // InternalAdaptDsl.g:3910:2: ( ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )? )
            // InternalAdaptDsl.g:3911:3: ( (lv_this_0_0= ruleDefType ) ) ( (lv_next_1_0= ruleDefTypes ) )?
            {
            // InternalAdaptDsl.g:3911:3: ( (lv_this_0_0= ruleDefType ) )
            // InternalAdaptDsl.g:3912:4: (lv_this_0_0= ruleDefType )
            {
            // InternalAdaptDsl.g:3912:4: (lv_this_0_0= ruleDefType )
            // InternalAdaptDsl.g:3913:5: lv_this_0_0= ruleDefType
            {

            					newCompositeNode(grammarAccess.getDefTypesAccess().getThisDefTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalAdaptDsl.g:3930:3: ( (lv_next_1_0= ruleDefTypes ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAdaptDsl.g:3931:4: (lv_next_1_0= ruleDefTypes )
                    {
                    // InternalAdaptDsl.g:3931:4: (lv_next_1_0= ruleDefTypes )
                    // InternalAdaptDsl.g:3932:5: lv_next_1_0= ruleDefTypes
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
    // InternalAdaptDsl.g:3953:1: entryRuleDefType returns [EObject current=null] : iv_ruleDefType= ruleDefType EOF ;
    public final EObject entryRuleDefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefType = null;


        try {
            // InternalAdaptDsl.g:3953:48: (iv_ruleDefType= ruleDefType EOF )
            // InternalAdaptDsl.g:3954:2: iv_ruleDefType= ruleDefType EOF
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
    // InternalAdaptDsl.g:3960:1: ruleDefType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' ) ;
    public final EObject ruleDefType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_enums_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:3966:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' ) )
            // InternalAdaptDsl.g:3967:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:3967:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';' )
            // InternalAdaptDsl.g:3968:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_enums_2_0= ruleEnums ) ) otherlv_3= ';'
            {
            // InternalAdaptDsl.g:3968:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAdaptDsl.g:3969:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAdaptDsl.g:3969:4: (lv_name_0_0= RULE_ID )
            // InternalAdaptDsl.g:3970:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_49); 

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
            		
            // InternalAdaptDsl.g:3990:3: ( (lv_enums_2_0= ruleEnums ) )
            // InternalAdaptDsl.g:3991:4: (lv_enums_2_0= ruleEnums )
            {
            // InternalAdaptDsl.g:3991:4: (lv_enums_2_0= ruleEnums )
            // InternalAdaptDsl.g:3992:5: lv_enums_2_0= ruleEnums
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
    // InternalAdaptDsl.g:4017:1: entryRuleEnums returns [EObject current=null] : iv_ruleEnums= ruleEnums EOF ;
    public final EObject entryRuleEnums() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnums = null;


        try {
            // InternalAdaptDsl.g:4017:46: (iv_ruleEnums= ruleEnums EOF )
            // InternalAdaptDsl.g:4018:2: iv_ruleEnums= ruleEnums EOF
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
    // InternalAdaptDsl.g:4024:1: ruleEnums returns [EObject current=null] : ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? ) ;
    public final EObject ruleEnums() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_this_0_0 = null;

        EObject lv_next_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:4030:2: ( ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? ) )
            // InternalAdaptDsl.g:4031:2: ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? )
            {
            // InternalAdaptDsl.g:4031:2: ( ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )? )
            // InternalAdaptDsl.g:4032:3: ( (lv_this_0_0= ruleEnum ) ) (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )?
            {
            // InternalAdaptDsl.g:4032:3: ( (lv_this_0_0= ruleEnum ) )
            // InternalAdaptDsl.g:4033:4: (lv_this_0_0= ruleEnum )
            {
            // InternalAdaptDsl.g:4033:4: (lv_this_0_0= ruleEnum )
            // InternalAdaptDsl.g:4034:5: lv_this_0_0= ruleEnum
            {

            					newCompositeNode(grammarAccess.getEnumsAccess().getThisEnumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
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

            // InternalAdaptDsl.g:4051:3: (otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:4052:4: otherlv_1= ',' ( (lv_next_2_0= ruleEnums ) )
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumsAccess().getCommaKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:4056:4: ( (lv_next_2_0= ruleEnums ) )
                    // InternalAdaptDsl.g:4057:5: (lv_next_2_0= ruleEnums )
                    {
                    // InternalAdaptDsl.g:4057:5: (lv_next_2_0= ruleEnums )
                    // InternalAdaptDsl.g:4058:6: lv_next_2_0= ruleEnums
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
    // InternalAdaptDsl.g:4080:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // InternalAdaptDsl.g:4080:45: (iv_ruleEnum= ruleEnum EOF )
            // InternalAdaptDsl.g:4081:2: iv_ruleEnum= ruleEnum EOF
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
    // InternalAdaptDsl.g:4087:1: ruleEnum returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:4093:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:4094:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:4094:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:4095:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:4095:3: (lv_name_0_0= RULE_STRING )
            // InternalAdaptDsl.g:4096:4: lv_name_0_0= RULE_STRING
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
    // InternalAdaptDsl.g:4115:1: entryRuleTYPE returns [EObject current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final EObject entryRuleTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE = null;


        try {
            // InternalAdaptDsl.g:4115:45: (iv_ruleTYPE= ruleTYPE EOF )
            // InternalAdaptDsl.g:4116:2: iv_ruleTYPE= ruleTYPE EOF
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
    // InternalAdaptDsl.g:4122:1: ruleTYPE returns [EObject current=null] : ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTYPE() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_number_1_0=null;
        Token lv_boolean_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:4128:2: ( ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalAdaptDsl.g:4129:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalAdaptDsl.g:4129:2: ( ( (lv_string_0_0= 'string' ) ) | ( (lv_number_1_0= 'number' ) ) | ( (lv_boolean_2_0= 'boolean' ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt28=1;
                }
                break;
            case 66:
                {
                alt28=2;
                }
                break;
            case 67:
                {
                alt28=3;
                }
                break;
            case RULE_ID:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAdaptDsl.g:4130:3: ( (lv_string_0_0= 'string' ) )
                    {
                    // InternalAdaptDsl.g:4130:3: ( (lv_string_0_0= 'string' ) )
                    // InternalAdaptDsl.g:4131:4: (lv_string_0_0= 'string' )
                    {
                    // InternalAdaptDsl.g:4131:4: (lv_string_0_0= 'string' )
                    // InternalAdaptDsl.g:4132:5: lv_string_0_0= 'string'
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
                    // InternalAdaptDsl.g:4145:3: ( (lv_number_1_0= 'number' ) )
                    {
                    // InternalAdaptDsl.g:4145:3: ( (lv_number_1_0= 'number' ) )
                    // InternalAdaptDsl.g:4146:4: (lv_number_1_0= 'number' )
                    {
                    // InternalAdaptDsl.g:4146:4: (lv_number_1_0= 'number' )
                    // InternalAdaptDsl.g:4147:5: lv_number_1_0= 'number'
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
                    // InternalAdaptDsl.g:4160:3: ( (lv_boolean_2_0= 'boolean' ) )
                    {
                    // InternalAdaptDsl.g:4160:3: ( (lv_boolean_2_0= 'boolean' ) )
                    // InternalAdaptDsl.g:4161:4: (lv_boolean_2_0= 'boolean' )
                    {
                    // InternalAdaptDsl.g:4161:4: (lv_boolean_2_0= 'boolean' )
                    // InternalAdaptDsl.g:4162:5: lv_boolean_2_0= 'boolean'
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
                    // InternalAdaptDsl.g:4175:3: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalAdaptDsl.g:4175:3: ( (otherlv_3= RULE_ID ) )
                    // InternalAdaptDsl.g:4176:4: (otherlv_3= RULE_ID )
                    {
                    // InternalAdaptDsl.g:4176:4: (otherlv_3= RULE_ID )
                    // InternalAdaptDsl.g:4177:5: otherlv_3= RULE_ID
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
    // InternalAdaptDsl.g:4192:1: entryRuleUpdateType returns [EObject current=null] : iv_ruleUpdateType= ruleUpdateType EOF ;
    public final EObject entryRuleUpdateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateType = null;


        try {
            // InternalAdaptDsl.g:4192:51: (iv_ruleUpdateType= ruleUpdateType EOF )
            // InternalAdaptDsl.g:4193:2: iv_ruleUpdateType= ruleUpdateType EOF
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
    // InternalAdaptDsl.g:4199:1: ruleUpdateType returns [EObject current=null] : ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) ) ;
    public final EObject ruleUpdateType() throws RecognitionException {
        EObject current = null;

        Token lv_event_0_0=null;
        Token lv_slow_1_0=null;
        Token lv_fast_2_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:4205:2: ( ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) ) )
            // InternalAdaptDsl.g:4206:2: ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) )
            {
            // InternalAdaptDsl.g:4206:2: ( ( (lv_event_0_0= 'eventTriggered' ) ) | ( (lv_slow_1_0= 'slow' ) ) | ( (lv_fast_2_0= 'fast' ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt29=1;
                }
                break;
            case 69:
                {
                alt29=2;
                }
                break;
            case 70:
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
                    // InternalAdaptDsl.g:4207:3: ( (lv_event_0_0= 'eventTriggered' ) )
                    {
                    // InternalAdaptDsl.g:4207:3: ( (lv_event_0_0= 'eventTriggered' ) )
                    // InternalAdaptDsl.g:4208:4: (lv_event_0_0= 'eventTriggered' )
                    {
                    // InternalAdaptDsl.g:4208:4: (lv_event_0_0= 'eventTriggered' )
                    // InternalAdaptDsl.g:4209:5: lv_event_0_0= 'eventTriggered'
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
                    // InternalAdaptDsl.g:4222:3: ( (lv_slow_1_0= 'slow' ) )
                    {
                    // InternalAdaptDsl.g:4222:3: ( (lv_slow_1_0= 'slow' ) )
                    // InternalAdaptDsl.g:4223:4: (lv_slow_1_0= 'slow' )
                    {
                    // InternalAdaptDsl.g:4223:4: (lv_slow_1_0= 'slow' )
                    // InternalAdaptDsl.g:4224:5: lv_slow_1_0= 'slow'
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
                    // InternalAdaptDsl.g:4237:3: ( (lv_fast_2_0= 'fast' ) )
                    {
                    // InternalAdaptDsl.g:4237:3: ( (lv_fast_2_0= 'fast' ) )
                    // InternalAdaptDsl.g:4238:4: (lv_fast_2_0= 'fast' )
                    {
                    // InternalAdaptDsl.g:4238:4: (lv_fast_2_0= 'fast' )
                    // InternalAdaptDsl.g:4239:5: lv_fast_2_0= 'fast'
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
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1FFFD00000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L,0x000000000000000EL});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000200000000002L});

}