package observer.padrao;

public class Main {
    public static void main(String[] args) {
        Newsletter news = new Newsletter();
        
        EmailApp email = new EmailApp();
        SMSApp sms = new SMSApp();
        WppApp wpp = new WppApp();

        news.adicionarInscrito(email);
        news.adicionarInscrito(sms);
        news.adicionarInscrito(wpp);

        news.postarNoticia("Novo curso de Design Patterns lancado!");
    }
}
