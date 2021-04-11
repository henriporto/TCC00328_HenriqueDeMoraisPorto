package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio22.HenriqueDeMoraisPorto;
import java.util.ArrayList;

public class Carnaval {
    private ArrayList<Jurado> jurados = new ArrayList();
    private Escola[] escolas;
    private int quantidadeDeEscolas;
    private String ano;

    public Carnaval(int quantidadeDeEscolas, String ano) {
        this.quantidadeDeEscolas = quantidadeDeEscolas;
        this.ano = ano;
    }

    public Escola[] getEscolas() {
        return escolas;
    }

    public void setEscolas(Escola[] escolas) {
        this.escolas = escolas;
    }

    public int getQuantidadeDeEscolas() {
        return quantidadeDeEscolas;
    }

    public void setQuantidadeDeEscolas(int quantidadeDeEscolas) {
        this.quantidadeDeEscolas = quantidadeDeEscolas;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public ArrayList<Jurado> getJurados() {
        return jurados;
    }

    public void setJurados(ArrayList<Jurado> jurados) {
        this.jurados = jurados;
    }

    public void print(){
        for (Jurado a : jurados){
            a.print();
        }
        for (Escola a : escolas){
            a.print();
        }
        System.out.println("Quantidade de escolas: "+quantidadeDeEscolas+" Ano: "+ano);
    }
    
}
