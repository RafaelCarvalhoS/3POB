package Heranca02.HerançaFuncionários.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario(){
    return salarioBase + ( salarioBase * 0.20);
    }    
}
