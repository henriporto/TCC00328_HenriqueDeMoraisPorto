/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio12;

/**
 *
 * @author HeMp2
 */
import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int x = 1; x <= n; x++)
            if (n % x == 0)
                System.out.println(x);
    }
}
