package Functii;

import Citire.*;

public class AfisareAnumiteProduse {

    CitireScriereArta rwArta = new CitireScriereArta();
    CitireScriereCeas rwCeas = new CitireScriereCeas();
    CitireScriereImobil rwImobil = new CitireScriereImobil();
    CitireScriereMasina rwMasina = new CitireScriereMasina();
    CitireScriereMobila rwMobila = new CitireScriereMobila();

    public void afisareProdus(String s){
        if(s.equals("arta")) {
            rwArta.ReadArta();
        }
        else if(s.equals("ceas")) {
            rwCeas.ReadCeas();
        }
        else if(s.equals("imobil")) {
            rwImobil.ReadImobil();
        }
        else if(s.equals("masina")) {
            rwMasina.ReadMasina();
        }
        else if(s.equals("mobila")) {
            rwMobila.ReadMobila();
        }
        else if(s.equals("toate")) {
            rwArta.ReadArta();
            rwCeas.ReadCeas();
            rwImobil.ReadImobil();
            rwMasina.ReadMasina();
            rwMobila.ReadMobila();
        }
        else
            System.out.println("Nu ati introdus una dintre optiunile de mai sus");
    }

}
