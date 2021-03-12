public class Pessoa {
    private int id;
    private String nome;
    private String Endereco;

    public Pessoa (String nome,int id, String Endereco){
        this.set_id(id);
        this.set_Nome(nome);
        this.set_Endereco (Endereco);    
    }
    public int get_id (){
        return id;
    }
    public String get_Nome (){
        return nome;
    }
    public String get_Endereco(){
        return Endereco;
    }

    public void set_id(int id){
        this.id = id;
    }

    public void set_Nome(String nome){
         this.nome = nome;
    }
    public void set_Endereco(String Endereco){
        this.Endereco = Endereco;
    }
    public String toString(){
        return "Nome: " + nome + "\nRegistro: " + id + "\nEndereco: " + Endereco + "\n";
    }
} 