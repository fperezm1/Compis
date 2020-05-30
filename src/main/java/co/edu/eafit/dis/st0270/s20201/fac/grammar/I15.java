package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class I15 extends PilotState {

    public I15() {
    }

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof I15) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	return "I15";
    }

    public int hashCode() {
	return EnumGrammarSymbol.I15.ordinal();
    }
}
