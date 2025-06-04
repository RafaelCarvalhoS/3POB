package ExercicioArquivoTexto.controle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControlaAluno controle = new ControlaAluno();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nCadastro de Alunos: ");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Alterar Aluno");
            System.out.println("4. Excluir Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula do Aluno: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Nome do Aluno: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Coeficiente de Rendimento (CR): ");
                    double cr = scanner.nextDouble();
                    
                    controle.adicionarAluno(matricula, nome, cr);
                    break;

                case 2:
                    controle.listarAlunos();
                    break;

                case 3:
                    System.out.print("Matrícula do Aluno a alterar: ");
                    int matAlterar = scanner.nextInt();
                    
                    scanner.nextLine(); // limpa o buffer
                    
                    controle.alterarAluno(matAlterar);
                    break;

                case 4:
                    System.out.print("Matrícula do Aluno a excluir: ");
                    int matExcluir = scanner.nextInt();
                    
                    controle.excluirAluno(matExcluir);
                    break;

                case 0:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}