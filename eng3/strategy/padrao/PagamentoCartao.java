package strategy.padrao;

public class PagamentoCartao implements PagamentoStrategy {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(int valor) {
        System.out.println("Pago " + valor + " com cartão final " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
