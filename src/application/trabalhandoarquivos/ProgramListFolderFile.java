package application.trabalhandoarquivos;

import java.io.File;
import java.util.Scanner;

public class ProgramListFolderFile {

    public static void main(String[] args) {

        // listagem de diretórios a partir de pastas

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pasta: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);

        File[] pastas = caminho.listFiles(File::isDirectory);

        System.out.println("PASTAS:");
        for(File pasta : pastas){
            System.out.println(pasta);
        }

        File[] arquivos = caminho.listFiles(File::isFile);

        System.out.println("ARQUIVOS:");
        for(File arquivo : arquivos){
            System.out.println(arquivo);
        }

        boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucesso);

        sc.close();
    }
}
