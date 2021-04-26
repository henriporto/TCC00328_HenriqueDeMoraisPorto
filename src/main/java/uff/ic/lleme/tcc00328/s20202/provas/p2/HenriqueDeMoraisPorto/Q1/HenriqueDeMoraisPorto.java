package uff.ic.lleme.tcc00328.s20202.provas.p2.HenriqueDeMoraisPorto.Q1;

import java.util.ArrayList;

public class HenriqueDeMoraisPorto {
    public static void main(String[] args) {
        //crio palavras
        Palavra livro = new Palavra("livro", "li-vro");
        Palavra obra = new Palavra("obra", "o-bra");

        //crio sinonimos
        Sinonimos sinonimo1 = new Sinonimos("coleção de folhas de papel, impressas ou não, reunidas em cadernos cujos dorsos são unidos por\n" +
    "meio de cola, costura etc., formando um volume que se recobre com capa resistente.");
        Sinonimos sinonimo2 = new Sinonimos("obra de cunho literário, artístico, científico etc. que constitui um volume [Para fins de\n" +
    "documentação, é uma publicação não periódica com mais de 48 páginas, além da capa.].");
        Sinonimos sinonimo3 = new Sinonimos("aquilo que resulta de um trabalho, de uma ação.");
        
        //crio colecoes de sinonimos
        ArrayList<Sinonimos> colecao = new ArrayList<>();
        colecao.add(sinonimo1);
        colecao.add(sinonimo2);
        
        ArrayList<Sinonimos> colecao2 = new ArrayList<>();
        colecao2.add(sinonimo2);
        colecao2.add(sinonimo3);
        
        livro.sinonimos = colecao;
        obra.sinonimos = colecao2;

        //crio dicionario
        Dicionario dic = new Dicionario();
        
        //incluo palavras nos dicionarios
        //dic.dicionario.put(obra, );
        
        //listo grafias e significados a partir da classe dicionario
    }    
   
}
