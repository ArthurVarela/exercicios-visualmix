package com.example.exerciciosvisualmix.exercicios;

import java.util.Scanner;

// TODO: Método main não consegue ler frases, apenas palavras.
public class ExercicioUm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = scan.next();

        System.out.println(checkPalindromo(word));
    }

    public static Boolean checkPalindromo(String word) {

        String wordReversed = new StringBuilder(word).reverse().toString();

        // Criar um if e else para retornar true ou false pode ser considerado redundante.
        return word.equals(wordReversed);
    }
}
