public class Ciclos {

    public static void main(String[] args) {

        // 0, 1, 2, 3, 4, 5
        /*for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.print(i);
            }else{
                System.out.print(i + ", ");
            }
        }*/


        // si el iterador es divisible entre 5 imprimir en su lugar "Buzz"
        // si el iterador es divisible entre 3 imprimir en su lugar "Fizz"
        // si el iterador es divisible entre 3 y 5 imprimir en su lugar "FizzBuzz"
        /*for (int i = 0; i < 25; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i + " FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println(i + " Buzz");
            }else if(i % 3 == 0){
                System.out.println(i + " Fizz");
            }else{
                System.out.println(i);
            }
        }*/

        // Suma de gauss: 1+2+3+4+5+6+7+9+...+n
        /*int suma = 0;
        for (int i = 1; i <= 35; i++) {
           suma = suma + i; 
        }
        System.out.println("La suma es: " + suma);
        */

        // sucecion de Fibonacci
        // 0 1 1 2 3 5 8 13
        /* 
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 6; i++) {
            int aux = a + b;
            a = b;
            b = aux;
            System.out.print(b + " ");
        }
        */
    }

}
