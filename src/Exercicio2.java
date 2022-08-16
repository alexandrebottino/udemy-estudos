import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a temperatura em Celsius: ");
        Double celsius = scanner.nextDouble();

        double conversaoFahrenheit = (celsius * 9/5) + 32;

        System.out.println("Conversão Fahrenheit: " + conversaoFahrenheit);
    }
}
