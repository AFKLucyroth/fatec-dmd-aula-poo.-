import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        boolean achou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número para procurar: ");
        int x = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (m[i][j] == x) {
                    System.out.println("Encontrado na linha " + (i + 1) + ", coluna " + (j + 1));
                    achou = true;
                }
            }
        }

        if (!achou) {
            System.out.println("Número não encontrado");
        }

        sc.close();
    }
}
