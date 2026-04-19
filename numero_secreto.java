import java.util.Scanner;

public class numero_secreto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = 7;

        while (true) {

            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero > numeroSecreto) {
                System.out.println("Número alto");
            } else if (numero < numeroSecreto) {
                System.out.println("Número baixo");
            } else {
                System.out.println("Número correto");
                break;
            }
        }

        entrada.close();
    }
}