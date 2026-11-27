public class MainDemoFil {
    public static void main(String[] args) {
        Thread actFil = Thread.currentThread();

        System.out.println("MainDemoFil.main:");
        System.out.printf("Prioritat -> %s, Nom -> %s\n", actFil.getPriority(), actFil.getName());
        System.out.printf("toString() -> %s\n", actFil.toString());
    }

}
