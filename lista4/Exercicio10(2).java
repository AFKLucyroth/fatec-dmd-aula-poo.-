import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int n;

     
        do {
            System.out.print("Digite um número (0 para parar): ");
            n = sc.nextInt();
            soma = soma + n;
        } while (n != 0);

        System.out.println("Soma total: " + soma);

        sc.close();
    }
}
