import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo:");
        int numero = sc.nextInt();
        
        int contador = numero;
        do {
            System.out.println(contador);
            contador--;
        } while (contador >= 0);
        
        sc.close();
    }
}