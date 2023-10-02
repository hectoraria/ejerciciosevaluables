package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
    	//Defino varible del num1 donde se recoge el primer numero introducido
    	int num1;
    	//Defino variable del segundo numero donde sera el referente multiplo del num1
    	int num2;
    	//Defino variable para poder sacar el resto 
    	int resto;
    	//Defino variable para poder sumarselo para que sea multiplo
    	int cantidadASumar;
    	
    	//Inicia escaner
        Scanner scanner = new Scanner(System.in);
        //Mensaje para introducir el primer numero
        System.out.print("Ingresa el primer número entero : ");
        //Recoge el numero en introducido en la variable num1
        num1 = scanner.nextInt();
        //Mensaje para introducir el segundo numero
        System.out.print("Ingresa el segundo número entero : ");
        //Recoge el numero en introducido en la variable num2
        num2 = scanner.nextInt();
        //Defino la funcion de la variable resto
        resto = num1 % num2;
        //Ternario para poder saber cuanto hay que sumarle al num1 para ser multiplo del num2, o ya es multiplo 
        cantidadASumar = (resto != 0) ? num2 - resto : 0;
        //Imprime el resultado de la activad es decir si es multiplo o no y si no cuanto hay que sumarle
        System.out.println("Hay que sumarle " + cantidadASumar + " a " + num1 + " para que sea múltiplo de " + num2 + ".");
	
	//Cerrar escaner
        scanner.close();
    }
}
