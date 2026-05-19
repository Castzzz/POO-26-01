public class Transportadora {

    public void transportar(Transportavel transportavel, String endereco){
        System.out.println("o item " + transportavel + ", com peso: " + transportavel.getPeso() + "kg foi enviado para " + endereco + "\n");
    }
}
