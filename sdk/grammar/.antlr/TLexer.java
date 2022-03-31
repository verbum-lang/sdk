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
		Use=1, Var=2, Bool=3, End=4, Attr=5, Point=6, TwoPoint=7, TwoTwoPoint=8, 
		Separator=9, OpenArIndex=10, CloseArIndex=11, OpenBlock=12, CloseBlock=13, 
		OpenOp=14, CloseOp=15, ArithmeticOperator=16, IncDecOperators=17, Identifier=18, 
		IDPrefix=19, TypeSpec=20, String=21, Integer=22, Float=23, Whitespace=24, 
		Newline=25, Words=26, BlockComment=27, LineComment=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "Bool", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", 
			"Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", 
			"OpenOp", "CloseOp", "ArithmeticOperator", "IncDecOperators", "Identifier", 
			"IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", 
			"Words", "BlockComment", "LineComment", "DecimalExponent", "DecimalDigits", 
			"FloatLiteral", "IntegerLiteral", "FloatTypeSuffix", "ImaginarySuffix", 
			"IntSuffix", "IntegerFrag", "Decimal", "Binary", "Octal", "Hexadecimal", 
			"DecimalDigit", "OctalDigit", "HexDigit", "FloatFrag", "NUMBER", "DIGITS", 
			"OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", null, "';'", "'='", "'.'", "':'", "'::'", "','", 
			"'['", "']'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "Bool", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", 
			"Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", 
			"OpenOp", "CloseOp", "ArithmeticOperator", "IncDecOperators", "Identifier", 
			"IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", "Newline", 
			"Words", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0181\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0096\n\22"+
		"\3\23\3\23\3\23\3\23\6\23\u009c\n\23\r\23\16\23\u009d\3\23\7\23\u00a1"+
		"\n\23\f\23\16\23\u00a4\13\23\5\23\u00a6\n\23\3\24\3\24\5\24\u00aa\n\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00b3\n\26\f\26\16\26\u00b6\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u00bd\n\26\f\26\16\26\u00c0\13\26\3"+
		"\26\5\26\u00c3\n\26\3\27\6\27\u00c6\n\27\r\27\16\27\u00c7\3\30\3\30\3"+
		"\31\6\31\u00cd\n\31\r\31\16\31\u00ce\3\31\3\31\3\32\3\32\5\32\u00d5\n"+
		"\32\3\32\5\32\u00d8\n\32\3\32\3\32\3\33\6\33\u00dd\n\33\r\33\16\33\u00de"+
		"\3\34\3\34\3\34\3\34\7\34\u00e5\n\34\f\34\16\34\u00e8\13\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00f3\n\35\f\35\16\35\u00f6\13"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u0105\n\36\3\37\6\37\u0108\n\37\r\37\16\37\u0109\3 \3 \5 \u010e\n"+
		" \3!\3!\5!\u0112\n!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0121"+
		"\n$\3%\3%\3%\3%\5%\u0127\n%\3&\3&\3&\3&\7&\u012d\n&\f&\16&\u0130\13&\5"+
		"&\u0132\n&\3\'\3\'\3\'\3\'\5\'\u0138\n\'\3\'\6\'\u013b\n\'\r\'\16\'\u013c"+
		"\3(\3(\3(\6(\u0142\n(\r(\16(\u0143\3)\3)\3)\3)\5)\u014a\n)\3)\3)\6)\u014e"+
		"\n)\r)\16)\u014f\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3-\5-\u015d\n-\5-\u015f"+
		"\n-\3-\3-\3-\5-\u0164\n-\5-\u0166\n-\3.\3.\3.\5.\u016b\n.\3/\3/\7/\u016f"+
		"\n/\f/\16/\u0172\13/\3\60\3\60\6\60\u0176\n\60\r\60\16\60\u0177\3\61\3"+
		"\61\3\61\3\61\6\61\u017e\n\61\r\61\16\61\u017f\3\u00e6\2\62\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\2"+
		"C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2\3\2\20\6\2\'\',-//\61"+
		"\61\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4\2\13\13\"\"\4\2\f\f\17\17\4\2GG"+
		"gg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2"+
		"c\2|\2\u0082\2\1\22\u01a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\3c\3\2\2\2\5g\3\2\2\2\7t\3\2\2\2\tv\3\2\2\2\13x\3"+
		"\2\2\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0081\3\2\2\2\25\u0083\3"+
		"\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3\2\2\2\35\u008b\3\2"+
		"\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0095\3\2\2\2%\u00a5\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ab\3\2\2\2+\u00c2\3\2\2\2-\u00c5\3\2\2\2/\u00c9\3\2\2\2\61"+
		"\u00cc\3\2\2\2\63\u00d7\3\2\2\2\65\u00dc\3\2\2\2\67\u00e0\3\2\2\29\u00ee"+
		"\3\2\2\2;\u0104\3\2\2\2=\u0107\3\2\2\2?\u010b\3\2\2\2A\u010f\3\2\2\2C"+
		"\u0113\3\2\2\2E\u0115\3\2\2\2G\u0120\3\2\2\2I\u0126\3\2\2\2K\u0131\3\2"+
		"\2\2M\u0137\3\2\2\2O\u013e\3\2\2\2Q\u0149\3\2\2\2S\u0151\3\2\2\2U\u0153"+
		"\3\2\2\2W\u0155\3\2\2\2Y\u0165\3\2\2\2[\u016a\3\2\2\2]\u016c\3\2\2\2_"+
		"\u0173\3\2\2\2a\u0179\3\2\2\2cd\7w\2\2de\7u\2\2ef\7g\2\2f\4\3\2\2\2gh"+
		"\7x\2\2hi\7c\2\2ij\7t\2\2j\6\3\2\2\2kl\7v\2\2lm\7t\2\2mn\7w\2\2nu\7g\2"+
		"\2op\7h\2\2pq\7c\2\2qr\7n\2\2rs\7u\2\2su\7g\2\2tk\3\2\2\2to\3\2\2\2u\b"+
		"\3\2\2\2vw\7=\2\2w\n\3\2\2\2xy\7?\2\2y\f\3\2\2\2z{\7\60\2\2{\16\3\2\2"+
		"\2|}\7<\2\2}\20\3\2\2\2~\177\7<\2\2\177\u0080\7<\2\2\u0080\22\3\2\2\2"+
		"\u0081\u0082\7.\2\2\u0082\24\3\2\2\2\u0083\u0084\7]\2\2\u0084\26\3\2\2"+
		"\2\u0085\u0086\7_\2\2\u0086\30\3\2\2\2\u0087\u0088\7}\2\2\u0088\32\3\2"+
		"\2\2\u0089\u008a\7\177\2\2\u008a\34\3\2\2\2\u008b\u008c\7*\2\2\u008c\36"+
		"\3\2\2\2\u008d\u008e\7+\2\2\u008e \3\2\2\2\u008f\u0090\t\2\2\2\u0090\""+
		"\3\2\2\2\u0091\u0092\7-\2\2\u0092\u0096\7-\2\2\u0093\u0094\7/\2\2\u0094"+
		"\u0096\7/\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096$\3\2\2\2\u0097"+
		"\u00a6\5\'\24\2\u0098\u00a2\5\'\24\2\u0099\u00a1\5\65\33\2\u009a\u009c"+
		"\t\3\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a1\t\4\2\2\u00a0\u0099\3\2"+
		"\2\2\u00a0\u009b\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u0097\3\2\2\2\u00a5\u0098\3\2\2\2\u00a6&\3\2\2\2\u00a7\u00aa"+
		"\t\4\2\2\u00a8\u00aa\5\65\33\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2"+
		"\u00aa(\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\5%\23\2\u00ad*\3\2\2\2"+
		"\u00ae\u00b4\7$\2\2\u00af\u00b3\n\6\2\2\u00b0\u00b1\7^\2\2\u00b1\u00b3"+
		"\7$\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00c3\7$\2\2\u00b8\u00be\7)\2\2\u00b9\u00bd\n\7\2\2\u00ba\u00bb"+
		"\7^\2\2\u00bb\u00bd\7)\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\7)\2\2\u00c2\u00ae\3\2\2\2\u00c2"+
		"\u00b8\3\2\2\2\u00c3,\3\2\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8.\3"+
		"\2\2\2\u00c9\u00ca\5? \2\u00ca\60\3\2\2\2\u00cb\u00cd\t\b\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\b\31\2\2\u00d1\62\3\2\2\2\u00d2\u00d4\7\17"+
		"\2\2\u00d3\u00d5\7\f\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d8\3\2\2\2\u00d6\u00d8\7\f\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b\32\2\2\u00da\64\3\2\2\2\u00db\u00dd"+
		"\t\20\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\66\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2"+
		"\7,\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\61\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\b\34\2\2\u00ed8\3\2\2\2\u00ee\u00ef\7\61\2"+
		"\2\u00ef\u00f0\7\61\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\n\t\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\35\2\2\u00f8"+
		":\3\2\2\2\u00f9\u0105\t\n\2\2\u00fa\u00fb\7g\2\2\u00fb\u0105\7-\2\2\u00fc"+
		"\u00fd\7G\2\2\u00fd\u0105\7-\2\2\u00fe\u00ff\7g\2\2\u00ff\u0105\7/\2\2"+
		"\u0100\u0101\7G\2\2\u0101\u0102\7/\2\2\u0102\u0103\3\2\2\2\u0103\u0105"+
		"\5=\37\2\u0104\u00f9\3\2\2\2\u0104\u00fa\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u0100\3\2\2\2\u0105<\3\2\2\2\u0106\u0108\t\13\2\2"+
		"\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a>\3\2\2\2\u010b\u010d\5Y-\2\u010c\u010e\5E#\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e@\3\2\2\2\u010f\u0111\5I%\2\u0110\u0112"+
		"\5G$\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112B\3\2\2\2\u0113\u0114"+
		"\t\f\2\2\u0114D\3\2\2\2\u0115\u0116\7k\2\2\u0116F\3\2\2\2\u0117\u0121"+
		"\t\r\2\2\u0118\u0119\7N\2\2\u0119\u0121\7w\2\2\u011a\u011b\7N\2\2\u011b"+
		"\u0121\7W\2\2\u011c\u011d\7w\2\2\u011d\u0121\7N\2\2\u011e\u011f\7W\2\2"+
		"\u011f\u0121\7N\2\2\u0120\u0117\3\2\2\2\u0120\u0118\3\2\2\2\u0120\u011a"+
		"\3\2\2\2\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121H\3\2\2\2\u0122"+
		"\u0127\5K&\2\u0123\u0127\5M\'\2\u0124\u0127\5O(\2\u0125\u0127\5Q)\2\u0126"+
		"\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2"+
		"\2\2\u0127J\3\2\2\2\u0128\u0132\7\62\2\2\u0129\u012e\4\63;\2\u012a\u012d"+
		"\5S*\2\u012b\u012d\7a\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u0129\3\2\2\2\u0132"+
		"L\3\2\2\2\u0133\u0134\7\62\2\2\u0134\u0138\7d\2\2\u0135\u0136\7\62\2\2"+
		"\u0136\u0138\7D\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u013b\t\16\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dN\3\2\2\2\u013e\u0141\7"+
		"\62\2\2\u013f\u0142\5U+\2\u0140\u0142\7a\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144P\3\2\2\2\u0145\u0146\7\62\2\2\u0146\u014a\7z\2\2\u0147\u0148"+
		"\7\62\2\2\u0148\u014a\7Z\2\2\u0149\u0145\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u014e\5W,\2\u014c\u014e\7a\2\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150R\3\2\2\2\u0151\u0152\4\62;\2\u0152T\3\2\2\2\u0153\u0154"+
		"\4\629\2\u0154V\3\2\2\2\u0155\u0156\t\17\2\2\u0156X\3\2\2\2\u0157\u015e"+
		"\5=\37\2\u0158\u015f\5C\"\2\u0159\u015a\7\60\2\2\u015a\u015c\5=\37\2\u015b"+
		"\u015d\5;\36\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015f\u0166\3\2\2\2\u0160"+
		"\u0161\7\60\2\2\u0161\u0163\5=\37\2\u0162\u0164\5;\36\2\u0163\u0162\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0157\3\2\2\2\u0165"+
		"\u0160\3\2\2\2\u0166Z\3\2\2\2\u0167\u016b\5]/\2\u0168\u016b\5_\60\2\u0169"+
		"\u016b\5a\61\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2"+
		"\2\2\u016b\\\3\2\2\2\u016c\u0170\4\63;\2\u016d\u016f\4\62;\2\u016e\u016d"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"^\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0175\7\62\2\2\u0174\u0176\4\629\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178`\3\2\2\2\u0179\u017a\7\62\2\2\u017a\u017b\7z\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017e\t\17\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180b\3\2\2\2.\2t\u0095"+
		"\u009d\u00a0\u00a2\u00a5\u00a9\u00b2\u00b4\u00bc\u00be\u00c2\u00c7\u00ce"+
		"\u00d4\u00d7\u00de\u00e6\u00f4\u0104\u0109\u010d\u0111\u0120\u0126\u012c"+
		"\u012e\u0131\u0137\u013c\u0141\u0143\u0149\u014d\u014f\u015c\u015e\u0163"+
		"\u0165\u016a\u0170\u0177\u017f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}