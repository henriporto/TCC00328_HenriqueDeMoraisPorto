package uff.ic.lleme.tcc00328.s20201.exercicios.tutorialOO.HenriqueDeMoraisPorto;
public class Aluno extends Pessoa {
    private String matricula, unidade;
    private Inscricao[] inscricoes;
    public Aluno(String nome, String cpf, String matricula, String unidade){
        super(nome, cpf);
        this.matricula = matricula;
        this.unidade = unidade;
        
    }
    public void setInscricao(Inscricao[] inscricoes){
        this.inscricoes = inscricoes;
    }
    public Inscricao[] getInscricao(){
        return this.inscricoes;
    }
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    @Override
    public void print(){
        System.out.println("Cpf: "+getCpf()+" Matricula: "+matricula+" Unidade: "+unidade+" Nome: "+getNome());
    }
    
}
