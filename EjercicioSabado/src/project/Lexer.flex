package project;
import static project.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z0-9]
L2=[a-z]
S=[_]
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexema;
%}
%%
IF | 
THEN | 
ELSE |
ENDIF |
INT | 
STRING |
FOR |
DOUBLE {lexema=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"+" {return Suma;}
"-" {return Resta;}
"/" {return Division;}
({L2}{L}{L}{S})* {lexema=yytext(); return Identificador;}
{D}+ {lexema=yytext(); return Numero;}
 . {return ERROR;}
 
 
 
 
 
 
 