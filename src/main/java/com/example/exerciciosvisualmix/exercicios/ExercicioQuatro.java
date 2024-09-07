package com.example.exerciciosvisualmix.exercicios;

import java.util.Scanner;

// TODO: Refatorar lógica para que seja possível testar.
// Está tudo no método main.
// O método main não deve conter lógica, apenas chamar outros métodos.
// Pode-se criar um método para comparar os números, e esse poderia ser testado.
public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo numero numero");
        int n2 = scan.nextInt();

        if (n1 == n2) {
            System.out.println("Números iguais");
        } else if (n1 > n2) {
            System.out.printf("Primeiro é maior");
        } else {
            System.out.printf("Segundo Maior");
        }

    }
}
