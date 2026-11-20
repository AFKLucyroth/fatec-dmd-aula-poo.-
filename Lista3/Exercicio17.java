import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o número para multiplicar: ");
        int x = sc.nextInt();

        System.out.println("Matriz multiplicada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = m[i][j] * x;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
