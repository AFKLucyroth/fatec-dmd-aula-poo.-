import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int n = sc.nextInt();

            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            }

        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);

        sc.close();
    }
}
