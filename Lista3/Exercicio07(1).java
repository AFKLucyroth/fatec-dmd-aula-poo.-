import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        boolean achou = false;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                achou = true;
            }
        }

        if (achou) {
            System.out.println("O valor " + x + " está no array");
        } else {
            System.out.println("O valor " + x + " não está no array");
        }

        sc.close();
    }
}
