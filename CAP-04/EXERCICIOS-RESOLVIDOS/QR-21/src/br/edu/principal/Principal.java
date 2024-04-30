package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double pre_carga = 0;
        double imposto = 0;

        Scanner scanner = new Scanner(System.in);
        int cod_est = scanner.nextInt();
        double peso_toneladas = scanner.nextDouble();
        int cod_carga = scanner.nextInt();
        scanner.close();

        double peso_quilos = peso_toneladas * 1000;
        System.out.println(peso_quilos);

        if (cod_carga >= 10 && cod_carga <= 20) pre_carga = 100 * peso_quilos;
        if (cod_carga >= 21 && cod_carga <= 30) pre_carga = 250 * peso_quilos;
        if (cod_carga >= 31 && cod_carga <= 40) pre_carga = 340 * peso_quilos;
        System.out.println(pre_carga);

        if (cod_est == 1) imposto = 35 / 100 * pre_carga;
        if (cod_est == 2) imposto = 25 / 100 * pre_carga;
        if (cod_est == 3) imposto = 15 / 100 * pre_carga;
        if (cod_est == 4) imposto = 5 / 100 * pre_carga;
        if (cod_est == 5) imposto = 0;
        System.out.println(imposto);

        double valor_total = pre_carga + imposto;
        System.out.println(valor_total);
    }
}
