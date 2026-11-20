import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();

        double valorFinal = valor;

        if (valor >= 100) {
            // 10% de desconto
            valorFinal = valor - (valor * 0.10);
        }

        System.out.println("Valor final: " + valorFinal);

        sc.close();
    }
}
