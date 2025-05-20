package dominio;

public class Funcionario {
    String nome;
    String categoria;
    Double salarioBase;
    
    public Funcionario(String nome, String categoria, Double salarioBase) {
        this.nome = nome;
        this.categoria = categoria;
        this.salarioBase = salarioBase;
    }

     public double calcularSalarioFinal() {
        double salarioFinal = salarioBase;

        switch (categoria.toUpperCase()) {
            case "A":
                salarioFinal += salarioBase * 0.20;
                break;
            case "B":
                salarioFinal += salarioBase * 0.10;
                break;
            case "C":
                // Sem bônus
                break;
            default:
                System.out.println("Categoria inválida. Sem bônus aplicado.");
        }

        return salarioFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
