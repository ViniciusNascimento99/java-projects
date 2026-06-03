public class MainTeste1 {

    public static void main(String[] args) {

        // Pessoa responsável
        Pessoa p1 = new Pessoa(
                1,
                "Gustavo",
                "123.456.789-00",
                "vinicius@gmail.com",
                "(81)99999-9999"
        );

        // Recursos
        Recurso r1 = new Recurso(
                1,
                "Notebook",
                "Tecnologia",
                10,
                2500
        );

        Recurso r2 = new Recurso(
                2,
                "Livro de Java",
                "Educação",
                20,
                30
        );

        Recurso r3 = new Recurso(
                3,
                "Projetor",
                "Tecnologia",
                2,
                500
        );

        // Projeto
        Projeto projeto1 = new Projeto(
                1,
                "EducaFuturo - Inclusão Digital",
                "Projeto voltado para ensino de informática básica",
                "10/05/2026",
                50000
        );

        // Alocando recursos
        projeto1.alocarRecurso(r1);
        projeto1.alocarRecurso(r2);
        projeto1.alocarRecurso(r3);

        // Exibição
        System.out.println("===== EDUCAFUTURO =====\n");

        System.out.println("Responsável: " + p1.getNome());

        System.out.println("\nProjeto: " + projeto1.getNome());

        System.out.println("Descrição: " + projeto1.getDescricao());

        System.out.println("Data de Início: " + projeto1.getDataInicio());

        System.out.println("\n===== RECURSOS ALOCADOS =====");

        for (Recurso r : projeto1.getRecursos()) {

            System.out.println("\n-------------------------");

            System.out.println("Nome: " + r.getNome());

            System.out.println("Tipo: " + r.getTipo());

            System.out.println("Quantidade: " + r.getQuantidade());

            System.out.println("Valor Unitário: R$ " + r.getValorUnitario());

            System.out.println("Valor Total: R$ " + r.getValorTotal());
        }

        System.out.println("\n==============================");

        System.out.println("Orçamento do Projeto: R$ " + projeto1.getOrcamento());

        System.out.println("Total em Recursos: R$ " + projeto1.calcularTotalRecursos());

        System.out.println("\nStatus: Projeto cadastrado com sucesso.");
    }
}