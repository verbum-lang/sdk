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
		TwoTwoPoint=32, PointPoint=33, Separator=34, OpenArIndex=35, CloseArIndex=36, 
		OpenBlock=37, CloseBlock=38, OpenOp=39, CloseOp=40, ArithmeticOperator=41, 
		AssignmentOperator=42, Not=43, IncDecOperators=44, Identifier=45, IDPrefix=46, 
		TypeSpec=47, Words=48, Integer=49, Float=50, String=51, BlockComment=52, 
		LineComment=53, Whitespace=54, Newline=55;
	public static final int
		RULE_main = 0, RULE_sentences = 1, RULE_statements = 2, RULE_blockCode = 3, 
		RULE_blockUse = 4, RULE_useValue = 5, RULE_useString = 6, RULE_blockVariable = 7, 
		RULE_variableItem = 8, RULE_variablePrefixModes = 9, RULE_blockAttribution = 10, 
		RULE_attributionElements = 11, RULE_blockMultipleAssignments = 12, RULE_variableMultipleAssignmentsModes = 13, 
		RULE_functionCall = 14, RULE_functionCallFlowControl = 15, RULE_functionCallParam = 16, 
		RULE_functionCallParamElements = 17, RULE_blockRet = 18, RULE_blockConditional = 19, 
		RULE_ifElementUnique = 20, RULE_elifElements = 21, RULE_elifElementUnique = 22, 
		RULE_elseElementUnique = 23, RULE_conditionalBlockExpression = 24, RULE_conditionalBlockElements = 25, 
		RULE_blockLoop = 26, RULE_loopBlockElements = 27, RULE_loopComplete = 28, 
		RULE_loopConditional = 29, RULE_loopInfinite = 30, RULE_endOne = 31, RULE_endTwo = 32, 
		RULE_loopOneMembers = 33, RULE_loopTwoMembers = 34, RULE_loopThreeMembers = 35, 
		RULE_loopThreeMembersValues = 36, RULE_blockBreak = 37, RULE_blockNext = 38, 
		RULE_blockTryCatch = 39, RULE_tryUniqueElement = 40, RULE_catchUniqueElement = 41, 
		RULE_tryCatchElements = 42, RULE_blockFunction = 43, RULE_blockFunctionDeclarationAttr = 44, 
		RULE_functionParam = 45, RULE_functionAnonymousParamElements = 46, RULE_functionAnonymousParam = 47, 
		RULE_functionCodeBlock = 48, RULE_blockInterface = 49, RULE_interfaceCodeBlock = 50, 
		RULE_blockAbstraction = 51, RULE_abstractionCodeBlock = 52, RULE_blockClass = 53, 
		RULE_blockClassDeclarationAttr = 54, RULE_classAnonymousParam = 55, RULE_classCodeBlock = 56, 
		RULE_blockArray = 57, RULE_indexArray = 58, RULE_indexArrayElements = 59, 
		RULE_associativeArray = 60, RULE_associativeArrayElements = 61, RULE_blockLambdaFunctions = 62, 
		RULE_lambdaFnParams = 63, RULE_lambdaFnCodeBlock = 64, RULE_blockClassConstructor = 65, 
		RULE_blockFunctionCall = 66, RULE_functionCallElements = 67, RULE_blockCascadingMethod = 68, 
		RULE_blockCascadingMethodAttr = 69, RULE_blockAnonymousObject = 70, RULE_blockAnonymousObjectAttr = 71, 
		RULE_blockAccessArrayElements = 72, RULE_arrayAccessElements = 73, RULE_arrayAccessElementsItems = 74, 
		RULE_accessBlockAr = 75, RULE_arrayIndexAccess = 76, RULE_firstIncDec = 77, 
		RULE_lastIncDec = 78, RULE_blockPermissionTokens = 79, RULE_codeBlockFlowControl = 80, 
		RULE_codeBlockFlowControlElements = 81, RULE_codeBlockControl = 82, RULE_generalValue = 83, 
		RULE_generalValueBlock = 84, RULE_generalValueItems = 85, RULE_generalValueElements = 86, 
		RULE_identifier = 87, RULE_identifierB = 88, RULE_identifierC = 89, RULE_identifierD = 90, 
		RULE_incDecOperatorsA = 91, RULE_incDecOperatorsB = 92, RULE_openOpA = 93, 
		RULE_closeOpA = 94;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
			"useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"blockAttribution", "attributionElements", "blockMultipleAssignments", 
			"variableMultipleAssignmentsModes", "functionCall", "functionCallFlowControl", 
			"functionCallParam", "functionCallParamElements", "blockRet", "blockConditional", 
			"ifElementUnique", "elifElements", "elifElementUnique", "elseElementUnique", 
			"conditionalBlockExpression", "conditionalBlockElements", "blockLoop", 
			"loopBlockElements", "loopComplete", "loopConditional", "loopInfinite", 
			"endOne", "endTwo", "loopOneMembers", "loopTwoMembers", "loopThreeMembers", 
			"loopThreeMembersValues", "blockBreak", "blockNext", "blockTryCatch", 
			"tryUniqueElement", "catchUniqueElement", "tryCatchElements", "blockFunction", 
			"blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParamElements", 
			"functionAnonymousParam", "functionCodeBlock", "blockInterface", "interfaceCodeBlock", 
			"blockAbstraction", "abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", 
			"classAnonymousParam", "classCodeBlock", "blockArray", "indexArray", 
			"indexArrayElements", "associativeArray", "associativeArrayElements", 
			"blockLambdaFunctions", "lambdaFnParams", "lambdaFnCodeBlock", "blockClassConstructor", 
			"blockFunctionCall", "functionCallElements", "blockCascadingMethod", 
			"blockCascadingMethodAttr", "blockAnonymousObject", "blockAnonymousObjectAttr", 
			"blockAccessArrayElements", "arrayAccessElements", "arrayAccessElementsItems", 
			"accessBlockAr", "arrayIndexAccess", "firstIncDec", "lastIncDec", "blockPermissionTokens", 
			"codeBlockFlowControl", "codeBlockFlowControlElements", "codeBlockControl", 
			"generalValue", "generalValueBlock", "generalValueItems", "generalValueElements", 
			"identifier", "identifierB", "identifierC", "identifierD", "incDecOperatorsA", 
			"incDecOperatorsB", "openOpA", "closeOpA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'async'", "'await'", "'try'", "'catch'", "'->'", "'=>'", "';'", 
			"'='", "'.'", "':'", "'::'", "'..'", "','", "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "Async", "Await", "Try", 
			"Catch", "ArrowRight", "ARightLB", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "PointPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "Words", "Integer", "Float", "String", "BlockComment", "LineComment", 
			"Whitespace", "Newline"
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
			setState(190);
			sentences();
			setState(191);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				statements();
				setState(195);
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
		public BlockFunctionCallContext blockFunctionCall() {
			return getRuleContext(BlockFunctionCallContext.class,0);
		}
		public BlockClassConstructorContext blockClassConstructor() {
			return getRuleContext(BlockClassConstructorContext.class,0);
		}
		public BlockAttributionContext blockAttribution() {
			return getRuleContext(BlockAttributionContext.class,0);
		}
		public BlockMultipleAssignmentsContext blockMultipleAssignments() {
			return getRuleContext(BlockMultipleAssignmentsContext.class,0);
		}
		public BlockPermissionTokensContext blockPermissionTokens() {
			return getRuleContext(BlockPermissionTokensContext.class,0);
		}
		public BlockAnonymousObjectContext blockAnonymousObject() {
			return getRuleContext(BlockAnonymousObjectContext.class,0);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(210);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(212);
				blockFunctionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(213);
				blockClassConstructor();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				blockAttribution();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				blockMultipleAssignments();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				blockPermissionTokens();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				blockAnonymousObject();
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(220);
				match(OpenBlock);
				setState(221);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(222);
				match(OpenBlock);
				setState(223);
				sentences();
				setState(224);
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
			setState(228);
			match(Use);
			setState(229);
			useValue();
			setState(230);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				useString();
				setState(234);
				match(Separator);
				setState(235);
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
			setState(239);
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
			setState(241);
			match(Var);
			setState(242);
			variableItem();
			setState(243);
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
			setState(245);
			variablePrefixModes();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(246);
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

			setState(249);
			generalValueElements();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(Separator);
					setState(251);
					variableItem();
					}
					} 
				}
				setState(256);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(257);
				identifier();
				}
				break;
			case 2:
				{
				setState(258);
				identifier();
				setState(259);
				match(TypeSpec);
				}
				break;
			}
			setState(263);
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

	public static class BlockAttributionContext extends ParserRuleContext {
		public AttributionElementsContext attributionElements() {
			return getRuleContext(AttributionElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockAttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAttribution; }
	}

	public final BlockAttributionContext blockAttribution() throws RecognitionException {
		BlockAttributionContext _localctx = new BlockAttributionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockAttribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			attributionElements();
			setState(266);
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

	public static class AttributionElementsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<AttributionElementsContext> attributionElements() {
			return getRuleContexts(AttributionElementsContext.class);
		}
		public AttributionElementsContext attributionElements(int i) {
			return getRuleContext(AttributionElementsContext.class,i);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public TerminalNode Await() { return getToken(TParser.Await, 0); }
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public AttributionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionElements; }
	}

	public final AttributionElementsContext attributionElements() throws RecognitionException {
		AttributionElementsContext _localctx = new AttributionElementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributionElements);
		int _la;
		try {
			int _alt;
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				identifier();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(269);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(270);
					identifierB();
					}
				}

				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(273);
					match(TypeSpec);
					}
				}

				setState(276);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New || _la==Await) {
					{
					setState(277);
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

				setState(280);
				generalValueElements();
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						match(Separator);
						setState(282);
						attributionElements();
						}
						} 
					}
					setState(287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				generalValue();
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(289);
					match(TypeSpec);
					}
				}

				setState(292);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New || _la==Await) {
					{
					setState(293);
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

				setState(296);
				generalValueElements();
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						match(Separator);
						setState(298);
						attributionElements();
						}
						} 
					}
					setState(303);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class BlockMultipleAssignmentsContext extends ParserRuleContext {
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,0);
		}
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockMultipleAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockMultipleAssignments; }
	}

	public final BlockMultipleAssignmentsContext blockMultipleAssignments() throws RecognitionException {
		BlockMultipleAssignmentsContext _localctx = new BlockMultipleAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blockMultipleAssignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			variableMultipleAssignmentsModes();
			setState(307);
			match(Attr);
			setState(308);
			generalValueElements();
			setState(309);
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

	public static class VariableMultipleAssignmentsModesContext extends ParserRuleContext {
		public GeneralValueContext generalValue() {
			return getRuleContext(GeneralValueContext.class,0);
		}
		public List<TerminalNode> Attr() { return getTokens(TParser.Attr); }
		public TerminalNode Attr(int i) {
			return getToken(TParser.Attr, i);
		}
		public List<VariableMultipleAssignmentsModesContext> variableMultipleAssignmentsModes() {
			return getRuleContexts(VariableMultipleAssignmentsModesContext.class);
		}
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes(int i) {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,i);
		}
		public VariableMultipleAssignmentsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignmentsModes; }
	}

	public final VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() throws RecognitionException {
		VariableMultipleAssignmentsModesContext _localctx = new VariableMultipleAssignmentsModesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableMultipleAssignmentsModes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			generalValue();
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(Attr);
					setState(313);
					variableMultipleAssignmentsModes();
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public FunctionCallElementsContext functionCallElements() {
			return getRuleContext(FunctionCallElementsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				identifier();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(320);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(321);
					identifierB();
					}
				}

				setState(324);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				blockAccessArrayElements();
				setState(327);
				match(OpenOp);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(328);
					functionCallElements();
					}
				}

				setState(331);
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

	public static class FunctionCallFlowControlContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallParamContext functionCallParam() {
			return getRuleContext(FunctionCallParamContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FunctionCallFlowControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallFlowControl; }
	}

	public final FunctionCallFlowControlContext functionCallFlowControl() throws RecognitionException {
		FunctionCallFlowControlContext _localctx = new FunctionCallFlowControlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCallFlowControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			identifier();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(336);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				identifierB();
				}
			}

			setState(340);
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
		enterRule(_localctx, 32, RULE_functionCallParam);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(OpenOp);
				setState(343);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(OpenOp);
				setState(345);
				functionCallParamElements();
				setState(346);
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
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
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
		enterRule(_localctx, 34, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			generalValueElements();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(351);
					match(Separator);
					setState(352);
					functionCallParamElements();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 36, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(Ret);
			setState(359);
			generalValueElements();
			setState(360);
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
		enterRule(_localctx, 38, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			ifElementUnique();
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(363);
				elifElements();
				}
				break;
			}
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(366);
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
		enterRule(_localctx, 40, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(If);
			setState(370);
			conditionalBlockExpression();
			setState(371);
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
		enterRule(_localctx, 42, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			elifElementUnique();
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					elifElements();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 44, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(Elif);
			setState(381);
			conditionalBlockExpression();
			setState(382);
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
		enterRule(_localctx, 46, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(Else);
			setState(385);
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
		enterRule(_localctx, 48, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 50, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 52, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(For);
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(392);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(393);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(394);
				loopComplete();
				}
				break;
			}
			setState(397);
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
		enterRule(_localctx, 54, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 56, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(401);
				match(OpenOp);
				}
			}

			setState(404);
			loopOneMembers();
			setState(405);
			endOne();
			setState(406);
			loopTwoMembers();
			setState(407);
			endTwo();
			setState(408);
			loopThreeMembers();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(409);
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
		enterRule(_localctx, 58, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 60, RULE_loopInfinite);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(OpenOp);
				setState(415);
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
		enterRule(_localctx, 62, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 64, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
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
		enterRule(_localctx, 66, RULE_loopOneMembers);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(Var);
				setState(424);
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
		enterRule(_localctx, 68, RULE_loopTwoMembers);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
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
		enterRule(_localctx, 70, RULE_loopThreeMembers);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
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
		enterRule(_localctx, 72, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			generalValueElements();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(437);
				match(Separator);
				setState(438);
				generalValueElements();
				}
				}
				setState(443);
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
		enterRule(_localctx, 74, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(Break);
			setState(445);
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
		enterRule(_localctx, 76, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(Next);
			setState(448);
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
		enterRule(_localctx, 78, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			tryUniqueElement();
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(451);
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
		enterRule(_localctx, 80, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(Try);
			setState(455);
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
		enterRule(_localctx, 82, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(Catch);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(458);
				match(OpenOp);
				}
			}

			setState(461);
			identifier();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(462);
				match(CloseOp);
				}
			}

			setState(465);
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
		enterRule(_localctx, 84, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
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
		public OpenOpAContext openOpA() {
			return getRuleContext(OpenOpAContext.class,0);
		}
		public CloseOpAContext closeOpA() {
			return getRuleContext(CloseOpAContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public FunctionAnonymousParamElementsContext functionAnonymousParamElements() {
			return getRuleContext(FunctionAnonymousParamElementsContext.class,0);
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
		enterRule(_localctx, 86, RULE_blockFunction);
		int _la;
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(OpenOp);
				setState(470);
				match(Function);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(471);
					identifier();
					}
				}

				setState(474);
				match(OpenOp);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(475);
					functionParam();
					}
				}

				setState(478);
				match(CloseOp);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(479);
					match(ArrowRight);
					setState(482);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(480);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(481);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(486);
				functionCodeBlock();
				setState(487);
				match(CloseOp);
				setState(488);
				openOpA();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(489);
					functionAnonymousParamElements();
					}
				}

				setState(492);
				closeOpA();
				setState(493);
				match(End);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(Function);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(496);
					identifier();
					}
				}

				setState(499);
				match(OpenOp);
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(500);
					functionParam();
					}
				}

				setState(503);
				match(CloseOp);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(504);
					match(ArrowRight);
					setState(507);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(505);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(506);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(513);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(511);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(512);
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
		public OpenOpAContext openOpA() {
			return getRuleContext(OpenOpAContext.class,0);
		}
		public CloseOpAContext closeOpA() {
			return getRuleContext(CloseOpAContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public TerminalNode ArrowRight() { return getToken(TParser.ArrowRight, 0); }
		public FunctionAnonymousParamElementsContext functionAnonymousParamElements() {
			return getRuleContext(FunctionAnonymousParamElementsContext.class,0);
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
		enterRule(_localctx, 88, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				match(OpenOp);
				setState(518);
				match(Function);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(519);
					identifier();
					}
				}

				setState(522);
				match(OpenOp);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(523);
					functionParam();
					}
				}

				setState(526);
				match(CloseOp);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(527);
					match(ArrowRight);
					setState(530);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(528);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(529);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(534);
				functionCodeBlock();
				setState(535);
				match(CloseOp);
				setState(536);
				openOpA();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(537);
					functionAnonymousParamElements();
					}
				}

				setState(540);
				closeOpA();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(Function);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(543);
					identifier();
					}
				}

				setState(546);
				match(OpenOp);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(547);
					functionParam();
					}
				}

				setState(550);
				match(CloseOp);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(551);
					match(ArrowRight);
					setState(554);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(552);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(553);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(558);
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
		enterRule(_localctx, 90, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(Identifier);
			setState(562);
			match(TypeSpec);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(563);
				match(Separator);
				setState(564);
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

	public static class FunctionAnonymousParamElementsContext extends ParserRuleContext {
		public List<FunctionAnonymousParamContext> functionAnonymousParam() {
			return getRuleContexts(FunctionAnonymousParamContext.class);
		}
		public FunctionAnonymousParamContext functionAnonymousParam(int i) {
			return getRuleContext(FunctionAnonymousParamContext.class,i);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public FunctionAnonymousParamElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAnonymousParamElements; }
	}

	public final FunctionAnonymousParamElementsContext functionAnonymousParamElements() throws RecognitionException {
		FunctionAnonymousParamElementsContext _localctx = new FunctionAnonymousParamElementsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionAnonymousParamElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			functionAnonymousParam();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(568);
				match(Separator);
				setState(569);
				functionAnonymousParam();
				}
				}
				setState(574);
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
		enterRule(_localctx, 94, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
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
		enterRule(_localctx, 96, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
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
		enterRule(_localctx, 98, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(Interface);
			setState(580);
			identifier();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(581);
				match(Extends);
				setState(582);
				identifierB();
				}
			}

			setState(585);
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
		enterRule(_localctx, 100, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		enterRule(_localctx, 102, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(Abstract);
			setState(590);
			identifier();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(591);
				match(Extends);
				setState(592);
				identifierB();
				}
			}

			setState(595);
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
		enterRule(_localctx, 104, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
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
		public TerminalNode End() { return getToken(TParser.End, 0); }
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
		enterRule(_localctx, 106, RULE_blockClass);
		int _la;
		try {
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				openOpA();
				setState(600);
				match(New);
				setState(601);
				match(Class);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(602);
					identifier();
					}
				}

				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(605);
					match(Extends);
					setState(606);
					identifierB();
					}
				}

				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(609);
					match(Implements);
					setState(610);
					identifierC();
					}
				}

				setState(613);
				classCodeBlock();
				setState(614);
				closeOpA();
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(615);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(616);
					identifierD();
					setState(617);
					match(OpenOp);
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(618);
						generalValueElements();
						}
					}

					setState(621);
					match(CloseOp);
					}
				}

				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==End) {
					{
					setState(625);
					match(End);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(Class);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(629);
					identifier();
					}
				}

				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(632);
					match(Extends);
					setState(633);
					identifierB();
					}
				}

				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(636);
					match(Implements);
					setState(637);
					identifierC();
					}
				}

				setState(640);
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
		enterRule(_localctx, 108, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				openOpA();
				setState(644);
				match(New);
				setState(645);
				match(Class);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(646);
					identifier();
					}
				}

				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(649);
					match(Extends);
					setState(650);
					identifierB();
					}
				}

				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(653);
					match(Implements);
					setState(654);
					identifierC();
					}
				}

				setState(657);
				classCodeBlock();
				setState(658);
				closeOpA();
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(659);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(660);
					identifierD();
					setState(661);
					match(OpenOp);
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(662);
						generalValueElements();
						}
					}

					setState(665);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(Class);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(670);
					identifier();
					}
				}

				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(673);
					match(Extends);
					setState(674);
					identifierB();
					}
				}

				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(677);
					match(Implements);
					setState(678);
					identifierC();
					}
				}

				setState(681);
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
		enterRule(_localctx, 110, RULE_classAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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
		enterRule(_localctx, 112, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		enterRule(_localctx, 114, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(688);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(689);
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
		enterRule(_localctx, 116, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(OpenArIndex);
			setState(693);
			indexArrayElements();
			setState(694);
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
		enterRule(_localctx, 118, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			generalValueElements();
			setState(701);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(697);
					match(Separator);
					setState(698);
					indexArrayElements();
					}
					} 
				}
				setState(703);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 120, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(OpenBlock);
			setState(705);
			associativeArrayElements();
			setState(706);
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
		enterRule(_localctx, 122, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			identifier();
			setState(709);
			match(TwoPoint);
			setState(710);
			generalValueElements();
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(711);
					match(Separator);
					setState(712);
					associativeArrayElements();
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public BlockLambdaFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockLambdaFunctions; }
	}

	public final BlockLambdaFunctionsContext blockLambdaFunctions() throws RecognitionException {
		BlockLambdaFunctionsContext _localctx = new BlockLambdaFunctionsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(OpenOp);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(719);
				lambdaFnParams();
				}
			}

			setState(722);
			match(CloseOp);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(723);
				match(ArrowRight);
				setState(726);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(724);
					identifier();
					}
					break;
				case TypeSpec:
					{
					setState(725);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(730);
			match(ARightLB);
			setState(731);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			identifier();
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(734);
				match(TypeSpec);
				}
			}

			setState(741);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(737);
					match(Separator);
					setState(738);
					lambdaFnParams();
					}
					} 
				}
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 128, RULE_lambdaFnCodeBlock);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
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

	public static class BlockClassConstructorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public CodeBlockControlContext codeBlockControl() {
			return getRuleContext(CodeBlockControlContext.class,0);
		}
		public FunctionParamContext functionParam() {
			return getRuleContext(FunctionParamContext.class,0);
		}
		public BlockClassConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClassConstructor; }
	}

	public final BlockClassConstructorContext blockClassConstructor() throws RecognitionException {
		BlockClassConstructorContext _localctx = new BlockClassConstructorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockClassConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			identifier();
			setState(749);
			match(OpenOp);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(750);
				functionParam();
				}
			}

			setState(753);
			match(CloseOp);
			setState(754);
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

	public static class BlockFunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public FunctionCallElementsContext functionCallElements() {
			return getRuleContext(FunctionCallElementsContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public BlockFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunctionCall; }
	}

	public final BlockFunctionCallContext blockFunctionCall() throws RecognitionException {
		BlockFunctionCallContext _localctx = new BlockFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockFunctionCall);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				identifier();
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(757);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(758);
					identifierB();
					}
				}

				setState(761);
				match(OpenOp);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(762);
					functionCallElements();
					}
				}

				setState(765);
				match(CloseOp);
				setState(766);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				blockAccessArrayElements();
				setState(769);
				match(OpenOp);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(770);
					functionCallElements();
					}
				}

				setState(773);
				match(CloseOp);
				setState(774);
				match(End);
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

	public static class FunctionCallElementsContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(TParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(TParser.Separator, i);
		}
		public List<FunctionCallElementsContext> functionCallElements() {
			return getRuleContexts(FunctionCallElementsContext.class);
		}
		public FunctionCallElementsContext functionCallElements(int i) {
			return getRuleContext(FunctionCallElementsContext.class,i);
		}
		public FunctionCallElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallElements; }
	}

	public final FunctionCallElementsContext functionCallElements() throws RecognitionException {
		FunctionCallElementsContext _localctx = new FunctionCallElementsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_functionCallElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			generalValueElements();
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(779);
					match(Separator);
					setState(780);
					functionCallElements();
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
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

	public static class BlockCascadingMethodContext extends ParserRuleContext {
		public BlockCascadingMethodAttrContext blockCascadingMethodAttr() {
			return getRuleContext(BlockCascadingMethodAttrContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public BlockCascadingMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCascadingMethod; }
	}

	public final BlockCascadingMethodContext blockCascadingMethod() throws RecognitionException {
		BlockCascadingMethodContext _localctx = new BlockCascadingMethodContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockCascadingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			blockCascadingMethodAttr();
			setState(787);
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

	public static class BlockCascadingMethodAttrContext extends ParserRuleContext {
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public TerminalNode OpenOp() { return getToken(TParser.OpenOp, 0); }
		public TerminalNode CloseOp() { return getToken(TParser.CloseOp, 0); }
		public List<TerminalNode> PointPoint() { return getTokens(TParser.PointPoint); }
		public TerminalNode PointPoint(int i) {
			return getToken(TParser.PointPoint, i);
		}
		public List<BlockCascadingMethodAttrContext> blockCascadingMethodAttr() {
			return getRuleContexts(BlockCascadingMethodAttrContext.class);
		}
		public BlockCascadingMethodAttrContext blockCascadingMethodAttr(int i) {
			return getRuleContext(BlockCascadingMethodAttrContext.class,i);
		}
		public FunctionCallElementsContext functionCallElements() {
			return getRuleContext(FunctionCallElementsContext.class,0);
		}
		public BlockCascadingMethodAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCascadingMethodAttr; }
	}

	public final BlockCascadingMethodAttrContext blockCascadingMethodAttr() throws RecognitionException {
		BlockCascadingMethodAttrContext _localctx = new BlockCascadingMethodAttrContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_blockCascadingMethodAttr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			blockAccessArrayElements();
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(790);
				match(OpenOp);
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(791);
					functionCallElements();
					}
				}

				setState(794);
				match(CloseOp);
				}
			}

			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(797);
					match(PointPoint);
					setState(798);
					blockCascadingMethodAttr();
					}
					} 
				}
				setState(803);
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

	public static class BlockAnonymousObjectContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockAnonymousObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAnonymousObject; }
	}

	public final BlockAnonymousObjectContext blockAnonymousObject() throws RecognitionException {
		BlockAnonymousObjectContext _localctx = new BlockAnonymousObjectContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_blockAnonymousObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(804);
				match(OpenOp);
				}
			}

			setState(807);
			match(New);
			setState(808);
			identifier();
			setState(809);
			match(OpenOp);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(810);
				generalValueElements();
				}
			}

			setState(813);
			match(CloseOp);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(814);
				match(CloseOp);
				}
			}

			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(817);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(818);
				identifierB();
				setState(819);
				match(OpenOp);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(820);
					generalValueElements();
					}
				}

				setState(823);
				match(CloseOp);
				}
			}

			setState(827);
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

	public static class BlockAnonymousObjectAttrContext extends ParserRuleContext {
		public List<TerminalNode> OpenOp() { return getTokens(TParser.OpenOp); }
		public TerminalNode OpenOp(int i) {
			return getToken(TParser.OpenOp, i);
		}
		public TerminalNode New() { return getToken(TParser.New, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> CloseOp() { return getTokens(TParser.CloseOp); }
		public TerminalNode CloseOp(int i) {
			return getToken(TParser.CloseOp, i);
		}
		public List<GeneralValueElementsContext> generalValueElements() {
			return getRuleContexts(GeneralValueElementsContext.class);
		}
		public GeneralValueElementsContext generalValueElements(int i) {
			return getRuleContext(GeneralValueElementsContext.class,i);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public BlockAnonymousObjectAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAnonymousObjectAttr; }
	}

	public final BlockAnonymousObjectAttrContext blockAnonymousObjectAttr() throws RecognitionException {
		BlockAnonymousObjectAttrContext _localctx = new BlockAnonymousObjectAttrContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_blockAnonymousObjectAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(OpenOp);
			setState(830);
			match(New);
			setState(831);
			identifier();
			setState(832);
			match(OpenOp);
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(833);
				generalValueElements();
				}
			}

			setState(836);
			match(CloseOp);
			setState(837);
			match(CloseOp);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(838);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(839);
				identifierB();
				setState(840);
				match(OpenOp);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(841);
					generalValueElements();
					}
				}

				setState(844);
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

	public static class BlockAccessArrayElementsContext extends ParserRuleContext {
		public ArrayAccessElementsContext arrayAccessElements() {
			return getRuleContext(ArrayAccessElementsContext.class,0);
		}
		public BlockAccessArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAccessArrayElements; }
	}

	public final BlockAccessArrayElementsContext blockAccessArrayElements() throws RecognitionException {
		BlockAccessArrayElementsContext _localctx = new BlockAccessArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_blockAccessArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			arrayAccessElements();
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

	public static class ArrayAccessElementsContext extends ParserRuleContext {
		public ArrayAccessElementsItemsContext arrayAccessElementsItems() {
			return getRuleContext(ArrayAccessElementsItemsContext.class,0);
		}
		public List<ArrayAccessElementsContext> arrayAccessElements() {
			return getRuleContexts(ArrayAccessElementsContext.class);
		}
		public ArrayAccessElementsContext arrayAccessElements(int i) {
			return getRuleContext(ArrayAccessElementsContext.class,i);
		}
		public ArrayAccessElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElements; }
	}

	public final ArrayAccessElementsContext arrayAccessElements() throws RecognitionException {
		ArrayAccessElementsContext _localctx = new ArrayAccessElementsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_arrayAccessElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			arrayAccessElementsItems();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(851);
					arrayAccessElements();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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

	public static class ArrayAccessElementsItemsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public ArrayAccessElementsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElementsItems; }
	}

	public final ArrayAccessElementsItemsContext arrayAccessElementsItems() throws RecognitionException {
		ArrayAccessElementsItemsContext _localctx = new ArrayAccessElementsItemsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arrayAccessElementsItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IncDecOperators) {
				{
				setState(857);
				firstIncDec();
				}
			}

			setState(860);
			identifier();
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(861);
				accessBlockAr();
				}
				break;
			}
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(864);
				lastIncDec();
				}
				break;
			}
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(867);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class AccessBlockArContext extends ParserRuleContext {
		public TerminalNode OpenArIndex() { return getToken(TParser.OpenArIndex, 0); }
		public ArrayIndexAccessContext arrayIndexAccess() {
			return getRuleContext(ArrayIndexAccessContext.class,0);
		}
		public TerminalNode CloseArIndex() { return getToken(TParser.CloseArIndex, 0); }
		public List<AccessBlockArContext> accessBlockAr() {
			return getRuleContexts(AccessBlockArContext.class);
		}
		public AccessBlockArContext accessBlockAr(int i) {
			return getRuleContext(AccessBlockArContext.class,i);
		}
		public AccessBlockArContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessBlockAr; }
	}

	public final AccessBlockArContext accessBlockAr() throws RecognitionException {
		AccessBlockArContext _localctx = new AccessBlockArContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_accessBlockAr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(OpenArIndex);
			setState(871);
			arrayIndexAccess();
			setState(872);
			match(CloseArIndex);
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(873);
					accessBlockAr();
					}
					} 
				}
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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

	public static class ArrayIndexAccessContext extends ParserRuleContext {
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public ArrayIndexAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexAccess; }
	}

	public final ArrayIndexAccessContext arrayIndexAccess() throws RecognitionException {
		ArrayIndexAccessContext _localctx = new ArrayIndexAccessContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
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

	public static class FirstIncDecContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public FirstIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstIncDec; }
	}

	public final FirstIncDecContext firstIncDec() throws RecognitionException {
		FirstIncDecContext _localctx = new FirstIncDecContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
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

	public static class LastIncDecContext extends ParserRuleContext {
		public TerminalNode IncDecOperators() { return getToken(TParser.IncDecOperators, 0); }
		public LastIncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastIncDec; }
	}

	public final LastIncDecContext lastIncDec() throws RecognitionException {
		LastIncDecContext _localctx = new LastIncDecContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
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

	public static class BlockPermissionTokensContext extends ParserRuleContext {
		public TerminalNode Pub() { return getToken(TParser.Pub, 0); }
		public TerminalNode Pro() { return getToken(TParser.Pro, 0); }
		public TerminalNode Priv() { return getToken(TParser.Priv, 0); }
		public TerminalNode Static() { return getToken(TParser.Static, 0); }
		public TerminalNode Final() { return getToken(TParser.Final, 0); }
		public TerminalNode Async() { return getToken(TParser.Async, 0); }
		public BlockPermissionTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockPermissionTokens; }
	}

	public final BlockPermissionTokensContext blockPermissionTokens() throws RecognitionException {
		BlockPermissionTokensContext _localctx = new BlockPermissionTokensContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_blockPermissionTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Pub) | (1L << Pro) | (1L << Priv) | (1L << Static) | (1L << Final) | (1L << Async))) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_codeBlockFlowControl);
		try {
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				match(OpenBlock);
				setState(888);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				match(OpenBlock);
				setState(890);
				sentences();
				setState(891);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
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
		public FunctionCallFlowControlContext functionCallFlowControl() {
			return getRuleContext(FunctionCallFlowControlContext.class,0);
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
		enterRule(_localctx, 162, RULE_codeBlockFlowControlElements);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				functionCallFlowControl();
				setState(897);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(901);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(902);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(903);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(904);
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
		enterRule(_localctx, 164, RULE_codeBlockControl);
		try {
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(OpenBlock);
				setState(908);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(OpenBlock);
				setState(910);
				sentences();
				setState(911);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Not() { return getToken(TParser.Not, 0); }
		public TerminalNode TypeSpec() { return getToken(TParser.TypeSpec, 0); }
		public TerminalNode ArithmeticOperator() { return getToken(TParser.ArithmeticOperator, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierBContext identifierB() {
			return getRuleContext(IdentifierBContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode Integer() { return getToken(TParser.Integer, 0); }
		public TerminalNode Float() { return getToken(TParser.Float, 0); }
		public TerminalNode String() { return getToken(TParser.String, 0); }
		public IncDecOperatorsAContext incDecOperatorsA() {
			return getRuleContext(IncDecOperatorsAContext.class,0);
		}
		public IncDecOperatorsBContext incDecOperatorsB() {
			return getRuleContext(IncDecOperatorsBContext.class,0);
		}
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
		public BlockAccessArrayElementsContext blockAccessArrayElements() {
			return getRuleContext(BlockAccessArrayElementsContext.class,0);
		}
		public BlockAnonymousObjectAttrContext blockAnonymousObjectAttr() {
			return getRuleContext(BlockAnonymousObjectAttrContext.class,0);
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
		enterRule(_localctx, 166, RULE_generalValue);
		int _la;
		try {
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(915);
					match(Not);
					}
				}

				setState(918);
				functionCall();
				setState(920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(919);
					match(TypeSpec);
					}
					break;
				}
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(922);
					match(ArithmeticOperator);
					}
				}

				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(925);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(928);
					match(Not);
					}
				}

				setState(931);
				identifier();
				setState(932);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(933);
				identifierB();
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(934);
					match(TypeSpec);
					}
					break;
				}
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(937);
					match(Attr);
					}
					break;
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(940);
					match(ArithmeticOperator);
					}
				}

				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(943);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1007);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(946);
						match(Not);
						}
					}

					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(949);
						incDecOperatorsA();
						}
					}

					setState(952);
					identifier();
					setState(954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(953);
						incDecOperatorsB();
						}
						break;
					}
					setState(957);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(956);
						match(TypeSpec);
						}
						break;
					}
					setState(960);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(959);
						match(Attr);
						}
						break;
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(962);
						match(ArithmeticOperator);
						}
					}

					setState(966);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(965);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(969);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(968);
						match(Not);
						}
					}

					setState(971);
					match(Integer);
					setState(973);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						setState(972);
						match(TypeSpec);
						}
						break;
					}
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(975);
						match(ArithmeticOperator);
						}
					}

					setState(979);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
					case 1:
						{
						setState(978);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(981);
						match(Not);
						}
					}

					setState(984);
					match(Float);
					setState(986);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						setState(985);
						match(TypeSpec);
						}
						break;
					}
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(988);
						match(ArithmeticOperator);
						}
					}

					setState(992);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
					case 1:
						{
						setState(991);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(994);
						match(Not);
						}
					}

					setState(997);
					match(String);
					setState(999);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						setState(998);
						match(TypeSpec);
						}
						break;
					}
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(1001);
						match(ArithmeticOperator);
						}
					}

					setState(1005);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						setState(1004);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(1009);
					match(Not);
					}
				}

				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(1012);
					incDecOperatorsA();
					}
				}

				setState(1015);
				blockArray();
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1016);
					incDecOperatorsB();
					}
					break;
				}
				setState(1020);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1019);
					match(TypeSpec);
					}
					break;
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(1022);
					match(ArithmeticOperator);
					}
				}

				setState(1026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1025);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1028);
				blockFunctionDeclarationAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1029);
				blockClassDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1030);
				blockLambdaFunctions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(1031);
					match(Not);
					}
				}

				setState(1035);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1034);
					incDecOperatorsA();
					}
					break;
				}
				setState(1037);
				blockAccessArrayElements();
				setState(1039);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1038);
					incDecOperatorsB();
					}
					break;
				}
				setState(1042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1041);
					match(TypeSpec);
					}
					break;
				}
				setState(1045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1044);
					match(Attr);
					}
					break;
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(1047);
					match(ArithmeticOperator);
					}
				}

				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1050);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1053);
				blockAnonymousObjectAttr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1058);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(1054);
					match(OpenBlock);
					setState(1055);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(1056);
					match(OpenArIndex);
					setState(1057);
					match(CloseArIndex);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(1060);
					match(Not);
					}
				}

				setState(1063);
				generalValueBlock();
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1064);
					match(TypeSpec);
					}
					break;
				}
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(1067);
					match(ArithmeticOperator);
					}
				}

				setState(1071);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1070);
					match(AssignmentOperator);
					}
					break;
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
		enterRule(_localctx, 168, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(OpenOp);
			setState(1076);
			generalValueItems();
			setState(1077);
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
		enterRule(_localctx, 170, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			generalValue();
			setState(1083);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1080);
					generalValueItems();
					}
					} 
				}
				setState(1085);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,163,_ctx);
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
		enterRule(_localctx, 172, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			generalValue();
			setState(1090);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1087);
					generalValueElements();
					}
					} 
				}
				setState(1092);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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
		enterRule(_localctx, 174, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
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
		enterRule(_localctx, 176, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
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
		enterRule(_localctx, 178, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
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
		enterRule(_localctx, 180, RULE_identifierD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
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
		enterRule(_localctx, 182, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
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
		enterRule(_localctx, 184, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
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
		enterRule(_localctx, 186, RULE_openOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
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
		enterRule(_localctx, 188, RULE_closeOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0458\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c9\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00dd\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u00e5\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00f0\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00fa\n\n\3\n\3\n\3"+
		"\n\7\n\u00ff\n\n\f\n\16\n\u0102\13\n\3\13\3\13\3\13\3\13\5\13\u0108\n"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0112\n\r\3\r\5\r\u0115\n\r"+
		"\3\r\3\r\5\r\u0119\n\r\3\r\3\r\3\r\7\r\u011e\n\r\f\r\16\r\u0121\13\r\3"+
		"\r\3\r\5\r\u0125\n\r\3\r\3\r\5\r\u0129\n\r\3\r\3\r\3\r\7\r\u012e\n\r\f"+
		"\r\16\r\u0131\13\r\5\r\u0133\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\7\17\u013d\n\17\f\17\16\17\u0140\13\17\3\20\3\20\3\20\5\20\u0145\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u014c\n\20\3\20\3\20\5\20\u0150\n\20"+
		"\3\21\3\21\3\21\5\21\u0155\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u015f\n\22\3\23\3\23\3\23\7\23\u0164\n\23\f\23\16\23\u0167\13\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u016f\n\25\3\25\5\25\u0172\n\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\7\27\u017a\n\27\f\27\16\27\u017d\13\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\5\34\u018e\n\34\3\34\3\34\3\35\3\35\3\36\5\36\u0195\n\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u019d\n\36\3\37\3\37\3 \3 \3 \5 \u01a4\n \3"+
		"!\3!\3\"\3\"\3#\3#\3#\5#\u01ad\n#\3$\3$\5$\u01b1\n$\3%\3%\5%\u01b5\n%"+
		"\3&\3&\3&\7&\u01ba\n&\f&\16&\u01bd\13&\3\'\3\'\3\'\3(\3(\3(\3)\3)\5)\u01c7"+
		"\n)\3*\3*\3*\3+\3+\5+\u01ce\n+\3+\3+\5+\u01d2\n+\3+\3+\3,\3,\3-\3-\3-"+
		"\5-\u01db\n-\3-\3-\5-\u01df\n-\3-\3-\3-\3-\5-\u01e5\n-\5-\u01e7\n-\3-"+
		"\3-\3-\3-\5-\u01ed\n-\3-\3-\3-\3-\3-\5-\u01f4\n-\3-\3-\5-\u01f8\n-\3-"+
		"\3-\3-\3-\5-\u01fe\n-\5-\u0200\n-\3-\3-\5-\u0204\n-\5-\u0206\n-\3.\3."+
		"\3.\5.\u020b\n.\3.\3.\5.\u020f\n.\3.\3.\3.\3.\5.\u0215\n.\5.\u0217\n."+
		"\3.\3.\3.\3.\5.\u021d\n.\3.\3.\3.\3.\5.\u0223\n.\3.\3.\5.\u0227\n.\3."+
		"\3.\3.\3.\5.\u022d\n.\5.\u022f\n.\3.\5.\u0232\n.\3/\3/\3/\3/\5/\u0238"+
		"\n/\3\60\3\60\3\60\7\60\u023d\n\60\f\60\16\60\u0240\13\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\5\63\u024a\n\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\5\65\u0254\n\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\5\67\u025e\n\67\3\67\3\67\5\67\u0262\n\67\3\67\3\67\5\67\u0266\n\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\5\67\u026e\n\67\3\67\3\67\5\67\u0272\n\67"+
		"\3\67\5\67\u0275\n\67\3\67\3\67\5\67\u0279\n\67\3\67\3\67\5\67\u027d\n"+
		"\67\3\67\3\67\5\67\u0281\n\67\3\67\5\67\u0284\n\67\38\38\38\38\58\u028a"+
		"\n8\38\38\58\u028e\n8\38\38\58\u0292\n8\38\38\38\38\38\38\58\u029a\n8"+
		"\38\38\58\u029e\n8\38\38\58\u02a2\n8\38\38\58\u02a6\n8\38\38\58\u02aa"+
		"\n8\38\58\u02ad\n8\39\39\3:\3:\3;\3;\5;\u02b5\n;\3<\3<\3<\3<\3=\3=\3="+
		"\7=\u02be\n=\f=\16=\u02c1\13=\3>\3>\3>\3>\3?\3?\3?\3?\3?\7?\u02cc\n?\f"+
		"?\16?\u02cf\13?\3@\3@\5@\u02d3\n@\3@\3@\3@\3@\5@\u02d9\n@\5@\u02db\n@"+
		"\3@\3@\3@\3A\3A\5A\u02e2\nA\3A\3A\7A\u02e6\nA\fA\16A\u02e9\13A\3B\3B\5"+
		"B\u02ed\nB\3C\3C\3C\5C\u02f2\nC\3C\3C\3C\3D\3D\3D\5D\u02fa\nD\3D\3D\5"+
		"D\u02fe\nD\3D\3D\3D\3D\3D\3D\5D\u0306\nD\3D\3D\3D\5D\u030b\nD\3E\3E\3"+
		"E\7E\u0310\nE\fE\16E\u0313\13E\3F\3F\3F\3G\3G\3G\5G\u031b\nG\3G\5G\u031e"+
		"\nG\3G\3G\7G\u0322\nG\fG\16G\u0325\13G\3H\5H\u0328\nH\3H\3H\3H\3H\5H\u032e"+
		"\nH\3H\3H\5H\u0332\nH\3H\3H\3H\3H\5H\u0338\nH\3H\3H\5H\u033c\nH\3H\3H"+
		"\3I\3I\3I\3I\3I\5I\u0345\nI\3I\3I\3I\3I\3I\3I\5I\u034d\nI\3I\3I\5I\u0351"+
		"\nI\3J\3J\3K\3K\7K\u0357\nK\fK\16K\u035a\13K\3L\5L\u035d\nL\3L\3L\5L\u0361"+
		"\nL\3L\5L\u0364\nL\3L\5L\u0367\nL\3M\3M\3M\3M\7M\u036d\nM\fM\16M\u0370"+
		"\13M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\5R\u0381\nR\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\5S\u038c\nS\3T\3T\3T\3T\3T\3T\5T\u0394\nT\3U\5U\u0397"+
		"\nU\3U\3U\5U\u039b\nU\3U\5U\u039e\nU\3U\5U\u03a1\nU\3U\5U\u03a4\nU\3U"+
		"\3U\3U\3U\5U\u03aa\nU\3U\5U\u03ad\nU\3U\5U\u03b0\nU\3U\5U\u03b3\nU\3U"+
		"\5U\u03b6\nU\3U\5U\u03b9\nU\3U\3U\5U\u03bd\nU\3U\5U\u03c0\nU\3U\5U\u03c3"+
		"\nU\3U\5U\u03c6\nU\3U\5U\u03c9\nU\3U\5U\u03cc\nU\3U\3U\5U\u03d0\nU\3U"+
		"\5U\u03d3\nU\3U\5U\u03d6\nU\3U\5U\u03d9\nU\3U\3U\5U\u03dd\nU\3U\5U\u03e0"+
		"\nU\3U\5U\u03e3\nU\3U\5U\u03e6\nU\3U\3U\5U\u03ea\nU\3U\5U\u03ed\nU\3U"+
		"\5U\u03f0\nU\5U\u03f2\nU\3U\5U\u03f5\nU\3U\5U\u03f8\nU\3U\3U\5U\u03fc"+
		"\nU\3U\5U\u03ff\nU\3U\5U\u0402\nU\3U\5U\u0405\nU\3U\3U\3U\3U\5U\u040b"+
		"\nU\3U\5U\u040e\nU\3U\3U\5U\u0412\nU\3U\5U\u0415\nU\3U\5U\u0418\nU\3U"+
		"\5U\u041b\nU\3U\5U\u041e\nU\3U\3U\3U\3U\3U\5U\u0425\nU\3U\5U\u0428\nU"+
		"\3U\3U\5U\u042c\nU\3U\5U\u042f\nU\3U\5U\u0432\nU\5U\u0434\nU\3V\3V\3V"+
		"\3V\3W\3W\7W\u043c\nW\fW\16W\u043f\13W\3X\3X\7X\u0443\nX\fX\16X\u0446"+
		"\13X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3`\2\2a\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\2\6"+
		"\4\2\25\25\31\31\4\2\37\37,,\4\2  \"\"\4\2\13\17\30\30\2\u04c0\2\u00c0"+
		"\3\2\2\2\4\u00c8\3\2\2\2\6\u00dc\3\2\2\2\b\u00e4\3\2\2\2\n\u00e6\3\2\2"+
		"\2\f\u00ef\3\2\2\2\16\u00f1\3\2\2\2\20\u00f3\3\2\2\2\22\u00f7\3\2\2\2"+
		"\24\u0107\3\2\2\2\26\u010b\3\2\2\2\30\u0132\3\2\2\2\32\u0134\3\2\2\2\34"+
		"\u0139\3\2\2\2\36\u014f\3\2\2\2 \u0151\3\2\2\2\"\u015e\3\2\2\2$\u0160"+
		"\3\2\2\2&\u0168\3\2\2\2(\u016c\3\2\2\2*\u0173\3\2\2\2,\u0177\3\2\2\2."+
		"\u017e\3\2\2\2\60\u0182\3\2\2\2\62\u0185\3\2\2\2\64\u0187\3\2\2\2\66\u0189"+
		"\3\2\2\28\u0191\3\2\2\2:\u0194\3\2\2\2<\u019e\3\2\2\2>\u01a3\3\2\2\2@"+
		"\u01a5\3\2\2\2B\u01a7\3\2\2\2D\u01ac\3\2\2\2F\u01b0\3\2\2\2H\u01b4\3\2"+
		"\2\2J\u01b6\3\2\2\2L\u01be\3\2\2\2N\u01c1\3\2\2\2P\u01c4\3\2\2\2R\u01c8"+
		"\3\2\2\2T\u01cb\3\2\2\2V\u01d5\3\2\2\2X\u0205\3\2\2\2Z\u0231\3\2\2\2\\"+
		"\u0233\3\2\2\2^\u0239\3\2\2\2`\u0241\3\2\2\2b\u0243\3\2\2\2d\u0245\3\2"+
		"\2\2f\u024d\3\2\2\2h\u024f\3\2\2\2j\u0257\3\2\2\2l\u0283\3\2\2\2n\u02ac"+
		"\3\2\2\2p\u02ae\3\2\2\2r\u02b0\3\2\2\2t\u02b4\3\2\2\2v\u02b6\3\2\2\2x"+
		"\u02ba\3\2\2\2z\u02c2\3\2\2\2|\u02c6\3\2\2\2~\u02d0\3\2\2\2\u0080\u02df"+
		"\3\2\2\2\u0082\u02ec\3\2\2\2\u0084\u02ee\3\2\2\2\u0086\u030a\3\2\2\2\u0088"+
		"\u030c\3\2\2\2\u008a\u0314\3\2\2\2\u008c\u0317\3\2\2\2\u008e\u0327\3\2"+
		"\2\2\u0090\u033f\3\2\2\2\u0092\u0352\3\2\2\2\u0094\u0354\3\2\2\2\u0096"+
		"\u035c\3\2\2\2\u0098\u0368\3\2\2\2\u009a\u0371\3\2\2\2\u009c\u0373\3\2"+
		"\2\2\u009e\u0375\3\2\2\2\u00a0\u0377\3\2\2\2\u00a2\u0380\3\2\2\2\u00a4"+
		"\u038b\3\2\2\2\u00a6\u0393\3\2\2\2\u00a8\u0433\3\2\2\2\u00aa\u0435\3\2"+
		"\2\2\u00ac\u0439\3\2\2\2\u00ae\u0440\3\2\2\2\u00b0\u0447\3\2\2\2\u00b2"+
		"\u0449\3\2\2\2\u00b4\u044b\3\2\2\2\u00b6\u044d\3\2\2\2\u00b8\u044f\3\2"+
		"\2\2\u00ba\u0451\3\2\2\2\u00bc\u0453\3\2\2\2\u00be\u0455\3\2\2\2\u00c0"+
		"\u00c1\5\4\3\2\u00c1\u00c2\7\2\2\3\u00c2\3\3\2\2\2\u00c3\u00c9\5\6\4\2"+
		"\u00c4\u00c5\5\6\4\2\u00c5\u00c6\5\4\3\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\5\3\2\2\2\u00ca\u00dd\5\n\6\2\u00cb\u00dd\5\20\t\2\u00cc\u00dd\5&\24"+
		"\2\u00cd\u00dd\5(\25\2\u00ce\u00dd\5\66\34\2\u00cf\u00dd\5L\'\2\u00d0"+
		"\u00dd\5N(\2\u00d1\u00dd\5P)\2\u00d2\u00dd\5X-\2\u00d3\u00dd\5d\63\2\u00d4"+
		"\u00dd\5h\65\2\u00d5\u00dd\5l\67\2\u00d6\u00dd\5\u0086D\2\u00d7\u00dd"+
		"\5\u0084C\2\u00d8\u00dd\5\26\f\2\u00d9\u00dd\5\32\16\2\u00da\u00dd\5\u00a0"+
		"Q\2\u00db\u00dd\5\u008eH\2\u00dc\u00ca\3\2\2\2\u00dc\u00cb\3\2\2\2\u00dc"+
		"\u00cc\3\2\2\2\u00dc\u00cd\3\2\2\2\u00dc\u00ce\3\2\2\2\u00dc\u00cf\3\2"+
		"\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc"+
		"\u00d3\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d6\3\2"+
		"\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\7\3\2\2\2\u00de\u00df\7\'\2\2"+
		"\u00df\u00e5\7(\2\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\5\4\3\2\u00e2\u00e3"+
		"\7(\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5"+
		"\t\3\2\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\f\7\2\u00e8\u00e9\7\36\2"+
		"\2\u00e9\13\3\2\2\2\u00ea\u00f0\5\16\b\2\u00eb\u00ec\5\16\b\2\u00ec\u00ed"+
		"\7$\2\2\u00ed\u00ee\5\f\7\2\u00ee\u00f0\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00f0\r\3\2\2\2\u00f1\u00f2\7\65\2\2\u00f2\17\3\2\2\2\u00f3"+
		"\u00f4\7\4\2\2\u00f4\u00f5\5\22\n\2\u00f5\u00f6\7\36\2\2\u00f6\21\3\2"+
		"\2\2\u00f7\u00f9\5\24\13\2\u00f8\u00fa\t\2\2\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0100\5\u00aeX\2\u00fc\u00fd"+
		"\7$\2\2\u00fd\u00ff\5\22\n\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\23\3\2\2\2\u0102\u0100\3\2\2"+
		"\2\u0103\u0108\5\u00b0Y\2\u0104\u0105\5\u00b0Y\2\u0105\u0106\7\61\2\2"+
		"\u0106\u0108\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\t\3\2\2\u010a\25\3\2\2\2\u010b\u010c\5\30\r\2\u010c"+
		"\u010d\7\36\2\2\u010d\27\3\2\2\2\u010e\u0111\5\u00b0Y\2\u010f\u0110\t"+
		"\4\2\2\u0110\u0112\5\u00b2Z\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\u0114\3\2\2\2\u0113\u0115\7\61\2\2\u0114\u0113\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\t\3\2\2\u0117\u0119\t\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011f\5\u00ae"+
		"X\2\u011b\u011c\7$\2\2\u011c\u011e\5\30\r\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0133\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0124\5\u00a8U\2\u0123\u0125\7\61\2\2\u0124"+
		"\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\t\3"+
		"\2\2\u0127\u0129\t\2\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012f\5\u00aeX\2\u012b\u012c\7$\2\2\u012c\u012e\5"+
		"\30\r\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u010e\3\2"+
		"\2\2\u0132\u0122\3\2\2\2\u0133\31\3\2\2\2\u0134\u0135\5\34\17\2\u0135"+
		"\u0136\7\37\2\2\u0136\u0137\5\u00aeX\2\u0137\u0138\7\36\2\2\u0138\33\3"+
		"\2\2\2\u0139\u013e\5\u00a8U\2\u013a\u013b\7\37\2\2\u013b\u013d\5\34\17"+
		"\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\35\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0144\5\u00b0Y\2\u0142"+
		"\u0143\t\4\2\2\u0143\u0145\5\u00b2Z\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5\"\22\2\u0147\u0150\3\2\2\2"+
		"\u0148\u0149\5\u0092J\2\u0149\u014b\7)\2\2\u014a\u014c\5\u0088E\2\u014b"+
		"\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7*"+
		"\2\2\u014e\u0150\3\2\2\2\u014f\u0141\3\2\2\2\u014f\u0148\3\2\2\2\u0150"+
		"\37\3\2\2\2\u0151\u0154\5\u00b0Y\2\u0152\u0153\t\4\2\2\u0153\u0155\5\u00b2"+
		"Z\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\5\"\22\2\u0157!\3\2\2\2\u0158\u0159\7)\2\2\u0159\u015f\7*\2\2\u015a"+
		"\u015b\7)\2\2\u015b\u015c\5$\23\2\u015c\u015d\7*\2\2\u015d\u015f\3\2\2"+
		"\2\u015e\u0158\3\2\2\2\u015e\u015a\3\2\2\2\u015f#\3\2\2\2\u0160\u0165"+
		"\5\u00aeX\2\u0161\u0162\7$\2\2\u0162\u0164\5$\23\2\u0163\u0161\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166%\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\t\2\2\u0169\u016a\5\u00aeX\2"+
		"\u016a\u016b\7\36\2\2\u016b\'\3\2\2\2\u016c\u016e\5*\26\2\u016d\u016f"+
		"\5,\27\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u0172\5\60\31\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172)\3\2\2"+
		"\2\u0173\u0174\7\5\2\2\u0174\u0175\5\62\32\2\u0175\u0176\5\64\33\2\u0176"+
		"+\3\2\2\2\u0177\u017b\5.\30\2\u0178\u017a\5,\27\2\u0179\u0178\3\2\2\2"+
		"\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c-\3"+
		"\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\7\6\2\2\u017f\u0180\5\62\32\2\u0180"+
		"\u0181\5\64\33\2\u0181/\3\2\2\2\u0182\u0183\7\7\2\2\u0183\u0184\5\64\33"+
		"\2\u0184\61\3\2\2\2\u0185\u0186\5\u00aeX\2\u0186\63\3\2\2\2\u0187\u0188"+
		"\5\u00a2R\2\u0188\65\3\2\2\2\u0189\u018d\7\b\2\2\u018a\u018e\5> \2\u018b"+
		"\u018e\5<\37\2\u018c\u018e\5:\36\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\58\35\2\u0190"+
		"\67\3\2\2\2\u0191\u0192\5\u00a2R\2\u01929\3\2\2\2\u0193\u0195\7)\2\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\5D"+
		"#\2\u0197\u0198\5@!\2\u0198\u0199\5F$\2\u0199\u019a\5B\"\2\u019a\u019c"+
		"\5H%\2\u019b\u019d\7*\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		";\3\2\2\2\u019e\u019f\5F$\2\u019f=\3\2\2\2\u01a0\u01a1\7)\2\2\u01a1\u01a4"+
		"\7*\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"?\3\2\2\2\u01a5\u01a6\7\36\2\2\u01a6A\3\2\2\2\u01a7\u01a8\7\36\2\2\u01a8"+
		"C\3\2\2\2\u01a9\u01aa\7\4\2\2\u01aa\u01ad\5\22\n\2\u01ab\u01ad\3\2\2\2"+
		"\u01ac\u01a9\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adE\3\2\2\2\u01ae\u01b1\5"+
		"\u00aeX\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2"+
		"\u01b1G\3\2\2\2\u01b2\u01b5\5J&\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b3\3\2\2\2\u01b5I\3\2\2\2\u01b6\u01bb\5\u00aeX\2\u01b7\u01b8"+
		"\7$\2\2\u01b8\u01ba\5\u00aeX\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2"+
		"\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcK\3\2\2\2\u01bd\u01bb\3"+
		"\2\2\2\u01be\u01bf\7\26\2\2\u01bf\u01c0\7\36\2\2\u01c0M\3\2\2\2\u01c1"+
		"\u01c2\7\27\2\2\u01c2\u01c3\7\36\2\2\u01c3O\3\2\2\2\u01c4\u01c6\5R*\2"+
		"\u01c5\u01c7\5T+\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7Q\3\2"+
		"\2\2\u01c8\u01c9\7\32\2\2\u01c9\u01ca\5V,\2\u01caS\3\2\2\2\u01cb\u01cd"+
		"\7\33\2\2\u01cc\u01ce\7)\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d1\5\u00b0Y\2\u01d0\u01d2\7*\2\2\u01d1\u01d0\3"+
		"\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5V,\2\u01d4"+
		"U\3\2\2\2\u01d5\u01d6\5\u00a2R\2\u01d6W\3\2\2\2\u01d7\u01d8\7)\2\2\u01d8"+
		"\u01da\7\n\2\2\u01d9\u01db\5\u00b0Y\2\u01da\u01d9\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\7)\2\2\u01dd\u01df\5\\/\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e6\7*"+
		"\2\2\u01e1\u01e4\7\34\2\2\u01e2\u01e5\5\u00b2Z\2\u01e3\u01e5\7\61\2\2"+
		"\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e1"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\5b\62\2\u01e9"+
		"\u01ea\7*\2\2\u01ea\u01ec\5\u00bc_\2\u01eb\u01ed\5^\60\2\u01ec\u01eb\3"+
		"\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\5\u00be`\2"+
		"\u01ef\u01f0\7\36\2\2\u01f0\u0206\3\2\2\2\u01f1\u01f3\7\n\2\2\u01f2\u01f4"+
		"\5\u00b0Y\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5\u01f7\7)\2\2\u01f6\u01f8\5\\/\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01ff\7*\2\2\u01fa\u01fd\7\34\2\2\u01fb"+
		"\u01fe\5\u00b2Z\2\u01fc\u01fe\7\61\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fa\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u0204\5b\62\2\u0202\u0204\7\36\2\2\u0203\u0201\3"+
		"\2\2\2\u0203\u0202\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u01d7\3\2\2\2\u0205"+
		"\u01f1\3\2\2\2\u0206Y\3\2\2\2\u0207\u0208\7)\2\2\u0208\u020a\7\n\2\2\u0209"+
		"\u020b\5\u00b0Y\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c"+
		"\3\2\2\2\u020c\u020e\7)\2\2\u020d\u020f\5\\/\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0216\7*\2\2\u0211\u0214\7\34"+
		"\2\2\u0212\u0215\5\u00b2Z\2\u0213\u0215\7\61\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0213\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0211\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5b\62\2\u0219\u021a\7*\2\2\u021a"+
		"\u021c\5\u00bc_\2\u021b\u021d\5^\60\2\u021c\u021b\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f\5\u00be`\2\u021f\u0232\3\2\2"+
		"\2\u0220\u0222\7\n\2\2\u0221\u0223\5\u00b0Y\2\u0222\u0221\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\7)\2\2\u0225\u0227\5\\"+
		"/\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022e\7*\2\2\u0229\u022c\7\34\2\2\u022a\u022d\5\u00b2Z\2\u022b\u022d"+
		"\7\61\2\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d\u022f\3\2\2\2"+
		"\u022e\u0229\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232"+
		"\5b\62\2\u0231\u0207\3\2\2\2\u0231\u0220\3\2\2\2\u0232[\3\2\2\2\u0233"+
		"\u0234\7/\2\2\u0234\u0237\7\61\2\2\u0235\u0236\7$\2\2\u0236\u0238\5\\"+
		"/\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238]\3\2\2\2\u0239\u023e"+
		"\5`\61\2\u023a\u023b\7$\2\2\u023b\u023d\5`\61\2\u023c\u023a\3\2\2\2\u023d"+
		"\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f_\3\2\2\2"+
		"\u0240\u023e\3\2\2\2\u0241\u0242\5\u00aeX\2\u0242a\3\2\2\2\u0243\u0244"+
		"\5\u00a6T\2\u0244c\3\2\2\2\u0245\u0246\7\20\2\2\u0246\u0249\5\u00b0Y\2"+
		"\u0247\u0248\7\22\2\2\u0248\u024a\5\u00b2Z\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\5f\64\2\u024ce\3\2\2\2"+
		"\u024d\u024e\5\u00a6T\2\u024eg\3\2\2\2\u024f\u0250\7\21\2\2\u0250\u0253"+
		"\5\u00b0Y\2\u0251\u0252\7\22\2\2\u0252\u0254\5\u00b2Z\2\u0253\u0251\3"+
		"\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\5j\66\2\u0256"+
		"i\3\2\2\2\u0257\u0258\5\u00a6T\2\u0258k\3\2\2\2\u0259\u025a\5\u00bc_\2"+
		"\u025a\u025b\7\25\2\2\u025b\u025d\7\23\2\2\u025c\u025e\5\u00b0Y\2\u025d"+
		"\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u0260\7\22"+
		"\2\2\u0260\u0262\5\u00b2Z\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0265\3\2\2\2\u0263\u0264\7\24\2\2\u0264\u0266\5\u00b4[\2\u0265\u0263"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\5r:\2\u0268"+
		"\u0271\5\u00be`\2\u0269\u026a\t\4\2\2\u026a\u026b\5\u00b6\\\2\u026b\u026d"+
		"\7)\2\2\u026c\u026e\5\u00aeX\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2"+
		"\u026e\u026f\3\2\2\2\u026f\u0270\7*\2\2\u0270\u0272\3\2\2\2\u0271\u0269"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0275\7\36\2\2"+
		"\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0284\3\2\2\2\u0276\u0278"+
		"\7\23\2\2\u0277\u0279\5\u00b0Y\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2"+
		"\2\u0279\u027c\3\2\2\2\u027a\u027b\7\22\2\2\u027b\u027d\5\u00b2Z\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027f\7\24"+
		"\2\2\u027f\u0281\5\u00b4[\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0284\5r:\2\u0283\u0259\3\2\2\2\u0283\u0276\3\2\2"+
		"\2\u0284m\3\2\2\2\u0285\u0286\5\u00bc_\2\u0286\u0287\7\25\2\2\u0287\u0289"+
		"\7\23\2\2\u0288\u028a\5\u00b0Y\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2"+
		"\2\u028a\u028d\3\2\2\2\u028b\u028c\7\22\2\2\u028c\u028e\5\u00b2Z\2\u028d"+
		"\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u0290\7\24"+
		"\2\2\u0290\u0292\5\u00b4[\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\u0294\5r:\2\u0294\u029d\5\u00be`\2\u0295\u0296\t"+
		"\4\2\2\u0296\u0297\5\u00b6\\\2\u0297\u0299\7)\2\2\u0298\u029a\5\u00ae"+
		"X\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029c\7*\2\2\u029c\u029e\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u029e\3\2"+
		"\2\2\u029e\u02ad\3\2\2\2\u029f\u02a1\7\23\2\2\u02a0\u02a2\5\u00b0Y\2\u02a1"+
		"\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a4\7\22"+
		"\2\2\u02a4\u02a6\5\u00b2Z\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a9\3\2\2\2\u02a7\u02a8\7\24\2\2\u02a8\u02aa\5\u00b4[\2\u02a9\u02a7"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\5r:\2\u02ac"+
		"\u0285\3\2\2\2\u02ac\u029f\3\2\2\2\u02ado\3\2\2\2\u02ae\u02af\5\u00ae"+
		"X\2\u02afq\3\2\2\2\u02b0\u02b1\5\u00a6T\2\u02b1s\3\2\2\2\u02b2\u02b5\5"+
		"v<\2\u02b3\u02b5\5z>\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5u"+
		"\3\2\2\2\u02b6\u02b7\7%\2\2\u02b7\u02b8\5x=\2\u02b8\u02b9\7&\2\2\u02b9"+
		"w\3\2\2\2\u02ba\u02bf\5\u00aeX\2\u02bb\u02bc\7$\2\2\u02bc\u02be\5x=\2"+
		"\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0y\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7\'\2\2\u02c3"+
		"\u02c4\5|?\2\u02c4\u02c5\7(\2\2\u02c5{\3\2\2\2\u02c6\u02c7\5\u00b0Y\2"+
		"\u02c7\u02c8\7!\2\2\u02c8\u02cd\5\u00aeX\2\u02c9\u02ca\7$\2\2\u02ca\u02cc"+
		"\5|?\2\u02cb\u02c9\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce}\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d2\7)\2\2\u02d1"+
		"\u02d3\5\u0080A\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02da\7*\2\2\u02d5\u02d8\7\34\2\2\u02d6\u02d9\5\u00b0Y"+
		"\2\u02d7\u02d9\7\61\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9"+
		"\u02db\3\2\2\2\u02da\u02d5\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2"+
		"\2\2\u02dc\u02dd\7\35\2\2\u02dd\u02de\5\u0082B\2\u02de\177\3\2\2\2\u02df"+
		"\u02e1\5\u00b0Y\2\u02e0\u02e2\7\61\2\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u02e7\3\2\2\2\u02e3\u02e4\7$\2\2\u02e4\u02e6\5\u0080A\2"+
		"\u02e5\u02e3\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8\u0081\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ed\5\u00a6T"+
		"\2\u02eb\u02ed\5\u00aeX\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ed"+
		"\u0083\3\2\2\2\u02ee\u02ef\5\u00b0Y\2\u02ef\u02f1\7)\2\2\u02f0\u02f2\5"+
		"\\/\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02f4\7*\2\2\u02f4\u02f5\5\u00a6T\2\u02f5\u0085\3\2\2\2\u02f6\u02f9\5"+
		"\u00b0Y\2\u02f7\u02f8\t\4\2\2\u02f8\u02fa\5\u00b2Z\2\u02f9\u02f7\3\2\2"+
		"\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\7)\2\2\u02fc\u02fe"+
		"\5\u0088E\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2"+
		"\2\u02ff\u0300\7*\2\2\u0300\u0301\7\36\2\2\u0301\u030b\3\2\2\2\u0302\u0303"+
		"\5\u0092J\2\u0303\u0305\7)\2\2\u0304\u0306\5\u0088E\2\u0305\u0304\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\7*\2\2\u0308"+
		"\u0309\7\36\2\2\u0309\u030b\3\2\2\2\u030a\u02f6\3\2\2\2\u030a\u0302\3"+
		"\2\2\2\u030b\u0087\3\2\2\2\u030c\u0311\5\u00aeX\2\u030d\u030e\7$\2\2\u030e"+
		"\u0310\5\u0088E\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f"+
		"\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0089\3\2\2\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0315\5\u008cG\2\u0315\u0316\7\36\2\2\u0316\u008b\3\2\2\2\u0317\u031d"+
		"\5\u0092J\2\u0318\u031a\7)\2\2\u0319\u031b\5\u0088E\2\u031a\u0319\3\2"+
		"\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\7*\2\2\u031d"+
		"\u0318\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0323\3\2\2\2\u031f\u0320\7#"+
		"\2\2\u0320\u0322\5\u008cG\2\u0321\u031f\3\2\2\2\u0322\u0325\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u008d\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0326\u0328\7)\2\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u032a\7\25\2\2\u032a\u032b\5\u00b0Y\2\u032b\u032d"+
		"\7)\2\2\u032c\u032e\5\u00aeX\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2"+
		"\u032e\u032f\3\2\2\2\u032f\u0331\7*\2\2\u0330\u0332\7*\2\2\u0331\u0330"+
		"\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u033b\3\2\2\2\u0333\u0334\t\4\2\2\u0334"+
		"\u0335\5\u00b2Z\2\u0335\u0337\7)\2\2\u0336\u0338\5\u00aeX\2\u0337\u0336"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\7*\2\2\u033a"+
		"\u033c\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u033e\7\36\2\2\u033e\u008f\3\2\2\2\u033f\u0340\7)\2\2\u0340"+
		"\u0341\7\25\2\2\u0341\u0342\5\u00b0Y\2\u0342\u0344\7)\2\2\u0343\u0345"+
		"\5\u00aeX\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2"+
		"\2\u0346\u0347\7*\2\2\u0347\u0350\7*\2\2\u0348\u0349\t\4\2\2\u0349\u034a"+
		"\5\u00b2Z\2\u034a\u034c\7)\2\2\u034b\u034d\5\u00aeX\2\u034c\u034b\3\2"+
		"\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\7*\2\2\u034f"+
		"\u0351\3\2\2\2\u0350\u0348\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0091\3\2"+
		"\2\2\u0352\u0353\5\u0094K\2\u0353\u0093\3\2\2\2\u0354\u0358\5\u0096L\2"+
		"\u0355\u0357\5\u0094K\2\u0356\u0355\3\2\2\2\u0357\u035a\3\2\2\2\u0358"+
		"\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0095\3\2\2\2\u035a\u0358\3\2"+
		"\2\2\u035b\u035d\5\u009cO\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035e\3\2\2\2\u035e\u0360\5\u00b0Y\2\u035f\u0361\5\u0098M\2\u0360\u035f"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0364\5\u009eP"+
		"\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0367"+
		"\t\4\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0097\3\2\2\2\u0368"+
		"\u0369\7%\2\2\u0369\u036a\5\u009aN\2\u036a\u036e\7&\2\2\u036b\u036d\5"+
		"\u0098M\2\u036c\u036b\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2"+
		"\u036e\u036f\3\2\2\2\u036f\u0099\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0372"+
		"\5\u00aeX\2\u0372\u009b\3\2\2\2\u0373\u0374\7.\2\2\u0374\u009d\3\2\2\2"+
		"\u0375\u0376\7.\2\2\u0376\u009f\3\2\2\2\u0377\u0378\t\5\2\2\u0378\u00a1"+
		"\3\2\2\2\u0379\u037a\7\'\2\2\u037a\u0381\7(\2\2\u037b\u037c\7\'\2\2\u037c"+
		"\u037d\5\4\3\2\u037d\u037e\7(\2\2\u037e\u0381\3\2\2\2\u037f\u0381\5\u00a4"+
		"S\2\u0380\u0379\3\2\2\2\u0380\u037b\3\2\2\2\u0380\u037f\3\2\2\2\u0381"+
		"\u00a3\3\2\2\2\u0382\u0383\5 \21\2\u0383\u0384\7\36\2\2\u0384\u038c\3"+
		"\2\2\2\u0385\u038c\5&\24\2\u0386\u038c\5(\25\2\u0387\u038c\5\66\34\2\u0388"+
		"\u038c\5P)\2\u0389\u038c\5L\'\2\u038a\u038c\5N(\2\u038b\u0382\3\2\2\2"+
		"\u038b\u0385\3\2\2\2\u038b\u0386\3\2\2\2\u038b\u0387\3\2\2\2\u038b\u0388"+
		"\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038c\u00a5\3\2\2\2\u038d"+
		"\u038e\7\'\2\2\u038e\u0394\7(\2\2\u038f\u0390\7\'\2\2\u0390\u0391\5\4"+
		"\3\2\u0391\u0392\7(\2\2\u0392\u0394\3\2\2\2\u0393\u038d\3\2\2\2\u0393"+
		"\u038f\3\2\2\2\u0394\u00a7\3\2\2\2\u0395\u0397\7-\2\2\u0396\u0395\3\2"+
		"\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\5\36\20\2\u0399"+
		"\u039b\7\61\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\3"+
		"\2\2\2\u039c\u039e\7+\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u03a0\3\2\2\2\u039f\u03a1\7,\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2"+
		"\2\2\u03a1\u0434\3\2\2\2\u03a2\u03a4\7-\2\2\u03a3\u03a2\3\2\2\2\u03a3"+
		"\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\5\u00b0Y\2\u03a6\u03a7"+
		"\t\4\2\2\u03a7\u03a9\5\u00b2Z\2\u03a8\u03aa\7\61\2\2\u03a9\u03a8\3\2\2"+
		"\2\u03a9\u03aa\3\2\2\2\u03aa\u03ac\3\2\2\2\u03ab\u03ad\7\37\2\2\u03ac"+
		"\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03b0\7+"+
		"\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1"+
		"\u03b3\7,\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u0434\3\2"+
		"\2\2\u03b4\u03b6\7-\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b8\3\2\2\2\u03b7\u03b9\5\u00b8]\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\5\u00b0Y\2\u03bb\u03bd\5\u00ba"+
		"^\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be"+
		"\u03c0\7\61\2\2\u03bf\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\3"+
		"\2\2\2\u03c1\u03c3\7\37\2\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"\u03c5\3\2\2\2\u03c4\u03c6\7+\2\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2"+
		"\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c9\7,\2\2\u03c8\u03c7\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03f2\3\2\2\2\u03ca\u03cc\7-\2\2\u03cb\u03ca\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\7\63\2\2\u03ce"+
		"\u03d0\7\61\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d2\3"+
		"\2\2\2\u03d1\u03d3\7+\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d5\3\2\2\2\u03d4\u03d6\7,\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2"+
		"\2\2\u03d6\u03f2\3\2\2\2\u03d7\u03d9\7-\2\2\u03d8\u03d7\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\7\64\2\2\u03db\u03dd\7"+
		"\61\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de"+
		"\u03e0\7+\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2"+
		"\2\2\u03e1\u03e3\7,\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"\u03f2\3\2\2\2\u03e4\u03e6\7-\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2"+
		"\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\7\65\2\2\u03e8\u03ea\7\61\2\2\u03e9"+
		"\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03ed\7+"+
		"\2\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee"+
		"\u03f0\7,\2\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2"+
		"\2\2\u03f1\u03b5\3\2\2\2\u03f1\u03cb\3\2\2\2\u03f1\u03d8\3\2\2\2\u03f1"+
		"\u03e5\3\2\2\2\u03f2\u0434\3\2\2\2\u03f3\u03f5\7-\2\2\u03f4\u03f3\3\2"+
		"\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03f8\5\u00b8]\2\u03f7"+
		"\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\5t"+
		";\2\u03fa\u03fc\5\u00ba^\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fe\3\2\2\2\u03fd\u03ff\7\61\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3"+
		"\2\2\2\u03ff\u0401\3\2\2\2\u0400\u0402\7+\2\2\u0401\u0400\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0405\7,\2\2\u0404\u0403\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0434\3\2\2\2\u0406\u0434\5Z.\2\u0407\u0434"+
		"\5n8\2\u0408\u0434\5~@\2\u0409\u040b\7-\2\2\u040a\u0409\3\2\2\2\u040a"+
		"\u040b\3\2\2\2\u040b\u040d\3\2\2\2\u040c\u040e\5\u00b8]\2\u040d\u040c"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\5\u0092J"+
		"\2\u0410\u0412\5\u00ba^\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0414\3\2\2\2\u0413\u0415\7\61\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3"+
		"\2\2\2\u0415\u0417\3\2\2\2\u0416\u0418\7\37\2\2\u0417\u0416\3\2\2\2\u0417"+
		"\u0418\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u041b\7+\2\2\u041a\u0419\3\2"+
		"\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041e\7,\2\2\u041d"+
		"\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0434\3\2\2\2\u041f\u0434\5\u0090"+
		"I\2\u0420\u0421\7\'\2\2\u0421\u0425\7(\2\2\u0422\u0423\7%\2\2\u0423\u0425"+
		"\7&\2\2\u0424\u0420\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0434\3\2\2\2\u0426"+
		"\u0428\7-\2\2\u0427\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u042b\5\u00aaV\2\u042a\u042c\7\61\2\2\u042b\u042a\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u042f\7+\2\2\u042e\u042d\3\2"+
		"\2\2\u042e\u042f\3\2\2\2\u042f\u0431\3\2\2\2\u0430\u0432\7,\2\2\u0431"+
		"\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u0396\3\2"+
		"\2\2\u0433\u03a3\3\2\2\2\u0433\u03f1\3\2\2\2\u0433\u03f4\3\2\2\2\u0433"+
		"\u0406\3\2\2\2\u0433\u0407\3\2\2\2\u0433\u0408\3\2\2\2\u0433\u040a\3\2"+
		"\2\2\u0433\u041f\3\2\2\2\u0433\u0424\3\2\2\2\u0433\u0427\3\2\2\2\u0434"+
		"\u00a9\3\2\2\2\u0435\u0436\7)\2\2\u0436\u0437\5\u00acW\2\u0437\u0438\7"+
		"*\2\2\u0438\u00ab\3\2\2\2\u0439\u043d\5\u00a8U\2\u043a\u043c\5\u00acW"+
		"\2\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u00ad\3\2\2\2\u043f\u043d\3\2\2\2\u0440\u0444\5\u00a8U"+
		"\2\u0441\u0443\5\u00aeX\2\u0442\u0441\3\2\2\2\u0443\u0446\3\2\2\2\u0444"+
		"\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u00af\3\2\2\2\u0446\u0444\3\2"+
		"\2\2\u0447\u0448\7/\2\2\u0448\u00b1\3\2\2\2\u0449\u044a\7/\2\2\u044a\u00b3"+
		"\3\2\2\2\u044b\u044c\7/\2\2\u044c\u00b5\3\2\2\2\u044d\u044e\7/\2\2\u044e"+
		"\u00b7\3\2\2\2\u044f\u0450\7.\2\2\u0450\u00b9\3\2\2\2\u0451\u0452\7.\2"+
		"\2\u0452\u00bb\3\2\2\2\u0453\u0454\7)\2\2\u0454\u00bd\3\2\2\2\u0455\u0456"+
		"\7*\2\2\u0456\u00bf\3\2\2\2\u00a7\u00c8\u00dc\u00e4\u00ef\u00f9\u0100"+
		"\u0107\u0111\u0114\u0118\u011f\u0124\u0128\u012f\u0132\u013e\u0144\u014b"+
		"\u014f\u0154\u015e\u0165\u016e\u0171\u017b\u018d\u0194\u019c\u01a3\u01ac"+
		"\u01b0\u01b4\u01bb\u01c6\u01cd\u01d1\u01da\u01de\u01e4\u01e6\u01ec\u01f3"+
		"\u01f7\u01fd\u01ff\u0203\u0205\u020a\u020e\u0214\u0216\u021c\u0222\u0226"+
		"\u022c\u022e\u0231\u0237\u023e\u0249\u0253\u025d\u0261\u0265\u026d\u0271"+
		"\u0274\u0278\u027c\u0280\u0283\u0289\u028d\u0291\u0299\u029d\u02a1\u02a5"+
		"\u02a9\u02ac\u02b4\u02bf\u02cd\u02d2\u02d8\u02da\u02e1\u02e7\u02ec\u02f1"+
		"\u02f9\u02fd\u0305\u030a\u0311\u031a\u031d\u0323\u0327\u032d\u0331\u0337"+
		"\u033b\u0344\u034c\u0350\u0358\u035c\u0360\u0363\u0366\u036e\u0380\u038b"+
		"\u0393\u0396\u039a\u039d\u03a0\u03a3\u03a9\u03ac\u03af\u03b2\u03b5\u03b8"+
		"\u03bc\u03bf\u03c2\u03c5\u03c8\u03cb\u03cf\u03d2\u03d5\u03d8\u03dc\u03df"+
		"\u03e2\u03e5\u03e9\u03ec\u03ef\u03f1\u03f4\u03f7\u03fb\u03fe\u0401\u0404"+
		"\u040a\u040d\u0411\u0414\u0417\u041a\u041d\u0424\u0427\u042b\u042e\u0431"+
		"\u0433\u043d\u0444";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}