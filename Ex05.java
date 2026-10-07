import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        // && quer dizer E (as duas condições têm que ser verdadeiras)
        if (n >= 10 && n <= 50) {
            System.out.println("Está dentro do intervalo (10 a 50)");
        } else {
            System.out.println("Está fora do intervalo");
        }

        sc.close();
    }
}
