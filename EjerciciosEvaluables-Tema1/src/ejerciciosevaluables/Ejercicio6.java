package ejerciciosevaluables;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		//Variable para las horas
		int horas;
		//Variable para los minutos
		int minutos;
		//Variable para los segundos
		int segundos;
		//Inicia escaner
		Scanner sc = new Scanner(System.in);
		//Mensaje para que introduzca el mensaje en segundo 
		System.out.println("Introduzca el tiempo en segundos: ");
		//Recogo la cantidad en segundos
		segundos =sc.nextInt();
		//Calcular la funcion de minutos
		minutos = segundos%3600/60;
		//Calcular la funcion de las horas
		horas = segundos/3600;
		//Calcular la funcion de los segundos
		segundos = horas%3600&60;
		//Resultado impreso
		System.out.println("La cantidad de horas es " + horas +" de minutos "+ minutos+ " y de segundos "+ segundos);
		
		//Cierra escaner
		sc.close();
		
	  }
	}
