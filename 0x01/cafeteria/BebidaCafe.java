import java.util.List;

public class BebidaCafe extends Bebida{

    @Override
    List<String> obterIngredientes() {
        return List.of("cafe");
    }

    @Override
    double obterPreco() {
        return 5.35;
    }
}
