public class Fracao {
    /** Essa classe é feita para representar uma fração. Onde temos o numerador, denominador e o sinal (positivo ou negativo) **/
    private int numerador;
    private int denominador;
    private boolean sinal; // true => positivo, false => negativo

    /* Construtor com 2 parâmetros (podem ser negativos) */
    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new RuntimeException("Denominador não pode ser zero");
        }

        // Determinando o sinal da fração ao ver o sinal do denominador e o sinal do numerador, se os sinais forem diferentes => negativo, se os sinais forem iguais => positivo.
        if ((numerador < 0 && denominador > 0) || (numerador > 0 && denominador < 0)) {
            this.sinal = false;
        } else {
            this.sinal = true;
        }

        this.numerador = Math.abs(numerador); // pegando os valores absolutos do numerador e denominador e armazenando no nosso this (bem parecido com o self no Python)
        this.denominador = Math.abs(denominador);
    }

    /* Construtor com 3 parâmetros (não podem ser negativos) */
    public Fracao(int numerador, int denominador, boolean sinal) {
        if (numerador < 0 || denominador <= 0) {
            throw new RuntimeException("Numerador deve ser não-negativo e denominador positivo");
        }

        this.numerador = numerador;
        this.denominador = denominador;
        this.sinal = sinal; // Aqui nesse caso dos 3 parâmetros, o sinal da frente já foi dado!
    }
    // Abaixo, os clássicos " get's " notei também a desnecessidade de usar o this, mas preferi usar o this pois ele já foi declarado no construtor.
    public int getNumerador() {
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }

    public boolean getSinal() {
        return this.sinal;
    }

    public double getValorNumerico() {
        double valor = (double) this.numerador / this.denominador;
        return this.sinal ? valor : -valor; // Aqui retornamos o valor numérico da fração a depender do sinal da frente apenas
    }

    public Fracao getFracaoIrredutivel() {
        int mdc = Aritmetica.calcularMdc(numerador, denominador);

        if (mdc == 1) {
            return this;
        }

        return new Fracao(numerador / mdc, denominador / mdc, sinal); // Aqui retornamos a fração irredutivel, caso ela não seja a própria fração
    }

    // Aqui estamos sobrescrevendo um método que já existe no java e não criando um novo, usando o Override para isso (não dá erro se tirar, já testei sem, mas daria erro de tentar usar o toString do próprio java)
    @Override
    public String toString() {
        /** Função para transformar a fração em uma string. **/
        if (numerador == 0) {
            return "0";
        }

        String sinalStr = sinal ? "" : "-";

        if (denominador == 1) {
            return sinalStr + numerador;
        }

        return sinalStr + numerador + "/" + denominador;
    }
}