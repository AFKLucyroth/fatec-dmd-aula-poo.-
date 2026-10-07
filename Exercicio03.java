import java.util.Scanner;

public class Exercicio03 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = lerNumero();
        boolean par = ehPar(numero);
        mostrarResultado(par);
        sc.close();
    }

    static int lerNumero() {
        System.out.print("Digite um número: ");
        return sc.nextInt();
    }

    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    static void mostrarResultado(boolean par) {
        if (par) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }
    }
}
