package secao3;

import java.util.Scanner;

public class DesafioEstruturaDeControle4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        double numero = entrada.nextDouble();

        if (numero % 2 == 1) {
            if (numero % 3 == 1) {
                System.out.println("Esse número é primo!");
            } else {
            System.out.println("Esse número não é primo!");
        }
        } else if (numero != 2) {
            System.out.println("Esse número não é primo!");

        } else {
            System.out.println("Esse número é primo");
        }
    }
}
