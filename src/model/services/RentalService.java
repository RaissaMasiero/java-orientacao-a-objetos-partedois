package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double precoPorHora;
    private Double precoPorDia;
    private TaxService taxService;

    public RentalService(Double precoPorHora, Double precoPorDia, TaxService taxService) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.taxService = taxService;
    }

    public void geraFatura(CarRental carRental){

        double minutos = Duration.between(carRental.getDataInicio(), carRental.getDataFinal()).toMinutes();
        double horas = minutos / 60.0;

        double pagamentoBasico;
        if(horas <= 12.0){
           pagamentoBasico = precoPorHora * Math.ceil(horas);
        }else{
           pagamentoBasico = precoPorDia * Math.ceil(horas / 24.0);
        }

        double imposto = taxService.imposto(pagamentoBasico);

        carRental.setInvoice(new Invoice(pagamentoBasico, imposto));
    }
}
