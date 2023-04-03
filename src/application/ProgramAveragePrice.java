package application;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramAveragePrice {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho completo do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double media = list.stream().map(p -> p.getPreco()).reduce(0.0, (x,y) -> x+y) / list.size();
            System.out.println("Preço médio: " + String.format("%.2f", media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> nomes = list.stream().filter(p -> p.getPreco() < media).map(p -> p.getNome())
                                                                                .sorted(comp.reversed())
                                                                                .collect(Collectors.toList());

            nomes.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
