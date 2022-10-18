package oo.desafioHeranca;

public class Civic extends Carro{
    void acelerar() {
        if (super.velocidadeAtual >= 0 && super.ligado) {
            super.velocidadeAtual = super.velocidadeAtual + 15;
        }
    }
}
