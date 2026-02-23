public class Aposentado extends ClienteComum {
    private long limiteEmprestimo;

    public Aposentado(String idConta, long saldo, long limiteEmprestimo) {
        super(idConta, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    // Bad design
    public long Emprestimo(long value) {
        if (value <= limiteEmprestimo) {
            return value;
        } else {
            return -1;
        }
    }
}
