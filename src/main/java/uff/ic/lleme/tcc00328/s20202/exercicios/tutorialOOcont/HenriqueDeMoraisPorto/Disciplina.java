package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOOcont.HenriqueDeMoraisPorto;
public class Disciplina {
    private String codigo, nome, sigla;
    public Disciplina(String codigo, String sigla, String nome){
        this.codigo=codigo;
        this.nome=nome;
        this.sigla=sigla;
    }
    public void print(){
        System.out.println("Codigo: "+codigo+" Sigla: "+sigla+" Nome: "+nome);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
}
