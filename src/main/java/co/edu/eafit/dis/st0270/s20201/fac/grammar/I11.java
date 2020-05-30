package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class I11 extends PilotState {

    public I11() {
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof I11) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	return "I11";
    }

    public int hashCode() {
	return EnumGrammarSymbol.I11.ordinal();
    }
}
