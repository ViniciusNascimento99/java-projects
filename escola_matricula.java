import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class escola_matricula {
    public static void main(String[] args) {
        
        // Nome do Scanner 
        Scanner entrada = new Scanner (System.in);

        // Apresentação Para o Aluno
        System.out.println("Olá aluno, para continuar, faça seu cadastro");

        // Cadastro do Aluno
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Crie uma senha: ");
        String senha = entrada.nextLine();
        
        // informações do Aluno
        System.out.print("DIgite sua série (Ex: 1° ano):  ");
        String serie = entrada.nextLine();
        System.out.print("Digite sua 1° nota: ");
        Double prova1 = entrada.nextDouble();
        System.out.print("Digite sua 2° nota: ");
        Double prova2 = entrada.nextDouble();
        System.out.print("Digite a nota das suas atividades: ");
        Double atividades = entrada.nextDouble();
        Double media;

        // Calculo da média 
        media = (prova1 + prova2 + atividades) / 3;

        // Média do Aluno
        String status;
        if (media >= 7) {
            status = "Aprovado";
            System.out.print("Sua média final é: " + media + ". Vocé Foi Aprovado");
        } else {
            status = "Reprovado";
            System.out.print("Sua média final é: " + media + ". Você Foi Reprovado");
        } 

        // Banco de Dados
        try {
            Connection conn = conexao.conectar();

            String sql = "INSERT INTO aluno (nome, senha, serie, prova1, prova2, atividades, media, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            stmt.setString(3, serie);
            stmt.setDouble(4, prova1);
            stmt.setDouble(5, prova2);
            stmt.setDouble(6, atividades);
            stmt.setDouble(7, media);
            stmt.setString(8, status);

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
               
        }
    }
