import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade");
        int idade = sc.nextInt();

        if(idade<18){
            System.out.println("Menor de idade");
        }
        else if(idade<61){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }
    }
}
