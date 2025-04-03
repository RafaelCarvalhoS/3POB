import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("O numero é par");
        }
        else{
            System.out.println("O numero é impar");
        }
    }
}
