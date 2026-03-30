public class Cliente {
    public final int idConta;
    private long saldo;

    public Cliente(int idConta, long saldo) {
        this.idConta = idConta;
        this.saldo = saldo;
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
}