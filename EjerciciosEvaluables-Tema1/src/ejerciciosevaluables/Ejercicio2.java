package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    	//Declaro la variables de numero, resto y cantidadASumar
    	int numero;
    	int resto;
    	int cantidadASumar;
	//Inicia scanner
        Scanner scanner = new Scanner(System.in);
    //Imprimo un mensaje para que introduzca el número
        System.out.print("Ingresa un número entero: ");
    //Recogo el numero introducido en numero
        numero = scanner.nextInt();
    //Funcion para tener el resto
        resto = numero % 7;
    //Ternario que se recoge en la variable de cantidaASumar
        cantidadASumar = (resto != 0) ? 7 - resto : 0;

        System.out.println("Hay que sumarle " + cantidadASumar + " para que sea múltiplo de 7.");

	//Cierra escanner
        scanner.close();
    }
}