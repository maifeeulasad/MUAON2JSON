grammar Muaon;

muaon : '{' defBlock dataBlock '}';

defBlock : 'def' '=' '[' ']'
         | 'def' '=' '[' definationSet ']';

definationSet : defination
              | definationSet ',' defination;

defination     : INTEGER '(' ')'
                | INTEGER '(' keySet ')';

key : KEYELEM+;

keySet : key
       | INTEGER
       | keySet ',' key
       | keySet ',' INTEGER;

dataBlock : 'data' '=' value;

value : STRING | INTEGER | FLOAT | object | array | bool;

bool : 'true' | 'false';

object : '{' '}'
        | '{' ',' valueSetObject '}'
        | '{' INTEGER ',' valueSetObject '}';

valueSetObject     : value
                | valueSetObject ',' value
                | valueSetObject ',';

array : '[' ']'
      | '[' INTEGER ',' valueSetArray ']'
      | '[' '$' ',' valueSetArray ']';

valueSetArray : value
            | valueSetArray ',' value;



INTEGER : '-'? DIGIT+;

FLOAT : '-' ? INTEGER ( ('.' DIGIT+ EXPONENT?) | (EXPONENT));
fragment EXPONENT : [eE] [-+]? INTEGER+;
fragment DIGIT : '0'..'9';



KEYELEM : [0-9a-zA-Z];

STRING : '"' (~["\\] | ESCAPE)* '"';
fragment ESCAPE : '\\' ( ["\\/bfnrt]| UNICODE) ;
fragment UNICODE : 'u' HEXADECIMAL HEXADECIMAL HEXADECIMAL HEXADECIMAL;
fragment HEXADECIMAL : [0-9a-fA-F];

WhiteSpace : [\r\n\t ]+ -> skip;
MultiLineComments : '/*' .*? '*/' -> skip;
