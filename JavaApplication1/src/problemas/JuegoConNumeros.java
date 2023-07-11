
package problemas;

public class JuegoConNumeros {
    
    // int -127x10^9 - 128x10^10
    // long
    
    public static int multiplica(int a, int b){
        int resultado = a*b;
        return resultado; 
    }
    
    public static int formaUnos(int numero){
        int unos = 0;
                      // i = 3; 3>0; i--
        for(int i = numero; i > 0; i--){ // 3 2 1 0
            unos = unos * 10 + 1; // 0 = 0 * 10 + 1 = 1 ----- 1 = 1 * 10 + 1 = 11 ------ 11 = 11 * 10 + 1 = 111
        }
        return unos;
    }
    
    public static void imprimeFila(int numero){
        System.out.println("N = " + numero + " - " + formaUnos(numero) + " * " + formaUnos(numero) + " = " + multiplica(formaUnos(numero), formaUnos(numero)));
    }
    
    public static void imprimeFilas(int inicio, int fin){
        for (int i = inicio; i <= fin; i++) {
            imprimeFila(i);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(multiplica(8, 17));
        imprimeFilas(3, 5);   
    }
    
}
