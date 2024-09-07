package com.example.exerciciosvisualmix.exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicioCincoTest {

    @Test
    void trianguloDeveRetornarAreaCorretamente() {
        Triangle triangle = new Triangle(3, 4);

        assertEquals(6, triangle.getArea());
    }

    @Test
    void trianguloDeveRetornarPerimetroCorretamente() {
        Triangle triangle = new Triangle(3, 4);

        assertEquals(9, triangle.getPerimeter());
    }

    @Test
    void retanguloDeveRetornarAreaCorretamente() {
        Rectangle rectangle = new Rectangle(3, 4);

        assertEquals(12, rectangle.getArea());
    }

    @Test
    void retanguloDeveRetornarPerimetroCorretamente() {
        Rectangle rectangle = new Rectangle(3, 4);

        assertEquals(14, rectangle.getPerimeter());
    }

    @Test
    void quadradoDeveRetornarAreaCorretamente() {
        Square square = new Square(3);

        assertEquals(9, square.getArea());
    }

    @Test
    void quadradoDeveRetornarPerimetroCorretamente() {
        Square square = new Square(3);

        assertEquals(12, square.getPerimeter());
    }
}
