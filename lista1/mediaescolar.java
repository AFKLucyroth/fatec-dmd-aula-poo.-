import java.util.Scanner;

public class Exercicio04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1 = lerNota(1);
        double nota2 = lerNota(2);
        double nota3 = lerNota(3);

        double media = calcularMedia(nota1, nota2, nota3);
        String situacao = verificarSituacao(media);

        mostrarResultado(media, situacao);
        sc.close();
    }

    static double lerNota(int numero) {
        System.out.print("Digite a nota " + numero + ": ");
        return sc.nextDouble();
    }

    static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    static String verificarSituacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    static void mostrarResultado(double media, String situacao) {
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}
