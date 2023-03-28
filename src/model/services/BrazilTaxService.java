package model.services;

import model.interfaces.TaxService;

public class BrazilTaxService implements TaxService {

    public Double imposto(double valor){
        if(valor <= 100.0){
           return valor * 0.2;
        }else{
           return valor * 0.15;
        }
    }
}
