package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Height implements ValueObject<Double> {

    private final Double height;


    public Height(Double height) {
        this.height = height;
    }

    @Override
    public Double value() {
        return height;
    }
}
