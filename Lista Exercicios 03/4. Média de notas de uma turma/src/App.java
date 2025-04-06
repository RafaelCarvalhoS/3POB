import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos:");
        int quantidade = sc.nextInt();
        
        double soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite a nota do aluno " + i + ":");
            double nota = sc.nextDouble();
            soma += nota;
        }
        
        double media = soma / quantidade;
        System.out.println("A média da turma é " + media);
        
        sc.close();
    }
}