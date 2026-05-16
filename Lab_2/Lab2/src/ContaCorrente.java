public class ContaCorrente {

    private long numero;

    private Pessoa correntista;

    private float saldoEmReais;

    /**
     * Até quanto o saldo da conta pode ficar negativo.
     */
    private int limiteDoChequeEspecial;

    public ContaCorrente(long numero, Pessoa correntista){
        this.numero = numero;
        this.correntista = correntista;
        this.saldoEmReais = 0;
        this.limiteDoChequeEspecial = 1000;
    }

    public long getNumero() {
        return numero;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }
}
