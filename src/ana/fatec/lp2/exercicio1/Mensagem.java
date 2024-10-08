package ana.fatec.lp2.exercicio1;


public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;

    }

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
//    public abstract Mensagem sendMensage(String mensagem);

    @Override
    public String toString() {
        return "Mensagem{" +
                "destinatario=" + destinatario +
                ", horaEnvio='" + horaEnvio + '\'' +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
