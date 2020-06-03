package co.edu.eafit.dis.st0270.s20201.fac.parser;

import co.edu.eafit.dis.st0270.s20201.fac.grammar.C;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Comma;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.EndOfFile;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Equal;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.GrammarSymbol;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I0;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I1;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I2;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I3;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I4;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I5;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I6;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I7;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I8;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I9;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I10;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I11;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I12;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I13;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I14;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I15;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.I16;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.LowerCaseCharacter;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.NonTerminal;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.NT;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Or;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.P;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.PilotState;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Production;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.R;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.R2;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.T;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.Terminal;
import co.edu.eafit.dis.st0270.s20201.fac.grammar.UpperCaseCharacter;
import co.edu.eafit.dis.st0270.s20201.fac.lexer.FacLexer;
import co.edu.eafit.dis.st0270.s20201.fac.parser.FacParserException;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;


public class FacParser {

    private FacLexer  fl = null;                                   
    private Terminal   cc  = null;
    private static Map<PilotState,Map<GrammarSymbol,PilotState>> pilotMap;
    private static Map<PilotState,Map<Terminal,Production>> reductionMap;

    static {
	// I0
	pilotMap = new HashMap<PilotState, Map<GrammarSymbol,PilotState>>();
	Map<GrammarSymbol,PilotState> nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new UpperCaseCharacter(), new I1());
	nextStateMap.put(new R(), new I2());
	nextStateMap.put(new NT(), new I3());
	pilotMap.put(new I0(), nextStateMap);
	// I1
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I1(), nextStateMap);
	// I2
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new EndOfFile(), new I4());
	pilotMap.put(new I2(), nextStateMap);
	// I3
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new Equal(), new I5());
	pilotMap.put(new I3(), nextStateMap);
	// I4
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I4(), nextStateMap);
	// I5
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new P(), new I6());
	nextStateMap.put(new R2(), new I7());
	nextStateMap.put(new T(), new I8());
	nextStateMap.put(new LowerCaseCharacter(), new I9());
	nextStateMap.put(new UpperCaseCharacter(), new I10());
	nextStateMap.put(new NT(), new I16());
	pilotMap.put(new I5(), nextStateMap);
	// I6
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new Comma(), new I11());
	pilotMap.put(new I6(), nextStateMap);
	// I7
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new Or(), new I12());
	pilotMap.put(new I7(), nextStateMap);
	// I8
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new UpperCaseCharacter(), new I10());
	nextStateMap.put(new NT(), new I13());
	pilotMap.put(new I8(), nextStateMap);
	// I9
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I9(), nextStateMap);
	// I10
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I10(), nextStateMap);
	//I11
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new UpperCaseCharacter(), new I1());
	nextStateMap.put(new NT(), new I3());
	nextStateMap.put(new R(), new I14());
	pilotMap.put(new I11(), nextStateMap);
	//I12
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new R2(), new I7());
	nextStateMap.put(new T(), new I8());
	nextStateMap.put(new LowerCaseCharacter(), new I9());
	nextStateMap.put(new UpperCaseCharacter(), new I10());
	nextStateMap.put(new P(), new I15());
	nextStateMap.put(new NT(), new I16());
	pilotMap.put(new I12(), nextStateMap);
	//I13
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I13(), nextStateMap);
	//I14
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I14(), nextStateMap);
	//I15
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I15(), nextStateMap);
	//I16
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I16(), nextStateMap);
	// Implementing the reduction map
	reductionMap = new HashMap<PilotState, Map<Terminal,Production>>();
	// I0
	Map<Terminal,Production> nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfFile(), Production.P4);
	reductionMap.put(new I0(), nextProductionMap);
	// I1
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Equal(), Production.P11);
	reductionMap.put(new I1(), nextProductionMap);
	// I4
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfFile(), Production.P1);
	reductionMap.put(new I4(), nextProductionMap);
	// I5
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Comma(), Production.P7);
	nextProductionMap.put(new EndOfFile(), Production.P7);
	reductionMap.put(new I5(), nextProductionMap);
	// I6
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfFile(), Production.P3);
	reductionMap.put(new I6(), nextProductionMap);
	// I7
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Comma(), Production.P6);
	nextProductionMap.put(new EndOfFile(), Production.P6);
	reductionMap.put(new I7(), nextProductionMap);
	// I9
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new UpperCaseCharacter(), Production.P10);
	reductionMap.put(new I9(), nextProductionMap);
	// I10
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Or(), Production.P11);
	nextProductionMap.put(new Comma(), Production.P11);
	nextProductionMap.put(new EndOfFile(), Production.P11);
	reductionMap.put(new I10(), nextProductionMap);
	//I11
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfFile(), Production.P4);
	reductionMap.put(new I11(), nextProductionMap);
	//I12
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Comma(), Production.P7);
	nextProductionMap.put(new EndOfFile(), Production.P7);
	reductionMap.put(new I12(), nextProductionMap);
	//I13
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Or(), Production.P8);
	nextProductionMap.put(new Comma(), Production.P8);
	nextProductionMap.put(new EndOfFile(), Production.P8);
	reductionMap.put(new I13(), nextProductionMap);
	//I14
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfFile(), Production.P2);
	reductionMap.put(new I14(), nextProductionMap);
	//I15
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Comma(), Production.P5);
	nextProductionMap.put(new EndOfFile(), Production.P5);
	reductionMap.put(new I15(), nextProductionMap);
	//I16
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Or(), Production.P9);
	nextProductionMap.put(new Comma(), Production.P9);
	nextProductionMap.put(new EndOfFile(), Production.P9);
	reductionMap.put(new I16(), nextProductionMap);
    }

    public FacParser(FacLexer fl) {
	this.fl = fl;
    }

    public boolean parser()
	throws FacParserException, IOException {

	Stack<GrammarSymbol> stack = new Stack<GrammarSymbol>();
	stack.push(new I0());

	cc = fl.getNextToken();

	GrammarSymbol gs = null;

	do {

	    gs = stack.peek();

	    if (gs instanceof PilotState) {
		// Busca primero si existe un movimiento de desplazamiento
		PilotState nps = null;
		try {

		    nps =  pilotMap.get(gs).get(cc);
		    if (nps != null) {
			stack.push(cc);
			stack.push(nps);
		    }
		    else {
			throw new NullPointerException();
		    }

		    cc = fl.getNextToken();

		} catch (NullPointerException npe) {

		    // Busca un movimiento de reducción
		    Production p = reductionMap.get(gs).get(cc);

		    if (p == null) {
			throw new FacParserException("No reduce option, no shift option");
		    }

		    NonTerminal nt = p.getLHS();
		    GrammarSymbol[] gss = p.getRHS();

		    // Analiza si los elementos esperados en la pila coinciden
		    for (int i = 0; i < gss.length; i++) {

			GrammarSymbol top = stack.pop();
			if (!(top instanceof PilotState)) {
			    throw new FacParserException("No reduce state " + top + "stack: " + stack);
			}
			else {
			    top = stack.pop();
			    if (!top.equals(gss[i])) {
				throw new FacParserException("Stack symbol " + top + " different from " + gss[i]);
			    }
			}
		    }

		    gs = stack.peek();
		    if (gs instanceof PilotState) {

			nps =  pilotMap.get(gs).get(nt);
			if (nps != null) {
			    stack.push(nt);
			    stack.push(nps);
			}
		    }
		}
	    }
	    else {

		throw new FacParserException("Internal Exception");
	    }
	    gs = stack.peek();
	} while (!((gs instanceof PilotState) && gs.equals(new I0()) && cc.equals(new EndOfFile())));
	return true;	
    }
}
