package ProjetoBase.view;

import java.util.Scanner;

import ProjetoBase.controller.ProdutoController;
import ProjetoBase.model.Produto;

public class ProdutoView {
    private ProdutoController controller;
    private Scanner scanner;

    public ProdutoView(ProdutoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Consultar Produto");
            System.out.println("4. Alterar Produto");
            System.out.println("5. Excluir Produto");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    consultarProduto();
                    break;
                case 4:
                    alterarProduto();
                    break;
                case 5:
                    excluirProduto();
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void adicionarProduto() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quantidade: ");
        int qtd = scanner.nextInt();

        Produto p = new Produto(id, nome, qtd);
        controller.adicionarProduto(p);
        
        System.out.println("Produto adicionado.");
    }

    private void listarProdutos() {
        controller.listarProdutos().forEach(produto -> 
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuant())
        );
    }

    private void consultarProduto() {
        System.out.print("ID do produto: ");
        int id = scanner.nextInt();
        
        Produto p = controller.buscarProdutoPorId(id);
        if (p != null) {
            System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Quantidade: " + p.getQuant());    
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private void alterarProduto() {
        System.out.print("ID do produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Novo nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Nova quantidade: ");
        int qtd = scanner.nextInt();

        boolean ok = controller.alterarProduto(id, nome, qtd);
        if (ok) {
            System.out.println("\nProduto alterado.");
        } else {
            System.out.println("\nProduto não encontrado.");
        }
    }

    private void excluirProduto() {
        System.out.print("ID do produto: ");
        int id = scanner.nextInt();
        
        boolean ok = controller.excluirProduto(id);
        if (ok) {
            System.out.println("Produto excluído.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}