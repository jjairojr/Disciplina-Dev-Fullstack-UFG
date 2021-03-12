public class PessoaJuridica extends Pessoa{
    private int cnpj;
    private String atividade;
    public PessoaJuridica(String nome,int id,  String Endereco, int cnpj, String atividade) {
        super(nome,id, Endereco);
        this.cnpj = cnpj;
        this.atividade = atividade;
    }
    public int getCnpj() {
        return cnpj;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

   public String toString() {
       return super.toString() + "CNPJ: " + cnpj + "\nAtividade da Empresa: " + atividade +"\n";
   } 
}