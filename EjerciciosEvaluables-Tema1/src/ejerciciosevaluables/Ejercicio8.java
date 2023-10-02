package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    	// Variable para recoger el dato los adultos
    	int numAdultos;
    	// Variable para recoger el dato los infantiles
    	int numInfantiles;
    	// Constante del precio de un adulto
    	final double PRECIO_ADULTO = 20;
    	//Constante del precio de un infantil
    	final double PRECIO_INFANTIL = 15.5;
    	
    	//Variable importe total
    	double importeTotal;
    	// Inicia escaner
        Scanner scanner = new Scanner(System.in);
        // Mensaje para introducir le numero de entradas adultos
        System.out.print("Ingrese el número de entradas para adultos: ");
        // Escaner para recoger el dato introducido en la variable en este caso numAdultos 
        numAdultos = scanner.nextInt();
        // Mensaje para introducir el numero de entradas infantiles
        System.out.print("Ingrese el número de entradas infantiles: ");
        // Escaner para recoger el dato introducido en la variable en este caso numInfantiles
        numInfantiles = scanner.nextInt();

        // Calcular el importe total
        importeTotal = (numAdultos * PRECIO_ADULTO) + (numInfantiles * PRECIO_INFANTIL);

        // Aplicar descuento del 5% si el importe total es igual o superior a 100€ usando operador ternario
        importeTotal = (importeTotal >= 100.0) ? importeTotal * 0.95 : importeTotal;
        // Imprime el timporte total
        System.out.println("El importe total a cobrar es: " + importeTotal + "€");
        // Cierra escaner
        scanner.close();
    }
}