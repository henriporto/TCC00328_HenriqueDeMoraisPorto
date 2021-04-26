/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio7;

/**
 *
 * @author HeMp2
 */
import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        Scanner la = new Scanner(System.in);
        int x = la.nextInt();
        int y = la.nextInt();
        int resto;
        for (int cont = 0; cont <= (x + y); cont++)
            if (y > 0) {
                resto = x % y;
                x = y;
                y = resto;
            } else
                break;
        System.out.println(x);

    }
}
