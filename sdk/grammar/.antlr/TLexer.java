// Generated from /home/user/projects/sdk/sdk/grammar/TLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, Ret=7, Function=8, Pub=9, Pro=10, 
		Priv=11, Static=12, Final=13, Interface=14, Abstract=15, Extends=16, Class=17, 
		Implements=18, New=19, ArrowRight=20, End=21, Attr=22, Point=23, TwoPoint=24, 
		TwoTwoPoint=25, Separator=26, OpenArIndex=27, CloseArIndex=28, OpenBlock=29, 
		CloseBlock=30, OpenOp=31, CloseOp=32, ArithmeticOperator=33, AssignmentOperator=34, 
		Not=35, IncDecOperators=36, Identifier=37, IDPrefix=38, TypeSpec=39, String=40, 
		Integer=41, Float=42, Whitespace=43, Newline=44, Words=45, BlockComment=46, 
		LineComment=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
			"Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
			"LineComment", "DecimalExponent", "DecimalDigits", "FloatLiteral", "IntegerLiteral", 
			"FloatTypeSuffix", "ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", 
			"Binary", "Octal", "Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", 
			"FloatFrag", "NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'->'", 
			"';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "ArrowRight", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "AssignmentOperator", 
			"Not", "IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", 
			"Integer", "Float", "Whitespace", "Newline", "Words", "BlockComment", 
			"LineComment"
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


	public TLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0227\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0129\n#\3$\3$\3%\3%\3%\3%\5%\u0131"+
		"\n%\3&\3&\3&\3&\6&\u0137\n&\r&\16&\u0138\3&\7&\u013c\n&\f&\16&\u013f\13"+
		"&\5&\u0141\n&\3\'\3\'\5\'\u0145\n\'\3(\3(\3(\3)\3)\3)\3)\7)\u014e\n)\f"+
		")\16)\u0151\13)\3)\3)\3)\3)\3)\7)\u0158\n)\f)\16)\u015b\13)\3)\5)\u015e"+
		"\n)\3*\6*\u0161\n*\r*\16*\u0162\3*\3*\6*\u0167\n*\r*\16*\u0168\5*\u016b"+
		"\n*\3+\3+\3+\5+\u0170\n+\3,\6,\u0173\n,\r,\16,\u0174\3,\3,\3-\3-\5-\u017b"+
		"\n-\3-\5-\u017e\n-\3-\3-\3.\6.\u0183\n.\r.\16.\u0184\3/\3/\3/\3/\7/\u018b"+
		"\n/\f/\16/\u018e\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0199\n\60"+
		"\f\60\16\60\u019c\13\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u01ab\n\61\3\62\6\62\u01ae\n\62\r\62\16\62\u01af"+
		"\3\63\3\63\5\63\u01b4\n\63\3\64\3\64\5\64\u01b8\n\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u01c7\n\67\38\3"+
		"8\38\38\58\u01cd\n8\39\39\39\39\79\u01d3\n9\f9\169\u01d6\139\59\u01d8"+
		"\n9\3:\3:\3:\3:\5:\u01de\n:\3:\6:\u01e1\n:\r:\16:\u01e2\3;\3;\3;\6;\u01e8"+
		"\n;\r;\16;\u01e9\3<\3<\3<\3<\5<\u01f0\n<\3<\3<\6<\u01f4\n<\r<\16<\u01f5"+
		"\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\5@\u0203\n@\5@\u0205\n@\3@\3@\3@\5@"+
		"\u020a\n@\5@\u020c\n@\3A\3A\3A\5A\u0211\nA\3B\3B\7B\u0215\nB\fB\16B\u0218"+
		"\13B\3C\3C\6C\u021c\nC\rC\16C\u021d\3D\3D\3D\3D\6D\u0224\nD\rD\16D\u0225"+
		"\3\u018c\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\2g\2i\2k"+
		"\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\3"+
		"\2\22\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\3\2//"+
		"\4\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2"+
		"\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u0254\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3\u0089\3\2\2\2\5"+
		"\u008d\3\2\2\2\7\u0091\3\2\2\2\t\u0094\3\2\2\2\13\u0099\3\2\2\2\r\u009e"+
		"\3\2\2\2\17\u00a2\3\2\2\2\21\u00a6\3\2\2\2\23\u00a9\3\2\2\2\25\u00ad\3"+
		"\2\2\2\27\u00b1\3\2\2\2\31\u00b6\3\2\2\2\33\u00bd\3\2\2\2\35\u00c3\3\2"+
		"\2\2\37\u00cd\3\2\2\2!\u00d6\3\2\2\2#\u00de\3\2\2\2%\u00e4\3\2\2\2\'\u00ef"+
		"\3\2\2\2)\u00f3\3\2\2\2+\u00f6\3\2\2\2-\u00f8\3\2\2\2/\u00fa\3\2\2\2\61"+
		"\u00fc\3\2\2\2\63\u00fe\3\2\2\2\65\u0101\3\2\2\2\67\u0103\3\2\2\29\u0105"+
		"\3\2\2\2;\u0107\3\2\2\2=\u0109\3\2\2\2?\u010b\3\2\2\2A\u010d\3\2\2\2C"+
		"\u010f\3\2\2\2E\u0128\3\2\2\2G\u012a\3\2\2\2I\u0130\3\2\2\2K\u0140\3\2"+
		"\2\2M\u0144\3\2\2\2O\u0146\3\2\2\2Q\u015d\3\2\2\2S\u016a\3\2\2\2U\u016f"+
		"\3\2\2\2W\u0172\3\2\2\2Y\u017d\3\2\2\2[\u0182\3\2\2\2]\u0186\3\2\2\2_"+
		"\u0194\3\2\2\2a\u01aa\3\2\2\2c\u01ad\3\2\2\2e\u01b1\3\2\2\2g\u01b5\3\2"+
		"\2\2i\u01b9\3\2\2\2k\u01bb\3\2\2\2m\u01c6\3\2\2\2o\u01cc\3\2\2\2q\u01d7"+
		"\3\2\2\2s\u01dd\3\2\2\2u\u01e4\3\2\2\2w\u01ef\3\2\2\2y\u01f7\3\2\2\2{"+
		"\u01f9\3\2\2\2}\u01fb\3\2\2\2\177\u020b\3\2\2\2\u0081\u0210\3\2\2\2\u0083"+
		"\u0212\3\2\2\2\u0085\u0219\3\2\2\2\u0087\u021f\3\2\2\2\u0089\u008a\7w"+
		"\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\4\3\2\2\2\u008d\u008e"+
		"\7x\2\2\u008e\u008f\7c\2\2\u008f\u0090\7t\2\2\u0090\6\3\2\2\2\u0091\u0092"+
		"\7k\2\2\u0092\u0093\7h\2\2\u0093\b\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\n\3\2\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d"+
		"\f\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\16\3\2\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\20\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7p\2\2\u00a8\22\3\2\2\2\u00a9"+
		"\u00aa\7r\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7d\2\2\u00ac\24\3\2\2\2\u00ad"+
		"\u00ae\7r\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7q\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7x\2\2"+
		"\u00b5\30\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7"+
		"c\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7e\2\2\u00bc\32"+
		"\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2"+
		"\u00c8\u00c9\7h\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\36\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7d\2\2\u00cf\u00d0"+
		"\7u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7c\2\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7v\2\2\u00d5 \3\2\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7z\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2"+
		"\u00db\u00dc\7f\2\2\u00dc\u00dd\7u\2\2\u00dd\"\3\2\2\2\u00de\u00df\7e"+
		"\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3"+
		"\7u\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7"+
		"\7r\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7o\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7u\2\2"+
		"\u00ee&\3\2\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7y\2"+
		"\2\u00f2(\3\2\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\7@\2\2\u00f5*\3\2\2\2"+
		"\u00f6\u00f7\7=\2\2\u00f7,\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9.\3\2\2\2\u00fa"+
		"\u00fb\7\60\2\2\u00fb\60\3\2\2\2\u00fc\u00fd\7<\2\2\u00fd\62\3\2\2\2\u00fe"+
		"\u00ff\7<\2\2\u00ff\u0100\7<\2\2\u0100\64\3\2\2\2\u0101\u0102\7.\2\2\u0102"+
		"\66\3\2\2\2\u0103\u0104\7]\2\2\u01048\3\2\2\2\u0105\u0106\7_\2\2\u0106"+
		":\3\2\2\2\u0107\u0108\7}\2\2\u0108<\3\2\2\2\u0109\u010a\7\177\2\2\u010a"+
		">\3\2\2\2\u010b\u010c\7*\2\2\u010c@\3\2\2\2\u010d\u010e\7+\2\2\u010eB"+
		"\3\2\2\2\u010f\u0110\t\2\2\2\u0110D\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0129"+
		"\7?\2\2\u0113\u0114\7/\2\2\u0114\u0129\7?\2\2\u0115\u0116\7,\2\2\u0116"+
		"\u0129\7?\2\2\u0117\u0118\7\61\2\2\u0118\u0129\7?\2\2\u0119\u011a\7\'"+
		"\2\2\u011a\u0129\7?\2\2\u011b\u0129\t\3\2\2\u011c\u011d\7@\2\2\u011d\u0129"+
		"\7?\2\2\u011e\u011f\7>\2\2\u011f\u0129\7?\2\2\u0120\u0121\7(\2\2\u0121"+
		"\u0129\7(\2\2\u0122\u0123\7~\2\2\u0123\u0129\7~\2\2\u0124\u0125\7?\2\2"+
		"\u0125\u0129\7?\2\2\u0126\u0127\7#\2\2\u0127\u0129\7?\2\2\u0128\u0111"+
		"\3\2\2\2\u0128\u0113\3\2\2\2\u0128\u0115\3\2\2\2\u0128\u0117\3\2\2\2\u0128"+
		"\u0119\3\2\2\2\u0128\u011b\3\2\2\2\u0128\u011c\3\2\2\2\u0128\u011e\3\2"+
		"\2\2\u0128\u0120\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129F\3\2\2\2\u012a\u012b\7#\2\2\u012bH\3\2\2\2\u012c"+
		"\u012d\7-\2\2\u012d\u0131\7-\2\2\u012e\u012f\7/\2\2\u012f\u0131\7/\2\2"+
		"\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131J\3\2\2\2\u0132\u0141\5"+
		"M\'\2\u0133\u013d\5M\'\2\u0134\u013c\5[.\2\u0135\u0137\t\4\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u013c\t\5\2\2\u013b\u0134\3\2\2\2\u013b\u0136\3\2"+
		"\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0132\3\2"+
		"\2\2\u0140\u0133\3\2\2\2\u0141L\3\2\2\2\u0142\u0145\t\5\2\2\u0143\u0145"+
		"\5[.\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145N\3\2\2\2\u0146\u0147"+
		"\t\6\2\2\u0147\u0148\5K&\2\u0148P\3\2\2\2\u0149\u014f\7$\2\2\u014a\u014e"+
		"\n\7\2\2\u014b\u014c\7^\2\2\u014c\u014e\7$\2\2\u014d\u014a\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u015e\7$\2\2\u0153"+
		"\u0159\7)\2\2\u0154\u0158\n\b\2\2\u0155\u0156\7^\2\2\u0156\u0158\7)\2"+
		"\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015e\7)\2\2\u015d\u0149\3\2\2\2\u015d\u0153\3\2\2\2\u015eR\3\2\2\2\u015f"+
		"\u0161\t\4\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u016b\3\2\2\2\u0164\u0166\t\t\2\2\u0165"+
		"\u0167\t\4\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0160\3\2\2\2\u016a"+
		"\u0164\3\2\2\2\u016bT\3\2\2\2\u016c\u0170\5e\63\2\u016d\u016e\t\t\2\2"+
		"\u016e\u0170\5e\63\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u0170V\3"+
		"\2\2\2\u0171\u0173\t\n\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b,"+
		"\2\2\u0177X\3\2\2\2\u0178\u017a\7\17\2\2\u0179\u017b\7\f\2\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017e\7\f\2\2\u017d"+
		"\u0178\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\b-"+
		"\2\2\u0180Z\3\2\2\2\u0181\u0183\t\22\2\2\u0182\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\\\3\2\2\2\u0186"+
		"\u0187\7\61\2\2\u0187\u0188\7,\2\2\u0188\u018c\3\2\2\2\u0189\u018b\13"+
		"\2\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7,"+
		"\2\2\u0190\u0191\7\61\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b/\2\2\u0193"+
		"^\3\2\2\2\u0194\u0195\7\61\2\2\u0195\u0196\7\61\2\2\u0196\u019a\3\2\2"+
		"\2\u0197\u0199\n\13\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u019e\b\60\2\2\u019e`\3\2\2\2\u019f\u01ab\t\f\2\2\u01a0\u01a1"+
		"\7g\2\2\u01a1\u01ab\7-\2\2\u01a2\u01a3\7G\2\2\u01a3\u01ab\7-\2\2\u01a4"+
		"\u01a5\7g\2\2\u01a5\u01ab\7/\2\2\u01a6\u01a7\7G\2\2\u01a7\u01a8\7/\2\2"+
		"\u01a8\u01a9\3\2\2\2\u01a9\u01ab\5c\62\2\u01aa\u019f\3\2\2\2\u01aa\u01a0"+
		"\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01a6\3\2\2\2\u01ab"+
		"b\3\2\2\2\u01ac\u01ae\t\r\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0d\3\2\2\2\u01b1\u01b3\5"+
		"\177@\2\u01b2\u01b4\5k\66\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"f\3\2\2\2\u01b5\u01b7\5o8\2\u01b6\u01b8\5m\67\2\u01b7\u01b6\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8h\3\2\2\2\u01b9\u01ba\t\16\2\2\u01baj\3\2\2\2\u01bb"+
		"\u01bc\7k\2\2\u01bcl\3\2\2\2\u01bd\u01c7\t\17\2\2\u01be\u01bf\7N\2\2\u01bf"+
		"\u01c7\7w\2\2\u01c0\u01c1\7N\2\2\u01c1\u01c7\7W\2\2\u01c2\u01c3\7w\2\2"+
		"\u01c3\u01c7\7N\2\2\u01c4\u01c5\7W\2\2\u01c5\u01c7\7N\2\2\u01c6\u01bd"+
		"\3\2\2\2\u01c6\u01be\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7n\3\2\2\2\u01c8\u01cd\5q9\2\u01c9\u01cd\5s:\2\u01ca"+
		"\u01cd\5u;\2\u01cb\u01cd\5w<\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2\2\2"+
		"\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cdp\3\2\2\2\u01ce\u01d8\7"+
		"\62\2\2\u01cf\u01d4\4\63;\2\u01d0\u01d3\5y=\2\u01d1\u01d3\7a\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7"+
		"\u01ce\3\2\2\2\u01d7\u01cf\3\2\2\2\u01d8r\3\2\2\2\u01d9\u01da\7\62\2\2"+
		"\u01da\u01de\7d\2\2\u01db\u01dc\7\62\2\2\u01dc\u01de\7D\2\2\u01dd\u01d9"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\t\20\2\2"+
		"\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3t\3\2\2\2\u01e4\u01e7\7\62\2\2\u01e5\u01e8\5{>\2\u01e6\u01e8"+
		"\7a\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eav\3\2\2\2\u01eb\u01ec\7\62\2\2"+
		"\u01ec\u01f0\7z\2\2\u01ed\u01ee\7\62\2\2\u01ee\u01f0\7Z\2\2\u01ef\u01eb"+
		"\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01f4\5}?\2\u01f2"+
		"\u01f4\7a\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6x\3\2\2\2\u01f7\u01f8"+
		"\4\62;\2\u01f8z\3\2\2\2\u01f9\u01fa\4\629\2\u01fa|\3\2\2\2\u01fb\u01fc"+
		"\t\21\2\2\u01fc~\3\2\2\2\u01fd\u0204\5c\62\2\u01fe\u0205\5i\65\2\u01ff"+
		"\u0200\7\60\2\2\u0200\u0202\5c\62\2\u0201\u0203\5a\61\2\u0202\u0201\3"+
		"\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u01fe\3\2\2\2\u0204"+
		"\u01ff\3\2\2\2\u0205\u020c\3\2\2\2\u0206\u0207\7\60\2\2\u0207\u0209\5"+
		"c\62\2\u0208\u020a\5a\61\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u01fd\3\2\2\2\u020b\u0206\3\2\2\2\u020c\u0080\3\2"+
		"\2\2\u020d\u0211\5\u0083B\2\u020e\u0211\5\u0085C\2\u020f\u0211\5\u0087"+
		"D\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211"+
		"\u0082\3\2\2\2\u0212\u0216\4\63;\2\u0213\u0215\4\62;\2\u0214\u0213\3\2"+
		"\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0084\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\7\62\2\2\u021a\u021c\4"+
		"\629\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0086\3\2\2\2\u021f\u0220\7\62\2\2\u0220\u0221\7"+
		"z\2\2\u0221\u0223\3\2\2\2\u0222\u0224\t\21\2\2\u0223\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0088\3\2"+
		"\2\2\61\2\u0128\u0130\u0138\u013b\u013d\u0140\u0144\u014d\u014f\u0157"+
		"\u0159\u015d\u0162\u0168\u016a\u016f\u0174\u017a\u017d\u0184\u018c\u019a"+
		"\u01aa\u01af\u01b3\u01b7\u01c6\u01cc\u01d2\u01d4\u01d7\u01dd\u01e2\u01e7"+
		"\u01e9\u01ef\u01f3\u01f5\u0202\u0204\u0209\u020b\u0210\u0216\u021d\u0225"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}