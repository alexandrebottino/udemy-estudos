package oo;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Alexandr");
        Aluno aluno2 = new Aluno("Joao");
        Aluno aluno3 = new Aluno("Maria");

        Curso curso1 = new Curso("Matematica");
        Curso curso2 = new Curso("Portugues");
        Curso curso3 = new Curso("Historia");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Alunos do curso 1");
            System.out.println("Meu nome é: " + aluno.nome);
        }

       Curso cursoEnctonrado = aluno1.obterCurso("Matematica");
        if(cursoEnctonrado != null) {
            System.out.println(cursoEnctonrado.nome);
            System.out.println(cursoEnctonrado.alunos);
        }
    }
}
