package Proiect;

public class Ceas extends Produs{

    private String model;
    private String firma;

    public Ceas(String pret_estimativ, String perioada_de_licitare, int an, String model, String firma) {
        super(pret_estimativ, perioada_de_licitare, an);
        this.model = model;
        this.firma = firma;
    }

    public String getModel() {
        return model;
    }

    public String getFirma() {
        return firma;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Ceas{" +
                "model='" + model + '\'' +
                ", firma='" + firma + '\'' +
                ", an='" + getAn() + '\'' +
                ", pret estimativ='" + getPret_estimativ() + '\'' +
                ", perioada licitare='" + getPerioada_de_licitare() + '\'' +
                '}';
    }
}
