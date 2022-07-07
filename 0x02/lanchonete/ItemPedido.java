public class ItemPedido {

    TipoItemPedido tipo;
    String nome;

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "        - " + tipo + " " + nome + "\n";
    }
}
