package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Variable de la primera distancia en milimetros
		float distancia1;
		// Variable de la segunda distancia en centimetros
		float distancia2;
		// Variable de la tercera distancia en metros
		float distancia3;

		//Inicio un escaner
		Scanner sc = new Scanner(System.in);
		//Mensaje apra que introduzca primera distancia en milimetros
		System.out.println("Introduce la primera distancia en milimetros: ");
		//Recoge el dato de la primera distancia con el escaner
		distancia1 = sc.nextFloat();
		//Mensaje apra que introduzca segunda distancia en centimetros
		System.out.println("Introduce la primera distancia en centimetros: ");
		//Recoge el dato de la segunda distancia con el escaner
		distancia2 = sc.nextFloat();
		//Mensaje apra que introduzca la tercera distancia en metros
		System.out.println("Introduce la primera distancia en metros: ");
		//Recoge el dato de la tercera distancia con el escaner
		distancia3 = sc.nextFloat();
		//Declaro una variable para la suma de las tres distancias en centimetros
		float sumadistancias = (float) (distancia1 / 10) + distancia2 + (distancia3*10);
		//Imprimo el resultado de las distancias en centimetros
		System.out.println("El resultado de las tres medidas en centimetros es" + sumadistancias);
		//Cierro el escaner 
		sc.close();

	}

}
