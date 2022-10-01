package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        usuarios.put(1, "Alexandre");
        usuarios.put(20, "Fernando");
        usuarios.put(32, "Jorge");
        usuarios.put(4, "Juan");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Alexandre"));

        System.out.println(usuarios.get(4));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String usuario : usuarios.values()) {
            System.out.println(usuario);
        }

        for(Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
