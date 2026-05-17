package strategy.padrao;

public class PagamentoCartao implements PagamentoStrategy {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(int valor) {
        System.out.println("Pago " + valor * 1.05 + " com cartao final " + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Com uma taxa de 5%.");
    }
}
