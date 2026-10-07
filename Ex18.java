import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        // repete até o usuário escolher 3 (sair)
        while (opcao != 3) {
            System.out.println();
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Primeiro número: ");
                    double a = sc.nextDouble();
                    System.out.print("Segundo número: ");
                    double b = sc.nextDouble();
                    System.out.println("Resultado: " + (a + b));
                    break;
                case 2:
                    System.out.print("Primeiro número: ");
                    double c = sc.nextDouble();
                    System.out.print("Segundo número: ");
                    double d = sc.nextDouble();
                    System.out.println("Resultado: " + (c - d));
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}
