package application.trabalhandoarquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFile {

    public static void main(String[] args) {

        // Primeira demonstração da aula de Arquivos.

        // encapsula o processo de acessar o arquivo
        File file = new File("C:\\Users\\raiss\\OneDrive\\Documentos\\Curso Java Udemy\\Pratica\\" +
                                                                                                "fileDemo\\in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if(sc != null) {
                sc.close();
            }
        }
    }
}
