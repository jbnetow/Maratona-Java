package devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        boolean isAutorizadoComprarBebida = idade >= 18;

        // !
        if(isAutorizadoComprarBebida){
            System.out.println("Pode comprar bebida");
        }else{
            System.out.println("Nao autorizado a comprar bebida");
        }
        /*
        if(!isAutorizadoComprarBebida){
            System.out.println("Nao autorizado a comprar bebida");
        }
         */


    }
}
