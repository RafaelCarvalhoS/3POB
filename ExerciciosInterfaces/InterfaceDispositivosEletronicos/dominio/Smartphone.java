package ExerciciosInterfaces.InterfaceDispositivosEletronicos.dominio;

public class Smartphone implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Smartphone ligado.");
        } else {
            System.out.println("O Smartphone já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Smartphone desligado.");
        } else {
            System.out.println("O Smartphone já está desligado.");
        }
    }
}
