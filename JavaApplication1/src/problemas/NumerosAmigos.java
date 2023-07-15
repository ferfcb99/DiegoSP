package problemas;

public class NumerosAmigos {
    
    public static int sumaDivisores(int numero){
        int suma = 0;
        int divisor = 1;
        while(divisor < numero){
            if(numero % divisor == 0){
                suma = suma + divisor;
            }
            divisor = divisor + 1;
        }
        return suma;
    }
    
    public static boolean esAmigo(int numero){ // 220
          //                              220         ==    220
        /*if(sumaDivisores(sumaDivisores(numero)) == numero){
            return true;
        }
        return false;*/
        return sumaDivisores(sumaDivisores(numero)) == numero && numero < sumaDivisores(numero);
    } 
    
    public static void muestraAmigo(int numero){
        System.out.println(numero + " -> " + sumaDivisores(numero));
    }
    
    public static void muestraAmigos(int inicio, int fin){
        for (int i = inicio; i <= fin; i++) { // 1 220
            if(esAmigo(i) == true){ // false true
                muestraAmigo(i); // 220 -> 284
            }
        }
    }
    
    public static void main(String[] args) {
        muestraAmigos(1, 100000);
    }
}
