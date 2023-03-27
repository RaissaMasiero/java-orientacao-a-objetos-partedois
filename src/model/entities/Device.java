package model.entities;

abstract public class Device {

    public String numeroSerie;

    public Device(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public abstract void processaDoc(String doc);
}
