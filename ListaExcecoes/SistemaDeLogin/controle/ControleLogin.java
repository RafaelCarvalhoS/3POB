package ListaExcecoes.SistemaDeLogin.controle;

import java.util.Scanner;

import ListaExcecoes.SistemaDeLogin.dominio.Autenticador;
import ListaExcecoes.SistemaDeLogin.dominio.LoginInvalidoException;

public class ControleLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autenticador autenticador = new Autenticador();
        boolean loginBemSucedido = false;

        System.out.println("Sistema de Login: ");

        while (!loginBemSucedido) {
            System.out.print("Digite o nome de usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            try {
                autenticador.autenticar(usuario, senha);
                loginBemSucedido = true;
            } catch (LoginInvalidoException e) {
                System.out.println("Erro de Login: " + e.getMessage());
                System.out.println("Por favor, tente novamente.\n");
            }
        }

        System.out.println("\nLogin concluído. Bem-vindo!");
        sc.close();
    }
}
