package ListaExcecoes.CadastroDeProdutos.dominio;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("O preço do produto deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Nome do Produto: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}