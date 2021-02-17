/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio13;

/**
 *
 * @author HeMp2
 */
import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de valores reais");
        int n = in.nextInt();
        System.out.println("Digite cada valor abaixo:");
        double soma = 0;

        for (int i = 0; i < n; i++)
            soma += in.nextDouble();
        System.out.println(soma / n);
    }
}
