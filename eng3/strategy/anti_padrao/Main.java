package strategy.anti_padrao;

public class Main {
    public static void main(String[] args) {
        // O tipo de objeto está travado na criação.
        
        System.out.println("--- Anti-Padrao (Heranca): Teste 1: Dinheiro ---");
        CarrinhoCompra carrinho1 = new CarrinhoCompraDinheiro(100);
        carrinho1.finalizarCompra();

        System.out.println("\n--- Anti-Padrao (Heranca): Teste 2: Pix ---");
        CarrinhoCompra carrinho2 = new CarrinhoCompraPix(100);
        carrinho2.finalizarCompra();

        System.out.println("\n--- Anti-Padrao (Heranca): Teste 3: Cartao ---");
        CarrinhoCompra carrinho3 = new CarrinhoCompraCartao(100, "1234-5678-9012-3456");
        carrinho3.finalizarCompra();

        // PROBLEMA: Se o usuário quiser trocar a forma de pagamento, ele precisa criar
        // um novo carrinho.
    }
}
