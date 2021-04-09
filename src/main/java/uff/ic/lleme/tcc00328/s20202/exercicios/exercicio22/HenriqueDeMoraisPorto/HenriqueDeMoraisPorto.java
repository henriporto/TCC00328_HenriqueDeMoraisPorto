package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio22.HenriqueDeMoraisPorto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class HenriqueDeMoraisPorto {
    public static void main (String[] args){
        Carnaval carnaval = registrarNovoCarnaval();
        carnaval.setJurados(registrarNovoJurado(carnaval.getQuantidadeDeEscolas()));
        carnaval.setEscolas(registrarNovaEscola(carnaval.getQuantidadeDeEscolas()));
        registrarNotas(carnaval);
        computarResultado(carnaval,10);
        
        
    }
    
    public static Carnaval registrarNovoCarnaval(){
        System.out.println("Digite separados por espaço:\n -> Quantidade de escolas \n -> Ano");
        Scanner scan = new Scanner(System.in);
        String linha=scan.nextLine();
        
        Carnaval carnaval = new Carnaval(Integer.parseInt((linha.split(" ")[0])), linha.split(" ")[1]);
        return carnaval;
    }

    public static ArrayList<Jurado> registrarNovoJurado(int qtescolas){
        Scanner scan2 = new Scanner(System.in);
        int a=5;
        ArrayList<Jurado> tempList = new ArrayList();
        for (int b=0; b<a; b++){
            System.out.println("Digite o nome do "+b+"-ésimo jurado");
            String c = scan2.nextLine();
            tempList.add(new Jurado(c, qtescolas));
        }
        return tempList;
    }
    
    public static Escola[] registrarNovaEscola(int qtescolas){
        Escola[] escolas = new Escola[qtescolas];
        for (int a=0; a<escolas.length; a++){
            System.out.println("Digite o nome da "+a+"-ésima escola:");
            Scanner scan = new Scanner(System.in);
            escolas[a] = new Escola(a, scan.nextLine());
        }
        return escolas;
    }
    
    public static void registrarNotas(Carnaval carnaval){
        //considerando que existem 10 quesitos
        for(int a=0; a<10; a++){
            for (int c=0; c<carnaval.getQuantidadeDeEscolas(); c++){
                for (int b=0; b<carnaval.getJurados().size(); b++){
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Digite a nota do Quesito "+a+" da "+carnaval.getEscolas()[c].getNome()+" referente ao "+carnaval.getJurados().get(b).getNome());
                    int nota = scan.nextInt();
                    if (nota>=0) carnaval.getJurados().get(b).getNotas()[a][c] = nota;
                    else{
                        computarResultado(carnaval, a);
                        b--;
                        //carnaval.print();
                    }
                }
            }   
        } 
        
    }
        
    public static float[] removeMenorF(float[] vet) {
        
        return vet;
    }
    
    //recebe matriz de resultados e descobre se tem empatados
    public static boolean empatou(float[][] vet, int e, int q){
        
        float[] notas = new float[e];
        for (int a=0; a<e;a++){
            float aux = 0;
            for(int b=0; b<q; b++){
                aux += vet[a][b];
                
            }
            notas[a] = aux/(float)q; 
        }
        int aux=1;
        for(int a=0; a<notas.length; a++){
            if(notas[a]>notas[aux]){
                aux=a;
            }
        }
        int tam=0;
        for(int a=0; a<notas.length; a++){
            if(notas[a]==notas[aux]){
                tam++;
            }
        }
        if (tam==1){
            return false;
        }
        else if (tam>1){
            System.out.println("tam = "+tam);
            return true;
        }
        else{
            System.out.println("error: empatou()");
            return false;
        }
    }
    
    /*Recebe matriz de resultados, carnaval, tamanho das linhas e colunas da matriz de resultados. 
    Retorna os indices dos empatados/vecedor.*/
    public static int[] vencedor(float[][] vet, int e, int q){
        int[] vencedores;
        float[] notas = new float[e];
        for (int a=0; a<e;a++){
            float aux = 0; //Nota final escola da vez.
            for(int b=0; b<q; b++){
                aux += vet[a][b]; //somo as notas dos quesitos.
            }
            notas[a] = aux/(float)q; //divido as notas somadas pelo numero de quesitos. Depois coloco a nota final no vetor "notas".
        }
        
        /*rodo o vetor notas e retorno um vetor com o indice do maior ou maiores elementos (vencedores)
         ex {1, 2, 3, 4, 4} retorna -> {3, 4}*/
        
        //Primeiro encontro o maior elemento
        int aux=1;
        for(int a=0; a<notas.length; a++){
            if(notas[a]>notas[aux]){
                aux=a;
            }
        }
        //1- Depois encontro as posições que tem esse maior elemento: notas[aux] e adiciono no vetor de vencedores
        int tam=0;
        //1.1- rodo vetor notas e descobro a quantidade de vencedores
        for(int a=0; a<notas.length; a++){
            if(notas[a]==notas[aux]){
                tam++;
            }
        }
        //1.2- crio vetor vencedores e adiciono os indices dos vencedores
        vencedores = new int[tam];
        tam=0;
        for(int a=0; a<notas.length; a++){
            if(notas[a]==notas[aux]){
                vencedores[tam] = a;
                tam++;
            }
        }
        return vencedores;
    }
    
    
    public static void computarResultado(Carnaval carnaval, int numQuesitosJaCalculados){
        float cont=0;
        
        //vetor notasFinais que tera a nota FINAL de cada quesito em relacão a cada escola.
        float[][] notasFinais = new float[carnaval.getQuantidadeDeEscolas()][numQuesitosJaCalculados];
        
        /*coloco -1 em todos os espaços do vetor notasFinais.
        for (int e=0; e<carnaval.getQuantidadeDeEscolas(); e++){
            for (int q=0;q<numQuesitosJaCalculados; q++){
                notasFinais[e][q]=-1;
            }
        }*/
        
        // Percorro as notas dos jurados e preencho as notas finais de cada quesito no vetor notasFinais.
        for (int q=0; q<numQuesitosJaCalculados; q++){
            for (int e=0; e<carnaval.getQuantidadeDeEscolas(); e++){
                float vetCincoNotas[]= new float[5];
                for (int j=0; j<5;j++){ //para 5 jurados conforme exercicio.
                    vetCincoNotas[j] += carnaval.getJurados().get(j).getNotas()[q][e];
                }
                float[] vetQuatroNotas = removeMenorF(vetCincoNotas);
                for (int v=0; v<4; v++){
                    cont += vetQuatroNotas[v];
                }
                float calculo = cont/(float)4; // media das notas de quesito de uma escola.
                notasFinais[e][q] = calculo;
                cont=0;
            }
        }
        
        //regra de desempate e resultado da final do carnaval.
        if(empatou(notasFinais, carnaval.getQuantidadeDeEscolas(), numQuesitosJaCalculados)){
            int x = ThreadLocalRandom.current().nextInt(0, numQuesitosJaCalculados);
            System.out.println("Empate!\nQuesito sorteado = "+x);
            int[] vencedores = vencedor(notasFinais, carnaval.getQuantidadeDeEscolas(), numQuesitosJaCalculados);
            int aux=1; //aux carrega indice do vencedor.
            for (int a=0; a<vencedores.length-1; a++){
                if (notasFinais[vencedores[a]][x] > notasFinais[vencedores[aux]][x]) aux = a;
            }
            System.out.println("Escola vencedora: "+carnaval.getEscolas()[vencedores[aux]].getNome());
        }
        else{
            System.out.println("Escola vencedora: "+carnaval.getEscolas()[vencedor(notasFinais, carnaval.getQuantidadeDeEscolas(), numQuesitosJaCalculados)[0]].getNome());
        }
    }
}
