public class MainTeste1 {

    public static void main(String[] args) {

        // Pessoa
        Pessoa p1 = new Pessoa(
                1,
                "Vinicius Taiguara",
                "123.456.789-00",
                "vinicius@gmail.com",
                "(81)99999-9999"
        );

        // Recursos educacionais
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
                80
        );

        // Projeto educacional
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

        // Exibição
        System.out.println("===== EDUCAFUTURO =====");

        System.out.println("Responsável: " + p1.getNome());

        System.out.println("Projeto: " + projeto1.getNome());

        System.out.println("Descrição: " + projeto1.getDescricao());

        System.out.println("Orçamento: R$ " + projeto1.getOrcamento());

        System.out.println("Total em Recursos: R$ " + projeto1.calcularTotalRecursos());
    }
}