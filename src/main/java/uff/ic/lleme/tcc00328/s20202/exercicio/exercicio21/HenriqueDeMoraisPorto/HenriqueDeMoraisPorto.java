package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio21.HenriqueDeMoraisPorto;

public class HenriqueDeMoraisPorto{
    public static Curso computacao;
    public static void main(String[] args) {
        Coordenador james = new Coordenador("James");
        Disciplina[] disciplinas = {
            new Disciplina("Calculo II", "preferencial"),
            new Disciplina("Algebra Linear", "preferencial"),
            new Disciplina("POO", "preferencial"),
            new Disciplina("Estrutura de Dados", "preferencial"),
            new Disciplina("Arquitetura de Programacao", "preferencial"),
            new Disciplina("Seguranca da Informacao", "alternativa"),
            new Disciplina("Engenharia Economica", "alternativa"),
            new Disciplina("Inteligencia de Negocios", "alternativa"),
        };
        Aluno[] alunos = {
            new Aluno("Henrique"),
            new Aluno("Lady Gaga"),
            new Aluno("Alexandro"),
        };
        james.defineDisciplinas("Computacao", disciplinas);
        james.defineAlunos(alunos);
        computacao = james.getCurso();
        // Questao 1
        matricula(computacao.getAlunos()[0],computacao.getDisciplinas()[0]);
        System.out.println("Questao 1: ");
        computacao.getAlunos()[0].print();
        // Questao 2
        remocaoMatricula(computacao.getAlunos()[0],computacao.getDisciplinas()[0]);
        System.out.println("Questao 2: ");
        computacao.getAlunos()[0].print();
        // Questao 3
        matricula(computacao.getAlunos()[0],computacao.getDisciplinas()[0]);
        matricula(computacao.getAlunos()[1],computacao.getDisciplinas()[0]);
        matricula(computacao.getAlunos()[2],computacao.getDisciplinas()[0]);
        System.out.println("Questao 3: ");
        consultaAlunos(computacao.getDisciplinas()[0]);
    }

    public static void matricula(Aluno aluno, Disciplina disciplina){
        boolean ok = false;
        if(aluno.temEspaco(disciplina) == false){
            System.out.println("numero de disciplinas do tipo" + disciplina.getTipo()+ "cheio");
        }else{
            for(Turma turma: disciplina.getTurmas()){
                if (turma.isCheio() == false && ok == false){
                    turma.matriculaAluno(aluno);
                    aluno.adicionaTurma(turma);
                    ok = true;
                }
            }
            if (ok = false){
                System.out.println("Todas as turmas estao cheias para a disciplina " + disciplina.getNome());
            }
        }
    }

    public static void remocaoMatricula(Aluno aluno, Disciplina disciplina){
        if (aluno.estaMatriculado(disciplina) == true){
            aluno.removeTurma(disciplina);
            for(Turma turma: disciplina.getTurmas()){
                if(turma.estaNaTurma(aluno))
                turma.removeAluno(aluno);
                }
        }else{
            System.out.println(aluno.getNome() + "nao esta matriculado em " + disciplina.getNome());
        }
    }

    public static void consultaAlunos(Disciplina disciplina){
        for(Turma turma: disciplina.getTurmas()){
            System.out.println(turma.getNome() + ": ");
            turma.printAlunos();
        }
    }
}