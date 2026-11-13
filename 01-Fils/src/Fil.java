public class Fil extends Thread {
    private long delay;
    public Fil(String nom, long delay) { 
        super(nom);
        this.delay = delay;
    }

    @Override 
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.printf("%s %d\n", getName(), i);
            if(delay > 0) {
                try {
                    sleep(delay);
                } catch (InterruptedException e) { System.out.println(e.getMessage()); }

            } else for (int y = 0; y < 1000; y++) {}
        }
        System.out.printf("Acaba el fil: %s\n", getName());
    }
}