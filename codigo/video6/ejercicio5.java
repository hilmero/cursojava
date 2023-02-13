import java.util.Scanner;

public class Ejercicio5 {
   public static void main(String[] args) {
	
	 // Leemos el numero de semanas
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Introduzca el numero de semanas");
	 double semanas = entrada.nextDouble();
	 
   double meses = semanas / 4;
 	 
	 // Muestro el resultado
	 System.out.printf("El numero de meses es %6.2f \n",meses);
	 }
}
