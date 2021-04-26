package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio23;

public class Item {
    private int quantidade;
    public Item(){
        
    }
    public Produto getProduto(){
        Produto produto = new Produto(); //
        return produto;
    }
    public int getQuanidade(){
        return this.quantidade;
    }
    public void setProduto(Produto produto){
        
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}
