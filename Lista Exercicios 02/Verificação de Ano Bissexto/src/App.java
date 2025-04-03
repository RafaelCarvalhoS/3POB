import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um ano");
        int ano = sc.nextInt();

        if(ano%4 == 0){
            if(ano%100==0)
            {
                if(ano%400==0){
                    System.out.println("Ano bissexto");
                }
                else{
                    System.out.println("Ano não é bissexto");
                }
            }
            else{
                System.out.println("Ano bissexto");
            }
        }
        else{
            System.out.println("Ano não é bissexto");
        }
    }
}
