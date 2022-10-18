package oo.desafioHeranca;

public class CarroTeste {
    public static void main(String[] args){

        Ferrari f1 = new Ferrari();
        f1.marca = "Ferrari";
        f1.marca = "F250";

        Civic c1 = new Civic();
        c1.marca = "Civic";
        c1.modelo= "C4 Turbo";

        f1.ligar();
        c1.ligar();

        f1.acelerar();
        c1.acelerar();

        System.out.println("Velocidade da f1: " + f1.velocidadeAtual);
        System.out.println("Velocidade do c1: " + c1.velocidadeAtual);

        f1.frear();
        f1.frear();
        f1.frear();
        f1.frear();

        System.out.println(f1.desligar());

    }
}
