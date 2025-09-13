// Generated from be/unamur/info/b314/compiler/EMJLexer.g4 by ANTLR 4.9.3
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EMJLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, COMMENT=2, LOUD_SPEAKER=3, SPEAKER_HIGH_VOLUME=4, SPEAKER_LOW_VOLUME=5, 
		CARTE=6, POLICE=7, HOUSES=8, MOTORWAY=9, VOLCANO=10, CONSTRUCTION=11, 
		TRACTOR=12, WAVES=13, HAUTARROW=14, DROITEARROW=15, BASARROW=16, GAUCHEARROW=17, 
		VILLAIN=18, CONNECTOR=19, COMPARATOR=20, IF=21, ELSE=22, POINTDOWN=23, 
		INFINIE=24, REPEATBOUTON=25, RETURN=26, VOID=27, ALARME=28, RADIO=29, 
		HANDRAISED=30, INTEGER_EMOJI=31, CHAR_EMOJI=32, STRING_EMOJI=33, BOOL_EMOJI=34, 
		ZERO=35, UN=36, EMOJI_TUPLE_OF=37, IMPORT=38, MAIN=39, TRUE=40, FALSE=41, 
		WITH=42, LPAR=43, RPAR=44, BRACKET1=45, BRACKET2=46, LCURLBRACKET=47, 
		RCURLBRACKET=48, ENTREQUOTE=49, QUOTE=50, POINT=51, MAP=52, COMMA=53, 
		PLUS=54, MINUS=55, MULT=56, DIV=57, EQUAL=58, ENDSTATEMENT=59, NON=60, 
		INTEGER=61, NUMBER=62, CHAR=63, STRING=64, MOTS=65, ID=66, EMOJIES=67, 
		EMOJIS=68, NEWLINE=69, WS=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LINE_COMMENT", "COMMENT", "LOUD_SPEAKER", "SPEAKER_HIGH_VOLUME", "SPEAKER_LOW_VOLUME", 
			"CARTE", "POLICE", "HOUSES", "MOTORWAY", "VOLCANO", "CONSTRUCTION", "TRACTOR", 
			"WAVES", "HAUTARROW", "DROITEARROW", "BASARROW", "GAUCHEARROW", "VILLAIN", 
			"CONNECTOR", "COMPARATOR", "IF", "ELSE", "POINTDOWN", "INFINIE", "REPEATBOUTON", 
			"RETURN", "VOID", "ALARME", "RADIO", "HANDRAISED", "INTEGER_EMOJI", "CHAR_EMOJI", 
			"STRING_EMOJI", "BOOL_EMOJI", "ZERO", "UN", "EMOJI_TUPLE_OF", "IMPORT", 
			"MAIN", "TRUE", "FALSE", "WITH", "LPAR", "RPAR", "BRACKET1", "BRACKET2", 
			"LCURLBRACKET", "RCURLBRACKET", "ENTREQUOTE", "QUOTE", "POINT", "MAP", 
			"COMMA", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", "ENDSTATEMENT", "NON", 
			"LETTER", "DIGIT", "INTEGER", "NUMBER", "CHAR", "STRING", "MOTS", "ID", 
			"EMOJIES", "EMOJIS", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\uD83D\uDCE2'", "'\uD83D\uDD0A'", "'\uD83D\uDD08'", 
			null, "'\uD83D\uDE94'", null, null, "'\uD83C\uDF0B'", "'\uD83D\uDEA7'", 
			"'\uD83D\uDE9C'", "'\uD83C\uDF0A'", null, null, null, null, "'\uD83E\uDDB9'", 
			null, null, "'\uD83E\uDD14'", "'\uD83E\uDD28'", "'\uD83D\uDC47'", null, 
			"'\uD83D\uDD01'", null, "'\uD83C\uDF00'", "'\uD83D\uDEA8'", "'\uD83D\uDCFB'", 
			"'\u270B'", "'\uD83D\uDD22'", "'\uD83D\uDD23'", "'\uD83D\uDD21'", "'\uD83D\uDD1F'", 
			null, null, "'\uD83D\uDC65'", "'\uD83D\uDCE6'", "'\uD83C\uDFE0'", "'\u2705'", 
			"'\u274C'", "'with'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'\"'", 
			"'''", "'.'", "'map'", "','", "'+'", "'-'", "'*'", "'/'", "'='", "';'", 
			"'\u26D4'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "COMMENT", "LOUD_SPEAKER", "SPEAKER_HIGH_VOLUME", 
			"SPEAKER_LOW_VOLUME", "CARTE", "POLICE", "HOUSES", "MOTORWAY", "VOLCANO", 
			"CONSTRUCTION", "TRACTOR", "WAVES", "HAUTARROW", "DROITEARROW", "BASARROW", 
			"GAUCHEARROW", "VILLAIN", "CONNECTOR", "COMPARATOR", "IF", "ELSE", "POINTDOWN", 
			"INFINIE", "REPEATBOUTON", "RETURN", "VOID", "ALARME", "RADIO", "HANDRAISED", 
			"INTEGER_EMOJI", "CHAR_EMOJI", "STRING_EMOJI", "BOOL_EMOJI", "ZERO", 
			"UN", "EMOJI_TUPLE_OF", "IMPORT", "MAIN", "TRUE", "FALSE", "WITH", "LPAR", 
			"RPAR", "BRACKET1", "BRACKET2", "LCURLBRACKET", "RCURLBRACKET", "ENTREQUOTE", 
			"QUOTE", "POINT", "MAP", "COMMA", "PLUS", "MINUS", "MULT", "DIV", "EQUAL", 
			"ENDSTATEMENT", "NON", "INTEGER", "NUMBER", "CHAR", "STRING", "MOTS", 
			"ID", "EMOJIES", "EMOJIS", "NEWLINE", "WS"
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


	public EMJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EMJLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\7\2\u0096\n\2\f\2\16\2\u0099\13\2\3\2\3\2\3\3\3\3\7\3\u009f"+
		"\n\3\f\3\16\3\u00a2\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00da"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\5@\u013a\n@\3@\3@\3A\6A\u013f\nA\rA\16A\u0140\3"+
		"B\3B\3B\3B\5B\u0147\nB\3B\3B\3C\3C\3C\3C\6C\u014f\nC\rC\16C\u0150\3C\3"+
		"C\3D\3D\5D\u0157\nD\3D\3D\7D\u015b\nD\fD\16D\u015e\13D\3E\3E\3E\3E\3F"+
		"\3F\5F\u0166\nF\3G\6G\u0169\nG\rG\16G\u016a\3H\5H\u016e\nH\3H\3H\6H\u0172"+
		"\nH\rH\16H\u0173\3H\3H\3I\6I\u0179\nI\rI\16I\u017a\3I\3I\3\u00a0\2J\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{\2}\2\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008bE\u008d"+
		"F\u008fG\u0091H\3\2\6\4\2\f\f\17\17\4\2>>@@\4\2C\\c|\4\2\13\13\"\"\36"+
		"\3\2\uf4e4\3\uf4e4\3\3\2\uf50c\3\uf50c\3\3\2\uf50a\3\uf50a\3\3\2\uf5fc"+
		"\3\uf5fc\3\3\2\uf696\3\uf696\3\3\2\uf3da\3\uf3da\3\3\2\uf6e5\3\uf6e5\3"+
		"\3\2\uf30d\3\uf30d\3\3\2\uf6a9\3\uf6a9\3\3\2\uf69e\3\uf69e\3\3\2\uf30c"+
		"\3\uf30c\3\3\2\uf9bb\3\uf9bb\3\4\2\u2755\2\u2755\2\uf91f\3\uf91f\3\3\2"+
		"\uf916\3\uf916\3\3\2\uf92a\3\uf92a\3\3\2\uf449\3\uf449\3\3\2\uf503\3\uf503"+
		"\3\3\2\uf302\3\uf302\3\3\2\uf6aa\3\uf6aa\3\3\2\uf4fd\3\uf4fd\3\3\2\uf524"+
		"\3\uf524\3\3\2\uf525\3\uf525\3\3\2\uf523\3\uf523\3\3\2\uf521\3\uf521\3"+
		"\3\2\uf467\3\uf467\3\3\2\uf4e8\3\uf4e8\3\3\2\uf3e2\3\uf3e2\3\u009a\2%"+
		"\2%\2,\2,\2\62\2;\2\u00ab\2\u00ab\2\u00b0\2\u00b0\2\u203e\2\u203e\2\u204b"+
		"\2\u204b\2\u2124\2\u2124\2\u213b\2\u213b\2\u2196\2\u219b\2\u21ab\2\u21ac"+
		"\2\u231c\2\u231d\2\u232a\2\u232a\2\u23d1\2\u23d1\2\u23eb\2\u23f5\2\u23fa"+
		"\2\u23fc\2\u24c4\2\u24c4\2\u25ac\2\u25ad\2\u25b8\2\u25b8\2\u25c2\2\u25c2"+
		"\2\u25fd\2\u2600\2\u2602\2\u2606\2\u2610\2\u2610\2\u2613\2\u2613\2\u2616"+
		"\2\u2617\2\u261a\2\u261a\2\u261f\2\u261f\2\u2622\2\u2622\2\u2624\2\u2625"+
		"\2\u2628\2\u2628\2\u262c\2\u262c\2\u2630\2\u2631\2\u263a\2\u263c\2\u2642"+
		"\2\u2642\2\u2644\2\u2644\2\u264a\2\u2655\2\u2661\2\u2662\2\u2665\2\u2665"+
		"\2\u2667\2\u2668\2\u266a\2\u266a\2\u267d\2\u267d\2\u2680\2\u2681\2\u2694"+
		"\2\u2699\2\u269b\2\u269b\2\u269d\2\u269e\2\u26a2\2\u26a3\2\u26a9\2\u26a9"+
		"\2\u26ac\2\u26ad\2\u26b2\2\u26b3\2\u26bf\2\u26c0\2\u26c6\2\u26c7\2\u26ca"+
		"\2\u26ca\2\u26d0\2\u26d1\2\u26d3\2\u26d3\2\u26d5\2\u26d6\2\u26eb\2\u26ec"+
		"\2\u26f2\2\u26f7\2\u26f9\2\u26fc\2\u26ff\2\u26ff\2\u2704\2\u2704\2\u2707"+
		"\2\u2707\2\u270a\2\u270f\2\u2711\2\u2711\2\u2714\2\u2714\2\u2716\2\u2716"+
		"\2\u2718\2\u2718\2\u271f\2\u271f\2\u2723\2\u2723\2\u272a\2\u272a\2\u2735"+
		"\2\u2736\2\u2746\2\u2746\2\u2749\2\u2749\2\u274e\2\u274e\2\u2750\2\u2750"+
		"\2\u2755\2\u2757\2\u2759\2\u2759\2\u2765\2\u2766\2\u2797\2\u2799\2\u27a3"+
		"\2\u27a3\2\u27b2\2\u27b2\2\u27c1\2\u27c1\2\u2936\2\u2937\2\u2b07\2\u2b09"+
		"\2\u2b1d\2\u2b1e\2\u2b52\2\u2b52\2\u2b57\2\u2b57\2\u3032\2\u3032\2\u303f"+
		"\2\u303f\2\u3299\2\u3299\2\u329b\2\u329b\2\uf006\3\uf006\3\uf0d1\3\uf0d1"+
		"\3\uf172\3\uf173\3\uf180\3\uf181\3\uf190\3\uf190\3\uf193\3\uf19c\3\uf1e8"+
		"\3\uf201\3\uf203\3\uf204\3\uf21c\3\uf21c\3\uf231\3\uf231\3\uf234\3\uf23c"+
		"\3\uf252\3\uf253\3\uf302\3\uf323\3\uf326\3\uf395\3\uf398\3\uf399\3\uf39b"+
		"\3\uf39d\3\uf3a0\3\uf3f2\3\uf3f5\3\uf3f7\3\uf3f9\3\uf4ff\3\uf501\3\uf53f"+
		"\3\uf54b\3\uf550\3\uf552\3\uf569\3\uf571\3\uf572\3\uf575\3\uf57c\3\uf589"+
		"\3\uf589\3\uf58c\3\uf58f\3\uf592\3\uf592\3\uf597\3\uf598\3\uf5a6\3\uf5a7"+
		"\3\uf5aa\3\uf5aa\3\uf5b3\3\uf5b4\3\uf5be\3\uf5be\3\uf5c4\3\uf5c6\3\uf5d3"+
		"\3\uf5d5\3\uf5de\3\uf5e0\3\uf5e3\3\uf5e3\3\uf5e5\3\uf5e5\3\uf5ea\3\uf5ea"+
		"\3\uf5f1\3\uf5f1\3\uf5f5\3\uf5f5\3\uf5fc\3\uf651\3\uf682\3\uf6c7\3\uf6cd"+
		"\3\uf6d4\3\uf6d7\3\uf6d9\3\uf6e2\3\uf6e7\3\uf6eb\3\uf6eb\3\uf6ed\3\uf6ee"+
		"\3\uf6f2\3\uf6f2\3\uf6f5\3\uf6fe\3\uf7e2\3\uf7ed\3\uf90e\3\uf93c\3\uf93e"+
		"\3\uf947\3\uf949\3\uf97a\3\uf97c\3\uf9cd\3\uf9cf\3\ufa01\3\ufa72\3\ufa76"+
		"\3\ufa7a\3\ufa7c\3\ufa82\3\ufa88\3\ufa92\3\ufaaa\3\ufab2\3\ufab8\3\ufac2"+
		"\3\ufac4\3\ufad2\3\ufad8\3\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u009c"+
		"\3\2\2\2\7\u00a7\3\2\2\2\t\u00a9\3\2\2\2\13\u00ab\3\2\2\2\r\u00ad\3\2"+
		"\2\2\17\u00b0\3\2\2\2\21\u00b2\3\2\2\2\23\u00b5\3\2\2\2\25\u00b8\3\2\2"+
		"\2\27\u00ba\3\2\2\2\31\u00bc\3\2\2\2\33\u00be\3\2\2\2\35\u00c0\3\2\2\2"+
		"\37\u00c3\3\2\2\2!\u00c6\3\2\2\2#\u00c9\3\2\2\2%\u00cc\3\2\2\2\'\u00ce"+
		"\3\2\2\2)\u00d9\3\2\2\2+\u00db\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61"+
		"\u00e1\3\2\2\2\63\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67\u00e9\3\2\2\29\u00eb"+
		"\3\2\2\2;\u00ed\3\2\2\2=\u00ef\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C"+
		"\u00f5\3\2\2\2E\u00f7\3\2\2\2G\u00f9\3\2\2\2I\u00fc\3\2\2\2K\u00ff\3\2"+
		"\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u0105\3\2\2\2S\u0107\3\2\2\2U\u0109"+
		"\3\2\2\2W\u010e\3\2\2\2Y\u0110\3\2\2\2[\u0112\3\2\2\2]\u0114\3\2\2\2_"+
		"\u0116\3\2\2\2a\u0118\3\2\2\2c\u011a\3\2\2\2e\u011c\3\2\2\2g\u011e\3\2"+
		"\2\2i\u0120\3\2\2\2k\u0124\3\2\2\2m\u0126\3\2\2\2o\u0128\3\2\2\2q\u012a"+
		"\3\2\2\2s\u012c\3\2\2\2u\u012e\3\2\2\2w\u0130\3\2\2\2y\u0132\3\2\2\2{"+
		"\u0134\3\2\2\2}\u0136\3\2\2\2\177\u0139\3\2\2\2\u0081\u013e\3\2\2\2\u0083"+
		"\u0142\3\2\2\2\u0085\u014a\3\2\2\2\u0087\u0156\3\2\2\2\u0089\u015f\3\2"+
		"\2\2\u008b\u0163\3\2\2\2\u008d\u0168\3\2\2\2\u008f\u0171\3\2\2\2\u0091"+
		"\u0178\3\2\2\2\u0093\u0097\t\6\2\2\u0094\u0096\n\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\b\2\2\2\u009b\4\3\2\2\2"+
		"\u009c\u00a0\t\7\2\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\t\b\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\3"+
		"\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\t\6\2\2\u00a8\b\3\2\2\2\u00a9\u00aa\t"+
		"\7\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\t\b\2\2\u00ac\f\3\2\2\2\u00ad\u00ae"+
		"\t\t\2\2\u00ae\u00af\7\ufe11\2\2\u00af\16\3\2\2\2\u00b0\u00b1\t\n\2\2"+
		"\u00b1\20\3\2\2\2\u00b2\u00b3\t\13\2\2\u00b3\u00b4\7\ufe11\2\2\u00b4\22"+
		"\3\2\2\2\u00b5\u00b6\t\f\2\2\u00b6\u00b7\7\ufe11\2\2\u00b7\24\3\2\2\2"+
		"\u00b8\u00b9\t\r\2\2\u00b9\26\3\2\2\2\u00ba\u00bb\t\16\2\2\u00bb\30\3"+
		"\2\2\2\u00bc\u00bd\t\17\2\2\u00bd\32\3\2\2\2\u00be\u00bf\t\20\2\2\u00bf"+
		"\34\3\2\2\2\u00c0\u00c1\7\u2b08\2\2\u00c1\u00c2\7\ufe11\2\2\u00c2\36\3"+
		"\2\2\2\u00c3\u00c4\7\u27a3\2\2\u00c4\u00c5\7\ufe11\2\2\u00c5 \3\2\2\2"+
		"\u00c6\u00c7\7\u2b09\2\2\u00c7\u00c8\7\ufe11\2\2\u00c8\"\3\2\2\2\u00c9"+
		"\u00ca\7\u2b07\2\2\u00ca\u00cb\7\ufe11\2\2\u00cb$\3\2\2\2\u00cc\u00cd"+
		"\t\21\2\2\u00cd&\3\2\2\2\u00ce\u00cf\t\22\2\2\u00cf(\3\2\2\2\u00d0\u00da"+
		"\t\3\2\2\u00d1\u00d2\7?\2\2\u00d2\u00da\7?\2\2\u00d3\u00d4\7>\2\2\u00d4"+
		"\u00da\7?\2\2\u00d5\u00d6\7@\2\2\u00d6\u00da\7?\2\2\u00d7\u00d8\7#\2\2"+
		"\u00d8\u00da\7?\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d3"+
		"\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da*\3\2\2\2\u00db"+
		"\u00dc\t\23\2\2\u00dc,\3\2\2\2\u00dd\u00de\t\24\2\2\u00de.\3\2\2\2\u00df"+
		"\u00e0\t\25\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7\u2680\2\2\u00e2\u00e3\7"+
		"\ufe11\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\t\26\2\2\u00e5\64\3\2\2\2\u00e6"+
		"\u00e7\7\u21ab\2\2\u00e7\u00e8\7\ufe11\2\2\u00e8\66\3\2\2\2\u00e9\u00ea"+
		"\t\27\2\2\u00ea8\3\2\2\2\u00eb\u00ec\t\30\2\2\u00ec:\3\2\2\2\u00ed\u00ee"+
		"\t\31\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7\u270d\2\2\u00f0>\3\2\2\2\u00f1"+
		"\u00f2\t\32\2\2\u00f2@\3\2\2\2\u00f3\u00f4\t\33\2\2\u00f4B\3\2\2\2\u00f5"+
		"\u00f6\t\34\2\2\u00f6D\3\2\2\2\u00f7\u00f8\t\35\2\2\u00f8F\3\2\2\2\u00f9"+
		"\u00fa\7\62\2\2\u00fa\u00fb\7\ufe11\2\2\u00fbH\3\2\2\2\u00fc\u00fd\7\63"+
		"\2\2\u00fd\u00fe\7\ufe11\2\2\u00feJ\3\2\2\2\u00ff\u0100\t\36\2\2\u0100"+
		"L\3\2\2\2\u0101\u0102\t\37\2\2\u0102N\3\2\2\2\u0103\u0104\t \2\2\u0104"+
		"P\3\2\2\2\u0105\u0106\7\u2707\2\2\u0106R\3\2\2\2\u0107\u0108\7\u274e\2"+
		"\2\u0108T\3\2\2\2\u0109\u010a\7y\2\2\u010a\u010b\7k\2\2\u010b\u010c\7"+
		"v\2\2\u010c\u010d\7j\2\2\u010dV\3\2\2\2\u010e\u010f\7*\2\2\u010fX\3\2"+
		"\2\2\u0110\u0111\7+\2\2\u0111Z\3\2\2\2\u0112\u0113\7]\2\2\u0113\\\3\2"+
		"\2\2\u0114\u0115\7_\2\2\u0115^\3\2\2\2\u0116\u0117\7}\2\2\u0117`\3\2\2"+
		"\2\u0118\u0119\7\177\2\2\u0119b\3\2\2\2\u011a\u011b\7$\2\2\u011bd\3\2"+
		"\2\2\u011c\u011d\7)\2\2\u011df\3\2\2\2\u011e\u011f\7\60\2\2\u011fh\3\2"+
		"\2\2\u0120\u0121\7o\2\2\u0121\u0122\7c\2\2\u0122\u0123\7r\2\2\u0123j\3"+
		"\2\2\2\u0124\u0125\7.\2\2\u0125l\3\2\2\2\u0126\u0127\7-\2\2\u0127n\3\2"+
		"\2\2\u0128\u0129\7/\2\2\u0129p\3\2\2\2\u012a\u012b\7,\2\2\u012br\3\2\2"+
		"\2\u012c\u012d\7\61\2\2\u012dt\3\2\2\2\u012e\u012f\7?\2\2\u012fv\3\2\2"+
		"\2\u0130\u0131\7=\2\2\u0131x\3\2\2\2\u0132\u0133\7\u26d6\2\2\u0133z\3"+
		"\2\2\2\u0134\u0135\t\4\2\2\u0135|\3\2\2\2\u0136\u0137\4\62;\2\u0137~\3"+
		"\2\2\2\u0138\u013a\5o8\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\5\u0081A\2\u013c\u0080\3\2\2\2\u013d\u013f"+
		"\5}?\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0082\3\2\2\2\u0142\u0146\5e\63\2\u0143\u0147\5{"+
		">\2\u0144\u0147\7\"\2\2\u0145\u0147\5}?\2\u0146\u0143\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5e\63\2\u0149"+
		"\u0084\3\2\2\2\u014a\u014e\5c\62\2\u014b\u014f\5{>\2\u014c\u014f\7\"\2"+
		"\2\u014d\u014f\5}?\2\u014e\u014b\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\5c\62\2\u0153\u0086\3\2\2\2\u0154\u0157\5}"+
		"?\2\u0155\u0157\5{>\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u015c"+
		"\3\2\2\2\u0158\u015b\5{>\2\u0159\u015b\5}?\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u0088\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\5[.\2\u0160\u0161"+
		"\5\u008bF\2\u0161\u0162\5]/\2\u0162\u008a\3\2\2\2\u0163\u0165\5\u008d"+
		"G\2\u0164\u0166\5\u008bF\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u008c\3\2\2\2\u0167\u0169\t!\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u008e\3\2\2\2\u016c"+
		"\u016e\7\17\2\2\u016d\u016c\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0172\7\f\2\2\u0170\u0172\7\f\2\2\u0171\u016d\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\bH\2\2\u0176\u0090\3\2\2\2\u0177"+
		"\u0179\t\5\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017a\u017b\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\bI\2\2\u017d"+
		"\u0092\3\2\2\2\24\2\u0097\u00a0\u00d9\u0139\u0140\u0146\u014e\u0150\u0156"+
		"\u015a\u015c\u0165\u016a\u016d\u0171\u0173\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}