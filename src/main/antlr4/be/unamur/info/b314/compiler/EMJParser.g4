parser grammar EMJParser;
    options { tokenVocab = EMJLexer; }

// départ
root : (program | map) EOF;

//forme du Programme
program: imports? main;

imports: IMPORT nom_fichier;

//fonction main
main: (VOID MAIN LPAR RPAR LCURLBRACKET (instruction)* (RETURN VOID ENDSTATEMENT)? RCURLBRACKET) (funcDecl)*;
nom_fichier: ENTREQUOTE MOTS POINT MAP ENTREQUOTE;



// Description de la carte
map : LINE_COMMENT* CARTE WITH INTEGER COMMA INTEGER COMMA (HAUTARROW|DROITEARROW|BASARROW|GAUCHEARROW) ENDSTATEMENT (element_carte+);
element_carte : MOTORWAY | POLICE |HOUSES | CARTE | VOLCANO | CONSTRUCTION | WAVES|VILLAIN|TRACTOR;


// Instructions
instruction: ifInstr
            | loopInstr
            | preFunc ENDSTATEMENT
            | affectInstr ENDSTATEMENT
            | variableExprEmoji
            |callFunc ENDSTATEMENT;

//pour l'affectation
affectInstr: leftExp EQUAL rightExp ;


ifInstr: (IF LPAR boolExp RPAR LCURLBRACKET instructions RCURLBRACKET) (ELSE LCURLBRACKET elseInstr RCURLBRACKET)?;

elseInstr: instructions | (POINTDOWN ENDSTATEMENT);


loopInstr: INFINIE LPAR boolExp RPAR LCURLBRACKET instruction* RCURLBRACKET
        |REPEATBOUTON LPAR INTEGER RPAR LCURLBRACKET instruction* RCURLBRACKET;

preFunc: HAUTARROW LPAR intExpr RPAR
        | BASARROW LPAR intExpr RPAR
        | DROITEARROW LPAR intExpr RPAR
        | GAUCHEARROW LPAR intExpr RPAR
        | ALARME LPAR RPAR
        | RADIO LPAR RPAR
        | HANDRAISED LPAR RPAR;

tuple: LPAR INTEGER COMMA INTEGER RPAR
    | LPAR CHAR COMMA CHAR RPAR
    | LPAR STRING COMMA STRING RPAR
    | LPAR bool COMMA bool RPAR;



rightExp :(rightExpB|boolExp);

rightExpB: leftExp| intExpr | callFunc | CHAR | STRING | tuple ;


// definition d'un boolean
bool:TRUE | FALSE;


leftExp: ID ( (ZERO) | (UN) )?;

// appele de  function
callFunc: ID LPAR callFuncArgs? RPAR;
callFuncArgs: callFuncArg (COMMA callFuncArg)*;
callFuncArg: rightExp;

intExpr: intExpr op=(MINUS | PLUS |MULT | DIV) intExpr (RPAR)? | LPAR intExpr (RPAR | LPAR)| MINUS intExpr| INTEGER | leftExp | callFunc;


//  expression booleen
boolExp : LPAR boolExp RPAR| boolExp COMPARATOR boolExp| boolExp CONNECTOR boolExp  | NON boolExp| bool| rightExpB;

// declaration d'une Fonction

funcDecl: funcType ID LPAR funcParams RPAR LCURLBRACKET instructions RETURN funcReturn ENDSTATEMENT RCURLBRACKET;
funcType: type | VOID;
funcParams: funcParamsNotEmpty?;
funcParamsNotEmpty: type ID COMMA funcParamsNotEmpty | type ID;
instructions: (instruction)*;
funcReturn: rightExp | VOID;


//variable expression Emojis
variableExprEmoji: type ID EQUAL rightExp ENDSTATEMENT | type ID ENDSTATEMENT;

// Type de variable
type: type_emo | (EMOJI_TUPLE_OF LPAR type_emo RPAR) ;
type_emo: INTEGER_EMOJI | STRING_EMOJI | BOOL_EMOJI | CHAR_EMOJI ;




