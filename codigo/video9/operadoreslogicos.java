import java.util.Scanner;

public class operadoreslogicos {
    /**
     * @param args
     */
    public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		/**  Leemos la edad de la persona   */
        System.out.println("Ingrese su edad:");
        int edad = entrada.nextInt();
		
		/**  Leemos el sexo de la persona   */
        System.out.println("Ingrese su sexo (H para hombre y M para mujer):");
        char sexo = entrada.next().charAt(0);        
		
		/** Vamos a mostrar el mensaje segun la edad y el sexo de la persona */
		
		if (edad<=15) {
			if (sexo=='H') System.out.println("Buenas niño");
			if (sexo=='M') System.out.println("Buenas niña");
		}
		if ((edad>=16) && (edad<=20)) {
			if (sexo=='H') System.out.println("Buenas estimado Joven");
			if (sexo=='M') System.out.println("Buenas estimada Joven");
		}
		if (edad>=21) {
			if (sexo=='H') System.out.println("Buenas Señor");
			if (sexo=='M') System.out.println("Buenas Señora");
		}
	}
}
