package devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor. Por exemplo 50
        int valor = 50;
        for(int i = 0; i <= 50; i++){
            if(i > 25){
                break;//Esse break so funciona dentro de um switch ou loop
            }
            System.out.println("i = "+i);
        }

    }
}
