package OperadoresLogicos;

public class operadoresLogicos {

	public static void main(String[] args) {
		//Los operdores lógicos se utilizan para combinar valores booleanos y nos devuelven un resulado verdadero, falso o nulo
		 
		
		//&& and (Y)
		//|| OR (O)
		//! not (no)
		
		//int a = 5;
		//int b = 3;
		
		//System.out.println(a == b && a > b); false porque una de ellas no es verdadera
		//System.out.println(!(a == b) && (a > b)); true porque niega el resultado o niega el false
		//System.out.println(a == b || a > b); true porque al menos una de ellas es verdadera
		
		
		// Determinar si un num es par

				int num = 7;

				boolean resultado = (num % 2 == 0);

				if (resultado) {
					System.out.println("el numero es par");

				} else {
					System.out.println("el numero es impar");
				}

	}

}
