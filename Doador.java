public class Doador extends Pessoa {

    // Atributos privados
    private int quantidadeDoacoes;
    private double totalDoado;

    // Construtor
    public Doador(int id, String nome, String cpf, String email, String telefone,
                   int quantidadeDoacoes, double totalDoado) {

        super(id, nome, cpf, email, telefone);

        this.quantidadeDoacoes = quantidadeDoacoes;
        this.totalDoado = totalDoado;
    }

    // Getters
    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }

    public double getTotalDoado() {
        return totalDoado;
    }

    // Método
    public void adicionarDoacao(double valor) {

        quantidadeDoacoes++;
        totalDoado += valor;
    }

    // Polimorfismo
    public String getTipo() {

        return "Doador";
    }

    public double calcularImpacto() {

        return totalDoado;
    }
}
