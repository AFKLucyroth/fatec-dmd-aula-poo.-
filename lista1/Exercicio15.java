import java.util.Random;
import java.util.Scanner;

public class Exercicio15 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static final int META = 30;
    static String nomeJogador;
    static int pontosJogador;
    static int pontosComputador;

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 2) {
            mostrarMenu();
            opcao = lerOpcao();

            if (opcao == 1) {
                iniciarJogo();
            } else if (opcao == 2) {
                encerrarJogo();
            } else {
                System.out.println("Opção inválida");
            }
        }

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("=== CORRIDA DE DADOS ===");
        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");
    }

    static int lerOpcao() {
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static void iniciarJogo() {
        criarJogador();

        while (!verificarVitoria()) {
            executarTurno();
        }

        mostrarVencedor();
    }

    static void criarJogador() {
        System.out.print("Seu nome: ");
        nomeJogador = sc.next();
        pontosJogador = 0;
        pontosComputador = 0;
    }

    static int jogarDado() {
        return random.nextInt(6) + 1;
    }

    static void executarTurno() {
        int dadoJogador = jogarDado();
        int dadoComputador = jogarDado();

        pontosJogador = pontosJogador + dadoJogador;
        pontosComputador = pontosComputador + dadoComputador;

        System.out.println();
        System.out.println(nomeJogador + " tirou " + dadoJogador + " (total: " + pontosJogador + ")");
        System.out.println("Computador tirou " + dadoComputador + " (total: " + pontosComputador + ")");
    }

    static boolean verificarVitoria() {
        return pontosJogador >= META || pontosComputador >= META;
    }

    static void mostrarVencedor() {
        System.out.println();
        if (pontosJogador > pontosComputador) {
            System.out.println(nomeJogador + " venceu a corrida!");
        } else if (pontosComputador > pontosJogador) {
            System.out.println("O computador venceu a corrida!");
        } else {
            System.out.println("Empate!");
        }
    }

    static void encerrarJogo() {
        System.out.println("Jogo encerrado");
    }
}
