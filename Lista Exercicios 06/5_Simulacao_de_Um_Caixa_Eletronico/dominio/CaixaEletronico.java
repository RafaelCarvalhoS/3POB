package dominio;

public class CaixaEletronico {
    private double saldo;

    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean sacar(double valor) {
        if (valor % 10 != 0) {
            System.out.println("Erro: O valor do saque deve ser múltiplo de R$10.");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        return true;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
