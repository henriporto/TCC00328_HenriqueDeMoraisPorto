package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21;

public class Disciplina {
    private String nome;
    private String tipo; //preferencial ou alternativa;
    private Turma[] turmas;

    public Disciplina(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        criarTurmas(2);
    }

    public void criarTurmas(int qtd){
        turmas = new Turma[qtd];
        for(int i = 0; i < qtd; i++){
            turmas[i] = new Turma(this, i);
        }
    }

    public String getNome(){
        return nome;
    }

    public Turma[] getTurmas(){
        return turmas;
    }

    public String getTipo(){
        return tipo;
    }

    public void print(){
        System.out.print(nome + " " + tipo);
    }
}
