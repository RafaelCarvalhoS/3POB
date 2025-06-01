package ListaExcecoes.ConversorTemperatura.controle;

import java.util.InputMismatchException; // Specific exception for input type mismatch
import java.util.Scanner;

import ListaExcecoes.ConversorTemperatura.dominio.ConversorTemperatura;


public class ControleTemperatura {
  
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();
        double celsius = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite a temperatura em Celsius: ");
            try {
                celsius = sc.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite um valor numérico");
                sc.next(); 
            }
        }

        double fahrenheit = conversor.celsiusParaFahrenheit(celsius);

        System.out.println("A temperatura de " + celsius + "°C equivale a " + fahrenheit + "F");

        sc.close();
    }
}
