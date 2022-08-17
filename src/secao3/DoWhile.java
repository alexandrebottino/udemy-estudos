package secao3;

import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
        //if(..) sentenca; ou {}
        //while() sentenca; ou {}
        //for(...;...;...) sentenca; ou {}

        String texto = "";

        do {
            System.out.println("Você precisa digitar as palavras masgicas");
            texto = JOptionPane.showInputDialog("Quais são as palavras?: ");
        } while (!texto.equalsIgnoreCase("sair"));


    }
}
