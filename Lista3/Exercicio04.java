import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] v = new double[6];
        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextDouble();
            soma = soma + v[i];
        }

        double media = soma / v.length;
        System.out.println("Média: " + media);

        sc.close();
    }
}
