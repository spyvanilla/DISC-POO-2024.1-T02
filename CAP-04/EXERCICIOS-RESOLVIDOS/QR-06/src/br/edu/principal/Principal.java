package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        scanner.close();

        int r = num % 2;
        if (r == 0) System.out.println("O número é par");
        else System.out.println("O número é ímpar");
    }
}