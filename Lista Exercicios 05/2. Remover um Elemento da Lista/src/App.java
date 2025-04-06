import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            nomes.add(sc.nextLine());
        }

        System.out.println("\nDigite o nome a ser removido:");
        String alvo = sc.nextLine();

        boolean removido = nomes.remove(alvo);

        if (removido) {
            System.out.println("\nLista atualizada:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        } else {
            System.out.println("\nNome não encontrado na lista!");
        }

        sc.close();
    }
}