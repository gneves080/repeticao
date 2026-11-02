
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Receber o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // 2. Receber um número positivo
        System.out.print("Digite um número positivo: ");
        int n = scanner.nextInt();

        // 3. Contagem crescente
        System.out.println("\nContagem crescente:");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        // 4. Contagem decrescente
        System.out.println("\nContagem decrescente:");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        // 5. Verificar o tamanho do nome
        System.out.println("\nExibindo nome:");

        if (nome.length() > 6) {
            for (int i = 0; i < n; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println(nome);
        }

        scanner.close();
    }
}
