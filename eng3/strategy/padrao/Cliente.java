public class Cliente {
    public final String idConta;
    private long saldo;
    private EmprestimoStrategy emprestimoStrategy;

    public Cliente(String idConta, long saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.emprestimoStrategy = new SemEmprestimo();
    }

    public Cliente(String idConta, long saldo, EmprestimoStrategy strategy) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.emprestimoStrategy = strategy;
    }

    public long ConsultaSaldo() {
        return this.saldo;
    }

    public void Deposito(long value) {
        if (value > 0) {
            saldo += value;
        }
    }

    public long Saque(long value) {
        if (value > 0) {
            if (value < saldo) {
                saldo -= value;
                return value;
            }
        }
        return -1;
    }

    public long Emprestimo(long value) {
        return emprestimoStrategy.Emprestimo(value);
    }

    public void setEmprestimoStrategy(EmprestimoStrategy strategy) {
        this.emprestimoStrategy = strategy;
    }
}
