package strategy.anti_padrao;

public class CarrinhoCompraDinheiro extends CarrinhoCompra {
    public CarrinhoCompraDinheiro(int valorTotal) {
        super(valorTotal);
    }

    @Override
    public void finalizarCompra() {
        System.out.println("Pago " + valorTotal + " em dinheiro (com 10% de desconto). Total: " + (valorTotal * 0.9));
    }
}
