package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio21.HenriqueDeMoraisPorto;

public class Coordenador {
    private String nome;
    private Curso curso;

    public Coordenador(String nome){
        this.nome = nome;
    }

    public void defineDisciplinas(String nome, Disciplina[] disciplinas){
        curso = new Curso(nome, disciplinas);
    }

    public void defineAlunos(Aluno[] alunos){
        curso.setAlunos(alunos);
    }

    public String getNome(){
        return nome;
    }

    public Curso getCurso(){
        return curso;
    }
}
