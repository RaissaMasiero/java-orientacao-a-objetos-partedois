package application.trabalhandoarquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileBufferedReader {

    public static void main(String[] args) {

        // demonstração de file reader e buffered reader

        String caminho = "C:\\Users\\raiss\\OneDrive\\Documentos\\Curso Java Udemy\\Pratica\\fileDemo\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){

            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}
