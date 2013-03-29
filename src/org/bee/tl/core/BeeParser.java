// $ANTLR 3.3 Nov 30, 2010 12:50:56 e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g 2013-03-16 10:30:22

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR_DEFINE", "VAR_REFER", "ASSIGNMENT", "HOLDER", "TEXT_HOLDER", "FOR", "VAR_TEXT", "FM", "SLIST", "IF", "EXP", "COND_EXP", "FUNCTION", "TEXT_PROCESS", "ATTR_NAME", "VIRTUAL_ATTR_NAME", "MAP_LIST_INDEX", "BREAK", "CONTINUE", "RETURN", "NOT", "SWITCH", "CASE", "DEFAULT", "JSON", "JSONARRAY", "JSONMAP", "JSONKEYVALUE", "CLASS_STATIC_FUNCTION", "CLASS_FUNCTION", "CLASS_METHOD", "VARIABLE_VAR_REFER", "TEXT_VAR_REFER", "MISSING_VARIABLE_VAR_REFER", "FUNCTION_FULL_NAME", "SAFE_OUTPUT", "DIRECT_CALL", "NEGATOM", "WHILE", "DIRECTIVE", "Identifier", "StringLiteral", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_TEXT_TOKEN", "RIGHT_TOKEN", "LEFT_TOKEN", "VAR", "OR", "AND", "EQUAL", "NOT_EQUAL", "LARGE", "LARGE_EQUAL", "LESS", "LESS_EQUAL", "ADD", "MINUS", "MULTIP", "DIV", "MOD", "BOOLEAN", "INT", "NULL", "DOUBLE", "ID_START", "Comment", "LineComment", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "DecimalLiteral", "HexIntegerLiteral", "NumericLiteral", "ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", "UnicodeDigit", "UnicodeConnectorPunctuation", "UnicodeCombiningMark", "WhiteSpace", "';'", "'DIRECTIVE'", "'return'", "'continue'", "'break'", "'('", "','", "')'", "'for'", "'in '", "'elsefor'", "'while'", "'if'", "'else'", "'!('", "'='", "'!'", "'.'", "'.~'", "'['", "']'", "'@'", "'switch'", "'case'", "':'", "'default'"
    };
    public static final int EOF=-1;
    public static final int T__94=94;
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
    public static final int VAR_DEFINE=4;
    public static final int VAR_REFER=5;
    public static final int ASSIGNMENT=6;
    public static final int HOLDER=7;
    public static final int TEXT_HOLDER=8;
    public static final int FOR=9;
    public static final int VAR_TEXT=10;
    public static final int FM=11;
    public static final int SLIST=12;
    public static final int IF=13;
    public static final int EXP=14;
    public static final int COND_EXP=15;
    public static final int FUNCTION=16;
    public static final int TEXT_PROCESS=17;
    public static final int ATTR_NAME=18;
    public static final int VIRTUAL_ATTR_NAME=19;
    public static final int MAP_LIST_INDEX=20;
    public static final int BREAK=21;
    public static final int CONTINUE=22;
    public static final int RETURN=23;
    public static final int NOT=24;
    public static final int SWITCH=25;
    public static final int CASE=26;
    public static final int DEFAULT=27;
    public static final int JSON=28;
    public static final int JSONARRAY=29;
    public static final int JSONMAP=30;
    public static final int JSONKEYVALUE=31;
    public static final int CLASS_STATIC_FUNCTION=32;
    public static final int CLASS_FUNCTION=33;
    public static final int CLASS_METHOD=34;
    public static final int VARIABLE_VAR_REFER=35;
    public static final int TEXT_VAR_REFER=36;
    public static final int MISSING_VARIABLE_VAR_REFER=37;
    public static final int FUNCTION_FULL_NAME=38;
    public static final int SAFE_OUTPUT=39;
    public static final int DIRECT_CALL=40;
    public static final int NEGATOM=41;
    public static final int WHILE=42;
    public static final int DIRECTIVE=43;
    public static final int Identifier=44;
    public static final int StringLiteral=45;
    public static final int LEFT_BRACE=46;
    public static final int RIGHT_BRACE=47;
    public static final int LEFT_TEXT_TOKEN=48;
    public static final int RIGHT_TOKEN=49;
    public static final int LEFT_TOKEN=50;
    public static final int VAR=51;
    public static final int OR=52;
    public static final int AND=53;
    public static final int EQUAL=54;
    public static final int NOT_EQUAL=55;
    public static final int LARGE=56;
    public static final int LARGE_EQUAL=57;
    public static final int LESS=58;
    public static final int LESS_EQUAL=59;
    public static final int ADD=60;
    public static final int MINUS=61;
    public static final int MULTIP=62;
    public static final int DIV=63;
    public static final int MOD=64;
    public static final int BOOLEAN=65;
    public static final int INT=66;
    public static final int NULL=67;
    public static final int DOUBLE=68;
    public static final int ID_START=69;
    public static final int Comment=70;
    public static final int LineComment=71;
    public static final int DoubleStringCharacter=72;
    public static final int SingleStringCharacter=73;
    public static final int EscapeSequence=74;
    public static final int CharacterEscapeSequence=75;
    public static final int HexEscapeSequence=76;
    public static final int UnicodeEscapeSequence=77;
    public static final int SingleEscapeCharacter=78;
    public static final int NonEscapeCharacter=79;
    public static final int EscapeCharacter=80;
    public static final int DecimalDigit=81;
    public static final int HexDigit=82;
    public static final int DecimalLiteral=83;
    public static final int HexIntegerLiteral=84;
    public static final int NumericLiteral=85;
    public static final int ExponentPart=86;
    public static final int IdentifierStart=87;
    public static final int IdentifierPart=88;
    public static final int UnicodeLetter=89;
    public static final int UnicodeDigit=90;
    public static final int UnicodeConnectorPunctuation=91;
    public static final int UnicodeCombiningMark=92;
    public static final int WhiteSpace=93;

    // delegates
    // delegators


        public BeeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BeeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[115+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BeeParser.tokenNames; }
    public String getGrammarFileName() { return "e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g"; }


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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:132:1: prog : ( statements )? EOF ;
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
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:132:6: ( ( statements )? EOF )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:132:8: ( statements )? EOF
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:132:8: ( statements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Identifier||LA1_0==LEFT_BRACE||LA1_0==LEFT_TEXT_TOKEN||(LA1_0>=LEFT_TOKEN && LA1_0<=VAR)||(LA1_0>=95 && LA1_0<=98)||LA1_0==102||(LA1_0>=105 && LA1_0<=106)||(LA1_0>=115 && LA1_0<=116)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_prog299);
                    statements1=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

                    }
                    break;

            }

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog302); if (state.failed) return retval;

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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:133:1: statements : ( statement )+ ;
    public final BeeParser.statements_return statements() throws RecognitionException {
        BeeParser.statements_return retval = new BeeParser.statements_return();
        retval.start = input.LT(1);
        int statements_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.statement_return statement3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:133:12: ( ( statement )+ )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:133:13: ( statement )+
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:133:13: ( statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==LEFT_BRACE||LA2_0==LEFT_TEXT_TOKEN||(LA2_0>=LEFT_TOKEN && LA2_0<=VAR)||(LA2_0>=95 && LA2_0<=98)||LA2_0==102||(LA2_0>=105 && LA2_0<=106)||(LA2_0>=115 && LA2_0<=116)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements310);
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:134:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | nativeMethod[true] ';' | directive );
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
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:135:2: ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | nativeMethod[true] ';' | directive )
            int alt3=15;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:135:4: constantsTextStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_constantsTextStatment_in_statement319);
                    constantsTextStatment4=constantsTextStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantsTextStatment4.getTree());

                    }
                    break;
                case 2 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:136:6: varDefine ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varDefine_in_statement326);
                    varDefine5=varDefine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDefine5.getTree());
                    char_literal6=(Token)match(input,94,FOLLOW_94_in_statement328); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:137:4: assignMent ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_assignMent_in_statement334);
                    assignMent7=assignMent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignMent7.getTree());
                    char_literal8=(Token)match(input,94,FOLLOW_94_in_statement336); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:138:4: textStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_textStatment_in_statement342);
                    textStatment9=textStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textStatment9.getTree());

                    }
                    break;
                case 5 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:139:4: ifStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatment_in_statement347);
                    ifStatment10=ifStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatment10.getTree());

                    }
                    break;
                case 6 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:140:4: forStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatment_in_statement352);
                    forStatment11=forStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatment11.getTree());

                    }
                    break;
                case 7 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:141:4: whileStament
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStament_in_statement357);
                    whileStament12=whileStament();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStament12.getTree());

                    }
                    break;
                case 8 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:142:4: statmentBlock
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_statmentBlock_in_statement362);
                    statmentBlock13=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statmentBlock13.getTree());

                    }
                    break;
                case 9 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:143:4: messFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_messFunction_in_statement367);
                    messFunction14=messFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, messFunction14.getTree());

                    }
                    break;
                case 10 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:144:4: continueStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatment_in_statement372);
                    continueStatment15=continueStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatment15.getTree());
                    char_literal16=(Token)match(input,94,FOLLOW_94_in_statement374); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:145:4: breakStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatment_in_statement380);
                    breakStatment17=breakStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatment17.getTree());
                    char_literal18=(Token)match(input,94,FOLLOW_94_in_statement382); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:146:4: returnStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatment_in_statement388);
                    returnStatment19=returnStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatment19.getTree());
                    char_literal20=(Token)match(input,94,FOLLOW_94_in_statement390); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:147:4: switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatment_in_statement396);
                    switchStatment21=switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatment21.getTree());

                    }
                    break;
                case 14 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:148:4: nativeMethod[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_statement401);
                    nativeMethod22=nativeMethod(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod22.getTree());
                    char_literal23=(Token)match(input,94,FOLLOW_94_in_statement404); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:149:4: directive
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_directive_in_statement411);
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:1: directive : 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) ;
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
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:10: ( 'DIRECTIVE' Identifier ( StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:12: 'DIRECTIVE' Identifier ( StringLiteral )? ';'
            {
            string_literal25=(Token)match(input,95,FOLLOW_95_in_directive425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_95.add(string_literal25);

            Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_directive428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier26);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:36: ( StringLiteral )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==StringLiteral) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:37: StringLiteral
                    {
                    StringLiteral27=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_directive431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral27);


                    }
                    break;

            }

            char_literal28=(Token)match(input,94,FOLLOW_94_in_directive435); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_94.add(char_literal28);



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
            // 155:57: -> ^( DIRECTIVE Identifier ( StringLiteral )? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:60: ^( DIRECTIVE Identifier ( StringLiteral )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECTIVE, "DIRECTIVE"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:155:83: ( StringLiteral )?
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:156:1: returnStatment : 'return' -> ^( RETURN ) ;
    public final BeeParser.returnStatment_return returnStatment() throws RecognitionException {
        BeeParser.returnStatment_return retval = new BeeParser.returnStatment_return();
        retval.start = input.LT(1);
        int returnStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal29=null;

        BeeCommonNodeTree string_literal29_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:157:2: ( 'return' -> ^( RETURN ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:157:4: 'return'
            {
            string_literal29=(Token)match(input,96,FOLLOW_96_in_returnStatment456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_96.add(string_literal29);



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
            // 157:13: -> ^( RETURN )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:157:16: ^( RETURN )
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:158:1: continueStatment : 'continue' -> ^( CONTINUE ) ;
    public final BeeParser.continueStatment_return continueStatment() throws RecognitionException {
        BeeParser.continueStatment_return retval = new BeeParser.continueStatment_return();
        retval.start = input.LT(1);
        int continueStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal30=null;

        BeeCommonNodeTree string_literal30_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:158:17: ( 'continue' -> ^( CONTINUE ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:158:19: 'continue'
            {
            string_literal30=(Token)match(input,97,FOLLOW_97_in_continueStatment469); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_97.add(string_literal30);



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
            // 158:30: -> ^( CONTINUE )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:158:33: ^( CONTINUE )
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:159:1: breakStatment : 'break' -> ^( BREAK ) ;
    public final BeeParser.breakStatment_return breakStatment() throws RecognitionException {
        BeeParser.breakStatment_return retval = new BeeParser.breakStatment_return();
        retval.start = input.LT(1);
        int breakStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal31=null;

        BeeCommonNodeTree string_literal31_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:159:15: ( 'break' -> ^( BREAK ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:159:17: 'break'
            {
            string_literal31=(Token)match(input,98,FOLLOW_98_in_breakStatment483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(string_literal31);



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
            // 159:25: -> ^( BREAK )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:159:28: ^( BREAK )
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:161:1: messFunction options {backtrack=false; } : ({...}? textProcessFunction | functionCall[true] ';' );
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
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:164:2: ({...}? textProcessFunction | functionCall[true] ';' )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:164:4: {...}? textProcessFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    if ( !((isTextProcessFunction(input))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "messFunction", "isTextProcessFunction(input)");
                    }
                    pushFollow(FOLLOW_textProcessFunction_in_messFunction510);
                    textProcessFunction32=textProcessFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textProcessFunction32.getTree());

                    }
                    break;
                case 2 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:165:6: functionCall[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_messFunction517);
                    functionCall33=functionCall(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall33.getTree());
                    char_literal34=(Token)match(input,94,FOLLOW_94_in_messFunction520); if (state.failed) return retval;
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:167:1: textProcessFunction : functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) ;
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
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:4: functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock
            {
            pushFollow(FOLLOW_functionFullName_in_textProcessFunction531);
            functionFullName35=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName35.getTree());
            a=(Token)match(input,99,FOLLOW_99_in_textProcessFunction535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(a);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:27: ( exp ( ',' exp )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=Identifier && LA7_0<=LEFT_BRACE)||(LA7_0>=ADD && LA7_0<=MINUS)||(LA7_0>=BOOLEAN && LA7_0<=DOUBLE)||LA7_0==99||LA7_0==110||LA7_0==113||LA7_0==115) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:28: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_textProcessFunction538);
                    exp36=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp36.getTree());
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:32: ( ',' exp )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==100) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:33: ',' exp
                    	    {
                    	    char_literal37=(Token)match(input,100,FOLLOW_100_in_textProcessFunction541); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_100.add(char_literal37);

                    	    pushFollow(FOLLOW_exp_in_textProcessFunction543);
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

            char_literal39=(Token)match(input,101,FOLLOW_101_in_textProcessFunction549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal39);

            pushFollow(FOLLOW_statmentBlock_in_textProcessFunction551);
            statmentBlock40=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock40.getTree());


            // AST REWRITE
            // elements: exp, functionFullName, statmentBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 169:63: -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:66: ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_PROCESS, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:169:116: ( exp )*
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:172:1: functionCall[boolean statmentCall] : functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) ;
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
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:178:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:178:3: functionFullName a= '(' ( exp ( ',' exp )* )? ')'
            {
            pushFollow(FOLLOW_functionFullName_in_functionCall586);
            functionFullName41=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName41.getTree());
            a=(Token)match(input,99,FOLLOW_99_in_functionCall590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(a);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:178:26: ( exp ( ',' exp )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Identifier && LA9_0<=LEFT_BRACE)||(LA9_0>=ADD && LA9_0<=MINUS)||(LA9_0>=BOOLEAN && LA9_0<=DOUBLE)||LA9_0==99||LA9_0==110||LA9_0==113||LA9_0==115) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:178:27: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_functionCall593);
                    exp42=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp42.getTree());
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:178:31: ( ',' exp )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==100) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:178:32: ',' exp
                    	    {
                    	    char_literal43=(Token)match(input,100,FOLLOW_100_in_functionCall596); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_100.add(char_literal43);

                    	    pushFollow(FOLLOW_exp_in_functionCall598);
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

            char_literal45=(Token)match(input,101,FOLLOW_101_in_functionCall604); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal45);



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
            // 179:3: -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
            if (statmentCall) {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:179:22: ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:179:36: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_2);

                adaptor.addChild(root_2, stream_functionFullName.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:179:68: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 180:3: -> ^( FUNCTION[$a] functionFullName ( exp )* )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:180:6: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:180:38: ( exp )*
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:184:1: statmentBlock : LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) ;
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
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:185:2: ( LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:185:4: LEFT_BRACE ( statements )? RIGHT_BRACE
            {
            LEFT_BRACE46=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_statmentBlock653); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(LEFT_BRACE46);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:185:15: ( statements )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier||LA10_0==LEFT_BRACE||LA10_0==LEFT_TEXT_TOKEN||(LA10_0>=LEFT_TOKEN && LA10_0<=VAR)||(LA10_0>=95 && LA10_0<=98)||LA10_0==102||(LA10_0>=105 && LA10_0<=106)||(LA10_0>=115 && LA10_0<=116)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_statmentBlock655);
                    statements47=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statements.add(statements47.getTree());

                    }
                    break;

            }

            RIGHT_BRACE48=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_statmentBlock658); if (state.failed) return retval; 
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
            // 185:39: -> ^( SLIST ( statements )? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:185:42: ^( SLIST ( statements )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SLIST, "SLIST"), root_1);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:185:50: ( statements )?
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:186:1: forStatment : 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) ;
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
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:187:2: ( 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:187:4: 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )?
            {
            string_literal49=(Token)match(input,102,FOLLOW_102_in_forStatment675); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_102.add(string_literal49);

            char_literal50=(Token)match(input,99,FOLLOW_99_in_forStatment677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal50);

            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatment681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            string_literal51=(Token)match(input,103,FOLLOW_103_in_forStatment683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(string_literal51);

            pushFollow(FOLLOW_exp_in_forStatment688);
            aaa=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(aaa.getTree());
            char_literal52=(Token)match(input,101,FOLLOW_101_in_forStatment690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal52);

            pushFollow(FOLLOW_statmentBlock_in_forStatment697);
            c=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(c.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:187:66: ( 'elsefor' d= statmentBlock )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==104) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:187:67: 'elsefor' d= statmentBlock
                    {
                    string_literal53=(Token)match(input,104,FOLLOW_104_in_forStatment701); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_104.add(string_literal53);

                    pushFollow(FOLLOW_statmentBlock_in_forStatment705);
                    d=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(d.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: aaa, d, c, a
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
            // 188:3: -> ^( FOR $a $aaa $c ( $d)? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:188:6: ^( FOR $a $aaa $c ( $d)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                adaptor.addChild(root_1, stream_aaa.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:188:24: ( $d)?
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:189:1: whileStament : 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) ;
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
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:190:2: ( 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:190:4: 'while' '(' a= condExp ')' statmentBlock
            {
            string_literal54=(Token)match(input,105,FOLLOW_105_in_whileStament740); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(string_literal54);

            char_literal55=(Token)match(input,99,FOLLOW_99_in_whileStament742); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal55);

            pushFollow(FOLLOW_condExp_in_whileStament746);
            a=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(a.getTree());
            char_literal56=(Token)match(input,101,FOLLOW_101_in_whileStament748); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal56);

            pushFollow(FOLLOW_statmentBlock_in_whileStament751);
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
            // 190:45: -> ^( WHILE $a statmentBlock )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:190:48: ^( WHILE $a statmentBlock )
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:192:1: ifStatment : 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) ;
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
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:2: ( 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:4: 'if' '(' condExp ')' l= statement ( 'else' n= statement )?
            {
            string_literal58=(Token)match(input,106,FOLLOW_106_in_ifStatment772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal58);

            char_literal59=(Token)match(input,99,FOLLOW_99_in_ifStatment774); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal59);

            pushFollow(FOLLOW_condExp_in_ifStatment776);
            condExp60=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(condExp60.getTree());
            char_literal61=(Token)match(input,101,FOLLOW_101_in_ifStatment778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal61);

            pushFollow(FOLLOW_statement_in_ifStatment782);
            l=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(l.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:37: ( 'else' n= statement )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==107) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred24_Bee()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:38: 'else' n= statement
                    {
                    string_literal62=(Token)match(input,107,FOLLOW_107_in_ifStatment785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal62);

                    pushFollow(FOLLOW_statement_in_ifStatment789);
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
            // 193:61: -> ^( IF condExp $l ( $n)? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:63: ^( IF condExp $l ( $n)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_condExp.nextTree());
                adaptor.addChild(root_1, stream_l.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:79: ( $n)?
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:195:1: constantsTextStatment : LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) ;
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
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:196:2: ( LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:196:4: LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN
            {
            LEFT_TEXT_TOKEN63=(Token)match(input,LEFT_TEXT_TOKEN,FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_TEXT_TOKEN.add(LEFT_TEXT_TOKEN63);

            Identifier64=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantsTextStatment822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier64);

            RIGHT_TOKEN65=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_constantsTextStatment824); if (state.failed) return retval; 
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
            // 196:46: -> ^( TEXT_HOLDER Identifier )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:196:48: ^( TEXT_HOLDER Identifier )
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:198:1: textStatment : ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) );
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
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_LEFT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_textVar=new RewriteRuleSubtreeStream(adaptor,"rule textVar");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:199:2: ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LEFT_TOKEN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==108) ) {
                    alt13=2;
                }
                else if ( ((LA13_1>=Identifier && LA13_1<=LEFT_BRACE)||(LA13_1>=ADD && LA13_1<=MINUS)||(LA13_1>=BOOLEAN && LA13_1<=DOUBLE)||LA13_1==99||LA13_1==110||LA13_1==113||LA13_1==115) ) {
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:200:6: LEFT_TOKEN textVar RIGHT_TOKEN
                    {
                    LEFT_TOKEN66=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN66);

                    pushFollow(FOLLOW_textVar_in_textStatment856);
                    textVar67=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar67.getTree());
                    RIGHT_TOKEN68=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment858); if (state.failed) return retval; 
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
                    // 200:37: -> ^( HOLDER textVar )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:200:40: ^( HOLDER textVar )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:201:4: LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN
                    {
                    LEFT_TOKEN69=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN69);

                    string_literal70=(Token)match(input,108,FOLLOW_108_in_textStatment873); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(string_literal70);

                    pushFollow(FOLLOW_textVar_in_textStatment875);
                    textVar71=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar71.getTree());
                    char_literal72=(Token)match(input,101,FOLLOW_101_in_textStatment877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_101.add(char_literal72);

                    RIGHT_TOKEN73=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment878); if (state.failed) return retval; 
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
                    // 201:43: -> ^( HOLDER textVar SAFE_OUTPUT )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:201:46: ^( HOLDER textVar SAFE_OUTPUT )
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
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:1: textVar : b= exp ( ',' fm= functionFullName ( '=' StringLiteral )? )* -> ^( VAR_TEXT $b ( ^( FM $fm ( StringLiteral )? ) )* ) ;
    public final BeeParser.textVar_return textVar() throws RecognitionException {
        BeeParser.textVar_return retval = new BeeParser.textVar_return();
        retval.start = input.LT(1);
        int textVar_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal74=null;
        Token char_literal75=null;
        Token StringLiteral76=null;
        BeeParser.exp_return b = null;

        BeeParser.functionFullName_return fm = null;


        BeeCommonNodeTree char_literal74_tree=null;
        BeeCommonNodeTree char_literal75_tree=null;
        BeeCommonNodeTree StringLiteral76_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:9: (b= exp ( ',' fm= functionFullName ( '=' StringLiteral )? )* -> ^( VAR_TEXT $b ( ^( FM $fm ( StringLiteral )? ) )* ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:11: b= exp ( ',' fm= functionFullName ( '=' StringLiteral )? )*
            {
            pushFollow(FOLLOW_exp_in_textVar897);
            b=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(b.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:17: ( ',' fm= functionFullName ( '=' StringLiteral )? )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==100) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:18: ',' fm= functionFullName ( '=' StringLiteral )?
            	    {
            	    char_literal74=(Token)match(input,100,FOLLOW_100_in_textVar900); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_100.add(char_literal74);

            	    pushFollow(FOLLOW_functionFullName_in_textVar904);
            	    fm=functionFullName();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_functionFullName.add(fm.getTree());
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:42: ( '=' StringLiteral )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==109) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:43: '=' StringLiteral
            	            {
            	            char_literal75=(Token)match(input,109,FOLLOW_109_in_textVar907); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_109.add(char_literal75);

            	            StringLiteral76=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textVar909); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral76);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);



            // AST REWRITE
            // elements: StringLiteral, b, fm
            // token labels: 
            // rule labels: retval, fm, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_fm=new RewriteRuleSubtreeStream(adaptor,"rule fm",fm!=null?fm.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 202:65: -> ^( VAR_TEXT $b ( ^( FM $fm ( StringLiteral )? ) )* )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:68: ^( VAR_TEXT $b ( ^( FM $fm ( StringLiteral )? ) )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_TEXT, "VAR_TEXT"), root_1);

                adaptor.addChild(root_1, stream_b.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:82: ( ^( FM $fm ( StringLiteral )? ) )*
                while ( stream_fm.hasNext() ) {
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:83: ^( FM $fm ( StringLiteral )? )
                    {
                    BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                    root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FM, "FM"), root_2);

                    adaptor.addChild(root_2, stream_fm.nextTree());
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:202:92: ( StringLiteral )?
                    if ( stream_StringLiteral.hasNext() ) {
                        adaptor.addChild(root_2, stream_StringLiteral.nextNode());

                    }
                    stream_StringLiteral.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_fm.reset();

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

    public static class varDefine_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDefine"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:204:1: varDefine : a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ ;
    public final BeeParser.varDefine_return varDefine() throws RecognitionException {
        BeeParser.varDefine_return retval = new BeeParser.varDefine_return();
        retval.start = input.LT(1);
        int varDefine_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal78=null;
        BeeParser.varAssignMent_return varAssignMent77 = null;

        BeeParser.varAssignMent_return varAssignMent79 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal78_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_varAssignMent=new RewriteRuleSubtreeStream(adaptor,"rule varAssignMent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:206:2: (a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:206:4: a= VAR varAssignMent ( ',' varAssignMent )*
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_varDefine951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(a);

            if ( state.backtracking==0 ) {
              if(isStrictMVC)	throw new MVCStrictException(a);
            }
            pushFollow(FOLLOW_varAssignMent_in_varDefine954);
            varAssignMent77=varAssignMent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent77.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:206:75: ( ',' varAssignMent )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==100) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:206:76: ',' varAssignMent
            	    {
            	    char_literal78=(Token)match(input,100,FOLLOW_100_in_varDefine957); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_100.add(char_literal78);

            	    pushFollow(FOLLOW_varAssignMent_in_varDefine959);
            	    varAssignMent79=varAssignMent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent79.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // 206:96: -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+
            {
                if ( !(stream_varAssignMent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varAssignMent.hasNext() ) {
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:206:98: ^( VAR_DEFINE[$a] varAssignMent )
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
            if ( state.backtracking>0 ) { memoize(input, 18, varDefine_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varDefine"

    public static class varAssignMent_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAssignMent"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:209:1: varAssignMent : (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) );
    public final BeeParser.varAssignMent_return varAssignMent() throws RecognitionException {
        BeeParser.varAssignMent_return retval = new BeeParser.varAssignMent_return();
        retval.start = input.LT(1);
        int varAssignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier80=null;
        Token char_literal81=null;
        Token Identifier83=null;
        Token char_literal84=null;
        BeeParser.exp_return exp82 = null;

        BeeParser.statmentBlock_return statmentBlock85 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier80_tree=null;
        BeeCommonNodeTree char_literal81_tree=null;
        BeeCommonNodeTree Identifier83_tree=null;
        BeeCommonNodeTree char_literal84_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:210:2: (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Identifier) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==109) ) {
                    int LA17_2 = input.LA(3);

                    if ( ((LA17_2>=Identifier && LA17_2<=StringLiteral)||(LA17_2>=ADD && LA17_2<=MINUS)||(LA17_2>=BOOLEAN && LA17_2<=DOUBLE)||LA17_2==99||LA17_2==110||LA17_2==113||LA17_2==115) ) {
                        alt17=2;
                    }
                    else if ( (LA17_2==LEFT_BRACE) ) {
                        switch ( input.LA(4) ) {
                        case StringLiteral:
                            {
                            alt17=2;
                            }
                            break;
                        case Identifier:
                            {
                            int LA17_6 = input.LA(5);

                            if ( (LA17_6==118) ) {
                                alt17=2;
                            }
                            else if ( (LA17_6==99||LA17_6==109||LA17_6==111) ) {
                                alt17=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RIGHT_BRACE:
                            {
                            int LA17_7 = input.LA(5);

                            if ( (synpred30_Bee()) ) {
                                alt17=2;
                            }
                            else if ( (true) ) {
                                alt17=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 7, input);

                                throw nvae;
                            }
                            }
                            break;
                        case LEFT_BRACE:
                        case LEFT_TEXT_TOKEN:
                        case LEFT_TOKEN:
                        case VAR:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 102:
                        case 105:
                        case 106:
                        case 115:
                        case 116:
                            {
                            alt17=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 5, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1==EOF||LA17_1==94||LA17_1==100) ) {
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:210:4: a= Identifier
                    {
                    a=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent987); if (state.failed) return retval; 
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
                    // 210:19: -> ^( ASSIGNMENT[$a] Identifier NULL )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:210:22: ^( ASSIGNMENT[$a] Identifier NULL )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:211:4: Identifier '=' exp
                    {
                    Identifier80=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier80);

                    char_literal81=(Token)match(input,109,FOLLOW_109_in_varAssignMent1010); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(char_literal81);

                    pushFollow(FOLLOW_exp_in_varAssignMent1012);
                    exp82=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp82.getTree());


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
                    // 211:23: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:211:26: ^( ASSIGNMENT[$Identifier] Identifier exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier80), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:212:4: Identifier '=' statmentBlock
                    {
                    Identifier83=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1030); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier83);

                    char_literal84=(Token)match(input,109,FOLLOW_109_in_varAssignMent1032); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(char_literal84);

                    pushFollow(FOLLOW_statmentBlock_in_varAssignMent1034);
                    statmentBlock85=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock85.getTree());


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
                    // 212:34: -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:212:39: ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier83), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 19, varAssignMent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAssignMent"

    public static class assignMent_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignMent"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:214:1: assignMent : Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) ;
    public final BeeParser.assignMent_return assignMent() throws RecognitionException {
        BeeParser.assignMent_return retval = new BeeParser.assignMent_return();
        retval.start = input.LT(1);
        int assignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier86=null;
        Token char_literal87=null;
        BeeParser.exp_return exp88 = null;


        BeeCommonNodeTree Identifier86_tree=null;
        BeeCommonNodeTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:215:2: ( Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:215:4: Identifier '=' exp
            {
            Identifier86=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignMent1058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier86);

            char_literal87=(Token)match(input,109,FOLLOW_109_in_assignMent1060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_109.add(char_literal87);

            pushFollow(FOLLOW_exp_in_assignMent1063);
            exp88=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp88.getTree());


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
            // 215:25: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:215:28: ^( ASSIGNMENT[$Identifier] Identifier exp )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier86), root_1);

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
            if ( state.backtracking>0 ) { memoize(input, 20, assignMent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignMent"

    public static class varRef_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varRef"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:217:1: varRef : ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) );
    public final BeeParser.varRef_return varRef() throws RecognitionException {
        BeeParser.varRef_return retval = new BeeParser.varRef_return();
        retval.start = input.LT(1);
        int varRef_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier89=null;
        Token Identifier90=null;
        BeeParser.varAttribute_return varAttribute91 = null;

        BeeParser.safeOutput_return safeOutput92 = null;


        BeeCommonNodeTree Identifier89_tree=null;
        BeeCommonNodeTree Identifier90_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_varAttribute=new RewriteRuleSubtreeStream(adaptor,"rule varAttribute");
        RewriteRuleSubtreeStream stream_safeOutput=new RewriteRuleSubtreeStream(adaptor,"rule safeOutput");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:217:8: ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Identifier) ) {
                int LA20_1 = input.LA(2);

                if ( ((synpred31_Bee()&&(input.LT(1).getText().startsWith("__V")))) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:217:10: {...}? Identifier
                    {
                    if ( !((input.LT(1).getText().startsWith("__V"))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "varRef", "input.LT(1).getText().startsWith(\"__V\")");
                    }
                    Identifier89=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier89);



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
                    // 217:66: -> ^( TEXT_VAR_REFER[$Identifier] Identifier )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:217:69: ^( TEXT_VAR_REFER[$Identifier] Identifier )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_VAR_REFER, Identifier89), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:6: Identifier ( varAttribute )* ( safeOutput )?
                    {
                    Identifier90=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier90);

                    if ( state.backtracking==0 ) {
                      if(Identifier90.getText().startsWith("__"))throw new RuntimeException("Can Not call this Variable star with __"); 
                    }
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:132: ( varAttribute )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=111 && LA18_0<=113)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:134: varAttribute
                    	    {
                    	    pushFollow(FOLLOW_varAttribute_in_varRef1110);
                    	    varAttribute91=varAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_varAttribute.add(varAttribute91.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:149: ( safeOutput )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==110) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: safeOutput
                            {
                            pushFollow(FOLLOW_safeOutput_in_varRef1114);
                            safeOutput92=safeOutput();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_safeOutput.add(safeOutput92.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: Identifier, safeOutput, varAttribute
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 218:163: -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:166: ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_REFER, Identifier90), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:202: ( varAttribute )*
                        while ( stream_varAttribute.hasNext() ) {
                            adaptor.addChild(root_1, stream_varAttribute.nextTree());

                        }
                        stream_varAttribute.reset();
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:218:218: ( safeOutput )?
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
            if ( state.backtracking>0 ) { memoize(input, 21, varRef_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varRef"

    public static class safeOutput_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "safeOutput"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:221:1: safeOutput : '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) ;
    public final BeeParser.safeOutput_return safeOutput() throws RecognitionException {
        BeeParser.safeOutput_return retval = new BeeParser.safeOutput_return();
        retval.start = input.LT(1);
        int safeOutput_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal93=null;
        BeeParser.atom_return b = null;


        BeeCommonNodeTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:222:2: ( '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:222:4: '!' (b= atom )?
            {
            char_literal93=(Token)match(input,110,FOLLOW_110_in_safeOutput1146); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(char_literal93);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:222:9: (b= atom )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=Identifier && LA21_0<=LEFT_BRACE)||(LA21_0>=BOOLEAN && LA21_0<=DOUBLE)||LA21_0==99||LA21_0==113||LA21_0==115) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: b= atom
                    {
                    pushFollow(FOLLOW_atom_in_safeOutput1150);
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
            // 222:16: -> ^( SAFE_OUTPUT ( $b)? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:222:19: ^( SAFE_OUTPUT ( $b)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SAFE_OUTPUT, "SAFE_OUTPUT"), root_1);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:222:33: ( $b)?
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
            if ( state.backtracking>0 ) { memoize(input, 22, safeOutput_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "safeOutput"

    public static class varAttribute_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varAttribute"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:225:1: varAttribute : ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) );
    public final BeeParser.varAttribute_return varAttribute() throws RecognitionException {
        BeeParser.varAttribute_return retval = new BeeParser.varAttribute_return();
        retval.start = input.LT(1);
        int varAttribute_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal94=null;
        Token Identifier95=null;
        Token string_literal96=null;
        Token Identifier97=null;
        Token char_literal99=null;
        BeeParser.exp_return exp98 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal94_tree=null;
        BeeCommonNodeTree Identifier95_tree=null;
        BeeCommonNodeTree string_literal96_tree=null;
        BeeCommonNodeTree Identifier97_tree=null;
        BeeCommonNodeTree char_literal99_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:226:2: ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt22=1;
                }
                break;
            case 112:
                {
                alt22=2;
                }
                break;
            case 113:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:226:4: '.' Identifier
                    {
                    char_literal94=(Token)match(input,111,FOLLOW_111_in_varAttribute1173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(char_literal94);

                    Identifier95=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier95);



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
                    // 226:19: -> ^( ATTR_NAME Identifier )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:226:22: ^( ATTR_NAME Identifier )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:227:4: '.~' Identifier
                    {
                    string_literal96=(Token)match(input,112,FOLLOW_112_in_varAttribute1189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal96);

                    Identifier97=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1191); if (state.failed) return retval; 
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
                    // 227:21: -> ^( VIRTUAL_ATTR_NAME Identifier )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:227:24: ^( VIRTUAL_ATTR_NAME Identifier )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:228:4: a= '[' exp ']'
                    {
                    a=(Token)match(input,113,FOLLOW_113_in_varAttribute1208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(a);

                    pushFollow(FOLLOW_exp_in_varAttribute1210);
                    exp98=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp98.getTree());
                    char_literal99=(Token)match(input,114,FOLLOW_114_in_varAttribute1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(char_literal99);



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
                    // 228:18: -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:228:20: ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
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
            if ( state.backtracking>0 ) { memoize(input, 23, varAttribute_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "varAttribute"

    public static class exp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:231:1: exp : condExp ;
    public final BeeParser.exp_return exp() throws RecognitionException {
        BeeParser.exp_return retval = new BeeParser.exp_return();
        retval.start = input.LT(1);
        int exp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.condExp_return condExp100 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:231:5: ( condExp )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:231:8: condExp
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExp_in_exp1233);
            condExp100=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExp100.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 24, exp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exp"

    public static class condExp_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExp"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:234:1: condExp : conditionalOrExpression ;
    public final BeeParser.condExp_return condExp() throws RecognitionException {
        BeeParser.condExp_return retval = new BeeParser.condExp_return();
        retval.start = input.LT(1);
        int condExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.conditionalOrExpression_return conditionalOrExpression101 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:234:9: ( conditionalOrExpression )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:234:11: conditionalOrExpression
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_condExp1244);
            conditionalOrExpression101=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression101.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, condExp_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExp"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:236:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
    public final BeeParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        BeeParser.conditionalOrExpression_return retval = new BeeParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token OR103=null;
        BeeParser.conditionalAndExpression_return conditionalAndExpression102 = null;

        BeeParser.conditionalAndExpression_return conditionalAndExpression104 = null;


        BeeCommonNodeTree OR103_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:237:5: ( conditionalAndExpression ( OR conditionalAndExpression )* )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:237:9: conditionalAndExpression ( OR conditionalAndExpression )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1262);
            conditionalAndExpression102=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression102.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:238:9: ( OR conditionalAndExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:238:10: OR conditionalAndExpression
            	    {
            	    OR103=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression1273); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR103_tree = (BeeCommonNodeTree)adaptor.create(OR103);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(OR103_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1276);
            	    conditionalAndExpression104=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression104.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
            if ( state.backtracking>0 ) { memoize(input, 26, conditionalOrExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:242:1: conditionalAndExpression : condExpNotItem ( AND condExpNotItem )* ;
    public final BeeParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        BeeParser.conditionalAndExpression_return retval = new BeeParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token AND106=null;
        BeeParser.condExpNotItem_return condExpNotItem105 = null;

        BeeParser.condExpNotItem_return condExpNotItem107 = null;


        BeeCommonNodeTree AND106_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:243:5: ( condExpNotItem ( AND condExpNotItem )* )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:243:9: condExpNotItem ( AND condExpNotItem )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1307);
            condExpNotItem105=condExpNotItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem105.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:244:9: ( AND condExpNotItem )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:244:10: AND condExpNotItem
            	    {
            	    AND106=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression1318); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND106_tree = (BeeCommonNodeTree)adaptor.create(AND106);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(AND106_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1321);
            	    condExpNotItem107=condExpNotItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem107.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 27, conditionalAndExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class condExpNotItem_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpNotItem"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:247:1: condExpNotItem : ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) );
    public final BeeParser.condExpNotItem_return condExpNotItem() throws RecognitionException {
        BeeParser.condExpNotItem_return retval = new BeeParser.condExpNotItem_return();
        retval.start = input.LT(1);
        int condExpNotItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal109=null;
        BeeParser.condExpItem_return condExpItem108 = null;

        BeeParser.condExpItem_return condExpItem110 = null;


        BeeCommonNodeTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_condExpItem=new RewriteRuleSubtreeStream(adaptor,"rule condExpItem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:248:2: ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=Identifier && LA25_0<=LEFT_BRACE)||(LA25_0>=ADD && LA25_0<=MINUS)||(LA25_0>=BOOLEAN && LA25_0<=DOUBLE)||LA25_0==99||LA25_0==113||LA25_0==115) ) {
                alt25=1;
            }
            else if ( (LA25_0==110) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:248:4: condExpItem
                    {
                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1346);
                    condExpItem108=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem108.getTree());


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
                    // 248:16: -> condExpItem
                    {
                        adaptor.addChild(root_0, stream_condExpItem.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:249:4: ( '!' ) condExpItem
                    {
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:249:4: ( '!' )
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:249:5: '!'
                    {
                    char_literal109=(Token)match(input,110,FOLLOW_110_in_condExpNotItem1355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(char_literal109);


                    }

                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1358);
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
                    // 249:22: -> ^( NOT condExpItem )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:249:25: ^( NOT condExpItem )
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
            if ( state.backtracking>0 ) { memoize(input, 28, condExpNotItem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExpNotItem"

    public static class condExpItem_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpItem"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:250:1: condExpItem : aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? ;
    public final BeeParser.condExpItem_return condExpItem() throws RecognitionException {
        BeeParser.condExpItem_return retval = new BeeParser.condExpItem_return();
        retval.start = input.LT(1);
        int condExpItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.aexpr_return l = null;

        BeeParser.aexpr_return aexpr111 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:2: ( aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:6: aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpItem1377);
            aexpr111=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr111.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:12: ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=EQUAL && LA27_0<=LESS_EQUAL)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr
                    {
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL )
                    int alt26=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt26=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt26=2;
                        }
                        break;
                    case LARGE:
                        {
                        alt26=3;
                        }
                        break;
                    case LARGE_EQUAL:
                        {
                        alt26=4;
                        }
                        break;
                    case LESS:
                        {
                        alt26=5;
                        }
                        break;
                    case LESS_EQUAL:
                        {
                        alt26=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:15: a= EQUAL
                            {
                            a=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_condExpItem1384); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:24: a= NOT_EQUAL
                            {
                            a=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_condExpItem1389); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:37: a= LARGE
                            {
                            a=(Token)match(input,LARGE,FOLLOW_LARGE_in_condExpItem1394); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:46: a= LARGE_EQUAL
                            {
                            a=(Token)match(input,LARGE_EQUAL,FOLLOW_LARGE_EQUAL_in_condExpItem1399); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:61: a= LESS
                            {
                            a=(Token)match(input,LESS,FOLLOW_LESS_in_condExpItem1404); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:251:69: a= LESS_EQUAL
                            {
                            a=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_condExpItem1409); if (state.failed) return retval;
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
                    pushFollow(FOLLOW_aexpr_in_condExpItem1416);
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
            if ( state.backtracking>0 ) { memoize(input, 29, condExpItem_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "condExpItem"

    public static class aexpr_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:1: aexpr : mexpr ( (a= ADD | a= MINUS ) mexpr )* ;
    public final BeeParser.aexpr_return aexpr() throws RecognitionException {
        BeeParser.aexpr_return retval = new BeeParser.aexpr_return();
        retval.start = input.LT(1);
        int aexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.mexpr_return mexpr112 = null;

        BeeParser.mexpr_return mexpr113 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:7: ( mexpr ( (a= ADD | a= MINUS ) mexpr )* )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:9: mexpr ( (a= ADD | a= MINUS ) mexpr )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr1426);
            mexpr112=mexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr112.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:15: ( (a= ADD | a= MINUS ) mexpr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=ADD && LA29_0<=MINUS)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:16: (a= ADD | a= MINUS ) mexpr
            	    {
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:16: (a= ADD | a= MINUS )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==ADD) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==MINUS) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:17: a= ADD
            	            {
            	            a=(Token)match(input,ADD,FOLLOW_ADD_in_aexpr1432); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:252:24: a= MINUS
            	            {
            	            a=(Token)match(input,MINUS,FOLLOW_MINUS_in_aexpr1437); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr1441);
            	    mexpr113=mexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr113.getTree());
            	    if ( state.backtracking==0 ) {
            	      if(isStrictMVC)	throw new MVCStrictException(a);
            	    }

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
            if ( state.backtracking>0 ) { memoize(input, 30, aexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:1: mexpr : unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* ;
    public final BeeParser.mexpr_return mexpr() throws RecognitionException {
        BeeParser.mexpr_return retval = new BeeParser.mexpr_return();
        retval.start = input.LT(1);
        int mexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.unaryAtom_return unaryAtom114 = null;

        BeeParser.unaryAtom_return unaryAtom115 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:9: ( unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:17: unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_unaryAtom_in_mexpr1461);
            unaryAtom114=unaryAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom114.getTree());
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:27: ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=MULTIP && LA31_0<=MOD)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:28: (a= MULTIP | a= DIV | a= MOD ) unaryAtom
            	    {
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:28: (a= MULTIP | a= DIV | a= MOD )
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case MULTIP:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:29: a= MULTIP
            	            {
            	            a=(Token)match(input,MULTIP,FOLLOW_MULTIP_in_mexpr1467); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:39: a= DIV
            	            {
            	            a=(Token)match(input,DIV,FOLLOW_DIV_in_mexpr1472); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:253:46: a= MOD
            	            {
            	            a=(Token)match(input,MOD,FOLLOW_MOD_in_mexpr1477); if (state.failed) return retval;
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
            	    pushFollow(FOLLOW_unaryAtom_in_mexpr1482);
            	    unaryAtom115=unaryAtom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom115.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
            if ( state.backtracking>0 ) { memoize(input, 31, mexpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class atom_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:254:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );
    public final BeeParser.atom_return atom() throws RecognitionException {
        BeeParser.atom_return retval = new BeeParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token BOOLEAN116=null;
        Token INT117=null;
        Token NULL118=null;
        Token DOUBLE119=null;
        Token char_literal121=null;
        Token char_literal123=null;
        BeeParser.varRef_return varRef120 = null;

        BeeParser.exp_return exp122 = null;

        BeeParser.functionCall_return functionCall124 = null;

        BeeParser.nativeMethod_return nativeMethod125 = null;

        BeeParser.json_return json126 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree BOOLEAN116_tree=null;
        BeeCommonNodeTree INT117_tree=null;
        BeeCommonNodeTree NULL118_tree=null;
        BeeCommonNodeTree DOUBLE119_tree=null;
        BeeCommonNodeTree char_literal121_tree=null;
        BeeCommonNodeTree char_literal123_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:254:6: ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json )
            int alt32=10;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:254:8: BOOLEAN
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    BOOLEAN116=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN116_tree = (BeeCommonNodeTree)adaptor.create(BOOLEAN116);
                    adaptor.addChild(root_0, BOOLEAN116_tree);
                    }

                    }
                    break;
                case 2 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:256:6: INT
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    INT117=(Token)match(input,INT,FOLLOW_INT_in_atom1500); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT117_tree = (BeeCommonNodeTree)adaptor.create(INT117);
                    adaptor.addChild(root_0, INT117_tree);
                    }

                    }
                    break;
                case 3 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:257:4: NULL
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    NULL118=(Token)match(input,NULL,FOLLOW_NULL_in_atom1505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL118_tree = (BeeCommonNodeTree)adaptor.create(NULL118);
                    adaptor.addChild(root_0, NULL118_tree);
                    }

                    }
                    break;
                case 4 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:258:4: DOUBLE
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    DOUBLE119=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1510); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE119_tree = (BeeCommonNodeTree)adaptor.create(DOUBLE119);
                    adaptor.addChild(root_0, DOUBLE119_tree);
                    }

                    }
                    break;
                case 5 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:259:4: a= StringLiteral
                    {
                    a=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_atom1517); if (state.failed) return retval; 
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
                    // 259:20: ->
                    {
                        adaptor.addChild(root_0, new BeeCommonNodeTree(new CommonToken(StringLiteral,BeetlUtil.getEscapeString((a!=null?a.getText():null)))));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:260:4: varRef
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_atom1526);
                    varRef120=varRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varRef120.getTree());

                    }
                    break;
                case 7 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:261:4: '(' exp ')'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    char_literal121=(Token)match(input,99,FOLLOW_99_in_atom1532); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_atom1535);
                    exp122=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp122.getTree());
                    char_literal123=(Token)match(input,101,FOLLOW_101_in_atom1537); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:262:4: functionCall[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_atom1544);
                    functionCall124=functionCall(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall124.getTree());

                    }
                    break;
                case 9 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:263:4: nativeMethod[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_atom1550);
                    nativeMethod125=nativeMethod(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod125.getTree());

                    }
                    break;
                case 10 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:264:4: json
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_json_in_atom1556);
                    json126=json();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, json126.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 32, atom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class unaryAtom_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryAtom"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:266:1: unaryAtom : ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom );
    public final BeeParser.unaryAtom_return unaryAtom() throws RecognitionException {
        BeeParser.unaryAtom_return retval = new BeeParser.unaryAtom_return();
        retval.start = input.LT(1);
        int unaryAtom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token MINUS128=null;
        Token ADD129=null;
        BeeParser.atom_return a = null;

        BeeParser.atom_return atom127 = null;

        BeeParser.atom_return atom130 = null;


        BeeCommonNodeTree MINUS128_tree=null;
        BeeCommonNodeTree ADD129_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:267:2: ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom )
            int alt33=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case StringLiteral:
            case LEFT_BRACE:
            case BOOLEAN:
            case INT:
            case NULL:
            case DOUBLE:
            case 99:
            case 113:
            case 115:
                {
                alt33=1;
                }
                break;
            case MINUS:
                {
                alt33=2;
                }
                break;
            case ADD:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:267:4: atom
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryAtom1567);
                    atom127=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom127.getTree());

                    }
                    break;
                case 2 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:268:4: MINUS a= atom
                    {
                    MINUS128=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryAtom1573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS128);

                    pushFollow(FOLLOW_atom_in_unaryAtom1577);
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
                    // 268:17: -> ^( NEGATOM atom )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:268:19: ^( NEGATOM atom )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:269:4: ADD atom
                    {
                    ADD129=(Token)match(input,ADD,FOLLOW_ADD_in_unaryAtom1589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ADD.add(ADD129);

                    pushFollow(FOLLOW_atom_in_unaryAtom1591);
                    atom130=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom130.getTree());


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
                    // 269:13: -> atom
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
            if ( state.backtracking>0 ) { memoize(input, 33, unaryAtom_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryAtom"

    public static class nativeMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nativeMethod"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:1: nativeMethod[boolean statmentCall] : a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ;
    public final BeeParser.nativeMethod_return nativeMethod(boolean statmentCall) throws RecognitionException {
        BeeParser.nativeMethod_return retval = new BeeParser.nativeMethod_return();
        retval.start = input.LT(1);
        int nativeMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier131=null;
        Token char_literal132=null;
        Token Identifier133=null;
        Token char_literal134=null;
        BeeParser.classMethod_return classMethod135 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier131_tree=null;
        BeeCommonNodeTree char_literal132_tree=null;
        BeeCommonNodeTree Identifier133_tree=null;
        BeeCommonNodeTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_classMethod=new RewriteRuleSubtreeStream(adaptor,"rule classMethod");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:37: (a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:38: a= '@' Identifier ( '.' Identifier )* ( '.' classMethod )?
            {
            a=(Token)match(input,115,FOLLOW_115_in_nativeMethod1608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(a);

            Identifier131=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier131);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:55: ( '.' Identifier )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==111) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==Identifier) ) {
                        int LA34_3 = input.LA(3);

                        if ( (LA34_3==EOF||LA34_3==RIGHT_BRACE||LA34_3==RIGHT_TOKEN||(LA34_3>=OR && LA34_3<=MOD)||LA34_3==94||(LA34_3>=100 && LA34_3<=101)||LA34_3==111||LA34_3==114||LA34_3==118) ) {
                            alt34=1;
                        }


                    }


                }


                switch (alt34) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:56: '.' Identifier
            	    {
            	    char_literal132=(Token)match(input,111,FOLLOW_111_in_nativeMethod1613); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_111.add(char_literal132);

            	    Identifier133=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1615); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier133);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:73: ( '.' classMethod )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==111) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:271:74: '.' classMethod
                    {
                    char_literal134=(Token)match(input,111,FOLLOW_111_in_nativeMethod1620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(char_literal134);

                    pushFollow(FOLLOW_classMethod_in_nativeMethod1622);
                    classMethod135=classMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMethod.add(classMethod135.getTree());

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
            // 272:4: -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
            if (statmentCall) {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:272:25: ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:272:39: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_2);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:272:60: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:272:72: ( classMethod )?
                if ( stream_classMethod.hasNext() ) {
                    adaptor.addChild(root_2, stream_classMethod.nextTree());

                }
                stream_classMethod.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 273:4: -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:273:7: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMethod )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_1);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:273:28: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:273:40: ( classMethod )?
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
            if ( state.backtracking>0 ) { memoize(input, 34, nativeMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "nativeMethod"

    public static class classMethod_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classMethod"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:276:1: classMethod : Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) ;
    public final BeeParser.classMethod_return classMethod() throws RecognitionException {
        BeeParser.classMethod_return retval = new BeeParser.classMethod_return();
        retval.start = input.LT(1);
        int classMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token char_literal141=null;
        BeeParser.exp_return exp138 = null;

        BeeParser.exp_return exp140 = null;


        BeeCommonNodeTree Identifier136_tree=null;
        BeeCommonNodeTree char_literal137_tree=null;
        BeeCommonNodeTree char_literal139_tree=null;
        BeeCommonNodeTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:2: ( Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:4: Identifier '(' ( exp ( ',' exp )* )? ')'
            {
            Identifier136=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMethod1687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier136);

            char_literal137=(Token)match(input,99,FOLLOW_99_in_classMethod1689); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal137);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:19: ( exp ( ',' exp )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=Identifier && LA37_0<=LEFT_BRACE)||(LA37_0>=ADD && LA37_0<=MINUS)||(LA37_0>=BOOLEAN && LA37_0<=DOUBLE)||LA37_0==99||LA37_0==110||LA37_0==113||LA37_0==115) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:20: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_classMethod1692);
                    exp138=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp138.getTree());
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:24: ( ',' exp )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==100) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:25: ',' exp
                    	    {
                    	    char_literal139=(Token)match(input,100,FOLLOW_100_in_classMethod1695); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_100.add(char_literal139);

                    	    pushFollow(FOLLOW_exp_in_classMethod1697);
                    	    exp140=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp140.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal141=(Token)match(input,101,FOLLOW_101_in_classMethod1704); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal141);



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
            // 277:42: -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:44: ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_METHOD, Identifier136), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:277:83: ( exp )*
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
            if ( state.backtracking>0 ) { memoize(input, 35, classMethod_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classMethod"

    public static class functionFullName_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionFullName"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:1: functionFullName : a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) ;
    public final BeeParser.functionFullName_return functionFullName() throws RecognitionException {
        BeeParser.functionFullName_return retval = new BeeParser.functionFullName_return();
        retval.start = input.LT(1);
        int functionFullName_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal142=null;
        Token Identifier143=null;

        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal142_tree=null;
        BeeCommonNodeTree Identifier143_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:18: (a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:19: a= Identifier ( '.' Identifier )?
            {
            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:32: ( '.' Identifier )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==111) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:33: '.' Identifier
                    {
                    char_literal142=(Token)match(input,111,FOLLOW_111_in_functionFullName1729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(char_literal142);

                    Identifier143=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName1731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier143);


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
            // 279:51: -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:54: ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION_FULL_NAME, a), root_1);

                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:279:80: ( Identifier )*
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
            if ( state.backtracking>0 ) { memoize(input, 36, functionFullName_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionFullName"

    public static class switchStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatment"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:281:1: switchStatment : a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) ;
    public final BeeParser.switchStatment_return switchStatment() throws RecognitionException {
        BeeParser.switchStatment_return retval = new BeeParser.switchStatment_return();
        retval.start = input.LT(1);
        int switchStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal144=null;
        Token char_literal145=null;
        Token char_literal146=null;
        Token char_literal149=null;
        BeeParser.exp_return base = null;

        BeeParser.caseStatment_return caseStatment147 = null;

        BeeParser.defaultStatment_return defaultStatment148 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal144_tree=null;
        BeeCommonNodeTree char_literal145_tree=null;
        BeeCommonNodeTree char_literal146_tree=null;
        BeeCommonNodeTree char_literal149_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule caseStatment");
        RewriteRuleSubtreeStream stream_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:282:2: (a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:282:4: a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}'
            {
            a=(Token)match(input,116,FOLLOW_116_in_switchStatment1756); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(a);

            char_literal144=(Token)match(input,99,FOLLOW_99_in_switchStatment1758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_99.add(char_literal144);

            pushFollow(FOLLOW_exp_in_switchStatment1762);
            base=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(base.getTree());
            char_literal145=(Token)match(input,101,FOLLOW_101_in_switchStatment1764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(char_literal145);

            char_literal146=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_switchStatment1766); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal146);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:282:36: ( caseStatment )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==117) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: caseStatment
            	    {
            	    pushFollow(FOLLOW_caseStatment_in_switchStatment1768);
            	    caseStatment147=caseStatment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStatment.add(caseStatment147.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:282:50: ( defaultStatment )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==119) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:0:0: defaultStatment
                    {
                    pushFollow(FOLLOW_defaultStatment_in_switchStatment1771);
                    defaultStatment148=defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defaultStatment.add(defaultStatment148.getTree());

                    }
                    break;

            }

            char_literal149=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_switchStatment1774); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal149);



            // AST REWRITE
            // elements: caseStatment, defaultStatment, base
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
            // 283:3: -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:283:5: ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SWITCH, a), root_1);

                adaptor.addChild(root_1, stream_base.nextTree());
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:283:24: ( caseStatment )*
                while ( stream_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseStatment.nextTree());

                }
                stream_caseStatment.reset();
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:283:38: ( defaultStatment )?
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
            if ( state.backtracking>0 ) { memoize(input, 37, switchStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchStatment"

    public static class caseStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStatment"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:284:1: caseStatment : a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) ;
    public final BeeParser.caseStatment_return caseStatment() throws RecognitionException {
        BeeParser.caseStatment_return retval = new BeeParser.caseStatment_return();
        retval.start = input.LT(1);
        int caseStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal151=null;
        BeeParser.exp_return exp150 = null;

        BeeParser.statements_return statements152 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal151_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:285:2: (a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:285:4: a= 'case' exp ':' statements
            {
            a=(Token)match(input,117,FOLLOW_117_in_caseStatment1803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(a);

            pushFollow(FOLLOW_exp_in_caseStatment1805);
            exp150=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp150.getTree());
            char_literal151=(Token)match(input,118,FOLLOW_118_in_caseStatment1807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(char_literal151);

            pushFollow(FOLLOW_statements_in_caseStatment1809);
            statements152=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements152.getTree());


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
            // 285:32: -> ^( CASE[$a] exp statements )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:285:34: ^( CASE[$a] exp statements )
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
            if ( state.backtracking>0 ) { memoize(input, 38, caseStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "caseStatment"

    public static class defaultStatment_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStatment"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:286:1: defaultStatment : a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) ;
    public final BeeParser.defaultStatment_return defaultStatment() throws RecognitionException {
        BeeParser.defaultStatment_return retval = new BeeParser.defaultStatment_return();
        retval.start = input.LT(1);
        int defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal153=null;
        BeeParser.statements_return statements154 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal153_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:287:2: (a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) )
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:287:4: a= 'default' ':' statements
            {
            a=(Token)match(input,119,FOLLOW_119_in_defaultStatment1829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(a);

            char_literal153=(Token)match(input,118,FOLLOW_118_in_defaultStatment1831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_118.add(char_literal153);

            pushFollow(FOLLOW_statements_in_defaultStatment1833);
            statements154=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements154.getTree());


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
            // 287:31: -> ^( DEFAULT[$a] statements )
            {
                // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:287:34: ^( DEFAULT[$a] statements )
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
            if ( state.backtracking>0 ) { memoize(input, 39, defaultStatment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "defaultStatment"

    public static class json_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "json"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:1: json : ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) );
    public final BeeParser.json_return json() throws RecognitionException {
        BeeParser.json_return retval = new BeeParser.json_return();
        retval.start = input.LT(1);
        int json_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        Token char_literal164=null;
        BeeParser.exp_return exp156 = null;

        BeeParser.exp_return exp158 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue161 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue163 = null;


        BeeCommonNodeTree char_literal155_tree=null;
        BeeCommonNodeTree char_literal157_tree=null;
        BeeCommonNodeTree char_literal159_tree=null;
        BeeCommonNodeTree char_literal160_tree=null;
        BeeCommonNodeTree char_literal162_tree=null;
        BeeCommonNodeTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_jsonKeyValue=new RewriteRuleSubtreeStream(adaptor,"rule jsonKeyValue");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:6: ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==113) ) {
                alt45=1;
            }
            else if ( (LA45_0==LEFT_BRACE) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:8: '[' ( exp ( ',' exp )* )? ']'
                    {
                    char_literal155=(Token)match(input,113,FOLLOW_113_in_json1849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(char_literal155);

                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:12: ( exp ( ',' exp )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( ((LA42_0>=Identifier && LA42_0<=LEFT_BRACE)||(LA42_0>=ADD && LA42_0<=MINUS)||(LA42_0>=BOOLEAN && LA42_0<=DOUBLE)||LA42_0==99||LA42_0==110||LA42_0==113||LA42_0==115) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:13: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_json1852);
                            exp156=exp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exp.add(exp156.getTree());
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:18: ( ',' exp )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==100) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:19: ',' exp
                            	    {
                            	    char_literal157=(Token)match(input,100,FOLLOW_100_in_json1856); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_100.add(char_literal157);

                            	    pushFollow(FOLLOW_exp_in_json1858);
                            	    exp158=exp();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_exp.add(exp158.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal159=(Token)match(input,114,FOLLOW_114_in_json1864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(char_literal159);



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
                    // 288:35: -> ^( JSONARRAY ( exp )* )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:37: ^( JSONARRAY ( exp )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONARRAY, "JSONARRAY"), root_1);

                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:288:49: ( exp )*
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:4: '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}'
                    {
                    char_literal160=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_json1877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal160);

                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:8: ( jsonKeyValue ( ',' jsonKeyValue )* )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=Identifier && LA44_0<=StringLiteral)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:9: jsonKeyValue ( ',' jsonKeyValue )*
                            {
                            pushFollow(FOLLOW_jsonKeyValue_in_json1880);
                            jsonKeyValue161=jsonKeyValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue161.getTree());
                            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:22: ( ',' jsonKeyValue )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( (LA43_0==100) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:23: ',' jsonKeyValue
                            	    {
                            	    char_literal162=(Token)match(input,100,FOLLOW_100_in_json1883); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_100.add(char_literal162);

                            	    pushFollow(FOLLOW_jsonKeyValue_in_json1885);
                            	    jsonKeyValue163=jsonKeyValue();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue163.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop43;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal164=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_json1891); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal164);



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
                    // 289:48: -> ^( JSONMAP ( jsonKeyValue )* )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:50: ^( JSONMAP ( jsonKeyValue )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONMAP, "JSONMAP"), root_1);

                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:289:60: ( jsonKeyValue )*
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
            if ( state.backtracking>0 ) { memoize(input, 40, json_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "json"

    public static class jsonKeyValue_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jsonKeyValue"
    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:291:1: jsonKeyValue : ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) );
    public final BeeParser.jsonKeyValue_return jsonKeyValue() throws RecognitionException {
        BeeParser.jsonKeyValue_return retval = new BeeParser.jsonKeyValue_return();
        retval.start = input.LT(1);
        int jsonKeyValue_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token StringLiteral165=null;
        Token char_literal166=null;
        Token Identifier168=null;
        Token char_literal169=null;
        BeeParser.exp_return exp167 = null;

        BeeParser.exp_return exp170 = null;


        BeeCommonNodeTree StringLiteral165_tree=null;
        BeeCommonNodeTree char_literal166_tree=null;
        BeeCommonNodeTree Identifier168_tree=null;
        BeeCommonNodeTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:292:2: ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==StringLiteral) ) {
                alt46=1;
            }
            else if ( (LA46_0==Identifier) ) {
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:292:4: StringLiteral ':' exp
                    {
                    StringLiteral165=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_jsonKeyValue1909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral165);

                    char_literal166=(Token)match(input,118,FOLLOW_118_in_jsonKeyValue1911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal166);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue1913);
                    exp167=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp167.getTree());


                    // AST REWRITE
                    // elements: StringLiteral, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BeeCommonNodeTree)adaptor.nil();
                    // 292:26: -> ^( JSONKEYVALUE StringLiteral exp )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:292:28: ^( JSONKEYVALUE StringLiteral exp )
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
                    // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:293:4: Identifier ':' exp
                    {
                    Identifier168=(Token)match(input,Identifier,FOLLOW_Identifier_in_jsonKeyValue1929); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier168);

                    char_literal169=(Token)match(input,118,FOLLOW_118_in_jsonKeyValue1931); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal169);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue1933);
                    exp170=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp170.getTree());


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
                    // 293:23: -> ^( JSONKEYVALUE Identifier exp )
                    {
                        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:293:25: ^( JSONKEYVALUE Identifier exp )
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
            if ( state.backtracking>0 ) { memoize(input, 41, jsonKeyValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "jsonKeyValue"

    // $ANTLR start synpred24_Bee
    public final void synpred24_Bee_fragment() throws RecognitionException {   
        BeeParser.statement_return n = null;


        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:38: ( 'else' n= statement )
        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:193:38: 'else' n= statement
        {
        match(input,107,FOLLOW_107_in_synpred24_Bee785); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred24_Bee789);
        n=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_Bee

    // $ANTLR start synpred30_Bee
    public final void synpred30_Bee_fragment() throws RecognitionException {   
        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:211:4: ( Identifier '=' exp )
        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:211:4: Identifier '=' exp
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred30_Bee1008); if (state.failed) return ;
        match(input,109,FOLLOW_109_in_synpred30_Bee1010); if (state.failed) return ;
        pushFollow(FOLLOW_exp_in_synpred30_Bee1012);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Bee

    // $ANTLR start synpred31_Bee
    public final void synpred31_Bee_fragment() throws RecognitionException {   
        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:217:10: ({...}? Identifier )
        // e:\\lijz\\javamonkey\\bee\\trunk\\workspace\\beetl1.2.beta\\src\\org\\bee\\tl\\core\\Bee.g:217:10: {...}? Identifier
        {
        if ( !((input.LT(1).getText().startsWith("__V"))) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred31_Bee", "input.LT(1).getText().startsWith(\"__V\")");
        }
        match(input,Identifier,FOLLOW_Identifier_in_synpred31_Bee1086); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Bee

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
    public final boolean synpred30_Bee() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Bee_fragment(); // can never throw exception
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
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA3_eotS =
        "\21\uffff";
    static final String DFA3_eofS =
        "\21\uffff";
    static final String DFA3_minS =
        "\1\54\2\uffff\1\143\15\uffff";
    static final String DFA3_maxS =
        "\1\164\2\uffff\1\157\15\uffff";
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
            return "134:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | nativeMethod[true] ';' | directive );";
        }
    }
    static final String DFA32_eotS =
        "\16\uffff";
    static final String DFA32_eofS =
        "\6\uffff\1\12\6\uffff\1\12";
    static final String DFA32_minS =
        "\1\54\5\uffff\1\57\4\uffff\1\54\1\uffff\1\57";
    static final String DFA32_maxS =
        "\1\163\5\uffff\1\166\4\uffff\1\54\1\uffff\1\166";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\uffff"+
        "\1\10\1\uffff";
    static final String DFA32_specialS =
        "\16\uffff}>";
    static final String[] DFA32_transitionS = {
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "254:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );";
        }
    }
 

    public static final BitSet FOLLOW_statements_in_prog299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements310 = new BitSet(new long[]{0x000D500000000002L,0x0018064780000000L});
    public static final BitSet FOLLOW_constantsTextStatment_in_statement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDefine_in_statement326 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignMent_in_statement334 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textStatment_in_statement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatment_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatment_in_statement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStament_in_statement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statmentBlock_in_statement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messFunction_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatment_in_statement372 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatment_in_statement380 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatment_in_statement388 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatment_in_statement396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_statement401 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_statement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_statement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_directive425 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_directive428 = new BitSet(new long[]{0x0000200000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_StringLiteral_in_directive431 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_directive435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_returnStatment456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_continueStatment469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_breakStatment483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProcessFunction_in_messFunction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_messFunction517 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_messFunction520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textProcessFunction531 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_textProcessFunction535 = new BitSet(new long[]{0x3000700000000000L,0x000A40280000001EL});
    public static final BitSet FOLLOW_exp_in_textProcessFunction538 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_textProcessFunction541 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_textProcessFunction543 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_101_in_textProcessFunction549 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_textProcessFunction551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_functionCall586 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_functionCall590 = new BitSet(new long[]{0x3000700000000000L,0x000A40280000001EL});
    public static final BitSet FOLLOW_exp_in_functionCall593 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_functionCall596 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_functionCall598 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_101_in_functionCall604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_statmentBlock653 = new BitSet(new long[]{0x000DD00000000000L,0x0018064780000000L});
    public static final BitSet FOLLOW_statements_in_statmentBlock655 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_statmentBlock658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_forStatment675 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_forStatment677 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_forStatment681 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_forStatment683 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_forStatment688 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_forStatment690 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment697 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_forStatment701 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_whileStament740 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_whileStament742 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_condExp_in_whileStament746 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_whileStament748 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_whileStament751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ifStatment772 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ifStatment774 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_condExp_in_ifStatment776 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_ifStatment778 = new BitSet(new long[]{0x000D500000000000L,0x00180E4780000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment782 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ifStatment785 = new BitSet(new long[]{0x000D500000000000L,0x0018064780000000L});
    public static final BitSet FOLLOW_statement_in_ifStatment789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment819 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_constantsTextStatment822 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_constantsTextStatment824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment854 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_textVar_in_textStatment856 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment871 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_textStatment873 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_textVar_in_textStatment875 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_textStatment877 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_textVar897 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_textVar900 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_functionFullName_in_textVar904 = new BitSet(new long[]{0x0000000000000002L,0x0000201000000000L});
    public static final BitSet FOLLOW_109_in_textVar907 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_textVar909 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_in_varDefine951 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine954 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_varDefine957 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine959 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1008 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_varAssignMent1010 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_varAssignMent1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1030 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_varAssignMent1032 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_varAssignMent1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignMent1058 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_assignMent1060 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_assignMent1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1105 = new BitSet(new long[]{0x0000000000000002L,0x0003C00000000000L});
    public static final BitSet FOLLOW_varAttribute_in_varRef1110 = new BitSet(new long[]{0x0000000000000002L,0x0003C00000000000L});
    public static final BitSet FOLLOW_safeOutput_in_varRef1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_safeOutput1146 = new BitSet(new long[]{0x0000700000000002L,0x000A00080000001EL});
    public static final BitSet FOLLOW_atom_in_safeOutput1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_varAttribute1173 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_varAttribute1189 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_varAttribute1208 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_varAttribute1210 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_varAttribute1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExp_in_exp1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_condExp1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1262 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression1273 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1276 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1307 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression1318 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1321 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_condExpNotItem1355 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1377 = new BitSet(new long[]{0x0FC0000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_condExpItem1384 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_NOT_EQUAL_in_condExpItem1389 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_LARGE_in_condExpItem1394 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_LARGE_EQUAL_in_condExpItem1399 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_LESS_in_condExpItem1404 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_LESS_EQUAL_in_condExpItem1409 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1426 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_ADD_in_aexpr1432 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_MINUS_in_aexpr1437 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_mexpr_in_aexpr1441 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1461 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_MULTIP_in_mexpr1467 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_DIV_in_mexpr1472 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_MOD_in_mexpr1477 = new BitSet(new long[]{0x3000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1482 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_atom1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_atom1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_atom1532 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_atom1535 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_atom1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atom1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_atom1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_json_in_atom1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryAtom1573 = new BitSet(new long[]{0x0000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_atom_in_unaryAtom1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryAtom1589 = new BitSet(new long[]{0x0000700000000000L,0x000A00080000001EL});
    public static final BitSet FOLLOW_atom_in_unaryAtom1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_nativeMethod1608 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1610 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_nativeMethod1613 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1615 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_nativeMethod1620 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_classMethod_in_nativeMethod1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_classMethod1687 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_classMethod1689 = new BitSet(new long[]{0x3000700000000000L,0x000A40280000001EL});
    public static final BitSet FOLLOW_exp_in_classMethod1692 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_classMethod1695 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_classMethod1697 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_101_in_classMethod1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1726 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_functionFullName1729 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_switchStatment1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_switchStatment1758 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_switchStatment1762 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_101_in_switchStatment1764 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_switchStatment1766 = new BitSet(new long[]{0x0000800000000000L,0x00A0000000000000L});
    public static final BitSet FOLLOW_caseStatment_in_switchStatment1768 = new BitSet(new long[]{0x0000800000000000L,0x00A0000000000000L});
    public static final BitSet FOLLOW_defaultStatment_in_switchStatment1771 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_switchStatment1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_caseStatment1803 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_caseStatment1805 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_caseStatment1807 = new BitSet(new long[]{0x000D500000000000L,0x0018064780000000L});
    public static final BitSet FOLLOW_statements_in_caseStatment1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_defaultStatment1829 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_defaultStatment1831 = new BitSet(new long[]{0x000D500000000000L,0x0018064780000000L});
    public static final BitSet FOLLOW_statements_in_defaultStatment1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_json1849 = new BitSet(new long[]{0x3000700000000000L,0x000E40080000001EL});
    public static final BitSet FOLLOW_exp_in_json1852 = new BitSet(new long[]{0x0000000000000000L,0x0004001000000000L});
    public static final BitSet FOLLOW_100_in_json1856 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_json1858 = new BitSet(new long[]{0x0000000000000000L,0x0004001000000000L});
    public static final BitSet FOLLOW_114_in_json1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_json1877 = new BitSet(new long[]{0x0000B00000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json1880 = new BitSet(new long[]{0x0000800000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_json1883 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json1885 = new BitSet(new long[]{0x0000800000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_json1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_jsonKeyValue1909 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_jsonKeyValue1911 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_jsonKeyValue1929 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_jsonKeyValue1931 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_synpred24_Bee785 = new BitSet(new long[]{0x000D500000000000L,0x0018064780000000L});
    public static final BitSet FOLLOW_statement_in_synpred24_Bee789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred30_Bee1008 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_synpred30_Bee1010 = new BitSet(new long[]{0x3000700000000000L,0x000A40080000001EL});
    public static final BitSet FOLLOW_exp_in_synpred30_Bee1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred31_Bee1086 = new BitSet(new long[]{0x0000000000000002L});

}