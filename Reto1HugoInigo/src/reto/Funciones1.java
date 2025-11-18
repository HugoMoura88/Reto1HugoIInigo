package reto;

import java.util.Scanner;

import Reto.Funciones;

public class Funciones1 {
 
	
	public static int sumar(Scanner sc) {
		
		int n1 = (Funciones.dimeEntero("Numero1: ", sc));
		int n2 = (Funciones.dimeEntero("Numero2: ", sc));
		return n1+n2;
	}
	
	public static int restar(Scanner sc) {
		int n1 = (Funciones.dimeEntero("Numero1: ", sc));
		int n2 = (Funciones.dimeEntero("Numero2: ", sc));
		
		return n1-n2;
		
	}
	
	public static String esPar(Scanner sc) {
		int n = (Funciones.dimeEntero("numero : ", sc));
		if (n%2==0) {
			return "Es par";
		} else {
			return "No es par";
		}
		
	}
	
	public static String esImpar(Scanner sc) {
		int n = (Funciones.dimeEntero("numero : ", sc));
		if (n%2!=0) {
			return "Es impar" ;
		} else 
			return "No es impar";
	}
}
