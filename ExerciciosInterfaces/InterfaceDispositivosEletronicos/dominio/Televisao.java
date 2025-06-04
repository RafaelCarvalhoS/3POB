package ExerciciosInterfaces.InterfaceDispositivosEletronicos.dominio;

public class Televisao implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("TV ligada.");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("TV desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }
}