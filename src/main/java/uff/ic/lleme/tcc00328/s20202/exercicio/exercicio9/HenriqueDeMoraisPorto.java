/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio9;

/**
 *
 * @author HeMp2
 */
import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = 0;
        int x = 0;
        int y = 1;
        for (int temp = 1; n > temp; temp++) {
            v = y + x;
            x = y;
            y = v;
        }
        if (n == 1)
            System.out.println(y);
        else
            System.out.println(v);

    }
}
