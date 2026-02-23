public class Main {
    public static void main(String[] args) {
        ClienteComum cc = new ClienteComum("cc1", 1000);
        System.out.println("ClienteComum saldo inicial: " + cc.ConsultaSaldo());
        cc.Deposito(500);
        System.out.println("Depois deposito 500: " + cc.ConsultaSaldo());
        long saque = cc.Saque(200);
        System.out.println("Saque 200 retornou: " + saque + ", saldo: " + cc.ConsultaSaldo());
        long saqueInvalid = cc.Saque(2000);
        System.out.println("Saque 2000 retornou: " + saqueInvalid);

        Estudante est = new Estudante("est1", 300);
        System.out.println("Estudante saldo inicial: " + est.ConsultaSaldo());
        est.Deposito(200);
        System.out.println("Estudante depois deposito: " + est.ConsultaSaldo());

        Empresa emp = new Empresa("emp1", 5000, "12.345.678/0001-99", 10000);
        System.out.println("Empresa emprestimo 8000: " + emp.Emprestimo(8000));
        System.out.println("Empresa emprestimo 20000: " + emp.Emprestimo(20000));

        Aposentado ap = new Aposentado("ap1", 1500, 2000);
        System.out.println("Aposentado emprestimo 1500: " + ap.Emprestimo(1500));
        System.out.println("Aposentado emprestimo 3000: " + ap.Emprestimo(3000));

        // exemplo dinâmico: alterar estratégia em tempo de execução
        cc.setEmprestimoStrategy(new LimiteEmprestimo(500));
        System.out.println("ClienteComum (agora com limite 500) emprestimo 400: " + cc.Emprestimo(400));
        System.out.println("ClienteComum (agora com limite 500) emprestimo 600: " + cc.Emprestimo(600));
    }
}
