package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio21.HenriqueDeMoraisPorto;

import java.util.ArrayList;

public class Turma {
    private Disciplina disciplina;
    private String nome;
    private int total = 30;
    private int atual = 0;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(Disciplina disciplina, int numero){
        this.disciplina = disciplina;
        nome = disciplina.getNome() +" "+ String.valueOf(numero + 1);
    }

    public boolean isCheio(){
        if (atual < total) return false;
        else return true;
    }

    public void matriculaAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public boolean estaNaTurma(Aluno aluno){
        if(alunos.contains(aluno)) return true;
        return false;
    }

    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public Disciplina getDisciplina(){
        return disciplina;
    }

    public String getNome(){
        return nome;
    }

    public void printAlunos(){
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).getNome());
        }
    }

    public void print(){
        System.out.print(nome);
        System.out.print(" ");
    }
}
