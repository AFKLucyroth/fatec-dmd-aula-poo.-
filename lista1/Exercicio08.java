import java.util.Scanner;

public class Exercicio08 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();

        mostrarResumo(nome, idade, cidade);
        sc.close();
    }

    static String lerNome() {
        System.out.print("Nome: ");
        return sc.nextLine();
    }

    static int lerIdade() {
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        return idade;
    }

    static String lerCidade() {
        System.out.print("Cidade: ");
        return sc.nextLine();
    }

    static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}
