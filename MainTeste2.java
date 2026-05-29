import java.util.ArrayList;

public class MainTeste2 {

    public static void main(String[] args) {

        // Projeto educacional
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

        // Adicionando doação
        d1.adicionarDoacao(5000);

        // Registrando horas
        v1.registrarHoras(30);

        // Lista polimórfica
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(d1);
        pessoas.add(v1);

        // Exibição
        System.out.println("===== EDUCAFUTURO =====");

        System.out.println("\nProjeto:");
        System.out.println(projeto1.getNome());

        System.out.println("\nDoador:");
        System.out.println(d1.getNome());
        System.out.println("Total doado: R$ " + d1.getTotalDoado());

        System.out.println("\nVoluntário:");
        System.out.println(v1.getNome());
        System.out.println("Horas totais: " + v1.getHorasTotais());

        // Teste polimórfico
        System.out.println("\n===== TESTE POLIMÓRFICO =====");

        for (Pessoa p : pessoas) {

            if (p instanceof Doador) {

                Doador d = (Doador) p;

                System.out.println(d.getNome() +
                        " | Tipo: " + d.getTipo() +
                        " | Impacto: " + d.calcularImpacto());
            }

            else if (p instanceof Voluntario) {

                Voluntario v = (Voluntario) p;

                System.out.println(v.getNome() +
                        " | Tipo: " + v.getTipo() +
                        " | Impacto: " + v.calcularImpacto());
            }
        }
    }
}