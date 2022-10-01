package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        SortedSet<String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Luca");
        lista.add("Pedro");

        for (String aprovados: lista){
            System.out.println(aprovados);
        }


    }
}
