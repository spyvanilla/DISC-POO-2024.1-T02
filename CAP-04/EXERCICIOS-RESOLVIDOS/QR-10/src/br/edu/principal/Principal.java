package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data");
        System.out.println("dia (dd): ");
        int d1 = scanner.nextInt();

        System.out.println("mês (mm): ");
        int m1 = scanner.nextInt();

        System.out.println("ano (aaaa): ");
        int a1 = scanner.nextInt();

        System.out.println("Digite a segunda data");
        System.out.println("dia (dd): ");
        int d2 = scanner.nextInt();

        System.out.println("mês (mm): ");
        int m2 = scanner.nextInt();

        System.out.println("ano (aaaa): ");
        int a2 = scanner.nextInt();

        scanner.close();

        if (a1 > a2) System.out.println("A maior data é " + d1 + "-" + m1 + "-" + a1);
        else if (a1 < a2) System.out.println("A maior data é " + d2 + "-" + m2 + "-" + a2);
        else {
            if (m1 > m2) System.out.println("A maior data é " + d1 + "-" + m1 + "-" + a1);
            else if (m1 < m2) System.out.println("A maior data é " + d2 + "-" + m2 + "-" + a2);
            else {
                if (d1 > d2) System.out.println("A maior data é " + d1 + "-" + m1 + "-" + a1);
                else if (d1 < d2) System.out.println("A maior data é " + d2 + "-" + m2 + "-" + a2);
                else System.out.println("As datas são iguais !");
            }
        }
    }
}