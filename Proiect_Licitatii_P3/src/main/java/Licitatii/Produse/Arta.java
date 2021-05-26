package Licitatii.Produse;

public class Arta extends Produs{

    private int arta_id;
    private String tipul_obiectului;
    private String nume;
    private String autor;

    public Arta(int produs_id, String inceperea_licitatiei, String sfarsitul_licitatiei, String pret_estimativ, int anul_fabricarii, int arta_id, String tipul_obiectului, String nume, String autor) {
        super(produs_id, inceperea_licitatiei, sfarsitul_licitatiei, pret_estimativ, anul_fabricarii);
        this.arta_id = arta_id;
        this.tipul_obiectului = tipul_obiectului;
        this.nume = nume;
        this.autor = autor;
    }

    public int getArta_id() {
        return arta_id;
    }

    public void setArta_id(int arta_id) {
        this.arta_id = arta_id;
    }

    public String getTipul_obiectului() {
        return tipul_obiectului;
    }

    public void setTipul_obiectului(String tipul_obiectului) {
        this.tipul_obiectului = tipul_obiectului;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Arta{" +
                "arta_id=" + arta_id +
                ", tipul_obiectului='" + tipul_obiectului + '\'' +
                ", nume='" + nume + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
