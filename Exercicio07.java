public class Exercicio07 {

    public static void main(String[] args) {
        mostrarNumeros();
        mostrarPares();
        mostrarImpares();
    }

    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    static void mostrarNumeros() {
        System.out.println("Números de 1 até 100:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    static void mostrarPares() {
        System.out.println("Números pares:");
        for (int i = 1; i <= 100; i++) {
            if (ehPar(i)) {
                System.out.println(i);
            }
        }
    }

    static void mostrarImpares() {
        System.out.println("Números ímpares:");
        for (int i = 1; i <= 100; i++) {
            if (!ehPar(i)) {
                System.out.println(i);
            }
        }
    }
}
