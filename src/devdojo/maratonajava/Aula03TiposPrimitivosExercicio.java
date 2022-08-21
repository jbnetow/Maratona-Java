package devdojo.maratonajava;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "José Neto", endereco = "Brasília-DF", dataSalario = "21/08/2022";
        double salario = 2000;

        System.out.println("Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataSalario);

        //Forma feita no vídeo
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataSalario;
        System.out.println(relatorio);
    }
}
