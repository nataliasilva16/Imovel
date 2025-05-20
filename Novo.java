public class Novo extends Imovel {    //novo herda de imovel
    double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Adicional (imóvel novo): R$ " + adicional);
        System.out.println("Preço total: R$ " + (preco + adicional));
    }
}
