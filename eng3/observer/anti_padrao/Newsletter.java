package observer.anti_padrao;

// No anti-padrão, a Newsletter conhece as classes concretas diretamente
public class Newsletter {
    private EmailApp emailApp = new EmailApp();
    private SMSApp smsApp = new SMSApp();

    public void postarNoticia(String noticia) {
        System.out.println("Newsletter (Anti-Padrão) postando: " + noticia);
        
        // Acoplamento forte: se eu quiser adicionar um PushNotificationApp, 
        // tenho que alterar esta classe.
        emailApp.enviarEmail(noticia);
        smsApp.enviarSMS(noticia);
    }
}
