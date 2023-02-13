import java.util.Scanner;

public class Ejercicio1 {
   public static void main(String[] args) {
	
	 // Leo los numeros reales
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Introduzca el primer numero");
	 double num1 = entrada.nextDouble();
	 
	 System.out.println("Introduzca el segundo numero");
	 double num2 = entrada.nextDouble();

	 System.out.println("Introduzca el tercer numero");
	 double num3 = entrada.nextDouble();

   double suma=num1+num2+num3;
	 double promedio=suma/3;
	 
	 // Muestro el resultado
	 System.out.println("El promedio de los numeros es "+promedio);
	 }
}
