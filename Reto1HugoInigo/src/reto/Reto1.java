package reto;

import java.util.Locale;
import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String menu = """ 
				Elige la operacion:
				1. Sumar
				2. Restar
				3. Multiplicar
				4. Dividir
				5. Par
				6. Impar
				7. Positivo
				8. Negativo
				0. Salir
				""";
		System.out.println(menu);
		int opcion = Funciones.dimeEntero("Opcion: ", sc);
			switch (opcion) {

			case 1 -> System.out.println("Resultado: "+Funciones1.sumar(sc));
			case 2 -> System.out.println("Resultado: "+Funciones1.restar(5, 2));
			case 3 -> System.out.println("Resultado: "+Funciones2.multiplicar(2, 4));
			case 4 -> System.out.println("Resultado: "+Funciones2.dividir(4, 2));
			case 5 -> System.out.println("Resultado: "+Funciones1.esPar(1));
			case 6 -> System.out.println("Resultado: "+Funciones1.esImpar(2));
			case 7 -> System.out.println("Resultado: "+Funciones2.esPositivo(3));
			case 8 -> System.out.println("Resultado: "+Funciones2.esNegativo(-4));
			default -> System.out.println("Opcion no valida"); 
			}
				
				
		
		
		
		

	}

}
