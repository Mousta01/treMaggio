import java.util.ArrayList;

public class Masse {
    private double massaStella;
    private ArrayList<Pianeta> pianeti;

    public Masse(double massaStella, ArrayList<Pianeta> pianeti) {
        this.massaStella = massaStella;
        this.pianeti = new ArrayList<Pianeta>();
    }
    // Calcolo massa  totale.
    public double CalcoloMassaTot() {
        double massaTot = massaStella;
        for (Pianeta pianeta : pianeti) {
            massaTot += pianeta.getMassaPianeta();
            for (Luna luna : pianeta.getLune()) {
                massaTot += luna.getMassaLuna();
            }
        }
        return massaTot;
    }
}


