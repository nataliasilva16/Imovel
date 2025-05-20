public class Main {
    public static void main(String[] args) {
        Novo imovelNovo = new Novo("Rua Nova, 123", 300000, 25000);
        Velho imovelVelho = new Velho("Rua Velha, 456", 300000, 15000);

        System.out.println("=== Imóvel Novo ===");
        imovelNovo.imprimirDados();

        System.out.println("\n=== Imóvel Velho ===");
        imovelVelho.imprimirDados();
    }
}
