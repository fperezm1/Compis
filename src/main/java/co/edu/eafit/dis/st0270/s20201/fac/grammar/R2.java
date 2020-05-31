package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class R2 extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof R2) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return EnumGrammarSymbol.R2.ordinal();
    }

    public String toString() {
	return "R2";
    }
}