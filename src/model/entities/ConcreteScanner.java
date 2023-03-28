package model.entities;

import model.interfaces.Scanner;

public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String numeroSerie) {
        super(numeroSerie);
    }

    @Override
    public void processaDoc(String doc) {
        System.out.println("Processando scanner: " + doc);
    }

    @Override
    public String scan() {
        return "Conteúdo scanneado!";
    }
}
