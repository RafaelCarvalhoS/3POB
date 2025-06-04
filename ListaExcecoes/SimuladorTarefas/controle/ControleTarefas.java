package ListaExcecoes.SimuladorTarefas.controle;

import ListaExcecoes.SimuladorTarefas.dominio.ListaTarefas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControleTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaTarefas lista = new ListaTarefas();

        while (true) {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa por índice");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: \n");

            try {
                int opcao = sc.nextInt();
                sc.nextLine();

                if (opcao == 1) {
                    System.out.print("Descrição da tarefa: ");
                    String tarefa = sc.nextLine();
                    lista.adicionar(tarefa);
                    System.out.println("Tarefa adicionada.");
                } else if (opcao == 2) {
                    System.out.print("Índice da tarefa a remover: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    lista.remover(indice);
                    System.out.println("Tarefa removida.");
                } else if (opcao == 3) {
                    System.out.println("Lista de tarefas:");
                    for (int i = 0; i < lista.obterTodas().size(); i++) {
                        System.out.println(i + ": " + lista.obterTodas().get(i));
                    }
                } else if (opcao == 0) {
                    System.out.println("Encerrando.");
                    break;
                } else {
                    System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Índice fora do intervalo.");
            }
        }

        sc.close();
    }
}