package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variable de base del triangulo
		float base;
		// Variable de altura triangulo
		float altura;
		// Variable de su area
		float area;
		//Inicio un escaner
		Scanner sc = new Scanner(System.in);
		//Mensaje apra que introduca la base
		System.out.println("Introduce la base de tu triangulo: ");
		//Recoge el dato de la base con el escaner
		base = sc.nextFloat();
		//Mensaje apra que introduca la altura
		System.out.println("Introduce la altura de tu triangulo: ");
		//Recoge el dato de la altura con el escaner
		altura = sc.nextFloat();
		//Defino la funcion que tiene area
		area = (base*altura) / 2;
		//Imprimo el resultado de la area
		System.out.println("El resultado de la area es: " + area );
		//Cierro el escaner 
		sc.close();

	}

}
