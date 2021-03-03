package uff.ic.lleme.tcc00328.s20202.provas.p1.HenriqueDeMoraisPorto;

public class Prato {
    private String nome;
    private double preco;
    private double vezesqueaparece;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getVezesqueaparece() {
        return vezesqueaparece;
    }

    public void setVezesqueaparece(int vezesqueaparece) {
        this.vezesqueaparece = vezesqueaparece;
    }
    public void somaVezesqueaparece() {
        this.vezesqueaparece++;
    }
    
    
    
}
