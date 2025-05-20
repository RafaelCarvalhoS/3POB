package controle;

import dominio.Aluno;
import dominio.Professor;

public class TesteHeranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 20, "Engenharia");
        Professor professor = new Professor("João", 45, 5800.00);

        aluno.exibirDados();

        professor.exibirDados();
    }
}
