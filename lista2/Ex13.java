import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        // divisível por 4 e não por 100, OU divisível por 400
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        sc.close();
    }
}
