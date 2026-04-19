import java.util.Scanner;

public class nome {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá, meu nome é: " + nome);

        entrada.close();
    }
}