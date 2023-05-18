import it.kibo.fp.lib.RandomDraws;

import java.util.ArrayList;

public class Stella {
    private String nomeStella;
    private double massaStella;
    private int x;
    private int y;
    private ArrayList <Pianeta> pianeti=new ArrayList<>();

    public String getNomeStella() {
        return nomeStella;
    }

    public void setNomeStella(String nomeStella) {
        this.nomeStella = nomeStella;
    }

    public double getMassaStella() {
        return massaStella;
    }

    public void setMassaStella(double massaStella) {
        this.massaStella = massaStella;
    }


    public Stella(String nome, double massaStella) {
        this.nomeStella = nome;
        this.massaStella = massaStella;

    }

    public Stella(String nome, double massaStella, ArrayList<Pianeta> pianeti) {
        this.nomeStella = nome;
        this.massaStella = massaStella;
        this.pianeti.addAll(pianeti);
    }


    public String vediPianeti(){
        StringBuffer stringBuffe=new StringBuffer();
        stringBuffe.append("i pianeti sono "+ this.pianeti.size());
        for (Pianeta paineta : this.pianeti) {
            stringBuffe.append(paineta.visualizzaPianeta());
            stringBuffe.append("\n");
        }
        return stringBuffe.toString();
    }



}
