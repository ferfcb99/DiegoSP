package estructuras;

public class Matrices {
    public static void main(String[] args) {
        /*int[][] matriz = new int[3][3]; // [filas][columnas]
        
        matriz[0][0] = 3;
        matriz[0][1] = 2;
        matriz[0][2] = 7;
        matriz[1][0] = 1;
        matriz[1][1] = 5;
        matriz[1][2] = 4;
        matriz[2][0] = -9;
        matriz[2][1] = 0;
        matriz[2][2] = 99;
        */
        
        /*
        for (int fila = 0; fila < 2; fila++) { // 0 1
            for (int columna = 0; columna < 2; columna++) { // 0 1 - 0 1
                System.out.print( "[" + matriz[fila][columna] + "] ");
            }
            System.out.println("");
        }*/
        
        int[][] matriz = llenaMatriz(5, 8);
        imprimeMatriz(matriz, 5, 8);
    }
    
    public static int[][] llenaMatriz(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                // matriz[i][j] = Integer.parseInt(String.valueOf(Math.random() * 10));
            }
        }
        return matriz;
    }
    
    // matrices cuadrada -> para matrices de nxm
    /*public static void imprimeMatriz(int[][] matriz){
        System.out.println("Imprimiendo desde la funcion imprimeMatriz");
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz.length; columnas++) {
                System.out.print("[ " + matriz[filas][columnas] + "] ");
            }
            System.out.println("");
        }
    }*/
    
    public static void imprimeMatriz(int[][] matriz, int horizontal, int vertical){
        System.out.println("Imprimiendo desde la funcion imprimeMatriz");
        for (int filas = 0; filas < horizontal; filas++) {
            for (int columnas = 0; columnas < vertical; columnas++) {
                System.out.print("[ " + matriz[filas][columnas] + "] ");
            }
            System.out.println("");
        }
    }
    
}
