package arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int qtdNotas;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas que irá ser inserida");
        qtdNotas = entrada.nextInt();

        double notas[] = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite uma nota " + (i +1) + ": ");
            notas[i] = entrada.nextDouble();
        }
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas = somaNotas + nota;
        }
        double total = somaNotas / notas.length;
        System.out.println("A média do aluno é igual a: " + total);

    }
}
