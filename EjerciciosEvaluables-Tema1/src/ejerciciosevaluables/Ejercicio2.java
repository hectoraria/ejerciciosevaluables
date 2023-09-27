package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Defino la variable del numero entero
		float num;
		//Variable resto para poder almacenar el resto del numero si no es multiplo
		float resto;
		//Incio escaner
		Scanner sc = new Scanner(System.in);
		//Imprimo el mensaje para que introzca el numero
		System.out.println("Introduce un numero: ");
		//Recoga el numero introducido en la variable de numero
		num = sc.nextFloat();
		//Funcion para ver si es multiplo de siete
		resto = num<=7 ? 7%num : num%7 ;
		//Imprimo el resultado para recoge en la consola que es multiplo
		System.out.println("A "+ num + " hay que sumarle "+ resto + " para que sea multiplo de 7");
		//Cierro escaner
		sc.close();

	}

}
