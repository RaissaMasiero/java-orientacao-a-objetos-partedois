package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramEmployee {

    public static void main(String[] args) {

        /*Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato .csv.
        Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor
        fornecido pelo usuário. Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Caminho completo do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();

            while (linha != null) {
                String[] campos = linha.split(",");
                list.add(new Employee(campos[0], campos[1], Double.parseDouble(campos[2])));
                linha = br.readLine();
            }

            System.out.print("Digite o salário: ");
            double salario = sc.nextDouble();

            Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

            List<String> email = list.stream().filter(e -> e.getSalario() > salario)
                                                                    .map(e -> e.getEmail())
                                                                    .sorted(comp)
                                                                    .collect(Collectors.toList());

            System.out.println("Email das pessoas cujo salário é maior que " + String.format("%.2f", salario)+ ": ");
            email.forEach(System.out::println);

            List<Double> nomesComM = list.stream().filter(x -> x.getNome().charAt(0) == 'M')
                                              .map(x -> x.getSalario())
                                              .collect(Collectors.toList());

            double soma = nomesComM.stream().reduce(0.0, (x,y) -> x+y);
            System.out.println("Soma de salário das pessoas cujo nome começa com 'M': " + String.format("%.2f", soma));

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
