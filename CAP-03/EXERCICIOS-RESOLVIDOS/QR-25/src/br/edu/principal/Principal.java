package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int voltas = 0;
        String sentido = "";

        Scanner scanner = new Scanner(System.in);
        double angulo = scanner.nextDouble();
        scanner.close();

        if (angulo > 360 || angulo < -360) {
            voltas = (int) angulo / 360;
            angulo = angulo % 360;
        }

        if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) System.out.println("Está em cima de algum dos eixos");
        if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) System.out.println("1° Quadrante");
        if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) System.out.println("2° Quadrante");
        if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) System.out.println("3° Quadrante");
        if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) System.out.println("4° Quadrante");
    
        if (angulo < 0) sentido = "horário";
        else sentido = "anti-horário";

        System.out.println(voltas + " volta(s) no sentido " + sentido);
    }
}
