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
		Priv=11, Static=12, Final=13, Interface=14, Extends=15, ArrowRight=16, 
		End=17, Attr=18, Point=19, TwoPoint=20, TwoTwoPoint=21, Separator=22, 
		OpenArIndex=23, CloseArIndex=24, OpenBlock=25, CloseBlock=26, OpenOp=27, 
		CloseOp=28, ArithmeticOperator=29, AssignmentOperator=30, Not=31, IncDecOperators=32, 
		Identifier=33, IDPrefix=34, TypeSpec=35, String=36, Integer=37, Float=38, 
		Whitespace=39, Newline=40, Words=41, BlockComment=42, LineComment=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Extends", "ArrowRight", 
			"End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
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
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'extends'", "'->'", "';'", "'='", "'.'", "':'", "'::'", "','", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Extends", "ArrowRight", 
			"End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", 
			"CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", "ArithmeticOperator", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u01f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0103\n\37"+
		"\3 \3 \3!\3!\3!\3!\5!\u010b\n!\3\"\3\"\3\"\3\"\6\"\u0111\n\"\r\"\16\""+
		"\u0112\3\"\7\"\u0116\n\"\f\"\16\"\u0119\13\"\5\"\u011b\n\"\3#\3#\5#\u011f"+
		"\n#\3$\3$\3$\3%\3%\3%\3%\7%\u0128\n%\f%\16%\u012b\13%\3%\3%\3%\3%\3%\7"+
		"%\u0132\n%\f%\16%\u0135\13%\3%\5%\u0138\n%\3&\6&\u013b\n&\r&\16&\u013c"+
		"\3\'\3\'\3(\6(\u0142\n(\r(\16(\u0143\3(\3(\3)\3)\5)\u014a\n)\3)\5)\u014d"+
		"\n)\3)\3)\3*\6*\u0152\n*\r*\16*\u0153\3+\3+\3+\3+\7+\u015a\n+\f+\16+\u015d"+
		"\13+\3+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0168\n,\f,\16,\u016b\13,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u017a\n-\3.\6.\u017d\n.\r.\16.\u017e"+
		"\3/\3/\5/\u0183\n/\3\60\3\60\5\60\u0187\n\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0196\n\63\3\64\3\64\3\64"+
		"\3\64\5\64\u019c\n\64\3\65\3\65\3\65\3\65\7\65\u01a2\n\65\f\65\16\65\u01a5"+
		"\13\65\5\65\u01a7\n\65\3\66\3\66\3\66\3\66\5\66\u01ad\n\66\3\66\6\66\u01b0"+
		"\n\66\r\66\16\66\u01b1\3\67\3\67\3\67\6\67\u01b7\n\67\r\67\16\67\u01b8"+
		"\38\38\38\38\58\u01bf\n8\38\38\68\u01c3\n8\r8\168\u01c4\39\39\3:\3:\3"+
		";\3;\3<\3<\3<\3<\3<\5<\u01d2\n<\5<\u01d4\n<\3<\3<\3<\5<\u01d9\n<\5<\u01db"+
		"\n<\3=\3=\3=\5=\u01e0\n=\3>\3>\7>\u01e4\n>\f>\16>\u01e7\13>\3?\3?\6?\u01eb"+
		"\n?\r?\16?\u01ec\3@\3@\3@\3@\6@\u01f3\n@\r@\16@\u01f4\3\u015b\2A\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u"+
		"\2w\2y\2{\2}\2\177\2\3\2\21\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3\2aa\3"+
		"\2<<\3\2$$\3\2))\4\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62;aa\5\2HHN"+
		"Nhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082\2\1\22"+
		"\u0220\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3\u0081\3\2\2\2\5\u0085\3\2\2\2\7\u0089\3"+
		"\2\2\2\t\u008c\3\2\2\2\13\u0091\3\2\2\2\r\u0096\3\2\2\2\17\u009a\3\2\2"+
		"\2\21\u009e\3\2\2\2\23\u00a1\3\2\2\2\25\u00a5\3\2\2\2\27\u00a9\3\2\2\2"+
		"\31\u00ae\3\2\2\2\33\u00b5\3\2\2\2\35\u00bb\3\2\2\2\37\u00c5\3\2\2\2!"+
		"\u00cd\3\2\2\2#\u00d0\3\2\2\2%\u00d2\3\2\2\2\'\u00d4\3\2\2\2)\u00d6\3"+
		"\2\2\2+\u00d8\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63"+
		"\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e7\3\2\2\2;\u00e9"+
		"\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2\2\2A\u010a\3\2\2\2C\u011a\3\2\2\2E"+
		"\u011e\3\2\2\2G\u0120\3\2\2\2I\u0137\3\2\2\2K\u013a\3\2\2\2M\u013e\3\2"+
		"\2\2O\u0141\3\2\2\2Q\u014c\3\2\2\2S\u0151\3\2\2\2U\u0155\3\2\2\2W\u0163"+
		"\3\2\2\2Y\u0179\3\2\2\2[\u017c\3\2\2\2]\u0180\3\2\2\2_\u0184\3\2\2\2a"+
		"\u0188\3\2\2\2c\u018a\3\2\2\2e\u0195\3\2\2\2g\u019b\3\2\2\2i\u01a6\3\2"+
		"\2\2k\u01ac\3\2\2\2m\u01b3\3\2\2\2o\u01be\3\2\2\2q\u01c6\3\2\2\2s\u01c8"+
		"\3\2\2\2u\u01ca\3\2\2\2w\u01da\3\2\2\2y\u01df\3\2\2\2{\u01e1\3\2\2\2}"+
		"\u01e8\3\2\2\2\177\u01ee\3\2\2\2\u0081\u0082\7w\2\2\u0082\u0083\7u\2\2"+
		"\u0083\u0084\7g\2\2\u0084\4\3\2\2\2\u0085\u0086\7x\2\2\u0086\u0087\7c"+
		"\2\2\u0087\u0088\7t\2\2\u0088\6\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7h\2\2\u008b\b\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7h\2\2\u0090\n\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093"+
		"\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\f\3\2\2\2\u0096\u0097"+
		"\7h\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\16\3\2\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d\20\3\2\2\2\u009e\u009f"+
		"\7h\2\2\u009f\u00a0\7p\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3"+
		"\7w\2\2\u00a3\u00a4\7d\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7"+
		"\7t\2\2\u00a7\u00a8\7q\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7x\2\2\u00ad\30\3\2\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7k\2\2\u00b3\u00b4\7e\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7n\2\2"+
		"\u00ba\34\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7"+
		"v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7g\2\2\u00c4\36\3\2\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7z\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc\7u\2\2\u00cc \3\2\2\2\u00cd"+
		"\u00ce\7/\2\2\u00ce\u00cf\7@\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1"+
		"$\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5"+
		"(\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7<\2\2\u00d9\u00da"+
		"\7<\2\2\u00da,\3\2\2\2\u00db\u00dc\7.\2\2\u00dc.\3\2\2\2\u00dd\u00de\7"+
		"]\2\2\u00de\60\3\2\2\2\u00df\u00e0\7_\2\2\u00e0\62\3\2\2\2\u00e1\u00e2"+
		"\7}\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4\66\3\2\2\2\u00e5"+
		"\u00e6\7*\2\2\u00e68\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8:\3\2\2\2\u00e9\u00ea"+
		"\t\2\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u0103\7?\2\2\u00ed\u00ee"+
		"\7/\2\2\u00ee\u0103\7?\2\2\u00ef\u00f0\7,\2\2\u00f0\u0103\7?\2\2\u00f1"+
		"\u00f2\7\61\2\2\u00f2\u0103\7?\2\2\u00f3\u00f4\7\'\2\2\u00f4\u0103\7?"+
		"\2\2\u00f5\u0103\t\3\2\2\u00f6\u00f7\7@\2\2\u00f7\u0103\7?\2\2\u00f8\u00f9"+
		"\7>\2\2\u00f9\u0103\7?\2\2\u00fa\u00fb\7(\2\2\u00fb\u0103\7(\2\2\u00fc"+
		"\u00fd\7~\2\2\u00fd\u0103\7~\2\2\u00fe\u00ff\7?\2\2\u00ff\u0103\7?\2\2"+
		"\u0100\u0101\7#\2\2\u0101\u0103\7?\2\2\u0102\u00eb\3\2\2\2\u0102\u00ed"+
		"\3\2\2\2\u0102\u00ef\3\2\2\2\u0102\u00f1\3\2\2\2\u0102\u00f3\3\2\2\2\u0102"+
		"\u00f5\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f8\3\2\2\2\u0102\u00fa\3\2"+
		"\2\2\u0102\u00fc\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		">\3\2\2\2\u0104\u0105\7#\2\2\u0105@\3\2\2\2\u0106\u0107\7-\2\2\u0107\u010b"+
		"\7-\2\2\u0108\u0109\7/\2\2\u0109\u010b\7/\2\2\u010a\u0106\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010bB\3\2\2\2\u010c\u011b\5E#\2\u010d\u0117\5E#\2\u010e"+
		"\u0116\5S*\2\u010f\u0111\t\4\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2"+
		"\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0116"+
		"\t\5\2\2\u0115\u010e\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u010c\3\2\2\2\u011a\u010d\3\2\2\2\u011b"+
		"D\3\2\2\2\u011c\u011f\t\5\2\2\u011d\u011f\5S*\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011fF\3\2\2\2\u0120\u0121\t\6\2\2\u0121\u0122\5C\"\2\u0122"+
		"H\3\2\2\2\u0123\u0129\7$\2\2\u0124\u0128\n\7\2\2\u0125\u0126\7^\2\2\u0126"+
		"\u0128\7$\2\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u0138\7$\2\2\u012d\u0133\7)\2\2\u012e\u0132\n\b\2"+
		"\2\u012f\u0130\7^\2\2\u0130\u0132\7)\2\2\u0131\u012e\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\7)\2\2\u0137\u0123\3\2"+
		"\2\2\u0137\u012d\3\2\2\2\u0138J\3\2\2\2\u0139\u013b\t\4\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"L\3\2\2\2\u013e\u013f\5]/\2\u013fN\3\2\2\2\u0140\u0142\t\t\2\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\b(\2\2\u0146P\3\2\2\2\u0147\u0149\7\17\2\2"+
		"\u0148\u014a\7\f\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u014d\7\f\2\2\u014c\u0147\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\b)\2\2\u014fR\3\2\2\2\u0150\u0152\t\21\2\2"+
		"\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154T\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7,\2\2\u0157"+
		"\u015b\3\2\2\2\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\7,\2\2\u015f\u0160\7\61\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\b+\2\2\u0162V\3\2\2\2\u0163\u0164\7\61\2\2\u0164\u0165"+
		"\7\61\2\2\u0165\u0169\3\2\2\2\u0166\u0168\n\n\2\2\u0167\u0166\3\2\2\2"+
		"\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\b,\2\2\u016dX\3\2\2\2\u016e\u017a"+
		"\t\13\2\2\u016f\u0170\7g\2\2\u0170\u017a\7-\2\2\u0171\u0172\7G\2\2\u0172"+
		"\u017a\7-\2\2\u0173\u0174\7g\2\2\u0174\u017a\7/\2\2\u0175\u0176\7G\2\2"+
		"\u0176\u0177\7/\2\2\u0177\u0178\3\2\2\2\u0178\u017a\5[.\2\u0179\u016e"+
		"\3\2\2\2\u0179\u016f\3\2\2\2\u0179\u0171\3\2\2\2\u0179\u0173\3\2\2\2\u0179"+
		"\u0175\3\2\2\2\u017aZ\3\2\2\2\u017b\u017d\t\f\2\2\u017c\u017b\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\\\3"+
		"\2\2\2\u0180\u0182\5w<\2\u0181\u0183\5c\62\2\u0182\u0181\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183^\3\2\2\2\u0184\u0186\5g\64\2\u0185\u0187\5e\63\2"+
		"\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187`\3\2\2\2\u0188\u0189\t"+
		"\r\2\2\u0189b\3\2\2\2\u018a\u018b\7k\2\2\u018bd\3\2\2\2\u018c\u0196\t"+
		"\16\2\2\u018d\u018e\7N\2\2\u018e\u0196\7w\2\2\u018f\u0190\7N\2\2\u0190"+
		"\u0196\7W\2\2\u0191\u0192\7w\2\2\u0192\u0196\7N\2\2\u0193\u0194\7W\2\2"+
		"\u0194\u0196\7N\2\2\u0195\u018c\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u018f"+
		"\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0193\3\2\2\2\u0196f\3\2\2\2\u0197"+
		"\u019c\5i\65\2\u0198\u019c\5k\66\2\u0199\u019c\5m\67\2\u019a\u019c\5o"+
		"8\2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019ch\3\2\2\2\u019d\u01a7\7\62\2\2\u019e\u01a3\4\63;\2"+
		"\u019f\u01a2\5q9\2\u01a0\u01a2\7a\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0"+
		"\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6\u019e\3\2"+
		"\2\2\u01a7j\3\2\2\2\u01a8\u01a9\7\62\2\2\u01a9\u01ad\7d\2\2\u01aa\u01ab"+
		"\7\62\2\2\u01ab\u01ad\7D\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01b0\t\17\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2l\3\2\2\2\u01b3\u01b6"+
		"\7\62\2\2\u01b4\u01b7\5s:\2\u01b5\u01b7\7a\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9n\3\2\2\2\u01ba\u01bb\7\62\2\2\u01bb\u01bf\7z\2\2\u01bc\u01bd"+
		"\7\62\2\2\u01bd\u01bf\7Z\2\2\u01be\u01ba\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf"+
		"\u01c2\3\2\2\2\u01c0\u01c3\5u;\2\u01c1\u01c3\7a\2\2\u01c2\u01c0\3\2\2"+
		"\2\u01c2\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5p\3\2\2\2\u01c6\u01c7\4\62;\2\u01c7r\3\2\2\2\u01c8\u01c9"+
		"\4\629\2\u01c9t\3\2\2\2\u01ca\u01cb\t\20\2\2\u01cbv\3\2\2\2\u01cc\u01d3"+
		"\5[.\2\u01cd\u01d4\5a\61\2\u01ce\u01cf\7\60\2\2\u01cf\u01d1\5[.\2\u01d0"+
		"\u01d2\5Y-\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2"+
		"\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d4\u01db\3\2\2\2\u01d5\u01d6"+
		"\7\60\2\2\u01d6\u01d8\5[.\2\u01d7\u01d9\5Y-\2\u01d8\u01d7\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01cc\3\2\2\2\u01da\u01d5\3\2"+
		"\2\2\u01dbx\3\2\2\2\u01dc\u01e0\5{>\2\u01dd\u01e0\5}?\2\u01de\u01e0\5"+
		"\177@\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"z\3\2\2\2\u01e1\u01e5\4\63;\2\u01e2\u01e4\4\62;\2\u01e3\u01e2\3\2\2\2"+
		"\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6|\3"+
		"\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\7\62\2\2\u01e9\u01eb\4\629\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01ed~\3\2\2\2\u01ee\u01ef\7\62\2\2\u01ef\u01f0\7z\2\2\u01f0\u01f2"+
		"\3\2\2\2\u01f1\u01f3\t\20\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0080\3\2\2\2.\2\u0102"+
		"\u010a\u0112\u0115\u0117\u011a\u011e\u0127\u0129\u0131\u0133\u0137\u013c"+
		"\u0143\u0149\u014c\u0153\u015b\u0169\u0179\u017e\u0182\u0186\u0195\u019b"+
		"\u01a1\u01a3\u01a6\u01ac\u01b1\u01b6\u01b8\u01be\u01c2\u01c4\u01d1\u01d3"+
		"\u01d8\u01da\u01df\u01e5\u01ec\u01f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}