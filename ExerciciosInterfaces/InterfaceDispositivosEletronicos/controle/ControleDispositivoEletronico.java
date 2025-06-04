package ExerciciosInterfaces.InterfaceDispositivosEletronicos.controle;

import java.util.Scanner;

import ExerciciosInterfaces.InterfaceDispositivosEletronicos.dominio.DispositivoEletronico;
import ExerciciosInterfaces.InterfaceDispositivosEletronicos.dominio.Smartphone;
import ExerciciosInterfaces.InterfaceDispositivosEletronicos.dominio.Televisao;

public class ControleDispositivoEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DispositivoEletronico smartphone = new Smartphone();
        DispositivoEletronico tv = new Televisao();

        int opcao;

        do {
            System.out.println("\nControle de Dispositivos: ");
            System.out.println("1. Ligar Smartphone");
            System.out.println("2. Desligar Smartphone");
            System.out.println("3. Ligar TV");
            System.out.println("4. Desligar TV");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: \n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    smartphone.ligar();
                    break;
                case 2:
                    smartphone.desligar();
                    break;
                case 3:
                    tv.ligar();
                    break;
                case 4:
                    tv.desligar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}