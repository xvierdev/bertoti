package strategy.padrao;

public class PagamentoDinheiro implements PagamentoStrategy {
    @Override
    public void pagar(int valor) {
        System.out.println("Pago " + valor + " em dinheiro (com 10% de desconto). Total: " + (valor * 0.9));
    }
}
