package model.entities;

import model.interfaces.Printer;
import model.interfaces.Scanner;

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
