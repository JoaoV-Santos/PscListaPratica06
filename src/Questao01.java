import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[9];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o número " + (i + 1) + ":");
            numeros[i] = in.nextInt();
        }

        int primo = 0;
        for (int n : numeros) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    primo++;
                }
            }
        }



        in.close();
    }
}
