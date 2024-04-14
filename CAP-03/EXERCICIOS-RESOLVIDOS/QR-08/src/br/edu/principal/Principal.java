package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1- Somar dois números");
        System.out.println("2- Raíz quadrada de um número");
        System.out.println("Digite sua opção: ");
        int op = scanner.nextInt();

        if (op == 1) {
            System.out.println("Digite um valor para o primeiro número:");
            double num1 = scanner.nextInt();

            System.out.println("Digite um valor para o segundo número:");
            double num2 = scanner.nextInt();

            double soma = num1 + num2;
            System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        }

        if (op == 2) {
            System.out.println("Digite um valor: ");
            double num1 = scanner.nextInt();

            double raiz = Math.sqrt(num1);
            System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
        }

        if (op != 1 && op != 2) {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
