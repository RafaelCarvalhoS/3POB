package Heranca02.HerançaVeículos.controle;

import Heranca02.HerançaVeículos.dominio.*;

public class ControleVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Golf", 2000, 4);
        Moto moto = new Moto("Honda", "street", 2010, 300);
        
        carro.exibirDados();
        moto.exibirDados();
    }
}
