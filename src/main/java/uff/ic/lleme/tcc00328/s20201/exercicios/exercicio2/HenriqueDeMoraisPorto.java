package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;
import java.util.Scanner;
        
public class HenriqueDeMoraisPorto {
    public static void main(String[] args) {
        Scanner ola = new Scanner(System.in);
        int n = ola.nextInt();
        int temp=1;
        
        int a=0;
        do{
            a++;
            temp=temp*a;
        }while(n>a);
        System.out.println(temp);
    }
}