/* Analizador lexico de Fac */
package co.edu.eafit.dis.st0270.s20201.fac.lexer;

import co.edu.eafit.dis.st0270.s20201.grammar.Terminal;
import co.edu.eafit.dis.st0270.s20201.grammar.Equal;
import co.edu.eafit.dis.st0270.s20201.grammar.Comma;
import co.edu.eafit.dis.st0270.s20201.grammar.Or;
import co.edu.eafit.dis.st0270.s20201.grammar.LowerCaseCharacter;
import co.edu.eafit.dis.st0270.s20201.grammar.UpperCaseCharacter;
import co.edu.eafit.dis.st0270.s20201.grammar.EndOfFile;

%%

%class FacLexer
%unicode
%line
%colum
%function getNextToken
%type Terminal
%public

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]

%%

"::="			{ return new Equal(yycolumn + 1, yyline + 1); }
","			{ return new Comma(yycolumn + 1, yyline + 1); }
"|"			{ return new Or(yycolumn + 1, yyline + 1); }
[:upercase:]		{ return new LowerCaseCharacter(yycolumn + 1, yyline + 1) }
[:lowercase:]		{ return new UpperCaseCharacter(yycolumn + 1, yyline + 1) }
{WhiteSpace}		{ }
<<EOF>> 		{ return new EndOfFile(); }