import java.util.Scanner;

public class Ejercicio3 {
   public static void main(String[] args) {
	
	 // Leo dos numeros reales x, y
	 Scanner entrada = new Scanner(System.in);
     
	 System.out.println("Introduzca x");
	 double x = entrada.nextDouble();
	 
	 System.out.println("Introduzca y");
	 double y = entrada.nextDouble();

   boolean mayor = (x>y);
	 
	 // Muestro el resultado
	 System.out.println("Es x mayor que y? "+mayor);
	 }
}
