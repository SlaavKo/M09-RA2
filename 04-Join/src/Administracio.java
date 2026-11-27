public class Administracio {
    private int numPoblacioAct = 50;
    private Treballador poblacioAct[] = new Treballador[50];

    public static void main(String[] args) {
        Administracio admin = new Administracio();
        for(Treballador t : admin.getTreballadors()) {
            t.start();
        }

        for(Treballador t : admin.getTreballadors()) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        for(Treballador t : admin.getTreballadors()) {
            System.out.printf("Ciutadà-%-2s    ->    edat: %d | total: %.2f\n", t.getName(), t.getEdat(), t.getCobrat());
        }


    }
    
    public Administracio() {
        for(int i = 0; i < numPoblacioAct; i++) {
            poblacioAct[i] = new Treballador("" + i, 25000, 20, 65);
        }
    }



    public Treballador[] getTreballadors() { return poblacioAct; }
}
