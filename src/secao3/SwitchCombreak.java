package secao3;

import java.util.Scanner;

public class SwitchCombreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor da nota do usuário: ");
        int nota = scanner.nextInt();
        String conceito = "";

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "B";
                break;
            default:
                System.out.println("Conceito não encontrado: ");
        }
        System.out.println("O conceito é: " + conceito);
        scanner.close();
    }
}
