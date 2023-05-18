

public class Posizione {
    private int x = 0;
    private int y = 0;

    public Posizione(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void sommaPosizioni(Posizione posizione) {
        x += posizione.getX();
        y += posizione.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
