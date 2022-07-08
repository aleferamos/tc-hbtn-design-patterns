public class Impressao {

    int paginasTotais;
    int paginasColoridas;
    boolean ehFrenteVerso;
    double valorColoridasFrenteVerso;
    double valorPretoBrancoFrenteVerso;


    double valorColoridasFrenteApenas;
    double valorPretoBrancoFrenteApenas;

    double calcularTotal(){
        return 0;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, frente e verso. " +
                "total: %.2f", paginasTotais, paginasColoridas, paginasTotais - paginasColoridas,
                valorColoridasFrenteVerso + valorPretoBrancoFrenteVerso + valorColoridasFrenteApenas +
                        valorPretoBrancoFrenteApenas);
    }
}
