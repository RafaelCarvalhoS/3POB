import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        int pares = 0;
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o número:");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) pares++;
        }
        
        System.out.println("Quantidade de números pares: " + pares);
        
        sc.close();
    }
}