package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21.HenriqueDeMoraisPorto;

public class Curso {
    private String nome;
    private Disciplina[] disciplinas;
    private Aluno[] alunos;

    public Curso(String nome, Disciplina[] disciplinas){
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public Aluno[] getAlunos(){
        return alunos;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }

    public String getNome(){
        return nome;
    }

    public Disciplina[] getDisciplinas(){
        return disciplinas;
    }

    public void printDisciplinas(){
        System.out.println("Disciplinas:");
        for (Disciplina a: disciplinas){
            a.print();
            System.out.print(" turmas: (");
            for(Turma b: a.getTurmas()){
                b.print();
                System.out.print(",");
            }
            System.out.println(")");
        }
    }
}
