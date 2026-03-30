public class Empresa extends Cliente {
    public final String cnpj;
    private long limiteEmprestimo;

    public Empresa(int idConta, long saldo, String cnpj, long limiteEmprestimo) {
        super(idConta, saldo);
        this.cnpj = cnpj;
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
