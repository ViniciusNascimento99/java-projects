public class Recurso {

    // Atributos privados
    private int id;
    private String nome;
    private String tipo;
    private int quantidade;
    private double valorUnitario;

    // Construtor
    public Recurso(int id, String nome, String tipo, int quantidade, double valorUnitario) {

        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    // Método
    public double getValorTotal() {
        return quantidade * valorUnitario;
    }
}