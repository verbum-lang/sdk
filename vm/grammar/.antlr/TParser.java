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
		RULE_tryCatchElements = 38, RULE_blockFunction = 39, RULE_blockFunctionAttr = 40, 
		RULE_functionParam = 41, RULE_functionAnonymousParam = 42, RULE_functionCodeBlock = 43, 
		RULE_blockInterface = 44, RULE_interfaceCodeBlock = 45, RULE_blockAbstraction = 46, 
		RULE_abstractionCodeBlock = 47, RULE_blockClass = 48, RULE_classCodeBlock = 49, 
		RULE_blockArray = 50, RULE_indexArray = 51, RULE_indexArrayElements = 52, 
		RULE_associativeArray = 53, RULE_associativeArrayElements = 54, RULE_codeBlockFlowControl = 55, 
		RULE_codeBlockFlowControlElements = 56, RULE_codeBlockControl = 57, RULE_generalValue = 58, 
		RULE_generalValueBlock = 59, RULE_generalValueItems = 60, RULE_generalValueElements = 61, 
		RULE_identifier = 62, RULE_identifierB = 63, RULE_identifierC = 64, RULE_incDecOperatorsA = 65, 
		RULE_incDecOperatorsB = 66, RULE_blockLiveTokens = 67;
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
			"blockFunction", "blockFunctionAttr", "functionParam", "functionAnonymousParam", 
			"functionCodeBlock", "blockInterface", "interfaceCodeBlock", "blockAbstraction", 
			"abstractionCodeBlock", "blockClass", "classCodeBlock", "blockArray", 
			"indexArray", "indexArrayElements", "associativeArray", "associativeArrayElements", 
			"codeBlockFlowControl", "codeBlockFlowControlElements", "codeBlockControl", 
			"generalValue", "generalValueBlock", "generalValueItems", "generalValueElements", 
			"identifier", "identifierB", "identifierC", "incDecOperatorsA", "incDecOperatorsB", 
			"blockLiveTokens"
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
			setState(136);
			sentences();
			setState(137);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				statements();
				setState(141);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(155);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(157);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(158);
				blockCode();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(159);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(162);
				match(OpenBlock);
				setState(163);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(164);
				match(OpenBlock);
				setState(165);
				sentences();
				setState(166);
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
			setState(170);
			match(Use);
			setState(171);
			useValue();
			setState(172);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				useString();
				setState(176);
				match(Separator);
				setState(177);
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
			setState(181);
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
			setState(183);
			match(Var);
			setState(184);
			variableItem();
			setState(185);
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
			setState(187);
			variablePrefixModes();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(188);
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

			setState(191);
			generalValueElements();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					match(Separator);
					setState(193);
					variableItem();
					}
					} 
				}
				setState(198);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(199);
				identifier();
				}
				break;
			case 2:
				{
				setState(200);
				identifier();
				setState(201);
				match(TypeSpec);
				}
				break;
			}
			setState(205);
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
			setState(207);
			functionCallPrefix();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(208);
				identifier();
				}
			}

			setState(211);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				identifier();
				setState(215);
				match(Point);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				identifier();
				setState(218);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(OpenOp);
				setState(223);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(OpenOp);
				setState(225);
				functionCallParamElements();
				setState(226);
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
			setState(230);
			generalValue();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(Separator);
					setState(232);
					functionCallParamElements();
					}
					} 
				}
				setState(237);
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
			setState(238);
			match(Ret);
			setState(239);
			generalValueElements();
			setState(240);
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
			setState(242);
			ifElementUnique();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(243);
				elifElements();
				}
				break;
			}
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(246);
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
			setState(249);
			match(If);
			setState(250);
			conditionalBlockExpression();
			setState(251);
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
			setState(253);
			elifElementUnique();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					elifElements();
					}
					} 
				}
				setState(259);
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
			setState(260);
			match(Elif);
			setState(261);
			conditionalBlockExpression();
			setState(262);
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
			setState(264);
			match(Else);
			setState(265);
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
			setState(267);
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
			setState(269);
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
			setState(271);
			match(For);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(272);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(273);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(274);
				loopComplete();
				}
				break;
			}
			setState(277);
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
			setState(279);
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
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(281);
				match(OpenOp);
				}
			}

			setState(284);
			loopOneMembers();
			setState(285);
			endOne();
			setState(286);
			loopTwoMembers();
			setState(287);
			endTwo();
			setState(288);
			loopThreeMembers();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(289);
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
			setState(292);
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
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(OpenOp);
				setState(295);
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
			setState(299);
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
			setState(301);
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
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(Var);
				setState(304);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
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
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
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
			setState(316);
			generalValueElements();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(317);
				match(Separator);
				setState(318);
				generalValueElements();
				}
				}
				setState(323);
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
			setState(324);
			match(Break);
			setState(325);
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
			setState(327);
			match(Next);
			setState(328);
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
			setState(330);
			tryUniqueElement();
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(331);
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
			setState(334);
			match(Try);
			setState(335);
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
			setState(337);
			match(Catch);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(338);
				match(OpenOp);
				}
			}

			setState(341);
			identifier();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(342);
				match(CloseOp);
				}
			}

			setState(345);
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
			setState(347);
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(OpenOp);
				setState(350);
				match(Function);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(351);
					identifier();
					}
				}

				setState(354);
				match(OpenOp);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(355);
					functionParam();
					}
				}

				setState(358);
				match(CloseOp);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(359);
					match(ArrowRight);
					setState(362);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(360);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(361);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(366);
				functionCodeBlock();
				setState(367);
				match(CloseOp);
				setState(368);
				match(OpenOp);
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(369);
					functionAnonymousParam();
					}
				}

				setState(372);
				match(CloseOp);
				setState(373);
				match(End);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(Function);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(376);
					identifier();
					}
				}

				setState(379);
				match(OpenOp);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(380);
					functionParam();
					}
				}

				setState(383);
				match(CloseOp);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(384);
					match(ArrowRight);
					setState(387);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(385);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(386);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(393);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(391);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(392);
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

	public static class BlockFunctionAttrContext extends ParserRuleContext {
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
		public BlockFunctionAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunctionAttr; }
	}

	public final BlockFunctionAttrContext blockFunctionAttr() throws RecognitionException {
		BlockFunctionAttrContext _localctx = new BlockFunctionAttrContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_blockFunctionAttr);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(OpenOp);
				setState(398);
				match(Function);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(399);
					identifier();
					}
				}

				setState(402);
				match(OpenOp);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(403);
					functionParam();
					}
				}

				setState(406);
				match(CloseOp);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(407);
					match(ArrowRight);
					setState(410);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(408);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(409);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(414);
				functionCodeBlock();
				setState(415);
				match(CloseOp);
				setState(416);
				match(OpenOp);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(417);
					functionAnonymousParam();
					}
				}

				setState(420);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(Function);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(423);
					identifier();
					}
				}

				setState(426);
				match(OpenOp);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(427);
					functionParam();
					}
				}

				setState(430);
				match(CloseOp);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(431);
					match(ArrowRight);
					setState(434);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(432);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(433);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(438);
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
			setState(441);
			match(Identifier);
			setState(442);
			match(TypeSpec);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(443);
				match(Separator);
				setState(444);
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
			setState(447);
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
			setState(449);
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
			setState(451);
			match(Interface);
			setState(452);
			identifier();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(453);
				match(Extends);
				setState(454);
				identifierB();
				}
			}

			setState(457);
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
			setState(459);
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
			setState(461);
			match(Abstract);
			setState(462);
			identifier();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(463);
				match(Extends);
				setState(464);
				identifierB();
				}
			}

			setState(467);
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
			setState(469);
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
		public TerminalNode Class() { return getToken(TParser.Class, 0); }
		public ClassCodeBlockContext classCodeBlock() {
			return getRuleContext(ClassCodeBlockContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(Class);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(472);
				identifier();
				}
			}

			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(475);
				match(Extends);
				setState(476);
				identifierB();
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(479);
				match(Implements);
				setState(480);
				identifierC();
				}
			}

			setState(483);
			classCodeBlock();
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
		enterRule(_localctx, 98, RULE_classCodeBlock);
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
		enterRule(_localctx, 100, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(487);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(488);
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
		enterRule(_localctx, 102, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(OpenArIndex);
			setState(492);
			indexArrayElements();
			setState(493);
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
		enterRule(_localctx, 104, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			generalValueElements();
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					match(Separator);
					setState(497);
					indexArrayElements();
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
		enterRule(_localctx, 106, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(OpenBlock);
			setState(504);
			associativeArrayElements();
			setState(505);
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
		enterRule(_localctx, 108, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			identifier();
			setState(508);
			match(TwoPoint);
			setState(509);
			generalValueElements();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(510);
					match(Separator);
					setState(511);
					associativeArrayElements();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 110, RULE_codeBlockFlowControl);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(OpenBlock);
				setState(518);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(OpenBlock);
				setState(520);
				sentences();
				setState(521);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
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
		enterRule(_localctx, 112, RULE_codeBlockFlowControlElements);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				functionCall();
				setState(527);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(534);
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
		enterRule(_localctx, 114, RULE_codeBlockControl);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				match(OpenBlock);
				setState(538);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(OpenBlock);
				setState(540);
				sentences();
				setState(541);
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
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public IncDecOperatorsAContext incDecOperatorsA() {
			return getRuleContext(IncDecOperatorsAContext.class,0);
		}
		public IncDecOperatorsBContext incDecOperatorsB() {
			return getRuleContext(IncDecOperatorsBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
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
		public BlockFunctionAttrContext blockFunctionAttr() {
			return getRuleContext(BlockFunctionAttrContext.class,0);
		}
		public BlockClassContext blockClass() {
			return getRuleContext(BlockClassContext.class,0);
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
		enterRule(_localctx, 116, RULE_generalValue);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(545);
						match(Not);
						}
					}

					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(548);
						incDecOperatorsA();
						}
					}

					setState(551);
					identifier();
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(552);
						incDecOperatorsB();
						}
						break;
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(555);
						match(TypeSpec);
						}
					}

					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(558);
						match(ArithmeticOperator);
						}
					}

					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(561);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 2:
					{
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(564);
						match(Not);
						}
					}

					setState(567);
					match(Integer);
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(568);
						match(TypeSpec);
						}
					}

					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(571);
						match(ArithmeticOperator);
						}
					}

					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(574);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 3:
					{
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(577);
						match(Not);
						}
					}

					setState(580);
					match(Float);
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(581);
						match(TypeSpec);
						}
					}

					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(584);
						match(ArithmeticOperator);
						}
					}

					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(587);
						match(AssignmentOperator);
						}
					}

					}
					break;
				case 4:
					{
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(590);
						match(Not);
						}
					}

					setState(593);
					match(String);
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(594);
						match(TypeSpec);
						}
					}

					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(597);
						match(ArithmeticOperator);
						}
					}

					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignmentOperator) {
						{
						setState(600);
						match(AssignmentOperator);
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(605);
					match(Not);
					}
				}

				setState(608);
				functionCall();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(609);
					match(TypeSpec);
					}
				}

				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(612);
					match(ArithmeticOperator);
					}
				}

				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(615);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(618);
					match(Not);
					}
				}

				setState(621);
				match(OpenOp);
				setState(622);
				blockFunction();
				setState(623);
				match(CloseOp);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(624);
					match(TypeSpec);
					}
				}

				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(627);
					match(ArithmeticOperator);
					}
				}

				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(630);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(633);
					match(Not);
					}
				}

				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(636);
					incDecOperatorsA();
					}
				}

				setState(639);
				blockArray();
				setState(641);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(640);
					incDecOperatorsB();
					}
					break;
				}
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(643);
					match(TypeSpec);
					}
				}

				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(646);
					match(ArithmeticOperator);
					}
				}

				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(649);
					match(AssignmentOperator);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(652);
				blockFunctionAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(653);
				blockClass();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(654);
					match(OpenBlock);
					setState(655);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(656);
					match(OpenArIndex);
					setState(657);
					match(CloseArIndex);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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
				generalValueBlock();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(664);
					match(TypeSpec);
					}
				}

				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(667);
					match(ArithmeticOperator);
					}
				}

				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignmentOperator) {
					{
					setState(670);
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
		enterRule(_localctx, 118, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(OpenOp);
			setState(676);
			generalValueItems();
			setState(677);
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
		enterRule(_localctx, 120, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			generalValue();
			setState(683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					generalValueItems();
					}
					} 
				}
				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 122, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			generalValue();
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					generalValueElements();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
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
		enterRule(_localctx, 124, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
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
		enterRule(_localctx, 126, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		enterRule(_localctx, 128, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
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
		enterRule(_localctx, 130, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
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
		enterRule(_localctx, 132, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
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

	public static class BlockLiveTokensContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode ARightLB() { return getToken(TParser.ARightLB, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoPoint() { return getToken(TParser.TwoPoint, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Separator() { return getToken(TParser.Separator, 0); }
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
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
		enterRule(_localctx, 134, RULE_blockLiveTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << New) | (1L << Async) | (1L << ARightLB) | (1L << End) | (1L << Attr) | (1L << Point) | (1L << TwoPoint) | (1L << TwoTwoPoint) | (1L << Separator) | (1L << OpenArIndex) | (1L << CloseArIndex) | (1L << OpenOp) | (1L << CloseOp) | (1L << ArithmeticOperator) | (1L << AssignmentOperator) | (1L << IncDecOperators) | (1L << Identifier) | (1L << TypeSpec) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u02c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u0093\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u00a3\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00b6\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\5\n\u00c0\n\n\3\n\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\13"+
		"\3\13\3\13\3\13\5\13\u00ce\n\13\3\13\3\13\3\f\3\f\5\f\u00d4\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00df\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00e7\n\16\3\17\3\17\3\17\7\17\u00ec\n\17\f\17\16\17\u00ef"+
		"\13\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00f7\n\21\3\21\5\21\u00fa\n"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\5\30\u0116\n\30\3\30\3\30\3\31\3\31\3\32\5\32\u011d\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0125\n\32\3\33\3\33\3\34\3\34\3\34\5\34"+
		"\u012c\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u0135\n\37\3 \3 \5"+
		" \u0139\n \3!\3!\5!\u013d\n!\3\"\3\"\3\"\7\"\u0142\n\"\f\"\16\"\u0145"+
		"\13\"\3#\3#\3#\3$\3$\3$\3%\3%\5%\u014f\n%\3&\3&\3&\3\'\3\'\5\'\u0156\n"+
		"\'\3\'\3\'\5\'\u015a\n\'\3\'\3\'\3(\3(\3)\3)\3)\5)\u0163\n)\3)\3)\5)\u0167"+
		"\n)\3)\3)\3)\3)\5)\u016d\n)\5)\u016f\n)\3)\3)\3)\3)\5)\u0175\n)\3)\3)"+
		"\3)\3)\3)\5)\u017c\n)\3)\3)\5)\u0180\n)\3)\3)\3)\3)\5)\u0186\n)\5)\u0188"+
		"\n)\3)\3)\5)\u018c\n)\5)\u018e\n)\3*\3*\3*\5*\u0193\n*\3*\3*\5*\u0197"+
		"\n*\3*\3*\3*\3*\5*\u019d\n*\5*\u019f\n*\3*\3*\3*\3*\5*\u01a5\n*\3*\3*"+
		"\3*\3*\5*\u01ab\n*\3*\3*\5*\u01af\n*\3*\3*\3*\3*\5*\u01b5\n*\5*\u01b7"+
		"\n*\3*\5*\u01ba\n*\3+\3+\3+\3+\5+\u01c0\n+\3,\3,\3-\3-\3.\3.\3.\3.\5."+
		"\u01ca\n.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60\u01d4\n\60\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\5\62\u01dc\n\62\3\62\3\62\5\62\u01e0\n\62\3\62\3\62"+
		"\5\62\u01e4\n\62\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u01ec\n\64\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\7\66\u01f5\n\66\f\66\16\66\u01f8\13\66\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\38\78\u0203\n8\f8\168\u0206\138\39\39\3"+
		"9\39\39\39\39\59\u020f\n9\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u021a\n:\3;\3"+
		";\3;\3;\3;\3;\5;\u0222\n;\3<\5<\u0225\n<\3<\5<\u0228\n<\3<\3<\5<\u022c"+
		"\n<\3<\5<\u022f\n<\3<\5<\u0232\n<\3<\5<\u0235\n<\3<\5<\u0238\n<\3<\3<"+
		"\5<\u023c\n<\3<\5<\u023f\n<\3<\5<\u0242\n<\3<\5<\u0245\n<\3<\3<\5<\u0249"+
		"\n<\3<\5<\u024c\n<\3<\5<\u024f\n<\3<\5<\u0252\n<\3<\3<\5<\u0256\n<\3<"+
		"\5<\u0259\n<\3<\5<\u025c\n<\5<\u025e\n<\3<\5<\u0261\n<\3<\3<\5<\u0265"+
		"\n<\3<\5<\u0268\n<\3<\5<\u026b\n<\3<\5<\u026e\n<\3<\3<\3<\3<\5<\u0274"+
		"\n<\3<\5<\u0277\n<\3<\5<\u027a\n<\3<\5<\u027d\n<\3<\5<\u0280\n<\3<\3<"+
		"\5<\u0284\n<\3<\5<\u0287\n<\3<\5<\u028a\n<\3<\5<\u028d\n<\3<\3<\3<\3<"+
		"\3<\3<\5<\u0295\n<\3<\5<\u0298\n<\3<\3<\5<\u029c\n<\3<\5<\u029f\n<\3<"+
		"\5<\u02a2\n<\5<\u02a4\n<\3=\3=\3=\3=\3>\3>\7>\u02ac\n>\f>\16>\u02af\13"+
		">\3?\3?\7?\u02b3\n?\f?\16?\u02b6\13?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E"+
		"\3E\3E\2\2F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\2"+
		"\5\4\2\25\25\31\31\4\2\37\37++\n\2\13\17\25\25\30\30\35%(+-.\60\60\62"+
		"\64\2\u02ff\2\u008a\3\2\2\2\4\u0092\3\2\2\2\6\u00a2\3\2\2\2\b\u00aa\3"+
		"\2\2\2\n\u00ac\3\2\2\2\f\u00b5\3\2\2\2\16\u00b7\3\2\2\2\20\u00b9\3\2\2"+
		"\2\22\u00bd\3\2\2\2\24\u00cd\3\2\2\2\26\u00d1\3\2\2\2\30\u00de\3\2\2\2"+
		"\32\u00e6\3\2\2\2\34\u00e8\3\2\2\2\36\u00f0\3\2\2\2 \u00f4\3\2\2\2\"\u00fb"+
		"\3\2\2\2$\u00ff\3\2\2\2&\u0106\3\2\2\2(\u010a\3\2\2\2*\u010d\3\2\2\2,"+
		"\u010f\3\2\2\2.\u0111\3\2\2\2\60\u0119\3\2\2\2\62\u011c\3\2\2\2\64\u0126"+
		"\3\2\2\2\66\u012b\3\2\2\28\u012d\3\2\2\2:\u012f\3\2\2\2<\u0134\3\2\2\2"+
		">\u0138\3\2\2\2@\u013c\3\2\2\2B\u013e\3\2\2\2D\u0146\3\2\2\2F\u0149\3"+
		"\2\2\2H\u014c\3\2\2\2J\u0150\3\2\2\2L\u0153\3\2\2\2N\u015d\3\2\2\2P\u018d"+
		"\3\2\2\2R\u01b9\3\2\2\2T\u01bb\3\2\2\2V\u01c1\3\2\2\2X\u01c3\3\2\2\2Z"+
		"\u01c5\3\2\2\2\\\u01cd\3\2\2\2^\u01cf\3\2\2\2`\u01d7\3\2\2\2b\u01d9\3"+
		"\2\2\2d\u01e7\3\2\2\2f\u01eb\3\2\2\2h\u01ed\3\2\2\2j\u01f1\3\2\2\2l\u01f9"+
		"\3\2\2\2n\u01fd\3\2\2\2p\u020e\3\2\2\2r\u0219\3\2\2\2t\u0221\3\2\2\2v"+
		"\u02a3\3\2\2\2x\u02a5\3\2\2\2z\u02a9\3\2\2\2|\u02b0\3\2\2\2~\u02b7\3\2"+
		"\2\2\u0080\u02b9\3\2\2\2\u0082\u02bb\3\2\2\2\u0084\u02bd\3\2\2\2\u0086"+
		"\u02bf\3\2\2\2\u0088\u02c1\3\2\2\2\u008a\u008b\5\4\3\2\u008b\u008c\7\2"+
		"\2\3\u008c\3\3\2\2\2\u008d\u0093\5\6\4\2\u008e\u008f\5\6\4\2\u008f\u0090"+
		"\5\4\3\2\u0090\u0093\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u008d\3\2\2\2\u0092"+
		"\u008e\3\2\2\2\u0092\u0091\3\2\2\2\u0093\5\3\2\2\2\u0094\u00a3\5\n\6\2"+
		"\u0095\u00a3\5\20\t\2\u0096\u00a3\5\36\20\2\u0097\u00a3\5 \21\2\u0098"+
		"\u00a3\5.\30\2\u0099\u00a3\5D#\2\u009a\u00a3\5F$\2\u009b\u00a3\5H%\2\u009c"+
		"\u00a3\5P)\2\u009d\u00a3\5Z.\2\u009e\u00a3\5^\60\2\u009f\u00a3\5b\62\2"+
		"\u00a0\u00a3\5\b\5\2\u00a1\u00a3\5\u0088E\2\u00a2\u0094\3\2\2\2\u00a2"+
		"\u0095\3\2\2\2\u00a2\u0096\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0098\3\2"+
		"\2\2\u00a2\u0099\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2"+
		"\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\7\3\2\2\2\u00a4\u00a5"+
		"\7&\2\2\u00a5\u00ab\7\'\2\2\u00a6\u00a7\7&\2\2\u00a7\u00a8\5\4\3\2\u00a8"+
		"\u00a9\7\'\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a6\3\2"+
		"\2\2\u00ab\t\3\2\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af"+
		"\7\36\2\2\u00af\13\3\2\2\2\u00b0\u00b6\5\16\b\2\u00b1\u00b2\5\16\b\2\u00b2"+
		"\u00b3\7#\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2"+
		"\2\2\u00b5\u00b1\3\2\2\2\u00b6\r\3\2\2\2\u00b7\u00b8\7\64\2\2\u00b8\17"+
		"\3\2\2\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\7\36\2\2"+
		"\u00bc\21\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00c0\t\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c6\5|?\2\u00c2"+
		"\u00c3\7#\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\23\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00ce\5~@\2\u00ca\u00cb\5~@\2\u00cb\u00cc\7\60\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\t\3\2\2\u00d0\25\3\2\2\2\u00d1\u00d3\5\30\r\2\u00d2\u00d4"+
		"\5~@\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\5\32\16\2\u00d6\27\3\2\2\2\u00d7\u00df\5~@\2\u00d8\u00d9\5~@\2"+
		"\u00d9\u00da\7 \2\2\u00da\u00df\3\2\2\2\u00db\u00dc\5~@\2\u00dc\u00dd"+
		"\7\"\2\2\u00dd\u00df\3\2\2\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e7\7)\2\2"+
		"\u00e2\u00e3\7(\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\7)\2\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7\33\3\2\2\2\u00e8"+
		"\u00ed\5v<\2\u00e9\u00ea\7#\2\2\u00ea\u00ec\5\34\17\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\5|?\2"+
		"\u00f2\u00f3\7\36\2\2\u00f3\37\3\2\2\2\u00f4\u00f6\5\"\22\2\u00f5\u00f7"+
		"\5$\23\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00fa\5(\25\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa!\3\2\2\2"+
		"\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe\5,\27\2\u00fe#\3"+
		"\2\2\2\u00ff\u0103\5&\24\2\u0100\u0102\5$\23\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104%\3\2\2\2"+
		"\u0105\u0103\3\2\2\2\u0106\u0107\7\6\2\2\u0107\u0108\5*\26\2\u0108\u0109"+
		"\5,\27\2\u0109\'\3\2\2\2\u010a\u010b\7\7\2\2\u010b\u010c\5,\27\2\u010c"+
		")\3\2\2\2\u010d\u010e\5|?\2\u010e+\3\2\2\2\u010f\u0110\5p9\2\u0110-\3"+
		"\2\2\2\u0111\u0115\7\b\2\2\u0112\u0116\5\66\34\2\u0113\u0116\5\64\33\2"+
		"\u0114\u0116\5\62\32\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\5\60\31\2\u0118/\3\2\2\2\u0119"+
		"\u011a\5p9\2\u011a\61\3\2\2\2\u011b\u011d\7(\2\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\5<\37\2\u011f\u0120\58"+
		"\35\2\u0120\u0121\5> \2\u0121\u0122\5:\36\2\u0122\u0124\5@!\2\u0123\u0125"+
		"\7)\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\63\3\2\2\2\u0126"+
		"\u0127\5> \2\u0127\65\3\2\2\2\u0128\u0129\7(\2\2\u0129\u012c\7)\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u012a\3\2\2\2\u012c\67\3\2\2"+
		"\2\u012d\u012e\7\36\2\2\u012e9\3\2\2\2\u012f\u0130\7\36\2\2\u0130;\3\2"+
		"\2\2\u0131\u0132\7\4\2\2\u0132\u0135\5\22\n\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0134\u0133\3\2\2\2\u0135=\3\2\2\2\u0136\u0139\5|?\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139?\3\2\2\2"+
		"\u013a\u013d\5B\"\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013dA\3\2\2\2\u013e\u0143\5|?\2\u013f\u0140\7#\2\2\u0140\u0142"+
		"\5|?\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144C\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\26\2\2"+
		"\u0147\u0148\7\36\2\2\u0148E\3\2\2\2\u0149\u014a\7\27\2\2\u014a\u014b"+
		"\7\36\2\2\u014bG\3\2\2\2\u014c\u014e\5J&\2\u014d\u014f\5L\'\2\u014e\u014d"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014fI\3\2\2\2\u0150\u0151\7\32\2\2\u0151"+
		"\u0152\5N(\2\u0152K\3\2\2\2\u0153\u0155\7\33\2\2\u0154\u0156\7(\2\2\u0155"+
		"\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\5~"+
		"@\2\u0158\u015a\7)\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\5N(\2\u015cM\3\2\2\2\u015d\u015e\5p9\2\u015eO\3\2"+
		"\2\2\u015f\u0160\7(\2\2\u0160\u0162\7\n\2\2\u0161\u0163\5~@\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7(\2\2\u0165"+
		"\u0167\5T+\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u016e\7)\2\2\u0169\u016c\7\34\2\2\u016a\u016d\5\u0080A\2\u016b"+
		"\u016d\7\60\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u016f\3"+
		"\2\2\2\u016e\u0169\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0171\5X-\2\u0171\u0172\7)\2\2\u0172\u0174\7(\2\2\u0173\u0175\5V,\2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7)"+
		"\2\2\u0177\u0178\7\36\2\2\u0178\u018e\3\2\2\2\u0179\u017b\7\n\2\2\u017a"+
		"\u017c\5~@\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2"+
		"\2\u017d\u017f\7(\2\2\u017e\u0180\5T+\2\u017f\u017e\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0187\7)\2\2\u0182\u0185\7\34\2\2\u0183"+
		"\u0186\5\u0080A\2\u0184\u0186\7\60\2\2\u0185\u0183\3\2\2\2\u0185\u0184"+
		"\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u018b\3\2\2\2\u0189\u018c\5X-\2\u018a\u018c\7\36\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018a\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u015f\3\2\2\2\u018d"+
		"\u0179\3\2\2\2\u018eQ\3\2\2\2\u018f\u0190\7(\2\2\u0190\u0192\7\n\2\2\u0191"+
		"\u0193\5~@\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2"+
		"\2\u0194\u0196\7(\2\2\u0195\u0197\5T+\2\u0196\u0195\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019e\7)\2\2\u0199\u019c\7\34\2\2\u019a"+
		"\u019d\5\u0080A\2\u019b\u019d\7\60\2\2\u019c\u019a\3\2\2\2\u019c\u019b"+
		"\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u0199\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\5X-\2\u01a1\u01a2\7)\2\2\u01a2\u01a4\7(\2\2"+
		"\u01a3\u01a5\5V,\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6\u01a7\7)\2\2\u01a7\u01ba\3\2\2\2\u01a8\u01aa\7\n\2\2\u01a9"+
		"\u01ab\5~@\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01ae\7(\2\2\u01ad\u01af\5T+\2\u01ae\u01ad\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b6\7)\2\2\u01b1\u01b4\7\34\2\2\u01b2"+
		"\u01b5\5\u0080A\2\u01b3\u01b5\7\60\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3"+
		"\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01ba\5X-\2\u01b9\u018f\3\2\2\2\u01b9\u01a8\3\2\2"+
		"\2\u01baS\3\2\2\2\u01bb\u01bc\7.\2\2\u01bc\u01bf\7\60\2\2\u01bd\u01be"+
		"\7#\2\2\u01be\u01c0\5T+\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"U\3\2\2\2\u01c1\u01c2\5|?\2\u01c2W\3\2\2\2\u01c3\u01c4\5t;\2\u01c4Y\3"+
		"\2\2\2\u01c5\u01c6\7\20\2\2\u01c6\u01c9\5~@\2\u01c7\u01c8\7\22\2\2\u01c8"+
		"\u01ca\5\u0080A\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\5\\/\2\u01cc[\3\2\2\2\u01cd\u01ce\5t;\2\u01ce]\3"+
		"\2\2\2\u01cf\u01d0\7\21\2\2\u01d0\u01d3\5~@\2\u01d1\u01d2\7\22\2\2\u01d2"+
		"\u01d4\5\u0080A\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\5`\61\2\u01d6_\3\2\2\2\u01d7\u01d8\5t;\2\u01d8a\3"+
		"\2\2\2\u01d9\u01db\7\23\2\2\u01da\u01dc\5~@\2\u01db\u01da\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01de\7\22\2\2\u01de\u01e0\5"+
		"\u0080A\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2\2\2"+
		"\u01e1\u01e2\7\24\2\2\u01e2\u01e4\5\u0082B\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\5d\63\2\u01e6c\3\2\2\2"+
		"\u01e7\u01e8\5t;\2\u01e8e\3\2\2\2\u01e9\u01ec\5h\65\2\u01ea\u01ec\5l\67"+
		"\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecg\3\2\2\2\u01ed\u01ee"+
		"\7$\2\2\u01ee\u01ef\5j\66\2\u01ef\u01f0\7%\2\2\u01f0i\3\2\2\2\u01f1\u01f6"+
		"\5|?\2\u01f2\u01f3\7#\2\2\u01f3\u01f5\5j\66\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7k\3\2\2\2"+
		"\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7&\2\2\u01fa\u01fb\5n8\2\u01fb\u01fc"+
		"\7\'\2\2\u01fcm\3\2\2\2\u01fd\u01fe\5~@\2\u01fe\u01ff\7!\2\2\u01ff\u0204"+
		"\5|?\2\u0200\u0201\7#\2\2\u0201\u0203\5n8\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205o\3\2\2\2"+
		"\u0206\u0204\3\2\2\2\u0207\u0208\7&\2\2\u0208\u020f\7\'\2\2\u0209\u020a"+
		"\7&\2\2\u020a\u020b\5\4\3\2\u020b\u020c\7\'\2\2\u020c\u020f\3\2\2\2\u020d"+
		"\u020f\5r:\2\u020e\u0207\3\2\2\2\u020e\u0209\3\2\2\2\u020e\u020d\3\2\2"+
		"\2\u020fq\3\2\2\2\u0210\u0211\5\26\f\2\u0211\u0212\7\36\2\2\u0212\u021a"+
		"\3\2\2\2\u0213\u021a\5\36\20\2\u0214\u021a\5 \21\2\u0215\u021a\5.\30\2"+
		"\u0216\u021a\5H%\2\u0217\u021a\5D#\2\u0218\u021a\5F$\2\u0219\u0210\3\2"+
		"\2\2\u0219\u0213\3\2\2\2\u0219\u0214\3\2\2\2\u0219\u0215\3\2\2\2\u0219"+
		"\u0216\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021as\3\2\2\2"+
		"\u021b\u021c\7&\2\2\u021c\u0222\7\'\2\2\u021d\u021e\7&\2\2\u021e\u021f"+
		"\5\4\3\2\u021f\u0220\7\'\2\2\u0220\u0222\3\2\2\2\u0221\u021b\3\2\2\2\u0221"+
		"\u021d\3\2\2\2\u0222u\3\2\2\2\u0223\u0225\7,\2\2\u0224\u0223\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0228\5\u0084C\2\u0227\u0226"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\5~@\2\u022a"+
		"\u022c\5\u0086D\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e"+
		"\3\2\2\2\u022d\u022f\7\60\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2"+
		"\u022f\u0231\3\2\2\2\u0230\u0232\7*\2\2\u0231\u0230\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0235\7+\2\2\u0234\u0233\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u025e\3\2\2\2\u0236\u0238\7,\2\2\u0237\u0236\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\7\62\2\2\u023a"+
		"\u023c\7\60\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3"+
		"\2\2\2\u023d\u023f\7*\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0241\3\2\2\2\u0240\u0242\7+\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u025e\3\2\2\2\u0243\u0245\7,\2\2\u0244\u0243\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\7\63\2\2\u0247\u0249\7"+
		"\60\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a"+
		"\u024c\7*\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2"+
		"\2\2\u024d\u024f\7+\2\2\u024e\u024d\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u025e\3\2\2\2\u0250\u0252\7,\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253\u0255\7\64\2\2\u0254\u0256\7\60\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\7*"+
		"\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a"+
		"\u025c\7+\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2"+
		"\2\2\u025d\u0224\3\2\2\2\u025d\u0237\3\2\2\2\u025d\u0244\3\2\2\2\u025d"+
		"\u0251\3\2\2\2\u025e\u02a4\3\2\2\2\u025f\u0261\7,\2\2\u0260\u025f\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\5\26\f\2\u0263"+
		"\u0265\7\60\2\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3"+
		"\2\2\2\u0266\u0268\7*\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026a\3\2\2\2\u0269\u026b\7+\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u02a4\3\2\2\2\u026c\u026e\7,\2\2\u026d\u026c\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7(\2\2\u0270\u0271\5P)"+
		"\2\u0271\u0273\7)\2\2\u0272\u0274\7\60\2\2\u0273\u0272\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0276\3\2\2\2\u0275\u0277\7*\2\2\u0276\u0275\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u027a\7+\2\2\u0279\u0278\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u02a4\3\2\2\2\u027b\u027d\7,\2\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\5\u0084"+
		"C\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0283\5f\64\2\u0282\u0284\5\u0086D\2\u0283\u0282\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0287\7\60\2\2\u0286\u0285\3\2\2\2"+
		"\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u028a\7*\2\2\u0289\u0288"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u028d\7+\2\2\u028c"+
		"\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u02a4\3\2\2\2\u028e\u02a4\5R"+
		"*\2\u028f\u02a4\5b\62\2\u0290\u0291\7&\2\2\u0291\u0295\7\'\2\2\u0292\u0293"+
		"\7$\2\2\u0293\u0295\7%\2\2\u0294\u0290\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u02a4\3\2\2\2\u0296\u0298\7,\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\3\2\2\2\u0299\u029b\5x=\2\u029a\u029c\7\60\2\2\u029b"+
		"\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d\u029f\7*"+
		"\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0"+
		"\u02a2\7+\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2"+
		"\2\2\u02a3\u025d\3\2\2\2\u02a3\u0260\3\2\2\2\u02a3\u026d\3\2\2\2\u02a3"+
		"\u027c\3\2\2\2\u02a3\u028e\3\2\2\2\u02a3\u028f\3\2\2\2\u02a3\u0294\3\2"+
		"\2\2\u02a3\u0297\3\2\2\2\u02a4w\3\2\2\2\u02a5\u02a6\7(\2\2\u02a6\u02a7"+
		"\5z>\2\u02a7\u02a8\7)\2\2\u02a8y\3\2\2\2\u02a9\u02ad\5v<\2\u02aa\u02ac"+
		"\5z>\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae{\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b4\5v<\2\u02b1"+
		"\u02b3\5|?\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2"+
		"\2\u02b4\u02b5\3\2\2\2\u02b5}\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b8"+
		"\7.\2\2\u02b8\177\3\2\2\2\u02b9\u02ba\7.\2\2\u02ba\u0081\3\2\2\2\u02bb"+
		"\u02bc\7.\2\2\u02bc\u0083\3\2\2\2\u02bd\u02be\7-\2\2\u02be\u0085\3\2\2"+
		"\2\u02bf\u02c0\7-\2\2\u02c0\u0087\3\2\2\2\u02c1\u02c2\t\4\2\2\u02c2\u0089"+
		"\3\2\2\2e\u0092\u00a2\u00aa\u00b5\u00bf\u00c6\u00cd\u00d3\u00de\u00e6"+
		"\u00ed\u00f6\u00f9\u0103\u0115\u011c\u0124\u012b\u0134\u0138\u013c\u0143"+
		"\u014e\u0155\u0159\u0162\u0166\u016c\u016e\u0174\u017b\u017f\u0185\u0187"+
		"\u018b\u018d\u0192\u0196\u019c\u019e\u01a4\u01aa\u01ae\u01b4\u01b6\u01b9"+
		"\u01bf\u01c9\u01d3\u01db\u01df\u01e3\u01eb\u01f6\u0204\u020e\u0219\u0221"+
		"\u0224\u0227\u022b\u022e\u0231\u0234\u0237\u023b\u023e\u0241\u0244\u0248"+
		"\u024b\u024e\u0251\u0255\u0258\u025b\u025d\u0260\u0264\u0267\u026a\u026d"+
		"\u0273\u0276\u0279\u027c\u027f\u0283\u0286\u0289\u028c\u0294\u0297\u029b"+
		"\u029e\u02a1\u02a3\u02ad\u02b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}