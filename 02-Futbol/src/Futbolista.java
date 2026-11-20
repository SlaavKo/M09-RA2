import java.lang.Math;

public class Futbolista extends Thread {
    public static final int NUM_JUGADORS = 11;
    public static final int NUM_TIRADES = 20;
    public static final float PROBABILITAT = 0.5f;

    private int nGols;
    private int nTirs;

    public Futbolista(String nom) {
        super(nom);
        nGols = 0;
        nTirs = 0;
    }

    public int getGols() { return nGols; }

    public int getTIrs() { return nTirs; }

    public void setTirs(int tirs) { nTirs = tirs; }

    public void goooool() { nGols++; }

    @Override 
    public void run() {
        for(int i = 0; i < NUM_TIRADES; i++) {
            nTirs++;
            double tir = Math.random();

            if((float) tir < PROBABILITAT) goooool();
        }
    }
}
