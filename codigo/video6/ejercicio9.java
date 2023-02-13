import java.util.Scanner;

public class Ejercicio9 {
   public static void main(String[] args) {

	 // Leemos los datos
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Introduzca la temperatura en grados Fahrenheit: ");
	 double fa = entrada.nextDouble();
	 
   double ce = (5.0/9.0) * (fa - 32);
 	 
	 // Muestro el resultado
	 System.out.printf("El resultado en grados Celsius es %7.2f  \n",ce);
	 }
}
