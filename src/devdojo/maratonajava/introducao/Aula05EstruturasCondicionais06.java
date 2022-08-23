package devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //Considerando 1 como domingo
        //Utilizando switch

        System.out.println("Digite o numero do dia da semana, sendo 1 domingo");
        int diaSemana = teclado.nextInt();

        switch (diaSemana) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }


    }
}
