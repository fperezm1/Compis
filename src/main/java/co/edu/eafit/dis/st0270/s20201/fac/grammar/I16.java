package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class I16 extends PilotState {

    public I16() {
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof I16) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	return "I16";
    }

    public int hashCode() {
	return EnumGrammarSymbol.I16.ordinal();
    }
}
