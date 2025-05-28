package Heranca02.HerançaFuncionários.dominio;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, Double salarioBase) {
        super(nome, salarioBase);

    }
    @Override
    public double calcularSalario(){
    return salarioBase + (salarioBase * 0.05);
    }
}
