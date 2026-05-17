package observer.padrao;

public class EmailApp implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("EmailApp recebeu: " + mensagem);
    }
}
