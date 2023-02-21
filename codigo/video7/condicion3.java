import java.util.Scanner;

public class Condicion3 {
   public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
    
     System.out.println("Ingrese la edad");
     int edad = entrada.nextInt();
	   String Sedad;
	   
       if (edad>=60) {
           Sedad="Tercera Edad";
	   } else if (edad>=18){
           Sedad="Adulto";
	   } else {
		   Sedad="Joven";
	   }
	   
	   System.out.println("Usted es "+Sedad);
	}
}
