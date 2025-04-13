import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        String continuar;

        do {
            System.out.println("Digite um número:");
            numeros[contador] = sc.nextInt();
            contador++;
            sc.nextLine(); 
            
            System.out.println("Deseja continuar? (S/N)");
            continuar = sc.nextLine().toUpperCase();
            
        } while (continuar.equals("S") && contador < 10);

        Arrays.sort(numeros, 0, contador);
        
        System.out.println("Números ordenados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}