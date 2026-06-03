public class Doacao {

    // Atributos privados
    private int id;
    private Doador doador;
    private double valor;
    private String data;
    private Projeto projeto;

    // Construtor
    public Doacao(int id, Doador doador, double valor,
                   String data, Projeto projeto) {

        this.id = id;
        this.doador = doador;
        this.valor = valor;
        this.data = data;
        this.projeto = projeto;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Doador getDoador() {
        return doador;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public Projeto getProjeto() {
        return projeto;
    }
}