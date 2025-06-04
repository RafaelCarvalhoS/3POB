package ExerciciosInterfaces.InterfaceGeometricas.controle;

import java.util.Scanner;

import ExerciciosInterfaces.InterfaceGeometricas.dominio.Circulo;
import ExerciciosInterfaces.InterfaceGeometricas.dominio.FormaGeometrica;
import ExerciciosInterfaces.InterfaceGeometricas.dominio.Retangulo;

public class ControleFormaGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        FormaGeometrica forma = null;

        boolean continuar = true;

        do{
            System.out.println("Cálculo de Área e Perímetro de Formas Geométricas: ");
            System.out.println("1. Retângulo");
            System.out.println("2. Círculo");
            System.out.print("Escolha a forma geométrica: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double altura = scanner.nextDouble();
                    forma = new Retangulo(largura, altura);
                    continuar = false; 
                    break;

                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    forma = new Circulo(raio);
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválid.");
            }
            
        } while (continuar);

        System.out.printf("Área: %.2f%n", forma.calcularArea());
        System.out.printf("Perímetro: %.2f%n", forma.calcularPerimetro());

        scanner.close();
    }
}
