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
		RULE_functionCall = 14, RULE_functionCallParam = 15, RULE_functionCallParamElements = 16, 
		RULE_blockRet = 17, RULE_blockConditional = 18, RULE_ifElementUnique = 19, 
		RULE_elifElements = 20, RULE_elifElementUnique = 21, RULE_elseElementUnique = 22, 
		RULE_conditionalBlockExpression = 23, RULE_conditionalBlockElements = 24, 
		RULE_blockLoop = 25, RULE_loopBlockElements = 26, RULE_loopComplete = 27, 
		RULE_loopConditional = 28, RULE_loopInfinite = 29, RULE_endOne = 30, RULE_endTwo = 31, 
		RULE_loopOneMembers = 32, RULE_loopTwoMembers = 33, RULE_loopThreeMembers = 34, 
		RULE_loopThreeMembersValues = 35, RULE_blockBreak = 36, RULE_blockNext = 37, 
		RULE_blockTryCatch = 38, RULE_tryUniqueElement = 39, RULE_catchUniqueElement = 40, 
		RULE_tryCatchElements = 41, RULE_blockFunction = 42, RULE_blockFunctionDeclarationAttr = 43, 
		RULE_functionParam = 44, RULE_functionAnonymousParam = 45, RULE_functionCodeBlock = 46, 
		RULE_blockInterface = 47, RULE_interfaceCodeBlock = 48, RULE_blockAbstraction = 49, 
		RULE_abstractionCodeBlock = 50, RULE_blockClass = 51, RULE_blockClassDeclarationAttr = 52, 
		RULE_classCommonDef = 53, RULE_classAnonymousParam = 54, RULE_classCodeBlock = 55, 
		RULE_blockArray = 56, RULE_indexArray = 57, RULE_indexArrayElements = 58, 
		RULE_associativeArray = 59, RULE_associativeArrayElements = 60, RULE_blockLambdaFunctions = 61, 
		RULE_lambdaFnParams = 62, RULE_lambdaFnCodeBlock = 63, RULE_blockClassConstructor = 64, 
		RULE_blockFunctionCall = 65, RULE_functionCallElements = 66, RULE_blockCascadingMethod = 67, 
		RULE_blockCascadingMethodAttr = 68, RULE_blockAnonymousObject = 69, RULE_blockAccessArrayElements = 70, 
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
			"blockAttribution", "attributionElements", "blockMultipleAssignments", 
			"variableMultipleAssignmentsModes", "functionCall", "functionCallParam", 
			"functionCallParamElements", "blockRet", "blockConditional", "ifElementUnique", 
			"elifElements", "elifElementUnique", "elseElementUnique", "conditionalBlockExpression", 
			"conditionalBlockElements", "blockLoop", "loopBlockElements", "loopComplete", 
			"loopConditional", "loopInfinite", "endOne", "endTwo", "loopOneMembers", 
			"loopTwoMembers", "loopThreeMembers", "loopThreeMembersValues", "blockBreak", 
			"blockNext", "blockTryCatch", "tryUniqueElement", "catchUniqueElement", 
			"tryCatchElements", "blockFunction", "blockFunctionDeclarationAttr", 
			"functionParam", "functionAnonymousParam", "functionCodeBlock", "blockInterface", 
			"interfaceCodeBlock", "blockAbstraction", "abstractionCodeBlock", "blockClass", 
			"blockClassDeclarationAttr", "classCommonDef", "classAnonymousParam", 
			"classCodeBlock", "blockArray", "indexArray", "indexArrayElements", "associativeArray", 
			"associativeArrayElements", "blockLambdaFunctions", "lambdaFnParams", 
			"lambdaFnCodeBlock", "blockClassConstructor", "blockFunctionCall", "functionCallElements", 
			"blockCascadingMethod", "blockCascadingMethodAttr", "blockAnonymousObject", 
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
		public BlockPermissionTokensContext blockPermissionTokens() {
			return getRuleContext(BlockPermissionTokensContext.class,0);
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
			setState(213);
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
				blockPermissionTokens();
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(215);
				match(OpenBlock);
				setState(216);
				match(CloseBlock);
				}
				break;
			case 2:
				{
				setState(217);
				match(OpenBlock);
				setState(218);
				sentences();
				setState(219);
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
			setState(223);
			match(Use);
			setState(224);
			useValue();
			setState(225);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				useString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				useString();
				setState(229);
				match(Separator);
				setState(230);
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
			setState(234);
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
			setState(236);
			match(Var);
			setState(237);
			variableItem();
			setState(238);
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
			setState(240);
			variablePrefixModes();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==New || _la==Await) {
				{
				setState(241);
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

			setState(244);
			generalValueElements();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(Separator);
					setState(246);
					variableItem();
					}
					} 
				}
				setState(251);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(252);
				identifier();
				}
				break;
			case 2:
				{
				setState(253);
				identifier();
				setState(254);
				match(TypeSpec);
				}
				break;
			}
			setState(258);
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
			setState(260);
			attributionElements();
			setState(261);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				identifier();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(264);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(265);
					identifierB();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(268);
					match(TypeSpec);
					}
				}

				setState(271);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New || _la==Await) {
					{
					setState(272);
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

				setState(275);
				generalValueElements();
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						match(Separator);
						setState(277);
						attributionElements();
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				generalValue();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeSpec) {
					{
					setState(284);
					match(TypeSpec);
					}
				}

				setState(287);
				_la = _input.LA(1);
				if ( !(_la==Attr || _la==AssignmentOperator) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==New || _la==Await) {
					{
					setState(288);
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

				setState(291);
				generalValueElements();
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(292);
						match(Separator);
						setState(293);
						attributionElements();
						}
						} 
					}
					setState(298);
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
			setState(301);
			variableMultipleAssignmentsModes();
			setState(302);
			match(Attr);
			setState(303);
			generalValueElements();
			setState(304);
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
			setState(306);
			generalValue();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(Attr);
					setState(308);
					variableMultipleAssignmentsModes();
					}
					} 
				}
				setState(313);
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				identifier();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(315);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(316);
					identifierB();
					}
				}

				setState(319);
				functionCallParam();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				blockAccessArrayElements();
				setState(322);
				match(OpenOp);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(323);
					functionCallElements();
					}
				}

				setState(326);
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
		enterRule(_localctx, 30, RULE_functionCallParam);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(OpenOp);
				setState(331);
				match(CloseOp);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(OpenOp);
				setState(333);
				functionCallParamElements();
				setState(334);
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
		enterRule(_localctx, 32, RULE_functionCallParamElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			generalValue();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					match(Separator);
					setState(340);
					functionCallParamElements();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 34, RULE_blockRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(Ret);
			setState(347);
			generalValueElements();
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
		enterRule(_localctx, 36, RULE_blockConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			ifElementUnique();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(351);
				elifElements();
				}
				break;
			}
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(354);
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
		enterRule(_localctx, 38, RULE_ifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(If);
			setState(358);
			conditionalBlockExpression();
			setState(359);
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
		enterRule(_localctx, 40, RULE_elifElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			elifElementUnique();
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					elifElements();
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 42, RULE_elifElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Elif);
			setState(369);
			conditionalBlockExpression();
			setState(370);
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
		enterRule(_localctx, 44, RULE_elseElementUnique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Else);
			setState(373);
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
		enterRule(_localctx, 46, RULE_conditionalBlockExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 48, RULE_conditionalBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
		enterRule(_localctx, 50, RULE_blockLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(For);
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(380);
				loopInfinite();
				}
				break;
			case 2:
				{
				setState(381);
				loopConditional();
				}
				break;
			case 3:
				{
				setState(382);
				loopComplete();
				}
				break;
			}
			setState(385);
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
		enterRule(_localctx, 52, RULE_loopBlockElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 54, RULE_loopComplete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(389);
				match(OpenOp);
				}
			}

			setState(392);
			loopOneMembers();
			setState(393);
			endOne();
			setState(394);
			loopTwoMembers();
			setState(395);
			endTwo();
			setState(396);
			loopThreeMembers();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(397);
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
		enterRule(_localctx, 56, RULE_loopConditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 58, RULE_loopInfinite);
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(OpenOp);
				setState(403);
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
			case IncDecOperators:
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
		enterRule(_localctx, 60, RULE_endOne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 62, RULE_endTwo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		enterRule(_localctx, 64, RULE_loopOneMembers);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(Var);
				setState(412);
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
		enterRule(_localctx, 66, RULE_loopTwoMembers);
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
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
		enterRule(_localctx, 68, RULE_loopThreeMembers);
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
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
		enterRule(_localctx, 70, RULE_loopThreeMembersValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			generalValueElements();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(425);
				match(Separator);
				setState(426);
				generalValueElements();
				}
				}
				setState(431);
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
		enterRule(_localctx, 72, RULE_blockBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(Break);
			setState(433);
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
		enterRule(_localctx, 74, RULE_blockNext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(Next);
			setState(436);
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
		enterRule(_localctx, 76, RULE_blockTryCatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			tryUniqueElement();
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(439);
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
		enterRule(_localctx, 78, RULE_tryUniqueElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(Try);
			setState(443);
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
		enterRule(_localctx, 80, RULE_catchUniqueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(Catch);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(446);
				match(OpenOp);
				}
			}

			setState(449);
			identifier();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseOp) {
				{
				setState(450);
				match(CloseOp);
				}
			}

			setState(453);
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
		enterRule(_localctx, 82, RULE_tryCatchElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
		enterRule(_localctx, 84, RULE_blockFunction);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(OpenOp);
				setState(458);
				match(Function);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(459);
					identifier();
					}
				}

				setState(462);
				match(OpenOp);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(463);
					functionParam();
					}
				}

				setState(466);
				match(CloseOp);
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(467);
					match(ArrowRight);
					setState(470);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(468);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(469);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(474);
				functionCodeBlock();
				setState(475);
				match(CloseOp);
				setState(476);
				match(OpenOp);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(477);
					functionAnonymousParam();
					}
				}

				setState(480);
				match(CloseOp);
				setState(481);
				match(End);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				match(Function);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(484);
					identifier();
					}
				}

				setState(487);
				match(OpenOp);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(488);
					functionParam();
					}
				}

				setState(491);
				match(CloseOp);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(492);
					match(ArrowRight);
					setState(495);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(493);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(494);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(501);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(499);
					functionCodeBlock();
					}
					break;
				case End:
					{
					setState(500);
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
		enterRule(_localctx, 86, RULE_blockFunctionDeclarationAttr);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(OpenOp);
				setState(506);
				match(Function);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(507);
					identifier();
					}
				}

				setState(510);
				match(OpenOp);
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(511);
					functionParam();
					}
				}

				setState(514);
				match(CloseOp);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(515);
					match(ArrowRight);
					setState(518);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(516);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(517);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(522);
				functionCodeBlock();
				setState(523);
				match(CloseOp);
				setState(524);
				match(OpenOp);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(525);
					functionAnonymousParam();
					}
				}

				setState(528);
				match(CloseOp);
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(530);
				match(Function);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(531);
					identifier();
					}
				}

				setState(534);
				match(OpenOp);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(535);
					functionParam();
					}
				}

				setState(538);
				match(CloseOp);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArrowRight) {
					{
					setState(539);
					match(ArrowRight);
					setState(542);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(540);
						identifierB();
						}
						break;
					case TypeSpec:
						{
						setState(541);
						match(TypeSpec);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(546);
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
		enterRule(_localctx, 88, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(Identifier);
			setState(550);
			match(TypeSpec);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Separator) {
				{
				setState(551);
				match(Separator);
				setState(552);
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
		enterRule(_localctx, 90, RULE_functionAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		enterRule(_localctx, 92, RULE_functionCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		enterRule(_localctx, 94, RULE_blockInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(Interface);
			setState(560);
			identifier();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(561);
				match(Extends);
				setState(562);
				identifierB();
				}
			}

			setState(565);
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
		enterRule(_localctx, 96, RULE_interfaceCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
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
		enterRule(_localctx, 98, RULE_blockAbstraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(Abstract);
			setState(570);
			identifier();
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(571);
				match(Extends);
				setState(572);
				identifierB();
				}
			}

			setState(575);
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
		enterRule(_localctx, 100, RULE_abstractionCodeBlock);
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
		enterRule(_localctx, 102, RULE_blockClass);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				openOpA();
				setState(580);
				match(New);
				setState(581);
				match(Class);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(582);
					identifier();
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(585);
					match(Extends);
					setState(586);
					identifierB();
					}
				}

				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(589);
					match(Implements);
					setState(590);
					identifierC();
					}
				}

				setState(593);
				classCodeBlock();
				setState(594);
				closeOpA();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(595);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(596);
					identifierD();
					setState(597);
					match(OpenOp);
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(598);
						generalValueElements();
						}
					}

					setState(601);
					match(CloseOp);
					}
				}

				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==End) {
					{
					setState(605);
					match(End);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
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
		enterRule(_localctx, 104, RULE_blockClassDeclarationAttr);
		int _la;
		try {
			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenOp:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				openOpA();
				setState(612);
				match(New);
				setState(613);
				match(Class);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(614);
					identifier();
					}
				}

				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Extends) {
					{
					setState(617);
					match(Extends);
					setState(618);
					identifierB();
					}
				}

				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Implements) {
					{
					setState(621);
					match(Implements);
					setState(622);
					identifierC();
					}
				}

				setState(625);
				classCodeBlock();
				setState(626);
				closeOpA();
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(627);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(628);
					identifierD();
					setState(629);
					match(OpenOp);
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
						{
						setState(630);
						generalValueElements();
						}
					}

					setState(633);
					match(CloseOp);
					}
				}

				}
				break;
			case Class:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
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
		enterRule(_localctx, 106, RULE_classCommonDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(Class);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(641);
				identifier();
				}
			}

			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(644);
				match(Extends);
				setState(645);
				identifierB();
				}
			}

			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(648);
				match(Implements);
				setState(649);
				identifierC();
				}
			}

			setState(652);
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
		enterRule(_localctx, 108, RULE_classAnonymousParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		enterRule(_localctx, 110, RULE_classCodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
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
		enterRule(_localctx, 112, RULE_blockArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenArIndex:
				{
				setState(658);
				indexArray();
				}
				break;
			case OpenBlock:
				{
				setState(659);
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
		enterRule(_localctx, 114, RULE_indexArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(OpenArIndex);
			setState(663);
			indexArrayElements();
			setState(664);
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
		enterRule(_localctx, 116, RULE_indexArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			generalValueElements();
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					match(Separator);
					setState(668);
					indexArrayElements();
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
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
		enterRule(_localctx, 118, RULE_associativeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(OpenBlock);
			setState(675);
			associativeArrayElements();
			setState(676);
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
		enterRule(_localctx, 120, RULE_associativeArrayElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			identifier();
			setState(679);
			match(TwoPoint);
			setState(680);
			generalValueElements();
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(681);
					match(Separator);
					setState(682);
					associativeArrayElements();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
		enterRule(_localctx, 122, RULE_blockLambdaFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(OpenOp);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(689);
				lambdaFnParams();
				}
			}

			setState(692);
			match(CloseOp);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArrowRight) {
				{
				setState(693);
				match(ArrowRight);
				setState(696);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(694);
					identifier();
					}
					break;
				case TypeSpec:
					{
					setState(695);
					match(TypeSpec);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(700);
			match(ARightLB);
			setState(701);
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
		enterRule(_localctx, 124, RULE_lambdaFnParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			identifier();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TypeSpec) {
				{
				setState(704);
				match(TypeSpec);
				}
			}

			setState(711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(707);
					match(Separator);
					setState(708);
					lambdaFnParams();
					}
					} 
				}
				setState(713);
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
		enterRule(_localctx, 126, RULE_lambdaFnCodeBlock);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				codeBlockControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
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
		enterRule(_localctx, 128, RULE_blockClassConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			identifier();
			setState(719);
			match(OpenOp);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(720);
				functionParam();
				}
			}

			setState(723);
			match(CloseOp);
			setState(724);
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
		enterRule(_localctx, 130, RULE_blockFunctionCall);
		int _la;
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				identifier();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Point || _la==TwoTwoPoint) {
					{
					setState(727);
					_la = _input.LA(1);
					if ( !(_la==Point || _la==TwoTwoPoint) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(728);
					identifierB();
					}
				}

				setState(731);
				match(OpenOp);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(732);
					functionCallElements();
					}
				}

				setState(735);
				match(CloseOp);
				setState(736);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				blockAccessArrayElements();
				setState(739);
				match(OpenOp);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(740);
					functionCallElements();
					}
				}

				setState(743);
				match(CloseOp);
				setState(744);
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
		enterRule(_localctx, 132, RULE_functionCallElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			generalValueElements();
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(749);
					match(Separator);
					setState(750);
					functionCallElements();
					}
					} 
				}
				setState(755);
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
		enterRule(_localctx, 134, RULE_blockCascadingMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			blockCascadingMethodAttr();
			setState(757);
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
		enterRule(_localctx, 136, RULE_blockCascadingMethodAttr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			blockAccessArrayElements();
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenOp) {
				{
				setState(760);
				match(OpenOp);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(761);
					functionCallElements();
					}
				}

				setState(764);
				match(CloseOp);
				}
			}

			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					match(PointPoint);
					setState(768);
					blockCascadingMethodAttr();
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
		enterRule(_localctx, 138, RULE_blockAnonymousObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(OpenOp);
			setState(775);
			match(New);
			setState(776);
			identifier();
			setState(777);
			match(OpenOp);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
				{
				setState(778);
				generalValueElements();
				}
			}

			setState(781);
			match(CloseOp);
			setState(782);
			match(CloseOp);
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(783);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(784);
				identifierB();
				setState(785);
				match(OpenOp);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Function) | (1L << Class) | (1L << OpenArIndex) | (1L << OpenBlock) | (1L << OpenOp) | (1L << Not) | (1L << IncDecOperators) | (1L << Identifier) | (1L << Integer) | (1L << Float) | (1L << String))) != 0)) {
					{
					setState(786);
					generalValueElements();
					}
				}

				setState(789);
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
		enterRule(_localctx, 140, RULE_blockAccessArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
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
			setState(795);
			arrayAccessElementsItems();
			setState(799);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(796);
					arrayAccessElements();
					}
					} 
				}
				setState(801);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		enterRule(_localctx, 144, RULE_arrayAccessElementsItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IncDecOperators) {
				{
				setState(802);
				firstIncDec();
				}
			}

			setState(805);
			identifier();
			setState(807);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(806);
				accessBlockAr();
				}
				break;
			}
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(809);
				lastIncDec();
				}
				break;
			}
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Point || _la==TwoTwoPoint) {
				{
				setState(812);
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
		enterRule(_localctx, 146, RULE_accessBlockAr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(OpenArIndex);
			setState(816);
			arrayIndexAccess();
			setState(817);
			match(CloseArIndex);
			setState(821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(818);
					accessBlockAr();
					}
					} 
				}
				setState(823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
			setState(824);
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
			setState(826);
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
			setState(828);
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
			setState(830);
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
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(OpenBlock);
				setState(833);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				match(OpenBlock);
				setState(835);
				sentences();
				setState(836);
				match(CloseBlock);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
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
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IncDecOperators:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				functionCall();
				setState(842);
				match(End);
				}
				break;
			case Ret:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				blockRet();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(845);
				blockConditional();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(846);
				blockLoop();
				}
				break;
			case Try:
				enterOuterAlt(_localctx, 5);
				{
				setState(847);
				blockTryCatch();
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 6);
				{
				setState(848);
				blockBreak();
				}
				break;
			case Next:
				enterOuterAlt(_localctx, 7);
				{
				setState(849);
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
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(OpenBlock);
				setState(853);
				match(CloseBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(OpenBlock);
				setState(855);
				sentences();
				setState(856);
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
		public BlockAnonymousObjectContext blockAnonymousObject() {
			return getRuleContext(BlockAnonymousObjectContext.class,0);
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
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(860);
					match(Not);
					}
				}

				setState(863);
				functionCall();
				setState(865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(864);
					match(TypeSpec);
					}
					break;
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(867);
					match(ArithmeticOperator);
					}
				}

				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(870);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(873);
					match(Not);
					}
				}

				setState(876);
				identifier();
				setState(877);
				_la = _input.LA(1);
				if ( !(_la==Point || _la==TwoTwoPoint) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(878);
				identifierB();
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(879);
					match(TypeSpec);
					}
					break;
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(882);
					match(ArithmeticOperator);
					}
				}

				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(885);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(889);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(888);
						match(Not);
						}
					}

					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IncDecOperators) {
						{
						setState(891);
						incDecOperatorsA();
						}
					}

					setState(894);
					identifier();
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(895);
						incDecOperatorsB();
						}
						break;
					}
					setState(899);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(898);
						match(TypeSpec);
						}
						break;
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(901);
						match(ArithmeticOperator);
						}
					}

					setState(905);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(904);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(907);
						match(Not);
						}
					}

					setState(910);
					match(Integer);
					setState(912);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
					case 1:
						{
						setState(911);
						match(TypeSpec);
						}
						break;
					}
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(914);
						match(ArithmeticOperator);
						}
					}

					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(917);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 3:
					{
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(920);
						match(Not);
						}
					}

					setState(923);
					match(Float);
					setState(925);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						setState(924);
						match(TypeSpec);
						}
						break;
					}
					setState(928);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArithmeticOperator) {
						{
						setState(927);
						match(ArithmeticOperator);
						}
					}

					setState(931);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
					case 1:
						{
						setState(930);
						match(AssignmentOperator);
						}
						break;
					}
					}
					break;
				case 4:
					{
					setState(934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(933);
						match(Not);
						}
					}

					setState(936);
					match(String);
					setState(938);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(937);
						match(TypeSpec);
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
					switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
					case 1:
						{
						setState(943);
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
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(948);
					match(Not);
					}
				}

				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IncDecOperators) {
					{
					setState(951);
					incDecOperatorsA();
					}
				}

				setState(954);
				blockArray();
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(955);
					incDecOperatorsB();
					}
					break;
				}
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(958);
					match(TypeSpec);
					}
					break;
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(961);
					match(ArithmeticOperator);
					}
				}

				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(964);
					match(AssignmentOperator);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(967);
				blockFunctionDeclarationAttr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				blockClassDeclarationAttr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(969);
				blockLambdaFunctions();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(970);
				blockAccessArrayElements();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(971);
				blockAnonymousObject();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(976);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBlock:
					{
					setState(972);
					match(OpenBlock);
					setState(973);
					match(CloseBlock);
					}
					break;
				case OpenArIndex:
					{
					setState(974);
					match(OpenArIndex);
					setState(975);
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
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Not) {
					{
					setState(978);
					match(Not);
					}
				}

				setState(981);
				generalValueBlock();
				setState(983);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(982);
					match(TypeSpec);
					}
					break;
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArithmeticOperator) {
					{
					setState(985);
					match(ArithmeticOperator);
					}
				}

				setState(989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(988);
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
			setState(993);
			match(OpenOp);
			setState(994);
			generalValueItems();
			setState(995);
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
			setState(997);
			generalValue();
			setState(1001);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(998);
					generalValueItems();
					}
					} 
				}
				setState(1003);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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
			setState(1004);
			generalValue();
			setState(1008);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1005);
					generalValueElements();
					}
					} 
				}
				setState(1010);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
			setState(1011);
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
			setState(1013);
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
			setState(1015);
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
			setState(1017);
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
			setState(1019);
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
			setState(1021);
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
			setState(1023);
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
			setState(1025);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0406\4\2\t\2\4"+
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
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d8\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00e0\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u00eb\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00f5\n\n\3\n\3\n\3\n\7\n\u00fa\n\n"+
		"\f\n\16\n\u00fd\13\n\3\13\3\13\3\13\3\13\5\13\u0103\n\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\5\r\u010d\n\r\3\r\5\r\u0110\n\r\3\r\3\r\5\r\u0114"+
		"\n\r\3\r\3\r\3\r\7\r\u0119\n\r\f\r\16\r\u011c\13\r\3\r\3\r\5\r\u0120\n"+
		"\r\3\r\3\r\5\r\u0124\n\r\3\r\3\r\3\r\7\r\u0129\n\r\f\r\16\r\u012c\13\r"+
		"\5\r\u012e\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0138\n\17"+
		"\f\17\16\17\u013b\13\17\3\20\3\20\3\20\5\20\u0140\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0147\n\20\3\20\3\20\5\20\u014b\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0153\n\21\3\22\3\22\3\22\7\22\u0158\n\22\f\22\16\22"+
		"\u015b\13\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0163\n\24\3\24\5\24\u0166"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u016e\n\26\f\26\16\26\u0171\13"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\5\33\u0182\n\33\3\33\3\33\3\34\3\34\3\35\5\35\u0189\n\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0191\n\35\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u0198\n\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u01a1\n\"\3#\3#\5#\u01a5\n#\3"+
		"$\3$\5$\u01a9\n$\3%\3%\3%\7%\u01ae\n%\f%\16%\u01b1\13%\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\5(\u01bb\n(\3)\3)\3)\3*\3*\5*\u01c2\n*\3*\3*\5*\u01c6\n*"+
		"\3*\3*\3+\3+\3,\3,\3,\5,\u01cf\n,\3,\3,\5,\u01d3\n,\3,\3,\3,\3,\5,\u01d9"+
		"\n,\5,\u01db\n,\3,\3,\3,\3,\5,\u01e1\n,\3,\3,\3,\3,\3,\5,\u01e8\n,\3,"+
		"\3,\5,\u01ec\n,\3,\3,\3,\3,\5,\u01f2\n,\5,\u01f4\n,\3,\3,\5,\u01f8\n,"+
		"\5,\u01fa\n,\3-\3-\3-\5-\u01ff\n-\3-\3-\5-\u0203\n-\3-\3-\3-\3-\5-\u0209"+
		"\n-\5-\u020b\n-\3-\3-\3-\3-\5-\u0211\n-\3-\3-\3-\3-\5-\u0217\n-\3-\3-"+
		"\5-\u021b\n-\3-\3-\3-\3-\5-\u0221\n-\5-\u0223\n-\3-\5-\u0226\n-\3.\3."+
		"\3.\3.\5.\u022c\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u0236\n\61"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0240\n\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\5\65\u024a\n\65\3\65\3\65\5\65\u024e\n\65\3"+
		"\65\3\65\5\65\u0252\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u025a\n\65"+
		"\3\65\3\65\5\65\u025e\n\65\3\65\5\65\u0261\n\65\3\65\5\65\u0264\n\65\3"+
		"\66\3\66\3\66\3\66\5\66\u026a\n\66\3\66\3\66\5\66\u026e\n\66\3\66\3\66"+
		"\5\66\u0272\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u027a\n\66\3\66\3"+
		"\66\5\66\u027e\n\66\3\66\5\66\u0281\n\66\3\67\3\67\5\67\u0285\n\67\3\67"+
		"\3\67\5\67\u0289\n\67\3\67\3\67\5\67\u028d\n\67\3\67\3\67\38\38\39\39"+
		"\3:\3:\5:\u0297\n:\3;\3;\3;\3;\3<\3<\3<\7<\u02a0\n<\f<\16<\u02a3\13<\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u02ae\n>\f>\16>\u02b1\13>\3?\3?\5?\u02b5"+
		"\n?\3?\3?\3?\3?\5?\u02bb\n?\5?\u02bd\n?\3?\3?\3?\3@\3@\5@\u02c4\n@\3@"+
		"\3@\7@\u02c8\n@\f@\16@\u02cb\13@\3A\3A\5A\u02cf\nA\3B\3B\3B\5B\u02d4\n"+
		"B\3B\3B\3B\3C\3C\3C\5C\u02dc\nC\3C\3C\5C\u02e0\nC\3C\3C\3C\3C\3C\3C\5"+
		"C\u02e8\nC\3C\3C\3C\5C\u02ed\nC\3D\3D\3D\7D\u02f2\nD\fD\16D\u02f5\13D"+
		"\3E\3E\3E\3F\3F\3F\5F\u02fd\nF\3F\5F\u0300\nF\3F\3F\7F\u0304\nF\fF\16"+
		"F\u0307\13F\3G\3G\3G\3G\3G\5G\u030e\nG\3G\3G\3G\3G\3G\3G\5G\u0316\nG\3"+
		"G\3G\5G\u031a\nG\3H\3H\3I\3I\7I\u0320\nI\fI\16I\u0323\13I\3J\5J\u0326"+
		"\nJ\3J\3J\5J\u032a\nJ\3J\5J\u032d\nJ\3J\5J\u0330\nJ\3K\3K\3K\3K\7K\u0336"+
		"\nK\fK\16K\u0339\13K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\3P\5P\u034a"+
		"\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0355\nQ\3R\3R\3R\3R\3R\3R\5R\u035d"+
		"\nR\3S\5S\u0360\nS\3S\3S\5S\u0364\nS\3S\5S\u0367\nS\3S\5S\u036a\nS\3S"+
		"\5S\u036d\nS\3S\3S\3S\3S\5S\u0373\nS\3S\5S\u0376\nS\3S\5S\u0379\nS\3S"+
		"\5S\u037c\nS\3S\5S\u037f\nS\3S\3S\5S\u0383\nS\3S\5S\u0386\nS\3S\5S\u0389"+
		"\nS\3S\5S\u038c\nS\3S\5S\u038f\nS\3S\3S\5S\u0393\nS\3S\5S\u0396\nS\3S"+
		"\5S\u0399\nS\3S\5S\u039c\nS\3S\3S\5S\u03a0\nS\3S\5S\u03a3\nS\3S\5S\u03a6"+
		"\nS\3S\5S\u03a9\nS\3S\3S\5S\u03ad\nS\3S\5S\u03b0\nS\3S\5S\u03b3\nS\5S"+
		"\u03b5\nS\3S\5S\u03b8\nS\3S\5S\u03bb\nS\3S\3S\5S\u03bf\nS\3S\5S\u03c2"+
		"\nS\3S\5S\u03c5\nS\3S\5S\u03c8\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u03d3"+
		"\nS\3S\5S\u03d6\nS\3S\3S\5S\u03da\nS\3S\5S\u03dd\nS\3S\5S\u03e0\nS\5S"+
		"\u03e2\nS\3T\3T\3T\3T\3U\3U\7U\u03ea\nU\fU\16U\u03ed\13U\3V\3V\7V\u03f1"+
		"\nV\fV\16V\u03f4\13V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3"+
		"^\3^\2\2_\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\2\6\4\2\25\25\31\31\4\2\37\37,,\4\2  \"\"\4\2\13\17\30\30\2\u045c\2\u00bc"+
		"\3\2\2\2\4\u00c4\3\2\2\2\6\u00d7\3\2\2\2\b\u00df\3\2\2\2\n\u00e1\3\2\2"+
		"\2\f\u00ea\3\2\2\2\16\u00ec\3\2\2\2\20\u00ee\3\2\2\2\22\u00f2\3\2\2\2"+
		"\24\u0102\3\2\2\2\26\u0106\3\2\2\2\30\u012d\3\2\2\2\32\u012f\3\2\2\2\34"+
		"\u0134\3\2\2\2\36\u014a\3\2\2\2 \u0152\3\2\2\2\"\u0154\3\2\2\2$\u015c"+
		"\3\2\2\2&\u0160\3\2\2\2(\u0167\3\2\2\2*\u016b\3\2\2\2,\u0172\3\2\2\2."+
		"\u0176\3\2\2\2\60\u0179\3\2\2\2\62\u017b\3\2\2\2\64\u017d\3\2\2\2\66\u0185"+
		"\3\2\2\28\u0188\3\2\2\2:\u0192\3\2\2\2<\u0197\3\2\2\2>\u0199\3\2\2\2@"+
		"\u019b\3\2\2\2B\u01a0\3\2\2\2D\u01a4\3\2\2\2F\u01a8\3\2\2\2H\u01aa\3\2"+
		"\2\2J\u01b2\3\2\2\2L\u01b5\3\2\2\2N\u01b8\3\2\2\2P\u01bc\3\2\2\2R\u01bf"+
		"\3\2\2\2T\u01c9\3\2\2\2V\u01f9\3\2\2\2X\u0225\3\2\2\2Z\u0227\3\2\2\2\\"+
		"\u022d\3\2\2\2^\u022f\3\2\2\2`\u0231\3\2\2\2b\u0239\3\2\2\2d\u023b\3\2"+
		"\2\2f\u0243\3\2\2\2h\u0263\3\2\2\2j\u0280\3\2\2\2l\u0282\3\2\2\2n\u0290"+
		"\3\2\2\2p\u0292\3\2\2\2r\u0296\3\2\2\2t\u0298\3\2\2\2v\u029c\3\2\2\2x"+
		"\u02a4\3\2\2\2z\u02a8\3\2\2\2|\u02b2\3\2\2\2~\u02c1\3\2\2\2\u0080\u02ce"+
		"\3\2\2\2\u0082\u02d0\3\2\2\2\u0084\u02ec\3\2\2\2\u0086\u02ee\3\2\2\2\u0088"+
		"\u02f6\3\2\2\2\u008a\u02f9\3\2\2\2\u008c\u0308\3\2\2\2\u008e\u031b\3\2"+
		"\2\2\u0090\u031d\3\2\2\2\u0092\u0325\3\2\2\2\u0094\u0331\3\2\2\2\u0096"+
		"\u033a\3\2\2\2\u0098\u033c\3\2\2\2\u009a\u033e\3\2\2\2\u009c\u0340\3\2"+
		"\2\2\u009e\u0349\3\2\2\2\u00a0\u0354\3\2\2\2\u00a2\u035c\3\2\2\2\u00a4"+
		"\u03e1\3\2\2\2\u00a6\u03e3\3\2\2\2\u00a8\u03e7\3\2\2\2\u00aa\u03ee\3\2"+
		"\2\2\u00ac\u03f5\3\2\2\2\u00ae\u03f7\3\2\2\2\u00b0\u03f9\3\2\2\2\u00b2"+
		"\u03fb\3\2\2\2\u00b4\u03fd\3\2\2\2\u00b6\u03ff\3\2\2\2\u00b8\u0401\3\2"+
		"\2\2\u00ba\u0403\3\2\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\2\2\3\u00be"+
		"\3\3\2\2\2\u00bf\u00c5\5\6\4\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\5\4\3\2"+
		"\u00c2\u00c5\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\5\3\2\2\2\u00c6\u00d8\5\n\6\2\u00c7"+
		"\u00d8\5\20\t\2\u00c8\u00d8\5$\23\2\u00c9\u00d8\5&\24\2\u00ca\u00d8\5"+
		"\64\33\2\u00cb\u00d8\5J&\2\u00cc\u00d8\5L\'\2\u00cd\u00d8\5N(\2\u00ce"+
		"\u00d8\5V,\2\u00cf\u00d8\5`\61\2\u00d0\u00d8\5d\63\2\u00d1\u00d8\5h\65"+
		"\2\u00d2\u00d8\5\u0084C\2\u00d3\u00d8\5\u0082B\2\u00d4\u00d8\5\26\f\2"+
		"\u00d5\u00d8\5\32\16\2\u00d6\u00d8\5\u009cO\2\u00d7\u00c6\3\2\2\2\u00d7"+
		"\u00c7\3\2\2\2\u00d7\u00c8\3\2\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00ca\3\2"+
		"\2\2\u00d7\u00cb\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7"+
		"\u00ce\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2"+
		"\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\7\3\2\2\2\u00d9\u00da\7\'\2\2"+
		"\u00da\u00e0\7(\2\2\u00db\u00dc\7\'\2\2\u00dc\u00dd\5\4\3\2\u00dd\u00de"+
		"\7(\2\2\u00de\u00e0\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00db\3\2\2\2\u00e0"+
		"\t\3\2\2\2\u00e1\u00e2\7\3\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4\7\36\2"+
		"\2\u00e4\13\3\2\2\2\u00e5\u00eb\5\16\b\2\u00e6\u00e7\5\16\b\2\u00e7\u00e8"+
		"\7$\2\2\u00e8\u00e9\5\f\7\2\u00e9\u00eb\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea"+
		"\u00e6\3\2\2\2\u00eb\r\3\2\2\2\u00ec\u00ed\7\65\2\2\u00ed\17\3\2\2\2\u00ee"+
		"\u00ef\7\4\2\2\u00ef\u00f0\5\22\n\2\u00f0\u00f1\7\36\2\2\u00f1\21\3\2"+
		"\2\2\u00f2\u00f4\5\24\13\2\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\5\u00aaV\2\u00f7\u00f8"+
		"\7$\2\2\u00f8\u00fa\5\22\n\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\23\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00fe\u0103\5\u00acW\2\u00ff\u0100\5\u00acW\2\u0100\u0101\7\61\2\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\t\3\2\2\u0105\25\3\2\2\2\u0106\u0107\5\30\r\2\u0107"+
		"\u0108\7\36\2\2\u0108\27\3\2\2\2\u0109\u010c\5\u00acW\2\u010a\u010b\t"+
		"\4\2\2\u010b\u010d\5\u00aeX\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010f\3\2\2\2\u010e\u0110\7\61\2\2\u010f\u010e\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\t\3\2\2\u0112\u0114\t\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011a\5\u00aa"+
		"V\2\u0116\u0117\7$\2\2\u0117\u0119\5\30\r\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u012e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011d\u011f\5\u00a4S\2\u011e\u0120\7\61\2\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\t\3"+
		"\2\2\u0122\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u012a\5\u00aaV\2\u0126\u0127\7$\2\2\u0127\u0129\5"+
		"\30\r\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0109\3\2"+
		"\2\2\u012d\u011d\3\2\2\2\u012e\31\3\2\2\2\u012f\u0130\5\34\17\2\u0130"+
		"\u0131\7\37\2\2\u0131\u0132\5\u00aaV\2\u0132\u0133\7\36\2\2\u0133\33\3"+
		"\2\2\2\u0134\u0139\5\u00a4S\2\u0135\u0136\7\37\2\2\u0136\u0138\5\34\17"+
		"\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\35\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013f\5\u00acW\2\u013d"+
		"\u013e\t\4\2\2\u013e\u0140\5\u00aeX\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\5 \21\2\u0142\u014b\3\2\2\2\u0143"+
		"\u0144\5\u008eH\2\u0144\u0146\7)\2\2\u0145\u0147\5\u0086D\2\u0146\u0145"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7*\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u013c\3\2\2\2\u014a\u0143\3\2\2\2\u014b\37\3\2\2"+
		"\2\u014c\u014d\7)\2\2\u014d\u0153\7*\2\2\u014e\u014f\7)\2\2\u014f\u0150"+
		"\5\"\22\2\u0150\u0151\7*\2\2\u0151\u0153\3\2\2\2\u0152\u014c\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153!\3\2\2\2\u0154\u0159\5\u00a4S\2\u0155\u0156\7$\2"+
		"\2\u0156\u0158\5\"\22\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a#\3\2\2\2\u015b\u0159\3\2\2\2"+
		"\u015c\u015d\7\t\2\2\u015d\u015e\5\u00aaV\2\u015e\u015f\7\36\2\2\u015f"+
		"%\3\2\2\2\u0160\u0162\5(\25\2\u0161\u0163\5*\26\2\u0162\u0161\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0166\5.\30\2\u0165\u0164"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\'\3\2\2\2\u0167\u0168\7\5\2\2\u0168"+
		"\u0169\5\60\31\2\u0169\u016a\5\62\32\2\u016a)\3\2\2\2\u016b\u016f\5,\27"+
		"\2\u016c\u016e\5*\26\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170+\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\7\6\2\2\u0173\u0174\5\60\31\2\u0174\u0175\5\62\32\2\u0175-\3\2"+
		"\2\2\u0176\u0177\7\7\2\2\u0177\u0178\5\62\32\2\u0178/\3\2\2\2\u0179\u017a"+
		"\5\u00aaV\2\u017a\61\3\2\2\2\u017b\u017c\5\u009eP\2\u017c\63\3\2\2\2\u017d"+
		"\u0181\7\b\2\2\u017e\u0182\5<\37\2\u017f\u0182\5:\36\2\u0180\u0182\58"+
		"\35\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\5\66\34\2\u0184\65\3\2\2\2\u0185\u0186\5\u009e"+
		"P\2\u0186\67\3\2\2\2\u0187\u0189\7)\2\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5B\"\2\u018b\u018c\5> \2\u018c"+
		"\u018d\5D#\2\u018d\u018e\5@!\2\u018e\u0190\5F$\2\u018f\u0191\7*\2\2\u0190"+
		"\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u01919\3\2\2\2\u0192\u0193\5D#\2\u0193"+
		";\3\2\2\2\u0194\u0195\7)\2\2\u0195\u0198\7*\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0194\3\2\2\2\u0197\u0196\3\2\2\2\u0198=\3\2\2\2\u0199\u019a\7\36\2\2"+
		"\u019a?\3\2\2\2\u019b\u019c\7\36\2\2\u019cA\3\2\2\2\u019d\u019e\7\4\2"+
		"\2\u019e\u01a1\5\22\n\2\u019f\u01a1\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1C\3\2\2\2\u01a2\u01a5\5\u00aaV\2\u01a3\u01a5\3\2\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5E\3\2\2\2\u01a6\u01a9"+
		"\5H%\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"G\3\2\2\2\u01aa\u01af\5\u00aaV\2\u01ab\u01ac\7$\2\2\u01ac\u01ae\5\u00aa"+
		"V\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0I\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\7\26\2\2"+
		"\u01b3\u01b4\7\36\2\2\u01b4K\3\2\2\2\u01b5\u01b6\7\27\2\2\u01b6\u01b7"+
		"\7\36\2\2\u01b7M\3\2\2\2\u01b8\u01ba\5P)\2\u01b9\u01bb\5R*\2\u01ba\u01b9"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbO\3\2\2\2\u01bc\u01bd\7\32\2\2\u01bd"+
		"\u01be\5T+\2\u01beQ\3\2\2\2\u01bf\u01c1\7\33\2\2\u01c0\u01c2\7)\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\5\u00ac"+
		"W\2\u01c4\u01c6\7*\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7"+
		"\3\2\2\2\u01c7\u01c8\5T+\2\u01c8S\3\2\2\2\u01c9\u01ca\5\u009eP\2\u01ca"+
		"U\3\2\2\2\u01cb\u01cc\7)\2\2\u01cc\u01ce\7\n\2\2\u01cd\u01cf\5\u00acW"+
		"\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\7)\2\2\u01d1\u01d3\5Z.\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01da\7*\2\2\u01d5\u01d8\7\34\2\2\u01d6\u01d9\5\u00ae"+
		"X\2\u01d7\u01d9\7\61\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d5\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01dd\5^\60\2\u01dd\u01de\7*\2\2\u01de\u01e0\7)\2\2\u01df\u01e1"+
		"\5\\/\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\7*\2\2\u01e3\u01e4\7\36\2\2\u01e4\u01fa\3\2\2\2\u01e5\u01e7\7\n"+
		"\2\2\u01e6\u01e8\5\u00acW\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\7)\2\2\u01ea\u01ec\5Z.\2\u01eb\u01ea\3\2\2"+
		"\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f3\7*\2\2\u01ee\u01f1"+
		"\7\34\2\2\u01ef\u01f2\5\u00aeX\2\u01f0\u01f2\7\61\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f8\5^\60\2\u01f6\u01f8\7\36"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9"+
		"\u01cb\3\2\2\2\u01f9\u01e5\3\2\2\2\u01faW\3\2\2\2\u01fb\u01fc\7)\2\2\u01fc"+
		"\u01fe\7\n\2\2\u01fd\u01ff\5\u00acW\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202\7)\2\2\u0201\u0203\5Z.\2\u0202"+
		"\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u020a\7*"+
		"\2\2\u0205\u0208\7\34\2\2\u0206\u0209\5\u00aeX\2\u0207\u0209\7\61\2\2"+
		"\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0205"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5^\60\2\u020d"+
		"\u020e\7*\2\2\u020e\u0210\7)\2\2\u020f\u0211\5\\/\2\u0210\u020f\3\2\2"+
		"\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\7*\2\2\u0213\u0226"+
		"\3\2\2\2\u0214\u0216\7\n\2\2\u0215\u0217\5\u00acW\2\u0216\u0215\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\7)\2\2\u0219\u021b"+
		"\5Z.\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u0222\7*\2\2\u021d\u0220\7\34\2\2\u021e\u0221\5\u00aeX\2\u021f\u0221"+
		"\7\61\2\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0223\3\2\2\2"+
		"\u0222\u021d\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226"+
		"\5^\60\2\u0225\u01fb\3\2\2\2\u0225\u0214\3\2\2\2\u0226Y\3\2\2\2\u0227"+
		"\u0228\7/\2\2\u0228\u022b\7\61\2\2\u0229\u022a\7$\2\2\u022a\u022c\5Z."+
		"\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c[\3\2\2\2\u022d\u022e"+
		"\5\u00aaV\2\u022e]\3\2\2\2\u022f\u0230\5\u00a2R\2\u0230_\3\2\2\2\u0231"+
		"\u0232\7\20\2\2\u0232\u0235\5\u00acW\2\u0233\u0234\7\22\2\2\u0234\u0236"+
		"\5\u00aeX\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2"+
		"\2\u0237\u0238\5b\62\2\u0238a\3\2\2\2\u0239\u023a\5\u00a2R\2\u023ac\3"+
		"\2\2\2\u023b\u023c\7\21\2\2\u023c\u023f\5\u00acW\2\u023d\u023e\7\22\2"+
		"\2\u023e\u0240\5\u00aeX\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0242\5f\64\2\u0242e\3\2\2\2\u0243\u0244\5\u00a2"+
		"R\2\u0244g\3\2\2\2\u0245\u0246\5\u00b8]\2\u0246\u0247\7\25\2\2\u0247\u0249"+
		"\7\23\2\2\u0248\u024a\5\u00acW\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2"+
		"\2\u024a\u024d\3\2\2\2\u024b\u024c\7\22\2\2\u024c\u024e\5\u00aeX\2\u024d"+
		"\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u0250\7\24"+
		"\2\2\u0250\u0252\5\u00b0Y\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\5p9\2\u0254\u025d\5\u00ba^\2\u0255\u0256\t"+
		"\4\2\2\u0256\u0257\5\u00b2Z\2\u0257\u0259\7)\2\2\u0258\u025a\5\u00aaV"+
		"\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c"+
		"\7*\2\2\u025c\u025e\3\2\2\2\u025d\u0255\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u0260\3\2\2\2\u025f\u0261\7\36\2\2\u0260\u025f\3\2\2\2\u0260\u0261\3"+
		"\2\2\2\u0261\u0264\3\2\2\2\u0262\u0264\5l\67\2\u0263\u0245\3\2\2\2\u0263"+
		"\u0262\3\2\2\2\u0264i\3\2\2\2\u0265\u0266\5\u00b8]\2\u0266\u0267\7\25"+
		"\2\2\u0267\u0269\7\23\2\2\u0268\u026a\5\u00acW\2\u0269\u0268\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u026c\7\22\2\2\u026c\u026e\5"+
		"\u00aeX\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\3\2\2\2"+
		"\u026f\u0270\7\24\2\2\u0270\u0272\5\u00b0Y\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\5p9\2\u0274\u027d\5\u00ba"+
		"^\2\u0275\u0276\t\4\2\2\u0276\u0277\5\u00b2Z\2\u0277\u0279\7)\2\2\u0278"+
		"\u027a\5\u00aaV\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b"+
		"\3\2\2\2\u027b\u027c\7*\2\2\u027c\u027e\3\2\2\2\u027d\u0275\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u0281\5l\67\2\u0280\u0265\3\2"+
		"\2\2\u0280\u027f\3\2\2\2\u0281k\3\2\2\2\u0282\u0284\7\23\2\2\u0283\u0285"+
		"\5\u00acW\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0288\3\2\2"+
		"\2\u0286\u0287\7\22\2\2\u0287\u0289\5\u00aeX\2\u0288\u0286\3\2\2\2\u0288"+
		"\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u028b\7\24\2\2\u028b\u028d\5"+
		"\u00b0Y\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2"+
		"\u028e\u028f\5p9\2\u028fm\3\2\2\2\u0290\u0291\5\u00aaV\2\u0291o\3\2\2"+
		"\2\u0292\u0293\5\u00a2R\2\u0293q\3\2\2\2\u0294\u0297\5t;\2\u0295\u0297"+
		"\5x=\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297s\3\2\2\2\u0298\u0299"+
		"\7%\2\2\u0299\u029a\5v<\2\u029a\u029b\7&\2\2\u029bu\3\2\2\2\u029c\u02a1"+
		"\5\u00aaV\2\u029d\u029e\7$\2\2\u029e\u02a0\5v<\2\u029f\u029d\3\2\2\2\u02a0"+
		"\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2w\3\2\2\2"+
		"\u02a3\u02a1\3\2\2\2\u02a4\u02a5\7\'\2\2\u02a5\u02a6\5z>\2\u02a6\u02a7"+
		"\7(\2\2\u02a7y\3\2\2\2\u02a8\u02a9\5\u00acW\2\u02a9\u02aa\7!\2\2\u02aa"+
		"\u02af\5\u00aaV\2\u02ab\u02ac\7$\2\2\u02ac\u02ae\5z>\2\u02ad\u02ab\3\2"+
		"\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"{\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4\7)\2\2\u02b3\u02b5\5~@\2\u02b4"+
		"\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02bc\7*"+
		"\2\2\u02b7\u02ba\7\34\2\2\u02b8\u02bb\5\u00acW\2\u02b9\u02bb\7\61\2\2"+
		"\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02bd\3\2\2\2\u02bc\u02b7"+
		"\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\7\35\2\2"+
		"\u02bf\u02c0\5\u0080A\2\u02c0}\3\2\2\2\u02c1\u02c3\5\u00acW\2\u02c2\u02c4"+
		"\7\61\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c9\3\2\2\2"+
		"\u02c5\u02c6\7$\2\2\u02c6\u02c8\5~@\2\u02c7\u02c5\3\2\2\2\u02c8\u02cb"+
		"\3\2\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\177\3\2\2\2\u02cb"+
		"\u02c9\3\2\2\2\u02cc\u02cf\5\u00a2R\2\u02cd\u02cf\5\u00aaV\2\u02ce\u02cc"+
		"\3\2\2\2\u02ce\u02cd\3\2\2\2\u02cf\u0081\3\2\2\2\u02d0\u02d1\5\u00acW"+
		"\2\u02d1\u02d3\7)\2\2\u02d2\u02d4\5Z.\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\7*\2\2\u02d6\u02d7\5\u00a2R\2"+
		"\u02d7\u0083\3\2\2\2\u02d8\u02db\5\u00acW\2\u02d9\u02da\t\4\2\2\u02da"+
		"\u02dc\5\u00aeX\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02df\7)\2\2\u02de\u02e0\5\u0086D\2\u02df\u02de\3\2\2\2"+
		"\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\7*\2\2\u02e2\u02e3"+
		"\7\36\2\2\u02e3\u02ed\3\2\2\2\u02e4\u02e5\5\u008eH\2\u02e5\u02e7\7)\2"+
		"\2\u02e6\u02e8\5\u0086D\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02e9\3\2\2\2\u02e9\u02ea\7*\2\2\u02ea\u02eb\7\36\2\2\u02eb\u02ed\3\2"+
		"\2\2\u02ec\u02d8\3\2\2\2\u02ec\u02e4\3\2\2\2\u02ed\u0085\3\2\2\2\u02ee"+
		"\u02f3\5\u00aaV\2\u02ef\u02f0\7$\2\2\u02f0\u02f2\5\u0086D\2\u02f1\u02ef"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u0087\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\5\u008aF\2\u02f7\u02f8"+
		"\7\36\2\2\u02f8\u0089\3\2\2\2\u02f9\u02ff\5\u008eH\2\u02fa\u02fc\7)\2"+
		"\2\u02fb\u02fd\5\u0086D\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u0300\7*\2\2\u02ff\u02fa\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0305\3\2\2\2\u0301\u0302\7#\2\2\u0302\u0304\5\u008aF\2\u0303"+
		"\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u008b\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0309\7)\2\2\u0309"+
		"\u030a\7\25\2\2\u030a\u030b\5\u00acW\2\u030b\u030d\7)\2\2\u030c\u030e"+
		"\5\u00aaV\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2"+
		"\2\u030f\u0310\7*\2\2\u0310\u0319\7*\2\2\u0311\u0312\t\4\2\2\u0312\u0313"+
		"\5\u00aeX\2\u0313\u0315\7)\2\2\u0314\u0316\5\u00aaV\2\u0315\u0314\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7*\2\2\u0318"+
		"\u031a\3\2\2\2\u0319\u0311\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u008d\3\2"+
		"\2\2\u031b\u031c\5\u0090I\2\u031c\u008f\3\2\2\2\u031d\u0321\5\u0092J\2"+
		"\u031e\u0320\5\u0090I\2\u031f\u031e\3\2\2\2\u0320\u0323\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0091\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0324\u0326\5\u0098M\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0329\5\u00acW\2\u0328\u032a\5\u0094K\2\u0329\u0328"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b\u032d\5\u009aN"+
		"\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u0330"+
		"\t\4\2\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0093\3\2\2\2\u0331"+
		"\u0332\7%\2\2\u0332\u0333\5\u0096L\2\u0333\u0337\7&\2\2\u0334\u0336\5"+
		"\u0094K\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2"+
		"\u0337\u0338\3\2\2\2\u0338\u0095\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b"+
		"\5\u00aaV\2\u033b\u0097\3\2\2\2\u033c\u033d\7.\2\2\u033d\u0099\3\2\2\2"+
		"\u033e\u033f\7.\2\2\u033f\u009b\3\2\2\2\u0340\u0341\t\5\2\2\u0341\u009d"+
		"\3\2\2\2\u0342\u0343\7\'\2\2\u0343\u034a\7(\2\2\u0344\u0345\7\'\2\2\u0345"+
		"\u0346\5\4\3\2\u0346\u0347\7(\2\2\u0347\u034a\3\2\2\2\u0348\u034a\5\u00a0"+
		"Q\2\u0349\u0342\3\2\2\2\u0349\u0344\3\2\2\2\u0349\u0348\3\2\2\2\u034a"+
		"\u009f\3\2\2\2\u034b\u034c\5\36\20\2\u034c\u034d\7\36\2\2\u034d\u0355"+
		"\3\2\2\2\u034e\u0355\5$\23\2\u034f\u0355\5&\24\2\u0350\u0355\5\64\33\2"+
		"\u0351\u0355\5N(\2\u0352\u0355\5J&\2\u0353\u0355\5L\'\2\u0354\u034b\3"+
		"\2\2\2\u0354\u034e\3\2\2\2\u0354\u034f\3\2\2\2\u0354\u0350\3\2\2\2\u0354"+
		"\u0351\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u00a1\3\2"+
		"\2\2\u0356\u0357\7\'\2\2\u0357\u035d\7(\2\2\u0358\u0359\7\'\2\2\u0359"+
		"\u035a\5\4\3\2\u035a\u035b\7(\2\2\u035b\u035d\3\2\2\2\u035c\u0356\3\2"+
		"\2\2\u035c\u0358\3\2\2\2\u035d\u00a3\3\2\2\2\u035e\u0360\7-\2\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\5\36"+
		"\20\2\u0362\u0364\7\61\2\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0366\3\2\2\2\u0365\u0367\7+\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2"+
		"\2\2\u0367\u0369\3\2\2\2\u0368\u036a\7,\2\2\u0369\u0368\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u03e2\3\2\2\2\u036b\u036d\7-\2\2\u036c\u036b\3\2"+
		"\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\5\u00acW\2\u036f"+
		"\u0370\t\4\2\2\u0370\u0372\5\u00aeX\2\u0371\u0373\7\61\2\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0376\7+\2\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0379\7,"+
		"\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u03e2\3\2\2\2\u037a"+
		"\u037c\7-\2\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037e\3\2"+
		"\2\2\u037d\u037f\5\u00b4[\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0382\5\u00acW\2\u0381\u0383\5\u00b6\\\2\u0382\u0381"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0386\7\61\2\2"+
		"\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0389"+
		"\7+\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b\3\2\2\2\u038a"+
		"\u038c\7,\2\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u03b5\3\2"+
		"\2\2\u038d\u038f\7-\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0392\7\63\2\2\u0391\u0393\7\61\2\2\u0392\u0391\3"+
		"\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0396\7+\2\2\u0395"+
		"\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0399\7,"+
		"\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u03b5\3\2\2\2\u039a"+
		"\u039c\7-\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039d\3\2"+
		"\2\2\u039d\u039f\7\64\2\2\u039e\u03a0\7\61\2\2\u039f\u039e\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a2\3\2\2\2\u03a1\u03a3\7+\2\2\u03a2\u03a1\3\2"+
		"\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u03a6\7,\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03b5\3\2\2\2\u03a7\u03a9\7-"+
		"\2\2\u03a8\u03a7\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ac\7\65\2\2\u03ab\u03ad\7\61\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3"+
		"\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03b0\7+\2\2\u03af\u03ae\3\2\2\2\u03af"+
		"\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03b3\7,\2\2\u03b2\u03b1\3\2"+
		"\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2\u03b4\u037b\3\2\2\2\u03b4"+
		"\u038e\3\2\2\2\u03b4\u039b\3\2\2\2\u03b4\u03a8\3\2\2\2\u03b5\u03e2\3\2"+
		"\2\2\u03b6\u03b8\7-\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03ba\3\2\2\2\u03b9\u03bb\5\u00b4[\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb"+
		"\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\5r:\2\u03bd\u03bf\5\u00b6\\\2"+
		"\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03c2"+
		"\7\61\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2"+
		"\u03c3\u03c5\7+\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7"+
		"\3\2\2\2\u03c6\u03c8\7,\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03e2\3\2\2\2\u03c9\u03e2\5X-\2\u03ca\u03e2\5j\66\2\u03cb\u03e2\5|?\2"+
		"\u03cc\u03e2\5\u008eH\2\u03cd\u03e2\5\u008cG\2\u03ce\u03cf\7\'\2\2\u03cf"+
		"\u03d3\7(\2\2\u03d0\u03d1\7%\2\2\u03d1\u03d3\7&\2\2\u03d2\u03ce\3\2\2"+
		"\2\u03d2\u03d0\3\2\2\2\u03d3\u03e2\3\2\2\2\u03d4\u03d6\7-\2\2\u03d5\u03d4"+
		"\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\5\u00a6T"+
		"\2\u03d8\u03da\7\61\2\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03dc\3\2\2\2\u03db\u03dd\7+\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2"+
		"\2\2\u03dd\u03df\3\2\2\2\u03de\u03e0\7,\2\2\u03df\u03de\3\2\2\2\u03df"+
		"\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u035f\3\2\2\2\u03e1\u036c\3\2"+
		"\2\2\u03e1\u03b4\3\2\2\2\u03e1\u03b7\3\2\2\2\u03e1\u03c9\3\2\2\2\u03e1"+
		"\u03ca\3\2\2\2\u03e1\u03cb\3\2\2\2\u03e1\u03cc\3\2\2\2\u03e1\u03cd\3\2"+
		"\2\2\u03e1\u03d2\3\2\2\2\u03e1\u03d5\3\2\2\2\u03e2\u00a5\3\2\2\2\u03e3"+
		"\u03e4\7)\2\2\u03e4\u03e5\5\u00a8U\2\u03e5\u03e6\7*\2\2\u03e6\u00a7\3"+
		"\2\2\2\u03e7\u03eb\5\u00a4S\2\u03e8\u03ea\5\u00a8U\2\u03e9\u03e8\3\2\2"+
		"\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u00a9"+
		"\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03f2\5\u00a4S\2\u03ef\u03f1\5\u00aa"+
		"V\2\u03f0\u03ef\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2"+
		"\u03f3\3\2\2\2\u03f3\u00ab\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f6\7/"+
		"\2\2\u03f6\u00ad\3\2\2\2\u03f7\u03f8\7/\2\2\u03f8\u00af\3\2\2\2\u03f9"+
		"\u03fa\7/\2\2\u03fa\u00b1\3\2\2\2\u03fb\u03fc\7/\2\2\u03fc\u00b3\3\2\2"+
		"\2\u03fd\u03fe\7.\2\2\u03fe\u00b5\3\2\2\2\u03ff\u0400\7.\2\2\u0400\u00b7"+
		"\3\2\2\2\u0401\u0402\7)\2\2\u0402\u00b9\3\2\2\2\u0403\u0404\7*\2\2\u0404"+
		"\u00bb\3\2\2\2\u0094\u00c4\u00d7\u00df\u00ea\u00f4\u00fb\u0102\u010c\u010f"+
		"\u0113\u011a\u011f\u0123\u012a\u012d\u0139\u013f\u0146\u014a\u0152\u0159"+
		"\u0162\u0165\u016f\u0181\u0188\u0190\u0197\u01a0\u01a4\u01a8\u01af\u01ba"+
		"\u01c1\u01c5\u01ce\u01d2\u01d8\u01da\u01e0\u01e7\u01eb\u01f1\u01f3\u01f7"+
		"\u01f9\u01fe\u0202\u0208\u020a\u0210\u0216\u021a\u0220\u0222\u0225\u022b"+
		"\u0235\u023f\u0249\u024d\u0251\u0259\u025d\u0260\u0263\u0269\u026d\u0271"+
		"\u0279\u027d\u0280\u0284\u0288\u028c\u0296\u02a1\u02af\u02b4\u02ba\u02bc"+
		"\u02c3\u02c9\u02ce\u02d3\u02db\u02df\u02e7\u02ec\u02f3\u02fc\u02ff\u0305"+
		"\u030d\u0315\u0319\u0321\u0325\u0329\u032c\u032f\u0337\u0349\u0354\u035c"+
		"\u035f\u0363\u0366\u0369\u036c\u0372\u0375\u0378\u037b\u037e\u0382\u0385"+
		"\u0388\u038b\u038e\u0392\u0395\u0398\u039b\u039f\u03a2\u03a5\u03a8\u03ac"+
		"\u03af\u03b2\u03b4\u03b7\u03ba\u03be\u03c1\u03c4\u03c7\u03d2\u03d5\u03d9"+
		"\u03dc\u03df\u03e1\u03eb\u03f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}