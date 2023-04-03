package application;

import model.entities.Product;
import util.UpperCaseName;

import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProgramFunction {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // função map: aplica uma função a cada elemento da stream, gerando uma nova stream com os elementoos transformados.
        List<String> nomes = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        nomes.forEach(System.out::println);
    }
}
