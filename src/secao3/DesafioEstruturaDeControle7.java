package secao3;

import java.util.Scanner;

public class DesafioEstruturaDeControle7 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        double numero;
        int verificacao = 0;

        while (verificacao == 0){
            System.out.println("Digite um número que não seja impar:  ");
            numero = entrada.nextDouble();

            if (numero % 2 == 0) {
                System.out.println("Voce digitou um numero par");
            } else {
                System.out.println("Você digitou um numero impar, o programa será finalizado");
                verificacao = 1;
            }
        }
    System.out.println("Fim do progama!");
    }
}
