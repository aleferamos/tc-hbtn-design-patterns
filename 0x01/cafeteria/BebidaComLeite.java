import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    List<String> obterIngredientes() {
        List<String> result = new ArrayList<>(super.obterIngredientes());
        result.add("leite");
        return result;
    }

    @Override
    double obterPreco() {
        return bebidaDecorada.obterPreco() + 3.2;
    }
}
