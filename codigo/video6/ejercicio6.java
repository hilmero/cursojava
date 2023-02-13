import java.util.Scanner;

public class Ejercicio6 {
   public static void main(String[] args) {
	
	 // Leemos los kms
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Introduzca los Km a convertir ");
	 double km = entrada.nextDouble();
	 
   double metros = km * 1000;
 	 
	 // Muestro el resultado
	 System.out.printf("El numero de metros es %7.2f \n",metros);
	 }
}
