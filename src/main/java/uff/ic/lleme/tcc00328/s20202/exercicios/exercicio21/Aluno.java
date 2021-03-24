package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21;

public class Aluno {
    private String nome;
    private Turma[] preferencial = new Turma[4];
    private int p = 0;
    private Turma[] alternativa = new Turma[2];
    private int a = 0;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public boolean temEspaco(Disciplina disciplina){
        if(disciplina.getTipo() == "preferencial"){
            if (p == 4) return false;
            return true;
        }
        else{
            if (a == 2) return false;
            return true;
        }
    }

    public void adicionaTurma(Turma turma){
        if(turma.getDisciplina().getTipo() == "preferencial"){
            preferencial[p] = turma;
            p++;
        }
        else{
            alternativa[a] = turma;
            a++;
        }
    }

    public boolean estaMatriculado(Disciplina disciplina){
        for(int i = 0; i < p; i++){
            if(preferencial[i].getDisciplina().getNome() == disciplina.getNome()){
                return true;
            }
        }
        for(int i = 0; i < a; i++){
            if(alternativa[i].getDisciplina().getNome() == disciplina.getNome()){
                return true;
            }
        }
        return false;
    }

    public void removeTurma(Disciplina disciplina){
        boolean stop = false;
        for(int i = 0; i < p; i++){
            if(stop == true) break;
            if(preferencial[i].getDisciplina().getNome() == disciplina.getNome()){
                for(int j = i + 1; j < p; j++){
                    preferencial[i] = preferencial[j];
                }
                p--;
                stop = true;
            }
        }
        for(int i = 0; i < a; i++){
            if(stop == true) break;
            if(alternativa[i].getDisciplina().getNome() == disciplina.getNome()){
                for(int j = i + 1; j < a; j++){
                    alternativa[i] = alternativa[j];
                }
                a--;
                stop = true;
            }
        }
    }

    public void print(){
        System.out.print(nome + " turmas: ");
        for(int i = 0; i < p; i++){
            preferencial[i].print();
        }
        for(int i = 0; i < a; i++){
            alternativa[i].print();
        }
        System.out.println("");
    }
}
