package strategy.anti_padrao;

public class CarrinhoCompraCartao extends CarrinhoCompra {
    private String numeroCartao;

    public CarrinhoCompraCartao(int valorTotal, String numeroCartao) {
        super(valorTotal);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void finalizarCompra() {
        System.out.println("Pago " + valorTotal * 1.05 + " (+ 5% taxa) com cartao final " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
