package ejerciciosT1;

import java.util.Scanner;

public class VariableTiempo {

	public static void main(String[] args) {
		
		Scanner mysc = new Scanner(System.in);  
	    System.out.println("Introduce una cantidad de segundos: ");
	    int t = mysc.nextInt(); 
		double tiempo = t;
		
		System.out.println("El tiempo expresado en horas seria: "+ tiempo/3600 +" h");
		System.out.println("El tiempo expresado en minutos seria: "+ tiempo/60 +" min");
		System.out.println("El tiempo expresado en segundos seria: "+ t +" s");
		
		mysc.close();
		}
}
