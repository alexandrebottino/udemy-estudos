package oo;

public class Motor {
    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;
    Motor (Carro carro){
        this.carro = carro;
    }
    int giros() {
        if (ligado != true) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
