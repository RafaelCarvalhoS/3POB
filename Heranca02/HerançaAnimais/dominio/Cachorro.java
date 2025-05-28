package Heranca02.HerançaAnimais.dominio;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSom: latindo");
    }
}
