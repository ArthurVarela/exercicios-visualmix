package com.example.exerciciosvisualmix.exercicios;

public class ExercicioDois {

    public static void main(String[] args) {

        showMultiplicationTable();

    }

    private static void showMultiplicationTable() {

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int result = i * j;
                System.out.println(i + "x" + j + "=" + result);
            }
        }

    }
}
