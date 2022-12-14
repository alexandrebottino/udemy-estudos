package colecoes;

import java.util.HashSet;
import java.util.Set;

public class HashhCode {
    public static void main(String[] args){

        HashSet conjunto= new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho e: "+ conjunto.size());

        conjunto.add("teste");
        conjunto.add('x');
        System.out.println("Tamanho e: "+ conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho e: "+ conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);

    }
}
