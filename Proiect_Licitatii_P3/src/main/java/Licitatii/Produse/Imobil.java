package Licitatii.Produse;

public class Imobil extends Produs{

    private int imobil_id;
    private String tip_imobil;
    private String zona;

    public Imobil(int produs_id, String inceperea_licitatiei, String sfarsitul_licitatiei, String pret_estimativ, int anul_fabricarii, int imobil_id, String tip_imobil, String zona) {
        super(produs_id, inceperea_licitatiei, sfarsitul_licitatiei, pret_estimativ, anul_fabricarii);
        this.imobil_id = imobil_id;
        this.tip_imobil = tip_imobil;
        this.zona = zona;
    }

    public int getImobil_id() {
        return imobil_id;
    }

    public void setImobil_id(int imobil_id) {
        this.imobil_id = imobil_id;
    }

    public String getTip_imobil() {
        return tip_imobil;
    }

    public void setTip_imobil(String tip_imobil) {
        this.tip_imobil = tip_imobil;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Imobil{" +
                "imobil_id=" + imobil_id +
                ", tip_imobil='" + tip_imobil + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }
}
