public class MisArreglos {
    public static void main(String args[]) {
//
//  1) Declaramos los arreglos (arrays)
//
    int[] numeros; // Se declara un array de enteros llamado "numeros"
    String[] nombres; // Se declara un array de cadenas llamado "nombres"
//
//  2) Asignamos memoria para su uso
//
    numeros = new int[5]; 
    nombres = new String[3]; 
//
//  Tambien podemos hacer la declaracion y asignacion en una misma linea
//
    int [] numeros_y = new int[5]; 
    String [] nombres_y = new String[3]; 
//
//  3) Luego vendria la inicializacion del arreglo
//
//  a) Inicializacion de forma individual
//
    numeros[0] = 10; 
    numeros[1] = 15; 
// 
    nombres[0] = "Juan";
    nombres[1] = "Pedro";
//
//  b) Inicializacion en la declaracion
//
    int[] numeros_y = {1, 2, 3, 4, 5};
    String[] nombres_y = {"Java", "Juan", "Rosa"};
//
//  c) Inicializacion usando estrcuturas de repeticion
//
    for (int i = 0; i < numeros.length; i++) {
       numeros[i] = i * 10; 
       }

    for (int i = 0; i < nombres.length; i++) {
       nombres[i] = "Nombre " + (i + 1); 
       }
//
    System.out.println("Terminado ");
    }
}
