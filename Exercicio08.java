import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você quer informar? ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida");
        } else {
            double soma = 0;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o número " + i + ": ");
                soma = soma + sc.nextDouble();
            }

            double media = soma / quantidade;
            System.out.println("Média: " + media);
        }

        sc.close();
    }
}
