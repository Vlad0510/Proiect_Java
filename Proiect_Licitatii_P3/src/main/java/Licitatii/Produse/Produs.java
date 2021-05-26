package Licitatii.Produse;

public class Produs {
    private int produs_id;
    private String inceperea_licitatiei;
    private String sfarsitul_licitatiei;
    private String pret_estimativ;
    private int anul_fabricarii;

    public Produs(int produs_id, String inceperea_licitatiei, String sfarsitul_licitatiei, String pret_estimativ, int anul_fabricarii) {
        this.produs_id = produs_id;
        this.inceperea_licitatiei = inceperea_licitatiei;
        this.sfarsitul_licitatiei = sfarsitul_licitatiei;
        this.pret_estimativ = pret_estimativ;
        this.anul_fabricarii = anul_fabricarii;
    }

    public int getProdus_id() {
        return produs_id;
    }

    public void setProdus_id(int produs_id) {
        this.produs_id = produs_id;
    }

    public String getInceperea_licitatiei() {
        return inceperea_licitatiei;
    }

    public void setInceperea_licitatiei(String inceperea_licitatiei) {
        this.inceperea_licitatiei = inceperea_licitatiei;
    }

    public String getSfarsitul_licitatiei() {
        return sfarsitul_licitatiei;
    }

    public void setSfarsitul_licitatiei(String sfarsitul_licitatiei) {
        this.sfarsitul_licitatiei = sfarsitul_licitatiei;
    }

    public String getPret_estimativ() {
        return pret_estimativ;
    }

    public void setPret_estimativ(String pret_estimativ) {
        this.pret_estimativ = pret_estimativ;
    }

    public int getAnul_fabricarii() {
        return anul_fabricarii;
    }

    public void setAnul_fabricarii(int anul_fabricarii) {
        this.anul_fabricarii = anul_fabricarii;
    }
}
