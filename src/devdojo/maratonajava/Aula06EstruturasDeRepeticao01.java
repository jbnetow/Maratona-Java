package devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args){
        //while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(++count);//dentro do sout para contar de 1 a 10, em vez de 0 a 9
        }

        count = 0;
        do{
            System.out.println("Dentro do do while "+ ++count);
        }while(count < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("Dentro do for "+i);
        }


    }
}
