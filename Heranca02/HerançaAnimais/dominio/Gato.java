package Heranca02.HerançaAnimais.dominio;

public class Gato extends Animal{
     public Gato(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSom: Miando");
    }
}
