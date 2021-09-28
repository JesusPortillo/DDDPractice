package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Weight implements ValueObject<Double> {

    private final Double weight;


    public Weight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Double value() {
        return weight;
    }
}
