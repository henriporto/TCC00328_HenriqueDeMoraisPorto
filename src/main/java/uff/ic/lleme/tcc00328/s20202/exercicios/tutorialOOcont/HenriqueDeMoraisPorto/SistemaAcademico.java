package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.HenriqueDeMoraisPorto;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;  
import java.io.File;

public class SistemaAcademico {
    public static Aluno[] alunos;
    public static Disciplina[] disciplinas;
    public static Inscricao[] inscricoes;
    public static void main(String[] args) throws IOException {
        System.out.println("   _____ _     _                         _____ _____    _    _ ______ ______  \n" +
"  / ____(_)   | |                       |_   _|  __ \\  | |  | |  ____|  ____| \n" +
" | (___  _ ___| |_ ___ _ __ ___   __ _    | | | |  | | | |  | | |__  | |__    \n" +
"  \\___ \\| / __| __/ _ \\ '_ ` _ \\ / _` |   | | | |  | | | |  | |  __| |  __|   \n" +
"  ____) | \\__ \\ ||  __/ | | | | | (_| |  _| |_| |__| | | |__| | |    | |      \n" +
" |_____/|_|___/\\__\\___|_| |_| |_|\\__,_| |_____|_____/   \\____/|_|    |_|      \n" +
"                                                                              \n" +
"                                                                              ");
        String pasta = "src"+File.separator+"main"+File.separator+"java"+File.separator+"uff"+File.separator+"ic"+File.separator+"lleme"+File.separator+"tcc00328"+File.separator+"s20202"+File.separator+"exercicios"+File.separator+"tutorialOO"+File.separator+"HenriqueDeMoraisPorto"+File.separator;
        carregarAlunos(pasta + "arquivoAlunos.txt");
        carregarDisciplinas(pasta + "arquivoDisciplinas.txt");
        carregarInscricoes(pasta + "arquivoInscricoes.txt");
        informarNotasDeAlunos();
        calcularMedias();
        
    }
    
    
    public static void carregarAlunos (String nomeArquivo) throws IOException{
        int num_alunos=0;
        BufferedReader buff = new BufferedReader(new FileReader(nomeArquivo));       
        while(buff.readLine()!=null) {num_alunos++;}
        buff.close();
        buff = new BufferedReader(new FileReader(nomeArquivo));
        alunos = new Aluno[num_alunos];
        for(int i=0; i<num_alunos; i++){
            String linha=buff.readLine();
            String vetLinha[] = linha.split(" ");
            String nome= "";
            for (int j=3; j<vetLinha.length; j++){
                if(j!=(vetLinha.length-1)) nome+=vetLinha[j]+" ";
                else{
                    nome+=vetLinha[j];
                }
            }
            alunos[i]= new Aluno(nome, vetLinha[0], vetLinha[1], vetLinha[2]);
            //alunos[i].print();
            
        }
        buff.close();
    }
    public static void carregarDisciplinas(String nomeArquivo) throws IOException {
        int num_disciplinas=0;
        String linha;
        BufferedReader buff = new BufferedReader(new FileReader(nomeArquivo));
        while(buff.readLine()!=null)num_disciplinas++;
        buff.close();
        buff = new BufferedReader(new FileReader(nomeArquivo));
        disciplinas = new Disciplina[num_disciplinas];
        for(int i=0; i<num_disciplinas; i++){
            linha = buff.readLine();
            String vetLinha[] = linha.split(" ");
            String nome= "";
            for (int j=2; j<vetLinha.length; j++){
                if(j!=(vetLinha.length-1)) nome+=vetLinha[j]+" ";
                else{
                    nome+=vetLinha[j];
                }
            }
            disciplinas[i] = new Disciplina(vetLinha[0], vetLinha[1], nome);
            //disciplinas[i].print();
        }
        buff.close();        
    }
    public static void carregarInscricoes (String nomeArquivo)throws IOException{
        int num_inscricoes=0;
        String linha;
        BufferedReader buff = new BufferedReader(new FileReader(nomeArquivo));
        while(buff.readLine()!=null)num_inscricoes++;
        buff.close();
        if(num_inscricoes==0) return;
        buff = new BufferedReader(new FileReader(nomeArquivo));
        inscricoes = new Inscricao[num_inscricoes];
        for(int i=0; i<num_inscricoes; i++){
            linha = buff.readLine();
            String vetLinha[] = linha.split(" ");
            // 2 for para decodificar Disciplina e aluno
            int PosicaoAluno, PosicaoDisciplina;
            for(PosicaoAluno=0; PosicaoAluno<alunos.length; PosicaoAluno++){
                if(vetLinha[1].equals(alunos[PosicaoAluno].getMatricula())){
                    break;
                }
                if (PosicaoAluno == alunos.length - 1){
                    System.out.println("carregarInscricoes error (Aluno not found)");
                    buff.close();
                    return;
                }
            }
            for(PosicaoDisciplina=0; PosicaoDisciplina<disciplinas.length; PosicaoDisciplina++){
                if(vetLinha[0].equals(disciplinas[PosicaoDisciplina].getCodigo())){
                    break;
                }
                if (PosicaoDisciplina == disciplinas.length - 1){
                    System.out.println("carregarInscricoes error (Disciplina not found)");
                    buff.close();
                    return;
                }
            }
            Disciplina d = disciplinas[PosicaoDisciplina];
            Aluno a = alunos[PosicaoAluno];
            inscricoes[i] = new Inscricao(d, a, vetLinha[2]);
            
        }
        buff.close();
        
    }
    public static void informarNotasDeAlunos(){
        Scanner in = new Scanner(System.in);
        for (Inscricao a : inscricoes) {
            System.out.println("Digite o número de notas da disciplinas " + a.getDisciplina().getNome()+": ");
            int j = in.nextInt();
            System.out.println("Escreva as notas do aluno: " + a.getAluno().getNome());
            double[] vetNotas = new double[j];
            for(int i=0; i<j; i++){
                System.out.println("Nota "+(i+1)+": ");
                vetNotas[i] = in.nextDouble();
            }
            a.setNotas(vetNotas);
        }
    }
    public static void calcularMedias(){
        for (Inscricao ins : inscricoes) {
            System.out.println("Medias aritmeticas do aluno " + ins.getAluno().getNome() + ":");
            double media = 0;
            for (int t = 0; t < ins.getNotas().length; t++) {
                media += ins.getNotas()[t];
            }
            System.out.println(media / ins.getNotas().length);
        }
        
        
    }
}
