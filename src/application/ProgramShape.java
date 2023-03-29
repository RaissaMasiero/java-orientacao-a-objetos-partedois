package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;

public class ProgramShape {

    public static void main(String[] args) {

        // soma das áreas de uma lista de figuras.

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list){
        double soma = 0.0;
        for(Shape s : list){
            soma += s.area();
        }
        return soma;
    }
}
