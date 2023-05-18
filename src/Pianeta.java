import it.kibo.fp.lib.RandomDraws;

import java.util.ArrayList;

public class Pianeta {
    private String nome;
    private String ID_Pianeta;
    private double massaPianeta;
    private ArrayList<Luna> lune;
    private int x;
    private int y;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID_Pianeta() {
        return ID_Pianeta;
    }

    public void setID_Pianeta(String ID_Pianeta) {
        this.ID_Pianeta = ID_Pianeta;
    }

    public double getMassaPianeta() {
        return massaPianeta;
    }

    public void setMassaPianeta (double massaPianeta) {
        this.massaPianeta = massaPianeta;
    }

    public ArrayList<Luna> getLune() {
        return lune;
    }

    public void setLune(ArrayList<Luna> lune) {
        this.lune = lune;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Pianeta(String ID_Pianeta, ArrayList<Luna> lune) {
        this.ID_Pianeta=ID_Pianeta;
        this.lune = new ArrayList<Luna>();
    }
    public Pianeta () {
        int x = RandomDraws.drawInteger(-20,20);
        int y = RandomDraws.drawInteger(-20,20);
    }
    public Posizione getPosizione () {
        return new Posizione(x,y);
    }

    public String vediNOme(){
        StringBuffer s =new StringBuffer();
        s.append("Il nome è: "+this.nome);
        return s.toString();
    }


    public String visualizzaPianeta(){
        StringBuffer s=new StringBuffer();
        s.append(this.vediNOme());
        s.append("l'ID è: ");
        s.append(this.ID_Pianeta+"\n");
        s.append("la massa è : "+this.massaPianeta);
        s.append("la posizione è : "+this.x+"x e "+this.y+"y\n");
        for(int i=0;i<this.lune.size();i++) {
            s.append(this.lune.get(i).vediLuna()+"\n");
        }
        return s.toString();
    }


}
//stampa pianeti

