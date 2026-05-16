// Basicamente as mesmas coisas do lab3

public class Servico implements Vendavel {

    private double preco;
    private String descricao;
    private int garantiaEmMeses;

    public Servico(double preco, String descricao, int garantiaEmMeses) {
        this.preco = preco;
        this.descricao = descricao;
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getGarantiaEmMeses() {
        return this.garantiaEmMeses;
    }

    public void setGarantiaEmMeses(int garantiaEmMeses) {
        this.garantiaEmMeses = garantiaEmMeses;
    }
}
