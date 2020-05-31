package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class I14 extends PilotState {

    public I14() {
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof I14) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	return "I14";
    }

    public int hashCode() {
	return EnumGrammarSymbol.I14.ordinal();
    }
}
