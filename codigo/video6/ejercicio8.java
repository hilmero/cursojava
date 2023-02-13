import java.util.Scanner;

public class Ejercicio8 {
   public static void main(String[] args) {
 
	 // Leemos los datos
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Introduzca el ancho del rectangulo en cm ");
	 double ancho = entrada.nextDouble();
	 
	 System.out.println("Introduzca la altura del rectangulo en cm ");
	 double altura = entrada.nextDouble();

   double perimetro = 2 * (altura + ancho);
 	 
	 // Muestro el resultado
	 System.out.printf("El perimetro es %7.2f cm \n",perimetro);
	 }
}
