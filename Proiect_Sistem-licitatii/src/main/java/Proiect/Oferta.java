package Proiect;

import Logger.Logg;

import java.util.Objects;

public class Oferta implements Logg {

    private int nr_oferta;
    private Produs produs;



    public Oferta(int nr_oferta, Produs produs) throws NullPointerException{
        this.nr_oferta = nr_oferta;
        this.produs = Objects.requireNonNull(produs, "fashfoa");
        LOGGER.info("A fost facuta o oferta");
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "nr_oferta=" + nr_oferta +
                ", produs=" + produs +
                '}';
    }
}
