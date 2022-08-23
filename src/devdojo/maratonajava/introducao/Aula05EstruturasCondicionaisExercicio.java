package devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salario = teclado.nextFloat();
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salario > 0 && salario <= 34712){
            valorImposto = salario * primeiraFaixa;
        }else if(salario >= 34713 && salario <= 68507){
            valorImposto = salario * segundaFaixa;
        }else{
            valorImposto = salario * terceiraFaixa;
        }
        System.out.println("Seu salario: "+salario);
        System.out.println("Valor do imposto "+valorImposto);
    }


}
