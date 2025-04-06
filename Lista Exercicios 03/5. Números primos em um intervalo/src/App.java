import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ehPrimo = true;

        System.out.println("Digite o primeiro número do intervalo:");
        int inicio = sc.nextInt();
        
        /*Armazenando o valor inicio em temp para que nao seja perdido o valor inserido pelo 
        usuario ao verificar se inicio é menor que 2*/
        int temp = inicio;

        System.out.println("Digite o segundo número do intervalo:");
        int fim = sc.nextInt();
        
        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        
        //Verificando se inicio é menor que 2 pois nao existem numeros primos menor que 2
        if(inicio<2) temp = 2;
        
        for (int num = temp; num <= fim; num++) {    
            ehPrimo = true;
            
            for (int divisor = 2; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    ehPrimo = false;
                    break; // Não é primo, sai do loop
                }
            }
            
            // Se passou por todas as verificações
            if (ehPrimo) {
                System.out.println(num);
            }
        }
        
        sc.close();
    }
}