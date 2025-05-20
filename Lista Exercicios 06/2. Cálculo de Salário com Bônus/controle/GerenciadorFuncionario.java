package controle;

import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.print("Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer

        System.out.print("Categoria (A, B ou C): ");
        String categoria = sc.nextLine();

        // Cria o funcionário
        Funcionario funcionario = new Funcionario(nome, categoria, salarioBase);

        // Exibe o resultado
        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Categoria: " + funcionario.getCategoria());
        System.out.println("Salário Final: R$ " + funcionario.calcularSalarioFinal());

        sc.close();
    }
}
