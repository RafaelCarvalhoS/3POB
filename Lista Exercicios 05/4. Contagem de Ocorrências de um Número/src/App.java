import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contagem = 0;

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Digite o número para contar:");
        int alvo = sc.nextInt();

        for (int num : numeros) {
            if (num == alvo) contagem++;
        }

        System.out.println("O número " + alvo + " aparece " + contagem + " vezes.");
        sc.close();
    }
}