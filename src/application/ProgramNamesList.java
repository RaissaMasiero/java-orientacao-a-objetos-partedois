package application;

import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramNamesList {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String caminho = "C:\\Users\\raiss\\OneDrive\\Documentos\\Curso Java Udemy\\Pratica\\fileDemo\\nomes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] campos = employeeCsv.split(",");
                list.add(new Employee(campos[0], Double.parseDouble(campos[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee e : list) {
                System.out.println(e.getNome() + ", " + e.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}