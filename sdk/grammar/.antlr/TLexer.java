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
		BlockComment=1, LineComment=2, Use=3, Var=4, Bool=5, End=6, Attr=7, Separator=8, 
		OpenArIndex=9, CloseArIndex=10, Identifier=11, IDPrefix=12, TypeSpec=13, 
		Integer=14, Float=15, String=16, Whitespace=17, Newline=18, Words=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", "Separator", 
			"OpenArIndex", "CloseArIndex", "Identifier", "IDPrefix", "TypeSpec", 
			"Integer", "Float", "String", "Whitespace", "Newline", "Words", "DecimalExponent", 
			"DecimalDigits", "FloatLiteral", "IntegerLiteral", "FloatTypeSuffix", 
			"ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", "Binary", "Octal", 
			"Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", "FloatFrag", 
			"NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'use'", "'var'", null, "';'", "'='", "','", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", 
			"Separator", "OpenArIndex", "CloseArIndex", "Identifier", "IDPrefix", 
			"TypeSpec", "Integer", "Float", "String", "Whitespace", "Newline", "Words"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2"+
		"\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3"+
		"e\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6x\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\6\f\u0088\n\f\r\f\16\f\u0089\3\f\7\f\u008d\n\f\f\f\16\f\u0090\13\f"+
		"\5\f\u0092\n\f\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\17\6\17\u009c\n"+
		"\17\r\17\16\17\u009d\3\20\3\20\3\21\3\21\7\21\u00a4\n\21\f\21\16\21\u00a7"+
		"\13\21\3\21\3\21\3\21\7\21\u00ac\n\21\f\21\16\21\u00af\13\21\3\21\5\21"+
		"\u00b2\n\21\3\22\6\22\u00b5\n\22\r\22\16\22\u00b6\3\22\3\22\3\23\3\23"+
		"\5\23\u00bd\n\23\3\23\5\23\u00c0\n\23\3\23\3\23\3\24\6\24\u00c5\n\24\r"+
		"\24\16\24\u00c6\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00d4\n\25\3\26\6\26\u00d7\n\26\r\26\16\26\u00d8\3\27\3\27\5\27"+
		"\u00dd\n\27\3\30\3\30\5\30\u00e1\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f0\n\33\3\34\3\34\3\34\3\34"+
		"\5\34\u00f6\n\34\3\35\3\35\3\35\3\35\7\35\u00fc\n\35\f\35\16\35\u00ff"+
		"\13\35\5\35\u0101\n\35\3\36\3\36\3\36\3\36\5\36\u0107\n\36\3\36\6\36\u010a"+
		"\n\36\r\36\16\36\u010b\3\37\3\37\3\37\6\37\u0111\n\37\r\37\16\37\u0112"+
		"\3 \3 \3 \3 \5 \u0119\n \3 \3 \6 \u011d\n \r \16 \u011e\3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3$\3$\3$\5$\u012c\n$\5$\u012e\n$\3$\3$\3$\5$\u0133\n$\5$"+
		"\u0135\n$\3%\3%\3%\5%\u013a\n%\3&\3&\7&\u013e\n&\f&\16&\u0141\13&\3\'"+
		"\3\'\6\'\u0145\n\'\r\'\16\'\u0146\3(\3(\3(\3(\6(\u014d\n(\r(\16(\u014e"+
		"\5W\u00a5\u00ad\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2\3\2\r\4\2\f\f\17\17\3\2\62;\3\2"+
		"aa\3\2<<\4\2\13\13\"\"\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63"+
		"aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u016d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\3Q\3\2\2\2\5]\3\2\2\2\7f\3\2\2\2\tj\3\2\2\2\13w\3\2\2\2\ry\3"+
		"\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0091"+
		"\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u009b\3\2\2\2\37\u009f\3"+
		"\2\2\2!\u00b1\3\2\2\2#\u00b4\3\2\2\2%\u00bf\3\2\2\2\'\u00c4\3\2\2\2)\u00d3"+
		"\3\2\2\2+\u00d6\3\2\2\2-\u00da\3\2\2\2/\u00de\3\2\2\2\61\u00e2\3\2\2\2"+
		"\63\u00e4\3\2\2\2\65\u00ef\3\2\2\2\67\u00f5\3\2\2\29\u0100\3\2\2\2;\u0106"+
		"\3\2\2\2=\u010d\3\2\2\2?\u0118\3\2\2\2A\u0120\3\2\2\2C\u0122\3\2\2\2E"+
		"\u0124\3\2\2\2G\u0134\3\2\2\2I\u0139\3\2\2\2K\u013b\3\2\2\2M\u0142\3\2"+
		"\2\2O\u0148\3\2\2\2QR\7\61\2\2RS\7,\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2"+
		"VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7,\2\2[\\\7\61\2"+
		"\2\\\4\3\2\2\2]^\7\61\2\2^_\7\61\2\2_c\3\2\2\2`b\n\2\2\2a`\3\2\2\2be\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2d\6\3\2\2\2ec\3\2\2\2fg\7w\2\2gh\7u\2\2hi\7"+
		"g\2\2i\b\3\2\2\2jk\7x\2\2kl\7c\2\2lm\7t\2\2m\n\3\2\2\2no\7v\2\2op\7t\2"+
		"\2pq\7w\2\2qx\7g\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2vx\7g\2\2wn\3"+
		"\2\2\2wr\3\2\2\2x\f\3\2\2\2yz\7=\2\2z\16\3\2\2\2{|\7?\2\2|\20\3\2\2\2"+
		"}~\7.\2\2~\22\3\2\2\2\177\u0080\7]\2\2\u0080\24\3\2\2\2\u0081\u0082\7"+
		"_\2\2\u0082\26\3\2\2\2\u0083\u0092\5\31\r\2\u0084\u008e\5\31\r\2\u0085"+
		"\u008d\5\'\24\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u008d\t\4\2\2\u008c\u0085\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0083\3\2\2\2\u0091\u0084\3\2"+
		"\2\2\u0092\30\3\2\2\2\u0093\u0096\t\4\2\2\u0094\u0096\5\'\24\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096\32\3\2\2\2\u0097\u0098\t\5\2\2\u0098"+
		"\u0099\5\27\f\2\u0099\34\3\2\2\2\u009a\u009c\t\3\2\2\u009b\u009a\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\36"+
		"\3\2\2\2\u009f\u00a0\5-\27\2\u00a0 \3\2\2\2\u00a1\u00a5\7$\2\2\u00a2\u00a4"+
		"\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00b2"+
		"\7$\2\2\u00a9\u00ad\7)\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\7)\2\2\u00b1\u00a1\3\2\2\2\u00b1"+
		"\u00a9\3\2\2\2\u00b2\"\3\2\2\2\u00b3\u00b5\t\6\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\b\22\2\2\u00b9$\3\2\2\2\u00ba\u00bc\7\17\2\2\u00bb"+
		"\u00bd\7\f\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00c0\7\f\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\b\23\2\2\u00c2&\3\2\2\2\u00c3\u00c5\t\r\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00d4\t\7\2\2\u00c9\u00ca\7g\2\2\u00ca\u00d4"+
		"\7-\2\2\u00cb\u00cc\7G\2\2\u00cc\u00d4\7-\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00d4\7/\2\2\u00cf\u00d0\7G\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\3\2\2"+
		"\2\u00d2\u00d4\5+\26\2\u00d3\u00c8\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3\u00cb"+
		"\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4*\3\2\2\2\u00d5"+
		"\u00d7\t\b\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9,\3\2\2\2\u00da\u00dc\5G$\2\u00db\u00dd"+
		"\5\63\32\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd.\3\2\2\2\u00de"+
		"\u00e0\5\67\34\2\u00df\u00e1\5\65\33\2\u00e0\u00df\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\t\t\2\2\u00e3\62\3\2\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\64\3\2\2\2\u00e6\u00f0\t\n\2\2\u00e7\u00e8\7N\2\2\u00e8"+
		"\u00f0\7w\2\2\u00e9\u00ea\7N\2\2\u00ea\u00f0\7W\2\2\u00eb\u00ec\7w\2\2"+
		"\u00ec\u00f0\7N\2\2\u00ed\u00ee\7W\2\2\u00ee\u00f0\7N\2\2\u00ef\u00e6"+
		"\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\66\3\2\2\2\u00f1\u00f6\59\35\2\u00f2\u00f6\5;\36"+
		"\2\u00f3\u00f6\5=\37\2\u00f4\u00f6\5? \2\u00f5\u00f1\3\2\2\2\u00f5\u00f2"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f68\3\2\2\2\u00f7"+
		"\u0101\7\62\2\2\u00f8\u00fd\4\63;\2\u00f9\u00fc\5A!\2\u00fa\u00fc\7a\2"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0101:\3\2\2\2\u0102\u0103\7\62\2\2"+
		"\u0103\u0107\7d\2\2\u0104\u0105\7\62\2\2\u0105\u0107\7D\2\2\u0106\u0102"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\t\13\2\2"+
		"\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c<\3\2\2\2\u010d\u0110\7\62\2\2\u010e\u0111\5C\"\2\u010f"+
		"\u0111\7a\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113>\3\2\2\2\u0114\u0115"+
		"\7\62\2\2\u0115\u0119\7z\2\2\u0116\u0117\7\62\2\2\u0117\u0119\7Z\2\2\u0118"+
		"\u0114\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011d\5E"+
		"#\2\u011b\u011d\7a\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f@\3\2\2\2\u0120"+
		"\u0121\4\62;\2\u0121B\3\2\2\2\u0122\u0123\4\629\2\u0123D\3\2\2\2\u0124"+
		"\u0125\t\f\2\2\u0125F\3\2\2\2\u0126\u012d\5+\26\2\u0127\u012e\5\61\31"+
		"\2\u0128\u0129\7\60\2\2\u0129\u012b\5+\26\2\u012a\u012c\5)\25\2\u012b"+
		"\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u0127\3\2"+
		"\2\2\u012d\u0128\3\2\2\2\u012e\u0135\3\2\2\2\u012f\u0130\7\60\2\2\u0130"+
		"\u0132\5+\26\2\u0131\u0133\5)\25\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\3\2\2\2\u0134\u0126\3\2\2\2\u0134\u012f\3\2\2\2\u0135"+
		"H\3\2\2\2\u0136\u013a\5K&\2\u0137\u013a\5M\'\2\u0138\u013a\5O(\2\u0139"+
		"\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013aJ\3\2\2\2"+
		"\u013b\u013f\4\63;\2\u013c\u013e\4\62;\2\u013d\u013c\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140L\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0144\7\62\2\2\u0143\u0145\4\629\2\u0144\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"N\3\2\2\2\u0148\u0149\7\62\2\2\u0149\u014a\7z\2\2\u014a\u014c\3\2\2\2"+
		"\u014b\u014d\t\f\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014fP\3\2\2\2+\2Wcw\u0089\u008c\u008e\u0091"+
		"\u0095\u009d\u00a5\u00ad\u00b1\u00b6\u00bc\u00bf\u00c6\u00d3\u00d8\u00dc"+
		"\u00e0\u00ef\u00f5\u00fb\u00fd\u0100\u0106\u010b\u0110\u0112\u0118\u011c"+
		"\u011e\u012b\u012d\u0132\u0134\u0139\u013f\u0146\u014e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}