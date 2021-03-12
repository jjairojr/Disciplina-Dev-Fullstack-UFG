

public class PessoaFisica extends Pessoa {
    private int cpf;
    private Calendario dt_Nascimento;
    private String genero;

    public PessoaFisica( String nome,int id, String Endereco, int cpf, int dia, int mes, int ano, String genero) {
        super(nome,id, Endereco);
        this.cpf = cpf;
        this.dt_Nascimento = new Calendario (dia,mes,ano);
        this.genero = genero;
    }

    public int getCpf() {
        return cpf;
    }

    public Calendario getdt_Nascimento() {
        return dt_Nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade(){
        return dt_Nascimento.Calcula_idade();
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setdt_Nascimento(Calendario dt_Nascimento) {
        this.dt_Nascimento = dt_Nascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString(){
        return super.toString() + "CPF: " + cpf + "\n" + dt_Nascimento.toString() + "Genero: " + genero + "\n";
    }
}