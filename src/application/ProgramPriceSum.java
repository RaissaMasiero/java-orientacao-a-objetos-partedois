package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

import model.entities.Product;
import model.services.ProductService;

public class ProgramPriceSum {

    public static void main(String[] args) {

        /*Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos
        cujo nome começa com "T". */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        double soma = ps.somaFiltrada(list, p -> p.getPreco() < 100.0);

        System.out.println("Soma: " + String.format("%.2f", soma));
    }
}
