import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        int maior = sc.nextInt();

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int n = sc.nextInt();

            if (n > maior) {
                maior = n;
            }
        }

        System.out.println("O maior número é " + maior);

        sc.close();
    }
}
