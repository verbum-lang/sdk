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
		Use=1, Var=2, If=3, Elif=4, Else=5, For=6, Ret=7, End=8, Attr=9, Point=10, 
		TwoPoint=11, TwoTwoPoint=12, Separator=13, OpenArIndex=14, CloseArIndex=15, 
		OpenBlock=16, CloseBlock=17, OpenOp=18, CloseOp=19, ArithmeticOperator=20, 
		AssignmentOperator=21, Not=22, IncDecOperators=23, Identifier=24, IDPrefix=25, 
		TypeSpec=26, String=27, Integer=28, Float=29, Whitespace=30, Newline=31, 
		Words=32, BlockComment=33, LineComment=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "If", "Elif", "Else", "For", "Ret", "End", "Attr", "Point", 
			"TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
			"BlockComment", "LineComment", "DecimalExponent", "DecimalDigits", "FloatLiteral", 
			"IntegerLiteral", "FloatTypeSuffix", "ImaginarySuffix", "IntSuffix", 
			"IntegerFrag", "Decimal", "Binary", "Octal", "Hexadecimal", "DecimalDigit", 
			"OctalDigit", "HexDigit", "FloatFrag", "NUMBER", "DIGITS", "OCTAL_DIGITS", 
			"HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", 
			"'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "End", "Attr", 
			"Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"AssignmentOperator", "Not", "IncDecOperators", "Identifier", "IDPrefix", 
			"TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", "Words", 
			"BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u01b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00bf\n\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\5\30\u00c7\n\30\3\31\3\31\3\31\3\31\6\31\u00cd\n\31\r"+
		"\31\16\31\u00ce\3\31\7\31\u00d2\n\31\f\31\16\31\u00d5\13\31\5\31\u00d7"+
		"\n\31\3\32\3\32\5\32\u00db\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34"+
		"\u00e4\n\34\f\34\16\34\u00e7\13\34\3\34\3\34\3\34\3\34\3\34\7\34\u00ee"+
		"\n\34\f\34\16\34\u00f1\13\34\3\34\5\34\u00f4\n\34\3\35\6\35\u00f7\n\35"+
		"\r\35\16\35\u00f8\3\36\3\36\3\37\6\37\u00fe\n\37\r\37\16\37\u00ff\3\37"+
		"\3\37\3 \3 \5 \u0106\n \3 \5 \u0109\n \3 \3 \3!\6!\u010e\n!\r!\16!\u010f"+
		"\3\"\3\"\3\"\3\"\7\"\u0116\n\"\f\"\16\"\u0119\13\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\7#\u0124\n#\f#\16#\u0127\13#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\5$\u0136\n$\3%\6%\u0139\n%\r%\16%\u013a\3&\3&\5&\u013f\n&\3"+
		"\'\3\'\5\'\u0143\n\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0152\n"+
		"*\3+\3+\3+\3+\5+\u0158\n+\3,\3,\3,\3,\7,\u015e\n,\f,\16,\u0161\13,\5,"+
		"\u0163\n,\3-\3-\3-\3-\5-\u0169\n-\3-\6-\u016c\n-\r-\16-\u016d\3.\3.\3"+
		".\6.\u0173\n.\r.\16.\u0174\3/\3/\3/\3/\5/\u017b\n/\3/\3/\6/\u017f\n/\r"+
		"/\16/\u0180\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u018e\n\63\5\63\u0190\n\63\3\63\3\63\3\63\5\63\u0195\n\63\5\63\u0197"+
		"\n\63\3\64\3\64\3\64\5\64\u019c\n\64\3\65\3\65\7\65\u01a0\n\65\f\65\16"+
		"\65\u01a3\13\65\3\66\3\66\6\66\u01a7\n\66\r\66\16\66\u01a8\3\67\3\67\3"+
		"\67\3\67\6\67\u01af\n\67\r\67\16\67\u01b0\3\u0117\28\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K"+
		"\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2\3\2\21\6\2\'\',"+
		"-//\61\61\4\2>>@@\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4\2\13\13\"\"\4\2\f"+
		"\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHc"+
		"h\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u01dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2\7w\3\2\2\2\tz\3"+
		"\2\2\2\13\177\3\2\2\2\r\u0084\3\2\2\2\17\u0088\3\2\2\2\21\u008c\3\2\2"+
		"\2\23\u008e\3\2\2\2\25\u0090\3\2\2\2\27\u0092\3\2\2\2\31\u0094\3\2\2\2"+
		"\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f"+
		"\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00be\3\2\2\2"+
		"-\u00c0\3\2\2\2/\u00c6\3\2\2\2\61\u00d6\3\2\2\2\63\u00da\3\2\2\2\65\u00dc"+
		"\3\2\2\2\67\u00f3\3\2\2\29\u00f6\3\2\2\2;\u00fa\3\2\2\2=\u00fd\3\2\2\2"+
		"?\u0108\3\2\2\2A\u010d\3\2\2\2C\u0111\3\2\2\2E\u011f\3\2\2\2G\u0135\3"+
		"\2\2\2I\u0138\3\2\2\2K\u013c\3\2\2\2M\u0140\3\2\2\2O\u0144\3\2\2\2Q\u0146"+
		"\3\2\2\2S\u0151\3\2\2\2U\u0157\3\2\2\2W\u0162\3\2\2\2Y\u0168\3\2\2\2["+
		"\u016f\3\2\2\2]\u017a\3\2\2\2_\u0182\3\2\2\2a\u0184\3\2\2\2c\u0186\3\2"+
		"\2\2e\u0196\3\2\2\2g\u019b\3\2\2\2i\u019d\3\2\2\2k\u01a4\3\2\2\2m\u01aa"+
		"\3\2\2\2op\7w\2\2pq\7u\2\2qr\7g\2\2r\4\3\2\2\2st\7x\2\2tu\7c\2\2uv\7t"+
		"\2\2v\6\3\2\2\2wx\7k\2\2xy\7h\2\2y\b\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7k\2"+
		"\2}~\7h\2\2~\n\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7n\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7g\2\2\u0083\f\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7q\2\2\u0086\u0087\7t\2\2\u0087\16\3\2\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7v\2\2\u008b\20\3\2\2\2\u008c\u008d\7=\2\2\u008d\22"+
		"\3\2\2\2\u008e\u008f\7?\2\2\u008f\24\3\2\2\2\u0090\u0091\7\60\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0093\7<\2\2\u0093\30\3\2\2\2\u0094\u0095\7<\2\2\u0095"+
		"\u0096\7<\2\2\u0096\32\3\2\2\2\u0097\u0098\7.\2\2\u0098\34\3\2\2\2\u0099"+
		"\u009a\7]\2\2\u009a\36\3\2\2\2\u009b\u009c\7_\2\2\u009c \3\2\2\2\u009d"+
		"\u009e\7}\2\2\u009e\"\3\2\2\2\u009f\u00a0\7\177\2\2\u00a0$\3\2\2\2\u00a1"+
		"\u00a2\7*\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7+\2\2\u00a4(\3\2\2\2\u00a5\u00a6"+
		"\t\2\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\u00bf\7?\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\u00bf\7?\2\2\u00ab\u00ac\7,\2\2\u00ac\u00bf\7?\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae\u00bf\7?\2\2\u00af\u00b0\7\'\2\2\u00b0\u00bf\7?"+
		"\2\2\u00b1\u00bf\t\3\2\2\u00b2\u00b3\7@\2\2\u00b3\u00bf\7?\2\2\u00b4\u00b5"+
		"\7>\2\2\u00b5\u00bf\7?\2\2\u00b6\u00b7\7(\2\2\u00b7\u00bf\7(\2\2\u00b8"+
		"\u00b9\7~\2\2\u00b9\u00bf\7~\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bf\7?\2\2"+
		"\u00bc\u00bd\7#\2\2\u00bd\u00bf\7?\2\2\u00be\u00a7\3\2\2\2\u00be\u00a9"+
		"\3\2\2\2\u00be\u00ab\3\2\2\2\u00be\u00ad\3\2\2\2\u00be\u00af\3\2\2\2\u00be"+
		"\u00b1\3\2\2\2\u00be\u00b2\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b6\3\2"+
		"\2\2\u00be\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		",\3\2\2\2\u00c0\u00c1\7#\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7-\2\2\u00c3\u00c7"+
		"\7-\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c7\7/\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\60\3\2\2\2\u00c8\u00d7\5\63\32\2\u00c9\u00d3\5\63"+
		"\32\2\u00ca\u00d2\5A!\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00d2\t\5\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00c8\3\2\2\2\u00d6"+
		"\u00c9\3\2\2\2\u00d7\62\3\2\2\2\u00d8\u00db\t\5\2\2\u00d9\u00db\5A!\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\64\3\2\2\2\u00dc\u00dd"+
		"\t\6\2\2\u00dd\u00de\5\61\31\2\u00de\66\3\2\2\2\u00df\u00e5\7$\2\2\u00e0"+
		"\u00e4\n\7\2\2\u00e1\u00e2\7^\2\2\u00e2\u00e4\7$\2\2\u00e3\u00e0\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00f4\7$\2\2\u00e9"+
		"\u00ef\7)\2\2\u00ea\u00ee\n\b\2\2\u00eb\u00ec\7^\2\2\u00ec\u00ee\7)\2"+
		"\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\7)\2\2\u00f3\u00df\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f48\3\2\2\2\u00f5"+
		"\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9:\3\2\2\2\u00fa\u00fb\5K&\2\u00fb<\3\2\2"+
		"\2\u00fc\u00fe\t\t\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\b\37\2\2"+
		"\u0102>\3\2\2\2\u0103\u0105\7\17\2\2\u0104\u0106\7\f\2\2\u0105\u0104\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0109\7\f\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b "+
		"\2\2\u010b@\3\2\2\2\u010c\u010e\t\21\2\2\u010d\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110B\3\2\2\2\u0111"+
		"\u0112\7\61\2\2\u0112\u0113\7,\2\2\u0113\u0117\3\2\2\2\u0114\u0116\13"+
		"\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0118\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7,"+
		"\2\2\u011b\u011c\7\61\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\"\2\2\u011e"+
		"D\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0121\7\61\2\2\u0121\u0125\3\2\2"+
		"\2\u0122\u0124\n\n\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\b#\2\2\u0129F\3\2\2\2\u012a\u0136\t\13\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u0136\7-\2\2\u012d\u012e\7G\2\2\u012e\u0136\7-\2\2\u012f\u0130\7g\2\2"+
		"\u0130\u0136\7/\2\2\u0131\u0132\7G\2\2\u0132\u0133\7/\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0136\5I%\2\u0135\u012a\3\2\2\2\u0135\u012b\3\2\2\2\u0135"+
		"\u012d\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0131\3\2\2\2\u0136H\3\2\2\2"+
		"\u0137\u0139\t\f\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013bJ\3\2\2\2\u013c\u013e\5e\63\2\u013d"+
		"\u013f\5Q)\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013fL\3\2\2\2\u0140"+
		"\u0142\5U+\2\u0141\u0143\5S*\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2"+
		"\u0143N\3\2\2\2\u0144\u0145\t\r\2\2\u0145P\3\2\2\2\u0146\u0147\7k\2\2"+
		"\u0147R\3\2\2\2\u0148\u0152\t\16\2\2\u0149\u014a\7N\2\2\u014a\u0152\7"+
		"w\2\2\u014b\u014c\7N\2\2\u014c\u0152\7W\2\2\u014d\u014e\7w\2\2\u014e\u0152"+
		"\7N\2\2\u014f\u0150\7W\2\2\u0150\u0152\7N\2\2\u0151\u0148\3\2\2\2\u0151"+
		"\u0149\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152T\3\2\2\2\u0153\u0158\5W,\2\u0154\u0158\5Y-\2\u0155\u0158\5"+
		"[.\2\u0156\u0158\5]/\2\u0157\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0156\3\2\2\2\u0158V\3\2\2\2\u0159\u0163\7\62\2\2\u015a"+
		"\u015f\4\63;\2\u015b\u015e\5_\60\2\u015c\u015e\7a\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0159\3\2"+
		"\2\2\u0162\u015a\3\2\2\2\u0163X\3\2\2\2\u0164\u0165\7\62\2\2\u0165\u0169"+
		"\7d\2\2\u0166\u0167\7\62\2\2\u0167\u0169\7D\2\2\u0168\u0164\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u016c\t\17\2\2\u016b\u016a\3"+
		"\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"Z\3\2\2\2\u016f\u0172\7\62\2\2\u0170\u0173\5a\61\2\u0171\u0173\7a\2\2"+
		"\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\\\3\2\2\2\u0176\u0177\7\62\2\2\u0177"+
		"\u017b\7z\2\2\u0178\u0179\7\62\2\2\u0179\u017b\7Z\2\2\u017a\u0176\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017f\5c\62\2\u017d"+
		"\u017f\7a\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181^\3\2\2\2\u0182\u0183"+
		"\4\62;\2\u0183`\3\2\2\2\u0184\u0185\4\629\2\u0185b\3\2\2\2\u0186\u0187"+
		"\t\20\2\2\u0187d\3\2\2\2\u0188\u018f\5I%\2\u0189\u0190\5O(\2\u018a\u018b"+
		"\7\60\2\2\u018b\u018d\5I%\2\u018c\u018e\5G$\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2"+
		"\2\2\u0190\u0197\3\2\2\2\u0191\u0192\7\60\2\2\u0192\u0194\5I%\2\u0193"+
		"\u0195\5G$\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\3\2\2"+
		"\2\u0196\u0188\3\2\2\2\u0196\u0191\3\2\2\2\u0197f\3\2\2\2\u0198\u019c"+
		"\5i\65\2\u0199\u019c\5k\66\2\u019a\u019c\5m\67\2\u019b\u0198\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019ch\3\2\2\2\u019d\u01a1\4\63;\2"+
		"\u019e\u01a0\4\62;\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2j\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a6\7\62\2\2\u01a5\u01a7\4\629\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3"+
		"\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9l\3\2\2\2\u01aa\u01ab"+
		"\7\62\2\2\u01ab\u01ac\7z\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\t\20\2\2"+
		"\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1n\3\2\2\2.\2\u00be\u00c6\u00ce\u00d1\u00d3\u00d6\u00da\u00e3"+
		"\u00e5\u00ed\u00ef\u00f3\u00f8\u00ff\u0105\u0108\u010f\u0117\u0125\u0135"+
		"\u013a\u013e\u0142\u0151\u0157\u015d\u015f\u0162\u0168\u016d\u0172\u0174"+
		"\u017a\u017e\u0180\u018d\u018f\u0194\u0196\u019b\u01a1\u01a8\u01b0\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}