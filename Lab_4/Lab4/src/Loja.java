import java.util.ArrayList;

// Classe que representa a loja virtual.

public class Loja {

    private ArrayList<Vendavel> itens;
    private String nome;
    private Transportadora transportadora;


    public Loja(String nome, Transportadora transportadora) {
        this.nome = nome;
        this.transportadora = transportadora;
        this.itens = new ArrayList<>();
    }


    public void cadastrarItem(Vendavel item) {
        if (item != null) {
            itens.add(item);
            // getClass().getSimpleName() a gente usou pra retornar o nome da classe real
            System.out.println("O " + item.getClass().getSimpleName() + " \"" + item.getDescricao() + "\" foi adicionado à loja " + this.nome);
        }
    }


    public void venderItem(String descricaoItem, String endereco) {
        for (Vendavel item : itens) {
            if (item.getDescricao().equals(descricaoItem)) {
                if (item instanceof Transportavel) {
                    Transportadora.transportar((Transportavel) item, endereco);
                    System.out.println("O item \"" + item.getDescricao() + "\" será enviado para: " + endereco);
                } else {
                    // Carro e Servico cairão aqui
                    System.out.println("O item \"" + item.getDescricao() + "\" deve ser retirado na loja " + this.nome);
                }

                System.out.println("Venda concluída: " + item.getClass().getSimpleName() + " \"" + item.getDescricao() + "\" vendido com sucesso!");
                return;
            }
        }

        // Se foi até aqui e não achou nada, mostra esse erro
        throw new RuntimeException("Erro: o item \"" + descricaoItem + "\" não foi encontrado na loja!");
    }

    public String getNome() {
        return this.nome;
    }
}