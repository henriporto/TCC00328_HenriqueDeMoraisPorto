/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8;

import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int cont = 0;
        if (n == 1 || n <= 0)
            System.out.println("Não é primo!");
        else {
            for (int temp = 2; temp < n; temp++)
                if (n % temp == 0) {
                    System.out.println("Não é primo!");
                    cont = 1;
                    break;
                }
            if (cont != 1)
                System.out.println("É primo!");
        }

    }

}
