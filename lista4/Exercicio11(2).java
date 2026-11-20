import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            n = sc.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Número inválido, tente de novo.");
            }
        } while (n < 1 || n > 10);

        System.out.println("Você digitou " + n);

        sc.close();
    }
}
