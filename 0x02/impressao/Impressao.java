public class Impressao {

    private int paginasTotais;
    int paginasColoridas;
    boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    double valorPretoBrancoFrenteVerso;

    double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal(){
        return valorColoridasFrenteVerso + valorPretoBrancoFrenteVerso + valorColoridasFrenteApenas +
                        valorPretoBrancoFrenteApenas;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, frente e verso. " +
                "total: %.2f", paginasTotais, paginasColoridas, paginasTotais - paginasColoridas, calcularTotal());
    }
}
