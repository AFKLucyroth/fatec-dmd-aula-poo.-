import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Usuário: ");
        String usuario = sc.next();
        System.out.print("Senha: ");
        String senha = sc.next();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");

            double saldo = 0;
            int opcao = 0;

        
            while (opcao != 4) {
                System.out.println();
                System.out.println("1 - Ver saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo: " + saldo);
                        break;
                    case 2:
                        System.out.print("Valor do depósito: ");
                        double deposito = sc.nextDouble();
                        if (deposito > 0) {
                            saldo = saldo + deposito;
                            System.out.println("Depósito realizado");
                        } else {
                            System.out.println("Valor inválido");
                        }
                        break;
                    case 3:
                        System.out.print("Valor do saque: ");
                        double saque = sc.nextDouble();
                        if (saque <= 0) {
                            System.out.println("Valor inválido");
                        } else if (saque > saldo) {
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldo = saldo - saque;
                            System.out.println("Saque realizado");
                        }
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }
}
