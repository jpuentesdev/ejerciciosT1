package ejerciciosT1;
import java.util.Scanner;

public class MinimoBilletes {

		public static void main(String[] args) {
			
			Scanner mysc = new Scanner(System.in);  
		    System.out.println("Introduce una cantidad de euros: ");
		    int euros = mysc.nextInt();  
			
			while (euros >4) {
				if (euros - 500 >= 0) {
					euros -=500;
					System.out.println("1 billete de 500.");
				}else if(euros - 200 >= 0){
					euros -=200;
					System.out.println("1 billete de 200.");
				}else if(euros - 100 >= 0){
					euros -=100;
					System.out.println("1 billete de 100.");
				}else if(euros - 50 >= 0){
					euros -=50;
					System.out.println("1 billete de 50.");
				}else if(euros - 20 >= 0){
					euros -=20;
					System.out.println("1 billete de 20.");
				}else if(euros - 10 >= 0){
					euros -=10;
					System.out.println("1 billete de 10.");
				}else {
					euros -=5;
					System.out.println("1 billete de 5.");
				}
				
			        if(euros > 1){
					System.out.println("Sobran " +euros +" euros.");
				}else if(euros ==1){
					System.out.println("Sobra " +euros +" euro.");
				}else {
					System.out.println("No sobra dinero.");
				}
			mysc.close();
			}
			
}
