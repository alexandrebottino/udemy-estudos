import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        Double valor = scanner.nextDouble();


        System.out.println("O valor ao cubo é: " +Math.pow(valor, 3) );
        System.out.println("O valor ao quadrado é : " + Math.pow(valor, 2));


    }
}
