import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = sc.next();
        System.out.print("Senha: ");
        String senha = sc.next();

        // para comparar texto usa .equals() e não ==
        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        sc.close();
    }
}
