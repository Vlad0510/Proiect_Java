package Proiect;

public class Imobil extends Produs{

    private String tip_imobil;
    private String dimensiune;
    private String zona;

    public Imobil(String pret_estimativ, String perioada_de_licitare, int an, String tip_imobil, String dimensiune, String zona) {
        super(pret_estimativ, perioada_de_licitare, an);
        this.tip_imobil = tip_imobil;
        this.dimensiune = dimensiune;
        this.zona = zona;
    }

    public String getTip_imobil() {
        return tip_imobil;
    }

    public String getDimensiune() {
        return dimensiune;
    }

    public String getZona() {
        return zona;
    }

    public void setTip_imobil(String tip_imobil) {
        this.tip_imobil = tip_imobil;
    }

    public void setDimensiune(String dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Imobil{" +
                "tip_imobil='" + tip_imobil + '\'' +
                ", dimensiune='" + dimensiune + '\'' +
                ", zona='" + zona + '\'' +
                ", an='" + getAn() + '\'' +
                ", pret estimativ='" + getPret_estimativ() + '\'' +
                ", perioada licitare='" + getPerioada_de_licitare() + '\'' +
                '}';
    }
}
