import java.util.ArrayList;

public abstract class Loja {

    private ArrayList<Vendavel> listaDeProdutos;

    private Transportadora transportadora;

    public Loja(Transportadora transportadora){
        this.listaDeProdutos = new ArrayList<>();
        this.transportadora = transportadora;
    }

    public void cadastrarProduto(Vendavel produto){
        listaDeProdutos.add(produto); // Adiciona o produto na lista
        System.out.println("produto = " + produto.getDescricao() + " cadastrado com sucesso \n"); // Mostra a mensagem de sucesso
    }

    public void vender(String descricaoProduto, String endereco){
        boolean produtoEncontrado = false;

        for (Vendavel produto : listaDeProdutos){
            if (produto.getDescricao().equalsIgnoreCase(descricaoProduto)){
                produtoEncontrado = true;
                System.out.println(descricaoProduto + " foi vendido \n");

                this.receberPagamento();

                if (!endereco.isEmpty()){//se o endereço tiver vazio a pessoa vai buscar então não imprime que não pode ser transportado
                    if (produto instanceof Transportavel){
                        transportadora.transportar((Transportavel) produto, endereco);
                    }
                    else{
                        System.out.println(descricaoProduto + " não pode ser transportado \n");
                    }
                }
                break;
            }
        }
        if (!produtoEncontrado){
            System.out.println("Produto não encontrado \n");
        }
    }

    public abstract void receberPagamento();
}