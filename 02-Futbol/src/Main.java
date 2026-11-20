public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] noms = {
            "Piqué", "Vinicius", "Torres", "Ramos", 
            "Ronaldo", "Lewan", "Belli", "Arnau", 
            "Aspas", "Messi", "MBapé"
        };
        Futbolista jugadors[] = new Futbolista[noms.length];
        int i = 0;
        for(String nom : noms) {
            jugadors[i] = new Futbolista(nom);
            i++;
        }
        System.out.println("Inici dels xuts -------------");
        for(Futbolista jug : jugadors) {
            jug.start();
        }
        
        for (Futbolista jug : jugadors) {
            jug.join();
        }

        System.out.println("Fi dels xuts ---------------------");
        System.out.println("---------- Estadístiques ---------");
        for (Futbolista jug : jugadors) {
            
            System.out.printf("%s ==> %d\n", jug.getName(), jug.getGols());
        }
    }
}
