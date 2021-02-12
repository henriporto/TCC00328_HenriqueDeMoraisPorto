/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;

/**
 *
 * @author HeMp2
 */
import java.util.Scanner;
public class HenriqueDeMoraisPorto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int temp=1;
        int i=2;
        if (n!=1 && n!=0 && n>0){ 
            while(i<n && temp!=0){
                if(n%i==0){
                    System.out.println("Não é primo!");
                    temp=0;
                }
                i++;
            }
            if (temp==0){
            }
            else{
                System.out.println("É primo!");
            }
        }
        else{System.out.println("Não é primo!");
        }
    
    
    
    }
    
}
