import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[vetor1.length + vetor2.length];
        System.out.println("Informe os 10 valores do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = in.nextInt();
        }
        System.out.println("\nInforme os 10 valores do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor2[i] = in.nextInt();
        }
        int cont1 = 0;
        for (int i = 0; i < vetor3.length; i+=2) {
            vetor3[i] = vetor1[cont1];
            cont1++;
        }

        int cont2 = 0;
        for (int i = 1; i <= vetor3.length; i+=2) {
            vetor3[i] = vetor2[cont2];
            cont2++;
        }

        System.out.println("Vetor resultante da intercação dos vetores informados:");
        for (int n : vetor3)
            System.out.print(n + "|");

        in.close();
    }
}
