package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Siena";
        carro1.modelo = "Turismo";
        carro1.ano = 2010;

        carro2.nome = "Fusca";
        carro2.modelo = "Sport";
        carro2.ano = 1969;

        carro1 = carro2;//Referencia de objetos

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n"+carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }

}
