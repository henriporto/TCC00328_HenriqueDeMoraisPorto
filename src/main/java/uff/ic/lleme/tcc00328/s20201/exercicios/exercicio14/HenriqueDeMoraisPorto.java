package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio14;

import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static float determinante(float[][] A) {
        if (A.length == 0)
            return 0;
        else if (A.length == 1)
            return A[0][0];
        else if (A.length == 2)
            return ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0]));
        else {
            int tam = A.length;
            float det = (float) 0;
            for (int j = 1; j <= tam; j++)

                det += A[0][j - 1] * (float) Math.pow(-1, 1 + j) * determinante(submatriz(A, 1, j));
            return det;

        }
    }

    public static float[][] submatriz(float[][] A, int i, int j) {
        j--;
        i--;
        int tam = A.length;
        float[][] sub = new float[tam - 1][tam - 1];
        int contador = 0;
        float[] vet = new float[(tam - 1) * (tam - 1)];
        for (int x = 0; x < tam; x++)
            for (int y = 0; y < tam; y++)
                if (x != i && y != j) {
                    vet[contador] = A[x][y];
                    contador++;
                }
        contador = 0;
        for (int x = 0; x < (tam - 1); x++)
            for (int y = 0; y < (tam - 1); y++) {
                sub[x][y] = vet[contador];
                contador++;
            }
        return sub;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a ordem da matriz: ");
        int tam = in.nextInt();
        float[][] M = new float[tam][tam];
        float a;
        for (int i = 0; i < tam; i++)
            for (int j = 0; j < tam; j++) {
                System.out.println("Digite M[" + i + "][" + j + "]");
                a = in.nextFloat();
                M[i][j] = a;
            }
        System.out.println("Determinante: " + determinante(M));

    }

}
