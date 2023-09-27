package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable del coeficiente a
		float a;
		// Variable del coeficiente b
		float b;
		// Variable del coeficiente c
		float c;
		//Variable x
		float x;
		//Variable y
		float y;
		//Inicio un escaner
		Scanner sc = new Scanner(System.in);
		//Mensaje apra que introduca la a
		System.out.println("Introduce el dato a: ");
		//Recoge el dato de la a con el escaner
		a = sc.nextFloat();
		//Mensaje apra que introduca la b
		System.out.println("Introduce el dato b: ");
		//Recoge el dato de la b con el escaner
		b = sc.nextFloat();
		//Mensaje apra que introduca la c
		System.out.println("Introduce el dato c: ");
		//Recoge el dato de la c con el escaner
		c = sc.nextFloat();
		//Mensaje apra que introduca la x
		System.out.println("Introduce el dato x: ");
		//Recoge el dato de la x con el escaner
		x = sc.nextFloat();
		//Defino la funcion que tiene area
		y= (float) (a*Math.pow(x,2)) + (b*x) + c;
		//Imprimo el resultado de la y
		System.out.println("El resultado de y es: " + y );
		//Cierro el escaner 
		sc.close();

	}

}
