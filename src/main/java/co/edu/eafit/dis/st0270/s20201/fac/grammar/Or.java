package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class Or extends Terminal {

    public Or(int col, int lin) {
	super(col, lin);
    }

    public Or() {
	super(-1,-1);
    }
    
    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof Or) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	String res = super.toString();
	return new String("| "+ res);
    }


    public int hashCode() {
	return EnumGrammarSymbol.Or.ordinal();
    }
}