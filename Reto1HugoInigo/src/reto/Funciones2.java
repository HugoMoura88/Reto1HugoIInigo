package reto;

import java.util.Scanner;

import Reto.Funciones;

public class Funciones2 {

	public static int multiplicar(Scanner sc) {
		int nu1 = Funciones.dimeEntero("Numero1: ", sc);
		int nu2 = Funciones.dimeEntero("Numero2: ", sc);
		return nu1*nu2;
	}
	public static int dividir(Scanner sc) {
		int nu1 = Funciones.dimeEntero("Numero1: ", sc);
		int nu2 = Funciones.dimeEntero("Numero2: ", sc);
		return nu1/nu2;
	}
	public static String esPositivo(Scanner sc) {
		int nu1 = Funciones.dimeEntero("Numero: ", sc);
		if (nu1>=0) {
			return "Es positivo";
		} else  {
			return "No es positivo";
		}
	}
	public static String esNegativo(Scanner sc) {
		int nu1 = Funciones.dimeEntero("Numero: ", sc);
		if (nu1>=0) {
			return "Es negativo";
		} else  {
			return "No es negativo";
		}
	}
	
}
