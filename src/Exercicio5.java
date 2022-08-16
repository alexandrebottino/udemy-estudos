import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do triangulo: ");
        Double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura do triangulo: ");
        Double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Area: " + area);
        scanner.close();
    }
}
