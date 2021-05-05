package Proiect;

public class Mobila extends Produs{

    private String denumire;
    private String material;


    public Mobila(String pret_estimativ, String perioada_de_licitare, int an, String denumire, String material) {
        super(pret_estimativ, perioada_de_licitare, an);
        this.denumire = denumire;
        this.material = material;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getMaterial() {
        return material;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Mobila{" +
                "denumire='" + denumire + '\'' +
                ", material='" + material + '\'' +
                ", an='" + getAn() + '\'' +
                ", pret estimativ='" + getPret_estimativ() + '\'' +
                ", perioada licitare='" + getPerioada_de_licitare() + '\'' +
                '}';
    }
}
