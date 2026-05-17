package strategy.padrao;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(int valor) {
        System.out.println("Pago " + valor + " via PIX. Processando chave...");
    }
}
