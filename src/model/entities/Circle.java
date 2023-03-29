package model.entities;

import model.interfaces.Shape;

public class Circle implements Shape {

    private double raio;

    public Circle(double raio) {
        super();
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
