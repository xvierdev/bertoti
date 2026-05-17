package strategy.padrao;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompra carrinho = new CarrinhoCompra(100);

        // Cliente escolhe pagar em Dinheiro
        System.out.println("--- Teste 1: Dinheiro ---");
        carrinho.setPagamentoStrategy(new PagamentoDinheiro());
        carrinho.finalizarCompra();

        // Cliente muda de ideia e escolhe Pix
        System.out.println("\n--- Teste 2: Pix ---");
        carrinho.setPagamentoStrategy(new PagamentoPix());
        carrinho.finalizarCompra();

        // Cliente decide pagar no Cartão
        System.out.println("\n--- Teste 3: Cartão ---");
        carrinho.setPagamentoStrategy(new PagamentoCartao("1234-5678-9012-3456"));
        carrinho.finalizarCompra();
    }
}
