package controle;

import dominio.Elevador;

import java.util.Scanner;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o total de andares ao usuário
        System.out.print("Informe o total de andares do prédio: ");
        int totalAndares = sc.nextInt();

        // Cria o elevador
        Elevador elevador = new Elevador(totalAndares);

        int opcao;
        do {
            // Menu de operações
            System.out.println("1. Subir");
            System.out.println("2. Descer");
            System.out.println("3. Exibir andar atual");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
                case 0:
                    System.out.println("Encerrando a simulação. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
