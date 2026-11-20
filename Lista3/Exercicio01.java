import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.println("Valores:");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        sc.close();
    }
}
