package secao3;

import java.util.Scanner;

public class DesafioEstruturaDeControle6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero da sorte: ");
        double numeroSorte = entrada.nextDouble();

        for (int i = 10; i > 0; i--) {

            if (numeroSorte == 15) {
                System.out.println("Parabens, voce acertou o numero!");
                break;
            } else if (numeroSorte < 15) {
                System.out.println("Infelizmente vc errou o numero, tente um valor maior");
                System.out.println("Vc possui ainda " + i + " oportunidades");
            } else {
                System.out.println("Infelizmente vc errou o numero, tente um valor menor");
                System.out.println("Vc possui ainda " + i + " oportunidades");
            }

            System.out.println("Digite o numero da sorte: ");
            numeroSorte = entrada.nextDouble();
        }
    }
}
