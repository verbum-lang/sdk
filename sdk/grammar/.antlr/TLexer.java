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
		OpenArIndex=9, CloseArIndex=10, Identifier=11, TypeSpec=12, Integer=13, 
		Float=14, String=15, Whitespace=16, Newline=17, Word=18, Words=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BlockComment", "LineComment", "Use", "Var", "Bool", "End", "Attr", "Separator", 
			"OpenArIndex", "CloseArIndex", "Identifier", "TypeSpec", "Integer", "Float", 
			"String", "Whitespace", "Newline", "Word", "Words", "DecimalExponent", 
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
			"Separator", "OpenArIndex", "CloseArIndex", "Identifier", "TypeSpec", 
			"Integer", "Float", "String", "Whitespace", "Newline", "Word", "Words"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0140\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2"+
		"\7\2V\n\2\f\2\16\2Y\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3b\n\3\f\3\16\3"+
		"e\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6x\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\6\16\u008a\n\16\r\16\16\16\u008b\3\17\3\17\3\20\3\20\7\20"+
		"\u0092\n\20\f\20\16\20\u0095\13\20\3\20\3\20\3\20\7\20\u009a\n\20\f\20"+
		"\16\20\u009d\13\20\3\20\5\20\u00a0\n\20\3\21\6\21\u00a3\n\21\r\21\16\21"+
		"\u00a4\3\21\3\21\3\22\3\22\5\22\u00ab\n\22\3\22\5\22\u00ae\n\22\3\22\3"+
		"\22\3\23\3\23\3\24\6\24\u00b5\n\24\r\24\16\24\u00b6\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c4\n\25\3\26\6\26\u00c7\n"+
		"\26\r\26\16\26\u00c8\3\27\3\27\5\27\u00cd\n\27\3\30\3\30\5\30\u00d1\n"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u00e0\n\33\3\34\3\34\3\34\3\34\5\34\u00e6\n\34\3\35\3\35\3\35\3\35"+
		"\7\35\u00ec\n\35\f\35\16\35\u00ef\13\35\5\35\u00f1\n\35\3\36\3\36\3\36"+
		"\3\36\5\36\u00f7\n\36\3\36\6\36\u00fa\n\36\r\36\16\36\u00fb\3\37\3\37"+
		"\3\37\6\37\u0101\n\37\r\37\16\37\u0102\3 \3 \3 \3 \5 \u0109\n \3 \3 \6"+
		" \u010d\n \r \16 \u010e\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\5$\u011c\n"+
		"$\5$\u011e\n$\3$\3$\3$\5$\u0123\n$\5$\u0125\n$\3%\3%\3%\5%\u012a\n%\3"+
		"&\3&\7&\u012e\n&\f&\16&\u0131\13&\3\'\3\'\6\'\u0135\n\'\r\'\16\'\u0136"+
		"\3(\3(\3(\3(\6(\u013d\n(\r(\16(\u013e\5W\u0093\u009b\2)\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K"+
		"\2M\2O\2\3\2\f\4\2\f\f\17\17\3\2<<\3\2\62;\4\2\13\13\"\"\4\2GGgg\4\2\62"+
		";aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082"+
		"\2\1\22\u0157\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3Q\3\2\2\2\5]\3\2\2\2\7f\3\2\2"+
		"\2\tj\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3"+
		"\2\2\2\25\u0081\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0089\3\2"+
		"\2\2\35\u008d\3\2\2\2\37\u009f\3\2\2\2!\u00a2\3\2\2\2#\u00ad\3\2\2\2%"+
		"\u00b1\3\2\2\2\'\u00b4\3\2\2\2)\u00c3\3\2\2\2+\u00c6\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00ce\3\2\2\2\61\u00d2\3\2\2\2\63\u00d4\3\2\2\2\65\u00df\3\2\2"+
		"\2\67\u00e5\3\2\2\29\u00f0\3\2\2\2;\u00f6\3\2\2\2=\u00fd\3\2\2\2?\u0108"+
		"\3\2\2\2A\u0110\3\2\2\2C\u0112\3\2\2\2E\u0114\3\2\2\2G\u0124\3\2\2\2I"+
		"\u0129\3\2\2\2K\u012b\3\2\2\2M\u0132\3\2\2\2O\u0138\3\2\2\2QR\7\61\2\2"+
		"RS\7,\2\2SW\3\2\2\2TV\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2"+
		"XZ\3\2\2\2YW\3\2\2\2Z[\7,\2\2[\\\7\61\2\2\\\4\3\2\2\2]^\7\61\2\2^_\7\61"+
		"\2\2_c\3\2\2\2`b\n\2\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\6\3"+
		"\2\2\2ec\3\2\2\2fg\7w\2\2gh\7u\2\2hi\7g\2\2i\b\3\2\2\2jk\7x\2\2kl\7c\2"+
		"\2lm\7t\2\2m\n\3\2\2\2no\7v\2\2op\7t\2\2pq\7w\2\2qx\7g\2\2rs\7h\2\2st"+
		"\7c\2\2tu\7n\2\2uv\7u\2\2vx\7g\2\2wn\3\2\2\2wr\3\2\2\2x\f\3\2\2\2yz\7"+
		"=\2\2z\16\3\2\2\2{|\7?\2\2|\20\3\2\2\2}~\7.\2\2~\22\3\2\2\2\177\u0080"+
		"\7]\2\2\u0080\24\3\2\2\2\u0081\u0082\7_\2\2\u0082\26\3\2\2\2\u0083\u0084"+
		"\5\'\24\2\u0084\30\3\2\2\2\u0085\u0086\t\3\2\2\u0086\u0087\5\'\24\2\u0087"+
		"\32\3\2\2\2\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\5-\27\2\u008e\36\3\2\2\2\u008f\u0093\7$\2\2\u0090\u0092\13\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u00a0\7$\2\2\u0097"+
		"\u009b\7)\2\2\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a0\7)\2\2\u009f\u008f\3\2\2\2\u009f\u0097\3\2"+
		"\2\2\u00a0 \3\2\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\21\2\2\u00a7\"\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00ab\7\f\2"+
		"\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae"+
		"\7\f\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\b\22\2\2\u00b0$\3\2\2\2\u00b1\u00b2\t\f\2\2\u00b2&\3\2\2\2\u00b3"+
		"\u00b5\t\f\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7(\3\2\2\2\u00b8\u00c4\t\6\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00c4\7-\2\2\u00bb\u00bc\7G\2\2\u00bc\u00c4\7-\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00c4\7/\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7/\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5+\26\2\u00c3\u00b8\3\2\2\2\u00c3\u00b9"+
		"\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4"+
		"*\3\2\2\2\u00c5\u00c7\t\7\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9,\3\2\2\2\u00ca\u00cc\5"+
		"G$\2\u00cb\u00cd\5\63\32\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		".\3\2\2\2\u00ce\u00d0\5\67\34\2\u00cf\u00d1\5\65\33\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\t\b\2\2\u00d3\62"+
		"\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5\64\3\2\2\2\u00d6\u00e0\t\t\2\2\u00d7"+
		"\u00d8\7N\2\2\u00d8\u00e0\7w\2\2\u00d9\u00da\7N\2\2\u00da\u00e0\7W\2\2"+
		"\u00db\u00dc\7w\2\2\u00dc\u00e0\7N\2\2\u00dd\u00de\7W\2\2\u00de\u00e0"+
		"\7N\2\2\u00df\u00d6\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\66\3\2\2\2\u00e1\u00e6\59\35"+
		"\2\u00e2\u00e6\5;\36\2\u00e3\u00e6\5=\37\2\u00e4\u00e6\5? \2\u00e5\u00e1"+
		"\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"8\3\2\2\2\u00e7\u00f1\7\62\2\2\u00e8\u00ed\4\63;\2\u00e9\u00ec\5A!\2\u00ea"+
		"\u00ec\7a\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f1:\3\2\2\2"+
		"\u00f2\u00f3\7\62\2\2\u00f3\u00f7\7d\2\2\u00f4\u00f5\7\62\2\2\u00f5\u00f7"+
		"\7D\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00fa\t\n\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc<\3\2\2\2\u00fd\u0100\7\62\2\2\u00fe\u0101"+
		"\5C\"\2\u00ff\u0101\7a\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103>\3\2\2\2"+
		"\u0104\u0105\7\62\2\2\u0105\u0109\7z\2\2\u0106\u0107\7\62\2\2\u0107\u0109"+
		"\7Z\2\2\u0108\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u010d\5E#\2\u010b\u010d\7a\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f@"+
		"\3\2\2\2\u0110\u0111\4\62;\2\u0111B\3\2\2\2\u0112\u0113\4\629\2\u0113"+
		"D\3\2\2\2\u0114\u0115\t\13\2\2\u0115F\3\2\2\2\u0116\u011d\5+\26\2\u0117"+
		"\u011e\5\61\31\2\u0118\u0119\7\60\2\2\u0119\u011b\5+\26\2\u011a\u011c"+
		"\5)\25\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011e\u0125\3\2\2\2\u011f\u0120\7\60"+
		"\2\2\u0120\u0122\5+\26\2\u0121\u0123\5)\25\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0116\3\2\2\2\u0124\u011f\3\2"+
		"\2\2\u0125H\3\2\2\2\u0126\u012a\5K&\2\u0127\u012a\5M\'\2\u0128\u012a\5"+
		"O(\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"J\3\2\2\2\u012b\u012f\4\63;\2\u012c\u012e\4\62;\2\u012d\u012c\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130L\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\7\62\2\2\u0133\u0135\4\629\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137N\3\2\2\2\u0138\u0139\7\62\2\2\u0139\u013a\7z\2\2\u013a\u013c"+
		"\3\2\2\2\u013b\u013d\t\13\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013fP\3\2\2\2&\2Wcw\u008b\u0093"+
		"\u009b\u009f\u00a4\u00aa\u00ad\u00b6\u00c3\u00c8\u00cc\u00d0\u00df\u00e5"+
		"\u00eb\u00ed\u00f0\u00f6\u00fb\u0100\u0102\u0108\u010c\u010e\u011b\u011d"+
		"\u0122\u0124\u0129\u012f\u0136\u013e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}