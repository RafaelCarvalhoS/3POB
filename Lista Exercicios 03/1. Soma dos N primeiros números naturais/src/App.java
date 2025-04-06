import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();
        int soma = 0;
        for(int i = 0; i<=n; i++){
            soma+=i;
        }
        System.out.println("A soma total é "+ soma);
        sc.close();
    }
}
