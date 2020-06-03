package co.edu.eafit.dis.st0270.s20201.fac;

import java.io.IOException;
import co.edu.eafit.dis.st0270.s20201.fac.FacTokens;

%%

%class FacJaccLexer
%int
%unicode
%line
%column
%public
%implements FacTokens
%{
    private int token;

    public int getToken() {
        return token;
    }

    public int getSemantic() {
        return token;
    }

    public int nextToken() {
        try {
            token = yylex();
        }
        catch (IOException ioe) {
            System.err.println("Lexer exception: " + ioe);
            System.exit(1);
        }
        return token;
    }
%}

LineTerminator = \r|\n|\r|\n
WhiteSpace     = {LineTerminator} | [ \t\n]

%%

"|"                     { return (token = OR); }
"::="                   { return (token = EQUAL); }
","                     { return (token = COMMA); }
[:lowercase:]           { return (token = LC); }
[:uppercase:]            { return (token = UC); }
{WhiteSpace}            { }
<<EOF>>                 { return (token = ENDINPUT); }