package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20;

public class HospedesAnexos{
    private Cliente cliente;
    private String origem, destino;
    public HospedesAnexos(String nome, String id, String telefone, String endereco, String nacionalidade, String origem, String destino){
        this.cliente = new Cliente(nome, id, telefone);
        cliente.setEndereco(endereco);
        cliente.setNacionalidade(nacionalidade);
        this.origem=origem;
        this.destino=destino;
    }
}
