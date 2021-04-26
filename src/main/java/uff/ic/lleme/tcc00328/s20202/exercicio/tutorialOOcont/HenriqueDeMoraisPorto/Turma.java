
package uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOOcont.HenriqueDeMoraisPorto;


public class Turma{
    private Disciplina disciplina;
    private String horario, codigo;
    private int semestre;
    public Turma(String codigo, Disciplina disciplina, int semestre, String horario){
        this.codigo = codigo;
        this.disciplina=disciplina;
        this.horario=horario;
        this.semestre=semestre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public void print(){
        disciplina.print();
        System.out.println("Horário: "+horario+" Codigo: "+codigo+" Semestre: "+semestre);
    }
    
    
    
    
    
    
    
    
    
    
}
