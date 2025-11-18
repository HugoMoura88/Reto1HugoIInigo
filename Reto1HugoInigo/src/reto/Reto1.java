package reto;

import java.util.Locale;
import java.util.Scanner;

import Reto.Funciones;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int opcion = 1;
		do {
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
		opcion = Funciones.dimeEntero("Opcion: ", sc);
			switch (opcion) {
			case 1 -> System.out.println("Resultado: "+Funciones1.sumar(sc));
			case 2 -> System.out.println("Resultado: "+Funciones1.restar(sc));
			case 3 -> System.out.println("Resultado: "+Funciones2.multiplicar(sc));
			case 4 -> System.out.println("Resultado: "+Funciones2.dividir(sc));
			case 5 -> System.out.println(Funciones1.esPar(sc));
			case 6 -> System.out.println(Funciones1.esImpar(sc));
			case 7 -> System.out.println(Funciones2.esPositivo(sc));
			case 8 -> System.out.println(Funciones2.esNegativo(sc));
			default -> System.out.println("Opcion no valida"); 
			}
		} while (opcion!=0);
				
				
		
		
		
		

	}

}
