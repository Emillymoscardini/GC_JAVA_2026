public class MensagemNotificacao {
    private final String mensagem;

    public MensagemNotificacao(String remetente, String mensagem){
        this.mensagem = mensagem;
    }

    public MensagemNotificacao (String mensagem){
        if (mensagem.isBlank()){
            throw new IllegalArgumentException("mensagem não pode ser enviada");
        }
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }
}
