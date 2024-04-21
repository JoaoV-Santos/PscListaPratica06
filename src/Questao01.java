//Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe nove números:");
        int[] numeros = new int[9];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
        }

        int primo = 0;

        System.out.println("Os números primos e suas respectivas posições são:");
        for (int i = 0; i < numeros.length; i++) {
            primo = 0;
            for (int j = 1; j <= numeros[i]; j++) {
                if (numeros[i] % j == 0)
                    primo++;
            }
            if (primo == 2)
                System.out.println(numeros[i] + " posição " + (i + 1));
        }


        in.close();
    }
}