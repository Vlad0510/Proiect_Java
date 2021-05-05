package Functii;

import Citire.*;
import Logger.Logg;

public class AdaugareProdus implements Logg {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    CitireScriereArta rwArta = new CitireScriereArta();
    CitireScriereCeas rwCeas = new CitireScriereCeas();
    CitireScriereImobil rwImobil = new CitireScriereImobil();
    CitireScriereMasina rwMasina = new CitireScriereMasina();
    CitireScriereMobila rwMobila = new CitireScriereMobila();

    public void adaugareprodus(String s) {

        if(s.equals("arta")) {
            System.out.println(ANSI_RED + "Adaugati obiectul de arta:" + ANSI_RESET);
            rwArta.WriteArta();
            LOGGER.info("A fost adaugat un obiect de arta");
        }
        else if(s.equals("ceas")) {
            System.out.println(ANSI_GREEN + "Adaugati un ceas:" + ANSI_RESET);
            rwCeas.WriteCeas();
            LOGGER.info("A fost adaugat un ceas");
        }
        else if(s.equals("imobil")) {
            System.out.println(ANSI_BLUE + "Adaugati un imobil:" + ANSI_RESET);
            rwImobil.WriteImobil();
            LOGGER.info("A fost adaugat un imobil");
        }
        else if(s.equals("masina")) {
            System.out.println(ANSI_PURPLE + "Adaugati o masina:" + ANSI_RESET);
            rwMasina.WriteMasina();
            LOGGER.info("A fost adaugata o masina");
        }
        else if(s.equals("mobila")) {
            System.out.println(ANSI_YELLOW + "Adaugati o mobila:" + ANSI_RESET);
            rwMobila.WriteMobila();
            LOGGER.info("A fost adaugata o mobila");
        }
        else
            System.out.println("Nu ati introdus una dintre optiunile de mai sus");

    }

}
