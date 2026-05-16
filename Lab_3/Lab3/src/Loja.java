import java.util.ArrayList;

public class Loja {

    private ArrayList<Produto> listaDeProdutos;

    public Loja(){
        this.listaDeProdutos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto){
        listaDeProdutos.add(produto); // Adiciona o produto na lista
        System.out.println("produto = " + produto.getDescricao() + " cadastrado com sucesso"); // Mostra a mensagem de sucesso
    }

    public void vender(String descricaoProduto){
        boolean produtoEncontrado = false;

        for (Produto produto : listaDeProdutos){
            if (produto.getDescricao().equalsIgnoreCase(descricaoProduto)){
                produtoEncontrado = true;
                System.out.println("A venda foi veita");

                break;
            }
        }
        if (!produtoEncontrado){
            System.out.println("Produto não encontrado");
        }
    }
}