public class NotificadorPorSms implements  EnviadordeNotificacao {
    @Override
    public void enviar(String remetente, String mensagem){

        System.out.println("Mensagem enviada via sms");
    }

}
