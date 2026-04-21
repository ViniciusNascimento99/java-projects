import java.util.Scanner; 
import java.sql.Connection;
import java.sql.PreparedStatement;

public class cadastro_alunos {
    public static void main(String[] args) {
        
        // Nome do Scanner
        Scanner entrada = new Scanner(System.in);

        // Apresentação
        System.out.println("Olá aluno(a). Seja Bem Vindo");
        
        // Cadstro dos alunos
        System.out.println("Para continuar. Digite seus Dados.");
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite qual a sua turma (Ex: 1° ano): ");
        String turma = entrada.nextLine();

        System.out.print("Digite sua nota final: ");
        double nota_final = entrada.nextDouble();


        // Banco de Dados 
        try {
            Connection conn = conexao.conectar();

            String sql = "INSERT INTO aluno (nome, turma, nota_final) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, turma);
            stmt.setDouble(3, nota_final);

            stmt.executeUpdate();


            // Calculo da nota do aluno
            if (nota_final >= 7.0) {
                System.out.print("Olá " + nome + ". Sua nota final é: " + nota_final + " Você foi Aprovado");
            } else {
                System.out.print("Olá " + nome + ". Sua nota final é: " + nota_final + " Você foi Reprovado");
            }

            conn.close();

        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
}
