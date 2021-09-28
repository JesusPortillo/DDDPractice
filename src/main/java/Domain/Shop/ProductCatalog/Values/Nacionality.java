package Domain.Shop.ProductCatalog.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Nacionality implements ValueObject<String> {

    private final String nacionality;

    public Nacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    @Override
    public String value() {
        return nacionality;
    }
}
