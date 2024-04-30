package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float valor_adic = 0;
        double imposto = 0;
        double desconto = 0;

        Scanner scanner = new Scanner(System.in);
        double pre = scanner.nextDouble();
        String tipo = scanner.nextLine();
        String refrig = scanner.nextLine();
        scanner.close();

        if (refrig == "N") {
            if (tipo == "A") {
                if (pre < 15) valor_adic = 2;
                else valor_adic = 5; 
            }

            if (tipo == "L") {
                if (pre < 10) valor_adic = 1.5f;
                else valor_adic = 2.5f;
            }

            if (tipo == "V") {
                if (pre < 30) valor_adic = 3;
                else valor_adic = 2.5f;
            }
        }

        else {
            if (tipo == "A") valor_adic = 8;
            if (tipo == "L") valor_adic = 0;
            if (tipo == "V") valor_adic = 0;
        }
        System.out.println(valor_adic);

        if (pre < 25) imposto = 5 / 100 * pre;
        else imposto = 8 / 100 * pre;
        System.out.println(imposto);

        double pre_custo = pre + imposto;
        System.out.println(pre_custo);

        if (tipo != "A" && refrig != "S") desconto = 3 / 100 * pre_custo;
        else desconto = 0;
        System.out.println(desconto);

        double novo_pre = pre_custo + valor_adic - desconto;
        System.out.println(novo_pre);

        if (novo_pre <= 50) System.out.println("Barato");
        else if (novo_pre < 100) System.out.println("Normal");
        else System.out.println("Caro");
    }
}
