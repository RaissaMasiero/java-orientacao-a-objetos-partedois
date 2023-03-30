package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramElection {

    public static void main(String[] args) {

        /*Na contagem de votos de uma eleição, são gerados vários registros de votação contendo o nome do candidato e
        a quantidade de votos (formato .csv) que ele obteve em uma urna de votação. Você deve fazer um programa para ler
        os registros de votação a partir de um arquivo, e daí gerar um relatório consolidado com os totais de
        cada candidato.*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho completo do arquivo: ");
        String caminho = sc.nextLine();
        Map<String, Integer> votos = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();
            while (linha != null) {
                 String[] campos = linha.split(",");
                 String nome = campos[0];
                 int numeroVotos = Integer.parseInt(campos[1]);

                 if(votos.containsKey(nome)){
                     int contaVotos = votos.get(nome);
                     votos.put(nome, numeroVotos + contaVotos);

                 }else{
                     votos.put(nome, numeroVotos);
                 }

                 linha = br.readLine();
            }

            for (String chave : votos.keySet()) {
                System.out.println(chave + ": " + votos.get(chave));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
