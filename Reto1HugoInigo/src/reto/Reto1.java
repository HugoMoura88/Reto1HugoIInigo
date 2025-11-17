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
		String cadena = sc.nextLine();
		int opcion = Integer.parseInt(cadena);
				
				
				
		
		
		
		

	}

}
