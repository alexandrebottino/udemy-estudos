package secao3;

import java.util.Scanner;

public class DesafioEstruturaDeControle10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numeroMaior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero");
            double numero = entrada.nextDouble();

            if (numero > numeroMaior) {
                numeroMaior = numero;
            }
        }
        System.out.println(" O número maior entre os 10 informados é o: " + numeroMaior);
    }
}
