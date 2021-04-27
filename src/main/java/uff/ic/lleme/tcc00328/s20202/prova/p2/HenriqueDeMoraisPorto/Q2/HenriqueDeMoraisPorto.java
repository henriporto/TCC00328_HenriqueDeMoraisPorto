/*
Questão 2:
Escreva um programa Java multi-thread para calcular a média de valores dos números armazenados
em uma Coleção do tipo ArrayList<Double>.
 */
package uff.ic.lleme.tcc00328.s20202.prova.p2.HenriqueDeMoraisPorto.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class HenriqueDeMoraisPorto {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Double> colecao = new ArrayList<>();
        preencheColecao(colecao);

        PegaSoma a = new PegaSoma(colecao, 0, colecao.size() / 2);
        PegaSoma b = new PegaSoma(colecao, colecao.size() / 2, colecao.size());

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        PegaSoma.printaMedia();

    }

    public static void preencheColecao(ArrayList<Double> colecao) {
        System.out.println("Digite quantos elementos do tipo double deseja adicionar:");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        for (int c = 0; c < b; c++)
            colecao.add(a.nextDouble());
    }
}
