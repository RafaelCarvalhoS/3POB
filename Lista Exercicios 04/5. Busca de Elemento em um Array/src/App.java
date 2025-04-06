import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número:");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Digite o número a ser buscado:");
        int alvo = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == alvo) {
                System.out.println("Número encontrado na posição " + i);
                return;
            }
        }
        System.out.println("Numero não encontrado!");        
        sc.close();
    }
}