package Proiect;

public class Masina extends Produs{

    protected String model;
    protected String culoare;
    protected double motor;
    protected String interior;

    public Masina(String pret_estimativ, String perioada_de_licitare, int an, String model, String culoare, double motor, String interior) {
        super(pret_estimativ, perioada_de_licitare, an);
        this.model = model;
        this.culoare = culoare;
        this.motor = motor;
        this.interior = interior;
    }

    public String getModel() {
        return model;
    }

    public String getCuloare() {
        return culoare;
    }

    public double getMotor() {
        return motor;
    }

    public String getInterior() {
        return interior;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", culoare='" + culoare + '\'' +
                ", motor=" + motor + '\'' +
                ", interior='" + interior + '\'' +
                ", an='" + getAn() + '\'' +
                ", pret estimativ='" + getPret_estimativ() + '\'' +
                ", perioada licitare='" + getPerioada_de_licitare() + '\'' +
                '}';
    }
}
