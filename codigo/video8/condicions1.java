import java.util.Scanner;

public class Condicions1 {
    public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.println("Ingrese el numero del mes");
	   int nmes = entrada.nextInt();
	   String smes;
	   
	   switch (nmes) {
	      case 1: smes = "Enero"; break;
	      case 2: smes = "Febrero"; break;		  
	      case 3: smes = "Marzo"; break;
		    case 4: smes = "Abril"; break;
		    case 5: smes = "Mayo"; break;
		    case 6: smes = "Junio"; break;
		    case 7: smes = "Julio"; break;		  
		    case 8: smes = "Agosto"; break;
		    case 9: smes = "Septiembre"; break;
		    case 10: smes = "Octubre"; break;		  
		    case 11: smes = "Noviembre"; break;
		    case 12: smes = "Diciembre"; break;	  
		    default: smes = "Mes incorrecto";
	   }
	   System.out.println("El mes corresponde a "+smes);
	}
}
