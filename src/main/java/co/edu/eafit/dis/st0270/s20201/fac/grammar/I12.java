package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class I12 extends PilotState {

    public I12() {
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof I12) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	return "I12";
    }

    public int hashCode() {
	return EnumGrammarSymbol.I12.ordinal();
    }
}
