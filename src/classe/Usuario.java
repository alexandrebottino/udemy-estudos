package classe;

public class Usuario {

    String nome;
    String eMail;

    @Override
    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.eMail.equals(this.eMail);
            return nomeIgual && emailIgual;

        } else {
            return false;
        }
    }
}