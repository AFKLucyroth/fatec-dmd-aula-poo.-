import java.util.Scanner;

public class Exercicio14 {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 500;

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            mostrarMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    depositar(lerValor("Valor do depósito: "));
                    break;
                case 2:
                    sacar(lerValor("Valor do saque: "));
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    encerrarSistema();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("===== CAIXA ELETRÔNICO =====");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("4 - Encerrar");
    }

    static int lerOpcao() {
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static double lerValor(String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    static void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Valor inválido");
        }
    }

    static void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque realizado");
        }
    }

    static void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    static void encerrarSistema() {
        System.out.println("Sistema encerrado. Obrigado!");
    }
}
