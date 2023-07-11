public class Arreglos {

    public static void main(String[] args) {

        int[] numeros = new int[3];
        numeros[0] = -2;
        numeros[1] = 3;
        numeros[2] = 1;
        for(int i=0; i<3;i++){
            System.out.println(numeros[i]);
        }
        sumaArreglo(numeros);
    }

    public static void sumaArreglo(int[] numeros){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++){
            suma = suma + numeros[i];
        }
        System.out.println("La suma es: " + suma); 
    }


}
