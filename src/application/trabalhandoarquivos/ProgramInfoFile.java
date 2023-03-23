package application.trabalhandoarquivos;

import java.io.File;
import java.util.Scanner;

public class ProgramInfoFile {

    public static void main(String[] args) {

        // conseguindo informações de um arquivo

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho de um arquivo: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);

        // nome do arquivo
        System.out.println("getName: " + caminho.getName());
        // caminho do arquivo
        System.out.println("getParent: " + caminho.getParent());
        // todo o caminho
        System.out.println("getPath: " + caminho.getPath());

        sc.close();
    }
}
