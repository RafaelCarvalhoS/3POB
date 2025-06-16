package ProjetoBase;

import ProjetoBase.controller.ProdutoController;
import ProjetoBase.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController();
        ProdutoView view = new ProdutoView(controller);
        view.exibirMenu();
    }
}