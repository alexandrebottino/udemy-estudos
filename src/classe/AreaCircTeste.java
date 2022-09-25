package classe;

public class AreaCircTeste {
    public static void main(String[] args){

        AreaCirc ac1  = new AreaCirc(10);
        AreaCirc ac2 = new AreaCirc(5);

       // AreaCirc.PI = 3.1415;

        System.out.println(ac1.area());

        System.out.println(ac2.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
        System.out.println(AreaCirc.area(10));
    }
}
