package devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 / num2;// o resultado de uma operação entre dois números inteiros sempre será inteiro
        double num3 = 10;
        int num4 = 20;
        double divisao = num3 / num4;
        System.out.println(num2 + num1 + " Valor " + num2 + num1);
        System.out.println(resultado);
        System.out.println(divisao);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND) || (OR) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("IsDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000; //2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2;
        bonus %= 2;
        System.out.println("bonus "+bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        int contador2 = 0;
        System.out.println(contador2++); //Primeiro imprime e dps roda o ++
        System.out.println(++contador2); //Primeiro roda o ++ dps imprime
        System.out.println("Contador "+contador);


    }
}
