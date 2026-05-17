package observer.padrao;

public class WppApp implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("WppApp recebeu: " + mensagem);
    }
}