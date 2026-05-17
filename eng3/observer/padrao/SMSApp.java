package observer.padrao;

public class SMSApp implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("SMSApp recebeu: " + mensagem);
    }
}
