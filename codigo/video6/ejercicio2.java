import java.util.Scanner;

public class Ejercicio2 {
   public static void main(String[] args) {
	
	 // Leo los numeros enteros
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Introduzca i");
	 int i = entrada.nextInt();
	 
	 System.out.println("Introduzca j");
	 int j = entrada.nextInt();

	 System.out.printf("i = %d  j = %d \n",i,j);

   int t=i; i=j; j=t;
 
	 // Muestro el resultado
	 System.out.printf("i = %d  j = %d \n",i,j);
	 }
}
