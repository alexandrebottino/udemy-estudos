import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em Kg:  ");
        Double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em m: ");
        Double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("imc = " + imc);
        scanner.close();


    }
}
