tree grammar BeeWalker;
options {
output=AST;
tokenVocab=Bee; // import tokens from CMinus.g
ASTLabelType=CommonTree;
backtrack=true;
memoize=true;
}
@header {
package org.bee.tl.core;
}

prog	:	statements ;
statements	:statement+;
statement
	:	varDefine
	|	assignMent
	|	textStatment
	|	ifStatment
	|	forStatment
	|	statmentBlock
	
		;
forStatment
	:	^(FOR Identifier varRef  statements);
statmentBlock
	:	^(SLIST statements);
ifStatment
	:	  ^(IF condExp statements statements? ) ;
textStatment
	:	 ^(HOLDER textVar);
textVar	: ^(VAR_TEXT exp (^(FM Identifier StringLiteral?))*) ;

varDefine
	:	^(VAR_DEFINE varAssignMent);
varAssignMent
	:	 ^(ASSIGNMENT Identifier exp )  ;
assignMent
	:	^(ASSIGNMENT Identifier exp) ;
	


exp	:	 condExp 
	;
	
condExp	:	
		aexpr
		|^('==' aexpr aexpr)
		|^('!=' aexpr aexpr)
		|^('>' aexpr aexpr)
		|^('>=' aexpr aexpr)
		|^('<' aexpr aexpr)
		|^('<=' aexpr aexpr)
		
		;
				
aexpr	:	
		mexpr
	|	^('+' mexpr mexpr)+
	|	^('-' mexpr mexpr)
	
	;
mexpr   :  atom
	    | ^('*' atom atom)
	    | ^('/' atom atom)
	    | ^('%' atom atom)
	    
	    ;
	    
atom	:	BOOLEAN
	|	INT
	|	DOUBLE
	|	StringLiteral
	|	varRef 
	|	'('! aexpr ')'! 
	|	functionCall
	;	
functionCall
	:	^(FUNCTION exp+) ;
varRef	:	^(VAR_REFER Identifier Identifier*);

	
