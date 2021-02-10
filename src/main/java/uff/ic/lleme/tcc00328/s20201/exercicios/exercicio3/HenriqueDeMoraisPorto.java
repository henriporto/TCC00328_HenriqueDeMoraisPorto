/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio3;

/**
 *
 * @author HeMp2
 */
import java.util.Scanner;
public class HenriqueDeMoraisPorto {
    public static void main(String[] args){
        Scanner la = new Scanner(System.in);
        int x = la.nextInt();
        int y = la.nextInt();
        int resto;
        do{ 
            resto = x%y;
            x=y;
            y=resto;
        }while(resto>0);
        System.out.println(x);
        
    }
}
