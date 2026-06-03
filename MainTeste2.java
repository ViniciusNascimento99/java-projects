import java.util.ArrayList;

public class MainTeste2 {

    public static void main(String[] args) {

        // Projeto
        Projeto projeto1 = new Projeto(
                1,
                "EducaFuturo - Inclusão Digital",
                "Projeto voltado para cursos gratuitos de informática",
                "15/05/2026",
                80000
        );

        // Doador
        Doador d1 = new Doador(
                1,
                "Carlos Henrique",
                "111.222.333-44",
                "carlos@gmail.com",
                "(81)99999-1111",
                0,
                0
        );

        // Voluntário
        Voluntario v1 = new Voluntario(
                2,
                "Mariana Souza",
                "555.666.777-88",
                "mariana@gmail.com",
                "(81)98888-2222",
                0,
                0
        );

        // Doação
        Doacao doacao1 = new Doacao(
                1,
                d1,
                5000,
                "20/05/2026",
                projeto1
        );

        // Atualizando informações
        d1.adicionarDoacao(5000);

        v1.registrarHoras(30);

        // Lista polimórfica
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(d1);
        pessoas.add(v1);

        // =====================================================
        // EXIBIÇÃO
        // =====================================================

        System.out.println("===== EDUCAFUTURO =====");

        // Projeto
        System.out.println("\n===== PROJETO =====");

        System.out.println("Nome: " + projeto1.getNome());

        System.out.println("Descrição: " + projeto1.getDescricao());

        System.out.println("Data de Início: " + projeto1.getDataInicio());

        System.out.println("Orçamento: R$ " + projeto1.getOrcamento());

        // Doador
        System.out.println("\n===== DOADOR =====");

        System.out.println("Nome: " + d1.getNome());

        System.out.println("Email: " + d1.getEmail());

        System.out.println("Telefone: " + d1.getTelefone());

        System.out.println("Quantidade de Doações: "
                + d1.getQuantidadeDoacoes());

        System.out.println("Total Doado: R$ "
                + d1.getTotalDoado());

        // Voluntário
        System.out.println("\n===== VOLUNTÁRIO =====");

        System.out.println("Nome: " + v1.getNome());

        System.out.println("Email: " + v1.getEmail());

        System.out.println("Telefone: " + v1.getTelefone());

        System.out.println("Horas Totais: "
                + v1.getHorasTotais());

        System.out.println("Impacto Gerado: "
                + v1.calcularImpacto());

        // Doação
        System.out.println("\n===== DOAÇÃO =====");

        System.out.println("ID: " + doacao1.getId());

        System.out.println("Doador: "
                + doacao1.getDoador().getNome());

        System.out.println("Projeto: "
                + doacao1.getProjeto().getNome());

        System.out.println("Valor: R$ "
                + doacao1.getValor());

        System.out.println("Data: "
                + doacao1.getData());

        // Polimorfismo
        System.out.println("\n===== TESTE POLIMÓRFICO =====");

        for (Pessoa p : pessoas) {

            if (p instanceof Doador) {

                Doador d = (Doador) p;

                System.out.println("\nPessoa encontrada:");

                System.out.println("Nome: "
                        + d.getNome());

                System.out.println("Tipo: "
                        + d.getTipo());

                System.out.println("Impacto: "
                        + d.calcularImpacto());
            }

            else if (p instanceof Voluntario) {

                Voluntario v = (Voluntario) p;

                System.out.println("\nPessoa encontrada:");

                System.out.println("Nome: "
                        + v.getNome());

                System.out.println("Tipo: "
                        + v.getTipo());

                System.out.println("Impacto: "
                        + v.calcularImpacto());
            }
        }
    }
}