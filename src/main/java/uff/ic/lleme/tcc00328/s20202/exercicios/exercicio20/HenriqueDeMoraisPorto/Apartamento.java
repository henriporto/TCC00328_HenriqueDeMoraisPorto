package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20.HenriqueDeMoraisPorto;

public class Apartamento {
    protected static final int SIMPLES = 1;
    protected static final int DUPLO = 2;
    protected static final int FAMILIA = 3;
    
    private int chave;
    private int tipo;
    private int max_hospedes;
    private int disponibilidadeatual=0; //1 = indisponivel(em uso). 0 = disponivel.
    

    public Apartamento(int chave, int tipo) {
        this.chave = chave;
        this.tipo = tipo;
        switch(tipo){
            case 1 -> max_hospedes = 1;
            case 2 -> max_hospedes = 2;
            case 3 -> max_hospedes = 4;
            default -> System.out.println("Erro ao criar apartarmento (tipo inexistente)");
        }        
    }
    
    public static int MaxtApt(int tipo){
        if (tipo == 1) return 1;
        else if (tipo == 2) return 2;
        else if (tipo == 3) return 4;
        else{
            System.out.println("Error, MaxApt type: "+ tipo);
            return 0;
        }
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getMax_hospedes() {
        return max_hospedes;
    }

    public void setMax_hospedes(int max_hospedes) {
        this.max_hospedes = max_hospedes;
    }

    public int getDisponibilidadeatual() {
        return disponibilidadeatual;
    }

    public void setDisponibilidadeatual(int disponibilidadeatual) {
        this.disponibilidadeatual = disponibilidadeatual;
    }
    
    public void print(){
        System.out.println("Chave: "+ chave + " Tipo: " + tipo);
    }
}
