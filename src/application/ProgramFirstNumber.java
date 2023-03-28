package application;

import model.services.PrintService;

import java.util.Scanner;

public class ProgramFirstNumber {

    public static void main(String[] args) {

        /*Fazer um programa que leia uma quantidade N, e depois N números inteiros. Ao final, imprima esses números de
        forma organizada conforme exemplo. Em seguida, informar qual foi o primeiro valor informado.
        Classes: PrintService*/

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantos valores: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String valor = sc.next();
            ps.addValor(valor);
        }

        ps.print();
        String p = ps.primeiro();
        System.out.println("Primeiro: " + p);

        sc.close();
    }
}
