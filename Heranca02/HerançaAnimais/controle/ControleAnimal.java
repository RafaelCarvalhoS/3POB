package Heranca02.HerançaAnimais.controle;

import Heranca02.HerançaAnimais.dominio.*;

public class ControleAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 6);
        Gato gato = new Gato("Garfield", 3);

        cachorro.emitirSom();    
        gato.emitirSom();
    }
    
}
