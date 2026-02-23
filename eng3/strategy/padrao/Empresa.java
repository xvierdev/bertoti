public class Empresa extends ClienteComum {
    public final String cnpj;

    public Empresa(String idConta, long saldo, String cnpj, long limiteEmprestimo) {
        super(idConta, saldo, new LimiteEmprestimo(limiteEmprestimo));
        this.cnpj = cnpj;
    }
}
