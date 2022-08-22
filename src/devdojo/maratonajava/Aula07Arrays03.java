package devdojo.maratonajava;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[]{1,2,3,4,5};

        /*
        for(int i = 0; i < numeros3.length; i++){
            System.out.println(numeros3[i]);
        }
         */

        for(int j : numeros3){ //Printa todo o array, nao da para acessar um indice especifico
            System.out.println(j);
        }
    }
}
