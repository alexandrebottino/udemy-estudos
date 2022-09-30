package classe;

import java.util.Date;

public class EqualsEHashcode {
    public static void main(String[] args) {

        Usuario a1 = new Usuario();
        a1.nome = "Alexandre";
        a1.eMail = "alexandre.bottino@gmail.com";

        Usuario a2 = new Usuario();
        a2.nome = "Alexandre";
        a2.eMail = "alexandre.bottino@gmail.com";


        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a2.equals(a1));

        System.out.println(a1.equals(new Date()));


    }
}
