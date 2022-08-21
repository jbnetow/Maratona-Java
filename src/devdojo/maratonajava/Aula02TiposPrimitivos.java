package devdojo.maratonajava;

import java.sql.SQLOutput;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int idade = 20;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 20;
        short idadeShort = 10;
        boolean  verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        //String não é um tipo primitivo
        String nome = "José Neto";
        System.out.println("Oi meu nome é "+nome);

        //casting
        double num = 2000.0;
        float num2 = (float)2000.0D;
        int num3 = (int)10000000000L;
        long num4 = (long) 155.23;

        System.out.println("A idade é "+idade+" anos");
        System.out.println("Casting int "+num3);
        System.out.println("Casting float "+num2); // Aqui o valor coube dentro do float
        System.out.println("Casting long "+num4);
    }
}
