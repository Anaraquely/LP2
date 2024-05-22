package ana.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem{
    private int numChar;

    public MsgTexto(int numChar,Contatinho destinatario, String horaEnvio, String conteudo ) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
