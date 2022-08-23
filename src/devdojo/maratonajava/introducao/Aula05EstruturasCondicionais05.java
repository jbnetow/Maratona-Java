package devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Imprima o dia da semana, considerando 1 como domingo
        System.out.println("Digite o numero do dia da semana, sendo 1 domingo");
        int diaSemana = teclado.nextInt();

        //char, int, byte, short, enum, String
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        char sexo = 'F';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }


    }
}
