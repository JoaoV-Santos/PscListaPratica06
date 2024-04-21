/* Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor
 * resultante deve conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter, no máximo, oito posições,
 * que não poderão ser completamente utilizadas.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numeros = new int[8];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = in.nextInt();
        }

        for (int n : numeros) {
            if (n > 0)
                pos.add(n);
            else
                neg.add(n);
        }

        int[] positivos = new int[pos.size()];
        int[] negativos = new int[neg.size()];

        for (int i = 0; i < pos.size(); i++) {
            positivos[i] = pos.get(i);
        }
        for (int i = 0; i < neg.size(); i++) {
            negativos[i] = neg.get(i);
        }

        System.out.println("\nNúmeros positivos:");
        for (int n : positivos) {
            System.out.print(n + " | ");
        }
        System.out.println("\nNúmeros negativos:");
        for (int n : negativos) {
            System.out.print(n + " | ");
        }



        in.close();
    }
}
