import java.util.Scanner;

public class DesafioFinal {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 0;

    public static void main(String[] args) {
        if (fazerLogin()) {
            System.out.println("Acesso permitido");
            rodarMenu();
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }

    static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return sc.next();
    }

    static double lerValor(String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    static int lerOpcao() {
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    static boolean fazerLogin() {
        String usuario = lerTexto("Usuário: ");
        String senha = lerTexto("Senha: ");
        return validarLogin(usuario, senha);
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair");
    }

    static void rodarMenu() {
        int opcao = 0;

        while (opcao != 4) {
            mostrarMenu();
            opcao = lerOpcao();
            executarOpcao(opcao);
        }
    }

    static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                verSaldo();
                break;
            case 2:
                depositar(lerValor("Valor do depósito: "));
                break;
            case 3:
                sacar(lerValor("Valor do saque: "));
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    static void verSaldo() {
        System.out.println("Saldo: " + saldo);
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
}
