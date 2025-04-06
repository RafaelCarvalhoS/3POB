import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;
        String continuar = "S";

        while (continuar.equals("S") && contador < 5) {
            
            System.out.println("Digite um número:");
            numeros[contador] = sc.nextInt();
            contador++;
            sc.nextLine(); 
            
            System.out.println("Deseja continuar? (S/N)");
            continuar = sc.nextLine().toUpperCase();            
        } 

        System.out.println("Números digitados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}