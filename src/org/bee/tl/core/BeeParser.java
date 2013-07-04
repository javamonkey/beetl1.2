// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g 2013-07-04 18:18:50

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR_DEFINE", "VAR_REFER", "ASSIGNMENT", "HOLDER", "TEXT_HOLDER", "FOR", "VAR_TEXT", "FM", "DEFAULT_FM", "SLIST", "IF", "EXP", "COND_EXP", "FUNCTION", "TEXT_PROCESS", "ATTR_NAME", "VIRTUAL_ATTR_NAME", "MAP_LIST_INDEX", "BREAK", "CONTINUE", "RETURN", "NOT", "SWITCH", "CASE", "DEFAULT", "G_SWITCH", "G_CASE", "G_DEFAULT", "G_CASE_EXPLIST", "JSON", "JSONARRAY", "JSONMAP", "JSONKEYVALUE", "CLASS_STATIC_FUNCTION", "CLASS_FUNCTION", "CLASS_METHOD", "CLASS_ARRAY", "VARIABLE_VAR_REFER", "TEXT_VAR_REFER", "MISSING_VARIABLE_VAR_REFER", "FUNCTION_FULL_NAME", "SAFE_OUTPUT", "DIRECT_CALL", "NEGATOM", "WHILE", "DIRECTIVE", "Identifier", "StringLiteral", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_TEXT_TOKEN", "RIGHT_TOKEN", "LEFT_TOKEN", "VAR", "OR", "AND", "EQUAL", "NOT_EQUAL", "LARGE", "LARGE_EQUAL", "LESS", "LESS_EQUAL", "ADD", "MINUS", "MULTIP", "DIV", "MOD", "BOOLEAN", "INT", "NULL", "DOUBLE", "ID_START", "Comment", "LineComment", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "DecimalLiteral", "HexIntegerLiteral", "NumericLiteral", "ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", "UnicodeDigit", "UnicodeConnectorPunctuation", "UnicodeCombiningMark", "WhiteSpace", "';'", "'select'", "'('", "')'", "'case'", "','", "':'", "'default'", "'DIRECTIVE'", "'return'", "'continue'", "'break'", "'for'", "'in '", "'elsefor'", "'while'", "'if'", "'else'", "'!('", "'='", "'!'", "'.'", "'.~'", "'['", "']'", "'@'", "'switch'"
    };
    public static final int EOF=-1;
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
    public static final int T__126=126;
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
    public static final int CLASS_ARRAY=40;
    public static final int VARIABLE_VAR_REFER=41;
    public static final int TEXT_VAR_REFER=42;
    public static final int MISSING_VARIABLE_VAR_REFER=43;
    public static final int FUNCTION_FULL_NAME=44;
    public static final int SAFE_OUTPUT=45;
    public static final int DIRECT_CALL=46;
    public static final int NEGATOM=47;
    public static final int WHILE=48;
    public static final int DIRECTIVE=49;
    public static final int Identifier=50;
    public static final int StringLiteral=51;
    public static final int LEFT_BRACE=52;
    public static final int RIGHT_BRACE=53;
    public static final int LEFT_TEXT_TOKEN=54;
    public static final int RIGHT_TOKEN=55;
    public static final int LEFT_TOKEN=56;
    public static final int VAR=57;
    public static final int OR=58;
    public static final int AND=59;
    public static final int EQUAL=60;
    public static final int NOT_EQUAL=61;
    public static final int LARGE=62;
    public static final int LARGE_EQUAL=63;
    public static final int LESS=64;
    public static final int LESS_EQUAL=65;
    public static final int ADD=66;
    public static final int MINUS=67;
    public static final int MULTIP=68;
    public static final int DIV=69;
    public static final int MOD=70;
    public static final int BOOLEAN=71;
    public static final int INT=72;
    public static final int NULL=73;
    public static final int DOUBLE=74;
    public static final int ID_START=75;
    public static final int Comment=76;
    public static final int LineComment=77;
    public static final int DoubleStringCharacter=78;
    public static final int SingleStringCharacter=79;
    public static final int EscapeSequence=80;
    public static final int CharacterEscapeSequence=81;
    public static final int HexEscapeSequence=82;
    public static final int UnicodeEscapeSequence=83;
    public static final int SingleEscapeCharacter=84;
    public static final int NonEscapeCharacter=85;
    public static final int EscapeCharacter=86;
    public static final int DecimalDigit=87;
    public static final int HexDigit=88;
    public static final int DecimalLiteral=89;
    public static final int HexIntegerLiteral=90;
    public static final int NumericLiteral=91;
    public static final int ExponentPart=92;
    public static final int IdentifierStart=93;
    public static final int IdentifierPart=94;
    public static final int UnicodeLetter=95;
    public static final int UnicodeDigit=96;
    public static final int UnicodeConnectorPunctuation=97;
    public static final int UnicodeCombiningMark=98;
    public static final int WhiteSpace=99;

    // delegates
    // delegators


        public BeeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BeeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[131+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BeeParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g"; }


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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:138:1: prog : ( statements )? EOF ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:138:6: ( ( statements )? EOF )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:138:8: ( statements )? EOF
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:138:8: ( statements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Identifier||LA1_0==LEFT_BRACE||LA1_0==LEFT_TEXT_TOKEN||(LA1_0>=LEFT_TOKEN && LA1_0<=VAR)||LA1_0==101||(LA1_0>=108 && LA1_0<=112)||(LA1_0>=115 && LA1_0<=116)||(LA1_0>=125 && LA1_0<=126)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_prog329);
                    statements1=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

                    }
                    break;

            }

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog332); if (state.failed) return retval;

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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:139:1: statements : ( statement )+ ;
    public final BeeParser.statements_return statements() throws RecognitionException {
        BeeParser.statements_return retval = new BeeParser.statements_return();
        retval.start = input.LT(1);
        int statements_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.statement_return statement3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:139:12: ( ( statement )+ )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:139:13: ( statement )+
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:139:13: ( statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==LEFT_BRACE||LA2_0==LEFT_TEXT_TOKEN||(LA2_0>=LEFT_TOKEN && LA2_0<=VAR)||LA2_0==101||(LA2_0>=108 && LA2_0<=112)||(LA2_0>=115 && LA2_0<=116)||(LA2_0>=125 && LA2_0<=126)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements340);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:140:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive );
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:141:2: ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive )
            int alt3=16;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:141:4: constantsTextStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_constantsTextStatment_in_statement349);
                    constantsTextStatment4=constantsTextStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantsTextStatment4.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:142:6: varDefine ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varDefine_in_statement356);
                    varDefine5=varDefine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDefine5.getTree());
                    char_literal6=(Token)match(input,100,FOLLOW_100_in_statement358); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:143:4: assignMent ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_assignMent_in_statement364);
                    assignMent7=assignMent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignMent7.getTree());
                    char_literal8=(Token)match(input,100,FOLLOW_100_in_statement366); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:144:4: textStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_textStatment_in_statement372);
                    textStatment9=textStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textStatment9.getTree());

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:145:4: ifStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatment_in_statement377);
                    ifStatment10=ifStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatment10.getTree());

                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:146:4: forStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatment_in_statement382);
                    forStatment11=forStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatment11.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:147:4: whileStament
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStament_in_statement387);
                    whileStament12=whileStament();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStament12.getTree());

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:148:4: statmentBlock
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_statmentBlock_in_statement392);
                    statmentBlock13=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statmentBlock13.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:149:4: messFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_messFunction_in_statement397);
                    messFunction14=messFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, messFunction14.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:150:4: continueStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatment_in_statement402);
                    continueStatment15=continueStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatment15.getTree());
                    char_literal16=(Token)match(input,100,FOLLOW_100_in_statement404); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:151:4: breakStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatment_in_statement410);
                    breakStatment17=breakStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatment17.getTree());
                    char_literal18=(Token)match(input,100,FOLLOW_100_in_statement412); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:152:4: returnStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatment_in_statement418);
                    returnStatment19=returnStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatment19.getTree());
                    char_literal20=(Token)match(input,100,FOLLOW_100_in_statement420); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:153:4: switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatment_in_statement426);
                    switchStatment21=switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatment21.getTree());

                    }
                    break;
                case 14 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:154:4: g_switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_g_switchStatment_in_statement431);
                    g_switchStatment22=g_switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switchStatment22.getTree());

                    }
                    break;
                case 15 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:155:4: nativeMethod[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_statement436);
                    nativeMethod23=nativeMethod(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod23.getTree());
                    char_literal24=(Token)match(input,100,FOLLOW_100_in_statement439); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:156:4: directive
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_directive_in_statement446);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:160:1: g_switchStatment : a= 'select' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}' -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? ) ;
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
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_g_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule g_caseStatment");
        RewriteRuleSubtreeStream stream_g_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule g_defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:161:2: (a= 'select' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}' -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:161:4: a= 'select' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}'
            {
            a=(Token)match(input,101,FOLLOW_101_in_g_switchStatment461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(a);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:161:15: ( '(' base= exp ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==102) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:161:16: '(' base= exp ')'
                    {
                    char_literal26=(Token)match(input,102,FOLLOW_102_in_g_switchStatment464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(char_literal26);

                    pushFollow(FOLLOW_exp_in_g_switchStatment468);
                    base=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(base.getTree());
                    char_literal27=(Token)match(input,103,FOLLOW_103_in_g_switchStatment470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(char_literal27);


                    }
                    break;

            }

            char_literal28=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_g_switchStatment474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal28);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:161:39: ( g_caseStatment )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==104) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: g_caseStatment
            	    {
            	    pushFollow(FOLLOW_g_caseStatment_in_g_switchStatment476);
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

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:161:55: ( g_defaultStatment )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==107) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: g_defaultStatment
                    {
                    pushFollow(FOLLOW_g_defaultStatment_in_g_switchStatment479);
                    g_defaultStatment30=g_defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_g_defaultStatment.add(g_defaultStatment30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_g_switchStatment482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal31);



            // AST REWRITE
            // elements: base, g_defaultStatment, g_caseStatment
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
            // 162:3: -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:162:5: ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_SWITCH, a), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:162:20: ( $base)?
                if ( stream_base.hasNext() ) {
                    adaptor.addChild(root_1, stream_base.nextTree());

                }
                stream_base.reset();
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:162:27: ( g_caseStatment )*
                while ( stream_g_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_g_caseStatment.nextTree());

                }
                stream_g_caseStatment.reset();
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:162:43: ( g_defaultStatment )?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:164:1: g_caseStatment : a= 'case' exp ( ',' exp )* ':' statements -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements ) ;
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

        BeeParser.statements_return statements36 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal33_tree=null;
        BeeCommonNodeTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:165:2: (a= 'case' exp ( ',' exp )* ':' statements -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:165:4: a= 'case' exp ( ',' exp )* ':' statements
            {
            a=(Token)match(input,104,FOLLOW_104_in_g_caseStatment514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_104.add(a);

            pushFollow(FOLLOW_exp_in_g_caseStatment516);
            exp32=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp32.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:165:17: ( ',' exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==105) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:165:18: ',' exp
            	    {
            	    char_literal33=(Token)match(input,105,FOLLOW_105_in_g_caseStatment519); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_105.add(char_literal33);

            	    pushFollow(FOLLOW_exp_in_g_caseStatment521);
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

            char_literal35=(Token)match(input,106,FOLLOW_106_in_g_caseStatment525); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal35);

            pushFollow(FOLLOW_statements_in_g_caseStatment527);
            statements36=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements36.getTree());


            // AST REWRITE
            // elements: exp, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 165:43: -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:165:45: ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_CASE, a), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:165:58: ^( G_CASE_EXPLIST ( exp )+ )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:167:1: g_defaultStatment : a= 'default' ':' statements -> ^( G_DEFAULT[$a] statements ) ;
    public final BeeParser.g_defaultStatment_return g_defaultStatment() throws RecognitionException {
        BeeParser.g_defaultStatment_return retval = new BeeParser.g_defaultStatment_return();
        retval.start = input.LT(1);
        int g_defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal37=null;
        BeeParser.statements_return statements38 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:168:2: (a= 'default' ':' statements -> ^( G_DEFAULT[$a] statements ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:168:4: a= 'default' ':' statements
            {
            a=(Token)match(input,107,FOLLOW_107_in_g_defaultStatment553); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(a);

            char_literal37=(Token)match(input,106,FOLLOW_106_in_g_defaultStatment555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal37);

            pushFollow(FOLLOW_statements_in_g_defaultStatment557);
            statements38=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements38.getTree());


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
            // 168:31: -> ^( G_DEFAULT[$a] statements )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:168:34: ^( G_DEFAULT[$a] statements )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_DEFAULT, a), root_1);

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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:1: directive : 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) ;
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:10: ( 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:12: 'DIRECTIVE' Identifier ( StringLiteral )? ';'
            {
            string_literal39=(Token)match(input,108,FOLLOW_108_in_directive574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(string_literal39);

            Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_directive577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier40);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:36: ( StringLiteral )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==StringLiteral) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:37: StringLiteral
                    {
                    StringLiteral41=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_directive580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral41);


                    }
                    break;

            }

            char_literal42=(Token)match(input,100,FOLLOW_100_in_directive584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal42);



            // AST REWRITE
            // elements: StringLiteral, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 170:57: -> ^( DIRECTIVE Identifier ( StringLiteral )? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:60: ^( DIRECTIVE Identifier ( StringLiteral )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECTIVE, "DIRECTIVE"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:170:83: ( StringLiteral )?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:171:1: returnStatment : 'return' -> ^( RETURN ) ;
    public final BeeParser.returnStatment_return returnStatment() throws RecognitionException {
        BeeParser.returnStatment_return retval = new BeeParser.returnStatment_return();
        retval.start = input.LT(1);
        int returnStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal43=null;

        BeeCommonNodeTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:172:2: ( 'return' -> ^( RETURN ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:172:4: 'return'
            {
            string_literal43=(Token)match(input,109,FOLLOW_109_in_returnStatment605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(string_literal43);



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
            // 172:13: -> ^( RETURN )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:172:16: ^( RETURN )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:173:1: continueStatment : 'continue' -> ^( CONTINUE ) ;
    public final BeeParser.continueStatment_return continueStatment() throws RecognitionException {
        BeeParser.continueStatment_return retval = new BeeParser.continueStatment_return();
        retval.start = input.LT(1);
        int continueStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal44=null;

        BeeCommonNodeTree string_literal44_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:173:17: ( 'continue' -> ^( CONTINUE ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:173:19: 'continue'
            {
            string_literal44=(Token)match(input,110,FOLLOW_110_in_continueStatment618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(string_literal44);



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
            // 173:30: -> ^( CONTINUE )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:173:33: ^( CONTINUE )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:174:1: breakStatment : 'break' -> ^( BREAK ) ;
    public final BeeParser.breakStatment_return breakStatment() throws RecognitionException {
        BeeParser.breakStatment_return retval = new BeeParser.breakStatment_return();
        retval.start = input.LT(1);
        int breakStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal45=null;

        BeeCommonNodeTree string_literal45_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:174:15: ( 'break' -> ^( BREAK ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:174:17: 'break'
            {
            string_literal45=(Token)match(input,111,FOLLOW_111_in_breakStatment632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(string_literal45);



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
            // 174:25: -> ^( BREAK )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:174:28: ^( BREAK )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:176:1: messFunction options {backtrack=false; } : ({...}? textProcessFunction | functionCall[true] ';' );
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:179:2: ({...}? textProcessFunction | functionCall[true] ';' )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:179:4: {...}? textProcessFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    if ( !((isTextProcessFunction(input))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "messFunction", "isTextProcessFunction(input)");
                    }
                    pushFollow(FOLLOW_textProcessFunction_in_messFunction659);
                    textProcessFunction46=textProcessFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textProcessFunction46.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:180:6: functionCall[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_messFunction666);
                    functionCall47=functionCall(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall47.getTree());
                    char_literal48=(Token)match(input,100,FOLLOW_100_in_messFunction669); if (state.failed) return retval;
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:182:1: textProcessFunction : functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:4: functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock
            {
            pushFollow(FOLLOW_functionFullName_in_textProcessFunction680);
            functionFullName49=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName49.getTree());
            a=(Token)match(input,102,FOLLOW_102_in_textProcessFunction684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(a);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:27: ( exp ( ',' exp )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Identifier && LA11_0<=LEFT_BRACE)||(LA11_0>=ADD && LA11_0<=MINUS)||(LA11_0>=BOOLEAN && LA11_0<=DOUBLE)||LA11_0==102||LA11_0==120||LA11_0==123||LA11_0==125) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:28: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_textProcessFunction687);
                    exp50=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp50.getTree());
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:32: ( ',' exp )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==105) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:33: ',' exp
                    	    {
                    	    char_literal51=(Token)match(input,105,FOLLOW_105_in_textProcessFunction690); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_105.add(char_literal51);

                    	    pushFollow(FOLLOW_exp_in_textProcessFunction692);
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

            char_literal53=(Token)match(input,103,FOLLOW_103_in_textProcessFunction698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal53);

            pushFollow(FOLLOW_statmentBlock_in_textProcessFunction700);
            statmentBlock54=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock54.getTree());


            // AST REWRITE
            // elements: exp, statmentBlock, functionFullName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 184:63: -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:66: ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_PROCESS, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:184:116: ( exp )*
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:187:1: functionCall[boolean statmentCall] : functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:193:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:193:3: functionFullName a= '(' ( exp ( ',' exp )* )? ')'
            {
            pushFollow(FOLLOW_functionFullName_in_functionCall735);
            functionFullName55=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName55.getTree());
            a=(Token)match(input,102,FOLLOW_102_in_functionCall739); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(a);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:193:26: ( exp ( ',' exp )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Identifier && LA13_0<=LEFT_BRACE)||(LA13_0>=ADD && LA13_0<=MINUS)||(LA13_0>=BOOLEAN && LA13_0<=DOUBLE)||LA13_0==102||LA13_0==120||LA13_0==123||LA13_0==125) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:193:27: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_functionCall742);
                    exp56=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp56.getTree());
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:193:31: ( ',' exp )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==105) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:193:32: ',' exp
                    	    {
                    	    char_literal57=(Token)match(input,105,FOLLOW_105_in_functionCall745); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_105.add(char_literal57);

                    	    pushFollow(FOLLOW_exp_in_functionCall747);
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

            char_literal59=(Token)match(input,103,FOLLOW_103_in_functionCall753); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal59);



            // AST REWRITE
            // elements: exp, exp, functionFullName, functionFullName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 194:3: -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:194:22: ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:194:36: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_2);

                adaptor.addChild(root_2, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:194:68: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 195:3: -> ^( FUNCTION[$a] functionFullName ( exp )* )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:195:6: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:195:38: ( exp )*
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:199:1: statmentBlock : LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:200:2: ( LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:200:4: LEFT_BRACE ( statements )? RIGHT_BRACE
            {
            LEFT_BRACE60=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_statmentBlock802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(LEFT_BRACE60);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:200:15: ( statements )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Identifier||LA14_0==LEFT_BRACE||LA14_0==LEFT_TEXT_TOKEN||(LA14_0>=LEFT_TOKEN && LA14_0<=VAR)||LA14_0==101||(LA14_0>=108 && LA14_0<=112)||(LA14_0>=115 && LA14_0<=116)||(LA14_0>=125 && LA14_0<=126)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_statmentBlock804);
                    statements61=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statements.add(statements61.getTree());

                    }
                    break;

            }

            RIGHT_BRACE62=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_statmentBlock807); if (state.failed) return retval; 
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
            // 200:39: -> ^( SLIST ( statements )? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:200:42: ^( SLIST ( statements )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SLIST, "SLIST"), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:200:50: ( statements )?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:201:1: forStatment : 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) ;
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
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:202:2: ( 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:202:4: 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )?
            {
            string_literal63=(Token)match(input,112,FOLLOW_112_in_forStatment824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_112.add(string_literal63);

            char_literal64=(Token)match(input,102,FOLLOW_102_in_forStatment826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal64);

            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatment830); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            string_literal65=(Token)match(input,113,FOLLOW_113_in_forStatment832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal65);

            pushFollow(FOLLOW_exp_in_forStatment837);
            aaa=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(aaa.getTree());
            char_literal66=(Token)match(input,103,FOLLOW_103_in_forStatment839); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal66);

            pushFollow(FOLLOW_statmentBlock_in_forStatment846);
            c=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(c.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:202:66: ( 'elsefor' d= statmentBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==114) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:202:67: 'elsefor' d= statmentBlock
                    {
                    string_literal67=(Token)match(input,114,FOLLOW_114_in_forStatment850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal67);

                    pushFollow(FOLLOW_statmentBlock_in_forStatment854);
                    d=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(d.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: c, aaa, d, a
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
            // 203:3: -> ^( FOR $a $aaa $c ( $d)? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:203:6: ^( FOR $a $aaa $c ( $d)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                adaptor.addChild(root_1, stream_aaa.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:203:24: ( $d)?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:204:1: whileStament : 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) ;
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
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:205:2: ( 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:205:4: 'while' '(' a= condExp ')' statmentBlock
            {
            string_literal68=(Token)match(input,115,FOLLOW_115_in_whileStament889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(string_literal68);

            char_literal69=(Token)match(input,102,FOLLOW_102_in_whileStament891); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal69);

            pushFollow(FOLLOW_condExp_in_whileStament895);
            a=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(a.getTree());
            char_literal70=(Token)match(input,103,FOLLOW_103_in_whileStament897); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal70);

            pushFollow(FOLLOW_statmentBlock_in_whileStament900);
            statmentBlock71=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock71.getTree());


            // AST REWRITE
            // elements: statmentBlock, a
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
            // 205:45: -> ^( WHILE $a statmentBlock )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:205:48: ^( WHILE $a statmentBlock )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:207:1: ifStatment : 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) ;
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
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:2: ( 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:4: 'if' '(' condExp ')' l= statement ( 'else' n= statement )?
            {
            string_literal72=(Token)match(input,116,FOLLOW_116_in_ifStatment921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(string_literal72);

            char_literal73=(Token)match(input,102,FOLLOW_102_in_ifStatment923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal73);

            pushFollow(FOLLOW_condExp_in_ifStatment925);
            condExp74=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(condExp74.getTree());
            char_literal75=(Token)match(input,103,FOLLOW_103_in_ifStatment927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal75);

            pushFollow(FOLLOW_statement_in_ifStatment931);
            l=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(l.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:37: ( 'else' n= statement )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==117) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred29_Bee()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:38: 'else' n= statement
                    {
                    string_literal76=(Token)match(input,117,FOLLOW_117_in_ifStatment934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal76);

                    pushFollow(FOLLOW_statement_in_ifStatment938);
                    n=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(n.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: n, condExp, l
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
            // 208:61: -> ^( IF condExp $l ( $n)? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:63: ^( IF condExp $l ( $n)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_condExp.nextTree());
                adaptor.addChild(root_1, stream_l.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:79: ( $n)?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:210:1: constantsTextStatment : LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:211:2: ( LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:211:4: LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN
            {
            LEFT_TEXT_TOKEN77=(Token)match(input,LEFT_TEXT_TOKEN,FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment968); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_TEXT_TOKEN.add(LEFT_TEXT_TOKEN77);

            Identifier78=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantsTextStatment971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier78);

            RIGHT_TOKEN79=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_constantsTextStatment973); if (state.failed) return retval; 
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
            // 211:46: -> ^( TEXT_HOLDER Identifier )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:211:48: ^( TEXT_HOLDER Identifier )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:213:1: textStatment : ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) );
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
        RewriteRuleTokenStream stream_LEFT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_textVar=new RewriteRuleSubtreeStream(adaptor,"rule textVar");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:214:2: ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LEFT_TOKEN) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==118) ) {
                    alt17=2;
                }
                else if ( ((LA17_1>=Identifier && LA17_1<=LEFT_BRACE)||(LA17_1>=ADD && LA17_1<=MINUS)||(LA17_1>=BOOLEAN && LA17_1<=DOUBLE)||LA17_1==102||LA17_1==120||LA17_1==123||LA17_1==125) ) {
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:215:6: LEFT_TOKEN textVar RIGHT_TOKEN
                    {
                    LEFT_TOKEN80=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment1003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN80);

                    pushFollow(FOLLOW_textVar_in_textStatment1005);
                    textVar81=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar81.getTree());
                    RIGHT_TOKEN82=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment1007); if (state.failed) return retval; 
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
                    // 215:37: -> ^( HOLDER textVar )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:215:40: ^( HOLDER textVar )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:216:4: LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN
                    {
                    LEFT_TOKEN83=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment1020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN83);

                    string_literal84=(Token)match(input,118,FOLLOW_118_in_textStatment1022); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(string_literal84);

                    pushFollow(FOLLOW_textVar_in_textStatment1024);
                    textVar85=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar85.getTree());
                    char_literal86=(Token)match(input,103,FOLLOW_103_in_textStatment1026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_103.add(char_literal86);

                    RIGHT_TOKEN87=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment1027); if (state.failed) return retval; 
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
                    // 216:43: -> ^( HOLDER textVar SAFE_OUTPUT )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:216:46: ^( HOLDER textVar SAFE_OUTPUT )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:218:1: textVar : b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) ;
    public final BeeParser.textVar_return textVar() throws RecognitionException {
        BeeParser.textVar_return retval = new BeeParser.textVar_return();
        retval.start = input.LT(1);
        int textVar_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal88=null;
        BeeParser.exp_return b = null;

        BeeParser.textformat_return textformat89 = null;


        BeeCommonNodeTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_textformat=new RewriteRuleSubtreeStream(adaptor,"rule textformat");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:219:1: (b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:219:3: b= exp ( ',' textformat )?
            {
            pushFollow(FOLLOW_exp_in_textVar1048);
            b=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(b.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:219:10: ( ',' textformat )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==105) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:219:11: ',' textformat
                    {
                    char_literal88=(Token)match(input,105,FOLLOW_105_in_textVar1052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(char_literal88);

                    pushFollow(FOLLOW_textformat_in_textVar1054);
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
            // 219:30: -> ^( VAR_TEXT $b ( textformat )? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:219:33: ^( VAR_TEXT $b ( textformat )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_TEXT, "VAR_TEXT"), root_1);

                adaptor.addChild(root_1, stream_b.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:219:47: ( textformat )?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:221:1: textformat : (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) );
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
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:221:11: (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:222:1: fm= functionFullName ( '=' StringLiteral )?
                    {
                    pushFollow(FOLLOW_functionFullName_in_textformat1081);
                    fm=functionFullName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionFullName.add(fm.getTree());
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:222:21: ( '=' StringLiteral )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==119) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:222:22: '=' StringLiteral
                            {
                            char_literal90=(Token)match(input,119,FOLLOW_119_in_textformat1084); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_119.add(char_literal90);

                            StringLiteral91=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat1086); if (state.failed) return retval; 
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
                    // 222:42: -> ^( FM $fm ( StringLiteral )? )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:222:45: ^( FM $fm ( StringLiteral )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FM, "FM"), root_1);

                        adaptor.addChild(root_1, stream_fm.nextTree());
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:222:54: ( StringLiteral )?
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:223:3: StringLiteral
                    {
                    StringLiteral92=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat1105); if (state.failed) return retval; 
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
                    // 223:17: -> ^( DEFAULT_FM StringLiteral )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:223:20: ^( DEFAULT_FM StringLiteral )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:225:1: varDefine : a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleSubtreeStream stream_varAssignMent=new RewriteRuleSubtreeStream(adaptor,"rule varAssignMent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:227:2: (a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:227:4: a= VAR varAssignMent ( ',' varAssignMent )*
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_varDefine1128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(a);

            if ( state.backtracking==0 ) {
              if(isStrictMVC)	throw new MVCStrictException(a);
            }
            pushFollow(FOLLOW_varAssignMent_in_varDefine1131);
            varAssignMent93=varAssignMent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent93.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:227:75: ( ',' varAssignMent )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==105) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:227:76: ',' varAssignMent
            	    {
            	    char_literal94=(Token)match(input,105,FOLLOW_105_in_varDefine1134); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_105.add(char_literal94);

            	    pushFollow(FOLLOW_varAssignMent_in_varDefine1136);
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
            // 227:96: -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+
            {
                if ( !(stream_varAssignMent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varAssignMent.hasNext() ) {
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:227:98: ^( VAR_DEFINE[$a] varAssignMent )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:230:1: varAssignMent : (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) );
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
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:231:2: (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==119) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>=Identifier && LA22_2<=StringLiteral)||(LA22_2>=ADD && LA22_2<=MINUS)||(LA22_2>=BOOLEAN && LA22_2<=DOUBLE)||LA22_2==102||LA22_2==120||LA22_2==123||LA22_2==125) ) {
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

                            if ( (LA22_6==106) ) {
                                alt22=2;
                            }
                            else if ( (LA22_6==102||LA22_6==119||LA22_6==121) ) {
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
                        case 101:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 115:
                        case 116:
                        case 125:
                        case 126:
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
                else if ( (LA22_1==EOF||LA22_1==100||LA22_1==105) ) {
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:231:4: a= Identifier
                    {
                    a=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1164); if (state.failed) return retval; 
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
                    // 231:19: -> ^( ASSIGNMENT[$a] Identifier NULL )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:231:22: ^( ASSIGNMENT[$a] Identifier NULL )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:232:4: Identifier '=' exp
                    {
                    Identifier96=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier96);

                    char_literal97=(Token)match(input,119,FOLLOW_119_in_varAssignMent1187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(char_literal97);

                    pushFollow(FOLLOW_exp_in_varAssignMent1189);
                    exp98=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp98.getTree());


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
                    // 232:23: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:232:26: ^( ASSIGNMENT[$Identifier] Identifier exp )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:233:4: Identifier '=' statmentBlock
                    {
                    Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier99);

                    char_literal100=(Token)match(input,119,FOLLOW_119_in_varAssignMent1209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(char_literal100);

                    pushFollow(FOLLOW_statmentBlock_in_varAssignMent1211);
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
                    // 233:34: -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:233:39: ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:235:1: assignMent : Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) ;
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
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:236:2: ( Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:236:4: Identifier '=' exp
            {
            Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignMent1235); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier102);

            char_literal103=(Token)match(input,119,FOLLOW_119_in_assignMent1237); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal103);

            pushFollow(FOLLOW_exp_in_assignMent1240);
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
            // 236:25: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:236:28: ^( ASSIGNMENT[$Identifier] Identifier exp )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:238:1: varRef : ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) );
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:238:8: ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:238:10: {...}? Identifier
                    {
                    if ( !((input.LT(1).getText().startsWith("__V"))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "varRef", "input.LT(1).getText().startsWith(\"__V\")");
                    }
                    Identifier105=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1263); if (state.failed) return retval; 
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
                    // 238:66: -> ^( TEXT_VAR_REFER[$Identifier] Identifier )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:238:69: ^( TEXT_VAR_REFER[$Identifier] Identifier )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:6: Identifier ( varAttribute )* ( safeOutput )?
                    {
                    Identifier106=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier106);

                    if ( state.backtracking==0 ) {
                      if(Identifier106.getText().startsWith("__"))throw new RuntimeException("Can Not call this Variable star with __"); 
                    }
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:132: ( varAttribute )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=121 && LA23_0<=123)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:134: varAttribute
                    	    {
                    	    pushFollow(FOLLOW_varAttribute_in_varRef1287);
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

                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:149: ( safeOutput )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==120) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: safeOutput
                            {
                            pushFollow(FOLLOW_safeOutput_in_varRef1291);
                            safeOutput108=safeOutput();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_safeOutput.add(safeOutput108.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: Identifier, varAttribute, safeOutput
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 239:163: -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:166: ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_REFER, Identifier106), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:202: ( varAttribute )*
                        while ( stream_varAttribute.hasNext() ) {
                            adaptor.addChild(root_1, stream_varAttribute.nextTree());

                        }
                        stream_varAttribute.reset();
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:239:218: ( safeOutput )?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:242:1: safeOutput : '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) ;
    public final BeeParser.safeOutput_return safeOutput() throws RecognitionException {
        BeeParser.safeOutput_return retval = new BeeParser.safeOutput_return();
        retval.start = input.LT(1);
        int safeOutput_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal109=null;
        BeeParser.atom_return b = null;


        BeeCommonNodeTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:243:2: ( '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:243:4: '!' (b= atom )?
            {
            char_literal109=(Token)match(input,120,FOLLOW_120_in_safeOutput1323); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(char_literal109);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:243:9: (b= atom )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=Identifier && LA26_0<=LEFT_BRACE)||(LA26_0>=BOOLEAN && LA26_0<=DOUBLE)||LA26_0==102||LA26_0==123||LA26_0==125) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: b= atom
                    {
                    pushFollow(FOLLOW_atom_in_safeOutput1327);
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
            // 243:16: -> ^( SAFE_OUTPUT ( $b)? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:243:19: ^( SAFE_OUTPUT ( $b)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SAFE_OUTPUT, "SAFE_OUTPUT"), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:243:33: ( $b)?
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:246:1: varAttribute : ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) );
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
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:247:2: ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt27=1;
                }
                break;
            case 122:
                {
                alt27=2;
                }
                break;
            case 123:
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:247:4: '.' Identifier
                    {
                    char_literal110=(Token)match(input,121,FOLLOW_121_in_varAttribute1350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(char_literal110);

                    Identifier111=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1352); if (state.failed) return retval; 
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
                    // 247:19: -> ^( ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:247:22: ^( ATTR_NAME Identifier )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:248:4: '.~' Identifier
                    {
                    string_literal112=(Token)match(input,122,FOLLOW_122_in_varAttribute1366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(string_literal112);

                    Identifier113=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1368); if (state.failed) return retval; 
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
                    // 248:21: -> ^( VIRTUAL_ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:248:24: ^( VIRTUAL_ATTR_NAME Identifier )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:249:4: a= '[' exp ']'
                    {
                    a=(Token)match(input,123,FOLLOW_123_in_varAttribute1385); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(a);

                    pushFollow(FOLLOW_exp_in_varAttribute1387);
                    exp114=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp114.getTree());
                    char_literal115=(Token)match(input,124,FOLLOW_124_in_varAttribute1389); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(char_literal115);



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
                    // 249:18: -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:249:20: ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:252:1: exp : condExp ;
    public final BeeParser.exp_return exp() throws RecognitionException {
        BeeParser.exp_return retval = new BeeParser.exp_return();
        retval.start = input.LT(1);
        int exp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.condExp_return condExp116 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:252:5: ( condExp )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:252:8: condExp
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExp_in_exp1410);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:255:1: condExp : conditionalOrExpression ;
    public final BeeParser.condExp_return condExp() throws RecognitionException {
        BeeParser.condExp_return retval = new BeeParser.condExp_return();
        retval.start = input.LT(1);
        int condExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.conditionalOrExpression_return conditionalOrExpression117 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:255:9: ( conditionalOrExpression )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:255:11: conditionalOrExpression
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_condExp1421);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:257:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:258:5: ( conditionalAndExpression ( OR conditionalAndExpression )* )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:258:9: conditionalAndExpression ( OR conditionalAndExpression )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1439);
            conditionalAndExpression118=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression118.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:259:9: ( OR conditionalAndExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:259:10: OR conditionalAndExpression
            	    {
            	    OR119=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression1450); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR119_tree = (BeeCommonNodeTree)adaptor.create(OR119);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(OR119_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1453);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:263:1: conditionalAndExpression : condExpNotItem ( AND condExpNotItem )* ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:264:5: ( condExpNotItem ( AND condExpNotItem )* )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:264:9: condExpNotItem ( AND condExpNotItem )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1484);
            condExpNotItem121=condExpNotItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem121.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:265:9: ( AND condExpNotItem )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:265:10: AND condExpNotItem
            	    {
            	    AND122=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression1495); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND122_tree = (BeeCommonNodeTree)adaptor.create(AND122);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(AND122_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1498);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:268:1: condExpNotItem : ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) );
    public final BeeParser.condExpNotItem_return condExpNotItem() throws RecognitionException {
        BeeParser.condExpNotItem_return retval = new BeeParser.condExpNotItem_return();
        retval.start = input.LT(1);
        int condExpNotItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal125=null;
        BeeParser.condExpItem_return condExpItem124 = null;

        BeeParser.condExpItem_return condExpItem126 = null;


        BeeCommonNodeTree char_literal125_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_condExpItem=new RewriteRuleSubtreeStream(adaptor,"rule condExpItem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:269:2: ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=Identifier && LA30_0<=LEFT_BRACE)||(LA30_0>=ADD && LA30_0<=MINUS)||(LA30_0>=BOOLEAN && LA30_0<=DOUBLE)||LA30_0==102||LA30_0==123||LA30_0==125) ) {
                alt30=1;
            }
            else if ( (LA30_0==120) ) {
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:269:4: condExpItem
                    {
                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1523);
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
                    // 269:16: -> condExpItem
                    {
                        adaptor.addChild(root_0, stream_condExpItem.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:270:4: ( '!' ) condExpItem
                    {
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:270:4: ( '!' )
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:270:5: '!'
                    {
                    char_literal125=(Token)match(input,120,FOLLOW_120_in_condExpNotItem1532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(char_literal125);


                    }

                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1535);
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
                    // 270:22: -> ^( NOT condExpItem )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:270:25: ^( NOT condExpItem )
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:271:1: condExpItem : aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:2: ( aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:6: aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpItem1554);
            aexpr127=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr127.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:12: ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=EQUAL && LA32_0<=LESS_EQUAL)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr
                    {
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL )
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
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:15: a= EQUAL
                            {
                            a=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_condExpItem1561); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:24: a= NOT_EQUAL
                            {
                            a=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_condExpItem1566); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:37: a= LARGE
                            {
                            a=(Token)match(input,LARGE,FOLLOW_LARGE_in_condExpItem1571); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:46: a= LARGE_EQUAL
                            {
                            a=(Token)match(input,LARGE_EQUAL,FOLLOW_LARGE_EQUAL_in_condExpItem1576); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:61: a= LESS
                            {
                            a=(Token)match(input,LESS,FOLLOW_LESS_in_condExpItem1581); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:272:69: a= LESS_EQUAL
                            {
                            a=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_condExpItem1586); if (state.failed) return retval;
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
                    pushFollow(FOLLOW_aexpr_in_condExpItem1593);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:1: aexpr : mexpr ( (a= ADD | a= MINUS ) mexpr )* ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:7: ( mexpr ( (a= ADD | a= MINUS ) mexpr )* )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:9: mexpr ( (a= ADD | a= MINUS ) mexpr )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr1603);
            mexpr128=mexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr128.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:15: ( (a= ADD | a= MINUS ) mexpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=ADD && LA34_0<=MINUS)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:16: (a= ADD | a= MINUS ) mexpr
            	    {
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:16: (a= ADD | a= MINUS )
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
            	            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:17: a= ADD
            	            {
            	            a=(Token)match(input,ADD,FOLLOW_ADD_in_aexpr1609); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:273:24: a= MINUS
            	            {
            	            a=(Token)match(input,MINUS,FOLLOW_MINUS_in_aexpr1614); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr1618);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:1: mexpr : unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* ;
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:9: ( unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:17: unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_unaryAtom_in_mexpr1638);
            unaryAtom130=unaryAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom130.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:27: ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=MULTIP && LA36_0<=MOD)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:28: (a= MULTIP | a= DIV | a= MOD ) unaryAtom
            	    {
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:28: (a= MULTIP | a= DIV | a= MOD )
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
            	            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:29: a= MULTIP
            	            {
            	            a=(Token)match(input,MULTIP,FOLLOW_MULTIP_in_mexpr1644); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:39: a= DIV
            	            {
            	            a=(Token)match(input,DIV,FOLLOW_DIV_in_mexpr1649); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:274:46: a= MOD
            	            {
            	            a=(Token)match(input,MOD,FOLLOW_MOD_in_mexpr1654); if (state.failed) return retval;
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
            	    pushFollow(FOLLOW_unaryAtom_in_mexpr1659);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:275:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:275:6: ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json )
            int alt37=10;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:275:8: BOOLEAN
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    BOOLEAN132=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1668); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN132_tree = (BeeCommonNodeTree)adaptor.create(BOOLEAN132);
                    adaptor.addChild(root_0, BOOLEAN132_tree);
                    }

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:277:6: INT
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    INT133=(Token)match(input,INT,FOLLOW_INT_in_atom1677); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT133_tree = (BeeCommonNodeTree)adaptor.create(INT133);
                    adaptor.addChild(root_0, INT133_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:278:4: NULL
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    NULL134=(Token)match(input,NULL,FOLLOW_NULL_in_atom1682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL134_tree = (BeeCommonNodeTree)adaptor.create(NULL134);
                    adaptor.addChild(root_0, NULL134_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:279:4: DOUBLE
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    DOUBLE135=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE135_tree = (BeeCommonNodeTree)adaptor.create(DOUBLE135);
                    adaptor.addChild(root_0, DOUBLE135_tree);
                    }

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:280:4: a= StringLiteral
                    {
                    a=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_atom1694); if (state.failed) return retval; 
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
                    // 280:20: ->
                    {
                        adaptor.addChild(root_0, new BeeCommonNodeTree(new CommonToken(StringLiteral,BeetlUtil.getEscapeString((a!=null?a.getText():null)))));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:281:4: varRef
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_atom1703);
                    varRef136=varRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varRef136.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:282:4: '(' exp ')'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    char_literal137=(Token)match(input,102,FOLLOW_102_in_atom1709); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_atom1712);
                    exp138=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp138.getTree());
                    char_literal139=(Token)match(input,103,FOLLOW_103_in_atom1714); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:283:4: functionCall[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_atom1721);
                    functionCall140=functionCall(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall140.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:284:4: nativeMethod[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_atom1727);
                    nativeMethod141=nativeMethod(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod141.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:285:4: json
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_json_in_atom1733);
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:287:1: unaryAtom : ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom );
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
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:288:2: ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom )
            int alt38=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case StringLiteral:
            case LEFT_BRACE:
            case BOOLEAN:
            case INT:
            case NULL:
            case DOUBLE:
            case 102:
            case 123:
            case 125:
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:288:4: atom
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryAtom1744);
                    atom143=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom143.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:289:4: MINUS a= atom
                    {
                    MINUS144=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryAtom1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS144);

                    pushFollow(FOLLOW_atom_in_unaryAtom1754);
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
                    // 289:17: -> ^( NEGATOM atom )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:289:19: ^( NEGATOM atom )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:290:4: ADD atom
                    {
                    ADD145=(Token)match(input,ADD,FOLLOW_ADD_in_unaryAtom1766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ADD.add(ADD145);

                    pushFollow(FOLLOW_atom_in_unaryAtom1768);
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
                    // 290:13: -> atom
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
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:292:1: nativeMethod[boolean statmentCall] : a= '@' Identifier ( '.' Identifier )* ( classMutileExp )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) ;
    public final BeeParser.nativeMethod_return nativeMethod(boolean statmentCall) throws RecognitionException {
        BeeParser.nativeMethod_return retval = new BeeParser.nativeMethod_return();
        retval.start = input.LT(1);
        int nativeMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier147=null;
        Token char_literal148=null;
        Token Identifier149=null;
        BeeParser.classMutileExp_return classMutileExp150 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier147_tree=null;
        BeeCommonNodeTree char_literal148_tree=null;
        BeeCommonNodeTree Identifier149_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_classMutileExp=new RewriteRuleSubtreeStream(adaptor,"rule classMutileExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:292:37: (a= '@' Identifier ( '.' Identifier )* ( classMutileExp )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:292:38: a= '@' Identifier ( '.' Identifier )* ( classMutileExp )?
            {
            a=(Token)match(input,125,FOLLOW_125_in_nativeMethod1785); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_125.add(a);

            Identifier147=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier147);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:292:55: ( '.' Identifier )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==121) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==Identifier) ) {
                        int LA39_3 = input.LA(3);

                        if ( (LA39_3==EOF||LA39_3==RIGHT_BRACE||LA39_3==RIGHT_TOKEN||(LA39_3>=OR && LA39_3<=MOD)||LA39_3==100||LA39_3==103||(LA39_3>=105 && LA39_3<=106)||LA39_3==121||(LA39_3>=123 && LA39_3<=124)) ) {
                            alt39=1;
                        }


                    }


                }


                switch (alt39) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:292:56: '.' Identifier
            	    {
            	    char_literal148=(Token)match(input,121,FOLLOW_121_in_nativeMethod1790); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_121.add(char_literal148);

            	    Identifier149=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1792); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier149);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:292:73: ( classMutileExp )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==121||LA40_0==123) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: classMutileExp
                    {
                    pushFollow(FOLLOW_classMutileExp_in_nativeMethod1796);
                    classMutileExp150=classMutileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMutileExp.add(classMutileExp150.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              if(!openBackdoor||isStrictMVC) throw new MVCStrictException(a);
            }


            // AST REWRITE
            // elements: Identifier, classMutileExp, Identifier, classMutileExp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 293:4: -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:293:25: ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:293:39: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_2);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:293:60: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:293:72: ( classMutileExp )?
                if ( stream_classMutileExp.hasNext() ) {
                    adaptor.addChild(root_2, stream_classMutileExp.nextTree());

                }
                stream_classMutileExp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 294:4: -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:294:7: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:294:28: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:294:40: ( classMutileExp )?
                if ( stream_classMutileExp.hasNext() ) {
                    adaptor.addChild(root_1, stream_classMutileExp.nextTree());

                }
                stream_classMutileExp.reset();

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

    public static class classMutileExp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMutileExp"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:296:2: classMutileExp : classNextExp ( classNextExp | '.' Identifier )* ;
    public final BeeParser.classMutileExp_return classMutileExp() throws RecognitionException {
        BeeParser.classMutileExp_return retval = new BeeParser.classMutileExp_return();
        retval.start = input.LT(1);
        int classMutileExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal153=null;
        Token Identifier154=null;
        BeeParser.classNextExp_return classNextExp151 = null;

        BeeParser.classNextExp_return classNextExp152 = null;


        BeeCommonNodeTree char_literal153_tree=null;
        BeeCommonNodeTree Identifier154_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:297:2: ( classNextExp ( classNextExp | '.' Identifier )* )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:297:4: classNextExp ( classNextExp | '.' Identifier )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_classNextExp_in_classMutileExp1855);
            classNextExp151=classNextExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classNextExp151.getTree());
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:297:17: ( classNextExp | '.' Identifier )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==121) ) {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==Identifier) ) {
                        int LA41_4 = input.LA(3);

                        if ( (LA41_4==102) ) {
                            alt41=1;
                        }
                        else if ( (LA41_4==EOF||LA41_4==RIGHT_BRACE||LA41_4==RIGHT_TOKEN||(LA41_4>=OR && LA41_4<=MOD)||LA41_4==100||LA41_4==103||(LA41_4>=105 && LA41_4<=106)||LA41_4==121||(LA41_4>=123 && LA41_4<=124)) ) {
                            alt41=2;
                        }


                    }


                }
                else if ( (LA41_0==123) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:297:18: classNextExp
            	    {
            	    pushFollow(FOLLOW_classNextExp_in_classMutileExp1858);
            	    classNextExp152=classNextExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classNextExp152.getTree());

            	    }
            	    break;
            	case 2 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:297:32: '.' Identifier
            	    {
            	    char_literal153=(Token)match(input,121,FOLLOW_121_in_classMutileExp1861); if (state.failed) return retval;
            	    Identifier154=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMutileExp1864); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier154_tree = (BeeCommonNodeTree)adaptor.create(Identifier154);
            	    adaptor.addChild(root_0, Identifier154_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
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
            if ( state.backtracking>0 ) { memoize(input, 39, classMutileExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMutileExp"

    public static class classNextExp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classNextExp"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:298:2: classNextExp : ( classMethod | classArray );
    public final BeeParser.classNextExp_return classNextExp() throws RecognitionException {
        BeeParser.classNextExp_return retval = new BeeParser.classNextExp_return();
        retval.start = input.LT(1);
        int classNextExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.classMethod_return classMethod155 = null;

        BeeParser.classArray_return classArray156 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:299:2: ( classMethod | classArray )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==121) ) {
                alt42=1;
            }
            else if ( (LA42_0==123) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:299:5: classMethod
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_classMethod_in_classNextExp1877);
                    classMethod155=classMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classMethod155.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:299:17: classArray
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_classArray_in_classNextExp1879);
                    classArray156=classArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classArray156.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, classNextExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classNextExp"

    public static class classMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMethod"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:301:1: classMethod : '.' Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) ;
    public final BeeParser.classMethod_return classMethod() throws RecognitionException {
        BeeParser.classMethod_return retval = new BeeParser.classMethod_return();
        retval.start = input.LT(1);
        int classMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal157=null;
        Token Identifier158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token char_literal163=null;
        BeeParser.exp_return exp160 = null;

        BeeParser.exp_return exp162 = null;


        BeeCommonNodeTree char_literal157_tree=null;
        BeeCommonNodeTree Identifier158_tree=null;
        BeeCommonNodeTree char_literal159_tree=null;
        BeeCommonNodeTree char_literal161_tree=null;
        BeeCommonNodeTree char_literal163_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:2: ( '.' Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:4: '.' Identifier '(' ( exp ( ',' exp )* )? ')'
            {
            char_literal157=(Token)match(input,121,FOLLOW_121_in_classMethod1889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_121.add(char_literal157);

            Identifier158=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMethod1892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier158);

            char_literal159=(Token)match(input,102,FOLLOW_102_in_classMethod1894); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal159);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:24: ( exp ( ',' exp )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=Identifier && LA44_0<=LEFT_BRACE)||(LA44_0>=ADD && LA44_0<=MINUS)||(LA44_0>=BOOLEAN && LA44_0<=DOUBLE)||LA44_0==102||LA44_0==120||LA44_0==123||LA44_0==125) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:25: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_classMethod1897);
                    exp160=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp160.getTree());
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:29: ( ',' exp )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==105) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:30: ',' exp
                    	    {
                    	    char_literal161=(Token)match(input,105,FOLLOW_105_in_classMethod1900); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_105.add(char_literal161);

                    	    pushFollow(FOLLOW_exp_in_classMethod1902);
                    	    exp162=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp162.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal163=(Token)match(input,103,FOLLOW_103_in_classMethod1909); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal163);



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
            // 302:47: -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:49: ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_METHOD, Identifier158), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:302:88: ( exp )*
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
            if ( state.backtracking>0 ) { memoize(input, 41, classMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMethod"

    public static class classArray_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classArray"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:303:1: classArray : '[' exp ']' -> ^( CLASS_ARRAY exp ) ;
    public final BeeParser.classArray_return classArray() throws RecognitionException {
        BeeParser.classArray_return retval = new BeeParser.classArray_return();
        retval.start = input.LT(1);
        int classArray_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal164=null;
        Token char_literal166=null;
        BeeParser.exp_return exp165 = null;


        BeeCommonNodeTree char_literal164_tree=null;
        BeeCommonNodeTree char_literal166_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:304:2: ( '[' exp ']' -> ^( CLASS_ARRAY exp ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:304:4: '[' exp ']'
            {
            char_literal164=(Token)match(input,123,FOLLOW_123_in_classArray1930); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal164);

            pushFollow(FOLLOW_exp_in_classArray1932);
            exp165=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp165.getTree());
            char_literal166=(Token)match(input,124,FOLLOW_124_in_classArray1934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(char_literal166);



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
            // 304:16: -> ^( CLASS_ARRAY exp )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:304:19: ^( CLASS_ARRAY exp )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_ARRAY, "CLASS_ARRAY"), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 42, classArray_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classArray"

    public static class functionFullName_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionFullName"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:1: functionFullName : a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) ;
    public final BeeParser.functionFullName_return functionFullName() throws RecognitionException {
        BeeParser.functionFullName_return retval = new BeeParser.functionFullName_return();
        retval.start = input.LT(1);
        int functionFullName_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal167=null;
        Token Identifier168=null;

        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal167_tree=null;
        BeeCommonNodeTree Identifier168_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:18: (a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:19: a= Identifier ( '.' Identifier )?
            {
            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:32: ( '.' Identifier )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==121) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:33: '.' Identifier
                    {
                    char_literal167=(Token)match(input,121,FOLLOW_121_in_functionFullName1956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(char_literal167);

                    Identifier168=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier168);


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
            // 307:51: -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:54: ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION_FULL_NAME, a), root_1);

                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:307:80: ( Identifier )*
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
            if ( state.backtracking>0 ) { memoize(input, 43, functionFullName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionFullName"

    public static class switchStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatment"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:309:1: switchStatment : a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) ;
    public final BeeParser.switchStatment_return switchStatment() throws RecognitionException {
        BeeParser.switchStatment_return retval = new BeeParser.switchStatment_return();
        retval.start = input.LT(1);
        int switchStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token char_literal171=null;
        Token char_literal174=null;
        BeeParser.exp_return base = null;

        BeeParser.caseStatment_return caseStatment172 = null;

        BeeParser.defaultStatment_return defaultStatment173 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal169_tree=null;
        BeeCommonNodeTree char_literal170_tree=null;
        BeeCommonNodeTree char_literal171_tree=null;
        BeeCommonNodeTree char_literal174_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule caseStatment");
        RewriteRuleSubtreeStream stream_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:310:2: (a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:310:4: a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}'
            {
            a=(Token)match(input,126,FOLLOW_126_in_switchStatment1983); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(a);

            char_literal169=(Token)match(input,102,FOLLOW_102_in_switchStatment1985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal169);

            pushFollow(FOLLOW_exp_in_switchStatment1989);
            base=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(base.getTree());
            char_literal170=(Token)match(input,103,FOLLOW_103_in_switchStatment1991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(char_literal170);

            char_literal171=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_switchStatment1993); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal171);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:310:36: ( caseStatment )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==104) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: caseStatment
            	    {
            	    pushFollow(FOLLOW_caseStatment_in_switchStatment1995);
            	    caseStatment172=caseStatment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStatment.add(caseStatment172.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:310:50: ( defaultStatment )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==107) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:0:0: defaultStatment
                    {
                    pushFollow(FOLLOW_defaultStatment_in_switchStatment1998);
                    defaultStatment173=defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defaultStatment.add(defaultStatment173.getTree());

                    }
                    break;

            }

            char_literal174=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_switchStatment2001); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal174);



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
            // 311:3: -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:311:5: ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SWITCH, a), root_1);

                adaptor.addChild(root_1, stream_base.nextTree());
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:311:24: ( caseStatment )*
                while ( stream_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseStatment.nextTree());

                }
                stream_caseStatment.reset();
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:311:38: ( defaultStatment )?
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
            if ( state.backtracking>0 ) { memoize(input, 44, switchStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchStatment"

    public static class caseStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStatment"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:312:1: caseStatment : a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) ;
    public final BeeParser.caseStatment_return caseStatment() throws RecognitionException {
        BeeParser.caseStatment_return retval = new BeeParser.caseStatment_return();
        retval.start = input.LT(1);
        int caseStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal176=null;
        BeeParser.exp_return exp175 = null;

        BeeParser.statements_return statements177 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal176_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:313:2: (a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:313:4: a= 'case' exp ':' statements
            {
            a=(Token)match(input,104,FOLLOW_104_in_caseStatment2030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_104.add(a);

            pushFollow(FOLLOW_exp_in_caseStatment2032);
            exp175=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp175.getTree());
            char_literal176=(Token)match(input,106,FOLLOW_106_in_caseStatment2034); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal176);

            pushFollow(FOLLOW_statements_in_caseStatment2036);
            statements177=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements177.getTree());


            // AST REWRITE
            // elements: exp, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 313:32: -> ^( CASE[$a] exp statements )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:313:34: ^( CASE[$a] exp statements )
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
            if ( state.backtracking>0 ) { memoize(input, 45, caseStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStatment"

    public static class defaultStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStatment"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:314:1: defaultStatment : a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) ;
    public final BeeParser.defaultStatment_return defaultStatment() throws RecognitionException {
        BeeParser.defaultStatment_return retval = new BeeParser.defaultStatment_return();
        retval.start = input.LT(1);
        int defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal178=null;
        BeeParser.statements_return statements179 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal178_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:315:2: (a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) )
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:315:4: a= 'default' ':' statements
            {
            a=(Token)match(input,107,FOLLOW_107_in_defaultStatment2056); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(a);

            char_literal178=(Token)match(input,106,FOLLOW_106_in_defaultStatment2058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal178);

            pushFollow(FOLLOW_statements_in_defaultStatment2060);
            statements179=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements179.getTree());


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
            // 315:31: -> ^( DEFAULT[$a] statements )
            {
                // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:315:34: ^( DEFAULT[$a] statements )
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
            if ( state.backtracking>0 ) { memoize(input, 46, defaultStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStatment"

    public static class json_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "json"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:1: json : ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) );
    public final BeeParser.json_return json() throws RecognitionException {
        BeeParser.json_return retval = new BeeParser.json_return();
        retval.start = input.LT(1);
        int json_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal184=null;
        Token char_literal185=null;
        Token char_literal187=null;
        Token char_literal189=null;
        BeeParser.exp_return exp181 = null;

        BeeParser.exp_return exp183 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue186 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue188 = null;


        BeeCommonNodeTree char_literal180_tree=null;
        BeeCommonNodeTree char_literal182_tree=null;
        BeeCommonNodeTree char_literal184_tree=null;
        BeeCommonNodeTree char_literal185_tree=null;
        BeeCommonNodeTree char_literal187_tree=null;
        BeeCommonNodeTree char_literal189_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_jsonKeyValue=new RewriteRuleSubtreeStream(adaptor,"rule jsonKeyValue");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:6: ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==123) ) {
                alt52=1;
            }
            else if ( (LA52_0==LEFT_BRACE) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:8: '[' ( exp ( ',' exp )* )? ']'
                    {
                    char_literal180=(Token)match(input,123,FOLLOW_123_in_json2076); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal180);

                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:12: ( exp ( ',' exp )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=Identifier && LA49_0<=LEFT_BRACE)||(LA49_0>=ADD && LA49_0<=MINUS)||(LA49_0>=BOOLEAN && LA49_0<=DOUBLE)||LA49_0==102||LA49_0==120||LA49_0==123||LA49_0==125) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:13: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_json2079);
                            exp181=exp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exp.add(exp181.getTree());
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:18: ( ',' exp )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==105) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:19: ',' exp
                            	    {
                            	    char_literal182=(Token)match(input,105,FOLLOW_105_in_json2083); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_105.add(char_literal182);

                            	    pushFollow(FOLLOW_exp_in_json2085);
                            	    exp183=exp();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_exp.add(exp183.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal184=(Token)match(input,124,FOLLOW_124_in_json2091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(char_literal184);



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
                    // 316:35: -> ^( JSONARRAY ( exp )* )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:37: ^( JSONARRAY ( exp )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONARRAY, "JSONARRAY"), root_1);

                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:316:49: ( exp )*
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:4: '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}'
                    {
                    char_literal185=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_json2104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal185);

                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:8: ( jsonKeyValue ( ',' jsonKeyValue )* )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=Identifier && LA51_0<=StringLiteral)) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:9: jsonKeyValue ( ',' jsonKeyValue )*
                            {
                            pushFollow(FOLLOW_jsonKeyValue_in_json2107);
                            jsonKeyValue186=jsonKeyValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue186.getTree());
                            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:22: ( ',' jsonKeyValue )*
                            loop50:
                            do {
                                int alt50=2;
                                int LA50_0 = input.LA(1);

                                if ( (LA50_0==105) ) {
                                    alt50=1;
                                }


                                switch (alt50) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:23: ',' jsonKeyValue
                            	    {
                            	    char_literal187=(Token)match(input,105,FOLLOW_105_in_json2110); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_105.add(char_literal187);

                            	    pushFollow(FOLLOW_jsonKeyValue_in_json2112);
                            	    jsonKeyValue188=jsonKeyValue();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue188.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop50;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal189=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_json2118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal189);



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
                    // 317:48: -> ^( JSONMAP ( jsonKeyValue )* )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:50: ^( JSONMAP ( jsonKeyValue )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONMAP, "JSONMAP"), root_1);

                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:317:60: ( jsonKeyValue )*
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
            if ( state.backtracking>0 ) { memoize(input, 47, json_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "json"

    public static class jsonKeyValue_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jsonKeyValue"
    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:319:1: jsonKeyValue : ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) );
    public final BeeParser.jsonKeyValue_return jsonKeyValue() throws RecognitionException {
        BeeParser.jsonKeyValue_return retval = new BeeParser.jsonKeyValue_return();
        retval.start = input.LT(1);
        int jsonKeyValue_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token StringLiteral190=null;
        Token char_literal191=null;
        Token Identifier193=null;
        Token char_literal194=null;
        BeeParser.exp_return exp192 = null;

        BeeParser.exp_return exp195 = null;


        BeeCommonNodeTree StringLiteral190_tree=null;
        BeeCommonNodeTree char_literal191_tree=null;
        BeeCommonNodeTree Identifier193_tree=null;
        BeeCommonNodeTree char_literal194_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:320:2: ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==StringLiteral) ) {
                alt53=1;
            }
            else if ( (LA53_0==Identifier) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:320:4: StringLiteral ':' exp
                    {
                    StringLiteral190=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_jsonKeyValue2136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral190);

                    char_literal191=(Token)match(input,106,FOLLOW_106_in_jsonKeyValue2138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal191);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue2140);
                    exp192=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp192.getTree());


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
                    // 320:26: -> ^( JSONKEYVALUE StringLiteral exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:320:28: ^( JSONKEYVALUE StringLiteral exp )
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
                    // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:321:4: Identifier ':' exp
                    {
                    Identifier193=(Token)match(input,Identifier,FOLLOW_Identifier_in_jsonKeyValue2156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier193);

                    char_literal194=(Token)match(input,106,FOLLOW_106_in_jsonKeyValue2158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal194);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue2160);
                    exp195=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp195.getTree());


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
                    // 321:23: -> ^( JSONKEYVALUE Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:321:25: ^( JSONKEYVALUE Identifier exp )
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
            if ( state.backtracking>0 ) { memoize(input, 48, jsonKeyValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jsonKeyValue"

    // $ANTLR start synpred29_Bee
    public final void synpred29_Bee_fragment() throws RecognitionException {   
        BeeParser.statement_return n = null;


        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:38: ( 'else' n= statement )
        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:208:38: 'else' n= statement
        {
        match(input,117,FOLLOW_117_in_synpred29_Bee934); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred29_Bee938);
        n=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Bee

    // $ANTLR start synpred36_Bee
    public final void synpred36_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:232:4: ( Identifier '=' exp )
        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:232:4: Identifier '=' exp
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred36_Bee1185); if (state.failed) return ;
        match(input,119,FOLLOW_119_in_synpred36_Bee1187); if (state.failed) return ;
        pushFollow(FOLLOW_exp_in_synpred36_Bee1189);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Bee

    // $ANTLR start synpred37_Bee
    public final void synpred37_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:238:10: ({...}? Identifier )
        // E:\\lijz\\javamonkey\\git\\xdfbeetl1.25\\src\\org\\bee\\tl\\core\\Bee.g:238:10: {...}? Identifier
        {
        if ( !((input.LT(1).getText().startsWith("__V"))) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_Bee", "input.LT(1).getText().startsWith(\"__V\")");
        }
        match(input,Identifier,FOLLOW_Identifier_in_synpred37_Bee1263); if (state.failed) return ;

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
        "\1\62\2\uffff\1\146\16\uffff";
    static final String DFA3_maxS =
        "\1\176\2\uffff\1\171\16\uffff";
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
            return "140:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive );";
        }
    }
    static final String DFA37_eotS =
        "\16\uffff";
    static final String DFA37_eofS =
        "\6\uffff\1\12\6\uffff\1\12";
    static final String DFA37_minS =
        "\1\62\5\uffff\1\65\4\uffff\1\62\1\uffff\1\65";
    static final String DFA37_maxS =
        "\1\175\5\uffff\1\174\4\uffff\1\62\1\uffff\1\174";
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
            return "275:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );";
        }
    }
 

    public static final BitSet FOLLOW_statements_in_prog329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements340 = new BitSet(new long[]{0x0354000000000002L,0x6019F02000000000L});
    public static final BitSet FOLLOW_constantsTextStatment_in_statement349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDefine_in_statement356 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_statement358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignMent_in_statement364 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textStatment_in_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatment_in_statement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatment_in_statement382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStament_in_statement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statmentBlock_in_statement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messFunction_in_statement397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatment_in_statement402 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_statement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatment_in_statement410 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_statement412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatment_in_statement418 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_statement420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatment_in_statement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switchStatment_in_statement431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_statement436 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_statement439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_statement446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_g_switchStatment461 = new BitSet(new long[]{0x0010000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_g_switchStatment464 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_g_switchStatment468 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_g_switchStatment470 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_g_switchStatment474 = new BitSet(new long[]{0x0020000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_g_caseStatment_in_g_switchStatment476 = new BitSet(new long[]{0x0020000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_g_defaultStatment_in_g_switchStatment479 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_g_switchStatment482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_g_caseStatment514 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_g_caseStatment516 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_105_in_g_caseStatment519 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_g_caseStatment521 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
    public static final BitSet FOLLOW_106_in_g_caseStatment525 = new BitSet(new long[]{0x0354000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statements_in_g_caseStatment527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_g_defaultStatment553 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_g_defaultStatment555 = new BitSet(new long[]{0x0354000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statements_in_g_defaultStatment557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_directive574 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_directive577 = new BitSet(new long[]{0x0008000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_directive580 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_directive584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_returnStatment605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_continueStatment618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_breakStatment632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProcessFunction_in_messFunction659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_messFunction666 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_messFunction669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textProcessFunction680 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_textProcessFunction684 = new BitSet(new long[]{0x001C000000000000L,0x290000C00000078CL});
    public static final BitSet FOLLOW_exp_in_textProcessFunction687 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_105_in_textProcessFunction690 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_textProcessFunction692 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_103_in_textProcessFunction698 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_textProcessFunction700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_functionCall735 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_functionCall739 = new BitSet(new long[]{0x001C000000000000L,0x290000C00000078CL});
    public static final BitSet FOLLOW_exp_in_functionCall742 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_105_in_functionCall745 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_functionCall747 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_103_in_functionCall753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_statmentBlock802 = new BitSet(new long[]{0x0374000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statements_in_statmentBlock804 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_statmentBlock807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_forStatment824 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_forStatment826 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_forStatment830 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_forStatment832 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_forStatment837 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_forStatment839 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment846 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_forStatment850 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_whileStament889 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_whileStament891 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_condExp_in_whileStament895 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_whileStament897 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_whileStament900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ifStatment921 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ifStatment923 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_condExp_in_ifStatment925 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ifStatment927 = new BitSet(new long[]{0x0354000000000000L,0x6039F02000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment931 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ifStatment934 = new BitSet(new long[]{0x0354000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment968 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_constantsTextStatment971 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_constantsTextStatment973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment1003 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_textVar_in_textStatment1005 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment1020 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_textStatment1022 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_textVar_in_textStatment1024 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_textStatment1026 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_textVar1048 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_textVar1052 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_textformat_in_textVar1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textformat1081 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_textformat1084 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDefine1128 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine1131 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_varDefine1134 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine1136 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1185 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_varAssignMent1187 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_varAssignMent1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1207 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_varAssignMent1209 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_varAssignMent1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignMent1235 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_assignMent1237 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_assignMent1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1282 = new BitSet(new long[]{0x0000000000000002L,0x0F00000000000000L});
    public static final BitSet FOLLOW_varAttribute_in_varRef1287 = new BitSet(new long[]{0x0000000000000002L,0x0F00000000000000L});
    public static final BitSet FOLLOW_safeOutput_in_varRef1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_safeOutput1323 = new BitSet(new long[]{0x001C000000000002L,0x2800004000000780L});
    public static final BitSet FOLLOW_atom_in_safeOutput1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_varAttribute1350 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_varAttribute1366 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_varAttribute1385 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_varAttribute1387 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_varAttribute1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExp_in_exp1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_condExp1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1439 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression1450 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1453 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1484 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression1495 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1498 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_condExpNotItem1532 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1554 = new BitSet(new long[]{0xF000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_EQUAL_in_condExpItem1561 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_NOT_EQUAL_in_condExpItem1566 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_LARGE_in_condExpItem1571 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_LARGE_EQUAL_in_condExpItem1576 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_LESS_in_condExpItem1581 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_LESS_EQUAL_in_condExpItem1586 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1603 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ADD_in_aexpr1609 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_MINUS_in_aexpr1614 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_mexpr_in_aexpr1618 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_MULTIP_in_mexpr1644 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_DIV_in_mexpr1649 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_MOD_in_mexpr1654 = new BitSet(new long[]{0x001C000000000000L,0x280000400000078CL});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1659 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_atom1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_atom1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_atom1709 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_atom1712 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_atom1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atom1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_atom1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_json_in_atom1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryAtom1750 = new BitSet(new long[]{0x001C000000000000L,0x2800004000000780L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryAtom1766 = new BitSet(new long[]{0x001C000000000000L,0x2800004000000780L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_nativeMethod1785 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1787 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
    public static final BitSet FOLLOW_121_in_nativeMethod1790 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1792 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
    public static final BitSet FOLLOW_classMutileExp_in_nativeMethod1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classNextExp_in_classMutileExp1855 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
    public static final BitSet FOLLOW_classNextExp_in_classMutileExp1858 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
    public static final BitSet FOLLOW_121_in_classMutileExp1861 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_classMutileExp1864 = new BitSet(new long[]{0x0000000000000002L,0x0A00000000000000L});
    public static final BitSet FOLLOW_classMethod_in_classNextExp1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classArray_in_classNextExp1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_classMethod1889 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_classMethod1892 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_classMethod1894 = new BitSet(new long[]{0x001C000000000000L,0x290000C00000078CL});
    public static final BitSet FOLLOW_exp_in_classMethod1897 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_105_in_classMethod1900 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_classMethod1902 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_103_in_classMethod1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_classArray1930 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_classArray1932 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_classArray1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1953 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_functionFullName1956 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_switchStatment1983 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_switchStatment1985 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_switchStatment1989 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_switchStatment1991 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_switchStatment1993 = new BitSet(new long[]{0x0020000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_caseStatment_in_switchStatment1995 = new BitSet(new long[]{0x0020000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_defaultStatment_in_switchStatment1998 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_switchStatment2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_caseStatment2030 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_caseStatment2032 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_caseStatment2034 = new BitSet(new long[]{0x0354000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statements_in_caseStatment2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_defaultStatment2056 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_defaultStatment2058 = new BitSet(new long[]{0x0354000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statements_in_defaultStatment2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_json2076 = new BitSet(new long[]{0x001C000000000000L,0x390000400000078CL});
    public static final BitSet FOLLOW_exp_in_json2079 = new BitSet(new long[]{0x0000000000000000L,0x1000020000000000L});
    public static final BitSet FOLLOW_105_in_json2083 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_json2085 = new BitSet(new long[]{0x0000000000000000L,0x1000020000000000L});
    public static final BitSet FOLLOW_124_in_json2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_json2104 = new BitSet(new long[]{0x002C000000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json2107 = new BitSet(new long[]{0x0020000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_json2110 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json2112 = new BitSet(new long[]{0x0020000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_json2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_jsonKeyValue2136 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_jsonKeyValue2138 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_jsonKeyValue2156 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_jsonKeyValue2158 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_synpred29_Bee934 = new BitSet(new long[]{0x0354000000000000L,0x6019F02000000000L});
    public static final BitSet FOLLOW_statement_in_synpred29_Bee938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred36_Bee1185 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_synpred36_Bee1187 = new BitSet(new long[]{0x001C000000000000L,0x290000400000078CL});
    public static final BitSet FOLLOW_exp_in_synpred36_Bee1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred37_Bee1263 = new BitSet(new long[]{0x0000000000000002L});

}