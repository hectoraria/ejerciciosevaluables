package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    	//Defino variable del numero 1 y 2
    	int numero1 ;
    	int numero2 ;
    	//Defino un boleano
    	boolean sonIguales ;
    	// Inicia escaner
        Scanner scanner = new Scanner(System.in);
        //Imprime el mensaje para que ingrese el numero 2
        System.out.print("Ingrese el primer número: ");
        //Recoge el mensaje en la variable numero1 
        numero1 = scanner.nextInt();
        //Imprime el mensaje para que ingrese el numero 2
        System.out.print("Ingrese el segundo número: ");
        //Recoge el mensaje en la variable numero1
        numero2 = scanner.nextInt();
        //Definicion de la funcion de sonInguales
        sonIguales = (numero1 == numero2);
        //Imptrime si los numeros son iguales lo indicara con true y false
        System.out.println("¿Los números son iguales? " + sonIguales);
        // Cierra escaner
        scanner.close();
    }
}