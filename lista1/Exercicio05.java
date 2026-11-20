import java.util.Scanner;

public class Exercicio05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 5) {
            mostrarMenu();
            opcao = lerOpcao();

            if (opcao >= 1 && opcao <= 4) {
                executarOperacao(opcao);
            } else if (opcao != 5) {
                System.out.println("Opção inválida");
            }
        }

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
    }

    static int lerOpcao() {
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    static void executarOperacao(int opcao) {
        double a = lerNumero("Primeiro número: ");
        double b = lerNumero("Segundo número: ");

        if (opcao == 1) {
            mostrarResultado(somar(a, b));
        } else if (opcao == 2) {
            mostrarResultado(subtrair(a, b));
        } else if (opcao == 3) {
            mostrarResultado(multiplicar(a, b));
        } else if (b == 0) {
            System.out.println("Erro: não dá para dividir por zero");
        } else {
            mostrarResultado(dividir(a, b));
        }
    }

    static double somar(double a, double b) {
        return a + b;
    }

    static double subtrair(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        return a / b;
    }

    static void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
