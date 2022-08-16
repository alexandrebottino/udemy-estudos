package secao3;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo - 1
        //Segunda - 2
        //Terça - 3
        //Quarta - 4
        //Quinta - 5
        //Sexta - 6
        //Sabado - 7


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o dia da semana: ");
        String dia = scanner.nextLine().toLowerCase().trim();

        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("1");
        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");
        }else if ("terça".equalsIgnoreCase(dia)) {
            System.out.println("3");
        }else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");
        }else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
        }else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");
        }else if ("sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");
        } else {
            System.out.println("Dia da semana invalido");
        }

    }
}
