package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Quantity implements ValueObject<Integer> {

    private final Integer quantity;


    public Quantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public Integer value() {
        return quantity;
    }
}
