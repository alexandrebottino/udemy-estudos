package oo.desafioHeranca;

public class Carro {
    String marca;
    String modelo;
    double velocidadeAtual;
    boolean ligado;

    boolean ligar() {
        this.velocidadeAtual = 0;
        return this.ligado = true;
    }

    String desligar() {
        if (this.velocidadeAtual == 0) {
            this.ligado = false;
            return "Carro Desligado";
        }else{
            return "Carro em movimento não pode ser desligado! ";
        }
    }
    void acelerar() {
        if (velocidadeAtual >= 0 && ligado == true) {
            velocidadeAtual = velocidadeAtual + 10;
        }
    }

    void frear() {
        if (velocidadeAtual <= 0){
            velocidadeAtual = 0;
        }
        if (velocidadeAtual > 0 && ligado == true) {
            velocidadeAtual = velocidadeAtual - 5;
        }
    }

}
