package secao3;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "roxa";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o 1");
            case "marrom":
                System.out.println("Sei o 2");
            case "roxa":
                System.out.println("Sei o 3");
            case "verde":
                System.out.println("Sei o 4");
            case "laranja":
                System.out.println("Sei o 5");
            case "vermelha":
                System.out.println("Sei o 6");
            case "amarela":
                System.out.println("Sei o 7");
                break;
            default:
                System.out.println("Sei é nada");
        }
    }
}

