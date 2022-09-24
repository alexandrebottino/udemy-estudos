package secao3;

import java.util.Scanner;

import static java.lang.System.out;

public class DesafioEstruturaDeControle2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano em questão");
        int ano = entrada.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    out.println("Este ano é bissexto");
                } else {
                    out.println("Este ano não é bissexto");
                }
            } else {
                out.println("Este ano  é bissexto");
            }
        } else {
            System.out.println("Este ano é bissexto");
        }
    }
}
