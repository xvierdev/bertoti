package observer.anti_padrao;

// Anti-padrão: Newsletter é responsável por enviar notificações para Email e SMS
public class Newsletter {
    private EmailApp emailApp = new EmailApp();
    private SMSApp smsApp = new SMSApp();
    private WppApp wppApp = new WppApp();

    public void postarNoticia(String noticia) {
        System.out.println("Newsletter (Anti-Padrao) postando: " + noticia);
        
        // Acoplamento forte: se eu quiser adicionar um PushNotificationApp, 
        // tenho que alterar esta classe.
        emailApp.enviarEmail(noticia);
        smsApp.enviarSMS(noticia);
        wppApp.enviarWpp(noticia);
    }
}
