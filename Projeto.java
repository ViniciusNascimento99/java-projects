import java.util.ArrayList;

public class Projeto {

    // Atributos privados
    private int id;
    private String nome;
    private String descricao;
    private String dataInicio;
    private double orcamento;

    // Lista de recursos
    private ArrayList<Recurso> listaRecursos;

    // Construtor
    public Projeto(int id, String nome, String descricao, String dataInicio, double orcamento) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.orcamento = orcamento;

        listaRecursos = new ArrayList<>();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public double getOrcamento() {
        return orcamento;
    }

    // Método para alocar recurso
    public void alocarRecurso(Recurso recurso) {

        listaRecursos.add(recurso);
    }

    // Método para calcular total dos recursos
    public double calcularTotalRecursos() {

        double total = 0;

        for (Recurso r : listaRecursos) {

            total += r.getValorTotal();
        }

        return total;
    }
}