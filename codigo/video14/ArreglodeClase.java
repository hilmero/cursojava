public class ArreglodeClase {
    public static void main(String args[]) {
//
//      Arreglos de tipo de clases
//
        String[] nombres = new String[4]; // Array de objetos de la clase String
        nombres[0] = "Alice";
        nombres[1] = "Bob";
        nombres[2] = "Carol";
        nombres[3] = "David";
        
        for (int x=0; x < nombres.length; x++) {
          System.out.println("Elemento "+x+" es: "+nombres[x]);
        }
    }
}
