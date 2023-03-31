package util;

import model.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPreco() >= 100.0;
    }
}
