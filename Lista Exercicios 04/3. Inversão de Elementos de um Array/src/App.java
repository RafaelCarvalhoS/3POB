import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o número:");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Números na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        sc.close();
    }
}