package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    	//Variable de longitud de metros
    	double longitudMetros;
    	//Variable de logitud en centimetros
    	int longitudCentimetros;
    	// Inicio escaner
        Scanner scanner = new Scanner(System.in);
        //Imprime el mensaje para recoger el dato de la longitud en metros
        System.out.print("Ingrese la longitud del lanzamiento en metros: ");
        //Escaneo el mensaje introducido en la varieble
        longitudMetros = scanner.nextDouble();

        // Duncion de longitudCentrimetros trata de convertir de metros a centímetros (1 metro = 100 centímetros)
        longitudCentimetros = (int) (longitudMetros * 100);
        // Imprime el mennsaje con la longitud en centimetros 
        System.out.println("La longitud en centímetros es: " + longitudCentimetros + " cm");

        // Cerrar escaner
        scanner.close();
    }
}
