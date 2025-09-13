lexer grammar EMJLexer;

// Commentaires
LINE_COMMENT: '\u{1F4E2}' ~[\r\n]* -> skip ;  // 🔥 Correction ici
COMMENT: '\u{1F50A}' .*? '\u{1F508}' -> skip ;  // 🔥 Correction ici

// Définition des emojis et mots-clés
LOUD_SPEAKER : '\u{1F4E2}';              //📢
SPEAKER_HIGH_VOLUME : '\u{1F50A}';       //🔊
SPEAKER_LOW_VOLUME : '\u{1F508}';        //🔈

// Définition de la carte
CARTE: '\u{1F5FA}' '\u{FE0F}';                      //🗺️
POLICE: '\u{1F694}';                     //🚔
HOUSES: '\u{1F3D8}' '\u{FE0F}';                     //🏘️
MOTORWAY: '\u{1F6E3}' '\u{FE0F}';                   //🛣️
VOLCANO: '\u{1F30B}';                    //🌋
CONSTRUCTION: '\u{1F6A7}';               //🚧
TRACTOR:'\u{1F69C}';                     //🚜
WAVES: '\u{1F30A}';                      //🌊
HAUTARROW: '\u{2B06}' '\u{FE0F}';                   //⬆️
DROITEARROW: '\u{27A1}' '\u{FE0F}';                 //➡️
BASARROW: '\u{2B07}' '\u{FE0F}';                    //⬇️
GAUCHEARROW: '\u{2B05}' '\u{FE0F}';                 //⬅️
VILLAIN: '\u{1F9B9}';

// Comparateurs
CONNECTOR: '\u{1F91D}' | '\u{2753}';     //🤝 |❓ -> et | ou
COMPARATOR: '<' | '>' | '==' | '<=' | '>=' | '!=';

// Mots-clés de contrôle
IF: '\u{1F914}';                          //🤔
ELSE: '\u{1F928}';                        //🤨
POINTDOWN: '\u{1F447}';                   //👇
INFINIE: '\u{267E}' '\u{FE0F}';                      //♾️
REPEATBOUTON: '\u{1F501}';                //🔁
RETURN: '\u{21A9}' '\u{FE0F}';                       //↩️
VOID: '\u{1F300}';                        //🌀
ALARME: '\u{1F6A8}';                      //🚨
RADIO: '\u{1F4FB}';                       //📻
HANDRAISED: '\u{270B}';                   //✋

// Types de variables
INTEGER_EMOJI: '\u{1F522}';               //🔢
CHAR_EMOJI: '\u{1F523}';                  //🔣
STRING_EMOJI: '\u{1F521}';                //🔡
BOOL_EMOJI : '\u{1F51F}';                 //🔟

// Autres mots-clés
ZERO: '\u{30}' '\u{FE0F}';                //0️
UN: '\u{31}''\u{FE0F}';                   //1️
EMOJI_TUPLE_OF: '\u{1F465}';              //👥
IMPORT: '\u{1F4E6}';                      //📦
MAIN: '\u{1F3E0}';                        //🏠
TRUE: '\u{2705}';                         //✅
FALSE: '\u{274C}';                        //❌
WITH: 'with';

// Opérateurs et symboles
LPAR: '(';
RPAR: ')';
BRACKET1: '[';
BRACKET2: ']';
LCURLBRACKET: '{';
RCURLBRACKET: '}';
ENTREQUOTE: '"';
QUOTE: '\'';
POINT: '.';
MAP: 'map';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/' ;



EQUAL: '=';
ENDSTATEMENT: ';';
NON: '\u{26D4}';

// Définition des valeurs
fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

INTEGER: MINUS? NUMBER;
NUMBER: (DIGIT)+;
CHAR: QUOTE (LETTER | ' ' | DIGIT) QUOTE;
STRING: ENTREQUOTE (LETTER | ' ' | DIGIT)+ ENTREQUOTE;

MOTS: (DIGIT | LETTER) (LETTER | DIGIT)* ;

// Identifiants
ID: BRACKET1 EMOJIES BRACKET2;
EMOJIES: EMOJIS EMOJIES?;
EMOJIS: [\p{Emoji}]+;

// Gestion des espaces et des lignes
NEWLINE: ('\r'? '\n' | '\n')+ -> skip ;
WS: (' ' | '\t')+ -> skip;
