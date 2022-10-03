package oo;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Alexandre";
        c1.adicionarItem(new Item("Prato", 3, 10.99));
        c1.adicionarItem(new Item("Borracha", 2, 1.50));
        c1.adicionarItem(new Item("Caderno", 1, 15));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());

    }
}
