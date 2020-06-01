package co.edu.eafit.dis.st0270.s20201.fac.grammar;

public class UpperCaseCharacter extends Terminal {

    public UpperCaseCharacter(int col, int lin) {
	super(col, lin);
    }

    public UpperCaseCharacter() {
	super(-1,-1);
    }
    
    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof UpperCaseCharacter) {
    	    ret = true;
    	}
    	return ret;
    }

    public String toString() {
	String res = super.toString();
	return new String("UC "+ res);
    }


    public int hashCode() {
	return EnumGrammarSymbol.UpperCaseCharacter.ordinal();
    }
}