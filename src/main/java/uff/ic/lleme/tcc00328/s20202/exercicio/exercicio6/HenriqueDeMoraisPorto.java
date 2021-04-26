/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio6;

import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(pii(n));
    }

    public static double pii(int n) {
        double resultado = 0;
        int i = 0;
        while (i <= n - 1) {
            resultado += (Math.pow(-1, i)) / ((2 * i) + 1);
            i++;
        }
        return (4 * resultado);
    }

}
