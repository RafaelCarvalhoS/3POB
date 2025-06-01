package ListaExcecoes.CadastroDeProdutos.controle;

import java.util.InputMismatchException;
import java.util.Scanner;

import ListaExcecoes.CadastroDeProdutos.dominio.PrecoInvalidoException;
import ListaExcecoes.CadastroDeProdutos.dominio.Produto;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = null;
        boolean cadastroConcluido = false;

        while (!cadastroConcluido) {
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double preco = 0.0;
            boolean precoValidoLido = false;

            while (!precoValidoLido) {
                try {
                    preco = sc.nextDouble();
                    precoValidoLido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida para o preço. Digite um número.");
                    sc.next();
                }
            }
            sc.nextLine(); 

            try {
                
                produto = new Produto(nome, preco);
                produto.exibirDados();
                cadastroConcluido = true; 
            } catch (PrecoInvalidoException e) {
                
                System.out.println("Erro de Cadastro: " + e.getMessage());
            }
        }
        sc.close();
    }
}