import java.util.Scanner;

public class Entradadatos {
    public static void main(String[] args) {

    // Entrada de datos con java	
	  Scanner entrada = new Scanner(System.in);
	  // Leyendo el nomnbre
	  System.out.println("Por favor, escriba su nombre");
	  
	  String nombre = entrada.nextLine();
	  // Leyendo la Edad
	  System.out.println("Ingreso su Edad");
	  
	  int edad = entrada.nextInt();
	  
	  // Mostrando los datos leidos 
    System.out.println("Bienvenido "+nombre);
    System.out.println("Usted debio nacer en el año "+(2023-edad));
    }
}	
