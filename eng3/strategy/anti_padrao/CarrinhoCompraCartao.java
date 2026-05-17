package strategy.anti_padrao;

public class CarrinhoCompraCartao extends CarrinhoCompra {
    private String numeroCartao;

    public CarrinhoCompraCartao(int valorTotal, String numeroCartao) {
        super(valorTotal);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void finalizarCompra() {
        System.out.println("Pago " + valorTotal + " com cartão final " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
