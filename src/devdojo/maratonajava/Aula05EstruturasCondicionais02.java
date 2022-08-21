package devdojo.maratonajava;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        if(idade < 15){
            System.out.println("Categoria infantil");
        }else if(idade >= 15 && idade < 18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }

        //Forma mais clean
        /*
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
        String categoria;

        if(idade < 15){
            categoria = "Categoria infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
         */
    }
}
