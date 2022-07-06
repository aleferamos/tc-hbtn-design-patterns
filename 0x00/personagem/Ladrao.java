import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ladrao extends Personagem{

    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);
        if(destreza < forca || destreza < inteligencia){
            throw new RuntimeException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (forca * 0.5) + (destreza * 0.35) + (vigor * 0.1) + (inteligencia * 0.05);
    }
}
