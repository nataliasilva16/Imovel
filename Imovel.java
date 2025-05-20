public class Imovel {
    String endereco;
    double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public void imprimirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço base: R$ " + preco);
    }
}
