package co.edu.eafit.dis.st0270.s20201.fac;

import gnu.getopt.Getopt;
import java.io.*;
import co.edu.eafit.dis.st0270.s20201.fac.lexer.FacLexer;
import co.edu.eafit.dis.st0270.s20201.fac.FacJaccLexer;
import co.edu.eafit.dis.st0270.s20201.fac.FacJaccParser;
import co.edu.eafit.dis.st0270.s20201.fac.parser.FacParser;
import co.edu.eafit.dis.st0270.s20201.fac.parser.FacParserException;

public class Main{

    private enum CompilerKind { MANUAL, JACC };

    public static void main(String args[]) {
	
	Getopt getOpt = new Getopt("FacMain", args, "mj");
	int c;
	String str = null;
	CompilerKind ck = CompilerKind.MANUAL;
	boolean M = false;
	boolean J = false;

	while ((c = getOpt.getopt()) != -1) {
	    switch (c) {
	    case 'm':
		ck = CompilerKind.MANUAL;
		M = true;
		break;
		
	    case 'j':
		ck = CompilerKind.JACC;
		J = true;
		break;

	    default:
		ck = CompilerKind.MANUAL;
		break;
	    }
	}

	int startFiles = getOpt.getOptind();

	switch(ck) {
	case MANUAL:
	    {
		FacParser fp = null;
		if (M == true && J == false){
		for (int i = startFiles; i < args.length; ++i) {
		    try {
			fp = new FacParser(new FacLexer(new FileReader(args[i])));
			fp.parser();
			System.err.println("Fichero: " + args[i] + " bien formado ManualParser");
		    }
		    catch (Exception e) {
			System.err.println(e);
			System.err.println("Fichero: " + args[i] + " mal formado ManualParser");
		    }
		}
		}else if (M == true && J == true){
		    for (int i = startFiles; i < args.length; ++i) {
		    try {
			fp = new FacParser(new FacLexer(new FileReader(args[i])));
			fp.parser();
			System.err.println("Fichero: " + args[i] + " bien formado ManualParser");
		    }
		    catch (Exception e) {
			System.err.println(e);
			System.err.println("Fichero: " + args[i] + " mal formado ManualParser");
		    }
		    try {
			 FileReader fr = new FileReader(args[i]);
			 FacJaccLexer  fjl = new FacJaccLexer(fr);
			 FacJaccParser fjp = new FacJaccParser(fjl);
			 fjl.nextToken();
			 if (fjp.parse()) {
			     System.out.println("Fichero: " + args[i] +" esta bien formado JaccParser");
			 }
			 else {
			     System.out.println("Fichero: " + args[i] + " esta mal formado JaccParser");
			 }
		     }
		     catch (FileNotFoundException fnfe) {
			 System.err.println("Error: " + args[i] + " no existe");
		     }
		    }
		}
	    }
	    break;
	    
	case JACC:
	    {
		if(M == false && J == true){
       		for (int i = startFiles; i < args.length; ++i) {
		     try {
			 FileReader fr = new FileReader(args[i]);
			 FacJaccLexer  fjl = new FacJaccLexer(fr);
			 FacJaccParser fjp = new FacJaccParser(fjl);
			 fjl.nextToken();
			 if (fjp.parse()) {
			     System.out.println("Fichero: " + args[i] +" esta bien formado JaccParser");
			 }
			 else {
			     System.out.println("Fichero: " + args[i] + " esta mal formado JaccParser");
			 }
		     }
		     catch (FileNotFoundException fnfe) {
			 System.err.println("Error: " + args[i] + " no existe");
		     }
		}
		}else if (M == true && J == true){
		    FacParser fp = null;
		    for (int i = startFiles; i < args.length; ++i) {
		    try {
			fp = new FacParser(new FacLexer(new FileReader(args[i])));
			fp.parser();
			System.err.println("Fichero: " + args[i] + " bien formado ManualParser");
		    }
		    catch (Exception e) {
			System.err.println(e);
			System.err.println("Fichero: " + args[i] + " mal formado ManualParser");
		    }
		    try {
			 FileReader fr = new FileReader(args[i]);
			 FacJaccLexer  fjl = new FacJaccLexer(fr);
			 FacJaccParser fjp = new FacJaccParser(fjl);
			 fjl.nextToken();
			 if (fjp.parse()) {
			     System.out.println("Fichero: " + args[i] +" esta bien formado JaccParser");
			 }
			 else {
			     System.out.println("Fichero: " + args[i] + " esta mal formado JaccParser");
			 }
		     }
		     catch (FileNotFoundException fnfe) {
			 System.err.println("Error: " + args[i] + " no existe");
		     }
		    }
		}
	    }
	System.exit(0);
	}
    }
}
