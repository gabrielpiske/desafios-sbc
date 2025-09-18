
import java.util.Random;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int n = rand.nextInt(1, 1000);
        //int n = 5; //usado para testes
        int max = 10;
        int palpite = 0;

        for (int i = 0; i < max; i++) {
            System.out.print("?: ");
            palpite = scan.nextInt();

            if (n < palpite) {
                System.out.println("<");
            } else if (n == palpite) {
                System.out.println("=");
                System.out.println("! " + n);
                break;
            } else {
                System.out.println(">");
            }
            System.out.flush();
        }
    }
}
