package ProjetoBase.model;

public class Produto {
    int id;
    String nome;
    int quant;

    public Produto(int id, String nome, int quant) {
        this.id = id;
        this.nome = nome;
        this.quant = quant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void ExibirProduto() {
        System.out.println("Id: " + id + "\nNome: " + nome + "\nQuantidade: " + quant);
    }
}