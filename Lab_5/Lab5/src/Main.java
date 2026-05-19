import java.util.Arrays;

public  class Main{
    public static void main(String[] args){

        Transportadora DHL = new Transportadora();

        LojaCripto CriptoVendas = new LojaCripto(DHL);

        LojaPix PixVendas = new LojaPix(DHL);

        Produto p1 = new Produto(149.99f, "ouroboroide", "Wizards");
        Produto p2 = new Produto(5000f, "Pc 64gb ram", "GGwirz");
        Carro c1 = new Carro(90900.9f, "Kwid", "Renault");

        Livro l1 = new Livro(100f, "A dança do fogo e gelo", "George R.R", 592, 0.5f);

        PixVendas.cadastrarProduto(p1);
        CriptoVendas.cadastrarProduto(p2);
        PixVendas.cadastrarProduto(l1);
        CriptoVendas.cadastrarProduto(c1);

        Servico s1 = new Servico(200f, "trocar pasta termica do pc", 6);
        System.out.println("Serviço : " + s1.getDescricao() + " Garantia: " + s1.getGarantiaEmMeses() + "\n");

        CriptoVendas.cadastrarProduto(s1);

        PixVendas.vender("Pc 64gb ram", "Diomedes Trota, 401");

        CriptoVendas.vender("Pc 64gb ram", "Diomedes Trota, 401");

        PixVendas.vender("a Dança do Fogo e GELO", "Massaramduba, 900");

        CriptoVendas.vender("Casa", "CCMN");

        CriptoVendas.vender("Kwid", "CT UFRJ");

        PixVendas.vender("Trocar pasta termica do pc","");
    }
}