package primeiroprograma;
import java.util.Scanner;

public class JogoVelha {

    static char[][] tabuleiro = new char[3][3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char jogador = 'X';
        boolean acabou = false;

        preencherTabuleiro();

        while (acabou == false) {
            exibirTabuleiro();
            realizarJogada(jogador);

            if (verificarVitoria(jogador) == true) {
                exibirTabuleiro();
                System.out.println("O jogador " + jogador + " venceu!");
                acabou = true;
            } else if (tabuleiroCompleto() == true) {
                exibirTabuleiro();
                System.out.println("A partida terminou empatada!");
                acabou = true;
            } else {
                jogador = trocarJogador(jogador);
            }
        }

        sc.close();
    }

    static void preencherTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static void exibirTabuleiro() {
        System.out.println();
        System.out.println("    1   2   3");
        System.out.println("  +---+---+---+");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + " |");
            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
        System.out.println();
    }

    static int lerNumero(String mensagem) {
        int numero = 0;
        boolean certo = false;

        while (certo == false) {
            System.out.print(mensagem);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero >= 1 && numero <= 3) {
                    certo = true;
                } else {
                    System.out.println("Digite um número entre 1 e 3.");
                }
            } else {
                sc.next();
                System.out.println("Digite apenas números.");
            }
        }

        return numero - 1;
    }

    // mds vou ficar maluco
    static void realizarJogada(char jogador) {
        boolean jogou = false;

        while (jogou == false) {
            int linha = lerNumero("Jogador " + jogador + ", informe a linha: ");
            int coluna = lerNumero("Jogador " + jogador + ", informe a coluna: ");

            if (posicaoValida(linha, coluna) == true) {
                tabuleiro[linha][coluna] = jogador;
                jogou = true;
            } else {
                System.out.println("Escolha outra posição.");
            }
        }
    }


    static boolean posicaoValida(int linha, int coluna) {
        if (tabuleiro[linha][coluna] == ' ') {
            return true;
        }
        return false;
    }


    static boolean verificarVitoria(char jogador) {

        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }


        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }


        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }


        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }

    static boolean tabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    static char trocarJogador(char jogador) {
        if (jogador == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }
}