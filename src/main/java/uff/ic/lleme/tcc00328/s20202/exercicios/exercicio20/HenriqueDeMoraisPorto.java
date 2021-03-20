package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20;
import java.util.Scanner;
public class HenriqueDeMoraisPorto {
    public static int ok = 0;
    public static void main(String[] args) {
        //Crio hotel
        Hotel hotel = new Hotel("Copacabanana Split",1);
        System.out.println("Hotel "+ hotel.getNome()+"\n");
        //Operacao de reserva para reservar 2 quartos, um do tipo Simples e um do tipo Duplo para daqui a 20 dias, permanecendo 7 dias.
        opReserva("Henrique de Morais Porto", "276363306", "21972000346", 1, 20, 27, hotel);
        opReserva("Henrique de Morais Porto", "276363306", "21972000346", 2, 20, 27, hotel);
        
        System.out.println("\nOperacao de reserva para o caso de data indisponivel \n");
        //Para o tipo Duplo de quarto ficar indisponivel daqui a 21 e 22 dias, irei reservar o numero maximo de apartarmentos desse tipo nesse hotel, nesses dias:
        for (int a=0; a<4; a++){
            opReserva("Isadora de Morais Porto", "276363307", "21973000346", 2, 21, 23, hotel);
        }
        //tentando reservar nessa data e mostrando que não é possivel:
        opReserva("Henrique de Morais Porto", "276363306", "21972000346", 2, 20, 27, hotel);
        
        /*Operacao de hospedagem*/
        System.out.println("");
        Hospedagem hospedagem = new Hospedagem(hotel, 1, "Henrique de Morais Porto", "276363306", "21972000346", "Rua tavares de macedo 54", "Brasileira", "Niterói RJ", "Evento de Computacao em SP", 1);
        //Adicionar dois hospedes anexos:
        hospedagem.addHospedesAnexos(2, 1); //error se passar o numero permitido por apartamento do tipo especificado (no caso do tipo 1 = Simples)
        hospedagem.addHospedesAnexos(1, 1);
        
        /*Operacao encerramento de estadia*/
        Scanner in = new Scanner(System.in);
        System.out.println("Cliente sair com os hospedes? digite 1 para sim");
        int a= in.nextInt();
        if (a==1){
            for (Apartamento apt : hotel.getApartamentos()){
                if(apt.getChave()==hospedagem.getChaveDoSeuApartamento()){
                    apt.setDisponibilidadeatual(0);
                }
            }
        }
        else{
            System.out.println("Boa continuacao de estadia");
        }
        
        
    }
    public static void opReserva(String nome, String id, String telefone, int tipo, int inicio, int fim, Hotel hotel){
        //crio reserva
        Reserva reserva = new Reserva(hotel.numeroReserva, nome, id, telefone ,tipo, inicio, fim);
        //analiso se é valida e adiciono no Array de reservas do hotel.
        switch(tipo){
            case 1 -> {hotel.setReservas1(Reserva.inputReservaArray(reserva, hotel.getReservas1(), hotel)); if (ok==1){Hotel.alteraVetReservasPorData(inicio, fim, hotel.getReservasTotaisPorData1());System.out.println("Numero da reserva: "+ reserva.getNumero());} ok=0;}
            case 2 -> {hotel.setReservas2(Reserva.inputReservaArray(reserva, hotel.getReservas2(), hotel)); if (ok==1){Hotel.alteraVetReservasPorData(inicio, fim, hotel.getReservasTotaisPorData2());System.out.println("Numero da reserva: "+ reserva.getNumero());} ok=0;}
            case 3 -> {hotel.setReservas3(Reserva.inputReservaArray(reserva, hotel.getReservas3(), hotel)); if (ok==1){Hotel.alteraVetReservasPorData(inicio, fim, hotel.getReservasTotaisPorData3());System.out.println("Numero da reserva: "+ reserva.getNumero());} ok=0;}
            default -> System.out.println("Error, tipo incompativel no metodo: opReserva()");
        }
        
    }
}
