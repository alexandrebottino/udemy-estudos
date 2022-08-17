package secao3;

public class DesafioFor {
    public static void main(String[] args) {
        String valor = "#";
        String controle = "######";
        for (String v = "#"; !v.equalsIgnoreCase(controle) ; v += "#") {
            System.out.println(valor);
            valor += "#";
        }
    }
}
