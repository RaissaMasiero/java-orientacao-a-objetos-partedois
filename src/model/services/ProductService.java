package model.services;

import model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double somaFiltrada(List<Product> list, Predicate<Product> criterio){

        double soma = 0.0;

        for(Product p : list){

            if(criterio.test(p)){
                soma += p.getPreco();
            }

        }

        return soma;
    }
}
