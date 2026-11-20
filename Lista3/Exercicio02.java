import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
