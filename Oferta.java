package Proiect;

import java.util.Objects;

public class Oferta {

    private int nr_oferta;
    private Produs produs;

    public Oferta(int nr_oferta, Produs produs) throws NullPointerException{
        this.nr_oferta = nr_oferta;
        this.produs = Objects.requireNonNull(produs, "fashfoa");
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "nr_oferta=" + nr_oferta +
                ", produs=" + produs +
                '}';
    }
}
