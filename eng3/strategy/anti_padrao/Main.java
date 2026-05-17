package strategy.anti_padrao;

public class Main {
    public static void main(String[] args) {
        // No anti-padrão de herança, o "tipo" do objeto está travado na criação
        
        System.out.println("--- Anti-Padrão (Herança): Teste 1: Dinheiro ---");
        CarrinhoCompra carrinho1 = new CarrinhoCompraDinheiro(100);
        carrinho1.finalizarCompra();

        System.out.println("\n--- Anti-Padrão (Herança): Teste 2: Pix ---");
        CarrinhoCompra carrinho2 = new CarrinhoCompraPix(100);
        carrinho2.finalizarCompra();

        System.out.println("\n--- Anti-Padrão (Herança): Teste 3: Cartão ---");
        CarrinhoCompra carrinho3 = new CarrinhoCompraCartao(100, "1234-5678-9012-3456");
        carrinho3.finalizarCompra();

        // PROBLEMA: E se o usuário quiser mudar a forma de pagamento no meio do checkout?
        // Você teria que destruir o objeto carrinho2 e criar um novo do tipo Cartão.
        // Com Strategy (composição), você apenas trocaria a estratégia interna.
    }
}
