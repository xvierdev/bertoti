public class Estudante extends Cliente {
    public Estudante(String idConta, long saldo) {
        super(idConta, saldo, new SemEmprestimo());
    }
}
