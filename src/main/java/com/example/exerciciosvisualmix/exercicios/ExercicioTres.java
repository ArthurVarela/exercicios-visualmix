package com.example.exerciciosvisualmix.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioTres {

    public static double salary;
    public static double reajustmentPercentage;

    public static void main(String[] args) {

        readSalaryAndReajustment();

        // Do jeito que a classe está, não é possível testar o método de calcular o salário.
        // O método abaixo calcula o novo salário, e também formata ele.
        // TODO: Seria necessário refatorar o método para que ele:
        // - Receba os valores como parâmetros;
        // - Retorne o valor calculado;
        // - Não imprima nada.
        // Então outro método para imprimir o valor formatado seria criado.
        showNewSalary();
    }

    private static void showNewSalary() {

        DecimalFormat myDecimalFormatter = new DecimalFormat("0.00");

        double newSalary = salary + (salary * (reajustmentPercentage / 100));
        String newSalaryFormated = myDecimalFormatter.format(newSalary);

        System.out.println(newSalaryFormated);
    }

    private static void readSalaryAndReajustment() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salario: ");
        salary = scan.nextDouble();

        System.out.println("Digite o percentual de Reajuste: ");
        reajustmentPercentage = scan.nextDouble();

    }
}
