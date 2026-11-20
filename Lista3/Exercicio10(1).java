import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("Valores únicos:");
        for (int i = 0; i < v.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (v[i] == v[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                System.out.println(v[i]);
            }
        }

        sc.close();
    }
}
