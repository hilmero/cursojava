import java.util.Scanner;

public class Condicions3 {
    public static void main(String[] args) {
	   Scanner entrada = new Scanner(System.in);
	   System.out.println("1. opcion A");
	   System.out.println("2. Opcion B");
	   System.out.println("3. Opcion C");	   
	   System.out.println("Ingrese el numero de la opcion");
	   int nopcion = entrada.nextInt();
	   
	   switch (nopcion) {
	     case 1: 
		       System.out.println("Usted selecciono la Opcion A");break;
		   case 2: 
		       System.out.println("Usted selecciono la Opcion B");break;
		   case 3:
		       System.out.println("Usted selecciono la Opcion C");break;
		   default:
		       System.out.println("Opcion incorrecta");break;
	   }
	}
}
