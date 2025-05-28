package Heranca.Exercicio02.controle;

import Heranca.Exercicio02.dominio.Carro;
import Heranca.Exercicio02.dominio.Moto;

public class TesteVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", 2020, 4);
        Moto moto = new Moto("Honda", 2022, true);

        carro.exibirDados();

        moto.exibirDados();
    }
}
