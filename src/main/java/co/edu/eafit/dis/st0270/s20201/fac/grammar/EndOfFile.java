package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class EndOfFile extends Terminal {

    public EndOfFile() {
	super(-1,-1);
    }

    public boolean equals(Object obj) {
	boolean ret = false;
	if (obj instanceof EndOfFile) {
	    ret = true;
	}
	return ret;
    }

    public String toString() {
	String res = super.toString();

	return new String("End of File " + res);
    }

    public int hashCode() {
	return EnumGrammarSymbol.EndOfFile.ordinal();
    }
}