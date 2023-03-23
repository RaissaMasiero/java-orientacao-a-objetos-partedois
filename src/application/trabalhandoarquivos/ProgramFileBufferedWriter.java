package application.trabalhandoarquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileBufferedWriter {

    public static void main(String[] args) {

        // criando/recriando um arquivo e escrevendo informações nele. Para não recriar o arquivo, acrescentamos
        // o true ao instanciar.

        String[] linhas = new String[] { "Bom dia", "Boa tarde", "Boa noite" };
        String caminho = "C:\\Users\\raiss\\OneDrive\\Documentos\\Curso Java Udemy\\Pratica\\fileDemo\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
            for(String linha : linhas){
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
