import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Crie seu usuario: ");
        String usuarioCorreto = entrada.nextLine();

        System.out.print("Crie sua senha: ");
        String senhaCorreta = entrada.nextLine();

        int tentativa = 0;

        while (tentativa < 3) {

            System.out.print("Digite seu usuario: ");
            String usuario = entrada.nextLine();

            System.out.print("Digite sua senha: ");
            String senha = entrada.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Login realizado com sucesso!");
                break;
            }

            tentativa++;
            System.out.println("Dados incorretos");

            if (tentativa == 3) {
                System.out.println("Acesso bloqueado");
            }
        }

        entrada.close();
    }
}