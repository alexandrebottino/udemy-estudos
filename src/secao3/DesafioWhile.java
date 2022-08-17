package secao3;

import javax.swing.*;

public class DesafioWhile {
    public static void main(String[] args) {
        String texto = "";
        while (!texto.equalsIgnoreCase("sair")) {
            texto = JOptionPane.showInputDialog("Digite a palavra para sair da repetição");
        }
    }
}
