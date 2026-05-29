public class Voluntario extends Pessoa {

    // Atributos privados
    private int horasVoluntariado;
    private int horasTotais;

    // Construtor
    public Voluntario(int id, String nome, String cpf, String email, String telefone,
                       int horasVoluntariado, int horasTotais) {

        super(id, nome, cpf, email, telefone);

        this.horasVoluntariado = horasVoluntariado;
        this.horasTotais = horasTotais;
    }

    // Getters
    public int getHorasVoluntariado() {
        return horasVoluntariado;
    }

    public int getHorasTotais() {
        return horasTotais;
    }

    // Método
    public void registrarHoras(int horas) {

        horasTotais += horas;
    }

    // Polimorfismo
    public String getTipo() {

        return "Voluntário";
    }

    public double calcularImpacto() {

        return horasTotais * 10;
    }
}