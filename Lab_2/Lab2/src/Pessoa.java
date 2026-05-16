public class Pessoa {
    private final String cpf;
    private String nome;

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + nome +  " e CPF: " + cpf;
    }
}