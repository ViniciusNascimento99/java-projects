import java.util.Scanner;

public class cadastraPessoa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Digite seu nome: ");
        p.nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        p.idade = entrada.nextInt();

        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);

        if (p.idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        entrada.close();
    }
}

class Pessoa {
    String nome;
    int idade;
}