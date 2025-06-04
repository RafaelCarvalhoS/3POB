package ListaExcecoes.SimuladorTarefas.dominio;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<String> tarefas;

    public ListaTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionar(String tarefa) {
        tarefas.add(tarefa);
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            throw new IndexOutOfBoundsException();
        }
        tarefas.remove(indice);
    }

    public List<String> obterTodas() {
        return tarefas;
    }
}