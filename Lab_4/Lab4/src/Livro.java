public class Livro extends Produto implements Transportavel {

    private final int numeroDePaginas; // Final pois o número de paginas não muda
    private double peso; // Peso em kg

    public Livro(String descricao, String marca, double preco, int numeroDePaginas, double peso) {
        super(descricao, marca, preco); // chama o construtor de Produto
        this.numeroDePaginas = numeroDePaginas;
        this.peso = peso;
    }

    public int getNumeroDePaginas() {
        return this.numeroDePaginas;
    }

    // Implementação obrigatória da interface Transportavel
    @Override
    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
