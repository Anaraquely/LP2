package ana.fatec.lp2.exercicio2;

public class Produto extends Supermercado{
    private String nome;
    private String unidade;
    private  String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, String nome1, String unidade, String descricao, double preco, double descontoMaximo, Supermercado supermercado) {
        super(nome);
        this.nome = nome1;
        this.unidade = unidade;
        this.descricao = descricao;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(double descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", unidade='" + unidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", descontoMaximo=" + descontoMaximo +
                ", supermercado=" + supermercado +
                '}';
    }
}
