import java.util.Scanner;

public class Coet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Coet c = new Coet();
        c.arranca();
        while (true) {
            int num = Integer.parseInt(input.nextLine());

            c.passaAPotencia(num);
            if(num == 0) break;

        }

        input.close();
    }
    
    private Motor[] motors = new Motor[4];

    public Coet() {
        for(int i = 0; i < 4; i++) {
            motors[i] = new Motor(i);
        }
    }

    public void passaAPotencia(int pot) {
        if(pot < 0 || pot > 10) System.out.println("Error: potència fora de rang");
        else {
            System.out.printf("Passant a potència -> %s\n", pot);
            for(Motor m : motors) {
                m.setPotencia(pot);
            }
        }
    }

    public void arranca() {
        for(Motor m : motors) {
            m.start();
        }
    }

}
