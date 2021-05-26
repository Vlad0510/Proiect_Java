package Licitatii.Produse;

public class Ceas extends Produs{

    private int ceas_id;
    private String model;
    private String firma;

    public Ceas(int produs_id, String inceperea_licitatiei, String sfarsitul_licitatiei, String pret_estimativ, int anul_fabricarii, int ceas_id, String model, String firma) {
        super(produs_id, inceperea_licitatiei, sfarsitul_licitatiei, pret_estimativ, anul_fabricarii);
        this.ceas_id = ceas_id;
        this.model = model;
        this.firma = firma;
    }

    public int getCeas_id() {
        return ceas_id;
    }

    public void setCeas_id(int ceas_id) {
        this.ceas_id = ceas_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Ceas{" +
                "ceas_id=" + ceas_id +
                ", model='" + model + '\'' +
                ", firma='" + firma + '\'' +
                '}';
    }
}
