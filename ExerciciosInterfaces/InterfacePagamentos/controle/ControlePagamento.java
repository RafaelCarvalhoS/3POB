package ExerciciosInterfaces.InterfacePagamentos.controle;

import java.util.Scanner;

import ExerciciosInterfaces.InterfacePagamentos.dominio.BoletoBancario;
import ExerciciosInterfaces.InterfacePagamentos.dominio.CartaoCredito;
import ExerciciosInterfaces.InterfacePagamentos.dominio.Pagamento;

public class ControlePagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        do {

            System.out.println("Sistema de Pagamentos: ");
            System.out.print("Digite o valor a pagar: R$ ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.println("Escolha a forma de pagamento:");
            System.out.println("1. Cartão de Crédito");
            System.out.println("2. Boleto Bancário");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            Pagamento pagamento; 

            switch (opcao) {
                case 1:
                    pagamento = new CartaoCredito();
                    pagamento.realizarPagamento(valor);
                    continuar = false; 
                    break;
                case 2:
                    pagamento = new BoletoBancario();
                    pagamento.realizarPagamento(valor);
                    continuar = false; 
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(continuar);    

        scanner.close();
    }
}

