package uff.ic.lleme.tcc00328.s20202.prova.p2.HenriqueDeMoraisPorto.Q1;

import java.util.ArrayList;

public class Palavra {

    public String fonetica;
    public String grafia;
    public ArrayList<Sinonimos> sinonimos = new ArrayList<>();

    public Palavra() {

    }

    public Palavra(String grafia, String fonetica) {
        this.fonetica = fonetica;
        this.grafia = grafia;

    }

}
