import java.util.Scanner;

public class Ejercicio4 {
   public static void main(String[] args) {
   final double PI=3.1416;	
	
   // Leemos el radio de la circuferencia
   Scanner entrada = new Scanner(System.in);
   System.out.println("Introduzca el radio (cm)");
   double r = entrada.nextDouble();
	 
   double area = PI * r * r;
 	 
   // Muestro el resultado
   System.out.printf("El area es %6.2f cm ",area);
   }
}
