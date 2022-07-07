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
        System.out.println("Fora da Caixa: ");
        itensForaCaixa.forEach(itemPedido -> {
            System.out.println("       " + itemPedido.toString());
        });

        System.out.println("Dentro da Caixa: ");
        itensDentroCaixa.forEach(itemPedido -> {
            System.out.println("       " + itemPedido.toString());
        });
        return "";
    }
}
