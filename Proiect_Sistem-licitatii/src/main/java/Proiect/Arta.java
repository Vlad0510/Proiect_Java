package Proiect;

public class Arta extends Produs{

    private String tipul_obiectului;
    private String nume;
    private String autor;

    public Arta(String pret_estimativ, String perioada_de_licitare, int an, String tipul_obiectului, String nume, String autor) {
        super(pret_estimativ, perioada_de_licitare, an);
        this.tipul_obiectului = tipul_obiectului;
        this.nume = nume;
        this.autor = autor;
    }

    public String getTipul_obiectului() {
        return tipul_obiectului;
    }

    public String getNume() {
        return nume;
    }

    public String getAutor() {
        return autor;
    }

    public void setTipul_obiectului(String tipul_obiectului) {
        this.tipul_obiectului = tipul_obiectului;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Arta{" +
                "tipul_obiectului='" + tipul_obiectului + '\'' +
                ", nume='" + nume + '\'' +
                ", autor='" + autor + '\'' +
                ", an='" + getAn() + '\'' +
                ", pret estimativ='" + getPret_estimativ() + '\'' +
                ", perioada licitare='" + getPerioada_de_licitare() + '\'' +
                '}';
    }
}
