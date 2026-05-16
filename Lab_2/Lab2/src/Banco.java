import java.util.ArrayList;

public class Banco {

    public final static int TAMANHO_MAX_PRO_NOME = 10;

    public static final float Salario_base = 1621.00f ;

    private String nome;

    private ArrayList<Funcionario> funcionarios;

    private ArrayList<ContaCorrente> contasCorrentes;

    public Banco(String nome) {
        setNome(nome);
        this.contasCorrentes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        if (novoNome.length() >  TAMANHO_MAX_PRO_NOME) {
            return;
        }
        this.nome = novoNome;
    }

    public int getNumeroDeContasCorrentes() {
        return contasCorrentes.size();
    }

    public void adicionarFuncionario(String cpf, String nome, String matricula, Boolean ehGerente){
        Funcionario novo_func;

        if (ehGerente){
            novo_func = new Gerente(cpf, nome, matricula, this);
        }
        else{
            novo_func = new Funcionario(cpf, nome, matricula, this);
        }
        this.funcionarios.add(novo_func);
    }

    public void listar_func(){
        for(Funcionario func : funcionarios){
            System.out.println("\n" + func);
        }
    }

    public Funcionario localizarFuncionario(String matricula){
        for (Funcionario func : funcionarios){
            if (func.getMatricula().equals(matricula)){
                return func;
            }
        }
        return null;
    }

    public Gerente localizarGerente(String matricula){
        Funcionario func = localizarFuncionario(matricula);

        if(func instanceof Gerente){
            return (Gerente) func;
        }
        return null;
    }

    public void promoverFuncionario(Funcionario func){
        System.out.println("O funcionario: " + func.getNome() + " vai ser promovido!!");

        float novo_salario = func.getSalario() * 1.3f;
        func.setSalario(novo_salario);
        System.out.println("\n" + func + "\n");
    }
}