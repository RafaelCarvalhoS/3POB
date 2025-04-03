import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        double a = sc.nextDouble();

        System.out.println("Digite o caracter da operação");
        char op = sc.next().charAt(0);

        System.out.println("Digite um numero");
        double b = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println("A soma é "+ (a+b));
                break;
        
            case '-':
                System.out.println("A subtração é "+ (a-b));
                break;    

            case '*':
                System.out.println("A multiplicação é "+ a*b);
                break;
                
            case '/':
                if(b>0){
                    System.out.println("A dividão é "+ a/b);
                    break;
                }    
            default:
                System.out.println("Operação invalida!");
                break;
        }
    }
}
