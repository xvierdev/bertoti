public class Aposentado extends Cliente {
    private long limiteEmprestimo;

    public Aposentado(int idConta, long saldo, long limiteEmprestimo) {
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
