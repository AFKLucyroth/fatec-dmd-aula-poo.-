import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static String nomePersonagem;
    static int vidaPersonagem;
    static int vidaMonstro;

    public static void main(String[] args) {
        criarPersonagem();
        int opcao = 0;

        while (vidaPersonagem > 0 && vidaMonstro > 0 && opcao != 3) {
            mostrarStatus();
            mostrarMenu();
            opcao = lerOpcao();

            if (opcao == 1) {
                atacarMonstro();
                if (vidaMonstro > 0) {
                    monstroAtaca();
                }
            } else if (opcao == 2) {
                curar();
                monstroAtaca();
            } else if (opcao != 3) {
                System.out.println("Opção inválida");
            }
        }

        mostrarFim();
        sc.close();
    }

    static void criarPersonagem() {
        System.out.print("Nome do personagem: ");
        nomePersonagem = sc.next();
        vidaPersonagem = 100;
        vidaMonstro = 60;
    }

    static void mostrarStatus() {
        System.out.println();
        System.out.println(nomePersonagem + ": " + vidaPersonagem + " de vida");
        System.out.println("Monstro: " + vidaMonstro + " de vida");
    }

    static void mostrarMenu() {
        System.out.println("1 - Atacar");
        System.out.println("2 - Curar");
        System.out.println("3 - Sair");
    }

    static int lerOpcao() {
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static int atacar() {
        return random.nextInt(11) + 5;
    }

    static void atacarMonstro() {
        int dano = atacar();
        vidaMonstro = vidaMonstro - dano;
        System.out.println("Você causou " + dano + " de dano no monstro");
    }

    static void monstroAtaca() {
        int dano = atacar();
        System.out.println("O monstro atacou!");
        receberDano(dano);
    }

    static void receberDano(int dano) {
        vidaPersonagem = vidaPersonagem - dano;
        if (vidaPersonagem < 0) {
            vidaPersonagem = 0;
        }
        System.out.println(nomePersonagem + " recebeu " + dano + " de dano");
    }

    static void curar() {
        vidaPersonagem = vidaPersonagem + 20;
        if (vidaPersonagem > 100) {
            vidaPersonagem = 100;
        }
        System.out.println(nomePersonagem + " se curou");
    }

    static void mostrarFim() {
        if (vidaPersonagem <= 0) {
            System.out.println("Você perdeu...");
        } else if (vidaMonstro <= 0) {
            System.out.println("Você venceu o monstro!");
        } else {
            System.out.println("Você saiu do jogo");
        }
    }
}
