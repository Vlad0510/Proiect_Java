package Proiect;

public class Produs {
    private String pret_estimativ;
    private String perioada_de_licitare;
    private int an;

    public Produs(String pret_estimativ, String perioada_de_licitare, int an) {
        this.pret_estimativ = pret_estimativ;
        this.perioada_de_licitare = perioada_de_licitare;
        this.an = an;
    }

    public String getPret_estimativ() {
        return pret_estimativ;
    }

    public String getPerioada_de_licitare() {
        return perioada_de_licitare;
    }

    public int getAn() { return an; }

}
