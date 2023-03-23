package model.entities;

import java.time.LocalDateTime;

public class CarRental {

    // CarRental: aluguel de carros
    private LocalDateTime dataInicio;
    private LocalDateTime dataFinal;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){}

    public CarRental(LocalDateTime dataInicio, LocalDateTime dataFinal, Vehicle vehicle) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.vehicle = vehicle;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}

