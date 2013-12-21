// $ANTLR 3.3 Nov 30, 2010 12:50:56 E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g 2013-12-21 01:05:02

package org.bee.tl.core;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.bee.tl.core.exception.MVCStrictException;

public class BeeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR_DEFINE", "VAR_REFER", "ASSIGNMENT", "HOLDER", "TEXT_HOLDER", "FOR", "VAR_TEXT", "FM", "DEFAULT_FM", "SLIST", "IF", "EXP", "COND_EXP", "FUNCTION", "TEXT_PROCESS", "ATTR_NAME", "VIRTUAL_ATTR_NAME", "MAP_LIST_INDEX", "BREAK", "CONTINUE", "RETURN", "NOT", "SWITCH", "CASE", "DEFAULT", "G_SWITCH", "G_CASE", "G_DEFAULT", "G_CASE_EXPLIST", "JSON", "JSONARRAY", "JSONMAP", "JSONKEYVALUE", "CLASS_STATIC_FUNCTION", "CLASS_FUNCTION", "CLASS_METHOD", "CLASS_ARRAY", "VARIABLE_VAR_REFER", "TEXT_VAR_REFER", "MISSING_VARIABLE_VAR_REFER", "FUNCTION_FULL_NAME", "SAFE_OUTPUT", "DIRECT_CALL", "NEGATOM", "WHILE", "DIRECTIVE", "COND", "SIMPLE_CASE", "SIMPLE_LEFT_CASE", "SIMPLE_RIGHT_CASE", "Identifier", "StringLiteral", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_TEXT_TOKEN", "RIGHT_TOKEN", "LEFT_TOKEN", "VAR", "OR", "AND", "EQUAL", "NOT_EQUAL", "LARGE", "LARGE_EQUAL", "LESS", "LESS_EQUAL", "ADD", "MINUS", "MULTIP", "DIV", "MOD", "BOOLEAN", "INT", "NULL", "DOUBLE", "ID_START", "Comment", "LineComment", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "DecimalLiteral", "HexIntegerLiteral", "NumericLiteral", "ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", "UnicodeDigit", "UnicodeConnectorPunctuation", "UnicodeCombiningMark", "WhiteSpace", "';'", "'select'", "'('", "')'", "'case'", "','", "':'", "'default'", "'DIRECTIVE'", "'return'", "'continue'", "'break'", "'for'", "'in '", "'elsefor'", "'while'", "'if'", "'else'", "'!('", "'='", "'!'", "'.'", "'.~'", "'['", "']'", "'?'", "'@'", "'switch'"
    };
    public static final int EOF=-1;
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
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
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
    public static final int COND=50;
    public static final int SIMPLE_CASE=51;
    public static final int SIMPLE_LEFT_CASE=52;
    public static final int SIMPLE_RIGHT_CASE=53;
    public static final int Identifier=54;
    public static final int StringLiteral=55;
    public static final int LEFT_BRACE=56;
    public static final int RIGHT_BRACE=57;
    public static final int LEFT_TEXT_TOKEN=58;
    public static final int RIGHT_TOKEN=59;
    public static final int LEFT_TOKEN=60;
    public static final int VAR=61;
    public static final int OR=62;
    public static final int AND=63;
    public static final int EQUAL=64;
    public static final int NOT_EQUAL=65;
    public static final int LARGE=66;
    public static final int LARGE_EQUAL=67;
    public static final int LESS=68;
    public static final int LESS_EQUAL=69;
    public static final int ADD=70;
    public static final int MINUS=71;
    public static final int MULTIP=72;
    public static final int DIV=73;
    public static final int MOD=74;
    public static final int BOOLEAN=75;
    public static final int INT=76;
    public static final int NULL=77;
    public static final int DOUBLE=78;
    public static final int ID_START=79;
    public static final int Comment=80;
    public static final int LineComment=81;
    public static final int DoubleStringCharacter=82;
    public static final int SingleStringCharacter=83;
    public static final int EscapeSequence=84;
    public static final int CharacterEscapeSequence=85;
    public static final int HexEscapeSequence=86;
    public static final int UnicodeEscapeSequence=87;
    public static final int SingleEscapeCharacter=88;
    public static final int NonEscapeCharacter=89;
    public static final int EscapeCharacter=90;
    public static final int DecimalDigit=91;
    public static final int HexDigit=92;
    public static final int DecimalLiteral=93;
    public static final int HexIntegerLiteral=94;
    public static final int NumericLiteral=95;
    public static final int ExponentPart=96;
    public static final int IdentifierStart=97;
    public static final int IdentifierPart=98;
    public static final int UnicodeLetter=99;
    public static final int UnicodeDigit=100;
    public static final int UnicodeConnectorPunctuation=101;
    public static final int UnicodeCombiningMark=102;
    public static final int WhiteSpace=103;

    // delegates
    // delegators


        public BeeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public BeeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[134+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return BeeParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g"; }


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

    public void addCase(conditionalOrExpression_return exp, BeeParser.exp_return  left, BeeParser.exp_return  right){
     		BeeCommonNodeTree t = (BeeCommonNodeTree)exp.getTree();
    	    if(left!=null){
    	    	 BeeCommonNodeTree t1 = (BeeCommonNodeTree)left.getTree();
    	    	 t.expLeft = t1 ;
    	    }
    	    
    	    if(right!=null){
    	   	 BeeCommonNodeTree t1 = (BeeCommonNodeTree)right.getTree();
    	   	 t.expRight = t1 ;
    	   }



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

      boolean hasDynamic = false;
     boolean allDynamic = false;
     Set<String> dynamicNames = new HashSet(0);
        public void checkDynamic(String key,String value){
        	if(key.equalsIgnoreCase("dynamic")){
        		hasDynamic = true;
        		if(value==null){
        			allDynamic = true;
        			return ;
        		}
        		//去掉引号
        		value = value.substring(1,value.length()-1);
        		String[] array = value.split(",");
        		for(String objName:array){
        			if(objName.equals("...")){
        				allDynamic = true;
        			}else{
        				dynamicNames.add(objName);
        			}
        		}
        		
        	}
        }


    public static class prog_return extends ParserRuleReturnScope {
        BeeCommonNodeTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:182:1: prog : ( statements )? EOF ;
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
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:182:6: ( ( statements )? EOF )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:182:8: ( statements )? EOF
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:182:8: ( statements )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Identifier||LA1_0==LEFT_BRACE||LA1_0==LEFT_TEXT_TOKEN||(LA1_0>=LEFT_TOKEN && LA1_0<=VAR)||LA1_0==105||(LA1_0>=112 && LA1_0<=116)||(LA1_0>=119 && LA1_0<=120)||(LA1_0>=130 && LA1_0<=131)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_prog350);
                    statements1=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

                    }
                    break;

            }

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog353); if (state.failed) return retval;

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:183:1: statements : ( statement )+ ;
    public final BeeParser.statements_return statements() throws RecognitionException {
        BeeParser.statements_return retval = new BeeParser.statements_return();
        retval.start = input.LT(1);
        int statements_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.statement_return statement3 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:183:12: ( ( statement )+ )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:183:13: ( statement )+
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:183:13: ( statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Identifier||LA2_0==LEFT_BRACE||LA2_0==LEFT_TEXT_TOKEN||(LA2_0>=LEFT_TOKEN && LA2_0<=VAR)||LA2_0==105||(LA2_0>=112 && LA2_0<=116)||(LA2_0>=119 && LA2_0<=120)||(LA2_0>=130 && LA2_0<=131)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements361);
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:184:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive );
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
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:185:2: ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive )
            int alt3=16;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:185:4: constantsTextStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_constantsTextStatment_in_statement370);
                    constantsTextStatment4=constantsTextStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constantsTextStatment4.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:186:6: varDefine ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varDefine_in_statement377);
                    varDefine5=varDefine();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDefine5.getTree());
                    char_literal6=(Token)match(input,104,FOLLOW_104_in_statement379); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:187:4: assignMent ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_assignMent_in_statement385);
                    assignMent7=assignMent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignMent7.getTree());
                    char_literal8=(Token)match(input,104,FOLLOW_104_in_statement387); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:188:4: textStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_textStatment_in_statement393);
                    textStatment9=textStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textStatment9.getTree());

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:189:4: ifStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatment_in_statement398);
                    ifStatment10=ifStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatment10.getTree());

                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:190:4: forStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatment_in_statement403);
                    forStatment11=forStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatment11.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:191:4: whileStament
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStament_in_statement408);
                    whileStament12=whileStament();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStament12.getTree());

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:192:4: statmentBlock
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_statmentBlock_in_statement413);
                    statmentBlock13=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statmentBlock13.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:193:4: messFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_messFunction_in_statement418);
                    messFunction14=messFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, messFunction14.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:194:4: continueStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatment_in_statement423);
                    continueStatment15=continueStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatment15.getTree());
                    char_literal16=(Token)match(input,104,FOLLOW_104_in_statement425); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:195:4: breakStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatment_in_statement431);
                    breakStatment17=breakStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatment17.getTree());
                    char_literal18=(Token)match(input,104,FOLLOW_104_in_statement433); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:196:4: returnStatment ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatment_in_statement439);
                    returnStatment19=returnStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatment19.getTree());
                    char_literal20=(Token)match(input,104,FOLLOW_104_in_statement441); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:197:4: switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatment_in_statement447);
                    switchStatment21=switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatment21.getTree());

                    }
                    break;
                case 14 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:198:4: g_switchStatment
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_g_switchStatment_in_statement452);
                    g_switchStatment22=g_switchStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, g_switchStatment22.getTree());

                    }
                    break;
                case 15 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:199:4: nativeMethod[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_statement457);
                    nativeMethod23=nativeMethod(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod23.getTree());
                    char_literal24=(Token)match(input,104,FOLLOW_104_in_statement460); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:200:4: directive
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_directive_in_statement467);
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:204:1: g_switchStatment : a= 'select' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}' -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? ) ;
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
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_g_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule g_caseStatment");
        RewriteRuleSubtreeStream stream_g_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule g_defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:205:2: (a= 'select' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}' -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:205:4: a= 'select' ( '(' base= exp ')' )? '{' ( g_caseStatment )* ( g_defaultStatment )? '}'
            {
            a=(Token)match(input,105,FOLLOW_105_in_g_switchStatment482); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_105.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:205:15: ( '(' base= exp ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==106) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:205:16: '(' base= exp ')'
                    {
                    char_literal26=(Token)match(input,106,FOLLOW_106_in_g_switchStatment485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_106.add(char_literal26);

                    pushFollow(FOLLOW_exp_in_g_switchStatment489);
                    base=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(base.getTree());
                    char_literal27=(Token)match(input,107,FOLLOW_107_in_g_switchStatment491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal27);


                    }
                    break;

            }

            char_literal28=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_g_switchStatment495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal28);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:205:39: ( g_caseStatment )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==108) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: g_caseStatment
            	    {
            	    pushFollow(FOLLOW_g_caseStatment_in_g_switchStatment497);
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

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:205:55: ( g_defaultStatment )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==111) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: g_defaultStatment
                    {
                    pushFollow(FOLLOW_g_defaultStatment_in_g_switchStatment500);
                    g_defaultStatment30=g_defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_g_defaultStatment.add(g_defaultStatment30.getTree());

                    }
                    break;

            }

            char_literal31=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_g_switchStatment503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal31);



            // AST REWRITE
            // elements: g_defaultStatment, g_caseStatment, base
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
            // 206:3: -> ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:206:5: ^( G_SWITCH[$a] ( $base)? ( g_caseStatment )* ( g_defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_SWITCH, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:206:20: ( $base)?
                if ( stream_base.hasNext() ) {
                    adaptor.addChild(root_1, stream_base.nextTree());

                }
                stream_base.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:206:27: ( g_caseStatment )*
                while ( stream_g_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_g_caseStatment.nextTree());

                }
                stream_g_caseStatment.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:206:43: ( g_defaultStatment )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:208:1: g_caseStatment : a= 'case' exp ( ',' exp )* ':' statements -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements ) ;
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
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:209:2: (a= 'case' exp ( ',' exp )* ':' statements -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:209:4: a= 'case' exp ( ',' exp )* ':' statements
            {
            a=(Token)match(input,108,FOLLOW_108_in_g_caseStatment535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(a);

            pushFollow(FOLLOW_exp_in_g_caseStatment537);
            exp32=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp32.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:209:17: ( ',' exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==109) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:209:18: ',' exp
            	    {
            	    char_literal33=(Token)match(input,109,FOLLOW_109_in_g_caseStatment540); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_109.add(char_literal33);

            	    pushFollow(FOLLOW_exp_in_g_caseStatment542);
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

            char_literal35=(Token)match(input,110,FOLLOW_110_in_g_caseStatment546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(char_literal35);

            pushFollow(FOLLOW_statements_in_g_caseStatment548);
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
            // 209:43: -> ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:209:45: ^( G_CASE[$a] ^( G_CASE_EXPLIST ( exp )+ ) statements )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(G_CASE, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:209:58: ^( G_CASE_EXPLIST ( exp )+ )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:211:1: g_defaultStatment : a= 'default' ':' statements -> ^( G_DEFAULT[$a] statements ) ;
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
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:212:2: (a= 'default' ':' statements -> ^( G_DEFAULT[$a] statements ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:212:4: a= 'default' ':' statements
            {
            a=(Token)match(input,111,FOLLOW_111_in_g_defaultStatment574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(a);

            char_literal37=(Token)match(input,110,FOLLOW_110_in_g_defaultStatment576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(char_literal37);

            pushFollow(FOLLOW_statements_in_g_defaultStatment578);
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
            // 212:31: -> ^( G_DEFAULT[$a] statements )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:212:34: ^( G_DEFAULT[$a] statements )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:1: directive : 'DIRECTIVE' a= Identifier (b= StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) ;
    public final BeeParser.directive_return directive() throws RecognitionException {
        BeeParser.directive_return retval = new BeeParser.directive_return();
        retval.start = input.LT(1);
        int directive_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token b=null;
        Token string_literal39=null;
        Token char_literal40=null;

        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree b_tree=null;
        BeeCommonNodeTree string_literal39_tree=null;
        BeeCommonNodeTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:10: ( 'DIRECTIVE' a= Identifier (b= StringLiteral )? ';' -> ^( DIRECTIVE Identifier ( StringLiteral )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:12: 'DIRECTIVE' a= Identifier (b= StringLiteral )? ';'
            {
            string_literal39=(Token)match(input,112,FOLLOW_112_in_directive595); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_112.add(string_literal39);

            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_directive600); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:38: (b= StringLiteral )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==StringLiteral) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:39: b= StringLiteral
                    {
                    b=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_directive605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(b);


                    }
                    break;

            }

            char_literal40=(Token)match(input,104,FOLLOW_104_in_directive609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_104.add(char_literal40);

            if ( state.backtracking==0 ) {
              checkDynamic((a!=null?a.getText():null),(b!=null?b.getText():null));
            }


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
            // 214:94: -> ^( DIRECTIVE Identifier ( StringLiteral )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:97: ^( DIRECTIVE Identifier ( StringLiteral )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECTIVE, "DIRECTIVE"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:214:120: ( StringLiteral )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:215:1: returnStatment : 'return' -> ^( RETURN ) ;
    public final BeeParser.returnStatment_return returnStatment() throws RecognitionException {
        BeeParser.returnStatment_return retval = new BeeParser.returnStatment_return();
        retval.start = input.LT(1);
        int returnStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal41=null;

        BeeCommonNodeTree string_literal41_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:216:2: ( 'return' -> ^( RETURN ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:216:4: 'return'
            {
            string_literal41=(Token)match(input,113,FOLLOW_113_in_returnStatment632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal41);



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
            // 216:13: -> ^( RETURN )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:216:16: ^( RETURN )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:217:1: continueStatment : 'continue' -> ^( CONTINUE ) ;
    public final BeeParser.continueStatment_return continueStatment() throws RecognitionException {
        BeeParser.continueStatment_return retval = new BeeParser.continueStatment_return();
        retval.start = input.LT(1);
        int continueStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal42=null;

        BeeCommonNodeTree string_literal42_tree=null;
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:217:17: ( 'continue' -> ^( CONTINUE ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:217:19: 'continue'
            {
            string_literal42=(Token)match(input,114,FOLLOW_114_in_continueStatment645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_114.add(string_literal42);



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
            // 217:30: -> ^( CONTINUE )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:217:33: ^( CONTINUE )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:218:1: breakStatment : 'break' -> ^( BREAK ) ;
    public final BeeParser.breakStatment_return breakStatment() throws RecognitionException {
        BeeParser.breakStatment_return retval = new BeeParser.breakStatment_return();
        retval.start = input.LT(1);
        int breakStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal43=null;

        BeeCommonNodeTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:218:15: ( 'break' -> ^( BREAK ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:218:17: 'break'
            {
            string_literal43=(Token)match(input,115,FOLLOW_115_in_breakStatment659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(string_literal43);



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
            // 218:25: -> ^( BREAK )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:218:28: ^( BREAK )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:220:1: messFunction options {backtrack=false; } : ({...}? textProcessFunction | functionCall[true] ';' );
    public final BeeParser.messFunction_return messFunction() throws RecognitionException {
        BeeParser.messFunction_return retval = new BeeParser.messFunction_return();
        retval.start = input.LT(1);
        int messFunction_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal46=null;
        BeeParser.textProcessFunction_return textProcessFunction44 = null;

        BeeParser.functionCall_return functionCall45 = null;


        BeeCommonNodeTree char_literal46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:223:2: ({...}? textProcessFunction | functionCall[true] ';' )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:223:4: {...}? textProcessFunction
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    if ( !((isTextProcessFunction(input))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "messFunction", "isTextProcessFunction(input)");
                    }
                    pushFollow(FOLLOW_textProcessFunction_in_messFunction686);
                    textProcessFunction44=textProcessFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, textProcessFunction44.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:224:6: functionCall[true] ';'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_messFunction693);
                    functionCall45=functionCall(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall45.getTree());
                    char_literal46=(Token)match(input,104,FOLLOW_104_in_messFunction696); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal46_tree = (BeeCommonNodeTree)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:226:1: textProcessFunction : functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) ;
    public final BeeParser.textProcessFunction_return textProcessFunction() throws RecognitionException {
        BeeParser.textProcessFunction_return retval = new BeeParser.textProcessFunction_return();
        retval.start = input.LT(1);
        int textProcessFunction_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal49=null;
        Token char_literal51=null;
        BeeParser.functionFullName_return functionFullName47 = null;

        BeeParser.exp_return exp48 = null;

        BeeParser.exp_return exp50 = null;

        BeeParser.statmentBlock_return statmentBlock52 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal49_tree=null;
        BeeCommonNodeTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:4: functionFullName a= '(' ( exp ( ',' exp )* )? ')' statmentBlock
            {
            pushFollow(FOLLOW_functionFullName_in_textProcessFunction707);
            functionFullName47=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName47.getTree());
            a=(Token)match(input,106,FOLLOW_106_in_textProcessFunction711); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:27: ( exp ( ',' exp )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Identifier && LA11_0<=LEFT_BRACE)||(LA11_0>=ADD && LA11_0<=MINUS)||(LA11_0>=BOOLEAN && LA11_0<=DOUBLE)||LA11_0==106||LA11_0==124||LA11_0==127||LA11_0==130) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:28: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_textProcessFunction714);
                    exp48=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp48.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:32: ( ',' exp )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==109) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:33: ',' exp
                    	    {
                    	    char_literal49=(Token)match(input,109,FOLLOW_109_in_textProcessFunction717); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_109.add(char_literal49);

                    	    pushFollow(FOLLOW_exp_in_textProcessFunction719);
                    	    exp50=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal51=(Token)match(input,107,FOLLOW_107_in_textProcessFunction725); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal51);

            pushFollow(FOLLOW_statmentBlock_in_textProcessFunction727);
            statmentBlock52=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock52.getTree());


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
            // 228:63: -> ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:66: ^( TEXT_PROCESS[$a] functionFullName statmentBlock ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_PROCESS, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                adaptor.addChild(root_1, stream_statmentBlock.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:228:116: ( exp )*
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:231:1: functionCall[boolean statmentCall] : functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) ;
    public final BeeParser.functionCall_return functionCall(boolean statmentCall) throws RecognitionException {
        BeeParser.functionCall_return retval = new BeeParser.functionCall_return();
        retval.start = input.LT(1);
        int functionCall_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal55=null;
        Token char_literal57=null;
        BeeParser.functionFullName_return functionFullName53 = null;

        BeeParser.exp_return exp54 = null;

        BeeParser.exp_return exp56 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal55_tree=null;
        BeeCommonNodeTree char_literal57_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:237:2: ( functionFullName a= '(' ( exp ( ',' exp )* )? ')' -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) ) -> ^( FUNCTION[$a] functionFullName ( exp )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:237:3: functionFullName a= '(' ( exp ( ',' exp )* )? ')'
            {
            pushFollow(FOLLOW_functionFullName_in_functionCall762);
            functionFullName53=functionFullName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionFullName.add(functionFullName53.getTree());
            a=(Token)match(input,106,FOLLOW_106_in_functionCall766); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:237:26: ( exp ( ',' exp )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=Identifier && LA13_0<=LEFT_BRACE)||(LA13_0>=ADD && LA13_0<=MINUS)||(LA13_0>=BOOLEAN && LA13_0<=DOUBLE)||LA13_0==106||LA13_0==124||LA13_0==127||LA13_0==130) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:237:27: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_functionCall769);
                    exp54=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp54.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:237:31: ( ',' exp )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==109) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:237:32: ',' exp
                    	    {
                    	    char_literal55=(Token)match(input,109,FOLLOW_109_in_functionCall772); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_109.add(char_literal55);

                    	    pushFollow(FOLLOW_exp_in_functionCall774);
                    	    exp56=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal57=(Token)match(input,107,FOLLOW_107_in_functionCall780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal57);



            // AST REWRITE
            // elements: exp, functionFullName, exp, functionFullName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 238:3: -> {statmentCall}? ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:238:22: ^( DIRECT_CALL ^( FUNCTION[$a] functionFullName ( exp )* ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:238:36: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_2);

                adaptor.addChild(root_2, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:238:68: ( exp )*
                while ( stream_exp.hasNext() ) {
                    adaptor.addChild(root_2, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 239:3: -> ^( FUNCTION[$a] functionFullName ( exp )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:239:6: ^( FUNCTION[$a] functionFullName ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION, a), root_1);

                adaptor.addChild(root_1, stream_functionFullName.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:239:38: ( exp )*
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:243:1: statmentBlock : LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) ;
    public final BeeParser.statmentBlock_return statmentBlock() throws RecognitionException {
        BeeParser.statmentBlock_return retval = new BeeParser.statmentBlock_return();
        retval.start = input.LT(1);
        int statmentBlock_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_BRACE58=null;
        Token RIGHT_BRACE60=null;
        BeeParser.statements_return statements59 = null;


        BeeCommonNodeTree LEFT_BRACE58_tree=null;
        BeeCommonNodeTree RIGHT_BRACE60_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:244:2: ( LEFT_BRACE ( statements )? RIGHT_BRACE -> ^( SLIST ( statements )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:244:4: LEFT_BRACE ( statements )? RIGHT_BRACE
            {
            LEFT_BRACE58=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_statmentBlock829); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(LEFT_BRACE58);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:244:15: ( statements )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Identifier||LA14_0==LEFT_BRACE||LA14_0==LEFT_TEXT_TOKEN||(LA14_0>=LEFT_TOKEN && LA14_0<=VAR)||LA14_0==105||(LA14_0>=112 && LA14_0<=116)||(LA14_0>=119 && LA14_0<=120)||(LA14_0>=130 && LA14_0<=131)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: statements
                    {
                    pushFollow(FOLLOW_statements_in_statmentBlock831);
                    statements59=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statements.add(statements59.getTree());

                    }
                    break;

            }

            RIGHT_BRACE60=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_statmentBlock834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(RIGHT_BRACE60);



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
            // 244:39: -> ^( SLIST ( statements )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:244:42: ^( SLIST ( statements )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SLIST, "SLIST"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:244:50: ( statements )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:245:1: forStatment : 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) ;
    public final BeeParser.forStatment_return forStatment() throws RecognitionException {
        BeeParser.forStatment_return retval = new BeeParser.forStatment_return();
        retval.start = input.LT(1);
        int forStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token string_literal61=null;
        Token char_literal62=null;
        Token string_literal63=null;
        Token char_literal64=null;
        Token string_literal65=null;
        BeeParser.exp_return aaa = null;

        BeeParser.statmentBlock_return c = null;

        BeeParser.statmentBlock_return d = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree string_literal61_tree=null;
        BeeCommonNodeTree char_literal62_tree=null;
        BeeCommonNodeTree string_literal63_tree=null;
        BeeCommonNodeTree char_literal64_tree=null;
        BeeCommonNodeTree string_literal65_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:246:2: ( 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )? -> ^( FOR $a $aaa $c ( $d)? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:246:4: 'for' '(' a= Identifier 'in ' aaa= exp ')' c= statmentBlock ( 'elsefor' d= statmentBlock )?
            {
            string_literal61=(Token)match(input,116,FOLLOW_116_in_forStatment851); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(string_literal61);

            char_literal62=(Token)match(input,106,FOLLOW_106_in_forStatment853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal62);

            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_forStatment857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            string_literal63=(Token)match(input,117,FOLLOW_117_in_forStatment859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(string_literal63);

            pushFollow(FOLLOW_exp_in_forStatment864);
            aaa=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(aaa.getTree());
            char_literal64=(Token)match(input,107,FOLLOW_107_in_forStatment866); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal64);

            pushFollow(FOLLOW_statmentBlock_in_forStatment873);
            c=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(c.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:246:66: ( 'elsefor' d= statmentBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==118) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:246:67: 'elsefor' d= statmentBlock
                    {
                    string_literal65=(Token)match(input,118,FOLLOW_118_in_forStatment877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(string_literal65);

                    pushFollow(FOLLOW_statmentBlock_in_forStatment881);
                    d=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(d.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: a, d, aaa, c
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
            // 247:3: -> ^( FOR $a $aaa $c ( $d)? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:247:6: ^( FOR $a $aaa $c ( $d)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FOR, "FOR"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                adaptor.addChild(root_1, stream_aaa.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:247:24: ( $d)?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:248:1: whileStament : 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) ;
    public final BeeParser.whileStament_return whileStament() throws RecognitionException {
        BeeParser.whileStament_return retval = new BeeParser.whileStament_return();
        retval.start = input.LT(1);
        int whileStament_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;
        BeeParser.condExp_return a = null;

        BeeParser.statmentBlock_return statmentBlock69 = null;


        BeeCommonNodeTree string_literal66_tree=null;
        BeeCommonNodeTree char_literal67_tree=null;
        BeeCommonNodeTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:249:2: ( 'while' '(' a= condExp ')' statmentBlock -> ^( WHILE $a statmentBlock ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:249:4: 'while' '(' a= condExp ')' statmentBlock
            {
            string_literal66=(Token)match(input,119,FOLLOW_119_in_whileStament916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(string_literal66);

            char_literal67=(Token)match(input,106,FOLLOW_106_in_whileStament918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal67);

            pushFollow(FOLLOW_condExp_in_whileStament922);
            a=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(a.getTree());
            char_literal68=(Token)match(input,107,FOLLOW_107_in_whileStament924); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal68);

            pushFollow(FOLLOW_statmentBlock_in_whileStament927);
            statmentBlock69=statmentBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock69.getTree());


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
            // 249:45: -> ^( WHILE $a statmentBlock )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:249:48: ^( WHILE $a statmentBlock )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:251:1: ifStatment : 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) ;
    public final BeeParser.ifStatment_return ifStatment() throws RecognitionException {
        BeeParser.ifStatment_return retval = new BeeParser.ifStatment_return();
        retval.start = input.LT(1);
        int ifStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token string_literal70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token string_literal74=null;
        BeeParser.statement_return l = null;

        BeeParser.statement_return n = null;

        BeeParser.condExp_return condExp72 = null;


        BeeCommonNodeTree string_literal70_tree=null;
        BeeCommonNodeTree char_literal71_tree=null;
        BeeCommonNodeTree char_literal73_tree=null;
        BeeCommonNodeTree string_literal74_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_condExp=new RewriteRuleSubtreeStream(adaptor,"rule condExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:2: ( 'if' '(' condExp ')' l= statement ( 'else' n= statement )? -> ^( IF condExp $l ( $n)? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:4: 'if' '(' condExp ')' l= statement ( 'else' n= statement )?
            {
            string_literal70=(Token)match(input,120,FOLLOW_120_in_ifStatment948); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(string_literal70);

            char_literal71=(Token)match(input,106,FOLLOW_106_in_ifStatment950); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal71);

            pushFollow(FOLLOW_condExp_in_ifStatment952);
            condExp72=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condExp.add(condExp72.getTree());
            char_literal73=(Token)match(input,107,FOLLOW_107_in_ifStatment954); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal73);

            pushFollow(FOLLOW_statement_in_ifStatment958);
            l=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(l.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:37: ( 'else' n= statement )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==121) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred29_Bee()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:38: 'else' n= statement
                    {
                    string_literal74=(Token)match(input,121,FOLLOW_121_in_ifStatment961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(string_literal74);

                    pushFollow(FOLLOW_statement_in_ifStatment965);
                    n=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(n.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: l, condExp, n
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
            // 252:61: -> ^( IF condExp $l ( $n)? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:63: ^( IF condExp $l ( $n)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_condExp.nextTree());
                adaptor.addChild(root_1, stream_l.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:79: ( $n)?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:254:1: constantsTextStatment : LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) ;
    public final BeeParser.constantsTextStatment_return constantsTextStatment() throws RecognitionException {
        BeeParser.constantsTextStatment_return retval = new BeeParser.constantsTextStatment_return();
        retval.start = input.LT(1);
        int constantsTextStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_TEXT_TOKEN75=null;
        Token Identifier76=null;
        Token RIGHT_TOKEN77=null;

        BeeCommonNodeTree LEFT_TEXT_TOKEN75_tree=null;
        BeeCommonNodeTree Identifier76_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN77_tree=null;
        RewriteRuleTokenStream stream_LEFT_TEXT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TEXT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:255:2: ( LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN -> ^( TEXT_HOLDER Identifier ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:255:4: LEFT_TEXT_TOKEN Identifier RIGHT_TOKEN
            {
            LEFT_TEXT_TOKEN75=(Token)match(input,LEFT_TEXT_TOKEN,FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_TEXT_TOKEN.add(LEFT_TEXT_TOKEN75);

            Identifier76=(Token)match(input,Identifier,FOLLOW_Identifier_in_constantsTextStatment998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier76);

            RIGHT_TOKEN77=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_constantsTextStatment1000); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN77);



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
            // 255:46: -> ^( TEXT_HOLDER Identifier )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:255:48: ^( TEXT_HOLDER Identifier )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:257:1: textStatment : ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) );
    public final BeeParser.textStatment_return textStatment() throws RecognitionException {
        BeeParser.textStatment_return retval = new BeeParser.textStatment_return();
        retval.start = input.LT(1);
        int textStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token LEFT_TOKEN78=null;
        Token RIGHT_TOKEN80=null;
        Token LEFT_TOKEN81=null;
        Token string_literal82=null;
        Token char_literal84=null;
        Token RIGHT_TOKEN85=null;
        BeeParser.textVar_return textVar79 = null;

        BeeParser.textVar_return textVar83 = null;


        BeeCommonNodeTree LEFT_TOKEN78_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN80_tree=null;
        BeeCommonNodeTree LEFT_TOKEN81_tree=null;
        BeeCommonNodeTree string_literal82_tree=null;
        BeeCommonNodeTree char_literal84_tree=null;
        BeeCommonNodeTree RIGHT_TOKEN85_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_LEFT_TOKEN=new RewriteRuleTokenStream(adaptor,"token LEFT_TOKEN");
        RewriteRuleTokenStream stream_RIGHT_TOKEN=new RewriteRuleTokenStream(adaptor,"token RIGHT_TOKEN");
        RewriteRuleSubtreeStream stream_textVar=new RewriteRuleSubtreeStream(adaptor,"rule textVar");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:258:2: ( LEFT_TOKEN textVar RIGHT_TOKEN -> ^( HOLDER textVar ) | LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN -> ^( HOLDER textVar SAFE_OUTPUT ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LEFT_TOKEN) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==122) ) {
                    alt17=2;
                }
                else if ( ((LA17_1>=Identifier && LA17_1<=LEFT_BRACE)||(LA17_1>=ADD && LA17_1<=MINUS)||(LA17_1>=BOOLEAN && LA17_1<=DOUBLE)||LA17_1==106||LA17_1==124||LA17_1==127||LA17_1==130) ) {
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:259:6: LEFT_TOKEN textVar RIGHT_TOKEN
                    {
                    LEFT_TOKEN78=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment1030); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN78);

                    pushFollow(FOLLOW_textVar_in_textStatment1032);
                    textVar79=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar79.getTree());
                    RIGHT_TOKEN80=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment1034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN80);



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
                    // 259:37: -> ^( HOLDER textVar )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:259:40: ^( HOLDER textVar )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:260:4: LEFT_TOKEN '!(' textVar ')' RIGHT_TOKEN
                    {
                    LEFT_TOKEN81=(Token)match(input,LEFT_TOKEN,FOLLOW_LEFT_TOKEN_in_textStatment1047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_TOKEN.add(LEFT_TOKEN81);

                    string_literal82=(Token)match(input,122,FOLLOW_122_in_textStatment1049); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(string_literal82);

                    pushFollow(FOLLOW_textVar_in_textStatment1051);
                    textVar83=textVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textVar.add(textVar83.getTree());
                    char_literal84=(Token)match(input,107,FOLLOW_107_in_textStatment1053); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(char_literal84);

                    RIGHT_TOKEN85=(Token)match(input,RIGHT_TOKEN,FOLLOW_RIGHT_TOKEN_in_textStatment1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_TOKEN.add(RIGHT_TOKEN85);



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
                    // 260:43: -> ^( HOLDER textVar SAFE_OUTPUT )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:260:46: ^( HOLDER textVar SAFE_OUTPUT )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:262:1: textVar : b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) ;
    public final BeeParser.textVar_return textVar() throws RecognitionException {
        BeeParser.textVar_return retval = new BeeParser.textVar_return();
        retval.start = input.LT(1);
        int textVar_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal86=null;
        BeeParser.exp_return b = null;

        BeeParser.textformat_return textformat87 = null;


        BeeCommonNodeTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_textformat=new RewriteRuleSubtreeStream(adaptor,"rule textformat");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:263:1: (b= exp ( ',' textformat )? -> ^( VAR_TEXT $b ( textformat )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:263:3: b= exp ( ',' textformat )?
            {
            pushFollow(FOLLOW_exp_in_textVar1075);
            b=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(b.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:263:10: ( ',' textformat )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==109) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:263:11: ',' textformat
                    {
                    char_literal86=(Token)match(input,109,FOLLOW_109_in_textVar1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(char_literal86);

                    pushFollow(FOLLOW_textformat_in_textVar1081);
                    textformat87=textformat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_textformat.add(textformat87.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: textformat, b
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
            // 263:30: -> ^( VAR_TEXT $b ( textformat )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:263:33: ^( VAR_TEXT $b ( textformat )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_TEXT, "VAR_TEXT"), root_1);

                adaptor.addChild(root_1, stream_b.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:263:47: ( textformat )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:265:1: textformat : (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) );
    public final BeeParser.textformat_return textformat() throws RecognitionException {
        BeeParser.textformat_return retval = new BeeParser.textformat_return();
        retval.start = input.LT(1);
        int textformat_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal88=null;
        Token StringLiteral89=null;
        Token StringLiteral90=null;
        BeeParser.functionFullName_return fm = null;


        BeeCommonNodeTree char_literal88_tree=null;
        BeeCommonNodeTree StringLiteral89_tree=null;
        BeeCommonNodeTree StringLiteral90_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_functionFullName=new RewriteRuleSubtreeStream(adaptor,"rule functionFullName");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:265:11: (fm= functionFullName ( '=' StringLiteral )? -> ^( FM $fm ( StringLiteral )? ) | StringLiteral -> ^( DEFAULT_FM StringLiteral ) )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:266:1: fm= functionFullName ( '=' StringLiteral )?
                    {
                    pushFollow(FOLLOW_functionFullName_in_textformat1108);
                    fm=functionFullName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_functionFullName.add(fm.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:266:21: ( '=' StringLiteral )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==123) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:266:22: '=' StringLiteral
                            {
                            char_literal88=(Token)match(input,123,FOLLOW_123_in_textformat1111); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_123.add(char_literal88);

                            StringLiteral89=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat1113); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral89);


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
                    // 266:42: -> ^( FM $fm ( StringLiteral )? )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:266:45: ^( FM $fm ( StringLiteral )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FM, "FM"), root_1);

                        adaptor.addChild(root_1, stream_fm.nextTree());
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:266:54: ( StringLiteral )?
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:267:3: StringLiteral
                    {
                    StringLiteral90=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_textformat1132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral90);



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
                    // 267:17: -> ^( DEFAULT_FM StringLiteral )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:267:20: ^( DEFAULT_FM StringLiteral )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:269:1: varDefine : a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ ;
    public final BeeParser.varDefine_return varDefine() throws RecognitionException {
        BeeParser.varDefine_return retval = new BeeParser.varDefine_return();
        retval.start = input.LT(1);
        int varDefine_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal92=null;
        BeeParser.varAssignMent_return varAssignMent91 = null;

        BeeParser.varAssignMent_return varAssignMent93 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal92_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleSubtreeStream stream_varAssignMent=new RewriteRuleSubtreeStream(adaptor,"rule varAssignMent");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:271:2: (a= VAR varAssignMent ( ',' varAssignMent )* -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+ )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:271:4: a= VAR varAssignMent ( ',' varAssignMent )*
            {
            a=(Token)match(input,VAR,FOLLOW_VAR_in_varDefine1155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(a);

            if ( state.backtracking==0 ) {
              if(isStrictMVC)	throw new MVCStrictException(a);
            }
            pushFollow(FOLLOW_varAssignMent_in_varDefine1158);
            varAssignMent91=varAssignMent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent91.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:271:75: ( ',' varAssignMent )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==109) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:271:76: ',' varAssignMent
            	    {
            	    char_literal92=(Token)match(input,109,FOLLOW_109_in_varDefine1161); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_109.add(char_literal92);

            	    pushFollow(FOLLOW_varAssignMent_in_varDefine1163);
            	    varAssignMent93=varAssignMent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_varAssignMent.add(varAssignMent93.getTree());

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
            // 271:96: -> ( ^( VAR_DEFINE[$a] varAssignMent ) )+
            {
                if ( !(stream_varAssignMent.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varAssignMent.hasNext() ) {
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:271:98: ^( VAR_DEFINE[$a] varAssignMent )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:274:1: varAssignMent : (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) );
    public final BeeParser.varAssignMent_return varAssignMent() throws RecognitionException {
        BeeParser.varAssignMent_return retval = new BeeParser.varAssignMent_return();
        retval.start = input.LT(1);
        int varAssignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier94=null;
        Token char_literal95=null;
        Token Identifier97=null;
        Token char_literal98=null;
        BeeParser.exp_return exp96 = null;

        BeeParser.statmentBlock_return statmentBlock99 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier94_tree=null;
        BeeCommonNodeTree char_literal95_tree=null;
        BeeCommonNodeTree Identifier97_tree=null;
        BeeCommonNodeTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statmentBlock=new RewriteRuleSubtreeStream(adaptor,"rule statmentBlock");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:275:2: (a= Identifier -> ^( ASSIGNMENT[$a] Identifier NULL ) | Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) | Identifier '=' statmentBlock -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Identifier) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==123) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2>=Identifier && LA22_2<=StringLiteral)||(LA22_2>=ADD && LA22_2<=MINUS)||(LA22_2>=BOOLEAN && LA22_2<=DOUBLE)||LA22_2==106||LA22_2==124||LA22_2==127||LA22_2==130) ) {
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

                            if ( (LA22_6==110) ) {
                                alt22=2;
                            }
                            else if ( (LA22_6==106||LA22_6==123||LA22_6==125) ) {
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
                        case 105:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 119:
                        case 120:
                        case 130:
                        case 131:
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
                else if ( (LA22_1==EOF||LA22_1==104||LA22_1==109) ) {
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:275:4: a= Identifier
                    {
                    a=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1191); if (state.failed) return retval; 
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
                    // 275:19: -> ^( ASSIGNMENT[$a] Identifier NULL )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:275:22: ^( ASSIGNMENT[$a] Identifier NULL )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:276:4: Identifier '=' exp
                    {
                    Identifier94=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1212); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier94);

                    char_literal95=(Token)match(input,123,FOLLOW_123_in_varAssignMent1214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal95);

                    pushFollow(FOLLOW_exp_in_varAssignMent1216);
                    exp96=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp96.getTree());


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
                    // 276:23: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:276:26: ^( ASSIGNMENT[$Identifier] Identifier exp )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier94), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:277:4: Identifier '=' statmentBlock
                    {
                    Identifier97=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAssignMent1234); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier97);

                    char_literal98=(Token)match(input,123,FOLLOW_123_in_varAssignMent1236); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal98);

                    pushFollow(FOLLOW_statmentBlock_in_varAssignMent1238);
                    statmentBlock99=statmentBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statmentBlock.add(statmentBlock99.getTree());


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
                    // 277:34: -> ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:277:39: ^( ASSIGNMENT[$Identifier] Identifier statmentBlock )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier97), root_1);

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:279:1: assignMent : Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) ;
    public final BeeParser.assignMent_return assignMent() throws RecognitionException {
        BeeParser.assignMent_return retval = new BeeParser.assignMent_return();
        retval.start = input.LT(1);
        int assignMent_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier100=null;
        Token char_literal101=null;
        BeeParser.exp_return exp102 = null;


        BeeCommonNodeTree Identifier100_tree=null;
        BeeCommonNodeTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:280:2: ( Identifier '=' exp -> ^( ASSIGNMENT[$Identifier] Identifier exp ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:280:4: Identifier '=' exp
            {
            Identifier100=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignMent1262); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier100);

            char_literal101=(Token)match(input,123,FOLLOW_123_in_assignMent1264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal101);

            pushFollow(FOLLOW_exp_in_assignMent1267);
            exp102=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp102.getTree());


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
            // 280:25: -> ^( ASSIGNMENT[$Identifier] Identifier exp )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:280:28: ^( ASSIGNMENT[$Identifier] Identifier exp )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(ASSIGNMENT, Identifier100), root_1);

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:282:1: varRef : ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) );
    public final BeeParser.varRef_return varRef() throws RecognitionException {
        BeeParser.varRef_return retval = new BeeParser.varRef_return();
        retval.start = input.LT(1);
        int varRef_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token Identifier103=null;
        Token Identifier104=null;
        BeeParser.varAttribute_return varAttribute105 = null;

        BeeParser.safeOutput_return safeOutput106 = null;


        BeeCommonNodeTree Identifier103_tree=null;
        BeeCommonNodeTree Identifier104_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_varAttribute=new RewriteRuleSubtreeStream(adaptor,"rule varAttribute");
        RewriteRuleSubtreeStream stream_safeOutput=new RewriteRuleSubtreeStream(adaptor,"rule safeOutput");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:282:8: ({...}? Identifier -> ^( TEXT_VAR_REFER[$Identifier] Identifier ) | Identifier ( varAttribute )* ( safeOutput )? -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? ) )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:282:10: {...}? Identifier
                    {
                    if ( !((input.LT(1).getText().startsWith("__V"))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "varRef", "input.LT(1).getText().startsWith(\"__V\")");
                    }
                    Identifier103=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier103);



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
                    // 282:66: -> ^( TEXT_VAR_REFER[$Identifier] Identifier )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:282:69: ^( TEXT_VAR_REFER[$Identifier] Identifier )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(TEXT_VAR_REFER, Identifier103), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:6: Identifier ( varAttribute )* ( safeOutput )?
                    {
                    Identifier104=(Token)match(input,Identifier,FOLLOW_Identifier_in_varRef1309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier104);

                    if ( state.backtracking==0 ) {
                      if(Identifier104.getText().startsWith("__"))throw new RuntimeException("Can Not call this Variable star with __"); 
                    }
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:132: ( varAttribute )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=125 && LA23_0<=127)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:134: varAttribute
                    	    {
                    	    pushFollow(FOLLOW_varAttribute_in_varRef1314);
                    	    varAttribute105=varAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_varAttribute.add(varAttribute105.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:149: ( safeOutput )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==124) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: safeOutput
                            {
                            pushFollow(FOLLOW_safeOutput_in_varRef1318);
                            safeOutput106=safeOutput();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_safeOutput.add(safeOutput106.getTree());

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
                    // 283:163: -> ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:166: ^( VAR_REFER[$Identifier] Identifier ( varAttribute )* ( safeOutput )? )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(VAR_REFER, Identifier104), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:202: ( varAttribute )*
                        while ( stream_varAttribute.hasNext() ) {
                            adaptor.addChild(root_1, stream_varAttribute.nextTree());

                        }
                        stream_varAttribute.reset();
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:283:218: ( safeOutput )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:286:1: safeOutput : '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) ;
    public final BeeParser.safeOutput_return safeOutput() throws RecognitionException {
        BeeParser.safeOutput_return retval = new BeeParser.safeOutput_return();
        retval.start = input.LT(1);
        int safeOutput_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal107=null;
        BeeParser.atom_return b = null;


        BeeCommonNodeTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:287:2: ( '!' (b= atom )? -> ^( SAFE_OUTPUT ( $b)? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:287:4: '!' (b= atom )?
            {
            char_literal107=(Token)match(input,124,FOLLOW_124_in_safeOutput1350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(char_literal107);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:287:9: (b= atom )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=Identifier && LA26_0<=LEFT_BRACE)||(LA26_0>=BOOLEAN && LA26_0<=DOUBLE)||LA26_0==106||LA26_0==127||LA26_0==130) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: b= atom
                    {
                    pushFollow(FOLLOW_atom_in_safeOutput1354);
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
            // 287:16: -> ^( SAFE_OUTPUT ( $b)? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:287:19: ^( SAFE_OUTPUT ( $b)? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SAFE_OUTPUT, "SAFE_OUTPUT"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:287:33: ( $b)?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:290:1: varAttribute : ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) );
    public final BeeParser.varAttribute_return varAttribute() throws RecognitionException {
        BeeParser.varAttribute_return retval = new BeeParser.varAttribute_return();
        retval.start = input.LT(1);
        int varAttribute_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal108=null;
        Token Identifier109=null;
        Token string_literal110=null;
        Token Identifier111=null;
        Token char_literal113=null;
        BeeParser.exp_return exp112 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal108_tree=null;
        BeeCommonNodeTree Identifier109_tree=null;
        BeeCommonNodeTree string_literal110_tree=null;
        BeeCommonNodeTree Identifier111_tree=null;
        BeeCommonNodeTree char_literal113_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:291:2: ( '.' Identifier -> ^( ATTR_NAME Identifier ) | '.~' Identifier -> ^( VIRTUAL_ATTR_NAME Identifier ) | a= '[' exp ']' -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt27=1;
                }
                break;
            case 126:
                {
                alt27=2;
                }
                break;
            case 127:
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:291:4: '.' Identifier
                    {
                    char_literal108=(Token)match(input,125,FOLLOW_125_in_varAttribute1377); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(char_literal108);

                    Identifier109=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier109);



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
                    // 291:19: -> ^( ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:291:22: ^( ATTR_NAME Identifier )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:292:4: '.~' Identifier
                    {
                    string_literal110=(Token)match(input,126,FOLLOW_126_in_varAttribute1393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_126.add(string_literal110);

                    Identifier111=(Token)match(input,Identifier,FOLLOW_Identifier_in_varAttribute1395); if (state.failed) return retval; 
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
                    // 292:21: -> ^( VIRTUAL_ATTR_NAME Identifier )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:292:24: ^( VIRTUAL_ATTR_NAME Identifier )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:293:4: a= '[' exp ']'
                    {
                    a=(Token)match(input,127,FOLLOW_127_in_varAttribute1412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(a);

                    pushFollow(FOLLOW_exp_in_varAttribute1414);
                    exp112=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp112.getTree());
                    char_literal113=(Token)match(input,128,FOLLOW_128_in_varAttribute1416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_128.add(char_literal113);



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
                    // 293:18: -> ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:293:20: ^( MAP_LIST_INDEX[$a,\"[]\"] exp )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:296:1: exp : condExp ;
    public final BeeParser.exp_return exp() throws RecognitionException {
        BeeParser.exp_return retval = new BeeParser.exp_return();
        retval.start = input.LT(1);
        int exp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.condExp_return condExp114 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:296:5: ( condExp )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:296:8: condExp
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExp_in_exp1437);
            condExp114=condExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExp114.getTree());

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:1: condExp : c= conditionalOrExpression ( '?' (a= exp )? ':' (b= exp )? )? ;
    public final BeeParser.condExp_return condExp() throws RecognitionException {
        BeeParser.condExp_return retval = new BeeParser.condExp_return();
        retval.start = input.LT(1);
        int condExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal115=null;
        Token char_literal116=null;
        BeeParser.conditionalOrExpression_return c = null;

        BeeParser.exp_return a = null;

        BeeParser.exp_return b = null;


        BeeCommonNodeTree char_literal115_tree=null;
        BeeCommonNodeTree char_literal116_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:9: (c= conditionalOrExpression ( '?' (a= exp )? ':' (b= exp )? )? )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:11: c= conditionalOrExpression ( '?' (a= exp )? ':' (b= exp )? )?
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_condExp1450);
            c=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, c.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:37: ( '?' (a= exp )? ':' (b= exp )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==129) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:38: '?' (a= exp )? ':' (b= exp )?
                    {
                    char_literal115=(Token)match(input,129,FOLLOW_129_in_condExp1453); if (state.failed) return retval;
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:45: (a= exp )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=Identifier && LA28_0<=LEFT_BRACE)||(LA28_0>=ADD && LA28_0<=MINUS)||(LA28_0>=BOOLEAN && LA28_0<=DOUBLE)||LA28_0==106||LA28_0==124||LA28_0==127||LA28_0==130) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: a= exp
                            {
                            pushFollow(FOLLOW_exp_in_condExp1459);
                            a=exp();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    char_literal116=(Token)match(input,110,FOLLOW_110_in_condExp1464); if (state.failed) return retval;
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:299:59: (b= exp )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=Identifier && LA29_0<=LEFT_BRACE)||(LA29_0>=ADD && LA29_0<=MINUS)||(LA29_0>=BOOLEAN && LA29_0<=DOUBLE)||LA29_0==106||LA29_0==124||LA29_0==127||LA29_0==130) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: b= exp
                            {
                            pushFollow(FOLLOW_exp_in_condExp1469);
                            b=exp();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              addCase(c,a,b);
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:302:1: conditionalOrExpression : conditionalAndExpression ( OR conditionalAndExpression )* ;
    public final BeeParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        BeeParser.conditionalOrExpression_return retval = new BeeParser.conditionalOrExpression_return();
        retval.start = input.LT(1);
        int conditionalOrExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token OR118=null;
        BeeParser.conditionalAndExpression_return conditionalAndExpression117 = null;

        BeeParser.conditionalAndExpression_return conditionalAndExpression119 = null;


        BeeCommonNodeTree OR118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:303:5: ( conditionalAndExpression ( OR conditionalAndExpression )* )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:303:9: conditionalAndExpression ( OR conditionalAndExpression )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1496);
            conditionalAndExpression117=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression117.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:304:9: ( OR conditionalAndExpression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==OR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:304:10: OR conditionalAndExpression
            	    {
            	    OR118=(Token)match(input,OR,FOLLOW_OR_in_conditionalOrExpression1507); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR118_tree = (BeeCommonNodeTree)adaptor.create(OR118);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(OR118_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1510);
            	    conditionalAndExpression119=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression119.getTree());

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:308:1: conditionalAndExpression : condExpNotItem ( AND condExpNotItem )* ;
    public final BeeParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        BeeParser.conditionalAndExpression_return retval = new BeeParser.conditionalAndExpression_return();
        retval.start = input.LT(1);
        int conditionalAndExpression_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token AND121=null;
        BeeParser.condExpNotItem_return condExpNotItem120 = null;

        BeeParser.condExpNotItem_return condExpNotItem122 = null;


        BeeCommonNodeTree AND121_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:309:5: ( condExpNotItem ( AND condExpNotItem )* )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:309:9: condExpNotItem ( AND condExpNotItem )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1541);
            condExpNotItem120=condExpNotItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem120.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:310:9: ( AND condExpNotItem )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==AND) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:310:10: AND condExpNotItem
            	    {
            	    AND121=(Token)match(input,AND,FOLLOW_AND_in_conditionalAndExpression1552); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND121_tree = (BeeCommonNodeTree)adaptor.create(AND121);
            	    root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(AND121_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_condExpNotItem_in_conditionalAndExpression1555);
            	    condExpNotItem122=condExpNotItem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpNotItem122.getTree());

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:313:1: condExpNotItem : ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) );
    public final BeeParser.condExpNotItem_return condExpNotItem() throws RecognitionException {
        BeeParser.condExpNotItem_return retval = new BeeParser.condExpNotItem_return();
        retval.start = input.LT(1);
        int condExpNotItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal124=null;
        BeeParser.condExpItem_return condExpItem123 = null;

        BeeParser.condExpItem_return condExpItem125 = null;


        BeeCommonNodeTree char_literal124_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleSubtreeStream stream_condExpItem=new RewriteRuleSubtreeStream(adaptor,"rule condExpItem");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:314:2: ( condExpItem -> condExpItem | ( '!' ) condExpItem -> ^( NOT condExpItem ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=Identifier && LA33_0<=LEFT_BRACE)||(LA33_0>=ADD && LA33_0<=MINUS)||(LA33_0>=BOOLEAN && LA33_0<=DOUBLE)||LA33_0==106||LA33_0==127||LA33_0==130) ) {
                alt33=1;
            }
            else if ( (LA33_0==124) ) {
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:314:4: condExpItem
                    {
                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1580);
                    condExpItem123=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem123.getTree());


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
                    // 314:16: -> condExpItem
                    {
                        adaptor.addChild(root_0, stream_condExpItem.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:315:4: ( '!' ) condExpItem
                    {
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:315:4: ( '!' )
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:315:5: '!'
                    {
                    char_literal124=(Token)match(input,124,FOLLOW_124_in_condExpNotItem1589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(char_literal124);


                    }

                    pushFollow(FOLLOW_condExpItem_in_condExpNotItem1592);
                    condExpItem125=condExpItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condExpItem.add(condExpItem125.getTree());


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
                    // 315:22: -> ^( NOT condExpItem )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:315:25: ^( NOT condExpItem )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:316:1: condExpItem : aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? ;
    public final BeeParser.condExpItem_return condExpItem() throws RecognitionException {
        BeeParser.condExpItem_return retval = new BeeParser.condExpItem_return();
        retval.start = input.LT(1);
        int condExpItem_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.aexpr_return l = null;

        BeeParser.aexpr_return aexpr126 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:2: ( aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )? )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:6: aexpr ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_condExpItem1611);
            aexpr126=aexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, aexpr126.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:12: ( (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=EQUAL && LA35_0<=LESS_EQUAL)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL ) l= aexpr
                    {
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:14: (a= EQUAL | a= NOT_EQUAL | a= LARGE | a= LARGE_EQUAL | a= LESS | a= LESS_EQUAL )
                    int alt34=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt34=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt34=2;
                        }
                        break;
                    case LARGE:
                        {
                        alt34=3;
                        }
                        break;
                    case LARGE_EQUAL:
                        {
                        alt34=4;
                        }
                        break;
                    case LESS:
                        {
                        alt34=5;
                        }
                        break;
                    case LESS_EQUAL:
                        {
                        alt34=6;
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
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:15: a= EQUAL
                            {
                            a=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_condExpItem1618); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:24: a= NOT_EQUAL
                            {
                            a=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_condExpItem1623); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:37: a= LARGE
                            {
                            a=(Token)match(input,LARGE,FOLLOW_LARGE_in_condExpItem1628); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:46: a= LARGE_EQUAL
                            {
                            a=(Token)match(input,LARGE_EQUAL,FOLLOW_LARGE_EQUAL_in_condExpItem1633); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:61: a= LESS
                            {
                            a=(Token)match(input,LESS,FOLLOW_LESS_in_condExpItem1638); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            a_tree = (BeeCommonNodeTree)adaptor.create(a);
                            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
                            }

                            }
                            break;
                        case 6 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:317:69: a= LESS_EQUAL
                            {
                            a=(Token)match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_condExpItem1643); if (state.failed) return retval;
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
                    pushFollow(FOLLOW_aexpr_in_condExpItem1650);
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:1: aexpr : mexpr ( (a= ADD | a= MINUS ) mexpr )* ;
    public final BeeParser.aexpr_return aexpr() throws RecognitionException {
        BeeParser.aexpr_return retval = new BeeParser.aexpr_return();
        retval.start = input.LT(1);
        int aexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.mexpr_return mexpr127 = null;

        BeeParser.mexpr_return mexpr128 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:7: ( mexpr ( (a= ADD | a= MINUS ) mexpr )* )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:9: mexpr ( (a= ADD | a= MINUS ) mexpr )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_aexpr1660);
            mexpr127=mexpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr127.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:15: ( (a= ADD | a= MINUS ) mexpr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=ADD && LA37_0<=MINUS)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:16: (a= ADD | a= MINUS ) mexpr
            	    {
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:16: (a= ADD | a= MINUS )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==ADD) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==MINUS) ) {
            	        alt36=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:17: a= ADD
            	            {
            	            a=(Token)match(input,ADD,FOLLOW_ADD_in_aexpr1666); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:318:24: a= MINUS
            	            {
            	            a=(Token)match(input,MINUS,FOLLOW_MINUS_in_aexpr1671); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mexpr_in_aexpr1675);
            	    mexpr128=mexpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, mexpr128.getTree());
            	    if ( state.backtracking==0 ) {
            	      if(isStrictMVC)	throw new MVCStrictException(a);
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:1: mexpr : unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* ;
    public final BeeParser.mexpr_return mexpr() throws RecognitionException {
        BeeParser.mexpr_return retval = new BeeParser.mexpr_return();
        retval.start = input.LT(1);
        int mexpr_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        BeeParser.unaryAtom_return unaryAtom129 = null;

        BeeParser.unaryAtom_return unaryAtom130 = null;


        BeeCommonNodeTree a_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:9: ( unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )* )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:17: unaryAtom ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_unaryAtom_in_mexpr1695);
            unaryAtom129=unaryAtom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom129.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:27: ( (a= MULTIP | a= DIV | a= MOD ) unaryAtom )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=MULTIP && LA39_0<=MOD)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:28: (a= MULTIP | a= DIV | a= MOD ) unaryAtom
            	    {
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:28: (a= MULTIP | a= DIV | a= MOD )
            	    int alt38=3;
            	    switch ( input.LA(1) ) {
            	    case MULTIP:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    case MOD:
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
            	            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:29: a= MULTIP
            	            {
            	            a=(Token)match(input,MULTIP,FOLLOW_MULTIP_in_mexpr1701); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:39: a= DIV
            	            {
            	            a=(Token)match(input,DIV,FOLLOW_DIV_in_mexpr1706); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            a_tree = (BeeCommonNodeTree)adaptor.create(a);
            	            root_0 = (BeeCommonNodeTree)adaptor.becomeRoot(a_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:319:46: a= MOD
            	            {
            	            a=(Token)match(input,MOD,FOLLOW_MOD_in_mexpr1711); if (state.failed) return retval;
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
            	    pushFollow(FOLLOW_unaryAtom_in_mexpr1716);
            	    unaryAtom130=unaryAtom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryAtom130.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:320:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );
    public final BeeParser.atom_return atom() throws RecognitionException {
        BeeParser.atom_return retval = new BeeParser.atom_return();
        retval.start = input.LT(1);
        int atom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token BOOLEAN131=null;
        Token INT132=null;
        Token NULL133=null;
        Token DOUBLE134=null;
        Token char_literal136=null;
        Token char_literal138=null;
        BeeParser.varRef_return varRef135 = null;

        BeeParser.exp_return exp137 = null;

        BeeParser.functionCall_return functionCall139 = null;

        BeeParser.nativeMethod_return nativeMethod140 = null;

        BeeParser.json_return json141 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree BOOLEAN131_tree=null;
        BeeCommonNodeTree INT132_tree=null;
        BeeCommonNodeTree NULL133_tree=null;
        BeeCommonNodeTree DOUBLE134_tree=null;
        BeeCommonNodeTree char_literal136_tree=null;
        BeeCommonNodeTree char_literal138_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:320:6: ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json )
            int alt40=10;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:320:8: BOOLEAN
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    BOOLEAN131=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN131_tree = (BeeCommonNodeTree)adaptor.create(BOOLEAN131);
                    adaptor.addChild(root_0, BOOLEAN131_tree);
                    }

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:322:6: INT
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    INT132=(Token)match(input,INT,FOLLOW_INT_in_atom1734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT132_tree = (BeeCommonNodeTree)adaptor.create(INT132);
                    adaptor.addChild(root_0, INT132_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:323:4: NULL
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    NULL133=(Token)match(input,NULL,FOLLOW_NULL_in_atom1739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL133_tree = (BeeCommonNodeTree)adaptor.create(NULL133);
                    adaptor.addChild(root_0, NULL133_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:324:4: DOUBLE
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    DOUBLE134=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLE134_tree = (BeeCommonNodeTree)adaptor.create(DOUBLE134);
                    adaptor.addChild(root_0, DOUBLE134_tree);
                    }

                    }
                    break;
                case 5 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:325:4: a= StringLiteral
                    {
                    a=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_atom1751); if (state.failed) return retval; 
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
                    // 325:20: ->
                    {
                        adaptor.addChild(root_0, new BeeCommonNodeTree(new CommonToken(StringLiteral,BeetlUtil.getEscapeString((a!=null?a.getText():null)))));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:326:4: varRef
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_atom1760);
                    varRef135=varRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varRef135.getTree());

                    }
                    break;
                case 7 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:327:4: '(' exp ')'
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    char_literal136=(Token)match(input,106,FOLLOW_106_in_atom1766); if (state.failed) return retval;
                    pushFollow(FOLLOW_exp_in_atom1769);
                    exp137=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exp137.getTree());
                    char_literal138=(Token)match(input,107,FOLLOW_107_in_atom1771); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:328:4: functionCall[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_atom1778);
                    functionCall139=functionCall(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCall139.getTree());

                    }
                    break;
                case 9 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:329:4: nativeMethod[false]
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_nativeMethod_in_atom1784);
                    nativeMethod140=nativeMethod(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nativeMethod140.getTree());

                    }
                    break;
                case 10 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:330:4: json
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_json_in_atom1790);
                    json141=json();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, json141.getTree());

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:332:1: unaryAtom : ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom );
    public final BeeParser.unaryAtom_return unaryAtom() throws RecognitionException {
        BeeParser.unaryAtom_return retval = new BeeParser.unaryAtom_return();
        retval.start = input.LT(1);
        int unaryAtom_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token MINUS143=null;
        Token ADD144=null;
        BeeParser.atom_return a = null;

        BeeParser.atom_return atom142 = null;

        BeeParser.atom_return atom145 = null;


        BeeCommonNodeTree MINUS143_tree=null;
        BeeCommonNodeTree ADD144_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:333:2: ( atom | MINUS a= atom -> ^( NEGATOM atom ) | ADD atom -> atom )
            int alt41=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case StringLiteral:
            case LEFT_BRACE:
            case BOOLEAN:
            case INT:
            case NULL:
            case DOUBLE:
            case 106:
            case 127:
            case 130:
                {
                alt41=1;
                }
                break;
            case MINUS:
                {
                alt41=2;
                }
                break;
            case ADD:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:333:4: atom
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryAtom1801);
                    atom142=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom142.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:334:4: MINUS a= atom
                    {
                    MINUS143=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryAtom1807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS143);

                    pushFollow(FOLLOW_atom_in_unaryAtom1811);
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
                    // 334:17: -> ^( NEGATOM atom )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:334:19: ^( NEGATOM atom )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:335:4: ADD atom
                    {
                    ADD144=(Token)match(input,ADD,FOLLOW_ADD_in_unaryAtom1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ADD.add(ADD144);

                    pushFollow(FOLLOW_atom_in_unaryAtom1825);
                    atom145=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom145.getTree());


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
                    // 335:13: -> atom
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:337:1: nativeMethod[boolean statmentCall] : a= '@' Identifier ( '.' Identifier )* ( classMutileExp )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) ;
    public final BeeParser.nativeMethod_return nativeMethod(boolean statmentCall) throws RecognitionException {
        BeeParser.nativeMethod_return retval = new BeeParser.nativeMethod_return();
        retval.start = input.LT(1);
        int nativeMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token Identifier146=null;
        Token char_literal147=null;
        Token Identifier148=null;
        BeeParser.classMutileExp_return classMutileExp149 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree Identifier146_tree=null;
        BeeCommonNodeTree char_literal147_tree=null;
        BeeCommonNodeTree Identifier148_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_classMutileExp=new RewriteRuleSubtreeStream(adaptor,"rule classMutileExp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:337:37: (a= '@' Identifier ( '.' Identifier )* ( classMutileExp )? -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) ) -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:337:38: a= '@' Identifier ( '.' Identifier )* ( classMutileExp )?
            {
            a=(Token)match(input,130,FOLLOW_130_in_nativeMethod1842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(a);

            Identifier146=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier146);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:337:55: ( '.' Identifier )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==125) ) {
                    int LA42_1 = input.LA(2);

                    if ( (LA42_1==Identifier) ) {
                        int LA42_3 = input.LA(3);

                        if ( (LA42_3==EOF||LA42_3==RIGHT_BRACE||LA42_3==RIGHT_TOKEN||(LA42_3>=OR && LA42_3<=MOD)||LA42_3==104||LA42_3==107||(LA42_3>=109 && LA42_3<=110)||LA42_3==125||(LA42_3>=127 && LA42_3<=129)) ) {
                            alt42=1;
                        }


                    }


                }


                switch (alt42) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:337:56: '.' Identifier
            	    {
            	    char_literal147=(Token)match(input,125,FOLLOW_125_in_nativeMethod1847); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_125.add(char_literal147);

            	    Identifier148=(Token)match(input,Identifier,FOLLOW_Identifier_in_nativeMethod1849); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier148);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:337:73: ( classMutileExp )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==125||LA43_0==127) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: classMutileExp
                    {
                    pushFollow(FOLLOW_classMutileExp_in_nativeMethod1853);
                    classMutileExp149=classMutileExp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_classMutileExp.add(classMutileExp149.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              if(!openBackdoor||isStrictMVC) throw new MVCStrictException(a);
            }


            // AST REWRITE
            // elements: classMutileExp, Identifier, classMutileExp, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BeeCommonNodeTree)adaptor.nil();
            // 338:4: -> {statmentCall}? ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) )
            if (statmentCall) {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:338:25: ^( DIRECT_CALL ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? ) )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(DIRECT_CALL, "DIRECT_CALL"), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:338:39: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? )
                {
                BeeCommonNodeTree root_2 = (BeeCommonNodeTree)adaptor.nil();
                root_2 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_2);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:338:60: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:338:72: ( classMutileExp )?
                if ( stream_classMutileExp.hasNext() ) {
                    adaptor.addChild(root_2, stream_classMutileExp.nextTree());

                }
                stream_classMutileExp.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 339:4: -> ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:339:7: ^( CLASS_FUNCTION[$a] ( Identifier )* ( classMutileExp )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_FUNCTION, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:339:28: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:339:40: ( classMutileExp )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:341:2: classMutileExp : classNextExp ( classNextExp | '.' Identifier )* ;
    public final BeeParser.classMutileExp_return classMutileExp() throws RecognitionException {
        BeeParser.classMutileExp_return retval = new BeeParser.classMutileExp_return();
        retval.start = input.LT(1);
        int classMutileExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal152=null;
        Token Identifier153=null;
        BeeParser.classNextExp_return classNextExp150 = null;

        BeeParser.classNextExp_return classNextExp151 = null;


        BeeCommonNodeTree char_literal152_tree=null;
        BeeCommonNodeTree Identifier153_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:342:2: ( classNextExp ( classNextExp | '.' Identifier )* )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:342:4: classNextExp ( classNextExp | '.' Identifier )*
            {
            root_0 = (BeeCommonNodeTree)adaptor.nil();

            pushFollow(FOLLOW_classNextExp_in_classMutileExp1912);
            classNextExp150=classNextExp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, classNextExp150.getTree());
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:342:17: ( classNextExp | '.' Identifier )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==125) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==Identifier) ) {
                        int LA44_4 = input.LA(3);

                        if ( (LA44_4==106) ) {
                            alt44=1;
                        }
                        else if ( (LA44_4==EOF||LA44_4==RIGHT_BRACE||LA44_4==RIGHT_TOKEN||(LA44_4>=OR && LA44_4<=MOD)||LA44_4==104||LA44_4==107||(LA44_4>=109 && LA44_4<=110)||LA44_4==125||(LA44_4>=127 && LA44_4<=129)) ) {
                            alt44=2;
                        }


                    }


                }
                else if ( (LA44_0==127) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:342:18: classNextExp
            	    {
            	    pushFollow(FOLLOW_classNextExp_in_classMutileExp1915);
            	    classNextExp151=classNextExp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classNextExp151.getTree());

            	    }
            	    break;
            	case 2 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:342:32: '.' Identifier
            	    {
            	    char_literal152=(Token)match(input,125,FOLLOW_125_in_classMutileExp1918); if (state.failed) return retval;
            	    Identifier153=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMutileExp1921); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Identifier153_tree = (BeeCommonNodeTree)adaptor.create(Identifier153);
            	    adaptor.addChild(root_0, Identifier153_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:343:2: classNextExp : ( classMethod | classArray );
    public final BeeParser.classNextExp_return classNextExp() throws RecognitionException {
        BeeParser.classNextExp_return retval = new BeeParser.classNextExp_return();
        retval.start = input.LT(1);
        int classNextExp_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        BeeParser.classMethod_return classMethod154 = null;

        BeeParser.classArray_return classArray155 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:344:2: ( classMethod | classArray )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==125) ) {
                alt45=1;
            }
            else if ( (LA45_0==127) ) {
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:344:5: classMethod
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_classMethod_in_classNextExp1934);
                    classMethod154=classMethod();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classMethod154.getTree());

                    }
                    break;
                case 2 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:344:17: classArray
                    {
                    root_0 = (BeeCommonNodeTree)adaptor.nil();

                    pushFollow(FOLLOW_classArray_in_classNextExp1936);
                    classArray155=classArray();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classArray155.getTree());

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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:346:1: classMethod : '.' Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) ;
    public final BeeParser.classMethod_return classMethod() throws RecognitionException {
        BeeParser.classMethod_return retval = new BeeParser.classMethod_return();
        retval.start = input.LT(1);
        int classMethod_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal156=null;
        Token Identifier157=null;
        Token char_literal158=null;
        Token char_literal160=null;
        Token char_literal162=null;
        BeeParser.exp_return exp159 = null;

        BeeParser.exp_return exp161 = null;


        BeeCommonNodeTree char_literal156_tree=null;
        BeeCommonNodeTree Identifier157_tree=null;
        BeeCommonNodeTree char_literal158_tree=null;
        BeeCommonNodeTree char_literal160_tree=null;
        BeeCommonNodeTree char_literal162_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:2: ( '.' Identifier '(' ( exp ( ',' exp )* )? ')' -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:4: '.' Identifier '(' ( exp ( ',' exp )* )? ')'
            {
            char_literal156=(Token)match(input,125,FOLLOW_125_in_classMethod1946); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_125.add(char_literal156);

            Identifier157=(Token)match(input,Identifier,FOLLOW_Identifier_in_classMethod1949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier157);

            char_literal158=(Token)match(input,106,FOLLOW_106_in_classMethod1951); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal158);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:24: ( exp ( ',' exp )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=Identifier && LA47_0<=LEFT_BRACE)||(LA47_0>=ADD && LA47_0<=MINUS)||(LA47_0>=BOOLEAN && LA47_0<=DOUBLE)||LA47_0==106||LA47_0==124||LA47_0==127||LA47_0==130) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:25: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_classMethod1954);
                    exp159=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp159.getTree());
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:29: ( ',' exp )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==109) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:30: ',' exp
                    	    {
                    	    char_literal160=(Token)match(input,109,FOLLOW_109_in_classMethod1957); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_109.add(char_literal160);

                    	    pushFollow(FOLLOW_exp_in_classMethod1959);
                    	    exp161=exp();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_exp.add(exp161.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal162=(Token)match(input,107,FOLLOW_107_in_classMethod1966); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal162);



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
            // 347:47: -> ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:49: ^( CLASS_METHOD[$Identifier] Identifier ( exp )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(CLASS_METHOD, Identifier157), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:347:88: ( exp )*
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:348:1: classArray : '[' exp ']' -> ^( CLASS_ARRAY exp ) ;
    public final BeeParser.classArray_return classArray() throws RecognitionException {
        BeeParser.classArray_return retval = new BeeParser.classArray_return();
        retval.start = input.LT(1);
        int classArray_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal163=null;
        Token char_literal165=null;
        BeeParser.exp_return exp164 = null;


        BeeCommonNodeTree char_literal163_tree=null;
        BeeCommonNodeTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:349:2: ( '[' exp ']' -> ^( CLASS_ARRAY exp ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:349:4: '[' exp ']'
            {
            char_literal163=(Token)match(input,127,FOLLOW_127_in_classArray1987); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(char_literal163);

            pushFollow(FOLLOW_exp_in_classArray1989);
            exp164=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp164.getTree());
            char_literal165=(Token)match(input,128,FOLLOW_128_in_classArray1991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_128.add(char_literal165);



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
            // 349:16: -> ^( CLASS_ARRAY exp )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:349:19: ^( CLASS_ARRAY exp )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:1: functionFullName : a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) ;
    public final BeeParser.functionFullName_return functionFullName() throws RecognitionException {
        BeeParser.functionFullName_return retval = new BeeParser.functionFullName_return();
        retval.start = input.LT(1);
        int functionFullName_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal166=null;
        Token Identifier167=null;

        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal166_tree=null;
        BeeCommonNodeTree Identifier167_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:18: (a= Identifier ( '.' Identifier )? -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:19: a= Identifier ( '.' Identifier )?
            {
            a=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName2010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(a);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:32: ( '.' Identifier )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==125) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:33: '.' Identifier
                    {
                    char_literal166=(Token)match(input,125,FOLLOW_125_in_functionFullName2013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(char_literal166);

                    Identifier167=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionFullName2015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier167);


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
            // 352:51: -> ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:54: ^( FUNCTION_FULL_NAME[$a] ( Identifier )* )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(FUNCTION_FULL_NAME, a), root_1);

                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:352:80: ( Identifier )*
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:354:1: switchStatment : a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) ;
    public final BeeParser.switchStatment_return switchStatment() throws RecognitionException {
        BeeParser.switchStatment_return retval = new BeeParser.switchStatment_return();
        retval.start = input.LT(1);
        int switchStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal168=null;
        Token char_literal169=null;
        Token char_literal170=null;
        Token char_literal173=null;
        BeeParser.exp_return base = null;

        BeeParser.caseStatment_return caseStatment171 = null;

        BeeParser.defaultStatment_return defaultStatment172 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal168_tree=null;
        BeeCommonNodeTree char_literal169_tree=null;
        BeeCommonNodeTree char_literal170_tree=null;
        BeeCommonNodeTree char_literal173_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_caseStatment=new RewriteRuleSubtreeStream(adaptor,"rule caseStatment");
        RewriteRuleSubtreeStream stream_defaultStatment=new RewriteRuleSubtreeStream(adaptor,"rule defaultStatment");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:355:2: (a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}' -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:355:4: a= 'switch' '(' base= exp ')' '{' ( caseStatment )* ( defaultStatment )? '}'
            {
            a=(Token)match(input,131,FOLLOW_131_in_switchStatment2040); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_131.add(a);

            char_literal168=(Token)match(input,106,FOLLOW_106_in_switchStatment2042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(char_literal168);

            pushFollow(FOLLOW_exp_in_switchStatment2046);
            base=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(base.getTree());
            char_literal169=(Token)match(input,107,FOLLOW_107_in_switchStatment2048); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(char_literal169);

            char_literal170=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_switchStatment2050); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal170);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:355:36: ( caseStatment )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==108) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: caseStatment
            	    {
            	    pushFollow(FOLLOW_caseStatment_in_switchStatment2052);
            	    caseStatment171=caseStatment();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseStatment.add(caseStatment171.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:355:50: ( defaultStatment )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==111) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:0:0: defaultStatment
                    {
                    pushFollow(FOLLOW_defaultStatment_in_switchStatment2055);
                    defaultStatment172=defaultStatment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defaultStatment.add(defaultStatment172.getTree());

                    }
                    break;

            }

            char_literal173=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_switchStatment2058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal173);



            // AST REWRITE
            // elements: defaultStatment, caseStatment, base
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
            // 356:3: -> ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:356:5: ^( SWITCH[$a] $base ( caseStatment )* ( defaultStatment )? )
                {
                BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(SWITCH, a), root_1);

                adaptor.addChild(root_1, stream_base.nextTree());
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:356:24: ( caseStatment )*
                while ( stream_caseStatment.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseStatment.nextTree());

                }
                stream_caseStatment.reset();
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:356:38: ( defaultStatment )?
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:357:1: caseStatment : a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) ;
    public final BeeParser.caseStatment_return caseStatment() throws RecognitionException {
        BeeParser.caseStatment_return retval = new BeeParser.caseStatment_return();
        retval.start = input.LT(1);
        int caseStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal175=null;
        BeeParser.exp_return exp174 = null;

        BeeParser.statements_return statements176 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:358:2: (a= 'case' exp ':' statements -> ^( CASE[$a] exp statements ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:358:4: a= 'case' exp ':' statements
            {
            a=(Token)match(input,108,FOLLOW_108_in_caseStatment2087); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(a);

            pushFollow(FOLLOW_exp_in_caseStatment2089);
            exp174=exp();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exp.add(exp174.getTree());
            char_literal175=(Token)match(input,110,FOLLOW_110_in_caseStatment2091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(char_literal175);

            pushFollow(FOLLOW_statements_in_caseStatment2093);
            statements176=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements176.getTree());


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
            // 358:32: -> ^( CASE[$a] exp statements )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:358:34: ^( CASE[$a] exp statements )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:359:1: defaultStatment : a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) ;
    public final BeeParser.defaultStatment_return defaultStatment() throws RecognitionException {
        BeeParser.defaultStatment_return retval = new BeeParser.defaultStatment_return();
        retval.start = input.LT(1);
        int defaultStatment_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token a=null;
        Token char_literal177=null;
        BeeParser.statements_return statements178 = null;


        BeeCommonNodeTree a_tree=null;
        BeeCommonNodeTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:360:2: (a= 'default' ':' statements -> ^( DEFAULT[$a] statements ) )
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:360:4: a= 'default' ':' statements
            {
            a=(Token)match(input,111,FOLLOW_111_in_defaultStatment2113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(a);

            char_literal177=(Token)match(input,110,FOLLOW_110_in_defaultStatment2115); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(char_literal177);

            pushFollow(FOLLOW_statements_in_defaultStatment2117);
            statements178=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements178.getTree());


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
            // 360:31: -> ^( DEFAULT[$a] statements )
            {
                // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:360:34: ^( DEFAULT[$a] statements )
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:1: json : ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) );
    public final BeeParser.json_return json() throws RecognitionException {
        BeeParser.json_return retval = new BeeParser.json_return();
        retval.start = input.LT(1);
        int json_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token char_literal179=null;
        Token char_literal181=null;
        Token char_literal183=null;
        Token char_literal184=null;
        Token char_literal186=null;
        Token char_literal188=null;
        BeeParser.exp_return exp180 = null;

        BeeParser.exp_return exp182 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue185 = null;

        BeeParser.jsonKeyValue_return jsonKeyValue187 = null;


        BeeCommonNodeTree char_literal179_tree=null;
        BeeCommonNodeTree char_literal181_tree=null;
        BeeCommonNodeTree char_literal183_tree=null;
        BeeCommonNodeTree char_literal184_tree=null;
        BeeCommonNodeTree char_literal186_tree=null;
        BeeCommonNodeTree char_literal188_tree=null;
        RewriteRuleTokenStream stream_RIGHT_BRACE=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACE");
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_LEFT_BRACE=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_jsonKeyValue=new RewriteRuleSubtreeStream(adaptor,"rule jsonKeyValue");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:6: ( '[' ( exp ( ',' exp )* )? ']' -> ^( JSONARRAY ( exp )* ) | '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}' -> ^( JSONMAP ( jsonKeyValue )* ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==127) ) {
                alt55=1;
            }
            else if ( (LA55_0==LEFT_BRACE) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:8: '[' ( exp ( ',' exp )* )? ']'
                    {
                    char_literal179=(Token)match(input,127,FOLLOW_127_in_json2133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_127.add(char_literal179);

                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:12: ( exp ( ',' exp )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=Identifier && LA52_0<=LEFT_BRACE)||(LA52_0>=ADD && LA52_0<=MINUS)||(LA52_0>=BOOLEAN && LA52_0<=DOUBLE)||LA52_0==106||LA52_0==124||LA52_0==127||LA52_0==130) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:13: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_json2136);
                            exp180=exp();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exp.add(exp180.getTree());
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:18: ( ',' exp )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==109) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:19: ',' exp
                            	    {
                            	    char_literal181=(Token)match(input,109,FOLLOW_109_in_json2140); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_109.add(char_literal181);

                            	    pushFollow(FOLLOW_exp_in_json2142);
                            	    exp182=exp();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_exp.add(exp182.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal183=(Token)match(input,128,FOLLOW_128_in_json2148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_128.add(char_literal183);



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
                    // 361:35: -> ^( JSONARRAY ( exp )* )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:37: ^( JSONARRAY ( exp )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONARRAY, "JSONARRAY"), root_1);

                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:361:49: ( exp )*
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:4: '{' ( jsonKeyValue ( ',' jsonKeyValue )* )? '}'
                    {
                    char_literal184=(Token)match(input,LEFT_BRACE,FOLLOW_LEFT_BRACE_in_json2161); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACE.add(char_literal184);

                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:8: ( jsonKeyValue ( ',' jsonKeyValue )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=Identifier && LA54_0<=StringLiteral)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:9: jsonKeyValue ( ',' jsonKeyValue )*
                            {
                            pushFollow(FOLLOW_jsonKeyValue_in_json2164);
                            jsonKeyValue185=jsonKeyValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue185.getTree());
                            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:22: ( ',' jsonKeyValue )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==109) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:23: ',' jsonKeyValue
                            	    {
                            	    char_literal186=(Token)match(input,109,FOLLOW_109_in_json2167); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_109.add(char_literal186);

                            	    pushFollow(FOLLOW_jsonKeyValue_in_json2169);
                            	    jsonKeyValue187=jsonKeyValue();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_jsonKeyValue.add(jsonKeyValue187.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal188=(Token)match(input,RIGHT_BRACE,FOLLOW_RIGHT_BRACE_in_json2175); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACE.add(char_literal188);



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
                    // 362:48: -> ^( JSONMAP ( jsonKeyValue )* )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:50: ^( JSONMAP ( jsonKeyValue )* )
                        {
                        BeeCommonNodeTree root_1 = (BeeCommonNodeTree)adaptor.nil();
                        root_1 = (BeeCommonNodeTree)adaptor.becomeRoot((BeeCommonNodeTree)adaptor.create(JSONMAP, "JSONMAP"), root_1);

                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:362:60: ( jsonKeyValue )*
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
    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:364:1: jsonKeyValue : ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) );
    public final BeeParser.jsonKeyValue_return jsonKeyValue() throws RecognitionException {
        BeeParser.jsonKeyValue_return retval = new BeeParser.jsonKeyValue_return();
        retval.start = input.LT(1);
        int jsonKeyValue_StartIndex = input.index();
        BeeCommonNodeTree root_0 = null;

        Token StringLiteral189=null;
        Token char_literal190=null;
        Token Identifier192=null;
        Token char_literal193=null;
        BeeParser.exp_return exp191 = null;

        BeeParser.exp_return exp194 = null;


        BeeCommonNodeTree StringLiteral189_tree=null;
        BeeCommonNodeTree char_literal190_tree=null;
        BeeCommonNodeTree Identifier192_tree=null;
        BeeCommonNodeTree char_literal193_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:365:2: ( StringLiteral ':' exp -> ^( JSONKEYVALUE StringLiteral exp ) | Identifier ':' exp -> ^( JSONKEYVALUE Identifier exp ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==StringLiteral) ) {
                alt56=1;
            }
            else if ( (LA56_0==Identifier) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:365:4: StringLiteral ':' exp
                    {
                    StringLiteral189=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_jsonKeyValue2193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral189);

                    char_literal190=(Token)match(input,110,FOLLOW_110_in_jsonKeyValue2195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(char_literal190);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue2197);
                    exp191=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp191.getTree());


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
                    // 365:26: -> ^( JSONKEYVALUE StringLiteral exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:365:28: ^( JSONKEYVALUE StringLiteral exp )
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
                    // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:366:4: Identifier ':' exp
                    {
                    Identifier192=(Token)match(input,Identifier,FOLLOW_Identifier_in_jsonKeyValue2213); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier192);

                    char_literal193=(Token)match(input,110,FOLLOW_110_in_jsonKeyValue2215); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(char_literal193);

                    pushFollow(FOLLOW_exp_in_jsonKeyValue2217);
                    exp194=exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exp.add(exp194.getTree());


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
                    // 366:23: -> ^( JSONKEYVALUE Identifier exp )
                    {
                        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:366:25: ^( JSONKEYVALUE Identifier exp )
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


        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:38: ( 'else' n= statement )
        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:252:38: 'else' n= statement
        {
        match(input,121,FOLLOW_121_in_synpred29_Bee961); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred29_Bee965);
        n=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Bee

    // $ANTLR start synpred36_Bee
    public final void synpred36_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:276:4: ( Identifier '=' exp )
        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:276:4: Identifier '=' exp
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred36_Bee1212); if (state.failed) return ;
        match(input,123,FOLLOW_123_in_synpred36_Bee1214); if (state.failed) return ;
        pushFollow(FOLLOW_exp_in_synpred36_Bee1216);
        exp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_Bee

    // $ANTLR start synpred37_Bee
    public final void synpred37_Bee_fragment() throws RecognitionException {   
        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:282:10: ({...}? Identifier )
        // E:\\lijz\\javamonkey\\bee\\github\\beetl1.25.03\\src\\org\\bee\\tl\\core\\Bee.g:282:10: {...}? Identifier
        {
        if ( !((input.LT(1).getText().startsWith("__V"))) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred37_Bee", "input.LT(1).getText().startsWith(\"__V\")");
        }
        match(input,Identifier,FOLLOW_Identifier_in_synpred37_Bee1290); if (state.failed) return ;

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
    protected DFA40 dfa40 = new DFA40(this);
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\22\uffff";
    static final String DFA3_minS =
        "\1\66\2\uffff\1\152\16\uffff";
    static final String DFA3_maxS =
        "\1\u0083\2\uffff\1\175\16\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\3\1\11";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\3\1\uffff\1\10\1\uffff\1\1\1\uffff\1\4\1\2\53\uffff\1\15"+
            "\6\uffff\1\17\1\13\1\11\1\12\1\6\2\uffff\1\7\1\5\11\uffff\1"+
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
            return "184:1: statement : ( constantsTextStatment | varDefine ';' | assignMent ';' | textStatment | ifStatment | forStatment | whileStament | statmentBlock | messFunction | continueStatment ';' | breakStatment ';' | returnStatment ';' | switchStatment | g_switchStatment | nativeMethod[true] ';' | directive );";
        }
    }
    static final String DFA40_eotS =
        "\16\uffff";
    static final String DFA40_eofS =
        "\6\uffff\1\12\6\uffff\1\12";
    static final String DFA40_minS =
        "\1\66\5\uffff\1\71\4\uffff\1\66\1\uffff\1\71";
    static final String DFA40_maxS =
        "\1\u0082\5\uffff\1\u0081\4\uffff\1\66\1\uffff\1\u0081";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\11\1\12\1\6\1\uffff"+
        "\1\10\1\uffff";
    static final String DFA40_specialS =
        "\16\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\6\1\5\1\11\22\uffff\1\1\1\2\1\3\1\4\33\uffff\1\7\24\uffff"+
            "\1\11\2\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\1\12\2\uffff\15\12\35\uffff\1\12\1\uffff\1\14"+
            "\1\12\1\uffff\2\12\15\uffff\1\12\1\13\4\12",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "\1\12\1\uffff\1\12\2\uffff\15\12\35\uffff\1\12\1\uffff\1\14"+
            "\1\12\1\uffff\2\12\15\uffff\6\12"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "320:1: atom : ( BOOLEAN | INT | NULL | DOUBLE | a= StringLiteral -> | varRef | '(' exp ')' | functionCall[false] | nativeMethod[false] | json );";
        }
    }
 

    public static final BitSet FOLLOW_statements_in_prog350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements361 = new BitSet(new long[]{0x3540000000000002L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_constantsTextStatment_in_statement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDefine_in_statement377 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_statement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignMent_in_statement385 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_statement387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textStatment_in_statement393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatment_in_statement398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatment_in_statement403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStament_in_statement408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statmentBlock_in_statement413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_messFunction_in_statement418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatment_in_statement423 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_statement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatment_in_statement431 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatment_in_statement439 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_statement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatment_in_statement447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_g_switchStatment_in_statement452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_statement457 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_statement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_in_statement467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_g_switchStatment482 = new BitSet(new long[]{0x0100000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_g_switchStatment485 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_g_switchStatment489 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_g_switchStatment491 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_g_switchStatment495 = new BitSet(new long[]{0x0200000000000000L,0x0000900000000000L});
    public static final BitSet FOLLOW_g_caseStatment_in_g_switchStatment497 = new BitSet(new long[]{0x0200000000000000L,0x0000900000000000L});
    public static final BitSet FOLLOW_g_defaultStatment_in_g_switchStatment500 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_g_switchStatment503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_g_caseStatment535 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_g_caseStatment537 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_109_in_g_caseStatment540 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_g_caseStatment542 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_110_in_g_caseStatment546 = new BitSet(new long[]{0x3540000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statements_in_g_caseStatment548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_g_defaultStatment574 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_g_defaultStatment576 = new BitSet(new long[]{0x3540000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statements_in_g_defaultStatment578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_directive595 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_directive600 = new BitSet(new long[]{0x0080000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_directive605 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_directive609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_returnStatment632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_continueStatment645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_breakStatment659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProcessFunction_in_messFunction686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_messFunction693 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_messFunction696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textProcessFunction707 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_textProcessFunction711 = new BitSet(new long[]{0x01C0000000000000L,0x90000C00000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_textProcessFunction714 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_textProcessFunction717 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_textProcessFunction719 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_textProcessFunction725 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_textProcessFunction727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_functionCall762 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_functionCall766 = new BitSet(new long[]{0x01C0000000000000L,0x90000C00000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_functionCall769 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_functionCall772 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_functionCall774 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_functionCall780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_statmentBlock829 = new BitSet(new long[]{0x3740000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statements_in_statmentBlock831 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_statmentBlock834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_forStatment851 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_forStatment853 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_forStatment857 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_forStatment859 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_forStatment864 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_forStatment866 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment873 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_forStatment877 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_forStatment881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_whileStament916 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_whileStament918 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_condExp_in_whileStament922 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_whileStament924 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_whileStament927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ifStatment948 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ifStatment950 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_condExp_in_ifStatment952 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_ifStatment954 = new BitSet(new long[]{0x3540000000000000L,0x039F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statement_in_ifStatment958 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_ifStatment961 = new BitSet(new long[]{0x3540000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statement_in_ifStatment965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TEXT_TOKEN_in_constantsTextStatment995 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_constantsTextStatment998 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_constantsTextStatment1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment1030 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_textVar_in_textStatment1032 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_TOKEN_in_textStatment1047 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_textStatment1049 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_textVar_in_textStatment1051 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_textStatment1053 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RIGHT_TOKEN_in_textStatment1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_textVar1075 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_textVar1079 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_textformat_in_textVar1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionFullName_in_textformat1108 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_textformat1111 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_textformat1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDefine1155 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine1158 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_varDefine1161 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_varAssignMent_in_varDefine1163 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1212 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_varAssignMent1214 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_varAssignMent1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varAssignMent1234 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_varAssignMent1236 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_statmentBlock_in_varAssignMent1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_assignMent1262 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_assignMent1264 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_assignMent1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_varRef1309 = new BitSet(new long[]{0x0000000000000002L,0xF000000000000000L});
    public static final BitSet FOLLOW_varAttribute_in_varRef1314 = new BitSet(new long[]{0x0000000000000002L,0xF000000000000000L});
    public static final BitSet FOLLOW_safeOutput_in_varRef1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_safeOutput1350 = new BitSet(new long[]{0x01C0000000000002L,0x8000040000007800L,0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_safeOutput1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_varAttribute1377 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_varAttribute1393 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_varAttribute1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_varAttribute1412 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_varAttribute1414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_varAttribute1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExp_in_exp1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_condExp1450 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_condExp1453 = new BitSet(new long[]{0x01C0000000000000L,0x90004400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_condExp1459 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_condExp1464 = new BitSet(new long[]{0x01C0000000000002L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_condExp1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1496 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_OR_in_conditionalOrExpression1507 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1510 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1541 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_AND_in_conditionalAndExpression1552 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_condExpNotItem_in_conditionalAndExpression1555 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_condExpNotItem1589 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_condExpItem_in_condExpNotItem1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1611 = new BitSet(new long[]{0x0000000000000002L,0x000000000000003FL});
    public static final BitSet FOLLOW_EQUAL_in_condExpItem1618 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_condExpItem1623 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_LARGE_in_condExpItem1628 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_LARGE_EQUAL_in_condExpItem1633 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_LESS_in_condExpItem1638 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_condExpItem1643 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_aexpr_in_condExpItem1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1660 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ADD_in_aexpr1666 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_aexpr1671 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_mexpr_in_aexpr1675 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1695 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_MULTIP_in_mexpr1701 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_DIV_in_mexpr1706 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_MOD_in_mexpr1711 = new BitSet(new long[]{0x01C0000000000000L,0x80000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_unaryAtom_in_mexpr1716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_atom1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_atom1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_atom1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_atom1766 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_atom1769 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_atom1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atom1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nativeMethod_in_atom1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_json_in_atom1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unaryAtom1807 = new BitSet(new long[]{0x01C0000000000000L,0x8000040000007800L,0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryAtom1823 = new BitSet(new long[]{0x01C0000000000000L,0x8000040000007800L,0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_unaryAtom1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_nativeMethod1842 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1844 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L});
    public static final BitSet FOLLOW_125_in_nativeMethod1847 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_nativeMethod1849 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L});
    public static final BitSet FOLLOW_classMutileExp_in_nativeMethod1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classNextExp_in_classMutileExp1912 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L});
    public static final BitSet FOLLOW_classNextExp_in_classMutileExp1915 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L});
    public static final BitSet FOLLOW_125_in_classMutileExp1918 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_classMutileExp1921 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L});
    public static final BitSet FOLLOW_classMethod_in_classNextExp1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classArray_in_classNextExp1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_classMethod1946 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_classMethod1949 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_classMethod1951 = new BitSet(new long[]{0x01C0000000000000L,0x90000C00000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_classMethod1954 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_classMethod1957 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_classMethod1959 = new BitSet(new long[]{0x0000000000000000L,0x0000280000000000L});
    public static final BitSet FOLLOW_107_in_classMethod1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_classArray1987 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_classArray1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_classArray1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName2010 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_functionFullName2013 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionFullName2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_switchStatment2040 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_switchStatment2042 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_switchStatment2046 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_switchStatment2048 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_switchStatment2050 = new BitSet(new long[]{0x0200000000000000L,0x0000900000000000L});
    public static final BitSet FOLLOW_caseStatment_in_switchStatment2052 = new BitSet(new long[]{0x0200000000000000L,0x0000900000000000L});
    public static final BitSet FOLLOW_defaultStatment_in_switchStatment2055 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_switchStatment2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_caseStatment2087 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_caseStatment2089 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_caseStatment2091 = new BitSet(new long[]{0x3540000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statements_in_caseStatment2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_defaultStatment2113 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_defaultStatment2115 = new BitSet(new long[]{0x3540000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statements_in_defaultStatment2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_json2133 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000005L});
    public static final BitSet FOLLOW_exp_in_json2136 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_109_in_json2140 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_json2142 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_json2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACE_in_json2161 = new BitSet(new long[]{0x02C0000000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json2164 = new BitSet(new long[]{0x0200000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_json2167 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_jsonKeyValue_in_json2169 = new BitSet(new long[]{0x0200000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACE_in_json2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_jsonKeyValue2193 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_jsonKeyValue2195 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_jsonKeyValue2213 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_jsonKeyValue2215 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_jsonKeyValue2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_synpred29_Bee961 = new BitSet(new long[]{0x3540000000000000L,0x019F020000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_statement_in_synpred29_Bee965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred36_Bee1212 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_synpred36_Bee1214 = new BitSet(new long[]{0x01C0000000000000L,0x90000400000078C0L,0x0000000000000004L});
    public static final BitSet FOLLOW_exp_in_synpred36_Bee1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred37_Bee1290 = new BitSet(new long[]{0x0000000000000002L});

}