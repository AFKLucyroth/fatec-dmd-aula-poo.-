import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int jogador = -1;

        while (jogador != 0) {
            mostrarMenu();
            jogador = jogadaJogador();

            if (jogador != 0) {
                int computador = jogadaComputador();
                int vencedor = verificarVencedor(jogador, computador);
                mostrarResultado(jogador, computador, vencedor);
            }
        }

        System.out.println("Fim de jogo");
        sc.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("0 - Sair");
    }

    static int jogadaJogador() {
        int jogada = -1;

        while (jogada < 0 || jogada > 3) {
            System.out.print("Sua jogada: ");
            jogada = sc.nextInt();

            if (jogada < 0 || jogada > 3) {
                System.out.println("Opção inválida");
            }
        }

        return jogada;
    }

    static int jogadaComputador() {
        return random.nextInt(3) + 1;
    }

    static int verificarVencedor(int jogador, int computador) {
        if (jogador == computador) {
            return 0;
        } else if ((jogador == 1 && computador == 3)
                || (jogador == 2 && computador == 1)
                || (jogador == 3 && computador == 2)) {
            return 1;
        } else {
            return 2;
        }
    }

    static String nomeJogada(int jogada) {
        if (jogada == 1) {
            return "Pedra";
        } else if (jogada == 2) {
            return "Papel";
        } else {
            return "Tesoura";
        }
    }

    static void mostrarResultado(int jogador, int computador, int vencedor) {
        System.out.println("Você: " + nomeJogada(jogador));
        System.out.println("Computador: " + nomeJogada(computador));

        if (vencedor == 0) {
            System.out.println("Empate!");
        } else if (vencedor == 1) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }
    }
}
