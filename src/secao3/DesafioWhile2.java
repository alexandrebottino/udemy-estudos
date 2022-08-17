package secao3;

import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o valor da média: ");
        double entrada = scanner.nextDouble();
        double media = 0;
        double totalAlunos = 0;

        while (entrada != -1) {
            if (entrada <= 10 && entrada >= 0) {
                media = media + entrada;
                totalAlunos++;
            } else {
                System.out.println("Nota invalida");
            }
            System.out.println("Entre com o valor da média: ");
            entrada = scanner.nextDouble();
        }

        System.out.println("A média total é: " + (media / totalAlunos));
        System.out.println("A quantidade de alunos é: " + totalAlunos);
        scanner.close();

    }
}