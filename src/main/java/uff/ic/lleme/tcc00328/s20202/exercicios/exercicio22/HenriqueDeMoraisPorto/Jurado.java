package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio22.HenriqueDeMoraisPorto;

public class Jurado {
    private String nome;
    private int[][] notas;

    public Jurado(String nome, int quantidadeDeEscolas) {
        this.nome = nome;
        this.notas = new int[10][quantidadeDeEscolas]; //10 quesitos
        //encho vetor notas de "-1" inicialmente.
        for (int[] a : notas){
            for (int b=0; b<a.length; b++){
                a[b]=-1;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }
    public void print(){
        System.out.println("Notas do "+nome+":");
        printMatriz(notas); 
    }
    public void printMatriz(int[][] m){
        try{
            int r = m.length;
            int c = m[0].length;
            String str = "|\t";

            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    str += m[i][j] + "\t";
                }

                System.out.println(str + "|");
                str = "|\t";
            }

        }catch(Exception e){System.out.println("Matrix is empty!!");}
    }
}
