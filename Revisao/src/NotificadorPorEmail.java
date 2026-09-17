public class NotificadorPorEmail implements  EnviadordeNotificacao{
    @Override
    public void enviar(String remetente,String mensagem){
        System.out.println("mensagem enviada por email");
    }

}
