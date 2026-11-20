import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean acertou = false;

        // 3 tentativas
        for (int tentativa = 1; tentativa <= 3; tentativa++) {
            System.out.println("Tentativa " + tentativa + " de 3");
            System.out.print("Usuário: ");
            String usuario = sc.next();
            System.out.print("Senha: ");
            String senha = sc.next();

            if (usuario.equals("admin") && senha.equals("1234")) {
                acertou = true;
                break; // sai do for
            } else {
                System.out.println("Usuário ou senha errados");
            }
        }

        if (acertou) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Conta bloqueada");
        }

        sc.close();
    }
}
