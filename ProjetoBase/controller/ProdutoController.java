package ProjetoBase.controller;

import ProjetoBase.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean alterarProduto(int id, String novoNome, int novaQtd) {
        Produto p = buscarProdutoPorId(id);
        if (p != null) {
            p.setNome(novoNome);
            p.setQuant(novaQtd);
            return true;
        }
        return false;
    }

    public boolean excluirProduto(int id) {
        return produtos.removeIf(p -> p.getId() == id);
    }
}