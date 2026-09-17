public class ServicoNotificador {
    private final EnviadordeNotificacao enviador;

    public ServicoNotificador(EnviadordeNotificacao enviador){
        this.enviador = enviador;
    }
    public void enviar(String remetente , MensagemNotificacao mensagem){
        enviador.enviar(remetente, mensagem.getMensagem());
    }
}
