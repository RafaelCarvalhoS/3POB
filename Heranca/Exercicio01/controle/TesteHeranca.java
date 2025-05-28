package Heranca.Exercicio01.controle;

import Heranca.Exercicio01.dominio.Aluno;
import Heranca.Exercicio01.dominio.Professor;

public class TesteHeranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 20, "Engenharia");
        Professor professor = new Professor("João", 45, 5800.00);

        aluno.exibirDados();

        professor.exibirDados();
    }
}
