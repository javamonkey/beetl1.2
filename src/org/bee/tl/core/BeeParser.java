// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g 2013-04-17 10:24:17

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR_DEFINE", "VAR_REFER", "ASSIGNMENT", "HOLDER", "TEXT_HOLDER", "FOR", "VAR_TEXT", "FM", "DEFAULT_FM", "SLIST", "IF", "EXP", "COND_EXP", "FUNCTION", "TEXT_PROCESS", "ATTR_NAME", "VIRTUAL_ATTR_NAME", "MAP_LIST_INDEX", "BREAK", "CONTINUE", "RETURN", "NOT", "SWITCH", "CASE", "DEFAULT", "JSON", "JSONARRAY", "JSONMAP", "JSONKEYVALUE", "CLASS_STATIC_FUNCTION", "CLASS_FUNCTION", "CLASS_METHOD", "VARIABLE_VAR_REFER", "TEXT_VAR_REFER", "MISSING_VARIABLE_VAR_REFER", "FUNCTION_FULL_NAME", "SAFE_OUTPUT", "DIRECT_CALL", "NEGATOM", "WHILE", "DIRECTIVE", "Identifier", "StringLiteral", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_TEXT_TOKEN", "RIGHT_TOKEN", "LEFT_TOKEN", "VAR", "OR", "AND", "EQUAL", "NOT_EQUAL", "LARGE", "LARGE_EQUAL", "LESS", "LESS_EQUAL", "ADD", "MINUS", "MULTIP", "DIV", "MOD", "BOOLEAN", "INT", "NULL", "DOUBLE", "ID_START", "Comment", "LineComment", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "DecimalLiteral", "HexIntegerLiteral", "NumericLiteral", "ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", "UnicodeDigit", "UnicodeConnectorPunctuation", "UnicodeCombiningMark", "WhiteSpace", "';'", "'DIRECTIVE'", "'return'", "'continue'", "'break'", "'('", "','", "')'", "'for'", "'in '", "'elsefor'", "'while'", "'if'", "'else'", "'!('", "'='", "'!'", "'.'", "'.~'", "'['", "']'", "'@'", "'switch'", "'case'", "':'", "'default'"
    };
    public static final int EOF=-1;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int JSON=29;
    public static final int JSONARRAY=30;
    public static final int JSONMAP=31;
    public static final int JSONKEYVALUE=32;
    public static final int CLASS_STATIC_FUNCTION=33;
    public static final int CLASS_FUNCTION=34;
    public static final int CLASS_METHOD=35;
    public static final int VARIABLE_VAR_REFER=36;
    public static final int TEXT_VAR_REFER=37;
    public static final int MISSING_VARIABLE_VAR_REFER=38;
    public static final int FUNCTION_FULL_NAME=39;
    public static final int SAFE_OUTPUT=40;
    public static final int DIRECT_CALL=41;
    public static final int NEGATOM=42;
    public static final int WHILE=43;
    public static final int DIRECTIVE=44;
    public static final int Identifier=45;
    public static final int StringLiteral=46;
    public static final int LEFT_BRACE=47;
    public static final int RIGHT_BRACE=48;
    public static final int LEFT_TEXT_TOKEN=49;
    public static final int RIGHT_TOKEN=50;
    public static final int LEFT_TOKEN=51;
    public static final int VAR=52;
    public static final int OR=53;
    public static final int AND=54;
    public static final int EQUAL=55;
    public static final int NOT_EQUAL=56;
    public static final int LARGE=57;
    public static final int LARGE_EQUAL=58;
    public static final int LESS=59;
    public static final int LESS_EQUAL=60;
    public static final int ADD=61;
    public static final int MINUS=62;
    public static final int MULTIP=63;
    public static final int DIV=64;
    public static final int MOD=65;
    public static final int BOOLEAN=66;
    public static final int INT=67;
    public static final int NULL=68;
    public static final int DOUBLE=69;
    public static final int ID_START=70;
    public static final int Comment=71;
    public static final int LineComment=72;
    public static final int DoubleStringCharacter=73;
    public static final int SingleStringCharacter=74;
    public static final int EscapeSequence=75;
    public static final int CharacterEscapeSequence=76;
    public static final int HexEscapeSequence=77;
    public static final int UnicodeEscapeSequence=78;
    public static final int SingleEscapeCharacter=79;
    public static final int NonEscapeCharacter=80;
    public static final int EscapeCharacter=81;
    public static final int DecimalDigit=82;
    public static final int HexDigit=83;
    public static final int DecimalLiteral=84;
    public static final int HexIntegerLiteral=85;
    public static final int NumericLiteral=86;
    public static final int ExponentPart=87;
    public static final int IdentifierStart=88;
    public static final int IdentifierPart=89;
    public static final int UnicodeLetter=90;
    public static final int UnicodeDigit=91;
    public static final int UnicodeConnectorPunctuation=92;
    public static final int UnicodeCombiningMark=93;
    public static final int WhiteSpace=94;

    // delegates
    // delegators


        public BeeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BeeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[117+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BeeParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g"; }


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
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:133:1: prog : ( statements )? EOF ;
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
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:133:6: ( ( statements )? EOF )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:133:8: ( statements )? EOF
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:133:8: ( statements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Identifier||LA1_0==LEFT_BRACE||LA1_0==LEFT_TEXT_TOKEN||(LA1_0>=LEFT_TOKEN && LA1_0<=VAR)||(LA1_0>=96 && LA1_0<=99)||LA1_0==103||(LA1_0>=106 && LA1_0<=107)||(LA1_0>=116 && LA1_0<=117)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_prog304);
                    statements1=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

                    }
                    break;

            }

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog307); if (state.failed) return retval;

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
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:134:1: statements : ( statement )+ ;
    public final BeeParser.statements_return statements() throws RecognitionException {
        BeeParser.statements_return retval = new BeeParser.statements_return();
        retval.start = input.LT(1);
        int statements_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.statement_return statement3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:134:12: ( ( statement )+ )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:134:13: ( statement )+
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:134:13: ( statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==LEFT_BRACE||LA2_0==LEFT_TEXT_TOKEN||(LA2_0>=LEFT_TOKEN && LA2_0<=VAR)||(LA2_0>=96 && LA2_0<=99)||LA2_0==103||(LA2_0>=106 && LA2_0<=107)||(LA2_0>=116 && LA2_0<=117)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements315);
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
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:135:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | nativeMethod[true] ';' | directive );
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
        Token char_literal23=null;
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

        BeeParser.nativeMethod_return nativeMethod22 = null;

        BeeParser.directive_return directive24 = null;


        BeeCommonNodeTree char_literal6_tree=null;
        BeeCommonNodeTree char_literal8_tree=null;
        BeeCommonNodeTree char_literal16_tree=null;
        BeeCommonNodeTree char_literal18_tree=null;
        BeeCommonNodeTree char_literal20_tree=null;
        BeeCommonNodeTree char_literal23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:136:2: ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | nativeMethod[true] ';' | directive )
            int alt3=15;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:136:4: constantsTextStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_constantsTextStatment_in_statement324);
                    constantsTextStatment4=constantsTextStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantsTextStatment4.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:137:6: varDefine ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varDefine_in_statement331);
                    varDefine5=varDefine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDefine5.getTree());
                    char_literal6=(Token)match(input,95,FOLLOW_95_in_statement333); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:138:4: assignMent ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_assignMent_in_statement339);
                    assignMent7=assignMent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignMent7.getTree());
                    char_literal8=(Token)match(input,95,FOLLOW_95_in_statement341); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:139:4: textStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_textStatment_in_statement347);
                    textStatment9=textStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textStatment9.getTree());

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:140:4: ifStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatment_in_statement352);
                    ifStatment10=ifStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatment10.getTree());

                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:141:4: forStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatment_in_statement357);
                    forStatment11=forStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatment11.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:142:4: whileStament
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStament_in_statement362);
                    whileStament12=whileStament();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStament12.getTree());

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:143:4: statmentBlock
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_statmentBlock_in_statement367);
                    statmentBlock13=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statmentBlock13.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:144:4: messFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_messFunction_in_statement372);
                    messFunction14=messFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, messFunction14.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:145:4: continueStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatment_in_statement377);
                    continueStatment15=continueStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatment15.getTree());
                    char_literal16=(Token)match(input,95,FOLLOW_95_in_statement379); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:146:4: breakStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatment_in_statement385);
                    breakStatment17=breakStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatment17.getTree());
                    char_literal18=(Token)match(input,95,FOLLOW_95_in_statement387); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:147:4: returnStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatment_in_statement393);
                    returnStatment19=returnStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatment19.getTree());
                    char_literal20=(Token)match(input,95,FOLLOW_95_in_statement395); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:148:4: switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatment_in_statement401);
                    switchStatment21=switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatment21.getTree());

                    }
                    break;
                case 14 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:149:4: nativeMethod[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_statement406);
                    nativeMethod22=nativeMethod(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod22.getTree());
                    char_literal23=(Token)match(input,95,FOLLOW_95_in_statement409); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:150:4: directive
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_directive_in_statement416);
                    directive24=directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, directive24.getTree());

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

    public static class directive_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:1: directive : 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) ;
    public final BeeParser.directive_return directive() throws RecognitionException {
        BeeParser.directive_return retval = new BeeParser.directive_return();
        retval.start = input.LT(1);
        int directive_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal25=null;
        Token Identifier26=null;
        Token StringLiteral27=null;
        Token char_literal28=null;

        BeeCommonNodeTree string_literal25_tree=null;
        BeeCommonNodeTree Identifier26_tree=null;
        BeeCommonNodeTree StringLiteral27_tree=null;
        BeeCommonNodeTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:10: ( 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:12: 'DIRECTIVE' Identifier ( StringLiteral )? ';'
            {
            string_literal25=(Token)match(input,96,FOLLOW_96_in_directive430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_96.add(string_literal25);

            Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_directive433); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier26);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:36: ( StringLiteral )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==StringLiteral) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:37: StringLiteral
                    {
                    StringLiteral27=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_directive436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral27);


                    }
                    break;

            }

            char_literal28=(Token)match(input,95,FOLLOW_95_in_directive440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(char_literal28);



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
            // 156:57: -> ^( DIRECTIVE Identifier ( StringLiteral )? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:60: ^( DIRECTIVE Identifier ( StringLiteral )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECTIVE, "DIRECTIVE"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:156:83: ( StringLiteral )?
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
            if ( state.backtracking>0 ) { memoize(input, 4, directive_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "directive"

    public static class returnStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:157:1: returnStatment : 'return' -> ^( RETURN ) ;
    public final BeeParser.returnStatment_return returnStatment() throws RecognitionException {
        BeeParser.returnStatment_return retval = new BeeParser.returnStatment_return();
        retval.start = input.LT(1);
        int returnStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal29=null;

        BeeCommonNodeTree string_literal29_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:158:2: ( 'return' -> ^( RETURN ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:158:4: 'return'
            {
            string_literal29=(Token)match(input,97,FOLLOW_97_in_returnStatment461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_97.add(string_literal29);



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
            // 158:13: -> ^( RETURN )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:158:16: ^( RETURN )
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
            if ( state.backtracking>0 ) { memoize(input, 5, returnStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnStatment"

    public static class continueStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:159:1: continueStatment : 'continue' -> ^( CONTINUE ) ;
    public final BeeParser.continueStatment_return continueStatment() throws RecognitionException {
        BeeParser.continueStatment_return retval = new BeeParser.continueStatment_return();
        retval.start = input.LT(1);
        int continueStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal30=null;

        BeeCommonNodeTree string_literal30_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:159:17: ( 'continue' -> ^( CONTINUE ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:159:19: 'continue'
            {
            string_literal30=(Token)match(input,98,FOLLOW_98_in_continueStatment474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(string_literal30);



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
            // 159:30: -> ^( CONTINUE )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:159:33: ^( CONTINUE )
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
            if ( state.backtracking>0 ) { memoize(input, 6, continueStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStatment"

    public static class breakStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:160:1: breakStatment : 'break' -> ^( BREAK ) ;
    public final BeeParser.breakStatment_return breakStatment() throws RecognitionException {
        BeeParser.breakStatment_return retval = new BeeParser.breakStatment_return();
        retval.start = input.LT(1);
        int breakStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal31=null;

        BeeCommonNodeTree string_literal31_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:160:15: ( 'break' -> ^( BREAK ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:160:17: 'break'
            {
            string_literal31=(Token)match(input,99,FOLLOW_99_in_breakStatment488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(string_literal31);



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
            // 160:25: -> ^( BREAK )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:160:28: ^( BREAK )
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
            if ( state.backtracking>0 ) { memoize(input, 7, breakStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStatment"

    public static class messFunction_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "messFunction"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:162:1: messFunction options {backtrack=false; } : ({...}? textProcessFunction | functionCall[true] ';' );
    public final BeeParser.messFunction_return messFunction() throws RecognitionException {
        BeeParser.messFunction_return retval = new BeeParser.messFunction_return();
        retval.start = input.LT(1);
        int messFunction_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal34=null;
        BeeParser.textProcessFunction_return textProcessFunction32 = null;

        BeeParser.functionCall_return functionCall33 = null;


        BeeCommonNodeTree char_literal34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:165:2: ({...}? textProcessFunction | functionCall[true] ';' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Identifier) ) {
                int LA5_1 = input.LA(2);

                if ( ((isTextProcessFunction(input))) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:165:4: {...}? textProcessFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    if ( !((isTextProcessFunction(input))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "messFunction", "isTextProcessFunction(input)");
                    }
                    pushFollow(FOLLOW_textProcessFunction_in_messFunction515);
                    textProcessFunction32=textProcessFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textProcessFunction32.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:166:6: functionCall[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_messFunction522);
                    functionCall33=functionCall(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall33.getTree());
                    char_literal34=(Token)match(input,95,FOLLOW_95_in_messFunction525); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal34_tree = (BeeCommonNodeTree)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 8, messFunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "messFunction"

    public static class textProcessFunction_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textProcessFunction"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:168:1: textProcessFunction : functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) ;
    public final BeeParser.textProcessFunction_return textProcessFunction() throws RecognitionException {
        BeeParser.textProcessFunction_return retval = new BeeParser.textProcessFunction_return();
        retval.start = input.LT(1);
        int textProcessFunction_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal37=null;
        Token char_literal39=null;
        BeeParser.functionFullName_return functionFullName35 = null;

        BeeParser.exp_return exp36 = null;

        BeeParser.exp_return exp38 = null;

        BeeParser.statmentBlock_return statmentBlock40 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal37_tree=null;
        BeeCommonNodeTree char_literal39_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:4: functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock
            {
            pushFollow(FOLLOW_functionFullName_in_textProcessFunction536);
            functionFullName35=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName35.getTree());
            a=(Token)match(input,100,FOLLOW_100_in_textProcessFunction540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(a);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:27: ( exp ( ',' exp )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Identifier && LA7_0<=LEFT_BRACE)||(LA7_0>=ADD && LA7_0<=MINUS)||(LA7_0>=BOOLEAN && LA7_0<=DOUBLE)||LA7_0==100||LA7_0==111||LA7_0==114||LA7_0==116) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:28: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_textProcessFunction543);
                    exp36=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp36.getTree());
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:32: ( ',' exp )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==101) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:33: ',' exp
                    	    {
                    	    char_literal37=(Token)match(input,101,FOLLOW_101_in_textProcessFunction546); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_101.add(char_literal37);

                    	    pushFollow(FOLLOW_exp_in_textProcessFunction548);
                    	    exp38=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal39=(Token)match(input,102,FOLLOW_102_in_textProcessFunction554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal39);

            pushFollow(FOLLOW_statmentBlock_in_textProcessFunction556);
            statmentBlock40=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock40.getTree());


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
            // 170:63: -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:66: ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_PROCESS, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:170:116: ( exp )*
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
            if ( state.backtracking>0 ) { memoize(input, 9, textProcessFunction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textProcessFunction"

    public static class functionCall_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:173:1: functionCall[boolean statmentCall] : functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) ;
    public final BeeParser.functionCall_return functionCall(boolean statmentCall) throws RecognitionException {
        BeeParser.functionCall_return retval = new BeeParser.functionCall_return();
        retval.start = input.LT(1);
        int functionCall_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal43=null;
        Token char_literal45=null;
        BeeParser.functionFullName_return functionFullName41 = null;

        BeeParser.exp_return exp42 = null;

        BeeParser.exp_return exp44 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal43_tree=null;
        BeeCommonNodeTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:179:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:179:3: functionFullName a= '(' ( exp ( ',' exp )* )? ')'
            {
            pushFollow(FOLLOW_functionFullName_in_functionCall591);
            functionFullName41=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName41.getTree());
            a=(Token)match(input,100,FOLLOW_100_in_functionCall595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(a);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:179:26: ( exp ( ',' exp )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Identifier && LA9_0<=LEFT_BRACE)||(LA9_0>=ADD && LA9_0<=MINUS)||(LA9_0>=BOOLEAN && LA9_0<=DOUBLE)||LA9_0==100||LA9_0==111||LA9_0==114||LA9_0==116) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:179:27: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_functionCall598);
                    exp42=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp42.getTree());
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:179:31: ( ',' exp )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==101) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:179:32: ',' exp
                    	    {
                    	    char_literal43=(Token)match(input,101,FOLLOW_101_in_functionCall601); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_101.add(char_literal43);

                    	    pushFollow(FOLLOW_exp_in_functionCall603);
                    	    exp44=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal45=(Token)match(input,102,FOLLOW_102_in_functionCall609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal45);



            // AST REWRITE
            // elements: functionFullName, exp, exp, functionFullName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 180:3: -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:180:22: ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:180:36: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_2);

                adaptor.addChild(root_2, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:180:68: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 181:3: -> ^( FUNCTION[$a] functionFullName ( exp )* )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:181:6: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:181:38: ( exp )*
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
            if ( state.backtracking>0 ) { memoize(input, 10, functionCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class statmentBlock_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statmentBlock"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:185:1: statmentBlock : LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) ;
    public final BeeParser.statmentBlock_return statmentBlock() throws RecognitionException {
        BeeParser.statmentBlock_return retval = new BeeParser.statmentBlock_return();
        retval.start = input.LT(1);
        int statmentBlock_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_BRACE46=null;
        Token RIGHT_BRACE48=null;
        BeeParser.statements_return statements47 = null;


        BeeCommonNodeTree LEFT_BRACE46_tree=null;
        BeeCommonNodeTree RIGHT_BRACE48_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:186:2: ( LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:186:4: LEFT_BRACE ( statements )? RIGHT_BRACE
            {
            LEFT_BRACE46=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_statmentBlock658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(LEFT_BRACE46);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:186:15: ( statements )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier||LA10_0==LEFT_BRACE||LA10_0==LEFT_TEXT_TOKEN||(LA10_0>=LEFT_TOKEN && LA10_0<=VAR)||(LA10_0>=96 && LA10_0<=99)||LA10_0==103||(LA10_0>=106 && LA10_0<=107)||(LA10_0>=116 && LA10_0<=117)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_statmentBlock660);
                    statements47=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statements.add(statements47.getTree());

                    }
                    break;

            }

            RIGHT_BRACE48=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_statmentBlock663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(RIGHT_BRACE48);



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
            // 186:39: -> ^( SLIST ( statements )? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:186:42: ^( SLIST ( statements )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SLIST, "SLIST"), root_1);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:186:50: ( statements )?
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
            if ( state.backtracking>0 ) { memoize(input, 11, statmentBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statmentBlock"

    public static class forStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:187:1: forStatment : 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) ;
    public final BeeParser.forStatment_return forStatment() throws RecognitionException {
        BeeParser.forStatment_return retval = new BeeParser.forStatment_return();
        retval.start = input.LT(1);
        int forStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token string_literal49=null;
        Token char_literal50=null;
        Token string_literal51=null;
        Token char_literal52=null;
        Token string_literal53=null;
        BeeParser.exp_return aaa = null;

        BeeParser.statmentBlock_return c = null;

        BeeParser.statmentBlock_return d = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree string_literal49_tree=null;
        BeeCommonNodeTree char_literal50_tree=null;
        BeeCommonNodeTree string_literal51_tree=null;
        BeeCommonNodeTree char_literal52_tree=null;
        BeeCommonNodeTree string_literal53_tree=null;
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:188:2: ( 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:188:4: 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )?
            {
            string_literal49=(Token)match(input,103,FOLLOW_103_in_forStatment680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(string_literal49);

            char_literal50=(Token)match(input,100,FOLLOW_100_in_forStatment682); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal50);

            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatment686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            string_literal51=(Token)match(input,104,FOLLOW_104_in_forStatment688); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_104.add(string_literal51);

            pushFollow(FOLLOW_exp_in_forStatment693);
            aaa=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(aaa.getTree());
            char_literal52=(Token)match(input,102,FOLLOW_102_in_forStatment695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal52);

            pushFollow(FOLLOW_statmentBlock_in_forStatment702);
            c=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(c.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:188:66: ( 'elsefor' d= statmentBlock )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==105) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:188:67: 'elsefor' d= statmentBlock
                    {
                    string_literal53=(Token)match(input,105,FOLLOW_105_in_forStatment706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(string_literal53);

                    pushFollow(FOLLOW_statmentBlock_in_forStatment710);
                    d=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(d.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: aaa, d, a, c
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
            // 189:3: -> ^( FOR $a $aaa $c ( $d)? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:189:6: ^( FOR $a $aaa $c ( $d)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                adaptor.addChild(root_1, stream_aaa.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:189:24: ( $d)?
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
            if ( state.backtracking>0 ) { memoize(input, 12, forStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forStatment"

    public static class whileStament_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStament"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:190:1: whileStament : 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) ;
    public final BeeParser.whileStament_return whileStament() throws RecognitionException {
        BeeParser.whileStament_return retval = new BeeParser.whileStament_return();
        retval.start = input.LT(1);
        int whileStament_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        BeeParser.condExp_return a = null;

        BeeParser.statmentBlock_return statmentBlock57 = null;


        BeeCommonNodeTree string_literal54_tree=null;
        BeeCommonNodeTree char_literal55_tree=null;
        BeeCommonNodeTree char_literal56_tree=null;
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:191:2: ( 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:191:4: 'while' '(' a= condExp ')' statmentBlock
            {
            string_literal54=(Token)match(input,106,FOLLOW_106_in_whileStament745); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal54);

            char_literal55=(Token)match(input,100,FOLLOW_100_in_whileStament747); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal55);

            pushFollow(FOLLOW_condExp_in_whileStament751);
            a=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(a.getTree());
            char_literal56=(Token)match(input,102,FOLLOW_102_in_whileStament753); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal56);

            pushFollow(FOLLOW_statmentBlock_in_whileStament756);
            statmentBlock57=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock57.getTree());


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
            // 191:45: -> ^( WHILE $a statmentBlock )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:191:48: ^( WHILE $a statmentBlock )
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
            if ( state.backtracking>0 ) { memoize(input, 13, whileStament_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileStament"

    public static class ifStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:193:1: ifStatment : 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) ;
    public final BeeParser.ifStatment_return ifStatment() throws RecognitionException {
        BeeParser.ifStatment_return retval = new BeeParser.ifStatment_return();
        retval.start = input.LT(1);
        int ifStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token string_literal62=null;
        BeeParser.statement_return l = null;

        BeeParser.statement_return n = null;

        BeeParser.condExp_return condExp60 = null;


        BeeCommonNodeTree string_literal58_tree=null;
        BeeCommonNodeTree char_literal59_tree=null;
        BeeCommonNodeTree char_literal61_tree=null;
        BeeCommonNodeTree string_literal62_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:2: ( 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:4: 'if' '(' condExp ')' l= statement ( 'else' n= statement )?
            {
            string_literal58=(Token)match(input,107,FOLLOW_107_in_ifStatment777); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal58);

            char_literal59=(Token)match(input,100,FOLLOW_100_in_ifStatment779); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal59);

            pushFollow(FOLLOW_condExp_in_ifStatment781);
            condExp60=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(condExp60.getTree());
            char_literal61=(Token)match(input,102,FOLLOW_102_in_ifStatment783); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal61);

            pushFollow(FOLLOW_statement_in_ifStatment787);
            l=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(l.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:37: ( 'else' n= statement )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==108) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred24_Bee()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:38: 'else' n= statement
                    {
                    string_literal62=(Token)match(input,108,FOLLOW_108_in_ifStatment790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(string_literal62);

                    pushFollow(FOLLOW_statement_in_ifStatment794);
                    n=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(n.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: condExp, l, n
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
            // 194:61: -> ^( IF condExp $l ( $n)? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:63: ^( IF condExp $l ( $n)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_condExp.nextTree());
                adaptor.addChild(root_1, stream_l.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:79: ( $n)?
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
            if ( state.backtracking>0 ) { memoize(input, 14, ifStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatment"

    public static class constantsTextStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantsTextStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:196:1: constantsTextStatment : LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) ;
    public final BeeParser.constantsTextStatment_return constantsTextStatment() throws RecognitionException {
        BeeParser.constantsTextStatment_return retval = new BeeParser.constantsTextStatment_return();
        retval.start = input.LT(1);
        int constantsTextStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_TEXT_TOKEN63=null;
        Token Identifier64=null;
        Token RIGHT_TOKEN65=null;

        BeeCommonNodeTree LEFT_TEXT_TOKEN63_tree=null;
        BeeCommonNodeTree Identifier64_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN65_tree=null;
        RewriteRuleTokenStream stream_LEFT_TEXT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TEXT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:197:2: ( LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:197:4: LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN
            {
            LEFT_TEXT_TOKEN63=(Token)match(input,LEFT_TEXT_TOKEN,FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_TEXT_TOKEN.add(LEFT_TEXT_TOKEN63);

            Identifier64=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantsTextStatment827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier64);

            RIGHT_TOKEN65=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_constantsTextStatment829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN65);



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
            // 197:46: -> ^( TEXT_HOLDER Identifier )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:197:48: ^( TEXT_HOLDER Identifier )
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
            if ( state.backtracking>0 ) { memoize(input, 15, constantsTextStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "constantsTextStatment"

    public static class textStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:199:1: textStatment : ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) );
    public final BeeParser.textStatment_return textStatment() throws RecognitionException {
        BeeParser.textStatment_return retval = new BeeParser.textStatment_return();
        retval.start = input.LT(1);
        int textStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_TOKEN66=null;
        Token RIGHT_TOKEN68=null;
        Token LEFT_TOKEN69=null;
        Token string_literal70=null;
        Token char_literal72=null;
        Token RIGHT_TOKEN73=null;
        BeeParser.textVar_return textVar67 = null;

        BeeParser.textVar_return textVar71 = null;


        BeeCommonNodeTree LEFT_TOKEN66_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN68_tree=null;
        BeeCommonNodeTree LEFT_TOKEN69_tree=null;
        BeeCommonNodeTree string_literal70_tree=null;
        BeeCommonNodeTree char_literal72_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN73_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_LEFT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_textVar=new RewriteRuleSubtreeStream(adaptor,"rule textVar");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:200:2: ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LEFT_TOKEN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==109) ) {
                    alt13=2;
                }
                else if ( ((LA13_1>=Identifier && LA13_1<=LEFT_BRACE)||(LA13_1>=ADD && LA13_1<=MINUS)||(LA13_1>=BOOLEAN && LA13_1<=DOUBLE)||LA13_1==100||LA13_1==111||LA13_1==114||LA13_1==116) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:201:6: LEFT_TOKEN textVar RIGHT_TOKEN
                    {
                    LEFT_TOKEN66=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN66);

                    pushFollow(FOLLOW_textVar_in_textStatment861);
                    textVar67=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar67.getTree());
                    RIGHT_TOKEN68=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN68);



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
                    // 201:37: -> ^( HOLDER textVar )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:201:40: ^( HOLDER textVar )
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:202:4: LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN
                    {
                    LEFT_TOKEN69=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN69);

                    string_literal70=(Token)match(input,109,FOLLOW_109_in_textStatment878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(string_literal70);

                    pushFollow(FOLLOW_textVar_in_textStatment880);
                    textVar71=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar71.getTree());
                    char_literal72=(Token)match(input,102,FOLLOW_102_in_textStatment882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_102.add(char_literal72);

                    RIGHT_TOKEN73=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN73);



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
                    // 202:43: -> ^( HOLDER textVar SAFE_OUTPUT )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:202:46: ^( HOLDER textVar SAFE_OUTPUT )
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
            if ( state.backtracking>0 ) { memoize(input, 16, textStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textStatment"

    public static class textVar_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textVar"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:204:1: textVar : b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) ;
    public final BeeParser.textVar_return textVar() throws RecognitionException {
        BeeParser.textVar_return retval = new BeeParser.textVar_return();
        retval.start = input.LT(1);
        int textVar_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal74=null;
        BeeParser.exp_return b = null;

        BeeParser.textformat_return textformat75 = null;


        BeeCommonNodeTree char_literal74_tree=null;
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_textformat=new RewriteRuleSubtreeStream(adaptor,"rule textformat");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:205:1: (b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:205:3: b= exp ( ',' textformat )?
            {
            pushFollow(FOLLOW_exp_in_textVar904);
            b=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(b.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:205:10: ( ',' textformat )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==101) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:205:11: ',' textformat
                    {
                    char_literal74=(Token)match(input,101,FOLLOW_101_in_textVar908); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(char_literal74);

                    pushFollow(FOLLOW_textformat_in_textVar910);
                    textformat75=textformat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textformat.add(textformat75.getTree());

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
            // 205:30: -> ^( VAR_TEXT $b ( textformat )? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:205:33: ^( VAR_TEXT $b ( textformat )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_TEXT, "VAR_TEXT"), root_1);

                adaptor.addChild(root_1, stream_b.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:205:47: ( textformat )?
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
            if ( state.backtracking>0 ) { memoize(input, 17, textVar_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textVar"

    public static class textformat_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "textformat"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:207:1: textformat : (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) );
    public final BeeParser.textformat_return textformat() throws RecognitionException {
        BeeParser.textformat_return retval = new BeeParser.textformat_return();
        retval.start = input.LT(1);
        int textformat_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal76=null;
        Token StringLiteral77=null;
        Token StringLiteral78=null;
        BeeParser.functionFullName_return fm = null;


        BeeCommonNodeTree char_literal76_tree=null;
        BeeCommonNodeTree StringLiteral77_tree=null;
        BeeCommonNodeTree StringLiteral78_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:207:11: (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Identifier) ) {
                alt16=1;
            }
            else if ( (LA16_0==StringLiteral) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:208:1: fm= functionFullName ( '=' StringLiteral )?
                    {
                    pushFollow(FOLLOW_functionFullName_in_textformat937);
                    fm=functionFullName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionFullName.add(fm.getTree());
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:208:21: ( '=' StringLiteral )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==110) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:208:22: '=' StringLiteral
                            {
                            char_literal76=(Token)match(input,110,FOLLOW_110_in_textformat940); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_110.add(char_literal76);

                            StringLiteral77=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat942); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral77);


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
                    // 208:42: -> ^( FM $fm ( StringLiteral )? )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:208:45: ^( FM $fm ( StringLiteral )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FM, "FM"), root_1);

                        adaptor.addChild(root_1, stream_fm.nextTree());
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:208:54: ( StringLiteral )?
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:209:3: StringLiteral
                    {
                    StringLiteral78=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral78);



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
                    // 209:17: -> ^( DEFAULT_FM StringLiteral )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:209:20: ^( DEFAULT_FM StringLiteral )
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
            if ( state.backtracking>0 ) { memoize(input, 18, textformat_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "textformat"

    public static class varDefine_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDefine"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:211:1: varDefine : a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ ;
    public final BeeParser.varDefine_return varDefine() throws RecognitionException {
        BeeParser.varDefine_return retval = new BeeParser.varDefine_return();
        retval.start = input.LT(1);
        int varDefine_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal80=null;
        BeeParser.varAssignMent_return varAssignMent79 = null;

        BeeParser.varAssignMent_return varAssignMent81 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_varAssignMent=new RewriteRuleSubtreeStream(adaptor,"rule varAssignMent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:213:2: (a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:213:4: a= VAR varAssignMent ( ',' varAssignMent )*
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_varDefine984); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(a);

            if ( state.backtracking==0 ) {
              if(isStrictMVC)	throw new MVCStrictException(a);
            }
            pushFollow(FOLLOW_varAssignMent_in_varDefine987);
            varAssignMent79=varAssignMent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent79.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:213:75: ( ',' varAssignMent )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==101) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:213:76: ',' varAssignMent
            	    {
            	    char_literal80=(Token)match(input,101,FOLLOW_101_in_varDefine990); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_101.add(char_literal80);

            	    pushFollow(FOLLOW_varAssignMent_in_varDefine992);
            	    varAssignMent81=varAssignMent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent81.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // 213:96: -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+
            {
                if ( !(stream_varAssignMent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varAssignMent.hasNext() ) {
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:213:98: ^( VAR_DEFINE[$a] varAssignMent )
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
            if ( state.backtracking>0 ) { memoize(input, 19, varDefine_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDefine"

    public static class varAssignMent_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAssignMent"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:216:1: varAssignMent : (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) );
    public final BeeParser.varAssignMent_return varAssignMent() throws RecognitionException {
        BeeParser.varAssignMent_return retval = new BeeParser.varAssignMent_return();
        retval.start = input.LT(1);
        int varAssignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier82=null;
        Token char_literal83=null;
        Token Identifier85=null;
        Token char_literal86=null;
        BeeParser.exp_return exp84 = null;

        BeeParser.statmentBlock_return statmentBlock87 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier82_tree=null;
        BeeCommonNodeTree char_literal83_tree=null;
        BeeCommonNodeTree Identifier85_tree=null;
        BeeCommonNodeTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:217:2: (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Identifier) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==110) ) {
                    int LA18_2 = input.LA(3);

                    if ( ((LA18_2>=Identifier && LA18_2<=StringLiteral)||(LA18_2>=ADD && LA18_2<=MINUS)||(LA18_2>=BOOLEAN && LA18_2<=DOUBLE)||LA18_2==100||LA18_2==111||LA18_2==114||LA18_2==116) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==LEFT_BRACE) ) {
                        switch ( input.LA(4) ) {
                        case StringLiteral:
                            {
                            alt18=2;
                            }
                            break;
                        case Identifier:
                            {
                            int LA18_6 = input.LA(5);

                            if ( (LA18_6==119) ) {
                                alt18=2;
                            }
                            else if ( (LA18_6==100||LA18_6==110||LA18_6==112) ) {
                                alt18=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RIGHT_BRACE:
                            {
                            int LA18_7 = input.LA(5);

                            if ( (synpred31_Bee()) ) {
                                alt18=2;
                            }
                            else if ( (true) ) {
                                alt18=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 7, input);

                                throw nvae;
                            }
                            }
                            break;
                        case LEFT_BRACE:
                        case LEFT_TEXT_TOKEN:
                        case LEFT_TOKEN:
                        case VAR:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 103:
                        case 106:
                        case 107:
                        case 116:
                        case 117:
                            {
                            alt18=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1==EOF||LA18_1==95||LA18_1==101) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:217:4: a= Identifier
                    {
                    a=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1020); if (state.failed) return retval; 
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
                    // 217:19: -> ^( ASSIGNMENT[$a] Identifier NULL )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:217:22: ^( ASSIGNMENT[$a] Identifier NULL )
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:218:4: Identifier '=' exp
                    {
                    Identifier82=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1041); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier82);

                    char_literal83=(Token)match(input,110,FOLLOW_110_in_varAssignMent1043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(char_literal83);

                    pushFollow(FOLLOW_exp_in_varAssignMent1045);
                    exp84=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp84.getTree());


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
                    // 218:23: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:218:26: ^( ASSIGNMENT[$Identifier] Identifier exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier82), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:219:4: Identifier '=' statmentBlock
                    {
                    Identifier85=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier85);

                    char_literal86=(Token)match(input,110,FOLLOW_110_in_varAssignMent1065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(char_literal86);

                    pushFollow(FOLLOW_statmentBlock_in_varAssignMent1067);
                    statmentBlock87=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock87.getTree());


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
                    // 219:34: -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:219:39: ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier85), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 20, varAssignMent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAssignMent"

    public static class assignMent_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignMent"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:221:1: assignMent : Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) ;
    public final BeeParser.assignMent_return assignMent() throws RecognitionException {
        BeeParser.assignMent_return retval = new BeeParser.assignMent_return();
        retval.start = input.LT(1);
        int assignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier88=null;
        Token char_literal89=null;
        BeeParser.exp_return exp90 = null;


        BeeCommonNodeTree Identifier88_tree=null;
        BeeCommonNodeTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:222:2: ( Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:222:4: Identifier '=' exp
            {
            Identifier88=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignMent1091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier88);

            char_literal89=(Token)match(input,110,FOLLOW_110_in_assignMent1093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(char_literal89);

            pushFollow(FOLLOW_exp_in_assignMent1096);
            exp90=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp90.getTree());


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
            // 222:25: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:222:28: ^( ASSIGNMENT[$Identifier] Identifier exp )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier88), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 21, assignMent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignMent"

    public static class varRef_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varRef"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:224:1: varRef : ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) );
    public final BeeParser.varRef_return varRef() throws RecognitionException {
        BeeParser.varRef_return retval = new BeeParser.varRef_return();
        retval.start = input.LT(1);
        int varRef_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier91=null;
        Token Identifier92=null;
        BeeParser.varAttribute_return varAttribute93 = null;

        BeeParser.safeOutput_return safeOutput94 = null;


        BeeCommonNodeTree Identifier91_tree=null;
        BeeCommonNodeTree Identifier92_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_varAttribute=new RewriteRuleSubtreeStream(adaptor,"rule varAttribute");
        RewriteRuleSubtreeStream stream_safeOutput=new RewriteRuleSubtreeStream(adaptor,"rule safeOutput");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:224:8: ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Identifier) ) {
                int LA21_1 = input.LA(2);

                if ( ((synpred32_Bee()&&(input.LT(1).getText().startsWith("__V")))) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:224:10: {...}? Identifier
                    {
                    if ( !((input.LT(1).getText().startsWith("__V"))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "varRef", "input.LT(1).getText().startsWith(\"__V\")");
                    }
                    Identifier91=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier91);



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
                    // 224:66: -> ^( TEXT_VAR_REFER[$Identifier] Identifier )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:224:69: ^( TEXT_VAR_REFER[$Identifier] Identifier )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_VAR_REFER, Identifier91), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:6: Identifier ( varAttribute )* ( safeOutput )?
                    {
                    Identifier92=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier92);

                    if ( state.backtracking==0 ) {
                      if(Identifier92.getText().startsWith("__"))throw new RuntimeException("Can Not call this Variable star with __"); 
                    }
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:132: ( varAttribute )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=112 && LA19_0<=114)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:134: varAttribute
                    	    {
                    	    pushFollow(FOLLOW_varAttribute_in_varRef1143);
                    	    varAttribute93=varAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_varAttribute.add(varAttribute93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:149: ( safeOutput )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==111) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: safeOutput
                            {
                            pushFollow(FOLLOW_safeOutput_in_varRef1147);
                            safeOutput94=safeOutput();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_safeOutput.add(safeOutput94.getTree());

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
                    // 225:163: -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:166: ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_REFER, Identifier92), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:202: ( varAttribute )*
                        while ( stream_varAttribute.hasNext() ) {
                            adaptor.addChild(root_1, stream_varAttribute.nextTree());

                        }
                        stream_varAttribute.reset();
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:225:218: ( safeOutput )?
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
            if ( state.backtracking>0 ) { memoize(input, 22, varRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varRef"

    public static class safeOutput_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeOutput"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:228:1: safeOutput : '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) ;
    public final BeeParser.safeOutput_return safeOutput() throws RecognitionException {
        BeeParser.safeOutput_return retval = new BeeParser.safeOutput_return();
        retval.start = input.LT(1);
        int safeOutput_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal95=null;
        BeeParser.atom_return b = null;


        BeeCommonNodeTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:229:2: ( '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:229:4: '!' (b= atom )?
            {
            char_literal95=(Token)match(input,111,FOLLOW_111_in_safeOutput1179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(char_literal95);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:229:9: (b= atom )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=Identifier && LA22_0<=LEFT_BRACE)||(LA22_0>=BOOLEAN && LA22_0<=DOUBLE)||LA22_0==100||LA22_0==114||LA22_0==116) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: b= atom
                    {
                    pushFollow(FOLLOW_atom_in_safeOutput1183);
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
            // 229:16: -> ^( SAFE_OUTPUT ( $b)? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:229:19: ^( SAFE_OUTPUT ( $b)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SAFE_OUTPUT, "SAFE_OUTPUT"), root_1);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:229:33: ( $b)?
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
            if ( state.backtracking>0 ) { memoize(input, 23, safeOutput_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeOutput"

    public static class varAttribute_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAttribute"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:232:1: varAttribute : ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) );
    public final BeeParser.varAttribute_return varAttribute() throws RecognitionException {
        BeeParser.varAttribute_return retval = new BeeParser.varAttribute_return();
        retval.start = input.LT(1);
        int varAttribute_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal96=null;
        Token Identifier97=null;
        Token string_literal98=null;
        Token Identifier99=null;
        Token char_literal101=null;
        BeeParser.exp_return exp100 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal96_tree=null;
        BeeCommonNodeTree Identifier97_tree=null;
        BeeCommonNodeTree string_literal98_tree=null;
        BeeCommonNodeTree Identifier99_tree=null;
        BeeCommonNodeTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:233:2: ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt23=1;
                }
                break;
            case 113:
                {
                alt23=2;
                }
                break;
            case 114:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:233:4: '.' Identifier
                    {
                    char_literal96=(Token)match(input,112,FOLLOW_112_in_varAttribute1206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(char_literal96);

                    Identifier97=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier97);



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
                    // 233:19: -> ^( ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:233:22: ^( ATTR_NAME Identifier )
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:234:4: '.~' Identifier
                    {
                    string_literal98=(Token)match(input,113,FOLLOW_113_in_varAttribute1222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal98);

                    Identifier99=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier99);



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
                    // 234:21: -> ^( VIRTUAL_ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:234:24: ^( VIRTUAL_ATTR_NAME Identifier )
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:235:4: a= '[' exp ']'
                    {
                    a=(Token)match(input,114,FOLLOW_114_in_varAttribute1241); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(a);

                    pushFollow(FOLLOW_exp_in_varAttribute1243);
                    exp100=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp100.getTree());
                    char_literal101=(Token)match(input,115,FOLLOW_115_in_varAttribute1245); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal101);



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
                    // 235:18: -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:235:20: ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
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
            if ( state.backtracking>0 ) { memoize(input, 24, varAttribute_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAttribute"

    public static class exp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:238:1: exp : condExp ;
    public final BeeParser.exp_return exp() throws RecognitionException {
        BeeParser.exp_return retval = new BeeParser.exp_return();
        retval.start = input.LT(1);
        int exp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.condExp_return condExp102 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:238:5: ( condExp )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:238:8: condExp
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExp_in_exp1266);
            condExp102=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExp102.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, exp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exp"

    public static class condExp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExp"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:241:1: condExp : conditionalOrExpression ;
    public final BeeParser.condExp_return condExp() throws RecognitionException {
        BeeParser.condExp_return retval = new BeeParser.condExp_return();
        retval.start = input.LT(1);
        int condExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.conditionalOrExpression_return conditionalOrExpression103 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:241:9: ( conditionalOrExpression )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:241:11: conditionalOrExpression
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_condExp1277);
            conditionalOrExpression103=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression103.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 26, condExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExp"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:243:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
    public final BeeParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        BeeParser.conditionalOrExpression_return retval = new BeeParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token OR105=null;
        BeeParser.conditionalAndExpression_return conditionalAndExpression104 = null;

        BeeParser.conditionalAndExpression_return conditionalAndExpression106 = null;


        BeeCommonNodeTree OR105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:244:5: ( conditionalAndExpression ( OR conditionalAndExpression )* )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:244:9: conditionalAndExpression ( OR conditionalAndExpression )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1295);
            conditionalAndExpression104=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression104.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:245:9: ( OR conditionalAndExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:245:10: OR conditionalAndExpression
            	    {
            	    OR105=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression1306); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR105_tree = (BeeCommonNodeTree)adaptor.create(OR105);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(OR105_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1309);
            	    conditionalAndExpression106=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression106.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
            if ( state.backtracking>0 ) { memoize(input, 27, conditionalOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:249:1: conditionalAndExpression : condExpNotItem ( AND condExpNotItem )* ;
    public final BeeParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        BeeParser.conditionalAndExpression_return retval = new BeeParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token AND108=null;
        BeeParser.condExpNotItem_return condExpNotItem107 = null;

        BeeParser.condExpNotItem_return condExpNotItem109 = null;


        BeeCommonNodeTree AND108_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:250:5: ( condExpNotItem ( AND condExpNotItem )* )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:250:9: condExpNotItem ( AND condExpNotItem )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1340);
            condExpNotItem107=condExpNotItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem107.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:251:9: ( AND condExpNotItem )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:251:10: AND condExpNotItem
            	    {
            	    AND108=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression1351); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND108_tree = (BeeCommonNodeTree)adaptor.create(AND108);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(AND108_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1354);
            	    condExpNotItem109=condExpNotItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem109.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
            if ( state.backtracking>0 ) { memoize(input, 28, conditionalAndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class condExpNotItem_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpNotItem"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:254:1: condExpNotItem : ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) );
    public final BeeParser.condExpNotItem_return condExpNotItem() throws RecognitionException {
        BeeParser.condExpNotItem_return retval = new BeeParser.condExpNotItem_return();
        retval.start = input.LT(1);
        int condExpNotItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal111=null;
        BeeParser.condExpItem_return condExpItem110 = null;

        BeeParser.condExpItem_return condExpItem112 = null;


        BeeCommonNodeTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_condExpItem=new RewriteRuleSubtreeStream(adaptor,"rule condExpItem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:255:2: ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=Identifier && LA26_0<=LEFT_BRACE)||(LA26_0>=ADD && LA26_0<=MINUS)||(LA26_0>=BOOLEAN && LA26_0<=DOUBLE)||LA26_0==100||LA26_0==114||LA26_0==116) ) {
                alt26=1;
            }
            else if ( (LA26_0==111) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:255:4: condExpItem
                    {
                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1379);
                    condExpItem110=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem110.getTree());


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
                    // 255:16: -> condExpItem
                    {
                        adaptor.addChild(root_0, stream_condExpItem.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:256:4: ( '!' ) condExpItem
                    {
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:256:4: ( '!' )
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:256:5: '!'
                    {
                    char_literal111=(Token)match(input,111,FOLLOW_111_in_condExpNotItem1388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(char_literal111);


                    }

                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1391);
                    condExpItem112=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem112.getTree());


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
                    // 256:22: -> ^( NOT condExpItem )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:256:25: ^( NOT condExpItem )
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
            if ( state.backtracking>0 ) { memoize(input, 29, condExpNotItem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExpNotItem"

    public static class condExpItem_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpItem"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:257:1: condExpItem : aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? ;
    public final BeeParser.condExpItem_return condExpItem() throws RecognitionException {
        BeeParser.condExpItem_return retval = new BeeParser.condExpItem_return();
        retval.start = input.LT(1);
        int condExpItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.aexpr_return l = null;

        BeeParser.aexpr_return aexpr113 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:2: ( aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:6: aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpItem1410);
            aexpr113=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr113.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:12: ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=EQUAL && LA28_0<=LESS_EQUAL)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr
                    {
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL )
                    int alt27=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt27=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt27=2;
                        }
                        break;
                    case LARGE:
                        {
                        alt27=3;
                        }
                        break;
                    case LARGE_EQUAL:
                        {
                        alt27=4;
                        }
                        break;
                    case LESS:
                        {
                        alt27=5;
                        }
                        break;
                    case LESS_EQUAL:
                        {
                        alt27=6;
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
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:15: a= EQUAL
                            {
                            a=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_condExpItem1417); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:24: a= NOT_EQUAL
                            {
                            a=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_condExpItem1422); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:37: a= LARGE
                            {
                            a=(Token)match(input,LARGE,FOLLOW_LARGE_in_condExpItem1427); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:46: a= LARGE_EQUAL
                            {
                            a=(Token)match(input,LARGE_EQUAL,FOLLOW_LARGE_EQUAL_in_condExpItem1432); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:61: a= LESS
                            {
                            a=(Token)match(input,LESS,FOLLOW_LESS_in_condExpItem1437); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:258:69: a= LESS_EQUAL
                            {
                            a=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_condExpItem1442); if (state.failed) return retval;
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
                    pushFollow(FOLLOW_aexpr_in_condExpItem1449);
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
            if ( state.backtracking>0 ) { memoize(input, 30, condExpItem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExpItem"

    public static class aexpr_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:1: aexpr : mexpr ( (a= ADD | a= MINUS ) mexpr )* ;
    public final BeeParser.aexpr_return aexpr() throws RecognitionException {
        BeeParser.aexpr_return retval = new BeeParser.aexpr_return();
        retval.start = input.LT(1);
        int aexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.mexpr_return mexpr114 = null;

        BeeParser.mexpr_return mexpr115 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:7: ( mexpr ( (a= ADD | a= MINUS ) mexpr )* )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:9: mexpr ( (a= ADD | a= MINUS ) mexpr )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr1459);
            mexpr114=mexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr114.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:15: ( (a= ADD | a= MINUS ) mexpr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=ADD && LA30_0<=MINUS)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:16: (a= ADD | a= MINUS ) mexpr
            	    {
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:16: (a= ADD | a= MINUS )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==ADD) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==MINUS) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:17: a= ADD
            	            {
            	            a=(Token)match(input,ADD,FOLLOW_ADD_in_aexpr1465); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:259:24: a= MINUS
            	            {
            	            a=(Token)match(input,MINUS,FOLLOW_MINUS_in_aexpr1470); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr1474);
            	    mexpr115=mexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr115.getTree());
            	    if ( state.backtracking==0 ) {
            	      if(isStrictMVC)	throw new MVCStrictException(a);
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
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
            if ( state.backtracking>0 ) { memoize(input, 31, aexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:1: mexpr : unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* ;
    public final BeeParser.mexpr_return mexpr() throws RecognitionException {
        BeeParser.mexpr_return retval = new BeeParser.mexpr_return();
        retval.start = input.LT(1);
        int mexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.unaryAtom_return unaryAtom116 = null;

        BeeParser.unaryAtom_return unaryAtom117 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:9: ( unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:17: unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_unaryAtom_in_mexpr1494);
            unaryAtom116=unaryAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom116.getTree());
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:27: ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=MULTIP && LA32_0<=MOD)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:28: (a= MULTIP | a= DIV | a= MOD ) unaryAtom
            	    {
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:28: (a= MULTIP | a= DIV | a= MOD )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case MULTIP:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt31=3;
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
            	            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:29: a= MULTIP
            	            {
            	            a=(Token)match(input,MULTIP,FOLLOW_MULTIP_in_mexpr1500); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:39: a= DIV
            	            {
            	            a=(Token)match(input,DIV,FOLLOW_DIV_in_mexpr1505); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:260:46: a= MOD
            	            {
            	            a=(Token)match(input,MOD,FOLLOW_MOD_in_mexpr1510); if (state.failed) return retval;
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
            	    pushFollow(FOLLOW_unaryAtom_in_mexpr1515);
            	    unaryAtom117=unaryAtom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom117.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
            if ( state.backtracking>0 ) { memoize(input, 32, mexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class atom_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:261:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );
    public final BeeParser.atom_return atom() throws RecognitionException {
        BeeParser.atom_return retval = new BeeParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token BOOLEAN118=null;
        Token INT119=null;
        Token NULL120=null;
        Token DOUBLE121=null;
        Token char_literal123=null;
        Token char_literal125=null;
        BeeParser.varRef_return varRef122 = null;

        BeeParser.exp_return exp124 = null;

        BeeParser.functionCall_return functionCall126 = null;

        BeeParser.nativeMethod_return nativeMethod127 = null;

        BeeParser.json_return json128 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree BOOLEAN118_tree=null;
        BeeCommonNodeTree INT119_tree=null;
        BeeCommonNodeTree NULL120_tree=null;
        BeeCommonNodeTree DOUBLE121_tree=null;
        BeeCommonNodeTree char_literal123_tree=null;
        BeeCommonNodeTree char_literal125_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:261:6: ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json )
            int alt33=10;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:261:8: BOOLEAN
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    BOOLEAN118=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN118_tree = (BeeCommonNodeTree)adaptor.create(BOOLEAN118);
                    adaptor.addChild(root_0, BOOLEAN118_tree);
                    }

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:263:6: INT
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    INT119=(Token)match(input,INT,FOLLOW_INT_in_atom1533); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT119_tree = (BeeCommonNodeTree)adaptor.create(INT119);
                    adaptor.addChild(root_0, INT119_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:264:4: NULL
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    NULL120=(Token)match(input,NULL,FOLLOW_NULL_in_atom1538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL120_tree = (BeeCommonNodeTree)adaptor.create(NULL120);
                    adaptor.addChild(root_0, NULL120_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:265:4: DOUBLE
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    DOUBLE121=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE121_tree = (BeeCommonNodeTree)adaptor.create(DOUBLE121);
                    adaptor.addChild(root_0, DOUBLE121_tree);
                    }

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:266:4: a= StringLiteral
                    {
                    a=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_atom1550); if (state.failed) return retval; 
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
                    // 266:20: ->
                    {
                        adaptor.addChild(root_0, new BeeCommonNodeTree(new CommonToken(StringLiteral,BeetlUtil.getEscapeString((a!=null?a.getText():null)))));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:267:4: varRef
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_atom1559);
                    varRef122=varRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varRef122.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:268:4: '(' exp ')'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    char_literal123=(Token)match(input,100,FOLLOW_100_in_atom1565); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_atom1568);
                    exp124=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp124.getTree());
                    char_literal125=(Token)match(input,102,FOLLOW_102_in_atom1570); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:269:4: functionCall[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_atom1577);
                    functionCall126=functionCall(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall126.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:270:4: nativeMethod[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_atom1583);
                    nativeMethod127=nativeMethod(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod127.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:271:4: json
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_json_in_atom1589);
                    json128=json();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, json128.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 33, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class unaryAtom_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryAtom"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:273:1: unaryAtom : ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom );
    public final BeeParser.unaryAtom_return unaryAtom() throws RecognitionException {
        BeeParser.unaryAtom_return retval = new BeeParser.unaryAtom_return();
        retval.start = input.LT(1);
        int unaryAtom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token MINUS130=null;
        Token ADD131=null;
        BeeParser.atom_return a = null;

        BeeParser.atom_return atom129 = null;

        BeeParser.atom_return atom132 = null;


        BeeCommonNodeTree MINUS130_tree=null;
        BeeCommonNodeTree ADD131_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:274:2: ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom )
            int alt34=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case StringLiteral:
            case LEFT_BRACE:
            case BOOLEAN:
            case INT:
            case NULL:
            case DOUBLE:
            case 100:
            case 114:
            case 116:
                {
                alt34=1;
                }
                break;
            case MINUS:
                {
                alt34=2;
                }
                break;
            case ADD:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:274:4: atom
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryAtom1600);
                    atom129=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom129.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:275:4: MINUS a= atom
                    {
                    MINUS130=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryAtom1606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS130);

                    pushFollow(FOLLOW_atom_in_unaryAtom1610);
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
                    // 275:17: -> ^( NEGATOM atom )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:275:19: ^( NEGATOM atom )
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:276:4: ADD atom
                    {
                    ADD131=(Token)match(input,ADD,FOLLOW_ADD_in_unaryAtom1622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ADD.add(ADD131);

                    pushFollow(FOLLOW_atom_in_unaryAtom1624);
                    atom132=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom132.getTree());


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
                    // 276:13: -> atom
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
            if ( state.backtracking>0 ) { memoize(input, 34, unaryAtom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryAtom"

    public static class nativeMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nativeMethod"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:1: nativeMethod[boolean statmentCall] : a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ;
    public final BeeParser.nativeMethod_return nativeMethod(boolean statmentCall) throws RecognitionException {
        BeeParser.nativeMethod_return retval = new BeeParser.nativeMethod_return();
        retval.start = input.LT(1);
        int nativeMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier133=null;
        Token char_literal134=null;
        Token Identifier135=null;
        Token char_literal136=null;
        BeeParser.classMethod_return classMethod137 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier133_tree=null;
        BeeCommonNodeTree char_literal134_tree=null;
        BeeCommonNodeTree Identifier135_tree=null;
        BeeCommonNodeTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_classMethod=new RewriteRuleSubtreeStream(adaptor,"rule classMethod");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:37: (a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:38: a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )?
            {
            a=(Token)match(input,116,FOLLOW_116_in_nativeMethod1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(a);

            Identifier133=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier133);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:55: ( '.' Identifier )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==112) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==Identifier) ) {
                        int LA35_3 = input.LA(3);

                        if ( (LA35_3==EOF||LA35_3==RIGHT_BRACE||LA35_3==RIGHT_TOKEN||(LA35_3>=OR && LA35_3<=MOD)||LA35_3==95||(LA35_3>=101 && LA35_3<=102)||LA35_3==112||LA35_3==115||LA35_3==119) ) {
                            alt35=1;
                        }


                    }


                }


                switch (alt35) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:56: '.' Identifier
            	    {
            	    char_literal134=(Token)match(input,112,FOLLOW_112_in_nativeMethod1646); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_112.add(char_literal134);

            	    Identifier135=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1648); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier135);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:73: ( '.' classMethod )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==112) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:278:74: '.' classMethod
                    {
                    char_literal136=(Token)match(input,112,FOLLOW_112_in_nativeMethod1653); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(char_literal136);

                    pushFollow(FOLLOW_classMethod_in_nativeMethod1655);
                    classMethod137=classMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMethod.add(classMethod137.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              if(!openBackdoor||isStrictMVC) throw new MVCStrictException(a);
            }


            // AST REWRITE
            // elements: Identifier, classMethod, Identifier, classMethod
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 279:4: -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:279:25: ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:279:39: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_2);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:279:60: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:279:72: ( classMethod )?
                if ( stream_classMethod.hasNext() ) {
                    adaptor.addChild(root_2, stream_classMethod.nextTree());

                }
                stream_classMethod.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 280:4: -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:280:7: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_1);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:280:28: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:280:40: ( classMethod )?
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
            if ( state.backtracking>0 ) { memoize(input, 35, nativeMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nativeMethod"

    public static class classMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMethod"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:283:1: classMethod : Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) ;
    public final BeeParser.classMethod_return classMethod() throws RecognitionException {
        BeeParser.classMethod_return retval = new BeeParser.classMethod_return();
        retval.start = input.LT(1);
        int classMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier138=null;
        Token char_literal139=null;
        Token char_literal141=null;
        Token char_literal143=null;
        BeeParser.exp_return exp140 = null;

        BeeParser.exp_return exp142 = null;


        BeeCommonNodeTree Identifier138_tree=null;
        BeeCommonNodeTree char_literal139_tree=null;
        BeeCommonNodeTree char_literal141_tree=null;
        BeeCommonNodeTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:2: ( Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:4: Identifier '(' ( exp ( ',' exp )* )? ')'
            {
            Identifier138=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMethod1720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier138);

            char_literal139=(Token)match(input,100,FOLLOW_100_in_classMethod1722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal139);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:19: ( exp ( ',' exp )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=Identifier && LA38_0<=LEFT_BRACE)||(LA38_0>=ADD && LA38_0<=MINUS)||(LA38_0>=BOOLEAN && LA38_0<=DOUBLE)||LA38_0==100||LA38_0==111||LA38_0==114||LA38_0==116) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:20: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_classMethod1725);
                    exp140=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp140.getTree());
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:24: ( ',' exp )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==101) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:25: ',' exp
                    	    {
                    	    char_literal141=(Token)match(input,101,FOLLOW_101_in_classMethod1728); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_101.add(char_literal141);

                    	    pushFollow(FOLLOW_exp_in_classMethod1730);
                    	    exp142=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp142.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal143=(Token)match(input,102,FOLLOW_102_in_classMethod1737); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal143);



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
            // 284:42: -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:44: ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_METHOD, Identifier138), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:284:83: ( exp )*
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
            if ( state.backtracking>0 ) { memoize(input, 36, classMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMethod"

    public static class functionFullName_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionFullName"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:1: functionFullName : a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) ;
    public final BeeParser.functionFullName_return functionFullName() throws RecognitionException {
        BeeParser.functionFullName_return retval = new BeeParser.functionFullName_return();
        retval.start = input.LT(1);
        int functionFullName_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal144=null;
        Token Identifier145=null;

        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal144_tree=null;
        BeeCommonNodeTree Identifier145_tree=null;
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:18: (a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:19: a= Identifier ( '.' Identifier )?
            {
            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1759); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:32: ( '.' Identifier )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==112) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:33: '.' Identifier
                    {
                    char_literal144=(Token)match(input,112,FOLLOW_112_in_functionFullName1762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(char_literal144);

                    Identifier145=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier145);


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
            // 286:51: -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:54: ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION_FULL_NAME, a), root_1);

                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:286:80: ( Identifier )*
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
            if ( state.backtracking>0 ) { memoize(input, 37, functionFullName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionFullName"

    public static class switchStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:288:1: switchStatment : a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) ;
    public final BeeParser.switchStatment_return switchStatment() throws RecognitionException {
        BeeParser.switchStatment_return retval = new BeeParser.switchStatment_return();
        retval.start = input.LT(1);
        int switchStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal146=null;
        Token char_literal147=null;
        Token char_literal148=null;
        Token char_literal151=null;
        BeeParser.exp_return base = null;

        BeeParser.caseStatment_return caseStatment149 = null;

        BeeParser.defaultStatment_return defaultStatment150 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal146_tree=null;
        BeeCommonNodeTree char_literal147_tree=null;
        BeeCommonNodeTree char_literal148_tree=null;
        BeeCommonNodeTree char_literal151_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule caseStatment");
        RewriteRuleSubtreeStream stream_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:289:2: (a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:289:4: a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}'
            {
            a=(Token)match(input,117,FOLLOW_117_in_switchStatment1789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(a);

            char_literal146=(Token)match(input,100,FOLLOW_100_in_switchStatment1791); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_100.add(char_literal146);

            pushFollow(FOLLOW_exp_in_switchStatment1795);
            base=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(base.getTree());
            char_literal147=(Token)match(input,102,FOLLOW_102_in_switchStatment1797); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(char_literal147);

            char_literal148=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_switchStatment1799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal148);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:289:36: ( caseStatment )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==118) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: caseStatment
            	    {
            	    pushFollow(FOLLOW_caseStatment_in_switchStatment1801);
            	    caseStatment149=caseStatment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStatment.add(caseStatment149.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:289:50: ( defaultStatment )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==120) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:0:0: defaultStatment
                    {
                    pushFollow(FOLLOW_defaultStatment_in_switchStatment1804);
                    defaultStatment150=defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defaultStatment.add(defaultStatment150.getTree());

                    }
                    break;

            }

            char_literal151=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_switchStatment1807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal151);



            // AST REWRITE
            // elements: base, defaultStatment, caseStatment
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
            // 290:3: -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:290:5: ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SWITCH, a), root_1);

                adaptor.addChild(root_1, stream_base.nextTree());
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:290:24: ( caseStatment )*
                while ( stream_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseStatment.nextTree());

                }
                stream_caseStatment.reset();
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:290:38: ( defaultStatment )?
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
            if ( state.backtracking>0 ) { memoize(input, 38, switchStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchStatment"

    public static class caseStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:291:1: caseStatment : a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) ;
    public final BeeParser.caseStatment_return caseStatment() throws RecognitionException {
        BeeParser.caseStatment_return retval = new BeeParser.caseStatment_return();
        retval.start = input.LT(1);
        int caseStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal153=null;
        BeeParser.exp_return exp152 = null;

        BeeParser.statements_return statements154 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal153_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:292:2: (a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:292:4: a= 'case' exp ':' statements
            {
            a=(Token)match(input,118,FOLLOW_118_in_caseStatment1836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(a);

            pushFollow(FOLLOW_exp_in_caseStatment1838);
            exp152=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp152.getTree());
            char_literal153=(Token)match(input,119,FOLLOW_119_in_caseStatment1840); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal153);

            pushFollow(FOLLOW_statements_in_caseStatment1842);
            statements154=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements154.getTree());


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
            // 292:32: -> ^( CASE[$a] exp statements )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:292:34: ^( CASE[$a] exp statements )
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
            if ( state.backtracking>0 ) { memoize(input, 39, caseStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStatment"

    public static class defaultStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStatment"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:293:1: defaultStatment : a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) ;
    public final BeeParser.defaultStatment_return defaultStatment() throws RecognitionException {
        BeeParser.defaultStatment_return retval = new BeeParser.defaultStatment_return();
        retval.start = input.LT(1);
        int defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal155=null;
        BeeParser.statements_return statements156 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal155_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:294:2: (a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) )
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:294:4: a= 'default' ':' statements
            {
            a=(Token)match(input,120,FOLLOW_120_in_defaultStatment1862); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(a);

            char_literal155=(Token)match(input,119,FOLLOW_119_in_defaultStatment1864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal155);

            pushFollow(FOLLOW_statements_in_defaultStatment1866);
            statements156=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements156.getTree());


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
            // 294:31: -> ^( DEFAULT[$a] statements )
            {
                // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:294:34: ^( DEFAULT[$a] statements )
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
            if ( state.backtracking>0 ) { memoize(input, 40, defaultStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStatment"

    public static class json_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "json"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:1: json : ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) );
    public final BeeParser.json_return json() throws RecognitionException {
        BeeParser.json_return retval = new BeeParser.json_return();
        retval.start = input.LT(1);
        int json_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal157=null;
        Token char_literal159=null;
        Token char_literal161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        Token char_literal166=null;
        BeeParser.exp_return exp158 = null;

        BeeParser.exp_return exp160 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue163 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue165 = null;


        BeeCommonNodeTree char_literal157_tree=null;
        BeeCommonNodeTree char_literal159_tree=null;
        BeeCommonNodeTree char_literal161_tree=null;
        BeeCommonNodeTree char_literal162_tree=null;
        BeeCommonNodeTree char_literal164_tree=null;
        BeeCommonNodeTree char_literal166_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_jsonKeyValue=new RewriteRuleSubtreeStream(adaptor,"rule jsonKeyValue");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:6: ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==114) ) {
                alt46=1;
            }
            else if ( (LA46_0==LEFT_BRACE) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:8: '[' ( exp ( ',' exp )* )? ']'
                    {
                    char_literal157=(Token)match(input,114,FOLLOW_114_in_json1882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(char_literal157);

                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:12: ( exp ( ',' exp )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=Identifier && LA43_0<=LEFT_BRACE)||(LA43_0>=ADD && LA43_0<=MINUS)||(LA43_0>=BOOLEAN && LA43_0<=DOUBLE)||LA43_0==100||LA43_0==111||LA43_0==114||LA43_0==116) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:13: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_json1885);
                            exp158=exp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exp.add(exp158.getTree());
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:18: ( ',' exp )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==101) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:19: ',' exp
                            	    {
                            	    char_literal159=(Token)match(input,101,FOLLOW_101_in_json1889); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_101.add(char_literal159);

                            	    pushFollow(FOLLOW_exp_in_json1891);
                            	    exp160=exp();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_exp.add(exp160.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal161=(Token)match(input,115,FOLLOW_115_in_json1897); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal161);



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
                    // 295:35: -> ^( JSONARRAY ( exp )* )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:37: ^( JSONARRAY ( exp )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONARRAY, "JSONARRAY"), root_1);

                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:295:49: ( exp )*
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:4: '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}'
                    {
                    char_literal162=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_json1910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal162);

                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:8: ( jsonKeyValue ( ',' jsonKeyValue )* )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=Identifier && LA45_0<=StringLiteral)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:9: jsonKeyValue ( ',' jsonKeyValue )*
                            {
                            pushFollow(FOLLOW_jsonKeyValue_in_json1913);
                            jsonKeyValue163=jsonKeyValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue163.getTree());
                            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:22: ( ',' jsonKeyValue )*
                            loop44:
                            do {
                                int alt44=2;
                                int LA44_0 = input.LA(1);

                                if ( (LA44_0==101) ) {
                                    alt44=1;
                                }


                                switch (alt44) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:23: ',' jsonKeyValue
                            	    {
                            	    char_literal164=(Token)match(input,101,FOLLOW_101_in_json1916); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_101.add(char_literal164);

                            	    pushFollow(FOLLOW_jsonKeyValue_in_json1918);
                            	    jsonKeyValue165=jsonKeyValue();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue165.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop44;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal166=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_json1924); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal166);



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
                    // 296:48: -> ^( JSONMAP ( jsonKeyValue )* )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:50: ^( JSONMAP ( jsonKeyValue )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONMAP, "JSONMAP"), root_1);

                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:296:60: ( jsonKeyValue )*
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
            if ( state.backtracking>0 ) { memoize(input, 41, json_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "json"

    public static class jsonKeyValue_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jsonKeyValue"
    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:298:1: jsonKeyValue : ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) );
    public final BeeParser.jsonKeyValue_return jsonKeyValue() throws RecognitionException {
        BeeParser.jsonKeyValue_return retval = new BeeParser.jsonKeyValue_return();
        retval.start = input.LT(1);
        int jsonKeyValue_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token StringLiteral167=null;
        Token char_literal168=null;
        Token Identifier170=null;
        Token char_literal171=null;
        BeeParser.exp_return exp169 = null;

        BeeParser.exp_return exp172 = null;


        BeeCommonNodeTree StringLiteral167_tree=null;
        BeeCommonNodeTree char_literal168_tree=null;
        BeeCommonNodeTree Identifier170_tree=null;
        BeeCommonNodeTree char_literal171_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:299:2: ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==StringLiteral) ) {
                alt47=1;
            }
            else if ( (LA47_0==Identifier) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:299:4: StringLiteral ':' exp
                    {
                    StringLiteral167=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_jsonKeyValue1942); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral167);

                    char_literal168=(Token)match(input,119,FOLLOW_119_in_jsonKeyValue1944); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(char_literal168);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue1946);
                    exp169=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp169.getTree());


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
                    // 299:26: -> ^( JSONKEYVALUE StringLiteral exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:299:28: ^( JSONKEYVALUE StringLiteral exp )
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
                    // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:300:4: Identifier ':' exp
                    {
                    Identifier170=(Token)match(input,Identifier,FOLLOW_Identifier_in_jsonKeyValue1962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier170);

                    char_literal171=(Token)match(input,119,FOLLOW_119_in_jsonKeyValue1964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(char_literal171);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue1966);
                    exp172=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp172.getTree());


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
                    // 300:23: -> ^( JSONKEYVALUE Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:300:25: ^( JSONKEYVALUE Identifier exp )
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
            if ( state.backtracking>0 ) { memoize(input, 42, jsonKeyValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jsonKeyValue"

    // $ANTLR start synpred24_Bee
    public final void synpred24_Bee_fragment() throws RecognitionException {   
        BeeParser.statement_return n = null;


        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:38: ( 'else' n= statement )
        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:194:38: 'else' n= statement
        {
        match(input,108,FOLLOW_108_in_synpred24_Bee790); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred24_Bee794);
        n=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_Bee

    // $ANTLR start synpred31_Bee
    public final void synpred31_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:218:4: ( Identifier '=' exp )
        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:218:4: Identifier '=' exp
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred31_Bee1041); if (state.failed) return ;
        match(input,110,FOLLOW_110_in_synpred31_Bee1043); if (state.failed) return ;
        pushFollow(FOLLOW_exp_in_synpred31_Bee1045);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Bee

    // $ANTLR start synpred32_Bee
    public final void synpred32_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:224:10: ({...}? Identifier )
        // E:\\lijz\\javamonkey\\git\\oschina_beetl\\src\\org\\bee\\tl\\core\\Bee.g:224:10: {...}? Identifier
        {
        if ( !((input.LT(1).getText().startsWith("__V"))) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_Bee", "input.LT(1).getText().startsWith(\"__V\")");
        }
        match(input,Identifier,FOLLOW_Identifier_in_synpred32_Bee1119); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Bee

    // Delegated rules

    public final boolean synpred24_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Bee_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Bee_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_Bee_fragment(); // can never throw exception
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
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA3_eotS =
        "\21\uffff";
    static final String DFA3_eofS =
        "\21\uffff";
    static final String DFA3_minS =
        "\1\55\2\uffff\1\144\15\uffff";
    static final String DFA3_maxS =
        "\1\165\2\uffff\1\160\15\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\3\1\11";
    static final String DFA3_specialS =
        "\21\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\uffff\1\10\1\uffff\1\1\1\uffff\1\4\1\2\53\uffff\1\16"+
            "\1\13\1\11\1\12\3\uffff\1\6\2\uffff\1\7\1\5\10\uffff\1\15\1"+
            "\14",
            "",
            "",
            "\1\20\11\uffff\1\17\1\uffff\1\20",
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
            return "135:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | nativeMethod[true] ';' | directive );";
        }
    }
    static final String DFA33_eotS =
        "\16\uffff";
    static final String DFA33_eofS =
        "\6\uffff\1\12\6\uffff\1\12";
    static final String DFA33_minS =
        "\1\55\5\uffff\1\60\4\uffff\1\55\1\uffff\1\60";
    static final String DFA33_maxS =
        "\1\164\5\uffff\1\167\4\uffff\1\55\1\uffff\1\167";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\uffff"+
        "\1\10\1\uffff";
    static final String DFA33_specialS =
        "\16\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\6\1\5\1\11\22\uffff\1\1\1\2\1\3\1\4\36\uffff\1\7\15\uffff"+
            "\1\11\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\12\2\uffff\15\12\35\uffff\1\12\4\uffff\1\14"+
            "\2\12\10\uffff\1\12\1\13\3\12\3\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "\1\12\1\uffff\1\12\2\uffff\15\12\35\uffff\1\12\4\uffff\1\14"+
            "\2\12\10\uffff\5\12\3\uffff\1\12"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "261:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );";
        }
    }
 

    public static final BitSet FOLLOW_statements_in_prog304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements315 = new BitSet(new long[]{0x001AA00000000002L,0x00300C8F00000000L});
    public static final BitSet FOLLOW_constantsTextStatment_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDefine_in_statement331 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_statement333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignMent_in_statement339 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textStatment_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatment_in_statement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatment_in_statement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStament_in_statement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statmentBlock_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messFunction_in_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatment_in_statement377 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_statement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatment_in_statement385 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_statement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatment_in_statement393 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_statement395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatment_in_statement401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_statement406 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_statement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_statement416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_directive430 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_directive433 = new BitSet(new long[]{0x0000400000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_StringLiteral_in_directive436 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_directive440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_returnStatment461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_continueStatment474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_breakStatment488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProcessFunction_in_messFunction515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_messFunction522 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_messFunction525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textProcessFunction536 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_textProcessFunction540 = new BitSet(new long[]{0x6000E00000000000L,0x001480500000003CL});
    public static final BitSet FOLLOW_exp_in_textProcessFunction543 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_101_in_textProcessFunction546 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_textProcessFunction548 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_102_in_textProcessFunction554 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_textProcessFunction556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_functionCall591 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_functionCall595 = new BitSet(new long[]{0x6000E00000000000L,0x001480500000003CL});
    public static final BitSet FOLLOW_exp_in_functionCall598 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_101_in_functionCall601 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_functionCall603 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_102_in_functionCall609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_statmentBlock658 = new BitSet(new long[]{0x001BA00000000000L,0x00300C8F00000000L});
    public static final BitSet FOLLOW_statements_in_statmentBlock660 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_statmentBlock663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_forStatment680 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_forStatment682 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_forStatment686 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_forStatment688 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_forStatment693 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_forStatment695 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment702 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_forStatment706 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_whileStament745 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_whileStament747 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_condExp_in_whileStament751 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_whileStament753 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_whileStament756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ifStatment777 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ifStatment779 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_condExp_in_ifStatment781 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ifStatment783 = new BitSet(new long[]{0x001AA00000000000L,0x00301C8F00000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment787 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_ifStatment790 = new BitSet(new long[]{0x001AA00000000000L,0x00300C8F00000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment824 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_constantsTextStatment827 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_constantsTextStatment829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment859 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_textVar_in_textStatment861 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment876 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_textStatment878 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_textVar_in_textStatment880 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_textStatment882 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_textVar904 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_textVar908 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_textformat_in_textVar910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textformat937 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_textformat940 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDefine984 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine987 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_varDefine990 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine992 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1041 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_varAssignMent1043 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_varAssignMent1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1063 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_varAssignMent1065 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_varAssignMent1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignMent1091 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_assignMent1093 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_assignMent1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1138 = new BitSet(new long[]{0x0000000000000002L,0x0007800000000000L});
    public static final BitSet FOLLOW_varAttribute_in_varRef1143 = new BitSet(new long[]{0x0000000000000002L,0x0007800000000000L});
    public static final BitSet FOLLOW_safeOutput_in_varRef1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_safeOutput1179 = new BitSet(new long[]{0x0000E00000000002L,0x001400100000003CL});
    public static final BitSet FOLLOW_atom_in_safeOutput1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_varAttribute1206 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_varAttribute1222 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_varAttribute1241 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_varAttribute1243 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_varAttribute1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExp_in_exp1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_condExp1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1295 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression1306 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1309 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1340 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression1351 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1354 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_condExpNotItem1388 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1410 = new BitSet(new long[]{0x1F80000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_condExpItem1417 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_NOT_EQUAL_in_condExpItem1422 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_LARGE_in_condExpItem1427 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_LARGE_EQUAL_in_condExpItem1432 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_LESS_in_condExpItem1437 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_LESS_EQUAL_in_condExpItem1442 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1459 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_ADD_in_aexpr1465 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_MINUS_in_aexpr1470 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_mexpr_in_aexpr1474 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1494 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_MULTIP_in_mexpr1500 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_DIV_in_mexpr1505 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_MOD_in_mexpr1510 = new BitSet(new long[]{0x6000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1515 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_atom1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_atom1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_atom1565 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_atom1568 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_atom1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atom1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_atom1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_json_in_atom1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryAtom1606 = new BitSet(new long[]{0x0000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_atom_in_unaryAtom1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryAtom1622 = new BitSet(new long[]{0x0000E00000000000L,0x001400100000003CL});
    public static final BitSet FOLLOW_atom_in_unaryAtom1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_nativeMethod1641 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1643 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_nativeMethod1646 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1648 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_nativeMethod1653 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_classMethod_in_nativeMethod1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_classMethod1720 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_classMethod1722 = new BitSet(new long[]{0x6000E00000000000L,0x001480500000003CL});
    public static final BitSet FOLLOW_exp_in_classMethod1725 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_101_in_classMethod1728 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_classMethod1730 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_102_in_classMethod1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1759 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_functionFullName1762 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_switchStatment1789 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_switchStatment1791 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_switchStatment1795 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_switchStatment1797 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_switchStatment1799 = new BitSet(new long[]{0x0001000000000000L,0x0140000000000000L});
    public static final BitSet FOLLOW_caseStatment_in_switchStatment1801 = new BitSet(new long[]{0x0001000000000000L,0x0140000000000000L});
    public static final BitSet FOLLOW_defaultStatment_in_switchStatment1804 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_switchStatment1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_caseStatment1836 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_caseStatment1838 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_caseStatment1840 = new BitSet(new long[]{0x001AA00000000000L,0x00300C8F00000000L});
    public static final BitSet FOLLOW_statements_in_caseStatment1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_defaultStatment1862 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_defaultStatment1864 = new BitSet(new long[]{0x001AA00000000000L,0x00300C8F00000000L});
    public static final BitSet FOLLOW_statements_in_defaultStatment1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_json1882 = new BitSet(new long[]{0x6000E00000000000L,0x001C80100000003CL});
    public static final BitSet FOLLOW_exp_in_json1885 = new BitSet(new long[]{0x0000000000000000L,0x0008002000000000L});
    public static final BitSet FOLLOW_101_in_json1889 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_json1891 = new BitSet(new long[]{0x0000000000000000L,0x0008002000000000L});
    public static final BitSet FOLLOW_115_in_json1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_json1910 = new BitSet(new long[]{0x0001600000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json1913 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_json1916 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json1918 = new BitSet(new long[]{0x0001000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_json1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_jsonKeyValue1942 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_jsonKeyValue1944 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_jsonKeyValue1962 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_jsonKeyValue1964 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_synpred24_Bee790 = new BitSet(new long[]{0x001AA00000000000L,0x00300C8F00000000L});
    public static final BitSet FOLLOW_statement_in_synpred24_Bee794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred31_Bee1041 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_synpred31_Bee1043 = new BitSet(new long[]{0x6000E00000000000L,0x001480100000003CL});
    public static final BitSet FOLLOW_exp_in_synpred31_Bee1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred32_Bee1119 = new BitSet(new long[]{0x0000000000000002L});

}