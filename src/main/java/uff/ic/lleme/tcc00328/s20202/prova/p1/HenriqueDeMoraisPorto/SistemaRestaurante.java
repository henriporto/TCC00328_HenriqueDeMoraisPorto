package uff.ic.lleme.tcc00328.s20202.prova.p1.HenriqueDeMoraisPorto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaRestaurante {
    private static Pedido pedidos[];
    private static Prato pratos[];
    
    public static void main(String args[]) throws IOException{
        String pasta = "src"+File.separator+"main"+File.separator+"java"+File.separator+"uff"+File.separator+"ic"+File.separator+"lleme"+File.separator+"tcc00328"+File.separator+"s20202"+File.separator+"provas"+File.separator+"p1"+File.separator+"HenriqueDeMoraisPorto"+File.separator;
        ler_pratos(pasta + "arquivoPratos.txt");
        /* 
        O arquivoPedidos funciona da forma: 
        A primeira linha contem o numero de pedidos;
        A palavra fim indica o final de cada pedido.
        */
        ler_pedidos(pasta + "arquivoPedidos.txt"); 
        emitir_conta();
        // Questão 2:
        percentual();
        
    }
    public static void percentual(){
        System.out.println("\n--- Percentual de pedidos por pratos ---");
        for (Pedido pedido : pedidos){
            for (Item item : pedido.getColecao()){
                if (item.getQuantidade()>=1) item.getPrato().somaVezesqueaparece();
            }
        }
        for (Prato prato : pratos){
            double conta = (prato.getVezesqueaparece() / pedidos.length)*100.00;
            System.out.println(prato.getNome()+" aparece em " +conta+"% dos pedidos.");
        }
    }
    public static void ler_pratos(String nomeArquivo) throws IOException{
        int num_pratos=0;
        BufferedReader buff = new BufferedReader(new FileReader(nomeArquivo));
        while(buff.readLine()!=null)num_pratos++;
        buff.close();
        buff = new BufferedReader(new FileReader(nomeArquivo));
        String linha;
        pratos = new Prato[num_pratos];
        for (int a=0; a<num_pratos; a++){
            linha = buff.readLine();
            Prato prato = new Prato();
            prato.setPreco(Double.parseDouble(linha.split(" ")[0]));
            String nome_do_prato=""; int cont=0;
            for (String b : linha.split(" ")){
                if(cont!=0){
                    if (cont==1){
                        nome_do_prato+=b;
                    }
                    else{
                        nome_do_prato+=" " + b;
                    }
                }
                cont++;
            }
            prato.setNome(nome_do_prato);
            pratos[a] = prato;
        }
        buff.close();
    }
    public static void ler_pedidos(String nomeArquivo) throws IOException {
        int num_linhas=0;
        BufferedReader buff = new BufferedReader(new FileReader(nomeArquivo));
        while(buff.readLine()!=null)num_linhas++;
        buff.close();
        int num_pedidos;
        buff = new BufferedReader(new FileReader(nomeArquivo));
        num_pedidos=Integer.parseInt(buff.readLine().split(" ")[0]);
                
        String linha;
        pedidos = new Pedido[num_pedidos];
        for (int a=0; a<(num_pedidos); a++){
            linha = buff.readLine();
            ArrayList<Item> itemlist = new ArrayList<Item>();
            while(!(linha.equals("fim") || linha.equals("fim\n"))){
                Item item = new Item();
                item.setQuantidade(Integer.parseInt(linha.split(" ")[0]));
                String nome_prato="";
                for (int j=1; j<linha.split(" ").length; j++){
                    if(j==1){
                        nome_prato+=linha.split(" ")[j];
                    }
                    else{
                        nome_prato+=" "+linha.split(" ")[j];
                    }
                }
                
                for (Prato p : pratos){
                    if (p.getNome().equals(nome_prato)){
                        item.setPrato(p);
                        break;
                    }
                }
                itemlist.add(item); 
                linha = buff.readLine();
            }
            Item[] itemarray = new Item[itemlist.size()];
            itemlist.toArray(itemarray);   
            Pedido temp = new Pedido();
            temp.setColecao(itemarray); 
            pedidos[a] = temp;
            
        }
        buff.close();
    }
    public static void emitir_conta(){
        double conta=0;
        for (Pedido pedido : pedidos){
            for (Item item : pedido.getColecao()){
                conta += item.getQuantidade() * item.getPrato().getPreco();
            }
        }
        System.out.println("Valor da conta: "+conta+" Reais.");
    }
}
