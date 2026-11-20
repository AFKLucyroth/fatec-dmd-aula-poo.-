import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        int maior = m[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);

        sc.close();
    }
}
