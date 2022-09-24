package secao3;

public class DesafioEstruturaDeControle1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.println("O número " + i + " é PAR");
            } else if (i % 2 == 1) {
                System.out.println("O número " + i + " é IMPAR");
            } else {
                System.out.println("Este número é ZERO");
            }
        }
    }
}
