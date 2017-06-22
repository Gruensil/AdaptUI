/*
 * generated by Xtext 2.12.0
 */
package org.xtext.adaptui.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.adaptui.parser.antlr.internal.InternalAdaptUIParser;
import org.xtext.adaptui.services.AdaptUIGrammarAccess;

public class AdaptUIParser extends AbstractAntlrParser {

	@Inject
	private AdaptUIGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAdaptUIParser createParser(XtextTokenStream stream) {
		return new InternalAdaptUIParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public AdaptUIGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AdaptUIGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}