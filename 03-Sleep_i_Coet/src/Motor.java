import java.util.Random;

public class Motor extends Thread {
    private int id;
    private int actPot = 0;
    private int objPot = 0;
    private boolean esPrimer = true;
    private Random rand = new Random();

    public Motor(int id) { this.id = id; }

    public void setPotencia(int pot) { objPot = pot; esPrimer = false; }

    @Override
    public void run() {
        while (true) {
            boolean state = actPot < objPot;
            String accio = (state) ? "Incre." : "Decre.";
            if(actPot != objPot) {
                try {
                    Thread.sleep(1000 + rand.nextInt(1001));
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                if(state) actPot++;
                else actPot--;
                if(actPot == objPot) accio = "FerRes";
                System.out.printf("Motor %d: %s        Objectiu: %d        Actual: %d\n", id, accio, objPot, actPot);
            } else {
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                if(!esPrimer && objPot == 0 && actPot == 0) break;
            }
        }
    }
}
