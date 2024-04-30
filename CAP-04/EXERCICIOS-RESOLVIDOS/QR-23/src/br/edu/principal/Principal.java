package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double coeficiente = 0;
        double imposto = 0;
        int grat = 0;
        double auxilio = 0;

        Scanner scanner = new Scanner(System.in);
        double sal_min = scanner.nextDouble();
        String turno = scanner.nextLine();
        String categoria = scanner.nextLine();
        double nht = scanner.nextDouble();
        scanner.close();

        if (turno == "M") coeficiente = 10 / 100 * sal_min;
        if (turno == "V") coeficiente = 15 / 100 * sal_min;
        if (turno == "N") coeficiente = 12 / 100 * sal_min;
        System.out.println(coeficiente);
        
        double sal_bruto = nht * coeficiente;
        System.out.println(sal_bruto);

        if (categoria == "O") {
            if (sal_bruto >= 300) imposto = 5 / 100 * sal_bruto;
            else imposto = 3 / 100 * sal_bruto;
        }
        else {
            if (sal_bruto >= 400) imposto = 6 / 100 * sal_bruto;
            else imposto = 4 / 100 * sal_bruto;
        }
        System.out.println(imposto);

        if (turno == "N" && nht > 80) grat = 50;
        else grat = 30;
        System.out.println(grat);

        if (categoria == "O" || coeficiente <= 25) auxilio = 1 / 3 * sal_bruto;
        else auxilio = 1 / 2 * sal_bruto;
        System.out.println(auxilio);

        double sal_liq = sal_bruto - imposto + grat + auxilio;
        System.out.println(sal_liq);

        if (sal_liq < 350) System.out.println("Mal Remunerado");
        if (sal_liq >= 350 && sal_liq <= 600) System.out.println("Normal");
        if (sal_liq > 600) System.out.println("Bem Remunerado");
    }
}