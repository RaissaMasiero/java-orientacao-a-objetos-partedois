package model.entities;

import model.services.Printer;
import model.services.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String numeroSerie) {
        super(numeroSerie);
    }

    @Override
    public void processaDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}
