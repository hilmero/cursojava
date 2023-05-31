public class Ejemploenum {
//Declaración de una enumeración de los días de la semana
enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

//Declaración de una enumeración de niveles
enum Nivel {ALTO, MEDIO, BAJO};

//Declaración de una enumeración de direcciones
enum Direccion {NORTE, SUR, ESTE, OESTE};

    public static void main(String args[]) {

      Nivel posicion = Nivel.MEDIO;
      
      if (posicion == Nivel.ALTO) System.out.println("El nivel es ALTO");
      if (posicion == Nivel.MEDIO) System.out.println("El nivel es MEDIO");
      if (posicion == Nivel.BAJO) System.out.println("El nivel es BAJO");
      
      // Propiedades de la clase enum
      
      System.out.println(posicion.name());
      System.out.println(posicion.toString());      
      System.out.println(posicion.ordinal());
	  
	  // Como es una clase compuesta de elementos, puedo recorrerlo en un ciclo

      for(Nivel d: Nivel.values()){
	     System.out.println(d.toString()+" - ");
      }
    }
}
