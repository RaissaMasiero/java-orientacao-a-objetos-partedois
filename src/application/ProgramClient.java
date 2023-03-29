package application;

import model.entities.Client;

public class ProgramClient {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // equals compara igualdade pelo conteúdo do objeto
        System.out.println(c1 == c2); // o == compara objetos pelas suas posições em memória
        System.out.println(s1 == s2); // nesse caso o compilador trata as literais.
    }
}
