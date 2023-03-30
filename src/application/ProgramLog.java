package application;

import model.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class ProgramLog {

    public static void main(String[] args) {

        /*Um site de internet registra um log de acessos dos usuários. Um registro de log consiste no nome de usuário
        (apenas uma palavra) e o instante em que o usuário acessou o site no padrão ISO 8601, separados por espaço,
        conforme exemplo. Fazer um programa que leia o log de acessos a partir de um arquivo, e daí informe quantos
        usuários distintos acessaram o site.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Caminho completo do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            Set<LogEntry> set = new HashSet<>();
            String linha = br.readLine();

            while (linha != null) {

                String[] campos = linha.split(" ");
                String usuario = campos[0];
                Date instante = Date.from(Instant.parse(campos[1]));

                set.add(new LogEntry(usuario, instante));

                linha = br.readLine();
            }

            System.out.println("Total de usuários: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
