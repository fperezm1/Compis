
import java.io.IOException;
%%

%class FacJaccLexer
%int
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
WhiteSpace = {LineTerminator} | [ \t\n]

%%

"|"                     { return (token = OR); }
"::="                   { return (token = EQUAL); }
","                     { return (token = COMMA); }
[:lowercase:]           { return (token = LC); }
[:upercase:]            { return (token = UP); }
{WhiteSpace}            {}
<<EOF>>                 { return (token = ENDINPUT); }