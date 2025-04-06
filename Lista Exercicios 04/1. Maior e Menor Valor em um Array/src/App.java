import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o numero");
            numeros[i] = sc.nextInt();
        }
        
        int maior = numeros[0];
        int menor = numeros[0];
        for (int num : numeros) {
            if (num > maior){
                maior = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
        sc.close();
    }
}