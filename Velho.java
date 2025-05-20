public class Velho extends Imovel {   //velho herda de imovel
    double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Desconto (imóvel velho): R$ " + desconto);
        System.out.println("Preço com desconto: R$ " + (preco - desconto));
    }
}
