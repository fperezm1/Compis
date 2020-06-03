
package co.edu.eafit.dis.st0270.s20201.fac.parser;

import co.edu.eafit.dis.st0270.s20201.fac.grammar.GrammarSymbol;

public class FacParserException extends Exception {

    public static final long serialVersionUID = 4487924422002636L;

    public FacParserException(String cause, GrammarSymbol gs) {
	super(cause + " at " + gs);
    }

    public FacParserException(String cause) {
	super(cause);
    }

}
