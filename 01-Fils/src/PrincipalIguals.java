public class PrincipalIguals {
    public static void main(String[] args) {
        Fil pepe = new Fil("Pepe", 0);
        Fil joan = new Fil("Juan", 0);

        pepe.setPriority(Thread.MAX_PRIORITY);
        joan.setPriority(Thread.MAX_PRIORITY);

        pepe.start();
        joan.start();
        System.out.println("Acaba thread main");
    }
}
