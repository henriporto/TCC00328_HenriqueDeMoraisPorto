package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio20.HenriqueDeMoraisPorto;
import java.util.ArrayList;

public class Reserva {
    //Quando um cliente deseja fazer reserva de 2 quartos ou mais, serão criadas 2 ou mais reservas no sistema.
    
    private int numero;
    private Cliente cliente;
    private int tipo; //Tipo do quarto
    private int inicio; //Cliente fará check-in daqui a "inicio" dias.
    private int fim; //Cliente fará check-out daqui a "fim" dias.
    

    public Reserva(int numero, String nome, String id, String telefone,int tipo, int inicio, int fim) {
        this.numero = numero;
        this.cliente = new Cliente(nome, id, telefone);
        this.inicio = inicio;
        this.fim = fim;
        this.tipo=tipo;
    }
    public static boolean disponibilidade(int inicio, int fim, int tipo, Hotel hotel){
        // metodo analisar matriz reservasTotaisPorData 1, 2, 3 e descobre se a data para reserva está disponivel caso tenha apartamentos desse tipo disponiveis.
        if (tipo==1){
            for (int a=inicio; a<fim; a++){
               if (hotel.getReservasTotaisPorData1()[a][0] >= hotel.getHotelNumApt(1)){
                   return false;
               }
            }
            return true;
        }
        else if (tipo==2){
            for (int a=inicio; a<fim; a++){
               if (hotel.getReservasTotaisPorData2()[a][0] >= hotel.getHotelNumApt(2)){
                   return false;
               }
            }
            return true;
        }
        else if (tipo==3){
            for (int a=inicio; a<fim; a++){
               if (hotel.getReservasTotaisPorData3()[a][0] >= hotel.getHotelNumApt(3)){
                   return false;
               }
            }
            return true;
        }
        else{
                System.out.println("Error, disponibilidade() type: "+tipo);
                return false;
                }        
    }
    public static ArrayList<Reserva> inputReservaArray(Reserva reserva, ArrayList<Reserva> reservas, Hotel hotel){
        //Coloca reserva dentro do arraylist de reservas, caso a data esteja disponivel.
        if (Reserva.disponibilidade(reserva.getInicio(), reserva.getFim(), reserva.getTipo(), hotel)){
            reservas.add(reserva);
            Hotel.numeroReserva++;
            HenriqueDeMoraisPorto.ok=1; //aprova atualização da matriz reservas por data 
            System.out.println("Reserva inserida e confirmada com sucesso.");
            return reservas;
        }else{
            System.out.println("Data indisponivel, reserva não inserida.");
            return reservas;
        }
    }

    public int getInicio() {
        return inicio;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getFim() {
        return fim;
    }
}
