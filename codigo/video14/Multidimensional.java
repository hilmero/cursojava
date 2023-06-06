public class Multidimensional {
    public static void main(String args[]) {    
        int[][] matriz = new int[3][4]; 

// Inicialización de la matriz con valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][2] = 5;
        matriz[2][3] = 6;        

// Visualización de la matriz con ciclos
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i+": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
