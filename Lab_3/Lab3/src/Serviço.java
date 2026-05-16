public class Serviço {

    private float preco;

    private String descricao;

    private int garantiaEmMeses;

    public Serviço(float preco, String descricao, int garantiaEmMeses){
        this.preco = preco;
        this.descricao = descricao;
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public float getPreco(){
        return preco;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getGarantiaEmMeses(){
        return garantiaEmMeses;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setGarantiaEmMeses(int garantiaEmMeses){
        this.garantiaEmMeses = garantiaEmMeses;
    }
}