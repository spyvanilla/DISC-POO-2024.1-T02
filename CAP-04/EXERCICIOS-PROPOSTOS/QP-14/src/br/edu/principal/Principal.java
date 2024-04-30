package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        scanner.close();

        if (salary <= 300) System.out.println(salary + salary * 50 / 100);
        if (salary > 300 && salary <= 500) System.out.println(salary + salary * 40 / 100);
        if (salary > 500 && salary <= 700) System.out.println(salary + salary * 30 / 100);
        if (salary > 700 && salary <= 800) System.out.println(salary + salary * 20 / 100);
        if (salary > 800 && salary <= 1000) System.out.println(salary + salary * 10 / 100);
        if (salary > 1000) System.out.println(salary + salary * 5 / 100);
    }
}
