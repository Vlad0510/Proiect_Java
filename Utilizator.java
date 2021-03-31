package Proiect;

public class Utilizator {

    private String nume;
    private String prenume;
    private String email;
    private String nr_tel;

    public Utilizator(String nume, String prenume, String email, String nr_tel) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.nr_tel = nr_tel;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }
}
