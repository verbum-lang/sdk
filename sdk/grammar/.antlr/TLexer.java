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
		Priv=11, Static=12, Final=13, Interface=14, Abstract=15, Extends=16, ArrowRight=17, 
		End=18, Attr=19, Point=20, TwoPoint=21, TwoTwoPoint=22, Separator=23, 
		OpenArIndex=24, CloseArIndex=25, OpenBlock=26, CloseBlock=27, OpenOp=28, 
		CloseOp=29, ArithmeticOperator=30, AssignmentOperator=31, Not=32, IncDecOperators=33, 
		Identifier=34, IDPrefix=35, TypeSpec=36, String=37, Integer=38, Float=39, 
		Whitespace=40, Newline=41, Words=42, BlockComment=43, LineComment=44;
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
			"ArrowRight", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", 
			"OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", 
			"ArithmeticOperator", "AssignmentOperator", "Not", "IncDecOperators", 
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
			null, "'use'", "'var'", "'if'", "'elif'", "'else'", "'for'", "'ret'", 
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'->'", "';'", "'='", "'.'", "':'", "'::'", 
			"','", "'['", "']'", "'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"ArrowRight", "End", "Attr", "Point", "TwoPoint", "TwoTwoPoint", "Separator", 
			"OpenArIndex", "CloseArIndex", "OpenBlock", "CloseBlock", "OpenOp", "CloseOp", 
			"ArithmeticOperator", "AssignmentOperator", "Not", "IncDecOperators", 
			"Identifier", "IDPrefix", "TypeSpec", "String", "Integer", "Float", "Whitespace", 
			"Newline", "Words", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0201\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u010e"+
		"\n \3!\3!\3\"\3\"\3\"\3\"\5\"\u0116\n\"\3#\3#\3#\3#\6#\u011c\n#\r#\16"+
		"#\u011d\3#\7#\u0121\n#\f#\16#\u0124\13#\5#\u0126\n#\3$\3$\5$\u012a\n$"+
		"\3%\3%\3%\3&\3&\3&\3&\7&\u0133\n&\f&\16&\u0136\13&\3&\3&\3&\3&\3&\7&\u013d"+
		"\n&\f&\16&\u0140\13&\3&\5&\u0143\n&\3\'\6\'\u0146\n\'\r\'\16\'\u0147\3"+
		"(\3(\3)\6)\u014d\n)\r)\16)\u014e\3)\3)\3*\3*\5*\u0155\n*\3*\5*\u0158\n"+
		"*\3*\3*\3+\6+\u015d\n+\r+\16+\u015e\3,\3,\3,\3,\7,\u0165\n,\f,\16,\u0168"+
		"\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u0173\n-\f-\16-\u0176\13-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0185\n.\3/\6/\u0188\n/\r/\16/\u0189"+
		"\3\60\3\60\5\60\u018e\n\60\3\61\3\61\5\61\u0192\n\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01a1\n\64\3\65"+
		"\3\65\3\65\3\65\5\65\u01a7\n\65\3\66\3\66\3\66\3\66\7\66\u01ad\n\66\f"+
		"\66\16\66\u01b0\13\66\5\66\u01b2\n\66\3\67\3\67\3\67\3\67\5\67\u01b8\n"+
		"\67\3\67\6\67\u01bb\n\67\r\67\16\67\u01bc\38\38\38\68\u01c2\n8\r8\168"+
		"\u01c3\39\39\39\39\59\u01ca\n9\39\39\69\u01ce\n9\r9\169\u01cf\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3=\3=\3=\5=\u01dd\n=\5=\u01df\n=\3=\3=\3=\5=\u01e4\n"+
		"=\5=\u01e6\n=\3>\3>\3>\5>\u01eb\n>\3?\3?\7?\u01ef\n?\f?\16?\u01f2\13?"+
		"\3@\3@\6@\u01f6\n@\r@\16@\u01f7\3A\3A\3A\3A\6A\u01fe\nA\rA\16A\u01ff\3"+
		"\u0166\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c\2e\2g\2i\2k\2"+
		"m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\3\2\21\6\2\'\',-//\61\61\4\2"+
		">>@@\3\2\62;\3\2aa\3\2<<\3\2$$\3\2))\4\2\13\13\"\"\4\2\f\f\17\17\4\2G"+
		"Ggg\4\2\62;aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2"+
		"c\2|\2\u0082\2\1\22\u022b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3\u0083\3\2\2"+
		"\2\5\u0087\3\2\2\2\7\u008b\3\2\2\2\t\u008e\3\2\2\2\13\u0093\3\2\2\2\r"+
		"\u0098\3\2\2\2\17\u009c\3\2\2\2\21\u00a0\3\2\2\2\23\u00a3\3\2\2\2\25\u00a7"+
		"\3\2\2\2\27\u00ab\3\2\2\2\31\u00b0\3\2\2\2\33\u00b7\3\2\2\2\35\u00bd\3"+
		"\2\2\2\37\u00c7\3\2\2\2!\u00d0\3\2\2\2#\u00d8\3\2\2\2%\u00db\3\2\2\2\'"+
		"\u00dd\3\2\2\2)\u00df\3\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2/\u00e6\3\2"+
		"\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2"+
		"\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u010d\3\2\2\2A\u010f"+
		"\3\2\2\2C\u0115\3\2\2\2E\u0125\3\2\2\2G\u0129\3\2\2\2I\u012b\3\2\2\2K"+
		"\u0142\3\2\2\2M\u0145\3\2\2\2O\u0149\3\2\2\2Q\u014c\3\2\2\2S\u0157\3\2"+
		"\2\2U\u015c\3\2\2\2W\u0160\3\2\2\2Y\u016e\3\2\2\2[\u0184\3\2\2\2]\u0187"+
		"\3\2\2\2_\u018b\3\2\2\2a\u018f\3\2\2\2c\u0193\3\2\2\2e\u0195\3\2\2\2g"+
		"\u01a0\3\2\2\2i\u01a6\3\2\2\2k\u01b1\3\2\2\2m\u01b7\3\2\2\2o\u01be\3\2"+
		"\2\2q\u01c9\3\2\2\2s\u01d1\3\2\2\2u\u01d3\3\2\2\2w\u01d5\3\2\2\2y\u01e5"+
		"\3\2\2\2{\u01ea\3\2\2\2}\u01ec\3\2\2\2\177\u01f3\3\2\2\2\u0081\u01f9\3"+
		"\2\2\2\u0083\u0084\7w\2\2\u0084\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086"+
		"\4\3\2\2\2\u0087\u0088\7x\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a"+
		"\6\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d\b\3\2\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2"+
		"\u0092\n\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u"+
		"\2\2\u0096\u0097\7g\2\2\u0097\f\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7t\2\2\u009b\16\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7v\2\2\u009f\20\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2"+
		"\7p\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6"+
		"\7d\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7x\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2"+
		"\7v\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7e\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\34\3\2\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7t\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5"+
		"\7e\2\2\u00c5\u00c6\7g\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9"+
		"\7d\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7v\2\2\u00cf \3\2\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7z\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\u00d5\7p\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7u\2\2\u00d7\"\3\2"+
		"\2\2\u00d8\u00d9\7/\2\2\u00d9\u00da\7@\2\2\u00da$\3\2\2\2\u00db\u00dc"+
		"\7=\2\2\u00dc&\3\2\2\2\u00dd\u00de\7?\2\2\u00de(\3\2\2\2\u00df\u00e0\7"+
		"\60\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7"+
		"<\2\2\u00e4\u00e5\7<\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7\60\3"+
		"\2\2\2\u00e8\u00e9\7]\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7_\2\2\u00eb\64"+
		"\3\2\2\2\u00ec\u00ed\7}\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7\177\2\2\u00ef"+
		"8\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3<"+
		"\3\2\2\2\u00f4\u00f5\t\2\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7-\2\2\u00f7\u010e"+
		"\7?\2\2\u00f8\u00f9\7/\2\2\u00f9\u010e\7?\2\2\u00fa\u00fb\7,\2\2\u00fb"+
		"\u010e\7?\2\2\u00fc\u00fd\7\61\2\2\u00fd\u010e\7?\2\2\u00fe\u00ff\7\'"+
		"\2\2\u00ff\u010e\7?\2\2\u0100\u010e\t\3\2\2\u0101\u0102\7@\2\2\u0102\u010e"+
		"\7?\2\2\u0103\u0104\7>\2\2\u0104\u010e\7?\2\2\u0105\u0106\7(\2\2\u0106"+
		"\u010e\7(\2\2\u0107\u0108\7~\2\2\u0108\u010e\7~\2\2\u0109\u010a\7?\2\2"+
		"\u010a\u010e\7?\2\2\u010b\u010c\7#\2\2\u010c\u010e\7?\2\2\u010d\u00f6"+
		"\3\2\2\2\u010d\u00f8\3\2\2\2\u010d\u00fa\3\2\2\2\u010d\u00fc\3\2\2\2\u010d"+
		"\u00fe\3\2\2\2\u010d\u0100\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0103\3\2"+
		"\2\2\u010d\u0105\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e@\3\2\2\2\u010f\u0110\7#\2\2\u0110B\3\2\2\2\u0111"+
		"\u0112\7-\2\2\u0112\u0116\7-\2\2\u0113\u0114\7/\2\2\u0114\u0116\7/\2\2"+
		"\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116D\3\2\2\2\u0117\u0126\5"+
		"G$\2\u0118\u0122\5G$\2\u0119\u0121\5U+\2\u011a\u011c\t\4\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u0121\t\5\2\2\u0120\u0119\3\2\2\2\u0120\u011b\3\2"+
		"\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0117\3\2"+
		"\2\2\u0125\u0118\3\2\2\2\u0126F\3\2\2\2\u0127\u012a\t\5\2\2\u0128\u012a"+
		"\5U+\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012aH\3\2\2\2\u012b\u012c"+
		"\t\6\2\2\u012c\u012d\5E#\2\u012dJ\3\2\2\2\u012e\u0134\7$\2\2\u012f\u0133"+
		"\n\7\2\2\u0130\u0131\7^\2\2\u0131\u0133\7$\2\2\u0132\u012f\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0143\7$\2\2\u0138"+
		"\u013e\7)\2\2\u0139\u013d\n\b\2\2\u013a\u013b\7^\2\2\u013b\u013d\7)\2"+
		"\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0143\7)\2\2\u0142\u012e\3\2\2\2\u0142\u0138\3\2\2\2\u0143L\3\2\2\2\u0144"+
		"\u0146\t\4\2\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148N\3\2\2\2\u0149\u014a\5_\60\2\u014aP\3\2"+
		"\2\2\u014b\u014d\t\t\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b)"+
		"\2\2\u0151R\3\2\2\2\u0152\u0154\7\17\2\2\u0153\u0155\7\f\2\2\u0154\u0153"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0158\7\f\2\2\u0157"+
		"\u0152\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\b*"+
		"\2\2\u015aT\3\2\2\2\u015b\u015d\t\21\2\2\u015c\u015b\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fV\3\2\2\2\u0160"+
		"\u0161\7\61\2\2\u0161\u0162\7,\2\2\u0162\u0166\3\2\2\2\u0163\u0165\13"+
		"\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7,"+
		"\2\2\u016a\u016b\7\61\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b,\2\2\u016d"+
		"X\3\2\2\2\u016e\u016f\7\61\2\2\u016f\u0170\7\61\2\2\u0170\u0174\3\2\2"+
		"\2\u0171\u0173\n\n\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2\2\2\u0177"+
		"\u0178\b-\2\2\u0178Z\3\2\2\2\u0179\u0185\t\13\2\2\u017a\u017b\7g\2\2\u017b"+
		"\u0185\7-\2\2\u017c\u017d\7G\2\2\u017d\u0185\7-\2\2\u017e\u017f\7g\2\2"+
		"\u017f\u0185\7/\2\2\u0180\u0181\7G\2\2\u0181\u0182\7/\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0185\5]/\2\u0184\u0179\3\2\2\2\u0184\u017a\3\2\2\2\u0184"+
		"\u017c\3\2\2\2\u0184\u017e\3\2\2\2\u0184\u0180\3\2\2\2\u0185\\\3\2\2\2"+
		"\u0186\u0188\t\f\2\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a^\3\2\2\2\u018b\u018d\5y=\2\u018c\u018e"+
		"\5e\63\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e`\3\2\2\2\u018f"+
		"\u0191\5i\65\2\u0190\u0192\5g\64\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192b\3\2\2\2\u0193\u0194\t\r\2\2\u0194d\3\2\2\2\u0195\u0196\7k"+
		"\2\2\u0196f\3\2\2\2\u0197\u01a1\t\16\2\2\u0198\u0199\7N\2\2\u0199\u01a1"+
		"\7w\2\2\u019a\u019b\7N\2\2\u019b\u01a1\7W\2\2\u019c\u019d\7w\2\2\u019d"+
		"\u01a1\7N\2\2\u019e\u019f\7W\2\2\u019f\u01a1\7N\2\2\u01a0\u0197\3\2\2"+
		"\2\u01a0\u0198\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1h\3\2\2\2\u01a2\u01a7\5k\66\2\u01a3\u01a7\5m\67\2\u01a4"+
		"\u01a7\5o8\2\u01a5\u01a7\5q9\2\u01a6\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2"+
		"\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7j\3\2\2\2\u01a8\u01b2\7"+
		"\62\2\2\u01a9\u01ae\4\63;\2\u01aa\u01ad\5s:\2\u01ab\u01ad\7a\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01a8\3\2\2\2\u01b1\u01a9\3\2\2\2\u01b2l\3\2\2\2\u01b3\u01b4\7\62\2\2"+
		"\u01b4\u01b8\7d\2\2\u01b5\u01b6\7\62\2\2\u01b6\u01b8\7D\2\2\u01b7\u01b3"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01bb\t\17\2\2"+
		"\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bdn\3\2\2\2\u01be\u01c1\7\62\2\2\u01bf\u01c2\5u;\2\u01c0\u01c2"+
		"\7a\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4p\3\2\2\2\u01c5\u01c6\7\62\2\2"+
		"\u01c6\u01ca\7z\2\2\u01c7\u01c8\7\62\2\2\u01c8\u01ca\7Z\2\2\u01c9\u01c5"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01ce\5w<\2\u01cc"+
		"\u01ce\7a\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0r\3\2\2\2\u01d1\u01d2"+
		"\4\62;\2\u01d2t\3\2\2\2\u01d3\u01d4\4\629\2\u01d4v\3\2\2\2\u01d5\u01d6"+
		"\t\20\2\2\u01d6x\3\2\2\2\u01d7\u01de\5]/\2\u01d8\u01df\5c\62\2\u01d9\u01da"+
		"\7\60\2\2\u01da\u01dc\5]/\2\u01db\u01dd\5[.\2\u01dc\u01db\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01d9\3\2"+
		"\2\2\u01df\u01e6\3\2\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e3\5]/\2\u01e2"+
		"\u01e4\5[.\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2"+
		"\2\u01e5\u01d7\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e6z\3\2\2\2\u01e7\u01eb"+
		"\5}?\2\u01e8\u01eb\5\177@\2\u01e9\u01eb\5\u0081A\2\u01ea\u01e7\3\2\2\2"+
		"\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb|\3\2\2\2\u01ec\u01f0\4"+
		"\63;\2\u01ed\u01ef\4\62;\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0"+
		"\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1~\3\2\2\2\u01f2\u01f0\3\2\2\2"+
		"\u01f3\u01f5\7\62\2\2\u01f4\u01f6\4\629\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0080\3\2\2\2\u01f9"+
		"\u01fa\7\62\2\2\u01fa\u01fb\7z\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fe\t\20"+
		"\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0082\3\2\2\2.\2\u010d\u0115\u011d\u0120\u0122\u0125"+
		"\u0129\u0132\u0134\u013c\u013e\u0142\u0147\u014e\u0154\u0157\u015e\u0166"+
		"\u0174\u0184\u0189\u018d\u0191\u01a0\u01a6\u01ac\u01ae\u01b1\u01b7\u01bc"+
		"\u01c1\u01c3\u01c9\u01cd\u01cf\u01dc\u01de\u01e3\u01e5\u01ea\u01f0\u01f7"+
		"\u01ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}