import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int pares = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);

        sc.close();
    }
}
