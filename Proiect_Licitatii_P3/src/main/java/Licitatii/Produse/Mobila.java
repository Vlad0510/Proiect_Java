package Licitatii.Produse;

public class Mobila extends Produs{

    private int mobila_id;
    private String denumire;
    private String material;

    public Mobila(int produs_id, String inceperea_licitatiei, String sfarsitul_licitatiei, String pret_estimativ, int anul_fabricarii, int mobila_id, String denumire, String material) {
        super(produs_id, inceperea_licitatiei, sfarsitul_licitatiei, pret_estimativ, anul_fabricarii);
        this.mobila_id = mobila_id;
        this.denumire = denumire;
        this.material = material;
    }

    public int getMobila_id() {
        return mobila_id;
    }

    public void setMobila_id(int mobila_id) {
        this.mobila_id = mobila_id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Mobila{" +
                "mobila_id=" + mobila_id +
                ", denumire='" + denumire + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
