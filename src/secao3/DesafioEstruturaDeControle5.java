package secao3;

import java.util.Scanner;

public class DesafioEstruturaDeControle5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int valor = numero % 2;

        switch (valor) {
            case 0:
                if (numero != 2) {
                    System.out.println(" Esse número nao e primo");
                } else {
                    System.out.println(" Esse número e primo");
                }
                break;
            case 1:
                if (numero % 2 == 1) {
                    System.out.println("Esse numero e primo");
                }
                break;
            default:
                System.out.println("Número Invalido");
        }
    }
}
