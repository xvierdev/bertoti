public class Aposentado extends Cliente {
    public Aposentado(int idConta, long saldo, long limiteEmprestimo) {
        super(idConta, saldo, new LimiteEmprestimo(limiteEmprestimo));
    }
}
