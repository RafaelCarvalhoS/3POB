import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[100];
        int contador = 0;
        double entrada;

        System.out.println("Digite números (-1 para parar):");
        while (contador < 100 && (entrada = sc.nextDouble()) != -1) {
            numeros[contador] = entrada;
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhum número digitado!");
        } else {
            double soma = 0;
            for (int i = 0; i < contador; i++) {
                soma += numeros[i];
            }
            System.out.printf("Soma: %.2f%n", soma);
            System.out.printf("Média: %.2f%n", (soma / contador));
        }

        sc.close();
    }
}