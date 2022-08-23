package devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];//Faz referencia para um Array de 2 posicoes
        arrayInt[1] = new int[]{1, 2, 3};//Faz referencia para um Array de 3 posicoes
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};//Faz referencia para um Array de 6 posicoes

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};//Inicar direto o array com os valores

        for (int[] arrayBase : arrayInt) {
            System.out.println("\n--------------------------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
