package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class AnalizadorLexico {

	public static void main(String[] args) {		
		try {
			Reader lector = new BufferedReader(new FileReader("C:/Users/casa/Documents/entrada.txt"));
			Lexer lexer = new Lexer(lector);
			String resultado = "";
			while(true){
				Tokens tokens = lexer.yylex();
				if (tokens==null){
					resultado += "FINALIZAR";
					System.out.println(resultado);
					return;
				}
				switch (tokens) {
				case ERROR:
					resultado += "Simbolo no definido\n";
					break;
				case Identificador: case Numero: case Reservadas:
					resultado += lexer.lexema + ": es un "+tokens+"\n";
					break;
				default:
					resultado += "Token: "+ tokens +"\n";
					break;
				}
			}			
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
