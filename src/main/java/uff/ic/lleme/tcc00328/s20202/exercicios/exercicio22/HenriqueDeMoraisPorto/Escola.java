package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio22.HenriqueDeMoraisPorto;

public class Escola {
    private int chave;
    private String nome;

    public Escola(int chave, String nome) {
        this.chave = chave;
        this.nome = nome;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void print(){
        System.out.println("Chave: "+chave+" Nome da escola: "+nome);
    }
    
}
