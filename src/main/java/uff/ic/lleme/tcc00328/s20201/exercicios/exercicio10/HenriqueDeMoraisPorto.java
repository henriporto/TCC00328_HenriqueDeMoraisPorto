
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;

import java.util.Scanner;
public class HenriqueDeMoraisPorto {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(pii(n));
    }
    public static double pii(int n){
        double resultado = 0;
        for (int i=0; i<=n-1; i++){
            resultado +=  (Math.pow(-1, i)) / ((2*i) + 1);
        }
        return (4*resultado);
    }
    
}