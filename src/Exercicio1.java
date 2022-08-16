import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double convercaoCelsius = (fahrenheit - 32) * 5/9;

        System.out.println("A temperatura convertida em celsius é: " + convercaoCelsius);
        scanner.close();

    }
}
