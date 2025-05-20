package dominio;

public class Elevador {
    int andarAtual;
    int totalAndares;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
    }
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar " + andarAtual + ".");
        } else {
            System.out.println("Você já está no último andar (" + totalAndares + ").");
        }
    }

    // Desce um andar, se não for o térreo
    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar " + andarAtual + ".");
        } else {
            System.out.println("Você já está no térreo (andar 0).");
        }
    }

    // Exibe o andar atual
    public void exibirAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }
}
