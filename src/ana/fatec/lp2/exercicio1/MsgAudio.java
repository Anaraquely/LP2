package ana.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem{
    private int duracao;

    public MsgAudio(int duracao, Contatinho destinatario,String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
