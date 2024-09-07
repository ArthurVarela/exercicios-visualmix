package com.example.exerciciosvisualmix.exercicios;


import java.util.ArrayList;
import java.util.List;

// Ficou muito bom, certinho!!
interface Shape {
    double getArea();

    double getPerimeter();
}

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * base;
    }
}

class Rectangle implements Shape {
    private double base;
    private double height;

    Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + height);
    }
}

class Square implements Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }
}

public class ExercicioCinco {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(4));
        shapes.add(new Rectangle(10, 6));
        shapes.add(new Rectangle(18, 10));
        shapes.add(new Square(10));
        shapes.add(new Triangle(10, 10));
        shapes.add(new Triangle(6, 6));
        shapes.add(new Triangle(4, 4));

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.size(); i++) {
            Shape item = shapes.get(i);
            totalArea = totalArea + item.getArea();
            totalPerimeter = totalPerimeter + item.getPerimeter();
        }

        System.out.printf(
                "A soma total da area da lista de formas e de: " + totalArea + "\n" +
                        "A soma total dos Perimetros da lista de formas e de: " + totalPerimeter
        );
    }
}
