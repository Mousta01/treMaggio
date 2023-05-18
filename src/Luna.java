import it.kibo.fp.lib.RandomDraws;

public class Luna {
   private String nome;
   private String ID_lUNA;
   private double massaLuna;
   private int x;
   private int y;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID_lUNA() {
        return ID_lUNA;
    }

    public void setID_lUNA(String ID_lUNA) {
        this.ID_lUNA = ID_lUNA;
    }

    public double getMassaLuna() {
        return massaLuna;
    }

    public void setMassaLuna (double massaLuna) {
        this.massaLuna = massaLuna;
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


    public Luna(String ID_lUNA) {
        this.ID_lUNA=ID_lUNA;
    }
    public Luna () {
        int x = RandomDraws.drawInteger(-20, 20);
        int y = RandomDraws.drawInteger(-20, 20);
    }
    public Posizione getPosizione () {
        return new Posizione(x,y);
    }

    public String vediLuna(){
        StringBuffer s=new StringBuffer();
        s.append("il nome della luna é: " +this.nome);
        return s.toString();
    }

}
