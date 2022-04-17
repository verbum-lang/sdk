// Generated from /home/user/projects/sdk/vm/grammar/TParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, Ret=7, Function=8, Pub=9, Pro=10, 
		Priv=11, Static=12, Final=13, Interface=14, Abstract=15, Extends=16, Class=17, 
		Implements=18, New=19, Break=20, Next=21, Async=22, Await=23, Try=24, 
		Catch=25, ArrowRight=26, ARightLB=27, End=28, Attr=29, Point=30, TwoPoint=31, 
		TwoTwoPoint=32, Separator=33, OpenArIndex=34, CloseArIndex=35, OpenBlock=36, 
		CloseBlock=37, OpenOp=38, CloseOp=39, ArithmeticOperator=40, AssignmentOperator=41, 
		Not=42, IncDecOperators=43, Identifier=44, IDPrefix=45, TypeSpec=46, Words=47, 
		Integer=48, Float=49, String=50, BlockComment=51, LineComment=52, Whitespace=53, 
		Newline=54;
	public static final int
		RULE_main = 0, RULE_sentences = 1, RULE_statements = 2, RULE_blockCode = 3, 
		RULE_blockUse = 4, RULE_useValue = 5, RULE_useString = 6, RULE_blockVariable = 7, 
		RULE_variableItem = 8, RULE_variablePrefixModes = 9, RULE_functionCall = 10, 
		RULE_functionCallPrefix = 11, RULE_functionCallParam = 12, RULE_functionCallParamElements = 13, 
		RULE_blockRet = 14, RULE_blockConditional = 15, RULE_ifElementUnique = 16, 
		RULE_elifElements = 17, RULE_elifElementUnique = 18, RULE_elseElementUnique = 19, 
		RULE_conditionalBlockExpression = 20, RULE_conditionalBlockElements = 21, 
		RULE_blockLoop = 22, RULE_loopBlockElements = 23, RULE_loopComplete = 24, 
		RULE_loopConditional = 25, RULE_loopInfinite = 26, RULE_endOne = 27, RULE_endTwo = 28, 
		RULE_loopOneMembers = 29, RULE_loopTwoMembers = 30, RULE_loopThreeMembers = 31, 
		RULE_loopThreeMembersValues = 32, RULE_blockBreak = 33, RULE_blockNext = 34, 
		RULE_blockTryCatch = 35, RULE_tryUniqueElement = 36, RULE_catchUniqueElement = 37, 
		RULE_tryCatchElements = 38, RULE_blockFunction = 39, RULE_blockFunctionDeclarationAttr = 40, 
		RULE_functionParam = 41, RULE_functionAnonymousParam = 42, RULE_functionCodeBlock = 43, 
		RULE_blockInterface = 44, RULE_interfaceCodeBlock = 45, RULE_blockAbstraction = 46, 
		RULE_abstractionCodeBlock = 47, RULE_blockClass = 48, RULE_blockClassDeclarationAttr = 49, 
		RULE_classAnonymousParam = 50, RULE_classCodeBlock = 51, RULE_blockArray = 52, 
		RULE_indexArray = 53, RULE_indexArrayElements = 54, RULE_associativeArray = 55, 
		RULE_associativeArrayElements = 56, RULE_blockLambdaFunctions = 57, RULE_lambdaFnParams = 58, 
		RULE_lambdaFnCodeBlock = 59, RULE_codeBlockFlowControl = 60, RULE_codeBlockFlowControlElements = 61, 
		RULE_codeBlockControl = 62, RULE_generalValue = 63, RULE_generalValueBlock = 64, 
		RULE_generalValueItems = 65, RULE_generalValueElements = 66, RULE_identifier = 67, 
		RULE_identifierB = 68, RULE_identifierC = 69, RULE_identifierD = 70, RULE_incDecOperatorsA = 71, 
		RULE_incDecOperatorsB = 72, RULE_openOpA = 73, RULE_closeOpA = 74, RULE_blockLiveTokens = 75;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
			"useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"functionCall", "functionCallPrefix", "functionCallParam", "functionCallParamElements", 
			"blockRet", "blockConditional", "ifElementUnique", "elifElements", "elifElementUnique", 
			"elseElementUnique", "conditionalBlockExpression", "conditionalBlockElements", 
			"blockLoop", "loopBlockElements", "loopComplete", "loopConditional", 
			"loopInfinite", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "blockBreak", "blockNext", 
			"blockTryCatch", "tryUniqueElement", "catchUniqueElement", "tryCatchElements", 
			"blockFunction", "blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParam", 
			"functionCodeBlock", "blockInterface", "interfaceCodeBlock", "blockAbstraction", 
			"abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", "classAnonymousParam", 
			"classCodeBlock", "blockArray", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "blockLambdaFunctions", "lambdaFnParams", 
			"lambdaFnCodeBlock", "codeBlockFlowControl", "codeBlockFlowControlElements", 
			"codeBlockControl", "generalValue", "generalValueBlock", "generalValueItems", 
			"generalValueElements", "identifier", "identifierB", "identifierC", "identifierD", 
			"incDecOperatorsA", "incDecOperatorsB", "openOpA", "closeOpA", "blockLiveTokens"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'async'", "'await'", "'try'", "'catch'", "'->'", "'=>'", "';'", 
			"'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", 
			"')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
			"Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "Words", 
			"Integer", "Float", "String", "BlockComment", "LineComment", "Whitespace", 
			"Newline"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			sentences();
			setState(153);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentencesContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentences);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				statements();
				setState(157);
				sentences();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public BlockUseContext blockUse() {
			return getRuleContext(BlockUseContext.class,0);
		}
		public BlockVariableContext blockVariable() {
			return getRuleContext(BlockVariableContext.class,0);
		}
		public BlockRetContext blockRet() {
			return getRuleContext(BlockRetContext.class,0);
		}
		public BlockConditionalContext blockConditional() {
			return getRuleContext(BlockConditionalContext.class,0);
		}
		public BlockLoopContext blockLoop() {
			return getRuleContext(BlockLoopContext.class,0);
		}
		public BlockBreakContext blockBreak() {
			return getRuleContext(BlockBreakContext.class,0);
		}
		public BlockNextContext blockNext() {
			return getRuleContext(BlockNextContext.class,0);
		}
		public BlockTryCatchContext blockTryCatch() {
			return getRuleContext(BlockTryCatchContext.class,0);
		}
		public BlockFunctionContext blockFunction() {
			return getRuleContext(BlockFunctionContext.class,0);
		}
		public BlockInterfaceContext blockInterface() {
			return getRuleContext(BlockInterfaceContext.class,0);
		}
		public BlockAbstractionContext blockAbstraction() {
			return getRuleContext(BlockAbstractionContext.class,0);
		}
		public BlockClassContext blockClass() {
			return getRuleContext(BlockClassContext.class,0);
		}
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public BlockLiveTokensContext blockLiveTokens() {
			return getRuleContext(BlockLiveTokensContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(170);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(171);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(172);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(173);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(174);
				blockCode();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(175);
				blockLiveTokens();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockCodeContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(178);
				match(OpenBlock);
				setState(179);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(180);
				match(OpenBlock);
				setState(181);
				sentences();
				setState(182);
				match(CloseBlock);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockUseContext extends ParserRuleContext {
		public TerminalNode Use() { return getToken(TParser.Use, 0); }
		public UseValueContext useValue() {
			return getRuleContext(UseValueContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockUse; }
	}

	public final BlockUseContext blockUse() throws RecognitionException {
		BlockUseContext _localctx = new BlockUseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blockUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Use);
			setState(187);
			useValue();
			setState(188);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseValueContext extends ParserRuleContext {
		public UseStringContext useString() {
			return getRuleContext(UseStringContext.class,0);
		}
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public UseValueContext useValue() {
			return getRuleContext(UseValueContext.class,0);
		}
		public UseValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useValue; }
	}

	public final UseValueContext useValue() throws RecognitionException {
		UseValueContext _localctx = new UseValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_useValue);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				useString();
				setState(192);
				match(Separator);
				setState(193);
				useValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public UseStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useString; }
	}

	public final UseStringContext useString() throws RecognitionException {
		UseStringContext _localctx = new UseStringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_useString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockVariableContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableItemContext variableItem() {
			return getRuleContext(VariableItemContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockVariable; }
	}

	public final BlockVariableContext blockVariable() throws RecognitionException {
		BlockVariableContext _localctx = new BlockVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_blockVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Var);
			setState(200);
			variableItem();
			setState(201);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableItemContext extends ParserRuleContext {
		public VariablePrefixModesContext variablePrefixModes() {
			return getRuleContext(VariablePrefixModesContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<VariableItemContext> variableItem() {
			return getRuleContexts(VariableItemContext.class);
		}
		public VariableItemContext variableItem(int i) {
			return getRuleContext(VariableItemContext.class,i);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Await() { return getToken(TParser.Await, 0); }
		public VariableItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableItem; }
	}

	public final VariableItemContext variableItem() throws RecognitionException {
		VariableItemContext _localctx = new VariableItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableItem);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			variablePrefixModes();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==New || _la==Await) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(207);
			generalValueElements();
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(Separator);
					setState(209);
					variableItem();
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablePrefixModesContext extends ParserRuleContext {
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public VariablePrefixModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePrefixModes; }
	}

	public final VariablePrefixModesContext variablePrefixModes() throws RecognitionException {
		VariablePrefixModesContext _localctx = new VariablePrefixModesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variablePrefixModes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(215);
				identifier();
				}
				break;
			case 2:
				{
				setState(216);
				identifier();
				setState(217);
				match(TypeSpec);
				}
				break;
			}
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallPrefixContext functionCallPrefix() {
			return getRuleContext(FunctionCallPrefixContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			functionCallPrefix();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(224);
				identifier();
				}
			}

			setState(227);
			functionCallParam();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallPrefixContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FunctionCallPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallPrefix; }
	}

	public final FunctionCallPrefixContext functionCallPrefix() throws RecognitionException {
		FunctionCallPrefixContext _localctx = new FunctionCallPrefixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionCallPrefix);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				identifier();
				setState(231);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				identifier();
				setState(234);
				match(TwoTwoPoint);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParamContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallParamElementsContext functionCallParamElements() {
			return getRuleContext(FunctionCallParamElementsContext.class,0);
		}
		public FunctionCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParam; }
	}

	public final FunctionCallParamContext functionCallParam() throws RecognitionException {
		FunctionCallParamContext _localctx = new FunctionCallParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionCallParam);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(OpenOp);
				setState(239);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(OpenOp);
				setState(241);
				functionCallParamElements();
				setState(242);
				match(CloseOp);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallParamElementsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<FunctionCallParamElementsContext> functionCallParamElements() {
			return getRuleContexts(FunctionCallParamElementsContext.class);
		}
		public FunctionCallParamElementsContext functionCallParamElements(int i) {
			return getRuleContext(FunctionCallParamElementsContext.class,i);
		}
		public FunctionCallParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallParamElements; }
	}

	public final FunctionCallParamElementsContext functionCallParamElements() throws RecognitionException {
		FunctionCallParamElementsContext _localctx = new FunctionCallParamElementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			generalValue();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(Separator);
					setState(248);
					functionCallParamElements();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockRetContext extends ParserRuleContext {
		public TerminalNode Ret() { return getToken(TParser.Ret, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockRet; }
	}

	public final BlockRetContext blockRet() throws RecognitionException {
		BlockRetContext _localctx = new BlockRetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(Ret);
			setState(255);
			generalValueElements();
			setState(256);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockConditionalContext extends ParserRuleContext {
		public IfElementUniqueContext ifElementUnique() {
			return getRuleContext(IfElementUniqueContext.class,0);
		}
		public ElifElementsContext elifElements() {
			return getRuleContext(ElifElementsContext.class,0);
		}
		public ElseElementUniqueContext elseElementUnique() {
			return getRuleContext(ElseElementUniqueContext.class,0);
		}
		public BlockConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockConditional; }
	}

	public final BlockConditionalContext blockConditional() throws RecognitionException {
		BlockConditionalContext _localctx = new BlockConditionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			ifElementUnique();
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(259);
				elifElements();
				}
				break;
			}
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(262);
				elseElementUnique();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElementUniqueContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TParser.If, 0); }
		public ConditionalBlockExpressionContext conditionalBlockExpression() {
			return getRuleContext(ConditionalBlockExpressionContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public IfElementUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElementUnique; }
	}

	public final IfElementUniqueContext ifElementUnique() throws RecognitionException {
		IfElementUniqueContext _localctx = new IfElementUniqueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(If);
			setState(266);
			conditionalBlockExpression();
			setState(267);
			conditionalBlockElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifElementsContext extends ParserRuleContext {
		public ElifElementUniqueContext elifElementUnique() {
			return getRuleContext(ElifElementUniqueContext.class,0);
		}
		public List<ElifElementsContext> elifElements() {
			return getRuleContexts(ElifElementsContext.class);
		}
		public ElifElementsContext elifElements(int i) {
			return getRuleContext(ElifElementsContext.class,i);
		}
		public ElifElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifElements; }
	}

	public final ElifElementsContext elifElements() throws RecognitionException {
		ElifElementsContext _localctx = new ElifElementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			elifElementUnique();
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					elifElements();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifElementUniqueContext extends ParserRuleContext {
		public TerminalNode Elif() { return getToken(TParser.Elif, 0); }
		public ConditionalBlockExpressionContext conditionalBlockExpression() {
			return getRuleContext(ConditionalBlockExpressionContext.class,0);
		}
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public ElifElementUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifElementUnique; }
	}

	public final ElifElementUniqueContext elifElementUnique() throws RecognitionException {
		ElifElementUniqueContext _localctx = new ElifElementUniqueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Elif);
			setState(277);
			conditionalBlockExpression();
			setState(278);
			conditionalBlockElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseElementUniqueContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(TParser.Else, 0); }
		public ConditionalBlockElementsContext conditionalBlockElements() {
			return getRuleContext(ConditionalBlockElementsContext.class,0);
		}
		public ElseElementUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseElementUnique; }
	}

	public final ElseElementUniqueContext elseElementUnique() throws RecognitionException {
		ElseElementUniqueContext _localctx = new ElseElementUniqueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(Else);
			setState(281);
			conditionalBlockElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalBlockExpressionContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ConditionalBlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockExpression; }
	}

	public final ConditionalBlockExpressionContext conditionalBlockExpression() throws RecognitionException {
		ConditionalBlockExpressionContext _localctx = new ConditionalBlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			generalValueElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalBlockElementsContext extends ParserRuleContext {
		public CodeBlockFlowControlContext codeBlockFlowControl() {
			return getRuleContext(CodeBlockFlowControlContext.class,0);
		}
		public ConditionalBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlockElements; }
	}

	public final ConditionalBlockElementsContext conditionalBlockElements() throws RecognitionException {
		ConditionalBlockElementsContext _localctx = new ConditionalBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			codeBlockFlowControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockLoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(TParser.For, 0); }
		public LoopBlockElementsContext loopBlockElements() {
			return getRuleContext(LoopBlockElementsContext.class,0);
		}
		public LoopInfiniteContext loopInfinite() {
			return getRuleContext(LoopInfiniteContext.class,0);
		}
		public LoopConditionalContext loopConditional() {
			return getRuleContext(LoopConditionalContext.class,0);
		}
		public LoopCompleteContext loopComplete() {
			return getRuleContext(LoopCompleteContext.class,0);
		}
		public BlockLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLoop; }
	}

	public final BlockLoopContext blockLoop() throws RecognitionException {
		BlockLoopContext _localctx = new BlockLoopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(For);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(288);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(289);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(290);
				loopComplete();
				}
				break;
			}
			setState(293);
			loopBlockElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBlockElementsContext extends ParserRuleContext {
		public CodeBlockFlowControlContext codeBlockFlowControl() {
			return getRuleContext(CodeBlockFlowControlContext.class,0);
		}
		public LoopBlockElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlockElements; }
	}

	public final LoopBlockElementsContext loopBlockElements() throws RecognitionException {
		LoopBlockElementsContext _localctx = new LoopBlockElementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			codeBlockFlowControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopCompleteContext extends ParserRuleContext {
		public LoopOneMembersContext loopOneMembers() {
			return getRuleContext(LoopOneMembersContext.class,0);
		}
		public EndOneContext endOne() {
			return getRuleContext(EndOneContext.class,0);
		}
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public EndTwoContext endTwo() {
			return getRuleContext(EndTwoContext.class,0);
		}
		public LoopThreeMembersContext loopThreeMembers() {
			return getRuleContext(LoopThreeMembersContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LoopCompleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopComplete; }
	}

	public final LoopCompleteContext loopComplete() throws RecognitionException {
		LoopCompleteContext _localctx = new LoopCompleteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(297);
				match(OpenOp);
				}
			}

			setState(300);
			loopOneMembers();
			setState(301);
			endOne();
			setState(302);
			loopTwoMembers();
			setState(303);
			endTwo();
			setState(304);
			loopThreeMembers();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(305);
				match(CloseOp);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopConditionalContext extends ParserRuleContext {
		public LoopTwoMembersContext loopTwoMembers() {
			return getRuleContext(LoopTwoMembersContext.class,0);
		}
		public LoopConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopConditional; }
	}

	public final LoopConditionalContext loopConditional() throws RecognitionException {
		LoopConditionalContext _localctx = new LoopConditionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			loopTwoMembers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopInfiniteContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public LoopInfiniteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInfinite; }
	}

	public final LoopInfiniteContext loopInfinite() throws RecognitionException {
		LoopInfiniteContext _localctx = new LoopInfiniteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_loopInfinite);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(OpenOp);
				setState(311);
				match(CloseOp);
				}
				break;
			case If:
			case For:
			case Ret:
			case Break:
			case Next:
			case Try:
			case OpenBlock:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndOneContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public EndOneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endOne; }
	}

	public final EndOneContext endOne() throws RecognitionException {
		EndOneContext _localctx = new EndOneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndTwoContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public EndTwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTwo; }
	}

	public final EndTwoContext endTwo() throws RecognitionException {
		EndTwoContext _localctx = new EndTwoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopOneMembersContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(TParser.Var, 0); }
		public VariableItemContext variableItem() {
			return getRuleContext(VariableItemContext.class,0);
		}
		public LoopOneMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopOneMembers; }
	}

	public final LoopOneMembersContext loopOneMembers() throws RecognitionException {
		LoopOneMembersContext _localctx = new LoopOneMembersContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopOneMembers);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(Var);
				setState(320);
				variableItem();
				}
				break;
			case End:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopTwoMembersContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public LoopTwoMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopTwoMembers; }
	}

	public final LoopTwoMembersContext loopTwoMembers() throws RecognitionException {
		LoopTwoMembersContext _localctx = new LoopTwoMembersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loopTwoMembers);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				generalValueElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopThreeMembersContext extends ParserRuleContext {
		public LoopThreeMembersValuesContext loopThreeMembersValues() {
			return getRuleContext(LoopThreeMembersValuesContext.class,0);
		}
		public LoopThreeMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopThreeMembers; }
	}

	public final LoopThreeMembersContext loopThreeMembers() throws RecognitionException {
		LoopThreeMembersContext _localctx = new LoopThreeMembersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loopThreeMembers);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				loopThreeMembersValues();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopThreeMembersValuesContext extends ParserRuleContext {
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public LoopThreeMembersValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopThreeMembersValues; }
	}

	public final LoopThreeMembersValuesContext loopThreeMembersValues() throws RecognitionException {
		LoopThreeMembersValuesContext _localctx = new LoopThreeMembersValuesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			generalValueElements();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(333);
				match(Separator);
				setState(334);
				generalValueElements();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockBreakContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(TParser.Break, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBreak; }
	}

	public final BlockBreakContext blockBreak() throws RecognitionException {
		BlockBreakContext _localctx = new BlockBreakContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(Break);
			setState(341);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockNextContext extends ParserRuleContext {
		public TerminalNode Next() { return getToken(TParser.Next, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockNextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNext; }
	}

	public final BlockNextContext blockNext() throws RecognitionException {
		BlockNextContext _localctx = new BlockNextContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(Next);
			setState(344);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockTryCatchContext extends ParserRuleContext {
		public TryUniqueElementContext tryUniqueElement() {
			return getRuleContext(TryUniqueElementContext.class,0);
		}
		public CatchUniqueElementContext catchUniqueElement() {
			return getRuleContext(CatchUniqueElementContext.class,0);
		}
		public BlockTryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockTryCatch; }
	}

	public final BlockTryCatchContext blockTryCatch() throws RecognitionException {
		BlockTryCatchContext _localctx = new BlockTryCatchContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			tryUniqueElement();
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(347);
				catchUniqueElement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryUniqueElementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(TParser.Try, 0); }
		public TryCatchElementsContext tryCatchElements() {
			return getRuleContext(TryCatchElementsContext.class,0);
		}
		public TryUniqueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryUniqueElement; }
	}

	public final TryUniqueElementContext tryUniqueElement() throws RecognitionException {
		TryUniqueElementContext _localctx = new TryUniqueElementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(Try);
			setState(351);
			tryCatchElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchUniqueElementContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(TParser.Catch, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TryCatchElementsContext tryCatchElements() {
			return getRuleContext(TryCatchElementsContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public CatchUniqueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchUniqueElement; }
	}

	public final CatchUniqueElementContext catchUniqueElement() throws RecognitionException {
		CatchUniqueElementContext _localctx = new CatchUniqueElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(Catch);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(354);
				match(OpenOp);
				}
			}

			setState(357);
			identifier();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(358);
				match(CloseOp);
				}
			}

			setState(361);
			tryCatchElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryCatchElementsContext extends ParserRuleContext {
		public CodeBlockFlowControlContext codeBlockFlowControl() {
			return getRuleContext(CodeBlockFlowControlContext.class,0);
		}
		public TryCatchElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchElements; }
	}

	public final TryCatchElementsContext tryCatchElements() throws RecognitionException {
		TryCatchElementsContext _localctx = new TryCatchElementsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			codeBlockFlowControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockFunctionContext extends ParserRuleContext {
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public FunctionAnonymousParamContext functionAnonymousParam() {
			return getRuleContext(FunctionAnonymousParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunction; }
	}

	public final BlockFunctionContext blockFunction() throws RecognitionException {
		BlockFunctionContext _localctx = new BlockFunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_blockFunction);
		int _la;
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(OpenOp);
				setState(366);
				match(Function);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(367);
					identifier();
					}
				}

				setState(370);
				match(OpenOp);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(371);
					functionParam();
					}
				}

				setState(374);
				match(CloseOp);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(375);
					match(ArrowRight);
					setState(378);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(376);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(377);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(382);
				functionCodeBlock();
				setState(383);
				match(CloseOp);
				setState(384);
				match(OpenOp);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(385);
					functionAnonymousParam();
					}
				}

				setState(388);
				match(CloseOp);
				setState(389);
				match(End);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(Function);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(392);
					identifier();
					}
				}

				setState(395);
				match(OpenOp);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(396);
					functionParam();
					}
				}

				setState(399);
				match(CloseOp);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(400);
					match(ArrowRight);
					setState(403);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(401);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(402);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(409);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(407);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(408);
					match(End);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockFunctionDeclarationAttrContext extends ParserRuleContext {
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public TerminalNode Function() { return getToken(TParser.Function, 0); }
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public FunctionCodeBlockContext functionCodeBlock() {
			return getRuleContext(FunctionCodeBlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public FunctionAnonymousParamContext functionAnonymousParam() {
			return getRuleContext(FunctionAnonymousParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockFunctionDeclarationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunctionDeclarationAttr; }
	}

	public final BlockFunctionDeclarationAttrContext blockFunctionDeclarationAttr() throws RecognitionException {
		BlockFunctionDeclarationAttrContext _localctx = new BlockFunctionDeclarationAttrContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(OpenOp);
				setState(414);
				match(Function);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(415);
					identifier();
					}
				}

				setState(418);
				match(OpenOp);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(419);
					functionParam();
					}
				}

				setState(422);
				match(CloseOp);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(423);
					match(ArrowRight);
					setState(426);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(424);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(425);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(430);
				functionCodeBlock();
				setState(431);
				match(CloseOp);
				setState(432);
				match(OpenOp);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(433);
					functionAnonymousParam();
					}
				}

				setState(436);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(Function);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(439);
					identifier();
					}
				}

				setState(442);
				match(OpenOp);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(443);
					functionParam();
					}
				}

				setState(446);
				match(CloseOp);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(447);
					match(ArrowRight);
					setState(450);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(448);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(449);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(454);
				functionCodeBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParamContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Identifier);
			setState(458);
			match(TypeSpec);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(459);
				match(Separator);
				setState(460);
				functionParam();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionAnonymousParamContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public FunctionAnonymousParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAnonymousParam; }
	}

	public final FunctionAnonymousParamContext functionAnonymousParam() throws RecognitionException {
		FunctionAnonymousParamContext _localctx = new FunctionAnonymousParamContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			generalValueElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public FunctionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCodeBlock; }
	}

	public final FunctionCodeBlockContext functionCodeBlock() throws RecognitionException {
		FunctionCodeBlockContext _localctx = new FunctionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockInterfaceContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(TParser.Interface, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InterfaceCodeBlockContext interfaceCodeBlock() {
			return getRuleContext(InterfaceCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public BlockInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockInterface; }
	}

	public final BlockInterfaceContext blockInterface() throws RecognitionException {
		BlockInterfaceContext _localctx = new BlockInterfaceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(Interface);
			setState(468);
			identifier();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(469);
				match(Extends);
				setState(470);
				identifierB();
				}
			}

			setState(473);
			interfaceCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public InterfaceCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCodeBlock; }
	}

	public final InterfaceCodeBlockContext interfaceCodeBlock() throws RecognitionException {
		InterfaceCodeBlockContext _localctx = new InterfaceCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockAbstractionContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(TParser.Abstract, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AbstractionCodeBlockContext abstractionCodeBlock() {
			return getRuleContext(AbstractionCodeBlockContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public BlockAbstractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAbstraction; }
	}

	public final BlockAbstractionContext blockAbstraction() throws RecognitionException {
		BlockAbstractionContext _localctx = new BlockAbstractionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(Abstract);
			setState(478);
			identifier();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(479);
				match(Extends);
				setState(480);
				identifierB();
				}
			}

			setState(483);
			abstractionCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractionCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public AbstractionCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractionCodeBlock; }
	}

	public final AbstractionCodeBlockContext abstractionCodeBlock() throws RecognitionException {
		AbstractionCodeBlockContext _localctx = new AbstractionCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockClassContext extends ParserRuleContext {
		public OpenOpAContext openOpA() {
			return getRuleContext(OpenOpAContext.class,0);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
		}
		public CloseOpAContext closeOpA() {
			return getRuleContext(CloseOpAContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Implements() { return getToken(TParser.Implements, 0); }
		public IdentifierCContext identifierC() {
			return getRuleContext(IdentifierCContext.class,0);
		}
		public IdentifierDContext identifierD() {
			return getRuleContext(IdentifierDContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public BlockClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClass; }
	}

	public final BlockClassContext blockClass() throws RecognitionException {
		BlockClassContext _localctx = new BlockClassContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_blockClass);
		int _la;
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				openOpA();
				setState(488);
				match(New);
				setState(489);
				match(Class);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(490);
					identifier();
					}
				}

				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(493);
					match(Extends);
					setState(494);
					identifierB();
					}
				}

				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(497);
					match(Implements);
					setState(498);
					identifierC();
					}
				}

				setState(501);
				classCodeBlock();
				setState(502);
				closeOpA();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(503);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(504);
					identifierD();
					setState(505);
					match(OpenOp);
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(506);
						generalValueElements();
						}
					}

					setState(509);
					match(CloseOp);
					}
				}

				setState(513);
				match(End);
				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(Class);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(516);
					identifier();
					}
				}

				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(519);
					match(Extends);
					setState(520);
					identifierB();
					}
				}

				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(523);
					match(Implements);
					setState(524);
					identifierC();
					}
				}

				setState(527);
				classCodeBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockClassDeclarationAttrContext extends ParserRuleContext {
		public OpenOpAContext openOpA() {
			return getRuleContext(OpenOpAContext.class,0);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
		}
		public CloseOpAContext closeOpA() {
			return getRuleContext(CloseOpAContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Extends() { return getToken(TParser.Extends, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Implements() { return getToken(TParser.Implements, 0); }
		public IdentifierCContext identifierC() {
			return getRuleContext(IdentifierCContext.class,0);
		}
		public IdentifierDContext identifierD() {
			return getRuleContext(IdentifierDContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public BlockClassDeclarationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClassDeclarationAttr; }
	}

	public final BlockClassDeclarationAttrContext blockClassDeclarationAttr() throws RecognitionException {
		BlockClassDeclarationAttrContext _localctx = new BlockClassDeclarationAttrContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				openOpA();
				setState(531);
				match(New);
				setState(532);
				match(Class);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(533);
					identifier();
					}
				}

				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(536);
					match(Extends);
					setState(537);
					identifierB();
					}
				}

				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(540);
					match(Implements);
					setState(541);
					identifierC();
					}
				}

				setState(544);
				classCodeBlock();
				setState(545);
				closeOpA();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(546);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(547);
					identifierD();
					setState(548);
					match(OpenOp);
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(549);
						generalValueElements();
						}
					}

					setState(552);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(Class);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(557);
					identifier();
					}
				}

				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(560);
					match(Extends);
					setState(561);
					identifierB();
					}
				}

				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(564);
					match(Implements);
					setState(565);
					identifierC();
					}
				}

				setState(568);
				classCodeBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassAnonymousParamContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ClassAnonymousParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAnonymousParam; }
	}

	public final ClassAnonymousParamContext classAnonymousParam() throws RecognitionException {
		ClassAnonymousParamContext _localctx = new ClassAnonymousParamContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			generalValueElements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public ClassCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCodeBlock; }
	}

	public final ClassCodeBlockContext classCodeBlock() throws RecognitionException {
		ClassCodeBlockContext _localctx = new ClassCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			codeBlockControl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockArrayContext extends ParserRuleContext {
		public IndexArrayContext indexArray() {
			return getRuleContext(IndexArrayContext.class,0);
		}
		public AssociativeArrayContext associativeArray() {
			return getRuleContext(AssociativeArrayContext.class,0);
		}
		public BlockArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockArray; }
	}

	public final BlockArrayContext blockArray() throws RecognitionException {
		BlockArrayContext _localctx = new BlockArrayContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(575);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(576);
				associativeArray();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexArrayContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public IndexArrayElementsContext indexArrayElements() {
			return getRuleContext(IndexArrayElementsContext.class,0);
		}
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public IndexArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexArray; }
	}

	public final IndexArrayContext indexArray() throws RecognitionException {
		IndexArrayContext _localctx = new IndexArrayContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(OpenArIndex);
			setState(580);
			indexArrayElements();
			setState(581);
			match(CloseArIndex);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexArrayElementsContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<IndexArrayElementsContext> indexArrayElements() {
			return getRuleContexts(IndexArrayElementsContext.class);
		}
		public IndexArrayElementsContext indexArrayElements(int i) {
			return getRuleContext(IndexArrayElementsContext.class,i);
		}
		public IndexArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexArrayElements; }
	}

	public final IndexArrayElementsContext indexArrayElements() throws RecognitionException {
		IndexArrayElementsContext _localctx = new IndexArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			generalValueElements();
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(584);
					match(Separator);
					setState(585);
					indexArrayElements();
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeArrayContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public AssociativeArrayElementsContext associativeArrayElements() {
			return getRuleContext(AssociativeArrayElementsContext.class,0);
		}
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public AssociativeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArray; }
	}

	public final AssociativeArrayContext associativeArray() throws RecognitionException {
		AssociativeArrayContext _localctx = new AssociativeArrayContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(OpenBlock);
			setState(592);
			associativeArrayElements();
			setState(593);
			match(CloseBlock);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativeArrayElementsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TwoPoint() { return getToken(TParser.TwoPoint, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<AssociativeArrayElementsContext> associativeArrayElements() {
			return getRuleContexts(AssociativeArrayElementsContext.class);
		}
		public AssociativeArrayElementsContext associativeArrayElements(int i) {
			return getRuleContext(AssociativeArrayElementsContext.class,i);
		}
		public AssociativeArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativeArrayElements; }
	}

	public final AssociativeArrayElementsContext associativeArrayElements() throws RecognitionException {
		AssociativeArrayElementsContext _localctx = new AssociativeArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			identifier();
			setState(596);
			match(TwoPoint);
			setState(597);
			generalValueElements();
			setState(602);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					match(Separator);
					setState(599);
					associativeArrayElements();
					}
					} 
				}
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockLambdaFunctionsContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ARightLB() { return getToken(TParser.ARightLB, 0); }
		public LambdaFnCodeBlockContext lambdaFnCodeBlock() {
			return getRuleContext(LambdaFnCodeBlockContext.class,0);
		}
		public LambdaFnParamsContext lambdaFnParams() {
			return getRuleContext(LambdaFnParamsContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockLambdaFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLambdaFunctions; }
	}

	public final BlockLambdaFunctionsContext blockLambdaFunctions() throws RecognitionException {
		BlockLambdaFunctionsContext _localctx = new BlockLambdaFunctionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(OpenOp);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(606);
				lambdaFnParams();
				}
			}

			setState(609);
			match(CloseOp);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(610);
				match(ArrowRight);
				setState(611);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==TypeSpec) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(614);
			match(ARightLB);
			setState(615);
			lambdaFnCodeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFnParamsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<LambdaFnParamsContext> lambdaFnParams() {
			return getRuleContexts(LambdaFnParamsContext.class);
		}
		public LambdaFnParamsContext lambdaFnParams(int i) {
			return getRuleContext(LambdaFnParamsContext.class,i);
		}
		public LambdaFnParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnParams; }
	}

	public final LambdaFnParamsContext lambdaFnParams() throws RecognitionException {
		LambdaFnParamsContext _localctx = new LambdaFnParamsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(Identifier);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(618);
				match(TypeSpec);
				}
			}

			setState(625);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(621);
					match(Separator);
					setState(622);
					lambdaFnParams();
					}
					} 
				}
				setState(627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFnCodeBlockContext extends ParserRuleContext {
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public LambdaFnCodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFnCodeBlock; }
	}

	public final LambdaFnCodeBlockContext lambdaFnCodeBlock() throws RecognitionException {
		LambdaFnCodeBlockContext _localctx = new LambdaFnCodeBlockContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_lambdaFnCodeBlock);
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(628);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				generalValueElements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockFlowControlContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public CodeBlockFlowControlElementsContext codeBlockFlowControlElements() {
			return getRuleContext(CodeBlockFlowControlElementsContext.class,0);
		}
		public CodeBlockFlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockFlowControl; }
	}

	public final CodeBlockFlowControlContext codeBlockFlowControl() throws RecognitionException {
		CodeBlockFlowControlContext _localctx = new CodeBlockFlowControlContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_codeBlockFlowControl);
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(OpenBlock);
				setState(633);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(OpenBlock);
				setState(635);
				sentences();
				setState(636);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				codeBlockFlowControlElements();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockFlowControlElementsContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockRetContext blockRet() {
			return getRuleContext(BlockRetContext.class,0);
		}
		public BlockConditionalContext blockConditional() {
			return getRuleContext(BlockConditionalContext.class,0);
		}
		public BlockLoopContext blockLoop() {
			return getRuleContext(BlockLoopContext.class,0);
		}
		public BlockTryCatchContext blockTryCatch() {
			return getRuleContext(BlockTryCatchContext.class,0);
		}
		public BlockBreakContext blockBreak() {
			return getRuleContext(BlockBreakContext.class,0);
		}
		public BlockNextContext blockNext() {
			return getRuleContext(BlockNextContext.class,0);
		}
		public CodeBlockFlowControlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockFlowControlElements; }
	}

	public final CodeBlockFlowControlElementsContext codeBlockFlowControlElements() throws RecognitionException {
		CodeBlockFlowControlElementsContext _localctx = new CodeBlockFlowControlElementsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_codeBlockFlowControlElements);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				functionCall();
				setState(642);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(647);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(648);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(649);
				blockNext();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockControlContext extends ParserRuleContext {
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public CodeBlockControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlockControl; }
	}

	public final CodeBlockControlContext codeBlockControl() throws RecognitionException {
		CodeBlockControlContext _localctx = new CodeBlockControlContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_codeBlockControl);
		try {
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				match(OpenBlock);
				setState(653);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				match(OpenBlock);
				setState(655);
				sentences();
				setState(656);
				match(CloseBlock);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public IncDecOperatorsAContext incDecOperatorsA() {
			return getRuleContext(IncDecOperatorsAContext.class,0);
		}
		public IncDecOperatorsBContext incDecOperatorsB() {
			return getRuleContext(IncDecOperatorsBContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public BlockFunctionContext blockFunction() {
			return getRuleContext(BlockFunctionContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public BlockArrayContext blockArray() {
			return getRuleContext(BlockArrayContext.class,0);
		}
		public BlockFunctionDeclarationAttrContext blockFunctionDeclarationAttr() {
			return getRuleContext(BlockFunctionDeclarationAttrContext.class,0);
		}
		public BlockClassDeclarationAttrContext blockClassDeclarationAttr() {
			return getRuleContext(BlockClassDeclarationAttrContext.class,0);
		}
		public BlockLambdaFunctionsContext blockLambdaFunctions() {
			return getRuleContext(BlockLambdaFunctionsContext.class,0);
		}
		public TerminalNode OpenBlock() { return getToken(TParser.OpenBlock, 0); }
		public TerminalNode CloseBlock() { return getToken(TParser.CloseBlock, 0); }
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public GeneralValueBlockContext generalValueBlock() {
			return getRuleContext(GeneralValueBlockContext.class,0);
		}
		public GeneralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValue; }
	}

	public final GeneralValueContext generalValue() throws RecognitionException {
		GeneralValueContext _localctx = new GeneralValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_generalValue);
		int _la;
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(660);
					match(Not);
					}
				}

				setState(663);
				identifier();
				setState(664);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(665);
				identifierB();
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(666);
					match(TypeSpec);
					}
				}

				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(669);
					match(ArithmeticOperator);
					}
				}

				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(672);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(675);
						match(Not);
						}
					}

					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(678);
						incDecOperatorsA();
						}
					}

					setState(681);
					identifier();
					setState(683);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(682);
						incDecOperatorsB();
						}
						break;
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(685);
						match(TypeSpec);
						}
					}

					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(688);
						match(ArithmeticOperator);
						}
					}

					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(691);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 2:
					{
					setState(695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(694);
						match(Not);
						}
					}

					setState(697);
					match(Integer);
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(698);
						match(TypeSpec);
						}
					}

					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(701);
						match(ArithmeticOperator);
						}
					}

					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(704);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 3:
					{
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(707);
						match(Not);
						}
					}

					setState(710);
					match(Float);
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(711);
						match(TypeSpec);
						}
					}

					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(714);
						match(ArithmeticOperator);
						}
					}

					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(717);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 4:
					{
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(720);
						match(Not);
						}
					}

					setState(723);
					match(String);
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(724);
						match(TypeSpec);
						}
					}

					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(727);
						match(ArithmeticOperator);
						}
					}

					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(730);
						match(AssignmentOperator);
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(735);
					match(Not);
					}
				}

				setState(738);
				functionCall();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(739);
					match(TypeSpec);
					}
				}

				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(742);
					match(ArithmeticOperator);
					}
				}

				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(745);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(748);
					match(Not);
					}
				}

				setState(751);
				match(OpenOp);
				setState(752);
				blockFunction();
				setState(753);
				match(CloseOp);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(754);
					match(TypeSpec);
					}
				}

				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(757);
					match(ArithmeticOperator);
					}
				}

				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(760);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(763);
					match(Not);
					}
				}

				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(766);
					incDecOperatorsA();
					}
				}

				setState(769);
				blockArray();
				setState(771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(770);
					incDecOperatorsB();
					}
					break;
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(773);
					match(TypeSpec);
					}
				}

				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(776);
					match(ArithmeticOperator);
					}
				}

				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(779);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(782);
				blockFunctionDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(783);
				blockClassDeclarationAttr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(784);
				blockLambdaFunctions();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(789);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(785);
					match(OpenBlock);
					setState(786);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(787);
					match(OpenArIndex);
					setState(788);
					match(CloseArIndex);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(791);
					match(Not);
					}
				}

				setState(794);
				generalValueBlock();
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(795);
					match(TypeSpec);
					}
				}

				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(798);
					match(ArithmeticOperator);
					}
				}

				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(801);
					match(AssignmentOperator);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralValueBlockContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public GeneralValueItemsContext generalValueItems() {
			return getRuleContext(GeneralValueItemsContext.class,0);
		}
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public GeneralValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValueBlock; }
	}

	public final GeneralValueBlockContext generalValueBlock() throws RecognitionException {
		GeneralValueBlockContext _localctx = new GeneralValueBlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(OpenOp);
			setState(807);
			generalValueItems();
			setState(808);
			match(CloseOp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralValueItemsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<GeneralValueItemsContext> generalValueItems() {
			return getRuleContexts(GeneralValueItemsContext.class);
		}
		public GeneralValueItemsContext generalValueItems(int i) {
			return getRuleContext(GeneralValueItemsContext.class,i);
		}
		public GeneralValueItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValueItems; }
	}

	public final GeneralValueItemsContext generalValueItems() throws RecognitionException {
		GeneralValueItemsContext _localctx = new GeneralValueItemsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			generalValue();
			setState(814);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(811);
					generalValueItems();
					}
					} 
				}
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralValueElementsContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public GeneralValueElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalValueElements; }
	}

	public final GeneralValueElementsContext generalValueElements() throws RecognitionException {
		GeneralValueElementsContext _localctx = new GeneralValueElementsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			generalValue();
			setState(821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					generalValueElements();
					}
					} 
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierBContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierB; }
	}

	public final IdentifierBContext identifierB() throws RecognitionException {
		IdentifierBContext _localctx = new IdentifierBContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierCContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierC; }
	}

	public final IdentifierCContext identifierC() throws RecognitionException {
		IdentifierCContext _localctx = new IdentifierCContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierDContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public IdentifierDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierD; }
	}

	public final IdentifierDContext identifierD() throws RecognitionException {
		IdentifierDContext _localctx = new IdentifierDContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifierD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecOperatorsAContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public IncDecOperatorsAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecOperatorsA; }
	}

	public final IncDecOperatorsAContext incDecOperatorsA() throws RecognitionException {
		IncDecOperatorsAContext _localctx = new IncDecOperatorsAContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(IncDecOperators);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncDecOperatorsBContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public IncDecOperatorsBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecOperatorsB; }
	}

	public final IncDecOperatorsBContext incDecOperatorsB() throws RecognitionException {
		IncDecOperatorsBContext _localctx = new IncDecOperatorsBContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(IncDecOperators);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenOpAContext extends ParserRuleContext {
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public OpenOpAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openOpA; }
	}

	public final OpenOpAContext openOpA() throws RecognitionException {
		OpenOpAContext _localctx = new OpenOpAContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_openOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(OpenOp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseOpAContext extends ParserRuleContext {
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public CloseOpAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeOpA; }
	}

	public final CloseOpAContext closeOpA() throws RecognitionException {
		CloseOpAContext _localctx = new CloseOpAContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_closeOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(CloseOp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockLiveTokensContext extends ParserRuleContext {
		public TerminalNode ARightLB() { return getToken(TParser.ARightLB, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoPoint() { return getToken(TParser.TwoPoint, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Async() { return getToken(TParser.Async, 0); }
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public TerminalNode Identifier() { return getToken(TParser.Identifier, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public BlockLiveTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLiveTokens; }
	}

	public final BlockLiveTokensContext blockLiveTokens() throws RecognitionException {
		BlockLiveTokensContext _localctx = new BlockLiveTokensContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_blockLiveTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << Async) | (1L << ARightLB) | (1L << End) | (1L << Attr) | (1L << Point) | (1L << TwoPoint) | (1L << TwoTwoPoint) | (1L << Separator) | (1L << OpenOp) | (1L << CloseOp) | (1L << ArithmeticOperator) | (1L << AssignmentOperator) | (1L << IncDecOperators) | (1L << Identifier) | (1L << TypeSpec) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u034d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00a3"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b3"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00bb\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00c6\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00d0\n\n\3"+
		"\n\3\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00de\n\13\3\13\3\13\3\f\3\f\5\f\u00e4\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00ef\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f7\n\16"+
		"\3\17\3\17\3\17\7\17\u00fc\n\17\f\17\16\17\u00ff\13\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\5\21\u0107\n\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\7\23\u0112\n\23\f\23\16\23\u0115\13\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0126"+
		"\n\30\3\30\3\30\3\31\3\31\3\32\5\32\u012d\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0135\n\32\3\33\3\33\3\34\3\34\3\34\5\34\u013c\n\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\5\37\u0145\n\37\3 \3 \5 \u0149\n \3!\3!\5"+
		"!\u014d\n!\3\"\3\"\3\"\7\"\u0152\n\"\f\"\16\"\u0155\13\"\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\5%\u015f\n%\3&\3&\3&\3\'\3\'\5\'\u0166\n\'\3\'\3\'\5\'\u016a"+
		"\n\'\3\'\3\'\3(\3(\3)\3)\3)\5)\u0173\n)\3)\3)\5)\u0177\n)\3)\3)\3)\3)"+
		"\5)\u017d\n)\5)\u017f\n)\3)\3)\3)\3)\5)\u0185\n)\3)\3)\3)\3)\3)\5)\u018c"+
		"\n)\3)\3)\5)\u0190\n)\3)\3)\3)\3)\5)\u0196\n)\5)\u0198\n)\3)\3)\5)\u019c"+
		"\n)\5)\u019e\n)\3*\3*\3*\5*\u01a3\n*\3*\3*\5*\u01a7\n*\3*\3*\3*\3*\5*"+
		"\u01ad\n*\5*\u01af\n*\3*\3*\3*\3*\5*\u01b5\n*\3*\3*\3*\3*\5*\u01bb\n*"+
		"\3*\3*\5*\u01bf\n*\3*\3*\3*\3*\5*\u01c5\n*\5*\u01c7\n*\3*\5*\u01ca\n*"+
		"\3+\3+\3+\3+\5+\u01d0\n+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u01da\n.\3.\3.\3/"+
		"\3/\3\60\3\60\3\60\3\60\5\60\u01e4\n\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\5\62\u01ee\n\62\3\62\3\62\5\62\u01f2\n\62\3\62\3\62\5\62\u01f6"+
		"\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01fe\n\62\3\62\3\62\5\62\u0202"+
		"\n\62\3\62\3\62\3\62\3\62\5\62\u0208\n\62\3\62\3\62\5\62\u020c\n\62\3"+
		"\62\3\62\5\62\u0210\n\62\3\62\5\62\u0213\n\62\3\63\3\63\3\63\3\63\5\63"+
		"\u0219\n\63\3\63\3\63\5\63\u021d\n\63\3\63\3\63\5\63\u0221\n\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\5\63\u0229\n\63\3\63\3\63\5\63\u022d\n\63\3\63"+
		"\3\63\5\63\u0231\n\63\3\63\3\63\5\63\u0235\n\63\3\63\3\63\5\63\u0239\n"+
		"\63\3\63\5\63\u023c\n\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0244\n\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\78\u024d\n8\f8\168\u0250\138\39\39\39\3"+
		"9\3:\3:\3:\3:\3:\7:\u025b\n:\f:\16:\u025e\13:\3;\3;\5;\u0262\n;\3;\3;"+
		"\3;\5;\u0267\n;\3;\3;\3;\3<\3<\5<\u026e\n<\3<\3<\7<\u0272\n<\f<\16<\u0275"+
		"\13<\3=\3=\5=\u0279\n=\3>\3>\3>\3>\3>\3>\3>\5>\u0282\n>\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\5?\u028d\n?\3@\3@\3@\3@\3@\3@\5@\u0295\n@\3A\5A\u0298\n"+
		"A\3A\3A\3A\3A\5A\u029e\nA\3A\5A\u02a1\nA\3A\5A\u02a4\nA\3A\5A\u02a7\n"+
		"A\3A\5A\u02aa\nA\3A\3A\5A\u02ae\nA\3A\5A\u02b1\nA\3A\5A\u02b4\nA\3A\5"+
		"A\u02b7\nA\3A\5A\u02ba\nA\3A\3A\5A\u02be\nA\3A\5A\u02c1\nA\3A\5A\u02c4"+
		"\nA\3A\5A\u02c7\nA\3A\3A\5A\u02cb\nA\3A\5A\u02ce\nA\3A\5A\u02d1\nA\3A"+
		"\5A\u02d4\nA\3A\3A\5A\u02d8\nA\3A\5A\u02db\nA\3A\5A\u02de\nA\5A\u02e0"+
		"\nA\3A\5A\u02e3\nA\3A\3A\5A\u02e7\nA\3A\5A\u02ea\nA\3A\5A\u02ed\nA\3A"+
		"\5A\u02f0\nA\3A\3A\3A\3A\5A\u02f6\nA\3A\5A\u02f9\nA\3A\5A\u02fc\nA\3A"+
		"\5A\u02ff\nA\3A\5A\u0302\nA\3A\3A\5A\u0306\nA\3A\5A\u0309\nA\3A\5A\u030c"+
		"\nA\3A\5A\u030f\nA\3A\3A\3A\3A\3A\3A\3A\5A\u0318\nA\3A\5A\u031b\nA\3A"+
		"\3A\5A\u031f\nA\3A\5A\u0322\nA\3A\5A\u0325\nA\5A\u0327\nA\3B\3B\3B\3B"+
		"\3C\3C\7C\u032f\nC\fC\16C\u0332\13C\3D\3D\7D\u0336\nD\fD\16D\u0339\13"+
		"D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\2\2N\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\2\7\4\2\25\25\31\31\4\2\37\37++\4\2  \""+
		"\"\4\2..\60\60\t\2\13\17\30\30\35#(+-.\60\60\62\64\2\u039a\2\u009a\3\2"+
		"\2\2\4\u00a2\3\2\2\2\6\u00b2\3\2\2\2\b\u00ba\3\2\2\2\n\u00bc\3\2\2\2\f"+
		"\u00c5\3\2\2\2\16\u00c7\3\2\2\2\20\u00c9\3\2\2\2\22\u00cd\3\2\2\2\24\u00dd"+
		"\3\2\2\2\26\u00e1\3\2\2\2\30\u00ee\3\2\2\2\32\u00f6\3\2\2\2\34\u00f8\3"+
		"\2\2\2\36\u0100\3\2\2\2 \u0104\3\2\2\2\"\u010b\3\2\2\2$\u010f\3\2\2\2"+
		"&\u0116\3\2\2\2(\u011a\3\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\u0121\3"+
		"\2\2\2\60\u0129\3\2\2\2\62\u012c\3\2\2\2\64\u0136\3\2\2\2\66\u013b\3\2"+
		"\2\28\u013d\3\2\2\2:\u013f\3\2\2\2<\u0144\3\2\2\2>\u0148\3\2\2\2@\u014c"+
		"\3\2\2\2B\u014e\3\2\2\2D\u0156\3\2\2\2F\u0159\3\2\2\2H\u015c\3\2\2\2J"+
		"\u0160\3\2\2\2L\u0163\3\2\2\2N\u016d\3\2\2\2P\u019d\3\2\2\2R\u01c9\3\2"+
		"\2\2T\u01cb\3\2\2\2V\u01d1\3\2\2\2X\u01d3\3\2\2\2Z\u01d5\3\2\2\2\\\u01dd"+
		"\3\2\2\2^\u01df\3\2\2\2`\u01e7\3\2\2\2b\u0212\3\2\2\2d\u023b\3\2\2\2f"+
		"\u023d\3\2\2\2h\u023f\3\2\2\2j\u0243\3\2\2\2l\u0245\3\2\2\2n\u0249\3\2"+
		"\2\2p\u0251\3\2\2\2r\u0255\3\2\2\2t\u025f\3\2\2\2v\u026b\3\2\2\2x\u0278"+
		"\3\2\2\2z\u0281\3\2\2\2|\u028c\3\2\2\2~\u0294\3\2\2\2\u0080\u0326\3\2"+
		"\2\2\u0082\u0328\3\2\2\2\u0084\u032c\3\2\2\2\u0086\u0333\3\2\2\2\u0088"+
		"\u033a\3\2\2\2\u008a\u033c\3\2\2\2\u008c\u033e\3\2\2\2\u008e\u0340\3\2"+
		"\2\2\u0090\u0342\3\2\2\2\u0092\u0344\3\2\2\2\u0094\u0346\3\2\2\2\u0096"+
		"\u0348\3\2\2\2\u0098\u034a\3\2\2\2\u009a\u009b\5\4\3\2\u009b\u009c\7\2"+
		"\2\3\u009c\3\3\2\2\2\u009d\u00a3\5\6\4\2\u009e\u009f\5\6\4\2\u009f\u00a0"+
		"\5\4\3\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2"+
		"\u009e\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\5\3\2\2\2\u00a4\u00b3\5\n\6\2"+
		"\u00a5\u00b3\5\20\t\2\u00a6\u00b3\5\36\20\2\u00a7\u00b3\5 \21\2\u00a8"+
		"\u00b3\5.\30\2\u00a9\u00b3\5D#\2\u00aa\u00b3\5F$\2\u00ab\u00b3\5H%\2\u00ac"+
		"\u00b3\5P)\2\u00ad\u00b3\5Z.\2\u00ae\u00b3\5^\60\2\u00af\u00b3\5b\62\2"+
		"\u00b0\u00b3\5\b\5\2\u00b1\u00b3\5\u0098M\2\u00b2\u00a4\3\2\2\2\u00b2"+
		"\u00a5\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2"+
		"\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\7\3\2\2\2\u00b4\u00b5"+
		"\7&\2\2\u00b5\u00bb\7\'\2\2\u00b6\u00b7\7&\2\2\u00b7\u00b8\5\4\3\2\u00b8"+
		"\u00b9\7\'\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b6\3\2"+
		"\2\2\u00bb\t\3\2\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\f\7\2\u00be\u00bf"+
		"\7\36\2\2\u00bf\13\3\2\2\2\u00c0\u00c6\5\16\b\2\u00c1\u00c2\5\16\b\2\u00c2"+
		"\u00c3\7#\2\2\u00c3\u00c4\5\f\7\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3\2"+
		"\2\2\u00c5\u00c1\3\2\2\2\u00c6\r\3\2\2\2\u00c7\u00c8\7\64\2\2\u00c8\17"+
		"\3\2\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\7\36\2\2"+
		"\u00cc\21\3\2\2\2\u00cd\u00cf\5\24\13\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d6\5\u0086D"+
		"\2\u00d2\u00d3\7#\2\2\u00d3\u00d5\5\22\n\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\23\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00de\5\u0088E\2\u00da\u00db\5\u0088E\2\u00db\u00dc"+
		"\7\60\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e0\t\3\2\2\u00e0\25\3\2\2\2\u00e1\u00e3"+
		"\5\30\r\2\u00e2\u00e4\5\u0088E\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2"+
		"\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5\32\16\2\u00e6\27\3\2\2\2\u00e7\u00ef"+
		"\5\u0088E\2\u00e8\u00e9\5\u0088E\2\u00e9\u00ea\7 \2\2\u00ea\u00ef\3\2"+
		"\2\2\u00eb\u00ec\5\u0088E\2\u00ec\u00ed\7\"\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00e7\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\31\3\2\2"+
		"\2\u00f0\u00f1\7(\2\2\u00f1\u00f7\7)\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4"+
		"\5\34\17\2\u00f4\u00f5\7)\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0\3\2\2\2"+
		"\u00f6\u00f2\3\2\2\2\u00f7\33\3\2\2\2\u00f8\u00fd\5\u0080A\2\u00f9\u00fa"+
		"\7#\2\2\u00fa\u00fc\5\34\17\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2"+
		"\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\35\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u0101\7\t\2\2\u0101\u0102\5\u0086D\2\u0102\u0103\7\36\2"+
		"\2\u0103\37\3\2\2\2\u0104\u0106\5\"\22\2\u0105\u0107\5$\23\2\u0106\u0105"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5(\25\2\u0109"+
		"\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a!\3\2\2\2\u010b\u010c\7\5\2\2"+
		"\u010c\u010d\5*\26\2\u010d\u010e\5,\27\2\u010e#\3\2\2\2\u010f\u0113\5"+
		"&\24\2\u0110\u0112\5$\23\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114%\3\2\2\2\u0115\u0113\3\2\2\2"+
		"\u0116\u0117\7\6\2\2\u0117\u0118\5*\26\2\u0118\u0119\5,\27\2\u0119\'\3"+
		"\2\2\2\u011a\u011b\7\7\2\2\u011b\u011c\5,\27\2\u011c)\3\2\2\2\u011d\u011e"+
		"\5\u0086D\2\u011e+\3\2\2\2\u011f\u0120\5z>\2\u0120-\3\2\2\2\u0121\u0125"+
		"\7\b\2\2\u0122\u0126\5\66\34\2\u0123\u0126\5\64\33\2\u0124\u0126\5\62"+
		"\32\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\5\60\31\2\u0128/\3\2\2\2\u0129\u012a\5z>\2"+
		"\u012a\61\3\2\2\2\u012b\u012d\7(\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5<\37\2\u012f\u0130\58\35\2\u0130"+
		"\u0131\5> \2\u0131\u0132\5:\36\2\u0132\u0134\5@!\2\u0133\u0135\7)\2\2"+
		"\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\63\3\2\2\2\u0136\u0137"+
		"\5> \2\u0137\65\3\2\2\2\u0138\u0139\7(\2\2\u0139\u013c\7)\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013c\67\3\2\2\2\u013d"+
		"\u013e\7\36\2\2\u013e9\3\2\2\2\u013f\u0140\7\36\2\2\u0140;\3\2\2\2\u0141"+
		"\u0142\7\4\2\2\u0142\u0145\5\22\n\2\u0143\u0145\3\2\2\2\u0144\u0141\3"+
		"\2\2\2\u0144\u0143\3\2\2\2\u0145=\3\2\2\2\u0146\u0149\5\u0086D\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149?\3\2\2\2"+
		"\u014a\u014d\5B\"\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b"+
		"\3\2\2\2\u014dA\3\2\2\2\u014e\u0153\5\u0086D\2\u014f\u0150\7#\2\2\u0150"+
		"\u0152\5\u0086D\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154C\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0157\7\26\2\2\u0157\u0158\7\36\2\2\u0158E\3\2\2\2\u0159\u015a\7\27\2"+
		"\2\u015a\u015b\7\36\2\2\u015bG\3\2\2\2\u015c\u015e\5J&\2\u015d\u015f\5"+
		"L\'\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015fI\3\2\2\2\u0160\u0161"+
		"\7\32\2\2\u0161\u0162\5N(\2\u0162K\3\2\2\2\u0163\u0165\7\33\2\2\u0164"+
		"\u0166\7(\2\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0169\5\u0088E\2\u0168\u016a\7)\2\2\u0169\u0168\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5N(\2\u016cM\3\2\2\2\u016d"+
		"\u016e\5z>\2\u016eO\3\2\2\2\u016f\u0170\7(\2\2\u0170\u0172\7\n\2\2\u0171"+
		"\u0173\5\u0088E\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\7(\2\2\u0175\u0177\5T+\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017e\7)\2\2\u0179\u017c\7\34"+
		"\2\2\u017a\u017d\5\u008aF\2\u017b\u017d\7\60\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0179\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0181\5X-\2\u0181\u0182\7)\2\2\u0182\u0184"+
		"\7(\2\2\u0183\u0185\5V,\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\7)\2\2\u0187\u0188\7\36\2\2\u0188\u019e\3\2"+
		"\2\2\u0189\u018b\7\n\2\2\u018a\u018c\5\u0088E\2\u018b\u018a\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\7(\2\2\u018e\u0190\5T+"+
		"\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0197"+
		"\7)\2\2\u0192\u0195\7\34\2\2\u0193\u0196\5\u008aF\2\u0194\u0196\7\60\2"+
		"\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0192"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u019c\5X-\2\u019a"+
		"\u019c\7\36\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u019e\3"+
		"\2\2\2\u019d\u016f\3\2\2\2\u019d\u0189\3\2\2\2\u019eQ\3\2\2\2\u019f\u01a0"+
		"\7(\2\2\u01a0\u01a2\7\n\2\2\u01a1\u01a3\5\u0088E\2\u01a2\u01a1\3\2\2\2"+
		"\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\7(\2\2\u01a5\u01a7"+
		"\5T+\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01ae\7)\2\2\u01a9\u01ac\7\34\2\2\u01aa\u01ad\5\u008aF\2\u01ab\u01ad"+
		"\7\60\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01af\3\2\2\2"+
		"\u01ae\u01a9\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1"+
		"\5X-\2\u01b1\u01b2\7)\2\2\u01b2\u01b4\7(\2\2\u01b3\u01b5\5V,\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7)\2\2\u01b7"+
		"\u01ca\3\2\2\2\u01b8\u01ba\7\n\2\2\u01b9\u01bb\5\u0088E\2\u01ba\u01b9"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\7(\2\2\u01bd"+
		"\u01bf\5T+\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2"+
		"\2\u01c0\u01c6\7)\2\2\u01c1\u01c4\7\34\2\2\u01c2\u01c5\5\u008aF\2\u01c3"+
		"\u01c5\7\60\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c7\3"+
		"\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ca\5X-\2\u01c9\u019f\3\2\2\2\u01c9\u01b8\3\2\2\2\u01caS\3\2\2\2\u01cb"+
		"\u01cc\7.\2\2\u01cc\u01cf\7\60\2\2\u01cd\u01ce\7#\2\2\u01ce\u01d0\5T+"+
		"\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0U\3\2\2\2\u01d1\u01d2"+
		"\5\u0086D\2\u01d2W\3\2\2\2\u01d3\u01d4\5~@\2\u01d4Y\3\2\2\2\u01d5\u01d6"+
		"\7\20\2\2\u01d6\u01d9\5\u0088E\2\u01d7\u01d8\7\22\2\2\u01d8\u01da\5\u008a"+
		"F\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\5\\/\2\u01dc[\3\2\2\2\u01dd\u01de\5~@\2\u01de]\3\2\2\2\u01df\u01e0"+
		"\7\21\2\2\u01e0\u01e3\5\u0088E\2\u01e1\u01e2\7\22\2\2\u01e2\u01e4\5\u008a"+
		"F\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\5`\61\2\u01e6_\3\2\2\2\u01e7\u01e8\5~@\2\u01e8a\3\2\2\2\u01e9\u01ea"+
		"\5\u0094K\2\u01ea\u01eb\7\25\2\2\u01eb\u01ed\7\23\2\2\u01ec\u01ee\5\u0088"+
		"E\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01f0\7\22\2\2\u01f0\u01f2\5\u008aF\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f4\7\24\2\2\u01f4\u01f6\5\u008c"+
		"G\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\5h\65\2\u01f8\u0201\5\u0096L\2\u01f9\u01fa\t\4\2\2\u01fa\u01fb"+
		"\5\u008eH\2\u01fb\u01fd\7(\2\2\u01fc\u01fe\5\u0086D\2\u01fd\u01fc\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7)\2\2\u0200"+
		"\u0202\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\7\36\2\2\u0204\u0213\3\2\2\2\u0205\u0207\7\23\2\2\u0206"+
		"\u0208\5\u0088E\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b"+
		"\3\2\2\2\u0209\u020a\7\22\2\2\u020a\u020c\5\u008aF\2\u020b\u0209\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020e\7\24\2\2\u020e"+
		"\u0210\5\u008cG\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0213\5h\65\2\u0212\u01e9\3\2\2\2\u0212\u0205\3\2\2\2\u0213"+
		"c\3\2\2\2\u0214\u0215\5\u0094K\2\u0215\u0216\7\25\2\2\u0216\u0218\7\23"+
		"\2\2\u0217\u0219\5\u0088E\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u021b\7\22\2\2\u021b\u021d\5\u008aF\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021f\7\24\2\2"+
		"\u021f\u0221\5\u008cG\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\5h\65\2\u0223\u022c\5\u0096L\2\u0224\u0225"+
		"\t\4\2\2\u0225\u0226\5\u008eH\2\u0226\u0228\7(\2\2\u0227\u0229\5\u0086"+
		"D\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\7)\2\2\u022b\u022d\3\2\2\2\u022c\u0224\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u023c\3\2\2\2\u022e\u0230\7\23\2\2\u022f\u0231\5\u0088E\2\u0230"+
		"\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0233\7\22"+
		"\2\2\u0233\u0235\5\u008aF\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0237\7\24\2\2\u0237\u0239\5\u008cG\2\u0238\u0236"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\5h\65\2\u023b"+
		"\u0214\3\2\2\2\u023b\u022e\3\2\2\2\u023ce\3\2\2\2\u023d\u023e\5\u0086"+
		"D\2\u023eg\3\2\2\2\u023f\u0240\5~@\2\u0240i\3\2\2\2\u0241\u0244\5l\67"+
		"\2\u0242\u0244\5p9\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2\2\u0244k\3"+
		"\2\2\2\u0245\u0246\7$\2\2\u0246\u0247\5n8\2\u0247\u0248\7%\2\2\u0248m"+
		"\3\2\2\2\u0249\u024e\5\u0086D\2\u024a\u024b\7#\2\2\u024b\u024d\5n8\2\u024c"+
		"\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024fo\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7&\2\2\u0252\u0253"+
		"\5r:\2\u0253\u0254\7\'\2\2\u0254q\3\2\2\2\u0255\u0256\5\u0088E\2\u0256"+
		"\u0257\7!\2\2\u0257\u025c\5\u0086D\2\u0258\u0259\7#\2\2\u0259\u025b\5"+
		"r:\2\u025a\u0258\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025ds\3\2\2\2\u025e\u025c\3\2\2\2\u025f\u0261\7(\2\2\u0260"+
		"\u0262\5v<\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\3\2\2"+
		"\2\u0263\u0266\7)\2\2\u0264\u0265\7\34\2\2\u0265\u0267\t\5\2\2\u0266\u0264"+
		"\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7\35\2\2"+
		"\u0269\u026a\5x=\2\u026au\3\2\2\2\u026b\u026d\7.\2\2\u026c\u026e\7\60"+
		"\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0273\3\2\2\2\u026f"+
		"\u0270\7#\2\2\u0270\u0272\5v<\2\u0271\u026f\3\2\2\2\u0272\u0275\3\2\2"+
		"\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274w\3\2\2\2\u0275\u0273"+
		"\3\2\2\2\u0276\u0279\5~@\2\u0277\u0279\5\u0086D\2\u0278\u0276\3\2\2\2"+
		"\u0278\u0277\3\2\2\2\u0279y\3\2\2\2\u027a\u027b\7&\2\2\u027b\u0282\7\'"+
		"\2\2\u027c\u027d\7&\2\2\u027d\u027e\5\4\3\2\u027e\u027f\7\'\2\2\u027f"+
		"\u0282\3\2\2\2\u0280\u0282\5|?\2\u0281\u027a\3\2\2\2\u0281\u027c\3\2\2"+
		"\2\u0281\u0280\3\2\2\2\u0282{\3\2\2\2\u0283\u0284\5\26\f\2\u0284\u0285"+
		"\7\36\2\2\u0285\u028d\3\2\2\2\u0286\u028d\5\36\20\2\u0287\u028d\5 \21"+
		"\2\u0288\u028d\5.\30\2\u0289\u028d\5H%\2\u028a\u028d\5D#\2\u028b\u028d"+
		"\5F$\2\u028c\u0283\3\2\2\2\u028c\u0286\3\2\2\2\u028c\u0287\3\2\2\2\u028c"+
		"\u0288\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2"+
		"\2\2\u028d}\3\2\2\2\u028e\u028f\7&\2\2\u028f\u0295\7\'\2\2\u0290\u0291"+
		"\7&\2\2\u0291\u0292\5\4\3\2\u0292\u0293\7\'\2\2\u0293\u0295\3\2\2\2\u0294"+
		"\u028e\3\2\2\2\u0294\u0290\3\2\2\2\u0295\177\3\2\2\2\u0296\u0298\7,\2"+
		"\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a"+
		"\5\u0088E\2\u029a\u029b\t\4\2\2\u029b\u029d\5\u008aF\2\u029c\u029e\7\60"+
		"\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f"+
		"\u02a1\7*\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2"+
		"\2\2\u02a2\u02a4\7+\2\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u0327\3\2\2\2\u02a5\u02a7\7,\2\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02aa\5\u0090I\2\u02a9\u02a8\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\5\u0088E\2\u02ac\u02ae"+
		"\5\u0092J\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2"+
		"\2\u02af\u02b1\7\60\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02b4\7*\2\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b7\7+\2\2\u02b6\u02b5\3\2\2\2\u02b6"+
		"\u02b7\3\2\2\2\u02b7\u02e0\3\2\2\2\u02b8\u02ba\7,\2\2\u02b9\u02b8\3\2"+
		"\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bd\7\62\2\2\u02bc"+
		"\u02be\7\60\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3"+
		"\2\2\2\u02bf\u02c1\7*\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02c3\3\2\2\2\u02c2\u02c4\7+\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2"+
		"\2\2\u02c4\u02e0\3\2\2\2\u02c5\u02c7\7,\2\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\7\63\2\2\u02c9\u02cb\7"+
		"\60\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ce\7*\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2"+
		"\2\2\u02cf\u02d1\7+\2\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1"+
		"\u02e0\3\2\2\2\u02d2\u02d4\7,\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\7\64\2\2\u02d6\u02d8\7\60\2\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9\u02db\7*"+
		"\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc"+
		"\u02de\7+\2\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2"+
		"\2\2\u02df\u02a6\3\2\2\2\u02df\u02b9\3\2\2\2\u02df\u02c6\3\2\2\2\u02df"+
		"\u02d3\3\2\2\2\u02e0\u0327\3\2\2\2\u02e1\u02e3\7,\2\2\u02e2\u02e1\3\2"+
		"\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\5\26\f\2\u02e5"+
		"\u02e7\7\60\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3"+
		"\2\2\2\u02e8\u02ea\7*\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02ed\7+\2\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u0327\3\2\2\2\u02ee\u02f0\7,\2\2\u02ef\u02ee\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\7(\2\2\u02f2\u02f3\5P)"+
		"\2\u02f3\u02f5\7)\2\2\u02f4\u02f6\7\60\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f9\7*\2\2\u02f8\u02f7\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02fc\7+\2\2\u02fb\u02fa\3\2"+
		"\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0327\3\2\2\2\u02fd\u02ff\7,\2\2\u02fe"+
		"\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u0302\5\u0090"+
		"I\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0305\5j\66\2\u0304\u0306\5\u0092J\2\u0305\u0304\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309\7\60\2\2\u0308\u0307\3\2\2\2"+
		"\u0308\u0309\3\2\2\2\u0309\u030b\3\2\2\2\u030a\u030c\7*\2\2\u030b\u030a"+
		"\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030f\7+\2\2\u030e"+
		"\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0327\3\2\2\2\u0310\u0327\5R"+
		"*\2\u0311\u0327\5d\63\2\u0312\u0327\5t;\2\u0313\u0314\7&\2\2\u0314\u0318"+
		"\7\'\2\2\u0315\u0316\7$\2\2\u0316\u0318\7%\2\2\u0317\u0313\3\2\2\2\u0317"+
		"\u0315\3\2\2\2\u0318\u0327\3\2\2\2\u0319\u031b\7,\2\2\u031a\u0319\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\5\u0082B\2\u031d"+
		"\u031f\7\60\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3"+
		"\2\2\2\u0320\u0322\7*\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0325\7+\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0327\3\2\2\2\u0326\u0297\3\2\2\2\u0326\u02df\3\2\2\2\u0326"+
		"\u02e2\3\2\2\2\u0326\u02ef\3\2\2\2\u0326\u02fe\3\2\2\2\u0326\u0310\3\2"+
		"\2\2\u0326\u0311\3\2\2\2\u0326\u0312\3\2\2\2\u0326\u0317\3\2\2\2\u0326"+
		"\u031a\3\2\2\2\u0327\u0081\3\2\2\2\u0328\u0329\7(\2\2\u0329\u032a\5\u0084"+
		"C\2\u032a\u032b\7)\2\2\u032b\u0083\3\2\2\2\u032c\u0330\5\u0080A\2\u032d"+
		"\u032f\5\u0084C\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e"+
		"\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0085\3\2\2\2\u0332\u0330\3\2\2\2\u0333"+
		"\u0337\5\u0080A\2\u0334\u0336\5\u0086D\2\u0335\u0334\3\2\2\2\u0336\u0339"+
		"\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0087\3\2\2\2\u0339"+
		"\u0337\3\2\2\2\u033a\u033b\7.\2\2\u033b\u0089\3\2\2\2\u033c\u033d\7.\2"+
		"\2\u033d\u008b\3\2\2\2\u033e\u033f\7.\2\2\u033f\u008d\3\2\2\2\u0340\u0341"+
		"\7.\2\2\u0341\u008f\3\2\2\2\u0342\u0343\7-\2\2\u0343\u0091\3\2\2\2\u0344"+
		"\u0345\7-\2\2\u0345\u0093\3\2\2\2\u0346\u0347\7(\2\2\u0347\u0095\3\2\2"+
		"\2\u0348\u0349\7)\2\2\u0349\u0097\3\2\2\2\u034a\u034b\t\6\2\2\u034b\u0099"+
		"\3\2\2\2}\u00a2\u00b2\u00ba\u00c5\u00cf\u00d6\u00dd\u00e3\u00ee\u00f6"+
		"\u00fd\u0106\u0109\u0113\u0125\u012c\u0134\u013b\u0144\u0148\u014c\u0153"+
		"\u015e\u0165\u0169\u0172\u0176\u017c\u017e\u0184\u018b\u018f\u0195\u0197"+
		"\u019b\u019d\u01a2\u01a6\u01ac\u01ae\u01b4\u01ba\u01be\u01c4\u01c6\u01c9"+
		"\u01cf\u01d9\u01e3\u01ed\u01f1\u01f5\u01fd\u0201\u0207\u020b\u020f\u0212"+
		"\u0218\u021c\u0220\u0228\u022c\u0230\u0234\u0238\u023b\u0243\u024e\u025c"+
		"\u0261\u0266\u026d\u0273\u0278\u0281\u028c\u0294\u0297\u029d\u02a0\u02a3"+
		"\u02a6\u02a9\u02ad\u02b0\u02b3\u02b6\u02b9\u02bd\u02c0\u02c3\u02c6\u02ca"+
		"\u02cd\u02d0\u02d3\u02d7\u02da\u02dd\u02df\u02e2\u02e6\u02e9\u02ec\u02ef"+
		"\u02f5\u02f8\u02fb\u02fe\u0301\u0305\u0308\u030b\u030e\u0317\u031a\u031e"+
		"\u0321\u0324\u0326\u0330\u0337";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}