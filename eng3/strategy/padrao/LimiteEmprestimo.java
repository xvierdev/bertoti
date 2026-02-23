public class LimiteEmprestimo implements EmprestimoStrategy {
    private long limite;

    public LimiteEmprestimo(long limite) {
        this.limite = limite;
    }

    @Override
    public long Emprestimo(long value) {
        if (value <= limite) {
            return value;
        }
        return -1;
    }
}
