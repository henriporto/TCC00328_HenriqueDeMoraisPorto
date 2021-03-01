package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.HenriqueDeMoraisPorto;
public class Inscricao {
    private Aluno aluno; 
    private String data_matricula;
    private String data_cancelamento=null;
    private Disciplina disciplina;
    double[] notas;
    public Inscricao(Disciplina disciplina, Aluno aluno, String data_matricula){
        this.aluno=aluno;
        this.data_matricula=data_matricula;
        this.disciplina=disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(String data_matricula) {
        this.data_matricula = data_matricula;
    }

    public String getData_cancelamento() {
        return data_cancelamento;
    }

    public void setData_cancelamento(String data_cancelamento) {
        this.data_cancelamento = data_cancelamento;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public void print(){
        System.out.println("Cadastro: "+aluno.getNome()+" Disciplina: "+disciplina.getNome()+" Data matricula: "+data_matricula+" Data cancelamento: "+data_cancelamento);
        for(double a : notas){
            System.out.println("Nota: "+a);
        }
        
        
    }
}
