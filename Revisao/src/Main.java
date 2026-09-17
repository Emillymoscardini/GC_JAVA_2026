//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MensagemNotificacao mensagem = new MensagemNotificacao("Olá");
        EnviadordeNotificacao email = new NotificadorPorEmail();
        ServicoNotificador emailService = new ServicoNotificador(email);
        emailService.enviar("Pedro", mensagem);
        EnviadordeNotificacao sms = new NotificadorPorSms();
        ServicoNotificador smsService = new ServicoNotificador(sms);
        smsService.enviar("678675", mensagem );

    }
}