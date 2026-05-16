public class Produto implements Vendavel {

    private String descricao;
    private String marca;
    private double preco;

    // Construtor valida o preço para evitar valores inválidos (zero ou negativos, vai que quem constroi é um 'hacker' e bota preco = 0), pensei nisso agora revendo nosso lab 3 e acho que ficou faltando checar, mas diriamos ser algo como uma correção
    public Produto(String descricao, String marca, double preco) {
        if (preco <= 0) {
            throw new RuntimeException("Preço inválido! O preço deve ser maior que zero.");
        }
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
    }
    // Agora tooooodos os get e sets possíveis

    @Override // Novamente usando Override nos nossos códigos, mesmo não sendo 'obrigatório' nesse contexto do trabalho
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
