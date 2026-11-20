import java.util.Scanner;

public class Exercicio10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String usuario = lerUsuario();
        String senha = lerSenha();

        boolean valido = validarLogin(usuario, senha);

        mostrarResultado(valido);
        sc.close();
    }

    static String lerUsuario() {
        System.out.print("Usuário: ");
        return sc.next();
    }

    static String lerSenha() {
        System.out.print("Senha: ");
        return sc.next();
    }

    static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    static void mostrarResultado(boolean valido) {
        if (valido) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
