
package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20.HenriqueDeMoraisPorto;
import java.util.Scanner;

public class Hospedagem {
    private Cliente cliente;
    private String origem, destino;
    private int numeroReserva;
    private HospedesAnexos[] hospedesanexos;
    private int chaveDoSeuApartamento;
    public Hospedagem(Hotel hotel, int numeroReserva, String nome, String id, String telefone, String endereco, String nacionalidade, String origem, String destino, int t){
        this.cliente = new Cliente(nome, id, telefone);
        cliente.setEndereco(endereco);
        cliente.setNacionalidade(nacionalidade);
        this.origem=origem;
        this.destino=destino;
        if (numeroReserva==0 && t == 0){
            //quando nao ha reserva
            Scanner a = new Scanner(System.in);
            int inicio = a.nextInt();
            int fim = a.nextInt();
            int tipo = a.nextInt();
            if (Reserva.disponibilidade(inicio, fim, tipo, hotel)){
                //vejo se esta disponivel
                darChave(hotel, tipo);
                
            }
            else{
                    System.out.println("Hotel cheio!");
                    }
        }
        else{
            this.numeroReserva=numeroReserva;
            darChave(hotel, t);
        }
    }
    
    private void darChave(Hotel hotel, int a){
        for (Apartamento apt : hotel.getApartamentos()){
                    if(apt.getDisponibilidadeatual()==0 && apt.getTipo()==a){
                        System.out.println("O numero de seu quarto é: "+apt.getChave()+" (Andar/quarto)");
                        this.chaveDoSeuApartamento=apt.getChave();
                        apt.setDisponibilidadeatual(1);
                        break;
                    }
                }
    }
    
    
    public void addHospedesAnexos(int numeroDeHospedes, int tipodoapt){
        if (numeroDeHospedes > Apartamento.MaxtApt(tipodoapt)){
            System.out.println("Numero maximo de hospedes excedido");
            return;
        }
        hospedesanexos = new HospedesAnexos[numeroDeHospedes];
        for(int a=0; a<numeroDeHospedes; a++){
            Scanner in = new Scanner(System.in);
            System.out.println("Adicionando hospede anexo -> Digite nome, identidade, telefone, endereço, nacionalidade, origem e destino um por um.");
            String j = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            String d = in.nextLine();
            String e = in.nextLine();
            String f = in.nextLine();
            String g = in.nextLine();
            hospedesanexos[a]= new HospedesAnexos(j, b, c, d, e, f, g);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public HospedesAnexos[] getHospedesanexos() {
        return hospedesanexos;
    }

    public void setHospedesanexos(HospedesAnexos[] hospedesanexos) {
        this.hospedesanexos = hospedesanexos;
    }

    public int getChaveDoSeuApartamento() {
        return chaveDoSeuApartamento;
    }

    public void setChaveDoSeuApartamento(int chaveDoSeuApartamento) {
        this.chaveDoSeuApartamento = chaveDoSeuApartamento;
    }
    
    
}
