import java.util.Scanner;

public class Ejercicio10 {
   public static void main(String[] args) {

 	 // Leemos los datos
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Introduzca la base del triangulo (cm): ");
	 double b = entrada.nextDouble();
	 
	 System.out.println("Introduzca la altura del triangulo (cm): ");
	 double h = entrada.nextDouble();

   double a = (b * h) / 2;
 	 
	 // Muestro el resultado
	 System.out.printf("El area del triangulo es %7.2f \n",a);
   }
}
