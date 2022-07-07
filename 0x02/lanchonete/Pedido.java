import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensDentroCaixa = new HashSet<>();
        this.itensForaCaixa = new HashSet<>();
    }


    void adicionarItemDentroCaixa(ItemPedido item){
        this.itensDentroCaixa.add(item);
    }

    void adicionarItemForaCaixa(ItemPedido item){
        this.itensForaCaixa.add(item);
    }


    @Override
    public String toString() {

        return ("    Fora da Caixa: \n" + itensForaCaixa  +
                "    Dentro da caixa: \n" + itensDentroCaixa).replace("[", "")
                .replaceAll("\\]", "").replace(", ","");
    }
}
