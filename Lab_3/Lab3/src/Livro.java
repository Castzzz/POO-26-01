public class Livro extends Produto{

    private int numeroDePaginas;

    public Livro(float preco, String descricao, String marca, int numeroDePaginas){
        super(preco, descricao, marca); // Isso pois já tem no 'Produto'
        this.numeroDePaginas = numeroDePaginas; // Um adendo aos livros que diferenciam do produto comum
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

}
