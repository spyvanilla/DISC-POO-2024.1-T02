package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double imposto = 0;
        int grat = 0;

        Scanner scanner = new Scanner(System.in);
        double sal_base = scanner.nextDouble();
        double tempo = scanner.nextDouble();
        scanner.close();

        if (sal_base < 200) imposto = 0;
        else if (sal_base <= 450) imposto = 3 / 100 * sal_base;
        else if (sal_base < 700) imposto = 8 / 100 * sal_base;
        else imposto = 12 / 100 * sal_base;
        System.out.println(imposto);

        if (sal_base > 500) {
            if (tempo <= 3) grat = 20;
            else grat = 30;
        }

        else {
            if (tempo <= 3) grat = 23;
            else if (tempo < 6) grat = 35;
            else grat = 33;
        }
        System.out.println(grat);

        double sal_liq = sal_base - imposto + grat;
        System.out.println(sal_liq);

        if (sal_liq <= 350) System.out.println("Classificação A");
        else if (sal_liq < 600) System.out.println("Classificação B");
        else System.out.println("Classificação C");
    }
}
