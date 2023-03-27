package model.entities;

import model.services.Printer;

public class ConcretePrinter extends Device implements Printer {

    public ConcretePrinter(String numeroSerie) {
        super(numeroSerie);
    }

    @Override
    public void processaDoc(String doc) {
        System.out.println("Processando printer: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
