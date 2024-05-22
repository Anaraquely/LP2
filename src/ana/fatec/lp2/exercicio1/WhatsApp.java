package ana.fatec.lp2.exercicio1;

public class WhatsApp extends Mensagem {
    private Contatinho contatos;
    private  Mensagem mensagem;

    public WhatsApp(Contatinho destinatario, String horaEnvio, String conteudo, Contatinho contatos, Mensagem mensagem) {
        super(destinatario, horaEnvio, conteudo);
        this.contatos = contatos;
        this.mensagem = mensagem;
    }

    public Contatinho listaContato(){
        return getContatos();
    }
    public Mensagem listarMensagens(){
        return getMensagem();
    }

    public Contatinho getContatos() {
        return contatos;
    }

    public void setContatos(Contatinho contatos) {
        this.contatos = contatos;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }


}
