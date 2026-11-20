import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            soma = soma + m[i][i];
        }

        System.out.println("Soma da diagonal principal: " + soma);

        sc.close();
    }
}
