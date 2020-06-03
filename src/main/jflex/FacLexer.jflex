/* Analizador lexico manual de Fac */
package co.edu.eafit.dis.st0270.s20201.fac.lexer;

import co.edu.eafit.dis.st0270.s20201.fac.grammar.Equal;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Comma;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Or;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.LowerCaseCharacter;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.UpperCaseCharacter;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.EndOfFile;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Terminal;

%%

%class FacLexer
%unicode
%line
%column
%function getNextToken
%type Terminal
%public

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]
UC	       = [:uppercase:]
LC 	       = [:lowercase:]

%%

"::="			{ return new Equal(yycolumn + 1, yyline + 1); }
","			{ return new Comma(yycolumn + 1, yyline + 1); }
"|"			{ return new Or(yycolumn + 1, yyline + 1); }
{LC}			{ return new LowerCaseCharacter(yycolumn + 1, yyline + 1); }
{UC}			{ return new UpperCaseCharacter(yycolumn + 1, yyline + 1); }
{WhiteSpace}		{ }
<<EOF>> 		{ return new EndOfFile(); }
