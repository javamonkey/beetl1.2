// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g 2013-05-05 21:31:41

package org.bee.tl.core;
import org.bee.tl.core.exception.*;
import org.bee.tl.core.compile.*;




import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class BeeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR_DEFINE", "VAR_REFER", "ASSIGNMENT", "HOLDER", "TEXT_HOLDER", "FOR", "VAR_TEXT", "FM", "DEFAULT_FM", "SLIST", "IF", "EXP", "COND_EXP", "FUNCTION", "TEXT_PROCESS", "ATTR_NAME", "VIRTUAL_ATTR_NAME", "MAP_LIST_INDEX", "BREAK", "CONTINUE", "RETURN", "NOT", "SWITCH", "CASE", "DEFAULT", "G_SWITCH", "G_CASE", "G_DEFAULT", "G_CASE_EXPLIST", "JSON", "JSONARRAY", "JSONMAP", "JSONKEYVALUE", "CLASS_STATIC_FUNCTION", "CLASS_FUNCTION", "CLASS_METHOD", "VARIABLE_VAR_REFER", "TEXT_VAR_REFER", "MISSING_VARIABLE_VAR_REFER", "FUNCTION_FULL_NAME", "SAFE_OUTPUT", "DIRECT_CALL", "NEGATOM", "WHILE", "DIRECTIVE", "Identifier", "StringLiteral", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_TEXT_TOKEN", "RIGHT_TOKEN", "LEFT_TOKEN", "VAR", "OR", "AND", "EQUAL", "NOT_EQUAL", "LARGE", "LARGE_EQUAL", "LESS", "LESS_EQUAL", "ADD", "MINUS", "MULTIP", "DIV", "MOD", "BOOLEAN", "INT", "NULL", "DOUBLE", "ID_START", "Comment", "LineComment", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "DecimalLiteral", "HexIntegerLiteral", "NumericLiteral", "ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", "UnicodeDigit", "UnicodeConnectorPunctuation", "UnicodeCombiningMark", "WhiteSpace", "';'", "'go-switch'", "'('", "')'", "'case'", "','", "':'", "'default'", "'DIRECTIVE'", "'return'", "'continue'", "'break'", "'for'", "'in '", "'elsefor'", "'while'", "'if'", "'else'", "'!('", "'='", "'!'", "'.'", "'.~'", "'['", "']'", "'@'", "'switch'"
    };
    public static final int EOF=-1;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int VAR_DEFINE=4;
    public static final int VAR_REFER=5;
    public static final int ASSIGNMENT=6;
    public static final int HOLDER=7;
    public static final int TEXT_HOLDER=8;
    public static final int FOR=9;
    public static final int VAR_TEXT=10;
    public static final int FM=11;
    public static final int DEFAULT_FM=12;
    public static final int SLIST=13;
    public static final int IF=14;
    public static final int EXP=15;
    public static final int COND_EXP=16;
    public static final int FUNCTION=17;
    public static final int TEXT_PROCESS=18;
    public static final int ATTR_NAME=19;
    public static final int VIRTUAL_ATTR_NAME=20;
    public static final int MAP_LIST_INDEX=21;
    public static final int BREAK=22;
    public static final int CONTINUE=23;
    public static final int RETURN=24;
    public static final int NOT=25;
    public static final int SWITCH=26;
    public static final int CASE=27;
    public static final int DEFAULT=28;
    public static final int G_SWITCH=29;
    public static final int G_CASE=30;
    public static final int G_DEFAULT=31;
    public static final int G_CASE_EXPLIST=32;
    public static final int JSON=33;
    public static final int JSONARRAY=34;
    public static final int JSONMAP=35;
    public static final int JSONKEYVALUE=36;
    public static final int CLASS_STATIC_FUNCTION=37;
    public static final int CLASS_FUNCTION=38;
    public static final int CLASS_METHOD=39;
    public static final int VARIABLE_VAR_REFER=40;
    public static final int TEXT_VAR_REFER=41;
    public static final int MISSING_VARIABLE_VAR_REFER=42;
    public static final int FUNCTION_FULL_NAME=43;
    public static final int SAFE_OUTPUT=44;
    public static final int DIRECT_CALL=45;
    public static final int NEGATOM=46;
    public static final int WHILE=47;
    public static final int DIRECTIVE=48;
    public static final int Identifier=49;
    public static final int StringLiteral=50;
    public static final int LEFT_BRACE=51;
    public static final int RIGHT_BRACE=52;
    public static final int LEFT_TEXT_TOKEN=53;
    public static final int RIGHT_TOKEN=54;
    public static final int LEFT_TOKEN=55;
    public static final int VAR=56;
    public static final int OR=57;
    public static final int AND=58;
    public static final int EQUAL=59;
    public static final int NOT_EQUAL=60;
    public static final int LARGE=61;
    public static final int LARGE_EQUAL=62;
    public static final int LESS=63;
    public static final int LESS_EQUAL=64;
    public static final int ADD=65;
    public static final int MINUS=66;
    public static final int MULTIP=67;
    public static final int DIV=68;
    public static final int MOD=69;
    public static final int BOOLEAN=70;
    public static final int INT=71;
    public static final int NULL=72;
    public static final int DOUBLE=73;
    public static final int ID_START=74;
    public static final int Comment=75;
    public static final int LineComment=76;
    public static final int DoubleStringCharacter=77;
    public static final int SingleStringCharacter=78;
    public static final int EscapeSequence=79;
    public static final int CharacterEscapeSequence=80;
    public static final int HexEscapeSequence=81;
    public static final int UnicodeEscapeSequence=82;
    public static final int SingleEscapeCharacter=83;
    public static final int NonEscapeCharacter=84;
    public static final int EscapeCharacter=85;
    public static final int DecimalDigit=86;
    public static final int HexDigit=87;
    public static final int DecimalLiteral=88;
    public static final int HexIntegerLiteral=89;
    public static final int NumericLiteral=90;
    public static final int ExponentPart=91;
    public static final int IdentifierStart=92;
    public static final int IdentifierPart=93;
    public static final int UnicodeLetter=94;
    public static final int UnicodeDigit=95;
    public static final int UnicodeConnectorPunctuation=96;
    public static final int UnicodeCombiningMark=97;
    public static final int WhiteSpace=98;

    // delegates
    // delegators


        public BeeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BeeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[125+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BeeParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g"; }


    boolean isStrictMVC = false;
    CoreScriptRunner coreScritRunner = null;

    boolean openBackdoor = true;

    public void setStrictMVC(boolean isStrictMVC ){
       	this.isStrictMVC = isStrictMVC;
    }

    public void setCoreScriptRunner(CoreScriptRunner t){
        this.coreScritRunner = t ;
    }

    public boolean isTextProcessFunction(TokenStream input){
    	StringBuilder sb = new StringBuilder();
    	int i=1;
    	while(true){
    	   Token t = input.LT(i++);
    	   if (t == null)
    				return false;
    	   if(t.getText().equals("(")){
    	   		break;
    	   }
    	   sb.append(t.getText());
    	}
    	
    	return coreScritRunner.containTag(sb.toString());
    }
    public void setNativeCall(boolean canNativeCall ){
    	this.openBackdoor = canNativeCall;
    }
    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
    	throws RecognitionException
    {
    	throw new MismatchedTokenException(ttype, input);
    }
    public void emitErrorMessage(String msg) {
    	//	System.err.println(msg);
    	// do not display error ,instead of ErrorHndler
    }



    public static class prog_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:137:1: prog : ( statements )? EOF ;
    public final BeeParser.prog_return prog() throws RecognitionException {
        BeeParser.prog_return retval = new BeeParser.prog_return();
        retval.start = input.LT(1);
        int prog_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token EOF2=null;
        BeeParser.statements_return statements1 = null;


        BeeCommonNodeTree EOF2_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:137:6: ( ( statements )? EOF )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:137:8: ( statements )? EOF
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:137:8: ( statements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Identifier||LA1_0==LEFT_BRACE||LA1_0==LEFT_TEXT_TOKEN||(LA1_0>=LEFT_TOKEN && LA1_0<=VAR)||LA1_0==100||(LA1_0>=107 && LA1_0<=111)||(LA1_0>=114 && LA1_0<=115)||(LA1_0>=124 && LA1_0<=125)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_prog324);
                    statements1=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

                    }
                    break;

            }

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog327); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class statements_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:138:1: statements : ( statement )+ ;
    public final BeeParser.statements_return statements() throws RecognitionException {
        BeeParser.statements_return retval = new BeeParser.statements_return();
        retval.start = input.LT(1);
        int statements_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.statement_return statement3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:138:12: ( ( statement )+ )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:138:13: ( statement )+
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:138:13: ( statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==LEFT_BRACE||LA2_0==LEFT_TEXT_TOKEN||(LA2_0>=LEFT_TOKEN && LA2_0<=VAR)||LA2_0==100||(LA2_0>=107 && LA2_0<=111)||(LA2_0>=114 && LA2_0<=115)||(LA2_0>=124 && LA2_0<=125)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements335);
            	    statement3=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, statements_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statements"

    public static class statement_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:139:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive );
    public final BeeParser.statement_return statement() throws RecognitionException {
        BeeParser.statement_return retval = new BeeParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token char_literal20=null;
        Token char_literal24=null;
        BeeParser.constantsTextStatment_return constantsTextStatment4 = null;

        BeeParser.varDefine_return varDefine5 = null;

        BeeParser.assignMent_return assignMent7 = null;

        BeeParser.textStatment_return textStatment9 = null;

        BeeParser.ifStatment_return ifStatment10 = null;

        BeeParser.forStatment_return forStatment11 = null;

        BeeParser.whileStament_return whileStament12 = null;

        BeeParser.statmentBlock_return statmentBlock13 = null;

        BeeParser.messFunction_return messFunction14 = null;

        BeeParser.continueStatment_return continueStatment15 = null;

        BeeParser.breakStatment_return breakStatment17 = null;

        BeeParser.returnStatment_return returnStatment19 = null;

        BeeParser.switchStatment_return switchStatment21 = null;

        BeeParser.g_switchStatment_return g_switchStatment22 = null;

        BeeParser.nativeMethod_return nativeMethod23 = null;

        BeeParser.directive_return directive25 = null;


        BeeCommonNodeTree char_literal6_tree=null;
        BeeCommonNodeTree char_literal8_tree=null;
        BeeCommonNodeTree char_literal16_tree=null;
        BeeCommonNodeTree char_literal18_tree=null;
        BeeCommonNodeTree char_literal20_tree=null;
        BeeCommonNodeTree char_literal24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:140:2: ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive )
            int alt3=16;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:140:4: constantsTextStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_constantsTextStatment_in_statement344);
                    constantsTextStatment4=constantsTextStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantsTextStatment4.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:141:6: varDefine ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varDefine_in_statement351);
                    varDefine5=varDefine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDefine5.getTree());
                    char_literal6=(Token)match(input,99,FOLLOW_99_in_statement353); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:142:4: assignMent ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_assignMent_in_statement359);
                    assignMent7=assignMent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignMent7.getTree());
                    char_literal8=(Token)match(input,99,FOLLOW_99_in_statement361); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:143:4: textStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_textStatment_in_statement367);
                    textStatment9=textStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textStatment9.getTree());

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:144:4: ifStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatment_in_statement372);
                    ifStatment10=ifStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatment10.getTree());

                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:145:4: forStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatment_in_statement377);
                    forStatment11=forStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatment11.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:146:4: whileStament
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStament_in_statement382);
                    whileStament12=whileStament();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStament12.getTree());

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:147:4: statmentBlock
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_statmentBlock_in_statement387);
                    statmentBlock13=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statmentBlock13.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:148:4: messFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_messFunction_in_statement392);
                    messFunction14=messFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, messFunction14.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:149:4: continueStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatment_in_statement397);
                    continueStatment15=continueStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatment15.getTree());
                    char_literal16=(Token)match(input,99,FOLLOW_99_in_statement399); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:150:4: breakStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatment_in_statement405);
                    breakStatment17=breakStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatment17.getTree());
                    char_literal18=(Token)match(input,99,FOLLOW_99_in_statement407); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:151:4: returnStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatment_in_statement413);
                    returnStatment19=returnStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatment19.getTree());
                    char_literal20=(Token)match(input,99,FOLLOW_99_in_statement415); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:152:4: switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatment_in_statement421);
                    switchStatment21=switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatment21.getTree());

                    }
                    break;
                case 14 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:153:4: g_switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_g_switchStatment_in_statement426);
                    g_switchStatment22=g_switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switchStatment22.getTree());

                    }
                    break;
                case 15 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:154:4: nativeMethod[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_statement431);
                    nativeMethod23=nativeMethod(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod23.getTree());
                    char_literal24=(Token)match(input,99,FOLLOW_99_in_statement434); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:155:4: directive
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_directive_in_statement441);
                    directive25=directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, directive25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class g_switchStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_switchStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:159:1: g_switchStatment : a= 'go-switch' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}' -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? ) ;
    public final BeeParser.g_switchStatment_return g_switchStatment() throws RecognitionException {
        BeeParser.g_switchStatment_return retval = new BeeParser.g_switchStatment_return();
        retval.start = input.LT(1);
        int g_switchStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal26=null;
        Token char_literal27=null;
        Token char_literal28=null;
        Token char_literal31=null;
        BeeParser.exp_return base = null;

        BeeParser.g_caseStatment_return g_caseStatment29 = null;

        BeeParser.g_defaultStatment_return g_defaultStatment30 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal26_tree=null;
        BeeCommonNodeTree char_literal27_tree=null;
        BeeCommonNodeTree char_literal28_tree=null;
        BeeCommonNodeTree char_literal31_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_g_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule g_caseStatment");
        RewriteRuleSubtreeStream stream_g_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule g_defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:160:2: (a= 'go-switch' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}' -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:160:4: a= 'go-switch' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}'
            {
            a=(Token)match(input,100,FOLLOW_100_in_g_switchStatment456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:160:18: ( '(' base= exp ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==101) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:160:19: '(' base= exp ')'
                    {
                    char_literal26=(Token)match(input,101,FOLLOW_101_in_g_switchStatment459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(char_literal26);

                    pushFollow(FOLLOW_exp_in_g_switchStatment463);
                    base=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(base.getTree());
                    char_literal27=(Token)match(input,102,FOLLOW_102_in_g_switchStatment465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(char_literal27);


                    }
                    break;

            }

            char_literal28=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_g_switchStatment469); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal28);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:160:42: ( g_caseStatment )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==103) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: g_caseStatment
            	    {
            	    pushFollow(FOLLOW_g_caseStatment_in_g_switchStatment471);
            	    g_caseStatment29=g_caseStatment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_g_caseStatment.add(g_caseStatment29.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:160:58: ( g_defaultStatment )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==106) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: g_defaultStatment
                    {
                    pushFollow(FOLLOW_g_defaultStatment_in_g_switchStatment474);
                    g_defaultStatment30=g_defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_g_defaultStatment.add(g_defaultStatment30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_g_switchStatment477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal31);



            // AST REWRITE
            // elements: g_defaultStatment, base, g_caseStatment
            // token labels: 
            // rule labels: retval, base
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base",base!=null?base.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 161:3: -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:161:5: ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_SWITCH, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:161:20: ( $base)?
                if ( stream_base.hasNext() ) {
                    adaptor.addChild(root_1, stream_base.nextTree());

                }
                stream_base.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:161:27: ( g_caseStatment )*
                while ( stream_g_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_g_caseStatment.nextTree());

                }
                stream_g_caseStatment.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:161:43: ( g_defaultStatment )?
                if ( stream_g_defaultStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_g_defaultStatment.nextTree());

                }
                stream_g_defaultStatment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, g_switchStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_switchStatment"

    public static class g_caseStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_caseStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:163:1: g_caseStatment : a= 'case' exp ( ',' exp )* ':' statmentBlock -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statmentBlock ) ;
    public final BeeParser.g_caseStatment_return g_caseStatment() throws RecognitionException {
        BeeParser.g_caseStatment_return retval = new BeeParser.g_caseStatment_return();
        retval.start = input.LT(1);
        int g_caseStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal33=null;
        Token char_literal35=null;
        BeeParser.exp_return exp32 = null;

        BeeParser.exp_return exp34 = null;

        BeeParser.statmentBlock_return statmentBlock36 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal33_tree=null;
        BeeCommonNodeTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:164:2: (a= 'case' exp ( ',' exp )* ':' statmentBlock -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statmentBlock ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:164:4: a= 'case' exp ( ',' exp )* ':' statmentBlock
            {
            a=(Token)match(input,103,FOLLOW_103_in_g_caseStatment509); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(a);

            pushFollow(FOLLOW_exp_in_g_caseStatment511);
            exp32=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp32.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:164:17: ( ',' exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==104) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:164:18: ',' exp
            	    {
            	    char_literal33=(Token)match(input,104,FOLLOW_104_in_g_caseStatment514); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_104.add(char_literal33);

            	    pushFollow(FOLLOW_exp_in_g_caseStatment516);
            	    exp34=exp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exp.add(exp34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal35=(Token)match(input,105,FOLLOW_105_in_g_caseStatment520); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(char_literal35);

            pushFollow(FOLLOW_statmentBlock_in_g_caseStatment522);
            statmentBlock36=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock36.getTree());


            // AST REWRITE
            // elements: statmentBlock, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 164:46: -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statmentBlock )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:164:48: ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statmentBlock )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_CASE, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:164:61: ^( G_CASE_EXPLIST ( exp )+ )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_CASE_EXPLIST, "G_CASE_EXPLIST"), root_2);

                if ( !(stream_exp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, g_caseStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_caseStatment"

    public static class g_defaultStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "g_defaultStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:166:1: g_defaultStatment : a= 'default' ':' statmentBlock -> ^( G_DEFAULT[$a] statmentBlock ) ;
    public final BeeParser.g_defaultStatment_return g_defaultStatment() throws RecognitionException {
        BeeParser.g_defaultStatment_return retval = new BeeParser.g_defaultStatment_return();
        retval.start = input.LT(1);
        int g_defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal37=null;
        BeeParser.statmentBlock_return statmentBlock38 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:167:2: (a= 'default' ':' statmentBlock -> ^( G_DEFAULT[$a] statmentBlock ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:167:4: a= 'default' ':' statmentBlock
            {
            a=(Token)match(input,106,FOLLOW_106_in_g_defaultStatment548); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(a);

            char_literal37=(Token)match(input,105,FOLLOW_105_in_g_defaultStatment550); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(char_literal37);

            pushFollow(FOLLOW_statmentBlock_in_g_defaultStatment552);
            statmentBlock38=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock38.getTree());


            // AST REWRITE
            // elements: statmentBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 167:34: -> ^( G_DEFAULT[$a] statmentBlock )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:167:37: ^( G_DEFAULT[$a] statmentBlock )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_DEFAULT, a), root_1);

                adaptor.addChild(root_1, stream_statmentBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, g_defaultStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "g_defaultStatment"

    public static class directive_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:1: directive : 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) ;
    public final BeeParser.directive_return directive() throws RecognitionException {
        BeeParser.directive_return retval = new BeeParser.directive_return();
        retval.start = input.LT(1);
        int directive_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal39=null;
        Token Identifier40=null;
        Token StringLiteral41=null;
        Token char_literal42=null;

        BeeCommonNodeTree string_literal39_tree=null;
        BeeCommonNodeTree Identifier40_tree=null;
        BeeCommonNodeTree StringLiteral41_tree=null;
        BeeCommonNodeTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:10: ( 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:12: 'DIRECTIVE' Identifier ( StringLiteral )? ';'
            {
            string_literal39=(Token)match(input,107,FOLLOW_107_in_directive569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal39);

            Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_directive572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier40);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:36: ( StringLiteral )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==StringLiteral) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:37: StringLiteral
                    {
                    StringLiteral41=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_directive575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral41);


                    }
                    break;

            }

            char_literal42=(Token)match(input,99,FOLLOW_99_in_directive579); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal42);



            // AST REWRITE
            // elements: Identifier, StringLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 169:57: -> ^( DIRECTIVE Identifier ( StringLiteral )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:60: ^( DIRECTIVE Identifier ( StringLiteral )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECTIVE, "DIRECTIVE"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:169:83: ( StringLiteral )?
                if ( stream_StringLiteral.hasNext() ) {
                    adaptor.addChild(root_1, stream_StringLiteral.nextNode());

                }
                stream_StringLiteral.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, directive_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "directive"

    public static class returnStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:170:1: returnStatment : 'return' -> ^( RETURN ) ;
    public final BeeParser.returnStatment_return returnStatment() throws RecognitionException {
        BeeParser.returnStatment_return retval = new BeeParser.returnStatment_return();
        retval.start = input.LT(1);
        int returnStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal43=null;

        BeeCommonNodeTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:171:2: ( 'return' -> ^( RETURN ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:171:4: 'return'
            {
            string_literal43=(Token)match(input,108,FOLLOW_108_in_returnStatment600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(string_literal43);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 171:13: -> ^( RETURN )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:171:16: ^( RETURN )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(RETURN, "RETURN"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, returnStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnStatment"

    public static class continueStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:172:1: continueStatment : 'continue' -> ^( CONTINUE ) ;
    public final BeeParser.continueStatment_return continueStatment() throws RecognitionException {
        BeeParser.continueStatment_return retval = new BeeParser.continueStatment_return();
        retval.start = input.LT(1);
        int continueStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal44=null;

        BeeCommonNodeTree string_literal44_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:172:17: ( 'continue' -> ^( CONTINUE ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:172:19: 'continue'
            {
            string_literal44=(Token)match(input,109,FOLLOW_109_in_continueStatment613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal44);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 172:30: -> ^( CONTINUE )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:172:33: ^( CONTINUE )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CONTINUE, "CONTINUE"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, continueStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStatment"

    public static class breakStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:173:1: breakStatment : 'break' -> ^( BREAK ) ;
    public final BeeParser.breakStatment_return breakStatment() throws RecognitionException {
        BeeParser.breakStatment_return retval = new BeeParser.breakStatment_return();
        retval.start = input.LT(1);
        int breakStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal45=null;

        BeeCommonNodeTree string_literal45_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:173:15: ( 'break' -> ^( BREAK ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:173:17: 'break'
            {
            string_literal45=(Token)match(input,110,FOLLOW_110_in_breakStatment627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(string_literal45);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 173:25: -> ^( BREAK )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:173:28: ^( BREAK )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(BREAK, "BREAK"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, breakStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStatment"

    public static class messFunction_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messFunction"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:175:1: messFunction options {backtrack=false; } : ({...}? textProcessFunction | functionCall[true] ';' );
    public final BeeParser.messFunction_return messFunction() throws RecognitionException {
        BeeParser.messFunction_return retval = new BeeParser.messFunction_return();
        retval.start = input.LT(1);
        int messFunction_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal48=null;
        BeeParser.textProcessFunction_return textProcessFunction46 = null;

        BeeParser.functionCall_return functionCall47 = null;


        BeeCommonNodeTree char_literal48_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:178:2: ({...}? textProcessFunction | functionCall[true] ';' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Identifier) ) {
                int LA9_1 = input.LA(2);

                if ( ((isTextProcessFunction(input))) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:178:4: {...}? textProcessFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    if ( !((isTextProcessFunction(input))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "messFunction", "isTextProcessFunction(input)");
                    }
                    pushFollow(FOLLOW_textProcessFunction_in_messFunction654);
                    textProcessFunction46=textProcessFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textProcessFunction46.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:179:6: functionCall[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_messFunction661);
                    functionCall47=functionCall(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall47.getTree());
                    char_literal48=(Token)match(input,99,FOLLOW_99_in_messFunction664); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = (BeeCommonNodeTree)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, messFunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "messFunction"

    public static class textProcessFunction_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textProcessFunction"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:181:1: textProcessFunction : functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) ;
    public final BeeParser.textProcessFunction_return textProcessFunction() throws RecognitionException {
        BeeParser.textProcessFunction_return retval = new BeeParser.textProcessFunction_return();
        retval.start = input.LT(1);
        int textProcessFunction_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal51=null;
        Token char_literal53=null;
        BeeParser.functionFullName_return functionFullName49 = null;

        BeeParser.exp_return exp50 = null;

        BeeParser.exp_return exp52 = null;

        BeeParser.statmentBlock_return statmentBlock54 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal51_tree=null;
        BeeCommonNodeTree char_literal53_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:4: functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock
            {
            pushFollow(FOLLOW_functionFullName_in_textProcessFunction675);
            functionFullName49=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName49.getTree());
            a=(Token)match(input,101,FOLLOW_101_in_textProcessFunction679); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:27: ( exp ( ',' exp )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Identifier && LA11_0<=LEFT_BRACE)||(LA11_0>=ADD && LA11_0<=MINUS)||(LA11_0>=BOOLEAN && LA11_0<=DOUBLE)||LA11_0==101||LA11_0==119||LA11_0==122||LA11_0==124) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:28: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_textProcessFunction682);
                    exp50=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp50.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:32: ( ',' exp )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==104) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:33: ',' exp
                    	    {
                    	    char_literal51=(Token)match(input,104,FOLLOW_104_in_textProcessFunction685); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_104.add(char_literal51);

                    	    pushFollow(FOLLOW_exp_in_textProcessFunction687);
                    	    exp52=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp52.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal53=(Token)match(input,102,FOLLOW_102_in_textProcessFunction693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal53);

            pushFollow(FOLLOW_statmentBlock_in_textProcessFunction695);
            statmentBlock54=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock54.getTree());


            // AST REWRITE
            // elements: statmentBlock, exp, functionFullName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 183:63: -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:66: ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_PROCESS, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:183:116: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, textProcessFunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textProcessFunction"

    public static class functionCall_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:186:1: functionCall[boolean statmentCall] : functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) ;
    public final BeeParser.functionCall_return functionCall(boolean statmentCall) throws RecognitionException {
        BeeParser.functionCall_return retval = new BeeParser.functionCall_return();
        retval.start = input.LT(1);
        int functionCall_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal57=null;
        Token char_literal59=null;
        BeeParser.functionFullName_return functionFullName55 = null;

        BeeParser.exp_return exp56 = null;

        BeeParser.exp_return exp58 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal57_tree=null;
        BeeCommonNodeTree char_literal59_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:192:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:192:3: functionFullName a= '(' ( exp ( ',' exp )* )? ')'
            {
            pushFollow(FOLLOW_functionFullName_in_functionCall730);
            functionFullName55=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName55.getTree());
            a=(Token)match(input,101,FOLLOW_101_in_functionCall734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:192:26: ( exp ( ',' exp )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Identifier && LA13_0<=LEFT_BRACE)||(LA13_0>=ADD && LA13_0<=MINUS)||(LA13_0>=BOOLEAN && LA13_0<=DOUBLE)||LA13_0==101||LA13_0==119||LA13_0==122||LA13_0==124) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:192:27: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_functionCall737);
                    exp56=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp56.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:192:31: ( ',' exp )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==104) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:192:32: ',' exp
                    	    {
                    	    char_literal57=(Token)match(input,104,FOLLOW_104_in_functionCall740); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_104.add(char_literal57);

                    	    pushFollow(FOLLOW_exp_in_functionCall742);
                    	    exp58=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp58.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal59=(Token)match(input,102,FOLLOW_102_in_functionCall748); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal59);



            // AST REWRITE
            // elements: exp, functionFullName, functionFullName, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 193:3: -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:193:22: ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:193:36: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_2);

                adaptor.addChild(root_2, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:193:68: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 194:3: -> ^( FUNCTION[$a] functionFullName ( exp )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:194:6: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:194:38: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              		if(isStrictMVC){
              			throw new MVCStrictException(((Token)retval.start));			
              		}
              	
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, functionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class statmentBlock_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statmentBlock"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:198:1: statmentBlock : LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) ;
    public final BeeParser.statmentBlock_return statmentBlock() throws RecognitionException {
        BeeParser.statmentBlock_return retval = new BeeParser.statmentBlock_return();
        retval.start = input.LT(1);
        int statmentBlock_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_BRACE60=null;
        Token RIGHT_BRACE62=null;
        BeeParser.statements_return statements61 = null;


        BeeCommonNodeTree LEFT_BRACE60_tree=null;
        BeeCommonNodeTree RIGHT_BRACE62_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:199:2: ( LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:199:4: LEFT_BRACE ( statements )? RIGHT_BRACE
            {
            LEFT_BRACE60=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_statmentBlock797); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(LEFT_BRACE60);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:199:15: ( statements )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Identifier||LA14_0==LEFT_BRACE||LA14_0==LEFT_TEXT_TOKEN||(LA14_0>=LEFT_TOKEN && LA14_0<=VAR)||LA14_0==100||(LA14_0>=107 && LA14_0<=111)||(LA14_0>=114 && LA14_0<=115)||(LA14_0>=124 && LA14_0<=125)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_statmentBlock799);
                    statements61=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statements.add(statements61.getTree());

                    }
                    break;

            }

            RIGHT_BRACE62=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_statmentBlock802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(RIGHT_BRACE62);



            // AST REWRITE
            // elements: statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 199:39: -> ^( SLIST ( statements )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:199:42: ^( SLIST ( statements )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SLIST, "SLIST"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:199:50: ( statements )?
                if ( stream_statements.hasNext() ) {
                    adaptor.addChild(root_1, stream_statements.nextTree());

                }
                stream_statements.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, statmentBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statmentBlock"

    public static class forStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:200:1: forStatment : 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) ;
    public final BeeParser.forStatment_return forStatment() throws RecognitionException {
        BeeParser.forStatment_return retval = new BeeParser.forStatment_return();
        retval.start = input.LT(1);
        int forStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token string_literal63=null;
        Token char_literal64=null;
        Token string_literal65=null;
        Token char_literal66=null;
        Token string_literal67=null;
        BeeParser.exp_return aaa = null;

        BeeParser.statmentBlock_return c = null;

        BeeParser.statmentBlock_return d = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree string_literal63_tree=null;
        BeeCommonNodeTree char_literal64_tree=null;
        BeeCommonNodeTree string_literal65_tree=null;
        BeeCommonNodeTree char_literal66_tree=null;
        BeeCommonNodeTree string_literal67_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:201:2: ( 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:201:4: 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )?
            {
            string_literal63=(Token)match(input,111,FOLLOW_111_in_forStatment819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(string_literal63);

            char_literal64=(Token)match(input,101,FOLLOW_101_in_forStatment821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal64);

            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatment825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            string_literal65=(Token)match(input,112,FOLLOW_112_in_forStatment827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_112.add(string_literal65);

            pushFollow(FOLLOW_exp_in_forStatment832);
            aaa=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(aaa.getTree());
            char_literal66=(Token)match(input,102,FOLLOW_102_in_forStatment834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal66);

            pushFollow(FOLLOW_statmentBlock_in_forStatment841);
            c=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(c.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:201:66: ( 'elsefor' d= statmentBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==113) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:201:67: 'elsefor' d= statmentBlock
                    {
                    string_literal67=(Token)match(input,113,FOLLOW_113_in_forStatment845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal67);

                    pushFollow(FOLLOW_statmentBlock_in_forStatment849);
                    d=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(d.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: c, aaa, a, d
            // token labels: a
            // rule labels: retval, d, aaa, c
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);
            RewriteRuleSubtreeStream stream_aaa=new RewriteRuleSubtreeStream(adaptor,"rule aaa",aaa!=null?aaa.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 202:3: -> ^( FOR $a $aaa $c ( $d)? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:202:6: ^( FOR $a $aaa $c ( $d)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                adaptor.addChild(root_1, stream_aaa.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:202:24: ( $d)?
                if ( stream_d.hasNext() ) {
                    adaptor.addChild(root_1, stream_d.nextTree());

                }
                stream_d.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, forStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forStatment"

    public static class whileStament_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStament"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:203:1: whileStament : 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) ;
    public final BeeParser.whileStament_return whileStament() throws RecognitionException {
        BeeParser.whileStament_return retval = new BeeParser.whileStament_return();
        retval.start = input.LT(1);
        int whileStament_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal68=null;
        Token char_literal69=null;
        Token char_literal70=null;
        BeeParser.condExp_return a = null;

        BeeParser.statmentBlock_return statmentBlock71 = null;


        BeeCommonNodeTree string_literal68_tree=null;
        BeeCommonNodeTree char_literal69_tree=null;
        BeeCommonNodeTree char_literal70_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:204:2: ( 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:204:4: 'while' '(' a= condExp ')' statmentBlock
            {
            string_literal68=(Token)match(input,114,FOLLOW_114_in_whileStament884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_114.add(string_literal68);

            char_literal69=(Token)match(input,101,FOLLOW_101_in_whileStament886); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal69);

            pushFollow(FOLLOW_condExp_in_whileStament890);
            a=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(a.getTree());
            char_literal70=(Token)match(input,102,FOLLOW_102_in_whileStament892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal70);

            pushFollow(FOLLOW_statmentBlock_in_whileStament895);
            statmentBlock71=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock71.getTree());


            // AST REWRITE
            // elements: a, statmentBlock
            // token labels: 
            // rule labels: retval, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 204:45: -> ^( WHILE $a statmentBlock )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:204:48: ^( WHILE $a statmentBlock )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(WHILE, "WHILE"), root_1);

                adaptor.addChild(root_1, stream_a.nextTree());
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, whileStament_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileStament"

    public static class ifStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:206:1: ifStatment : 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) ;
    public final BeeParser.ifStatment_return ifStatment() throws RecognitionException {
        BeeParser.ifStatment_return retval = new BeeParser.ifStatment_return();
        retval.start = input.LT(1);
        int ifStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token string_literal76=null;
        BeeParser.statement_return l = null;

        BeeParser.statement_return n = null;

        BeeParser.condExp_return condExp74 = null;


        BeeCommonNodeTree string_literal72_tree=null;
        BeeCommonNodeTree char_literal73_tree=null;
        BeeCommonNodeTree char_literal75_tree=null;
        BeeCommonNodeTree string_literal76_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:2: ( 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:4: 'if' '(' condExp ')' l= statement ( 'else' n= statement )?
            {
            string_literal72=(Token)match(input,115,FOLLOW_115_in_ifStatment916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(string_literal72);

            char_literal73=(Token)match(input,101,FOLLOW_101_in_ifStatment918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal73);

            pushFollow(FOLLOW_condExp_in_ifStatment920);
            condExp74=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(condExp74.getTree());
            char_literal75=(Token)match(input,102,FOLLOW_102_in_ifStatment922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal75);

            pushFollow(FOLLOW_statement_in_ifStatment926);
            l=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(l.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:37: ( 'else' n= statement )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==116) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred29_Bee()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:38: 'else' n= statement
                    {
                    string_literal76=(Token)match(input,116,FOLLOW_116_in_ifStatment929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(string_literal76);

                    pushFollow(FOLLOW_statement_in_ifStatment933);
                    n=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(n.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: condExp, n, l
            // token labels: 
            // rule labels: retval, n, l
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.tree:null);
            RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 207:61: -> ^( IF condExp $l ( $n)? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:63: ^( IF condExp $l ( $n)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_condExp.nextTree());
                adaptor.addChild(root_1, stream_l.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:79: ( $n)?
                if ( stream_n.hasNext() ) {
                    adaptor.addChild(root_1, stream_n.nextTree());

                }
                stream_n.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, ifStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatment"

    public static class constantsTextStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantsTextStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:209:1: constantsTextStatment : LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) ;
    public final BeeParser.constantsTextStatment_return constantsTextStatment() throws RecognitionException {
        BeeParser.constantsTextStatment_return retval = new BeeParser.constantsTextStatment_return();
        retval.start = input.LT(1);
        int constantsTextStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_TEXT_TOKEN77=null;
        Token Identifier78=null;
        Token RIGHT_TOKEN79=null;

        BeeCommonNodeTree LEFT_TEXT_TOKEN77_tree=null;
        BeeCommonNodeTree Identifier78_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN79_tree=null;
        RewriteRuleTokenStream stream_LEFT_TEXT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TEXT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:210:2: ( LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:210:4: LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN
            {
            LEFT_TEXT_TOKEN77=(Token)match(input,LEFT_TEXT_TOKEN,FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment963); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_TEXT_TOKEN.add(LEFT_TEXT_TOKEN77);

            Identifier78=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantsTextStatment966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier78);

            RIGHT_TOKEN79=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_constantsTextStatment968); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN79);



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 210:46: -> ^( TEXT_HOLDER Identifier )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:210:48: ^( TEXT_HOLDER Identifier )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_HOLDER, "TEXT_HOLDER"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, constantsTextStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constantsTextStatment"

    public static class textStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:212:1: textStatment : ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) );
    public final BeeParser.textStatment_return textStatment() throws RecognitionException {
        BeeParser.textStatment_return retval = new BeeParser.textStatment_return();
        retval.start = input.LT(1);
        int textStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_TOKEN80=null;
        Token RIGHT_TOKEN82=null;
        Token LEFT_TOKEN83=null;
        Token string_literal84=null;
        Token char_literal86=null;
        Token RIGHT_TOKEN87=null;
        BeeParser.textVar_return textVar81 = null;

        BeeParser.textVar_return textVar85 = null;


        BeeCommonNodeTree LEFT_TOKEN80_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN82_tree=null;
        BeeCommonNodeTree LEFT_TOKEN83_tree=null;
        BeeCommonNodeTree string_literal84_tree=null;
        BeeCommonNodeTree char_literal86_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN87_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_LEFT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_textVar=new RewriteRuleSubtreeStream(adaptor,"rule textVar");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:213:2: ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LEFT_TOKEN) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==117) ) {
                    alt17=2;
                }
                else if ( ((LA17_1>=Identifier && LA17_1<=LEFT_BRACE)||(LA17_1>=ADD && LA17_1<=MINUS)||(LA17_1>=BOOLEAN && LA17_1<=DOUBLE)||LA17_1==101||LA17_1==119||LA17_1==122||LA17_1==124) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:214:6: LEFT_TOKEN textVar RIGHT_TOKEN
                    {
                    LEFT_TOKEN80=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment998); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN80);

                    pushFollow(FOLLOW_textVar_in_textStatment1000);
                    textVar81=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar81.getTree());
                    RIGHT_TOKEN82=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment1002); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN82);



                    // AST REWRITE
                    // elements: textVar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 214:37: -> ^( HOLDER textVar )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:214:40: ^( HOLDER textVar )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(HOLDER, "HOLDER"), root_1);

                        adaptor.addChild(root_1, stream_textVar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:215:4: LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN
                    {
                    LEFT_TOKEN83=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment1015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN83);

                    string_literal84=(Token)match(input,117,FOLLOW_117_in_textStatment1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal84);

                    pushFollow(FOLLOW_textVar_in_textStatment1019);
                    textVar85=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar85.getTree());
                    char_literal86=(Token)match(input,102,FOLLOW_102_in_textStatment1021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(char_literal86);

                    RIGHT_TOKEN87=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment1022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN87);



                    // AST REWRITE
                    // elements: textVar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 215:43: -> ^( HOLDER textVar SAFE_OUTPUT )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:215:46: ^( HOLDER textVar SAFE_OUTPUT )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(HOLDER, "HOLDER"), root_1);

                        adaptor.addChild(root_1, stream_textVar.nextTree());
                        adaptor.addChild(root_1, (BeeCommonNodeTree)adaptor.create(SAFE_OUTPUT, "SAFE_OUTPUT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, textStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textStatment"

    public static class textVar_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textVar"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:217:1: textVar : b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) ;
    public final BeeParser.textVar_return textVar() throws RecognitionException {
        BeeParser.textVar_return retval = new BeeParser.textVar_return();
        retval.start = input.LT(1);
        int textVar_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal88=null;
        BeeParser.exp_return b = null;

        BeeParser.textformat_return textformat89 = null;


        BeeCommonNodeTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_textformat=new RewriteRuleSubtreeStream(adaptor,"rule textformat");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:218:1: (b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:218:3: b= exp ( ',' textformat )?
            {
            pushFollow(FOLLOW_exp_in_textVar1043);
            b=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(b.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:218:10: ( ',' textformat )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==104) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:218:11: ',' textformat
                    {
                    char_literal88=(Token)match(input,104,FOLLOW_104_in_textVar1047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(char_literal88);

                    pushFollow(FOLLOW_textformat_in_textVar1049);
                    textformat89=textformat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textformat.add(textformat89.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: b, textformat
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 218:30: -> ^( VAR_TEXT $b ( textformat )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:218:33: ^( VAR_TEXT $b ( textformat )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_TEXT, "VAR_TEXT"), root_1);

                adaptor.addChild(root_1, stream_b.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:218:47: ( textformat )?
                if ( stream_textformat.hasNext() ) {
                    adaptor.addChild(root_1, stream_textformat.nextTree());

                }
                stream_textformat.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, textVar_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textVar"

    public static class textformat_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textformat"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:220:1: textformat : (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) );
    public final BeeParser.textformat_return textformat() throws RecognitionException {
        BeeParser.textformat_return retval = new BeeParser.textformat_return();
        retval.start = input.LT(1);
        int textformat_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal90=null;
        Token StringLiteral91=null;
        Token StringLiteral92=null;
        BeeParser.functionFullName_return fm = null;


        BeeCommonNodeTree char_literal90_tree=null;
        BeeCommonNodeTree StringLiteral91_tree=null;
        BeeCommonNodeTree StringLiteral92_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:220:11: (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Identifier) ) {
                alt20=1;
            }
            else if ( (LA20_0==StringLiteral) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:221:1: fm= functionFullName ( '=' StringLiteral )?
                    {
                    pushFollow(FOLLOW_functionFullName_in_textformat1076);
                    fm=functionFullName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionFullName.add(fm.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:221:21: ( '=' StringLiteral )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==118) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:221:22: '=' StringLiteral
                            {
                            char_literal90=(Token)match(input,118,FOLLOW_118_in_textformat1079); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_118.add(char_literal90);

                            StringLiteral91=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat1081); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral91);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: StringLiteral, fm
                    // token labels: 
                    // rule labels: retval, fm
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_fm=new RewriteRuleSubtreeStream(adaptor,"rule fm",fm!=null?fm.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 221:42: -> ^( FM $fm ( StringLiteral )? )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:221:45: ^( FM $fm ( StringLiteral )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FM, "FM"), root_1);

                        adaptor.addChild(root_1, stream_fm.nextTree());
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:221:54: ( StringLiteral )?
                        if ( stream_StringLiteral.hasNext() ) {
                            adaptor.addChild(root_1, stream_StringLiteral.nextNode());

                        }
                        stream_StringLiteral.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:222:3: StringLiteral
                    {
                    StringLiteral92=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat1100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral92);



                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 222:17: -> ^( DEFAULT_FM StringLiteral )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:222:20: ^( DEFAULT_FM StringLiteral )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DEFAULT_FM, "DEFAULT_FM"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, textformat_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textformat"

    public static class varDefine_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDefine"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:224:1: varDefine : a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ ;
    public final BeeParser.varDefine_return varDefine() throws RecognitionException {
        BeeParser.varDefine_return retval = new BeeParser.varDefine_return();
        retval.start = input.LT(1);
        int varDefine_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal94=null;
        BeeParser.varAssignMent_return varAssignMent93 = null;

        BeeParser.varAssignMent_return varAssignMent95 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_varAssignMent=new RewriteRuleSubtreeStream(adaptor,"rule varAssignMent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:226:2: (a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:226:4: a= VAR varAssignMent ( ',' varAssignMent )*
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_varDefine1123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(a);

            if ( state.backtracking==0 ) {
              if(isStrictMVC)	throw new MVCStrictException(a);
            }
            pushFollow(FOLLOW_varAssignMent_in_varDefine1126);
            varAssignMent93=varAssignMent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent93.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:226:75: ( ',' varAssignMent )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==104) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:226:76: ',' varAssignMent
            	    {
            	    char_literal94=(Token)match(input,104,FOLLOW_104_in_varDefine1129); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_104.add(char_literal94);

            	    pushFollow(FOLLOW_varAssignMent_in_varDefine1131);
            	    varAssignMent95=varAssignMent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent95.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);



            // AST REWRITE
            // elements: varAssignMent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 226:96: -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+
            {
                if ( !(stream_varAssignMent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varAssignMent.hasNext() ) {
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:226:98: ^( VAR_DEFINE[$a] varAssignMent )
                    {
                    BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                    root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_DEFINE, a), root_1);

                    adaptor.addChild(root_1, stream_varAssignMent.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_varAssignMent.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, varDefine_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDefine"

    public static class varAssignMent_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAssignMent"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:229:1: varAssignMent : (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) );
    public final BeeParser.varAssignMent_return varAssignMent() throws RecognitionException {
        BeeParser.varAssignMent_return retval = new BeeParser.varAssignMent_return();
        retval.start = input.LT(1);
        int varAssignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier96=null;
        Token char_literal97=null;
        Token Identifier99=null;
        Token char_literal100=null;
        BeeParser.exp_return exp98 = null;

        BeeParser.statmentBlock_return statmentBlock101 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier96_tree=null;
        BeeCommonNodeTree char_literal97_tree=null;
        BeeCommonNodeTree Identifier99_tree=null;
        BeeCommonNodeTree char_literal100_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:230:2: (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==118) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>=Identifier && LA22_2<=StringLiteral)||(LA22_2>=ADD && LA22_2<=MINUS)||(LA22_2>=BOOLEAN && LA22_2<=DOUBLE)||LA22_2==101||LA22_2==119||LA22_2==122||LA22_2==124) ) {
                        alt22=2;
                    }
                    else if ( (LA22_2==LEFT_BRACE) ) {
                        switch ( input.LA(4) ) {
                        case StringLiteral:
                            {
                            alt22=2;
                            }
                            break;
                        case Identifier:
                            {
                            int LA22_6 = input.LA(5);

                            if ( (LA22_6==105) ) {
                                alt22=2;
                            }
                            else if ( (LA22_6==101||LA22_6==118||LA22_6==120) ) {
                                alt22=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RIGHT_BRACE:
                            {
                            int LA22_7 = input.LA(5);

                            if ( (synpred36_Bee()) ) {
                                alt22=2;
                            }
                            else if ( (true) ) {
                                alt22=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 7, input);

                                throw nvae;
                            }
                            }
                            break;
                        case LEFT_BRACE:
                        case LEFT_TEXT_TOKEN:
                        case LEFT_TOKEN:
                        case VAR:
                        case 100:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 114:
                        case 115:
                        case 124:
                        case 125:
                            {
                            alt22=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_1==EOF||LA22_1==99||LA22_1==104) ) {
                    alt22=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:230:4: a= Identifier
                    {
                    a=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(a);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 230:19: -> ^( ASSIGNMENT[$a] Identifier NULL )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:230:22: ^( ASSIGNMENT[$a] Identifier NULL )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, a), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, (BeeCommonNodeTree)adaptor.create(NULL, "NULL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:231:4: Identifier '=' exp
                    {
                    Identifier96=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier96);

                    char_literal97=(Token)match(input,118,FOLLOW_118_in_varAssignMent1182); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal97);

                    pushFollow(FOLLOW_exp_in_varAssignMent1184);
                    exp98=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp98.getTree());


                    // AST REWRITE
                    // elements: exp, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 231:23: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:231:26: ^( ASSIGNMENT[$Identifier] Identifier exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier96), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:232:4: Identifier '=' statmentBlock
                    {
                    Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier99);

                    char_literal100=(Token)match(input,118,FOLLOW_118_in_varAssignMent1204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal100);

                    pushFollow(FOLLOW_statmentBlock_in_varAssignMent1206);
                    statmentBlock101=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock101.getTree());


                    // AST REWRITE
                    // elements: statmentBlock, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 232:34: -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:232:39: ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier99), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, stream_statmentBlock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, varAssignMent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAssignMent"

    public static class assignMent_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignMent"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:234:1: assignMent : Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) ;
    public final BeeParser.assignMent_return assignMent() throws RecognitionException {
        BeeParser.assignMent_return retval = new BeeParser.assignMent_return();
        retval.start = input.LT(1);
        int assignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier102=null;
        Token char_literal103=null;
        BeeParser.exp_return exp104 = null;


        BeeCommonNodeTree Identifier102_tree=null;
        BeeCommonNodeTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:235:2: ( Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:235:4: Identifier '=' exp
            {
            Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignMent1230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier102);

            char_literal103=(Token)match(input,118,FOLLOW_118_in_assignMent1232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(char_literal103);

            pushFollow(FOLLOW_exp_in_assignMent1235);
            exp104=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp104.getTree());


            // AST REWRITE
            // elements: Identifier, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 235:25: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:235:28: ^( ASSIGNMENT[$Identifier] Identifier exp )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier102), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, assignMent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignMent"

    public static class varRef_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varRef"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:237:1: varRef : ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) );
    public final BeeParser.varRef_return varRef() throws RecognitionException {
        BeeParser.varRef_return retval = new BeeParser.varRef_return();
        retval.start = input.LT(1);
        int varRef_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier105=null;
        Token Identifier106=null;
        BeeParser.varAttribute_return varAttribute107 = null;

        BeeParser.safeOutput_return safeOutput108 = null;


        BeeCommonNodeTree Identifier105_tree=null;
        BeeCommonNodeTree Identifier106_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_varAttribute=new RewriteRuleSubtreeStream(adaptor,"rule varAttribute");
        RewriteRuleSubtreeStream stream_safeOutput=new RewriteRuleSubtreeStream(adaptor,"rule safeOutput");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:237:8: ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Identifier) ) {
                int LA25_1 = input.LA(2);

                if ( ((synpred37_Bee()&&(input.LT(1).getText().startsWith("__V")))) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:237:10: {...}? Identifier
                    {
                    if ( !((input.LT(1).getText().startsWith("__V"))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "varRef", "input.LT(1).getText().startsWith(\"__V\")");
                    }
                    Identifier105=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier105);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 237:66: -> ^( TEXT_VAR_REFER[$Identifier] Identifier )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:237:69: ^( TEXT_VAR_REFER[$Identifier] Identifier )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_VAR_REFER, Identifier105), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:6: Identifier ( varAttribute )* ( safeOutput )?
                    {
                    Identifier106=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier106);

                    if ( state.backtracking==0 ) {
                      if(Identifier106.getText().startsWith("__"))throw new RuntimeException("Can Not call this Variable star with __"); 
                    }
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:132: ( varAttribute )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=120 && LA23_0<=122)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:134: varAttribute
                    	    {
                    	    pushFollow(FOLLOW_varAttribute_in_varRef1282);
                    	    varAttribute107=varAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_varAttribute.add(varAttribute107.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:149: ( safeOutput )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==119) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: safeOutput
                            {
                            pushFollow(FOLLOW_safeOutput_in_varRef1286);
                            safeOutput108=safeOutput();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_safeOutput.add(safeOutput108.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: safeOutput, varAttribute, Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 238:163: -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:166: ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_REFER, Identifier106), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:202: ( varAttribute )*
                        while ( stream_varAttribute.hasNext() ) {
                            adaptor.addChild(root_1, stream_varAttribute.nextTree());

                        }
                        stream_varAttribute.reset();
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:238:218: ( safeOutput )?
                        if ( stream_safeOutput.hasNext() ) {
                            adaptor.addChild(root_1, stream_safeOutput.nextTree());

                        }
                        stream_safeOutput.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, varRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varRef"

    public static class safeOutput_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeOutput"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:241:1: safeOutput : '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) ;
    public final BeeParser.safeOutput_return safeOutput() throws RecognitionException {
        BeeParser.safeOutput_return retval = new BeeParser.safeOutput_return();
        retval.start = input.LT(1);
        int safeOutput_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal109=null;
        BeeParser.atom_return b = null;


        BeeCommonNodeTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:242:2: ( '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:242:4: '!' (b= atom )?
            {
            char_literal109=(Token)match(input,119,FOLLOW_119_in_safeOutput1318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal109);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:242:9: (b= atom )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=Identifier && LA26_0<=LEFT_BRACE)||(LA26_0>=BOOLEAN && LA26_0<=DOUBLE)||LA26_0==101||LA26_0==122||LA26_0==124) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: b= atom
                    {
                    pushFollow(FOLLOW_atom_in_safeOutput1322);
                    b=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(b.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: b
            // token labels: 
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 242:16: -> ^( SAFE_OUTPUT ( $b)? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:242:19: ^( SAFE_OUTPUT ( $b)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SAFE_OUTPUT, "SAFE_OUTPUT"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:242:33: ( $b)?
                if ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextTree());

                }
                stream_b.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, safeOutput_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeOutput"

    public static class varAttribute_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAttribute"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:245:1: varAttribute : ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) );
    public final BeeParser.varAttribute_return varAttribute() throws RecognitionException {
        BeeParser.varAttribute_return retval = new BeeParser.varAttribute_return();
        retval.start = input.LT(1);
        int varAttribute_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal110=null;
        Token Identifier111=null;
        Token string_literal112=null;
        Token Identifier113=null;
        Token char_literal115=null;
        BeeParser.exp_return exp114 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal110_tree=null;
        BeeCommonNodeTree Identifier111_tree=null;
        BeeCommonNodeTree string_literal112_tree=null;
        BeeCommonNodeTree Identifier113_tree=null;
        BeeCommonNodeTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:246:2: ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt27=1;
                }
                break;
            case 121:
                {
                alt27=2;
                }
                break;
            case 122:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:246:4: '.' Identifier
                    {
                    char_literal110=(Token)match(input,120,FOLLOW_120_in_varAttribute1345); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(char_literal110);

                    Identifier111=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier111);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 246:19: -> ^( ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:246:22: ^( ATTR_NAME Identifier )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ATTR_NAME, "ATTR_NAME"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:247:4: '.~' Identifier
                    {
                    string_literal112=(Token)match(input,121,FOLLOW_121_in_varAttribute1361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal112);

                    Identifier113=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier113);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 247:21: -> ^( VIRTUAL_ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:247:24: ^( VIRTUAL_ATTR_NAME Identifier )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VIRTUAL_ATTR_NAME, "VIRTUAL_ATTR_NAME"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:248:4: a= '[' exp ']'
                    {
                    a=(Token)match(input,122,FOLLOW_122_in_varAttribute1380); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(a);

                    pushFollow(FOLLOW_exp_in_varAttribute1382);
                    exp114=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp114.getTree());
                    char_literal115=(Token)match(input,123,FOLLOW_123_in_varAttribute1384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal115);



                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 248:18: -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:248:20: ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(MAP_LIST_INDEX, a, "[]"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, varAttribute_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAttribute"

    public static class exp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:251:1: exp : condExp ;
    public final BeeParser.exp_return exp() throws RecognitionException {
        BeeParser.exp_return retval = new BeeParser.exp_return();
        retval.start = input.LT(1);
        int exp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.condExp_return condExp116 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:251:5: ( condExp )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:251:8: condExp
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExp_in_exp1405);
            condExp116=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExp116.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, exp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exp"

    public static class condExp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExp"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:254:1: condExp : conditionalOrExpression ;
    public final BeeParser.condExp_return condExp() throws RecognitionException {
        BeeParser.condExp_return retval = new BeeParser.condExp_return();
        retval.start = input.LT(1);
        int condExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.conditionalOrExpression_return conditionalOrExpression117 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:254:9: ( conditionalOrExpression )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:254:11: conditionalOrExpression
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_condExp1416);
            conditionalOrExpression117=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression117.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, condExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExp"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:256:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
    public final BeeParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        BeeParser.conditionalOrExpression_return retval = new BeeParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token OR119=null;
        BeeParser.conditionalAndExpression_return conditionalAndExpression118 = null;

        BeeParser.conditionalAndExpression_return conditionalAndExpression120 = null;


        BeeCommonNodeTree OR119_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:257:5: ( conditionalAndExpression ( OR conditionalAndExpression )* )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:257:9: conditionalAndExpression ( OR conditionalAndExpression )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1434);
            conditionalAndExpression118=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression118.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:258:9: ( OR conditionalAndExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:258:10: OR conditionalAndExpression
            	    {
            	    OR119=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression1445); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR119_tree = (BeeCommonNodeTree)adaptor.create(OR119);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(OR119_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1448);
            	    conditionalAndExpression120=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression120.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, conditionalOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:262:1: conditionalAndExpression : condExpNotItem ( AND condExpNotItem )* ;
    public final BeeParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        BeeParser.conditionalAndExpression_return retval = new BeeParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token AND122=null;
        BeeParser.condExpNotItem_return condExpNotItem121 = null;

        BeeParser.condExpNotItem_return condExpNotItem123 = null;


        BeeCommonNodeTree AND122_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:263:5: ( condExpNotItem ( AND condExpNotItem )* )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:263:9: condExpNotItem ( AND condExpNotItem )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1479);
            condExpNotItem121=condExpNotItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem121.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:264:9: ( AND condExpNotItem )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:264:10: AND condExpNotItem
            	    {
            	    AND122=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression1490); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND122_tree = (BeeCommonNodeTree)adaptor.create(AND122);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(AND122_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1493);
            	    condExpNotItem123=condExpNotItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem123.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, conditionalAndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class condExpNotItem_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpNotItem"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:267:1: condExpNotItem : ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) );
    public final BeeParser.condExpNotItem_return condExpNotItem() throws RecognitionException {
        BeeParser.condExpNotItem_return retval = new BeeParser.condExpNotItem_return();
        retval.start = input.LT(1);
        int condExpNotItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal125=null;
        BeeParser.condExpItem_return condExpItem124 = null;

        BeeParser.condExpItem_return condExpItem126 = null;


        BeeCommonNodeTree char_literal125_tree=null;
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_condExpItem=new RewriteRuleSubtreeStream(adaptor,"rule condExpItem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:268:2: ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=Identifier && LA30_0<=LEFT_BRACE)||(LA30_0>=ADD && LA30_0<=MINUS)||(LA30_0>=BOOLEAN && LA30_0<=DOUBLE)||LA30_0==101||LA30_0==122||LA30_0==124) ) {
                alt30=1;
            }
            else if ( (LA30_0==119) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:268:4: condExpItem
                    {
                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1518);
                    condExpItem124=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem124.getTree());


                    // AST REWRITE
                    // elements: condExpItem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 268:16: -> condExpItem
                    {
                        adaptor.addChild(root_0, stream_condExpItem.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:269:4: ( '!' ) condExpItem
                    {
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:269:4: ( '!' )
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:269:5: '!'
                    {
                    char_literal125=(Token)match(input,119,FOLLOW_119_in_condExpNotItem1527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(char_literal125);


                    }

                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1530);
                    condExpItem126=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem126.getTree());


                    // AST REWRITE
                    // elements: condExpItem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 269:22: -> ^( NOT condExpItem )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:269:25: ^( NOT condExpItem )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(NOT, "NOT"), root_1);

                        adaptor.addChild(root_1, stream_condExpItem.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, condExpNotItem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExpNotItem"

    public static class condExpItem_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpItem"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:270:1: condExpItem : aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? ;
    public final BeeParser.condExpItem_return condExpItem() throws RecognitionException {
        BeeParser.condExpItem_return retval = new BeeParser.condExpItem_return();
        retval.start = input.LT(1);
        int condExpItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.aexpr_return l = null;

        BeeParser.aexpr_return aexpr127 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:2: ( aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:6: aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpItem1549);
            aexpr127=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr127.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:12: ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=EQUAL && LA32_0<=LESS_EQUAL)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr
                    {
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL )
                    int alt31=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt31=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt31=2;
                        }
                        break;
                    case LARGE:
                        {
                        alt31=3;
                        }
                        break;
                    case LARGE_EQUAL:
                        {
                        alt31=4;
                        }
                        break;
                    case LESS:
                        {
                        alt31=5;
                        }
                        break;
                    case LESS_EQUAL:
                        {
                        alt31=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:15: a= EQUAL
                            {
                            a=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_condExpItem1556); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:24: a= NOT_EQUAL
                            {
                            a=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_condExpItem1561); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:37: a= LARGE
                            {
                            a=(Token)match(input,LARGE,FOLLOW_LARGE_in_condExpItem1566); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:46: a= LARGE_EQUAL
                            {
                            a=(Token)match(input,LARGE_EQUAL,FOLLOW_LARGE_EQUAL_in_condExpItem1571); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:61: a= LESS
                            {
                            a=(Token)match(input,LESS,FOLLOW_LESS_in_condExpItem1576); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:271:69: a= LESS_EQUAL
                            {
                            a=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_condExpItem1581); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      if(isStrictMVC)	throw new MVCStrictException(a);
                    }
                    pushFollow(FOLLOW_aexpr_in_condExpItem1588);
                    l=aexpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, condExpItem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExpItem"

    public static class aexpr_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:1: aexpr : mexpr ( (a= ADD | a= MINUS ) mexpr )* ;
    public final BeeParser.aexpr_return aexpr() throws RecognitionException {
        BeeParser.aexpr_return retval = new BeeParser.aexpr_return();
        retval.start = input.LT(1);
        int aexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.mexpr_return mexpr128 = null;

        BeeParser.mexpr_return mexpr129 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:7: ( mexpr ( (a= ADD | a= MINUS ) mexpr )* )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:9: mexpr ( (a= ADD | a= MINUS ) mexpr )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr1598);
            mexpr128=mexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr128.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:15: ( (a= ADD | a= MINUS ) mexpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=ADD && LA34_0<=MINUS)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:16: (a= ADD | a= MINUS ) mexpr
            	    {
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:16: (a= ADD | a= MINUS )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==ADD) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==MINUS) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:17: a= ADD
            	            {
            	            a=(Token)match(input,ADD,FOLLOW_ADD_in_aexpr1604); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:272:24: a= MINUS
            	            {
            	            a=(Token)match(input,MINUS,FOLLOW_MINUS_in_aexpr1609); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr1613);
            	    mexpr129=mexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr129.getTree());
            	    if ( state.backtracking==0 ) {
            	      if(isStrictMVC)	throw new MVCStrictException(a);
            	    }

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, aexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:1: mexpr : unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* ;
    public final BeeParser.mexpr_return mexpr() throws RecognitionException {
        BeeParser.mexpr_return retval = new BeeParser.mexpr_return();
        retval.start = input.LT(1);
        int mexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.unaryAtom_return unaryAtom130 = null;

        BeeParser.unaryAtom_return unaryAtom131 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:9: ( unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:17: unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_unaryAtom_in_mexpr1633);
            unaryAtom130=unaryAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom130.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:27: ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=MULTIP && LA36_0<=MOD)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:28: (a= MULTIP | a= DIV | a= MOD ) unaryAtom
            	    {
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:28: (a= MULTIP | a= DIV | a= MOD )
            	    int alt35=3;
            	    switch ( input.LA(1) ) {
            	    case MULTIP:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:29: a= MULTIP
            	            {
            	            a=(Token)match(input,MULTIP,FOLLOW_MULTIP_in_mexpr1639); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:39: a= DIV
            	            {
            	            a=(Token)match(input,DIV,FOLLOW_DIV_in_mexpr1644); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:273:46: a= MOD
            	            {
            	            a=(Token)match(input,MOD,FOLLOW_MOD_in_mexpr1649); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	      if(isStrictMVC)	throw new MVCStrictException(a);
            	    }
            	    pushFollow(FOLLOW_unaryAtom_in_mexpr1654);
            	    unaryAtom131=unaryAtom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom131.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, mexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class atom_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:274:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );
    public final BeeParser.atom_return atom() throws RecognitionException {
        BeeParser.atom_return retval = new BeeParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token BOOLEAN132=null;
        Token INT133=null;
        Token NULL134=null;
        Token DOUBLE135=null;
        Token char_literal137=null;
        Token char_literal139=null;
        BeeParser.varRef_return varRef136 = null;

        BeeParser.exp_return exp138 = null;

        BeeParser.functionCall_return functionCall140 = null;

        BeeParser.nativeMethod_return nativeMethod141 = null;

        BeeParser.json_return json142 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree BOOLEAN132_tree=null;
        BeeCommonNodeTree INT133_tree=null;
        BeeCommonNodeTree NULL134_tree=null;
        BeeCommonNodeTree DOUBLE135_tree=null;
        BeeCommonNodeTree char_literal137_tree=null;
        BeeCommonNodeTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:274:6: ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json )
            int alt37=10;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:274:8: BOOLEAN
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    BOOLEAN132=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN132_tree = (BeeCommonNodeTree)adaptor.create(BOOLEAN132);
                    adaptor.addChild(root_0, BOOLEAN132_tree);
                    }

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:276:6: INT
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    INT133=(Token)match(input,INT,FOLLOW_INT_in_atom1672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT133_tree = (BeeCommonNodeTree)adaptor.create(INT133);
                    adaptor.addChild(root_0, INT133_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:277:4: NULL
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    NULL134=(Token)match(input,NULL,FOLLOW_NULL_in_atom1677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL134_tree = (BeeCommonNodeTree)adaptor.create(NULL134);
                    adaptor.addChild(root_0, NULL134_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:278:4: DOUBLE
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    DOUBLE135=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE135_tree = (BeeCommonNodeTree)adaptor.create(DOUBLE135);
                    adaptor.addChild(root_0, DOUBLE135_tree);
                    }

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:279:4: a= StringLiteral
                    {
                    a=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_atom1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(a);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 279:20: ->
                    {
                        adaptor.addChild(root_0, new BeeCommonNodeTree(new CommonToken(StringLiteral,BeetlUtil.getEscapeString((a!=null?a.getText():null)))));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:280:4: varRef
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_atom1698);
                    varRef136=varRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varRef136.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:281:4: '(' exp ')'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    char_literal137=(Token)match(input,101,FOLLOW_101_in_atom1704); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_atom1707);
                    exp138=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp138.getTree());
                    char_literal139=(Token)match(input,102,FOLLOW_102_in_atom1709); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:282:4: functionCall[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_atom1716);
                    functionCall140=functionCall(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall140.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:283:4: nativeMethod[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_atom1722);
                    nativeMethod141=nativeMethod(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod141.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:284:4: json
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_json_in_atom1728);
                    json142=json();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, json142.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class unaryAtom_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryAtom"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:286:1: unaryAtom : ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom );
    public final BeeParser.unaryAtom_return unaryAtom() throws RecognitionException {
        BeeParser.unaryAtom_return retval = new BeeParser.unaryAtom_return();
        retval.start = input.LT(1);
        int unaryAtom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token MINUS144=null;
        Token ADD145=null;
        BeeParser.atom_return a = null;

        BeeParser.atom_return atom143 = null;

        BeeParser.atom_return atom146 = null;


        BeeCommonNodeTree MINUS144_tree=null;
        BeeCommonNodeTree ADD145_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:287:2: ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom )
            int alt38=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case StringLiteral:
            case LEFT_BRACE:
            case BOOLEAN:
            case INT:
            case NULL:
            case DOUBLE:
            case 101:
            case 122:
            case 124:
                {
                alt38=1;
                }
                break;
            case MINUS:
                {
                alt38=2;
                }
                break;
            case ADD:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:287:4: atom
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryAtom1739);
                    atom143=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom143.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:288:4: MINUS a= atom
                    {
                    MINUS144=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryAtom1745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS144);

                    pushFollow(FOLLOW_atom_in_unaryAtom1749);
                    a=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(a.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 288:17: -> ^( NEGATOM atom )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:288:19: ^( NEGATOM atom )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(NEGATOM, "NEGATOM"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:289:4: ADD atom
                    {
                    ADD145=(Token)match(input,ADD,FOLLOW_ADD_in_unaryAtom1761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ADD.add(ADD145);

                    pushFollow(FOLLOW_atom_in_unaryAtom1763);
                    atom146=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom146.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 289:13: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, unaryAtom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryAtom"

    public static class nativeMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nativeMethod"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:1: nativeMethod[boolean statmentCall] : a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ;
    public final BeeParser.nativeMethod_return nativeMethod(boolean statmentCall) throws RecognitionException {
        BeeParser.nativeMethod_return retval = new BeeParser.nativeMethod_return();
        retval.start = input.LT(1);
        int nativeMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier147=null;
        Token char_literal148=null;
        Token Identifier149=null;
        Token char_literal150=null;
        BeeParser.classMethod_return classMethod151 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier147_tree=null;
        BeeCommonNodeTree char_literal148_tree=null;
        BeeCommonNodeTree Identifier149_tree=null;
        BeeCommonNodeTree char_literal150_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_classMethod=new RewriteRuleSubtreeStream(adaptor,"rule classMethod");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:37: (a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:38: a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )?
            {
            a=(Token)match(input,124,FOLLOW_124_in_nativeMethod1780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(a);

            Identifier147=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1782); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier147);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:55: ( '.' Identifier )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==120) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==Identifier) ) {
                        int LA39_3 = input.LA(3);

                        if ( (LA39_3==EOF||LA39_3==RIGHT_BRACE||LA39_3==RIGHT_TOKEN||(LA39_3>=OR && LA39_3<=MOD)||LA39_3==99||LA39_3==102||(LA39_3>=104 && LA39_3<=105)||LA39_3==120||LA39_3==123) ) {
                            alt39=1;
                        }


                    }


                }


                switch (alt39) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:56: '.' Identifier
            	    {
            	    char_literal148=(Token)match(input,120,FOLLOW_120_in_nativeMethod1785); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_120.add(char_literal148);

            	    Identifier149=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1787); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier149);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:73: ( '.' classMethod )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==120) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:291:74: '.' classMethod
                    {
                    char_literal150=(Token)match(input,120,FOLLOW_120_in_nativeMethod1792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(char_literal150);

                    pushFollow(FOLLOW_classMethod_in_nativeMethod1794);
                    classMethod151=classMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMethod.add(classMethod151.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              if(!openBackdoor||isStrictMVC) throw new MVCStrictException(a);
            }


            // AST REWRITE
            // elements: Identifier, Identifier, classMethod, classMethod
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 292:4: -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:292:25: ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:292:39: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_2);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:292:60: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:292:72: ( classMethod )?
                if ( stream_classMethod.hasNext() ) {
                    adaptor.addChild(root_2, stream_classMethod.nextTree());

                }
                stream_classMethod.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 293:4: -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:293:7: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:293:28: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:293:40: ( classMethod )?
                if ( stream_classMethod.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMethod.nextTree());

                }
                stream_classMethod.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, nativeMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nativeMethod"

    public static class classMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMethod"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:296:1: classMethod : Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) ;
    public final BeeParser.classMethod_return classMethod() throws RecognitionException {
        BeeParser.classMethod_return retval = new BeeParser.classMethod_return();
        retval.start = input.LT(1);
        int classMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier152=null;
        Token char_literal153=null;
        Token char_literal155=null;
        Token char_literal157=null;
        BeeParser.exp_return exp154 = null;

        BeeParser.exp_return exp156 = null;


        BeeCommonNodeTree Identifier152_tree=null;
        BeeCommonNodeTree char_literal153_tree=null;
        BeeCommonNodeTree char_literal155_tree=null;
        BeeCommonNodeTree char_literal157_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:2: ( Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:4: Identifier '(' ( exp ( ',' exp )* )? ')'
            {
            Identifier152=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMethod1859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier152);

            char_literal153=(Token)match(input,101,FOLLOW_101_in_classMethod1861); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal153);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:19: ( exp ( ',' exp )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=Identifier && LA42_0<=LEFT_BRACE)||(LA42_0>=ADD && LA42_0<=MINUS)||(LA42_0>=BOOLEAN && LA42_0<=DOUBLE)||LA42_0==101||LA42_0==119||LA42_0==122||LA42_0==124) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:20: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_classMethod1864);
                    exp154=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp154.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:24: ( ',' exp )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==104) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:25: ',' exp
                    	    {
                    	    char_literal155=(Token)match(input,104,FOLLOW_104_in_classMethod1867); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_104.add(char_literal155);

                    	    pushFollow(FOLLOW_exp_in_classMethod1869);
                    	    exp156=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp156.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal157=(Token)match(input,102,FOLLOW_102_in_classMethod1876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal157);



            // AST REWRITE
            // elements: exp, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 297:42: -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:44: ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_METHOD, Identifier152), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:297:83: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, classMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMethod"

    public static class functionFullName_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionFullName"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:1: functionFullName : a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) ;
    public final BeeParser.functionFullName_return functionFullName() throws RecognitionException {
        BeeParser.functionFullName_return retval = new BeeParser.functionFullName_return();
        retval.start = input.LT(1);
        int functionFullName_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal158=null;
        Token Identifier159=null;

        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal158_tree=null;
        BeeCommonNodeTree Identifier159_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:18: (a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:19: a= Identifier ( '.' Identifier )?
            {
            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:32: ( '.' Identifier )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==120) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:33: '.' Identifier
                    {
                    char_literal158=(Token)match(input,120,FOLLOW_120_in_functionFullName1901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(char_literal158);

                    Identifier159=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1903); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier159);


                    }
                    break;

            }



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 299:51: -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:54: ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION_FULL_NAME, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:299:80: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, functionFullName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionFullName"

    public static class switchStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:301:1: switchStatment : a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) ;
    public final BeeParser.switchStatment_return switchStatment() throws RecognitionException {
        BeeParser.switchStatment_return retval = new BeeParser.switchStatment_return();
        retval.start = input.LT(1);
        int switchStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal160=null;
        Token char_literal161=null;
        Token char_literal162=null;
        Token char_literal165=null;
        BeeParser.exp_return base = null;

        BeeParser.caseStatment_return caseStatment163 = null;

        BeeParser.defaultStatment_return defaultStatment164 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal160_tree=null;
        BeeCommonNodeTree char_literal161_tree=null;
        BeeCommonNodeTree char_literal162_tree=null;
        BeeCommonNodeTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule caseStatment");
        RewriteRuleSubtreeStream stream_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:302:2: (a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:302:4: a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}'
            {
            a=(Token)match(input,125,FOLLOW_125_in_switchStatment1928); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_125.add(a);

            char_literal160=(Token)match(input,101,FOLLOW_101_in_switchStatment1930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal160);

            pushFollow(FOLLOW_exp_in_switchStatment1934);
            base=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(base.getTree());
            char_literal161=(Token)match(input,102,FOLLOW_102_in_switchStatment1936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal161);

            char_literal162=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_switchStatment1938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal162);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:302:36: ( caseStatment )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==103) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: caseStatment
            	    {
            	    pushFollow(FOLLOW_caseStatment_in_switchStatment1940);
            	    caseStatment163=caseStatment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStatment.add(caseStatment163.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:302:50: ( defaultStatment )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==106) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:0:0: defaultStatment
                    {
                    pushFollow(FOLLOW_defaultStatment_in_switchStatment1943);
                    defaultStatment164=defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defaultStatment.add(defaultStatment164.getTree());

                    }
                    break;

            }

            char_literal165=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_switchStatment1946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal165);



            // AST REWRITE
            // elements: caseStatment, base, defaultStatment
            // token labels: 
            // rule labels: retval, base
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base",base!=null?base.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 303:3: -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:303:5: ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SWITCH, a), root_1);

                adaptor.addChild(root_1, stream_base.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:303:24: ( caseStatment )*
                while ( stream_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseStatment.nextTree());

                }
                stream_caseStatment.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:303:38: ( defaultStatment )?
                if ( stream_defaultStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultStatment.nextTree());

                }
                stream_defaultStatment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, switchStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchStatment"

    public static class caseStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:304:1: caseStatment : a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) ;
    public final BeeParser.caseStatment_return caseStatment() throws RecognitionException {
        BeeParser.caseStatment_return retval = new BeeParser.caseStatment_return();
        retval.start = input.LT(1);
        int caseStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal167=null;
        BeeParser.exp_return exp166 = null;

        BeeParser.statements_return statements168 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:305:2: (a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:305:4: a= 'case' exp ':' statements
            {
            a=(Token)match(input,103,FOLLOW_103_in_caseStatment1975); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(a);

            pushFollow(FOLLOW_exp_in_caseStatment1977);
            exp166=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp166.getTree());
            char_literal167=(Token)match(input,105,FOLLOW_105_in_caseStatment1979); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(char_literal167);

            pushFollow(FOLLOW_statements_in_caseStatment1981);
            statements168=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements168.getTree());


            // AST REWRITE
            // elements: statements, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 305:32: -> ^( CASE[$a] exp statements )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:305:34: ^( CASE[$a] exp statements )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CASE, a), root_1);

                adaptor.addChild(root_1, stream_exp.nextTree());
                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, caseStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStatment"

    public static class defaultStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStatment"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:306:1: defaultStatment : a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) ;
    public final BeeParser.defaultStatment_return defaultStatment() throws RecognitionException {
        BeeParser.defaultStatment_return retval = new BeeParser.defaultStatment_return();
        retval.start = input.LT(1);
        int defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal169=null;
        BeeParser.statements_return statements170 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:307:2: (a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) )
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:307:4: a= 'default' ':' statements
            {
            a=(Token)match(input,106,FOLLOW_106_in_defaultStatment2001); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(a);

            char_literal169=(Token)match(input,105,FOLLOW_105_in_defaultStatment2003); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(char_literal169);

            pushFollow(FOLLOW_statements_in_defaultStatment2005);
            statements170=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements170.getTree());


            // AST REWRITE
            // elements: statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 307:31: -> ^( DEFAULT[$a] statements )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:307:34: ^( DEFAULT[$a] statements )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DEFAULT, a), root_1);

                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, defaultStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStatment"

    public static class json_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "json"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:1: json : ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) );
    public final BeeParser.json_return json() throws RecognitionException {
        BeeParser.json_return retval = new BeeParser.json_return();
        retval.start = input.LT(1);
        int json_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        Token char_literal176=null;
        Token char_literal178=null;
        Token char_literal180=null;
        BeeParser.exp_return exp172 = null;

        BeeParser.exp_return exp174 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue177 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue179 = null;


        BeeCommonNodeTree char_literal171_tree=null;
        BeeCommonNodeTree char_literal173_tree=null;
        BeeCommonNodeTree char_literal175_tree=null;
        BeeCommonNodeTree char_literal176_tree=null;
        BeeCommonNodeTree char_literal178_tree=null;
        BeeCommonNodeTree char_literal180_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_jsonKeyValue=new RewriteRuleSubtreeStream(adaptor,"rule jsonKeyValue");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:6: ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==122) ) {
                alt50=1;
            }
            else if ( (LA50_0==LEFT_BRACE) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:8: '[' ( exp ( ',' exp )* )? ']'
                    {
                    char_literal171=(Token)match(input,122,FOLLOW_122_in_json2021); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal171);

                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:12: ( exp ( ',' exp )* )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=Identifier && LA47_0<=LEFT_BRACE)||(LA47_0>=ADD && LA47_0<=MINUS)||(LA47_0>=BOOLEAN && LA47_0<=DOUBLE)||LA47_0==101||LA47_0==119||LA47_0==122||LA47_0==124) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:13: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_json2024);
                            exp172=exp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exp.add(exp172.getTree());
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:18: ( ',' exp )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==104) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:19: ',' exp
                            	    {
                            	    char_literal173=(Token)match(input,104,FOLLOW_104_in_json2028); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_104.add(char_literal173);

                            	    pushFollow(FOLLOW_exp_in_json2030);
                            	    exp174=exp();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_exp.add(exp174.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal175=(Token)match(input,123,FOLLOW_123_in_json2036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal175);



                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 308:35: -> ^( JSONARRAY ( exp )* )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:37: ^( JSONARRAY ( exp )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONARRAY, "JSONARRAY"), root_1);

                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:308:49: ( exp )*
                        while ( stream_exp.hasNext() ) {
                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:4: '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}'
                    {
                    char_literal176=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_json2049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal176);

                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:8: ( jsonKeyValue ( ',' jsonKeyValue )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=Identifier && LA49_0<=StringLiteral)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:9: jsonKeyValue ( ',' jsonKeyValue )*
                            {
                            pushFollow(FOLLOW_jsonKeyValue_in_json2052);
                            jsonKeyValue177=jsonKeyValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue177.getTree());
                            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:22: ( ',' jsonKeyValue )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==104) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:23: ',' jsonKeyValue
                            	    {
                            	    char_literal178=(Token)match(input,104,FOLLOW_104_in_json2055); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_104.add(char_literal178);

                            	    pushFollow(FOLLOW_jsonKeyValue_in_json2057);
                            	    jsonKeyValue179=jsonKeyValue();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue179.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal180=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_json2063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal180);



                    // AST REWRITE
                    // elements: jsonKeyValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 309:48: -> ^( JSONMAP ( jsonKeyValue )* )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:50: ^( JSONMAP ( jsonKeyValue )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONMAP, "JSONMAP"), root_1);

                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:309:60: ( jsonKeyValue )*
                        while ( stream_jsonKeyValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_jsonKeyValue.nextTree());

                        }
                        stream_jsonKeyValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, json_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "json"

    public static class jsonKeyValue_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jsonKeyValue"
    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:311:1: jsonKeyValue : ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) );
    public final BeeParser.jsonKeyValue_return jsonKeyValue() throws RecognitionException {
        BeeParser.jsonKeyValue_return retval = new BeeParser.jsonKeyValue_return();
        retval.start = input.LT(1);
        int jsonKeyValue_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token StringLiteral181=null;
        Token char_literal182=null;
        Token Identifier184=null;
        Token char_literal185=null;
        BeeParser.exp_return exp183 = null;

        BeeParser.exp_return exp186 = null;


        BeeCommonNodeTree StringLiteral181_tree=null;
        BeeCommonNodeTree char_literal182_tree=null;
        BeeCommonNodeTree Identifier184_tree=null;
        BeeCommonNodeTree char_literal185_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:312:2: ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==StringLiteral) ) {
                alt51=1;
            }
            else if ( (LA51_0==Identifier) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:312:4: StringLiteral ':' exp
                    {
                    StringLiteral181=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_jsonKeyValue2081); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral181);

                    char_literal182=(Token)match(input,105,FOLLOW_105_in_jsonKeyValue2083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(char_literal182);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue2085);
                    exp183=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp183.getTree());


                    // AST REWRITE
                    // elements: exp, StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 312:26: -> ^( JSONKEYVALUE StringLiteral exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:312:28: ^( JSONKEYVALUE StringLiteral exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONKEYVALUE, "JSONKEYVALUE"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:313:4: Identifier ':' exp
                    {
                    Identifier184=(Token)match(input,Identifier,FOLLOW_Identifier_in_jsonKeyValue2101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier184);

                    char_literal185=(Token)match(input,105,FOLLOW_105_in_jsonKeyValue2103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(char_literal185);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue2105);
                    exp186=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp186.getTree());


                    // AST REWRITE
                    // elements: Identifier, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 313:23: -> ^( JSONKEYVALUE Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:313:25: ^( JSONKEYVALUE Identifier exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONKEYVALUE, "JSONKEYVALUE"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (BeeCommonNodeTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        reportError(e); 
        throw e;
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, jsonKeyValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jsonKeyValue"

    // $ANTLR start synpred29_Bee
    public final void synpred29_Bee_fragment() throws RecognitionException {   
        BeeParser.statement_return n = null;


        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:38: ( 'else' n= statement )
        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:207:38: 'else' n= statement
        {
        match(input,116,FOLLOW_116_in_synpred29_Bee929); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred29_Bee933);
        n=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Bee

    // $ANTLR start synpred36_Bee
    public final void synpred36_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:231:4: ( Identifier '=' exp )
        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:231:4: Identifier '=' exp
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred36_Bee1180); if (state.failed) return ;
        match(input,118,FOLLOW_118_in_synpred36_Bee1182); if (state.failed) return ;
        pushFollow(FOLLOW_exp_in_synpred36_Bee1184);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Bee

    // $ANTLR start synpred37_Bee
    public final void synpred37_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:237:10: ({...}? Identifier )
        // E:\\lijz\\javamonkey\\bee\\github\\xdfbeetl1.2_goswitch\\src\\org\\bee\\tl\\core\\Bee.g:237:10: {...}? Identifier
        {
        if ( !((input.LT(1).getText().startsWith("__V"))) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_Bee", "input.LT(1).getText().startsWith(\"__V\")");
        }
        match(input,Identifier,FOLLOW_Identifier_in_synpred37_Bee1258); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_Bee

    // Delegated rules

    public final boolean synpred37_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_Bee_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Bee_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Bee_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\22\uffff";
    static final String DFA3_minS =
        "\1\61\2\uffff\1\145\16\uffff";
    static final String DFA3_maxS =
        "\1\175\2\uffff\1\170\16\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\3\1\11";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\uffff\1\10\1\uffff\1\1\1\uffff\1\4\1\2\53\uffff\1\15"+
            "\6\uffff\1\17\1\13\1\11\1\12\1\6\2\uffff\1\7\1\5\10\uffff\1"+
            "\16\1\14",
            "",
            "",
            "\1\21\20\uffff\1\20\1\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "139:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive );";
        }
    }
    static final String DFA37_eotS =
        "\16\uffff";
    static final String DFA37_eofS =
        "\6\uffff\1\12\6\uffff\1\12";
    static final String DFA37_minS =
        "\1\61\5\uffff\1\64\4\uffff\1\61\1\uffff\1\64";
    static final String DFA37_maxS =
        "\1\174\5\uffff\1\173\4\uffff\1\61\1\uffff\1\173";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\uffff"+
        "\1\10\1\uffff";
    static final String DFA37_specialS =
        "\16\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\6\1\5\1\11\22\uffff\1\1\1\2\1\3\1\4\33\uffff\1\7\24\uffff"+
            "\1\11\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\12\2\uffff\15\12\35\uffff\1\12\1\uffff\1\14"+
            "\1\12\1\uffff\2\12\15\uffff\1\12\1\13\3\12",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "\1\12\1\uffff\1\12\2\uffff\15\12\35\uffff\1\12\1\uffff\1\14"+
            "\1\12\1\uffff\2\12\15\uffff\5\12"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "274:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );";
        }
    }
 

    public static final BitSet FOLLOW_statements_in_prog324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements335 = new BitSet(new long[]{0x01AA000000000002L,0x300CF81000000000L});
    public static final BitSet FOLLOW_constantsTextStatment_in_statement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDefine_in_statement351 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_statement353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignMent_in_statement359 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_statement361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textStatment_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatment_in_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatment_in_statement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStament_in_statement382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statmentBlock_in_statement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messFunction_in_statement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatment_in_statement397 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_statement399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatment_in_statement405 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_statement407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatment_in_statement413 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_statement415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatment_in_statement421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switchStatment_in_statement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_statement431 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_statement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_statement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_g_switchStatment456 = new BitSet(new long[]{0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_g_switchStatment459 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_g_switchStatment463 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_g_switchStatment465 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_g_switchStatment469 = new BitSet(new long[]{0x0010000000000000L,0x0000048000000000L});
    public static final BitSet FOLLOW_g_caseStatment_in_g_switchStatment471 = new BitSet(new long[]{0x0010000000000000L,0x0000048000000000L});
    public static final BitSet FOLLOW_g_defaultStatment_in_g_switchStatment474 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_g_switchStatment477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_g_caseStatment509 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_g_caseStatment511 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_104_in_g_caseStatment514 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_g_caseStatment516 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_105_in_g_caseStatment520 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_g_caseStatment522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_g_defaultStatment548 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_g_defaultStatment550 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_g_defaultStatment552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_directive569 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_directive572 = new BitSet(new long[]{0x0004000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_directive575 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_directive579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_returnStatment600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_continueStatment613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_breakStatment627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProcessFunction_in_messFunction654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_messFunction661 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_messFunction664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textProcessFunction675 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_textProcessFunction679 = new BitSet(new long[]{0x000E000000000000L,0x14800060000003C6L});
    public static final BitSet FOLLOW_exp_in_textProcessFunction682 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_104_in_textProcessFunction685 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_textProcessFunction687 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_102_in_textProcessFunction693 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_textProcessFunction695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_functionCall730 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_functionCall734 = new BitSet(new long[]{0x000E000000000000L,0x14800060000003C6L});
    public static final BitSet FOLLOW_exp_in_functionCall737 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_104_in_functionCall740 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_functionCall742 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_102_in_functionCall748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_statmentBlock797 = new BitSet(new long[]{0x01BA000000000000L,0x300CF81000000000L});
    public static final BitSet FOLLOW_statements_in_statmentBlock799 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_statmentBlock802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_forStatment819 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_forStatment821 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_forStatment825 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_forStatment827 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_forStatment832 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_forStatment834 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment841 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_forStatment845 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_whileStament884 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_whileStament886 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_condExp_in_whileStament890 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_whileStament892 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_whileStament895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ifStatment916 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ifStatment918 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_condExp_in_ifStatment920 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ifStatment922 = new BitSet(new long[]{0x01AA000000000000L,0x301CF81000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment926 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_ifStatment929 = new BitSet(new long[]{0x01AA000000000000L,0x300CF81000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment963 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_constantsTextStatment966 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_constantsTextStatment968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment998 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_textVar_in_textStatment1000 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment1015 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_textStatment1017 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_textVar_in_textStatment1019 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_textStatment1021 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_textVar1043 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_textVar1047 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_textformat_in_textVar1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textformat1076 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_textformat1079 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDefine1123 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine1126 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_varDefine1129 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine1131 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1180 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_varAssignMent1182 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_varAssignMent1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1202 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_varAssignMent1204 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_varAssignMent1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignMent1230 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_assignMent1232 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_assignMent1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1277 = new BitSet(new long[]{0x0000000000000002L,0x0780000000000000L});
    public static final BitSet FOLLOW_varAttribute_in_varRef1282 = new BitSet(new long[]{0x0000000000000002L,0x0780000000000000L});
    public static final BitSet FOLLOW_safeOutput_in_varRef1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_safeOutput1318 = new BitSet(new long[]{0x000E000000000002L,0x14000020000003C0L});
    public static final BitSet FOLLOW_atom_in_safeOutput1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_varAttribute1345 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_varAttribute1361 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_varAttribute1380 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_varAttribute1382 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_varAttribute1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExp_in_exp1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_condExp1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1434 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression1445 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1448 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1479 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression1490 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1493 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_condExpNotItem1527 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1549 = new BitSet(new long[]{0xF800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_EQUAL_in_condExpItem1556 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_condExpItem1561 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_LARGE_in_condExpItem1566 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_LARGE_EQUAL_in_condExpItem1571 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_LESS_in_condExpItem1576 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_condExpItem1581 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1598 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ADD_in_aexpr1604 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_MINUS_in_aexpr1609 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1613 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_MULTIP_in_mexpr1639 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_DIV_in_mexpr1644 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_MOD_in_mexpr1649 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C6L});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000038L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_atom1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_atom1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_atom1704 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_atom1707 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_atom1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atom1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_atom1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_json_in_atom1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryAtom1745 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C0L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryAtom1761 = new BitSet(new long[]{0x000E000000000000L,0x14000020000003C0L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_nativeMethod1780 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1782 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_nativeMethod1785 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1787 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_nativeMethod1792 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_classMethod_in_nativeMethod1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_classMethod1859 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_classMethod1861 = new BitSet(new long[]{0x000E000000000000L,0x14800060000003C6L});
    public static final BitSet FOLLOW_exp_in_classMethod1864 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_104_in_classMethod1867 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_classMethod1869 = new BitSet(new long[]{0x0000000000000000L,0x0000014000000000L});
    public static final BitSet FOLLOW_102_in_classMethod1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1898 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_functionFullName1901 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_switchStatment1928 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_switchStatment1930 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_switchStatment1934 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_switchStatment1936 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_switchStatment1938 = new BitSet(new long[]{0x0010000000000000L,0x0000048000000000L});
    public static final BitSet FOLLOW_caseStatment_in_switchStatment1940 = new BitSet(new long[]{0x0010000000000000L,0x0000048000000000L});
    public static final BitSet FOLLOW_defaultStatment_in_switchStatment1943 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_switchStatment1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_caseStatment1975 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_caseStatment1977 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_caseStatment1979 = new BitSet(new long[]{0x01AA000000000000L,0x300CF81000000000L});
    public static final BitSet FOLLOW_statements_in_caseStatment1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_defaultStatment2001 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_defaultStatment2003 = new BitSet(new long[]{0x01AA000000000000L,0x300CF81000000000L});
    public static final BitSet FOLLOW_statements_in_defaultStatment2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_json2021 = new BitSet(new long[]{0x000E000000000000L,0x1C800020000003C6L});
    public static final BitSet FOLLOW_exp_in_json2024 = new BitSet(new long[]{0x0000000000000000L,0x0800010000000000L});
    public static final BitSet FOLLOW_104_in_json2028 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_json2030 = new BitSet(new long[]{0x0000000000000000L,0x0800010000000000L});
    public static final BitSet FOLLOW_123_in_json2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_json2049 = new BitSet(new long[]{0x0016000000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json2052 = new BitSet(new long[]{0x0010000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_json2055 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json2057 = new BitSet(new long[]{0x0010000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_json2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_jsonKeyValue2081 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_jsonKeyValue2083 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_jsonKeyValue2101 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_jsonKeyValue2103 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_synpred29_Bee929 = new BitSet(new long[]{0x01AA000000000000L,0x300CF81000000000L});
    public static final BitSet FOLLOW_statement_in_synpred29_Bee933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred36_Bee1180 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_synpred36_Bee1182 = new BitSet(new long[]{0x000E000000000000L,0x14800020000003C6L});
    public static final BitSet FOLLOW_exp_in_synpred36_Bee1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred37_Bee1258 = new BitSet(new long[]{0x0000000000000002L});

}