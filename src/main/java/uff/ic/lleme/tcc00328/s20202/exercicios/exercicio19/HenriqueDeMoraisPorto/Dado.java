
package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio19.HenriqueDeMoraisPorto;

import java.util.Random;


public class Dado {
    private int valor;
    public void joga(){
        Random gerador = new Random();
        valor = gerador.nextInt(6)+1;
    }
    public int getValor(){
        return valor;
    }
    public void setValor(int valor){
        this.valor=valor;
    }
}
