package src;

import java.io.IOException;
import java.io.StringReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String string = "Essa string tem operadores @ & ; # + palavras reservadas then";
        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(string));
        lexical.yylex();
    
	}

}
