public class ItemPedido {

   private TipoItemPedido tipo;
   private String nome;

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " - " + tipo + " " + nome + "\n";
    }
}
