import java.util.Random;

public class DormAleatori extends Thread {

    public static void main(String[] args) {
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");

        joan.start();
        pep.start();

        System.out.println("--------- Fi del main ---------");
        
    }
    private long temps;
    private Random rand;

    public DormAleatori(String nom) {
        super(nom);
        temps = System.currentTimeMillis();
        rand = new Random();
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            int interval = rand.nextInt(1000);
            long tempsTot = System.currentTimeMillis()-temps;

            System.out.printf("%s(%d) a dormir %4dms total %dms\n", getName(), i, interval, tempsTot);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
