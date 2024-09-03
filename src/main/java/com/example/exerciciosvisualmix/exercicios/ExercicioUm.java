package com.example.exerciciosvisualmix.exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = scan.next();

        System.out.println(checkPalindromo(word));
    }

    public static Boolean checkPalindromo(String word) {

        String wordReversed = new StringBuilder(word).reverse().toString();

        if (word.equals(wordReversed)) {
            return true;
        } else {
            return false;
        }
    }
}
