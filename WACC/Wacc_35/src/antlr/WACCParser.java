// Generated from ./WACCParser.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WACCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=23, FST=28, MOD=44, CHAR=32, LESS_THAN_EQUALS=51, DO=24, DOUBLE_EQUALS=53, 
		EQUALS=52, NOT=37, NOT_EQUALS=54, ORD=40, LOGICAL_AND=36, IF=19, CLOSE_SQUAREBRACKET=6, 
		FREE=14, STRING_LITERAL=58, THEN=20, MULTIPLY=42, COMMA=8, IS=7, DONE=25, 
		PRINTLN=18, BEGIN=1, RETURN=15, LOGICAL_OR=35, IDENT=55, PLUS=45, PAIR=34, 
		GREATER_THAN_EQUALS=49, COMMENT=60, NEWPAIR=26, DIVIDE=43, EXIT=16, INT_LITERAL=56, 
		GREATER_THAN=48, SND=29, NULL=11, ELSE=21, OPEN_SQUAREBRACKET=5, BOOL=31, 
		HASH=10, SEMICOLON=9, INT=30, MINUS=38, TRUE=46, PRINT=17, CHR=41, FI=22, 
		CLOSE_PARENTHESIS=4, SKIP=12, WS=59, CHAR_LITERAL=57, READ=13, LESS_THAN=50, 
		LEN=39, CALL=27, END=2, FALSE=47, OPEN_PARENTHESIS=3, STRING=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'begin'", "'end'", "'('", "')'", "'['", "']'", "'is'", "','", 
		"';'", "'#'", "'null'", "'skip'", "'read'", "'free'", "'return'", "'exit'", 
		"'print'", "'println'", "'if'", "'then'", "'else'", "'fi'", "'while'", 
		"'do'", "'done'", "'newpair'", "'call'", "'fst'", "'snd'", "'int'", "'bool'", 
		"'char'", "'string'", "'pair'", "'||'", "'&&'", "'!'", "'-'", "'len'", 
		"'ord'", "'chr'", "'*'", "'/'", "'%'", "'+'", "'true'", "'false'", "'>'", 
		"'>='", "'<'", "'<='", "'='", "'=='", "'!='", "IDENT", "INT_LITERAL", 
		"CHAR_LITERAL", "STRING_LITERAL", "WS", "COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_func = 1, RULE_param_list = 2, RULE_param = 3, 
		RULE_stat = 4, RULE_assign_lhs = 5, RULE_assign_rhs = 6, RULE_arg_list = 7, 
		RULE_pair_elem = 8, RULE_type = 9, RULE_base_type = 10, RULE_array_type = 11, 
		RULE_pair_type = 12, RULE_pair_elem_type = 13, RULE_expr = 14, RULE_unary_op = 15, 
		RULE_bin_op_pr_1 = 16, RULE_bin_op_pr_2 = 17, RULE_bin_op_pr_3 = 18, RULE_bin_op_pr_4 = 19, 
		RULE_bin_op_pr_5 = 20, RULE_bin_op_pr_6 = 21, RULE_define_ident = 22, 
		RULE_ident = 23, RULE_func_ident = 24, RULE_int_literal = 25, RULE_string_literal = 26, 
		RULE_char_literal = 27, RULE_array_elem = 28, RULE_array_liter = 29, RULE_pair_literal = 30, 
		RULE_bool_literal = 31;
	public static final String[] ruleNames = {
		"program", "func", "param_list", "param", "stat", "assign_lhs", "assign_rhs", 
		"arg_list", "pair_elem", "type", "base_type", "array_type", "pair_type", 
		"pair_elem_type", "expr", "unary_op", "bin_op_pr_1", "bin_op_pr_2", "bin_op_pr_3", 
		"bin_op_pr_4", "bin_op_pr_5", "bin_op_pr_6", "define_ident", "ident", 
		"func_ident", "int_literal", "string_literal", "char_literal", "array_elem", 
		"array_liter", "pair_literal", "bool_literal"
	};

	@Override
	public String getGrammarFileName() { return "WACCParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WACCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WACCParser.EOF, 0); }
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(WACCParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(WACCParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(BEGIN);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65); func();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(71); stat(0);
			setState(72); match(END);
			setState(73); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode IS() { return getToken(WACCParser.IS, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(WACCParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(WACCParser.OPEN_PARENTHESIS, 0); }
		public TerminalNode END() { return getToken(WACCParser.END, 0); }
		public Func_identContext func_ident() {
			return getRuleContext(Func_identContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); type();
			setState(76); func_ident();
			setState(77); match(OPEN_PARENTHESIS);
			setState(79);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << STRING) | (1L << PAIR))) != 0)) {
				{
				setState(78); param_list();
				}
			}

			setState(81); match(CLOSE_PARENTHESIS);
			setState(82); match(IS);
			setState(83); stat(0);
			setState(84); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(WACCParser.COMMA); }
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(WACCParser.COMMA, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); param();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87); match(COMMA);
				setState(88); param();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Define_identContext define_ident() {
			return getRuleContext(Define_identContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); type();
			setState(95); define_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(WACCParser.THEN, 0); }
		public TerminalNode PRINT() { return getToken(WACCParser.PRINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(WACCParser.SEMICOLON, 0); }
		public TerminalNode FI() { return getToken(WACCParser.FI, 0); }
		public TerminalNode EQUALS() { return getToken(WACCParser.EQUALS, 0); }
		public TerminalNode DONE() { return getToken(WACCParser.DONE, 0); }
		public TerminalNode SKIP() { return getToken(WACCParser.SKIP, 0); }
		public Define_identContext define_ident() {
			return getRuleContext(Define_identContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(WACCParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(WACCParser.IF, 0); }
		public Assign_rhsContext assign_rhs() {
			return getRuleContext(Assign_rhsContext.class,0);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode DO() { return getToken(WACCParser.DO, 0); }
		public Assign_lhsContext assign_lhs() {
			return getRuleContext(Assign_lhsContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(WACCParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode READ() { return getToken(WACCParser.READ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(WACCParser.RETURN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public TerminalNode FREE() { return getToken(WACCParser.FREE, 0); }
		public TerminalNode EXIT() { return getToken(WACCParser.EXIT, 0); }
		public TerminalNode BEGIN() { return getToken(WACCParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(WACCParser.END, 0); }
		public TerminalNode PRINTLN() { return getToken(WACCParser.PRINTLN, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		return stat(0);
	}

	private StatContext stat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatContext _localctx = new StatContext(_ctx, _parentState);
		StatContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_stat, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			switch (_input.LA(1)) {
			case SKIP:
				{
				setState(98); match(SKIP);
				}
				break;
			case INT:
			case BOOL:
			case CHAR:
			case STRING:
			case PAIR:
				{
				setState(99); type();
				setState(100); define_ident();
				setState(101); match(EQUALS);
				setState(102); assign_rhs();
				}
				break;
			case FST:
			case SND:
			case IDENT:
				{
				setState(104); assign_lhs();
				setState(105); match(EQUALS);
				setState(106); assign_rhs();
				}
				break;
			case READ:
				{
				setState(108); match(READ);
				setState(109); assign_lhs();
				}
				break;
			case FREE:
				{
				setState(110); match(FREE);
				setState(111); expr(0);
				}
				break;
			case RETURN:
				{
				setState(112); match(RETURN);
				setState(113); expr(0);
				}
				break;
			case EXIT:
				{
				setState(114); match(EXIT);
				setState(115); expr(0);
				}
				break;
			case PRINT:
				{
				setState(116); match(PRINT);
				setState(117); expr(0);
				}
				break;
			case PRINTLN:
				{
				setState(118); match(PRINTLN);
				setState(119); expr(0);
				}
				break;
			case IF:
				{
				setState(120); match(IF);
				setState(121); expr(0);
				setState(122); match(THEN);
				setState(123); stat(0);
				setState(124); match(ELSE);
				setState(125); stat(0);
				setState(126); match(FI);
				}
				break;
			case WHILE:
				{
				setState(128); match(WHILE);
				setState(129); expr(0);
				setState(130); match(DO);
				setState(131); stat(0);
				setState(132); match(DONE);
				}
				break;
			case BEGIN:
				{
				setState(134); match(BEGIN);
				setState(135); stat(0);
				setState(136); match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stat);
					setState(140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(141); match(SEMICOLON);
					setState(142); stat(2);
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Assign_lhsContext extends ParserRuleContext {
		public Pair_elemContext pair_elem() {
			return getRuleContext(Pair_elemContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public Assign_lhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_lhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitAssign_lhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_lhsContext assign_lhs() throws RecognitionException {
		Assign_lhsContext _localctx = new Assign_lhsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_lhs);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); array_elem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); pair_elem();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_rhsContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(WACCParser.CALL, 0); }
		public Pair_elemContext pair_elem() {
			return getRuleContext(Pair_elemContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(WACCParser.COMMA, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEWPAIR() { return getToken(WACCParser.NEWPAIR, 0); }
		public Array_literContext array_liter() {
			return getRuleContext(Array_literContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(WACCParser.CLOSE_PARENTHESIS, 0); }
		public TerminalNode OPEN_PARENTHESIS() { return getToken(WACCParser.OPEN_PARENTHESIS, 0); }
		public Func_identContext func_ident() {
			return getRuleContext(Func_identContext.class,0);
		}
		public Assign_rhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_rhs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitAssign_rhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_rhsContext assign_rhs() throws RecognitionException {
		Assign_rhsContext _localctx = new Assign_rhsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_rhs);
		int _la;
		try {
			setState(171);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESIS:
			case NULL:
			case NOT:
			case MINUS:
			case LEN:
			case ORD:
			case CHR:
			case TRUE:
			case FALSE:
			case IDENT:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); expr(0);
				}
				break;
			case OPEN_SQUAREBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); array_liter();
				}
				break;
			case NEWPAIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(155); match(NEWPAIR);
				setState(156); match(OPEN_PARENTHESIS);
				setState(157); expr(0);
				setState(158); match(COMMA);
				setState(159); expr(0);
				setState(160); match(CLOSE_PARENTHESIS);
				}
				break;
			case FST:
			case SND:
				enterOuterAlt(_localctx, 4);
				{
				setState(162); pair_elem();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(163); match(CALL);
				setState(164); func_ident();
				setState(165); match(OPEN_PARENTHESIS);
				setState(167);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESIS) | (1L << NULL) | (1L << NOT) | (1L << MINUS) | (1L << LEN) | (1L << ORD) | (1L << CHR) | (1L << TRUE) | (1L << FALSE) | (1L << IDENT) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
					{
					setState(166); arg_list();
					}
				}

				setState(169); match(CLOSE_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(WACCParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(WACCParser.COMMA, i);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); expr(0);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174); match(COMMA);
				setState(175); expr(0);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_elemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FST() { return getToken(WACCParser.FST, 0); }
		public TerminalNode SND() { return getToken(WACCParser.SND, 0); }
		public Pair_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitPair_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_elemContext pair_elem() throws RecognitionException {
		Pair_elemContext _localctx = new Pair_elemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pair_elem);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case FST:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(FST);
				setState(182); expr(0);
				}
				break;
			case SND:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(SND);
				setState(184); expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public Pair_typeContext pair_type() {
			return getRuleContext(Pair_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(190);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); base_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); array_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); pair_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(WACCParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(WACCParser.INT, 0); }
		public TerminalNode STRING() { return getToken(WACCParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(WACCParser.CHAR, 0); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_base_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUAREBRACKET(int i) {
			return getToken(WACCParser.OPEN_SQUAREBRACKET, i);
		}
		public TerminalNode CLOSE_SQUAREBRACKET(int i) {
			return getToken(WACCParser.CLOSE_SQUAREBRACKET, i);
		}
		public List<TerminalNode> OPEN_SQUAREBRACKET() { return getTokens(WACCParser.OPEN_SQUAREBRACKET); }
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public Pair_typeContext pair_type() {
			return getRuleContext(Pair_typeContext.class,0);
		}
		public List<TerminalNode> CLOSE_SQUAREBRACKET() { return getTokens(WACCParser.CLOSE_SQUAREBRACKET); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case CHAR:
			case STRING:
				{
				setState(194); base_type();
				}
				break;
			case PAIR:
				{
				setState(195); pair_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198); match(OPEN_SQUAREBRACKET);
				setState(199); match(CLOSE_SQUAREBRACKET);
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_SQUAREBRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_typeContext extends ParserRuleContext {
		public List<Pair_elem_typeContext> pair_elem_type() {
			return getRuleContexts(Pair_elem_typeContext.class);
		}
		public TerminalNode COMMA() { return getToken(WACCParser.COMMA, 0); }
		public TerminalNode PAIR() { return getToken(WACCParser.PAIR, 0); }
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(WACCParser.CLOSE_PARENTHESIS, 0); }
		public Pair_elem_typeContext pair_elem_type(int i) {
			return getRuleContext(Pair_elem_typeContext.class,i);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(WACCParser.OPEN_PARENTHESIS, 0); }
		public Pair_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitPair_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_typeContext pair_type() throws RecognitionException {
		Pair_typeContext _localctx = new Pair_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pair_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(PAIR);
			setState(205); match(OPEN_PARENTHESIS);
			setState(206); pair_elem_type();
			setState(207); match(COMMA);
			setState(208); pair_elem_type();
			setState(209); match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_elem_typeContext extends ParserRuleContext {
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public TerminalNode PAIR() { return getToken(WACCParser.PAIR, 0); }
		public Pair_elem_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_elem_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitPair_elem_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_elem_typeContext pair_elem_type() throws RecognitionException {
		Pair_elem_typeContext _localctx = new Pair_elem_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pair_elem_type);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211); base_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); array_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); match(PAIR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Bin_op_pr_5Context bin_op_pr_5() {
			return getRuleContext(Bin_op_pr_5Context.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Pair_literalContext pair_literal() {
			return getRuleContext(Pair_literalContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(WACCParser.CLOSE_PARENTHESIS, 0); }
		public Bin_op_pr_2Context bin_op_pr_2() {
			return getRuleContext(Bin_op_pr_2Context.class,0);
		}
		public Array_elemContext array_elem() {
			return getRuleContext(Array_elemContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Bin_op_pr_1Context bin_op_pr_1() {
			return getRuleContext(Bin_op_pr_1Context.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bin_op_pr_3Context bin_op_pr_3() {
			return getRuleContext(Bin_op_pr_3Context.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Bin_op_pr_4Context bin_op_pr_4() {
			return getRuleContext(Bin_op_pr_4Context.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Bin_op_pr_6Context bin_op_pr_6() {
			return getRuleContext(Bin_op_pr_6Context.class,0);
		}
		public TerminalNode OPEN_PARENTHESIS() { return getToken(WACCParser.OPEN_PARENTHESIS, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(217); unary_op();
				setState(218); expr(8);
				}
				break;
			case 2:
				{
				setState(220); int_literal();
				}
				break;
			case 3:
				{
				setState(221); bool_literal();
				}
				break;
			case 4:
				{
				setState(222); char_literal();
				}
				break;
			case 5:
				{
				setState(223); string_literal();
				}
				break;
			case 6:
				{
				setState(224); pair_literal();
				}
				break;
			case 7:
				{
				setState(225); ident();
				}
				break;
			case 8:
				{
				setState(226); array_elem();
				}
				break;
			case 9:
				{
				setState(227); match(OPEN_PARENTHESIS);
				setState(228); expr(0);
				setState(229); match(CLOSE_PARENTHESIS);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234); bin_op_pr_1();
						setState(235); expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(238); bin_op_pr_2();
						setState(239); expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(242); bin_op_pr_3();
						setState(243); expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(246); bin_op_pr_4();
						setState(247); expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(250); bin_op_pr_5();
						setState(251); expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(253);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(254); bin_op_pr_6();
						setState(255); expr(3);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(WACCParser.LEN, 0); }
		public TerminalNode MINUS() { return getToken(WACCParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(WACCParser.NOT, 0); }
		public TerminalNode CHR() { return getToken(WACCParser.CHR, 0); }
		public TerminalNode ORD() { return getToken(WACCParser.ORD, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << LEN) | (1L << ORD) | (1L << CHR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_op_pr_1Context extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(WACCParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(WACCParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(WACCParser.MOD, 0); }
		public Bin_op_pr_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_pr_1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBin_op_pr_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_pr_1Context bin_op_pr_1() throws RecognitionException {
		Bin_op_pr_1Context _localctx = new Bin_op_pr_1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_bin_op_pr_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_op_pr_2Context extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(WACCParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(WACCParser.PLUS, 0); }
		public Bin_op_pr_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_pr_2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBin_op_pr_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_pr_2Context bin_op_pr_2() throws RecognitionException {
		Bin_op_pr_2Context _localctx = new Bin_op_pr_2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_bin_op_pr_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_op_pr_3Context extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(WACCParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(WACCParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_EQUALS() { return getToken(WACCParser.LESS_THAN_EQUALS, 0); }
		public TerminalNode GREATER_THAN_EQUALS() { return getToken(WACCParser.GREATER_THAN_EQUALS, 0); }
		public Bin_op_pr_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_pr_3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBin_op_pr_3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_pr_3Context bin_op_pr_3() throws RecognitionException {
		Bin_op_pr_3Context _localctx = new Bin_op_pr_3Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_bin_op_pr_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN) | (1L << GREATER_THAN_EQUALS) | (1L << LESS_THAN) | (1L << LESS_THAN_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_op_pr_4Context extends ParserRuleContext {
		public TerminalNode DOUBLE_EQUALS() { return getToken(WACCParser.DOUBLE_EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(WACCParser.NOT_EQUALS, 0); }
		public Bin_op_pr_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_pr_4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBin_op_pr_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_pr_4Context bin_op_pr_4() throws RecognitionException {
		Bin_op_pr_4Context _localctx = new Bin_op_pr_4Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_bin_op_pr_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_EQUALS || _la==NOT_EQUALS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_op_pr_5Context extends ParserRuleContext {
		public TerminalNode LOGICAL_AND() { return getToken(WACCParser.LOGICAL_AND, 0); }
		public Bin_op_pr_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_pr_5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBin_op_pr_5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_pr_5Context bin_op_pr_5() throws RecognitionException {
		Bin_op_pr_5Context _localctx = new Bin_op_pr_5Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_bin_op_pr_5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(LOGICAL_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_op_pr_6Context extends ParserRuleContext {
		public TerminalNode LOGICAL_OR() { return getToken(WACCParser.LOGICAL_OR, 0); }
		public Bin_op_pr_6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op_pr_6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBin_op_pr_6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_op_pr_6Context bin_op_pr_6() throws RecognitionException {
		Bin_op_pr_6Context _localctx = new Bin_op_pr_6Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_bin_op_pr_6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); match(LOGICAL_OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_identContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(WACCParser.IDENT, 0); }
		public Define_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitDefine_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_identContext define_ident() throws RecognitionException {
		Define_identContext _localctx = new Define_identContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_define_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(WACCParser.IDENT, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_identContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(WACCParser.IDENT, 0); }
		public Func_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitFunc_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_identContext func_ident() throws RecognitionException {
		Func_identContext _localctx = new Func_identContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_func_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(WACCParser.INT_LITERAL, 0); }
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitInt_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_int_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); match(INT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(WACCParser.STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(WACCParser.CHAR_LITERAL, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitChar_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(CHAR_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elemContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUAREBRACKET(int i) {
			return getToken(WACCParser.OPEN_SQUAREBRACKET, i);
		}
		public TerminalNode CLOSE_SQUAREBRACKET(int i) {
			return getToken(WACCParser.CLOSE_SQUAREBRACKET, i);
		}
		public List<TerminalNode> OPEN_SQUAREBRACKET() { return getTokens(WACCParser.OPEN_SQUAREBRACKET); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> CLOSE_SQUAREBRACKET() { return getTokens(WACCParser.CLOSE_SQUAREBRACKET); }
		public Array_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitArray_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_elemContext array_elem() throws RecognitionException {
		Array_elemContext _localctx = new Array_elemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_array_elem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288); ident();
			setState(293); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(289); match(OPEN_SQUAREBRACKET);
					setState(290); expr(0);
					setState(291); match(CLOSE_SQUAREBRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_literContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUAREBRACKET() { return getToken(WACCParser.OPEN_SQUAREBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(WACCParser.COMMA); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(WACCParser.COMMA, i);
		}
		public TerminalNode CLOSE_SQUAREBRACKET() { return getToken(WACCParser.CLOSE_SQUAREBRACKET, 0); }
		public Array_literContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_liter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitArray_liter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literContext array_liter() throws RecognitionException {
		Array_literContext _localctx = new Array_literContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_array_liter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(OPEN_SQUAREBRACKET);
			setState(306);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PARENTHESIS) | (1L << NULL) | (1L << NOT) | (1L << MINUS) | (1L << LEN) | (1L << ORD) | (1L << CHR) | (1L << TRUE) | (1L << FALSE) | (1L << IDENT) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(298); expr(0);
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(299); match(COMMA);
					setState(300); expr(0);
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(308); match(CLOSE_SQUAREBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_literalContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(WACCParser.NULL, 0); }
		public Pair_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitPair_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_literalContext pair_literal() throws RecognitionException {
		Pair_literalContext _localctx = new Pair_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pair_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(WACCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(WACCParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WACCParserVisitor ) return ((WACCParserVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return stat_sempred((StatContext)_localctx, predIndex);
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 7);
		case 2: return precpred(_ctx, 6);
		case 3: return precpred(_ctx, 5);
		case 4: return precpred(_ctx, 4);
		case 5: return precpred(_ctx, 3);
		case 6: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stat_sempred(StatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3R\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\6\3\6\3\6\7\6\u0092\n\6"+
		"\f\6\16\6\u0095\13\6\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\b\3\b\5\b\u00ae\n\b\3"+
		"\t\3\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\n\3\n\3\n\3\n\5\n\u00bc"+
		"\n\n\3\13\3\13\3\13\5\13\u00c1\n\13\3\f\3\f\3\r\3\r\5\r\u00c7\n\r\3\r"+
		"\3\r\6\r\u00cb\n\r\r\r\16\r\u00cc\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ea\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0104\n\20\f\20\16\20\u0107\13\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\6\36\u0128\n\36\r\36\16\36\u0129\3\37\3\37\3\37\3\37\7"+
		"\37\u0130\n\37\f\37\16\37\u0133\13\37\5\37\u0135\n\37\3\37\3\37\3 \3 "+
		"\3!\3!\3!\2\4\n\36\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\t\3\2 #\3\2\'+\3\2,.\4\2((//\3\2\62\65\3\2\678\3\2\60"+
		"\61\u014b\2B\3\2\2\2\4M\3\2\2\2\6X\3\2\2\2\b`\3\2\2\2\n\u008c\3\2\2\2"+
		"\f\u0099\3\2\2\2\16\u00ad\3\2\2\2\20\u00af\3\2\2\2\22\u00bb\3\2\2\2\24"+
		"\u00c0\3\2\2\2\26\u00c2\3\2\2\2\30\u00c6\3\2\2\2\32\u00ce\3\2\2\2\34\u00d8"+
		"\3\2\2\2\36\u00e9\3\2\2\2 \u0108\3\2\2\2\"\u010a\3\2\2\2$\u010c\3\2\2"+
		"\2&\u010e\3\2\2\2(\u0110\3\2\2\2*\u0112\3\2\2\2,\u0114\3\2\2\2.\u0116"+
		"\3\2\2\2\60\u0118\3\2\2\2\62\u011a\3\2\2\2\64\u011c\3\2\2\2\66\u011e\3"+
		"\2\2\28\u0120\3\2\2\2:\u0122\3\2\2\2<\u012b\3\2\2\2>\u0138\3\2\2\2@\u013a"+
		"\3\2\2\2BF\7\3\2\2CE\5\4\3\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"I\3\2\2\2HF\3\2\2\2IJ\5\n\6\2JK\7\4\2\2KL\7\2\2\3L\3\3\2\2\2MN\5\24\13"+
		"\2NO\5\62\32\2OQ\7\5\2\2PR\5\6\4\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\6"+
		"\2\2TU\7\t\2\2UV\5\n\6\2VW\7\4\2\2W\5\3\2\2\2X]\5\b\5\2YZ\7\n\2\2Z\\\5"+
		"\b\5\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2`"+
		"a\5\24\13\2ab\5.\30\2b\t\3\2\2\2cd\b\6\1\2d\u008d\7\16\2\2ef\5\24\13\2"+
		"fg\5.\30\2gh\7\66\2\2hi\5\16\b\2i\u008d\3\2\2\2jk\5\f\7\2kl\7\66\2\2l"+
		"m\5\16\b\2m\u008d\3\2\2\2no\7\17\2\2o\u008d\5\f\7\2pq\7\20\2\2q\u008d"+
		"\5\36\20\2rs\7\21\2\2s\u008d\5\36\20\2tu\7\22\2\2u\u008d\5\36\20\2vw\7"+
		"\23\2\2w\u008d\5\36\20\2xy\7\24\2\2y\u008d\5\36\20\2z{\7\25\2\2{|\5\36"+
		"\20\2|}\7\26\2\2}~\5\n\6\2~\177\7\27\2\2\177\u0080\5\n\6\2\u0080\u0081"+
		"\7\30\2\2\u0081\u008d\3\2\2\2\u0082\u0083\7\31\2\2\u0083\u0084\5\36\20"+
		"\2\u0084\u0085\7\32\2\2\u0085\u0086\5\n\6\2\u0086\u0087\7\33\2\2\u0087"+
		"\u008d\3\2\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\n\6\2\u008a\u008b\7\4"+
		"\2\2\u008b\u008d\3\2\2\2\u008cc\3\2\2\2\u008ce\3\2\2\2\u008cj\3\2\2\2"+
		"\u008cn\3\2\2\2\u008cp\3\2\2\2\u008cr\3\2\2\2\u008ct\3\2\2\2\u008cv\3"+
		"\2\2\2\u008cx\3\2\2\2\u008cz\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0088\3"+
		"\2\2\2\u008d\u0093\3\2\2\2\u008e\u008f\f\3\2\2\u008f\u0090\7\13\2\2\u0090"+
		"\u0092\5\n\6\4\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\13\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a"+
		"\5\60\31\2\u0097\u009a\5:\36\2\u0098\u009a\5\22\n\2\u0099\u0096\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\r\3\2\2\2\u009b\u00ae"+
		"\5\36\20\2\u009c\u00ae\5<\37\2\u009d\u009e\7\34\2\2\u009e\u009f\7\5\2"+
		"\2\u009f\u00a0\5\36\20\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\5\36\20\2\u00a2"+
		"\u00a3\7\6\2\2\u00a3\u00ae\3\2\2\2\u00a4\u00ae\5\22\n\2\u00a5\u00a6\7"+
		"\35\2\2\u00a6\u00a7\5\62\32\2\u00a7\u00a9\7\5\2\2\u00a8\u00aa\5\20\t\2"+
		"\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\6\2\2\u00ac\u00ae\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad\u009c\3\2\2\2\u00ad"+
		"\u009d\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ae\17\3\2\2"+
		"\2\u00af\u00b4\5\36\20\2\u00b0\u00b1\7\n\2\2\u00b1\u00b3\5\36\20\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\21\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00bc"+
		"\5\36\20\2\u00b9\u00ba\7\37\2\2\u00ba\u00bc\5\36\20\2\u00bb\u00b7\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\23\3\2\2\2\u00bd\u00c1\5\26\f\2\u00be\u00c1"+
		"\5\30\r\2\u00bf\u00c1\5\32\16\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1\25\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3\27\3"+
		"\2\2\2\u00c4\u00c7\5\26\f\2\u00c5\u00c7\5\32\16\2\u00c6\u00c4\3\2\2\2"+
		"\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c9\7\7\2\2\u00c9\u00cb"+
		"\7\b\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\31\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\7\5\2\2"+
		"\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5\34\17\2\u00d3"+
		"\u00d4\7\6\2\2\u00d4\33\3\2\2\2\u00d5\u00d9\5\26\f\2\u00d6\u00d9\5\30"+
		"\r\2\u00d7\u00d9\7$\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00db\b\20\1\2\u00db\u00dc\5 \21"+
		"\2\u00dc\u00dd\5\36\20\n\u00dd\u00ea\3\2\2\2\u00de\u00ea\5\64\33\2\u00df"+
		"\u00ea\5@!\2\u00e0\u00ea\58\35\2\u00e1\u00ea\5\66\34\2\u00e2\u00ea\5>"+
		" \2\u00e3\u00ea\5\60\31\2\u00e4\u00ea\5:\36\2\u00e5\u00e6\7\5\2\2\u00e6"+
		"\u00e7\5\36\20\2\u00e7\u00e8\7\6\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00da\3"+
		"\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e1\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e4\3\2"+
		"\2\2\u00e9\u00e5\3\2\2\2\u00ea\u0105\3\2\2\2\u00eb\u00ec\f\t\2\2\u00ec"+
		"\u00ed\5\"\22\2\u00ed\u00ee\5\36\20\n\u00ee\u0104\3\2\2\2\u00ef\u00f0"+
		"\f\b\2\2\u00f0\u00f1\5$\23\2\u00f1\u00f2\5\36\20\t\u00f2\u0104\3\2\2\2"+
		"\u00f3\u00f4\f\7\2\2\u00f4\u00f5\5&\24\2\u00f5\u00f6\5\36\20\b\u00f6\u0104"+
		"\3\2\2\2\u00f7\u00f8\f\6\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fa\5\36\20\7"+
		"\u00fa\u0104\3\2\2\2\u00fb\u00fc\f\5\2\2\u00fc\u00fd\5*\26\2\u00fd\u00fe"+
		"\5\36\20\6\u00fe\u0104\3\2\2\2\u00ff\u0100\f\4\2\2\u0100\u0101\5,\27\2"+
		"\u0101\u0102\5\36\20\5\u0102\u0104\3\2\2\2\u0103\u00eb\3\2\2\2\u0103\u00ef"+
		"\3\2\2\2\u0103\u00f3\3\2\2\2\u0103\u00f7\3\2\2\2\u0103\u00fb\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\37\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\3\2\2\u0109!\3"+
		"\2\2\2\u010a\u010b\t\4\2\2\u010b#\3\2\2\2\u010c\u010d\t\5\2\2\u010d%\3"+
		"\2\2\2\u010e\u010f\t\6\2\2\u010f\'\3\2\2\2\u0110\u0111\t\7\2\2\u0111)"+
		"\3\2\2\2\u0112\u0113\7&\2\2\u0113+\3\2\2\2\u0114\u0115\7%\2\2\u0115-\3"+
		"\2\2\2\u0116\u0117\79\2\2\u0117/\3\2\2\2\u0118\u0119\79\2\2\u0119\61\3"+
		"\2\2\2\u011a\u011b\79\2\2\u011b\63\3\2\2\2\u011c\u011d\7:\2\2\u011d\65"+
		"\3\2\2\2\u011e\u011f\7<\2\2\u011f\67\3\2\2\2\u0120\u0121\7;\2\2\u0121"+
		"9\3\2\2\2\u0122\u0127\5\60\31\2\u0123\u0124\7\7\2\2\u0124\u0125\5\36\20"+
		"\2\u0125\u0126\7\b\2\2\u0126\u0128\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a;\3\2\2\2\u012b"+
		"\u0134\7\7\2\2\u012c\u0131\5\36\20\2\u012d\u012e\7\n\2\2\u012e\u0130\5"+
		"\36\20\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u012c\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\b\2\2\u0137"+
		"=\3\2\2\2\u0138\u0139\7\r\2\2\u0139?\3\2\2\2\u013a\u013b\t\b\2\2\u013b"+
		"A\3\2\2\2\26FQ]\u008c\u0093\u0099\u00a9\u00ad\u00b4\u00bb\u00c0\u00c6"+
		"\u00cc\u00d8\u00e9\u0103\u0105\u0129\u0131\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}