package controle;

import java.util.Scanner;
import dominio.Aluno;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        double nota;
        while (true) {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            if (scanner.hasNextDouble()) {
                nota = sc.nextDouble();
                Aluno alunoTemp = new Aluno(nome, nota);
                if (alunoTemp.validarNota()) {
                    break;
                } else {
                    System.out.println("Nota inválida! Deve estar entre 0 e 10.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next(); // limpar entrada inválida
            }
        }

        Aluno aluno = new Aluno(nome, nota);
        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Classificação: " + aluno.classificarAluno());

        sc.close();
    }
}
