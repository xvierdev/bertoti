public class Aposentado extends ClienteComum {
    public Aposentado(String idConta, long saldo, long limiteEmprestimo) {
        super(idConta, saldo, new LimiteEmprestimo(limiteEmprestimo));
    }
}
