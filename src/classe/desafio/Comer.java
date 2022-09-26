package classe.desafio;

public class Comer {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa(80, "Alexandre");
        Comida c1 = new Comida(2, "Macarrao");

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());



    }
}
