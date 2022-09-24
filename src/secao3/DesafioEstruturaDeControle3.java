package secao3;

import java.util.Scanner;

public class DesafioEstruturaDeControle3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o valor da primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Entre com o valor da segunda nota: ");
        double nota2 = entrada.nextDouble();

        double mediaFinal = (nota1 + nota2) / 2;

        if (mediaFinal >= 7){
            System.out.println("Aprovado");
        } else if (mediaFinal < 7 && mediaFinal > 4){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
