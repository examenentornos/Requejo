package examen;

import java.util.Scanner;

public class programa {

	private static final int com1 = 1000;
	private static final int com2 = 500;
	private static final int com3 = 300;
	private static final int com4 = 100;

	public static int Usuario(String codigo, String nombre, String antiguedad, boolean plus) {

		if ((codigo.length() > 3) || (codigo.length() < 3) || (codigo == "000")) {
			throw new RuntimeException();
		}

		if ((nombre.length() > 20) || (nombre.length() == 0)) {
			throw new RuntimeException();
		}

		if ((antiguedad.length() > 2) || (antiguedad.length() < 2)) {
			throw new RuntimeException();
		}

		int complemento = 0;

		if (antiguedad.length() >= 5 && plus == true) {
			complemento = com1;
		}
		if (antiguedad.length() >= 5 && plus == false) {
			complemento = com2;
		}
		if (antiguedad.length() <= 5 && plus == true) {
			complemento = com3;
		}
		if (antiguedad.length() <= 5 && plus == false) {
			complemento = com4;
		}
		
		return 0;
	}

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
	    escaner.useDelimiter(";");
	    String codigo = escaner.next();
	    String nombre = escaner.next();
	    String antiguedad = escaner.next();
	    String plus = escaner.next();
	    
	    if (Usuario(codigo, nombre, null , false) == 0) {
	    	throw new RuntimeException();
	      }
	    }
	}
