import java.util.Scanner;

public class Condicion2 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
    
       System.out.println("Ingrese la edad");
       int edad = entrada.nextInt();
	
       if (edad>17) {
           System.out.println("Usted es mayor de edad");
	     } else {
           System.out.println("Usted es menor de edad");
       }
	}
}
