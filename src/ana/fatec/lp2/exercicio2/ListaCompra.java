package ana.fatec.lp2.exercicio2;

import java.util.List;

public class ListaCompra implements Calculavel{
    private List<ItemCompra> itensCompra;
    private int qtdeMax;

    public Supermercado produtos(Supermercado supermercado){
        return supermercado;
    }
    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }
    public ItemCompra incluir(ItemCompra itensCompra){
        return itensCompra;
    }

    public ItemCompra getItensCompra() {
        return (ItemCompra) itensCompra;
    }

    public void setItensCompra(ItemCompra itensCompra) {
        this.itensCompra = (List<ItemCompra>) itensCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    @Override
    public double calcularPreco() {
        int soma = 0;
        for ( ItemCompra itemCompra: itensCompra ){

            double v = itemCompra.calcularPreco();
            soma += v;
        }
        return soma;
    }
}
