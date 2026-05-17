package strategy.anti_padrao;

public class CarrinhoCompraPix extends CarrinhoCompra {
    public CarrinhoCompraPix(int valorTotal) {
        super(valorTotal);
    }

    @Override
    public void finalizarCompra() {
        System.out.println("Pago " + valorTotal + " via PIX. Processando chave...");
    }
}
