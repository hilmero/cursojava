public class ArreglodeClases2 {
    public static void main(String args[]) {
    class Estudiante {
        String nombre;      // Atributos de la clase Estudiante
        int edad;
        
        Estudiante(String nombre, int edad) {    // Metodo Contructor de la clase
            this.nombre = nombre;
            this.edad = edad;
        }
    }
    // Inicializo el arreglo de clases u objetos
    //
    Estudiante[] estudiantes = new Estudiante[3];
    estudiantes[0] = new Estudiante("Juan", 20);
    estudiantes[1] = new Estudiante("Ana", 22);
    estudiantes[2] = new Estudiante("Luis", 19);
    //
    // Muestro los datos
    //
    for (int i = 0; i < estudiantes.length; i++) {
        System.out.print(i+": ");
        System.out.println(estudiantes[i].nombre);
        System.out.println(estudiantes[i].edad);        
        }
    }
}
