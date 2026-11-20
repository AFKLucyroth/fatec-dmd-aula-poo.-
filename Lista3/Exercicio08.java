import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int vezes = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                vezes++;
            }
        }

        System.out.println("O valor " + x + " aparece " + vezes + " vez(es)");

        sc.close();
    }
}
