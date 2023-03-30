package application;

import model.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {

    public static void main(String[] args) {

        System.out.println("DEMONSTRAÇÃO DE MAP 1:");
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("usuario", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("celular", "999112233");

        cookies.remove("email");
        cookies.put("celular", "999221133");

        System.out.println("Existe chave 'celular': " + cookies.containsKey("celular"));
        System.out.println("Valor da chave celular: " + cookies.get("celular"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("Tamanho: " + cookies.size());

        System.out.println("TODOS OS COOKIES:");

        for(String chave : cookies.keySet()){
            System.out.println(chave + ": " + cookies.get(chave));
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("DEMONSTRAÇÃO DE MAP 2:");

        Map<Product, Double> estoque = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        estoque.put(p1, 10000.0);
        estoque.put(p2, 20000.0);
        estoque.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);

        System.out.println("Existe chave 'ps': " + estoque.containsKey(ps));
    }
}
