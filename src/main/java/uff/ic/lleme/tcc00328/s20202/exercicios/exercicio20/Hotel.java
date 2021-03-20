package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20;
import java.util.ArrayList;

public class Hotel {
    private String nome;
    private int andares;
    private final int QUARTOS_POR_ANDAR = 15;
    private Apartamento[] apartamentos;
    private ArrayList<Reserva> reservas1 = new ArrayList<Reserva>();
    private ArrayList<Reserva> reservas2 = new ArrayList<Reserva>();
    private ArrayList<Reserva> reservas3 = new ArrayList<Reserva>();
    private int[][] reservasTotaisPorData1 = new int[500][1]; //matriz com reservas por dia (500 dias)
    private int[][] reservasTotaisPorData2 = new int[500][1];
    private int[][] reservasTotaisPorData3 = new int[500][1];
    public static int numeroReserva = 1; //numero de reservas do hotel.

    public Hotel(String nome, int andares) {
        this.nome = nome;
        this.andares = andares;
        criarApartamentos();
        initRTPD();
    }
    public int getHotelNumApt(int tipo){
        int a = QUARTOS_POR_ANDAR/3;
        int b = andares * a;
        int c = (QUARTOS_POR_ANDAR-2*a)*andares;
        switch (tipo) {
            case 1 -> {
                return (b);
            }
            case 2 -> {
                return (b);
            }
            case 3 -> {
                return (c);
            } 
            default -> {return 0;}
        }
    }
    private void initRTPD(){
        //Aloco memoria para as matrizes reservasTotaisPorData 1, 2 e 3.
        for(int a=0;a<500; a++){
            reservasTotaisPorData1[a][0]= 0;
        }
        for(int a=0;a<500; a++){
            reservasTotaisPorData2[a][0]= 0;
        }
        for(int a=0;a<500; a++){
            reservasTotaisPorData3[a][0]= 0;
        }
    }
    private void criarApartamentos(){
        //Todos os andares possuem apartamentos dos 3 tipos, divididos igualmente caso possivel.
        apartamentos = new Apartamento[andares * QUARTOS_POR_ANDAR];
        int div = QUARTOS_POR_ANDAR /3;
        int cont = 0;
        for(int i = 1; i <= andares; i++ ){
            for (int j = 1; j <= QUARTOS_POR_ANDAR; j++) {
                if(j < div+1) apartamentos[cont] = new Apartamento((i*100+j), Apartamento.SIMPLES);
                else if (j < (div*2)+1) apartamentos[cont] = new Apartamento((i*100+j), Apartamento.DUPLO);
                else apartamentos[cont] = new Apartamento((i*100+j), Apartamento.FAMILIA);
                cont++;
            }
        }
    }
    
    public static void alteraVetReservasPorData(int inicio, int fim, int[][] reservasTotaisPorData){
        for (int i = inicio; i<fim; i++){
            reservasTotaisPorData[i][0]++;
        }
    }
    
    public void print(){
        System.out.println(apartamentos.length);
        for(Apartamento a: apartamentos){
            a.print();
        }
    }

    public int[][] getReservasTotaisPorData1() {
        return reservasTotaisPorData1;
    }

    public void setReservasTotaisPorData1(int[][] reservasTotaisPorData1) {
        this.reservasTotaisPorData1 = reservasTotaisPorData1;
    }

    public int[][] getReservasTotaisPorData2() {
        return reservasTotaisPorData2;
    }

    public void setReservasTotaisPorData2(int[][] reservasTotaisPorData2) {
        this.reservasTotaisPorData2 = reservasTotaisPorData2;
    }

    public int[][] getReservasTotaisPorData3() {
        return reservasTotaisPorData3;
    }

    public void setReservasTotaisPorData3(int[][] reservasTotaisPorData3) {
        this.reservasTotaisPorData3 = reservasTotaisPorData3;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    public ArrayList<Reserva> getReservas1() {
        return reservas1;
    }

    public void setReservas1(ArrayList<Reserva> reservas1) {
        this.reservas1 = reservas1;
    }

    public ArrayList<Reserva> getReservas2() {
        return reservas2;
    }

    public void setReservas2(ArrayList<Reserva> reservas2) {
        this.reservas2 = reservas2;
    }

    public ArrayList<Reserva> getReservas3() {
        return reservas3;
    }

    public void setReservas3(ArrayList<Reserva> reservas3) {
        this.reservas3 = reservas3;
    }



    public static int getNumeroReserva() {
        return numeroReserva;
    }

    public static void setNumeroReserva(int numeroReserva) {
        Hotel.numeroReserva = numeroReserva;
    }
    
}
