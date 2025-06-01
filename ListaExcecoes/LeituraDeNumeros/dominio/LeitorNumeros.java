package ListaExcecoes.LeituraDeNumeros.dominio;


import java.util.InputMismatchException;
import java.util.Scanner; 

public class LeitorNumeros {

    private int tamanhoArray; 

    public LeitorNumeros(int tamanhoArray) {
        this.tamanhoArray = tamanhoArray;
    }

    public int[] lerNumeros(Scanner scanner) {
        int[] numeros = new int[tamanhoArray]; 

        System.out.println("Por favor, digite " + tamanhoArray + " números inteiros.");

        for (int i = 0; i < tamanhoArray; i++) {
            boolean entradaValida = false;
            while (!entradaValida) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                try {
                    numeros[i] = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Digite um número inteiro.");
                    scanner.next(); 
                }
            }
        }
        return numeros; 
    }
}