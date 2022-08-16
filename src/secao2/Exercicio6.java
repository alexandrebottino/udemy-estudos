package secao2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        //Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
        // Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Entre com o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Entre com o valor de c: ");
        double c = scanner.nextDouble();

        //calculando DELTA
        double delta = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Delta: " + delta);

        //calculando X
        double x1 = (- b + Math.sqrt(delta) / (2 * a));
        System.out.println("x1: " + x1);

        double x2 = (- b - Math.sqrt(delta) / (2 * a));
        System.out.println("x2: " + x2);

    }
}
