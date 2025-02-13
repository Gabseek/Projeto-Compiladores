grammar Tupy;

/***** Definição Sintática *****/
programa: instrucao+ EOF;

instrucao: declaracao                  // Declarações de variáveis
         | declaracaoComAtribuicao     // Declarações de variáveis e atribuição de valores
         | atribuicao                  // Atribuição de valores
         | incrementoOuDecremento      // Operações de incremento ou decremento
         | chamadaFuncao               // Chamada de função
         | escrita                     // Comando de escrita
         | leitura                     // Comando de leitura
         | retorno                     // Comando de retorno
         | funcao                      // Definição de função
         | condicional                 // Estrutura condicional
         | repeticao                   // Estrutura de repetição
         ;

declaracao: TIPO ID FLINHA;

declaracaoComAtribuicao: TIPO ID OPATRIB expressao FLINHA;

atribuicao: ID OPATRIB expressao FLINHA;

incrementoOuDecremento: ID OPINCDEC FLINHA;

chamadaFuncao: ID AP argumentos? FP;

escrita: ESCRITA expressao expressao? FLINHA;

leitura: LEITURA ID FLINHA;

retorno: RETORNO expressao FLINHA;

funcao: FUNCAO TIPO? ID AP parametrosDef? FP AC bloco FC;

condicional: SE AP condicao FP ENTAO AC bloco FC (SENAO AC bloco FC)?;

repeticao: ENQUANTO AP condicao FP AC bloco FC;

expressao: termo                     // Um termo básico
         | expressao OPMAT expressao // Operações matemáticas
         | AP expressao FP           // Operações considerando precedência
         ;

condicao: expressao                  // Um termo básico
        | condicao OPREL condicao    // Operações relacionais
        | condicao OPLOG condicao    // Operações lógicas
        | AP condicao FP             // Operações considerando precedência
        ;

termo: ID
     | NUMINT
     | NUMREAL
     | chamadaFuncao
     | AP expressao FP
     | Str
     ;

parametros: expressao (',' expressao)*;

parametrosDef: ID (',' ID)*;

argumentos: expressao (',' expressao)*;

bloco: (instrucao)*;

/***** Definição Léxica *****/
TIPO: 'lin' | 'int' | 'real' | 'boo';
ESCRITA: 'esc';
LEITURA: 'lei';
RETORNO: 'ret';
NRETORNO: 'nret';
FUNCAO: 'func';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
ENQUANTO: 'enquanto';
OPLOG: 'e' | 'ou';
OPMAT: '+' | '-' | '*' | '/' | '%';
OPREL: '==' | '!=' | '>' | '<' | '>=' | '<=';
OPINCDEC: '++' | '--';
OPATRIB: '=';
FLINHA: ';';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
ID: LETRA(DIGITO|LETRA)*;
NUMINT: DIGITO+;
NUMREAL: DIGITO+ ',' +DIGITO+;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
Str: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;

