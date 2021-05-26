package Licitatii.Produse;

public class Masina extends Produs{

    private int masina_id;
    protected String model;
    protected String culoare;
    protected double motor;

    public Masina(int produs_id, String inceperea_licitatiei, String sfarsitul_licitatiei, String pret_estimativ, int anul_fabricarii, int masina_id, String model, String culoare, double motor) {
        super(produs_id, inceperea_licitatiei, sfarsitul_licitatiei, pret_estimativ, anul_fabricarii);
        this.masina_id = masina_id;
        this.model = model;
        this.culoare = culoare;
        this.motor = motor;
    }

    public int getMasina_id() {
        return masina_id;
    }

    public void setMasina_id(int masina_id) {
        this.masina_id = masina_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "masina_id=" + masina_id +
                ", model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                ", motor=" + motor +
                '}';
    }
}
