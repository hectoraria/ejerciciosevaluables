package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro la variable del numero
		float num;
		// Variable redondeo
		int redondeo;
		//Incio el escaner
		Scanner sc = new Scanner(System.in);
		//Solicito el numero con decimales al usuario
		System.out.println("Introduce un numero decimal: ");
		//Recoge el numero introduce en la variable num
		num = sc.nextFloat();
		//Al numero se le suma 0,5 para poder sacar el redondeo
		num += 0.5;
		//Redondeo con el int para que solo te muestre la parte entera
		redondeo = (int)num;
		//Imprimo el numero redondeado
		System.out.println("El numero es redondeado es: " + redondeo);
		//Cierro el escaner
		sc.close();
	}

}
