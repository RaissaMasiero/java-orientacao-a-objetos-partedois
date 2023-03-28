package application;

import model.entities.Product;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramCalculation {

    public static void main(String[] args) {

        /*Uma empresa de consultoria deseja avaliar a performance de produtos, funcionários, dentre outras coisas. Um
        dos cálculos que ela precisa é encontrar o maior dentre um conjunto de elementos. Fazer um programa que leia um
        conjunto de produtos a partir de um arquivo, conforme exemplo, e depois mostre o mais caro deles. */

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String caminho = "C:\\Users\\raiss\\OneDrive\\Documentos\\Curso Java Udemy\\Pratica\\fileDemo\\produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                list.add(new Product(campos[0], Double.parseDouble(campos[1])));
                linha = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Mais caro:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
