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
		RULE_variableItem = 8, RULE_variablePrefixModes = 9, RULE_functionCall = 10, 
		RULE_functionCallParam = 11, RULE_functionCallParamElements = 12, RULE_blockRet = 13, 
		RULE_blockConditional = 14, RULE_ifElementUnique = 15, RULE_elifElements = 16, 
		RULE_elifElementUnique = 17, RULE_elseElementUnique = 18, RULE_conditionalBlockExpression = 19, 
		RULE_conditionalBlockElements = 20, RULE_blockLoop = 21, RULE_loopBlockElements = 22, 
		RULE_loopComplete = 23, RULE_loopConditional = 24, RULE_loopInfinite = 25, 
		RULE_endOne = 26, RULE_endTwo = 27, RULE_loopOneMembers = 28, RULE_loopTwoMembers = 29, 
		RULE_loopThreeMembers = 30, RULE_loopThreeMembersValues = 31, RULE_blockBreak = 32, 
		RULE_blockNext = 33, RULE_blockTryCatch = 34, RULE_tryUniqueElement = 35, 
		RULE_catchUniqueElement = 36, RULE_tryCatchElements = 37, RULE_blockFunction = 38, 
		RULE_blockFunctionDeclarationAttr = 39, RULE_functionParam = 40, RULE_functionAnonymousParam = 41, 
		RULE_functionCodeBlock = 42, RULE_blockInterface = 43, RULE_interfaceCodeBlock = 44, 
		RULE_blockAbstraction = 45, RULE_abstractionCodeBlock = 46, RULE_blockClass = 47, 
		RULE_blockClassDeclarationAttr = 48, RULE_classCommonDef = 49, RULE_classAnonymousParam = 50, 
		RULE_classCodeBlock = 51, RULE_blockArray = 52, RULE_indexArray = 53, 
		RULE_indexArrayElements = 54, RULE_associativeArray = 55, RULE_associativeArrayElements = 56, 
		RULE_blockLambdaFunctions = 57, RULE_lambdaFnParams = 58, RULE_lambdaFnCodeBlock = 59, 
		RULE_blockClassConstructor = 60, RULE_blockFunctionCall = 61, RULE_functionCallElements = 62, 
		RULE_blockCascadingMethod = 63, RULE_blockCascadingMethodAttr = 64, RULE_blockAnonymousObject = 65, 
		RULE_blockAttribution = 66, RULE_attributionElements = 67, RULE_blockMultipleAssignments = 68, 
		RULE_variableMultipleAssignmentsModes = 69, RULE_blockAccessArrayElements = 70, 
		RULE_arrayAccessElements = 71, RULE_arrayAccessElementsItems = 72, RULE_accessBlockAr = 73, 
		RULE_arrayIndexAccess = 74, RULE_firstIncDec = 75, RULE_lastIncDec = 76, 
		RULE_blockPermissionTokens = 77, RULE_codeBlockFlowControl = 78, RULE_codeBlockFlowControlElements = 79, 
		RULE_codeBlockControl = 80, RULE_generalValue = 81, RULE_generalValueBlock = 82, 
		RULE_generalValueItems = 83, RULE_generalValueElements = 84, RULE_identifier = 85, 
		RULE_identifierB = 86, RULE_identifierC = 87, RULE_identifierD = 88, RULE_incDecOperatorsA = 89, 
		RULE_incDecOperatorsB = 90, RULE_openOpA = 91, RULE_closeOpA = 92;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "sentences", "statements", "blockCode", "blockUse", "useValue", 
			"useString", "blockVariable", "variableItem", "variablePrefixModes", 
			"functionCall", "functionCallParam", "functionCallParamElements", "blockRet", 
			"blockConditional", "ifElementUnique", "elifElements", "elifElementUnique", 
			"elseElementUnique", "conditionalBlockExpression", "conditionalBlockElements", 
			"blockLoop", "loopBlockElements", "loopComplete", "loopConditional", 
			"loopInfinite", "endOne", "endTwo", "loopOneMembers", "loopTwoMembers", 
			"loopThreeMembers", "loopThreeMembersValues", "blockBreak", "blockNext", 
			"blockTryCatch", "tryUniqueElement", "catchUniqueElement", "tryCatchElements", 
			"blockFunction", "blockFunctionDeclarationAttr", "functionParam", "functionAnonymousParam", 
			"functionCodeBlock", "blockInterface", "interfaceCodeBlock", "blockAbstraction", 
			"abstractionCodeBlock", "blockClass", "blockClassDeclarationAttr", "classCommonDef", 
			"classAnonymousParam", "classCodeBlock", "blockArray", "indexArray", 
			"indexArrayElements", "associativeArray", "associativeArrayElements", 
			"blockLambdaFunctions", "lambdaFnParams", "lambdaFnCodeBlock", "blockClassConstructor", 
			"blockFunctionCall", "functionCallElements", "blockCascadingMethod", 
			"blockCascadingMethodAttr", "blockAnonymousObject", "blockAttribution", 
			"attributionElements", "blockMultipleAssignments", "variableMultipleAssignmentsModes", 
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
			setState(186);
			sentences();
			setState(187);
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				statements();
				setState(191);
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
		public BlockCodeContext blockCode() {
			return getRuleContext(BlockCodeContext.class,0);
		}
		public BlockPermissionTokensContext blockPermissionTokens() {
			return getRuleContext(BlockPermissionTokensContext.class,0);
		}
		public BlockCascadingMethodContext blockCascadingMethod() {
			return getRuleContext(BlockCascadingMethodContext.class,0);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				blockUse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				blockVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				blockRet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				blockConditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				blockLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				blockBreak();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				blockNext();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				blockTryCatch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
				blockFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				blockInterface();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
				blockAbstraction();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(207);
				blockClass();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(208);
				blockFunctionCall();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(209);
				blockClassConstructor();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(210);
				blockAttribution();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(211);
				blockMultipleAssignments();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(212);
				blockCode();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(213);
				blockPermissionTokens();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(214);
				blockCascadingMethod();
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(217);
				match(OpenBlock);
				setState(218);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(219);
				match(OpenBlock);
				setState(220);
				sentences();
				setState(221);
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
			setState(225);
			match(Use);
			setState(226);
			useValue();
			setState(227);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				useString();
				setState(231);
				match(Separator);
				setState(232);
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
			setState(236);
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
			setState(238);
			match(Var);
			setState(239);
			variableItem();
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
			setState(242);
			variablePrefixModes();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(243);
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

			setState(246);
			generalValueElements();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(Separator);
					setState(248);
					variableItem();
					}
					} 
				}
				setState(253);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(254);
				identifier();
				}
				break;
			case 2:
				{
				setState(255);
				identifier();
				setState(256);
				match(TypeSpec);
				}
				break;
			}
			setState(260);
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
			setState(262);
			identifier();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				identifierB();
				}
			}

			setState(267);
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
		enterRule(_localctx, 22, RULE_functionCallParam);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(OpenOp);
				setState(270);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(OpenOp);
				setState(272);
				functionCallParamElements();
				setState(273);
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
		enterRule(_localctx, 24, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			generalValue();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(Separator);
					setState(279);
					functionCallParamElements();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 26, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(Ret);
			setState(286);
			generalValueElements();
			setState(287);
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
		enterRule(_localctx, 28, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			ifElementUnique();
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(290);
				elifElements();
				}
				break;
			}
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(293);
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
		enterRule(_localctx, 30, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(If);
			setState(297);
			conditionalBlockExpression();
			setState(298);
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
		enterRule(_localctx, 32, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			elifElementUnique();
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					elifElements();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 34, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(Elif);
			setState(308);
			conditionalBlockExpression();
			setState(309);
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
		enterRule(_localctx, 36, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(Else);
			setState(312);
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
		enterRule(_localctx, 38, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
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
		enterRule(_localctx, 40, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		enterRule(_localctx, 42, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(For);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(319);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(320);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(321);
				loopComplete();
				}
				break;
			}
			setState(324);
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
		enterRule(_localctx, 44, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		enterRule(_localctx, 46, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(328);
				match(OpenOp);
				}
			}

			setState(331);
			loopOneMembers();
			setState(332);
			endOne();
			setState(333);
			loopTwoMembers();
			setState(334);
			endTwo();
			setState(335);
			loopThreeMembers();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(336);
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
		enterRule(_localctx, 48, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 50, RULE_loopInfinite);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(OpenOp);
				setState(342);
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
		enterRule(_localctx, 52, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 54, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
		enterRule(_localctx, 56, RULE_loopOneMembers);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(Var);
				setState(351);
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
		enterRule(_localctx, 58, RULE_loopTwoMembers);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
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
		enterRule(_localctx, 60, RULE_loopThreeMembers);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
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
		enterRule(_localctx, 62, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			generalValueElements();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(364);
				match(Separator);
				setState(365);
				generalValueElements();
				}
				}
				setState(370);
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
		enterRule(_localctx, 64, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(Break);
			setState(372);
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
		enterRule(_localctx, 66, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(Next);
			setState(375);
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
		enterRule(_localctx, 68, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			tryUniqueElement();
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(378);
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
		enterRule(_localctx, 70, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(Try);
			setState(382);
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
		enterRule(_localctx, 72, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(Catch);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(385);
				match(OpenOp);
				}
			}

			setState(388);
			identifier();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(389);
				match(CloseOp);
				}
			}

			setState(392);
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
		enterRule(_localctx, 74, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 76, RULE_blockFunction);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(OpenOp);
				setState(397);
				match(Function);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(398);
					identifier();
					}
				}

				setState(401);
				match(OpenOp);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(402);
					functionParam();
					}
				}

				setState(405);
				match(CloseOp);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(406);
					match(ArrowRight);
					setState(409);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(407);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(408);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(413);
				functionCodeBlock();
				setState(414);
				match(CloseOp);
				setState(415);
				match(OpenOp);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(416);
					functionAnonymousParam();
					}
				}

				setState(419);
				match(CloseOp);
				setState(420);
				match(End);
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

				setState(440);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(438);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(439);
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
		enterRule(_localctx, 78, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(OpenOp);
				setState(445);
				match(Function);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(446);
					identifier();
					}
				}

				setState(449);
				match(OpenOp);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(450);
					functionParam();
					}
				}

				setState(453);
				match(CloseOp);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(454);
					match(ArrowRight);
					setState(457);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(455);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(456);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(461);
				functionCodeBlock();
				setState(462);
				match(CloseOp);
				setState(463);
				match(OpenOp);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(464);
					functionAnonymousParam();
					}
				}

				setState(467);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(Function);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(470);
					identifier();
					}
				}

				setState(473);
				match(OpenOp);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(474);
					functionParam();
					}
				}

				setState(477);
				match(CloseOp);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(478);
					match(ArrowRight);
					setState(481);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(479);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(480);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(485);
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
		enterRule(_localctx, 80, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(Identifier);
			setState(489);
			match(TypeSpec);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(490);
				match(Separator);
				setState(491);
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
		enterRule(_localctx, 82, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 84, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		enterRule(_localctx, 86, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(Interface);
			setState(499);
			identifier();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(500);
				match(Extends);
				setState(501);
				identifierB();
				}
			}

			setState(504);
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
		enterRule(_localctx, 88, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		enterRule(_localctx, 90, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(Abstract);
			setState(509);
			identifier();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(510);
				match(Extends);
				setState(511);
				identifierB();
				}
			}

			setState(514);
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
		enterRule(_localctx, 92, RULE_abstractionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		public ClassCommonDefContext classCommonDef() {
			return getRuleContext(ClassCommonDefContext.class,0);
		}
		public BlockClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClass; }
	}

	public final BlockClassContext blockClass() throws RecognitionException {
		BlockClassContext _localctx = new BlockClassContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_blockClass);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				openOpA();
				setState(519);
				match(New);
				setState(520);
				match(Class);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(521);
					identifier();
					}
				}

				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(524);
					match(Extends);
					setState(525);
					identifierB();
					}
				}

				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(528);
					match(Implements);
					setState(529);
					identifierC();
					}
				}

				setState(532);
				classCodeBlock();
				setState(533);
				closeOpA();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(534);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(535);
					identifierD();
					setState(536);
					match(OpenOp);
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(537);
						generalValueElements();
						}
					}

					setState(540);
					match(CloseOp);
					}
				}

				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==End) {
					{
					setState(544);
					match(End);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				classCommonDef();
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
		public ClassCommonDefContext classCommonDef() {
			return getRuleContext(ClassCommonDefContext.class,0);
		}
		public BlockClassDeclarationAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockClassDeclarationAttr; }
	}

	public final BlockClassDeclarationAttrContext blockClassDeclarationAttr() throws RecognitionException {
		BlockClassDeclarationAttrContext _localctx = new BlockClassDeclarationAttrContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				openOpA();
				setState(551);
				match(New);
				setState(552);
				match(Class);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(553);
					identifier();
					}
				}

				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(556);
					match(Extends);
					setState(557);
					identifierB();
					}
				}

				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(560);
					match(Implements);
					setState(561);
					identifierC();
					}
				}

				setState(564);
				classCodeBlock();
				setState(565);
				closeOpA();
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(566);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(567);
					identifierD();
					setState(568);
					match(OpenOp);
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(569);
						generalValueElements();
						}
					}

					setState(572);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				classCommonDef();
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

	public static class ClassCommonDefContext extends ParserRuleContext {
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
		public ClassCommonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCommonDef; }
	}

	public final ClassCommonDefContext classCommonDef() throws RecognitionException {
		ClassCommonDefContext _localctx = new ClassCommonDefContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classCommonDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(Class);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(580);
				identifier();
				}
			}

			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(583);
				match(Extends);
				setState(584);
				identifierB();
				}
			}

			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(587);
				match(Implements);
				setState(588);
				identifierC();
				}
			}

			setState(591);
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
			setState(593);
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
			setState(595);
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
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(597);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(598);
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
			setState(601);
			match(OpenArIndex);
			setState(602);
			indexArrayElements();
			setState(603);
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
			setState(605);
			generalValueElements();
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(606);
					match(Separator);
					setState(607);
					indexArrayElements();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
			setState(613);
			match(OpenBlock);
			setState(614);
			associativeArrayElements();
			setState(615);
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
			setState(617);
			identifier();
			setState(618);
			match(TwoPoint);
			setState(619);
			generalValueElements();
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(620);
					match(Separator);
					setState(621);
					associativeArrayElements();
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		enterRule(_localctx, 114, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(OpenOp);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(628);
				lambdaFnParams();
				}
			}

			setState(631);
			match(CloseOp);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(632);
				match(ArrowRight);
				setState(635);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(633);
					identifier();
					}
					break;
				case TypeSpec:
					{
					setState(634);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(639);
			match(ARightLB);
			setState(640);
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
		enterRule(_localctx, 116, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			identifier();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(643);
				match(TypeSpec);
				}
			}

			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(646);
					match(Separator);
					setState(647);
					lambdaFnParams();
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
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
		enterRule(_localctx, 120, RULE_blockClassConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			identifier();
			setState(658);
			match(OpenOp);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(659);
				functionParam();
				}
			}

			setState(662);
			match(CloseOp);
			setState(663);
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
		enterRule(_localctx, 122, RULE_blockFunctionCall);
		int _la;
		try {
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				identifier();
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(666);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(667);
					identifierB();
					}
				}

				setState(670);
				match(OpenOp);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(671);
					functionCallElements();
					}
				}

				setState(674);
				match(CloseOp);
				setState(675);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				blockAccessArrayElements();
				setState(678);
				match(OpenOp);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(679);
					functionCallElements();
					}
				}

				setState(682);
				match(CloseOp);
				setState(683);
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
		enterRule(_localctx, 124, RULE_functionCallElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			generalValueElements();
			setState(692);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(688);
					match(Separator);
					setState(689);
					functionCallElements();
					}
					} 
				}
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 126, RULE_blockCascadingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			blockCascadingMethodAttr();
			setState(696);
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
		enterRule(_localctx, 128, RULE_blockCascadingMethodAttr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			blockAccessArrayElements();
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(699);
				match(OpenOp);
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(700);
					functionCallElements();
					}
				}

				setState(703);
				match(CloseOp);
				}
				break;
			}
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(706);
					match(PointPoint);
					setState(707);
					blockCascadingMethodAttr();
					}
					} 
				}
				setState(712);
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

	public static class BlockAnonymousObjectContext extends ParserRuleContext {
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
		public BlockAnonymousObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockAnonymousObject; }
	}

	public final BlockAnonymousObjectContext blockAnonymousObject() throws RecognitionException {
		BlockAnonymousObjectContext _localctx = new BlockAnonymousObjectContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_blockAnonymousObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			match(OpenOp);
			setState(714);
			match(New);
			setState(715);
			identifier();
			setState(716);
			match(OpenOp);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(717);
				generalValueElements();
				}
			}

			setState(720);
			match(CloseOp);
			setState(721);
			match(CloseOp);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(722);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(723);
				identifierB();
				setState(724);
				match(OpenOp);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(725);
					generalValueElements();
					}
				}

				setState(728);
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
		enterRule(_localctx, 132, RULE_blockAttribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			attributionElements();
			setState(733);
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
		public AttributionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributionElements; }
	}

	public final AttributionElementsContext attributionElements() throws RecognitionException {
		AttributionElementsContext _localctx = new AttributionElementsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributionElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			identifier();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(736);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(737);
				identifierB();
				}
			}

			setState(740);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(741);
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

			setState(744);
			generalValueElements();
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(745);
					match(Separator);
					setState(746);
					attributionElements();
					}
					} 
				}
				setState(751);
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

	public static class BlockMultipleAssignmentsContext extends ParserRuleContext {
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,0);
		}
		public GeneralValueElementsContext generalValueElements() {
			return getRuleContext(GeneralValueElementsContext.class,0);
		}
		public TerminalNode End() { return getToken(TParser.End, 0); }
		public TerminalNode Attr() { return getToken(TParser.Attr, 0); }
		public TerminalNode AssignmentOperator() { return getToken(TParser.AssignmentOperator, 0); }
		public BlockMultipleAssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockMultipleAssignments; }
	}

	public final BlockMultipleAssignmentsContext blockMultipleAssignments() throws RecognitionException {
		BlockMultipleAssignmentsContext _localctx = new BlockMultipleAssignmentsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockMultipleAssignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			variableMultipleAssignmentsModes();
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==Attr || _la==AssignmentOperator) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(754);
			generalValueElements();
			setState(755);
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
		public List<VariableMultipleAssignmentsModesContext> variableMultipleAssignmentsModes() {
			return getRuleContexts(VariableMultipleAssignmentsModesContext.class);
		}
		public VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes(int i) {
			return getRuleContext(VariableMultipleAssignmentsModesContext.class,i);
		}
		public List<TerminalNode> Attr() { return getTokens(TParser.Attr); }
		public TerminalNode Attr(int i) {
			return getToken(TParser.Attr, i);
		}
		public List<TerminalNode> AssignmentOperator() { return getTokens(TParser.AssignmentOperator); }
		public TerminalNode AssignmentOperator(int i) {
			return getToken(TParser.AssignmentOperator, i);
		}
		public VariableMultipleAssignmentsModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableMultipleAssignmentsModes; }
	}

	public final VariableMultipleAssignmentsModesContext variableMultipleAssignmentsModes() throws RecognitionException {
		VariableMultipleAssignmentsModesContext _localctx = new VariableMultipleAssignmentsModesContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_variableMultipleAssignmentsModes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			generalValue();
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(758);
					_la = _input.LA(1);
					if ( !(_la==Attr || _la==AssignmentOperator) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(759);
					variableMultipleAssignmentsModes();
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 140, RULE_blockAccessArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
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
		enterRule(_localctx, 142, RULE_arrayAccessElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			arrayAccessElementsItems();
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(768);
					arrayAccessElements();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
		public AccessBlockArContext accessBlockAr() {
			return getRuleContext(AccessBlockArContext.class,0);
		}
		public TerminalNode Point() { return getToken(TParser.Point, 0); }
		public TerminalNode TwoTwoPoint() { return getToken(TParser.TwoTwoPoint, 0); }
		public FirstIncDecContext firstIncDec() {
			return getRuleContext(FirstIncDecContext.class,0);
		}
		public LastIncDecContext lastIncDec() {
			return getRuleContext(LastIncDecContext.class,0);
		}
		public ArrayAccessElementsItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccessElementsItems; }
	}

	public final ArrayAccessElementsItemsContext arrayAccessElementsItems() throws RecognitionException {
		ArrayAccessElementsItemsContext _localctx = new ArrayAccessElementsItemsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arrayAccessElementsItems);
		int _la;
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				identifier();
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(775);
					accessBlockAr();
					}
					break;
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(778);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(781);
					firstIncDec();
					}
				}

				setState(784);
				identifier();
				setState(786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(785);
					accessBlockAr();
					}
					break;
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(788);
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				identifier();
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(792);
					accessBlockAr();
					}
					break;
				}
				setState(796);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(795);
					lastIncDec();
					}
					break;
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(798);
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
		enterRule(_localctx, 146, RULE_accessBlockAr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(OpenArIndex);
			setState(804);
			arrayIndexAccess();
			setState(805);
			match(CloseArIndex);
			setState(809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(806);
					accessBlockAr();
					}
					} 
				}
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
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
		enterRule(_localctx, 148, RULE_arrayIndexAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
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
		enterRule(_localctx, 150, RULE_firstIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
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
		enterRule(_localctx, 152, RULE_lastIncDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
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
		enterRule(_localctx, 154, RULE_blockPermissionTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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
		enterRule(_localctx, 156, RULE_codeBlockFlowControl);
		try {
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(OpenBlock);
				setState(821);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(OpenBlock);
				setState(823);
				sentences();
				setState(824);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
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
		enterRule(_localctx, 158, RULE_codeBlockFlowControlElements);
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				functionCall();
				setState(830);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(835);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(836);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
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
		enterRule(_localctx, 160, RULE_codeBlockControl);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				match(OpenBlock);
				setState(841);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(842);
				match(OpenBlock);
				setState(843);
				sentences();
				setState(844);
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
		public BlockAnonymousObjectContext blockAnonymousObject() {
			return getRuleContext(BlockAnonymousObjectContext.class,0);
		}
		public BlockCascadingMethodAttrContext blockCascadingMethodAttr() {
			return getRuleContext(BlockCascadingMethodAttrContext.class,0);
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
		enterRule(_localctx, 162, RULE_generalValue);
		int _la;
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(848);
					match(Not);
					}
				}

				setState(851);
				identifier();
				setState(852);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(853);
				identifierB();
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(854);
					match(TypeSpec);
					}
				}

				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(857);
					match(ArithmeticOperator);
					}
				}

				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(860);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(864);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(863);
						match(Not);
						}
					}

					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(866);
						incDecOperatorsA();
						}
					}

					setState(869);
					identifier();
					setState(871);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						setState(870);
						incDecOperatorsB();
						}
						break;
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(873);
						match(TypeSpec);
						}
					}

					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(876);
						match(ArithmeticOperator);
						}
					}

					setState(880);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(879);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(882);
						match(Not);
						}
					}

					setState(885);
					match(Integer);
					setState(887);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(886);
						match(TypeSpec);
						}
					}

					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(889);
						match(ArithmeticOperator);
						}
					}

					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(892);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(895);
						match(Not);
						}
					}

					setState(898);
					match(Float);
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(899);
						match(TypeSpec);
						}
					}

					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(902);
						match(ArithmeticOperator);
						}
					}

					setState(906);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(905);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(908);
						match(Not);
						}
					}

					setState(911);
					match(String);
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeSpec) {
						{
						setState(912);
						match(TypeSpec);
						}
					}

					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(915);
						match(ArithmeticOperator);
						}
					}

					setState(919);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(918);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(923);
					match(Not);
					}
				}

				setState(926);
				functionCall();
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(927);
					match(TypeSpec);
					}
				}

				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(930);
					match(ArithmeticOperator);
					}
				}

				setState(934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(933);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(936);
					match(Not);
					}
				}

				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(939);
					incDecOperatorsA();
					}
				}

				setState(942);
				blockArray();
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(943);
					incDecOperatorsB();
					}
					break;
				}
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(946);
					match(TypeSpec);
					}
				}

				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(949);
					match(ArithmeticOperator);
					}
				}

				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(952);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(955);
				blockFunctionDeclarationAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(956);
				blockClassDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(957);
				blockLambdaFunctions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(958);
				blockAccessArrayElements();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(959);
				blockAnonymousObject();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(960);
				blockCascadingMethodAttr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(965);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(961);
					match(OpenBlock);
					setState(962);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(963);
					match(OpenArIndex);
					setState(964);
					match(CloseArIndex);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(967);
					match(Not);
					}
				}

				setState(970);
				generalValueBlock();
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(971);
					match(TypeSpec);
					}
				}

				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(974);
					match(ArithmeticOperator);
					}
				}

				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(977);
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
		enterRule(_localctx, 164, RULE_generalValueBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(OpenOp);
			setState(983);
			generalValueItems();
			setState(984);
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
		enterRule(_localctx, 166, RULE_generalValueItems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			generalValue();
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(987);
					generalValueItems();
					}
					} 
				}
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		enterRule(_localctx, 168, RULE_generalValueElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			generalValue();
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(994);
					generalValueElements();
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
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
		enterRule(_localctx, 170, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
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
		enterRule(_localctx, 172, RULE_identifierB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
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
		enterRule(_localctx, 174, RULE_identifierC);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
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
		enterRule(_localctx, 176, RULE_identifierD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
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
		enterRule(_localctx, 178, RULE_incDecOperatorsA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
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
		enterRule(_localctx, 180, RULE_incDecOperatorsB);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
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
		enterRule(_localctx, 182, RULE_openOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
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
		enterRule(_localctx, 184, RULE_closeOpA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u03fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c5\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00da\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u00e2\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00ed"+
		"\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00f7\n\n\3\n\3\n\3\n\7\n\u00fc"+
		"\n\n\f\n\16\n\u00ff\13\n\3\13\3\13\3\13\3\13\5\13\u0105\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u010c\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0116\n"+
		"\r\3\16\3\16\3\16\7\16\u011b\n\16\f\16\16\16\u011e\13\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\5\20\u0126\n\20\3\20\5\20\u0129\n\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\7\22\u0131\n\22\f\22\16\22\u0134\13\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0145"+
		"\n\27\3\27\3\27\3\30\3\30\3\31\5\31\u014c\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0154\n\31\3\32\3\32\3\33\3\33\3\33\5\33\u015b\n\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\36\5\36\u0164\n\36\3\37\3\37\5\37\u0168\n\37"+
		"\3 \3 \5 \u016c\n \3!\3!\3!\7!\u0171\n!\f!\16!\u0174\13!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\5$\u017e\n$\3%\3%\3%\3&\3&\5&\u0185\n&\3&\3&\5&\u0189\n"+
		"&\3&\3&\3\'\3\'\3(\3(\3(\5(\u0192\n(\3(\3(\5(\u0196\n(\3(\3(\3(\3(\5("+
		"\u019c\n(\5(\u019e\n(\3(\3(\3(\3(\5(\u01a4\n(\3(\3(\3(\3(\3(\5(\u01ab"+
		"\n(\3(\3(\5(\u01af\n(\3(\3(\3(\3(\5(\u01b5\n(\5(\u01b7\n(\3(\3(\5(\u01bb"+
		"\n(\5(\u01bd\n(\3)\3)\3)\5)\u01c2\n)\3)\3)\5)\u01c6\n)\3)\3)\3)\3)\5)"+
		"\u01cc\n)\5)\u01ce\n)\3)\3)\3)\3)\5)\u01d4\n)\3)\3)\3)\3)\5)\u01da\n)"+
		"\3)\3)\5)\u01de\n)\3)\3)\3)\3)\5)\u01e4\n)\5)\u01e6\n)\3)\5)\u01e9\n)"+
		"\3*\3*\3*\3*\5*\u01ef\n*\3+\3+\3,\3,\3-\3-\3-\3-\5-\u01f9\n-\3-\3-\3."+
		"\3.\3/\3/\3/\3/\5/\u0203\n/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u020d"+
		"\n\61\3\61\3\61\5\61\u0211\n\61\3\61\3\61\5\61\u0215\n\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u021d\n\61\3\61\3\61\5\61\u0221\n\61\3\61\5\61"+
		"\u0224\n\61\3\61\5\61\u0227\n\61\3\62\3\62\3\62\3\62\5\62\u022d\n\62\3"+
		"\62\3\62\5\62\u0231\n\62\3\62\3\62\5\62\u0235\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u023d\n\62\3\62\3\62\5\62\u0241\n\62\3\62\5\62\u0244\n"+
		"\62\3\63\3\63\5\63\u0248\n\63\3\63\3\63\5\63\u024c\n\63\3\63\3\63\5\63"+
		"\u0250\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u025a\n\66\3"+
		"\67\3\67\3\67\3\67\38\38\38\78\u0263\n8\f8\168\u0266\138\39\39\39\39\3"+
		":\3:\3:\3:\3:\7:\u0271\n:\f:\16:\u0274\13:\3;\3;\5;\u0278\n;\3;\3;\3;"+
		"\3;\5;\u027e\n;\5;\u0280\n;\3;\3;\3;\3<\3<\5<\u0287\n<\3<\3<\7<\u028b"+
		"\n<\f<\16<\u028e\13<\3=\3=\5=\u0292\n=\3>\3>\3>\5>\u0297\n>\3>\3>\3>\3"+
		"?\3?\3?\5?\u029f\n?\3?\3?\5?\u02a3\n?\3?\3?\3?\3?\3?\3?\5?\u02ab\n?\3"+
		"?\3?\3?\5?\u02b0\n?\3@\3@\3@\7@\u02b5\n@\f@\16@\u02b8\13@\3A\3A\3A\3B"+
		"\3B\3B\5B\u02c0\nB\3B\5B\u02c3\nB\3B\3B\7B\u02c7\nB\fB\16B\u02ca\13B\3"+
		"C\3C\3C\3C\3C\5C\u02d1\nC\3C\3C\3C\3C\3C\3C\5C\u02d9\nC\3C\3C\5C\u02dd"+
		"\nC\3D\3D\3D\3E\3E\3E\5E\u02e5\nE\3E\3E\5E\u02e9\nE\3E\3E\3E\7E\u02ee"+
		"\nE\fE\16E\u02f1\13E\3F\3F\3F\3F\3F\3G\3G\3G\7G\u02fb\nG\fG\16G\u02fe"+
		"\13G\3H\3H\3I\3I\7I\u0304\nI\fI\16I\u0307\13I\3J\3J\5J\u030b\nJ\3J\5J"+
		"\u030e\nJ\3J\5J\u0311\nJ\3J\3J\5J\u0315\nJ\3J\5J\u0318\nJ\3J\3J\5J\u031c"+
		"\nJ\3J\5J\u031f\nJ\3J\5J\u0322\nJ\5J\u0324\nJ\3K\3K\3K\3K\7K\u032a\nK"+
		"\fK\16K\u032d\13K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u033e"+
		"\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0349\nQ\3R\3R\3R\3R\3R\3R\5R\u0351"+
		"\nR\3S\5S\u0354\nS\3S\3S\3S\3S\5S\u035a\nS\3S\5S\u035d\nS\3S\5S\u0360"+
		"\nS\3S\5S\u0363\nS\3S\5S\u0366\nS\3S\3S\5S\u036a\nS\3S\5S\u036d\nS\3S"+
		"\5S\u0370\nS\3S\5S\u0373\nS\3S\5S\u0376\nS\3S\3S\5S\u037a\nS\3S\5S\u037d"+
		"\nS\3S\5S\u0380\nS\3S\5S\u0383\nS\3S\3S\5S\u0387\nS\3S\5S\u038a\nS\3S"+
		"\5S\u038d\nS\3S\5S\u0390\nS\3S\3S\5S\u0394\nS\3S\5S\u0397\nS\3S\5S\u039a"+
		"\nS\5S\u039c\nS\3S\5S\u039f\nS\3S\3S\5S\u03a3\nS\3S\5S\u03a6\nS\3S\5S"+
		"\u03a9\nS\3S\5S\u03ac\nS\3S\5S\u03af\nS\3S\3S\5S\u03b3\nS\3S\5S\u03b6"+
		"\nS\3S\5S\u03b9\nS\3S\5S\u03bc\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u03c8"+
		"\nS\3S\5S\u03cb\nS\3S\3S\5S\u03cf\nS\3S\5S\u03d2\nS\3S\5S\u03d5\nS\5S"+
		"\u03d7\nS\3T\3T\3T\3T\3U\3U\7U\u03df\nU\fU\16U\u03e2\13U\3V\3V\7V\u03e6"+
		"\nV\fV\16V\u03e9\13V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3"+
		"^\3^\2\2_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\2\6\4\2\25\25\31\31\4\2\37\37,,\4\2  \"\"\4\2\13\17\30\30\2\u0453\2\u00bc"+
		"\3\2\2\2\4\u00c4\3\2\2\2\6\u00d9\3\2\2\2\b\u00e1\3\2\2\2\n\u00e3\3\2\2"+
		"\2\f\u00ec\3\2\2\2\16\u00ee\3\2\2\2\20\u00f0\3\2\2\2\22\u00f4\3\2\2\2"+
		"\24\u0104\3\2\2\2\26\u0108\3\2\2\2\30\u0115\3\2\2\2\32\u0117\3\2\2\2\34"+
		"\u011f\3\2\2\2\36\u0123\3\2\2\2 \u012a\3\2\2\2\"\u012e\3\2\2\2$\u0135"+
		"\3\2\2\2&\u0139\3\2\2\2(\u013c\3\2\2\2*\u013e\3\2\2\2,\u0140\3\2\2\2."+
		"\u0148\3\2\2\2\60\u014b\3\2\2\2\62\u0155\3\2\2\2\64\u015a\3\2\2\2\66\u015c"+
		"\3\2\2\28\u015e\3\2\2\2:\u0163\3\2\2\2<\u0167\3\2\2\2>\u016b\3\2\2\2@"+
		"\u016d\3\2\2\2B\u0175\3\2\2\2D\u0178\3\2\2\2F\u017b\3\2\2\2H\u017f\3\2"+
		"\2\2J\u0182\3\2\2\2L\u018c\3\2\2\2N\u01bc\3\2\2\2P\u01e8\3\2\2\2R\u01ea"+
		"\3\2\2\2T\u01f0\3\2\2\2V\u01f2\3\2\2\2X\u01f4\3\2\2\2Z\u01fc\3\2\2\2\\"+
		"\u01fe\3\2\2\2^\u0206\3\2\2\2`\u0226\3\2\2\2b\u0243\3\2\2\2d\u0245\3\2"+
		"\2\2f\u0253\3\2\2\2h\u0255\3\2\2\2j\u0259\3\2\2\2l\u025b\3\2\2\2n\u025f"+
		"\3\2\2\2p\u0267\3\2\2\2r\u026b\3\2\2\2t\u0275\3\2\2\2v\u0284\3\2\2\2x"+
		"\u0291\3\2\2\2z\u0293\3\2\2\2|\u02af\3\2\2\2~\u02b1\3\2\2\2\u0080\u02b9"+
		"\3\2\2\2\u0082\u02bc\3\2\2\2\u0084\u02cb\3\2\2\2\u0086\u02de\3\2\2\2\u0088"+
		"\u02e1\3\2\2\2\u008a\u02f2\3\2\2\2\u008c\u02f7\3\2\2\2\u008e\u02ff\3\2"+
		"\2\2\u0090\u0301\3\2\2\2\u0092\u0323\3\2\2\2\u0094\u0325\3\2\2\2\u0096"+
		"\u032e\3\2\2\2\u0098\u0330\3\2\2\2\u009a\u0332\3\2\2\2\u009c\u0334\3\2"+
		"\2\2\u009e\u033d\3\2\2\2\u00a0\u0348\3\2\2\2\u00a2\u0350\3\2\2\2\u00a4"+
		"\u03d6\3\2\2\2\u00a6\u03d8\3\2\2\2\u00a8\u03dc\3\2\2\2\u00aa\u03e3\3\2"+
		"\2\2\u00ac\u03ea\3\2\2\2\u00ae\u03ec\3\2\2\2\u00b0\u03ee\3\2\2\2\u00b2"+
		"\u03f0\3\2\2\2\u00b4\u03f2\3\2\2\2\u00b6\u03f4\3\2\2\2\u00b8\u03f6\3\2"+
		"\2\2\u00ba\u03f8\3\2\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\2\2\3\u00be"+
		"\3\3\2\2\2\u00bf\u00c5\5\6\4\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\5\4\3\2"+
		"\u00c2\u00c5\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\5\3\2\2\2\u00c6\u00da\5\n\6\2\u00c7"+
		"\u00da\5\20\t\2\u00c8\u00da\5\34\17\2\u00c9\u00da\5\36\20\2\u00ca\u00da"+
		"\5,\27\2\u00cb\u00da\5B\"\2\u00cc\u00da\5D#\2\u00cd\u00da\5F$\2\u00ce"+
		"\u00da\5N(\2\u00cf\u00da\5X-\2\u00d0\u00da\5\\/\2\u00d1\u00da\5`\61\2"+
		"\u00d2\u00da\5|?\2\u00d3\u00da\5z>\2\u00d4\u00da\5\u0086D\2\u00d5\u00da"+
		"\5\u008aF\2\u00d6\u00da\5\b\5\2\u00d7\u00da\5\u009cO\2\u00d8\u00da\5\u0080"+
		"A\2\u00d9\u00c6\3\2\2\2\u00d9\u00c7\3\2\2\2\u00d9\u00c8\3\2\2\2\u00d9"+
		"\u00c9\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cb\3\2\2\2\u00d9\u00cc\3\2"+
		"\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00ce\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9"+
		"\u00d0\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d3\3\2"+
		"\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\7\3\2\2\2\u00db\u00dc\7\'\2\2"+
		"\u00dc\u00e2\7(\2\2\u00dd\u00de\7\'\2\2\u00de\u00df\5\4\3\2\u00df\u00e0"+
		"\7(\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2"+
		"\t\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7\36\2"+
		"\2\u00e6\13\3\2\2\2\u00e7\u00ed\5\16\b\2\u00e8\u00e9\5\16\b\2\u00e9\u00ea"+
		"\7$\2\2\u00ea\u00eb\5\f\7\2\u00eb\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ed\r\3\2\2\2\u00ee\u00ef\7\65\2\2\u00ef\17\3\2\2\2\u00f0"+
		"\u00f1\7\4\2\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\7\36\2\2\u00f3\21\3\2"+
		"\2\2\u00f4\u00f6\5\24\13\2\u00f5\u00f7\t\2\2\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\5\u00aaV\2\u00f9\u00fa"+
		"\7$\2\2\u00fa\u00fc\5\22\n\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\23\3\2\2\2\u00ff\u00fd\3\2\2"+
		"\2\u0100\u0105\5\u00acW\2\u0101\u0102\5\u00acW\2\u0102\u0103\7\61\2\2"+
		"\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\t\3\2\2\u0107\25\3\2\2\2\u0108\u010b\5\u00acW\2\u0109"+
		"\u010a\t\4\2\2\u010a\u010c\5\u00aeX\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5\30\r\2\u010e\27\3\2\2\2\u010f"+
		"\u0110\7)\2\2\u0110\u0116\7*\2\2\u0111\u0112\7)\2\2\u0112\u0113\5\32\16"+
		"\2\u0113\u0114\7*\2\2\u0114\u0116\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0111"+
		"\3\2\2\2\u0116\31\3\2\2\2\u0117\u011c\5\u00a4S\2\u0118\u0119\7$\2\2\u0119"+
		"\u011b\5\32\16\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3"+
		"\2\2\2\u011c\u011d\3\2\2\2\u011d\33\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0120\7\t\2\2\u0120\u0121\5\u00aaV\2\u0121\u0122\7\36\2\2\u0122\35\3"+
		"\2\2\2\u0123\u0125\5 \21\2\u0124\u0126\5\"\22\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\5&\24\2\u0128\u0127\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\37\3\2\2\2\u012a\u012b\7\5\2\2\u012b\u012c"+
		"\5(\25\2\u012c\u012d\5*\26\2\u012d!\3\2\2\2\u012e\u0132\5$\23\2\u012f"+
		"\u0131\5\"\22\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133#\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136"+
		"\7\6\2\2\u0136\u0137\5(\25\2\u0137\u0138\5*\26\2\u0138%\3\2\2\2\u0139"+
		"\u013a\7\7\2\2\u013a\u013b\5*\26\2\u013b\'\3\2\2\2\u013c\u013d\5\u00aa"+
		"V\2\u013d)\3\2\2\2\u013e\u013f\5\u009eP\2\u013f+\3\2\2\2\u0140\u0144\7"+
		"\b\2\2\u0141\u0145\5\64\33\2\u0142\u0145\5\62\32\2\u0143\u0145\5\60\31"+
		"\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0147\5.\30\2\u0147-\3\2\2\2\u0148\u0149\5\u009eP\2\u0149"+
		"/\3\2\2\2\u014a\u014c\7)\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\5:\36\2\u014e\u014f\5\66\34\2\u014f\u0150\5"+
		"<\37\2\u0150\u0151\58\35\2\u0151\u0153\5> \2\u0152\u0154\7*\2\2\u0153"+
		"\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\61\3\2\2\2\u0155\u0156\5<\37"+
		"\2\u0156\63\3\2\2\2\u0157\u0158\7)\2\2\u0158\u015b\7*\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0159\3\2\2\2\u015b\65\3\2\2\2\u015c"+
		"\u015d\7\36\2\2\u015d\67\3\2\2\2\u015e\u015f\7\36\2\2\u015f9\3\2\2\2\u0160"+
		"\u0161\7\4\2\2\u0161\u0164\5\22\n\2\u0162\u0164\3\2\2\2\u0163\u0160\3"+
		"\2\2\2\u0163\u0162\3\2\2\2\u0164;\3\2\2\2\u0165\u0168\5\u00aaV\2\u0166"+
		"\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168=\3\2\2\2"+
		"\u0169\u016c\5@!\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a"+
		"\3\2\2\2\u016c?\3\2\2\2\u016d\u0172\5\u00aaV\2\u016e\u016f\7$\2\2\u016f"+
		"\u0171\5\u00aaV\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173A\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0176\7\26\2\2\u0176\u0177\7\36\2\2\u0177C\3\2\2\2\u0178\u0179\7\27\2"+
		"\2\u0179\u017a\7\36\2\2\u017aE\3\2\2\2\u017b\u017d\5H%\2\u017c\u017e\5"+
		"J&\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017eG\3\2\2\2\u017f\u0180"+
		"\7\32\2\2\u0180\u0181\5L\'\2\u0181I\3\2\2\2\u0182\u0184\7\33\2\2\u0183"+
		"\u0185\7)\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\5\u00acW\2\u0187\u0189\7*\2\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5L\'\2\u018bK\3\2\2\2\u018c"+
		"\u018d\5\u009eP\2\u018dM\3\2\2\2\u018e\u018f\7)\2\2\u018f\u0191\7\n\2"+
		"\2\u0190\u0192\5\u00acW\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\7)\2\2\u0194\u0196\5R*\2\u0195\u0194\3\2\2"+
		"\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019d\7*\2\2\u0198\u019b"+
		"\7\34\2\2\u0199\u019c\5\u00aeX\2\u019a\u019c\7\61\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019a\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0198\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5V,\2\u01a0\u01a1\7*\2"+
		"\2\u01a1\u01a3\7)\2\2\u01a2\u01a4\5T+\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7*\2\2\u01a6\u01a7\7\36\2\2\u01a7"+
		"\u01bd\3\2\2\2\u01a8\u01aa\7\n\2\2\u01a9\u01ab\5\u00acW\2\u01aa\u01a9"+
		"\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\7)\2\2\u01ad"+
		"\u01af\5R*\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2"+
		"\2\u01b0\u01b6\7*\2\2\u01b1\u01b4\7\34\2\2\u01b2\u01b5\5\u00aeX\2\u01b3"+
		"\u01b5\7\61\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b7\3"+
		"\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01bb\5V,\2\u01b9\u01bb\7\36\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u018e\3\2\2\2\u01bc\u01a8\3\2\2\2\u01bd"+
		"O\3\2\2\2\u01be\u01bf\7)\2\2\u01bf\u01c1\7\n\2\2\u01c0\u01c2\5\u00acW"+
		"\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5"+
		"\7)\2\2\u01c4\u01c6\5R*\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01cd\7*\2\2\u01c8\u01cb\7\34\2\2\u01c9\u01cc\5\u00ae"+
		"X\2\u01ca\u01cc\7\61\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01c8\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d0\5V,\2\u01d0\u01d1\7*\2\2\u01d1\u01d3\7)\2\2\u01d2\u01d4"+
		"\5T+\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\7*\2\2\u01d6\u01e9\3\2\2\2\u01d7\u01d9\7\n\2\2\u01d8\u01da\5\u00ac"+
		"W\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dd\7)\2\2\u01dc\u01de\5R*\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01e5\7*\2\2\u01e0\u01e3\7\34\2\2\u01e1\u01e4"+
		"\5\u00aeX\2\u01e2\u01e4\7\61\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2"+
		"\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e9\5V,\2\u01e8\u01be\3\2\2\2\u01e8\u01d7\3\2\2\2\u01e9"+
		"Q\3\2\2\2\u01ea\u01eb\7/\2\2\u01eb\u01ee\7\61\2\2\u01ec\u01ed\7$\2\2\u01ed"+
		"\u01ef\5R*\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01efS\3\2\2\2\u01f0"+
		"\u01f1\5\u00aaV\2\u01f1U\3\2\2\2\u01f2\u01f3\5\u00a2R\2\u01f3W\3\2\2\2"+
		"\u01f4\u01f5\7\20\2\2\u01f5\u01f8\5\u00acW\2\u01f6\u01f7\7\22\2\2\u01f7"+
		"\u01f9\5\u00aeX\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\5Z.\2\u01fbY\3\2\2\2\u01fc\u01fd\5\u00a2R\2\u01fd"+
		"[\3\2\2\2\u01fe\u01ff\7\21\2\2\u01ff\u0202\5\u00acW\2\u0200\u0201\7\22"+
		"\2\2\u0201\u0203\5\u00aeX\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\5^\60\2\u0205]\3\2\2\2\u0206\u0207\5\u00a2"+
		"R\2\u0207_\3\2\2\2\u0208\u0209\5\u00b8]\2\u0209\u020a\7\25\2\2\u020a\u020c"+
		"\7\23\2\2\u020b\u020d\5\u00acW\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u0210\3\2\2\2\u020e\u020f\7\22\2\2\u020f\u0211\5\u00aeX\2\u0210"+
		"\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0213\7\24"+
		"\2\2\u0213\u0215\5\u00b0Y\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\5h\65\2\u0217\u0220\5\u00ba^\2\u0218\u0219"+
		"\t\4\2\2\u0219\u021a\5\u00b2Z\2\u021a\u021c\7)\2\2\u021b\u021d\5\u00aa"+
		"V\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\7*\2\2\u021f\u0221\3\2\2\2\u0220\u0218\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u0224\7\36\2\2\u0223\u0222\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0227\5d\63\2\u0226\u0208\3\2"+
		"\2\2\u0226\u0225\3\2\2\2\u0227a\3\2\2\2\u0228\u0229\5\u00b8]\2\u0229\u022a"+
		"\7\25\2\2\u022a\u022c\7\23\2\2\u022b\u022d\5\u00acW\2\u022c\u022b\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022f\7\22\2\2\u022f"+
		"\u0231\5\u00aeX\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0234"+
		"\3\2\2\2\u0232\u0233\7\24\2\2\u0233\u0235\5\u00b0Y\2\u0234\u0232\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\5h\65\2\u0237\u0240"+
		"\5\u00ba^\2\u0238\u0239\t\4\2\2\u0239\u023a\5\u00b2Z\2\u023a\u023c\7)"+
		"\2\2\u023b\u023d\5\u00aaV\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023f\7*\2\2\u023f\u0241\3\2\2\2\u0240\u0238\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0244\5d\63\2\u0243"+
		"\u0228\3\2\2\2\u0243\u0242\3\2\2\2\u0244c\3\2\2\2\u0245\u0247\7\23\2\2"+
		"\u0246\u0248\5\u00acW\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u024a\7\22\2\2\u024a\u024c\5\u00aeX\2\u024b\u0249"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024e\7\24\2\2"+
		"\u024e\u0250\5\u00b0Y\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\5h\65\2\u0252e\3\2\2\2\u0253\u0254\5\u00aa"+
		"V\2\u0254g\3\2\2\2\u0255\u0256\5\u00a2R\2\u0256i\3\2\2\2\u0257\u025a\5"+
		"l\67\2\u0258\u025a\5p9\2\u0259\u0257\3\2\2\2\u0259\u0258\3\2\2\2\u025a"+
		"k\3\2\2\2\u025b\u025c\7%\2\2\u025c\u025d\5n8\2\u025d\u025e\7&\2\2\u025e"+
		"m\3\2\2\2\u025f\u0264\5\u00aaV\2\u0260\u0261\7$\2\2\u0261\u0263\5n8\2"+
		"\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265o\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\7\'\2\2\u0268"+
		"\u0269\5r:\2\u0269\u026a\7(\2\2\u026aq\3\2\2\2\u026b\u026c\5\u00acW\2"+
		"\u026c\u026d\7!\2\2\u026d\u0272\5\u00aaV\2\u026e\u026f\7$\2\2\u026f\u0271"+
		"\5r:\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273s\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0277\7)\2\2\u0276"+
		"\u0278\5v<\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2"+
		"\2\u0279\u027f\7*\2\2\u027a\u027d\7\34\2\2\u027b\u027e\5\u00acW\2\u027c"+
		"\u027e\7\61\2\2\u027d\u027b\3\2\2\2\u027d\u027c\3\2\2\2\u027e\u0280\3"+
		"\2\2\2\u027f\u027a\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\7\35\2\2\u0282\u0283\5x=\2\u0283u\3\2\2\2\u0284\u0286\5\u00acW"+
		"\2\u0285\u0287\7\61\2\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u028c\3\2\2\2\u0288\u0289\7$\2\2\u0289\u028b\5v<\2\u028a\u0288\3\2\2"+
		"\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028dw"+
		"\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0292\5\u00a2R\2\u0290\u0292\5\u00aa"+
		"V\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292y\3\2\2\2\u0293\u0294"+
		"\5\u00acW\2\u0294\u0296\7)\2\2\u0295\u0297\5R*\2\u0296\u0295\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7*\2\2\u0299\u029a\5\u00a2"+
		"R\2\u029a{\3\2\2\2\u029b\u029e\5\u00acW\2\u029c\u029d\t\4\2\2\u029d\u029f"+
		"\5\u00aeX\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2"+
		"\2\u02a0\u02a2\7)\2\2\u02a1\u02a3\5~@\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3"+
		"\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\7*\2\2\u02a5\u02a6\7\36\2\2\u02a6"+
		"\u02b0\3\2\2\2\u02a7\u02a8\5\u008eH\2\u02a8\u02aa\7)\2\2\u02a9\u02ab\5"+
		"~@\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ad\7*\2\2\u02ad\u02ae\7\36\2\2\u02ae\u02b0\3\2\2\2\u02af\u029b\3\2"+
		"\2\2\u02af\u02a7\3\2\2\2\u02b0}\3\2\2\2\u02b1\u02b6\5\u00aaV\2\u02b2\u02b3"+
		"\7$\2\2\u02b3\u02b5\5~@\2\u02b4\u02b2\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\177\3\2\2\2\u02b8\u02b6\3\2\2"+
		"\2\u02b9\u02ba\5\u0082B\2\u02ba\u02bb\7\36\2\2\u02bb\u0081\3\2\2\2\u02bc"+
		"\u02c2\5\u008eH\2\u02bd\u02bf\7)\2\2\u02be\u02c0\5~@\2\u02bf\u02be\3\2"+
		"\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\7*\2\2\u02c2"+
		"\u02bd\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c8\3\2\2\2\u02c4\u02c5\7#"+
		"\2\2\u02c5\u02c7\5\u0082B\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u0083\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02cb\u02cc\7)\2\2\u02cc\u02cd\7\25\2\2\u02cd\u02ce\5\u00acW\2\u02ce"+
		"\u02d0\7)\2\2\u02cf\u02d1\5\u00aaV\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3"+
		"\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7*\2\2\u02d3\u02dc\7*\2\2\u02d4"+
		"\u02d5\t\4\2\2\u02d5\u02d6\5\u00aeX\2\u02d6\u02d8\7)\2\2\u02d7\u02d9\5"+
		"\u00aaV\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2"+
		"\u02da\u02db\7*\2\2\u02db\u02dd\3\2\2\2\u02dc\u02d4\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u0085\3\2\2\2\u02de\u02df\5\u0088E\2\u02df\u02e0\7\36\2"+
		"\2\u02e0\u0087\3\2\2\2\u02e1\u02e4\5\u00acW\2\u02e2\u02e3\t\4\2\2\u02e3"+
		"\u02e5\5\u00aeX\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6"+
		"\3\2\2\2\u02e6\u02e8\t\3\2\2\u02e7\u02e9\t\2\2\2\u02e8\u02e7\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ef\5\u00aaV\2\u02eb\u02ec"+
		"\7$\2\2\u02ec\u02ee\5\u0088E\2\u02ed\u02eb\3\2\2\2\u02ee\u02f1\3\2\2\2"+
		"\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u0089\3\2\2\2\u02f1\u02ef"+
		"\3\2\2\2\u02f2\u02f3\5\u008cG\2\u02f3\u02f4\t\3\2\2\u02f4\u02f5\5\u00aa"+
		"V\2\u02f5\u02f6\7\36\2\2\u02f6\u008b\3\2\2\2\u02f7\u02fc\5\u00a4S\2\u02f8"+
		"\u02f9\t\3\2\2\u02f9\u02fb\5\u008cG\2\u02fa\u02f8\3\2\2\2\u02fb\u02fe"+
		"\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u008d\3\2\2\2\u02fe"+
		"\u02fc\3\2\2\2\u02ff\u0300\5\u0090I\2\u0300\u008f\3\2\2\2\u0301\u0305"+
		"\5\u0092J\2\u0302\u0304\5\u0090I\2\u0303\u0302\3\2\2\2\u0304\u0307\3\2"+
		"\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0091\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0308\u030a\5\u00acW\2\u0309\u030b\5\u0094K\2\u030a\u0309"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030e\t\4\2\2\u030d"+
		"\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0324\3\2\2\2\u030f\u0311\5\u0098"+
		"M\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"\u0314\5\u00acW\2\u0313\u0315\5\u0094K\2\u0314\u0313\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0318\t\4\2\2\u0317\u0316\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0324\3\2\2\2\u0319\u031b\5\u00acW\2\u031a\u031c"+
		"\5\u0094K\2\u031b\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2"+
		"\2\u031d\u031f\5\u009aN\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u0322\t\4\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0324\3\2\2\2\u0323\u0308\3\2\2\2\u0323\u0310\3\2\2\2\u0323"+
		"\u0319\3\2\2\2\u0324\u0093\3\2\2\2\u0325\u0326\7%\2\2\u0326\u0327\5\u0096"+
		"L\2\u0327\u032b\7&\2\2\u0328\u032a\5\u0094K\2\u0329\u0328\3\2\2\2\u032a"+
		"\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0095\3\2"+
		"\2\2\u032d\u032b\3\2\2\2\u032e\u032f\5\u00aaV\2\u032f\u0097\3\2\2\2\u0330"+
		"\u0331\7.\2\2\u0331\u0099\3\2\2\2\u0332\u0333\7.\2\2\u0333\u009b\3\2\2"+
		"\2\u0334\u0335\t\5\2\2\u0335\u009d\3\2\2\2\u0336\u0337\7\'\2\2\u0337\u033e"+
		"\7(\2\2\u0338\u0339\7\'\2\2\u0339\u033a\5\4\3\2\u033a\u033b\7(\2\2\u033b"+
		"\u033e\3\2\2\2\u033c\u033e\5\u00a0Q\2\u033d\u0336\3\2\2\2\u033d\u0338"+
		"\3\2\2\2\u033d\u033c\3\2\2\2\u033e\u009f\3\2\2\2\u033f\u0340\5\26\f\2"+
		"\u0340\u0341\7\36\2\2\u0341\u0349\3\2\2\2\u0342\u0349\5\34\17\2\u0343"+
		"\u0349\5\36\20\2\u0344\u0349\5,\27\2\u0345\u0349\5F$\2\u0346\u0349\5B"+
		"\"\2\u0347\u0349\5D#\2\u0348\u033f\3\2\2\2\u0348\u0342\3\2\2\2\u0348\u0343"+
		"\3\2\2\2\u0348\u0344\3\2\2\2\u0348\u0345\3\2\2\2\u0348\u0346\3\2\2\2\u0348"+
		"\u0347\3\2\2\2\u0349\u00a1\3\2\2\2\u034a\u034b\7\'\2\2\u034b\u0351\7("+
		"\2\2\u034c\u034d\7\'\2\2\u034d\u034e\5\4\3\2\u034e\u034f\7(\2\2\u034f"+
		"\u0351\3\2\2\2\u0350\u034a\3\2\2\2\u0350\u034c\3\2\2\2\u0351\u00a3\3\2"+
		"\2\2\u0352\u0354\7-\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\5\u00acW\2\u0356\u0357\t\4\2\2\u0357\u0359"+
		"\5\u00aeX\2\u0358\u035a\7\61\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2"+
		"\2\u035a\u035c\3\2\2\2\u035b\u035d\7+\2\2\u035c\u035b\3\2\2\2\u035c\u035d"+
		"\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0360\7,\2\2\u035f\u035e\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u03d7\3\2\2\2\u0361\u0363\7-\2\2\u0362\u0361\3\2"+
		"\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366\5\u00b4[\2\u0365"+
		"\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\5\u00ac"+
		"W\2\u0368\u036a\5\u00b6\\\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u036c\3\2\2\2\u036b\u036d\7\61\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3"+
		"\2\2\2\u036d\u036f\3\2\2\2\u036e\u0370\7+\2\2\u036f\u036e\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u0373\7,\2\2\u0372\u0371\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u039c\3\2\2\2\u0374\u0376\7-\2\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379\7\63"+
		"\2\2\u0378\u037a\7\61\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037c\3\2\2\2\u037b\u037d\7+\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2"+
		"\2\2\u037d\u037f\3\2\2\2\u037e\u0380\7,\2\2\u037f\u037e\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u039c\3\2\2\2\u0381\u0383\7-\2\2\u0382\u0381\3\2"+
		"\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\7\64\2\2\u0385"+
		"\u0387\7\61\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0389\3"+
		"\2\2\2\u0388\u038a\7+\2\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038c\3\2\2\2\u038b\u038d\7,\2\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2"+
		"\2\2\u038d\u039c\3\2\2\2\u038e\u0390\7-\2\2\u038f\u038e\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\7\65\2\2\u0392\u0394\7"+
		"\61\2\2\u0393\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0396\3\2\2\2\u0395"+
		"\u0397\7+\2\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399\3\2"+
		"\2\2\u0398\u039a\7,\2\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039c\3\2\2\2\u039b\u0362\3\2\2\2\u039b\u0375\3\2\2\2\u039b\u0382\3\2"+
		"\2\2\u039b\u038f\3\2\2\2\u039c\u03d7\3\2\2\2\u039d\u039f\7-\2\2\u039e"+
		"\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\5\26"+
		"\f\2\u03a1\u03a3\7\61\2\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u03a5\3\2\2\2\u03a4\u03a6\7+\2\2\u03a5\u03a4\3\2\2\2\u03a5\u03a6\3\2"+
		"\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a9\7,\2\2\u03a8\u03a7\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03d7\3\2\2\2\u03aa\u03ac\7-\2\2\u03ab\u03aa\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03af\5\u00b4[\2\u03ae"+
		"\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\5j"+
		"\66\2\u03b1\u03b3\5\u00b6\\\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2"+
		"\u03b3\u03b5\3\2\2\2\u03b4\u03b6\7\61\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b9\7+\2\2\u03b8\u03b7\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03bc\7,\2\2\u03bb\u03ba\3\2"+
		"\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03d7\3\2\2\2\u03bd\u03d7\5P)\2\u03be\u03d7"+
		"\5b\62\2\u03bf\u03d7\5t;\2\u03c0\u03d7\5\u008eH\2\u03c1\u03d7\5\u0084"+
		"C\2\u03c2\u03d7\5\u0082B\2\u03c3\u03c4\7\'\2\2\u03c4\u03c8\7(\2\2\u03c5"+
		"\u03c6\7%\2\2\u03c6\u03c8\7&\2\2\u03c7\u03c3\3\2\2\2\u03c7\u03c5\3\2\2"+
		"\2\u03c8\u03d7\3\2\2\2\u03c9\u03cb\7-\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\5\u00a6T\2\u03cd\u03cf\7\61\2"+
		"\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03d2"+
		"\7+\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3"+
		"\u03d5\7,\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2"+
		"\2\2\u03d6\u0353\3\2\2\2\u03d6\u039b\3\2\2\2\u03d6\u039e\3\2\2\2\u03d6"+
		"\u03ab\3\2\2\2\u03d6\u03bd\3\2\2\2\u03d6\u03be\3\2\2\2\u03d6\u03bf\3\2"+
		"\2\2\u03d6\u03c0\3\2\2\2\u03d6\u03c1\3\2\2\2\u03d6\u03c2\3\2\2\2\u03d6"+
		"\u03c7\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d7\u00a5\3\2\2\2\u03d8\u03d9\7)"+
		"\2\2\u03d9\u03da\5\u00a8U\2\u03da\u03db\7*\2\2\u03db\u00a7\3\2\2\2\u03dc"+
		"\u03e0\5\u00a4S\2\u03dd\u03df\5\u00a8U\2\u03de\u03dd\3\2\2\2\u03df\u03e2"+
		"\3\2\2\2\u03e0\u03de\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u00a9\3\2\2\2\u03e2"+
		"\u03e0\3\2\2\2\u03e3\u03e7\5\u00a4S\2\u03e4\u03e6\5\u00aaV\2\u03e5\u03e4"+
		"\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u00ab\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\7/\2\2\u03eb\u00ad\3\2"+
		"\2\2\u03ec\u03ed\7/\2\2\u03ed\u00af\3\2\2\2\u03ee\u03ef\7/\2\2\u03ef\u00b1"+
		"\3\2\2\2\u03f0\u03f1\7/\2\2\u03f1\u00b3\3\2\2\2\u03f2\u03f3\7.\2\2\u03f3"+
		"\u00b5\3\2\2\2\u03f4\u03f5\7.\2\2\u03f5\u00b7\3\2\2\2\u03f6\u03f7\7)\2"+
		"\2\u03f7\u00b9\3\2\2\2\u03f8\u03f9\7*\2\2\u03f9\u00bb\3\2\2\2\u0092\u00c4"+
		"\u00d9\u00e1\u00ec\u00f6\u00fd\u0104\u010b\u0115\u011c\u0125\u0128\u0132"+
		"\u0144\u014b\u0153\u015a\u0163\u0167\u016b\u0172\u017d\u0184\u0188\u0191"+
		"\u0195\u019b\u019d\u01a3\u01aa\u01ae\u01b4\u01b6\u01ba\u01bc\u01c1\u01c5"+
		"\u01cb\u01cd\u01d3\u01d9\u01dd\u01e3\u01e5\u01e8\u01ee\u01f8\u0202\u020c"+
		"\u0210\u0214\u021c\u0220\u0223\u0226\u022c\u0230\u0234\u023c\u0240\u0243"+
		"\u0247\u024b\u024f\u0259\u0264\u0272\u0277\u027d\u027f\u0286\u028c\u0291"+
		"\u0296\u029e\u02a2\u02aa\u02af\u02b6\u02bf\u02c2\u02c8\u02d0\u02d8\u02dc"+
		"\u02e4\u02e8\u02ef\u02fc\u0305\u030a\u030d\u0310\u0314\u0317\u031b\u031e"+
		"\u0321\u0323\u032b\u033d\u0348\u0350\u0353\u0359\u035c\u035f\u0362\u0365"+
		"\u0369\u036c\u036f\u0372\u0375\u0379\u037c\u037f\u0382\u0386\u0389\u038c"+
		"\u038f\u0393\u0396\u0399\u039b\u039e\u03a2\u03a5\u03a8\u03ab\u03ae\u03b2"+
		"\u03b5\u03b8\u03bb\u03c7\u03ca\u03ce\u03d1\u03d4\u03d6\u03e0\u03e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}