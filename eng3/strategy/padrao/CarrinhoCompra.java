package strategy.padrao;

public class CarrinhoCompra {
    private int valorTotal;
    private PagamentoStrategy estrategia;

    public CarrinhoCompra(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setPagamentoStrategy(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void finalizarCompra() {
        if (estrategia == null) {
            System.out.println("Erro: Nenhuma forma de pagamento selecionada!");
        } else {
            estrategia.pagar(valorTotal);
        }
    }
}
