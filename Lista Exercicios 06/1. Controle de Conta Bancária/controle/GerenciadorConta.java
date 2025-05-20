package controle;

import dominio.*;

import java.util.Scanner;

public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Boolean continuar = true;

        System.out.println("Criar conta");
        System.out.println("Digite o nome do titular");
        String titular = sc.nextLine();

        System.out.println("Insira valor");
        double valor = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(valor, titular);

        while(continuar){
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Digite sua escolha: ");
            int i = sc.nextInt(); 

            switch (i) {
                case 1:
                    System.out.print("Digite o valor a depositar: ");

                    double valorDeposito = sc.nextDouble(); 
                    sc.nextLine(); 
                    conta.depositar(valorDeposito); 
                    System.out.println("Depósito de " + valorDeposito + " realizado com sucesso.");
                    break;
                
                case 2:
                    System.out.print("Digite o valor a sacar: ");

                    double valorSaque = sc.nextDouble();
                    sc.nextLine(); 
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();    
                    break;
                case 4:
                    continuar = false;
                    
                    System.out.println("Fim das operações");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
        sc.close();
    }
}
