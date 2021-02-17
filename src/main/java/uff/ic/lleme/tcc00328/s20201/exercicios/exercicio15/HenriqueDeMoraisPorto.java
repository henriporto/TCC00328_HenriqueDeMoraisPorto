/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio15;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        System.out.println("Tamanho Vetor Números");

        float[] vetNum = {2.3F, 4, 55, 8, 999};
        float[] vetCAT = {2.2F, 3, 5, 80.1F};

        // print de teste:
        float[] temp = histograma(vetNum, vetCAT);
        for (int i = 0; i < temp.length; i++)
            System.out.println("Categoria " + i + " " + temp[i]);
        //
    }

    public static float[] histograma(float[] numeros, float[] categorias) {
        float[] vetor = new float[categorias.length];
        for (int a = 0; a < categorias.length; a++)
            vetor[a] = 0;
        // criei vetor do tamanho do categorias, mas cheio de zeros.

        int forasDaCategoria = 0;
        for (int a = 0; a < numeros.length; a++)
            if (categoria(numeros[a], categorias) != -1)
                vetor[categoria(numeros[a], categorias)] += 1;
            else
                forasDaCategoria += 1;
        // agora o vetor possui a pontuação por categoria.

        float[] v = new float[categorias.length];
        for (int a = 0; a < categorias.length; a++)
            v[a] = (vetor[a] / numeros.length) * 100;
        double p = (100 * forasDaCategoria) / numeros.length;
        System.out.println(p + " Porcento dos números estão fora de categoria.");
        return v;

    }

    public static int categoria(float numero, float[] categs) {
        if (numero < categs[0] || numero > categs[categs.length - 1])
            return -1;
        else if (numero == categs[categs.length - 1])
            return (categs.length - 2);
        else {
            for (int a = 1; a < categs.length; a++)
                if (categs[a - 1] <= numero && numero < categs[a])
                    return (a - 1);
            return -200000000;
        }
    }

}
