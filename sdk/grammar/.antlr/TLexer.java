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
		Use=1, Var=2, If=3, Elif=4, Else=5, Bool=6, End=7, Attr=8, Point=9, TwoPoint=10, 
		TwoTwoPoint=11, Separator=12, OpenArIndex=13, CloseArIndex=14, OpenBlock=15, 
		CloseBlock=16, OpenOp=17, CloseOp=18, ArithmeticOperator=19, IncDecOperators=20, 
		Identifier=21, IDPrefix=22, TypeSpec=23, String=24, Integer=25, Float=26, 
		Whitespace=27, Newline=28, Words=29, BlockComment=30, LineComment=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", "TwoPoint", 
			"TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", "OpenBlock", 
			"CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", "IncDecOperators", 
			"Identifier", "IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", 
			"Newline", "Words", "BlockComment", "LineComment", "DecimalExponent", 
			"DecimalDigits", "FloatLiteral", "IntegerLiteral", "FloatTypeSuffix", 
			"ImaginarySuffix", "IntSuffix", "IntegerFrag", "Decimal", "Binary", "Octal", 
			"Hexadecimal", "DecimalDigit", "OctalDigit", "HexDigit", "FloatFrag", 
			"NUMBER", "DIGITS", "OCTAL_DIGITS", "HEX_DIGITS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", null, "';'", "'='", 
			"'.'", "':'", "'::'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "Bool", "End", "Attr", "Point", 
			"TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
			"OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
			"IncDecOperators", "Identifier", "IDPrefix", "TypeSpec", "String", "Integer", 
			"Float", "Whitespace", "Newline", "Words", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\5\25\u00a9\n\25\3\26\3\26\3\26\3\26\6\26\u00af\n\26\r\26\16\26\u00b0"+
		"\3\26\7\26\u00b4\n\26\f\26\16\26\u00b7\13\26\5\26\u00b9\n\26\3\27\3\27"+
		"\5\27\u00bd\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00c6\n\31\f"+
		"\31\16\31\u00c9\13\31\3\31\3\31\3\31\3\31\3\31\7\31\u00d0\n\31\f\31\16"+
		"\31\u00d3\13\31\3\31\5\31\u00d6\n\31\3\32\6\32\u00d9\n\32\r\32\16\32\u00da"+
		"\3\33\3\33\3\34\6\34\u00e0\n\34\r\34\16\34\u00e1\3\34\3\34\3\35\3\35\5"+
		"\35\u00e8\n\35\3\35\5\35\u00eb\n\35\3\35\3\35\3\36\6\36\u00f0\n\36\r\36"+
		"\16\36\u00f1\3\37\3\37\3\37\3\37\7\37\u00f8\n\37\f\37\16\37\u00fb\13\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0106\n \f \16 \u0109\13 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0118\n!\3\"\6\"\u011b\n\"\r\""+
		"\16\"\u011c\3#\3#\5#\u0121\n#\3$\3$\5$\u0125\n$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0134\n\'\3(\3(\3(\3(\5(\u013a\n(\3)\3"+
		")\3)\3)\7)\u0140\n)\f)\16)\u0143\13)\5)\u0145\n)\3*\3*\3*\3*\5*\u014b"+
		"\n*\3*\6*\u014e\n*\r*\16*\u014f\3+\3+\3+\6+\u0155\n+\r+\16+\u0156\3,\3"+
		",\3,\3,\5,\u015d\n,\3,\3,\6,\u0161\n,\r,\16,\u0162\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u0170\n\60\5\60\u0172\n\60\3\60\3\60\3\60"+
		"\5\60\u0177\n\60\5\60\u0179\n\60\3\61\3\61\3\61\5\61\u017e\n\61\3\62\3"+
		"\62\7\62\u0182\n\62\f\62\16\62\u0185\13\62\3\63\3\63\6\63\u0189\n\63\r"+
		"\63\16\63\u018a\3\64\3\64\3\64\3\64\6\64\u0191\n\64\r\64\16\64\u0192\3"+
		"\u00f9\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2"+
		"e\2g\2\3\2\20\6\2\'\',-//\61\61\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63"+
		"aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22\u01b4\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\3i\3\2\2\2\5m\3\2\2\2\7q\3\2\2\2\tt\3\2\2\2\13y\3\2\2\2\r\u0087"+
		"\3\2\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3"+
		"\2\2\2\27\u0091\3\2\2\2\31\u0094\3\2\2\2\33\u0096\3\2\2\2\35\u0098\3\2"+
		"\2\2\37\u009a\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a2"+
		"\3\2\2\2)\u00a8\3\2\2\2+\u00b8\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61"+
		"\u00d5\3\2\2\2\63\u00d8\3\2\2\2\65\u00dc\3\2\2\2\67\u00df\3\2\2\29\u00ea"+
		"\3\2\2\2;\u00ef\3\2\2\2=\u00f3\3\2\2\2?\u0101\3\2\2\2A\u0117\3\2\2\2C"+
		"\u011a\3\2\2\2E\u011e\3\2\2\2G\u0122\3\2\2\2I\u0126\3\2\2\2K\u0128\3\2"+
		"\2\2M\u0133\3\2\2\2O\u0139\3\2\2\2Q\u0144\3\2\2\2S\u014a\3\2\2\2U\u0151"+
		"\3\2\2\2W\u015c\3\2\2\2Y\u0164\3\2\2\2[\u0166\3\2\2\2]\u0168\3\2\2\2_"+
		"\u0178\3\2\2\2a\u017d\3\2\2\2c\u017f\3\2\2\2e\u0186\3\2\2\2g\u018c\3\2"+
		"\2\2ij\7w\2\2jk\7u\2\2kl\7g\2\2l\4\3\2\2\2mn\7x\2\2no\7c\2\2op\7t\2\2"+
		"p\6\3\2\2\2qr\7k\2\2rs\7h\2\2s\b\3\2\2\2tu\7g\2\2uv\7n\2\2vw\7k\2\2wx"+
		"\7h\2\2x\n\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\f\3\2\2\2~\177"+
		"\7v\2\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2\u0081\u0088\7g\2\2\u0082\u0083"+
		"\7h\2\2\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0088\7g\2\2\u0087~\3\2\2\2\u0087\u0082\3\2\2\2\u0088\16\3\2\2\2\u0089"+
		"\u008a\7=\2\2\u008a\20\3\2\2\2\u008b\u008c\7?\2\2\u008c\22\3\2\2\2\u008d"+
		"\u008e\7\60\2\2\u008e\24\3\2\2\2\u008f\u0090\7<\2\2\u0090\26\3\2\2\2\u0091"+
		"\u0092\7<\2\2\u0092\u0093\7<\2\2\u0093\30\3\2\2\2\u0094\u0095\7.\2\2\u0095"+
		"\32\3\2\2\2\u0096\u0097\7]\2\2\u0097\34\3\2\2\2\u0098\u0099\7_\2\2\u0099"+
		"\36\3\2\2\2\u009a\u009b\7}\2\2\u009b \3\2\2\2\u009c\u009d\7\177\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7*\2\2\u009f$\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1"+
		"&\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5"+
		"\u00a9\7-\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a9\7/\2\2\u00a8\u00a4\3\2\2"+
		"\2\u00a8\u00a6\3\2\2\2\u00a9*\3\2\2\2\u00aa\u00b9\5-\27\2\u00ab\u00b5"+
		"\5-\27\2\u00ac\u00b4\5;\36\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00aa\3\2\2\2\u00b8"+
		"\u00ab\3\2\2\2\u00b9,\3\2\2\2\u00ba\u00bd\t\4\2\2\u00bb\u00bd\5;\36\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd.\3\2\2\2\u00be\u00bf\t"+
		"\5\2\2\u00bf\u00c0\5+\26\2\u00c0\60\3\2\2\2\u00c1\u00c7\7$\2\2\u00c2\u00c6"+
		"\n\6\2\2\u00c3\u00c4\7^\2\2\u00c4\u00c6\7$\2\2\u00c5\u00c2\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d6\7$\2\2\u00cb"+
		"\u00d1\7)\2\2\u00cc\u00d0\n\7\2\2\u00cd\u00ce\7^\2\2\u00ce\u00d0\7)\2"+
		"\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d6\7)\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d6\62\3\2\2\2"+
		"\u00d7\u00d9\t\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\64\3\2\2\2\u00dc\u00dd\5E#\2\u00dd"+
		"\66\3\2\2\2\u00de\u00e0\t\b\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4"+
		"\b\34\2\2\u00e48\3\2\2\2\u00e5\u00e7\7\17\2\2\u00e6\u00e8\7\f\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\7\f"+
		"\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\b\35\2\2\u00ed:\3\2\2\2\u00ee\u00f0\t\20\2\2\u00ef\u00ee\3\2\2"+
		"\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2<"+
		"\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f9\3\2\2\2\u00f6"+
		"\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7,\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b\37"+
		"\2\2\u0100>\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7\61\2\2\u0103\u0107"+
		"\3\2\2\2\u0104\u0106\n\t\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010b\b \2\2\u010b@\3\2\2\2\u010c\u0118\t\n\2\2\u010d\u010e"+
		"\7g\2\2\u010e\u0118\7-\2\2\u010f\u0110\7G\2\2\u0110\u0118\7-\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0118\7/\2\2\u0113\u0114\7G\2\2\u0114\u0115\7/\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0118\5C\"\2\u0117\u010c\3\2\2\2\u0117\u010d"+
		"\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0113\3\2\2\2\u0118"+
		"B\3\2\2\2\u0119\u011b\t\13\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2"+
		"\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dD\3\2\2\2\u011e\u0120\5"+
		"_\60\2\u011f\u0121\5K&\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"F\3\2\2\2\u0122\u0124\5O(\2\u0123\u0125\5M\'\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125H\3\2\2\2\u0126\u0127\t\f\2\2\u0127J\3\2\2\2\u0128"+
		"\u0129\7k\2\2\u0129L\3\2\2\2\u012a\u0134\t\r\2\2\u012b\u012c\7N\2\2\u012c"+
		"\u0134\7w\2\2\u012d\u012e\7N\2\2\u012e\u0134\7W\2\2\u012f\u0130\7w\2\2"+
		"\u0130\u0134\7N\2\2\u0131\u0132\7W\2\2\u0132\u0134\7N\2\2\u0133\u012a"+
		"\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012f\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134N\3\2\2\2\u0135\u013a\5Q)\2\u0136\u013a\5S*\2\u0137"+
		"\u013a\5U+\2\u0138\u013a\5W,\2\u0139\u0135\3\2\2\2\u0139\u0136\3\2\2\2"+
		"\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013aP\3\2\2\2\u013b\u0145\7"+
		"\62\2\2\u013c\u0141\4\63;\2\u013d\u0140\5Y-\2\u013e\u0140\7a\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u013b\3\2\2\2\u0144\u013c\3\2\2\2\u0145R\3\2\2\2\u0146\u0147\7\62\2\2"+
		"\u0147\u014b\7d\2\2\u0148\u0149\7\62\2\2\u0149\u014b\7D\2\2\u014a\u0146"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\t\16\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150T\3\2\2\2\u0151\u0154\7\62\2\2\u0152\u0155\5[.\2\u0153\u0155"+
		"\7a\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157V\3\2\2\2\u0158\u0159\7\62\2\2"+
		"\u0159\u015d\7z\2\2\u015a\u015b\7\62\2\2\u015b\u015d\7Z\2\2\u015c\u0158"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u0161\5]/\2\u015f"+
		"\u0161\7a\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163X\3\2\2\2\u0164\u0165"+
		"\4\62;\2\u0165Z\3\2\2\2\u0166\u0167\4\629\2\u0167\\\3\2\2\2\u0168\u0169"+
		"\t\17\2\2\u0169^\3\2\2\2\u016a\u0171\5C\"\2\u016b\u0172\5I%\2\u016c\u016d"+
		"\7\60\2\2\u016d\u016f\5C\"\2\u016e\u0170\5A!\2\u016f\u016e\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u016c\3\2"+
		"\2\2\u0172\u0179\3\2\2\2\u0173\u0174\7\60\2\2\u0174\u0176\5C\"\2\u0175"+
		"\u0177\5A!\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2"+
		"\2\u0178\u016a\3\2\2\2\u0178\u0173\3\2\2\2\u0179`\3\2\2\2\u017a\u017e"+
		"\5c\62\2\u017b\u017e\5e\63\2\u017c\u017e\5g\64\2\u017d\u017a\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017eb\3\2\2\2\u017f\u0183\4\63;\2"+
		"\u0180\u0182\4\62;\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181"+
		"\3\2\2\2\u0183\u0184\3\2\2\2\u0184d\3\2\2\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0188\7\62\2\2\u0187\u0189\4\629\2\u0188\u0187\3\2\2\2\u0189\u018a\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bf\3\2\2\2\u018c\u018d"+
		"\7\62\2\2\u018d\u018e\7z\2\2\u018e\u0190\3\2\2\2\u018f\u0191\t\17\2\2"+
		"\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193h\3\2\2\2.\2\u0087\u00a8\u00b0\u00b3\u00b5\u00b8\u00bc\u00c5"+
		"\u00c7\u00cf\u00d1\u00d5\u00da\u00e1\u00e7\u00ea\u00f1\u00f9\u0107\u0117"+
		"\u011c\u0120\u0124\u0133\u0139\u013f\u0141\u0144\u014a\u014f\u0154\u0156"+
		"\u015c\u0160\u0162\u016f\u0171\u0176\u0178\u017d\u0183\u018a\u0192\3\b"+
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