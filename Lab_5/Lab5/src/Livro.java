public class Livro extends Produto implements Transportavel{

    private int numeroDePaginas;

    private float peso;

    public Livro(float preco, String descricao, String marca, int numeroDePaginas, float peso){
        super(preco, descricao, marca); // Isso pois já tem no 'Produto'
        this.numeroDePaginas = numeroDePaginas;// Um adendo aos livros que diferenciam do produto comum
        this.peso = peso;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public float getPeso(){
        return peso;
    }

}