import java.util.ArrayList;

public class Gerente extends Funcionario {

    private ArrayList<Funcionario> subordinados;

    public Gerente(String cpf, String nome, String matricula, Banco banco){
        super(cpf, nome, matricula, banco);
        this.subordinados = new ArrayList<>();
        this.setSalario(Banco.Salario_base * 2);
    }

    public void adicionarSubordinado(Funcionario func){
        if (func.getBanco_onde_trabalha() != this.getBanco_onde_trabalha()){
            throw new RuntimeException("Funcionario n trabalha no mesmo banco q o gerente");
        }
        this.subordinados.add(func);
    }

    public void imprimirEquipe(){
        System.out.println("Equipe do: " + getNome());
        for (Funcionario func : subordinados){
            System.out.println(func.toString());
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nTamanho da equipe: " + subordinados.size();
    }
}