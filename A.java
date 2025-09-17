
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int nm_diretores = 0;
        int k_duracao = 0;
        int saida = 0;
        int intervaloTotal = 0;

        Scanner scanner = new Scanner(System.in);

        while (nm_diretores < 1 || nm_diretores > 100) {
            System.out.print("Entre com N: ");
            nm_diretores = scanner.nextInt();
        }

        while (k_duracao < 1 || k_duracao > 1000) {
            System.out.print("Entre com K: ");
            k_duracao = scanner.nextInt();
        }

        intervaloTotal = nm_diretores - 1;

        saida = (k_duracao - intervaloTotal) / nm_diretores;

        System.out.println("Tempo de Fala: " + saida);
    }
}
