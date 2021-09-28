package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Width implements ValueObject<Double> {
    private final Double width;

    public Width(Double width) {
        this.width = width;
    }

    @Override
    public Double value() {
        return width;
    }
}
