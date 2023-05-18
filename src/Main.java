import it.kibo.fp.lib.InputData;
import it.kibo.fp.lib.RandomDraws;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Messaggio di benvenuto
        System.out.println("Scopriamo insieme questo sistema stellare! ");
        System.out.println( );

        // L'utente deve inserire il nome della stella. Avendo utilizzato la funzione readNonEmptyString questo verificherà che l'utente scriva veramente o meno.
        String nomeStella= InputData.readNonEmptyString("Inserisci il nome della stella: ", false);

        // Posizione stella
            int xStella = RandomDraws.drawInteger(-20,20);
            int yStella = RandomDraws.drawInteger(-20,20);
        System.out.println("Posizione Stella: " + xStella + "x, " + yStella + "y");

        // L'utente deve inserire la massa della stella e con il do-while controllerò che l'utente scriva veramente sulla tastiera ciò che gli ho chiesto.
        double massaStella;
        boolean input = false;
        do {
            massaStella = InputData.readDouble("Inserisci la massa della stella: ");
            if (massaStella != 0) {
                input=true;
            }
            else {
                System.out.println("ERRORE ATTENZIONE, DIGITARE CORRETTAMENTE NUMERO MASSA STELLA");
            }
        } while (!input);

        System.out.println("Perfetto! ");
        System.out.println("Passo successivo.");

        // Crea in modo Random di numero pianeti che orbitano attorno alla Stella.
        ArrayList<Pianeta> pianeti = new ArrayList<>();;
        int numeriPianeti = RandomDraws.drawInteger(1,2);;
        System.out.println("Numero di pianeti che orbitano attorno alla Stella: " + numeriPianeti);

        // Ogni pianeta ha una specifica massa, un codive univoco (ID) e un numero di lune utilizzando la funzione Random.
        for (int i = 1; i < numeriPianeti; i++) {
            double massaPianeta = RandomDraws.drawDouble(10,1000); // Massa del pianeta casuale tra 1 e 1000.
            String ID_Pianeta = "PI "+ i;
            int numeriLune = RandomDraws.drawInteger(1,2);// Numero casuale di lune tra 1 e 50 che orbitano attorno ad ogni pianeta.
            // Ogni luna gli viene dato una massa casuale utilizzando la funzione Random e un codice univoco (ID).
            ArrayList<Luna> lune= new ArrayList<>();
            for (int j = 1; j < numeriLune; j++) {
                double massaLuna = RandomDraws.drawDouble(1,100); // Massa casuale tra 1 e 100.
                String ID_Luna= ID_Pianeta + "- MO" + j;
                Luna luna = new Luna (ID_Luna);
                lune.add(luna);
            }
            Pianeta pianeta = new Pianeta (ID_Pianeta, lune);
            pianeti.add(pianeta);

        }
        


        // Stampa la massa totale.
        Masse masse = new Masse(massaStella,pianeti);
        double massaTot = masse.CalcoloMassaTot();
        System.out.println("Massa totale del sistema è di kg: "+ massaTot);

        // Stampa posizione totale.
         Posizione posizioniTot = new Posizione(xStella,yStella);
        for (Pianeta pianeta : pianeti) {
            posizioniTot.sommaPosizioni(pianeta.getPosizione());

            for (Luna luna : pianeta.getLune()) {
                posizioniTot.sommaPosizioni(luna.getPosizione());
            }

        }
        Luna l=new Luna("idLuna");
        ArrayList <Luna> luneTemp=new ArrayList<>();
        luneTemp.add(l);
        pianeti.get(0).setLune(luneTemp);
        System.out.println("Somma totale delle posizione è di: " + posizioniTot.getX() + ", " + posizioniTot.getY());
        double divisioneX= posizioniTot.getX() / massaTot;
        double divsioneY= posizioniTot.getY() / massaTot;
        System.out.println("Il centro di massa vale: " + divisioneX + ", " + divsioneY);
        Stella sus=new Stella("cicco", 30, pianeti);
        System.out.println(sus.vediPianeti());
    }







    }

