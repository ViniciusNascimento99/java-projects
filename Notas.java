import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Notas {
    public static void main(String[] args) {
        
        // Nome do Scanner
        Scanner entrada = new Scanner(System.in);

        // Apresentação para usuário 
        System.out.println("Olá, seja bem vindo(a).");

        // Dados do usuário
        System.out.print("Para continuar. Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite qual a sua turma: (Ex: 1° ano): ");
        String turma = entrada.nextLine();
        System.out.print("Nota da 1° prova: ");
        Double prova1 = entrada.nextDouble();
        System.out.print("Nota da 2° prova: ");
        Double prova2 = entrada.nextDouble();
        System.out.print("Nota da atividade: ");
        Double atividades = entrada.nextDouble();

        // Calculando a média 
        double media = (prova1 + prova2 + atividades) / 3; 

        // Usuário Reprovado ou Aprovado
        String status;
        if (media >=7) {
            status = "Aprovado";
            System.out.print("Sua média final é: " + media + " Você Foi Aprovado");
        } else {
            status = "Reprovado";
            System.out.print("Sua média final é: " + media + " Você Foi Reprovado");
        }   

        
        // Banco de Dados 
        try {
            Connection conn = conexao.conectar();

            String sql = "INSERT INTO aluno (nome, turma, prova1, prova2, atividades, media, status) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, turma);
            stmt.setDouble(3, prova1);
            stmt.setDouble(4, prova2);
            stmt.setDouble(5, atividades);
            stmt.setDouble(6, media);
            stmt.setString(7, status);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
