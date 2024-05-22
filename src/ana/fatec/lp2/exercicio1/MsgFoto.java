package ana.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem{
    private int tamanho;

    public MsgFoto(int tamanho,Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
