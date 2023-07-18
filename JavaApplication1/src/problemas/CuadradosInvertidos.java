package problemas;
public class CuadradosInvertidos {

    public static int cuadrado(int numero){
        return numero * numero;
    }
    
    // hacer una funcion que cuente los digitos de un numero solo con operaciones aritmeticas
        
    public static int invierte(int numero){ // 1525
        // "1525".length -> 4 - 1 = 3
        int potencia = String.valueOf(numero).length() - 1;
        int numeroInvertido = 0;
        
        while(numero != 0){ // 1525 152 15 1
            numeroInvertido = numeroInvertido + (int)((numero % 10) * (Math.pow(10, potencia)) ); // 5 * 10^3 = 5000 + 2 * 10^2 = 200 + 5 * 10^1 = 50 + 1 * 10^0 = 1
            numero = numero / 10;
            potencia = potencia - 1;
        }
        return numeroInvertido;
    }
    
    public static boolean esCuadradoInvertido(int numero){
        /*if(cuadrado(numero) == invierte(cuadrado(invierte(numero)))){
            return true;
        }
        return false;*/
        return cuadrado(numero) == invierte(cuadrado(invierte(numero)));
    }
    
    public static void muestraInvertido(int numero){
        System.out.println(numero + "^2 = " + cuadrado(numero) + " -> " + invierte(numero) + "^2 = " + cuadrado(invierte(numero)));
    }
    
    public static void muestraInvertidos(int inicio, int fin){
        for (int i = inicio; i <= fin; i++) {
            if(esCuadradoInvertido(i) && i < invierte(i)){
                muestraInvertido(i);
            }
        }
    }
    
    public static void main(String[] args) {
        muestraInvertidos(1, 500000);
    }
}
