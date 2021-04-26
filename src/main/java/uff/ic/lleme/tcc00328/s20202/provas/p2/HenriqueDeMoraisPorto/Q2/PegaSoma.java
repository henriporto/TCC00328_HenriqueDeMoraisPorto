package uff.ic.lleme.tcc00328.s20202.provas.p2.HenriqueDeMoraisPorto.Q2;

import java.util.ArrayList;


public class PegaSoma implements Runnable{

    public static double soma;
    public static int index;
    private ArrayList<Double> colecao;
    private int comeco;
    private int fim;
    
    public PegaSoma(ArrayList<Double> colecao, int comeco, int fim){
        this.comeco=comeco;
        this.fim=fim;
        this.colecao=colecao;
    }
    
    @Override
    public void run() {
        for(int a=comeco; a<fim; a++){
            soma += colecao.get(a);
            index += 1;
        }
        
    }
    
    public static void printaMedia(){
        System.out.println(soma/index);
    }

    public static double getSoma() {
        return soma;
    }

    public static void setSoma(double soma) {
        PegaSoma.soma = soma;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        PegaSoma.index = index;
    }

    public ArrayList<Double> getColecao() {
        return colecao;
    }

    public void setColecao(ArrayList<Double> colecao) {
        this.colecao = colecao;
    }

    public int getComeco() {
        return comeco;
    }

    public void setComeco(int comeco) {
        this.comeco = comeco;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }
    
    
}
