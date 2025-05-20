package controle;

import java.util.Scanner;
import dominio.CaixaEletronico;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico(500); // saldo inicial

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o valor para saque (ou 0 para sair): R$");
            double valor = sc.nextDouble();

            if (valor == 0) {
                continuar = false;
                System.out.println("Encerrando operações...");
            } else {
                caixa.sacar(valor);
                caixa.exibirSaldo();
            }

            System.out.println();
        }

        sc.close();
    }
}
