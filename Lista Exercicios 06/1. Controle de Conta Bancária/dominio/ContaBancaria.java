package dominio;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(Double valor){
        saldo += valor;
    }

    public void sacar(Double valor){
        if(saldo>=valor){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
        
    }
        public void exibirSaldo(){
            System.out.println("Seu saldo: " + saldo);
        }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
