package strategy.anti_padrao;

// Classe base
public class CarrinhoCompra {
    protected int valorTotal;

    public CarrinhoCompra(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void finalizarCompra() {
        System.out.println("Processando compra genérica...");
    }
}
