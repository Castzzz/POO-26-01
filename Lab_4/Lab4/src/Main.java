import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Vamos criar uma transportadora (fiquei sem ideia de nome pra transportadora):
        Transportadora Madureira = new Transportadora();

        Loja minhaLoja = new Loja("Mercadão de Madureira", Madureira);

        // Um produto simples sem ser livro
        Produto p1 = new Produto("Pasta de Dente", "Colgate Luminous White", 1.75);

        // Livro é Produto + Transportavel (tem peso)
        Livro l1 = new Livro("Senhor dos Anés", "Livro de ficção", 49.0, 231, 0.500);

        // Cuidado! O Carro é Produto, mas NÃO é Transportavel, nesse caso o cliente busca na loja
        Carro camaro = new Carro("Camaro", "Chevrolet", 530000.0); // Agora eu fiquei doooce igual caramelo, tô tirando onda de camaro amarelo

        // Já o 'Serviço' é Vendavel mas não é Transportavel
        Servico instalacao = new Servico(150.0, "Instalação de Som", 6);

        // Cadastrando aqui todos os nossos itens na loja 'minhaLoja'
        minhaLoja.cadastrarItem(p1);
        minhaLoja.cadastrarItem(camaro);
        minhaLoja.cadastrarItem(l1);
        minhaLoja.cadastrarItem(instalacao);

        System.out.println("\n--- Vendas ---");

        // Carro não é Transportavel → cliente retira na loja
        minhaLoja.venderItem("Camaro", "Brooklyn");

        System.out.println();

        // Livro é Transportavel, e outra, cuidado que eu escrevi o livro com acento, quando rodei sem acento (sem querer) deu erro, mas é por conta desse errinho, agora funcionou tudo
        minhaLoja.venderItem("Senhor dos Anés", "Avenida monsenhor felix, 8000");

        System.out.println();

        // Serviço não é Transportavel → cliente retira / prestado na loja
        minhaLoja.venderItem("Instalação de Som", "N/A");
        return;
    }
}
