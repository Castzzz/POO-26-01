
public class Funcionario extends Pessoa {

    private String matricula;

    private float salario;

    private Banco Banco_onde_trabalha;

    public Funcionario(String cpf, String nome, String matricula, Banco banco){
        super(cpf, nome);
        this.matricula = matricula;
        this.Banco_onde_trabalha = banco;
        this.salario = Banco.Salario_base;
    }

    public void imprimircontracheque(){
        System.out.println("Funcionario: " + getNome() + " com salario: " + this.salario);
    }

    @Override

    public String toString(){
        return super.toString() + "\nMatricula: " + matricula + " e Salario: "  + salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public Banco getBanco_onde_trabalha(){
        return Banco_onde_trabalha;
    }

    public String getMatricula(){
        return matricula;
    }
}