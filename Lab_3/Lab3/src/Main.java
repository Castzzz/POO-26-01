import java.util.Arrays;

public  class Main{
    public static void main(String[] args){

        Loja lojinha = new Loja();

        Produto p1 = new Produto(149.99f, "ouroboroide", "Wizards");
        Produto p2 = new Produto(5000f, "Pc 64gb ram", "GGwirz");

        Livro l1 = new Livro(100f, "A dança do fogo e gelo", "George R.R", 592);

        lojinha.cadastrarProduto(p1);
        lojinha.cadastrarProduto(p2);
        lojinha.cadastrarProduto(l1);

        Serviço s1 = new Serviço(200f, "trocar pasta termica do pc", 6);
        System.out.println("Serviço qualquer criado: " + s1.getDescricao() + " Garantia: " + s1.getGarantiaEmMeses());

        lojinha.vender("Pc 64gb ram");

        lojinha.vender("a Dança do Fogo e GELO");

        lojinha.vender("Casa");
    }
}