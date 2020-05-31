package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class I13 extends PilotState {

    public I13() {
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof I13) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	return "I13";
    }

    public int hashCode() {
	return EnumGrammarSymbol.I13.ordinal();
    }
}
