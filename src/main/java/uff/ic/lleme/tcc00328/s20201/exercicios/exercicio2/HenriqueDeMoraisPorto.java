package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;

import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        Scanner ola = new Scanner(System.in);
        int n = ola.nextInt();
        int temp = 1;

        int a = 1;
        while (n > a) {
            a++;
            temp = temp * a;
        }
        System.out.println(temp);
    }
}
