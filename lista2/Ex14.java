import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado 1: ");
        double a = sc.nextDouble();
        System.out.print("Digite o lado 2: ");
        double b = sc.nextDouble();
        System.out.print("Digite o lado 3: ");
        double c = sc.nextDouble();

        // para ser triângulo, cada lado tem que ser menor que a soma dos outros dois
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Esses lados não formam um triângulo");
        }

        sc.close();
    }
}
