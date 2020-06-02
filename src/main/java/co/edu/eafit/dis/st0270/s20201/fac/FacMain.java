package co.edu.eafit.dis.st0270.s20201.fac;

import gnu.getopt.Getopt;
import java.io.StringReader;
import java.io.FileReader;
import co.edu.eafit.dis.st0270.s20201.fac.lexer.FacLexer;
import co.edu.eafit.dis.st0270.s20201.fac.lexer.FacJaccLexer;
import co.edu.eafit.dis.st0270.s20201.fac.parser.FacParser;
import co.edu.eafit.dis.st0270.s20201.fac.parser.FacParserException;
import co.edu.eafit.dis.st0270.s20201.fac.parser.FacJaccParser;

public class FacMain {

    private enum CompilerKind { MANUAL, JACC, DEFAULT };

    public static void main(String args[]) {
	
	Getopt getOpt = new Getopt("FacMain", args, "mj:");
	int c;
	String str = null;
	CompilerKind ck = CompilerKind.MANUAL;

	while ((c = getOpt.getopt()) != -1) {
	  switch (c) {
	  case 'm':
	      ck = CompilerKind.MANUAL;
	      break;
	      	      
	  case 'j':
	      ck = CompilerKind.JACC;
	      break;

	  default:
	      ck = CompilerKind.MANUAL;
	      break;
	  }
	}

	int startFiles = getOpt.getOptind();
	
	if (str == null && startFiles == args.length) usage();

	switch(ck) {
	case MANUAL:
	    {
		for (int i = startFiles; i < args.length; ++i) {
		     try {
			 FileReader fr = new FileReader(args[i]);
			 FacLexer  fl = new FacLexer(fr);
			 FacParser fp = new FacParser(fl);
			 fl.nextToken();
			 if (fp.parse()) {
			     System.out.println("Fichero: " + args[i] +" esta bien formado ManualParser");
			 }
			 else {
			     System.out.println("Fichero: " + args[i] + " esta mal formado ManualParser");
			 }
		     }
		     catch (FileNotFoundException fnfe) {
			 System.err.println("Error: " + args[i] + " no existe");
		     }
		}
	    }
	    break;

	case JACC:
	    {
		for (int i = startFiles; i < args.length; ++i) {
		     try {
			 FileReader fr = new FileReader(args[i]);
			 FacJaccLexer  fjl = new FacLexer(fr);
			 FacJaccParser fjp = new FacParser(fjl);
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
	System.exit(0);
	}
    }
}
