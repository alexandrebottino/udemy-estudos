package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String NomeInicial, double precoInicial) {
        nome = NomeInicial;
        preco = precoInicial;
    }
    Produto() {

    }

    double precoComDesconto() {
        double precoDesconto = preco * (1 - desconto);
        return precoDesconto;
    }
}
