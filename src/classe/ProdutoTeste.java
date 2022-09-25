package classe;

public class ProdutoTeste {

    public static void main(String[] args){

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;

        var p2 = new Produto("Caneta Preta", 12.56);
        //p2.nome = "Caneta Preta";
        //p2.preco = 12.56;

        Produto.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarriho = (precoFinal1 + precoFinal2) /2;

        System.out.printf("Valor: R$%.2f.", mediaCarriho);


    }
}
