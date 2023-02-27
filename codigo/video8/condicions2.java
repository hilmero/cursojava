import java.util.Scanner;

public class Condicions2 {
   public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.println("Ingrese el numero del mes");
	   int nmes = entrada.nextInt();
	   String sdias;
	   
	   switch (nmes) {
	      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		    sdias = "El mes seleccionado tiene 31 dias"; break;
		  case 2: 
		    sdias = "El mes tiene 28 dias"; break;		  
		  case 4: case 6: case 9: case 11:
		    sdias = "El mes tiene 30 dias"; break;
		  default:
   		  sdias = "Mes incorrecto"; break;
	   }
	   System.out.println(sdias);
	}
}
