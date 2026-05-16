public class Aritmetica {

    /** Essa classe é feita para retornar o MDC de x e y.
     Se algum parâmetro for <= 0, lança RuntimeException (contexto da questão)**/
    public static int calcularMdc(int x, int y) {
        if (x <= 0 || y <= 0) {
            throw new RuntimeException("MDC requer parâmetros positivos e não-nulos.");
        }

        int a = Math.abs(x); // pegando os valores absolutos de x e y
        int b = Math.abs(y);

        while (b != 0) {
            int resto = a % b; // variável auxiliar para guardar o resto da divisão
            a = b;
            b = resto;
        }
        return a; // Aqui retornamos o MDC, se eu não me engano com o "Algorítmo de Euclides"
    }
}
