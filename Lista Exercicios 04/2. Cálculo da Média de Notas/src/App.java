import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        
        double media = soma / 4;
        
        System.out.printf("Média: %.2f\n", media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
        
        sc.close();
    }
}