package project;

import java.io.File;

public class Principal {

	public static void main(String[] args) {
		String ruta="C:/Users/casa/Desktop/EjercicioSabado/src/project/Lexer.flex";
		generarLexico(ruta);
	}
	
	public static void generarLexico(String ruta){
		File archivo = new File(ruta);
		JFlex.Main.generate(archivo);
	}
	

}
