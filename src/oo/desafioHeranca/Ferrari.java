package oo.desafioHeranca;

public class Ferrari extends Carro {

    void acelerar() {
        if (super.velocidadeAtual >= 0 && super.ligado) {
            super.velocidadeAtual = super.velocidadeAtual + 20;
        }
    }
}
