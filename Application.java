package jumps;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

import jumps.antlr4.*;

public class Application {

	public static void main(String[] args) {
		String inputFile = (args.length > 0) ? args[0] : null;

		InputStream inputStream = (inputFile == null) ? System.in : new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(inputStream);
		mumpsLexer lexer = new mumpsLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mumpsParser parser = new mumpsParser(tokens);
		ParseTree tree = parser.prog(); // parse; start at prog

		System.out.println(tree.toStringTree(parser)); // print tree as text
	}

}
