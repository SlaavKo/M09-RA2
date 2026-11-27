import java.util.Random;

public class Treballador extends Thread {
    private float souAnualBrut;
    public float cobrat;
    private int edatInici;
    private int edatFi;
    private int edat = 0;
    private Random rand;

    public Treballador(String id, float souAnualBrut, int edatInici, int edatFi) {
        super(id);
        cobrat = 0.0f;
        this.souAnualBrut = souAnualBrut;
        this.edatInici = edatInici;
        this.edatFi = edatFi;
        rand = new Random();
    }

    public void cobra() { cobrat = cobrat + souAnualBrut/12; }

    public void pagaImpostos() { cobrat -= souAnualBrut/12 * 0.24f; }
    
    public float getCobrat() { return cobrat; }
    public int getEdat() { return edat; }
    
    @Override
        public void run() {
            for(edat= 0; edat < edatFi; edat++) {
                if(edat >= edatInici && edat <= edatFi) {
                    for(int i = 0; i < 12; i++) {
                        cobra();
                        pagaImpostos();
                    }
                    try {
                        Thread.sleep(rand.nextInt(100));
                    } catch(InterruptedException e) {
                        System.out.println(e.getMessage());
                    }

                }
                
            }
            
        }
}
