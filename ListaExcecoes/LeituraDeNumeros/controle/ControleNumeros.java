package ListaExcecoes.LeituraDeNumeros.controle;

import java.util.Scanner;

import ListaExcecoes.LeituraDeNumeros.dominio.LeitorNumeros; 


public class ControleNumeros { 

    public static void main(String[] args) {
        int numeroDeElementos = 5;

        Scanner sc = new Scanner(System.in); 
        
        LeitorNumeros leitor = new LeitorNumeros(numeroDeElementos); 

        int[] numerosLidos = leitor.lerNumeros(sc); 

        System.out.println("Todos os números foram lidos");
        
        for (int i = 0; i < numerosLidos.length; i++) {
            System.out.println("Número: " + numerosLidos[i]);
        }

        sc.close(); 
    }
}
