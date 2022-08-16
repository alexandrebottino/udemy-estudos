package secao3;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        double nota = scanner.nextDouble();
        if (nota > 10 || nota < 0) {
            System.out.println("Nota invalida");
        } else if (nota >= 8.1) {
            System.out.println("Nota valida");
        } else if (nota >= 6.1) {
            System.out.println("Conceito ");
        }else{
            System.out.println("Final");
        }
        scanner.close();
    }
}
