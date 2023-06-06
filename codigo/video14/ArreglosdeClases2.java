public class ArreglosdeClases2 {

    public String nombre;
    public int edad;
        
    public ArreglosdeClases2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public static void main(String args[]) {
       
    // Inicializo el arreglo de objetos

    ArreglosdeClases2[] estudiantes = new ArreglosdeClases2[3];
    estudiantes[0] = new ArreglosdeClases2("Juan", 20);
    estudiantes[1] = new ArreglosdeClases2("Ana", 22);
    estudiantes[2] = new ArreglosdeClases2("Luis", 19);

    for (int i = 0; i < estudiantes.length; i++) {
        System.out.print(i+": ");
        System.out.println(estudiantes[i].nombre);
        System.out.println(estudiantes[i].edad);        
        }
    }
}
