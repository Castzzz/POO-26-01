public class Main {
    public static void main(String[] args) {

        Fracao v1 = new Fracao(4, 8);
        Fracao v2 = new Fracao(-3, 1);
        Fracao v3 = new Fracao(0, 5);
        /** Fracao v4 = new Fracao(2,0); **/
        Fracao v5 = new Fracao(-120, -220);

        System.out.println("Divisão entre 4 e 8 : " + v1);
        System.out.println("Seu resultado verdadeiro é : " + v1.getValorNumerico());
        System.out.println("Sua forma irredutível : " + v1.getFracaoIrredutivel());

        System.out.println();

        System.out.println("Agora -3 / 1: " + v2);
        System.out.println("Agora 0 / 5 : " + v3);
        /** Caso queira testar com v4 basta usar : System.out.println("Agora 2 / 0 : " + v4) todavia entra no erro, mas só testando abaixo para provar **/

        System.out.println();

        System.out.println("Agora -7 / -20 : " + v5);
        System.out.println("Seu resultado verdadeiro é : " + v5.getValorNumerico());
        System.out.println("Sua forma irredutível : " + v5.getFracaoIrredutivel());
        System.out.println();
    }
}
