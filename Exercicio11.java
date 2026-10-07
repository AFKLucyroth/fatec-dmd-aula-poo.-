import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int numeroSorteado = sortearNumero();
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Tente adivinhar o número de 1 a 100");

        while (!acertou) {
            int palpite = lerPalpite();
            tentativas++;

            if (verificarAcerto(palpite, numeroSorteado)) {
                acertou = true;
                mostrarVitoria(tentativas);
            } else {
                mostrarDica(palpite, numeroSorteado);
            }
        }

        sc.close();
    }

    static int sortearNumero() {
        return random.nextInt(100) + 1;
    }

    static int lerPalpite() {
        System.out.print("Seu palpite: ");
        return sc.nextInt();
    }

    static boolean verificarAcerto(int palpite, int numeroSorteado) {
        return palpite == numeroSorteado;
    }

    static void mostrarDica(int palpite, int numeroSorteado) {
        if (palpite < numeroSorteado) {
            System.out.println("O número é maior");
        } else {
            System.out.println("O número é menor");
        }
    }

    static void mostrarVitoria(int tentativas) {
        System.out.println("Você acertou em " + tentativas + " tentativas!");
    }
}
