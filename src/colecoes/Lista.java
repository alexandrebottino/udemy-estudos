package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args){

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Alexandre");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Valerio"));
        lista.add(new Usuario("Rubens"));

        System.out.println(lista.get(3).nome);
        lista.remove(1);
        System.out.println(lista.remove(new Usuario("Joao")));
        System.out.println(lista.contains(new Usuario("Lia")));

        for (Usuario u: lista) {
            System.out.println(u);
        }
    }
}
