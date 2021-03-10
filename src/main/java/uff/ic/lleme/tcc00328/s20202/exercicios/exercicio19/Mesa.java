
package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio19;
import java.util.Scanner;
public class Mesa {
    int ponto=0;int soma;
    public void apertar(Dado d1, Dado d2){
        System.out.println("Digite enter para lançar os dados");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        d1.joga();
        d2.joga();
    } 
    public void iniciar(){
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        apertar(d1, d2);
        soma=d1.getValor()+d2.getValor();
        switch (soma) {
            case 7, 11 -> System.out.println("Você venceu! Resultado: "+soma);
            case 2, 3, 12 -> System.out.println("Você Perdeu! Resultado: "+soma);
            default -> ponto = soma;
        }
        if (ponto==soma){
            System.out.println("Resultado: "+soma);
            fasedois(d1, d2);
        }
        
    }
    public void fasedois(Dado d1, Dado d2){
        while(true){
                apertar(d1, d2);
                soma=d1.getValor()+d2.getValor();
                if (soma==ponto){
                    System.out.println("Você venceu! Resultado: "+soma);
                    break;
                }
                else if(soma==7){
                    System.out.println("Você Perdeu! Resultado: "+soma);
                    break;
                }
                else{
                    System.out.println("Mais uma rodada, soma dos dados = "+soma);
                }
            }
    }
}
