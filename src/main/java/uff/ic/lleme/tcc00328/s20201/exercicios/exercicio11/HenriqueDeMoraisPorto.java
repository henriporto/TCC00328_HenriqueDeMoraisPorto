/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        int[] vet = new int[50];
        int contador = 0;
        int i = 0;
        while (contador != 50) {
            if (primo(i)) {
                vet[contador] = i;
                contador++;
            }
            i++;
        }
        for (int b = 0; b <= 49; b++)
            System.out.println(vet[b]);

    }

    public static boolean primo(int n) {
        if (n != 0 && n != 1) {
            int x = 2;
            while (n > x) {
                if (n % x == 0)
                    return false;
                x++;
            }
            return true;
        } else
            return false;
    }

}
