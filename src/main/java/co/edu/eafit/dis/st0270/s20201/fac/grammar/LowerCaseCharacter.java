package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class LowerCaseCharacter extends Terminal {

    public LowerCaseCharacter(int col, int lin) {
	super(col, lin);
    }

    public LowerCaseCharacter() {
	super(-1,-1);
    }
    
    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof LowerCaseCharacter) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	String res = super.toString();
	return new String("LC "+ res);
    }


    public int hashCode() {
	return EnumGrammarSymbol.LowerCaseCharacter.ordinal();
    }
}