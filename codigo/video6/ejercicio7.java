import java.util.Scanner;

public class Ejercicio7 {
   public static void main(String[] args) {
	
	 final double PI=3.1416;
	 
	 // Leemos el radio en cm
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Introduzca el radio en cm ");
	 double radio = entrada.nextDouble();
	 
	 System.out.println("Introduzca la altura en cm ");
	 double altura = entrada.nextDouble();

   double volumen = altura * radio * radio * PI;
 	 
	 // Muestro el resultado
	 System.out.printf("El volumen es %7.2f \n",volumen);
	 }
}
