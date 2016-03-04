// Generated from ./WACCLexer.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WACCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, OPEN_PARENTHESIS=3, CLOSE_PARENTHESIS=4, OPEN_SQUAREBRACKET=5, 
		CLOSE_SQUAREBRACKET=6, IS=7, COMMA=8, SEMICOLON=9, HASH=10, NULL=11, SKIP=12, 
		READ=13, FREE=14, RETURN=15, EXIT=16, PRINT=17, PRINTLN=18, IF=19, THEN=20, 
		ELSE=21, FI=22, WHILE=23, DO=24, DONE=25, NEWPAIR=26, CALL=27, FST=28, 
		SND=29, INT=30, BOOL=31, CHAR=32, STRING=33, PAIR=34, LOGICAL_OR=35, LOGICAL_AND=36, 
		NOT=37, MINUS=38, LEN=39, ORD=40, CHR=41, MULTIPLY=42, DIVIDE=43, MOD=44, 
		PLUS=45, TRUE=46, FALSE=47, GREATER_THAN=48, GREATER_THAN_EQUALS=49, LESS_THAN=50, 
		LESS_THAN_EQUALS=51, EQUALS=52, DOUBLE_EQUALS=53, NOT_EQUALS=54, IDENT=55, 
		INT_LITERAL=56, CHAR_LITERAL=57, STRING_LITERAL=58, WS=59, COMMENT=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_SQUAREBRACKET", 
		"CLOSE_SQUAREBRACKET", "IS", "COMMA", "SEMICOLON", "HASH", "NULL", "SKIP", 
		"READ", "FREE", "RETURN", "EXIT", "PRINT", "PRINTLN", "IF", "THEN", "ELSE", 
		"FI", "WHILE", "DO", "DONE", "NEWPAIR", "CALL", "FST", "SND", "INT", "BOOL", 
		"CHAR", "STRING", "PAIR", "LOGICAL_OR", "LOGICAL_AND", "NOT", "MINUS", 
		"LEN", "ORD", "CHR", "MULTIPLY", "DIVIDE", "MOD", "PLUS", "TRUE", "FALSE", 
		"GREATER_THAN", "GREATER_THAN_EQUALS", "LESS_THAN", "LESS_THAN_EQUALS", 
		"EQUALS", "DOUBLE_EQUALS", "NOT_EQUALS", "BACKWARD_SLASH", "UNDERSCORE", 
		"SINGLE_QUOTE", "DOUBLE_QUOTE", "DIGIT", "LOWER_CASE", "UPPER_CASE", "ESCAPED_CHAR", 
		"CHARACTER", "INT_SIGN", "IDENT", "INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
		"WS", "COMMENT"
	};


	public WACCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WACCLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u01ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\5@\u0175\n@\3A\3A\3"+
		"B\3B\3B\5B\u017c\nB\3B\3B\3B\3B\7B\u0182\nB\fB\16B\u0185\13B\3C\5C\u0188"+
		"\nC\3C\6C\u018b\nC\rC\16C\u018c\3D\3D\3D\3D\3E\3E\7E\u0195\nE\fE\16E\u0198"+
		"\13E\3E\3E\3F\6F\u019d\nF\rF\16F\u019e\3F\3F\3G\3G\7G\u01a5\nG\fG\16G"+
		"\u01a8\13G\3G\3G\3G\3G\3\u01a6\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083"+
		"9\u0085:\u0087;\u0089<\u008b=\u008d>\3\2\6\13\2$$))\62\62^^ddhhppttvv"+
		"\5\2$$))^^\4\2--//\5\2\13\f\17\17\"\"\u01ae\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\3\u008f\3\2\2\2\5\u0095\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13"+
		"\u009d\3\2\2\2\r\u009f\3\2\2\2\17\u00a1\3\2\2\2\21\u00a4\3\2\2\2\23\u00a6"+
		"\3\2\2\2\25\u00a8\3\2\2\2\27\u00aa\3\2\2\2\31\u00af\3\2\2\2\33\u00b4\3"+
		"\2\2\2\35\u00b9\3\2\2\2\37\u00be\3\2\2\2!\u00c5\3\2\2\2#\u00ca\3\2\2\2"+
		"%\u00d0\3\2\2\2\'\u00d8\3\2\2\2)\u00db\3\2\2\2+\u00e0\3\2\2\2-\u00e5\3"+
		"\2\2\2/\u00e8\3\2\2\2\61\u00ee\3\2\2\2\63\u00f1\3\2\2\2\65\u00f6\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u0103\3\2\2\2;\u0107\3\2\2\2=\u010b\3\2\2\2?\u010f"+
		"\3\2\2\2A\u0114\3\2\2\2C\u0119\3\2\2\2E\u0120\3\2\2\2G\u0125\3\2\2\2I"+
		"\u0128\3\2\2\2K\u012b\3\2\2\2M\u012d\3\2\2\2O\u012f\3\2\2\2Q\u0133\3\2"+
		"\2\2S\u0137\3\2\2\2U\u013b\3\2\2\2W\u013d\3\2\2\2Y\u013f\3\2\2\2[\u0141"+
		"\3\2\2\2]\u0143\3\2\2\2_\u0148\3\2\2\2a\u014e\3\2\2\2c\u0150\3\2\2\2e"+
		"\u0153\3\2\2\2g\u0155\3\2\2\2i\u0158\3\2\2\2k\u015a\3\2\2\2m\u015d\3\2"+
		"\2\2o\u0160\3\2\2\2q\u0162\3\2\2\2s\u0164\3\2\2\2u\u0166\3\2\2\2w\u0168"+
		"\3\2\2\2y\u016a\3\2\2\2{\u016c\3\2\2\2}\u016e\3\2\2\2\177\u0174\3\2\2"+
		"\2\u0081\u0176\3\2\2\2\u0083\u017b\3\2\2\2\u0085\u0187\3\2\2\2\u0087\u018e"+
		"\3\2\2\2\u0089\u0192\3\2\2\2\u008b\u019c\3\2\2\2\u008d\u01a2\3\2\2\2\u008f"+
		"\u0090\7d\2\2\u0090\u0091\7g\2\2\u0091\u0092\7i\2\2\u0092\u0093\7k\2\2"+
		"\u0093\u0094\7p\2\2\u0094\4\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p"+
		"\2\2\u0097\u0098\7f\2\2\u0098\6\3\2\2\2\u0099\u009a\7*\2\2\u009a\b\3\2"+
		"\2\2\u009b\u009c\7+\2\2\u009c\n\3\2\2\2\u009d\u009e\7]\2\2\u009e\f\3\2"+
		"\2\2\u009f\u00a0\7_\2\2\u00a0\16\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7u\2\2\u00a3\20\3\2\2\2\u00a4\u00a5\7.\2\2\u00a5\22\3\2\2\2\u00a6\u00a7"+
		"\7=\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9\26\3\2\2\2\u00aa\u00ab"+
		"\7p\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\30\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7m\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7r\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7c\2\2\u00b7\u00b8\7f\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7g\2\2\u00bd\36\3\2\2\2\u00be"+
		"\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7w\2\2"+
		"\u00c2\u00c3\7t\2\2\u00c3\u00c4\7p\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7g\2"+
		"\2\u00c6\u00c7\7z\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7v\2\2\u00c9\"\3"+
		"\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf$\3\2\2\2\u00d0\u00d1\7r\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\u00d6\7n\2\2\u00d6\u00d7\7p\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7k\2"+
		"\2\u00d9\u00da\7h\2\2\u00da(\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7"+
		"j\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df*\3\2\2\2\u00e0\u00e1"+
		"\7g\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		",\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7k\2\2\u00e7.\3\2\2\2\u00e8\u00e9"+
		"\7y\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7g\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\62\3\2\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\64\3\2\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7g\2\2\u00f8"+
		"\u00f9\7y\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\66\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7"+
		"c\2\2\u0100\u0101\7n\2\2\u0101\u0102\7n\2\2\u01028\3\2\2\2\u0103\u0104"+
		"\7h\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106:\3\2\2\2\u0107\u0108"+
		"\7u\2\2\u0108\u0109\7p\2\2\u0109\u010a\7f\2\2\u010a<\3\2\2\2\u010b\u010c"+
		"\7k\2\2\u010c\u010d\7p\2\2\u010d\u010e\7v\2\2\u010e>\3\2\2\2\u010f\u0110"+
		"\7d\2\2\u0110\u0111\7q\2\2\u0111\u0112\7q\2\2\u0112\u0113\7n\2\2\u0113"+
		"@\3\2\2\2\u0114\u0115\7e\2\2\u0115\u0116\7j\2\2\u0116\u0117\7c\2\2\u0117"+
		"\u0118\7t\2\2\u0118B\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b\7v\2\2\u011b"+
		"\u011c\7t\2\2\u011c\u011d\7k\2\2\u011d\u011e\7p\2\2\u011e\u011f\7i\2\2"+
		"\u011fD\3\2\2\2\u0120\u0121\7r\2\2\u0121\u0122\7c\2\2\u0122\u0123\7k\2"+
		"\2\u0123\u0124\7t\2\2\u0124F\3\2\2\2\u0125\u0126\7~\2\2\u0126\u0127\7"+
		"~\2\2\u0127H\3\2\2\2\u0128\u0129\7(\2\2\u0129\u012a\7(\2\2\u012aJ\3\2"+
		"\2\2\u012b\u012c\7#\2\2\u012cL\3\2\2\2\u012d\u012e\7/\2\2\u012eN\3\2\2"+
		"\2\u012f\u0130\7n\2\2\u0130\u0131\7g\2\2\u0131\u0132\7p\2\2\u0132P\3\2"+
		"\2\2\u0133\u0134\7q\2\2\u0134\u0135\7t\2\2\u0135\u0136\7f\2\2\u0136R\3"+
		"\2\2\2\u0137\u0138\7e\2\2\u0138\u0139\7j\2\2\u0139\u013a\7t\2\2\u013a"+
		"T\3\2\2\2\u013b\u013c\7,\2\2\u013cV\3\2\2\2\u013d\u013e\7\61\2\2\u013e"+
		"X\3\2\2\2\u013f\u0140\7\'\2\2\u0140Z\3\2\2\2\u0141\u0142\7-\2\2\u0142"+
		"\\\3\2\2\2\u0143\u0144\7v\2\2\u0144\u0145\7t\2\2\u0145\u0146\7w\2\2\u0146"+
		"\u0147\7g\2\2\u0147^\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a\7c\2\2\u014a"+
		"\u014b\7n\2\2\u014b\u014c\7u\2\2\u014c\u014d\7g\2\2\u014d`\3\2\2\2\u014e"+
		"\u014f\7@\2\2\u014fb\3\2\2\2\u0150\u0151\7@\2\2\u0151\u0152\7?\2\2\u0152"+
		"d\3\2\2\2\u0153\u0154\7>\2\2\u0154f\3\2\2\2\u0155\u0156\7>\2\2\u0156\u0157"+
		"\7?\2\2\u0157h\3\2\2\2\u0158\u0159\7?\2\2\u0159j\3\2\2\2\u015a\u015b\7"+
		"?\2\2\u015b\u015c\7?\2\2\u015cl\3\2\2\2\u015d\u015e\7#\2\2\u015e\u015f"+
		"\7?\2\2\u015fn\3\2\2\2\u0160\u0161\7^\2\2\u0161p\3\2\2\2\u0162\u0163\7"+
		"a\2\2\u0163r\3\2\2\2\u0164\u0165\7)\2\2\u0165t\3\2\2\2\u0166\u0167\7$"+
		"\2\2\u0167v\3\2\2\2\u0168\u0169\4\62;\2\u0169x\3\2\2\2\u016a\u016b\4c"+
		"|\2\u016bz\3\2\2\2\u016c\u016d\4C\\\2\u016d|\3\2\2\2\u016e\u016f\t\2\2"+
		"\2\u016f~\3\2\2\2\u0170\u0175\n\3\2\2\u0171\u0172\5o8\2\u0172\u0173\5"+
		"}?\2\u0173\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0171\3\2\2\2\u0175"+
		"\u0080\3\2\2\2\u0176\u0177\t\4\2\2\u0177\u0082\3\2\2\2\u0178\u017c\5q"+
		"9\2\u0179\u017c\5y=\2\u017a\u017c\5{>\2\u017b\u0178\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017a\3\2\2\2\u017c\u0183\3\2\2\2\u017d\u0182\5q9\2\u017e"+
		"\u0182\5y=\2\u017f\u0182\5{>\2\u0180\u0182\5w<\2\u0181\u017d\3\2\2\2\u0181"+
		"\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0084\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0188\5\u0081A\2\u0187\u0186\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u018b\5w<\2\u018a\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0086\3\2"+
		"\2\2\u018e\u018f\5s:\2\u018f\u0190\5\177@\2\u0190\u0191\5s:\2\u0191\u0088"+
		"\3\2\2\2\u0192\u0196\5u;\2\u0193\u0195\5\177@\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u019a\5u;\2\u019a\u008a\3\2\2\2\u019b\u019d"+
		"\t\5\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\bF\2\2\u01a1\u008c\3\2"+
		"\2\2\u01a2\u01a6\7%\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\f\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\bG\2\2\u01ac\u008e\3\2\2\2\f\2\u0174\u017b\u0181\u0183\u0187\u018c"+
		"\u0196\u019e\u01a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}