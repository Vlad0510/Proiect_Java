package Proiect;

import java.util.ArrayList;
import java.util.List;

public class Serviciu {

    private List<Oferta> oferte = new ArrayList<>();

    public void AdaugaOferta(Oferta oferta){
        oferte.add(oferta);
    }

    public void AfiseazaOferte() {
        for(Oferta obj: oferte)
            System.out.println(obj);
    }

    public void CreareOferta(int nr_oferta, Produs produs){
        Oferta oferta = new Oferta(nr_oferta, produs);
        oferte.add(oferta);
    }

}
