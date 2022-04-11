// Generated from /home/user/projects/sdk/vm/grammar/TLexer.g4 by ANTLR 4.8
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
		Implements=18, New=19, Break=20, Next=21, ArrowRight=22, End=23, Attr=24, 
		Point=25, TwoPoint=26, TwoTwoPoint=27, Separator=28, OpenArIndex=29, CloseArIndex=30, 
		OpenBlock=31, CloseBlock=32, OpenOp=33, CloseOp=34, ArithmeticOperator=35, 
		AssignmentOperator=36, Not=37, IncDecOperators=38, Identifier=39, IDPrefix=40, 
		TypeSpec=41, String=42, Integer=43, Float=44, Whitespace=45, Newline=46, 
		Words=47, BlockComment=48, LineComment=49;
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
			"Class", "Implements", "New", "Break", "Next", "ArrowRight", "End", "Attr", 
			"Point", "TwoPoint", "TwoTwoPoint", "Separator", "OpenArIndex", "CloseArIndex", 
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
			"'fn'", "'pub'", "'pro'", "'priv'", "'static'", "'final'", "'interface'", 
			"'abstract'", "'extends'", "'class'", "'implements'", "'new'", "'break'", 
			"'next'", "'->'", "';'", "'='", "'.'", "':'", "'::'", "','", "'['", "']'", 
			"'{'", "'}'", "'('", "')'", null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Use", "Var", "If", "Elif", "Else", "For", "Ret", "Function", "Pub", 
			"Pro", "Priv", "Static", "Final", "Interface", "Abstract", "Extends", 
			"Class", "Implements", "New", "Break", "Next", "ArrowRight", "End", "Attr", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0236\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0138\n%\3&\3&\3\'\3\'\3\'\3\'\5\'\u0140"+
		"\n\'\3(\3(\3(\3(\6(\u0146\n(\r(\16(\u0147\3(\7(\u014b\n(\f(\16(\u014e"+
		"\13(\5(\u0150\n(\3)\3)\5)\u0154\n)\3*\3*\3*\3+\3+\3+\3+\7+\u015d\n+\f"+
		"+\16+\u0160\13+\3+\3+\3+\3+\3+\7+\u0167\n+\f+\16+\u016a\13+\3+\5+\u016d"+
		"\n+\3,\6,\u0170\n,\r,\16,\u0171\3,\3,\6,\u0176\n,\r,\16,\u0177\5,\u017a"+
		"\n,\3-\3-\3-\5-\u017f\n-\3.\6.\u0182\n.\r.\16.\u0183\3.\3.\3/\3/\5/\u018a"+
		"\n/\3/\5/\u018d\n/\3/\3/\3\60\6\60\u0192\n\60\r\60\16\60\u0193\3\61\3"+
		"\61\3\61\3\61\7\61\u019a\n\61\f\61\16\61\u019d\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\7\62\u01a8\n\62\f\62\16\62\u01ab\13\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01ba"+
		"\n\63\3\64\6\64\u01bd\n\64\r\64\16\64\u01be\3\65\3\65\5\65\u01c3\n\65"+
		"\3\66\3\66\5\66\u01c7\n\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39"+
		"\59\u01d6\n9\3:\3:\3:\3:\5:\u01dc\n:\3;\3;\3;\3;\7;\u01e2\n;\f;\16;\u01e5"+
		"\13;\5;\u01e7\n;\3<\3<\3<\3<\5<\u01ed\n<\3<\6<\u01f0\n<\r<\16<\u01f1\3"+
		"=\3=\3=\6=\u01f7\n=\r=\16=\u01f8\3>\3>\3>\3>\5>\u01ff\n>\3>\3>\6>\u0203"+
		"\n>\r>\16>\u0204\3?\3?\3@\3@\3A\3A\3B\3B\3B\3B\3B\5B\u0212\nB\5B\u0214"+
		"\nB\3B\3B\3B\5B\u0219\nB\5B\u021b\nB\3C\3C\3C\5C\u0220\nC\3D\3D\7D\u0224"+
		"\nD\fD\16D\u0227\13D\3E\3E\6E\u022b\nE\rE\16E\u022c\3F\3F\3F\3F\6F\u0233"+
		"\nF\rF\16F\u0234\3\u019b\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\3\2\22\6\2\'\',-//\61\61\4\2>>@@\3\2\62;\3"+
		"\2aa\3\2<<\3\2$$\3\2))\3\2//\4\2\13\13\"\"\4\2\f\f\17\17\4\2GGgg\4\2\62"+
		";aa\5\2HHNNhh\5\2NNWWww\4\2\62\63aa\5\2\62;CHch\3\5\2C\2\\\2c\2|\2\u0082"+
		"\2\1\22\u0263\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3\u008d\3\2\2\2\5\u0091\3\2\2\2\7\u0095\3"+
		"\2\2\2\t\u0098\3\2\2\2\13\u009d\3\2\2\2\r\u00a2\3\2\2\2\17\u00a6\3\2\2"+
		"\2\21\u00aa\3\2\2\2\23\u00ad\3\2\2\2\25\u00b1\3\2\2\2\27\u00b5\3\2\2\2"+
		"\31\u00ba\3\2\2\2\33\u00c1\3\2\2\2\35\u00c7\3\2\2\2\37\u00d1\3\2\2\2!"+
		"\u00da\3\2\2\2#\u00e2\3\2\2\2%\u00e8\3\2\2\2\'\u00f3\3\2\2\2)\u00f7\3"+
		"\2\2\2+\u00fd\3\2\2\2-\u0102\3\2\2\2/\u0105\3\2\2\2\61\u0107\3\2\2\2\63"+
		"\u0109\3\2\2\2\65\u010b\3\2\2\2\67\u010d\3\2\2\29\u0110\3\2\2\2;\u0112"+
		"\3\2\2\2=\u0114\3\2\2\2?\u0116\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E"+
		"\u011c\3\2\2\2G\u011e\3\2\2\2I\u0137\3\2\2\2K\u0139\3\2\2\2M\u013f\3\2"+
		"\2\2O\u014f\3\2\2\2Q\u0153\3\2\2\2S\u0155\3\2\2\2U\u016c\3\2\2\2W\u0179"+
		"\3\2\2\2Y\u017e\3\2\2\2[\u0181\3\2\2\2]\u018c\3\2\2\2_\u0191\3\2\2\2a"+
		"\u0195\3\2\2\2c\u01a3\3\2\2\2e\u01b9\3\2\2\2g\u01bc\3\2\2\2i\u01c0\3\2"+
		"\2\2k\u01c4\3\2\2\2m\u01c8\3\2\2\2o\u01ca\3\2\2\2q\u01d5\3\2\2\2s\u01db"+
		"\3\2\2\2u\u01e6\3\2\2\2w\u01ec\3\2\2\2y\u01f3\3\2\2\2{\u01fe\3\2\2\2}"+
		"\u0206\3\2\2\2\177\u0208\3\2\2\2\u0081\u020a\3\2\2\2\u0083\u021a\3\2\2"+
		"\2\u0085\u021f\3\2\2\2\u0087\u0221\3\2\2\2\u0089\u0228\3\2\2\2\u008b\u022e"+
		"\3\2\2\2\u008d\u008e\7w\2\2\u008e\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090"+
		"\4\3\2\2\2\u0091\u0092\7x\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094"+
		"\6\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u0097\b\3\2\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2"+
		"\u009c\n\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u"+
		"\2\2\u00a0\u00a1\7g\2\2\u00a1\f\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4"+
		"\7q\2\2\u00a4\u00a5\7t\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\22\3\2\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7w\2\2\u00af\u00b0"+
		"\7d\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7x\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7p\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\34\3\2\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\u00cc\7t\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7e\2\2\u00cf\u00d0\7g\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3"+
		"\7d\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7v\2\2\u00d9 \3\2\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7z\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7p\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7u\2\2\u00e1\"\3\2"+
		"\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7u\2\2\u00e6\u00e7\7u\2\2\u00e7$\3\2\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7o\2\2\u00ea\u00eb\7r\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7o\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2"+
		"\u00f1\u00f2\7u\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7g\2"+
		"\2\u00f5\u00f6\7y\2\2\u00f6(\3\2\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9\7"+
		"t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7m\2\2\u00fc*"+
		"\3\2\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7z\2\2\u0100"+
		"\u0101\7v\2\2\u0101,\3\2\2\2\u0102\u0103\7/\2\2\u0103\u0104\7@\2\2\u0104"+
		".\3\2\2\2\u0105\u0106\7=\2\2\u0106\60\3\2\2\2\u0107\u0108\7?\2\2\u0108"+
		"\62\3\2\2\2\u0109\u010a\7\60\2\2\u010a\64\3\2\2\2\u010b\u010c\7<\2\2\u010c"+
		"\66\3\2\2\2\u010d\u010e\7<\2\2\u010e\u010f\7<\2\2\u010f8\3\2\2\2\u0110"+
		"\u0111\7.\2\2\u0111:\3\2\2\2\u0112\u0113\7]\2\2\u0113<\3\2\2\2\u0114\u0115"+
		"\7_\2\2\u0115>\3\2\2\2\u0116\u0117\7}\2\2\u0117@\3\2\2\2\u0118\u0119\7"+
		"\177\2\2\u0119B\3\2\2\2\u011a\u011b\7*\2\2\u011bD\3\2\2\2\u011c\u011d"+
		"\7+\2\2\u011dF\3\2\2\2\u011e\u011f\t\2\2\2\u011fH\3\2\2\2\u0120\u0121"+
		"\7-\2\2\u0121\u0138\7?\2\2\u0122\u0123\7/\2\2\u0123\u0138\7?\2\2\u0124"+
		"\u0125\7,\2\2\u0125\u0138\7?\2\2\u0126\u0127\7\61\2\2\u0127\u0138\7?\2"+
		"\2\u0128\u0129\7\'\2\2\u0129\u0138\7?\2\2\u012a\u0138\t\3\2\2\u012b\u012c"+
		"\7@\2\2\u012c\u0138\7?\2\2\u012d\u012e\7>\2\2\u012e\u0138\7?\2\2\u012f"+
		"\u0130\7(\2\2\u0130\u0138\7(\2\2\u0131\u0132\7~\2\2\u0132\u0138\7~\2\2"+
		"\u0133\u0134\7?\2\2\u0134\u0138\7?\2\2\u0135\u0136\7#\2\2\u0136\u0138"+
		"\7?\2\2\u0137\u0120\3\2\2\2\u0137\u0122\3\2\2\2\u0137\u0124\3\2\2\2\u0137"+
		"\u0126\3\2\2\2\u0137\u0128\3\2\2\2\u0137\u012a\3\2\2\2\u0137\u012b\3\2"+
		"\2\2\u0137\u012d\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0131\3\2\2\2\u0137"+
		"\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138J\3\2\2\2\u0139\u013a\7#\2\2\u013a"+
		"L\3\2\2\2\u013b\u013c\7-\2\2\u013c\u0140\7-\2\2\u013d\u013e\7/\2\2\u013e"+
		"\u0140\7/\2\2\u013f\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u0140N\3\2\2\2\u0141"+
		"\u0150\5Q)\2\u0142\u014c\5Q)\2\u0143\u014b\5_\60\2\u0144\u0146\t\4\2\2"+
		"\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u014b\t\5\2\2\u014a\u0143\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0141\3\2\2\2\u014f\u0142\3\2\2\2\u0150P\3\2\2\2\u0151\u0154\t\5\2\2"+
		"\u0152\u0154\5_\60\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154R\3"+
		"\2\2\2\u0155\u0156\t\6\2\2\u0156\u0157\5O(\2\u0157T\3\2\2\2\u0158\u015e"+
		"\7$\2\2\u0159\u015d\n\7\2\2\u015a\u015b\7^\2\2\u015b\u015d\7$\2\2\u015c"+
		"\u0159\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161"+
		"\u016d\7$\2\2\u0162\u0168\7)\2\2\u0163\u0167\n\b\2\2\u0164\u0165\7^\2"+
		"\2\u0165\u0167\7)\2\2\u0166\u0163\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u016a"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\7)\2\2\u016c\u0158\3\2\2\2\u016c\u0162\3\2"+
		"\2\2\u016dV\3\2\2\2\u016e\u0170\t\4\2\2\u016f\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u017a\3\2\2\2\u0173"+
		"\u0175\t\t\2\2\u0174\u0176\t\4\2\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u016f\3\2\2\2\u0179\u0173\3\2\2\2\u017aX\3\2\2\2\u017b\u017f\5i\65\2"+
		"\u017c\u017d\t\t\2\2\u017d\u017f\5i\65\2\u017e\u017b\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017fZ\3\2\2\2\u0180\u0182\t\n\2\2\u0181\u0180\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\b.\2\2\u0186\\\3\2\2\2\u0187\u0189\7\17\2\2\u0188\u018a"+
		"\7\f\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u018d\7\f\2\2\u018c\u0187\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u018f\b/\2\2\u018f^\3\2\2\2\u0190\u0192\t\22\2\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"`\3\2\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7,\2\2\u0197\u019b\3\2\2\2"+
		"\u0198\u019a\13\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u019f\7,\2\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\b\61"+
		"\2\2\u01a2b\3\2\2\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\7\61\2\2\u01a5\u01a9"+
		"\3\2\2\2\u01a6\u01a8\n\13\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\u01ad\b\62\2\2\u01add\3\2\2\2\u01ae\u01ba\t\f\2\2\u01af"+
		"\u01b0\7g\2\2\u01b0\u01ba\7-\2\2\u01b1\u01b2\7G\2\2\u01b2\u01ba\7-\2\2"+
		"\u01b3\u01b4\7g\2\2\u01b4\u01ba\7/\2\2\u01b5\u01b6\7G\2\2\u01b6\u01b7"+
		"\7/\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\5g\64\2\u01b9\u01ae\3\2\2\2\u01b9"+
		"\u01af\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b5\3\2"+
		"\2\2\u01baf\3\2\2\2\u01bb\u01bd\t\r\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfh\3\2\2\2\u01c0"+
		"\u01c2\5\u0083B\2\u01c1\u01c3\5o8\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3"+
		"\2\2\2\u01c3j\3\2\2\2\u01c4\u01c6\5s:\2\u01c5\u01c7\5q9\2\u01c6\u01c5"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7l\3\2\2\2\u01c8\u01c9\t\16\2\2\u01c9"+
		"n\3\2\2\2\u01ca\u01cb\7k\2\2\u01cbp\3\2\2\2\u01cc\u01d6\t\17\2\2\u01cd"+
		"\u01ce\7N\2\2\u01ce\u01d6\7w\2\2\u01cf\u01d0\7N\2\2\u01d0\u01d6\7W\2\2"+
		"\u01d1\u01d2\7w\2\2\u01d2\u01d6\7N\2\2\u01d3\u01d4\7W\2\2\u01d4\u01d6"+
		"\7N\2\2\u01d5\u01cc\3\2\2\2\u01d5\u01cd\3\2\2\2\u01d5\u01cf\3\2\2\2\u01d5"+
		"\u01d1\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6r\3\2\2\2\u01d7\u01dc\5u;\2\u01d8"+
		"\u01dc\5w<\2\u01d9\u01dc\5y=\2\u01da\u01dc\5{>\2\u01db\u01d7\3\2\2\2\u01db"+
		"\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dct\3\2\2\2"+
		"\u01dd\u01e7\7\62\2\2\u01de\u01e3\4\63;\2\u01df\u01e2\5}?\2\u01e0\u01e2"+
		"\7a\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01de\3\2\2\2\u01e7v\3\2\2\2\u01e8\u01e9"+
		"\7\62\2\2\u01e9\u01ed\7d\2\2\u01ea\u01eb\7\62\2\2\u01eb\u01ed\7D\2\2\u01ec"+
		"\u01e8\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01f0\t\20"+
		"\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2x\3\2\2\2\u01f3\u01f6\7\62\2\2\u01f4\u01f7\5\177@"+
		"\2\u01f5\u01f7\7a\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9z\3\2\2\2\u01fa"+
		"\u01fb\7\62\2\2\u01fb\u01ff\7z\2\2\u01fc\u01fd\7\62\2\2\u01fd\u01ff\7"+
		"Z\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200"+
		"\u0203\5\u0081A\2\u0201\u0203\7a\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3"+
		"\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"|\3\2\2\2\u0206\u0207\4\62;\2\u0207~\3\2\2\2\u0208\u0209\4\629\2\u0209"+
		"\u0080\3\2\2\2\u020a\u020b\t\21\2\2\u020b\u0082\3\2\2\2\u020c\u0213\5"+
		"g\64\2\u020d\u0214\5m\67\2\u020e\u020f\7\60\2\2\u020f\u0211\5g\64\2\u0210"+
		"\u0212\5e\63\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2"+
		"\2\2\u0213\u020d\3\2\2\2\u0213\u020e\3\2\2\2\u0214\u021b\3\2\2\2\u0215"+
		"\u0216\7\60\2\2\u0216\u0218\5g\64\2\u0217\u0219\5e\63\2\u0218\u0217\3"+
		"\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u020c\3\2\2\2\u021a"+
		"\u0215\3\2\2\2\u021b\u0084\3\2\2\2\u021c\u0220\5\u0087D\2\u021d\u0220"+
		"\5\u0089E\2\u021e\u0220\5\u008bF\2\u021f\u021c\3\2\2\2\u021f\u021d\3\2"+
		"\2\2\u021f\u021e\3\2\2\2\u0220\u0086\3\2\2\2\u0221\u0225\4\63;\2\u0222"+
		"\u0224\4\62;\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0088\3\2\2\2\u0227\u0225\3\2\2\2\u0228"+
		"\u022a\7\62\2\2\u0229\u022b\4\629\2\u022a\u0229\3\2\2\2\u022b\u022c\3"+
		"\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u008a\3\2\2\2\u022e"+
		"\u022f\7\62\2\2\u022f\u0230\7z\2\2\u0230\u0232\3\2\2\2\u0231\u0233\t\21"+
		"\2\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0232\3\2\2\2\u0234"+
		"\u0235\3\2\2\2\u0235\u008c\3\2\2\2\61\2\u0137\u013f\u0147\u014a\u014c"+
		"\u014f\u0153\u015c\u015e\u0166\u0168\u016c\u0171\u0177\u0179\u017e\u0183"+
		"\u0189\u018c\u0193\u019b\u01a9\u01b9\u01be\u01c2\u01c6\u01d5\u01db\u01e1"+
		"\u01e3\u01e6\u01ec\u01f1\u01f6\u01f8\u01fe\u0202\u0204\u0211\u0213\u0218"+
		"\u021a\u021f\u0225\u022c\u0234\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}