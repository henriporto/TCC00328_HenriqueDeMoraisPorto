/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class HenriqueDeMoraisPorto {
    public static void main(String[] args){
        int i=1;
        long a=1;
        while(i<=50){
            if(primo(i)){
                a = a * i;
            }
            
            i++; 
        }
        System.out.println(a);
        
        
    }
    public static boolean primo(int n){
        if(n!= 0 && n!=1){
            int x=2;
            while(n>x){
                if (n%x == 0){
                    return false;
                }
                x++;
            }
            return true;
        }
        else{
            return false;
        }
    } 
    
}
