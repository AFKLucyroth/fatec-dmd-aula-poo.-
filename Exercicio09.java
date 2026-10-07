import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Número inválido");
        } else {

            long fatorial = 1;

            for (int i = 2; i <= n; i++) {
                fatorial = fatorial * i;
            }

            System.out.println(n + "! = " + fatorial);
        }

        sc.close();
    }
}
