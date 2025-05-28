package Heranca02.HerançaFuncionários.controle;

import Heranca02.HerançaFuncionários.dominio.*;

public class ControlaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", 3000.00);
        Gerente gerente = new Gerente("Pedro", 5000.00);
        Estagiario estagiario = new Estagiario("Maria", 1000.00);

        System.out.println("Funcionario: " + funcionario.getNome() + "\nSalario: " + funcionario.calcularSalario());
        System.out.println("\nGerente: " + gerente.getNome() + "\nSalario: " + gerente.calcularSalario());
        System.out.println("\nEstagiario: " + estagiario.getNome() + "\nSalario: " + estagiario.calcularSalario());

    }
}
