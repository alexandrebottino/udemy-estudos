package classe.desafio;


public class Pessoa {

    double peso;
    String nome;

    Pessoa(double peso, String nome) {
        this.peso = peso;
        this.nome = nome;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }
    String apresentar() {
        return "Comi e agora estou com" + this.peso + "Kg.";
    }
}
